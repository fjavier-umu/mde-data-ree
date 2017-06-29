// $ANTLR 3.2 Sep 23, 2009 12:02:23 DDL.g 2011-08-28 18:52:05

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LOG_CONJ", "ID", "NUMBER", "CVALUE", "COMPARATOR", "NON_SECOND_DATETIME_FIELD", "SQUOTE", "WS", "ML_COMMENT", "OL_COMMENT", "'CREATE'", "'REPLACE'", "'TABLE'", "'('", "','", "')'", "'LOGGING'", "'NOCOMPRESS'", "'NOCACHE'", "'NOPARALLEL'", "'MONITORING'", "';'", "'CONSTRAINT'", "'NULL'", "'NOT NULL'", "'DEFAULT'", "'ALTER TABLE'", "'ADD CONSTRAINT'", "'FOREIGN KEY'", "'REFERENCES'", "'\\.'", "'ON'", "'DELETE'", "'UPDATE'", "'CASCADE'", "'DISABLE'", "'RESTRICT'", "'NO ACTION'", "'SET NULL'", "'CHECK'", "'PRIMARY KEY'", "'UNIQUE'", "'DATABASE'", "'SCHEMA'", "'IF NOT EXISTS'", "'CHARACTER'", "'SET'", "'COLLATE'", "'IN'", "'CHAR'", "'CHARACTER VARYING'", "'CHAR VARYING'", "'VARCHAR'", "'NATIONAL CHARACTER'", "'NATIONAL CHAR'", "'NCHAR'", "'NATIONAL CHARACTER VARYING'", "'NATIONAL CHAR VARYING'", "'NCHAR VARYING'", "'BIT'", "'BIT VARYING'", "'NUMERIC'", "'DECIMAL'", "'DEC'", "'INTEGER'", "'INT'", "'SMALLINT'", "'FLOAT'", "'REAL'", "'DOUBLE PRECISION'", "'DATE'", "'TIME'", "'WITH TIME ZONE'", "'TIMESTAMP'", "'INTERVAL'", "'TO'", "'SECOND'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int ID=5;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int ML_COMMENT=12;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int COMPARATOR=8;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=6;
    public static final int OL_COMMENT=13;
    public static final int LOG_CONJ=4;
    public static final int SQUOTE=10;
    public static final int CVALUE=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=11;
    public static final int NON_SECOND_DATETIME_FIELD=9;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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
    // DDL.g:19:1: data_definition returns [Node returnNode] : (data_definition_statementGen+= data_definition_statement )* ;
    public final DDLParser.data_definition_return data_definition() throws RecognitionException {
        DDLParser.data_definition_return retval = new DDLParser.data_definition_return();
        retval.start = input.LT(1);

        List list_data_definition_statementGen=null;
        RuleReturnScope data_definition_statementGen = null;
        try {
            // DDL.g:20:1: ( (data_definition_statementGen+= data_definition_statement )* )
            // DDL.g:20:4: (data_definition_statementGen+= data_definition_statement )*
            {
            // DDL.g:20:4: (data_definition_statementGen+= data_definition_statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // DDL.g:20:6: data_definition_statementGen+= data_definition_statement
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
    // DDL.g:40:1: data_definition_statement returns [Node returnNode] : (databaseGen+= database | tableGen+= table | alter_tableGen+= alter_table );
    public final DDLParser.data_definition_statement_return data_definition_statement() throws RecognitionException {
        DDLParser.data_definition_statement_return retval = new DDLParser.data_definition_statement_return();
        retval.start = input.LT(1);

        List list_databaseGen=null;
        List list_tableGen=null;
        List list_alter_tableGen=null;
        RuleReturnScope databaseGen = null;
        RuleReturnScope tableGen = null;
        RuleReturnScope alter_tableGen = null;
        try {
            // DDL.g:41:1: (databaseGen+= database | tableGen+= table | alter_tableGen+= alter_table )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=46 && LA2_1<=47)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==LOG_CONJ||LA2_1==16) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==30) ) {
                alt2=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // DDL.g:41:5: databaseGen+= database
                    {
                    pushFollow(FOLLOW_database_in_data_definition_statement75);
                    databaseGen=database();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_databaseGen==null) list_databaseGen=new ArrayList();
                    list_databaseGen.add(databaseGen);

                    if ( state.backtracking==0 ) {

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
                    // DDL.g:59:5: tableGen+= table
                    {
                    pushFollow(FOLLOW_table_in_data_definition_statement87);
                    tableGen=table();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_tableGen==null) list_tableGen=new ArrayList();
                    list_tableGen.add(tableGen);

                    if ( state.backtracking==0 ) {

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
                    // DDL.g:77:5: alter_tableGen+= alter_table
                    {
                    pushFollow(FOLLOW_alter_table_in_data_definition_statement99);
                    alter_tableGen=alter_table();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_alter_tableGen==null) list_alter_tableGen=new ArrayList();
                    list_alter_tableGen.add(alter_tableGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node data_definition_statementReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_definition_statementReturnNode.setKind("data_definition_statement");
                      	    // Create a CST Node
                      		if(list_alter_tableGen != null) {
                      	        for(Iterator it = list_alter_tableGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.alter_table_return r = (DDLParser.alter_table_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("alter_table");
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

    public static class table_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "table"
    // DDL.g:97:1: table returns [Node returnNode] : TK_0= 'CREATE' (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (columnGen+= column )* (TK_4= ',' )? (checGen+= chec (TK_5= ',' )? )* (pkGen+= pk )? (TK_6= ',' )? (ckGen+= ck (TK_7= ',' )? )* (fkGen+= fk (TK_8= ',' )? )* TK_9= ')' (TK_10= 'LOGGING' )? (TK_11= 'NOCOMPRESS' )? (TK_12= 'NOCACHE' )? (TK_13= 'NOPARALLEL' )? (TK_14= 'MONITORING' )? TK_15= ';' ;
    public final DDLParser.table_return table() throws RecognitionException {
        DDLParser.table_return retval = new DDLParser.table_return();
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
        Token TK_15=null;
        List list_columnGen=null;
        List list_checGen=null;
        List list_pkGen=null;
        List list_ckGen=null;
        List list_fkGen=null;
        RuleReturnScope columnGen = null;
        RuleReturnScope checGen = null;
        RuleReturnScope pkGen = null;
        RuleReturnScope ckGen = null;
        RuleReturnScope fkGen = null;
        try {
            // DDL.g:98:1: (TK_0= 'CREATE' (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (columnGen+= column )* (TK_4= ',' )? (checGen+= chec (TK_5= ',' )? )* (pkGen+= pk )? (TK_6= ',' )? (ckGen+= ck (TK_7= ',' )? )* (fkGen+= fk (TK_8= ',' )? )* TK_9= ')' (TK_10= 'LOGGING' )? (TK_11= 'NOCOMPRESS' )? (TK_12= 'NOCACHE' )? (TK_13= 'NOPARALLEL' )? (TK_14= 'MONITORING' )? TK_15= ';' )
            // DDL.g:98:4: TK_0= 'CREATE' (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )? TK_2= 'TABLE' IDGen= ID TK_3= '(' (columnGen+= column )* (TK_4= ',' )? (checGen+= chec (TK_5= ',' )? )* (pkGen+= pk )? (TK_6= ',' )? (ckGen+= ck (TK_7= ',' )? )* (fkGen+= fk (TK_8= ',' )? )* TK_9= ')' (TK_10= 'LOGGING' )? (TK_11= 'NOCOMPRESS' )? (TK_12= 'NOCACHE' )? (TK_13= 'NOPARALLEL' )? (TK_14= 'MONITORING' )? TK_15= ';'
            {
            TK_0=(Token)match(input,14,FOLLOW_14_in_table121); if (state.failed) return retval;
            // DDL.g:98:18: (LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==LOG_CONJ) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // DDL.g:98:20: LOG_CONJGen= LOG_CONJ TK_1= 'REPLACE'
                    {
                    LOG_CONJGen=(Token)match(input,LOG_CONJ,FOLLOW_LOG_CONJ_in_table127); if (state.failed) return retval;
                    TK_1=(Token)match(input,15,FOLLOW_15_in_table132); if (state.failed) return retval;

                    }
                    break;

            }

            TK_2=(Token)match(input,16,FOLLOW_16_in_table139); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_table144); if (state.failed) return retval;
            TK_3=(Token)match(input,17,FOLLOW_17_in_table149); if (state.failed) return retval;
            // DDL.g:98:93: (columnGen+= column )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // DDL.g:98:95: columnGen+= column
            	    {
            	    pushFollow(FOLLOW_column_in_table155);
            	    columnGen=column();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_columnGen==null) list_columnGen=new ArrayList();
            	    list_columnGen.add(columnGen);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // DDL.g:98:115: (TK_4= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred6_DDL()) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // DDL.g:98:117: TK_4= ','
                    {
                    TK_4=(Token)match(input,18,FOLLOW_18_in_table163); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:98:128: (checGen+= chec (TK_5= ',' )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
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
            	    // DDL.g:98:130: checGen+= chec (TK_5= ',' )?
            	    {
            	    pushFollow(FOLLOW_chec_in_table171);
            	    checGen=chec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_checGen==null) list_checGen=new ArrayList();
            	    list_checGen.add(checGen);

            	    // DDL.g:98:144: (TK_5= ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==18) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (synpred7_DDL()) ) {
            	            alt6=1;
            	        }
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // DDL.g:98:146: TK_5= ','
            	            {
            	            TK_5=(Token)match(input,18,FOLLOW_18_in_table177); if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // DDL.g:98:159: (pkGen+= pk )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==44) ) {
                        alt8=1;
                    }
                }
            }
            switch (alt8) {
                case 1 :
                    // DDL.g:98:161: pkGen+= pk
                    {
                    pushFollow(FOLLOW_pk_in_table187);
                    pkGen=pk();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_pkGen==null) list_pkGen=new ArrayList();
                    list_pkGen.add(pkGen);


                    }
                    break;

            }

            // DDL.g:98:173: (TK_6= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // DDL.g:98:175: TK_6= ','
                    {
                    TK_6=(Token)match(input,18,FOLLOW_18_in_table195); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:98:186: (ckGen+= ck (TK_7= ',' )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==ID) ) {
                        int LA11_3 = input.LA(3);

                        if ( (LA11_3==45) ) {
                            alt11=1;
                        }


                    }


                }


                switch (alt11) {
            	case 1 :
            	    // DDL.g:98:188: ckGen+= ck (TK_7= ',' )?
            	    {
            	    pushFollow(FOLLOW_ck_in_table203);
            	    ckGen=ck();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_ckGen==null) list_ckGen=new ArrayList();
            	    list_ckGen.add(ckGen);

            	    // DDL.g:98:198: (TK_7= ',' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==18) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // DDL.g:98:200: TK_7= ','
            	            {
            	            TK_7=(Token)match(input,18,FOLLOW_18_in_table209); if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // DDL.g:98:213: (fkGen+= fk (TK_8= ',' )? )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // DDL.g:98:215: fkGen+= fk (TK_8= ',' )?
            	    {
            	    pushFollow(FOLLOW_fk_in_table219);
            	    fkGen=fk();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_fkGen==null) list_fkGen=new ArrayList();
            	    list_fkGen.add(fkGen);

            	    // DDL.g:98:225: (TK_8= ',' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==18) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // DDL.g:98:227: TK_8= ','
            	            {
            	            TK_8=(Token)match(input,18,FOLLOW_18_in_table225); if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            TK_9=(Token)match(input,19,FOLLOW_19_in_table234); if (state.failed) return retval;
            // DDL.g:98:250: (TK_10= 'LOGGING' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // DDL.g:98:252: TK_10= 'LOGGING'
                    {
                    TK_10=(Token)match(input,20,FOLLOW_20_in_table240); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:98:270: (TK_11= 'NOCOMPRESS' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // DDL.g:98:272: TK_11= 'NOCOMPRESS'
                    {
                    TK_11=(Token)match(input,21,FOLLOW_21_in_table248); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:98:293: (TK_12= 'NOCACHE' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // DDL.g:98:295: TK_12= 'NOCACHE'
                    {
                    TK_12=(Token)match(input,22,FOLLOW_22_in_table256); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:98:313: (TK_13= 'NOPARALLEL' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // DDL.g:98:315: TK_13= 'NOPARALLEL'
                    {
                    TK_13=(Token)match(input,23,FOLLOW_23_in_table264); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:98:336: (TK_14= 'MONITORING' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // DDL.g:98:338: TK_14= 'MONITORING'
                    {
                    TK_14=(Token)match(input,24,FOLLOW_24_in_table272); if (state.failed) return retval;

                    }
                    break;

            }

            TK_15=(Token)match(input,25,FOLLOW_25_in_table278); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node tableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		tableReturnNode.setKind("table");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		tableReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(LOG_CONJGen != null) {
              			Leaf LOG_CONJGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("LOG_CONJ", (LOG_CONJGen!=null?LOG_CONJGen.getText():null), LOG_CONJGen.getCharPositionInLine(), LOG_CONJGen.getLine());
              			tableReturnNode.getChildren().add(LOG_CONJGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		tableReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		tableReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			tableReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
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
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
              	 		tableReturnNode.getChildren().add(TK_4Leaf);
              	 	}

              		// Create a special CST Node for terminal checGen aggregation
              		if(list_checGen != null) {
              	    for(int pos = 0; pos < list_checGen.size(); pos++ )  { 
              		// No Terminal extractor
              	    if(list_checGen != null) {		
              	    	DDLParser.chec_return r = (DDLParser.chec_return) list_checGen.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("chec");
              	    		tableReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_5!=null?TK_5.getText():null), TK_5.getCharPositionInLine(), TK_5.getLine());
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
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_6!=null?TK_6.getText():null), TK_6.getCharPositionInLine(), TK_6.getLine());
              	 		tableReturnNode.getChildren().add(TK_6Leaf);
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
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_7!=null?TK_7.getText():null), TK_7.getCharPositionInLine(), TK_7.getLine());
              	 		tableReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              		}
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
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_8!=null?TK_8.getText():null), TK_8.getCharPositionInLine(), TK_8.getLine());
              	 		tableReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              		}
              		}

              	    // Create a Token CST Leaf	
              	    if(TK_9 != null) {
              			Leaf TK_9Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_9!=null?TK_9.getText():null), TK_9.getCharPositionInLine(), TK_9.getLine());
              	 		tableReturnNode.getChildren().add(TK_9Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_10 != null) {
              			Leaf TK_10Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_10!=null?TK_10.getText():null), TK_10.getCharPositionInLine(), TK_10.getLine());
              	 		tableReturnNode.getChildren().add(TK_10Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_11 != null) {
              			Leaf TK_11Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_11!=null?TK_11.getText():null), TK_11.getCharPositionInLine(), TK_11.getLine());
              	 		tableReturnNode.getChildren().add(TK_11Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_12 != null) {
              			Leaf TK_12Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_12!=null?TK_12.getText():null), TK_12.getCharPositionInLine(), TK_12.getLine());
              	 		tableReturnNode.getChildren().add(TK_12Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_13 != null) {
              			Leaf TK_13Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_13!=null?TK_13.getText():null), TK_13.getCharPositionInLine(), TK_13.getLine());
              	 		tableReturnNode.getChildren().add(TK_13Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_14 != null) {
              			Leaf TK_14Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_14!=null?TK_14.getText():null), TK_14.getCharPositionInLine(), TK_14.getLine());
              	 		tableReturnNode.getChildren().add(TK_14Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_15 != null) {
              			Leaf TK_15Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_15!=null?TK_15.getText():null), TK_15.getCharPositionInLine(), TK_15.getLine());
              	 		tableReturnNode.getChildren().add(TK_15Leaf);
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
    // $ANTLR end "table"

    public static class column_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "column"
    // DDL.g:263:1: column returns [Node returnNode] : IDGen= ID data_typeGen+= data_type (TK_0= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_1= 'NULL' | TK_2= 'NOT NULL' )? (defectoGen+= defecto )? (TK_3= ',' )? ;
    public final DDLParser.column_return column() throws RecognitionException {
        DDLParser.column_return retval = new DDLParser.column_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_data_typeGen=null;
        List list_name_constraintGen=null;
        List list_defectoGen=null;
        RuleReturnScope data_typeGen = null;
        RuleReturnScope name_constraintGen = null;
        RuleReturnScope defectoGen = null;
        try {
            // DDL.g:264:1: (IDGen= ID data_typeGen+= data_type (TK_0= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_1= 'NULL' | TK_2= 'NOT NULL' )? (defectoGen+= defecto )? (TK_3= ',' )? )
            // DDL.g:264:4: IDGen= ID data_typeGen+= data_type (TK_0= 'CONSTRAINT' )? (name_constraintGen+= name_constraint )? (TK_1= 'NULL' | TK_2= 'NOT NULL' )? (defectoGen+= defecto )? (TK_3= ',' )?
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_column301); if (state.failed) return retval;
            pushFollow(FOLLOW_data_type_in_column306);
            data_typeGen=data_type();

            state._fsp--;
            if (state.failed) return retval;
            if (list_data_typeGen==null) list_data_typeGen=new ArrayList();
            list_data_typeGen.add(data_typeGen);

            // DDL.g:264:38: (TK_0= 'CONSTRAINT' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==ID) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==EOF||LA19_3==ID||(LA19_3>=18 && LA19_3<=19)||(LA19_3>=26 && LA19_3<=29)||LA19_3==49||(LA19_3>=53 && LA19_3<=75)||(LA19_3>=77 && LA19_3<=78)) ) {
                        alt19=1;
                    }
                }
                else if ( (LA19_1==EOF||(LA19_1>=18 && LA19_1<=19)||(LA19_1>=26 && LA19_1<=29)) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // DDL.g:264:40: TK_0= 'CONSTRAINT'
                    {
                    TK_0=(Token)match(input,26,FOLLOW_26_in_column312); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:264:60: (name_constraintGen+= name_constraint )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||LA20_1==ID||(LA20_1>=18 && LA20_1<=19)||(LA20_1>=26 && LA20_1<=29)) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // DDL.g:264:62: name_constraintGen+= name_constraint
                    {
                    pushFollow(FOLLOW_name_constraint_in_column320);
                    name_constraintGen=name_constraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_name_constraintGen==null) list_name_constraintGen=new ArrayList();
                    list_name_constraintGen.add(name_constraintGen);


                    }
                    break;

            }

            // DDL.g:264:100: (TK_1= 'NULL' | TK_2= 'NOT NULL' )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            else if ( (LA21_0==28) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // DDL.g:264:102: TK_1= 'NULL'
                    {
                    TK_1=(Token)match(input,27,FOLLOW_27_in_column328); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // DDL.g:264:117: TK_2= 'NOT NULL'
                    {
                    TK_2=(Token)match(input,28,FOLLOW_28_in_column335); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:264:135: (defectoGen+= defecto )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // DDL.g:264:137: defectoGen+= defecto
                    {
                    pushFollow(FOLLOW_defecto_in_column343);
                    defectoGen=defecto();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_defectoGen==null) list_defectoGen=new ArrayList();
                    list_defectoGen.add(defectoGen);


                    }
                    break;

            }

            // DDL.g:264:159: (TK_3= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred25_DDL()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // DDL.g:264:161: TK_3= ','
                    {
                    TK_3=(Token)match(input,18,FOLLOW_18_in_column351); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node columnReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		columnReturnNode.setKind("column");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			columnReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a CST Node
              		if(list_data_typeGen != null) {
              	        for(Iterator it = list_data_typeGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.data_type_return r = (DDLParser.data_type_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("data_type");
              	            	columnReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		columnReturnNode.getChildren().add(TK_0Leaf);
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
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		columnReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		columnReturnNode.getChildren().add(TK_2Leaf);
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
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		columnReturnNode.getChildren().add(TK_3Leaf);
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
    // $ANTLR end "column"

    public static class defecto_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "defecto"
    // DDL.g:329:1: defecto returns [Node returnNode] : TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE ) ;
    public final DDLParser.defecto_return defecto() throws RecognitionException {
        DDLParser.defecto_return retval = new DDLParser.defecto_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token NUMBERGen=null;
        Token CVALUEGen=null;

        try {
            // DDL.g:330:1: (TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE ) )
            // DDL.g:330:4: TK_0= 'DEFAULT' (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE )
            {
            TK_0=(Token)match(input,29,FOLLOW_29_in_defecto375); if (state.failed) return retval;
            // DDL.g:330:19: (TK_1= 'NULL' | TK_2= 'NOT NULL' | NUMBERGen= NUMBER | CVALUEGen= CVALUE )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt24=1;
                }
                break;
            case 28:
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // DDL.g:330:21: TK_1= 'NULL'
                    {
                    TK_1=(Token)match(input,27,FOLLOW_27_in_defecto381); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // DDL.g:330:36: TK_2= 'NOT NULL'
                    {
                    TK_2=(Token)match(input,28,FOLLOW_28_in_defecto388); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // DDL.g:330:55: NUMBERGen= NUMBER
                    {
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_defecto395); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // DDL.g:330:75: CVALUEGen= CVALUE
                    {
                    CVALUEGen=(Token)match(input,CVALUE,FOLLOW_CVALUE_in_defecto402); if (state.failed) return retval;

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

    public static class alter_table_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "alter_table"
    // DDL.g:365:1: alter_table returns [Node returnNode] : TK_0= 'ALTER TABLE' table_referencesGen+= table_references alter_table_specificationGen+= alter_table_specification (TK_1= ',' alter_table_specificationGen_1+= alter_table_specification )* TK_2= ';' ;
    public final DDLParser.alter_table_return alter_table() throws RecognitionException {
        DDLParser.alter_table_return retval = new DDLParser.alter_table_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_table_referencesGen=null;
        List list_alter_table_specificationGen=null;
        List list_alter_table_specificationGen_1=null;
        RuleReturnScope table_referencesGen = null;
        RuleReturnScope alter_table_specificationGen = null;
        RuleReturnScope alter_table_specificationGen_1 = null;
        try {
            // DDL.g:366:1: (TK_0= 'ALTER TABLE' table_referencesGen+= table_references alter_table_specificationGen+= alter_table_specification (TK_1= ',' alter_table_specificationGen_1+= alter_table_specification )* TK_2= ';' )
            // DDL.g:366:5: TK_0= 'ALTER TABLE' table_referencesGen+= table_references alter_table_specificationGen+= alter_table_specification (TK_1= ',' alter_table_specificationGen_1+= alter_table_specification )* TK_2= ';'
            {
            TK_0=(Token)match(input,30,FOLLOW_30_in_alter_table426); if (state.failed) return retval;
            pushFollow(FOLLOW_table_references_in_alter_table431);
            table_referencesGen=table_references();

            state._fsp--;
            if (state.failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            pushFollow(FOLLOW_alter_table_specification_in_alter_table436);
            alter_table_specificationGen=alter_table_specification();

            state._fsp--;
            if (state.failed) return retval;
            if (list_alter_table_specificationGen==null) list_alter_table_specificationGen=new ArrayList();
            list_alter_table_specificationGen.add(alter_table_specificationGen);

            // DDL.g:366:120: (TK_1= ',' alter_table_specificationGen_1+= alter_table_specification )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // DDL.g:366:122: TK_1= ',' alter_table_specificationGen_1+= alter_table_specification
            	    {
            	    TK_1=(Token)match(input,18,FOLLOW_18_in_alter_table442); if (state.failed) return retval;
            	    pushFollow(FOLLOW_alter_table_specification_in_alter_table447);
            	    alter_table_specificationGen_1=alter_table_specification();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_alter_table_specificationGen_1==null) list_alter_table_specificationGen_1=new ArrayList();
            	    list_alter_table_specificationGen_1.add(alter_table_specificationGen_1);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            TK_2=(Token)match(input,25,FOLLOW_25_in_alter_table454); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node alter_tableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		alter_tableReturnNode.setKind("alter_table");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		alter_tableReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_table_referencesGen != null) {
              	        for(Iterator it = list_table_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.table_references_return r = (DDLParser.table_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("table_references");
              	            	alter_tableReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a CST Node
              		if(list_alter_table_specificationGen != null) {
              	        for(Iterator it = list_alter_table_specificationGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.alter_table_specification_return r = (DDLParser.alter_table_specification_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("alter_table_specification");
              	            	alter_tableReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }

              		// Create a special CST Node for terminal alter_table_specificationGen_1 aggregation
              		if(list_alter_table_specificationGen_1 != null) {
              	    for(int pos = 0; pos < list_alter_table_specificationGen_1.size(); pos++ )  { 
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		alter_tableReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              		// No Terminal extractor
              	    if(list_alter_table_specificationGen_1 != null) {		
              	    	DDLParser.alter_table_specification_return r = (DDLParser.alter_table_specification_return) list_alter_table_specificationGen_1.get(pos); 
              	    	if(r != null && r.returnNode != null) {
              	        	r.returnNode.setKind("alter_table_specification");
              	    		alter_tableReturnNode.getChildren().add(r.returnNode);
              	    	} 
              		}
              		}
              		}

              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		alter_tableReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = alter_tableReturnNode;
              	
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
    // $ANTLR end "alter_table"

    public static class alter_table_specification_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "alter_table_specification"
    // DDL.g:426:1: alter_table_specification returns [Node returnNode] : TK_0= 'ADD CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )? (TK_13= 'RESTRICT' )? (TK_14= 'NO ACTION' )? (TK_15= 'SET NULL' )? ;
    public final DDLParser.alter_table_specification_return alter_table_specification() throws RecognitionException {
        DDLParser.alter_table_specification_return retval = new DDLParser.alter_table_specification_return();
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
        Token TK_14=null;
        Token TK_15=null;
        List list_column_listGen=null;
        List list_schema_referencesGen=null;
        List list_table_referencesGen=null;
        List list_references_column_listGen=null;
        RuleReturnScope column_listGen = null;
        RuleReturnScope schema_referencesGen = null;
        RuleReturnScope table_referencesGen = null;
        RuleReturnScope references_column_listGen = null;
        try {
            // DDL.g:427:1: (TK_0= 'ADD CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )? (TK_13= 'RESTRICT' )? (TK_14= 'NO ACTION' )? (TK_15= 'SET NULL' )? )
            // DDL.g:427:4: TK_0= 'ADD CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )? (TK_13= 'RESTRICT' )? (TK_14= 'NO ACTION' )? (TK_15= 'SET NULL' )?
            {
            TK_0=(Token)match(input,31,FOLLOW_31_in_alter_table_specification477); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_alter_table_specification482); if (state.failed) return retval;
            TK_1=(Token)match(input,32,FOLLOW_32_in_alter_table_specification487); if (state.failed) return retval;
            TK_2=(Token)match(input,17,FOLLOW_17_in_alter_table_specification492); if (state.failed) return retval;
            // DDL.g:427:66: (column_listGen+= column_list )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // DDL.g:427:68: column_listGen+= column_list
            	    {
            	    pushFollow(FOLLOW_column_list_in_alter_table_specification498);
            	    column_listGen=column_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_column_listGen==null) list_column_listGen=new ArrayList();
            	    list_column_listGen.add(column_listGen);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            TK_3=(Token)match(input,19,FOLLOW_19_in_alter_table_specification505); if (state.failed) return retval;
            TK_4=(Token)match(input,33,FOLLOW_33_in_alter_table_specification510); if (state.failed) return retval;
            // DDL.g:427:127: (schema_referencesGen+= schema_references )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==ID||LA27_1==34) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // DDL.g:427:129: schema_referencesGen+= schema_references
                    {
                    pushFollow(FOLLOW_schema_references_in_alter_table_specification516);
                    schema_referencesGen=schema_references();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_schema_referencesGen==null) list_schema_referencesGen=new ArrayList();
                    list_schema_referencesGen.add(schema_referencesGen);


                    }
                    break;

            }

            // DDL.g:427:171: (TK_5= '\\.' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // DDL.g:427:173: TK_5= '\\.'
                    {
                    TK_5=(Token)match(input,34,FOLLOW_34_in_alter_table_specification524); if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_table_references_in_alter_table_specification531);
            table_referencesGen=table_references();

            state._fsp--;
            if (state.failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_6=(Token)match(input,17,FOLLOW_17_in_alter_table_specification536); if (state.failed) return retval;
            // DDL.g:427:234: (references_column_listGen+= references_column_list )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // DDL.g:427:236: references_column_listGen+= references_column_list
            	    {
            	    pushFollow(FOLLOW_references_column_list_in_alter_table_specification542);
            	    references_column_listGen=references_column_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_references_column_listGen==null) list_references_column_listGen=new ArrayList();
            	    list_references_column_listGen.add(references_column_listGen);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            TK_7=(Token)match(input,19,FOLLOW_19_in_alter_table_specification549); if (state.failed) return retval;
            // DDL.g:427:298: (TK_8= 'ON' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // DDL.g:427:300: TK_8= 'ON'
                    {
                    TK_8=(Token)match(input,35,FOLLOW_35_in_alter_table_specification555); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:427:312: (TK_9= 'DELETE' | TK_10= 'UPDATE' )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            else if ( (LA31_0==37) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // DDL.g:427:314: TK_9= 'DELETE'
                    {
                    TK_9=(Token)match(input,36,FOLLOW_36_in_alter_table_specification563); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // DDL.g:427:331: TK_10= 'UPDATE'
                    {
                    TK_10=(Token)match(input,37,FOLLOW_37_in_alter_table_specification570); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:427:348: (TK_11= 'CASCADE' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // DDL.g:427:350: TK_11= 'CASCADE'
                    {
                    TK_11=(Token)match(input,38,FOLLOW_38_in_alter_table_specification578); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:427:368: (TK_12= 'DISABLE' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // DDL.g:427:370: TK_12= 'DISABLE'
                    {
                    TK_12=(Token)match(input,39,FOLLOW_39_in_alter_table_specification586); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:427:388: (TK_13= 'RESTRICT' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // DDL.g:427:390: TK_13= 'RESTRICT'
                    {
                    TK_13=(Token)match(input,40,FOLLOW_40_in_alter_table_specification594); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:427:409: (TK_14= 'NO ACTION' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // DDL.g:427:411: TK_14= 'NO ACTION'
                    {
                    TK_14=(Token)match(input,41,FOLLOW_41_in_alter_table_specification602); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:427:431: (TK_15= 'SET NULL' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // DDL.g:427:433: TK_15= 'SET NULL'
                    {
                    TK_15=(Token)match(input,42,FOLLOW_42_in_alter_table_specification610); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node alter_table_specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		alter_table_specificationReturnNode.setKind("alter_table_specification");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			alter_table_specificationReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_column_listGen != null) {
              	        for(Iterator it = list_column_listGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.column_list_return r = (DDLParser.column_list_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("column_list");
              	            	alter_table_specificationReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_4Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_schema_referencesGen != null) {
              	        for(Iterator it = list_schema_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.schema_references_return r = (DDLParser.schema_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("schema_references");
              	            	alter_table_specificationReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_5 != null) {
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_5!=null?TK_5.getText():null), TK_5.getCharPositionInLine(), TK_5.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_5Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_table_referencesGen != null) {
              	        for(Iterator it = list_table_referencesGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.table_references_return r = (DDLParser.table_references_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("table_references");
              	            	alter_table_specificationReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_6 != null) {
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_6!=null?TK_6.getText():null), TK_6.getCharPositionInLine(), TK_6.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_6Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_references_column_listGen != null) {
              	        for(Iterator it = list_references_column_listGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.references_column_list_return r = (DDLParser.references_column_list_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("references_column_list");
              	            	alter_table_specificationReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_7 != null) {
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_7!=null?TK_7.getText():null), TK_7.getCharPositionInLine(), TK_7.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_8!=null?TK_8.getText():null), TK_8.getCharPositionInLine(), TK_8.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_9 != null) {
              			Leaf TK_9Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_9!=null?TK_9.getText():null), TK_9.getCharPositionInLine(), TK_9.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_9Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_10 != null) {
              			Leaf TK_10Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_10!=null?TK_10.getText():null), TK_10.getCharPositionInLine(), TK_10.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_10Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_11 != null) {
              			Leaf TK_11Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_11!=null?TK_11.getText():null), TK_11.getCharPositionInLine(), TK_11.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_11Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_12 != null) {
              			Leaf TK_12Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_12!=null?TK_12.getText():null), TK_12.getCharPositionInLine(), TK_12.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_12Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_13 != null) {
              			Leaf TK_13Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_13!=null?TK_13.getText():null), TK_13.getCharPositionInLine(), TK_13.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_13Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_14 != null) {
              			Leaf TK_14Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_14!=null?TK_14.getText():null), TK_14.getCharPositionInLine(), TK_14.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_14Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_15 != null) {
              			Leaf TK_15Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_15!=null?TK_15.getText():null), TK_15.getCharPositionInLine(), TK_15.getLine());
              	 		alter_table_specificationReturnNode.getChildren().add(TK_15Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = alter_table_specificationReturnNode;
              	
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
    // $ANTLR end "alter_table_specification"

    public static class chec_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "chec"
    // DDL.g:562:1: chec returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' (log_expresionGen+= log_expresion )+ TK_3= ')' ;
    public final DDLParser.chec_return chec() throws RecognitionException {
        DDLParser.chec_return retval = new DDLParser.chec_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_log_expresionGen=null;
        RuleReturnScope log_expresionGen = null;
        try {
            // DDL.g:563:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' (log_expresionGen+= log_expresion )+ TK_3= ')' )
            // DDL.g:563:4: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'CHECK' TK_2= '(' (log_expresionGen+= log_expresion )+ TK_3= ')'
            {
            TK_0=(Token)match(input,26,FOLLOW_26_in_chec634); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_chec639); if (state.failed) return retval;
            TK_1=(Token)match(input,43,FOLLOW_43_in_chec644); if (state.failed) return retval;
            TK_2=(Token)match(input,17,FOLLOW_17_in_chec649); if (state.failed) return retval;
            // DDL.g:563:56: (log_expresionGen+= log_expresion )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // DDL.g:563:58: log_expresionGen+= log_expresion
            	    {
            	    pushFollow(FOLLOW_log_expresion_in_chec655);
            	    log_expresionGen=log_expresion();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_log_expresionGen==null) list_log_expresionGen=new ArrayList();
            	    list_log_expresionGen.add(log_expresionGen);


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            TK_3=(Token)match(input,19,FOLLOW_19_in_chec662); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node checReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		checReturnNode.setKind("chec");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		checReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			checReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		checReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		checReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_log_expresionGen != null) {
              	        for(Iterator it = list_log_expresionGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.log_expresion_return r = (DDLParser.log_expresion_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("log_expresion");
              	            	checReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		checReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = checReturnNode;
              	
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
    // $ANTLR end "chec"

    public static class fk_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fk"
    // DDL.g:608:1: fk returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )? (TK_13= 'RESTRICT' )? (TK_14= 'NO ACTION' )? (TK_15= 'SET NULL' )? ;
    public final DDLParser.fk_return fk() throws RecognitionException {
        DDLParser.fk_return retval = new DDLParser.fk_return();
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
        Token TK_14=null;
        Token TK_15=null;
        List list_column_listGen=null;
        List list_schema_referencesGen=null;
        List list_table_referencesGen=null;
        List list_references_column_listGen=null;
        RuleReturnScope column_listGen = null;
        RuleReturnScope schema_referencesGen = null;
        RuleReturnScope table_referencesGen = null;
        RuleReturnScope references_column_listGen = null;
        try {
            // DDL.g:609:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )? (TK_13= 'RESTRICT' )? (TK_14= 'NO ACTION' )? (TK_15= 'SET NULL' )? )
            // DDL.g:609:4: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'FOREIGN KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' TK_4= 'REFERENCES' (schema_referencesGen+= schema_references )? (TK_5= '\\.' )? table_referencesGen+= table_references TK_6= '(' (references_column_listGen+= references_column_list )* TK_7= ')' (TK_8= 'ON' )? (TK_9= 'DELETE' | TK_10= 'UPDATE' )? (TK_11= 'CASCADE' )? (TK_12= 'DISABLE' )? (TK_13= 'RESTRICT' )? (TK_14= 'NO ACTION' )? (TK_15= 'SET NULL' )?
            {
            TK_0=(Token)match(input,26,FOLLOW_26_in_fk685); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_fk690); if (state.failed) return retval;
            TK_1=(Token)match(input,32,FOLLOW_32_in_fk695); if (state.failed) return retval;
            TK_2=(Token)match(input,17,FOLLOW_17_in_fk700); if (state.failed) return retval;
            // DDL.g:609:62: (column_listGen+= column_list )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // DDL.g:609:64: column_listGen+= column_list
            	    {
            	    pushFollow(FOLLOW_column_list_in_fk706);
            	    column_listGen=column_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_column_listGen==null) list_column_listGen=new ArrayList();
            	    list_column_listGen.add(column_listGen);


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            TK_3=(Token)match(input,19,FOLLOW_19_in_fk713); if (state.failed) return retval;
            TK_4=(Token)match(input,33,FOLLOW_33_in_fk718); if (state.failed) return retval;
            // DDL.g:609:123: (schema_referencesGen+= schema_references )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==ID||LA39_1==34) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // DDL.g:609:125: schema_referencesGen+= schema_references
                    {
                    pushFollow(FOLLOW_schema_references_in_fk724);
                    schema_referencesGen=schema_references();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_schema_referencesGen==null) list_schema_referencesGen=new ArrayList();
                    list_schema_referencesGen.add(schema_referencesGen);


                    }
                    break;

            }

            // DDL.g:609:167: (TK_5= '\\.' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // DDL.g:609:169: TK_5= '\\.'
                    {
                    TK_5=(Token)match(input,34,FOLLOW_34_in_fk732); if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_table_references_in_fk739);
            table_referencesGen=table_references();

            state._fsp--;
            if (state.failed) return retval;
            if (list_table_referencesGen==null) list_table_referencesGen=new ArrayList();
            list_table_referencesGen.add(table_referencesGen);

            TK_6=(Token)match(input,17,FOLLOW_17_in_fk744); if (state.failed) return retval;
            // DDL.g:609:230: (references_column_listGen+= references_column_list )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // DDL.g:609:232: references_column_listGen+= references_column_list
            	    {
            	    pushFollow(FOLLOW_references_column_list_in_fk750);
            	    references_column_listGen=references_column_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_references_column_listGen==null) list_references_column_listGen=new ArrayList();
            	    list_references_column_listGen.add(references_column_listGen);


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            TK_7=(Token)match(input,19,FOLLOW_19_in_fk757); if (state.failed) return retval;
            // DDL.g:609:294: (TK_8= 'ON' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // DDL.g:609:296: TK_8= 'ON'
                    {
                    TK_8=(Token)match(input,35,FOLLOW_35_in_fk763); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:609:308: (TK_9= 'DELETE' | TK_10= 'UPDATE' )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            else if ( (LA43_0==37) ) {
                alt43=2;
            }
            switch (alt43) {
                case 1 :
                    // DDL.g:609:310: TK_9= 'DELETE'
                    {
                    TK_9=(Token)match(input,36,FOLLOW_36_in_fk771); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // DDL.g:609:327: TK_10= 'UPDATE'
                    {
                    TK_10=(Token)match(input,37,FOLLOW_37_in_fk778); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:609:344: (TK_11= 'CASCADE' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // DDL.g:609:346: TK_11= 'CASCADE'
                    {
                    TK_11=(Token)match(input,38,FOLLOW_38_in_fk786); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:609:364: (TK_12= 'DISABLE' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // DDL.g:609:366: TK_12= 'DISABLE'
                    {
                    TK_12=(Token)match(input,39,FOLLOW_39_in_fk794); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:609:384: (TK_13= 'RESTRICT' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // DDL.g:609:386: TK_13= 'RESTRICT'
                    {
                    TK_13=(Token)match(input,40,FOLLOW_40_in_fk802); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:609:405: (TK_14= 'NO ACTION' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==41) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // DDL.g:609:407: TK_14= 'NO ACTION'
                    {
                    TK_14=(Token)match(input,41,FOLLOW_41_in_fk810); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:609:427: (TK_15= 'SET NULL' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // DDL.g:609:429: TK_15= 'SET NULL'
                    {
                    TK_15=(Token)match(input,42,FOLLOW_42_in_fk818); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node fkReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		fkReturnNode.setKind("fk");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		fkReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			fkReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		fkReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
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
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		fkReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_4 != null) {
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
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
              			Leaf TK_5Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_5!=null?TK_5.getText():null), TK_5.getCharPositionInLine(), TK_5.getLine());
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
              			Leaf TK_6Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_6!=null?TK_6.getText():null), TK_6.getCharPositionInLine(), TK_6.getLine());
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
              			Leaf TK_7Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_7!=null?TK_7.getText():null), TK_7.getCharPositionInLine(), TK_7.getLine());
              	 		fkReturnNode.getChildren().add(TK_7Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_8 != null) {
              			Leaf TK_8Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_8!=null?TK_8.getText():null), TK_8.getCharPositionInLine(), TK_8.getLine());
              	 		fkReturnNode.getChildren().add(TK_8Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_9 != null) {
              			Leaf TK_9Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_9!=null?TK_9.getText():null), TK_9.getCharPositionInLine(), TK_9.getLine());
              	 		fkReturnNode.getChildren().add(TK_9Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_10 != null) {
              			Leaf TK_10Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_10!=null?TK_10.getText():null), TK_10.getCharPositionInLine(), TK_10.getLine());
              	 		fkReturnNode.getChildren().add(TK_10Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_11 != null) {
              			Leaf TK_11Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_11!=null?TK_11.getText():null), TK_11.getCharPositionInLine(), TK_11.getLine());
              	 		fkReturnNode.getChildren().add(TK_11Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_12 != null) {
              			Leaf TK_12Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_12!=null?TK_12.getText():null), TK_12.getCharPositionInLine(), TK_12.getLine());
              	 		fkReturnNode.getChildren().add(TK_12Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_13 != null) {
              			Leaf TK_13Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_13!=null?TK_13.getText():null), TK_13.getCharPositionInLine(), TK_13.getLine());
              	 		fkReturnNode.getChildren().add(TK_13Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_14 != null) {
              			Leaf TK_14Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_14!=null?TK_14.getText():null), TK_14.getCharPositionInLine(), TK_14.getLine());
              	 		fkReturnNode.getChildren().add(TK_14Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_15 != null) {
              			Leaf TK_15Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_15!=null?TK_15.getText():null), TK_15.getCharPositionInLine(), TK_15.getLine());
              	 		fkReturnNode.getChildren().add(TK_15Leaf);
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
    // $ANTLR end "fk"

    public static class pk_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pk"
    // DDL.g:744:1: pk returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' ;
    public final DDLParser.pk_return pk() throws RecognitionException {
        DDLParser.pk_return retval = new DDLParser.pk_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_column_listGen=null;
        RuleReturnScope column_listGen = null;
        try {
            // DDL.g:745:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' )
            // DDL.g:745:4: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'PRIMARY KEY' TK_2= '(' (column_listGen+= column_list )* TK_3= ')'
            {
            TK_0=(Token)match(input,26,FOLLOW_26_in_pk842); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_pk847); if (state.failed) return retval;
            TK_1=(Token)match(input,44,FOLLOW_44_in_pk852); if (state.failed) return retval;
            TK_2=(Token)match(input,17,FOLLOW_17_in_pk857); if (state.failed) return retval;
            // DDL.g:745:62: (column_listGen+= column_list )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // DDL.g:745:64: column_listGen+= column_list
            	    {
            	    pushFollow(FOLLOW_column_list_in_pk863);
            	    column_listGen=column_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_column_listGen==null) list_column_listGen=new ArrayList();
            	    list_column_listGen.add(column_listGen);


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            TK_3=(Token)match(input,19,FOLLOW_19_in_pk870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node pkReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		pkReturnNode.setKind("pk");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		pkReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			pkReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		pkReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
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
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
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
    // $ANTLR end "pk"

    public static class ck_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ck"
    // DDL.g:790:1: ck returns [Node returnNode] : TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'UNIQUE' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' ;
    public final DDLParser.ck_return ck() throws RecognitionException {
        DDLParser.ck_return retval = new DDLParser.ck_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_column_listGen=null;
        RuleReturnScope column_listGen = null;
        try {
            // DDL.g:791:1: (TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'UNIQUE' TK_2= '(' (column_listGen+= column_list )* TK_3= ')' )
            // DDL.g:791:4: TK_0= 'CONSTRAINT' IDGen= ID TK_1= 'UNIQUE' TK_2= '(' (column_listGen+= column_list )* TK_3= ')'
            {
            TK_0=(Token)match(input,26,FOLLOW_26_in_ck893); if (state.failed) return retval;
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_ck898); if (state.failed) return retval;
            TK_1=(Token)match(input,45,FOLLOW_45_in_ck903); if (state.failed) return retval;
            TK_2=(Token)match(input,17,FOLLOW_17_in_ck908); if (state.failed) return retval;
            // DDL.g:791:57: (column_listGen+= column_list )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // DDL.g:791:59: column_listGen+= column_list
            	    {
            	    pushFollow(FOLLOW_column_list_in_ck914);
            	    column_listGen=column_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_column_listGen==null) list_column_listGen=new ArrayList();
            	    list_column_listGen.add(column_listGen);


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            TK_3=(Token)match(input,19,FOLLOW_19_in_ck921); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node ckReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		ckReturnNode.setKind("ck");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		ckReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			ckReturnNode.getChildren().add(IDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		ckReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		ckReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_column_listGen != null) {
              	        for(Iterator it = list_column_listGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.column_list_return r = (DDLParser.column_list_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("column_list");
              	            	ckReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
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
    // $ANTLR end "ck"

    public static class column_chec_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "column_chec"
    // DDL.g:836:1: column_chec returns [Node returnNode] : IDGen= ID ;
    public final DDLParser.column_chec_return column_chec() throws RecognitionException {
        DDLParser.column_chec_return retval = new DDLParser.column_chec_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // DDL.g:837:1: (IDGen= ID )
            // DDL.g:837:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_column_chec943); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node column_checReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		column_checReturnNode.setKind("column_chec");
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
              			column_checReturnNode.getChildren().add(IDGenLeaf);
              		}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = column_checReturnNode;
              	
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
    // $ANTLR end "column_chec"

    public static class schema_references_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "schema_references"
    // DDL.g:852:1: schema_references returns [Node returnNode] : IDGen= ID ;
    public final DDLParser.schema_references_return schema_references() throws RecognitionException {
        DDLParser.schema_references_return retval = new DDLParser.schema_references_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // DDL.g:853:1: (IDGen= ID )
            // DDL.g:853:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_schema_references965); if (state.failed) return retval;
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
    // DDL.g:868:1: table_references returns [Node returnNode] : IDGen= ID ;
    public final DDLParser.table_references_return table_references() throws RecognitionException {
        DDLParser.table_references_return retval = new DDLParser.table_references_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // DDL.g:869:1: (IDGen= ID )
            // DDL.g:869:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_table_references987); if (state.failed) return retval;
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
    // DDL.g:884:1: name_constraint returns [Node returnNode] : IDGen= ID ;
    public final DDLParser.name_constraint_return name_constraint() throws RecognitionException {
        DDLParser.name_constraint_return retval = new DDLParser.name_constraint_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // DDL.g:885:1: (IDGen= ID )
            // DDL.g:885:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_name_constraint1009); if (state.failed) return retval;
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
    // DDL.g:900:1: references_column_list returns [Node returnNode] : IDGen= ID (TK_0= ',' )? ;
    public final DDLParser.references_column_list_return references_column_list() throws RecognitionException {
        DDLParser.references_column_list_return retval = new DDLParser.references_column_list_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;

        try {
            // DDL.g:901:1: (IDGen= ID (TK_0= ',' )? )
            // DDL.g:901:4: IDGen= ID (TK_0= ',' )?
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_references_column_list1031); if (state.failed) return retval;
            // DDL.g:901:13: (TK_0= ',' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==18) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // DDL.g:901:15: TK_0= ','
                    {
                    TK_0=(Token)match(input,18,FOLLOW_18_in_references_column_list1037); if (state.failed) return retval;

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
    // DDL.g:921:1: value_list returns [Node returnNode] : CVALUEGen= CVALUE (TK_0= ',' )? ;
    public final DDLParser.value_list_return value_list() throws RecognitionException {
        DDLParser.value_list_return retval = new DDLParser.value_list_return();
        retval.start = input.LT(1);

        Token CVALUEGen=null;
        Token TK_0=null;

        try {
            // DDL.g:922:1: (CVALUEGen= CVALUE (TK_0= ',' )? )
            // DDL.g:922:4: CVALUEGen= CVALUE (TK_0= ',' )?
            {
            CVALUEGen=(Token)match(input,CVALUE,FOLLOW_CVALUE_in_value_list1061); if (state.failed) return retval;
            // DDL.g:922:21: (TK_0= ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==18) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // DDL.g:922:23: TK_0= ','
                    {
                    TK_0=(Token)match(input,18,FOLLOW_18_in_value_list1067); if (state.failed) return retval;

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
    // DDL.g:942:1: column_list returns [Node returnNode] : IDGen= ID (TK_0= ',' )? ;
    public final DDLParser.column_list_return column_list() throws RecognitionException {
        DDLParser.column_list_return retval = new DDLParser.column_list_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;

        try {
            // DDL.g:943:1: (IDGen= ID (TK_0= ',' )? )
            // DDL.g:943:4: IDGen= ID (TK_0= ',' )?
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_column_list1091); if (state.failed) return retval;
            // DDL.g:943:13: (TK_0= ',' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==18) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // DDL.g:943:15: TK_0= ','
                    {
                    TK_0=(Token)match(input,18,FOLLOW_18_in_column_list1097); if (state.failed) return retval;

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

    public static class database_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "database"
    // DDL.g:963:1: database returns [Node returnNode] : TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (specificationGen+= specification )? TK_4= ';' ;
    public final DDLParser.database_return database() throws RecognitionException {
        DDLParser.database_return retval = new DDLParser.database_return();
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
            // DDL.g:964:1: (TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (specificationGen+= specification )? TK_4= ';' )
            // DDL.g:964:4: TK_0= 'CREATE' (TK_1= 'DATABASE' | TK_2= 'SCHEMA' ) (TK_3= 'IF NOT EXISTS' )? IDGen= ID (specificationGen+= specification )? TK_4= ';'
            {
            TK_0=(Token)match(input,14,FOLLOW_14_in_database1121); if (state.failed) return retval;
            // DDL.g:964:18: (TK_1= 'DATABASE' | TK_2= 'SCHEMA' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==46) ) {
                alt54=1;
            }
            else if ( (LA54_0==47) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // DDL.g:964:20: TK_1= 'DATABASE'
                    {
                    TK_1=(Token)match(input,46,FOLLOW_46_in_database1127); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // DDL.g:964:39: TK_2= 'SCHEMA'
                    {
                    TK_2=(Token)match(input,47,FOLLOW_47_in_database1134); if (state.failed) return retval;

                    }
                    break;

            }

            // DDL.g:964:54: (TK_3= 'IF NOT EXISTS' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==48) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // DDL.g:964:56: TK_3= 'IF NOT EXISTS'
                    {
                    TK_3=(Token)match(input,48,FOLLOW_48_in_database1141); if (state.failed) return retval;

                    }
                    break;

            }

            IDGen=(Token)match(input,ID,FOLLOW_ID_in_database1148); if (state.failed) return retval;
            // DDL.g:964:89: (specificationGen+= specification )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==29||LA56_0==49||LA56_0==51) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // DDL.g:964:91: specificationGen+= specification
                    {
                    pushFollow(FOLLOW_specification_in_database1154);
                    specificationGen=specification();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_specificationGen==null) list_specificationGen=new ArrayList();
                    list_specificationGen.add(specificationGen);


                    }
                    break;

            }

            TK_4=(Token)match(input,25,FOLLOW_25_in_database1161); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node databaseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		databaseReturnNode.setKind("database");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		databaseReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		databaseReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_2 != null) {
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
              	 		databaseReturnNode.getChildren().add(TK_2Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_3 != null) {
              			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
              	 		databaseReturnNode.getChildren().add(TK_3Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(IDGen != null) {
              			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
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
              			Leaf TK_4Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_4!=null?TK_4.getText():null), TK_4.getCharPositionInLine(), TK_4.getLine());
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
    // $ANTLR end "database"

    public static class specification_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "specification"
    // DDL.g:1014:1: specification returns [Node returnNode] : ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID );
    public final DDLParser.specification_return specification() throws RecognitionException {
        DDLParser.specification_return retval = new DDLParser.specification_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token COMPARATORGen=null;
        Token IDGen=null;

        try {
            // DDL.g:1015:1: ( (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID | (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID )
            int alt61=2;
            switch ( input.LA(1) ) {
            case 29:
                {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==49) ) {
                    alt61=1;
                }
                else if ( (LA61_1==51) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt61=1;
                }
                break;
            case 51:
                {
                alt61=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // DDL.g:1015:3: (TK_0= 'DEFAULT' )? TK_1= 'CHARACTER' TK_2= 'SET' (COMPARATORGen= COMPARATOR )? IDGen= ID
                    {
                    // DDL.g:1015:3: (TK_0= 'DEFAULT' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==29) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // DDL.g:1015:5: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)match(input,29,FOLLOW_29_in_specification1184); if (state.failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)match(input,49,FOLLOW_49_in_specification1191); if (state.failed) return retval;
                    TK_2=(Token)match(input,50,FOLLOW_50_in_specification1196); if (state.failed) return retval;
                    // DDL.g:1015:52: (COMPARATORGen= COMPARATOR )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==COMPARATOR) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // DDL.g:1015:54: COMPARATORGen= COMPARATOR
                            {
                            COMPARATORGen=(Token)match(input,COMPARATOR,FOLLOW_COMPARATOR_in_specification1202); if (state.failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_specification1209); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		specificationReturnNode.setKind("specification");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		specificationReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		specificationReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		specificationReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(COMPARATORGen != null) {
                      			Leaf COMPARATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMPARATOR", (COMPARATORGen!=null?COMPARATORGen.getText():null), COMPARATORGen.getCharPositionInLine(), COMPARATORGen.getLine());
                      			specificationReturnNode.getChildren().add(COMPARATORGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
                      			specificationReturnNode.getChildren().add(IDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = specificationReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:1048:6: (TK_0= 'DEFAULT' )? TK_1= 'COLLATE' (COMPARATORGen= COMPARATOR )? IDGen= ID
                    {
                    // DDL.g:1048:6: (TK_0= 'DEFAULT' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==29) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // DDL.g:1048:8: TK_0= 'DEFAULT'
                            {
                            TK_0=(Token)match(input,29,FOLLOW_29_in_specification1224); if (state.failed) return retval;

                            }
                            break;

                    }

                    TK_1=(Token)match(input,51,FOLLOW_51_in_specification1231); if (state.failed) return retval;
                    // DDL.g:1048:41: (COMPARATORGen= COMPARATOR )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==COMPARATOR) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // DDL.g:1048:43: COMPARATORGen= COMPARATOR
                            {
                            COMPARATORGen=(Token)match(input,COMPARATOR,FOLLOW_COMPARATOR_in_specification1237); if (state.failed) return retval;

                            }
                            break;

                    }

                    IDGen=(Token)match(input,ID,FOLLOW_ID_in_specification1244); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		specificationReturnNode.setKind("specification");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		specificationReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		specificationReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(COMPARATORGen != null) {
                      			Leaf COMPARATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMPARATOR", (COMPARATORGen!=null?COMPARATORGen.getText():null), COMPARATORGen.getCharPositionInLine(), COMPARATORGen.getLine());
                      			specificationReturnNode.getChildren().add(COMPARATORGenLeaf);
                      		}
                      	    // Create a CST Leaf
                      		if(IDGen != null) {
                      			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
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
    // $ANTLR end "specification"

    public static class log_expresion_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "log_expresion"
    // DDL.g:1078:1: log_expresion returns [Node returnNode] : column_checGen+= column_chec (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' ) ;
    public final DDLParser.log_expresion_return log_expresion() throws RecognitionException {
        DDLParser.log_expresion_return retval = new DDLParser.log_expresion_return();
        retval.start = input.LT(1);

        Token COMPARATORGen=null;
        Token NUMBERGen=null;
        Token CVALUEGen=null;
        Token LOG_CONJGen=null;
        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_column_checGen=null;
        List list_value_listGen=null;
        RuleReturnScope column_checGen = null;
        RuleReturnScope value_listGen = null;
        try {
            // DDL.g:1079:1: (column_checGen+= column_chec (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' ) )
            // DDL.g:1079:5: column_checGen+= column_chec (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' )
            {
            pushFollow(FOLLOW_column_chec_in_log_expresion1269);
            column_checGen=column_chec();

            state._fsp--;
            if (state.failed) return retval;
            if (list_column_checGen==null) list_column_checGen=new ArrayList();
            list_column_checGen.add(column_checGen);

            // DDL.g:1079:33: (COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )? | TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==COMPARATOR) ) {
                alt65=1;
            }
            else if ( (LA65_0==52) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // DDL.g:1079:35: COMPARATORGen= COMPARATOR (NUMBERGen= NUMBER | CVALUEGen= CVALUE ) (LOG_CONJGen= LOG_CONJ )?
                    {
                    COMPARATORGen=(Token)match(input,COMPARATOR,FOLLOW_COMPARATOR_in_log_expresion1275); if (state.failed) return retval;
                    // DDL.g:1079:60: (NUMBERGen= NUMBER | CVALUEGen= CVALUE )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==NUMBER) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==CVALUE) ) {
                        alt62=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // DDL.g:1079:62: NUMBERGen= NUMBER
                            {
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_log_expresion1281); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // DDL.g:1079:82: CVALUEGen= CVALUE
                            {
                            CVALUEGen=(Token)match(input,CVALUE,FOLLOW_CVALUE_in_log_expresion1288); if (state.failed) return retval;

                            }
                            break;

                    }

                    // DDL.g:1079:112: (LOG_CONJGen= LOG_CONJ )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==LOG_CONJ) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // DDL.g:0:0: LOG_CONJGen= LOG_CONJ
                            {
                            LOG_CONJGen=(Token)match(input,LOG_CONJ,FOLLOW_LOG_CONJ_in_log_expresion1294); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:1079:126: TK_0= 'IN' TK_1= '(' (value_listGen+= value_list )* TK_2= ')'
                    {
                    TK_0=(Token)match(input,52,FOLLOW_52_in_log_expresion1302); if (state.failed) return retval;
                    TK_1=(Token)match(input,17,FOLLOW_17_in_log_expresion1307); if (state.failed) return retval;
                    // DDL.g:1079:146: (value_listGen+= value_list )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==CVALUE) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // DDL.g:1079:148: value_listGen+= value_list
                    	    {
                    	    pushFollow(FOLLOW_value_list_in_log_expresion1313);
                    	    value_listGen=value_list();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_value_listGen==null) list_value_listGen=new ArrayList();
                    	    list_value_listGen.add(value_listGen);


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    TK_2=(Token)match(input,19,FOLLOW_19_in_log_expresion1320); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node log_expresionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		log_expresionReturnNode.setKind("log_expresion");
              	    // Create a CST Node
              		if(list_column_checGen != null) {
              	        for(Iterator it = list_column_checGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.column_chec_return r = (DDLParser.column_chec_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("column_chec");
              	            	log_expresionReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              	    // Create a CST Leaf
              		if(COMPARATORGen != null) {
              			Leaf COMPARATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMPARATOR", (COMPARATORGen!=null?COMPARATORGen.getText():null), COMPARATORGen.getCharPositionInLine(), COMPARATORGen.getLine());
              			log_expresionReturnNode.getChildren().add(COMPARATORGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(NUMBERGen != null) {
              			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
              			log_expresionReturnNode.getChildren().add(NUMBERGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(CVALUEGen != null) {
              			Leaf CVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("CVALUE", (CVALUEGen!=null?CVALUEGen.getText():null), CVALUEGen.getCharPositionInLine(), CVALUEGen.getLine());
              			log_expresionReturnNode.getChildren().add(CVALUEGenLeaf);
              		}
              	    // Create a CST Leaf
              		if(LOG_CONJGen != null) {
              			Leaf LOG_CONJGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("LOG_CONJ", (LOG_CONJGen!=null?LOG_CONJGen.getText():null), LOG_CONJGen.getCharPositionInLine(), LOG_CONJGen.getLine());
              			log_expresionReturnNode.getChildren().add(LOG_CONJGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		log_expresionReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
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
              			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
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
    // $ANTLR end "log_expresion"

    public static class data_type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "data_type"
    // DDL.g:1144:1: data_type returns [Node returnNode] : (character_string_typeGen+= character_string_type | national_character_string_typeGen+= national_character_string_type | bit_string_typeGen+= bit_string_type | numeric_typeGen+= numeric_type | datetime_typeGen+= datetime_type | interval_typeGen+= interval_type );
    public final DDLParser.data_type_return data_type() throws RecognitionException {
        DDLParser.data_type_return retval = new DDLParser.data_type_return();
        retval.start = input.LT(1);

        List list_character_string_typeGen=null;
        List list_national_character_string_typeGen=null;
        List list_bit_string_typeGen=null;
        List list_numeric_typeGen=null;
        List list_datetime_typeGen=null;
        List list_interval_typeGen=null;
        RuleReturnScope character_string_typeGen = null;
        RuleReturnScope national_character_string_typeGen = null;
        RuleReturnScope bit_string_typeGen = null;
        RuleReturnScope numeric_typeGen = null;
        RuleReturnScope datetime_typeGen = null;
        RuleReturnScope interval_typeGen = null;
        try {
            // DDL.g:1145:1: (character_string_typeGen+= character_string_type | national_character_string_typeGen+= national_character_string_type | bit_string_typeGen+= bit_string_type | numeric_typeGen+= numeric_type | datetime_typeGen+= datetime_type | interval_typeGen+= interval_type )
            int alt66=6;
            switch ( input.LA(1) ) {
            case 49:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt66=1;
                }
                break;
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
                {
                alt66=2;
                }
                break;
            case 63:
            case 64:
                {
                alt66=3;
                }
                break;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt66=4;
                }
                break;
            case 74:
            case 75:
            case 77:
                {
                alt66=5;
                }
                break;
            case 78:
                {
                alt66=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // DDL.g:1145:4: character_string_typeGen+= character_string_type
                    {
                    pushFollow(FOLLOW_character_string_type_in_data_type1343);
                    character_string_typeGen=character_string_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_character_string_typeGen==null) list_character_string_typeGen=new ArrayList();
                    list_character_string_typeGen.add(character_string_typeGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a CST Node
                      		if(list_character_string_typeGen != null) {
                      	        for(Iterator it = list_character_string_typeGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.character_string_type_return r = (DDLParser.character_string_type_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("character_string_type");
                      	            	data_typeReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:1163:5: national_character_string_typeGen+= national_character_string_type
                    {
                    pushFollow(FOLLOW_national_character_string_type_in_data_type1355);
                    national_character_string_typeGen=national_character_string_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_national_character_string_typeGen==null) list_national_character_string_typeGen=new ArrayList();
                    list_national_character_string_typeGen.add(national_character_string_typeGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a CST Node
                      		if(list_national_character_string_typeGen != null) {
                      	        for(Iterator it = list_national_character_string_typeGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.national_character_string_type_return r = (DDLParser.national_character_string_type_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("national_character_string_type");
                      	            	data_typeReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // DDL.g:1181:5: bit_string_typeGen+= bit_string_type
                    {
                    pushFollow(FOLLOW_bit_string_type_in_data_type1367);
                    bit_string_typeGen=bit_string_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_bit_string_typeGen==null) list_bit_string_typeGen=new ArrayList();
                    list_bit_string_typeGen.add(bit_string_typeGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a CST Node
                      		if(list_bit_string_typeGen != null) {
                      	        for(Iterator it = list_bit_string_typeGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.bit_string_type_return r = (DDLParser.bit_string_type_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("bit_string_type");
                      	            	data_typeReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 4 :
                    // DDL.g:1199:5: numeric_typeGen+= numeric_type
                    {
                    pushFollow(FOLLOW_numeric_type_in_data_type1379);
                    numeric_typeGen=numeric_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_numeric_typeGen==null) list_numeric_typeGen=new ArrayList();
                    list_numeric_typeGen.add(numeric_typeGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a CST Node
                      		if(list_numeric_typeGen != null) {
                      	        for(Iterator it = list_numeric_typeGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.numeric_type_return r = (DDLParser.numeric_type_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("numeric_type");
                      	            	data_typeReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 5 :
                    // DDL.g:1217:5: datetime_typeGen+= datetime_type
                    {
                    pushFollow(FOLLOW_datetime_type_in_data_type1391);
                    datetime_typeGen=datetime_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_datetime_typeGen==null) list_datetime_typeGen=new ArrayList();
                    list_datetime_typeGen.add(datetime_typeGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a CST Node
                      		if(list_datetime_typeGen != null) {
                      	        for(Iterator it = list_datetime_typeGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.datetime_type_return r = (DDLParser.datetime_type_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("datetime_type");
                      	            	data_typeReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 6 :
                    // DDL.g:1235:5: interval_typeGen+= interval_type
                    {
                    pushFollow(FOLLOW_interval_type_in_data_type1403);
                    interval_typeGen=interval_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_interval_typeGen==null) list_interval_typeGen=new ArrayList();
                    list_interval_typeGen.add(interval_typeGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node data_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		data_typeReturnNode.setKind("data_type");
                      	    // Create a CST Node
                      		if(list_interval_typeGen != null) {
                      	        for(Iterator it = list_interval_typeGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.interval_type_return r = (DDLParser.interval_type_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("interval_type");
                      	            	data_typeReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = data_typeReturnNode;
                      	
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
    // $ANTLR end "data_type"

    public static class character_string_type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "character_string_type"
    // DDL.g:1255:1: character_string_type returns [Node returnNode] : (TK_0= 'CHARACTER' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'CHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'CHARACTER VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'CHAR VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'VARCHAR' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' );
    public final DDLParser.character_string_type_return character_string_type() throws RecognitionException {
        DDLParser.character_string_type_return retval = new DDLParser.character_string_type_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token NUMBERGen=null;
        Token TK_2=null;

        try {
            // DDL.g:1256:1: (TK_0= 'CHARACTER' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'CHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'CHARACTER VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'CHAR VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'VARCHAR' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )
            int alt69=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt69=1;
                }
                break;
            case 53:
                {
                alt69=2;
                }
                break;
            case 54:
                {
                alt69=3;
                }
                break;
            case 55:
                {
                alt69=4;
                }
                break;
            case 56:
                {
                alt69=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // DDL.g:1256:4: TK_0= 'CHARACTER' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    {
                    TK_0=(Token)match(input,49,FOLLOW_49_in_character_string_type1425); if (state.failed) return retval;
                    // DDL.g:1256:21: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==17) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // DDL.g:1256:23: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_character_string_type1431); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_character_string_type1436); if (state.failed) return retval;
                            TK_2=(Token)match(input,19,FOLLOW_19_in_character_string_type1441); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node character_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		character_string_typeReturnNode.setKind("character_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			character_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = character_string_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:1284:5: TK_0= 'CHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    {
                    TK_0=(Token)match(input,53,FOLLOW_53_in_character_string_type1455); if (state.failed) return retval;
                    // DDL.g:1284:17: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==17) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // DDL.g:1284:19: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_character_string_type1461); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_character_string_type1466); if (state.failed) return retval;
                            TK_2=(Token)match(input,19,FOLLOW_19_in_character_string_type1471); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node character_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		character_string_typeReturnNode.setKind("character_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			character_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = character_string_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // DDL.g:1312:5: TK_0= 'CHARACTER VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                    {
                    TK_0=(Token)match(input,54,FOLLOW_54_in_character_string_type1485); if (state.failed) return retval;
                    TK_1=(Token)match(input,17,FOLLOW_17_in_character_string_type1490); if (state.failed) return retval;
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_character_string_type1495); if (state.failed) return retval;
                    TK_2=(Token)match(input,19,FOLLOW_19_in_character_string_type1500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node character_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		character_string_typeReturnNode.setKind("character_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			character_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = character_string_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 4 :
                    // DDL.g:1340:5: TK_0= 'CHAR VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                    {
                    TK_0=(Token)match(input,55,FOLLOW_55_in_character_string_type1512); if (state.failed) return retval;
                    TK_1=(Token)match(input,17,FOLLOW_17_in_character_string_type1517); if (state.failed) return retval;
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_character_string_type1522); if (state.failed) return retval;
                    TK_2=(Token)match(input,19,FOLLOW_19_in_character_string_type1527); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node character_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		character_string_typeReturnNode.setKind("character_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			character_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = character_string_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 5 :
                    // DDL.g:1368:5: TK_0= 'VARCHAR' TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                    {
                    TK_0=(Token)match(input,56,FOLLOW_56_in_character_string_type1539); if (state.failed) return retval;
                    TK_1=(Token)match(input,17,FOLLOW_17_in_character_string_type1544); if (state.failed) return retval;
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_character_string_type1549); if (state.failed) return retval;
                    TK_2=(Token)match(input,19,FOLLOW_19_in_character_string_type1554); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node character_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		character_string_typeReturnNode.setKind("character_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			character_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		character_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = character_string_typeReturnNode;
                      	
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
    // $ANTLR end "character_string_type"

    public static class national_character_string_type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "national_character_string_type"
    // DDL.g:1398:1: national_character_string_type returns [Node returnNode] : (TK_0= 'NATIONAL CHARACTER' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'NATIONAL CHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'NCHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'NATIONAL CHARACTER VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'NATIONAL CHAR VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'NCHAR VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' );
    public final DDLParser.national_character_string_type_return national_character_string_type() throws RecognitionException {
        DDLParser.national_character_string_type_return retval = new DDLParser.national_character_string_type_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token NUMBERGen=null;
        Token TK_2=null;

        try {
            // DDL.g:1399:1: (TK_0= 'NATIONAL CHARACTER' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'NATIONAL CHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'NCHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'NATIONAL CHARACTER VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'NATIONAL CHAR VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' | TK_0= 'NCHAR VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )
            int alt73=6;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt73=1;
                }
                break;
            case 58:
                {
                alt73=2;
                }
                break;
            case 59:
                {
                alt73=3;
                }
                break;
            case 60:
                {
                alt73=4;
                }
                break;
            case 61:
                {
                alt73=5;
                }
                break;
            case 62:
                {
                alt73=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // DDL.g:1399:4: TK_0= 'NATIONAL CHARACTER' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    {
                    TK_0=(Token)match(input,57,FOLLOW_57_in_national_character_string_type1577); if (state.failed) return retval;
                    // DDL.g:1399:30: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==17) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // DDL.g:1399:32: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_national_character_string_type1583); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_national_character_string_type1588); if (state.failed) return retval;
                            TK_2=(Token)match(input,19,FOLLOW_19_in_national_character_string_type1593); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node national_character_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		national_character_string_typeReturnNode.setKind("national_character_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			national_character_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = national_character_string_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:1427:5: TK_0= 'NATIONAL CHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    {
                    TK_0=(Token)match(input,58,FOLLOW_58_in_national_character_string_type1607); if (state.failed) return retval;
                    // DDL.g:1427:26: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==17) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // DDL.g:1427:28: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_national_character_string_type1613); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_national_character_string_type1618); if (state.failed) return retval;
                            TK_2=(Token)match(input,19,FOLLOW_19_in_national_character_string_type1623); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node national_character_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		national_character_string_typeReturnNode.setKind("national_character_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			national_character_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = national_character_string_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // DDL.g:1455:5: TK_0= 'NCHAR' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    {
                    TK_0=(Token)match(input,59,FOLLOW_59_in_national_character_string_type1637); if (state.failed) return retval;
                    // DDL.g:1455:18: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==17) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // DDL.g:1455:20: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_national_character_string_type1643); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_national_character_string_type1648); if (state.failed) return retval;
                            TK_2=(Token)match(input,19,FOLLOW_19_in_national_character_string_type1653); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node national_character_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		national_character_string_typeReturnNode.setKind("national_character_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			national_character_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = national_character_string_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 4 :
                    // DDL.g:1483:5: TK_0= 'NATIONAL CHARACTER VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                    {
                    TK_0=(Token)match(input,60,FOLLOW_60_in_national_character_string_type1667); if (state.failed) return retval;
                    TK_1=(Token)match(input,17,FOLLOW_17_in_national_character_string_type1672); if (state.failed) return retval;
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_national_character_string_type1677); if (state.failed) return retval;
                    TK_2=(Token)match(input,19,FOLLOW_19_in_national_character_string_type1682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node national_character_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		national_character_string_typeReturnNode.setKind("national_character_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			national_character_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = national_character_string_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 5 :
                    // DDL.g:1511:5: TK_0= 'NATIONAL CHAR VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                    {
                    TK_0=(Token)match(input,61,FOLLOW_61_in_national_character_string_type1694); if (state.failed) return retval;
                    TK_1=(Token)match(input,17,FOLLOW_17_in_national_character_string_type1699); if (state.failed) return retval;
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_national_character_string_type1704); if (state.failed) return retval;
                    TK_2=(Token)match(input,19,FOLLOW_19_in_national_character_string_type1709); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node national_character_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		national_character_string_typeReturnNode.setKind("national_character_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			national_character_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = national_character_string_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 6 :
                    // DDL.g:1539:5: TK_0= 'NCHAR VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                    {
                    TK_0=(Token)match(input,62,FOLLOW_62_in_national_character_string_type1721); if (state.failed) return retval;
                    TK_1=(Token)match(input,17,FOLLOW_17_in_national_character_string_type1726); if (state.failed) return retval;
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_national_character_string_type1731); if (state.failed) return retval;
                    TK_2=(Token)match(input,19,FOLLOW_19_in_national_character_string_type1736); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node national_character_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		national_character_string_typeReturnNode.setKind("national_character_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			national_character_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		national_character_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = national_character_string_typeReturnNode;
                      	
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
    // $ANTLR end "national_character_string_type"

    public static class bit_string_type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bit_string_type"
    // DDL.g:1569:1: bit_string_type returns [Node returnNode] : (TK_0= 'BIT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'BIT VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' );
    public final DDLParser.bit_string_type_return bit_string_type() throws RecognitionException {
        DDLParser.bit_string_type_return retval = new DDLParser.bit_string_type_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token NUMBERGen=null;
        Token TK_2=null;

        try {
            // DDL.g:1570:1: (TK_0= 'BIT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'BIT VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==63) ) {
                alt75=1;
            }
            else if ( (LA75_0==64) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // DDL.g:1570:4: TK_0= 'BIT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    {
                    TK_0=(Token)match(input,63,FOLLOW_63_in_bit_string_type1759); if (state.failed) return retval;
                    // DDL.g:1570:15: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==17) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // DDL.g:1570:17: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_bit_string_type1765); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_bit_string_type1770); if (state.failed) return retval;
                            TK_2=(Token)match(input,19,FOLLOW_19_in_bit_string_type1775); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node bit_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		bit_string_typeReturnNode.setKind("bit_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		bit_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		bit_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			bit_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		bit_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = bit_string_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:1598:5: TK_0= 'BIT VARYING' TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                    {
                    TK_0=(Token)match(input,64,FOLLOW_64_in_bit_string_type1789); if (state.failed) return retval;
                    TK_1=(Token)match(input,17,FOLLOW_17_in_bit_string_type1794); if (state.failed) return retval;
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_bit_string_type1799); if (state.failed) return retval;
                    TK_2=(Token)match(input,19,FOLLOW_19_in_bit_string_type1804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node bit_string_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		bit_string_typeReturnNode.setKind("bit_string_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		bit_string_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		bit_string_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			bit_string_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		bit_string_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = bit_string_typeReturnNode;
                      	
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
    // $ANTLR end "bit_string_type"

    public static class numeric_type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "numeric_type"
    // DDL.g:1628:1: numeric_type returns [Node returnNode] : (exact_numeric_typeGen+= exact_numeric_type | approximate_numeric_typeGen+= approximate_numeric_type );
    public final DDLParser.numeric_type_return numeric_type() throws RecognitionException {
        DDLParser.numeric_type_return retval = new DDLParser.numeric_type_return();
        retval.start = input.LT(1);

        List list_exact_numeric_typeGen=null;
        List list_approximate_numeric_typeGen=null;
        RuleReturnScope exact_numeric_typeGen = null;
        RuleReturnScope approximate_numeric_typeGen = null;
        try {
            // DDL.g:1629:1: (exact_numeric_typeGen+= exact_numeric_type | approximate_numeric_typeGen+= approximate_numeric_type )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=65 && LA76_0<=70)) ) {
                alt76=1;
            }
            else if ( ((LA76_0>=71 && LA76_0<=73)) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // DDL.g:1629:4: exact_numeric_typeGen+= exact_numeric_type
                    {
                    pushFollow(FOLLOW_exact_numeric_type_in_numeric_type1826);
                    exact_numeric_typeGen=exact_numeric_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_exact_numeric_typeGen==null) list_exact_numeric_typeGen=new ArrayList();
                    list_exact_numeric_typeGen.add(exact_numeric_typeGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node numeric_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		numeric_typeReturnNode.setKind("numeric_type");
                      	    // Create a CST Node
                      		if(list_exact_numeric_typeGen != null) {
                      	        for(Iterator it = list_exact_numeric_typeGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.exact_numeric_type_return r = (DDLParser.exact_numeric_type_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("exact_numeric_type");
                      	            	numeric_typeReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = numeric_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:1647:5: approximate_numeric_typeGen+= approximate_numeric_type
                    {
                    pushFollow(FOLLOW_approximate_numeric_type_in_numeric_type1838);
                    approximate_numeric_typeGen=approximate_numeric_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_approximate_numeric_typeGen==null) list_approximate_numeric_typeGen=new ArrayList();
                    list_approximate_numeric_typeGen.add(approximate_numeric_typeGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node numeric_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		numeric_typeReturnNode.setKind("numeric_type");
                      	    // Create a CST Node
                      		if(list_approximate_numeric_typeGen != null) {
                      	        for(Iterator it = list_approximate_numeric_typeGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.approximate_numeric_type_return r = (DDLParser.approximate_numeric_type_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("approximate_numeric_type");
                      	            	numeric_typeReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = numeric_typeReturnNode;
                      	
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
    // $ANTLR end "numeric_type"

    public static class exact_numeric_type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "exact_numeric_type"
    // DDL.g:1667:1: exact_numeric_type returns [Node returnNode] : (TK_0= 'NUMERIC' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? | TK_0= 'DECIMAL' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? | TK_0= 'DEC' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? | TK_0= 'INTEGER' | TK_0= 'INT' | TK_0= 'SMALLINT' );
    public final DDLParser.exact_numeric_type_return exact_numeric_type() throws RecognitionException {
        DDLParser.exact_numeric_type_return retval = new DDLParser.exact_numeric_type_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token NUMBERGen=null;
        Token TK_2=null;
        Token NUMBERGen_1=null;
        Token TK_3=null;

        try {
            // DDL.g:1668:1: (TK_0= 'NUMERIC' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? | TK_0= 'DECIMAL' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? | TK_0= 'DEC' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? | TK_0= 'INTEGER' | TK_0= 'INT' | TK_0= 'SMALLINT' )
            int alt83=6;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt83=1;
                }
                break;
            case 66:
                {
                alt83=2;
                }
                break;
            case 67:
                {
                alt83=3;
                }
                break;
            case 68:
                {
                alt83=4;
                }
                break;
            case 69:
                {
                alt83=5;
                }
                break;
            case 70:
                {
                alt83=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // DDL.g:1668:4: TK_0= 'NUMERIC' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
                    {
                    TK_0=(Token)match(input,65,FOLLOW_65_in_exact_numeric_type1861); if (state.failed) return retval;
                    // DDL.g:1668:19: (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==17) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // DDL.g:1668:21: TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_exact_numeric_type1867); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_exact_numeric_type1872); if (state.failed) return retval;
                            // DDL.g:1668:48: (TK_2= ',' NUMBERGen_1= NUMBER )?
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==18) ) {
                                alt77=1;
                            }
                            switch (alt77) {
                                case 1 :
                                    // DDL.g:1668:50: TK_2= ',' NUMBERGen_1= NUMBER
                                    {
                                    TK_2=(Token)match(input,18,FOLLOW_18_in_exact_numeric_type1878); if (state.failed) return retval;
                                    NUMBERGen_1=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_exact_numeric_type1883); if (state.failed) return retval;

                                    }
                                    break;

                            }

                            TK_3=(Token)match(input,19,FOLLOW_19_in_exact_numeric_type1890); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node exact_numeric_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		exact_numeric_typeReturnNode.setKind("exact_numeric_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			exact_numeric_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen_1 != null) {
                      			Leaf NUMBERGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen_1!=null?NUMBERGen_1.getText():null), NUMBERGen_1.getCharPositionInLine(), NUMBERGen_1.getLine());
                      			exact_numeric_typeReturnNode.getChildren().add(NUMBERGen_1Leaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = exact_numeric_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:1706:5: TK_0= 'DECIMAL' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
                    {
                    TK_0=(Token)match(input,66,FOLLOW_66_in_exact_numeric_type1904); if (state.failed) return retval;
                    // DDL.g:1706:20: (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==17) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // DDL.g:1706:22: TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_exact_numeric_type1910); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_exact_numeric_type1915); if (state.failed) return retval;
                            // DDL.g:1706:49: (TK_2= ',' NUMBERGen_1= NUMBER )?
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==18) ) {
                                alt79=1;
                            }
                            switch (alt79) {
                                case 1 :
                                    // DDL.g:1706:51: TK_2= ',' NUMBERGen_1= NUMBER
                                    {
                                    TK_2=(Token)match(input,18,FOLLOW_18_in_exact_numeric_type1921); if (state.failed) return retval;
                                    NUMBERGen_1=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_exact_numeric_type1926); if (state.failed) return retval;

                                    }
                                    break;

                            }

                            TK_3=(Token)match(input,19,FOLLOW_19_in_exact_numeric_type1933); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node exact_numeric_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		exact_numeric_typeReturnNode.setKind("exact_numeric_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			exact_numeric_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen_1 != null) {
                      			Leaf NUMBERGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen_1!=null?NUMBERGen_1.getText():null), NUMBERGen_1.getCharPositionInLine(), NUMBERGen_1.getLine());
                      			exact_numeric_typeReturnNode.getChildren().add(NUMBERGen_1Leaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = exact_numeric_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // DDL.g:1744:5: TK_0= 'DEC' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
                    {
                    TK_0=(Token)match(input,67,FOLLOW_67_in_exact_numeric_type1947); if (state.failed) return retval;
                    // DDL.g:1744:16: (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==17) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // DDL.g:1744:18: TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_exact_numeric_type1953); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_exact_numeric_type1958); if (state.failed) return retval;
                            // DDL.g:1744:45: (TK_2= ',' NUMBERGen_1= NUMBER )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==18) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // DDL.g:1744:47: TK_2= ',' NUMBERGen_1= NUMBER
                                    {
                                    TK_2=(Token)match(input,18,FOLLOW_18_in_exact_numeric_type1964); if (state.failed) return retval;
                                    NUMBERGen_1=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_exact_numeric_type1969); if (state.failed) return retval;

                                    }
                                    break;

                            }

                            TK_3=(Token)match(input,19,FOLLOW_19_in_exact_numeric_type1976); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node exact_numeric_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		exact_numeric_typeReturnNode.setKind("exact_numeric_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			exact_numeric_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen_1 != null) {
                      			Leaf NUMBERGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen_1!=null?NUMBERGen_1.getText():null), NUMBERGen_1.getCharPositionInLine(), NUMBERGen_1.getLine());
                      			exact_numeric_typeReturnNode.getChildren().add(NUMBERGen_1Leaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = exact_numeric_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 4 :
                    // DDL.g:1782:5: TK_0= 'INTEGER'
                    {
                    TK_0=(Token)match(input,68,FOLLOW_68_in_exact_numeric_type1990); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node exact_numeric_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		exact_numeric_typeReturnNode.setKind("exact_numeric_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = exact_numeric_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 5 :
                    // DDL.g:1795:5: TK_0= 'INT'
                    {
                    TK_0=(Token)match(input,69,FOLLOW_69_in_exact_numeric_type2002); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node exact_numeric_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		exact_numeric_typeReturnNode.setKind("exact_numeric_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = exact_numeric_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 6 :
                    // DDL.g:1808:5: TK_0= 'SMALLINT'
                    {
                    TK_0=(Token)match(input,70,FOLLOW_70_in_exact_numeric_type2014); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node exact_numeric_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		exact_numeric_typeReturnNode.setKind("exact_numeric_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		exact_numeric_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = exact_numeric_typeReturnNode;
                      	
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
    // $ANTLR end "exact_numeric_type"

    public static class approximate_numeric_type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "approximate_numeric_type"
    // DDL.g:1823:1: approximate_numeric_type returns [Node returnNode] : (TK_0= 'FLOAT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'REAL' | TK_0= 'DOUBLE PRECISION' );
    public final DDLParser.approximate_numeric_type_return approximate_numeric_type() throws RecognitionException {
        DDLParser.approximate_numeric_type_return retval = new DDLParser.approximate_numeric_type_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token NUMBERGen=null;
        Token TK_2=null;

        try {
            // DDL.g:1824:1: (TK_0= 'FLOAT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? | TK_0= 'REAL' | TK_0= 'DOUBLE PRECISION' )
            int alt85=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt85=1;
                }
                break;
            case 72:
                {
                alt85=2;
                }
                break;
            case 73:
                {
                alt85=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // DDL.g:1824:4: TK_0= 'FLOAT' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    {
                    TK_0=(Token)match(input,71,FOLLOW_71_in_approximate_numeric_type2037); if (state.failed) return retval;
                    // DDL.g:1824:17: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==17) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // DDL.g:1824:19: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_approximate_numeric_type2043); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_approximate_numeric_type2048); if (state.failed) return retval;
                            TK_2=(Token)match(input,19,FOLLOW_19_in_approximate_numeric_type2053); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node approximate_numeric_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		approximate_numeric_typeReturnNode.setKind("approximate_numeric_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		approximate_numeric_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		approximate_numeric_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			approximate_numeric_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		approximate_numeric_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = approximate_numeric_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:1852:5: TK_0= 'REAL'
                    {
                    TK_0=(Token)match(input,72,FOLLOW_72_in_approximate_numeric_type2067); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node approximate_numeric_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		approximate_numeric_typeReturnNode.setKind("approximate_numeric_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		approximate_numeric_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = approximate_numeric_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // DDL.g:1865:5: TK_0= 'DOUBLE PRECISION'
                    {
                    TK_0=(Token)match(input,73,FOLLOW_73_in_approximate_numeric_type2079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node approximate_numeric_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		approximate_numeric_typeReturnNode.setKind("approximate_numeric_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		approximate_numeric_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = approximate_numeric_typeReturnNode;
                      	
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
    // $ANTLR end "approximate_numeric_type"

    public static class datetime_type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "datetime_type"
    // DDL.g:1880:1: datetime_type returns [Node returnNode] : (TK_0= 'DATE' | TK_0= 'TIME' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'WITH TIME ZONE' )? | TK_0= 'TIMESTAMP' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'WITH TIME ZONE' )? );
    public final DDLParser.datetime_type_return datetime_type() throws RecognitionException {
        DDLParser.datetime_type_return retval = new DDLParser.datetime_type_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token NUMBERGen=null;
        Token TK_2=null;
        Token TK_3=null;

        try {
            // DDL.g:1881:1: (TK_0= 'DATE' | TK_0= 'TIME' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'WITH TIME ZONE' )? | TK_0= 'TIMESTAMP' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'WITH TIME ZONE' )? )
            int alt90=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt90=1;
                }
                break;
            case 75:
                {
                alt90=2;
                }
                break;
            case 77:
                {
                alt90=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // DDL.g:1881:4: TK_0= 'DATE'
                    {
                    TK_0=(Token)match(input,74,FOLLOW_74_in_datetime_type2102); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node datetime_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		datetime_typeReturnNode.setKind("datetime_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		datetime_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = datetime_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:1894:5: TK_0= 'TIME' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'WITH TIME ZONE' )?
                    {
                    TK_0=(Token)match(input,75,FOLLOW_75_in_datetime_type2114); if (state.failed) return retval;
                    // DDL.g:1894:17: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==17) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // DDL.g:1894:19: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_datetime_type2120); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_datetime_type2125); if (state.failed) return retval;
                            TK_2=(Token)match(input,19,FOLLOW_19_in_datetime_type2130); if (state.failed) return retval;

                            }
                            break;

                    }

                    // DDL.g:1894:58: (TK_3= 'WITH TIME ZONE' )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==76) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // DDL.g:1894:60: TK_3= 'WITH TIME ZONE'
                            {
                            TK_3=(Token)match(input,76,FOLLOW_76_in_datetime_type2138); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node datetime_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		datetime_typeReturnNode.setKind("datetime_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		datetime_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		datetime_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			datetime_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		datetime_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
                      	 		datetime_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = datetime_typeReturnNode;
                      	
                    }

                    }
                    break;
                case 3 :
                    // DDL.g:1927:5: TK_0= 'TIMESTAMP' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? (TK_3= 'WITH TIME ZONE' )?
                    {
                    TK_0=(Token)match(input,77,FOLLOW_77_in_datetime_type2152); if (state.failed) return retval;
                    // DDL.g:1927:22: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==17) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // DDL.g:1927:24: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_datetime_type2158); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_datetime_type2163); if (state.failed) return retval;
                            TK_2=(Token)match(input,19,FOLLOW_19_in_datetime_type2168); if (state.failed) return retval;

                            }
                            break;

                    }

                    // DDL.g:1927:63: (TK_3= 'WITH TIME ZONE' )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==76) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // DDL.g:1927:65: TK_3= 'WITH TIME ZONE'
                            {
                            TK_3=(Token)match(input,76,FOLLOW_76_in_datetime_type2176); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node datetime_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		datetime_typeReturnNode.setKind("datetime_type");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		datetime_typeReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		datetime_typeReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			datetime_typeReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		datetime_typeReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
                      	 		datetime_typeReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = datetime_typeReturnNode;
                      	
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
    // $ANTLR end "datetime_type"

    public static class interval_type_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interval_type"
    // DDL.g:1962:1: interval_type returns [Node returnNode] : TK_0= 'INTERVAL' interval_qualifierGen+= interval_qualifier ;
    public final DDLParser.interval_type_return interval_type() throws RecognitionException {
        DDLParser.interval_type_return retval = new DDLParser.interval_type_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_interval_qualifierGen=null;
        RuleReturnScope interval_qualifierGen = null;
        try {
            // DDL.g:1963:1: (TK_0= 'INTERVAL' interval_qualifierGen+= interval_qualifier )
            // DDL.g:1963:4: TK_0= 'INTERVAL' interval_qualifierGen+= interval_qualifier
            {
            TK_0=(Token)match(input,78,FOLLOW_78_in_interval_type2201); if (state.failed) return retval;
            pushFollow(FOLLOW_interval_qualifier_in_interval_type2206);
            interval_qualifierGen=interval_qualifier();

            state._fsp--;
            if (state.failed) return retval;
            if (list_interval_qualifierGen==null) list_interval_qualifierGen=new ArrayList();
            list_interval_qualifierGen.add(interval_qualifierGen);

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node interval_typeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		interval_typeReturnNode.setKind("interval_type");
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		interval_typeReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Node
              		if(list_interval_qualifierGen != null) {
              	        for(Iterator it = list_interval_qualifierGen.iterator(); it.hasNext(); )  { 
              	            DDLParser.interval_qualifier_return r = (DDLParser.interval_qualifier_return) it.next(); 
              	            if(r != null && r.returnNode != null) {
              	            	r.returnNode.setKind("interval_qualifier");
              	            	interval_typeReturnNode.getChildren().add(r.returnNode);
              	            } 
              	        }
              	    }
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = interval_typeReturnNode;
              	
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
    // $ANTLR end "interval_type"

    public static class interval_qualifier_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interval_qualifier"
    // DDL.g:1988:1: interval_qualifier returns [Node returnNode] : (start_fieldGen+= start_field TK_0= 'TO' end_fieldGen+= end_field | single_datetime_fieldGen+= single_datetime_field );
    public final DDLParser.interval_qualifier_return interval_qualifier() throws RecognitionException {
        DDLParser.interval_qualifier_return retval = new DDLParser.interval_qualifier_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_start_fieldGen=null;
        List list_end_fieldGen=null;
        List list_single_datetime_fieldGen=null;
        RuleReturnScope start_fieldGen = null;
        RuleReturnScope end_fieldGen = null;
        RuleReturnScope single_datetime_fieldGen = null;
        try {
            // DDL.g:1989:1: (start_fieldGen+= start_field TK_0= 'TO' end_fieldGen+= end_field | single_datetime_fieldGen+= single_datetime_field )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==NON_SECOND_DATETIME_FIELD) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    int LA91_3 = input.LA(3);

                    if ( (LA91_3==NUMBER) ) {
                        int LA91_5 = input.LA(4);

                        if ( (LA91_5==19) ) {
                            int LA91_6 = input.LA(5);

                            if ( (LA91_6==79) ) {
                                alt91=1;
                            }
                            else if ( (LA91_6==EOF||LA91_6==ID||(LA91_6>=18 && LA91_6<=19)||(LA91_6>=26 && LA91_6<=29)) ) {
                                alt91=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 91, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 91, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 79:
                    {
                    alt91=1;
                    }
                    break;
                case EOF:
                case ID:
                case 18:
                case 19:
                case 26:
                case 27:
                case 28:
                case 29:
                    {
                    alt91=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA91_0==80) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // DDL.g:1989:4: start_fieldGen+= start_field TK_0= 'TO' end_fieldGen+= end_field
                    {
                    pushFollow(FOLLOW_start_field_in_interval_qualifier2229);
                    start_fieldGen=start_field();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_start_fieldGen==null) list_start_fieldGen=new ArrayList();
                    list_start_fieldGen.add(start_fieldGen);

                    TK_0=(Token)match(input,79,FOLLOW_79_in_interval_qualifier2234); if (state.failed) return retval;
                    pushFollow(FOLLOW_end_field_in_interval_qualifier2239);
                    end_fieldGen=end_field();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_end_fieldGen==null) list_end_fieldGen=new ArrayList();
                    list_end_fieldGen.add(end_fieldGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node interval_qualifierReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		interval_qualifierReturnNode.setKind("interval_qualifier");
                      	    // Create a CST Node
                      		if(list_start_fieldGen != null) {
                      	        for(Iterator it = list_start_fieldGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.start_field_return r = (DDLParser.start_field_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("start_field");
                      	            	interval_qualifierReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		interval_qualifierReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a CST Node
                      		if(list_end_fieldGen != null) {
                      	        for(Iterator it = list_end_fieldGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.end_field_return r = (DDLParser.end_field_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("end_field");
                      	            	interval_qualifierReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = interval_qualifierReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:2022:5: single_datetime_fieldGen+= single_datetime_field
                    {
                    pushFollow(FOLLOW_single_datetime_field_in_interval_qualifier2251);
                    single_datetime_fieldGen=single_datetime_field();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_single_datetime_fieldGen==null) list_single_datetime_fieldGen=new ArrayList();
                    list_single_datetime_fieldGen.add(single_datetime_fieldGen);

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node interval_qualifierReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		interval_qualifierReturnNode.setKind("interval_qualifier");
                      	    // Create a CST Node
                      		if(list_single_datetime_fieldGen != null) {
                      	        for(Iterator it = list_single_datetime_fieldGen.iterator(); it.hasNext(); )  { 
                      	            DDLParser.single_datetime_field_return r = (DDLParser.single_datetime_field_return) it.next(); 
                      	            if(r != null && r.returnNode != null) {
                      	            	r.returnNode.setKind("single_datetime_field");
                      	            	interval_qualifierReturnNode.getChildren().add(r.returnNode);
                      	            } 
                      	        }
                      	    }
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = interval_qualifierReturnNode;
                      	
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
    // $ANTLR end "interval_qualifier"

    public static class start_field_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "start_field"
    // DDL.g:2042:1: start_field returns [Node returnNode] : NON_SECOND_DATETIME_FIELDGen= NON_SECOND_DATETIME_FIELD (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )? ;
    public final DDLParser.start_field_return start_field() throws RecognitionException {
        DDLParser.start_field_return retval = new DDLParser.start_field_return();
        retval.start = input.LT(1);

        Token NON_SECOND_DATETIME_FIELDGen=null;
        Token TK_0=null;
        Token NUMBERGen=null;
        Token TK_1=null;

        try {
            // DDL.g:2043:1: (NON_SECOND_DATETIME_FIELDGen= NON_SECOND_DATETIME_FIELD (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )? )
            // DDL.g:2043:4: NON_SECOND_DATETIME_FIELDGen= NON_SECOND_DATETIME_FIELD (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )?
            {
            NON_SECOND_DATETIME_FIELDGen=(Token)match(input,NON_SECOND_DATETIME_FIELD,FOLLOW_NON_SECOND_DATETIME_FIELD_in_start_field2273); if (state.failed) return retval;
            // DDL.g:2043:59: (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==17) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // DDL.g:2043:61: TK_0= '(' NUMBERGen= NUMBER TK_1= ')'
                    {
                    TK_0=(Token)match(input,17,FOLLOW_17_in_start_field2279); if (state.failed) return retval;
                    NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_start_field2284); if (state.failed) return retval;
                    TK_1=(Token)match(input,19,FOLLOW_19_in_start_field2289); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// Create return CST Node
              		Node start_fieldReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
              		start_fieldReturnNode.setKind("start_field");
              	    // Create a CST Leaf
              		if(NON_SECOND_DATETIME_FIELDGen != null) {
              			Leaf NON_SECOND_DATETIME_FIELDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NON_SECOND_DATETIME_FIELD", (NON_SECOND_DATETIME_FIELDGen!=null?NON_SECOND_DATETIME_FIELDGen.getText():null), NON_SECOND_DATETIME_FIELDGen.getCharPositionInLine(), NON_SECOND_DATETIME_FIELDGen.getLine());
              			start_fieldReturnNode.getChildren().add(NON_SECOND_DATETIME_FIELDGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_0 != null) {
              			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
              	 		start_fieldReturnNode.getChildren().add(TK_0Leaf);
              	 	}
              	    // Create a CST Leaf
              		if(NUMBERGen != null) {
              			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
              			start_fieldReturnNode.getChildren().add(NUMBERGenLeaf);
              		}
              	    // Create a Token CST Leaf	
              	    if(TK_1 != null) {
              			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
              	 		start_fieldReturnNode.getChildren().add(TK_1Leaf);
              	 	}
              		// Returns the Node with CST Leaves/Nodes
              		retval.returnNode = start_fieldReturnNode;
              	
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
    // $ANTLR end "start_field"

    public static class end_field_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "end_field"
    // DDL.g:2073:1: end_field returns [Node returnNode] : (NON_SECOND_DATETIME_FIELDGen= NON_SECOND_DATETIME_FIELD | TK_0= 'SECOND' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? );
    public final DDLParser.end_field_return end_field() throws RecognitionException {
        DDLParser.end_field_return retval = new DDLParser.end_field_return();
        retval.start = input.LT(1);

        Token NON_SECOND_DATETIME_FIELDGen=null;
        Token TK_0=null;
        Token TK_1=null;
        Token NUMBERGen=null;
        Token TK_2=null;

        try {
            // DDL.g:2074:1: (NON_SECOND_DATETIME_FIELDGen= NON_SECOND_DATETIME_FIELD | TK_0= 'SECOND' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )? )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==NON_SECOND_DATETIME_FIELD) ) {
                alt94=1;
            }
            else if ( (LA94_0==80) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // DDL.g:2074:4: NON_SECOND_DATETIME_FIELDGen= NON_SECOND_DATETIME_FIELD
                    {
                    NON_SECOND_DATETIME_FIELDGen=(Token)match(input,NON_SECOND_DATETIME_FIELD,FOLLOW_NON_SECOND_DATETIME_FIELD_in_end_field2314); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node end_fieldReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		end_fieldReturnNode.setKind("end_field");
                      	    // Create a CST Leaf
                      		if(NON_SECOND_DATETIME_FIELDGen != null) {
                      			Leaf NON_SECOND_DATETIME_FIELDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NON_SECOND_DATETIME_FIELD", (NON_SECOND_DATETIME_FIELDGen!=null?NON_SECOND_DATETIME_FIELDGen.getText():null), NON_SECOND_DATETIME_FIELDGen.getCharPositionInLine(), NON_SECOND_DATETIME_FIELDGen.getLine());
                      			end_fieldReturnNode.getChildren().add(NON_SECOND_DATETIME_FIELDGenLeaf);
                      		}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = end_fieldReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:2086:7: TK_0= 'SECOND' (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    {
                    TK_0=(Token)match(input,80,FOLLOW_80_in_end_field2325); if (state.failed) return retval;
                    // DDL.g:2086:21: (TK_1= '(' NUMBERGen= NUMBER TK_2= ')' )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==17) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // DDL.g:2086:23: TK_1= '(' NUMBERGen= NUMBER TK_2= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_end_field2331); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_end_field2336); if (state.failed) return retval;
                            TK_2=(Token)match(input,19,FOLLOW_19_in_end_field2341); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node end_fieldReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		end_fieldReturnNode.setKind("end_field");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		end_fieldReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		end_fieldReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			end_fieldReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		end_fieldReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = end_fieldReturnNode;
                      	
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
    // $ANTLR end "end_field"

    public static class single_datetime_field_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "single_datetime_field"
    // DDL.g:2116:1: single_datetime_field returns [Node returnNode] : (NON_SECOND_DATETIME_FIELDGen= NON_SECOND_DATETIME_FIELD (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )? | TK_0= 'SECOND' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? );
    public final DDLParser.single_datetime_field_return single_datetime_field() throws RecognitionException {
        DDLParser.single_datetime_field_return retval = new DDLParser.single_datetime_field_return();
        retval.start = input.LT(1);

        Token NON_SECOND_DATETIME_FIELDGen=null;
        Token TK_0=null;
        Token NUMBERGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token NUMBERGen_1=null;
        Token TK_3=null;

        try {
            // DDL.g:2117:1: (NON_SECOND_DATETIME_FIELDGen= NON_SECOND_DATETIME_FIELD (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )? | TK_0= 'SECOND' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )? )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==NON_SECOND_DATETIME_FIELD) ) {
                alt98=1;
            }
            else if ( (LA98_0==80) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // DDL.g:2117:4: NON_SECOND_DATETIME_FIELDGen= NON_SECOND_DATETIME_FIELD (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )?
                    {
                    NON_SECOND_DATETIME_FIELDGen=(Token)match(input,NON_SECOND_DATETIME_FIELD,FOLLOW_NON_SECOND_DATETIME_FIELD_in_single_datetime_field2365); if (state.failed) return retval;
                    // DDL.g:2117:59: (TK_0= '(' NUMBERGen= NUMBER TK_1= ')' )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==17) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // DDL.g:2117:61: TK_0= '(' NUMBERGen= NUMBER TK_1= ')'
                            {
                            TK_0=(Token)match(input,17,FOLLOW_17_in_single_datetime_field2371); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_single_datetime_field2376); if (state.failed) return retval;
                            TK_1=(Token)match(input,19,FOLLOW_19_in_single_datetime_field2381); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node single_datetime_fieldReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		single_datetime_fieldReturnNode.setKind("single_datetime_field");
                      	    // Create a CST Leaf
                      		if(NON_SECOND_DATETIME_FIELDGen != null) {
                      			Leaf NON_SECOND_DATETIME_FIELDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NON_SECOND_DATETIME_FIELD", (NON_SECOND_DATETIME_FIELDGen!=null?NON_SECOND_DATETIME_FIELDGen.getText():null), NON_SECOND_DATETIME_FIELDGen.getCharPositionInLine(), NON_SECOND_DATETIME_FIELDGen.getLine());
                      			single_datetime_fieldReturnNode.getChildren().add(NON_SECOND_DATETIME_FIELDGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		single_datetime_fieldReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			single_datetime_fieldReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		single_datetime_fieldReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = single_datetime_fieldReturnNode;
                      	
                    }

                    }
                    break;
                case 2 :
                    // DDL.g:2145:5: TK_0= 'SECOND' (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
                    {
                    TK_0=(Token)match(input,80,FOLLOW_80_in_single_datetime_field2395); if (state.failed) return retval;
                    // DDL.g:2145:19: (TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')' )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==17) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // DDL.g:2145:21: TK_1= '(' NUMBERGen= NUMBER (TK_2= ',' NUMBERGen_1= NUMBER )? TK_3= ')'
                            {
                            TK_1=(Token)match(input,17,FOLLOW_17_in_single_datetime_field2401); if (state.failed) return retval;
                            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_single_datetime_field2406); if (state.failed) return retval;
                            // DDL.g:2145:48: (TK_2= ',' NUMBERGen_1= NUMBER )?
                            int alt96=2;
                            int LA96_0 = input.LA(1);

                            if ( (LA96_0==18) ) {
                                alt96=1;
                            }
                            switch (alt96) {
                                case 1 :
                                    // DDL.g:2145:50: TK_2= ',' NUMBERGen_1= NUMBER
                                    {
                                    TK_2=(Token)match(input,18,FOLLOW_18_in_single_datetime_field2412); if (state.failed) return retval;
                                    NUMBERGen_1=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_single_datetime_field2417); if (state.failed) return retval;

                                    }
                                    break;

                            }

                            TK_3=(Token)match(input,19,FOLLOW_19_in_single_datetime_field2424); if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      		// Create return CST Node
                      		Node single_datetime_fieldReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                      		single_datetime_fieldReturnNode.setKind("single_datetime_field");
                      	    // Create a Token CST Leaf	
                      	    if(TK_0 != null) {
                      			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
                      	 		single_datetime_fieldReturnNode.getChildren().add(TK_0Leaf);
                      	 	}
                      	    // Create a Token CST Leaf	
                      	    if(TK_1 != null) {
                      			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
                      	 		single_datetime_fieldReturnNode.getChildren().add(TK_1Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen != null) {
                      			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
                      			single_datetime_fieldReturnNode.getChildren().add(NUMBERGenLeaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_2 != null) {
                      			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
                      	 		single_datetime_fieldReturnNode.getChildren().add(TK_2Leaf);
                      	 	}
                      	    // Create a CST Leaf
                      		if(NUMBERGen_1 != null) {
                      			Leaf NUMBERGen_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen_1!=null?NUMBERGen_1.getText():null), NUMBERGen_1.getCharPositionInLine(), NUMBERGen_1.getLine());
                      			single_datetime_fieldReturnNode.getChildren().add(NUMBERGen_1Leaf);
                      		}
                      	    // Create a Token CST Leaf	
                      	    if(TK_3 != null) {
                      			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
                      	 		single_datetime_fieldReturnNode.getChildren().add(TK_3Leaf);
                      	 	}
                      		// Returns the Node with CST Leaves/Nodes
                      		retval.returnNode = single_datetime_fieldReturnNode;
                      	
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
    // $ANTLR end "single_datetime_field"

    // $ANTLR start synpred6_DDL
    public final void synpred6_DDL_fragment() throws RecognitionException {   
        Token TK_4=null;

        // DDL.g:98:117: (TK_4= ',' )
        // DDL.g:98:117: TK_4= ','
        {
        TK_4=(Token)match(input,18,FOLLOW_18_in_synpred6_DDL163); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_DDL

    // $ANTLR start synpred7_DDL
    public final void synpred7_DDL_fragment() throws RecognitionException {   
        Token TK_5=null;

        // DDL.g:98:146: (TK_5= ',' )
        // DDL.g:98:146: TK_5= ','
        {
        TK_5=(Token)match(input,18,FOLLOW_18_in_synpred7_DDL177); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_DDL

    // $ANTLR start synpred25_DDL
    public final void synpred25_DDL_fragment() throws RecognitionException {   
        Token TK_3=null;

        // DDL.g:264:161: (TK_3= ',' )
        // DDL.g:264:161: TK_3= ','
        {
        TK_3=(Token)match(input,18,FOLLOW_18_in_synpred25_DDL351); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_DDL

    // Delegated rules

    public final boolean synpred6_DDL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_DDL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_DDL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_DDL_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_data_definition_statement_in_data_definition49 = new BitSet(new long[]{0x0000000040004002L});
    public static final BitSet FOLLOW_database_in_data_definition_statement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_data_definition_statement87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_in_data_definition_statement99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_table121 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_LOG_CONJ_in_table127 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_table132 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_table139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_table144 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_table149 = new BitSet(new long[]{0x00000000040C0020L});
    public static final BitSet FOLLOW_column_in_table155 = new BitSet(new long[]{0x00000000040C0020L});
    public static final BitSet FOLLOW_18_in_table163 = new BitSet(new long[]{0x00000000040C0000L});
    public static final BitSet FOLLOW_chec_in_table171 = new BitSet(new long[]{0x00000000040C0000L});
    public static final BitSet FOLLOW_18_in_table177 = new BitSet(new long[]{0x00000000040C0000L});
    public static final BitSet FOLLOW_pk_in_table187 = new BitSet(new long[]{0x00000000040C0000L});
    public static final BitSet FOLLOW_18_in_table195 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_ck_in_table203 = new BitSet(new long[]{0x00000000040C0000L});
    public static final BitSet FOLLOW_18_in_table209 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_fk_in_table219 = new BitSet(new long[]{0x00000000040C0000L});
    public static final BitSet FOLLOW_18_in_table225 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_table234 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_20_in_table240 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_21_in_table248 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_22_in_table256 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_23_in_table264 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_table272 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_table278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column301 = new BitSet(new long[]{0xFFE2000000000000L,0x0000000000006FFFL});
    public static final BitSet FOLLOW_data_type_in_column306 = new BitSet(new long[]{0x000000003C040022L});
    public static final BitSet FOLLOW_26_in_column312 = new BitSet(new long[]{0x0000000038040022L});
    public static final BitSet FOLLOW_name_constraint_in_column320 = new BitSet(new long[]{0x0000000038040002L});
    public static final BitSet FOLLOW_27_in_column328 = new BitSet(new long[]{0x0000000020040002L});
    public static final BitSet FOLLOW_28_in_column335 = new BitSet(new long[]{0x0000000020040002L});
    public static final BitSet FOLLOW_defecto_in_column343 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_column351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_defecto375 = new BitSet(new long[]{0x00000000180000C0L});
    public static final BitSet FOLLOW_27_in_defecto381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_defecto388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_defecto395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CVALUE_in_defecto402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_alter_table426 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_references_in_alter_table431 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_alter_table_specification_in_alter_table436 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_18_in_alter_table442 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_alter_table_specification_in_alter_table447 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_25_in_alter_table454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_alter_table_specification477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_alter_table_specification482 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_alter_table_specification487 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_alter_table_specification492 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_column_list_in_alter_table_specification498 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_alter_table_specification505 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_alter_table_specification510 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_schema_references_in_alter_table_specification516 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_34_in_alter_table_specification524 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_references_in_alter_table_specification531 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_alter_table_specification536 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_references_column_list_in_alter_table_specification542 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_alter_table_specification549 = new BitSet(new long[]{0x000007F800000002L});
    public static final BitSet FOLLOW_35_in_alter_table_specification555 = new BitSet(new long[]{0x000007F000000002L});
    public static final BitSet FOLLOW_36_in_alter_table_specification563 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_37_in_alter_table_specification570 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_38_in_alter_table_specification578 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_39_in_alter_table_specification586 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_alter_table_specification594 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_alter_table_specification602 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_alter_table_specification610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_chec634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_chec639 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_chec644 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_chec649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_log_expresion_in_chec655 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_chec662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_fk685 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_fk690 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_fk695 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_fk700 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_column_list_in_fk706 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_fk713 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_fk718 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_schema_references_in_fk724 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_34_in_fk732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_references_in_fk739 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_fk744 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_references_column_list_in_fk750 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_fk757 = new BitSet(new long[]{0x000007F800000002L});
    public static final BitSet FOLLOW_35_in_fk763 = new BitSet(new long[]{0x000007F000000002L});
    public static final BitSet FOLLOW_36_in_fk771 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_37_in_fk778 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_38_in_fk786 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_39_in_fk794 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_fk802 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_fk810 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_fk818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_pk842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_pk847 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_pk852 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_pk857 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_column_list_in_pk863 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_pk870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ck893 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_ck898 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ck903 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ck908 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_column_list_in_ck914 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ck921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_chec943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_schema_references965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table_references987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name_constraint1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_references_column_list1031 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_references_column_list1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CVALUE_in_value_list1061 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_value_list1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_list1091 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_column_list1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_database1121 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_database1127 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_47_in_database1134 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_48_in_database1141 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_database1148 = new BitSet(new long[]{0x000A000022000000L});
    public static final BitSet FOLLOW_specification_in_database1154 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_database1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_specification1184 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_specification1191 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_specification1196 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_COMPARATOR_in_specification1202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_specification1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_specification1224 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_specification1231 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_COMPARATOR_in_specification1237 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_specification1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_chec_in_log_expresion1269 = new BitSet(new long[]{0x0010000000000100L});
    public static final BitSet FOLLOW_COMPARATOR_in_log_expresion1275 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_NUMBER_in_log_expresion1281 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CVALUE_in_log_expresion1288 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_LOG_CONJ_in_log_expresion1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_log_expresion1302 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_log_expresion1307 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_value_list_in_log_expresion1313 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_19_in_log_expresion1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_string_type_in_data_type1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_national_character_string_type_in_data_type1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bit_string_type_in_data_type1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_data_type1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datetime_type_in_data_type1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interval_type_in_data_type1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_character_string_type1425 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_character_string_type1431 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_character_string_type1436 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_character_string_type1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_character_string_type1455 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_character_string_type1461 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_character_string_type1466 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_character_string_type1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_character_string_type1485 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_character_string_type1490 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_character_string_type1495 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_character_string_type1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_character_string_type1512 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_character_string_type1517 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_character_string_type1522 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_character_string_type1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_character_string_type1539 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_character_string_type1544 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_character_string_type1549 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_character_string_type1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_national_character_string_type1577 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_national_character_string_type1583 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_national_character_string_type1588 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_national_character_string_type1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_national_character_string_type1607 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_national_character_string_type1613 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_national_character_string_type1618 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_national_character_string_type1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_national_character_string_type1637 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_national_character_string_type1643 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_national_character_string_type1648 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_national_character_string_type1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_national_character_string_type1667 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_national_character_string_type1672 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_national_character_string_type1677 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_national_character_string_type1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_national_character_string_type1694 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_national_character_string_type1699 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_national_character_string_type1704 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_national_character_string_type1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_national_character_string_type1721 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_national_character_string_type1726 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_national_character_string_type1731 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_national_character_string_type1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_bit_string_type1759 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_bit_string_type1765 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_bit_string_type1770 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_bit_string_type1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_bit_string_type1789 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_bit_string_type1794 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_bit_string_type1799 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_bit_string_type1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exact_numeric_type_in_numeric_type1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_approximate_numeric_type_in_numeric_type1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_exact_numeric_type1861 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_exact_numeric_type1867 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_exact_numeric_type1872 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_exact_numeric_type1878 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_exact_numeric_type1883 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_exact_numeric_type1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_exact_numeric_type1904 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_exact_numeric_type1910 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_exact_numeric_type1915 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_exact_numeric_type1921 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_exact_numeric_type1926 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_exact_numeric_type1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_exact_numeric_type1947 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_exact_numeric_type1953 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_exact_numeric_type1958 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_exact_numeric_type1964 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_exact_numeric_type1969 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_exact_numeric_type1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_exact_numeric_type1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_exact_numeric_type2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_exact_numeric_type2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_approximate_numeric_type2037 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_approximate_numeric_type2043 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_approximate_numeric_type2048 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_approximate_numeric_type2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_approximate_numeric_type2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_approximate_numeric_type2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_datetime_type2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_datetime_type2114 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001000L});
    public static final BitSet FOLLOW_17_in_datetime_type2120 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_datetime_type2125 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_datetime_type2130 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_datetime_type2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_datetime_type2152 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001000L});
    public static final BitSet FOLLOW_17_in_datetime_type2158 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_datetime_type2163 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_datetime_type2168 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_datetime_type2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_interval_type2201 = new BitSet(new long[]{0x0000000000000200L,0x0000000000010000L});
    public static final BitSet FOLLOW_interval_qualifier_in_interval_type2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_field_in_interval_qualifier2229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_interval_qualifier2234 = new BitSet(new long[]{0x0000000000000200L,0x0000000000010000L});
    public static final BitSet FOLLOW_end_field_in_interval_qualifier2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_datetime_field_in_interval_qualifier2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NON_SECOND_DATETIME_FIELD_in_start_field2273 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_start_field2279 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_start_field2284 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_start_field2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NON_SECOND_DATETIME_FIELD_in_end_field2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_end_field2325 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_end_field2331 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_end_field2336 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_end_field2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NON_SECOND_DATETIME_FIELD_in_single_datetime_field2365 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_single_datetime_field2371 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_single_datetime_field2376 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_single_datetime_field2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_single_datetime_field2395 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_single_datetime_field2401 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_single_datetime_field2406 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_single_datetime_field2412 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_single_datetime_field2417 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_single_datetime_field2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred6_DDL163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred7_DDL177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred25_DDL351 = new BitSet(new long[]{0x0000000000000002L});

}