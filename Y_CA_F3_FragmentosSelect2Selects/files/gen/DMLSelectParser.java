// $ANTLR 3.2 Sep 23, 2009 12:02:23 DMLSelect.g 2014-05-05 17:55:01

	import gts.modernization.model.CST.impl.*;
	import gts.modernization.model.CST.*;
	import java.util.Iterator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class DMLSelectParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SET_QUANTIFIER", "ID", "IDEXPRESSION", "PERIOD", "ASTERISK", "COMMA", "NULL_SPECIFICATION", "DEFAULT_SPECIFICATION", "UNSIGNED_INTEGER", "EQUALS_OPERATOR", "NOT_EQUALS_OPERATOR", "LESS_THAN_OPERATOR", "GREATER_THAN_OPERATOR", "LESS_THAN_OR_EQUALS_OPERATOR", "GREATER_THAN_OR_EQUALS_OPERATOR", "LEFT_PARENT", "RIGHT_PARENT", "ORDERING_SPECIFICATION", "TRUTH_VALUE", "WS", "'SELECT'", "'AS'", "'FROM'", "'WHERE'", "'GROUP BY'", "'HAVING'", "'OR'", "'AND'", "'NOT'", "'BETWEEN'", "'IN'", "'LIKE'", "'IS'", "'ORDER BY'"
    };
    public static final int IDEXPRESSION=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int LEFT_PARENT=19;
    public static final int DEFAULT_SPECIFICATION=11;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int PERIOD=7;
    public static final int LESS_THAN_OR_EQUALS_OPERATOR=17;
    public static final int RIGHT_PARENT=20;
    public static final int NULL_SPECIFICATION=10;
    public static final int ID=5;
    public static final int EOF=-1;
    public static final int EQUALS_OPERATOR=13;
    public static final int ASTERISK=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int UNSIGNED_INTEGER=12;
    public static final int T__32=32;
    public static final int WS=23;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int GREATER_THAN_OPERATOR=16;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int COMMA=9;
    public static final int ORDERING_SPECIFICATION=21;
    public static final int LESS_THAN_OPERATOR=15;
    public static final int SET_QUANTIFIER=4;
    public static final int GREATER_THAN_OR_EQUALS_OPERATOR=18;
    public static final int NOT_EQUALS_OPERATOR=14;
    public static final int TRUTH_VALUE=22;

    // delegates
    // delegators


        public DMLSelectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DMLSelectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("DMLSelectParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return DMLSelectParser.tokenNames; }
    public String getGrammarFileName() { return "DMLSelect.g"; }


    public static class statements_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statements"
    // DMLSelect.g:19:1: statements returns [Node returnNode] : (query_specificationGen+= query_specification )* ;
    public final DMLSelectParser.statements_return statements() throws RecognitionException {
        DMLSelectParser.statements_return retval = new DMLSelectParser.statements_return();
        retval.start = input.LT(1);

        List list_query_specificationGen=null;
        RuleReturnScope query_specificationGen = null;
        try {
            // DMLSelect.g:20:1: ( (query_specificationGen+= query_specification )* )
            // DMLSelect.g:20:4: (query_specificationGen+= query_specification )*
            {
            // DMLSelect.g:20:26: (query_specificationGen+= query_specification )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // DMLSelect.g:20:26: query_specificationGen+= query_specification
            	    {
            	    pushFollow(FOLLOW_query_specification_in_statements42);
            	    query_specificationGen=query_specification();

            	    state._fsp--;

            	    if (list_query_specificationGen==null) list_query_specificationGen=new ArrayList();
            	    list_query_specificationGen.add(query_specificationGen);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            		// Create return CST Node
            		Node statementsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		statementsReturnNode.setKind("statements");
            	    // Create a CST Node
            		if(list_query_specificationGen != null) {
            	        for(Iterator it = list_query_specificationGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.query_specification_return r = (DMLSelectParser.query_specification_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("query_specification");
            	            	statementsReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = statementsReturnNode;
            	

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
    // $ANTLR end "statements"

    public static class query_specification_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "query_specification"
    // DMLSelect.g:40:1: query_specification returns [Node returnNode] : TK_0= 'SELECT' (SET_QUANTIFIERGen= SET_QUANTIFIER )? ( (IDGen= ID | IDEXPRESSIONGen= IDEXPRESSION | PERIODGen= PERIOD | ASTERISKGen= ASTERISK | COMMAGen= COMMA ) (TK_1= 'AS' )? )* table_expressionGen+= table_expression ;
    public final DMLSelectParser.query_specification_return query_specification() throws RecognitionException {
        DMLSelectParser.query_specification_return retval = new DMLSelectParser.query_specification_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token SET_QUANTIFIERGen=null;
        Token IDGen=null;
        Token IDEXPRESSIONGen=null;
        Token PERIODGen=null;
        Token ASTERISKGen=null;
        Token COMMAGen=null;
        Token TK_1=null;
        List list_table_expressionGen=null;
        RuleReturnScope table_expressionGen = null;
        try {
            // DMLSelect.g:41:1: (TK_0= 'SELECT' (SET_QUANTIFIERGen= SET_QUANTIFIER )? ( (IDGen= ID | IDEXPRESSIONGen= IDEXPRESSION | PERIODGen= PERIOD | ASTERISKGen= ASTERISK | COMMAGen= COMMA ) (TK_1= 'AS' )? )* table_expressionGen+= table_expression )
            // DMLSelect.g:41:4: TK_0= 'SELECT' (SET_QUANTIFIERGen= SET_QUANTIFIER )? ( (IDGen= ID | IDEXPRESSIONGen= IDEXPRESSION | PERIODGen= PERIOD | ASTERISKGen= ASTERISK | COMMAGen= COMMA ) (TK_1= 'AS' )? )* table_expressionGen+= table_expression
            {
            TK_0=(Token)match(input,24,FOLLOW_24_in_query_specification65); 
            // DMLSelect.g:41:18: (SET_QUANTIFIERGen= SET_QUANTIFIER )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SET_QUANTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // DMLSelect.g:41:20: SET_QUANTIFIERGen= SET_QUANTIFIER
                    {
                    SET_QUANTIFIERGen=(Token)match(input,SET_QUANTIFIER,FOLLOW_SET_QUANTIFIER_in_query_specification71); 

                    }
                    break;

            }

            // DMLSelect.g:41:55: ( (IDGen= ID | IDEXPRESSIONGen= IDEXPRESSION | PERIODGen= PERIOD | ASTERISKGen= ASTERISK | COMMAGen= COMMA ) (TK_1= 'AS' )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=ID && LA5_0<=COMMA)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // DMLSelect.g:41:56: (IDGen= ID | IDEXPRESSIONGen= IDEXPRESSION | PERIODGen= PERIOD | ASTERISKGen= ASTERISK | COMMAGen= COMMA ) (TK_1= 'AS' )?
            	    {
            	    // DMLSelect.g:41:56: (IDGen= ID | IDEXPRESSIONGen= IDEXPRESSION | PERIODGen= PERIOD | ASTERISKGen= ASTERISK | COMMAGen= COMMA )
            	    int alt3=5;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case IDEXPRESSION:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case PERIOD:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case ASTERISK:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    case COMMA:
            	        {
            	        alt3=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // DMLSelect.g:41:58: IDGen= ID
            	            {
            	            IDGen=(Token)match(input,ID,FOLLOW_ID_in_query_specification80); 

            	            }
            	            break;
            	        case 2 :
            	            // DMLSelect.g:41:70: IDEXPRESSIONGen= IDEXPRESSION
            	            {
            	            IDEXPRESSIONGen=(Token)match(input,IDEXPRESSION,FOLLOW_IDEXPRESSION_in_query_specification87); 

            	            }
            	            break;
            	        case 3 :
            	            // DMLSelect.g:41:102: PERIODGen= PERIOD
            	            {
            	            PERIODGen=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_query_specification94); 

            	            }
            	            break;
            	        case 4 :
            	            // DMLSelect.g:41:121: ASTERISKGen= ASTERISK
            	            {
            	            ASTERISKGen=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_query_specification100); 

            	            }
            	            break;
            	        case 5 :
            	            // DMLSelect.g:41:145: COMMAGen= COMMA
            	            {
            	            COMMAGen=(Token)match(input,COMMA,FOLLOW_COMMA_in_query_specification107); 

            	            }
            	            break;

            	    }

            	    // DMLSelect.g:41:161: (TK_1= 'AS' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==25) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // DMLSelect.g:41:163: TK_1= 'AS'
            	            {
            	            TK_1=(Token)match(input,25,FOLLOW_25_in_query_specification114); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            pushFollow(FOLLOW_table_expression_in_query_specification124);
            table_expressionGen=table_expression();

            state._fsp--;

            if (list_table_expressionGen==null) list_table_expressionGen=new ArrayList();
            list_table_expressionGen.add(table_expressionGen);


            		// Create return CST Node
            		Node query_specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		query_specificationReturnNode.setKind("query_specification");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		query_specificationReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(SET_QUANTIFIERGen != null) {
            			Leaf SET_QUANTIFIERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("SET_QUANTIFIER", (SET_QUANTIFIERGen!=null?SET_QUANTIFIERGen.getText():null), SET_QUANTIFIERGen.getCharPositionInLine(), SET_QUANTIFIERGen.getLine());
            			query_specificationReturnNode.getChildren().add(SET_QUANTIFIERGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			query_specificationReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(IDEXPRESSIONGen != null) {
            			Leaf IDEXPRESSIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("IDEXPRESSION", (IDEXPRESSIONGen!=null?IDEXPRESSIONGen.getText():null), IDEXPRESSIONGen.getCharPositionInLine(), IDEXPRESSIONGen.getLine());
            			query_specificationReturnNode.getChildren().add(IDEXPRESSIONGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(PERIODGen != null) {
            			Leaf PERIODGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("PERIOD", (PERIODGen!=null?PERIODGen.getText():null), PERIODGen.getCharPositionInLine(), PERIODGen.getLine());
            			query_specificationReturnNode.getChildren().add(PERIODGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(ASTERISKGen != null) {
            			Leaf ASTERISKGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ASTERISK", (ASTERISKGen!=null?ASTERISKGen.getText():null), ASTERISKGen.getCharPositionInLine(), ASTERISKGen.getLine());
            			query_specificationReturnNode.getChildren().add(ASTERISKGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(COMMAGen != null) {
            			Leaf COMMAGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMMA", (COMMAGen!=null?COMMAGen.getText():null), COMMAGen.getCharPositionInLine(), COMMAGen.getLine());
            			query_specificationReturnNode.getChildren().add(COMMAGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		query_specificationReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_table_expressionGen != null) {
            	        for(Iterator it = list_table_expressionGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.table_expression_return r = (DMLSelectParser.table_expression_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("table_expression");
            	            	query_specificationReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = query_specificationReturnNode;
            	

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
    // $ANTLR end "query_specification"

    public static class derived_column_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "derived_column"
    // DMLSelect.g:101:1: derived_column returns [Node returnNode] : column_referenceGen+= column_reference (as_clauseGen+= as_clause )? ;
    public final DMLSelectParser.derived_column_return derived_column() throws RecognitionException {
        DMLSelectParser.derived_column_return retval = new DMLSelectParser.derived_column_return();
        retval.start = input.LT(1);

        List list_column_referenceGen=null;
        List list_as_clauseGen=null;
        RuleReturnScope column_referenceGen = null;
        RuleReturnScope as_clauseGen = null;
        try {
            // DMLSelect.g:102:1: (column_referenceGen+= column_reference (as_clauseGen+= as_clause )? )
            // DMLSelect.g:102:4: column_referenceGen+= column_reference (as_clauseGen+= as_clause )?
            {
            pushFollow(FOLLOW_column_reference_in_derived_column147);
            column_referenceGen=column_reference();

            state._fsp--;

            if (list_column_referenceGen==null) list_column_referenceGen=new ArrayList();
            list_column_referenceGen.add(column_referenceGen);

            // DMLSelect.g:102:42: (as_clauseGen+= as_clause )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID||LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // DMLSelect.g:102:44: as_clauseGen+= as_clause
                    {
                    pushFollow(FOLLOW_as_clause_in_derived_column153);
                    as_clauseGen=as_clause();

                    state._fsp--;

                    if (list_as_clauseGen==null) list_as_clauseGen=new ArrayList();
                    list_as_clauseGen.add(as_clauseGen);


                    }
                    break;

            }


            		// Create return CST Node
            		Node derived_columnReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		derived_columnReturnNode.setKind("derived_column");
            	    // Create a CST Node
            		if(list_column_referenceGen != null) {
            	        for(Iterator it = list_column_referenceGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.column_reference_return r = (DMLSelectParser.column_reference_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("column_reference");
            	            	derived_columnReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_as_clauseGen != null) {
            	        for(Iterator it = list_as_clauseGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.as_clause_return r = (DMLSelectParser.as_clause_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("as_clause");
            	            	derived_columnReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = derived_columnReturnNode;
            	

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
    // $ANTLR end "derived_column"

    public static class as_clause_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "as_clause"
    // DMLSelect.g:132:1: as_clause returns [Node returnNode] : (TK_0= 'AS' )? column_nameGen+= column_name ;
    public final DMLSelectParser.as_clause_return as_clause() throws RecognitionException {
        DMLSelectParser.as_clause_return retval = new DMLSelectParser.as_clause_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_column_nameGen=null;
        RuleReturnScope column_nameGen = null;
        try {
            // DMLSelect.g:133:1: ( (TK_0= 'AS' )? column_nameGen+= column_name )
            // DMLSelect.g:133:3: (TK_0= 'AS' )? column_nameGen+= column_name
            {
            // DMLSelect.g:133:3: (TK_0= 'AS' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // DMLSelect.g:133:5: TK_0= 'AS'
                    {
                    TK_0=(Token)match(input,25,FOLLOW_25_in_as_clause179); 

                    }
                    break;

            }

            pushFollow(FOLLOW_column_name_in_as_clause186);
            column_nameGen=column_name();

            state._fsp--;

            if (list_column_nameGen==null) list_column_nameGen=new ArrayList();
            list_column_nameGen.add(column_nameGen);


            		// Create return CST Node
            		Node as_clauseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		as_clauseReturnNode.setKind("as_clause");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		as_clauseReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_column_nameGen != null) {
            	        for(Iterator it = list_column_nameGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.column_name_return r = (DMLSelectParser.column_name_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("column_name");
            	            	as_clauseReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = as_clauseReturnNode;
            	

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
    // $ANTLR end "as_clause"

    public static class expression_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // DMLSelect.g:158:1: expression returns [Node returnNode] : IDEXPRESSIONGen= IDEXPRESSION (as_clauseGen+= as_clause )? ;
    public final DMLSelectParser.expression_return expression() throws RecognitionException {
        DMLSelectParser.expression_return retval = new DMLSelectParser.expression_return();
        retval.start = input.LT(1);

        Token IDEXPRESSIONGen=null;
        List list_as_clauseGen=null;
        RuleReturnScope as_clauseGen = null;
        try {
            // DMLSelect.g:159:1: (IDEXPRESSIONGen= IDEXPRESSION (as_clauseGen+= as_clause )? )
            // DMLSelect.g:159:4: IDEXPRESSIONGen= IDEXPRESSION (as_clauseGen+= as_clause )?
            {
            IDEXPRESSIONGen=(Token)match(input,IDEXPRESSION,FOLLOW_IDEXPRESSION_in_expression209); 
            // DMLSelect.g:159:33: (as_clauseGen+= as_clause )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // DMLSelect.g:159:35: as_clauseGen+= as_clause
                    {
                    pushFollow(FOLLOW_as_clause_in_expression215);
                    as_clauseGen=as_clause();

                    state._fsp--;

                    if (list_as_clauseGen==null) list_as_clauseGen=new ArrayList();
                    list_as_clauseGen.add(as_clauseGen);


                    }
                    break;

            }


            		// Create return CST Node
            		Node expressionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		expressionReturnNode.setKind("expression");
            	    // Create a CST Leaf
            		if(IDEXPRESSIONGen != null) {
            			Leaf IDEXPRESSIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("IDEXPRESSION", (IDEXPRESSIONGen!=null?IDEXPRESSIONGen.getText():null), IDEXPRESSIONGen.getCharPositionInLine(), IDEXPRESSIONGen.getLine());
            			expressionReturnNode.getChildren().add(IDEXPRESSIONGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_as_clauseGen != null) {
            	        for(Iterator it = list_as_clauseGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.as_clause_return r = (DMLSelectParser.as_clause_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("as_clause");
            	            	expressionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = expressionReturnNode;
            	

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
    // $ANTLR end "expression"

    public static class column_name_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "column_name"
    // DMLSelect.g:184:1: column_name returns [Node returnNode] : IDGen= ID ;
    public final DMLSelectParser.column_name_return column_name() throws RecognitionException {
        DMLSelectParser.column_name_return retval = new DMLSelectParser.column_name_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // DMLSelect.g:185:1: (IDGen= ID )
            // DMLSelect.g:185:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_column_name239); 

            		// Create return CST Node
            		Node column_nameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		column_nameReturnNode.setKind("column_name");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			column_nameReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = column_nameReturnNode;
            	

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
    // $ANTLR end "column_name"

    public static class table_expression_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "table_expression"
    // DMLSelect.g:200:1: table_expression returns [Node returnNode] : from_clauseGen+= from_clause (where_clauseGen+= where_clause )? (group_by_clauseGen+= group_by_clause )? (having_clauseGen+= having_clause )? (order_by_clauseGen+= order_by_clause )? ;
    public final DMLSelectParser.table_expression_return table_expression() throws RecognitionException {
        DMLSelectParser.table_expression_return retval = new DMLSelectParser.table_expression_return();
        retval.start = input.LT(1);

        List list_from_clauseGen=null;
        List list_where_clauseGen=null;
        List list_group_by_clauseGen=null;
        List list_having_clauseGen=null;
        List list_order_by_clauseGen=null;
        RuleReturnScope from_clauseGen = null;
        RuleReturnScope where_clauseGen = null;
        RuleReturnScope group_by_clauseGen = null;
        RuleReturnScope having_clauseGen = null;
        RuleReturnScope order_by_clauseGen = null;
        try {
            // DMLSelect.g:201:1: (from_clauseGen+= from_clause (where_clauseGen+= where_clause )? (group_by_clauseGen+= group_by_clause )? (having_clauseGen+= having_clause )? (order_by_clauseGen+= order_by_clause )? )
            // DMLSelect.g:201:4: from_clauseGen+= from_clause (where_clauseGen+= where_clause )? (group_by_clauseGen+= group_by_clause )? (having_clauseGen+= having_clause )? (order_by_clauseGen+= order_by_clause )?
            {
            pushFollow(FOLLOW_from_clause_in_table_expression261);
            from_clauseGen=from_clause();

            state._fsp--;

            if (list_from_clauseGen==null) list_from_clauseGen=new ArrayList();
            list_from_clauseGen.add(from_clauseGen);

            // DMLSelect.g:201:32: (where_clauseGen+= where_clause )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // DMLSelect.g:201:34: where_clauseGen+= where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_table_expression267);
                    where_clauseGen=where_clause();

                    state._fsp--;

                    if (list_where_clauseGen==null) list_where_clauseGen=new ArrayList();
                    list_where_clauseGen.add(where_clauseGen);


                    }
                    break;

            }

            // DMLSelect.g:201:66: (group_by_clauseGen+= group_by_clause )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // DMLSelect.g:201:68: group_by_clauseGen+= group_by_clause
                    {
                    pushFollow(FOLLOW_group_by_clause_in_table_expression275);
                    group_by_clauseGen=group_by_clause();

                    state._fsp--;

                    if (list_group_by_clauseGen==null) list_group_by_clauseGen=new ArrayList();
                    list_group_by_clauseGen.add(group_by_clauseGen);


                    }
                    break;

            }

            // DMLSelect.g:201:106: (having_clauseGen+= having_clause )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // DMLSelect.g:201:108: having_clauseGen+= having_clause
                    {
                    pushFollow(FOLLOW_having_clause_in_table_expression283);
                    having_clauseGen=having_clause();

                    state._fsp--;

                    if (list_having_clauseGen==null) list_having_clauseGen=new ArrayList();
                    list_having_clauseGen.add(having_clauseGen);


                    }
                    break;

            }

            // DMLSelect.g:201:142: (order_by_clauseGen+= order_by_clause )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // DMLSelect.g:201:144: order_by_clauseGen+= order_by_clause
                    {
                    pushFollow(FOLLOW_order_by_clause_in_table_expression291);
                    order_by_clauseGen=order_by_clause();

                    state._fsp--;

                    if (list_order_by_clauseGen==null) list_order_by_clauseGen=new ArrayList();
                    list_order_by_clauseGen.add(order_by_clauseGen);


                    }
                    break;

            }


            		// Create return CST Node
            		Node table_expressionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		table_expressionReturnNode.setKind("table_expression");
            	    // Create a CST Node
            		if(list_from_clauseGen != null) {
            	        for(Iterator it = list_from_clauseGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.from_clause_return r = (DMLSelectParser.from_clause_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("from_clause");
            	            	table_expressionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_where_clauseGen != null) {
            	        for(Iterator it = list_where_clauseGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.where_clause_return r = (DMLSelectParser.where_clause_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("where_clause");
            	            	table_expressionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_group_by_clauseGen != null) {
            	        for(Iterator it = list_group_by_clauseGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.group_by_clause_return r = (DMLSelectParser.group_by_clause_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("group_by_clause");
            	            	table_expressionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_having_clauseGen != null) {
            	        for(Iterator it = list_having_clauseGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.having_clause_return r = (DMLSelectParser.having_clause_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("having_clause");
            	            	table_expressionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_order_by_clauseGen != null) {
            	        for(Iterator it = list_order_by_clauseGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.order_by_clause_return r = (DMLSelectParser.order_by_clause_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("order_by_clause");
            	            	table_expressionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = table_expressionReturnNode;
            	

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
    // $ANTLR end "table_expression"

    public static class from_clause_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "from_clause"
    // DMLSelect.g:261:1: from_clause returns [Node returnNode] : TK_0= 'FROM' table_referenceGen+= table_reference (COMMAGen_List+= COMMA table_referenceGen_1+= table_reference )* ;
    public final DMLSelectParser.from_clause_return from_clause() throws RecognitionException {
        DMLSelectParser.from_clause_return retval = new DMLSelectParser.from_clause_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token COMMAGen_List=null;
        List list_COMMAGen_List=null;
        List list_table_referenceGen=null;
        List list_table_referenceGen_1=null;
        RuleReturnScope table_referenceGen = null;
        RuleReturnScope table_referenceGen_1 = null;
        try {
            // DMLSelect.g:262:1: (TK_0= 'FROM' table_referenceGen+= table_reference (COMMAGen_List+= COMMA table_referenceGen_1+= table_reference )* )
            // DMLSelect.g:262:4: TK_0= 'FROM' table_referenceGen+= table_reference (COMMAGen_List+= COMMA table_referenceGen_1+= table_reference )*
            {
            TK_0=(Token)match(input,26,FOLLOW_26_in_from_clause315); 
            pushFollow(FOLLOW_table_reference_in_from_clause320);
            table_referenceGen=table_reference();

            state._fsp--;

            if (list_table_referenceGen==null) list_table_referenceGen=new ArrayList();
            list_table_referenceGen.add(table_referenceGen);

            // DMLSelect.g:262:53: (COMMAGen_List+= COMMA table_referenceGen_1+= table_reference )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // DMLSelect.g:262:55: COMMAGen_List+= COMMA table_referenceGen_1+= table_reference
            	    {
            	    COMMAGen_List=(Token)match(input,COMMA,FOLLOW_COMMA_in_from_clause326); 
            	    if (list_COMMAGen_List==null) list_COMMAGen_List=new ArrayList();
            	    list_COMMAGen_List.add(COMMAGen_List);

            	    pushFollow(FOLLOW_table_reference_in_from_clause331);
            	    table_referenceGen_1=table_reference();

            	    state._fsp--;

            	    if (list_table_referenceGen_1==null) list_table_referenceGen_1=new ArrayList();
            	    list_table_referenceGen_1.add(table_referenceGen_1);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            		// Create return CST Node
            		Node from_clauseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		from_clauseReturnNode.setKind("from_clause");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		from_clauseReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_table_referenceGen != null) {
            	        for(Iterator it = list_table_referenceGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.table_reference_return r = (DMLSelectParser.table_reference_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("table_reference");
            	            	from_clauseReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal COMMAGen_List aggregation
            		if(list_COMMAGen_List != null) {
            	    for(int pos = 0; pos < list_COMMAGen_List.size(); pos++ )  { 
            		// Terminal extractor
            	    if(list_COMMAGen_List != null) {
            		    Token t = (Token) list_COMMAGen_List.get(pos); 
            		    Leaf COMMAGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMMA", t.getText(), t.getCharPositionInLine(), t.getLine());
            			from_clauseReturnNode.getChildren().add(COMMAGen_ListLeaf);
            		}
            		// No Terminal extractor
            	    if(list_table_referenceGen_1 != null) {		
            	    	DMLSelectParser.table_reference_return r = (DMLSelectParser.table_reference_return) list_table_referenceGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("table_reference");
            	    		from_clauseReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = from_clauseReturnNode;
            	

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
    // $ANTLR end "from_clause"

    public static class table_reference_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "table_reference"
    // DMLSelect.g:308:1: table_reference returns [Node returnNode] : table_nameGen+= table_name (correlation_specificationGen+= correlation_specification )? ;
    public final DMLSelectParser.table_reference_return table_reference() throws RecognitionException {
        DMLSelectParser.table_reference_return retval = new DMLSelectParser.table_reference_return();
        retval.start = input.LT(1);

        List list_table_nameGen=null;
        List list_correlation_specificationGen=null;
        RuleReturnScope table_nameGen = null;
        RuleReturnScope correlation_specificationGen = null;
        try {
            // DMLSelect.g:309:1: (table_nameGen+= table_name (correlation_specificationGen+= correlation_specification )? )
            // DMLSelect.g:309:4: table_nameGen+= table_name (correlation_specificationGen+= correlation_specification )?
            {
            pushFollow(FOLLOW_table_name_in_table_reference355);
            table_nameGen=table_name();

            state._fsp--;

            if (list_table_nameGen==null) list_table_nameGen=new ArrayList();
            list_table_nameGen.add(table_nameGen);

            // DMLSelect.g:309:30: (correlation_specificationGen+= correlation_specification )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID||LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // DMLSelect.g:309:32: correlation_specificationGen+= correlation_specification
                    {
                    pushFollow(FOLLOW_correlation_specification_in_table_reference361);
                    correlation_specificationGen=correlation_specification();

                    state._fsp--;

                    if (list_correlation_specificationGen==null) list_correlation_specificationGen=new ArrayList();
                    list_correlation_specificationGen.add(correlation_specificationGen);


                    }
                    break;

            }


            		// Create return CST Node
            		Node table_referenceReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		table_referenceReturnNode.setKind("table_reference");
            	    // Create a CST Node
            		if(list_table_nameGen != null) {
            	        for(Iterator it = list_table_nameGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.table_name_return r = (DMLSelectParser.table_name_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("table_name");
            	            	table_referenceReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_correlation_specificationGen != null) {
            	        for(Iterator it = list_correlation_specificationGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.correlation_specification_return r = (DMLSelectParser.correlation_specification_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("correlation_specification");
            	            	table_referenceReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = table_referenceReturnNode;
            	

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
    // $ANTLR end "table_reference"

    public static class table_name_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "table_name"
    // DMLSelect.g:339:1: table_name returns [Node returnNode] : IDGen= ID ;
    public final DMLSelectParser.table_name_return table_name() throws RecognitionException {
        DMLSelectParser.table_name_return retval = new DMLSelectParser.table_name_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // DMLSelect.g:340:1: (IDGen= ID )
            // DMLSelect.g:340:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_table_name385); 

            		// Create return CST Node
            		Node table_nameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		table_nameReturnNode.setKind("table_name");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			table_nameReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = table_nameReturnNode;
            	

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
    // $ANTLR end "table_name"

    public static class correlation_specification_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "correlation_specification"
    // DMLSelect.g:355:1: correlation_specification returns [Node returnNode] : (TK_0= 'AS' )? correlation_nameGen+= correlation_name ;
    public final DMLSelectParser.correlation_specification_return correlation_specification() throws RecognitionException {
        DMLSelectParser.correlation_specification_return retval = new DMLSelectParser.correlation_specification_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_correlation_nameGen=null;
        RuleReturnScope correlation_nameGen = null;
        try {
            // DMLSelect.g:356:1: ( (TK_0= 'AS' )? correlation_nameGen+= correlation_name )
            // DMLSelect.g:356:4: (TK_0= 'AS' )? correlation_nameGen+= correlation_name
            {
            // DMLSelect.g:356:4: (TK_0= 'AS' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // DMLSelect.g:356:6: TK_0= 'AS'
                    {
                    TK_0=(Token)match(input,25,FOLLOW_25_in_correlation_specification410); 

                    }
                    break;

            }

            pushFollow(FOLLOW_correlation_name_in_correlation_specification417);
            correlation_nameGen=correlation_name();

            state._fsp--;

            if (list_correlation_nameGen==null) list_correlation_nameGen=new ArrayList();
            list_correlation_nameGen.add(correlation_nameGen);


            		// Create return CST Node
            		Node correlation_specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		correlation_specificationReturnNode.setKind("correlation_specification");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		correlation_specificationReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_correlation_nameGen != null) {
            	        for(Iterator it = list_correlation_nameGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.correlation_name_return r = (DMLSelectParser.correlation_name_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("correlation_name");
            	            	correlation_specificationReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = correlation_specificationReturnNode;
            	

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
    // $ANTLR end "correlation_specification"

    public static class correlation_name_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "correlation_name"
    // DMLSelect.g:381:1: correlation_name returns [Node returnNode] : IDGen= ID ;
    public final DMLSelectParser.correlation_name_return correlation_name() throws RecognitionException {
        DMLSelectParser.correlation_name_return retval = new DMLSelectParser.correlation_name_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // DMLSelect.g:382:1: (IDGen= ID )
            // DMLSelect.g:382:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_correlation_name439); 

            		// Create return CST Node
            		Node correlation_nameReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		correlation_nameReturnNode.setKind("correlation_name");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			correlation_nameReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = correlation_nameReturnNode;
            	

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
    // $ANTLR end "correlation_name"

    public static class where_clause_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "where_clause"
    // DMLSelect.g:397:1: where_clause returns [Node returnNode] : TK_0= 'WHERE' search_conditionGen+= search_condition ;
    public final DMLSelectParser.where_clause_return where_clause() throws RecognitionException {
        DMLSelectParser.where_clause_return retval = new DMLSelectParser.where_clause_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_search_conditionGen=null;
        RuleReturnScope search_conditionGen = null;
        try {
            // DMLSelect.g:398:1: (TK_0= 'WHERE' search_conditionGen+= search_condition )
            // DMLSelect.g:398:4: TK_0= 'WHERE' search_conditionGen+= search_condition
            {
            TK_0=(Token)match(input,27,FOLLOW_27_in_where_clause461); 
            pushFollow(FOLLOW_search_condition_in_where_clause466);
            search_conditionGen=search_condition();

            state._fsp--;

            if (list_search_conditionGen==null) list_search_conditionGen=new ArrayList();
            list_search_conditionGen.add(search_conditionGen);


            		// Create return CST Node
            		Node where_clauseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		where_clauseReturnNode.setKind("where_clause");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		where_clauseReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_search_conditionGen != null) {
            	        for(Iterator it = list_search_conditionGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.search_condition_return r = (DMLSelectParser.search_condition_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("search_condition");
            	            	where_clauseReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = where_clauseReturnNode;
            	

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
    // $ANTLR end "where_clause"

    public static class group_by_clause_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "group_by_clause"
    // DMLSelect.g:423:1: group_by_clause returns [Node returnNode] : TK_0= 'GROUP BY' (grouping_column_reference_listGen+= grouping_column_reference_list )? ;
    public final DMLSelectParser.group_by_clause_return group_by_clause() throws RecognitionException {
        DMLSelectParser.group_by_clause_return retval = new DMLSelectParser.group_by_clause_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_grouping_column_reference_listGen=null;
        RuleReturnScope grouping_column_reference_listGen = null;
        try {
            // DMLSelect.g:424:1: (TK_0= 'GROUP BY' (grouping_column_reference_listGen+= grouping_column_reference_list )? )
            // DMLSelect.g:424:4: TK_0= 'GROUP BY' (grouping_column_reference_listGen+= grouping_column_reference_list )?
            {
            TK_0=(Token)match(input,28,FOLLOW_28_in_group_by_clause488); 
            // DMLSelect.g:424:20: (grouping_column_reference_listGen+= grouping_column_reference_list )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // DMLSelect.g:424:22: grouping_column_reference_listGen+= grouping_column_reference_list
                    {
                    pushFollow(FOLLOW_grouping_column_reference_list_in_group_by_clause494);
                    grouping_column_reference_listGen=grouping_column_reference_list();

                    state._fsp--;

                    if (list_grouping_column_reference_listGen==null) list_grouping_column_reference_listGen=new ArrayList();
                    list_grouping_column_reference_listGen.add(grouping_column_reference_listGen);


                    }
                    break;

            }


            		// Create return CST Node
            		Node group_by_clauseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		group_by_clauseReturnNode.setKind("group_by_clause");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		group_by_clauseReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_grouping_column_reference_listGen != null) {
            	        for(Iterator it = list_grouping_column_reference_listGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.grouping_column_reference_list_return r = (DMLSelectParser.grouping_column_reference_list_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("grouping_column_reference_list");
            	            	group_by_clauseReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = group_by_clauseReturnNode;
            	

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
    // $ANTLR end "group_by_clause"

    public static class grouping_column_reference_list_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "grouping_column_reference_list"
    // DMLSelect.g:449:1: grouping_column_reference_list returns [Node returnNode] : grouping_column_referenceGen+= grouping_column_reference (COMMAGen_List+= COMMA grouping_column_referenceGen_1+= grouping_column_reference )* ;
    public final DMLSelectParser.grouping_column_reference_list_return grouping_column_reference_list() throws RecognitionException {
        DMLSelectParser.grouping_column_reference_list_return retval = new DMLSelectParser.grouping_column_reference_list_return();
        retval.start = input.LT(1);

        Token COMMAGen_List=null;
        List list_COMMAGen_List=null;
        List list_grouping_column_referenceGen=null;
        List list_grouping_column_referenceGen_1=null;
        RuleReturnScope grouping_column_referenceGen = null;
        RuleReturnScope grouping_column_referenceGen_1 = null;
        try {
            // DMLSelect.g:450:1: (grouping_column_referenceGen+= grouping_column_reference (COMMAGen_List+= COMMA grouping_column_referenceGen_1+= grouping_column_reference )* )
            // DMLSelect.g:450:4: grouping_column_referenceGen+= grouping_column_reference (COMMAGen_List+= COMMA grouping_column_referenceGen_1+= grouping_column_reference )*
            {
            pushFollow(FOLLOW_grouping_column_reference_in_grouping_column_reference_list518);
            grouping_column_referenceGen=grouping_column_reference();

            state._fsp--;

            if (list_grouping_column_referenceGen==null) list_grouping_column_referenceGen=new ArrayList();
            list_grouping_column_referenceGen.add(grouping_column_referenceGen);

            // DMLSelect.g:450:60: (COMMAGen_List+= COMMA grouping_column_referenceGen_1+= grouping_column_reference )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // DMLSelect.g:450:62: COMMAGen_List+= COMMA grouping_column_referenceGen_1+= grouping_column_reference
            	    {
            	    COMMAGen_List=(Token)match(input,COMMA,FOLLOW_COMMA_in_grouping_column_reference_list524); 
            	    if (list_COMMAGen_List==null) list_COMMAGen_List=new ArrayList();
            	    list_COMMAGen_List.add(COMMAGen_List);

            	    pushFollow(FOLLOW_grouping_column_reference_in_grouping_column_reference_list529);
            	    grouping_column_referenceGen_1=grouping_column_reference();

            	    state._fsp--;

            	    if (list_grouping_column_referenceGen_1==null) list_grouping_column_referenceGen_1=new ArrayList();
            	    list_grouping_column_referenceGen_1.add(grouping_column_referenceGen_1);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            		// Create return CST Node
            		Node grouping_column_reference_listReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		grouping_column_reference_listReturnNode.setKind("grouping_column_reference_list");
            	    // Create a CST Node
            		if(list_grouping_column_referenceGen != null) {
            	        for(Iterator it = list_grouping_column_referenceGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.grouping_column_reference_return r = (DMLSelectParser.grouping_column_reference_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("grouping_column_reference");
            	            	grouping_column_reference_listReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal COMMAGen_List aggregation
            		if(list_COMMAGen_List != null) {
            	    for(int pos = 0; pos < list_COMMAGen_List.size(); pos++ )  { 
            		// Terminal extractor
            	    if(list_COMMAGen_List != null) {
            		    Token t = (Token) list_COMMAGen_List.get(pos); 
            		    Leaf COMMAGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMMA", t.getText(), t.getCharPositionInLine(), t.getLine());
            			grouping_column_reference_listReturnNode.getChildren().add(COMMAGen_ListLeaf);
            		}
            		// No Terminal extractor
            	    if(list_grouping_column_referenceGen_1 != null) {		
            	    	DMLSelectParser.grouping_column_reference_return r = (DMLSelectParser.grouping_column_reference_return) list_grouping_column_referenceGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("grouping_column_reference");
            	    		grouping_column_reference_listReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = grouping_column_reference_listReturnNode;
            	

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
    // $ANTLR end "grouping_column_reference_list"

    public static class grouping_column_reference_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "grouping_column_reference"
    // DMLSelect.g:491:1: grouping_column_reference returns [Node returnNode] : column_referenceGen+= column_reference ;
    public final DMLSelectParser.grouping_column_reference_return grouping_column_reference() throws RecognitionException {
        DMLSelectParser.grouping_column_reference_return retval = new DMLSelectParser.grouping_column_reference_return();
        retval.start = input.LT(1);

        List list_column_referenceGen=null;
        RuleReturnScope column_referenceGen = null;
        try {
            // DMLSelect.g:492:1: (column_referenceGen+= column_reference )
            // DMLSelect.g:492:4: column_referenceGen+= column_reference
            {
            pushFollow(FOLLOW_column_reference_in_grouping_column_reference553);
            column_referenceGen=column_reference();

            state._fsp--;

            if (list_column_referenceGen==null) list_column_referenceGen=new ArrayList();
            list_column_referenceGen.add(column_referenceGen);


            		// Create return CST Node
            		Node grouping_column_referenceReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		grouping_column_referenceReturnNode.setKind("grouping_column_reference");
            	    // Create a CST Node
            		if(list_column_referenceGen != null) {
            	        for(Iterator it = list_column_referenceGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.column_reference_return r = (DMLSelectParser.column_reference_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("column_reference");
            	            	grouping_column_referenceReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = grouping_column_referenceReturnNode;
            	

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
    // $ANTLR end "grouping_column_reference"

    public static class column_reference_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "column_reference"
    // DMLSelect.g:512:1: column_reference returns [Node returnNode] : (table_nameGen+= table_name PERIODGen= PERIOD )? column_nameGen+= column_name ;
    public final DMLSelectParser.column_reference_return column_reference() throws RecognitionException {
        DMLSelectParser.column_reference_return retval = new DMLSelectParser.column_reference_return();
        retval.start = input.LT(1);

        Token PERIODGen=null;
        List list_table_nameGen=null;
        List list_column_nameGen=null;
        RuleReturnScope table_nameGen = null;
        RuleReturnScope column_nameGen = null;
        try {
            // DMLSelect.g:513:1: ( (table_nameGen+= table_name PERIODGen= PERIOD )? column_nameGen+= column_name )
            // DMLSelect.g:513:3: (table_nameGen+= table_name PERIODGen= PERIOD )? column_nameGen+= column_name
            {
            // DMLSelect.g:513:3: (table_nameGen+= table_name PERIODGen= PERIOD )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==PERIOD) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // DMLSelect.g:513:5: table_nameGen+= table_name PERIODGen= PERIOD
                    {
                    pushFollow(FOLLOW_table_name_in_column_reference576);
                    table_nameGen=table_name();

                    state._fsp--;

                    if (list_table_nameGen==null) list_table_nameGen=new ArrayList();
                    list_table_nameGen.add(table_nameGen);

                    PERIODGen=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_column_reference581); 

                    }
                    break;

            }

            pushFollow(FOLLOW_column_name_in_column_reference588);
            column_nameGen=column_name();

            state._fsp--;

            if (list_column_nameGen==null) list_column_nameGen=new ArrayList();
            list_column_nameGen.add(column_nameGen);


            		// Create return CST Node
            		Node column_referenceReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		column_referenceReturnNode.setKind("column_reference");
            	    // Create a CST Node
            		if(list_table_nameGen != null) {
            	        for(Iterator it = list_table_nameGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.table_name_return r = (DMLSelectParser.table_name_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("table_name");
            	            	column_referenceReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(PERIODGen != null) {
            			Leaf PERIODGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("PERIOD", (PERIODGen!=null?PERIODGen.getText():null), PERIODGen.getCharPositionInLine(), PERIODGen.getLine());
            			column_referenceReturnNode.getChildren().add(PERIODGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_column_nameGen != null) {
            	        for(Iterator it = list_column_nameGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.column_name_return r = (DMLSelectParser.column_name_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("column_name");
            	            	column_referenceReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = column_referenceReturnNode;
            	

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
    // $ANTLR end "column_reference"

    public static class having_clause_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "having_clause"
    // DMLSelect.g:548:1: having_clause returns [Node returnNode] : TK_0= 'HAVING' search_conditionGen+= search_condition ;
    public final DMLSelectParser.having_clause_return having_clause() throws RecognitionException {
        DMLSelectParser.having_clause_return retval = new DMLSelectParser.having_clause_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_search_conditionGen=null;
        RuleReturnScope search_conditionGen = null;
        try {
            // DMLSelect.g:549:1: (TK_0= 'HAVING' search_conditionGen+= search_condition )
            // DMLSelect.g:549:4: TK_0= 'HAVING' search_conditionGen+= search_condition
            {
            TK_0=(Token)match(input,29,FOLLOW_29_in_having_clause610); 
            pushFollow(FOLLOW_search_condition_in_having_clause615);
            search_conditionGen=search_condition();

            state._fsp--;

            if (list_search_conditionGen==null) list_search_conditionGen=new ArrayList();
            list_search_conditionGen.add(search_conditionGen);


            		// Create return CST Node
            		Node having_clauseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		having_clauseReturnNode.setKind("having_clause");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		having_clauseReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_search_conditionGen != null) {
            	        for(Iterator it = list_search_conditionGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.search_condition_return r = (DMLSelectParser.search_condition_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("search_condition");
            	            	having_clauseReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = having_clauseReturnNode;
            	

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
    // $ANTLR end "having_clause"

    public static class search_condition_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "search_condition"
    // DMLSelect.g:574:1: search_condition returns [Node returnNode] : boolean_termGen+= boolean_term (TK_0= 'OR' boolean_termGen_1+= boolean_term )* ;
    public final DMLSelectParser.search_condition_return search_condition() throws RecognitionException {
        DMLSelectParser.search_condition_return retval = new DMLSelectParser.search_condition_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_boolean_termGen=null;
        List list_boolean_termGen_1=null;
        RuleReturnScope boolean_termGen = null;
        RuleReturnScope boolean_termGen_1 = null;
        try {
            // DMLSelect.g:575:1: (boolean_termGen+= boolean_term (TK_0= 'OR' boolean_termGen_1+= boolean_term )* )
            // DMLSelect.g:575:4: boolean_termGen+= boolean_term (TK_0= 'OR' boolean_termGen_1+= boolean_term )*
            {
            pushFollow(FOLLOW_boolean_term_in_search_condition637);
            boolean_termGen=boolean_term();

            state._fsp--;

            if (list_boolean_termGen==null) list_boolean_termGen=new ArrayList();
            list_boolean_termGen.add(boolean_termGen);

            // DMLSelect.g:575:35: (TK_0= 'OR' boolean_termGen_1+= boolean_term )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // DMLSelect.g:575:37: TK_0= 'OR' boolean_termGen_1+= boolean_term
            	    {
            	    TK_0=(Token)match(input,30,FOLLOW_30_in_search_condition644); 
            	    pushFollow(FOLLOW_boolean_term_in_search_condition649);
            	    boolean_termGen_1=boolean_term();

            	    state._fsp--;

            	    if (list_boolean_termGen_1==null) list_boolean_termGen_1=new ArrayList();
            	    list_boolean_termGen_1.add(boolean_termGen_1);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            		// Create return CST Node
            		Node search_conditionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		search_conditionReturnNode.setKind("search_condition");
            	    // Create a CST Node
            		if(list_boolean_termGen != null) {
            	        for(Iterator it = list_boolean_termGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.boolean_term_return r = (DMLSelectParser.boolean_term_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("boolean_term");
            	            	search_conditionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal boolean_termGen_1 aggregation
            		if(list_boolean_termGen_1 != null) {
            	    for(int pos = 0; pos < list_boolean_termGen_1.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		search_conditionReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            		// No Terminal extractor
            	    if(list_boolean_termGen_1 != null) {		
            	    	DMLSelectParser.boolean_term_return r = (DMLSelectParser.boolean_term_return) list_boolean_termGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("boolean_term");
            	    		search_conditionReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = search_conditionReturnNode;
            	

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
    // $ANTLR end "search_condition"

    public static class boolean_term_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "boolean_term"
    // DMLSelect.g:615:1: boolean_term returns [Node returnNode] : boolean_factorGen+= boolean_factor (TK_0= 'AND' boolean_factorGen_1+= boolean_factor )* ;
    public final DMLSelectParser.boolean_term_return boolean_term() throws RecognitionException {
        DMLSelectParser.boolean_term_return retval = new DMLSelectParser.boolean_term_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_boolean_factorGen=null;
        List list_boolean_factorGen_1=null;
        RuleReturnScope boolean_factorGen = null;
        RuleReturnScope boolean_factorGen_1 = null;
        try {
            // DMLSelect.g:616:1: (boolean_factorGen+= boolean_factor (TK_0= 'AND' boolean_factorGen_1+= boolean_factor )* )
            // DMLSelect.g:616:4: boolean_factorGen+= boolean_factor (TK_0= 'AND' boolean_factorGen_1+= boolean_factor )*
            {
            pushFollow(FOLLOW_boolean_factor_in_boolean_term673);
            boolean_factorGen=boolean_factor();

            state._fsp--;

            if (list_boolean_factorGen==null) list_boolean_factorGen=new ArrayList();
            list_boolean_factorGen.add(boolean_factorGen);

            // DMLSelect.g:616:38: (TK_0= 'AND' boolean_factorGen_1+= boolean_factor )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // DMLSelect.g:616:40: TK_0= 'AND' boolean_factorGen_1+= boolean_factor
            	    {
            	    TK_0=(Token)match(input,31,FOLLOW_31_in_boolean_term679); 
            	    pushFollow(FOLLOW_boolean_factor_in_boolean_term684);
            	    boolean_factorGen_1=boolean_factor();

            	    state._fsp--;

            	    if (list_boolean_factorGen_1==null) list_boolean_factorGen_1=new ArrayList();
            	    list_boolean_factorGen_1.add(boolean_factorGen_1);


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            		// Create return CST Node
            		Node boolean_termReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		boolean_termReturnNode.setKind("boolean_term");
            	    // Create a CST Node
            		if(list_boolean_factorGen != null) {
            	        for(Iterator it = list_boolean_factorGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.boolean_factor_return r = (DMLSelectParser.boolean_factor_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("boolean_factor");
            	            	boolean_termReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal boolean_factorGen_1 aggregation
            		if(list_boolean_factorGen_1 != null) {
            	    for(int pos = 0; pos < list_boolean_factorGen_1.size(); pos++ )  { 
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		boolean_termReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            		// No Terminal extractor
            	    if(list_boolean_factorGen_1 != null) {		
            	    	DMLSelectParser.boolean_factor_return r = (DMLSelectParser.boolean_factor_return) list_boolean_factorGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("boolean_factor");
            	    		boolean_termReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = boolean_termReturnNode;
            	

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
    // $ANTLR end "boolean_term"

    public static class boolean_factor_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "boolean_factor"
    // DMLSelect.g:656:1: boolean_factor returns [Node returnNode] : (TK_0= 'NOT' )? predicateGen+= predicate ;
    public final DMLSelectParser.boolean_factor_return boolean_factor() throws RecognitionException {
        DMLSelectParser.boolean_factor_return retval = new DMLSelectParser.boolean_factor_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_predicateGen=null;
        RuleReturnScope predicateGen = null;
        try {
            // DMLSelect.g:657:1: ( (TK_0= 'NOT' )? predicateGen+= predicate )
            // DMLSelect.g:657:3: (TK_0= 'NOT' )? predicateGen+= predicate
            {
            // DMLSelect.g:657:3: (TK_0= 'NOT' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // DMLSelect.g:657:5: TK_0= 'NOT'
                    {
                    TK_0=(Token)match(input,32,FOLLOW_32_in_boolean_factor709); 

                    }
                    break;

            }

            pushFollow(FOLLOW_predicate_in_boolean_factor716);
            predicateGen=predicate();

            state._fsp--;

            if (list_predicateGen==null) list_predicateGen=new ArrayList();
            list_predicateGen.add(predicateGen);


            		// Create return CST Node
            		Node boolean_factorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		boolean_factorReturnNode.setKind("boolean_factor");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		boolean_factorReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_predicateGen != null) {
            	        for(Iterator it = list_predicateGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.predicate_return r = (DMLSelectParser.predicate_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("predicate");
            	            	boolean_factorReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = boolean_factorReturnNode;
            	

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
    // $ANTLR end "boolean_factor"

    public static class predicate_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "predicate"
    // DMLSelect.g:682:1: predicate returns [Node returnNode] : (comparison_predicateGen+= comparison_predicate | between_predicateGen+= between_predicate | in_predicateGen+= in_predicate | like_predicateGen+= like_predicate | null_predicateGen+= null_predicate );
    public final DMLSelectParser.predicate_return predicate() throws RecognitionException {
        DMLSelectParser.predicate_return retval = new DMLSelectParser.predicate_return();
        retval.start = input.LT(1);

        List list_comparison_predicateGen=null;
        List list_between_predicateGen=null;
        List list_in_predicateGen=null;
        List list_like_predicateGen=null;
        List list_null_predicateGen=null;
        RuleReturnScope comparison_predicateGen = null;
        RuleReturnScope between_predicateGen = null;
        RuleReturnScope in_predicateGen = null;
        RuleReturnScope like_predicateGen = null;
        RuleReturnScope null_predicateGen = null;
        try {
            // DMLSelect.g:683:1: (comparison_predicateGen+= comparison_predicate | between_predicateGen+= between_predicate | in_predicateGen+= in_predicate | like_predicateGen+= like_predicate | null_predicateGen+= null_predicate )
            int alt22=5;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // DMLSelect.g:683:4: comparison_predicateGen+= comparison_predicate
                    {
                    pushFollow(FOLLOW_comparison_predicate_in_predicate738);
                    comparison_predicateGen=comparison_predicate();

                    state._fsp--;

                    if (list_comparison_predicateGen==null) list_comparison_predicateGen=new ArrayList();
                    list_comparison_predicateGen.add(comparison_predicateGen);


                    		// Create return CST Node
                    		Node predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		predicateReturnNode.setKind("predicate");
                    	    // Create a CST Node
                    		if(list_comparison_predicateGen != null) {
                    	        for(Iterator it = list_comparison_predicateGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.comparison_predicate_return r = (DMLSelectParser.comparison_predicate_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("comparison_predicate");
                    	            	predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = predicateReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // DMLSelect.g:700:7: between_predicateGen+= between_predicate
                    {
                    pushFollow(FOLLOW_between_predicate_in_predicate749);
                    between_predicateGen=between_predicate();

                    state._fsp--;

                    if (list_between_predicateGen==null) list_between_predicateGen=new ArrayList();
                    list_between_predicateGen.add(between_predicateGen);


                    		// Create return CST Node
                    		Node predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		predicateReturnNode.setKind("predicate");
                    	    // Create a CST Node
                    		if(list_between_predicateGen != null) {
                    	        for(Iterator it = list_between_predicateGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.between_predicate_return r = (DMLSelectParser.between_predicate_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("between_predicate");
                    	            	predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = predicateReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // DMLSelect.g:717:7: in_predicateGen+= in_predicate
                    {
                    pushFollow(FOLLOW_in_predicate_in_predicate760);
                    in_predicateGen=in_predicate();

                    state._fsp--;

                    if (list_in_predicateGen==null) list_in_predicateGen=new ArrayList();
                    list_in_predicateGen.add(in_predicateGen);


                    		// Create return CST Node
                    		Node predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		predicateReturnNode.setKind("predicate");
                    	    // Create a CST Node
                    		if(list_in_predicateGen != null) {
                    	        for(Iterator it = list_in_predicateGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.in_predicate_return r = (DMLSelectParser.in_predicate_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("in_predicate");
                    	            	predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = predicateReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // DMLSelect.g:734:7: like_predicateGen+= like_predicate
                    {
                    pushFollow(FOLLOW_like_predicate_in_predicate771);
                    like_predicateGen=like_predicate();

                    state._fsp--;

                    if (list_like_predicateGen==null) list_like_predicateGen=new ArrayList();
                    list_like_predicateGen.add(like_predicateGen);


                    		// Create return CST Node
                    		Node predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		predicateReturnNode.setKind("predicate");
                    	    // Create a CST Node
                    		if(list_like_predicateGen != null) {
                    	        for(Iterator it = list_like_predicateGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.like_predicate_return r = (DMLSelectParser.like_predicate_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("like_predicate");
                    	            	predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = predicateReturnNode;
                    	

                    }
                    break;
                case 5 :
                    // DMLSelect.g:751:7: null_predicateGen+= null_predicate
                    {
                    pushFollow(FOLLOW_null_predicate_in_predicate782);
                    null_predicateGen=null_predicate();

                    state._fsp--;

                    if (list_null_predicateGen==null) list_null_predicateGen=new ArrayList();
                    list_null_predicateGen.add(null_predicateGen);


                    		// Create return CST Node
                    		Node predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		predicateReturnNode.setKind("predicate");
                    	    // Create a CST Node
                    		if(list_null_predicateGen != null) {
                    	        for(Iterator it = list_null_predicateGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.null_predicate_return r = (DMLSelectParser.null_predicate_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("null_predicate");
                    	            	predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = predicateReturnNode;
                    	

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
    // $ANTLR end "predicate"

    public static class comparison_predicate_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "comparison_predicate"
    // DMLSelect.g:771:1: comparison_predicate returns [Node returnNode] : (complete_comparison_predicateGen+= complete_comparison_predicate | incomplete_comparison_predicateGen+= incomplete_comparison_predicate );
    public final DMLSelectParser.comparison_predicate_return comparison_predicate() throws RecognitionException {
        DMLSelectParser.comparison_predicate_return retval = new DMLSelectParser.comparison_predicate_return();
        retval.start = input.LT(1);

        List list_complete_comparison_predicateGen=null;
        List list_incomplete_comparison_predicateGen=null;
        RuleReturnScope complete_comparison_predicateGen = null;
        RuleReturnScope incomplete_comparison_predicateGen = null;
        try {
            // DMLSelect.g:772:1: (complete_comparison_predicateGen+= complete_comparison_predicate | incomplete_comparison_predicateGen+= incomplete_comparison_predicate )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // DMLSelect.g:772:4: complete_comparison_predicateGen+= complete_comparison_predicate
                    {
                    pushFollow(FOLLOW_complete_comparison_predicate_in_comparison_predicate804);
                    complete_comparison_predicateGen=complete_comparison_predicate();

                    state._fsp--;

                    if (list_complete_comparison_predicateGen==null) list_complete_comparison_predicateGen=new ArrayList();
                    list_complete_comparison_predicateGen.add(complete_comparison_predicateGen);


                    		// Create return CST Node
                    		Node comparison_predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		comparison_predicateReturnNode.setKind("comparison_predicate");
                    	    // Create a CST Node
                    		if(list_complete_comparison_predicateGen != null) {
                    	        for(Iterator it = list_complete_comparison_predicateGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.complete_comparison_predicate_return r = (DMLSelectParser.complete_comparison_predicate_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("complete_comparison_predicate");
                    	            	comparison_predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = comparison_predicateReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // DMLSelect.g:789:7: incomplete_comparison_predicateGen+= incomplete_comparison_predicate
                    {
                    pushFollow(FOLLOW_incomplete_comparison_predicate_in_comparison_predicate815);
                    incomplete_comparison_predicateGen=incomplete_comparison_predicate();

                    state._fsp--;

                    if (list_incomplete_comparison_predicateGen==null) list_incomplete_comparison_predicateGen=new ArrayList();
                    list_incomplete_comparison_predicateGen.add(incomplete_comparison_predicateGen);


                    		// Create return CST Node
                    		Node comparison_predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		comparison_predicateReturnNode.setKind("comparison_predicate");
                    	    // Create a CST Node
                    		if(list_incomplete_comparison_predicateGen != null) {
                    	        for(Iterator it = list_incomplete_comparison_predicateGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.incomplete_comparison_predicate_return r = (DMLSelectParser.incomplete_comparison_predicate_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("incomplete_comparison_predicate");
                    	            	comparison_predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = comparison_predicateReturnNode;
                    	

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
    // $ANTLR end "comparison_predicate"

    public static class complete_comparison_predicate_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "complete_comparison_predicate"
    // DMLSelect.g:809:1: complete_comparison_predicate returns [Node returnNode] : row_value_constructorGen+= row_value_constructor comp_opGen+= comp_op row_value_constructorGen_1+= row_value_constructor ;
    public final DMLSelectParser.complete_comparison_predicate_return complete_comparison_predicate() throws RecognitionException {
        DMLSelectParser.complete_comparison_predicate_return retval = new DMLSelectParser.complete_comparison_predicate_return();
        retval.start = input.LT(1);

        List list_row_value_constructorGen=null;
        List list_comp_opGen=null;
        List list_row_value_constructorGen_1=null;
        RuleReturnScope row_value_constructorGen = null;
        RuleReturnScope comp_opGen = null;
        RuleReturnScope row_value_constructorGen_1 = null;
        try {
            // DMLSelect.g:810:1: (row_value_constructorGen+= row_value_constructor comp_opGen+= comp_op row_value_constructorGen_1+= row_value_constructor )
            // DMLSelect.g:810:4: row_value_constructorGen+= row_value_constructor comp_opGen+= comp_op row_value_constructorGen_1+= row_value_constructor
            {
            pushFollow(FOLLOW_row_value_constructor_in_complete_comparison_predicate837);
            row_value_constructorGen=row_value_constructor();

            state._fsp--;

            if (list_row_value_constructorGen==null) list_row_value_constructorGen=new ArrayList();
            list_row_value_constructorGen.add(row_value_constructorGen);

            pushFollow(FOLLOW_comp_op_in_complete_comparison_predicate842);
            comp_opGen=comp_op();

            state._fsp--;

            if (list_comp_opGen==null) list_comp_opGen=new ArrayList();
            list_comp_opGen.add(comp_opGen);

            pushFollow(FOLLOW_row_value_constructor_in_complete_comparison_predicate847);
            row_value_constructorGen_1=row_value_constructor();

            state._fsp--;

            if (list_row_value_constructorGen_1==null) list_row_value_constructorGen_1=new ArrayList();
            list_row_value_constructorGen_1.add(row_value_constructorGen_1);


            		// Create return CST Node
            		Node complete_comparison_predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		complete_comparison_predicateReturnNode.setKind("complete_comparison_predicate");
            	    // Create a CST Node
            		if(list_row_value_constructorGen != null) {
            	        for(Iterator it = list_row_value_constructorGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.row_value_constructor_return r = (DMLSelectParser.row_value_constructor_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("row_value_constructor");
            	            	complete_comparison_predicateReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_comp_opGen != null) {
            	        for(Iterator it = list_comp_opGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.comp_op_return r = (DMLSelectParser.comp_op_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("comp_op");
            	            	complete_comparison_predicateReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Node
            		if(list_row_value_constructorGen_1 != null) {
            	        for(Iterator it = list_row_value_constructorGen_1.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.row_value_constructor_return r = (DMLSelectParser.row_value_constructor_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("row_value_constructor");
            	            	complete_comparison_predicateReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = complete_comparison_predicateReturnNode;
            	

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
    // $ANTLR end "complete_comparison_predicate"

    public static class incomplete_comparison_predicate_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "incomplete_comparison_predicate"
    // DMLSelect.g:850:1: incomplete_comparison_predicate returns [Node returnNode] : (row_value_constructorGen+= row_value_constructor comp_opGen+= comp_op | comp_opGen+= comp_op row_value_constructorGen+= row_value_constructor | comp_opGen+= comp_op );
    public final DMLSelectParser.incomplete_comparison_predicate_return incomplete_comparison_predicate() throws RecognitionException {
        DMLSelectParser.incomplete_comparison_predicate_return retval = new DMLSelectParser.incomplete_comparison_predicate_return();
        retval.start = input.LT(1);

        List list_row_value_constructorGen=null;
        List list_comp_opGen=null;
        RuleReturnScope row_value_constructorGen = null;
        RuleReturnScope comp_opGen = null;
        try {
            // DMLSelect.g:851:1: (row_value_constructorGen+= row_value_constructor comp_opGen+= comp_op | comp_opGen+= comp_op row_value_constructorGen+= row_value_constructor | comp_opGen+= comp_op )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // DMLSelect.g:851:4: row_value_constructorGen+= row_value_constructor comp_opGen+= comp_op
                    {
                    pushFollow(FOLLOW_row_value_constructor_in_incomplete_comparison_predicate869);
                    row_value_constructorGen=row_value_constructor();

                    state._fsp--;

                    if (list_row_value_constructorGen==null) list_row_value_constructorGen=new ArrayList();
                    list_row_value_constructorGen.add(row_value_constructorGen);

                    pushFollow(FOLLOW_comp_op_in_incomplete_comparison_predicate874);
                    comp_opGen=comp_op();

                    state._fsp--;

                    if (list_comp_opGen==null) list_comp_opGen=new ArrayList();
                    list_comp_opGen.add(comp_opGen);


                    		// Create return CST Node
                    		Node incomplete_comparison_predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		incomplete_comparison_predicateReturnNode.setKind("incomplete_comparison_predicate");
                    	    // Create a CST Node
                    		if(list_row_value_constructorGen != null) {
                    	        for(Iterator it = list_row_value_constructorGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.row_value_constructor_return r = (DMLSelectParser.row_value_constructor_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("row_value_constructor");
                    	            	incomplete_comparison_predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_comp_opGen != null) {
                    	        for(Iterator it = list_comp_opGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.comp_op_return r = (DMLSelectParser.comp_op_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("comp_op");
                    	            	incomplete_comparison_predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = incomplete_comparison_predicateReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // DMLSelect.g:878:7: comp_opGen+= comp_op row_value_constructorGen+= row_value_constructor
                    {
                    pushFollow(FOLLOW_comp_op_in_incomplete_comparison_predicate885);
                    comp_opGen=comp_op();

                    state._fsp--;

                    if (list_comp_opGen==null) list_comp_opGen=new ArrayList();
                    list_comp_opGen.add(comp_opGen);

                    pushFollow(FOLLOW_row_value_constructor_in_incomplete_comparison_predicate890);
                    row_value_constructorGen=row_value_constructor();

                    state._fsp--;

                    if (list_row_value_constructorGen==null) list_row_value_constructorGen=new ArrayList();
                    list_row_value_constructorGen.add(row_value_constructorGen);


                    		// Create return CST Node
                    		Node incomplete_comparison_predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		incomplete_comparison_predicateReturnNode.setKind("incomplete_comparison_predicate");
                    	    // Create a CST Node
                    		if(list_comp_opGen != null) {
                    	        for(Iterator it = list_comp_opGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.comp_op_return r = (DMLSelectParser.comp_op_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("comp_op");
                    	            	incomplete_comparison_predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    	    // Create a CST Node
                    		if(list_row_value_constructorGen != null) {
                    	        for(Iterator it = list_row_value_constructorGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.row_value_constructor_return r = (DMLSelectParser.row_value_constructor_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("row_value_constructor");
                    	            	incomplete_comparison_predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = incomplete_comparison_predicateReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // DMLSelect.g:905:7: comp_opGen+= comp_op
                    {
                    pushFollow(FOLLOW_comp_op_in_incomplete_comparison_predicate901);
                    comp_opGen=comp_op();

                    state._fsp--;

                    if (list_comp_opGen==null) list_comp_opGen=new ArrayList();
                    list_comp_opGen.add(comp_opGen);


                    		// Create return CST Node
                    		Node incomplete_comparison_predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		incomplete_comparison_predicateReturnNode.setKind("incomplete_comparison_predicate");
                    	    // Create a CST Node
                    		if(list_comp_opGen != null) {
                    	        for(Iterator it = list_comp_opGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.comp_op_return r = (DMLSelectParser.comp_op_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("comp_op");
                    	            	incomplete_comparison_predicateReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = incomplete_comparison_predicateReturnNode;
                    	

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
    // $ANTLR end "incomplete_comparison_predicate"

    public static class row_value_constructor_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "row_value_constructor"
    // DMLSelect.g:925:1: row_value_constructor returns [Node returnNode] : (NULL_SPECIFICATIONGen= NULL_SPECIFICATION | DEFAULT_SPECIFICATIONGen= DEFAULT_SPECIFICATION | UNSIGNED_INTEGERGen= UNSIGNED_INTEGER | column_referenceGen+= column_reference | expressionGen+= expression );
    public final DMLSelectParser.row_value_constructor_return row_value_constructor() throws RecognitionException {
        DMLSelectParser.row_value_constructor_return retval = new DMLSelectParser.row_value_constructor_return();
        retval.start = input.LT(1);

        Token NULL_SPECIFICATIONGen=null;
        Token DEFAULT_SPECIFICATIONGen=null;
        Token UNSIGNED_INTEGERGen=null;
        List list_column_referenceGen=null;
        List list_expressionGen=null;
        RuleReturnScope column_referenceGen = null;
        RuleReturnScope expressionGen = null;
        try {
            // DMLSelect.g:926:1: (NULL_SPECIFICATIONGen= NULL_SPECIFICATION | DEFAULT_SPECIFICATIONGen= DEFAULT_SPECIFICATION | UNSIGNED_INTEGERGen= UNSIGNED_INTEGER | column_referenceGen+= column_reference | expressionGen+= expression )
            int alt25=5;
            switch ( input.LA(1) ) {
            case NULL_SPECIFICATION:
                {
                alt25=1;
                }
                break;
            case DEFAULT_SPECIFICATION:
                {
                alt25=2;
                }
                break;
            case UNSIGNED_INTEGER:
                {
                alt25=3;
                }
                break;
            case ID:
                {
                alt25=4;
                }
                break;
            case IDEXPRESSION:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // DMLSelect.g:926:4: NULL_SPECIFICATIONGen= NULL_SPECIFICATION
                    {
                    NULL_SPECIFICATIONGen=(Token)match(input,NULL_SPECIFICATION,FOLLOW_NULL_SPECIFICATION_in_row_value_constructor923); 

                    		// Create return CST Node
                    		Node row_value_constructorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		row_value_constructorReturnNode.setKind("row_value_constructor");
                    	    // Create a CST Leaf
                    		if(NULL_SPECIFICATIONGen != null) {
                    			Leaf NULL_SPECIFICATIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NULL_SPECIFICATION", (NULL_SPECIFICATIONGen!=null?NULL_SPECIFICATIONGen.getText():null), NULL_SPECIFICATIONGen.getCharPositionInLine(), NULL_SPECIFICATIONGen.getLine());
                    			row_value_constructorReturnNode.getChildren().add(NULL_SPECIFICATIONGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = row_value_constructorReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // DMLSelect.g:938:7: DEFAULT_SPECIFICATIONGen= DEFAULT_SPECIFICATION
                    {
                    DEFAULT_SPECIFICATIONGen=(Token)match(input,DEFAULT_SPECIFICATION,FOLLOW_DEFAULT_SPECIFICATION_in_row_value_constructor934); 

                    		// Create return CST Node
                    		Node row_value_constructorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		row_value_constructorReturnNode.setKind("row_value_constructor");
                    	    // Create a CST Leaf
                    		if(DEFAULT_SPECIFICATIONGen != null) {
                    			Leaf DEFAULT_SPECIFICATIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("DEFAULT_SPECIFICATION", (DEFAULT_SPECIFICATIONGen!=null?DEFAULT_SPECIFICATIONGen.getText():null), DEFAULT_SPECIFICATIONGen.getCharPositionInLine(), DEFAULT_SPECIFICATIONGen.getLine());
                    			row_value_constructorReturnNode.getChildren().add(DEFAULT_SPECIFICATIONGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = row_value_constructorReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // DMLSelect.g:950:7: UNSIGNED_INTEGERGen= UNSIGNED_INTEGER
                    {
                    UNSIGNED_INTEGERGen=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_row_value_constructor945); 

                    		// Create return CST Node
                    		Node row_value_constructorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		row_value_constructorReturnNode.setKind("row_value_constructor");
                    	    // Create a CST Leaf
                    		if(UNSIGNED_INTEGERGen != null) {
                    			Leaf UNSIGNED_INTEGERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("UNSIGNED_INTEGER", (UNSIGNED_INTEGERGen!=null?UNSIGNED_INTEGERGen.getText():null), UNSIGNED_INTEGERGen.getCharPositionInLine(), UNSIGNED_INTEGERGen.getLine());
                    			row_value_constructorReturnNode.getChildren().add(UNSIGNED_INTEGERGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = row_value_constructorReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // DMLSelect.g:962:7: column_referenceGen+= column_reference
                    {
                    pushFollow(FOLLOW_column_reference_in_row_value_constructor956);
                    column_referenceGen=column_reference();

                    state._fsp--;

                    if (list_column_referenceGen==null) list_column_referenceGen=new ArrayList();
                    list_column_referenceGen.add(column_referenceGen);


                    		// Create return CST Node
                    		Node row_value_constructorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		row_value_constructorReturnNode.setKind("row_value_constructor");
                    	    // Create a CST Node
                    		if(list_column_referenceGen != null) {
                    	        for(Iterator it = list_column_referenceGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.column_reference_return r = (DMLSelectParser.column_reference_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("column_reference");
                    	            	row_value_constructorReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = row_value_constructorReturnNode;
                    	

                    }
                    break;
                case 5 :
                    // DMLSelect.g:979:7: expressionGen+= expression
                    {
                    pushFollow(FOLLOW_expression_in_row_value_constructor967);
                    expressionGen=expression();

                    state._fsp--;

                    if (list_expressionGen==null) list_expressionGen=new ArrayList();
                    list_expressionGen.add(expressionGen);


                    		// Create return CST Node
                    		Node row_value_constructorReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		row_value_constructorReturnNode.setKind("row_value_constructor");
                    	    // Create a CST Node
                    		if(list_expressionGen != null) {
                    	        for(Iterator it = list_expressionGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.expression_return r = (DMLSelectParser.expression_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("expression");
                    	            	row_value_constructorReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = row_value_constructorReturnNode;
                    	

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
    // $ANTLR end "row_value_constructor"

    public static class comp_op_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "comp_op"
    // DMLSelect.g:999:1: comp_op returns [Node returnNode] : (EQUALS_OPERATORGen= EQUALS_OPERATOR | NOT_EQUALS_OPERATORGen= NOT_EQUALS_OPERATOR | LESS_THAN_OPERATORGen= LESS_THAN_OPERATOR | GREATER_THAN_OPERATORGen= GREATER_THAN_OPERATOR | LESS_THAN_OR_EQUALS_OPERATORGen= LESS_THAN_OR_EQUALS_OPERATOR | GREATER_THAN_OR_EQUALS_OPERATORGen= GREATER_THAN_OR_EQUALS_OPERATOR );
    public final DMLSelectParser.comp_op_return comp_op() throws RecognitionException {
        DMLSelectParser.comp_op_return retval = new DMLSelectParser.comp_op_return();
        retval.start = input.LT(1);

        Token EQUALS_OPERATORGen=null;
        Token NOT_EQUALS_OPERATORGen=null;
        Token LESS_THAN_OPERATORGen=null;
        Token GREATER_THAN_OPERATORGen=null;
        Token LESS_THAN_OR_EQUALS_OPERATORGen=null;
        Token GREATER_THAN_OR_EQUALS_OPERATORGen=null;

        try {
            // DMLSelect.g:1000:1: (EQUALS_OPERATORGen= EQUALS_OPERATOR | NOT_EQUALS_OPERATORGen= NOT_EQUALS_OPERATOR | LESS_THAN_OPERATORGen= LESS_THAN_OPERATOR | GREATER_THAN_OPERATORGen= GREATER_THAN_OPERATOR | LESS_THAN_OR_EQUALS_OPERATORGen= LESS_THAN_OR_EQUALS_OPERATOR | GREATER_THAN_OR_EQUALS_OPERATORGen= GREATER_THAN_OR_EQUALS_OPERATOR )
            int alt26=6;
            switch ( input.LA(1) ) {
            case EQUALS_OPERATOR:
                {
                alt26=1;
                }
                break;
            case NOT_EQUALS_OPERATOR:
                {
                alt26=2;
                }
                break;
            case LESS_THAN_OPERATOR:
                {
                alt26=3;
                }
                break;
            case GREATER_THAN_OPERATOR:
                {
                alt26=4;
                }
                break;
            case LESS_THAN_OR_EQUALS_OPERATOR:
                {
                alt26=5;
                }
                break;
            case GREATER_THAN_OR_EQUALS_OPERATOR:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // DMLSelect.g:1000:4: EQUALS_OPERATORGen= EQUALS_OPERATOR
                    {
                    EQUALS_OPERATORGen=(Token)match(input,EQUALS_OPERATOR,FOLLOW_EQUALS_OPERATOR_in_comp_op989); 

                    		// Create return CST Node
                    		Node comp_opReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		comp_opReturnNode.setKind("comp_op");
                    	    // Create a CST Leaf
                    		if(EQUALS_OPERATORGen != null) {
                    			Leaf EQUALS_OPERATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("EQUALS_OPERATOR", (EQUALS_OPERATORGen!=null?EQUALS_OPERATORGen.getText():null), EQUALS_OPERATORGen.getCharPositionInLine(), EQUALS_OPERATORGen.getLine());
                    			comp_opReturnNode.getChildren().add(EQUALS_OPERATORGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = comp_opReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // DMLSelect.g:1012:7: NOT_EQUALS_OPERATORGen= NOT_EQUALS_OPERATOR
                    {
                    NOT_EQUALS_OPERATORGen=(Token)match(input,NOT_EQUALS_OPERATOR,FOLLOW_NOT_EQUALS_OPERATOR_in_comp_op1000); 

                    		// Create return CST Node
                    		Node comp_opReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		comp_opReturnNode.setKind("comp_op");
                    	    // Create a CST Leaf
                    		if(NOT_EQUALS_OPERATORGen != null) {
                    			Leaf NOT_EQUALS_OPERATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NOT_EQUALS_OPERATOR", (NOT_EQUALS_OPERATORGen!=null?NOT_EQUALS_OPERATORGen.getText():null), NOT_EQUALS_OPERATORGen.getCharPositionInLine(), NOT_EQUALS_OPERATORGen.getLine());
                    			comp_opReturnNode.getChildren().add(NOT_EQUALS_OPERATORGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = comp_opReturnNode;
                    	

                    }
                    break;
                case 3 :
                    // DMLSelect.g:1024:7: LESS_THAN_OPERATORGen= LESS_THAN_OPERATOR
                    {
                    LESS_THAN_OPERATORGen=(Token)match(input,LESS_THAN_OPERATOR,FOLLOW_LESS_THAN_OPERATOR_in_comp_op1011); 

                    		// Create return CST Node
                    		Node comp_opReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		comp_opReturnNode.setKind("comp_op");
                    	    // Create a CST Leaf
                    		if(LESS_THAN_OPERATORGen != null) {
                    			Leaf LESS_THAN_OPERATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("LESS_THAN_OPERATOR", (LESS_THAN_OPERATORGen!=null?LESS_THAN_OPERATORGen.getText():null), LESS_THAN_OPERATORGen.getCharPositionInLine(), LESS_THAN_OPERATORGen.getLine());
                    			comp_opReturnNode.getChildren().add(LESS_THAN_OPERATORGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = comp_opReturnNode;
                    	

                    }
                    break;
                case 4 :
                    // DMLSelect.g:1036:7: GREATER_THAN_OPERATORGen= GREATER_THAN_OPERATOR
                    {
                    GREATER_THAN_OPERATORGen=(Token)match(input,GREATER_THAN_OPERATOR,FOLLOW_GREATER_THAN_OPERATOR_in_comp_op1022); 

                    		// Create return CST Node
                    		Node comp_opReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		comp_opReturnNode.setKind("comp_op");
                    	    // Create a CST Leaf
                    		if(GREATER_THAN_OPERATORGen != null) {
                    			Leaf GREATER_THAN_OPERATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("GREATER_THAN_OPERATOR", (GREATER_THAN_OPERATORGen!=null?GREATER_THAN_OPERATORGen.getText():null), GREATER_THAN_OPERATORGen.getCharPositionInLine(), GREATER_THAN_OPERATORGen.getLine());
                    			comp_opReturnNode.getChildren().add(GREATER_THAN_OPERATORGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = comp_opReturnNode;
                    	

                    }
                    break;
                case 5 :
                    // DMLSelect.g:1048:7: LESS_THAN_OR_EQUALS_OPERATORGen= LESS_THAN_OR_EQUALS_OPERATOR
                    {
                    LESS_THAN_OR_EQUALS_OPERATORGen=(Token)match(input,LESS_THAN_OR_EQUALS_OPERATOR,FOLLOW_LESS_THAN_OR_EQUALS_OPERATOR_in_comp_op1033); 

                    		// Create return CST Node
                    		Node comp_opReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		comp_opReturnNode.setKind("comp_op");
                    	    // Create a CST Leaf
                    		if(LESS_THAN_OR_EQUALS_OPERATORGen != null) {
                    			Leaf LESS_THAN_OR_EQUALS_OPERATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("LESS_THAN_OR_EQUALS_OPERATOR", (LESS_THAN_OR_EQUALS_OPERATORGen!=null?LESS_THAN_OR_EQUALS_OPERATORGen.getText():null), LESS_THAN_OR_EQUALS_OPERATORGen.getCharPositionInLine(), LESS_THAN_OR_EQUALS_OPERATORGen.getLine());
                    			comp_opReturnNode.getChildren().add(LESS_THAN_OR_EQUALS_OPERATORGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = comp_opReturnNode;
                    	

                    }
                    break;
                case 6 :
                    // DMLSelect.g:1060:7: GREATER_THAN_OR_EQUALS_OPERATORGen= GREATER_THAN_OR_EQUALS_OPERATOR
                    {
                    GREATER_THAN_OR_EQUALS_OPERATORGen=(Token)match(input,GREATER_THAN_OR_EQUALS_OPERATOR,FOLLOW_GREATER_THAN_OR_EQUALS_OPERATOR_in_comp_op1044); 

                    		// Create return CST Node
                    		Node comp_opReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		comp_opReturnNode.setKind("comp_op");
                    	    // Create a CST Leaf
                    		if(GREATER_THAN_OR_EQUALS_OPERATORGen != null) {
                    			Leaf GREATER_THAN_OR_EQUALS_OPERATORGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("GREATER_THAN_OR_EQUALS_OPERATOR", (GREATER_THAN_OR_EQUALS_OPERATORGen!=null?GREATER_THAN_OR_EQUALS_OPERATORGen.getText():null), GREATER_THAN_OR_EQUALS_OPERATORGen.getCharPositionInLine(), GREATER_THAN_OR_EQUALS_OPERATORGen.getLine());
                    			comp_opReturnNode.getChildren().add(GREATER_THAN_OR_EQUALS_OPERATORGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = comp_opReturnNode;
                    	

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
    // $ANTLR end "comp_op"

    public static class between_predicate_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "between_predicate"
    // DMLSelect.g:1075:1: between_predicate returns [Node returnNode] : row_value_constructorGen+= row_value_constructor (TK_0= 'NOT' )? TK_1= 'BETWEEN' (row_value_constructorGen_1+= row_value_constructor )? TK_2= 'AND' (row_value_constructorGen_2+= row_value_constructor )? ;
    public final DMLSelectParser.between_predicate_return between_predicate() throws RecognitionException {
        DMLSelectParser.between_predicate_return retval = new DMLSelectParser.between_predicate_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        List list_row_value_constructorGen=null;
        List list_row_value_constructorGen_1=null;
        List list_row_value_constructorGen_2=null;
        RuleReturnScope row_value_constructorGen = null;
        RuleReturnScope row_value_constructorGen_1 = null;
        RuleReturnScope row_value_constructorGen_2 = null;
        try {
            // DMLSelect.g:1076:1: (row_value_constructorGen+= row_value_constructor (TK_0= 'NOT' )? TK_1= 'BETWEEN' (row_value_constructorGen_1+= row_value_constructor )? TK_2= 'AND' (row_value_constructorGen_2+= row_value_constructor )? )
            // DMLSelect.g:1076:4: row_value_constructorGen+= row_value_constructor (TK_0= 'NOT' )? TK_1= 'BETWEEN' (row_value_constructorGen_1+= row_value_constructor )? TK_2= 'AND' (row_value_constructorGen_2+= row_value_constructor )?
            {
            pushFollow(FOLLOW_row_value_constructor_in_between_predicate1066);
            row_value_constructorGen=row_value_constructor();

            state._fsp--;

            if (list_row_value_constructorGen==null) list_row_value_constructorGen=new ArrayList();
            list_row_value_constructorGen.add(row_value_constructorGen);

            // DMLSelect.g:1076:52: (TK_0= 'NOT' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // DMLSelect.g:1076:54: TK_0= 'NOT'
                    {
                    TK_0=(Token)match(input,32,FOLLOW_32_in_between_predicate1072); 

                    }
                    break;

            }

            TK_1=(Token)match(input,33,FOLLOW_33_in_between_predicate1079); 
            // DMLSelect.g:1076:83: (row_value_constructorGen_1+= row_value_constructor )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=ID && LA28_0<=IDEXPRESSION)||(LA28_0>=NULL_SPECIFICATION && LA28_0<=UNSIGNED_INTEGER)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // DMLSelect.g:1076:85: row_value_constructorGen_1+= row_value_constructor
                    {
                    pushFollow(FOLLOW_row_value_constructor_in_between_predicate1085);
                    row_value_constructorGen_1=row_value_constructor();

                    state._fsp--;

                    if (list_row_value_constructorGen_1==null) list_row_value_constructorGen_1=new ArrayList();
                    list_row_value_constructorGen_1.add(row_value_constructorGen_1);


                    }
                    break;

            }

            TK_2=(Token)match(input,31,FOLLOW_31_in_between_predicate1092); 
            // DMLSelect.g:1076:149: (row_value_constructorGen_2+= row_value_constructor )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=ID && LA29_0<=IDEXPRESSION)||(LA29_0>=NULL_SPECIFICATION && LA29_0<=UNSIGNED_INTEGER)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // DMLSelect.g:1076:151: row_value_constructorGen_2+= row_value_constructor
                    {
                    pushFollow(FOLLOW_row_value_constructor_in_between_predicate1098);
                    row_value_constructorGen_2=row_value_constructor();

                    state._fsp--;

                    if (list_row_value_constructorGen_2==null) list_row_value_constructorGen_2=new ArrayList();
                    list_row_value_constructorGen_2.add(row_value_constructorGen_2);


                    }
                    break;

            }


            		// Create return CST Node
            		Node between_predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		between_predicateReturnNode.setKind("between_predicate");
            	    // Create a CST Node
            		if(list_row_value_constructorGen != null) {
            	        for(Iterator it = list_row_value_constructorGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.row_value_constructor_return r = (DMLSelectParser.row_value_constructor_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("row_value_constructor");
            	            	between_predicateReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		between_predicateReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		between_predicateReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_row_value_constructorGen_1 != null) {
            	        for(Iterator it = list_row_value_constructorGen_1.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.row_value_constructor_return r = (DMLSelectParser.row_value_constructor_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("row_value_constructor");
            	            	between_predicateReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
            	 		between_predicateReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_row_value_constructorGen_2 != null) {
            	        for(Iterator it = list_row_value_constructorGen_2.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.row_value_constructor_return r = (DMLSelectParser.row_value_constructor_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("row_value_constructor");
            	            	between_predicateReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = between_predicateReturnNode;
            	

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
    // $ANTLR end "between_predicate"

    public static class in_predicate_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "in_predicate"
    // DMLSelect.g:1131:1: in_predicate returns [Node returnNode] : row_value_constructorGen+= row_value_constructor (TK_0= 'NOT' )? TK_1= 'IN' in_predicate_valueGen+= in_predicate_value ;
    public final DMLSelectParser.in_predicate_return in_predicate() throws RecognitionException {
        DMLSelectParser.in_predicate_return retval = new DMLSelectParser.in_predicate_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_row_value_constructorGen=null;
        List list_in_predicate_valueGen=null;
        RuleReturnScope row_value_constructorGen = null;
        RuleReturnScope in_predicate_valueGen = null;
        try {
            // DMLSelect.g:1132:1: (row_value_constructorGen+= row_value_constructor (TK_0= 'NOT' )? TK_1= 'IN' in_predicate_valueGen+= in_predicate_value )
            // DMLSelect.g:1132:4: row_value_constructorGen+= row_value_constructor (TK_0= 'NOT' )? TK_1= 'IN' in_predicate_valueGen+= in_predicate_value
            {
            pushFollow(FOLLOW_row_value_constructor_in_in_predicate1122);
            row_value_constructorGen=row_value_constructor();

            state._fsp--;

            if (list_row_value_constructorGen==null) list_row_value_constructorGen=new ArrayList();
            list_row_value_constructorGen.add(row_value_constructorGen);

            // DMLSelect.g:1132:52: (TK_0= 'NOT' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // DMLSelect.g:1132:54: TK_0= 'NOT'
                    {
                    TK_0=(Token)match(input,32,FOLLOW_32_in_in_predicate1128); 

                    }
                    break;

            }

            TK_1=(Token)match(input,34,FOLLOW_34_in_in_predicate1135); 
            pushFollow(FOLLOW_in_predicate_value_in_in_predicate1140);
            in_predicate_valueGen=in_predicate_value();

            state._fsp--;

            if (list_in_predicate_valueGen==null) list_in_predicate_valueGen=new ArrayList();
            list_in_predicate_valueGen.add(in_predicate_valueGen);


            		// Create return CST Node
            		Node in_predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		in_predicateReturnNode.setKind("in_predicate");
            	    // Create a CST Node
            		if(list_row_value_constructorGen != null) {
            	        for(Iterator it = list_row_value_constructorGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.row_value_constructor_return r = (DMLSelectParser.row_value_constructor_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("row_value_constructor");
            	            	in_predicateReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		in_predicateReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		in_predicateReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_in_predicate_valueGen != null) {
            	        for(Iterator it = list_in_predicate_valueGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.in_predicate_value_return r = (DMLSelectParser.in_predicate_value_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("in_predicate_value");
            	            	in_predicateReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = in_predicateReturnNode;
            	

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
    // $ANTLR end "in_predicate"

    public static class in_predicate_value_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "in_predicate_value"
    // DMLSelect.g:1172:1: in_predicate_value returns [Node returnNode] : LEFT_PARENTGen= LEFT_PARENT in_value_listGen+= in_value_list RIGHT_PARENTGen= RIGHT_PARENT ;
    public final DMLSelectParser.in_predicate_value_return in_predicate_value() throws RecognitionException {
        DMLSelectParser.in_predicate_value_return retval = new DMLSelectParser.in_predicate_value_return();
        retval.start = input.LT(1);

        Token LEFT_PARENTGen=null;
        Token RIGHT_PARENTGen=null;
        List list_in_value_listGen=null;
        RuleReturnScope in_value_listGen = null;
        try {
            // DMLSelect.g:1173:1: (LEFT_PARENTGen= LEFT_PARENT in_value_listGen+= in_value_list RIGHT_PARENTGen= RIGHT_PARENT )
            // DMLSelect.g:1173:4: LEFT_PARENTGen= LEFT_PARENT in_value_listGen+= in_value_list RIGHT_PARENTGen= RIGHT_PARENT
            {
            LEFT_PARENTGen=(Token)match(input,LEFT_PARENT,FOLLOW_LEFT_PARENT_in_in_predicate_value1162); 
            pushFollow(FOLLOW_in_value_list_in_in_predicate_value1167);
            in_value_listGen=in_value_list();

            state._fsp--;

            if (list_in_value_listGen==null) list_in_value_listGen=new ArrayList();
            list_in_value_listGen.add(in_value_listGen);

            RIGHT_PARENTGen=(Token)match(input,RIGHT_PARENT,FOLLOW_RIGHT_PARENT_in_in_predicate_value1172); 

            		// Create return CST Node
            		Node in_predicate_valueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		in_predicate_valueReturnNode.setKind("in_predicate_value");
            	    // Create a CST Leaf
            		if(LEFT_PARENTGen != null) {
            			Leaf LEFT_PARENTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("LEFT_PARENT", (LEFT_PARENTGen!=null?LEFT_PARENTGen.getText():null), LEFT_PARENTGen.getCharPositionInLine(), LEFT_PARENTGen.getLine());
            			in_predicate_valueReturnNode.getChildren().add(LEFT_PARENTGenLeaf);
            		}
            	    // Create a CST Node
            		if(list_in_value_listGen != null) {
            	        for(Iterator it = list_in_value_listGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.in_value_list_return r = (DMLSelectParser.in_value_list_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("in_value_list");
            	            	in_predicate_valueReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(RIGHT_PARENTGen != null) {
            			Leaf RIGHT_PARENTGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("RIGHT_PARENT", (RIGHT_PARENTGen!=null?RIGHT_PARENTGen.getText():null), RIGHT_PARENTGen.getCharPositionInLine(), RIGHT_PARENTGen.getLine());
            			in_predicate_valueReturnNode.getChildren().add(RIGHT_PARENTGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = in_predicate_valueReturnNode;
            	

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
    // $ANTLR end "in_predicate_value"

    public static class in_value_list_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "in_value_list"
    // DMLSelect.g:1203:1: in_value_list returns [Node returnNode] : derived_columnGen+= derived_column (COMMAGen_List+= COMMA derived_columnGen_1+= derived_column )* ;
    public final DMLSelectParser.in_value_list_return in_value_list() throws RecognitionException {
        DMLSelectParser.in_value_list_return retval = new DMLSelectParser.in_value_list_return();
        retval.start = input.LT(1);

        Token COMMAGen_List=null;
        List list_COMMAGen_List=null;
        List list_derived_columnGen=null;
        List list_derived_columnGen_1=null;
        RuleReturnScope derived_columnGen = null;
        RuleReturnScope derived_columnGen_1 = null;
        try {
            // DMLSelect.g:1204:1: (derived_columnGen+= derived_column (COMMAGen_List+= COMMA derived_columnGen_1+= derived_column )* )
            // DMLSelect.g:1204:4: derived_columnGen+= derived_column (COMMAGen_List+= COMMA derived_columnGen_1+= derived_column )*
            {
            pushFollow(FOLLOW_derived_column_in_in_value_list1194);
            derived_columnGen=derived_column();

            state._fsp--;

            if (list_derived_columnGen==null) list_derived_columnGen=new ArrayList();
            list_derived_columnGen.add(derived_columnGen);

            // DMLSelect.g:1204:38: (COMMAGen_List+= COMMA derived_columnGen_1+= derived_column )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // DMLSelect.g:1204:40: COMMAGen_List+= COMMA derived_columnGen_1+= derived_column
            	    {
            	    COMMAGen_List=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_value_list1200); 
            	    if (list_COMMAGen_List==null) list_COMMAGen_List=new ArrayList();
            	    list_COMMAGen_List.add(COMMAGen_List);

            	    pushFollow(FOLLOW_derived_column_in_in_value_list1205);
            	    derived_columnGen_1=derived_column();

            	    state._fsp--;

            	    if (list_derived_columnGen_1==null) list_derived_columnGen_1=new ArrayList();
            	    list_derived_columnGen_1.add(derived_columnGen_1);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            		// Create return CST Node
            		Node in_value_listReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		in_value_listReturnNode.setKind("in_value_list");
            	    // Create a CST Node
            		if(list_derived_columnGen != null) {
            	        for(Iterator it = list_derived_columnGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.derived_column_return r = (DMLSelectParser.derived_column_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("derived_column");
            	            	in_value_listReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal COMMAGen_List aggregation
            		if(list_COMMAGen_List != null) {
            	    for(int pos = 0; pos < list_COMMAGen_List.size(); pos++ )  { 
            		// Terminal extractor
            	    if(list_COMMAGen_List != null) {
            		    Token t = (Token) list_COMMAGen_List.get(pos); 
            		    Leaf COMMAGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMMA", t.getText(), t.getCharPositionInLine(), t.getLine());
            			in_value_listReturnNode.getChildren().add(COMMAGen_ListLeaf);
            		}
            		// No Terminal extractor
            	    if(list_derived_columnGen_1 != null) {		
            	    	DMLSelectParser.derived_column_return r = (DMLSelectParser.derived_column_return) list_derived_columnGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("derived_column");
            	    		in_value_listReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = in_value_listReturnNode;
            	

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
    // $ANTLR end "in_value_list"

    public static class like_predicate_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "like_predicate"
    // DMLSelect.g:1245:1: like_predicate returns [Node returnNode] : match_valueGen+= match_value (TK_0= 'NOT' )? TK_1= 'LIKE' (patternGen+= pattern )? ;
    public final DMLSelectParser.like_predicate_return like_predicate() throws RecognitionException {
        DMLSelectParser.like_predicate_return retval = new DMLSelectParser.like_predicate_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_match_valueGen=null;
        List list_patternGen=null;
        RuleReturnScope match_valueGen = null;
        RuleReturnScope patternGen = null;
        try {
            // DMLSelect.g:1246:1: (match_valueGen+= match_value (TK_0= 'NOT' )? TK_1= 'LIKE' (patternGen+= pattern )? )
            // DMLSelect.g:1246:4: match_valueGen+= match_value (TK_0= 'NOT' )? TK_1= 'LIKE' (patternGen+= pattern )?
            {
            pushFollow(FOLLOW_match_value_in_like_predicate1229);
            match_valueGen=match_value();

            state._fsp--;

            if (list_match_valueGen==null) list_match_valueGen=new ArrayList();
            list_match_valueGen.add(match_valueGen);

            // DMLSelect.g:1246:32: (TK_0= 'NOT' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // DMLSelect.g:1246:34: TK_0= 'NOT'
                    {
                    TK_0=(Token)match(input,32,FOLLOW_32_in_like_predicate1235); 

                    }
                    break;

            }

            TK_1=(Token)match(input,35,FOLLOW_35_in_like_predicate1242); 
            // DMLSelect.g:1246:60: (patternGen+= pattern )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=ID && LA33_0<=IDEXPRESSION)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // DMLSelect.g:1246:62: patternGen+= pattern
                    {
                    pushFollow(FOLLOW_pattern_in_like_predicate1248);
                    patternGen=pattern();

                    state._fsp--;

                    if (list_patternGen==null) list_patternGen=new ArrayList();
                    list_patternGen.add(patternGen);


                    }
                    break;

            }


            		// Create return CST Node
            		Node like_predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		like_predicateReturnNode.setKind("like_predicate");
            	    // Create a CST Node
            		if(list_match_valueGen != null) {
            	        for(Iterator it = list_match_valueGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.match_value_return r = (DMLSelectParser.match_value_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("match_value");
            	            	like_predicateReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		like_predicateReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		like_predicateReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_patternGen != null) {
            	        for(Iterator it = list_patternGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.pattern_return r = (DMLSelectParser.pattern_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("pattern");
            	            	like_predicateReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = like_predicateReturnNode;
            	

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
    // $ANTLR end "like_predicate"

    public static class match_value_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "match_value"
    // DMLSelect.g:1286:1: match_value returns [Node returnNode] : (derived_columnGen+= derived_column | expressionGen+= expression );
    public final DMLSelectParser.match_value_return match_value() throws RecognitionException {
        DMLSelectParser.match_value_return retval = new DMLSelectParser.match_value_return();
        retval.start = input.LT(1);

        List list_derived_columnGen=null;
        List list_expressionGen=null;
        RuleReturnScope derived_columnGen = null;
        RuleReturnScope expressionGen = null;
        try {
            // DMLSelect.g:1287:1: (derived_columnGen+= derived_column | expressionGen+= expression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==IDEXPRESSION) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // DMLSelect.g:1287:4: derived_columnGen+= derived_column
                    {
                    pushFollow(FOLLOW_derived_column_in_match_value1273);
                    derived_columnGen=derived_column();

                    state._fsp--;

                    if (list_derived_columnGen==null) list_derived_columnGen=new ArrayList();
                    list_derived_columnGen.add(derived_columnGen);


                    		// Create return CST Node
                    		Node match_valueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		match_valueReturnNode.setKind("match_value");
                    	    // Create a CST Node
                    		if(list_derived_columnGen != null) {
                    	        for(Iterator it = list_derived_columnGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.derived_column_return r = (DMLSelectParser.derived_column_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("derived_column");
                    	            	match_valueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = match_valueReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // DMLSelect.g:1304:7: expressionGen+= expression
                    {
                    pushFollow(FOLLOW_expression_in_match_value1284);
                    expressionGen=expression();

                    state._fsp--;

                    if (list_expressionGen==null) list_expressionGen=new ArrayList();
                    list_expressionGen.add(expressionGen);


                    		// Create return CST Node
                    		Node match_valueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		match_valueReturnNode.setKind("match_value");
                    	    // Create a CST Node
                    		if(list_expressionGen != null) {
                    	        for(Iterator it = list_expressionGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.expression_return r = (DMLSelectParser.expression_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("expression");
                    	            	match_valueReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = match_valueReturnNode;
                    	

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
    // $ANTLR end "match_value"

    public static class pattern_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pattern"
    // DMLSelect.g:1324:1: pattern returns [Node returnNode] : (derived_columnGen+= derived_column | expressionGen+= expression );
    public final DMLSelectParser.pattern_return pattern() throws RecognitionException {
        DMLSelectParser.pattern_return retval = new DMLSelectParser.pattern_return();
        retval.start = input.LT(1);

        List list_derived_columnGen=null;
        List list_expressionGen=null;
        RuleReturnScope derived_columnGen = null;
        RuleReturnScope expressionGen = null;
        try {
            // DMLSelect.g:1325:1: (derived_columnGen+= derived_column | expressionGen+= expression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==IDEXPRESSION) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // DMLSelect.g:1325:4: derived_columnGen+= derived_column
                    {
                    pushFollow(FOLLOW_derived_column_in_pattern1307);
                    derived_columnGen=derived_column();

                    state._fsp--;

                    if (list_derived_columnGen==null) list_derived_columnGen=new ArrayList();
                    list_derived_columnGen.add(derived_columnGen);


                    		// Create return CST Node
                    		Node patternReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		patternReturnNode.setKind("pattern");
                    	    // Create a CST Node
                    		if(list_derived_columnGen != null) {
                    	        for(Iterator it = list_derived_columnGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.derived_column_return r = (DMLSelectParser.derived_column_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("derived_column");
                    	            	patternReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = patternReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // DMLSelect.g:1342:7: expressionGen+= expression
                    {
                    pushFollow(FOLLOW_expression_in_pattern1318);
                    expressionGen=expression();

                    state._fsp--;

                    if (list_expressionGen==null) list_expressionGen=new ArrayList();
                    list_expressionGen.add(expressionGen);


                    		// Create return CST Node
                    		Node patternReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		patternReturnNode.setKind("pattern");
                    	    // Create a CST Node
                    		if(list_expressionGen != null) {
                    	        for(Iterator it = list_expressionGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.expression_return r = (DMLSelectParser.expression_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("expression");
                    	            	patternReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = patternReturnNode;
                    	

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
    // $ANTLR end "pattern"

    public static class null_predicate_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "null_predicate"
    // DMLSelect.g:1362:1: null_predicate returns [Node returnNode] : TK_0= 'IS' (TK_1= 'NOT' )? TK_2= 'NULL' ;
    public final DMLSelectParser.null_predicate_return null_predicate() throws RecognitionException {
        DMLSelectParser.null_predicate_return retval = new DMLSelectParser.null_predicate_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;

        try {
            // DMLSelect.g:1363:1: (TK_0= 'IS' (TK_1= 'NOT' )? TK_2= 'NULL' )
            // DMLSelect.g:1363:4: TK_0= 'IS' (TK_1= 'NOT' )? TK_2= 'NULL'
            {
            TK_0=(Token)match(input,36,FOLLOW_36_in_null_predicate1341); 
            // DMLSelect.g:1363:14: (TK_1= 'NOT' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // DMLSelect.g:1363:16: TK_1= 'NOT'
                    {
                    TK_1=(Token)match(input,32,FOLLOW_32_in_null_predicate1347); 

                    }
                    break;

            }

            TK_2=(Token)match(input,NULL_SPECIFICATION,FOLLOW_NULL_SPECIFICATION_in_null_predicate1354); 

            		// Create return CST Node
            		Node null_predicateReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		null_predicateReturnNode.setKind("null_predicate");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		null_predicateReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		null_predicateReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
            	 		null_predicateReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = null_predicateReturnNode;
            	

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
    // $ANTLR end "null_predicate"

    public static class order_by_clause_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "order_by_clause"
    // DMLSelect.g:1388:1: order_by_clause returns [Node returnNode] : TK_0= 'ORDER BY' (sort_specification_listGen+= sort_specification_list )? ;
    public final DMLSelectParser.order_by_clause_return order_by_clause() throws RecognitionException {
        DMLSelectParser.order_by_clause_return retval = new DMLSelectParser.order_by_clause_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_sort_specification_listGen=null;
        RuleReturnScope sort_specification_listGen = null;
        try {
            // DMLSelect.g:1389:1: (TK_0= 'ORDER BY' (sort_specification_listGen+= sort_specification_list )? )
            // DMLSelect.g:1389:4: TK_0= 'ORDER BY' (sort_specification_listGen+= sort_specification_list )?
            {
            TK_0=(Token)match(input,37,FOLLOW_37_in_order_by_clause1376); 
            // DMLSelect.g:1389:20: (sort_specification_listGen+= sort_specification_list )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ID||LA37_0==UNSIGNED_INTEGER) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // DMLSelect.g:1389:22: sort_specification_listGen+= sort_specification_list
                    {
                    pushFollow(FOLLOW_sort_specification_list_in_order_by_clause1382);
                    sort_specification_listGen=sort_specification_list();

                    state._fsp--;

                    if (list_sort_specification_listGen==null) list_sort_specification_listGen=new ArrayList();
                    list_sort_specification_listGen.add(sort_specification_listGen);


                    }
                    break;

            }


            		// Create return CST Node
            		Node order_by_clauseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		order_by_clauseReturnNode.setKind("order_by_clause");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		order_by_clauseReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_sort_specification_listGen != null) {
            	        for(Iterator it = list_sort_specification_listGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.sort_specification_list_return r = (DMLSelectParser.sort_specification_list_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("sort_specification_list");
            	            	order_by_clauseReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = order_by_clauseReturnNode;
            	

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
    // $ANTLR end "order_by_clause"

    public static class sort_specification_list_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "sort_specification_list"
    // DMLSelect.g:1414:1: sort_specification_list returns [Node returnNode] : sort_specificationGen+= sort_specification (COMMAGen_List+= COMMA sort_specificationGen_1+= sort_specification )* ;
    public final DMLSelectParser.sort_specification_list_return sort_specification_list() throws RecognitionException {
        DMLSelectParser.sort_specification_list_return retval = new DMLSelectParser.sort_specification_list_return();
        retval.start = input.LT(1);

        Token COMMAGen_List=null;
        List list_COMMAGen_List=null;
        List list_sort_specificationGen=null;
        List list_sort_specificationGen_1=null;
        RuleReturnScope sort_specificationGen = null;
        RuleReturnScope sort_specificationGen_1 = null;
        try {
            // DMLSelect.g:1415:1: (sort_specificationGen+= sort_specification (COMMAGen_List+= COMMA sort_specificationGen_1+= sort_specification )* )
            // DMLSelect.g:1415:4: sort_specificationGen+= sort_specification (COMMAGen_List+= COMMA sort_specificationGen_1+= sort_specification )*
            {
            pushFollow(FOLLOW_sort_specification_in_sort_specification_list1406);
            sort_specificationGen=sort_specification();

            state._fsp--;

            if (list_sort_specificationGen==null) list_sort_specificationGen=new ArrayList();
            list_sort_specificationGen.add(sort_specificationGen);

            // DMLSelect.g:1415:46: (COMMAGen_List+= COMMA sort_specificationGen_1+= sort_specification )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // DMLSelect.g:1415:48: COMMAGen_List+= COMMA sort_specificationGen_1+= sort_specification
            	    {
            	    COMMAGen_List=(Token)match(input,COMMA,FOLLOW_COMMA_in_sort_specification_list1412); 
            	    if (list_COMMAGen_List==null) list_COMMAGen_List=new ArrayList();
            	    list_COMMAGen_List.add(COMMAGen_List);

            	    pushFollow(FOLLOW_sort_specification_in_sort_specification_list1417);
            	    sort_specificationGen_1=sort_specification();

            	    state._fsp--;

            	    if (list_sort_specificationGen_1==null) list_sort_specificationGen_1=new ArrayList();
            	    list_sort_specificationGen_1.add(sort_specificationGen_1);


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            		// Create return CST Node
            		Node sort_specification_listReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		sort_specification_listReturnNode.setKind("sort_specification_list");
            	    // Create a CST Node
            		if(list_sort_specificationGen != null) {
            	        for(Iterator it = list_sort_specificationGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.sort_specification_return r = (DMLSelectParser.sort_specification_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("sort_specification");
            	            	sort_specification_listReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }

            		// Create a special CST Node for terminal COMMAGen_List aggregation
            		if(list_COMMAGen_List != null) {
            	    for(int pos = 0; pos < list_COMMAGen_List.size(); pos++ )  { 
            		// Terminal extractor
            	    if(list_COMMAGen_List != null) {
            		    Token t = (Token) list_COMMAGen_List.get(pos); 
            		    Leaf COMMAGen_ListLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("COMMA", t.getText(), t.getCharPositionInLine(), t.getLine());
            			sort_specification_listReturnNode.getChildren().add(COMMAGen_ListLeaf);
            		}
            		// No Terminal extractor
            	    if(list_sort_specificationGen_1 != null) {		
            	    	DMLSelectParser.sort_specification_return r = (DMLSelectParser.sort_specification_return) list_sort_specificationGen_1.get(pos); 
            	    	if(r != null && r.returnNode != null) {
            	        	r.returnNode.setKind("sort_specification");
            	    		sort_specification_listReturnNode.getChildren().add(r.returnNode);
            	    	} 
            		}
            		}
            		}

            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = sort_specification_listReturnNode;
            	

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
    // $ANTLR end "sort_specification_list"

    public static class sort_specification_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "sort_specification"
    // DMLSelect.g:1456:1: sort_specification returns [Node returnNode] : sort_keyGen+= sort_key (ORDERING_SPECIFICATIONGen= ORDERING_SPECIFICATION )? ;
    public final DMLSelectParser.sort_specification_return sort_specification() throws RecognitionException {
        DMLSelectParser.sort_specification_return retval = new DMLSelectParser.sort_specification_return();
        retval.start = input.LT(1);

        Token ORDERING_SPECIFICATIONGen=null;
        List list_sort_keyGen=null;
        RuleReturnScope sort_keyGen = null;
        try {
            // DMLSelect.g:1457:1: (sort_keyGen+= sort_key (ORDERING_SPECIFICATIONGen= ORDERING_SPECIFICATION )? )
            // DMLSelect.g:1457:4: sort_keyGen+= sort_key (ORDERING_SPECIFICATIONGen= ORDERING_SPECIFICATION )?
            {
            pushFollow(FOLLOW_sort_key_in_sort_specification1442);
            sort_keyGen=sort_key();

            state._fsp--;

            if (list_sort_keyGen==null) list_sort_keyGen=new ArrayList();
            list_sort_keyGen.add(sort_keyGen);

            // DMLSelect.g:1457:26: (ORDERING_SPECIFICATIONGen= ORDERING_SPECIFICATION )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ORDERING_SPECIFICATION) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // DMLSelect.g:1457:28: ORDERING_SPECIFICATIONGen= ORDERING_SPECIFICATION
                    {
                    ORDERING_SPECIFICATIONGen=(Token)match(input,ORDERING_SPECIFICATION,FOLLOW_ORDERING_SPECIFICATION_in_sort_specification1448); 

                    }
                    break;

            }


            		// Create return CST Node
            		Node sort_specificationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		sort_specificationReturnNode.setKind("sort_specification");
            	    // Create a CST Node
            		if(list_sort_keyGen != null) {
            	        for(Iterator it = list_sort_keyGen.iterator(); it.hasNext(); )  { 
            	            DMLSelectParser.sort_key_return r = (DMLSelectParser.sort_key_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("sort_key");
            	            	sort_specificationReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a CST Leaf
            		if(ORDERING_SPECIFICATIONGen != null) {
            			Leaf ORDERING_SPECIFICATIONGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ORDERING_SPECIFICATION", (ORDERING_SPECIFICATIONGen!=null?ORDERING_SPECIFICATIONGen.getText():null), ORDERING_SPECIFICATIONGen.getCharPositionInLine(), ORDERING_SPECIFICATIONGen.getLine());
            			sort_specificationReturnNode.getChildren().add(ORDERING_SPECIFICATIONGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = sort_specificationReturnNode;
            	

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
    // $ANTLR end "sort_specification"

    public static class sort_key_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "sort_key"
    // DMLSelect.g:1482:1: sort_key returns [Node returnNode] : (column_nameGen+= column_name | UNSIGNED_INTEGERGen= UNSIGNED_INTEGER );
    public final DMLSelectParser.sort_key_return sort_key() throws RecognitionException {
        DMLSelectParser.sort_key_return retval = new DMLSelectParser.sort_key_return();
        retval.start = input.LT(1);

        Token UNSIGNED_INTEGERGen=null;
        List list_column_nameGen=null;
        RuleReturnScope column_nameGen = null;
        try {
            // DMLSelect.g:1483:1: (column_nameGen+= column_name | UNSIGNED_INTEGERGen= UNSIGNED_INTEGER )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==UNSIGNED_INTEGER) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // DMLSelect.g:1483:4: column_nameGen+= column_name
                    {
                    pushFollow(FOLLOW_column_name_in_sort_key1472);
                    column_nameGen=column_name();

                    state._fsp--;

                    if (list_column_nameGen==null) list_column_nameGen=new ArrayList();
                    list_column_nameGen.add(column_nameGen);


                    		// Create return CST Node
                    		Node sort_keyReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sort_keyReturnNode.setKind("sort_key");
                    	    // Create a CST Node
                    		if(list_column_nameGen != null) {
                    	        for(Iterator it = list_column_nameGen.iterator(); it.hasNext(); )  { 
                    	            DMLSelectParser.column_name_return r = (DMLSelectParser.column_name_return) it.next(); 
                    	            if(r != null && r.returnNode != null) {
                    	            	r.returnNode.setKind("column_name");
                    	            	sort_keyReturnNode.getChildren().add(r.returnNode);
                    	            } 
                    	        }
                    	    }
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sort_keyReturnNode;
                    	

                    }
                    break;
                case 2 :
                    // DMLSelect.g:1500:7: UNSIGNED_INTEGERGen= UNSIGNED_INTEGER
                    {
                    UNSIGNED_INTEGERGen=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_sort_key1483); 

                    		// Create return CST Node
                    		Node sort_keyReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
                    		sort_keyReturnNode.setKind("sort_key");
                    	    // Create a CST Leaf
                    		if(UNSIGNED_INTEGERGen != null) {
                    			Leaf UNSIGNED_INTEGERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("UNSIGNED_INTEGER", (UNSIGNED_INTEGERGen!=null?UNSIGNED_INTEGERGen.getText():null), UNSIGNED_INTEGERGen.getCharPositionInLine(), UNSIGNED_INTEGERGen.getLine());
                    			sort_keyReturnNode.getChildren().add(UNSIGNED_INTEGERGenLeaf);
                    		}
                    		// Returns the Node with CST Leaves/Nodes
                    		retval.returnNode = sort_keyReturnNode;
                    	

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
    // $ANTLR end "sort_key"

    // Delegated rules


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA22_eotS =
        "\21\uffff";
    static final String DFA22_eofS =
        "\21\uffff";
    static final String DFA22_minS =
        "\1\5\3\15\2\5\2\uffff\1\41\2\uffff\1\5\1\41\1\uffff\1\5\1\15\1\5";
    static final String DFA22_maxS =
        "\1\44\3\42\2\43\2\uffff\1\42\2\uffff\1\5\1\43\1\uffff\1\5\2\43";
    static final String DFA22_acceptS =
        "\6\uffff\1\1\1\5\1\uffff\1\3\1\2\2\uffff\1\4\3\uffff";
    static final String DFA22_specialS =
        "\21\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\4\1\5\3\uffff\1\1\1\2\1\3\6\6\21\uffff\1\7",
            "\6\6\15\uffff\1\10\1\12\1\11",
            "\6\6\15\uffff\1\10\1\12\1\11",
            "\6\6\15\uffff\1\10\1\12\1\11",
            "\1\15\1\uffff\1\13\5\uffff\6\6\6\uffff\1\15\6\uffff\1\14\1"+
            "\12\1\11\1\15",
            "\1\17\7\uffff\6\6\6\uffff\1\16\6\uffff\1\14\1\12\1\11\1\15",
            "",
            "",
            "\1\12\1\11",
            "",
            "",
            "\1\20",
            "\1\12\1\11\1\15",
            "",
            "\1\17",
            "\6\6\15\uffff\1\14\1\12\1\11\1\15",
            "\1\15\7\uffff\6\6\6\uffff\1\15\6\uffff\1\14\1\12\1\11\1\15"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "682:1: predicate returns [Node returnNode] : (comparison_predicateGen+= comparison_predicate | between_predicateGen+= between_predicate | in_predicateGen+= in_predicate | like_predicateGen+= like_predicate | null_predicateGen+= null_predicate );";
        }
    }
    static final String DFA23_eotS =
        "\22\uffff";
    static final String DFA23_eofS =
        "\7\uffff\6\6\5\uffff";
    static final String DFA23_minS =
        "\1\5\3\15\1\7\1\5\1\uffff\10\5\1\15\1\uffff\1\15";
    static final String DFA23_maxS =
        "\5\22\1\31\1\uffff\6\45\2\5\1\22\1\uffff\1\22";
    static final String DFA23_acceptS =
        "\6\uffff\1\2\11\uffff\1\1\1\uffff";
    static final String DFA23_specialS =
        "\22\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\4\1\5\3\uffff\1\1\1\2\1\3\6\6",
            "\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\15\5\uffff\1\7\1\10\1\11\1\12\1\13\1\14",
            "\1\17\7\uffff\1\7\1\10\1\11\1\12\1\13\1\14\6\uffff\1\16",
            "",
            "\2\20\3\uffff\3\20\13\uffff\1\6\3\uffff\4\6\5\uffff\1\6",
            "\2\20\3\uffff\3\20\13\uffff\1\6\3\uffff\4\6\5\uffff\1\6",
            "\2\20\3\uffff\3\20\13\uffff\1\6\3\uffff\4\6\5\uffff\1\6",
            "\2\20\3\uffff\3\20\13\uffff\1\6\3\uffff\4\6\5\uffff\1\6",
            "\2\20\3\uffff\3\20\13\uffff\1\6\3\uffff\4\6\5\uffff\1\6",
            "\2\20\3\uffff\3\20\13\uffff\1\6\3\uffff\4\6\5\uffff\1\6",
            "\1\21",
            "\1\17",
            "\1\7\1\10\1\11\1\12\1\13\1\14",
            "",
            "\1\7\1\10\1\11\1\12\1\13\1\14"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "771:1: comparison_predicate returns [Node returnNode] : (complete_comparison_predicateGen+= complete_comparison_predicate | incomplete_comparison_predicateGen+= incomplete_comparison_predicate );";
        }
    }
    static final String DFA24_eotS =
        "\12\uffff";
    static final String DFA24_eofS =
        "\2\uffff\6\11\2\uffff";
    static final String DFA24_minS =
        "\1\5\1\uffff\6\5\2\uffff";
    static final String DFA24_maxS =
        "\1\22\1\uffff\6\45\2\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\1\3";
    static final String DFA24_specialS =
        "\12\uffff}>";
    static final String[] DFA24_transitionS = {
            "\2\1\3\uffff\3\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "",
            "\2\10\3\uffff\3\10\13\uffff\1\11\3\uffff\4\11\5\uffff\1\11",
            "\2\10\3\uffff\3\10\13\uffff\1\11\3\uffff\4\11\5\uffff\1\11",
            "\2\10\3\uffff\3\10\13\uffff\1\11\3\uffff\4\11\5\uffff\1\11",
            "\2\10\3\uffff\3\10\13\uffff\1\11\3\uffff\4\11\5\uffff\1\11",
            "\2\10\3\uffff\3\10\13\uffff\1\11\3\uffff\4\11\5\uffff\1\11",
            "\2\10\3\uffff\3\10\13\uffff\1\11\3\uffff\4\11\5\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "850:1: incomplete_comparison_predicate returns [Node returnNode] : (row_value_constructorGen+= row_value_constructor comp_opGen+= comp_op | comp_opGen+= comp_op row_value_constructorGen+= row_value_constructor | comp_opGen+= comp_op );";
        }
    }
 

    public static final BitSet FOLLOW_query_specification_in_statements42 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_query_specification65 = new BitSet(new long[]{0x00000000040003F0L});
    public static final BitSet FOLLOW_SET_QUANTIFIER_in_query_specification71 = new BitSet(new long[]{0x00000000040003F0L});
    public static final BitSet FOLLOW_ID_in_query_specification80 = new BitSet(new long[]{0x00000000060003F0L});
    public static final BitSet FOLLOW_IDEXPRESSION_in_query_specification87 = new BitSet(new long[]{0x00000000060003F0L});
    public static final BitSet FOLLOW_PERIOD_in_query_specification94 = new BitSet(new long[]{0x00000000060003F0L});
    public static final BitSet FOLLOW_ASTERISK_in_query_specification100 = new BitSet(new long[]{0x00000000060003F0L});
    public static final BitSet FOLLOW_COMMA_in_query_specification107 = new BitSet(new long[]{0x00000000060003F0L});
    public static final BitSet FOLLOW_25_in_query_specification114 = new BitSet(new long[]{0x00000000040003F0L});
    public static final BitSet FOLLOW_table_expression_in_query_specification124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_reference_in_derived_column147 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_as_clause_in_derived_column153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_as_clause179 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_column_name_in_as_clause186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDEXPRESSION_in_expression209 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_as_clause_in_expression215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column_name239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_from_clause_in_table_expression261 = new BitSet(new long[]{0x0000002038000002L});
    public static final BitSet FOLLOW_where_clause_in_table_expression267 = new BitSet(new long[]{0x0000002030000002L});
    public static final BitSet FOLLOW_group_by_clause_in_table_expression275 = new BitSet(new long[]{0x0000002020000002L});
    public static final BitSet FOLLOW_having_clause_in_table_expression283 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_order_by_clause_in_table_expression291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_from_clause315 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_reference_in_from_clause320 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_from_clause326 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_table_reference_in_from_clause331 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_table_name_in_table_reference355 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_correlation_specification_in_table_reference361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table_name385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_correlation_specification410 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_correlation_name_in_correlation_specification417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_correlation_name439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_where_clause461 = new BitSet(new long[]{0x000000110207FC60L});
    public static final BitSet FOLLOW_search_condition_in_where_clause466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_group_by_clause488 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_grouping_column_reference_list_in_group_by_clause494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouping_column_reference_in_grouping_column_reference_list518 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_grouping_column_reference_list524 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_grouping_column_reference_in_grouping_column_reference_list529 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_column_reference_in_grouping_column_reference553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_name_in_column_reference576 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PERIOD_in_column_reference581 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_column_name_in_column_reference588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_having_clause610 = new BitSet(new long[]{0x000000110207FC60L});
    public static final BitSet FOLLOW_search_condition_in_having_clause615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_term_in_search_condition637 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_search_condition644 = new BitSet(new long[]{0x000000110207FC60L});
    public static final BitSet FOLLOW_boolean_term_in_search_condition649 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_boolean_factor_in_boolean_term673 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_boolean_term679 = new BitSet(new long[]{0x000000110207FC60L});
    public static final BitSet FOLLOW_boolean_factor_in_boolean_term684 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_32_in_boolean_factor709 = new BitSet(new long[]{0x000000110207FC60L});
    public static final BitSet FOLLOW_predicate_in_boolean_factor716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_predicate_in_predicate738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_predicate_in_predicate749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_predicate_in_predicate760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_like_predicate_in_predicate771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_predicate_in_predicate782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complete_comparison_predicate_in_comparison_predicate804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incomplete_comparison_predicate_in_comparison_predicate815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_in_complete_comparison_predicate837 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_comp_op_in_complete_comparison_predicate842 = new BitSet(new long[]{0x0000000002001C60L});
    public static final BitSet FOLLOW_row_value_constructor_in_complete_comparison_predicate847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_in_incomplete_comparison_predicate869 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_comp_op_in_incomplete_comparison_predicate874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_op_in_incomplete_comparison_predicate885 = new BitSet(new long[]{0x0000000002001C60L});
    public static final BitSet FOLLOW_row_value_constructor_in_incomplete_comparison_predicate890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_op_in_incomplete_comparison_predicate901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_SPECIFICATION_in_row_value_constructor923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_SPECIFICATION_in_row_value_constructor934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_row_value_constructor945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_reference_in_row_value_constructor956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_row_value_constructor967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_OPERATOR_in_comp_op989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUALS_OPERATOR_in_comp_op1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OPERATOR_in_comp_op1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_OPERATOR_in_comp_op1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OR_EQUALS_OPERATOR_in_comp_op1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_OR_EQUALS_OPERATOR_in_comp_op1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_in_between_predicate1066 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_between_predicate1072 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_between_predicate1079 = new BitSet(new long[]{0x0000000082001C60L});
    public static final BitSet FOLLOW_row_value_constructor_in_between_predicate1085 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_between_predicate1092 = new BitSet(new long[]{0x0000000002001C62L});
    public static final BitSet FOLLOW_row_value_constructor_in_between_predicate1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_in_in_predicate1122 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_32_in_in_predicate1128 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_in_predicate1135 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_in_predicate_value_in_in_predicate1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARENT_in_in_predicate_value1162 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_in_value_list_in_in_predicate_value1167 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RIGHT_PARENT_in_in_predicate_value1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derived_column_in_in_value_list1194 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_in_value_list1200 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_derived_column_in_in_value_list1205 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_match_value_in_like_predicate1229 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_32_in_like_predicate1235 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_like_predicate1242 = new BitSet(new long[]{0x0000000002001C62L});
    public static final BitSet FOLLOW_pattern_in_like_predicate1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derived_column_in_match_value1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_match_value1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derived_column_in_pattern1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_pattern1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_null_predicate1341 = new BitSet(new long[]{0x0000000100000400L});
    public static final BitSet FOLLOW_32_in_null_predicate1347 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NULL_SPECIFICATION_in_null_predicate1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_order_by_clause1376 = new BitSet(new long[]{0x0000000002001022L});
    public static final BitSet FOLLOW_sort_specification_list_in_order_by_clause1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sort_specification_in_sort_specification_list1406 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_sort_specification_list1412 = new BitSet(new long[]{0x0000000002001020L});
    public static final BitSet FOLLOW_sort_specification_in_sort_specification_list1417 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_sort_key_in_sort_specification1442 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ORDERING_SPECIFICATION_in_sort_specification1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_sort_key1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_sort_key1483 = new BitSet(new long[]{0x0000000000000002L});

}