// $ANTLR 3.2 Sep 23, 2009 12:02:23 DDL.g 2014-03-21 11:00:08

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "CVALUE", "TYPE", "NUMBER", "WS", "ML_COMMENT", "OL_COMMENT", "'CREATE'", "'OR REPLACE'", "'TABLE'", "'('", "','", "')'", "'LOGGING'", "'NOCOMPRESS'", "'NOCACHE'", "'NOPARALLEL'", "'MONITORING'", "';'", "'COMMENT ON TABLE'", "'IS'", "'BYTE'", "'CONSTRAINT'", "'NULL'", "'NOT NULL'", "'DEFAULT'", "'COMMENT ON COLUMN'", "'\\.'", "'CHECK'", "'IN'", "'FOREIGN'", "'KEY'", "'REFERENCES'", "'ON'", "'DELETE'", "'UPDATE'", "'CASCADE'", "'DISABLE'", "'PRIMARY KEY'", "'DATABASE'", "'SCHEMA'", "'IF NOT EXISTS'", "'CHARACTER'", "'SET'", "'='", "'COLLATE'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int TYPE=6;
    public static final int ML_COMMENT=9;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=7;
    public static final int OL_COMMENT=10;
    public static final int CVALUE=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;

    // delegates
    // delegators


        public DDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
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

    public String[] getTokenNames() { return DDLParser.tokenNames; }
    public String getGrammarFileName() { return "DDL.g"; }


    public static class data_definition_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "data_definition"
    // DDL.g:18:1: data_definition returns [Node returnNode] : (data_definition_statementGen+= data_definition_statement )* ;
    public final DDLParser.data_definition_return data_definition() throws RecognitionException {
        DDLParser.data_definition_return retval = new DDLParser.data_definition_return();
        retval.start = input.LT(1);

        List list_data_definition_statementGen=null;
        RuleReturnScope data_definition_statementGen = null;
        try {
            // DDL.g:19:1: ( (data_definition_statementGen+= data_definition_statement )* )
            // DDL.g:19:4: (data_definition_statementGen+= data_definition_statement )*
            {
            // DDL.g:19:4: (data_definition_statementGen+= data_definition_statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==23||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // DDL.g:19:6: data_definition_statementGen+= data_definition_statement
            	    {
            	    pushFollow(FOLLOW_data_definition_statement_in_data_definition49);
            	    data_definition_statementGen=data_definition_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_data_definition_statementGen==null) list_data_definition_statementGen=new ArrayList();
            	    list_data_definition_statementGen.add(data_definition_statementGen);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

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
    // $ANTLR end "data_definition"

    public static class data_definition_statement_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "data_definition_statement"
    // DDL.g:39:1: data_definition_statement returns [Node returnNode] : (create_databaseGen+= create_database | create_tableGen+= create_table | create_comment_tableGen+= create_comment_table | create_comment_columnGen+= create_comment_column );
    public final DDLParser.data_definition_statement_return data_definition_statement() throws RecognitionException {
        DDLParser.data_definition_statement_return retval = new DDLParser.data_definition_statement_return();
        retval.start = input.LT(1);

        List list_create_databaseGen=null;
        List list_create_tableGen=null;
        List list_create_comment_tableGen=null;
        List list_create_comment_columnGen=null;
        RuleReturnScope create_databaseGen = null;
        RuleReturnScope create_tableGen = null;
        RuleReturnScope create_comment_tableGen = null;
        RuleReturnScope create_comment_columnGen = null;
        try {
            // DDL.g:40:1: (create_databaseGen+= create_database | create_tableGen+= create_table | create_comment_tableGen+= create_comment_table | create_comment_columnGen+= create_comment_column )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=12 && LA2_1<=13)) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=43 && LA2_1<=44)) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // DDL.g:40:5: create_databaseGen+= create_database
                    {
                    pushFollow(FOLLOW_create_database_in_data_definition_statement75);
                    create_databaseGen=create_database();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_create_databaseGen==null) list_create_databaseGen=new ArrayList();
                    list_create_databaseGen.add(create_databaseGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_create_databaseGen != null) {
                      	        for(Iterator it = list_create_databaseGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.create_database_return r = (DDLParser.create_database_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("create_database");
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
                    // DDL.g:58:5: create_tableGen+= create_table
                    {
                    pushFollow(FOLLOW_create_table_in_data_definition_statement87);
                    create_tableGen=create_table();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_create_tableGen==null) list_create_tableGen=new ArrayList();
                    list_create_tableGen.add(create_tableGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_create_tableGen != null) {
                      	        for(Iterator it = list_create_tableGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.create_table_return r = (DDLParser.create_table_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("create_table");
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
                    // DDL.g:76:5: create_comment_tableGen+= create_comment_table
                    {
                    pushFollow(FOLLOW_create_comment_table_in_data_definition_statement99);
                    create_comment_tableGen=create_comment_table();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_create_comment_tableGen==null) list_create_comment_tableGen=new ArrayList();
                    list_create_comment_tableGen.add(create_comment_tableGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_create_comment_tableGen != null) {
                      	        for(Iterator it = list_create_comment_tableGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.create_comment_table_return r = (DDLParser.create_comment_table_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("create_comment_table");
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
                    // DDL.g:94:5: create_comment_columnGen+= create_comment_column
                    {
                    pushFollow(FOLLOW_create_comment_column_in_data_definition_statement111);
                    create_comment_columnGen=create_comment_column();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_create_comment_columnGen==null) list_create_comment_columnGen=new ArrayList();
                    list_create_comment_columnGen.add(create_comment_columnGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_create_comment_columnGen != null) {
                      	        for(Iterator it = list_create_comment_columnGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.create_comment_column_return r = (DDLParser.create_comment_column_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("create_comment_column");
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
    // $ANTLR end "data_definition_statement"

    public static class create_table_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "create_table"
    // DDL.g:114:1: create_table returns [Node returnNode] : TK_0= 'CREATE' (TK_1= 'OR REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (create_columnGen+= create_column )* (TK_4= ',' )? (create_pkGen+= create_pk )? (TK_5= ',' )? (create_fkGen+= create_fk (TK_6= ',' )? )* (create_ckGen+= create_ck (TK_7= ',' )? )* TK_8= ')' (TK_9= 'LOGGING' )? (TK_10= 'NOCOMPRESS' )? (TK_11= 'NOCACHE' )? (TK_12= 'NOPARALLEL' )? (TK_13= 'MONITORING' )? TK_14= ';' ;
    public final DDLParser.create_table_return create_table() throws RecognitionException {
        DDLParser.create_table_return retval = new DDLParser.create_table_return();
        retval.start = input.LT(1);

        Token TK_0=null;
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
        List list_create_columnGen=null;
        List list_create_pkGen=null;
        List list_create_fkGen=null;
        List list_create_ckGen=null;
        RuleReturnScope create_columnGen = null;
        RuleReturnScope create_pkGen = null;
        RuleReturnScope create_fkGen = null;
        RuleReturnScope create_ckGen = null;
        try {
            // DDL.g:115:1: (TK_0= 'CREATE' (TK_1= 'OR REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (create_columnGen+= create_column )* (TK_4= ',' )? (create_pkGen+= create_pk )? (TK_5= ',' )? (create_fkGen+= create_fk (TK_6= ',' )? )* (create_ckGen+= create_ck (TK_7= ',' )? )* TK_8= ')' (TK_9= 'LOGGING' )? (TK_10= 'NOCOMPRESS' )? (TK_11= 'NOCACHE' )? (TK_12= 'NOPARALLEL' )? (TK_13= 'MONITORING' )? TK_14= ';' )
            // DDL.g:115:4: TK_0= 'CREATE' (TK_1= 'OR REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (create_columnGen+= create_column )* (TK_4= ',' )? (create_pkGen+= create_pk )? (TK_5= ',' )? (create_fkGen+= create_fk (TK_6= ',' )? )* (create_ckGen+= create_ck (TK_7= ',' )? )* TK_8= ')' (TK_9= 'LOGGING' )? (TK_10= 'NOCOMPRESS' )? (TK_11= 'NOCACHE' )? (TK_12= 'NOPARALLEL' )? (TK_13= 'MONITORING' )? TK_14= ';'
            {
            TK_0=(Token)match(input,11,FOLLOW_11_in_create_table135); if (state.failed) return retval;
            // DDL.g:115:18: (TK_1= 'OR REPLACE' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // DDL.g:115:20: TK_1= 'OR REPLACE'
                    {
                    TK_1=(Token)match(input,12,FOLLOW_12_in_create_table141); if (state.failed) return retval;

                    }
                    break;

            }

            TK_2=(Token)match(input,13,FOLLOW_13_in_create_table148); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_create_table153); if (state.failed) return retval;
            TK_3=(Token)match(input,14,FOLLOW_14_in_create_table158); if (state.failed) return retval;
            // DDL.g:115:74: (create_columnGen+= create_column )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // DDL.g:115:76: create_columnGen+= create_column
            	    {
            	    pushFollow(FOLLOW_create_column_in_create_table164);
            	    create_columnGen=create_column();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_create_columnGen==null) list_create_columnGen=new ArrayList();
            	    list_create_columnGen.add(create_columnGen);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // DDL.g:115:110: (TK_4= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred7_DDL()) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // DDL.g:115:112: TK_4= ','
                    {
                    TK_4=(Token)match(input,15,FOLLOW_15_in_create_table172); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:115:124: (create_pkGen+= create_pk )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ID) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==42) ) {
                        alt6=1;
                    }
                }
            }
            switch (alt6) {
                case 1 :
                    // DDL.g:115:126: create_pkGen+= create_pk
                    {
                    pushFollow(FOLLOW_create_pk_in_create_table181);
                    create_pkGen=create_pk();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_create_pkGen==null) list_create_pkGen=new ArrayList();
                    list_create_pkGen.add(create_pkGen);


                    }
                    break;

            }

            // DDL.g:115:152: (TK_5= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // DDL.g:115:154: TK_5= ','
                    {
                    TK_5=(Token)match(input,15,FOLLOW_15_in_create_table189); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:115:166: (create_fkGen+= create_fk (TK_6= ',' )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==ID) ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==34) ) {
                            alt9=1;
                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // DDL.g:115:168: create_fkGen+= create_fk (TK_6= ',' )?
            	    {
            	    pushFollow(FOLLOW_create_fk_in_create_table198);
            	    create_fkGen=create_fk();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_create_fkGen==null) list_create_fkGen=new ArrayList();
            	    list_create_fkGen.add(create_fkGen);

            	    // DDL.g:115:192: (TK_6= ',' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==15) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // DDL.g:115:194: TK_6= ','
            	            {
            	            TK_6=(Token)match(input,15,FOLLOW_15_in_create_table204); if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // DDL.g:115:206: (create_ckGen+= create_ck (TK_7= ',' )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // DDL.g:115:208: create_ckGen+= create_ck (TK_7= ',' )?
            	    {
            	    pushFollow(FOLLOW_create_ck_in_create_table213);
            	    create_ckGen=create_ck();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_create_ckGen==null) list_create_ckGen=new ArrayList();
            	    list_create_ckGen.add(create_ckGen);

            	    // DDL.g:115:232: (TK_7= ',' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==15) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // DDL.g:115:234: TK_7= ','
            	            {
            	            TK_7=(Token)match(input,15,FOLLOW_15_in_create_table219); if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            TK_8=(Token)match(input,16,FOLLOW_16_in_create_table231); if (state.failed) return retval;
            // DDL.g:115:260: (TK_9= 'LOGGING' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // DDL.g:115:262: TK_9= 'LOGGING'
                    {
                    TK_9=(Token)match(input,17,FOLLOW_17_in_create_table237); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:115:279: (TK_10= 'NOCOMPRESS' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // DDL.g:115:281: TK_10= 'NOCOMPRESS'
                    {
                    TK_10=(Token)match(input,18,FOLLOW_18_in_create_table245); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:115:302: (TK_11= 'NOCACHE' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // DDL.g:115:304: TK_11= 'NOCACHE'
                    {
                    TK_11=(Token)match(input,19,FOLLOW_19_in_create_table253); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:115:322: (TK_12= 'NOPARALLEL' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // DDL.g:115:324: TK_12= 'NOPARALLEL'
                    {
                    TK_12=(Token)match(input,20,FOLLOW_20_in_create_table261); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:115:345: (TK_13= 'MONITORING' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // DDL.g:115:347: TK_13= 'MONITORING'
                    {
                    TK_13=(Token)match(input,21,FOLLOW_21_in_create_table269); if (state.failed) return retval;

                    }
                    break;

            }

            TK_14=(Token)match(input,22,FOLLOW_22_in_create_table275); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node create_tableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		create_tableReturnNode.setKind("create_table");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			create_tableReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_create_columnGen != null) {
              	        for(Iterator it = list_create_columnGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.create_column_return r = (DDLParser.create_column_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("create_column");
              	            	create_tableReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_create_pkGen != null) {
              	        for(Iterator it = list_create_pkGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.create_pk_return r = (DDLParser.create_pk_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("create_pk");
              	            	create_tableReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_5!=null?TK_5.getText():null), TK_5.getCharPositionInLine(), TK_5.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_5Leaf);
              	 	}

              		// Create a special CST Node for terminal create_fkGen aggregation
              		if(list_create_fkGen != null) {
              	    for(int pos = 0; pos < list_create_fkGen.size(); pos++ )  { 
              		// No Terminal extractor
              	    if(list_create_fkGen != null) {		
              	    	DDLParser.create_fk_return r = (DDLParser.create_fk_return) list_create_fkGen.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("create_fk");
              	    		create_tableReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_6!=null?TK_6.getText():null), TK_6.getCharPositionInLine(), TK_6.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              		}
              		}


              		// Create a special CST Node for terminal create_ckGen aggregation
              		if(list_create_ckGen != null) {
              	    for(int pos = 0; pos < list_create_ckGen.size(); pos++ )  { 
              		// No Terminal extractor
              	    if(list_create_ckGen != null) {		
              	    	DDLParser.create_ck_return r = (DDLParser.create_ck_return) list_create_ckGen.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("create_ck");
              	    		create_tableReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_7!=null?TK_7.getText():null), TK_7.getCharPositionInLine(), TK_7.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              		}
              		}

              	    // Create a Token CST Leaf	
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_8!=null?TK_8.getText():null), TK_8.getCharPositionInLine(), TK_8.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_9 != null) {
              			Leaf TK_9Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_9!=null?TK_9.getText():null), TK_9.getCharPositionInLine(), TK_9.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_9Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_10 != null) {
              			Leaf TK_10Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_10!=null?TK_10.getText():null), TK_10.getCharPositionInLine(), TK_10.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_10Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_11 != null) {
              			Leaf TK_11Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_11!=null?TK_11.getText():null), TK_11.getCharPositionInLine(), TK_11.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_11Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_12 != null) {
              			Leaf TK_12Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_12!=null?TK_12.getText():null), TK_12.getCharPositionInLine(), TK_12.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_12Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_13 != null) {
              			Leaf TK_13Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_13!=null?TK_13.getText():null), TK_13.getCharPositionInLine(), TK_13.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_13Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_14 != null) {
              			Leaf TK_14Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_14!=null?TK_14.getText():null), TK_14.getCharPositionInLine(), TK_14.getLine());
              	 		create_tableReturnNode.getChildren().add(TK_14Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = create_tableReturnNode;
              	
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
    // $ANTLR end "create_table"

    public static class create_comment_table_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "create_comment_table"
    // DDL.g:255:1: create_comment_table returns [Node returnNode] : TK_0= 'COMMENT ON TABLE' IDGen= ID TK_1= 'IS' CVALUEGen= CVALUE TK_2= ';' ;
    public final DDLParser.create_comment_table_return create_comment_table() throws RecognitionException {
        DDLParser.create_comment_table_return retval = new DDLParser.create_comment_table_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token CVALUEGen=null;
        Token TK_2=null;

        try {
            // DDL.g:256:1: (TK_0= 'COMMENT ON TABLE' IDGen= ID TK_1= 'IS' CVALUEGen= CVALUE TK_2= ';' )
            // DDL.g:256:4: TK_0= 'COMMENT ON TABLE' IDGen= ID TK_1= 'IS' CVALUEGen= CVALUE TK_2= ';'
            {
            TK_0=(Token)match(input,23,FOLLOW_23_in_create_comment_table298); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_create_comment_table303); if (state.failed) return retval;
            TK_1=(Token)match(input,24,FOLLOW_24_in_create_comment_table308); if (state.failed) return retval;
            CVALUEGen=(Token)match(input,CVALUE,FOLLOW_CVALUE_in_create_comment_table313); if (state.failed) return retval;
            TK_2=(Token)match(input,22,FOLLOW_22_in_create_comment_table318); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node create_comment_tableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		create_comment_tableReturnNode.setKind("create_comment_table");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		create_comment_tableReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			create_comment_tableReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		create_comment_tableReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(CVALUEGen != null) {
              			Leaf CVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("CVALUE", (CVALUEGen!=null?CVALUEGen.getText():null), CVALUEGen.getCharPositionInLine(), CVALUEGen.getLine());
              			create_comment_tableReturnNode.getChildren().add(CVALUEGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		create_comment_tableReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = create_comment_tableReturnNode;
              	
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
    // $ANTLR end "create_comment_table"

    public static class create_column_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "create_column"
    // DDL.g:291:1: create_column returns [Node returnNode] : IDGen= ID TYPEGen= TYPE (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_5= 'NULL' | TK_6= 'NOT NULL' )? (defectoGen+= defecto )? (TK_7= ',' )? ;
    public final DDLParser.create_column_return create_column() throws RecognitionException {
        DDLParser.create_column_return retval = new DDLParser.create_column_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TYPEGen=null;
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
        List list_name_constraintGen=null;
        List list_defectoGen=null;
        RuleReturnScope name_constraintGen = null;
        RuleReturnScope defectoGen = null;
        try {
            // DDL.g:292:1: (IDGen= ID TYPEGen= TYPE (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_5= 'NULL' | TK_6= 'NOT NULL' )? (defectoGen+= defecto )? (TK_7= ',' )? )
            // DDL.g:292:4: IDGen= ID TYPEGen= TYPE (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? (TK_4= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_5= 'NULL' | TK_6= 'NOT NULL' )? (defectoGen+= defecto )? (TK_7= ',' )?
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_create_column340); if (state.failed) return retval;
            TYPEGen=(Token)match(input,TYPE,FOLLOW_TYPE_in_create_column345); if (state.failed) return retval;
            // DDL.g:292:27: (TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // DDL.g:292:29: TK_0= '(' NUMBERGen= NUMBER (TK_1= 'BYTE' )? (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')'
                    {
                    TK_0=(Token)match(input,14,FOLLOW_14_in_create_column351); if (state.failed) return retval;
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_create_column356); if (state.failed) return retval;
                    // DDL.g:292:56: (TK_1= 'BYTE' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==25) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // DDL.g:292:58: TK_1= 'BYTE'
                            {
                            TK_1=(Token)match(input,25,FOLLOW_25_in_create_column362); if (state.failed) return retval;

                            }
                            break;

                    }

                    // DDL.g:292:72: (TK_2= ',' NUMBERGen_1= NUMBER )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==15) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // DDL.g:292:75: TK_2= ',' NUMBERGen_1= NUMBER
                            {
                            TK_2=(Token)match(input,15,FOLLOW_15_in_create_column371); if (state.failed) return retval;
                            NUMBERGen_1=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_create_column376); if (state.failed) return retval;

                            }
                            break;

                    }

                    TK_3=(Token)match(input,16,FOLLOW_16_in_create_column384); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:292:119: (TK_4= 'CONSTRAINT' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==ID) ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==EOF||LA20_3==ID||LA20_3==TYPE||(LA20_3>=15 && LA20_3<=16)||(LA20_3>=26 && LA20_3<=29)) ) {
                        alt20=1;
                    }
                }
                else if ( (LA20_1==EOF||(LA20_1>=15 && LA20_1<=16)||(LA20_1>=26 && LA20_1<=29)) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // DDL.g:292:121: TK_4= 'CONSTRAINT'
                    {
                    TK_4=(Token)match(input,26,FOLLOW_26_in_create_column392); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:292:141: (name_constraintGen+= name_constraint )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EOF||LA21_1==ID||(LA21_1>=15 && LA21_1<=16)||(LA21_1>=26 && LA21_1<=29)) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // DDL.g:292:143: name_constraintGen+= name_constraint
                    {
                    pushFollow(FOLLOW_name_constraint_in_create_column400);
                    name_constraintGen=name_constraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_name_constraintGen==null) list_name_constraintGen=new ArrayList();
                    list_name_constraintGen.add(name_constraintGen);


                    }
                    break;

            }

            // DDL.g:292:181: (TK_5= 'NULL' | TK_6= 'NOT NULL' )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            else if ( (LA22_0==28) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // DDL.g:292:183: TK_5= 'NULL'
                    {
                    TK_5=(Token)match(input,27,FOLLOW_27_in_create_column408); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // DDL.g:292:198: TK_6= 'NOT NULL'
                    {
                    TK_6=(Token)match(input,28,FOLLOW_28_in_create_column415); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:292:216: (defectoGen+= defecto )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // DDL.g:292:218: defectoGen+= defecto
                    {
                    pushFollow(FOLLOW_defecto_in_create_column423);
                    defectoGen=defecto();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_defectoGen==null) list_defectoGen=new ArrayList();
                    list_defectoGen.add(defectoGen);


                    }
                    break;

            }

            // DDL.g:292:240: (TK_7= ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred27_DDL()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // DDL.g:292:242: TK_7= ','
                    {
                    TK_7=(Token)match(input,15,FOLLOW_15_in_create_column431); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node create_columnReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		create_columnReturnNode.setKind("create_column");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			create_columnReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(TYPEGen != null) {
              			Leaf TYPEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("TYPE", (TYPEGen!=null?TYPEGen.getText():null), TYPEGen.getCharPositionInLine(), TYPEGen.getLine());
              			create_columnReturnNode.getChildren().add(TYPEGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		create_columnReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(NUMBERGen != null) {
              			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
              			create_columnReturnNode.getChildren().add(NUMBERGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		create_columnReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		create_columnReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(NUMBERGen_1 != null) {
              			Leaf NUMBERGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen_1!=null?NUMBERGen_1.getText():null), NUMBERGen_1.getCharPositionInLine(), NUMBERGen_1.getLine());
              			create_columnReturnNode.getChildren().add(NUMBERGen_1Leaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		create_columnReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
              	 		create_columnReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_name_constraintGen != null) {
              	        for(Iterator it = list_name_constraintGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.name_constraint_return r = (DDLParser.name_constraint_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("name_constraint");
              	            	create_columnReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_5!=null?TK_5.getText():null), TK_5.getCharPositionInLine(), TK_5.getLine());
              	 		create_columnReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_6!=null?TK_6.getText():null), TK_6.getCharPositionInLine(), TK_6.getLine());
              	 		create_columnReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_defectoGen != null) {
              	        for(Iterator it = list_defectoGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.defecto_return r = (DDLParser.defecto_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("defecto");
              	            	create_columnReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_7!=null?TK_7.getText():null), TK_7.getCharPositionInLine(), TK_7.getLine());
              	 		create_columnReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = create_columnReturnNode;
              	
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
    // $ANTLR end "create_column"

    public static class defecto_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "defecto"
    // DDL.g:382:1: defecto returns [Node returnNode] : TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE ) ;
    public final DDLParser.defecto_return defecto() throws RecognitionException {
        DDLParser.defecto_return retval = new DDLParser.defecto_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token NUMBERGen=null;
        Token CVALUEGen=null;

        try {
            // DDL.g:383:1: (TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE ) )
            // DDL.g:383:4: TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE )
            {
            TK_0=(Token)match(input,29,FOLLOW_29_in_defecto455); if (state.failed) return retval;
            // DDL.g:383:19: (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt25=1;
                }
                break;
            case 28:
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // DDL.g:383:21: TK_1= 'NULL'
                    {
                    TK_1=(Token)match(input,27,FOLLOW_27_in_defecto461); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // DDL.g:383:36: TK_2= 'NOT NULL'
                    {
                    TK_2=(Token)match(input,28,FOLLOW_28_in_defecto468); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // DDL.g:383:55: NUMBERGen= NUMBER
                    {
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_defecto475); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // DDL.g:383:75: CVALUEGen= CVALUE
                    {
                    CVALUEGen=(Token)match(input,CVALUE,FOLLOW_CVALUE_in_defecto482); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node defectoReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		defectoReturnNode.setKind("defecto");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		defectoReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		defectoReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		defectoReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(NUMBERGen != null) {
              			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
              			defectoReturnNode.getChildren().add(NUMBERGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(CVALUEGen != null) {
              			Leaf CVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("CVALUE", (CVALUEGen!=null?CVALUEGen.getText():null), CVALUEGen.getCharPositionInLine(), CVALUEGen.getLine());
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
    // $ANTLR end "defecto"

    public static class create_comment_column_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "create_comment_column"
    // DDL.g:418:1: create_comment_column returns [Node returnNode] : TK_0= 'COMMENT ON COLUMN' table_referencesGen+= table_references TK_1= '\\.' IDGen= ID TK_2= 'IS' CVALUEGen= CVALUE TK_3= ';' ;
    public final DDLParser.create_comment_column_return create_comment_column() throws RecognitionException {
        DDLParser.create_comment_column_return retval = new DDLParser.create_comment_column_return();
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
            // DDL.g:419:1: (TK_0= 'COMMENT ON COLUMN' table_referencesGen+= table_references TK_1= '\\.' IDGen= ID TK_2= 'IS' CVALUEGen= CVALUE TK_3= ';' )
            // DDL.g:419:4: TK_0= 'COMMENT ON COLUMN' table_referencesGen+= table_references TK_1= '\\.' IDGen= ID TK_2= 'IS' CVALUEGen= CVALUE TK_3= ';'
            {
            TK_0=(Token)match(input,30,FOLLOW_30_in_create_comment_column505); if (state.failed) return retval;
            pushFollow(FOLLOW_table_references_in_create_comment_column511);
            table_referencesGen=table_references();

            state._fsp--;
            if (state.failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_1=(Token)match(input,31,FOLLOW_31_in_create_comment_column516); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_create_comment_column521); if (state.failed) return retval;
            TK_2=(Token)match(input,24,FOLLOW_24_in_create_comment_column526); if (state.failed) return retval;
            CVALUEGen=(Token)match(input,CVALUE,FOLLOW_CVALUE_in_create_comment_column532); if (state.failed) return retval;
            TK_3=(Token)match(input,22,FOLLOW_22_in_create_comment_column537); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node create_comment_columnReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		create_comment_columnReturnNode.setKind("create_comment_column");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		create_comment_columnReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_table_referencesGen != null) {
              	        for(Iterator it = list_table_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.table_references_return r = (DDLParser.table_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("table_references");
              	            	create_comment_columnReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		create_comment_columnReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			create_comment_columnReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		create_comment_columnReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(CVALUEGen != null) {
              			Leaf CVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("CVALUE", (CVALUEGen!=null?CVALUEGen.getText():null), CVALUEGen.getCharPositionInLine(), CVALUEGen.getLine());
              			create_comment_columnReturnNode.getChildren().add(CVALUEGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		create_comment_columnReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = create_comment_columnReturnNode;
              	
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
    // $ANTLR end "create_comment_column"

    public static class create_ck_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "create_ck"
    // DDL.g:469:1: create_ck returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' column_ckGen+= column_ck TK_3= 'IN' TK_4= '(' (value_listGen+= value_list )* TK_5= ')' TK_6= ')' ;
    public final DDLParser.create_ck_return create_ck() throws RecognitionException {
        DDLParser.create_ck_return retval = new DDLParser.create_ck_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        Token TK_5=null;
        Token TK_6=null;
        List list_column_ckGen=null;
        List list_value_listGen=null;
        RuleReturnScope column_ckGen = null;
        RuleReturnScope value_listGen = null;
        try {
            // DDL.g:470:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' column_ckGen+= column_ck TK_3= 'IN' TK_4= '(' (value_listGen+= value_list )* TK_5= ')' TK_6= ')' )
            // DDL.g:470:4: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' column_ckGen+= column_ck TK_3= 'IN' TK_4= '(' (value_listGen+= value_list )* TK_5= ')' TK_6= ')'
            {
            TK_0=(Token)match(input,26,FOLLOW_26_in_create_ck559); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_create_ck564); if (state.failed) return retval;
            TK_1=(Token)match(input,32,FOLLOW_32_in_create_ck569); if (state.failed) return retval;
            TK_2=(Token)match(input,14,FOLLOW_14_in_create_ck574); if (state.failed) return retval;
            pushFollow(FOLLOW_column_ck_in_create_ck579);
            column_ckGen=column_ck();

            state._fsp--;
            if (state.failed) return retval;
            if (list_column_ckGen==null) list_column_ckGen=new ArrayList();
            list_column_ckGen.add(column_ckGen);

            TK_3=(Token)match(input,33,FOLLOW_33_in_create_ck584); if (state.failed) return retval;
            TK_4=(Token)match(input,14,FOLLOW_14_in_create_ck589); if (state.failed) return retval;
            // DDL.g:470:102: (value_listGen+= value_list )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==CVALUE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // DDL.g:470:104: value_listGen+= value_list
            	    {
            	    pushFollow(FOLLOW_value_list_in_create_ck595);
            	    value_listGen=value_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_value_listGen==null) list_value_listGen=new ArrayList();
            	    list_value_listGen.add(value_listGen);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            TK_5=(Token)match(input,16,FOLLOW_16_in_create_ck602); if (state.failed) return retval;
            TK_6=(Token)match(input,16,FOLLOW_16_in_create_ck607); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node create_ckReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		create_ckReturnNode.setKind("create_ck");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		create_ckReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			create_ckReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		create_ckReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		create_ckReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_column_ckGen != null) {
              	        for(Iterator it = list_column_ckGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.column_ck_return r = (DDLParser.column_ck_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("column_ck");
              	            	create_ckReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		create_ckReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
              	 		create_ckReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_value_listGen != null) {
              	        for(Iterator it = list_value_listGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.value_list_return r = (DDLParser.value_list_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("value_list");
              	            	create_ckReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_5!=null?TK_5.getText():null), TK_5.getCharPositionInLine(), TK_5.getLine());
              	 		create_ckReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_6!=null?TK_6.getText():null), TK_6.getCharPositionInLine(), TK_6.getLine());
              	 		create_ckReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = create_ckReturnNode;
              	
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
    // $ANTLR end "create_ck"

    public static class create_fk_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "create_fk"
    // DDL.g:540:1: create_fk returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN' TK_2= 'KEY' TK_3= '(' (column_listGen+= column_list )* TK_4= ')' TK_5= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_6= '\\.' )? table_referencesGen+= table_references TK_7= '(' (references_column_listGen+= references_column_list )* TK_8= ')' (TK_9= 'ON' )? (TK_10= 'DELETE' | TK_11= 'UPDATE' )? (TK_12= 'CASCADE' )? (TK_13= 'DISABLE' )? ;
    public final DDLParser.create_fk_return create_fk() throws RecognitionException {
        DDLParser.create_fk_return retval = new DDLParser.create_fk_return();
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
        Token TK_13=null;
        List list_column_listGen=null;
        List list_schema_referencesGen=null;
        List list_table_referencesGen=null;
        List list_references_column_listGen=null;
        RuleReturnScope column_listGen = null;
        RuleReturnScope schema_referencesGen = null;
        RuleReturnScope table_referencesGen = null;
        RuleReturnScope references_column_listGen = null;
        try {
            // DDL.g:541:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN' TK_2= 'KEY' TK_3= '(' (column_listGen+= column_list )* TK_4= ')' TK_5= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_6= '\\.' )? table_referencesGen+= table_references TK_7= '(' (references_column_listGen+= references_column_list )* TK_8= ')' (TK_9= 'ON' )? (TK_10= 'DELETE' | TK_11= 'UPDATE' )? (TK_12= 'CASCADE' )? (TK_13= 'DISABLE' )? )
            // DDL.g:541:4: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN' TK_2= 'KEY' TK_3= '(' (column_listGen+= column_list )* TK_4= ')' TK_5= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_6= '\\.' )? table_referencesGen+= table_references TK_7= '(' (references_column_listGen+= references_column_list )* TK_8= ')' (TK_9= 'ON' )? (TK_10= 'DELETE' | TK_11= 'UPDATE' )? (TK_12= 'CASCADE' )? (TK_13= 'DISABLE' )?
            {
            TK_0=(Token)match(input,26,FOLLOW_26_in_create_fk630); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_create_fk635); if (state.failed) return retval;
            TK_1=(Token)match(input,34,FOLLOW_34_in_create_fk640); if (state.failed) return retval;
            TK_2=(Token)match(input,35,FOLLOW_35_in_create_fk645); if (state.failed) return retval;
            TK_3=(Token)match(input,14,FOLLOW_14_in_create_fk650); if (state.failed) return retval;
            // DDL.g:541:70: (column_listGen+= column_list )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // DDL.g:541:72: column_listGen+= column_list
            	    {
            	    pushFollow(FOLLOW_column_list_in_create_fk656);
            	    column_listGen=column_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_column_listGen==null) list_column_listGen=new ArrayList();
            	    list_column_listGen.add(column_listGen);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            TK_4=(Token)match(input,16,FOLLOW_16_in_create_fk663); if (state.failed) return retval;
            TK_5=(Token)match(input,36,FOLLOW_36_in_create_fk668); if (state.failed) return retval;
            // DDL.g:541:131: (schema_referencesGen+= schema_references )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==ID||LA28_1==31) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // DDL.g:541:133: schema_referencesGen+= schema_references
                    {
                    pushFollow(FOLLOW_schema_references_in_create_fk674);
                    schema_referencesGen=schema_references();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_schema_referencesGen==null) list_schema_referencesGen=new ArrayList();
                    list_schema_referencesGen.add(schema_referencesGen);


                    }
                    break;

            }

            // DDL.g:541:175: (TK_6= '\\.' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // DDL.g:541:177: TK_6= '\\.'
                    {
                    TK_6=(Token)match(input,31,FOLLOW_31_in_create_fk682); if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_table_references_in_create_fk689);
            table_referencesGen=table_references();

            state._fsp--;
            if (state.failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_7=(Token)match(input,14,FOLLOW_14_in_create_fk694); if (state.failed) return retval;
            // DDL.g:541:238: (references_column_listGen+= references_column_list )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // DDL.g:541:240: references_column_listGen+= references_column_list
            	    {
            	    pushFollow(FOLLOW_references_column_list_in_create_fk700);
            	    references_column_listGen=references_column_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_references_column_listGen==null) list_references_column_listGen=new ArrayList();
            	    list_references_column_listGen.add(references_column_listGen);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            TK_8=(Token)match(input,16,FOLLOW_16_in_create_fk707); if (state.failed) return retval;
            // DDL.g:541:302: (TK_9= 'ON' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // DDL.g:541:304: TK_9= 'ON'
                    {
                    TK_9=(Token)match(input,37,FOLLOW_37_in_create_fk713); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:541:316: (TK_10= 'DELETE' | TK_11= 'UPDATE' )?
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            else if ( (LA32_0==39) ) {
                alt32=2;
            }
            switch (alt32) {
                case 1 :
                    // DDL.g:541:318: TK_10= 'DELETE'
                    {
                    TK_10=(Token)match(input,38,FOLLOW_38_in_create_fk721); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // DDL.g:541:336: TK_11= 'UPDATE'
                    {
                    TK_11=(Token)match(input,39,FOLLOW_39_in_create_fk728); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:541:353: (TK_12= 'CASCADE' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // DDL.g:541:355: TK_12= 'CASCADE'
                    {
                    TK_12=(Token)match(input,40,FOLLOW_40_in_create_fk736); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:541:373: (TK_13= 'DISABLE' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // DDL.g:541:375: TK_13= 'DISABLE'
                    {
                    TK_13=(Token)match(input,41,FOLLOW_41_in_create_fk744); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node create_fkReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		create_fkReturnNode.setKind("create_fk");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			create_fkReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_column_listGen != null) {
              	        for(Iterator it = list_column_listGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.column_list_return r = (DDLParser.column_list_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("column_list");
              	            	create_fkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_5!=null?TK_5.getText():null), TK_5.getCharPositionInLine(), TK_5.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_schema_referencesGen != null) {
              	        for(Iterator it = list_schema_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.schema_references_return r = (DDLParser.schema_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("schema_references");
              	            	create_fkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_6!=null?TK_6.getText():null), TK_6.getCharPositionInLine(), TK_6.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_table_referencesGen != null) {
              	        for(Iterator it = list_table_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.table_references_return r = (DDLParser.table_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("table_references");
              	            	create_fkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_7!=null?TK_7.getText():null), TK_7.getCharPositionInLine(), TK_7.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_references_column_listGen != null) {
              	        for(Iterator it = list_references_column_listGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.references_column_list_return r = (DDLParser.references_column_list_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("references_column_list");
              	            	create_fkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_8!=null?TK_8.getText():null), TK_8.getCharPositionInLine(), TK_8.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_9 != null) {
              			Leaf TK_9Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_9!=null?TK_9.getText():null), TK_9.getCharPositionInLine(), TK_9.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_9Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_10 != null) {
              			Leaf TK_10Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_10!=null?TK_10.getText():null), TK_10.getCharPositionInLine(), TK_10.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_10Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_11 != null) {
              			Leaf TK_11Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_11!=null?TK_11.getText():null), TK_11.getCharPositionInLine(), TK_11.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_11Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_12 != null) {
              			Leaf TK_12Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_12!=null?TK_12.getText():null), TK_12.getCharPositionInLine(), TK_12.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_12Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_13 != null) {
              			Leaf TK_13Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_13!=null?TK_13.getText():null), TK_13.getCharPositionInLine(), TK_13.getLine());
              	 		create_fkReturnNode.getChildren().add(TK_13Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = create_fkReturnNode;
              	
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
    // $ANTLR end "create_fk"

    public static class create_pk_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "create_pk"
    // DDL.g:666:1: create_pk returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' ;
    public final DDLParser.create_pk_return create_pk() throws RecognitionException {
        DDLParser.create_pk_return retval = new DDLParser.create_pk_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_column_listGen=null;
        RuleReturnScope column_listGen = null;
        try {
            // DDL.g:667:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' )
            // DDL.g:667:4: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')'
            {
            TK_0=(Token)match(input,26,FOLLOW_26_in_create_pk768); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_create_pk773); if (state.failed) return retval;
            TK_1=(Token)match(input,42,FOLLOW_42_in_create_pk778); if (state.failed) return retval;
            TK_2=(Token)match(input,14,FOLLOW_14_in_create_pk783); if (state.failed) return retval;
            // DDL.g:667:62: (column_listGen+= column_list )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // DDL.g:667:64: column_listGen+= column_list
            	    {
            	    pushFollow(FOLLOW_column_list_in_create_pk789);
            	    column_listGen=column_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_column_listGen==null) list_column_listGen=new ArrayList();
            	    list_column_listGen.add(column_listGen);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            TK_3=(Token)match(input,16,FOLLOW_16_in_create_pk796); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node create_pkReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		create_pkReturnNode.setKind("create_pk");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		create_pkReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			create_pkReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		create_pkReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		create_pkReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_column_listGen != null) {
              	        for(Iterator it = list_column_listGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.column_list_return r = (DDLParser.column_list_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("column_list");
              	            	create_pkReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		create_pkReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = create_pkReturnNode;
              	
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
    // $ANTLR end "create_pk"

    public static class column_ck_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "column_ck"
    // DDL.g:712:1: column_ck returns [Node returnNode] : IDGen= ID ;
    public final DDLParser.column_ck_return column_ck() throws RecognitionException {
        DDLParser.column_ck_return retval = new DDLParser.column_ck_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // DDL.g:713:1: (IDGen= ID )
            // DDL.g:713:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_column_ck818); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node column_ckReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		column_ckReturnNode.setKind("column_ck");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
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
    // $ANTLR end "column_ck"

    public static class schema_references_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "schema_references"
    // DDL.g:728:1: schema_references returns [Node returnNode] : IDGen= ID ;
    public final DDLParser.schema_references_return schema_references() throws RecognitionException {
        DDLParser.schema_references_return retval = new DDLParser.schema_references_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // DDL.g:729:1: (IDGen= ID )
            // DDL.g:729:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_schema_references840); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node schema_referencesReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		schema_referencesReturnNode.setKind("schema_references");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
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
    // $ANTLR end "schema_references"

    public static class table_references_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "table_references"
    // DDL.g:744:1: table_references returns [Node returnNode] : IDGen= ID ;
    public final DDLParser.table_references_return table_references() throws RecognitionException {
        DDLParser.table_references_return retval = new DDLParser.table_references_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // DDL.g:745:1: (IDGen= ID )
            // DDL.g:745:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_table_references862); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node table_referencesReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		table_referencesReturnNode.setKind("table_references");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
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
    // $ANTLR end "table_references"

    public static class name_constraint_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "name_constraint"
    // DDL.g:760:1: name_constraint returns [Node returnNode] : IDGen= ID ;
    public final DDLParser.name_constraint_return name_constraint() throws RecognitionException {
        DDLParser.name_constraint_return retval = new DDLParser.name_constraint_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // DDL.g:761:1: (IDGen= ID )
            // DDL.g:761:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_name_constraint884); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node name_constraintReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		name_constraintReturnNode.setKind("name_constraint");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
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
    // $ANTLR end "name_constraint"

    public static class references_column_list_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "references_column_list"
    // DDL.g:776:1: references_column_list returns [Node returnNode] : IDGen= ID (TK_0= ',' )? ;
    public final DDLParser.references_column_list_return references_column_list() throws RecognitionException {
        DDLParser.references_column_list_return retval = new DDLParser.references_column_list_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;

        try {
            // DDL.g:777:1: (IDGen= ID (TK_0= ',' )? )
            // DDL.g:777:4: IDGen= ID (TK_0= ',' )?
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_references_column_list906); if (state.failed) return retval;
            // DDL.g:777:13: (TK_0= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==15) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // DDL.g:777:15: TK_0= ','
                    {
                    TK_0=(Token)match(input,15,FOLLOW_15_in_references_column_list912); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node references_column_listReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		references_column_listReturnNode.setKind("references_column_list");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			references_column_listReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
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
    // $ANTLR end "references_column_list"

    public static class value_list_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "value_list"
    // DDL.g:797:1: value_list returns [Node returnNode] : CVALUEGen= CVALUE (TK_0= ',' )? ;
    public final DDLParser.value_list_return value_list() throws RecognitionException {
        DDLParser.value_list_return retval = new DDLParser.value_list_return();
        retval.start = input.LT(1);

        Token CVALUEGen=null;
        Token TK_0=null;

        try {
            // DDL.g:798:1: (CVALUEGen= CVALUE (TK_0= ',' )? )
            // DDL.g:798:4: CVALUEGen= CVALUE (TK_0= ',' )?
            {
            CVALUEGen=(Token)match(input,CVALUE,FOLLOW_CVALUE_in_value_list936); if (state.failed) return retval;
            // DDL.g:798:21: (TK_0= ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // DDL.g:798:23: TK_0= ','
                    {
                    TK_0=(Token)match(input,15,FOLLOW_15_in_value_list942); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node value_listReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		value_listReturnNode.setKind("value_list");
              	    // Create a CST Leaf
              		if(CVALUEGen != null) {
              			Leaf CVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("CVALUE", (CVALUEGen!=null?CVALUEGen.getText():null), CVALUEGen.getCharPositionInLine(), CVALUEGen.getLine());
              			value_listReturnNode.getChildren().add(CVALUEGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
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
    // $ANTLR end "value_list"

    public static class column_list_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "column_list"
    // DDL.g:818:1: column_list returns [Node returnNode] : IDGen= ID (TK_0= ',' )? ;
    public final DDLParser.column_list_return column_list() throws RecognitionException {
        DDLParser.column_list_return retval = new DDLParser.column_list_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;

        try {
            // DDL.g:819:1: (IDGen= ID (TK_0= ',' )? )
            // DDL.g:819:4: IDGen= ID (TK_0= ',' )?
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_column_list966); if (state.failed) return retval;
            // DDL.g:819:13: (TK_0= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==15) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // DDL.g:819:15: TK_0= ','
                    {
                    TK_0=(Token)match(input,15,FOLLOW_15_in_column_list972); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node column_listReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		column_listReturnNode.setKind("column_list");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			column_listReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
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
    // $ANTLR end "column_list"

    public static class create_database_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "create_database"
    // DDL.g:839:1: create_database returns [Node returnNode] : TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (create_specificationGen+= create_specification )? TK_4= ';' ;
    public final DDLParser.create_database_return create_database() throws RecognitionException {
        DDLParser.create_database_return retval = new DDLParser.create_database_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token IDGen=null;
        Token TK_4=null;
        List list_create_specificationGen=null;
        RuleReturnScope create_specificationGen = null;
        try {
            // DDL.g:840:1: (TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (create_specificationGen+= create_specification )? TK_4= ';' )
            // DDL.g:840:4: TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (create_specificationGen+= create_specification )? TK_4= ';'
            {
            TK_0=(Token)match(input,11,FOLLOW_11_in_create_database996); if (state.failed) return retval;
            // DDL.g:840:18: (TK_1= 'DATABASE' | TK_2= 'SCHEMA' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            else if ( (LA39_0==44) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // DDL.g:840:20: TK_1= 'DATABASE'
                    {
                    TK_1=(Token)match(input,43,FOLLOW_43_in_create_database1002); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // DDL.g:840:39: TK_2= 'SCHEMA'
                    {
                    TK_2=(Token)match(input,44,FOLLOW_44_in_create_database1009); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:840:54: (TK_3= 'IF NOT EXISTS' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // DDL.g:840:56: TK_3= 'IF NOT EXISTS'
                    {
                    TK_3=(Token)match(input,45,FOLLOW_45_in_create_database1016); if (state.failed) return retval;

                    }
                    break;

            }

            IDGen=(Token)match(input,ID,FOLLOW_ID_in_create_database1023); if (state.failed) return retval;
            // DDL.g:840:89: (create_specificationGen+= create_specification )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==29||LA41_0==46||LA41_0==49) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // DDL.g:840:91: create_specificationGen+= create_specification
                    {
                    pushFollow(FOLLOW_create_specification_in_create_database1029);
                    create_specificationGen=create_specification();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_create_specificationGen==null) list_create_specificationGen=new ArrayList();
                    list_create_specificationGen.add(create_specificationGen);


                    }
                    break;

            }

            TK_4=(Token)match(input,22,FOLLOW_22_in_create_database1036); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node create_databaseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		create_databaseReturnNode.setKind("create_database");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		create_databaseReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		create_databaseReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		create_databaseReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		create_databaseReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			create_databaseReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Node
              		if(list_create_specificationGen != null) {
              	        for(Iterator it = list_create_specificationGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.create_specification_return r = (DDLParser.create_specification_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("create_specification");
              	            	create_databaseReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
              	 		create_databaseReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = create_databaseReturnNode;
              	
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
    // $ANTLR end "create_database"

    public static class create_specification_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "create_specification"
    // DDL.g:890:1: create_specification returns [Node returnNode] : ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID );
    public final DDLParser.create_specification_return create_specification() throws RecognitionException {
        DDLParser.create_specification_return retval = new DDLParser.create_specification_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token IDGen=null;

        try {
            // DDL.g:891:1: ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID )
            int alt46=2;
            switch ( input.LA(1) ) {
            case 29:
                {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==49) ) {
                    alt46=2;
                }
                else if ( (LA46_1==46) ) {
                    alt46=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt46=1;
                }
                break;
            case 49:
                {
                alt46=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // DDL.g:891:3: (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (TK_3= '=' )? IDGen= ID
                    {
                    // DDL.g:891:3: (TK_0= 'DEFAULT' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==29) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // DDL.g:891:5: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)match(input,29,FOLLOW_29_in_create_specification1059); if (state.failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)match(input,46,FOLLOW_46_in_create_specification1066); if (state.failed) return retval;
                    TK_2=(Token)match(input,47,FOLLOW_47_in_create_specification1071); if (state.failed) return retval;
                    // DDL.g:891:52: (TK_3= '=' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==48) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // DDL.g:891:54: TK_3= '='
                            {
                            TK_3=(Token)match(input,48,FOLLOW_48_in_create_specification1077); if (state.failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_create_specification1084); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node create_specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		create_specificationReturnNode.setKind("create_specification");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                      			create_specificationReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = create_specificationReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:924:6: (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (TK_2= '=' )? IDGen= ID
                    {
                    // DDL.g:924:6: (TK_0= 'DEFAULT' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==29) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // DDL.g:924:8: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)match(input,29,FOLLOW_29_in_create_specification1099); if (state.failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)match(input,49,FOLLOW_49_in_create_specification1106); if (state.failed) return retval;
                    // DDL.g:924:41: (TK_2= '=' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==48) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // DDL.g:924:43: TK_2= '='
                            {
                            TK_2=(Token)match(input,48,FOLLOW_48_in_create_specification1112); if (state.failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_create_specification1119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node create_specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		create_specificationReturnNode.setKind("create_specification");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		create_specificationReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                      			create_specificationReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = create_specificationReturnNode;
                      	
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
    // $ANTLR end "create_specification"

    // $ANTLR start synpred7_DDL
    public final void synpred7_DDL_fragment() throws RecognitionException {   
        Token TK_4=null;

        // DDL.g:115:112: (TK_4= ',' )
        // DDL.g:115:112: TK_4= ','
        {
        TK_4=(Token)match(input,15,FOLLOW_15_in_synpred7_DDL172); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_DDL

    // $ANTLR start synpred27_DDL
    public final void synpred27_DDL_fragment() throws RecognitionException {   
        Token TK_7=null;

        // DDL.g:292:242: (TK_7= ',' )
        // DDL.g:292:242: TK_7= ','
        {
        TK_7=(Token)match(input,15,FOLLOW_15_in_synpred27_DDL431); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_DDL

    // Delegated rules

    public final boolean synpred27_DDL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_DDL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_DDL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_DDL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_data_definition_statement_in_data_definition49 = new BitSet(new long[]{0x0000000040800802L});
    public static final BitSet FOLLOW_create_database_in_data_definition_statement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_in_data_definition_statement87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_comment_table_in_data_definition_statement99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_comment_column_in_data_definition_statement111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_create_table135 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_create_table141 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_create_table148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_table153 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_create_table158 = new BitSet(new long[]{0x0000000004018010L});
    public static final BitSet FOLLOW_create_column_in_create_table164 = new BitSet(new long[]{0x0000000004018010L});
    public static final BitSet FOLLOW_15_in_create_table172 = new BitSet(new long[]{0x0000000004018000L});
    public static final BitSet FOLLOW_create_pk_in_create_table181 = new BitSet(new long[]{0x0000000004018000L});
    public static final BitSet FOLLOW_15_in_create_table189 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_create_fk_in_create_table198 = new BitSet(new long[]{0x0000000004018000L});
    public static final BitSet FOLLOW_15_in_create_table204 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_create_ck_in_create_table213 = new BitSet(new long[]{0x0000000004018000L});
    public static final BitSet FOLLOW_15_in_create_table219 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_create_table231 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_17_in_create_table237 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_18_in_create_table245 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_19_in_create_table253 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_20_in_create_table261 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_create_table269 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_create_table275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_create_comment_table298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_comment_table303 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_create_comment_table308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CVALUE_in_create_comment_table313 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_create_comment_table318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_create_column340 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TYPE_in_create_column345 = new BitSet(new long[]{0x000000003C00C012L});
    public static final BitSet FOLLOW_14_in_create_column351 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_create_column356 = new BitSet(new long[]{0x0000000002018000L});
    public static final BitSet FOLLOW_25_in_create_column362 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_create_column371 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_create_column376 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_create_column384 = new BitSet(new long[]{0x000000003C008012L});
    public static final BitSet FOLLOW_26_in_create_column392 = new BitSet(new long[]{0x0000000038008012L});
    public static final BitSet FOLLOW_name_constraint_in_create_column400 = new BitSet(new long[]{0x0000000038008002L});
    public static final BitSet FOLLOW_27_in_create_column408 = new BitSet(new long[]{0x0000000020008002L});
    public static final BitSet FOLLOW_28_in_create_column415 = new BitSet(new long[]{0x0000000020008002L});
    public static final BitSet FOLLOW_defecto_in_create_column423 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_create_column431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_defecto455 = new BitSet(new long[]{0x00000000180000A0L});
    public static final BitSet FOLLOW_27_in_defecto461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_defecto468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_defecto475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CVALUE_in_defecto482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_create_comment_column505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_table_references_in_create_comment_column511 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_create_comment_column516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_comment_column521 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_create_comment_column526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CVALUE_in_create_comment_column532 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_create_comment_column537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_create_ck559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_ck564 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_create_ck569 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_create_ck574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_column_ck_in_create_ck579 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_create_ck584 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_create_ck589 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_value_list_in_create_ck595 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_create_ck602 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_create_ck607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_create_fk630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_fk635 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_create_fk640 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_create_fk645 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_create_fk650 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_column_list_in_create_fk656 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_create_fk663 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_create_fk668 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_schema_references_in_create_fk674 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_31_in_create_fk682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_table_references_in_create_fk689 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_create_fk694 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_references_column_list_in_create_fk700 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_create_fk707 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_37_in_create_fk713 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_38_in_create_fk721 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_39_in_create_fk728 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_40_in_create_fk736 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_create_fk744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_create_pk768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_pk773 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_create_pk778 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_create_pk783 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_column_list_in_create_pk789 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_create_pk796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_ck818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_schema_references840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table_references862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name_constraint884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_references_column_list906 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_references_column_list912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CVALUE_in_value_list936 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_value_list942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_list966 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_column_list972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_create_database996 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_create_database1002 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_44_in_create_database1009 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_45_in_create_database1016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_database1023 = new BitSet(new long[]{0x0002400020400000L});
    public static final BitSet FOLLOW_create_specification_in_create_database1029 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_create_database1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_create_specification1059 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_create_specification1066 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_create_specification1071 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_create_specification1077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_specification1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_create_specification1099 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_create_specification1106 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_create_specification1112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_create_specification1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred7_DDL172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred27_DDL431 = new BitSet(new long[]{0x0000000000000002L});

}