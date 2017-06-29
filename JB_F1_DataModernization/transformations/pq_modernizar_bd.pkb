CREATE OR REPLACE package body PQ_MODERNIZAR_BD is

  FUNCTION f_busca_ocurrencia(p_cadena VARCHAR2, p_posicion NUMBEr, p_separador VARCHAR2 default '@', p_numero_separador NUMBER default 2) Return VARCHAR2 Is
    vc_separador VARCHAR2(100);
  Begin
    For i In 1..p_numero_separador Loop
        vc_separador := vc_separador || p_separador;
    End Loop;
    If p_posicion = 1 Then
      return(SUBSTR(p_cadena,1,INSTR(p_cadena,vc_separador)-1));
    Else
      return(SUBSTR(p_cadena,
                                     INSTR(p_cadena,vc_separador,1,p_posicion-1)+2,
                                     INSTR(p_cadena,vc_separador,1,p_posicion)-INSTR(p_cadena,vc_separador,1,p_posicion-1)-2));
    End If;
  End; 

  -- Implementacion de Funciones y procedimientos 
  PROCEDURE p_busca_para_tabla(p_fichero IN OUT CLOB, p_tabla VARCHAR2)is

       Cursor c_columnas_pk (p_nombre_pk VARCHAR2) Is 
           SELECT UTC.* 
           FROM user_cons_columns ucc, user_tab_columns utc
           WHERE UCC.constraint_name = p_nombre_pk
             AND UCC.table_name = p_tabla
             AND UCC.OWNER = USER
             AND UCC.TABLE_NAME = UTC.TABLE_NAME
             AND UCC.COLUMN_NAME = UTC.COLUMN_NAME
        ORDER BY position;

       Cursor c_otras_tablas (p_nombre_pk VARCHAR2) Is
           SELECT UT.TABLE_NAME 
             FROM USER_TABLES ut
           WHERE UT.TABLE_NAME != p_tabla
             AND NOT EXISTS (SELECT '*' 
                               FROM USER_CONSTRAINTS 
                              WHERE UT.TABLE_NAME = TABLE_NAME
                                 AND CONSTRAINT_TYPE = 'R' 
                                 AND R_CONSTRAINT_NAME = p_nombre_pk)
           ORDER BY UT.TABLE_NAME;
           
           
       Cursor c_columnas_otras_tablas (p_otra_tabla VARCHAR2, p_tipo VARCHAR2, p_longitud NUMBER, p_precision NUMBER ) Is 
           SELECT  *
             FROM user_tab_columns 
           WHERE table_name = p_otra_tabla
             AND p_tipo = DATA_TYPE
             AND ((p_longitud IS NULL AND DATA_LENGTH IS NULL) OR  (p_longitud = DATA_LENGTH))
             AND ((p_precision IS NULL AND DATA_PRECISION IS NULL) OR  (p_precision = DATA_PRECISION))
           ORDER BY column_id;         
       
       vc_nombre_pk USER_CONSTRAINTS.CONSTRAINT_NAME%TYPE;
       n_num_campos_pk NUMBER(2);
       n_numero_pos NUMBER(4);
       t_clave MI_CLAVE;
       l_busqueda BUSQUEDA;
       n_busqueda NUMBER;
       l_lista_claves BUSQUEDA;
       n_elementos_iguales NUMBER(4);
       n_filas_necesarias NUMBER(4);
       n_aux NUMBER(4);
       Type t_combinaciones IS REF CURSOR;
       c_combinaciones t_combinaciones;
       n_aciertos NUMBER;
       n_total NUMBER;
       vc_consulta VARCHAR2(32000);
       vc_nulos VARCHAR2(32000);
       vc_fila_dinamica VARCHAR2(1000);
  begin
               
       -- Obtenemos la clave primaria de la tabla 
       Begin
         SELECT CONSTRAINT_NAME 
           INTO vc_nombre_pk
           FROM USER_CONSTRAINTS  
          WHERE OWNER = USER 
            AND CONSTRAINT_TYPE = 'P'
            AND TABLE_NAME = p_tabla;
           -- Obtenemos el n�mero de campos de la clave primaria   
           SELECT COUNT(*)
             INTO n_num_campos_pk 
             FROM user_cons_columns ucc
            WHERE UCC.constraint_name = vc_nombre_pk
              AND UCC.table_name = p_tabla
              AND UCC.OWNER = USER;
       Exception
            When NO_DATA_FOUND THEN
                 Null;              
       End;                     

       n_num_campos_pk := 0;
       For r in c_columnas_pk(vc_nombre_pk) Loop
           n_num_campos_pk := n_num_campos_pk + 1;
           t_clave(n_num_campos_pk).NOMBRE := r.column_name;
           t_clave(n_num_campos_pk).TIPO := r.data_type;
           t_clave(n_num_campos_pk).LONGITUD := r.data_length;
           t_clave(n_num_campos_pk).PRECISION := r.data_precision;
       End Loop;


       -- Recorremos todas las tablas del esquema que puedan tener una clave foranea a esta clave primaria pero no la tienen
       
       For r_tablas In c_otras_tablas(vc_nombre_pk) Loop
           l_busqueda.DELETE;
           l_lista_claves.DELETE;

           -- Vamos a construir inicialmente la tabla pl/sql necesaria 
           n_filas_necesarias := 1;
           For i In 1..n_num_campos_pk Loop
               -- Cuento el n�mero de elementos del mismo tipo que estamos buscando que hay en la tabla
               Select Count(*)
                 Into n_elementos_iguales
                 From user_tab_columns
                WHERE TABLE_NAME = r_tablas.TABLE_NAME
                  AND t_clave(i).TIPO = DATA_TYPE
                  AND ((t_clave(i).LONGITUD IS NULL AND DATA_LENGTH IS NULL) OR  (t_clave(i).LONGITUD = DATA_LENGTH))
                  AND ((t_clave(i).PRECISION IS NULL AND DATA_PRECISION IS NULL) OR  (t_clave(i).PRECISION = DATA_PRECISION));

               n_filas_necesarias := n_filas_necesarias * n_elementos_iguales;                     
               -- Rellenamos una estructura con las columnas iguales para cada columna de pk
               n_aux := 0;
               For r_col_tab in c_columnas_otras_tablas(r_tablas.table_name, t_clave(i).TIPO, t_clave(i).LONGITUD, t_clave(i).PRECISION) Loop
                   n_aux:= n_aux + 1;                 
                   l_lista_claves(i)(n_aux) := r_col_tab.COLUMN_NAME;
               End Loop;   

           End Loop;
           If n_filas_necesarias > 0 Then
              vc_consulta := 'SELECT a1 ||'''||'@@''';
              For i in 2..n_num_campos_pk Loop
                  vc_consulta := vc_consulta || '|| a'||i||' ||''@@''';
              End Loop;
              vc_consulta := vc_consulta || ' FROM ';
             -- Contruimos una consulta para obtener todas las posibles combinaciones por producto cartesiano
             -- Vamos a sacar el contenido
             For i in 1..l_lista_claves.count Loop   
                vc_consulta :=  vc_consulta || ' (SELECT ''' || l_lista_claves(i)(1) || ''' a'||i ||' FROM DUAL ';
                For j In 2..l_lista_claves(i).count Loop
                    vc_consulta :=  vc_consulta || '  UNION SELECT ''' || l_lista_claves(i)(j) || ''' a'||i ||' FROM DUAL ';
                End Loop;
                vc_consulta :=  vc_consulta || ')';
                If i < n_num_campos_pk then 
                   vc_consulta :=  vc_consulta || ',';
                End If;
             End Loop;
             -- Vamos a meter el producto cartesiano en una estructura
             Open c_combinaciones FOR vc_consulta; 
             Loop 
                  Fetch c_combinaciones Into vc_fila_dinamica;
                  Exit when c_combinaciones%NOTFOUND;
                  vc_consulta := 'SELECT count(*) FROM ' ||p_tabla ||' a,'|| r_tablas.TABLE_NAME || ' b Where 1=1 ';
                  vc_nulos := '( ';
                  For i in 1..n_num_campos_pk Loop
                      vc_consulta := vc_consulta || ' AND a.' || t_clave(i).NOMBRE || ' = b.' ||f_busca_ocurrencia(vc_fila_dinamica,i) ;
                      vc_nulos := vc_nulos ||'b.'|| f_busca_ocurrencia(vc_fila_dinamica,i)  || ' is null AND ';
                  End Loop;
                  vc_nulos := vc_nulos || ' 1=1 )';
                  vc_consulta := vc_consulta || ' or ' || vc_nulos;
                  BEGIN
                        EXECUTE IMMEDIATE vc_consulta INTO n_aciertos;
                  EXCEPTION         
                    WHEN INVALID_NUMBER Then
                      -- Error de tipo distinto 'ora-1722'
                      Null;
                  END;
                  vc_nulos := vc_consulta;
                  vc_consulta := 'SELECT count(*) FROM ' || r_tablas.TABLE_NAME ;
                  EXECUTE IMMEDIATE vc_consulta INTO n_total;
                  If n_total > 0 And round(n_aciertos * 100/n_total,2) >= n_c_porcentaje  Then
                  
                     p_fichero := p_fichero || '<errores xsi:type="ForeignError" nameFk="' || r_tablas.TABLE_NAME || '_' || p_tabla ||'_fk" porcent="' || round(n_aciertos * 100/n_total,2) || '">';
                     p_fichero := p_fichero ||  '<tableCont nameTable="' || r_tablas.TABLE_NAME || '">';
                     For i in 1..n_num_campos_pk Loop
                        p_fichero := p_fichero ||  '<columnCont nameColumn="' || f_busca_ocurrencia(vc_fila_dinamica, i) || '"/>';
                     End Loop; 
                     p_fichero := p_fichero ||  '</tableCont>';
                     p_fichero := p_fichero ||  '<tableRef nameTable="' || p_tabla || '">';
                     For i in 1..n_num_campos_pk Loop
                        p_fichero := p_fichero ||  '<columnCont nameColumn="' || t_clave(i).NOMBRE || '"/>';
                     End Loop;                      
                     p_fichero := p_fichero ||  '</tableRef>';
                     p_fichero := p_fichero ||  '</errores>';                                    
                  End If;
             End Loop;
             Close c_combinaciones;
           End If; 
       End Loop;
  End;


  Procedure p_busca_fk_desactivadas(p_fichero IN OUT CLOB) Is

  Cursor c_desactivadas Is
    SELECT U.CONSTRAINT_NAME CONSTRAINT_NAME_FK, U.TABLE_NAME TABLE_FK, U.R_CONSTRAINT_NAME CONSTRAINT_NAME_PK, U2.TABLE_NAME TABLE_PK  
      FROM USER_CONSTRAINTS U,  USER_CONSTRAINTS U2
     WHERE U.CONSTRAINT_TYPE = 'R' AND U.STATUS = 'DISABLED'
       AND U.R_CONSTRAINT_NAME = U2.CONSTRAINT_NAME
       AND U2.CONSTRAINT_TYPE = 'P';

  Cursor c_columnas_pk(p_tabla In VARCHAR2, p_constraint In VARCHAR2) Is
    SELECT UTC.COLUMN_NAME, UCC.POSITION 
      FROM user_cons_columns ucc, user_tab_columns utc
     WHERE UCC.constraint_name = p_constraint
       AND UCC.table_name = p_tabla
       AND UCC.OWNER = USER
       AND UCC.TABLE_NAME = UTC.TABLE_NAME
       AND UCC.COLUMN_NAME = UTC.COLUMN_NAME
    ORDER BY position;
        

    vc_columna_pk VARCHAR2(100);
    n_posicion NUMBER(3);
    vc_columna_fk VARCHAR2(100);
    vc_consulta VARCHAR2(32000);
    vc_nulos VARCHAR2(32000);
    n_aciertos NUMBER;
    n_total NUMBER;    
    l_campos_fk LISTA_CAMPOS; 
    l_campos_pk LISTA_CAMPOS;
    n_campos NUMBER(2);
  Begin
     For r in c_desactivadas Loop
         vc_consulta := 'SELECT count(*) FROM ' ||r.TABLE_PK ||' a,'|| r.TABLE_FK || ' b Where 1=1 ';
         vc_nulos := '( ';
         n_campos := 1;
         l_campos_fk.DELETE;
         l_campos_pk.DELETE;
         Open c_columnas_pk(r.TABLE_PK,r.constraint_name_pk);
         Fetch c_columnas_pk Into vc_columna_pk, n_posicion;
         Exit when c_columnas_pk%NOTFOUND;
         While c_columnas_pk%FOUND Loop
            SELECT utc.COLUMN_NAME
              INTO vc_columna_fk 
              FROM user_cons_columns ucc, user_tab_columns utc
             WHERE UCC.constraint_name = r.CONSTRAINT_NAME_FK
               AND UCC.table_name = r.TABLE_FK
               AND UCC.OWNER = USER
               AND UCC.TABLE_NAME = UTC.TABLE_NAME
               AND UCC.COLUMN_NAME = UTC.COLUMN_NAME
               AND POSITION = n_posicion;        
               vc_consulta := vc_consulta || ' AND a.' || vc_columna_pk || ' = b.' ||vc_columna_fk ;
               vc_nulos := vc_nulos ||'b.'|| vc_columna_fk  || ' is null AND ';
               l_campos_fk(n_campos) := vc_columna_fk;
               l_campos_pk(n_campos) := vc_columna_pk;
               n_campos := n_campos + 1;
            Fetch c_columnas_pk Into vc_columna_pk, n_posicion;
         End Loop;         
         vc_nulos := vc_nulos || ' 1=1 )';
         vc_consulta := vc_consulta || ' or ' || vc_nulos;
         Close c_columnas_pk;
                  EXECUTE IMMEDIATE vc_consulta INTO n_aciertos;
                  vc_nulos := vc_consulta;
                  vc_consulta := 'SELECT count(*) FROM ' || r.TABLE_FK ;
                  EXECUTE IMMEDIATE vc_consulta INTO n_total;
                  If n_total > 0 And round(n_aciertos * 100/n_total,2) >= n_c_porcentaje  Then
                     p_fichero := p_fichero || '<errores xsi:type="ForeignError" nameFk="' || r.TABLE_FK || '_' || r.TABLE_PK ||'_fk" porcent="' || round(n_aciertos * 100/n_total,2) || '">';
                     p_fichero := p_fichero ||  '<tableCont nameTable="' || r.TABLE_FK || '">';
                     For i in 1..l_campos_fk.COUNT Loop
                        p_fichero := p_fichero ||  '<columnCont nameColumn="' || l_campos_fk(i) || '"/>';
                     End Loop; 
                     p_fichero := p_fichero ||  '</tableCont>';
                     p_fichero := p_fichero ||  '<tableRef nameTable="' || r.TABLE_PK || '">';
                     For i in 1..l_campos_pk.COUNT Loop
                        p_fichero := p_fichero ||  '<columnCont nameColumn="' || l_campos_pk(i) || '"/>';
                     End Loop;                      
                     p_fichero := p_fichero ||  '</tableRef>';
                     p_fichero := p_fichero ||  '</errores>';     
                  End If;
     End Loop;

  End;


  Procedure p_busca_ck_desactivadas(p_fichero IN OUT CLOB) Is

  Cursor c_desactivadas Is
    SELECT U.CONSTRAINT_NAME, U.TABLE_NAME, U.SEARCH_CONDITION
      FROM USER_CONSTRAINTS U
     WHERE U.CONSTRAINT_TYPE = 'C' 
       AND U.STATUS != 'DISABLED';


    vc_consulta VARCHAR2(32000);
    n_aciertos NUMBER;
    n_total NUMBER;   
    l_posibilidades LISTA_CAMPOS; 
    i1 NUMBER(2);
    i2 NUMBER(2);
    n_conta NUMBER(2);
  Begin
     For r in c_desactivadas Loop
         IF UPPER(r.SEARCH_CONDITION) Not like '%IS NOT NULL%' Then
           vc_consulta := 'SELECT count(*) FROM ' ||r.TABLE_NAME ||' a Where ' || r.SEARCH_CONDITION || ' or ( ' || 
           f_busca_ocurrencia(r.Search_Condition,1,' ',1) || ' IS NULL)';
           EXECUTE IMMEDIATE vc_consulta INTO n_aciertos;
           vc_consulta := 'SELECT count(*) FROM ' || r.TABLE_NAME ;
           EXECUTE IMMEDIATE vc_consulta INTO n_total;
           If n_total > 0 And round(n_aciertos * 100/n_total,2) >= n_c_porcentaje  Then
               i1 := 1;
               i2 := 0;
               n_conta := 1;
               While i1 > 0 Loop
                     i1 := INSTR(r.SEARCH_CONDITION,'''',i2+1,1);
                     If i1 > 0 Then
                        i2 := INSTR(r.SEARCH_CONDITION,'''',i1+1,1);
                        l_posibilidades(n_conta) := SUBSTR(r.SEARCH_CONDITION,i1+1, i2-i1-1);
                     End If;  
               End Loop;
               p_fichero := p_fichero || '<errores xsi:type="CheckError" nameTable="' || r.TABLE_NAME || '" nameCk="' || r.CONSTRAINT_NAME || '" porcent="' || round(n_aciertos * 100/n_total,2) || '">';
               p_fichero := p_fichero || '<columns columnName="' || f_busca_ocurrencia(r.Search_Condition,1,' ',1) || '">';
               For i in 1..l_posibilidades.COUNT Loop
                  p_fichero := p_fichero || '<values value="' || l_posibilidades(i) || '"/>';
               End Loop; 
               p_fichero := p_fichero ||  '</columns>';
               p_fichero := p_fichero ||  '</errores>';                        
           End If;
         End If; 
     End Loop;
  End;



  Procedure p_tesis(p_fichero IN OUT CLOB) Is
     Cursor mis_tablas Is 
           SELECT UT.TABLE_NAME 
             FROM USER_TABLES ut
            WHERE EXISTS (SELECT '*' 
                            FROM USER_CONSTRAINTS 
                           WHERE UT.TABLE_NAME = TABLE_NAME
                             AND CONSTRAINT_TYPE = 'P' )
           ORDER BY UT.TABLE_NAME;

  BEGIN
       p_fichero := '<?xml version="1.0" encoding="iso-8859-1"?>';
       p_fichero := p_fichero || '<ERR:Errores xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ERR="http://modelum.es/gra2mol/examples/Error">';
       For r in mis_tablas Loop
           p_busca_para_tabla(p_fichero, r.table_name);
       End Loop;
       p_busca_fk_desactivadas(p_fichero);
       p_busca_ck_desactivadas(p_fichero);
       p_fichero := p_fichero || '</ERR:Errores>';           
  END;     


End PQ_MODERNIZAR_BD;
