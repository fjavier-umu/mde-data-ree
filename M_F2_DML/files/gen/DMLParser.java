// $ANTLR 3.0.1 /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3 2014-03-21 17:36:35

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
public class DMLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "CVALUE", "NUMBER", "SQUOTE", "WS", "'INSERT INTO'", "'('", "')'", "'VALUES'", "';'", "','"
    };
    public static final int CVALUE=5;
    public static final int WS=8;
    public static final int NUMBER=6;
    public static final int SQUOTE=7;
    public static final int ID=4;
    public static final int EOF=-1;

        public DMLParser(TokenStream input) {
            super(input);
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("DMLParserTemplates", AngleBracketTemplateLexer.class);

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
    public String getGrammarFileName() { return "/Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3"; }


    public static class insertsStatements_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start insertsStatements
    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:19:1: insertsStatements returns [Node returnNode] : (insertIntoGen+= insertInto )* ;
    public final insertsStatements_return insertsStatements() throws RecognitionException {
        insertsStatements_return retval = new insertsStatements_return();
        retval.start = input.LT(1);

        List list_insertIntoGen=null;
        RuleReturnScope insertIntoGen = null;
        try {
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:20:1: ( (insertIntoGen+= insertInto )* )
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:20:3: (insertIntoGen+= insertInto )*
            {
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:20:3: (insertIntoGen+= insertInto )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:20:4: insertIntoGen+= insertInto
            	    {
            	    pushFollow(FOLLOW_insertInto_in_insertsStatements42);
            	    insertIntoGen=insertInto();
            	    _fsp--;

            	    if (list_insertIntoGen==null) list_insertIntoGen=new ArrayList();
            	    list_insertIntoGen.add(insertIntoGen);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            
            		// Create return CST Node
            		Node insertsStatementsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		insertsStatementsReturnNode.setKind("insertsStatements");
            	    // Create a CST Node
            		if(list_insertIntoGen != null) {
            	        for(Iterator it = list_insertIntoGen.iterator(); it.hasNext(); )  { 
            	            DMLParser.insertInto_return r = (DMLParser.insertInto_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("insertInto");
            	            	insertsStatementsReturnNode.getChildren().add(r.returnNode);
            	            } 
            	        }
            	    }
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = insertsStatementsReturnNode;
            	

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
    // $ANTLR end insertsStatements

    public static class insertInto_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start insertInto
    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:40:1: insertInto returns [Node returnNode] : TK_0= 'INSERT INTO' IDGen= ID (TK_1= '(' )? (columnGen+= column )* (TK_2= ')' )? TK_3= 'VALUES' registryGen+= registry TK_4= ';' ;
    public final insertInto_return insertInto() throws RecognitionException {
        insertInto_return retval = new insertInto_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token IDGen=null;
        Token TK_1=null;
        Token TK_2=null;
        Token TK_3=null;
        Token TK_4=null;
        List list_columnGen=null;
        List list_registryGen=null;
        RuleReturnScope columnGen = null;
        RuleReturnScope registryGen = null;
        try {
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:41:1: (TK_0= 'INSERT INTO' IDGen= ID (TK_1= '(' )? (columnGen+= column )* (TK_2= ')' )? TK_3= 'VALUES' registryGen+= registry TK_4= ';' )
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:41:3: TK_0= 'INSERT INTO' IDGen= ID (TK_1= '(' )? (columnGen+= column )* (TK_2= ')' )? TK_3= 'VALUES' registryGen+= registry TK_4= ';'
            {
            TK_0=(Token)input.LT(1);
            match(input,9,FOLLOW_9_in_insertInto65); 
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_insertInto69); 
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:41:31: (TK_1= '(' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:41:32: TK_1= '('
                    {
                    TK_1=(Token)input.LT(1);
                    match(input,10,FOLLOW_10_in_insertInto74); 

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:41:43: (columnGen+= column )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:41:44: columnGen+= column
            	    {
            	    pushFollow(FOLLOW_column_in_insertInto81);
            	    columnGen=column();
            	    _fsp--;

            	    if (list_columnGen==null) list_columnGen=new ArrayList();
            	    list_columnGen.add(columnGen);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:41:64: (TK_2= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:41:65: TK_2= ')'
                    {
                    TK_2=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_insertInto88); 

                    }
                    break;

            }

            TK_3=(Token)input.LT(1);
            match(input,12,FOLLOW_12_in_insertInto94); 
            pushFollow(FOLLOW_registry_in_insertInto98);
            registryGen=registry();
            _fsp--;

            if (list_registryGen==null) list_registryGen=new ArrayList();
            list_registryGen.add(registryGen);

            TK_4=(Token)input.LT(1);
            match(input,13,FOLLOW_13_in_insertInto102); 
            
            		// Create return CST Node
            		Node insertIntoReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		insertIntoReturnNode.setKind("insertInto");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		insertIntoReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			IDGenLeaf.setKind("ID");
            			IDGenLeaf.setValue(IDGen.getText());
            			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
            			IDGenLeaf.setLine(IDGen.getLine());
            			insertIntoReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_1 != null) {
            			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_1Leaf.setKind("TOKEN");
            	 		TK_1Leaf.setValue(TK_1.getText());
            			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
            			TK_1Leaf.setLine(TK_1.getLine());
            	 		insertIntoReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_columnGen != null) {
            	        for(Iterator it = list_columnGen.iterator(); it.hasNext(); )  { 
            	            DMLParser.column_return r = (DMLParser.column_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("column");
            	            	insertIntoReturnNode.getChildren().add(r.returnNode);
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
            	 		insertIntoReturnNode.getChildren().add(TK_2Leaf);
            	 	}
            	    // Create a Token CST Leaf	
            	    if(TK_3 != null) {
            			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_3Leaf.setKind("TOKEN");
            	 		TK_3Leaf.setValue(TK_3.getText());
            			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
            			TK_3Leaf.setLine(TK_3.getLine());
            	 		insertIntoReturnNode.getChildren().add(TK_3Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_registryGen != null) {
            	        for(Iterator it = list_registryGen.iterator(); it.hasNext(); )  { 
            	            DMLParser.registry_return r = (DMLParser.registry_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("registry");
            	            	insertIntoReturnNode.getChildren().add(r.returnNode);
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
            	 		insertIntoReturnNode.getChildren().add(TK_4Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = insertIntoReturnNode;
            	

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
    // $ANTLR end insertInto

    public static class registry_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start registry
    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:125:1: registry returns [Node returnNode] : TK_0= '(' (valueGen+= value )+ TK_1= ')' ;
    public final registry_return registry() throws RecognitionException {
        registry_return retval = new registry_return();
        retval.start = input.LT(1);

        Token TK_0=null;
        Token TK_1=null;
        List list_valueGen=null;
        RuleReturnScope valueGen = null;
        try {
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:126:1: (TK_0= '(' (valueGen+= value )+ TK_1= ')' )
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:126:3: TK_0= '(' (valueGen+= value )+ TK_1= ')'
            {
            TK_0=(Token)input.LT(1);
            match(input,10,FOLLOW_10_in_registry124); 
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:126:12: (valueGen+= value )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=ID && LA5_0<=NUMBER)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:126:13: valueGen+= value
            	    {
            	    pushFollow(FOLLOW_value_in_registry129);
            	    valueGen=value();
            	    _fsp--;

            	    if (list_valueGen==null) list_valueGen=new ArrayList();
            	    list_valueGen.add(valueGen);


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

            TK_1=(Token)input.LT(1);
            match(input,11,FOLLOW_11_in_registry135); 
            
            		// Create return CST Node
            		Node registryReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		registryReturnNode.setKind("registry");
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		registryReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            	    // Create a CST Node
            		if(list_valueGen != null) {
            	        for(Iterator it = list_valueGen.iterator(); it.hasNext(); )  { 
            	            DMLParser.value_return r = (DMLParser.value_return) it.next(); 
            	            if(r != null && r.returnNode != null) {
            	            	r.returnNode.setKind("value");
            	            	registryReturnNode.getChildren().add(r.returnNode);
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
            	 		registryReturnNode.getChildren().add(TK_1Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = registryReturnNode;
            	

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
    // $ANTLR end registry

    public static class value_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start value
    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:164:1: value returns [Node returnNode] : (IDGen= ID | CVALUEGen= CVALUE | NUMBERGen= NUMBER ) (TK_0= ',' )? ;
    public final value_return value() throws RecognitionException {
        value_return retval = new value_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token CVALUEGen=null;
        Token NUMBERGen=null;
        Token TK_0=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:165:1: ( (IDGen= ID | CVALUEGen= CVALUE | NUMBERGen= NUMBER ) (TK_0= ',' )? )
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:165:3: (IDGen= ID | CVALUEGen= CVALUE | NUMBERGen= NUMBER ) (TK_0= ',' )?
            {
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:165:3: (IDGen= ID | CVALUEGen= CVALUE | NUMBERGen= NUMBER )
            int alt6=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt6=1;
                }
                break;
            case CVALUE:
                {
                alt6=2;
                }
                break;
            case NUMBER:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("165:3: (IDGen= ID | CVALUEGen= CVALUE | NUMBERGen= NUMBER )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:165:4: IDGen= ID
                    {
                    IDGen=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_value157); 

                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:165:15: CVALUEGen= CVALUE
                    {
                    CVALUEGen=(Token)input.LT(1);
                    match(input,CVALUE,FOLLOW_CVALUE_in_value163); 

                    }
                    break;
                case 3 :
                    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:165:34: NUMBERGen= NUMBER
                    {
                    NUMBERGen=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_value169); 

                    }
                    break;

            }

            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:165:52: (TK_0= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:165:53: TK_0= ','
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_value175); 

                    }
                    break;

            }

            
            		// Create return CST Node
            		Node valueReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
            		valueReturnNode.setKind("value");
            	    // Create a CST Leaf
            		if(IDGen != null) {
            			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			IDGenLeaf.setKind("ID");
            			IDGenLeaf.setValue(IDGen.getText());
            			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
            			IDGenLeaf.setLine(IDGen.getLine());
            			valueReturnNode.getChildren().add(IDGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(CVALUEGen != null) {
            			Leaf CVALUEGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			CVALUEGenLeaf.setKind("CVALUE");
            			CVALUEGenLeaf.setValue(CVALUEGen.getText());
            			CVALUEGenLeaf.setPos(CVALUEGen.getCharPositionInLine());
            			CVALUEGenLeaf.setLine(CVALUEGen.getLine());
            			valueReturnNode.getChildren().add(CVALUEGenLeaf);
            		}
            	    // Create a CST Leaf
            		if(NUMBERGen != null) {
            			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            			NUMBERGenLeaf.setKind("NUMBER");
            			NUMBERGenLeaf.setValue(NUMBERGen.getText());
            			NUMBERGenLeaf.setPos(NUMBERGen.getCharPositionInLine());
            			NUMBERGenLeaf.setLine(NUMBERGen.getLine());
            			valueReturnNode.getChildren().add(NUMBERGenLeaf);
            		}
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		valueReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = valueReturnNode;
            	

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
    // $ANTLR end value

    public static class column_return extends ParserRuleReturnScope {
        public Node returnNode;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start column
    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:211:1: column returns [Node returnNode] : IDGen= ID (TK_0= ',' )? ;
    public final column_return column() throws RecognitionException {
        column_return retval = new column_return();
        retval.start = input.LT(1);

        Token IDGen=null;
        Token TK_0=null;

        try {
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:212:1: (IDGen= ID (TK_0= ',' )? )
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:212:3: IDGen= ID (TK_0= ',' )?
            {
            IDGen=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_column198); 
            // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:212:12: (TK_0= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3:212:13: TK_0= ','
                    {
                    TK_0=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_column203); 

                    }
                    break;

            }

            
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
            	    // Create a Token CST Leaf	
            	    if(TK_0 != null) {
            			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
            	 		TK_0Leaf.setKind("TOKEN");
            	 		TK_0Leaf.setValue(TK_0.getText());
            			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
            			TK_0Leaf.setLine(TK_0.getLine());
            	 		columnReturnNode.getChildren().add(TK_0Leaf);
            	 	}
            		// Returns the Node with CST Leaves/Nodes
            		retval.returnNode = columnReturnNode;
            	

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


 

    public static final BitSet FOLLOW_insertInto_in_insertsStatements42 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_insertInto65 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_insertInto69 = new BitSet(new long[]{0x0000000000001C10L});
    public static final BitSet FOLLOW_10_in_insertInto74 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_column_in_insertInto81 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_11_in_insertInto88 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_insertInto94 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_registry_in_insertInto98 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_insertInto102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_registry124 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_value_in_registry129 = new BitSet(new long[]{0x0000000000000870L});
    public static final BitSet FOLLOW_11_in_registry135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value157 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_CVALUE_in_value163 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_NUMBER_in_value169 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_value175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_column198 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_column203 = new BitSet(new long[]{0x0000000000000002L});

}