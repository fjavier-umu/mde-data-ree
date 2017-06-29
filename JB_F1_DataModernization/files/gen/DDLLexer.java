// $ANTLR 3.2 Sep 23, 2009 12:02:23 DDL.g 2014-03-21 11:00:08

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DDLLexer extends Lexer {
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
    public static final int T__19=19;
    public static final int ML_COMMENT=9;
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

    public DDLLexer() {;} 
    public DDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "DDL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:3:7: ( 'CREATE' )
            // DDL.g:3:9: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:4:7: ( 'OR REPLACE' )
            // DDL.g:4:9: 'OR REPLACE'
            {
            match("OR REPLACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:5:7: ( 'TABLE' )
            // DDL.g:5:9: 'TABLE'
            {
            match("TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:6:7: ( '(' )
            // DDL.g:6:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:7:7: ( ',' )
            // DDL.g:7:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:8:7: ( ')' )
            // DDL.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:9:7: ( 'LOGGING' )
            // DDL.g:9:9: 'LOGGING'
            {
            match("LOGGING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:10:7: ( 'NOCOMPRESS' )
            // DDL.g:10:9: 'NOCOMPRESS'
            {
            match("NOCOMPRESS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:11:7: ( 'NOCACHE' )
            // DDL.g:11:9: 'NOCACHE'
            {
            match("NOCACHE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:12:7: ( 'NOPARALLEL' )
            // DDL.g:12:9: 'NOPARALLEL'
            {
            match("NOPARALLEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:13:7: ( 'MONITORING' )
            // DDL.g:13:9: 'MONITORING'
            {
            match("MONITORING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:14:7: ( ';' )
            // DDL.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:15:7: ( 'COMMENT ON TABLE' )
            // DDL.g:15:9: 'COMMENT ON TABLE'
            {
            match("COMMENT ON TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:16:7: ( 'IS' )
            // DDL.g:16:9: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:17:7: ( 'BYTE' )
            // DDL.g:17:9: 'BYTE'
            {
            match("BYTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:18:7: ( 'CONSTRAINT' )
            // DDL.g:18:9: 'CONSTRAINT'
            {
            match("CONSTRAINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:19:7: ( 'NULL' )
            // DDL.g:19:9: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:20:7: ( 'NOT NULL' )
            // DDL.g:20:9: 'NOT NULL'
            {
            match("NOT NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:21:7: ( 'DEFAULT' )
            // DDL.g:21:9: 'DEFAULT'
            {
            match("DEFAULT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:22:7: ( 'COMMENT ON COLUMN' )
            // DDL.g:22:9: 'COMMENT ON COLUMN'
            {
            match("COMMENT ON COLUMN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:23:7: ( '\\.' )
            // DDL.g:23:9: '\\.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:24:7: ( 'CHECK' )
            // DDL.g:24:9: 'CHECK'
            {
            match("CHECK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:25:7: ( 'IN' )
            // DDL.g:25:9: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:26:7: ( 'FOREIGN' )
            // DDL.g:26:9: 'FOREIGN'
            {
            match("FOREIGN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:27:7: ( 'KEY' )
            // DDL.g:27:9: 'KEY'
            {
            match("KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:28:7: ( 'REFERENCES' )
            // DDL.g:28:9: 'REFERENCES'
            {
            match("REFERENCES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:29:7: ( 'ON' )
            // DDL.g:29:9: 'ON'
            {
            match("ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:30:7: ( 'DELETE' )
            // DDL.g:30:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:31:7: ( 'UPDATE' )
            // DDL.g:31:9: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:32:7: ( 'CASCADE' )
            // DDL.g:32:9: 'CASCADE'
            {
            match("CASCADE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:33:7: ( 'DISABLE' )
            // DDL.g:33:9: 'DISABLE'
            {
            match("DISABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:34:7: ( 'PRIMARY KEY' )
            // DDL.g:34:9: 'PRIMARY KEY'
            {
            match("PRIMARY KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:35:7: ( 'DATABASE' )
            // DDL.g:35:9: 'DATABASE'
            {
            match("DATABASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:36:7: ( 'SCHEMA' )
            // DDL.g:36:9: 'SCHEMA'
            {
            match("SCHEMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:37:7: ( 'IF NOT EXISTS' )
            // DDL.g:37:9: 'IF NOT EXISTS'
            {
            match("IF NOT EXISTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:38:7: ( 'CHARACTER' )
            // DDL.g:38:9: 'CHARACTER'
            {
            match("CHARACTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:39:7: ( 'SET' )
            // DDL.g:39:9: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:40:7: ( '=' )
            // DDL.g:40:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:41:7: ( 'COLLATE' )
            // DDL.g:41:9: 'COLLATE'
            {
            match("COLLATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "CVALUE"
    public final void mCVALUE() throws RecognitionException {
        try {
            int _type = CVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:954:13: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
            // DDL.g:954:15: '\\'' ( options {greedy=false; } : . )* '\\''
            {
            match('\''); 
            // DDL.g:954:20: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // DDL.g:954:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CVALUE"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:955:12: ( ( '0' .. '9' | ',' )* )
            // DDL.g:955:14: ( '0' .. '9' | ',' )*
            {
            // DDL.g:955:14: ( '0' .. '9' | ',' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==','||(LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( input.LA(1)==','||(input.LA(1)>='0' && input.LA(1)<='9') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:956:10: ( ( 'NUMBER' | 'INTEGER' | 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'DATE' | 'LONG' | 'LONG RAW' | 'RAW' | 'NVARCHAR2' | 'ROWID' | 'NCHAR' | 'MLSLABEL' | 'CLOB' | 'NCLOB' | 'BLOB' | 'BFILE' | 'FLOAT' | 'UROWID' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' | 'URITYPE' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'DECIMAL' | 'DOUBLE PRECISION' | 'INT' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'NUMERIC' | 'REAL' | 'SMALLINT' ) )
            // DDL.g:956:12: ( 'NUMBER' | 'INTEGER' | 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'DATE' | 'LONG' | 'LONG RAW' | 'RAW' | 'NVARCHAR2' | 'ROWID' | 'NCHAR' | 'MLSLABEL' | 'CLOB' | 'NCLOB' | 'BLOB' | 'BFILE' | 'FLOAT' | 'UROWID' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' | 'URITYPE' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'DECIMAL' | 'DOUBLE PRECISION' | 'INT' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'NUMERIC' | 'REAL' | 'SMALLINT' )
            {
            // DDL.g:956:12: ( 'NUMBER' | 'INTEGER' | 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'DATE' | 'LONG' | 'LONG RAW' | 'RAW' | 'NVARCHAR2' | 'ROWID' | 'NCHAR' | 'MLSLABEL' | 'CLOB' | 'NCLOB' | 'BLOB' | 'BFILE' | 'FLOAT' | 'UROWID' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' | 'URITYPE' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'DECIMAL' | 'DOUBLE PRECISION' | 'INT' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'NUMERIC' | 'REAL' | 'SMALLINT' )
            int alt3=37;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // DDL.g:956:13: 'NUMBER'
                    {
                    match("NUMBER"); 


                    }
                    break;
                case 2 :
                    // DDL.g:956:24: 'INTEGER'
                    {
                    match("INTEGER"); 


                    }
                    break;
                case 3 :
                    // DDL.g:956:36: 'CHAR'
                    {
                    match("CHAR"); 


                    }
                    break;
                case 4 :
                    // DDL.g:956:45: 'VARCHAR'
                    {
                    match("VARCHAR"); 


                    }
                    break;
                case 5 :
                    // DDL.g:956:57: 'VARCHAR2'
                    {
                    match("VARCHAR2"); 


                    }
                    break;
                case 6 :
                    // DDL.g:956:70: 'TEXT'
                    {
                    match("TEXT"); 


                    }
                    break;
                case 7 :
                    // DDL.g:956:79: 'DATE'
                    {
                    match("DATE"); 


                    }
                    break;
                case 8 :
                    // DDL.g:956:88: 'LONG'
                    {
                    match("LONG"); 


                    }
                    break;
                case 9 :
                    // DDL.g:956:97: 'LONG RAW'
                    {
                    match("LONG RAW"); 


                    }
                    break;
                case 10 :
                    // DDL.g:956:110: 'RAW'
                    {
                    match("RAW"); 


                    }
                    break;
                case 11 :
                    // DDL.g:956:118: 'NVARCHAR2'
                    {
                    match("NVARCHAR2"); 


                    }
                    break;
                case 12 :
                    // DDL.g:956:132: 'ROWID'
                    {
                    match("ROWID"); 


                    }
                    break;
                case 13 :
                    // DDL.g:956:142: 'NCHAR'
                    {
                    match("NCHAR"); 


                    }
                    break;
                case 14 :
                    // DDL.g:956:152: 'MLSLABEL'
                    {
                    match("MLSLABEL"); 


                    }
                    break;
                case 15 :
                    // DDL.g:956:165: 'CLOB'
                    {
                    match("CLOB"); 


                    }
                    break;
                case 16 :
                    // DDL.g:956:174: 'NCLOB'
                    {
                    match("NCLOB"); 


                    }
                    break;
                case 17 :
                    // DDL.g:956:184: 'BLOB'
                    {
                    match("BLOB"); 


                    }
                    break;
                case 18 :
                    // DDL.g:956:193: 'BFILE'
                    {
                    match("BFILE"); 


                    }
                    break;
                case 19 :
                    // DDL.g:956:203: 'FLOAT'
                    {
                    match("FLOAT"); 


                    }
                    break;
                case 20 :
                    // DDL.g:956:213: 'UROWID'
                    {
                    match("UROWID"); 


                    }
                    break;
                case 21 :
                    // DDL.g:956:224: 'BINARY_DOUBLE'
                    {
                    match("BINARY_DOUBLE"); 


                    }
                    break;
                case 22 :
                    // DDL.g:956:242: 'BINARY_FLOAT'
                    {
                    match("BINARY_FLOAT"); 


                    }
                    break;
                case 23 :
                    // DDL.g:956:259: 'URITYPE'
                    {
                    match("URITYPE"); 


                    }
                    break;
                case 24 :
                    // DDL.g:956:271: 'CHAR VARYING'
                    {
                    match("CHAR VARYING"); 


                    }
                    break;
                case 25 :
                    // DDL.g:956:288: 'CHARACTER'
                    {
                    match("CHARACTER"); 


                    }
                    break;
                case 26 :
                    // DDL.g:956:302: 'CHARACTER VARYING'
                    {
                    match("CHARACTER VARYING"); 


                    }
                    break;
                case 27 :
                    // DDL.g:956:324: 'DECIMAL'
                    {
                    match("DECIMAL"); 


                    }
                    break;
                case 28 :
                    // DDL.g:956:336: 'DOUBLE PRECISION'
                    {
                    match("DOUBLE PRECISION"); 


                    }
                    break;
                case 29 :
                    // DDL.g:956:357: 'INT'
                    {
                    match("INT"); 


                    }
                    break;
                case 30 :
                    // DDL.g:956:365: 'NATIONAL CHAR'
                    {
                    match("NATIONAL CHAR"); 


                    }
                    break;
                case 31 :
                    // DDL.g:956:383: 'NATIONAL CHAR VARYING'
                    {
                    match("NATIONAL CHAR VARYING"); 


                    }
                    break;
                case 32 :
                    // DDL.g:956:409: 'NATIONAL CHARACTER'
                    {
                    match("NATIONAL CHARACTER"); 


                    }
                    break;
                case 33 :
                    // DDL.g:956:432: 'NATIONAL CHARACTER VARYING'
                    {
                    match("NATIONAL CHARACTER VARYING"); 


                    }
                    break;
                case 34 :
                    // DDL.g:956:463: 'NCHAR VARYING'
                    {
                    match("NCHAR VARYING"); 


                    }
                    break;
                case 35 :
                    // DDL.g:956:481: 'NUMERIC'
                    {
                    match("NUMERIC"); 


                    }
                    break;
                case 36 :
                    // DDL.g:956:493: 'REAL'
                    {
                    match("REAL"); 


                    }
                    break;
                case 37 :
                    // DDL.g:956:502: 'SMALLINT'
                    {
                    match("SMALLINT"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:957:10: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )* )
            // DDL.g:957:12: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // DDL.g:957:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='#' && LA4_0<='$')||LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:958:10: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // DDL.g:958:12: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // DDL.g:958:12: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:959:11: ( '/*' ( options {greedy=false; } : . )* '*/' ( ';' )? )
            // DDL.g:960:2: '/*' ( options {greedy=false; } : . )* '*/' ( ';' )?
            {
            match("/*"); 

            // DDL.g:960:7: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // DDL.g:960:34: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 

            // DDL.g:960:43: ( ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==';') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // DDL.g:960:44: ';'
                    {
                    match(';'); 

                    }
                    break;

            }

             _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "OL_COMMENT"
    public final void mOL_COMMENT() throws RecognitionException {
        try {
            int _type = OL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:963:11: ( '--' ( options {greedy=false; } : . )* ( '\\n' )+ )
            // DDL.g:963:13: '--' ( options {greedy=false; } : . )* ( '\\n' )+
            {
            match("--"); 

            // DDL.g:963:18: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\n') ) {
                    alt8=2;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // DDL.g:963:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // DDL.g:963:51: ( '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\n') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // DDL.g:963:51: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

             _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OL_COMMENT"

    public void mTokens() throws RecognitionException {
        // DDL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | CVALUE | NUMBER | TYPE | ID | WS | ML_COMMENT | OL_COMMENT )
        int alt10=46;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // DDL.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // DDL.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // DDL.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // DDL.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // DDL.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // DDL.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // DDL.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // DDL.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // DDL.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // DDL.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // DDL.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // DDL.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // DDL.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // DDL.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // DDL.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // DDL.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // DDL.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // DDL.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // DDL.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // DDL.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // DDL.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // DDL.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // DDL.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // DDL.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // DDL.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // DDL.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // DDL.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // DDL.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // DDL.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // DDL.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // DDL.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // DDL.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // DDL.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // DDL.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // DDL.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // DDL.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // DDL.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // DDL.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // DDL.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // DDL.g:1:244: CVALUE
                {
                mCVALUE(); 

                }
                break;
            case 41 :
                // DDL.g:1:251: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 42 :
                // DDL.g:1:258: TYPE
                {
                mTYPE(); 

                }
                break;
            case 43 :
                // DDL.g:1:263: ID
                {
                mID(); 

                }
                break;
            case 44 :
                // DDL.g:1:266: WS
                {
                mWS(); 

                }
                break;
            case 45 :
                // DDL.g:1:269: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 46 :
                // DDL.g:1:280: OL_COMMENT
                {
                mOL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA3_eotS =
        "\45\uffff\1\61\14\uffff\1\72\1\uffff\1\75\1\uffff\1\100\20\uffff"+
        "\1\114\10\uffff\1\123\5\uffff\1\131\6\uffff\1\137\2\uffff";
    static final String DFA3_eofS =
        "\140\uffff";
    static final String DFA3_minS =
        "\1\102\1\101\1\116\1\110\1\101\1\uffff\1\101\1\117\1\101\1\uffff"+
        "\1\106\1\uffff\1\122\1\uffff\1\115\1\uffff\1\110\2\124\1\101\1\uffff"+
        "\1\122\3\uffff\1\116\5\uffff\1\116\1\111\1\102\1\101\1\uffff\1\111"+
        "\1\105\1\122\1\103\1\107\1\101\4\uffff\1\122\1\117\2\uffff\1\40"+
        "\1\110\1\40\1\122\1\40\1\116\1\uffff\1\103\1\uffff\1\101\2\uffff"+
        "\1\131\2\uffff\1\101\1\124\1\122\1\137\1\114\1\105\1\62\1\104\1"+
        "\40\1\122\4\uffff\1\103\1\40\1\110\2\uffff\1\101\1\122\1\40\1\uffff"+
        "\1\103\1\uffff\1\124\1\105\1\122\1\40\2\uffff";
    static final String DFA3_maxS =
        "\2\126\1\116\1\114\1\101\1\uffff\3\117\1\uffff\1\114\1\uffff\1\122"+
        "\1\uffff\1\115\1\uffff\1\114\2\124\1\101\1\uffff\1\122\3\uffff\1"+
        "\116\5\uffff\1\116\1\117\1\105\1\101\1\uffff\1\111\1\105\1\122\1"+
        "\103\1\107\1\101\4\uffff\1\122\1\117\2\uffff\1\101\1\110\1\40\1"+
        "\122\1\40\1\116\1\uffff\1\103\1\uffff\1\101\2\uffff\1\131\2\uffff"+
        "\1\101\1\124\1\122\1\137\1\114\1\105\1\62\1\106\1\40\1\122\4\uffff"+
        "\1\103\1\40\1\110\2\uffff\1\101\1\122\1\101\1\uffff\1\103\1\uffff"+
        "\1\124\1\105\1\122\1\40\2\uffff";
    static final String DFA3_acceptS =
        "\5\uffff\1\6\3\uffff\1\16\1\uffff\1\23\1\uffff\1\45\1\uffff\1\13"+
        "\4\uffff\1\17\1\uffff\1\7\1\33\1\34\1\uffff\1\12\1\14\1\44\1\21"+
        "\1\22\4\uffff\1\20\6\uffff\1\24\1\27\1\1\1\43\2\uffff\1\2\1\35\6"+
        "\uffff\1\30\1\uffff\1\3\1\uffff\1\11\1\10\1\uffff\1\42\1\15\12\uffff"+
        "\1\5\1\4\1\25\1\26\3\uffff\1\32\1\31\3\uffff\1\37\1\uffff\1\36\4"+
        "\uffff\1\41\1\40";
    static final String DFA3_specialS =
        "\140\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\12\1\3\1\6\1\uffff\1\13\2\uffff\1\2\2\uffff\1\7\1\11\1\1"+
            "\3\uffff\1\10\1\15\1\5\1\14\1\4",
            "\1\21\1\uffff\1\20\21\uffff\1\16\1\17",
            "\1\22",
            "\1\23\3\uffff\1\24",
            "\1\25",
            "",
            "\1\26\3\uffff\1\27\11\uffff\1\30",
            "\1\31",
            "\1\32\3\uffff\1\34\11\uffff\1\33",
            "",
            "\1\36\2\uffff\1\37\2\uffff\1\35",
            "",
            "\1\40",
            "",
            "\1\41",
            "",
            "\1\42\3\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\1\47",
            "",
            "",
            "",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\53\5\uffff\1\52",
            "\1\54\2\uffff\1\55",
            "\1\56",
            "",
            "\1\57",
            "\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "",
            "",
            "\1\70\40\uffff\1\71",
            "\1\73",
            "\1\74",
            "\1\76",
            "\1\77",
            "\1\101",
            "",
            "\1\102",
            "",
            "\1\103",
            "",
            "",
            "\1\104",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\1\uffff\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\124",
            "",
            "",
            "\1\125",
            "\1\126",
            "\1\127\40\uffff\1\130",
            "",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "956:12: ( 'NUMBER' | 'INTEGER' | 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'DATE' | 'LONG' | 'LONG RAW' | 'RAW' | 'NVARCHAR2' | 'ROWID' | 'NCHAR' | 'MLSLABEL' | 'CLOB' | 'NCLOB' | 'BLOB' | 'BFILE' | 'FLOAT' | 'UROWID' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' | 'URITYPE' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'DECIMAL' | 'DOUBLE PRECISION' | 'INT' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'NUMERIC' | 'REAL' | 'SMALLINT' )";
        }
    }
    static final String DFA10_eotS =
        "\1\27\3\31\1\uffff\1\46\1\uffff\3\31\1\uffff\3\31\1\uffff\6\31\3"+
        "\uffff\1\31\4\uffff\6\31\1\120\2\31\1\uffff\10\31\1\140\1\142\36"+
        "\31\2\uffff\17\31\1\uffff\1\u0097\2\uffff\14\31\1\u00a5\2\31\1\u0097"+
        "\6\31\1\u00ae\7\31\1\u0097\1\31\1\u0097\1\31\1\u0097\1\31\1\u0097"+
        "\3\31\1\uffff\1\u00bd\11\31\1\uffff\1\u00c7\1\u0097\7\31\1\u0097"+
        "\3\31\1\uffff\1\31\1\u0097\6\31\1\uffff\6\31\1\u00df\2\31\1\u00e2"+
        "\4\31\1\uffff\3\31\2\u0097\4\31\1\uffff\1\u0097\10\31\1\u0097\1"+
        "\31\1\u0097\7\31\1\u00fe\3\31\1\uffff\2\31\1\uffff\4\31\1\u0097"+
        "\10\31\1\u0110\6\31\1\u0116\1\u0097\2\31\1\u0119\2\31\1\uffff\2"+
        "\31\1\u011e\1\31\1\u0120\1\u0121\1\31\1\u0123\1\31\1\u0097\4\31"+
        "\1\u0097\1\31\1\u012b\1\uffff\1\u0097\1\u012c\1\31\1\u012e\1\31"+
        "\1\uffff\1\u0097\1\31\1\uffff\1\31\1\u0097\1\uffff\1\31\1\uffff"+
        "\1\31\2\uffff\1\31\1\uffff\4\31\1\u0097\2\31\2\uffff\1\u013c\1\uffff"+
        "\1\31\1\uffff\2\u0097\1\uffff\1\31\1\u0140\2\31\1\u0097\3\31\1\uffff"+
        "\1\31\1\uffff\1\u0148\1\uffff\1\u0149\1\u014a\1\u014b\2\31\1\u014e"+
        "\5\uffff\2\31\3\uffff\1\31\2\u0097";
    static final String DFA10_eofS =
        "\u0154\uffff";
    static final String DFA10_minS =
        "\1\11\1\101\1\116\1\101\1\uffff\1\54\1\uffff\1\117\1\101\1\114\1"+
        "\uffff\2\106\1\101\1\uffff\1\114\1\105\1\101\1\120\1\122\1\103\3"+
        "\uffff\1\101\4\uffff\1\105\1\114\1\101\1\123\1\117\1\40\1\43\1\102"+
        "\1\130\1\uffff\1\107\1\103\1\114\1\101\1\110\1\124\1\116\1\123\2"+
        "\43\1\40\1\124\1\117\1\111\1\116\1\103\1\123\1\124\1\125\1\122\1"+
        "\117\1\131\1\101\2\127\1\104\2\111\1\110\1\124\1\101\1\122\1\101"+
        "\1\115\1\123\1\114\1\103\1\122\1\103\1\102\2\uffff\1\114\1\124\2"+
        "\107\2\101\1\40\1\114\1\102\1\122\1\101\1\117\2\111\1\114\1\uffff"+
        "\1\43\2\uffff\1\105\1\102\1\114\2\101\1\105\1\111\2\101\1\102\1"+
        "\105\1\101\1\43\1\105\1\114\1\43\1\111\1\101\1\127\1\124\1\115\1"+
        "\105\1\43\1\114\1\103\1\124\1\105\1\124\1\101\1\113\1\43\1\101\1"+
        "\43\1\105\1\43\1\111\1\43\1\115\1\103\1\122\1\uffff\1\43\1\105\1"+
        "\122\1\103\1\122\1\102\1\117\1\124\1\101\1\107\1\uffff\2\43\1\105"+
        "\1\122\1\125\1\124\1\115\2\102\1\43\1\114\1\111\1\124\1\uffff\1"+
        "\122\1\43\1\104\1\124\1\111\1\131\1\101\1\115\1\uffff\1\114\1\110"+
        "\1\105\1\116\1\122\1\124\1\43\1\103\1\104\1\43\1\116\1\120\1\110"+
        "\1\101\1\uffff\1\122\1\111\1\110\2\43\1\116\1\117\1\102\1\105\1"+
        "\uffff\1\43\1\131\1\114\1\105\1\101\1\114\1\101\1\105\1\107\1\43"+
        "\1\105\1\43\1\105\1\104\1\120\1\122\1\101\1\111\1\101\1\43\1\124"+
        "\1\101\1\105\1\uffff\1\124\1\105\1\uffff\1\107\1\122\1\105\1\114"+
        "\1\43\1\103\2\101\1\122\1\105\1\122\1\137\1\124\1\43\1\114\1\105"+
        "\1\123\1\40\2\116\2\43\1\105\1\131\1\43\1\116\1\122\1\uffff\1\40"+
        "\1\111\1\43\1\105\2\43\1\105\1\43\1\114\1\43\1\122\1\114\1\111\1"+
        "\114\1\43\1\104\1\43\1\uffff\2\43\1\105\1\43\1\103\1\uffff\1\43"+
        "\1\40\1\uffff\1\124\1\43\1\117\1\116\1\uffff\1\122\2\uffff\1\123"+
        "\1\uffff\1\105\1\62\1\40\1\116\1\43\1\117\1\114\2\uffff\1\43\1\uffff"+
        "\1\105\1\uffff\2\43\1\116\1\124\1\40\1\123\1\114\1\43\1\107\1\125"+
        "\1\117\1\uffff\1\123\1\40\1\43\1\uffff\3\43\1\102\1\101\1\43\1\103"+
        "\4\uffff\1\114\1\124\3\uffff\1\105\2\43";
    static final String DFA10_maxS =
        "\1\172\2\122\1\105\1\uffff\1\71\1\uffff\1\117\1\126\1\117\1\uffff"+
        "\1\123\1\131\1\117\1\uffff\1\117\1\105\1\117\2\122\1\115\3\uffff"+
        "\1\101\4\uffff\1\105\1\116\1\105\1\123\1\117\1\40\1\172\1\102\1"+
        "\130\1\uffff\1\116\1\124\1\115\1\101\1\114\1\124\1\116\1\123\2\172"+
        "\1\40\1\124\1\117\1\111\1\116\1\114\1\123\1\124\1\125\1\122\1\117"+
        "\1\131\1\106\2\127\1\104\1\117\1\111\1\110\1\124\1\101\1\122\1\101"+
        "\1\115\1\123\1\114\1\103\1\122\1\103\1\102\2\uffff\1\114\1\124\2"+
        "\107\1\117\1\101\1\40\1\114\1\105\1\122\1\101\1\117\2\111\1\114"+
        "\1\uffff\1\172\2\uffff\1\105\1\102\1\114\2\101\1\105\1\111\1\101"+
        "\1\105\1\102\1\105\1\101\1\172\1\105\1\114\1\172\1\111\1\101\1\127"+
        "\1\124\1\115\1\105\1\172\1\114\1\103\1\124\1\105\1\124\1\101\1\113"+
        "\1\172\1\101\1\172\1\105\1\172\1\111\1\172\1\115\1\103\1\122\1\uffff"+
        "\1\172\1\105\1\122\1\103\1\122\1\102\1\117\1\124\1\101\1\107\1\uffff"+
        "\2\172\1\105\1\122\1\125\1\124\1\115\2\102\1\172\1\114\1\111\1\124"+
        "\1\uffff\1\122\1\172\1\104\1\124\1\111\1\131\1\101\1\115\1\uffff"+
        "\1\114\1\110\1\105\1\116\1\122\1\124\1\172\1\103\1\104\1\172\1\116"+
        "\1\120\1\110\1\101\1\uffff\1\122\1\111\1\110\2\172\1\116\1\117\1"+
        "\102\1\105\1\uffff\1\172\1\131\1\114\1\105\1\101\1\114\1\101\1\105"+
        "\1\107\1\172\1\105\1\172\1\105\1\104\1\120\1\122\1\101\1\111\1\101"+
        "\1\172\1\124\1\101\1\105\1\uffff\1\124\1\105\1\uffff\1\107\1\122"+
        "\1\105\1\114\1\172\1\103\2\101\1\122\1\105\1\122\1\137\1\124\1\172"+
        "\1\114\1\105\1\123\1\40\2\116\2\172\1\105\1\131\1\172\1\116\1\122"+
        "\1\uffff\1\40\1\111\1\172\1\105\2\172\1\105\1\172\1\114\1\172\1"+
        "\122\1\114\1\111\1\114\1\172\1\106\1\172\1\uffff\2\172\1\105\1\172"+
        "\1\103\1\uffff\1\172\1\40\1\uffff\1\124\1\172\1\117\1\116\1\uffff"+
        "\1\122\2\uffff\1\123\1\uffff\1\105\1\62\1\40\1\116\1\172\1\117\1"+
        "\114\2\uffff\1\172\1\uffff\1\105\1\uffff\2\172\1\116\1\124\1\172"+
        "\1\123\1\114\1\172\1\107\1\125\1\117\1\uffff\1\123\1\40\1\172\1"+
        "\uffff\3\172\1\102\1\101\1\172\1\124\4\uffff\1\114\1\124\3\uffff"+
        "\1\105\2\172";
    static final String DFA10_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\3\uffff\1\14\3\uffff\1\25\6\uffff\1\46"+
        "\1\50\1\51\1\uffff\1\53\1\54\1\55\1\56\11\uffff\1\5\50\uffff\1\2"+
        "\1\33\17\uffff\1\16\1\uffff\1\27\1\43\50\uffff\1\22\12\uffff\1\52"+
        "\15\uffff\1\31\10\uffff\1\45\16\uffff\1\21\11\uffff\1\17\27\uffff"+
        "\1\26\2\uffff\1\3\33\uffff\1\1\21\uffff\1\34\5\uffff\1\35\2\uffff"+
        "\1\42\4\uffff\1\47\1\uffff\1\36\1\7\1\uffff\1\11\7\uffff\1\23\1"+
        "\37\1\uffff\1\30\1\uffff\1\40\13\uffff\1\41\3\uffff\1\44\7\uffff"+
        "\1\20\1\10\1\12\1\13\2\uffff\1\32\1\15\1\24\3\uffff";
    static final String DFA10_specialS =
        "\u0154\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\6\uffff\1\26\1\4\1\6\2\uffff"+
            "\1\5\1\34\1\16\1\33\13\uffff\1\12\1\uffff\1\25\3\uffff\1\31"+
            "\1\14\1\1\1\15\1\31\1\17\2\31\1\13\1\31\1\20\1\7\1\11\1\10\1"+
            "\2\1\23\1\31\1\21\1\24\1\3\1\22\1\30\4\31\6\uffff\32\31",
            "\1\40\6\uffff\1\37\3\uffff\1\41\2\uffff\1\36\2\uffff\1\35",
            "\1\43\3\uffff\1\42",
            "\1\44\3\uffff\1\45",
            "",
            "\1\27\3\uffff\12\27",
            "",
            "\1\47",
            "\1\54\1\uffff\1\53\13\uffff\1\50\5\uffff\1\51\1\52",
            "\1\56\2\uffff\1\55",
            "",
            "\1\61\7\uffff\1\60\4\uffff\1\57",
            "\1\64\2\uffff\1\65\2\uffff\1\63\14\uffff\1\62",
            "\1\70\3\uffff\1\66\3\uffff\1\67\5\uffff\1\71",
            "",
            "\1\73\2\uffff\1\72",
            "\1\74",
            "\1\76\3\uffff\1\75\11\uffff\1\77",
            "\1\100\1\uffff\1\101",
            "\1\102",
            "\1\103\1\uffff\1\104\7\uffff\1\105",
            "",
            "",
            "",
            "\1\106",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\112\1\110\1\111",
            "\1\114\3\uffff\1\113",
            "\1\115",
            "\1\116",
            "\1\117",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\121",
            "\1\122",
            "",
            "\1\123\6\uffff\1\124",
            "\1\125\14\uffff\1\126\3\uffff\1\127",
            "\1\130\1\131",
            "\1\132",
            "\1\133\3\uffff\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\23\31\1\141\6\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\152\2\uffff\1\150\5\uffff\1\151",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\162\4\uffff\1\161",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\167\5\uffff\1\166",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u008a\15\uffff\1\u0089",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e\2\uffff\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\4\31\1\u0096\25\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00a6",
            "\1\u00a7",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\1\u00b6\31\31\4\uffff"+
            "\1\31\1\uffff\32\31",
            "\1\u00b7",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00b8",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00b9",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00e0",
            "\1\u00e1",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00f6",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0097",
            "\1\u0114",
            "\1\u0115",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u0117",
            "\1\u0118",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u011a",
            "\1\u011b",
            "",
            "\1\u011c",
            "\1\u011d",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u011f",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u0122",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u0124",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u0129\1\uffff\1\u012a",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u012d",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u012f",
            "",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u0130",
            "",
            "\1\u0131",
            "\2\31\10\uffff\1\31\2\uffff\2\31\1\u0132\7\31\7\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "",
            "",
            "\1\u0136",
            "",
            "\1\u0137",
            "\1\u0138",
            "\1\u0097",
            "\1\u0139",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u013a",
            "\1\u013b",
            "",
            "",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "",
            "\1\u013d",
            "",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u013e",
            "\1\u013f",
            "\1\u0097\2\uffff\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32"+
            "\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0141",
            "\1\u0142",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u014c",
            "\1\u014d",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\u0150\20\uffff\1\u014f",
            "",
            "",
            "",
            "",
            "\1\u0151",
            "\1\u0152",
            "",
            "",
            "",
            "\1\u0153",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\2\31\10\uffff\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | CVALUE | NUMBER | TYPE | ID | WS | ML_COMMENT | OL_COMMENT );";
        }
    }
 

}