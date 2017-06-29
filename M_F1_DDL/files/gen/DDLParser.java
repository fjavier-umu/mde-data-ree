// $ANTLR 3.0.1 /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3 2014-03-21 16:59:30

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LOG_CONJ", "ID", "CVALUE", "NUMBER", "COMPARATOR", "EXACTO", "APROXIMADO", "CHARACTERS", "BITS", "TIMES", "INTERVALS", "BINARIES", "SQUOTE", "WS", "ML_COMMENT", "OL_COMMENT", "'CREATE'", "'REPLACE'", "'TABLE'", "'('", "','", "')'", "'LOGGING'", "'NOCOMPRESS'", "'NOCACHE'", "'NOPARALLEL'", "'MONITORING'", "';'", "'COMMENT ON TABLE'", "'IS'", "'BYTE'", "'CONSTRAINT'", "'NULL'", "'NOT NULL'", "'DEFAULT'", "'COMMENT ON COLUMN'", "'\\.'", "'ALTER TABLE'", "'DROP CONSTRAINT'", "'CHECK'", "'FOREIGN KEY'", "'REFERENCES'", "'ON'", "'DELETE'", "'UPDATE'", "'CASCADE'", "'DISABLE'", "'PRIMARY KEY'", "'DATABASE'", "'SCHEMA'", "'IF NOT EXISTS'", "'CHARACTER'", "'SET'", "'COLLATE'", "'IN'"
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
            ruleMemo = new HashMap[85+1];
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
    public String getGrammarFileName() { return "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3"; }


    public static class data_definition_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start data_definition
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:18:1: data_definition returns [Node returnNode] : (data_definition_statementGen+= data_definition_statement )* ;
    public final data_definition_return data_definition() throws RecognitionException {
        data_definition_return retval = new data_definition_return();
        retval.start = input.LT(1);

        List list_data_definition_statementGen=null;
        RuleReturnScope data_definition_statementGen = null;
        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:19:1: ( (data_definition_statementGen+= data_definition_statement )* )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:19:4: (data_definition_statementGen+= data_definition_statement )*
            {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:19:4: (data_definition_statementGen+= data_definition_statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||LA1_0==32||LA1_0==39||LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:19:5: data_definition_statementGen+= data_definition_statement
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:39:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint );
    public final data_definition_statement_return data_definition_statement() throws RecognitionException {
        data_definition_statement_return retval = new data_definition_statement_return();
        retval.start = input.LT(1);

        List list_databaseGen=null;
        List list_tableGen=null;
        List list_comment_tableGen=null;
        List list_comment_columnGen=null;
        List list_disabled_constraintGen=null;
        RuleReturnScope databaseGen = null;
        RuleReturnScope tableGen = null;
        RuleReturnScope comment_tableGen = null;
        RuleReturnScope comment_columnGen = null;
        RuleReturnScope disabled_constraintGen = null;
        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:40:1: (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=52 && LA2_1<=53)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==LOG_CONJ||LA2_1==22) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("39:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint );", 2, 1, input);

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
                alt2=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("39:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | comment_tableGen+= comment_table | comment_columnGen+= comment_column | disabled_constraintGen+= disabled_constraint );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:40:4: databaseGen+= database
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
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:58:4: tableGen+= table
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
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:76:4: comment_tableGen+= comment_table
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
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:94:4: comment_columnGen+= comment_column
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
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:112:4: disabled_constraintGen+= disabled_constraint
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:132:1: table returns [Node returnNode] : TK_0= 'CREATE' (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (columnGen+= column )* (TK_4= ',' )? (ckGen+= ck (TK_5= ',' )? )* (pkGen+= pk )? (TK_6= ',' )? (fkGen+= fk (TK_7= ',' )? )* TK_8= ')' (TK_9= 'LOGGING' )? (TK_10= 'NOCOMPRESS' )? (TK_11= 'NOCACHE' )? (TK_12= 'NOPARALLEL' )? (TK_13= 'MONITORING' )? TK_14= ';' ;
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
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:1: (TK_0= 'CREATE' (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (columnGen+= column )* (TK_4= ',' )? (ckGen+= ck (TK_5= ',' )? )* (pkGen+= pk )? (TK_6= ',' )? (fkGen+= fk (TK_7= ',' )? )* TK_8= ')' (TK_9= 'LOGGING' )? (TK_10= 'NOCOMPRESS' )? (TK_11= 'NOCACHE' )? (TK_12= 'NOPARALLEL' )? (TK_13= 'MONITORING' )? TK_14= ';' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:3: TK_0= 'CREATE' (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (columnGen+= column )* (TK_4= ',' )? (ckGen+= ck (TK_5= ',' )? )* (pkGen+= pk )? (TK_6= ',' )? (fkGen+= fk (TK_7= ',' )? )* TK_8= ')' (TK_9= 'LOGGING' )? (TK_10= 'NOCOMPRESS' )? (TK_11= 'NOCACHE' )? (TK_12= 'NOPARALLEL' )? (TK_13= 'MONITORING' )? TK_14= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_table138); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:17: (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==LOG_CONJ) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:18: LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE'
                    {
                    LOG_CONJGen=(Token)input.LT(1);
                    match(input,LOG_CONJ,FOLLOW_LOG_CONJ_in_table143); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_table147); if (failed) return retval;

                    }
                    break;

            }

            TK_2=(Token)input.LT(1);
            match(input,22,FOLLOW_22_in_table153); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_table157); if (failed) return retval;
            TK_3=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_table161); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:87: (columnGen+= column )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:88: columnGen+= column
            	    {
            	    pushFollow(FOLLOW_column_in_table166);
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

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:108: (TK_4= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred8()) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:109: TK_4= ','
                    {
                    TK_4=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_table173); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:120: (ckGen+= ck (TK_5= ',' )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==ID) ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==43) ) {
                            alt7=1;
                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:121: ckGen+= ck (TK_5= ',' )?
            	    {
            	    pushFollow(FOLLOW_ck_in_table180);
            	    ckGen=ck();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_ckGen==null) list_ckGen=new ArrayList();
            	    list_ckGen.add(ckGen);

            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:131: (TK_5= ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==24) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (synpred9()) ) {
            	            alt6=1;
            	        }
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:132: TK_5= ','
            	            {
            	            TK_5=(Token)input.LT(1);
            	            match(input,24,FOLLOW_24_in_table185); if (failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:145: (pkGen+= pk )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==51) ) {
                        alt8=1;
                    }
                }
            }
            switch (alt8) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:146: pkGen+= pk
                    {
                    pushFollow(FOLLOW_pk_in_table194);
                    pkGen=pk();
                    _fsp--;
                    if (failed) return retval;
                    if (list_pkGen==null) list_pkGen=new ArrayList();
                    list_pkGen.add(pkGen);


                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:158: (TK_6= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:159: TK_6= ','
                    {
                    TK_6=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_table201); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:170: (fkGen+= fk (TK_7= ',' )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:171: fkGen+= fk (TK_7= ',' )?
            	    {
            	    pushFollow(FOLLOW_fk_in_table208);
            	    fkGen=fk();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_fkGen==null) list_fkGen=new ArrayList();
            	    list_fkGen.add(fkGen);

            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:181: (TK_7= ',' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==24) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:182: TK_7= ','
            	            {
            	            TK_7=(Token)input.LT(1);
            	            match(input,24,FOLLOW_24_in_table213); if (failed) return retval;

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
            match(input,25,FOLLOW_25_in_table221); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:204: (TK_9= 'LOGGING' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:205: TK_9= 'LOGGING'
                    {
                    TK_9=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_table226); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:222: (TK_10= 'NOCOMPRESS' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:223: TK_10= 'NOCOMPRESS'
                    {
                    TK_10=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_table233); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:244: (TK_11= 'NOCACHE' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:245: TK_11= 'NOCACHE'
                    {
                    TK_11=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_table240); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:263: (TK_12= 'NOPARALLEL' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:264: TK_12= 'NOPARALLEL'
                    {
                    TK_12=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_table247); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:285: (TK_13= 'MONITORING' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:286: TK_13= 'MONITORING'
                    {
                    TK_13=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_table254); if (failed) return retval;

                    }
                    break;

            }

            TK_14=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_table259); if (failed) return retval;
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:346:1: comment_table returns [Node returnNode] : TK_0= 'COMMENT ON TABLE' IDGen= ID TK_1= 'IS' CVALUEGen= CVALUE TK_2= ';' ;
    public final comment_table_return comment_table() throws RecognitionException {
        comment_table_return retval = new comment_table_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token CVALUEGen=null;
        Token TK_2=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:347:1: (TK_0= 'COMMENT ON TABLE' IDGen= ID TK_1= 'IS' CVALUEGen= CVALUE TK_2= ';' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:347:3: TK_0= 'COMMENT ON TABLE' IDGen= ID TK_1= 'IS' CVALUEGen= CVALUE TK_2= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,32,FOLLOW_32_in_comment_table281); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_comment_table285); if (failed) return retval;
            TK_1=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_comment_table289); if (failed) return retval;
            CVALUEGen=(Token)input.LT(1);
            match(input,CVALUE,FOLLOW_CVALUE_in_comment_table293); if (failed) return retval;
            TK_2=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_comment_table297); if (failed) return retval;
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:402:1: column returns [Node returnNode] : IDGen= ID typeGen+= type (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_5= 'NULL' | TK_6= 'NOT NULL' )? (defectoGen+= defecto )? (TK_7= ',' )? ;
    public final column_return column() throws RecognitionException {
        column_return retval = new column_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;
        Token NUMBERGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token NUMBERGen_1=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        Token TK_6=null;
        Token TK_7=null;
        List list_typeGen=null;
        List list_name_constraintGen=null;
        List list_defectoGen=null;
        RuleReturnScope typeGen = null;
        RuleReturnScope name_constraintGen = null;
        RuleReturnScope defectoGen = null;
        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:1: (IDGen= ID typeGen+= type (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_5= 'NULL' | TK_6= 'NOT NULL' )? (defectoGen+= defecto )? (TK_7= ',' )? )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:3: IDGen= ID typeGen+= type (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_5= 'NULL' | TK_6= 'NOT NULL' )? (defectoGen+= defecto )? (TK_7= ',' )?
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_column318); if (failed) return retval;
            pushFollow(FOLLOW_type_in_column322);
            typeGen=type();
            _fsp--;
            if (failed) return retval;
            if (list_typeGen==null) list_typeGen=new ArrayList();
            list_typeGen.add(typeGen);

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:26: (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:27: TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_column327); if (failed) return retval;
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_column331); if (failed) return retval;
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:53: (TK_1= 'BYTE' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==34) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:54: TK_1= 'BYTE'
                            {
                            TK_1=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_column336); if (failed) return retval;

                            }
                            break;

                    }

                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:68: (TK_2= ',' NUMBERGen_1= NUMBER )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==24) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:70: TK_2= ',' NUMBERGen_1= NUMBER
                            {
                            TK_2=(Token)input.LT(1);
                            match(input,24,FOLLOW_24_in_column344); if (failed) return retval;
                            NUMBERGen_1=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_column348); if (failed) return retval;

                            }
                            break;

                    }

                    TK_3=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_column355); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:112: (TK_4= 'CONSTRAINT' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==ID) ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==EOF||LA20_3==ID||(LA20_3>=EXACTO && LA20_3<=BINARIES)||(LA20_3>=24 && LA20_3<=25)||(LA20_3>=35 && LA20_3<=38)) ) {
                        alt20=1;
                    }
                }
                else if ( (LA20_1==EOF||(LA20_1>=24 && LA20_1<=25)||(LA20_1>=35 && LA20_1<=38)) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:113: TK_4= 'CONSTRAINT'
                    {
                    TK_4=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_column362); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:133: (name_constraintGen+= name_constraint )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EOF||LA21_1==ID||(LA21_1>=24 && LA21_1<=25)||(LA21_1>=35 && LA21_1<=38)) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:134: name_constraintGen+= name_constraint
                    {
                    pushFollow(FOLLOW_name_constraint_in_column369);
                    name_constraintGen=name_constraint();
                    _fsp--;
                    if (failed) return retval;
                    if (list_name_constraintGen==null) list_name_constraintGen=new ArrayList();
                    list_name_constraintGen.add(name_constraintGen);


                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:172: (TK_5= 'NULL' | TK_6= 'NOT NULL' )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            else if ( (LA22_0==37) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:173: TK_5= 'NULL'
                    {
                    TK_5=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_column376); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:187: TK_6= 'NOT NULL'
                    {
                    TK_6=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_column382); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:205: (defectoGen+= defecto )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:206: defectoGen+= defecto
                    {
                    pushFollow(FOLLOW_defecto_in_column389);
                    defectoGen=defecto();
                    _fsp--;
                    if (failed) return retval;
                    if (list_defectoGen==null) list_defectoGen=new ArrayList();
                    list_defectoGen.add(defectoGen);


                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:228: (TK_7= ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred28()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:229: TK_7= ','
                    {
                    TK_7=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_column396); if (failed) return retval;

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
              	    // Create a CST Leaf
              		if(NUMBERGen_1 != null) {
              			Leaf NUMBERGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              			NUMBERGen_1Leaf.setKind("NUMBER");
              			NUMBERGen_1Leaf.setValue(NUMBERGen_1.getText());
              			NUMBERGen_1Leaf.setPos(NUMBERGen_1.getCharPositionInLine());
              			NUMBERGen_1Leaf.setLine(NUMBERGen_1.getLine());
              			columnReturnNode.getChildren().add(NUMBERGen_1Leaf);
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
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_4Leaf.setKind("TOKEN");
              	 		TK_4Leaf.setValue(TK_4.getText());
              			TK_4Leaf.setPos(TK_4.getCharPositionInLine());
              			TK_4Leaf.setLine(TK_4.getLine());
              	 		columnReturnNode.getChildren().add(TK_4Leaf);
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
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_5Leaf.setKind("TOKEN");
              	 		TK_5Leaf.setValue(TK_5.getText());
              			TK_5Leaf.setPos(TK_5.getCharPositionInLine());
              			TK_5Leaf.setLine(TK_5.getLine());
              	 		columnReturnNode.getChildren().add(TK_5Leaf);
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
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
              	 		TK_7Leaf.setKind("TOKEN");
              	 		TK_7Leaf.setValue(TK_7.getText());
              			TK_7Leaf.setPos(TK_7.getCharPositionInLine());
              			TK_7Leaf.setLine(TK_7.getLine());
              	 		columnReturnNode.getChildren().add(TK_7Leaf);
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:542:1: defecto returns [Node returnNode] : TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE ) ;
    public final defecto_return defecto() throws RecognitionException {
        defecto_return retval = new defecto_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token NUMBERGen=null;
        Token CVALUEGen=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:543:1: (TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE ) )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:543:3: TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE )
            {
            TK_0=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_defecto419); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:543:18: (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case NUMBER:
                {
                alt25=3;
                }
                break;
            case CVALUE:
                {
                alt25=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("543:18: (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:543:19: TK_1= 'NULL'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_defecto424); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:543:33: TK_2= 'NOT NULL'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_defecto430); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:543:51: NUMBERGen= NUMBER
                    {
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_defecto436); if (failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:543:70: CVALUEGen= CVALUE
                    {
                    CVALUEGen=(Token)input.LT(1);
                    match(input,CVALUE,FOLLOW_CVALUE_in_defecto442); if (failed) return retval;

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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:598:1: comment_column returns [Node returnNode] : TK_0= 'COMMENT ON COLUMN' table_referencesGen+= table_references TK_1= '\\.' IDGen= ID TK_2= 'IS' CVALUEGen= CVALUE TK_3= ';' ;
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
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:599:1: (TK_0= 'COMMENT ON COLUMN' table_referencesGen+= table_references TK_1= '\\.' IDGen= ID TK_2= 'IS' CVALUEGen= CVALUE TK_3= ';' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:599:3: TK_0= 'COMMENT ON COLUMN' table_referencesGen+= table_references TK_1= '\\.' IDGen= ID TK_2= 'IS' CVALUEGen= CVALUE TK_3= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_comment_column464); if (failed) return retval;
            pushFollow(FOLLOW_table_references_in_comment_column469);
            table_referencesGen=table_references();
            _fsp--;
            if (failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_1=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_comment_column473); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_comment_column477); if (failed) return retval;
            TK_2=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_comment_column481); if (failed) return retval;
            CVALUEGen=(Token)input.LT(1);
            match(input,CVALUE,FOLLOW_CVALUE_in_comment_column486); if (failed) return retval;
            TK_3=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_comment_column490); if (failed) return retval;
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:673:1: disabled_constraint returns [Node returnNode] : TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'DROP CONSTRAINT' name_constraintGen+= name_constraint TK_2= ';' ;
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
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:674:1: (TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'DROP CONSTRAINT' name_constraintGen+= name_constraint TK_2= ';' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:674:3: TK_0= 'ALTER TABLE' table_referencesGen+= table_references TK_1= 'DROP CONSTRAINT' name_constraintGen+= name_constraint TK_2= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_disabled_constraint511); if (failed) return retval;
            pushFollow(FOLLOW_table_references_in_disabled_constraint515);
            table_referencesGen=table_references();
            _fsp--;
            if (failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_1=(Token)input.LT(1);
            match(input,42,FOLLOW_42_in_disabled_constraint519); if (failed) return retval;
            pushFollow(FOLLOW_name_constraint_in_disabled_constraint523);
            name_constraintGen=name_constraint();
            _fsp--;
            if (failed) return retval;
            if (list_name_constraintGen==null) list_name_constraintGen=new ArrayList();
            list_name_constraintGen.add(name_constraintGen);

            TK_2=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_disabled_constraint527); if (failed) return retval;
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

    public static class ck_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start ck
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:731:1: ck returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' (log_expresionGen+= log_expresion )+ TK_3= ')' ;
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
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:732:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' (log_expresionGen+= log_expresion )+ TK_3= ')' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:732:3: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' (log_expresionGen+= log_expresion )+ TK_3= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_ck548); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_ck552); if (failed) return retval;
            TK_1=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_ck556); if (failed) return retval;
            TK_2=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_ck560); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:732:52: (log_expresionGen+= log_expresion )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:732:53: log_expresionGen+= log_expresion
            	    {
            	    pushFollow(FOLLOW_log_expresion_in_ck565);
            	    log_expresionGen=log_expresion();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_log_expresionGen==null) list_log_expresionGen=new ArrayList();
            	    list_log_expresionGen.add(log_expresionGen);


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            TK_3=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ck571); if (failed) return retval;
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:797:1: fk returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )? ;
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
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )? )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:3: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )?
            {
            TK_0=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_fk593); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_fk597); if (failed) return retval;
            TK_1=(Token)input.LT(1);
            match(input,44,FOLLOW_44_in_fk601); if (failed) return retval;
            TK_2=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_fk605); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:58: (column_listGen+= column_list )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:59: column_listGen+= column_list
            	    {
            	    pushFollow(FOLLOW_column_list_in_fk610);
            	    column_listGen=column_list();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_column_listGen==null) list_column_listGen=new ArrayList();
            	    list_column_listGen.add(column_listGen);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            TK_3=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_fk616); if (failed) return retval;
            TK_4=(Token)input.LT(1);
            match(input,45,FOLLOW_45_in_fk620); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:116: (schema_referencesGen+= schema_references )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==ID||LA28_1==40) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:117: schema_referencesGen+= schema_references
                    {
                    pushFollow(FOLLOW_schema_references_in_fk625);
                    schema_referencesGen=schema_references();
                    _fsp--;
                    if (failed) return retval;
                    if (list_schema_referencesGen==null) list_schema_referencesGen=new ArrayList();
                    list_schema_referencesGen.add(schema_referencesGen);


                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:159: (TK_5= '\\.' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:160: TK_5= '\\.'
                    {
                    TK_5=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_fk632); if (failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_table_references_in_fk638);
            table_referencesGen=table_references();
            _fsp--;
            if (failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_6=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_fk642); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:219: (references_column_listGen+= references_column_list )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:220: references_column_listGen+= references_column_list
            	    {
            	    pushFollow(FOLLOW_references_column_list_in_fk647);
            	    references_column_listGen=references_column_list();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_references_column_listGen==null) list_references_column_listGen=new ArrayList();
            	    list_references_column_listGen.add(references_column_listGen);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            TK_7=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_fk653); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:281: (TK_8= 'ON' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:282: TK_8= 'ON'
                    {
                    TK_8=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_fk658); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:294: (TK_9= 'DELETE' | TK_10= 'UPDATE' )?
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            else if ( (LA32_0==48) ) {
                alt32=2;
            }
            switch (alt32) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:295: TK_9= 'DELETE'
                    {
                    TK_9=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_fk665); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:311: TK_10= 'UPDATE'
                    {
                    TK_10=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_fk671); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:328: (TK_11= 'CASCADE' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:329: TK_11= 'CASCADE'
                    {
                    TK_11=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_fk678); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:347: (TK_12= 'DISABLE' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:798:348: TK_12= 'DISABLE'
                    {
                    TK_12=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_fk685); if (failed) return retval;

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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:974:1: pk returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' ;
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
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:975:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:975:3: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_pk708); if (failed) return retval;
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_pk712); if (failed) return retval;
            TK_1=(Token)input.LT(1);
            match(input,51,FOLLOW_51_in_pk716); if (failed) return retval;
            TK_2=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_pk720); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:975:58: (column_listGen+= column_list )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:975:59: column_listGen+= column_list
            	    {
            	    pushFollow(FOLLOW_column_list_in_pk725);
            	    column_listGen=column_list();
            	    _fsp--;
            	    if (failed) return retval;
            	    if (list_column_listGen==null) list_column_listGen=new ArrayList();
            	    list_column_listGen.add(column_listGen);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            TK_3=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_pk731); if (failed) return retval;
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1040:1: column_ck returns [Node returnNode] : IDGen= ID ;
    public final column_ck_return column_ck() throws RecognitionException {
        column_ck_return retval = new column_ck_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1041:1: (IDGen= ID )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1041:3: IDGen= ID
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_column_ck752); if (failed) return retval;
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1060:1: schema_references returns [Node returnNode] : IDGen= ID ;
    public final schema_references_return schema_references() throws RecognitionException {
        schema_references_return retval = new schema_references_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1061:1: (IDGen= ID )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1061:3: IDGen= ID
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_schema_references773); if (failed) return retval;
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1080:1: table_references returns [Node returnNode] : IDGen= ID ;
    public final table_references_return table_references() throws RecognitionException {
        table_references_return retval = new table_references_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1081:1: (IDGen= ID )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1081:3: IDGen= ID
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_table_references794); if (failed) return retval;
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1100:1: name_constraint returns [Node returnNode] : IDGen= ID ;
    public final name_constraint_return name_constraint() throws RecognitionException {
        name_constraint_return retval = new name_constraint_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1101:1: (IDGen= ID )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1101:3: IDGen= ID
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_name_constraint815); if (failed) return retval;
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1120:1: references_column_list returns [Node returnNode] : IDGen= ID (TK_0= ',' )? ;
    public final references_column_list_return references_column_list() throws RecognitionException {
        references_column_list_return retval = new references_column_list_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1121:1: (IDGen= ID (TK_0= ',' )? )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1121:3: IDGen= ID (TK_0= ',' )?
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_references_column_list836); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1121:12: (TK_0= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1121:13: TK_0= ','
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_references_column_list841); if (failed) return retval;

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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1149:1: value_list returns [Node returnNode] : CVALUEGen= CVALUE (TK_0= ',' )? ;
    public final value_list_return value_list() throws RecognitionException {
        value_list_return retval = new value_list_return();
        retval.start = input.LT(1);

        Token CVALUEGen=null;
        Token TK_0=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1150:1: (CVALUEGen= CVALUE (TK_0= ',' )? )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1150:3: CVALUEGen= CVALUE (TK_0= ',' )?
            {
            CVALUEGen=(Token)input.LT(1);
            match(input,CVALUE,FOLLOW_CVALUE_in_value_list864); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1150:20: (TK_0= ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1150:21: TK_0= ','
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_value_list869); if (failed) return retval;

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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1178:1: column_list returns [Node returnNode] : IDGen= ID (TK_0= ',' )? ;
    public final column_list_return column_list() throws RecognitionException {
        column_list_return retval = new column_list_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1179:1: (IDGen= ID (TK_0= ',' )? )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1179:3: IDGen= ID (TK_0= ',' )?
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_column_list892); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1179:12: (TK_0= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1179:13: TK_0= ','
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_column_list897); if (failed) return retval;

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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1207:1: database returns [Node returnNode] : TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (specificationGen+= specification )? TK_4= ';' ;
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
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1208:1: (TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (specificationGen+= specification )? TK_4= ';' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1208:3: TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (specificationGen+= specification )? TK_4= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_database920); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1208:17: (TK_1= 'DATABASE' | TK_2= 'SCHEMA' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==52) ) {
                alt39=1;
            }
            else if ( (LA39_0==53) ) {
                alt39=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1208:17: (TK_1= 'DATABASE' | TK_2= 'SCHEMA' )", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1208:18: TK_1= 'DATABASE'
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_database925); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1208:36: TK_2= 'SCHEMA'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_database931); if (failed) return retval;

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1208:51: (TK_3= 'IF NOT EXISTS' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==54) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1208:52: TK_3= 'IF NOT EXISTS'
                    {
                    TK_3=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_database937); if (failed) return retval;

                    }
                    break;

            }

            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_database943); if (failed) return retval;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1208:84: (specificationGen+= specification )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38||LA41_0==55||LA41_0==57) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1208:85: specificationGen+= specification
                    {
                    pushFollow(FOLLOW_specification_in_database948);
                    specificationGen=specification();
                    _fsp--;
                    if (failed) return retval;
                    if (list_specificationGen==null) list_specificationGen=new ArrayList();
                    list_specificationGen.add(specificationGen);


                    }
                    break;

            }

            TK_4=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_database954); if (failed) return retval;
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1282:1: specification returns [Node returnNode] : ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID );
    public final specification_return specification() throws RecognitionException {
        specification_return retval = new specification_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token COMPARATORGen=null;
        Token IDGen=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1283:1: ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID )
            int alt46=2;
            switch ( input.LA(1) ) {
            case 38:
                {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==55) ) {
                    alt46=1;
                }
                else if ( (LA46_1==57) ) {
                    alt46=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1282:1: specification returns [Node returnNode] : ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID );", 46, 1, input);

                    throw nvae;
                }
                }
                break;
            case 55:
                {
                alt46=1;
                }
                break;
            case 57:
                {
                alt46=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1282:1: specification returns [Node returnNode] : ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID );", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1283:3: (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID
                    {
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1283:3: (TK_0= 'DEFAULT' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==38) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1283:4: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_specification976); if (failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_specification982); if (failed) return retval;
                    TK_2=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_specification986); if (failed) return retval;
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1283:49: (COMPARATORGen= COMPARATOR )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==COMPARATOR) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1283:50: COMPARATORGen= COMPARATOR
                            {
                            COMPARATORGen=(Token)input.LT(1);
                            match(input,COMPARATOR,FOLLOW_COMPARATOR_in_specification991); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_specification997); if (failed) return retval;
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
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1336:6: (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID
                    {
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1336:6: (TK_0= 'DEFAULT' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==38) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1336:7: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_specification1011); if (failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)input.LT(1);
                    match(input,57,FOLLOW_57_in_specification1017); if (failed) return retval;
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1336:39: (COMPARATORGen= COMPARATOR )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==COMPARATOR) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1336:40: COMPARATORGen= COMPARATOR
                            {
                            COMPARATORGen=(Token)input.LT(1);
                            match(input,COMPARATOR,FOLLOW_COMPARATOR_in_specification1022); if (failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_specification1028); if (failed) return retval;
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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1382:1: log_expresion returns [Node returnNode] : column_ckGen+= column_ck (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' ) ;
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
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1383:1: (column_ckGen+= column_ck (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' ) )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1383:3: column_ckGen+= column_ck (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' )
            {
            pushFollow(FOLLOW_column_ck_in_log_expresion1051);
            column_ckGen=column_ck();
            _fsp--;
            if (failed) return retval;
            if (list_column_ckGen==null) list_column_ckGen=new ArrayList();
            list_column_ckGen.add(column_ckGen);

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1383:27: (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==COMPARATOR) ) {
                alt50=1;
            }
            else if ( (LA50_0==58) ) {
                alt50=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1383:27: (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1383:28: COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )?
                    {
                    COMPARATORGen=(Token)input.LT(1);
                    match(input,COMPARATOR,FOLLOW_COMPARATOR_in_log_expresion1056); if (failed) return retval;
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1383:53: (NUMBERGen= NUMBER | CVALUEGen= CVALUE )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==NUMBER) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==CVALUE) ) {
                        alt47=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1383:53: (NUMBERGen= NUMBER | CVALUEGen= CVALUE )", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1383:54: NUMBERGen= NUMBER
                            {
                            NUMBERGen=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_log_expresion1061); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1383:73: CVALUEGen= CVALUE
                            {
                            CVALUEGen=(Token)input.LT(1);
                            match(input,CVALUE,FOLLOW_CVALUE_in_log_expresion1067); if (failed) return retval;

                            }
                            break;

                    }

                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1383:102: (LOG_CONJGen= LOG_CONJ )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==LOG_CONJ) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:0:0: LOG_CONJGen= LOG_CONJ
                            {
                            LOG_CONJGen=(Token)input.LT(1);
                            match(input,LOG_CONJ,FOLLOW_LOG_CONJ_in_log_expresion1072); if (failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1383:115: TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')'
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,58,FOLLOW_58_in_log_expresion1079); if (failed) return retval;
                    TK_1=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_log_expresion1083); if (failed) return retval;
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1383:134: (value_listGen+= value_list )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==CVALUE) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1383:135: value_listGen+= value_list
                    	    {
                    	    pushFollow(FOLLOW_value_list_in_log_expresion1088);
                    	    value_listGen=value_list();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if (list_value_listGen==null) list_value_listGen=new ArrayList();
                    	    list_value_listGen.add(value_listGen);


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    TK_2=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_log_expresion1094); if (failed) return retval;

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
    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1476:1: type returns [Node returnNode] : (EXACTOGen= EXACTO | APROXIMADOGen= APROXIMADO | CHARACTERSGen= CHARACTERS | BITSGen= BITS | TIMESGen= TIMES | INTERVALSGen= INTERVALS | BINARIESGen= BINARIES ) ;
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
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1477:1: ( (EXACTOGen= EXACTO | APROXIMADOGen= APROXIMADO | CHARACTERSGen= CHARACTERS | BITSGen= BITS | TIMESGen= TIMES | INTERVALSGen= INTERVALS | BINARIESGen= BINARIES ) )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1477:3: (EXACTOGen= EXACTO | APROXIMADOGen= APROXIMADO | CHARACTERSGen= CHARACTERS | BITSGen= BITS | TIMESGen= TIMES | INTERVALSGen= INTERVALS | BINARIESGen= BINARIES )
            {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1477:3: (EXACTOGen= EXACTO | APROXIMADOGen= APROXIMADO | CHARACTERSGen= CHARACTERS | BITSGen= BITS | TIMESGen= TIMES | INTERVALSGen= INTERVALS | BINARIESGen= BINARIES )
            int alt51=7;
            switch ( input.LA(1) ) {
            case EXACTO:
                {
                alt51=1;
                }
                break;
            case APROXIMADO:
                {
                alt51=2;
                }
                break;
            case CHARACTERS:
                {
                alt51=3;
                }
                break;
            case BITS:
                {
                alt51=4;
                }
                break;
            case TIMES:
                {
                alt51=5;
                }
                break;
            case INTERVALS:
                {
                alt51=6;
                }
                break;
            case BINARIES:
                {
                alt51=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1477:3: (EXACTOGen= EXACTO | APROXIMADOGen= APROXIMADO | CHARACTERSGen= CHARACTERS | BITSGen= BITS | TIMESGen= TIMES | INTERVALSGen= INTERVALS | BINARIESGen= BINARIES )", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1477:4: EXACTOGen= EXACTO
                    {
                    EXACTOGen=(Token)input.LT(1);
                    match(input,EXACTO,FOLLOW_EXACTO_in_type1117); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1477:23: APROXIMADOGen= APROXIMADO
                    {
                    APROXIMADOGen=(Token)input.LT(1);
                    match(input,APROXIMADO,FOLLOW_APROXIMADO_in_type1123); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1477:50: CHARACTERSGen= CHARACTERS
                    {
                    CHARACTERSGen=(Token)input.LT(1);
                    match(input,CHARACTERS,FOLLOW_CHARACTERS_in_type1129); if (failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1477:77: BITSGen= BITS
                    {
                    BITSGen=(Token)input.LT(1);
                    match(input,BITS,FOLLOW_BITS_in_type1135); if (failed) return retval;

                    }
                    break;
                case 5 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1477:92: TIMESGen= TIMES
                    {
                    TIMESGen=(Token)input.LT(1);
                    match(input,TIMES,FOLLOW_TIMES_in_type1141); if (failed) return retval;

                    }
                    break;
                case 6 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1477:109: INTERVALSGen= INTERVALS
                    {
                    INTERVALSGen=(Token)input.LT(1);
                    match(input,INTERVALS,FOLLOW_INTERVALS_in_type1147); if (failed) return retval;

                    }
                    break;
                case 7 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1477:134: BINARIESGen= BINARIES
                    {
                    BINARIESGen=(Token)input.LT(1);
                    match(input,BINARIES,FOLLOW_BINARIES_in_type1153); if (failed) return retval;

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

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:109: ( ',' )
        // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:109: ','
        {
        match(input,24,FOLLOW_24_in_synpred8173); if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:132: ( ',' )
        // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:133:132: ','
        {
        match(input,24,FOLLOW_24_in_synpred9185); if (failed) return ;

        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred28
    public final void synpred28_fragment() throws RecognitionException {   
        // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:229: ( ',' )
        // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:403:229: ','
        {
        match(input,24,FOLLOW_24_in_synpred28396); if (failed) return ;

        }
    }
    // $ANTLR end synpred28

    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred28() {
        backtracking++;
        int start = input.mark();
        try {
            synpred28_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_20_in_table138 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_LOG_CONJ_in_table143 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_table147 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_table153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_table157 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_table161 = new BitSet(new long[]{0x0000000803000020L});
    public static final BitSet FOLLOW_column_in_table166 = new BitSet(new long[]{0x0000000803000020L});
    public static final BitSet FOLLOW_24_in_table173 = new BitSet(new long[]{0x0000000803000000L});
    public static final BitSet FOLLOW_ck_in_table180 = new BitSet(new long[]{0x0000000803000000L});
    public static final BitSet FOLLOW_24_in_table185 = new BitSet(new long[]{0x0000000803000000L});
    public static final BitSet FOLLOW_pk_in_table194 = new BitSet(new long[]{0x0000000803000000L});
    public static final BitSet FOLLOW_24_in_table201 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_fk_in_table208 = new BitSet(new long[]{0x0000000803000000L});
    public static final BitSet FOLLOW_24_in_table213 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_25_in_table221 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_26_in_table226 = new BitSet(new long[]{0x00000000F8000000L});
    public static final BitSet FOLLOW_27_in_table233 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_28_in_table240 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_29_in_table247 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_table254 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_table259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_comment_table281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_comment_table285 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_comment_table289 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CVALUE_in_comment_table293 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_comment_table297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column318 = new BitSet(new long[]{0x000000000000FE00L});
    public static final BitSet FOLLOW_type_in_column322 = new BitSet(new long[]{0x0000007801800022L});
    public static final BitSet FOLLOW_23_in_column327 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_column331 = new BitSet(new long[]{0x0000000403000000L});
    public static final BitSet FOLLOW_34_in_column336 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_column344 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_column348 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_column355 = new BitSet(new long[]{0x0000007801000022L});
    public static final BitSet FOLLOW_35_in_column362 = new BitSet(new long[]{0x0000007001000022L});
    public static final BitSet FOLLOW_name_constraint_in_column369 = new BitSet(new long[]{0x0000007001000002L});
    public static final BitSet FOLLOW_36_in_column376 = new BitSet(new long[]{0x0000004001000002L});
    public static final BitSet FOLLOW_37_in_column382 = new BitSet(new long[]{0x0000004001000002L});
    public static final BitSet FOLLOW_defecto_in_column389 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_column396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_defecto419 = new BitSet(new long[]{0x00000030000000C0L});
    public static final BitSet FOLLOW_36_in_defecto424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_defecto430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_defecto436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CVALUE_in_defecto442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_comment_column464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_references_in_comment_column469 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_comment_column473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_comment_column477 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_comment_column481 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CVALUE_in_comment_column486 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_comment_column490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_disabled_constraint511 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_references_in_disabled_constraint515 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_disabled_constraint519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_name_constraint_in_disabled_constraint523 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_disabled_constraint527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ck548 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_ck552 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ck556 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ck560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_log_expresion_in_ck565 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ck571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_fk593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_fk597 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_fk601 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_fk605 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_column_list_in_fk610 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_fk616 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_fk620 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_schema_references_in_fk625 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_40_in_fk632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_references_in_fk638 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_fk642 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_references_column_list_in_fk647 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_fk653 = new BitSet(new long[]{0x0007C00000000002L});
    public static final BitSet FOLLOW_46_in_fk658 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_47_in_fk665 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_48_in_fk671 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_fk678 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_fk685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_pk708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_pk712 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_pk716 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_pk720 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_column_list_in_pk725 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_pk731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_ck752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_schema_references773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table_references794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name_constraint815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_references_column_list836 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_references_column_list841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CVALUE_in_value_list864 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_value_list869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_list892 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_column_list897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_database920 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_database925 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_53_in_database931 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_54_in_database937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_database943 = new BitSet(new long[]{0x0280004080000000L});
    public static final BitSet FOLLOW_specification_in_database948 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_database954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_specification976 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_specification982 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_specification986 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_COMPARATOR_in_specification991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_specification997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_specification1011 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_specification1017 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_COMPARATOR_in_specification1022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_specification1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_ck_in_log_expresion1051 = new BitSet(new long[]{0x0400000000000100L});
    public static final BitSet FOLLOW_COMPARATOR_in_log_expresion1056 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_NUMBER_in_log_expresion1061 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CVALUE_in_log_expresion1067 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_LOG_CONJ_in_log_expresion1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_log_expresion1079 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_log_expresion1083 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_value_list_in_log_expresion1088 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_25_in_log_expresion1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTO_in_type1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APROXIMADO_in_type1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTERS_in_type1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITS_in_type1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_type1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERVALS_in_type1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARIES_in_type1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred9185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred28396 = new BitSet(new long[]{0x0000000000000002L});

}