// $ANTLR 3.0.1 /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3 2012-02-03 12:35:55

	import gts.modernization.model.CST.impl.*;
	import gts.modernization.model.CST.*;
	import java.util.Iterator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class DDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LOG_CONJ", "ID", "CVALUE", "NUMBER", "COMPARATOR", "EXACTO", "APROXIMADO", "CHARACTERS", "BITS", "TIMES", "INTERVALS", "BINARIES", "SQUOTE", "WS", "ML_COMMENT", "OL_COMMENT", "'CREATE'", "'REPLACE'", "'TABLE'", "'('", "','", "')'", "'LOGGING'", "'NOCOMPRESS'", "'NOCACHE'", "'NOPARALLEL'", "'MONITORING'", "';'", "'COMMENT ON TABLE'", "'IS'", "'BYTE'", "'CONSTRAINT'", "'NULL'", "'NOT NULL'", "'DEFAULT'", "'COMMENT ON COLUMN'", "'\\.'", "'ALTER TABLE'", "'DROP CONSTRAINT'", "'ADD'", "'CHECK'", "'FOREIGN KEY'", "'REFERENCES'", "'ON'", "'DELETE'", "'UPDATE'", "'CASCADE'", "'DISABLE'", "'PRIMARY KEY'", "'DATABASE'", "'SCHEMA'", "'IF NOT EXISTS'", "'CHARACTER'", "'SET'", "'COLLATE'", "'IN'"
    };
    public static final int BITS=12;
    public static final int APROXIMADO=10;
    public static final int NUMBER=7;
    public static final int OL_COMMENT=19;
    public static final int LOG_CONJ=4;
    public static final int SQUOTE=16;
    public static final int ID=5;
    public static final int EOF=-1;
    public static final int CVALUE=6;
    public static final int CHARACTERS=11;
    public static final int ML_COMMENT=18;
    public static final int INTERVALS=14;
    public static final int COMPARATOR=8;
    public static final int WS=17;
    public static final int BINARIES=15;
    public static final int TIMES=13;
    public static final int EXACTO=9;

        public DDLParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[88+1];
         }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("DDLParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3"; }


    public static class data_definition_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start data_definition
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:18:1: data_definition returns [Node returnNode] : (data_definition_statementGen+= data_definition_statement )* ;
    public final data_definition_return data_definition() throws RecognitionException {
        data_definition_return retval = new data_definition_return();
        retval.start = input.LT(1);

        List list_data_definition_statementGen=null;
        RuleReturnScope data_definition_statementGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:19:1: ( (data_definition_statementGen+= data_definition_statement )* )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:19:4: (data_definition_statementGen+= data_definition_statement )*
            {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:19:4: (data_definition_statementGen+= data_definition_statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||LA1_0==32||LA1_0==39||LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:19:5: data_definition_statementGen+= data_definition_statement
            	    {
            	    pushFollow(FOLLOW_data_definition_statement_in_data_definition48);
            	    data_definition_statementGen=data_definition_statement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_data_definition_statementGen==null) list_data_definition_statementGen=new ArrayList();
            	    list_data_definition_statementGen.add(data_definition_statementGen);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node data_definitionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		data_definitionReturnNode.setKind("data_definition");
              	    // Create a CST Node
              		if(list_data_definition_statementGen != null) {
              	        for(Iterator it = list_data_definition_statementGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.data_definition_statement_return r = (DDLParser.data_definition_statement_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("data_definition_statement");
              	            	data_definitionReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = data_definitionReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end data_definition

    public static class data_definition_statement_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start data_definition_statement
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:39:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint | added_constraint_ckGen+= added_constraint_ck | added_constraint_fkGen+= added_constraint_fk );
    public final data_definition_statement_return data_definition_statement() throws RecognitionException {
        data_definition_statement_return retval = new data_definition_statement_return();
        retval.start = input.LT(1);

        List list_databaseGen=null;
        List list_tableGen=null;
        List list_comment_tableGen=null;
        List list_comment_columnGen=null;
        List list_disabled_constraintGen=null;
        List list_added_constraint_ckGen=null;
        List list_added_constraint_fkGen=null;
        RuleReturnScope databaseGen = null;
        RuleReturnScope tableGen = null;
        RuleReturnScope comment_tableGen = null;
        RuleReturnScope comment_columnGen = null;
        RuleReturnScope disabled_constraintGen = null;
        RuleReturnScope added_constraint_ckGen = null;
        RuleReturnScope added_constraint_fkGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:40:1: (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint | added_constraint_ckGen+= added_constraint_ck | added_constraint_fkGen+= added_constraint_fk )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=53 && LA2_1<=54)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==LOG_CONJ||LA2_1==22) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("39:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint | added_constraint_ckGen+= added_constraint_ck | added_constraint_fkGen+= added_constraint_fk );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 39:
                {
                alt2=4;
                }
                break;
            case 41:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==ID) ) {
                    int LA2_7 = input.LA(3);

                    if ( (LA2_7==42) ) {
                        alt2=5;
                    }
                    else if ( (LA2_7==43) ) {
                        int LA2_9 = input.LA(4);

                        if ( (LA2_9==35) ) {
                            int LA2_10 = input.LA(5);

                            if ( (LA2_10==ID) ) {
                                int LA2_11 = input.LA(6);

                                if ( (LA2_11==45) ) {
                                    alt2=7;
                                }
                                else if ( (LA2_11==44) ) {
                                    alt2=6;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("39:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint | added_constraint_ckGen+= added_constraint_ck | added_constraint_fkGen+= added_constraint_fk );", 2, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("39:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint | added_constraint_ckGen+= added_constraint_ck | added_constraint_fkGen+= added_constraint_fk );", 2, 10, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("39:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint | added_constraint_ckGen+= added_constraint_ck | added_constraint_fkGen+= added_constraint_fk );", 2, 9, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("39:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint | added_constraint_ckGen+= added_constraint_ck | added_constraint_fkGen+= added_constraint_fk );", 2, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("39:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint | added_constraint_ckGen+= added_constraint_ck | added_constraint_fkGen+= added_constraint_fk );", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("39:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint | added_constraint_ckGen+= added_constraint_ck | added_constraint_fkGen+= added_constraint_fk );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:40:4: databaseGen+= database
                    {
                    pushFollow(FOLLOW_database_in_data_definition_statement73);
                    databaseGen=database();
                    _fsp--;
                    if (failed) return retval;
                    if (list_databaseGen==null) list_databaseGen=new ArrayList();
                    list_databaseGen.add(databaseGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_databaseGen != null) {
                      	        for(Iterator it = list_databaseGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.database_return r = (DDLParser.database_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("database");
                      	            	data_definition_statementReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_definition_statementReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:58:4: tableGen+= table
                    {
                    pushFollow(FOLLOW_table_in_data_definition_statement84);
                    tableGen=table();
                    _fsp--;
                    if (failed) return retval;
                    if (list_tableGen==null) list_tableGen=new ArrayList();
                    list_tableGen.add(tableGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_tableGen != null) {
                      	        for(Iterator it = list_tableGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.table_return r = (DDLParser.table_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("table");
                      	            	data_definition_statementReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_definition_statementReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:76:4: comment_tableGen+= comment_table
                    {
                    pushFollow(FOLLOW_comment_table_in_data_definition_statement95);
                    comment_tableGen=comment_table();
                    _fsp--;
                    if (failed) return retval;
                    if (list_comment_tableGen==null) list_comment_tableGen=new ArrayList();
                    list_comment_tableGen.add(comment_tableGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_comment_tableGen != null) {
                      	        for(Iterator it = list_comment_tableGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.comment_table_return r = (DDLParser.comment_table_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("comment_table");
                      	            	data_definition_statementReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_definition_statementReturnNode;
                      	
                    }

                    }
                    break;
                case 4 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:94:4: comment_columnGen+= comment_column
                    {
                    pushFollow(FOLLOW_comment_column_in_data_definition_statement106);
                    comment_columnGen=comment_column();
                    _fsp--;
                    if (failed) return retval;
                    if (list_comment_columnGen==null) list_comment_columnGen=new ArrayList();
                    list_comment_columnGen.add(comment_columnGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_comment_columnGen != null) {
                      	        for(Iterator it = list_comment_columnGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.comment_column_return r = (DDLParser.comment_column_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("comment_column");
                      	            	data_definition_statementReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_definition_statementReturnNode;
                      	
                    }

                    }
                    break;
                case 5 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:112:4: disabled_constraintGen+= disabled_constraint
                    {
                    pushFollow(FOLLOW_disabled_constraint_in_data_definition_statement117);
                    disabled_constraintGen=disabled_constraint();
                    _fsp--;
                    if (failed) return retval;
                    if (list_disabled_constraintGen==null) list_disabled_constraintGen=new ArrayList();
                    list_disabled_constraintGen.add(disabled_constraintGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_disabled_constraintGen != null) {
                      	        for(Iterator it = list_disabled_constraintGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.disabled_constraint_return r = (DDLParser.disabled_constraint_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("disabled_constraint");
                      	            	data_definition_statementReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_definition_statementReturnNode;
                      	
                    }

                    }
                    break;
                case 6 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:130:4: added_constraint_ckGen+= added_constraint_ck
                    {
                    pushFollow(FOLLOW_added_constraint_ck_in_data_definition_statement128);
                    added_constraint_ckGen=added_constraint_ck();
                    _fsp--;
                    if (failed) return retval;
                    if (list_added_constraint_ckGen==null) list_added_constraint_ckGen=new ArrayList();
                    list_added_constraint_ckGen.add(added_constraint_ckGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_added_constraint_ckGen != null) {
                      	        for(Iterator it = list_added_constraint_ckGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.added_constraint_ck_return r = (DDLParser.added_constraint_ck_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("added_constraint_ck");
                      	            	data_definition_statementReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_definition_statementReturnNode;
                      	
                    }

                    }
                    break;
                case 7 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:148:4: added_constraint_fkGen+= added_constraint_fk
                    {
                    pushFollow(FOLLOW_added_constraint_fk_in_data_definition_statement139);
                    added_constraint_fkGen=added_constraint_fk();
                    _fsp--;
                    if (failed) return retval;
                    if (list_added_constraint_fkGen==null) list_added_constraint_fkGen=new ArrayList();
                    list_added_constraint_fkGen.add(added_constraint_fkGen);

                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_added_constraint_fkGen != null) {
                      	        for(Iterator it = list_added_constraint_fkGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.added_constraint_fk_return r = (DDLParser.added_constraint_fk_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("added_constraint_fk");
                      	            	data_definition_statementReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_definition_statementReturnNode;
                      	
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end data_definition_statement

    public static class table_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start table
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:168:1: table returns [Node returnNode] : TK_0= 'CREATE' (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (columnGen+= column )* (TK_4= ',' )? (ckGen+= ck (TK_5= ',' )? )* (pkGen+= pk )? (TK_6= ',' )? (fkGen+= fk (TK_7= ',' )? )* TK_8= ')' (TK_9= 'LOGGING' )? (TK_10= 'NOCOMPRESS' )? (TK_11= 'NOCACHE' )? (TK_12= 'NOPARALLEL' )? (TK_13= 'MONITORING' )? TK_14= ';' ;
    public final table_return table() throws RecognitionException {
        table_return retval = new table_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token LOG_CONJGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token IDGen=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        Token TK_6=null;
        Token TK_7=null;
        Token TK_8=null;
        Token TK_9=null;
        Token TK_10=null;
        Token TK_11=null;
        Token TK_12=null;
        Token TK_13=null;
        Token TK_14=null;
        List list_columnGen=null;
        List list_ckGen=null;
        List list_pkGen=null;
        List list_fkGen=null;
        RuleReturnScope columnGen = null;
        RuleReturnScope ckGen = null;
        RuleReturnScope pkGen = null;
        RuleReturnScope fkGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:1: (TK_0= 'CREATE' (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (columnGen+= column )* (TK_4= ',' )? (ckGen+= ck (TK_5= ',' )? )* (pkGen+= pk )? (TK_6= ',' )? (fkGen+= fk (TK_7= ',' )? )* TK_8= ')' (TK_9= 'LOGGING' )? (TK_10= 'NOCOMPRESS' )? (TK_11= 'NOCACHE' )? (TK_12= 'NOPARALLEL' )? (TK_13= 'MONITORING' )? TK_14= ';' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:3: TK_0= 'CREATE' (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (columnGen+= column )* (TK_4= ',' )? (ckGen+= ck (TK_5= ',' )? )* (pkGen+= pk )? (TK_6= ',' )? (fkGen+= fk (TK_7= ',' )? )* TK_8= ')' (TK_9= 'LOGGING' )? (TK_10= 'NOCOMPRESS' )? (TK_11= 'NOCACHE' )? (TK_12= 'NOPARALLEL' )? (TK_13= 'MONITORING' )? TK_14= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_table161); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:17: (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==LOG_CONJ) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:18: LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE'
                    {
                    LOG_CONJGen=(Token)input.LT(1);
                    match(input,LOG_CONJ,FOLLOW_LOG_CONJ_in_table166); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_table170); if (failed) return retval;

                    }
                    break;

            }

            TK_2=(Token)input.LT(1);
            match(input,22,FOLLOW_22_in_table176); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_table180); if (failed) return retval;
            TK_3=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_table184); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:87: (columnGen+= column )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:88: columnGen+= column
            	    {
            	    pushFollow(FOLLOW_column_in_table189);
            	    columnGen=column();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_columnGen==null) list_columnGen=new ArrayList();
            	    list_columnGen.add(columnGen);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:108: (TK_4= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred10()) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:109: TK_4= ','
                    {
                    TK_4=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_table196); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:120: (ckGen+= ck (TK_5= ',' )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==ID) ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==44) ) {
                            alt7=1;
                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:121: ckGen+= ck (TK_5= ',' )?
            	    {
            	    pushFollow(FOLLOW_ck_in_table203);
            	    ckGen=ck();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_ckGen==null) list_ckGen=new ArrayList();
            	    list_ckGen.add(ckGen);

            	    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:131: (TK_5= ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==24) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (synpred11()) ) {
            	            alt6=1;
            	        }
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:132: TK_5= ','
            	            {
            	            TK_5=(Token)input.LT(1);
            	            match(input,24,FOLLOW_24_in_table208); if (failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:145: (pkGen+= pk )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==52) ) {
                        alt8=1;
                    }
                }
            }
            switch (alt8) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:146: pkGen+= pk
                    {
                    pushFollow(FOLLOW_pk_in_table217);
                    pkGen=pk();
                    _fsp--;
                    if (failed) return retval;
                    if (list_pkGen==null) list_pkGen=new ArrayList();
                    list_pkGen.add(pkGen);


                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:158: (TK_6= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:159: TK_6= ','
                    {
                    TK_6=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_table224); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:170: (fkGen+= fk (TK_7= ',' )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:171: fkGen+= fk (TK_7= ',' )?
            	    {
            	    pushFollow(FOLLOW_fk_in_table231);
            	    fkGen=fk();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_fkGen==null) list_fkGen=new ArrayList();
            	    list_fkGen.add(fkGen);

            	    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:181: (TK_7= ',' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==24) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:182: TK_7= ','
            	            {
            	            TK_7=(Token)input.LT(1);
            	            match(input,24,FOLLOW_24_in_table236); if (failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            TK_8=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_table244); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:204: (TK_9= 'LOGGING' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:205: TK_9= 'LOGGING'
                    {
                    TK_9=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_table249); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:222: (TK_10= 'NOCOMPRESS' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:223: TK_10= 'NOCOMPRESS'
                    {
                    TK_10=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_table256); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:244: (TK_11= 'NOCACHE' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:245: TK_11= 'NOCACHE'
                    {
                    TK_11=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_table263); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:263: (TK_12= 'NOPARALLEL' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:264: TK_12= 'NOPARALLEL'
                    {
                    TK_12=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_table270); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:285: (TK_13= 'MONITORING' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:286: TK_13= 'MONITORING'
                    {
                    TK_13=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_table277); if (failed) return retval;

                    }
                    break;

            }

            TK_14=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_table282); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node tableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		tableReturnNode.setKind("table");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		tableReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(LOG_CONJGen != null) {
              			Leaf LOG_CONJGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			LOG_CONJGenLeaf.setKind("LOG_CONJ");
              			LOG_CONJGenLeaf.setValue(LOG_CONJGen.getText());
              			LOG_CONJGenLeaf.setPos(LOG_CONJGen.getCharPositionInLine());
              			LOG_CONJGenLeaf.setLine(LOG_CONJGen.getLine());
              			tableReturnNode.getChildren().add(LOG_CONJGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		tableReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		tableReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			tableReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		tableReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_columnGen != null) {
              	        for(Iterator it = list_columnGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.column_return r = (DDLParser.column_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("column");
              	            	tableReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_4Leaf.setKind("TOKEN");
              	 		TK_4Leaf.setValue(TK_4.getText());
              			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
              			TK_4Leaf.setLine(TK_4.getLine());
              	 		tableReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	
              		// Create a special CST Node for terminal ckGen aggregation
              		if(list_ckGen != null) {
              	    for(int pos = 0; pos < list_ckGen.size(); pos++ )  { 
              		// No Terminal extractor
              	    if(list_ckGen != null) {		
              	    	DDLParser.ck_return r = (DDLParser.ck_return) list_ckGen.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("ck");
              	    		tableReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_5Leaf.setKind("TOKEN");
              	 		TK_5Leaf.setValue(TK_5.getText());
              			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
              			TK_5Leaf.setLine(TK_5.getLine());
              	 		tableReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              		}
              		}
              	
              	    // Create a CST Node
              		if(list_pkGen != null) {
              	        for(Iterator it = list_pkGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.pk_return r = (DDLParser.pk_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("pk");
              	            	tableReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_6Leaf.setKind("TOKEN");
              	 		TK_6Leaf.setValue(TK_6.getText());
              			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
              			TK_6Leaf.setLine(TK_6.getLine());
              	 		tableReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              	
              		// Create a special CST Node for terminal fkGen aggregation
              		if(list_fkGen != null) {
              	    for(int pos = 0; pos < list_fkGen.size(); pos++ )  { 
              		// No Terminal extractor
              	    if(list_fkGen != null) {		
              	    	DDLParser.fk_return r = (DDLParser.fk_return) list_fkGen.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("fk");
              	    		tableReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_7Leaf.setKind("TOKEN");
              	 		TK_7Leaf.setValue(TK_7.getText());
              			TK_7Leaf.setPos(TK_7.getCharPositionInLine());
              			TK_7Leaf.setLine(TK_7.getLine());
              	 		tableReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              		}
              		}
              	
              	    // Create a Token CST Leaf	
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_8Leaf.setKind("TOKEN");
              	 		TK_8Leaf.setValue(TK_8.getText());
              			TK_8Leaf.setPos(TK_8.getCharPositionInLine());
              			TK_8Leaf.setLine(TK_8.getLine());
              	 		tableReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_9 != null) {
              			Leaf TK_9Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_9Leaf.setKind("TOKEN");
              	 		TK_9Leaf.setValue(TK_9.getText());
              			TK_9Leaf.setPos(TK_9.getCharPositionInLine());
              			TK_9Leaf.setLine(TK_9.getLine());
              	 		tableReturnNode.getChildren().add(TK_9Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_10 != null) {
              			Leaf TK_10Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_10Leaf.setKind("TOKEN");
              	 		TK_10Leaf.setValue(TK_10.getText());
              			TK_10Leaf.setPos(TK_10.getCharPositionInLine());
              			TK_10Leaf.setLine(TK_10.getLine());
              	 		tableReturnNode.getChildren().add(TK_10Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_11 != null) {
              			Leaf TK_11Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_11Leaf.setKind("TOKEN");
              	 		TK_11Leaf.setValue(TK_11.getText());
              			TK_11Leaf.setPos(TK_11.getCharPositionInLine());
              			TK_11Leaf.setLine(TK_11.getLine());
              	 		tableReturnNode.getChildren().add(TK_11Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_12 != null) {
              			Leaf TK_12Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_12Leaf.setKind("TOKEN");
              	 		TK_12Leaf.setValue(TK_12.getText());
              			TK_12Leaf.setPos(TK_12.getCharPositionInLine());
              			TK_12Leaf.setLine(TK_12.getLine());
              	 		tableReturnNode.getChildren().add(TK_12Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_13 != null) {
              			Leaf TK_13Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_13Leaf.setKind("TOKEN");
              	 		TK_13Leaf.setValue(TK_13.getText());
              			TK_13Leaf.setPos(TK_13.getCharPositionInLine());
              			TK_13Leaf.setLine(TK_13.getLine());
              	 		tableReturnNode.getChildren().add(TK_13Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_14 != null) {
              			Leaf TK_14Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_14Leaf.setKind("TOKEN");
              	 		TK_14Leaf.setValue(TK_14.getText());
              			TK_14Leaf.setPos(TK_14.getCharPositionInLine());
              			TK_14Leaf.setLine(TK_14.getLine());
              	 		tableReturnNode.getChildren().add(TK_14Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = tableReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end table

    public static class comment_table_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start comment_table
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:382:1: comment_table returns [Node returnNode] : TK_0= 'COMMENT ON TABLE' IDGen= ID TK_1= 'IS' CVALUEGen= CVALUE TK_2= ';' ;
    public final comment_table_return comment_table() throws RecognitionException {
        comment_table_return retval = new comment_table_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token CVALUEGen=null;
        Token TK_2=null;

        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:383:1: (TK_0= 'COMMENT ON TABLE' IDGen= ID TK_1= 'IS' CVALUEGen= CVALUE TK_2= ';' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:383:3: TK_0= 'COMMENT ON TABLE' IDGen= ID TK_1= 'IS' CVALUEGen= CVALUE TK_2= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,32,FOLLOW_32_in_comment_table304); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_comment_table308); if (failed) return retval;
            TK_1=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_comment_table312); if (failed) return retval;
            CVALUEGen=(Token)input.LT(1);
            match(input,CVALUE,FOLLOW_CVALUE_in_comment_table316); if (failed) return retval;
            TK_2=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_comment_table320); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node comment_tableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		comment_tableReturnNode.setKind("comment_table");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		comment_tableReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			comment_tableReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		comment_tableReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(CVALUEGen != null) {
              			Leaf CVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			CVALUEGenLeaf.setKind("CVALUE");
              			CVALUEGenLeaf.setValue(CVALUEGen.getText());
              			CVALUEGenLeaf.setPos(CVALUEGen.getCharPositionInLine());
              			CVALUEGenLeaf.setLine(CVALUEGen.getLine());
              			comment_tableReturnNode.getChildren().add(CVALUEGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		comment_tableReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = comment_tableReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end comment_table

    public static class column_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start column
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:438:1: column returns [Node returnNode] : IDGen= ID typeGen+= type (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? TK_2= ')' )? (TK_3= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_4= 'NULL' | TK_5= 'NOT NULL' )? (defectoGen+= defecto )? (TK_6= ',' )? ;
    public final column_return column() throws RecognitionException {
        column_return retval = new column_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;
        Token NUMBERGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        Token TK_6=null;
        List list_typeGen=null;
        List list_name_constraintGen=null;
        List list_defectoGen=null;
        RuleReturnScope typeGen = null;
        RuleReturnScope name_constraintGen = null;
        RuleReturnScope defectoGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:1: (IDGen= ID typeGen+= type (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? TK_2= ')' )? (TK_3= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_4= 'NULL' | TK_5= 'NOT NULL' )? (defectoGen+= defecto )? (TK_6= ',' )? )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:3: IDGen= ID typeGen+= type (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? TK_2= ')' )? (TK_3= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_4= 'NULL' | TK_5= 'NOT NULL' )? (defectoGen+= defecto )? (TK_6= ',' )?
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_column341); if (failed) return retval;
            pushFollow(FOLLOW_type_in_column345);
            typeGen=type();
            _fsp--;
            if (failed) return retval;
            if (list_typeGen==null) list_typeGen=new ArrayList();
            list_typeGen.add(typeGen);

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:26: (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? TK_2= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:27: TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? TK_2= ')'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_column350); if (failed) return retval;
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_column354); if (failed) return retval;
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:53: (TK_1= 'BYTE' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==34) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:54: TK_1= 'BYTE'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_column359); if (failed) return retval;

                            }
                            break;

                    }

                    TK_2=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_column365); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:79: (TK_3= 'CONSTRAINT' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==ID) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==EOF||LA19_3==ID||(LA19_3>=EXACTO && LA19_3<=BINARIES)||(LA19_3>=24 && LA19_3<=25)||(LA19_3>=35 && LA19_3<=38)) ) {
                        alt19=1;
                    }
                }
                else if ( (LA19_1==EOF||(LA19_1>=24 && LA19_1<=25)||(LA19_1>=35 && LA19_1<=38)) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:80: TK_3= 'CONSTRAINT'
                    {
                    TK_3=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_column372); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:100: (name_constraintGen+= name_constraint )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||LA20_1==ID||(LA20_1>=24 && LA20_1<=25)||(LA20_1>=35 && LA20_1<=38)) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:101: name_constraintGen+= name_constraint
                    {
                    pushFollow(FOLLOW_name_constraint_in_column379);
                    name_constraintGen=name_constraint();
                    _fsp--;
                    if (failed) return retval;
                    if (list_name_constraintGen==null) list_name_constraintGen=new ArrayList();
                    list_name_constraintGen.add(name_constraintGen);


                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:139: (TK_4= 'NULL' | TK_5= 'NOT NULL' )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:140: TK_4= 'NULL'
                    {
                    TK_4=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_column386); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:154: TK_5= 'NOT NULL'
                    {
                    TK_5=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_column392); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:172: (defectoGen+= defecto )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:173: defectoGen+= defecto
                    {
                    pushFollow(FOLLOW_defecto_in_column399);
                    defectoGen=defecto();
                    _fsp--;
                    if (failed) return retval;
                    if (list_defectoGen==null) list_defectoGen=new ArrayList();
                    list_defectoGen.add(defectoGen);


                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:195: (TK_6= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred29()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:196: TK_6= ','
                    {
                    TK_6=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_column406); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node columnReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		columnReturnNode.setKind("column");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			columnReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Node
              		if(list_typeGen != null) {
              	        for(Iterator it = list_typeGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.type_return r = (DDLParser.type_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("type");
              	            	columnReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		columnReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(NUMBERGen != null) {
              			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			NUMBERGenLeaf.setKind("NUMBER");
              			NUMBERGenLeaf.setValue(NUMBERGen.getText());
              			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
              			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
              			columnReturnNode.getChildren().add(NUMBERGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		columnReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		columnReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		columnReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_name_constraintGen != null) {
              	        for(Iterator it = list_name_constraintGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.name_constraint_return r = (DDLParser.name_constraint_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("name_constraint");
              	            	columnReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_4Leaf.setKind("TOKEN");
              	 		TK_4Leaf.setValue(TK_4.getText());
              			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
              			TK_4Leaf.setLine(TK_4.getLine());
              	 		columnReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_5Leaf.setKind("TOKEN");
              	 		TK_5Leaf.setValue(TK_5.getText());
              			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
              			TK_5Leaf.setLine(TK_5.getLine());
              	 		columnReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_defectoGen != null) {
              	        for(Iterator it = list_defectoGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.defecto_return r = (DDLParser.defecto_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("defecto");
              	            	columnReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_6Leaf.setKind("TOKEN");
              	 		TK_6Leaf.setValue(TK_6.getText());
              			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
              			TK_6Leaf.setLine(TK_6.getLine());
              	 		columnReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = columnReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end column

    public static class defecto_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start defecto
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:560:1: defecto returns [Node returnNode] : TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE ) ;
    public final defecto_return defecto() throws RecognitionException {
        defecto_return retval = new defecto_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token NUMBERGen=null;
        Token CVALUEGen=null;

        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:561:1: (TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE ) )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:561:3: TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE )
            {
            TK_0=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_defecto429); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:561:18: (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt24=1;
                }
                break;
            case 37:
                {
                alt24=2;
                }
                break;
            case NUMBER:
                {
                alt24=3;
                }
                break;
            case CVALUE:
                {
                alt24=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("561:18: (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:561:19: TK_1= 'NULL'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_defecto434); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:561:33: TK_2= 'NOT NULL'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_defecto440); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:561:51: NUMBERGen= NUMBER
                    {
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_defecto446); if (failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:561:70: CVALUEGen= CVALUE
                    {
                    CVALUEGen=(Token)input.LT(1);
                    match(input,CVALUE,FOLLOW_CVALUE_in_defecto452); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node defectoReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		defectoReturnNode.setKind("defecto");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		defectoReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		defectoReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		defectoReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(NUMBERGen != null) {
              			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			NUMBERGenLeaf.setKind("NUMBER");
              			NUMBERGenLeaf.setValue(NUMBERGen.getText());
              			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
              			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
              			defectoReturnNode.getChildren().add(NUMBERGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(CVALUEGen != null) {
              			Leaf CVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			CVALUEGenLeaf.setKind("CVALUE");
              			CVALUEGenLeaf.setValue(CVALUEGen.getText());
              			CVALUEGenLeaf.setPos(CVALUEGen.getCharPositionInLine());
              			CVALUEGenLeaf.setLine(CVALUEGen.getLine());
              			defectoReturnNode.getChildren().add(CVALUEGenLeaf);
              		}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = defectoReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end defecto

    public static class comment_column_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start comment_column
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:616:1: comment_column returns [Node returnNode] : TK_0= 'COMMENT ON COLUMN' table_referencesGen+= table_references TK_1= '\\.' IDGen= ID TK_2= 'IS' CVALUEGen= CVALUE TK_3= ';' ;
    public final comment_column_return comment_column() throws RecognitionException {
        comment_column_return retval = new comment_column_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token IDGen=null;
        Token TK_2=null;
        Token CVALUEGen=null;
        Token TK_3=null;
        List list_table_referencesGen=null;
        RuleReturnScope table_referencesGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:617:1: (TK_0= 'COMMENT ON COLUMN' table_referencesGen+= table_references TK_1= '\\.' IDGen= ID TK_2= 'IS' CVALUEGen= CVALUE TK_3= ';' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:617:3: TK_0= 'COMMENT ON COLUMN' table_referencesGen+= table_references TK_1= '\\.' IDGen= ID TK_2= 'IS' CVALUEGen= CVALUE TK_3= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_comment_column474); if (failed) return retval;
            pushFollow(FOLLOW_table_references_in_comment_column479);
            table_referencesGen=table_references();
            _fsp--;
            if (failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_1=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_comment_column483); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_comment_column487); if (failed) return retval;
            TK_2=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_comment_column491); if (failed) return retval;
            CVALUEGen=(Token)input.LT(1);
            match(input,CVALUE,FOLLOW_CVALUE_in_comment_column496); if (failed) return retval;
            TK_3=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_comment_column500); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node comment_columnReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		comment_columnReturnNode.setKind("comment_column");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		comment_columnReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_table_referencesGen != null) {
              	        for(Iterator it = list_table_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.table_references_return r = (DDLParser.table_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("table_references");
              	            	comment_columnReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		comment_columnReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			comment_columnReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		comment_columnReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(CVALUEGen != null) {
              			Leaf CVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			CVALUEGenLeaf.setKind("CVALUE");
              			CVALUEGenLeaf.setValue(CVALUEGen.getText());
              			CVALUEGenLeaf.setPos(CVALUEGen.getCharPositionInLine());
              			CVALUEGenLeaf.setLine(CVALUEGen.getLine());
              			comment_columnReturnNode.getChildren().add(CVALUEGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		comment_columnReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = comment_columnReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end comment_column

    public static class disabled_constraint_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start disabled_constraint
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:691:1: disabled_constraint returns [Node returnNode] : TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'DROP CONSTRAINT' name_constraintGen+= name_constraint TK_2= ';' ;
    public final disabled_constraint_return disabled_constraint() throws RecognitionException {
        disabled_constraint_return retval = new disabled_constraint_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_table_referencesGen=null;
        List list_name_constraintGen=null;
        RuleReturnScope table_referencesGen = null;
        RuleReturnScope name_constraintGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:692:1: (TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'DROP CONSTRAINT' name_constraintGen+= name_constraint TK_2= ';' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:692:3: TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'DROP CONSTRAINT' name_constraintGen+= name_constraint TK_2= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_disabled_constraint521); if (failed) return retval;
            pushFollow(FOLLOW_table_references_in_disabled_constraint525);
            table_referencesGen=table_references();
            _fsp--;
            if (failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_1=(Token)input.LT(1);
            match(input,42,FOLLOW_42_in_disabled_constraint529); if (failed) return retval;
            pushFollow(FOLLOW_name_constraint_in_disabled_constraint533);
            name_constraintGen=name_constraint();
            _fsp--;
            if (failed) return retval;
            if (list_name_constraintGen==null) list_name_constraintGen=new ArrayList();
            list_name_constraintGen.add(name_constraintGen);

            TK_2=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_disabled_constraint537); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node disabled_constraintReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		disabled_constraintReturnNode.setKind("disabled_constraint");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		disabled_constraintReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_table_referencesGen != null) {
              	        for(Iterator it = list_table_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.table_references_return r = (DDLParser.table_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("table_references");
              	            	disabled_constraintReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		disabled_constraintReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_name_constraintGen != null) {
              	        for(Iterator it = list_name_constraintGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.name_constraint_return r = (DDLParser.name_constraint_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("name_constraint");
              	            	disabled_constraintReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		disabled_constraintReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = disabled_constraintReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end disabled_constraint

    public static class added_constraint_fk_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start added_constraint_fk
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:749:1: added_constraint_fk returns [Node returnNode] : TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'ADD' fkGen+= fk TK_2= ';' ;
    public final added_constraint_fk_return added_constraint_fk() throws RecognitionException {
        added_constraint_fk_return retval = new added_constraint_fk_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_table_referencesGen=null;
        List list_fkGen=null;
        RuleReturnScope table_referencesGen = null;
        RuleReturnScope fkGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:750:1: (TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'ADD' fkGen+= fk TK_2= ';' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:750:3: TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'ADD' fkGen+= fk TK_2= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_added_constraint_fk558); if (failed) return retval;
            pushFollow(FOLLOW_table_references_in_added_constraint_fk562);
            table_referencesGen=table_references();
            _fsp--;
            if (failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_1=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_added_constraint_fk566); if (failed) return retval;
            pushFollow(FOLLOW_fk_in_added_constraint_fk570);
            fkGen=fk();
            _fsp--;
            if (failed) return retval;
            if (list_fkGen==null) list_fkGen=new ArrayList();
            list_fkGen.add(fkGen);

            TK_2=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_added_constraint_fk574); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node added_constraint_fkReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		added_constraint_fkReturnNode.setKind("added_constraint_fk");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		added_constraint_fkReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_table_referencesGen != null) {
              	        for(Iterator it = list_table_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.table_references_return r = (DDLParser.table_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("table_references");
              	            	added_constraint_fkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		added_constraint_fkReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_fkGen != null) {
              	        for(Iterator it = list_fkGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.fk_return r = (DDLParser.fk_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("fk");
              	            	added_constraint_fkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		added_constraint_fkReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = added_constraint_fkReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end added_constraint_fk

    public static class added_constraint_ck_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start added_constraint_ck
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:807:1: added_constraint_ck returns [Node returnNode] : TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'ADD' ckGen+= ck TK_2= ';' ;
    public final added_constraint_ck_return added_constraint_ck() throws RecognitionException {
        added_constraint_ck_return retval = new added_constraint_ck_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_table_referencesGen=null;
        List list_ckGen=null;
        RuleReturnScope table_referencesGen = null;
        RuleReturnScope ckGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:808:1: (TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'ADD' ckGen+= ck TK_2= ';' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:808:3: TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'ADD' ckGen+= ck TK_2= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_added_constraint_ck595); if (failed) return retval;
            pushFollow(FOLLOW_table_references_in_added_constraint_ck599);
            table_referencesGen=table_references();
            _fsp--;
            if (failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_1=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_added_constraint_ck603); if (failed) return retval;
            pushFollow(FOLLOW_ck_in_added_constraint_ck607);
            ckGen=ck();
            _fsp--;
            if (failed) return retval;
            if (list_ckGen==null) list_ckGen=new ArrayList();
            list_ckGen.add(ckGen);

            TK_2=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_added_constraint_ck611); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node added_constraint_ckReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		added_constraint_ckReturnNode.setKind("added_constraint_ck");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		added_constraint_ckReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_table_referencesGen != null) {
              	        for(Iterator it = list_table_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.table_references_return r = (DDLParser.table_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("table_references");
              	            	added_constraint_ckReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		added_constraint_ckReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_ckGen != null) {
              	        for(Iterator it = list_ckGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.ck_return r = (DDLParser.ck_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("ck");
              	            	added_constraint_ckReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		added_constraint_ckReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = added_constraint_ckReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end added_constraint_ck

    public static class ck_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start ck
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:865:1: ck returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' (log_expresionGen+= log_expresion )+ TK_3= ')' ;
    public final ck_return ck() throws RecognitionException {
        ck_return retval = new ck_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_log_expresionGen=null;
        RuleReturnScope log_expresionGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:866:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' (log_expresionGen+= log_expresion )+ TK_3= ')' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:866:3: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' (log_expresionGen+= log_expresion )+ TK_3= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_ck632); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_ck636); if (failed) return retval;
            TK_1=(Token)input.LT(1);
            match(input,44,FOLLOW_44_in_ck640); if (failed) return retval;
            TK_2=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_ck644); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:866:52: (log_expresionGen+= log_expresion )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:866:53: log_expresionGen+= log_expresion
            	    {
            	    pushFollow(FOLLOW_log_expresion_in_ck649);
            	    log_expresionGen=log_expresion();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_log_expresionGen==null) list_log_expresionGen=new ArrayList();
            	    list_log_expresionGen.add(log_expresionGen);


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            TK_3=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ck655); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node ckReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		ckReturnNode.setKind("ck");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		ckReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			ckReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		ckReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		ckReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_log_expresionGen != null) {
              	        for(Iterator it = list_log_expresionGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.log_expresion_return r = (DDLParser.log_expresion_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("log_expresion");
              	            	ckReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		ckReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = ckReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ck

    public static class fk_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start fk
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:931:1: fk returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )? ;
    public final fk_return fk() throws RecognitionException {
        fk_return retval = new fk_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        Token TK_6=null;
        Token TK_7=null;
        Token TK_8=null;
        Token TK_9=null;
        Token TK_10=null;
        Token TK_11=null;
        Token TK_12=null;
        List list_column_listGen=null;
        List list_schema_referencesGen=null;
        List list_table_referencesGen=null;
        List list_references_column_listGen=null;
        RuleReturnScope column_listGen = null;
        RuleReturnScope schema_referencesGen = null;
        RuleReturnScope table_referencesGen = null;
        RuleReturnScope references_column_listGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )? )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:3: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )?
            {
            TK_0=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_fk677); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_fk681); if (failed) return retval;
            TK_1=(Token)input.LT(1);
            match(input,45,FOLLOW_45_in_fk685); if (failed) return retval;
            TK_2=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_fk689); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:58: (column_listGen+= column_list )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:59: column_listGen+= column_list
            	    {
            	    pushFollow(FOLLOW_column_list_in_fk694);
            	    column_listGen=column_list();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_column_listGen==null) list_column_listGen=new ArrayList();
            	    list_column_listGen.add(column_listGen);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            TK_3=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_fk700); if (failed) return retval;
            TK_4=(Token)input.LT(1);
            match(input,46,FOLLOW_46_in_fk704); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:116: (schema_referencesGen+= schema_references )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==ID||LA27_1==40) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:117: schema_referencesGen+= schema_references
                    {
                    pushFollow(FOLLOW_schema_references_in_fk709);
                    schema_referencesGen=schema_references();
                    _fsp--;
                    if (failed) return retval;
                    if (list_schema_referencesGen==null) list_schema_referencesGen=new ArrayList();
                    list_schema_referencesGen.add(schema_referencesGen);


                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:159: (TK_5= '\\.' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:160: TK_5= '\\.'
                    {
                    TK_5=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_fk716); if (failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_table_references_in_fk722);
            table_referencesGen=table_references();
            _fsp--;
            if (failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_6=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_fk726); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:219: (references_column_listGen+= references_column_list )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:220: references_column_listGen+= references_column_list
            	    {
            	    pushFollow(FOLLOW_references_column_list_in_fk731);
            	    references_column_listGen=references_column_list();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_references_column_listGen==null) list_references_column_listGen=new ArrayList();
            	    list_references_column_listGen.add(references_column_listGen);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            TK_7=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_fk737); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:281: (TK_8= 'ON' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:282: TK_8= 'ON'
                    {
                    TK_8=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_fk742); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:294: (TK_9= 'DELETE' | TK_10= 'UPDATE' )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            else if ( (LA31_0==49) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:295: TK_9= 'DELETE'
                    {
                    TK_9=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_fk749); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:311: TK_10= 'UPDATE'
                    {
                    TK_10=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_fk755); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:328: (TK_11= 'CASCADE' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:329: TK_11= 'CASCADE'
                    {
                    TK_11=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_fk762); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:347: (TK_12= 'DISABLE' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:932:348: TK_12= 'DISABLE'
                    {
                    TK_12=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_fk769); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node fkReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		fkReturnNode.setKind("fk");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		fkReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			fkReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		fkReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		fkReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_column_listGen != null) {
              	        for(Iterator it = list_column_listGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.column_list_return r = (DDLParser.column_list_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("column_list");
              	            	fkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		fkReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_4Leaf.setKind("TOKEN");
              	 		TK_4Leaf.setValue(TK_4.getText());
              			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
              			TK_4Leaf.setLine(TK_4.getLine());
              	 		fkReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_schema_referencesGen != null) {
              	        for(Iterator it = list_schema_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.schema_references_return r = (DDLParser.schema_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("schema_references");
              	            	fkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_5Leaf.setKind("TOKEN");
              	 		TK_5Leaf.setValue(TK_5.getText());
              			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
              			TK_5Leaf.setLine(TK_5.getLine());
              	 		fkReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_table_referencesGen != null) {
              	        for(Iterator it = list_table_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.table_references_return r = (DDLParser.table_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("table_references");
              	            	fkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_6Leaf.setKind("TOKEN");
              	 		TK_6Leaf.setValue(TK_6.getText());
              			TK_6Leaf.setPos(TK_6.getCharPositionInLine());
              			TK_6Leaf.setLine(TK_6.getLine());
              	 		fkReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_references_column_listGen != null) {
              	        for(Iterator it = list_references_column_listGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.references_column_list_return r = (DDLParser.references_column_list_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("references_column_list");
              	            	fkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_7Leaf.setKind("TOKEN");
              	 		TK_7Leaf.setValue(TK_7.getText());
              			TK_7Leaf.setPos(TK_7.getCharPositionInLine());
              			TK_7Leaf.setLine(TK_7.getLine());
              	 		fkReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_8Leaf.setKind("TOKEN");
              	 		TK_8Leaf.setValue(TK_8.getText());
              			TK_8Leaf.setPos(TK_8.getCharPositionInLine());
              			TK_8Leaf.setLine(TK_8.getLine());
              	 		fkReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_9 != null) {
              			Leaf TK_9Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_9Leaf.setKind("TOKEN");
              	 		TK_9Leaf.setValue(TK_9.getText());
              			TK_9Leaf.setPos(TK_9.getCharPositionInLine());
              			TK_9Leaf.setLine(TK_9.getLine());
              	 		fkReturnNode.getChildren().add(TK_9Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_10 != null) {
              			Leaf TK_10Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_10Leaf.setKind("TOKEN");
              	 		TK_10Leaf.setValue(TK_10.getText());
              			TK_10Leaf.setPos(TK_10.getCharPositionInLine());
              			TK_10Leaf.setLine(TK_10.getLine());
              	 		fkReturnNode.getChildren().add(TK_10Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_11 != null) {
              			Leaf TK_11Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_11Leaf.setKind("TOKEN");
              	 		TK_11Leaf.setValue(TK_11.getText());
              			TK_11Leaf.setPos(TK_11.getCharPositionInLine());
              			TK_11Leaf.setLine(TK_11.getLine());
              	 		fkReturnNode.getChildren().add(TK_11Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_12 != null) {
              			Leaf TK_12Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_12Leaf.setKind("TOKEN");
              	 		TK_12Leaf.setValue(TK_12.getText());
              			TK_12Leaf.setPos(TK_12.getCharPositionInLine());
              			TK_12Leaf.setLine(TK_12.getLine());
              	 		fkReturnNode.getChildren().add(TK_12Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = fkReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end fk

    public static class pk_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start pk
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1108:1: pk returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' ;
    public final pk_return pk() throws RecognitionException {
        pk_return retval = new pk_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_column_listGen=null;
        RuleReturnScope column_listGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1109:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1109:3: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_pk792); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_pk796); if (failed) return retval;
            TK_1=(Token)input.LT(1);
            match(input,52,FOLLOW_52_in_pk800); if (failed) return retval;
            TK_2=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_pk804); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1109:58: (column_listGen+= column_list )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1109:59: column_listGen+= column_list
            	    {
            	    pushFollow(FOLLOW_column_list_in_pk809);
            	    column_listGen=column_list();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_column_listGen==null) list_column_listGen=new ArrayList();
            	    list_column_listGen.add(column_listGen);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            TK_3=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_pk815); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node pkReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		pkReturnNode.setKind("pk");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		pkReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			pkReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		pkReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		pkReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_column_listGen != null) {
              	        for(Iterator it = list_column_listGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.column_list_return r = (DDLParser.column_list_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("column_list");
              	            	pkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		pkReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = pkReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end pk

    public static class column_ck_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start column_ck
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1174:1: column_ck returns [Node returnNode] : IDGen= ID ;
    public final column_ck_return column_ck() throws RecognitionException {
        column_ck_return retval = new column_ck_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1175:1: (IDGen= ID )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1175:3: IDGen= ID
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_column_ck836); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node column_ckReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		column_ckReturnNode.setKind("column_ck");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			column_ckReturnNode.getChildren().add(IDGenLeaf);
              		}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = column_ckReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end column_ck

    public static class schema_references_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start schema_references
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1194:1: schema_references returns [Node returnNode] : IDGen= ID ;
    public final schema_references_return schema_references() throws RecognitionException {
        schema_references_return retval = new schema_references_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1195:1: (IDGen= ID )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1195:3: IDGen= ID
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_schema_references857); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node schema_referencesReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		schema_referencesReturnNode.setKind("schema_references");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			schema_referencesReturnNode.getChildren().add(IDGenLeaf);
              		}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = schema_referencesReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end schema_references

    public static class table_references_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start table_references
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1214:1: table_references returns [Node returnNode] : IDGen= ID ;
    public final table_references_return table_references() throws RecognitionException {
        table_references_return retval = new table_references_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1215:1: (IDGen= ID )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1215:3: IDGen= ID
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_table_references878); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node table_referencesReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		table_referencesReturnNode.setKind("table_references");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			table_referencesReturnNode.getChildren().add(IDGenLeaf);
              		}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = table_referencesReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end table_references

    public static class name_constraint_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start name_constraint
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1234:1: name_constraint returns [Node returnNode] : IDGen= ID ;
    public final name_constraint_return name_constraint() throws RecognitionException {
        name_constraint_return retval = new name_constraint_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1235:1: (IDGen= ID )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1235:3: IDGen= ID
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_name_constraint899); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node name_constraintReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		name_constraintReturnNode.setKind("name_constraint");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			name_constraintReturnNode.getChildren().add(IDGenLeaf);
              		}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = name_constraintReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end name_constraint

    public static class references_column_list_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start references_column_list
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1254:1: references_column_list returns [Node returnNode] : IDGen= ID (TK_0= ',' )? ;
    public final references_column_list_return references_column_list() throws RecognitionException {
        references_column_list_return retval = new references_column_list_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;

        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1255:1: (IDGen= ID (TK_0= ',' )? )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1255:3: IDGen= ID (TK_0= ',' )?
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_references_column_list920); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1255:12: (TK_0= ',' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1255:13: TK_0= ','
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_references_column_list925); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node references_column_listReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		references_column_listReturnNode.setKind("references_column_list");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			references_column_listReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		references_column_listReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = references_column_listReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end references_column_list

    public static class value_list_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start value_list
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1283:1: value_list returns [Node returnNode] : CVALUEGen= CVALUE (TK_0= ',' )? ;
    public final value_list_return value_list() throws RecognitionException {
        value_list_return retval = new value_list_return();
        retval.start = input.LT(1);

        Token CVALUEGen=null;
        Token TK_0=null;

        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1284:1: (CVALUEGen= CVALUE (TK_0= ',' )? )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1284:3: CVALUEGen= CVALUE (TK_0= ',' )?
            {
            CVALUEGen=(Token)input.LT(1);
            match(input,CVALUE,FOLLOW_CVALUE_in_value_list948); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1284:20: (TK_0= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1284:21: TK_0= ','
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_value_list953); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node value_listReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		value_listReturnNode.setKind("value_list");
              	    // Create a CST Leaf
              		if(CVALUEGen != null) {
              			Leaf CVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			CVALUEGenLeaf.setKind("CVALUE");
              			CVALUEGenLeaf.setValue(CVALUEGen.getText());
              			CVALUEGenLeaf.setPos(CVALUEGen.getCharPositionInLine());
              			CVALUEGenLeaf.setLine(CVALUEGen.getLine());
              			value_listReturnNode.getChildren().add(CVALUEGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		value_listReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = value_listReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end value_list

    public static class column_list_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start column_list
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1312:1: column_list returns [Node returnNode] : IDGen= ID (TK_0= ',' )? ;
    public final column_list_return column_list() throws RecognitionException {
        column_list_return retval = new column_list_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;

        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1313:1: (IDGen= ID (TK_0= ',' )? )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1313:3: IDGen= ID (TK_0= ',' )?
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_column_list976); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1313:12: (TK_0= ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1313:13: TK_0= ','
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_column_list981); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node column_listReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		column_listReturnNode.setKind("column_list");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			column_listReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		column_listReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = column_listReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end column_list

    public static class database_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start database
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1341:1: database returns [Node returnNode] : TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (specificationGen+= specification )? TK_4= ';' ;
    public final database_return database() throws RecognitionException {
        database_return retval = new database_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token IDGen=null;
        Token TK_4=null;
        List list_specificationGen=null;
        RuleReturnScope specificationGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1342:1: (TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (specificationGen+= specification )? TK_4= ';' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1342:3: TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (specificationGen+= specification )? TK_4= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_database1004); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1342:17: (TK_1= 'DATABASE' | TK_2= 'SCHEMA' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            else if ( (LA38_0==54) ) {
                alt38=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1342:17: (TK_1= 'DATABASE' | TK_2= 'SCHEMA' )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1342:18: TK_1= 'DATABASE'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_database1009); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1342:36: TK_2= 'SCHEMA'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_database1015); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1342:51: (TK_3= 'IF NOT EXISTS' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1342:52: TK_3= 'IF NOT EXISTS'
                    {
                    TK_3=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_database1021); if (failed) return retval;

                    }
                    break;

            }

            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_database1027); if (failed) return retval;
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1342:84: (specificationGen+= specification )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38||LA40_0==56||LA40_0==58) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1342:85: specificationGen+= specification
                    {
                    pushFollow(FOLLOW_specification_in_database1032);
                    specificationGen=specification();
                    _fsp--;
                    if (failed) return retval;
                    if (list_specificationGen==null) list_specificationGen=new ArrayList();
                    list_specificationGen.add(specificationGen);


                    }
                    break;

            }

            TK_4=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_database1038); if (failed) return retval;
            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node databaseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		databaseReturnNode.setKind("database");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		databaseReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		databaseReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		databaseReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_3Leaf.setKind("TOKEN");
              	 		TK_3Leaf.setValue(TK_3.getText());
              			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
              			TK_3Leaf.setLine(TK_3.getLine());
              	 		databaseReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			IDGenLeaf.setKind("ID");
              			IDGenLeaf.setValue(IDGen.getText());
              			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
              			IDGenLeaf.setLine(IDGen.getLine());
              			databaseReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Node
              		if(list_specificationGen != null) {
              	        for(Iterator it = list_specificationGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.specification_return r = (DDLParser.specification_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("specification");
              	            	databaseReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_4Leaf.setKind("TOKEN");
              	 		TK_4Leaf.setValue(TK_4.getText());
              			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
              			TK_4Leaf.setLine(TK_4.getLine());
              	 		databaseReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = databaseReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end database

    public static class specification_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start specification
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1416:1: specification returns [Node returnNode] : ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID );
    public final specification_return specification() throws RecognitionException {
        specification_return retval = new specification_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token COMPARATORGen=null;
        Token IDGen=null;

        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1417:1: ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID )
            int alt45=2;
            switch ( input.LA(1) ) {
            case 38:
                {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==56) ) {
                    alt45=1;
                }
                else if ( (LA45_1==58) ) {
                    alt45=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1416:1: specification returns [Node returnNode] : ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID );", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                alt45=1;
                }
                break;
            case 58:
                {
                alt45=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1416:1: specification returns [Node returnNode] : ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID );", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1417:3: (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID
                    {
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1417:3: (TK_0= 'DEFAULT' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==38) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1417:4: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_specification1060); if (failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_specification1066); if (failed) return retval;
                    TK_2=(Token)input.LT(1);
                    match(input,57,FOLLOW_57_in_specification1070); if (failed) return retval;
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1417:49: (COMPARATORGen= COMPARATOR )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==COMPARATOR) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1417:50: COMPARATORGen= COMPARATOR
                            {
                            COMPARATORGen=(Token)input.LT(1);
                            match(input,COMPARATOR,FOLLOW_COMPARATOR_in_specification1075); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_specification1081); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		specificationReturnNode.setKind("specification");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		specificationReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		specificationReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_2Leaf.setKind("TOKEN");
                      	 		TK_2Leaf.setValue(TK_2.getText());
                      			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
                      			TK_2Leaf.setLine(TK_2.getLine());
                      	 		specificationReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(COMPARATORGen != null) {
                      			Leaf COMPARATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			COMPARATORGenLeaf.setKind("COMPARATOR");
                      			COMPARATORGenLeaf.setValue(COMPARATORGen.getText());
                      			COMPARATORGenLeaf.setPos(COMPARATORGen.getCharPositionInLine());
                      			COMPARATORGenLeaf.setLine(COMPARATORGen.getLine());
                      			specificationReturnNode.getChildren().add(COMPARATORGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			specificationReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = specificationReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1470:6: (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID
                    {
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1470:6: (TK_0= 'DEFAULT' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==38) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1470:7: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_specification1095); if (failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)input.LT(1);
                    match(input,58,FOLLOW_58_in_specification1101); if (failed) return retval;
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1470:39: (COMPARATORGen= COMPARATOR )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==COMPARATOR) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1470:40: COMPARATORGen= COMPARATOR
                            {
                            COMPARATORGen=(Token)input.LT(1);
                            match(input,COMPARATOR,FOLLOW_COMPARATOR_in_specification1106); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_specification1112); if (failed) return retval;
                    if ( backtracking==0 ) {
                      
                      		// Create return CST Node
                      		Node specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		specificationReturnNode.setKind("specification");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_0Leaf.setKind("TOKEN");
                      	 		TK_0Leaf.setValue(TK_0.getText());
                      			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
                      			TK_0Leaf.setLine(TK_0.getLine());
                      	 		specificationReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      	 		TK_1Leaf.setKind("TOKEN");
                      	 		TK_1Leaf.setValue(TK_1.getText());
                      			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
                      			TK_1Leaf.setLine(TK_1.getLine());
                      	 		specificationReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(COMPARATORGen != null) {
                      			Leaf COMPARATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			COMPARATORGenLeaf.setKind("COMPARATOR");
                      			COMPARATORGenLeaf.setValue(COMPARATORGen.getText());
                      			COMPARATORGenLeaf.setPos(COMPARATORGen.getCharPositionInLine());
                      			COMPARATORGenLeaf.setLine(COMPARATORGen.getLine());
                      			specificationReturnNode.getChildren().add(COMPARATORGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
                      			IDGenLeaf.setKind("ID");
                      			IDGenLeaf.setValue(IDGen.getText());
                      			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
                      			IDGenLeaf.setLine(IDGen.getLine());
                      			specificationReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = specificationReturnNode;
                      	
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end specification

    public static class log_expresion_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start log_expresion
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1516:1: log_expresion returns [Node returnNode] : column_ckGen+= column_ck (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' ) ;
    public final log_expresion_return log_expresion() throws RecognitionException {
        log_expresion_return retval = new log_expresion_return();
        retval.start = input.LT(1);

        Token COMPARATORGen=null;
        Token NUMBERGen=null;
        Token CVALUEGen=null;
        Token LOG_CONJGen=null;
        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_column_ckGen=null;
        List list_value_listGen=null;
        RuleReturnScope column_ckGen = null;
        RuleReturnScope value_listGen = null;
        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1517:1: (column_ckGen+= column_ck (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' ) )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1517:3: column_ckGen+= column_ck (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' )
            {
            pushFollow(FOLLOW_column_ck_in_log_expresion1135);
            column_ckGen=column_ck();
            _fsp--;
            if (failed) return retval;
            if (list_column_ckGen==null) list_column_ckGen=new ArrayList();
            list_column_ckGen.add(column_ckGen);

            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1517:27: (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==COMPARATOR) ) {
                alt49=1;
            }
            else if ( (LA49_0==59) ) {
                alt49=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1517:27: (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1517:28: COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )?
                    {
                    COMPARATORGen=(Token)input.LT(1);
                    match(input,COMPARATOR,FOLLOW_COMPARATOR_in_log_expresion1140); if (failed) return retval;
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1517:53: (NUMBERGen= NUMBER | CVALUEGen= CVALUE )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==NUMBER) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==CVALUE) ) {
                        alt46=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1517:53: (NUMBERGen= NUMBER | CVALUEGen= CVALUE )", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1517:54: NUMBERGen= NUMBER
                            {
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_log_expresion1145); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1517:73: CVALUEGen= CVALUE
                            {
                            CVALUEGen=(Token)input.LT(1);
                            match(input,CVALUE,FOLLOW_CVALUE_in_log_expresion1151); if (failed) return retval;

                            }
                            break;

                    }

                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1517:102: (LOG_CONJGen= LOG_CONJ )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==LOG_CONJ) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:0:0: LOG_CONJGen= LOG_CONJ
                            {
                            LOG_CONJGen=(Token)input.LT(1);
                            match(input,LOG_CONJ,FOLLOW_LOG_CONJ_in_log_expresion1156); if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1517:115: TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,59,FOLLOW_59_in_log_expresion1163); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_log_expresion1167); if (failed) return retval;
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1517:134: (value_listGen+= value_list )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==CVALUE) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1517:135: value_listGen+= value_list
                    	    {
                    	    pushFollow(FOLLOW_value_list_in_log_expresion1172);
                    	    value_listGen=value_list();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if (list_value_listGen==null) list_value_listGen=new ArrayList();
                    	    list_value_listGen.add(value_listGen);


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    TK_2=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_log_expresion1178); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node log_expresionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		log_expresionReturnNode.setKind("log_expresion");
              	    // Create a CST Node
              		if(list_column_ckGen != null) {
              	        for(Iterator it = list_column_ckGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.column_ck_return r = (DDLParser.column_ck_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("column_ck");
              	            	log_expresionReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a CST Leaf
              		if(COMPARATORGen != null) {
              			Leaf COMPARATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			COMPARATORGenLeaf.setKind("COMPARATOR");
              			COMPARATORGenLeaf.setValue(COMPARATORGen.getText());
              			COMPARATORGenLeaf.setPos(COMPARATORGen.getCharPositionInLine());
              			COMPARATORGenLeaf.setLine(COMPARATORGen.getLine());
              			log_expresionReturnNode.getChildren().add(COMPARATORGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(NUMBERGen != null) {
              			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			NUMBERGenLeaf.setKind("NUMBER");
              			NUMBERGenLeaf.setValue(NUMBERGen.getText());
              			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
              			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
              			log_expresionReturnNode.getChildren().add(NUMBERGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(CVALUEGen != null) {
              			Leaf CVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			CVALUEGenLeaf.setKind("CVALUE");
              			CVALUEGenLeaf.setValue(CVALUEGen.getText());
              			CVALUEGenLeaf.setPos(CVALUEGen.getCharPositionInLine());
              			CVALUEGenLeaf.setLine(CVALUEGen.getLine());
              			log_expresionReturnNode.getChildren().add(CVALUEGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(LOG_CONJGen != null) {
              			Leaf LOG_CONJGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			LOG_CONJGenLeaf.setKind("LOG_CONJ");
              			LOG_CONJGenLeaf.setValue(LOG_CONJGen.getText());
              			LOG_CONJGenLeaf.setPos(LOG_CONJGen.getCharPositionInLine());
              			LOG_CONJGenLeaf.setLine(LOG_CONJGen.getLine());
              			log_expresionReturnNode.getChildren().add(LOG_CONJGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_0Leaf.setKind("TOKEN");
              	 		TK_0Leaf.setValue(TK_0.getText());
              			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
              			TK_0Leaf.setLine(TK_0.getLine());
              	 		log_expresionReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_1Leaf.setKind("TOKEN");
              	 		TK_1Leaf.setValue(TK_1.getText());
              			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
              			TK_1Leaf.setLine(TK_1.getLine());
              	 		log_expresionReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_value_listGen != null) {
              	        for(Iterator it = list_value_listGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.value_list_return r = (DDLParser.value_list_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("value_list");
              	            	log_expresionReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_2Leaf.setKind("TOKEN");
              	 		TK_2Leaf.setValue(TK_2.getText());
              			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
              			TK_2Leaf.setLine(TK_2.getLine());
              	 		log_expresionReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = log_expresionReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end log_expresion

    public static class type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start type
    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1610:1: type returns [Node returnNode] : (EXACTOGen= EXACTO | APROXIMADOGen= APROXIMADO | CHARACTERSGen= CHARACTERS | BITSGen= BITS | TIMESGen= TIMES | INTERVALSGen= INTERVALS | BINARIESGen= BINARIES ) ;
    public final type_return type() throws RecognitionException {
        type_return retval = new type_return();
        retval.start = input.LT(1);

        Token EXACTOGen=null;
        Token APROXIMADOGen=null;
        Token CHARACTERSGen=null;
        Token BITSGen=null;
        Token TIMESGen=null;
        Token INTERVALSGen=null;
        Token BINARIESGen=null;

        try {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1611:1: ( (EXACTOGen= EXACTO | APROXIMADOGen= APROXIMADO | CHARACTERSGen= CHARACTERS | BITSGen= BITS | TIMESGen= TIMES | INTERVALSGen= INTERVALS | BINARIESGen= BINARIES ) )
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1611:3: (EXACTOGen= EXACTO | APROXIMADOGen= APROXIMADO | CHARACTERSGen= CHARACTERS | BITSGen= BITS | TIMESGen= TIMES | INTERVALSGen= INTERVALS | BINARIESGen= BINARIES )
            {
            // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1611:3: (EXACTOGen= EXACTO | APROXIMADOGen= APROXIMADO | CHARACTERSGen= CHARACTERS | BITSGen= BITS | TIMESGen= TIMES | INTERVALSGen= INTERVALS | BINARIESGen= BINARIES )
            int alt50=7;
            switch ( input.LA(1) ) {
            case EXACTO:
                {
                alt50=1;
                }
                break;
            case APROXIMADO:
                {
                alt50=2;
                }
                break;
            case CHARACTERS:
                {
                alt50=3;
                }
                break;
            case BITS:
                {
                alt50=4;
                }
                break;
            case TIMES:
                {
                alt50=5;
                }
                break;
            case INTERVALS:
                {
                alt50=6;
                }
                break;
            case BINARIES:
                {
                alt50=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1611:3: (EXACTOGen= EXACTO | APROXIMADOGen= APROXIMADO | CHARACTERSGen= CHARACTERS | BITSGen= BITS | TIMESGen= TIMES | INTERVALSGen= INTERVALS | BINARIESGen= BINARIES )", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1611:4: EXACTOGen= EXACTO
                    {
                    EXACTOGen=(Token)input.LT(1);
                    match(input,EXACTO,FOLLOW_EXACTO_in_type1201); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1611:23: APROXIMADOGen= APROXIMADO
                    {
                    APROXIMADOGen=(Token)input.LT(1);
                    match(input,APROXIMADO,FOLLOW_APROXIMADO_in_type1207); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1611:50: CHARACTERSGen= CHARACTERS
                    {
                    CHARACTERSGen=(Token)input.LT(1);
                    match(input,CHARACTERS,FOLLOW_CHARACTERS_in_type1213); if (failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1611:77: BITSGen= BITS
                    {
                    BITSGen=(Token)input.LT(1);
                    match(input,BITS,FOLLOW_BITS_in_type1219); if (failed) return retval;

                    }
                    break;
                case 5 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1611:92: TIMESGen= TIMES
                    {
                    TIMESGen=(Token)input.LT(1);
                    match(input,TIMES,FOLLOW_TIMES_in_type1225); if (failed) return retval;

                    }
                    break;
                case 6 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1611:109: INTERVALSGen= INTERVALS
                    {
                    INTERVALSGen=(Token)input.LT(1);
                    match(input,INTERVALS,FOLLOW_INTERVALS_in_type1231); if (failed) return retval;

                    }
                    break;
                case 7 :
                    // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:1611:134: BINARIESGen= BINARIES
                    {
                    BINARIESGen=(Token)input.LT(1);
                    match(input,BINARIES,FOLLOW_BINARIES_in_type1237); if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              
              		// Create return CST Node
              		Node typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		typeReturnNode.setKind("type");
              	    // Create a CST Leaf
              		if(EXACTOGen != null) {
              			Leaf EXACTOGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			EXACTOGenLeaf.setKind("EXACTO");
              			EXACTOGenLeaf.setValue(EXACTOGen.getText());
              			EXACTOGenLeaf.setPos(EXACTOGen.getCharPositionInLine());
              			EXACTOGenLeaf.setLine(EXACTOGen.getLine());
              			typeReturnNode.getChildren().add(EXACTOGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(APROXIMADOGen != null) {
              			Leaf APROXIMADOGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			APROXIMADOGenLeaf.setKind("APROXIMADO");
              			APROXIMADOGenLeaf.setValue(APROXIMADOGen.getText());
              			APROXIMADOGenLeaf.setPos(APROXIMADOGen.getCharPositionInLine());
              			APROXIMADOGenLeaf.setLine(APROXIMADOGen.getLine());
              			typeReturnNode.getChildren().add(APROXIMADOGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(CHARACTERSGen != null) {
              			Leaf CHARACTERSGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			CHARACTERSGenLeaf.setKind("CHARACTERS");
              			CHARACTERSGenLeaf.setValue(CHARACTERSGen.getText());
              			CHARACTERSGenLeaf.setPos(CHARACTERSGen.getCharPositionInLine());
              			CHARACTERSGenLeaf.setLine(CHARACTERSGen.getLine());
              			typeReturnNode.getChildren().add(CHARACTERSGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(BITSGen != null) {
              			Leaf BITSGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			BITSGenLeaf.setKind("BITS");
              			BITSGenLeaf.setValue(BITSGen.getText());
              			BITSGenLeaf.setPos(BITSGen.getCharPositionInLine());
              			BITSGenLeaf.setLine(BITSGen.getLine());
              			typeReturnNode.getChildren().add(BITSGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(TIMESGen != null) {
              			Leaf TIMESGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			TIMESGenLeaf.setKind("TIMES");
              			TIMESGenLeaf.setValue(TIMESGen.getText());
              			TIMESGenLeaf.setPos(TIMESGen.getCharPositionInLine());
              			TIMESGenLeaf.setLine(TIMESGen.getLine());
              			typeReturnNode.getChildren().add(TIMESGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(INTERVALSGen != null) {
              			Leaf INTERVALSGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			INTERVALSGenLeaf.setKind("INTERVALS");
              			INTERVALSGenLeaf.setValue(INTERVALSGen.getText());
              			INTERVALSGenLeaf.setPos(INTERVALSGen.getCharPositionInLine());
              			INTERVALSGenLeaf.setLine(INTERVALSGen.getLine());
              			typeReturnNode.getChildren().add(INTERVALSGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(BINARIESGen != null) {
              			Leaf BINARIESGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			BINARIESGenLeaf.setKind("BINARIES");
              			BINARIESGenLeaf.setValue(BINARIESGen.getText());
              			BINARIESGenLeaf.setPos(BINARIESGen.getCharPositionInLine());
              			BINARIESGenLeaf.setLine(BINARIESGen.getLine());
              			typeReturnNode.getChildren().add(BINARIESGenLeaf);
              		}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = typeReturnNode;
              	
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end type

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:109: ( ',' )
        // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:109: ','
        {
        match(input,24,FOLLOW_24_in_synpred10196); if (failed) return ;

        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:132: ( ',' )
        // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:169:132: ','
        {
        match(input,24,FOLLOW_24_in_synpred11208); if (failed) return ;

        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:196: ( ',' )
        // /Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3:439:196: ','
        {
        match(input,24,FOLLOW_24_in_synpred29406); if (failed) return ;

        }
    }
    // $ANTLR end synpred29

    public final boolean synpred29() {
        backtracking++;
        int start = input.mark();
        try {
            synpred29_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred10() {
        backtracking++;
        int start = input.mark();
        try {
            synpred10_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_data_definition_statement_in_data_definition48 = new BitSet(new long[]{0x0000028100100002L});
    public static final BitSet FOLLOW_database_in_data_definition_statement73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_data_definition_statement84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_table_in_data_definition_statement95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_column_in_data_definition_statement106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_disabled_constraint_in_data_definition_statement117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_added_constraint_ck_in_data_definition_statement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_added_constraint_fk_in_data_definition_statement139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_table161 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_LOG_CONJ_in_table166 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_table170 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_table176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_table180 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_table184 = new BitSet(new long[]{0x0000000803000020L});
    public static final BitSet FOLLOW_column_in_table189 = new BitSet(new long[]{0x0000000803000020L});
    public static final BitSet FOLLOW_24_in_table196 = new BitSet(new long[]{0x0000000803000000L});
    public static final BitSet FOLLOW_ck_in_table203 = new BitSet(new long[]{0x0000000803000000L});
    public static final BitSet FOLLOW_24_in_table208 = new BitSet(new long[]{0x0000000803000000L});
    public static final BitSet FOLLOW_pk_in_table217 = new BitSet(new long[]{0x0000000803000000L});
    public static final BitSet FOLLOW_24_in_table224 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_fk_in_table231 = new BitSet(new long[]{0x0000000803000000L});
    public static final BitSet FOLLOW_24_in_table236 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_25_in_table244 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_26_in_table249 = new BitSet(new long[]{0x00000000F8000000L});
    public static final BitSet FOLLOW_27_in_table256 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_28_in_table263 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_29_in_table270 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_table277 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_table282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_comment_table304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_comment_table308 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_comment_table312 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CVALUE_in_comment_table316 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_comment_table320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column341 = new BitSet(new long[]{0x000000000000FE00L});
    public static final BitSet FOLLOW_type_in_column345 = new BitSet(new long[]{0x0000007801800022L});
    public static final BitSet FOLLOW_23_in_column350 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_column354 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_34_in_column359 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_column365 = new BitSet(new long[]{0x0000007801000022L});
    public static final BitSet FOLLOW_35_in_column372 = new BitSet(new long[]{0x0000007001000022L});
    public static final BitSet FOLLOW_name_constraint_in_column379 = new BitSet(new long[]{0x0000007001000002L});
    public static final BitSet FOLLOW_36_in_column386 = new BitSet(new long[]{0x0000004001000002L});
    public static final BitSet FOLLOW_37_in_column392 = new BitSet(new long[]{0x0000004001000002L});
    public static final BitSet FOLLOW_defecto_in_column399 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_column406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_defecto429 = new BitSet(new long[]{0x00000030000000C0L});
    public static final BitSet FOLLOW_36_in_defecto434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_defecto440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_defecto446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CVALUE_in_defecto452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_comment_column474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_references_in_comment_column479 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_comment_column483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_comment_column487 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_comment_column491 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CVALUE_in_comment_column496 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_comment_column500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_disabled_constraint521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_references_in_disabled_constraint525 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_disabled_constraint529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_name_constraint_in_disabled_constraint533 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_disabled_constraint537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_added_constraint_fk558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_references_in_added_constraint_fk562 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_added_constraint_fk566 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_fk_in_added_constraint_fk570 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_added_constraint_fk574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_added_constraint_ck595 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_references_in_added_constraint_ck599 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_added_constraint_ck603 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ck_in_added_constraint_ck607 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_added_constraint_ck611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ck632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_ck636 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ck640 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ck644 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_log_expresion_in_ck649 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ck655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_fk677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_fk681 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_fk685 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_fk689 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_column_list_in_fk694 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_fk700 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_fk704 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_schema_references_in_fk709 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_40_in_fk716 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_references_in_fk722 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_fk726 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_references_column_list_in_fk731 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_fk737 = new BitSet(new long[]{0x000F800000000002L});
    public static final BitSet FOLLOW_47_in_fk742 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_48_in_fk749 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_49_in_fk755 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_fk762 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_fk769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_pk792 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_pk796 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_pk800 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_pk804 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_column_list_in_pk809 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_pk815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_ck836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_schema_references857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table_references878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name_constraint899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_references_column_list920 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_references_column_list925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CVALUE_in_value_list948 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_value_list953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_list976 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_column_list981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_database1004 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53_in_database1009 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_54_in_database1015 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_55_in_database1021 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_database1027 = new BitSet(new long[]{0x0500004080000000L});
    public static final BitSet FOLLOW_specification_in_database1032 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_database1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_specification1060 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_specification1066 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_specification1070 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_COMPARATOR_in_specification1075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_specification1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_specification1095 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_specification1101 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_COMPARATOR_in_specification1106 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_specification1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_ck_in_log_expresion1135 = new BitSet(new long[]{0x0800000000000100L});
    public static final BitSet FOLLOW_COMPARATOR_in_log_expresion1140 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_NUMBER_in_log_expresion1145 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CVALUE_in_log_expresion1151 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_LOG_CONJ_in_log_expresion1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_log_expresion1163 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_log_expresion1167 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_value_list_in_log_expresion1172 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_25_in_log_expresion1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTO_in_type1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APROXIMADO_in_type1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTERS_in_type1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITS_in_type1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_type1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERVALS_in_type1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARIES_in_type1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred10196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred11208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred29406 = new BitSet(new long[]{0x0000000000000002L});

}