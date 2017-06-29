CREATE OR REPLACE package PQ_MODERNIZAR_BD is

  /* Creamos estructura para guardar la posible columna */  
  Type COLUMNA is RECORD (
       NOMBRE VARCHAR2(30 ),
       TIPO	VARCHAR2 (106),	
       LONGITUD	NUMBER(4),	
       PRECISION	NUMBER(4)	
       --NULO	VARCHAR2 (1),	
       --''ID	NUMBER(3)
  );
  Type MI_CLAVE is Table of COLUMNA INDEX BY BINARY_INTEGER ;

  Type LISTA_CAMPOS Is Table of VARCHAR2(60) INDEX BY BINARY_INTEGER ;
  TYPE BUSQUEDA Is Table of LISTA_CAMPOS INDEX BY BINARY_INTEGER ;

  n_recorrido Integer;
  
  -- Variables publicas constantes
  n_c_porcentaje constant NUMBER(3,0) := 70;

  -- Variables publicas

  -- Funciones y procedimientos publicos
  PROCEDURE p_busca_para_tabla(p_fichero IN OUT CLOB, p_tabla VARCHAR2);

  PROCEDURE p_busca_fk_desactivadas(p_fichero IN OUT CLOB);
  
  PROCEDURE p_busca_ck_desactivadas(p_fichero IN OUT CLOB);
  
  PROCEDURE p_tesis(p_fichero IN OUT CLOB);       

End PQ_MODERNIZAR_BD;
