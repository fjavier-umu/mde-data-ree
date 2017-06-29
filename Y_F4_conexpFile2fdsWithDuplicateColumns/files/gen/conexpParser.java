// $ANTLR 3.2 Sep 23, 2009 12:02:23 conexp.g 2011-08-28 19:17:46

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
public class conexpParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "WS", "';'", "'('", "')'", "'<'", "'>'", "'==>'", "'{'", "'}'"
    };
    public static final int WS=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int NUMBER=5;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;

    // delegates
    // delegators


        public conexpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public conexpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("conexpParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return conexpParser.tokenNames; }
    public String getGrammarFileName() { return "conexp.g"; }


    public static class mainRule_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mainRule"
    // conexp.g:19:1: mainRule returns [Node returnNode] : databaseGen+= database TK_0= ';' (table_and_implicationsGen+= table_and_implications )* ;
    public final conexpParser.mainRule_return mainRule() throws RecognitionException {
        conexpParser.mainRule_return retval = new conexpParser.mainRule_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        List list_databaseGen=null;
        List list_table_and_implicationsGen=null;
        RuleReturnScope databaseGen = null;
        RuleReturnScope table_and_implicationsGen = null;
        try {
            // conexp.g:20:1: (databaseGen+= database TK_0= ';' (table_and_implicationsGen+= table_and_implications )* )
            // conexp.g:20:4: databaseGen+= database TK_0= ';' (table_and_implicationsGen+= table_and_implications )*
            {
            pushFollow(FOLLOW_database_in_mainRule42);
            databaseGen=database();

            state._fsp--;

            if (list_databaseGen==null) list_databaseGen=new ArrayList();
            list_databaseGen.add(databaseGen);

            TK_0=(Token)match(input,7,FOLLOW_7_in_mainRule47); 
            // conexp.g:20:36: (table_and_implicationsGen+= table_and_implications )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // conexp.g:20:38: table_and_implicationsGen+= table_and_implications
            	    {
            	    pushFollow(FOLLOW_table_and_implications_in_mainRule53);
            	    table_and_implicationsGen=table_and_implications();

            	    state._fsp--;

            	    if (list_table_and_implicationsGen==null) list_table_and_implicationsGen=new ArrayList();
            	    list_table_and_implicationsGen.add(table_and_implicationsGen);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            		// Create return CST Node
            		Node mainRuleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		mainRuleReturnNode.setKind("mainRule");
            	    // Create a CST Node
            		if(list_databaseGen != null) {
            	        for(Iterator it = list_databaseGen.iterator(); it.hasNext(); )  { 
            	            conexpParser.database_return r = (conexpParser.database_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("database");
            	            	mainRuleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		mainRuleReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_table_and_implicationsGen != null) {
            	        for(Iterator it = list_table_and_implicationsGen.iterator(); it.hasNext(); )  { 
            	            conexpParser.table_and_implications_return r = (conexpParser.table_and_implications_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("table_and_implications");
            	            	mainRuleReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = mainRuleReturnNode;
            	

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
    // $ANTLR end "mainRule"

    public static class database_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "database"
    // conexp.g:55:1: database returns [Node returnNode] : IDGen= ID ;
    public final conexpParser.database_return database() throws RecognitionException {
        conexpParser.database_return retval = new conexpParser.database_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // conexp.g:56:1: (IDGen= ID )
            // conexp.g:56:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_database77); 

            		// Create return CST Node
            		Node databaseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		databaseReturnNode.setKind("database");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			databaseReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = databaseReturnNode;
            	

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

    public static class table_and_implications_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "table_and_implications"
    // conexp.g:71:1: table_and_implications returns [Node returnNode] : tableGen+= table TK_0= '(' implicationsGen+= implications TK_1= ')' ;
    public final conexpParser.table_and_implications_return table_and_implications() throws RecognitionException {
        conexpParser.table_and_implications_return retval = new conexpParser.table_and_implications_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_tableGen=null;
        List list_implicationsGen=null;
        RuleReturnScope tableGen = null;
        RuleReturnScope implicationsGen = null;
        try {
            // conexp.g:72:1: (tableGen+= table TK_0= '(' implicationsGen+= implications TK_1= ')' )
            // conexp.g:72:4: tableGen+= table TK_0= '(' implicationsGen+= implications TK_1= ')'
            {
            pushFollow(FOLLOW_table_in_table_and_implications100);
            tableGen=table();

            state._fsp--;

            if (list_tableGen==null) list_tableGen=new ArrayList();
            list_tableGen.add(tableGen);

            TK_0=(Token)match(input,8,FOLLOW_8_in_table_and_implications105); 
            pushFollow(FOLLOW_implications_in_table_and_implications110);
            implicationsGen=implications();

            state._fsp--;

            if (list_implicationsGen==null) list_implicationsGen=new ArrayList();
            list_implicationsGen.add(implicationsGen);

            TK_1=(Token)match(input,9,FOLLOW_9_in_table_and_implications115); 

            		// Create return CST Node
            		Node table_and_implicationsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		table_and_implicationsReturnNode.setKind("table_and_implications");
            	    // Create a CST Node
            		if(list_tableGen != null) {
            	        for(Iterator it = list_tableGen.iterator(); it.hasNext(); )  { 
            	            conexpParser.table_return r = (conexpParser.table_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("table");
            	            	table_and_implicationsReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		table_and_implicationsReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_implicationsGen != null) {
            	        for(Iterator it = list_implicationsGen.iterator(); it.hasNext(); )  { 
            	            conexpParser.implications_return r = (conexpParser.implications_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("implications");
            	            	table_and_implicationsReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		table_and_implicationsReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = table_and_implicationsReturnNode;
            	

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
    // $ANTLR end "table_and_implications"

    public static class table_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "table"
    // conexp.g:112:1: table returns [Node returnNode] : IDGen= ID ;
    public final conexpParser.table_return table() throws RecognitionException {
        conexpParser.table_return retval = new conexpParser.table_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // conexp.g:113:1: (IDGen= ID )
            // conexp.g:113:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_table137); 

            		// Create return CST Node
            		Node tableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		tableReturnNode.setKind("table");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			tableReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = tableReturnNode;
            	

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

    public static class implications_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "implications"
    // conexp.g:128:1: implications returns [Node returnNode] : (implicationGen+= implication )* ;
    public final conexpParser.implications_return implications() throws RecognitionException {
        conexpParser.implications_return retval = new conexpParser.implications_return();
        retval.start = input.LT(1);

        List list_implicationGen=null;
        RuleReturnScope implicationGen = null;
        try {
            // conexp.g:129:1: ( (implicationGen+= implication )* )
            // conexp.g:129:3: (implicationGen+= implication )*
            {
            // conexp.g:129:3: (implicationGen+= implication )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NUMBER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // conexp.g:129:5: implicationGen+= implication
            	    {
            	    pushFollow(FOLLOW_implication_in_implications161);
            	    implicationGen=implication();

            	    state._fsp--;

            	    if (list_implicationGen==null) list_implicationGen=new ArrayList();
            	    list_implicationGen.add(implicationGen);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            		// Create return CST Node
            		Node implicationsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		implicationsReturnNode.setKind("implications");
            	    // Create a CST Node
            		if(list_implicationGen != null) {
            	        for(Iterator it = list_implicationGen.iterator(); it.hasNext(); )  { 
            	            conexpParser.implication_return r = (conexpParser.implication_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("implication");
            	            	implicationsReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = implicationsReturnNode;
            	

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
    // $ANTLR end "implications"

    public static class implication_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "implication"
    // conexp.g:149:1: implication returns [Node returnNode] : noGen+= no TK_0= '<' number_of_objectsGen+= number_of_objects TK_1= '>' premiseGen+= premise TK_2= '==>' conclusionGen+= conclusion TK_3= ';' ;
    public final conexpParser.implication_return implication() throws RecognitionException {
        conexpParser.implication_return retval = new conexpParser.implication_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        List list_noGen=null;
        List list_number_of_objectsGen=null;
        List list_premiseGen=null;
        List list_conclusionGen=null;
        RuleReturnScope noGen = null;
        RuleReturnScope number_of_objectsGen = null;
        RuleReturnScope premiseGen = null;
        RuleReturnScope conclusionGen = null;
        try {
            // conexp.g:150:1: (noGen+= no TK_0= '<' number_of_objectsGen+= number_of_objects TK_1= '>' premiseGen+= premise TK_2= '==>' conclusionGen+= conclusion TK_3= ';' )
            // conexp.g:150:4: noGen+= no TK_0= '<' number_of_objectsGen+= number_of_objects TK_1= '>' premiseGen+= premise TK_2= '==>' conclusionGen+= conclusion TK_3= ';'
            {
            pushFollow(FOLLOW_no_in_implication186);
            noGen=no();

            state._fsp--;

            if (list_noGen==null) list_noGen=new ArrayList();
            list_noGen.add(noGen);

            TK_0=(Token)match(input,10,FOLLOW_10_in_implication191); 
            pushFollow(FOLLOW_number_of_objects_in_implication196);
            number_of_objectsGen=number_of_objects();

            state._fsp--;

            if (list_number_of_objectsGen==null) list_number_of_objectsGen=new ArrayList();
            list_number_of_objectsGen.add(number_of_objectsGen);

            TK_1=(Token)match(input,11,FOLLOW_11_in_implication201); 
            pushFollow(FOLLOW_premise_in_implication206);
            premiseGen=premise();

            state._fsp--;

            if (list_premiseGen==null) list_premiseGen=new ArrayList();
            list_premiseGen.add(premiseGen);

            TK_2=(Token)match(input,12,FOLLOW_12_in_implication211); 
            pushFollow(FOLLOW_conclusion_in_implication216);
            conclusionGen=conclusion();

            state._fsp--;

            if (list_conclusionGen==null) list_conclusionGen=new ArrayList();
            list_conclusionGen.add(conclusionGen);

            TK_3=(Token)match(input,7,FOLLOW_7_in_implication221); 

            		// Create return CST Node
            		Node implicationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		implicationReturnNode.setKind("implication");
            	    // Create a CST Node
            		if(list_noGen != null) {
            	        for(Iterator it = list_noGen.iterator(); it.hasNext(); )  { 
            	            conexpParser.no_return r = (conexpParser.no_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("no");
            	            	implicationReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		implicationReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_number_of_objectsGen != null) {
            	        for(Iterator it = list_number_of_objectsGen.iterator(); it.hasNext(); )  { 
            	            conexpParser.number_of_objects_return r = (conexpParser.number_of_objects_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("number_of_objects");
            	            	implicationReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		implicationReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_premiseGen != null) {
            	        for(Iterator it = list_premiseGen.iterator(); it.hasNext(); )  { 
            	            conexpParser.premise_return r = (conexpParser.premise_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("premise");
            	            	implicationReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_2 != null) {
            			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_2!=null?TK_2.getText():null), TK_2.getCharPositionInLine(), TK_2.getLine());
            	 		implicationReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_conclusionGen != null) {
            	        for(Iterator it = list_conclusionGen.iterator(); it.hasNext(); )  { 
            	            conexpParser.conclusion_return r = (conexpParser.conclusion_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("conclusion");
            	            	implicationReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_3!=null?TK_3.getText():null), TK_3.getCharPositionInLine(), TK_3.getLine());
            	 		implicationReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = implicationReturnNode;
            	

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
    // $ANTLR end "implication"

    public static class no_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "no"
    // conexp.g:220:1: no returns [Node returnNode] : NUMBERGen= NUMBER ;
    public final conexpParser.no_return no() throws RecognitionException {
        conexpParser.no_return retval = new conexpParser.no_return();
        retval.start = input.LT(1);

        Token NUMBERGen=null;

        try {
            // conexp.g:221:1: (NUMBERGen= NUMBER )
            // conexp.g:221:4: NUMBERGen= NUMBER
            {
            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_no243); 

            		// Create return CST Node
            		Node noReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		noReturnNode.setKind("no");
            	    // Create a CST Leaf
            		if(NUMBERGen != null) {
            			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
            			noReturnNode.getChildren().add(NUMBERGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = noReturnNode;
            	

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
    // $ANTLR end "no"

    public static class number_of_objects_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "number_of_objects"
    // conexp.g:236:1: number_of_objects returns [Node returnNode] : NUMBERGen= NUMBER ;
    public final conexpParser.number_of_objects_return number_of_objects() throws RecognitionException {
        conexpParser.number_of_objects_return retval = new conexpParser.number_of_objects_return();
        retval.start = input.LT(1);

        Token NUMBERGen=null;

        try {
            // conexp.g:237:1: (NUMBERGen= NUMBER )
            // conexp.g:237:4: NUMBERGen= NUMBER
            {
            NUMBERGen=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_number_of_objects266); 

            		// Create return CST Node
            		Node number_of_objectsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		number_of_objectsReturnNode.setKind("number_of_objects");
            	    // Create a CST Leaf
            		if(NUMBERGen != null) {
            			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", (NUMBERGen!=null?NUMBERGen.getText():null), NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
            			number_of_objectsReturnNode.getChildren().add(NUMBERGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = number_of_objectsReturnNode;
            	

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
    // $ANTLR end "number_of_objects"

    public static class premise_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "premise"
    // conexp.g:252:1: premise returns [Node returnNode] : ( (attributeGen+= attribute )+ | TK_0= '{' TK_1= '}' ) ;
    public final conexpParser.premise_return premise() throws RecognitionException {
        conexpParser.premise_return retval = new conexpParser.premise_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_attributeGen=null;
        RuleReturnScope attributeGen = null;
        try {
            // conexp.g:253:1: ( ( (attributeGen+= attribute )+ | TK_0= '{' TK_1= '}' ) )
            // conexp.g:253:3: ( (attributeGen+= attribute )+ | TK_0= '{' TK_1= '}' )
            {
            // conexp.g:253:3: ( (attributeGen+= attribute )+ | TK_0= '{' TK_1= '}' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // conexp.g:253:5: (attributeGen+= attribute )+
                    {
                    // conexp.g:253:17: (attributeGen+= attribute )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // conexp.g:253:17: attributeGen+= attribute
                    	    {
                    	    pushFollow(FOLLOW_attribute_in_premise290);
                    	    attributeGen=attribute();

                    	    state._fsp--;

                    	    if (list_attributeGen==null) list_attributeGen=new ArrayList();
                    	    list_attributeGen.add(attributeGen);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // conexp.g:253:33: TK_0= '{' TK_1= '}'
                    {
                    TK_0=(Token)match(input,13,FOLLOW_13_in_premise298); 
                    TK_1=(Token)match(input,14,FOLLOW_14_in_premise303); 

                    }
                    break;

            }


            		// Create return CST Node
            		Node premiseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		premiseReturnNode.setKind("premise");
            	    // Create a CST Node
            		if(list_attributeGen != null) {
            	        for(Iterator it = list_attributeGen.iterator(); it.hasNext(); )  { 
            	            conexpParser.attribute_return r = (conexpParser.attribute_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("attribute");
            	            	premiseReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_0!=null?TK_0.getText():null), TK_0.getCharPositionInLine(), TK_0.getLine());
            	 		premiseReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", (TK_1!=null?TK_1.getText():null), TK_1.getCharPositionInLine(), TK_1.getLine());
            	 		premiseReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = premiseReturnNode;
            	

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
    // $ANTLR end "premise"

    public static class conclusion_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "conclusion"
    // conexp.g:283:1: conclusion returns [Node returnNode] : (attributeGen+= attribute )+ ;
    public final conexpParser.conclusion_return conclusion() throws RecognitionException {
        conexpParser.conclusion_return retval = new conexpParser.conclusion_return();
        retval.start = input.LT(1);

        List list_attributeGen=null;
        RuleReturnScope attributeGen = null;
        try {
            // conexp.g:284:1: ( (attributeGen+= attribute )+ )
            // conexp.g:284:4: (attributeGen+= attribute )+
            {
            // conexp.g:284:16: (attributeGen+= attribute )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // conexp.g:284:16: attributeGen+= attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_conclusion327);
            	    attributeGen=attribute();

            	    state._fsp--;

            	    if (list_attributeGen==null) list_attributeGen=new ArrayList();
            	    list_attributeGen.add(attributeGen);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            		// Create return CST Node
            		Node conclusionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		conclusionReturnNode.setKind("conclusion");
            	    // Create a CST Node
            		if(list_attributeGen != null) {
            	        for(Iterator it = list_attributeGen.iterator(); it.hasNext(); )  { 
            	            conexpParser.attribute_return r = (conexpParser.attribute_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("attribute");
            	            	conclusionReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = conclusionReturnNode;
            	

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
    // $ANTLR end "conclusion"

    public static class attribute_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "attribute"
    // conexp.g:304:1: attribute returns [Node returnNode] : IDGen= ID ;
    public final conexpParser.attribute_return attribute() throws RecognitionException {
        conexpParser.attribute_return retval = new conexpParser.attribute_return();
        retval.start = input.LT(1);

        Token IDGen=null;

        try {
            // conexp.g:305:1: (IDGen= ID )
            // conexp.g:305:4: IDGen= ID
            {
            IDGen=(Token)match(input,ID,FOLLOW_ID_in_attribute351); 

            		// Create return CST Node
            		Node attributeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		attributeReturnNode.setKind("attribute");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", (IDGen!=null?IDGen.getText():null), IDGen.getCharPositionInLine(), IDGen.getLine());
            			attributeReturnNode.getChildren().add(IDGenLeaf);
            		}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = attributeReturnNode;
            	

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
    // $ANTLR end "attribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_database_in_mainRule42 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_mainRule47 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_table_and_implications_in_mainRule53 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_database77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_table_and_implications100 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_table_and_implications105 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_implications_in_table_and_implications110 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_table_and_implications115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implication_in_implications161 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_no_in_implication186 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_implication191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_number_of_objects_in_implication196 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_implication201 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_premise_in_implication206 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_implication211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_conclusion_in_implication216 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_implication221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_no243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_number_of_objects266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_premise290 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13_in_premise298 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_premise303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_conclusion327 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_attribute351 = new BitSet(new long[]{0x0000000000000002L});

}