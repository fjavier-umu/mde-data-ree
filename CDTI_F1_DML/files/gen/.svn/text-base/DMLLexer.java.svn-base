// $ANTLR 3.0.1 /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3 2012-01-17 17:11:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DMLLexer extends Lexer {
    public static final int CVALUE=5;
    public static final int WS=8;
    public static final int NUMBER=6;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T9=9;
    public static final int SQUOTE=7;
    public static final int ID=4;
    public static final int Tokens=15;
    public static final int EOF=-1;
    public DMLLexer() {;} 
    public DMLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3"; }

    // $ANTLR start T9
    public final void mT9() throws RecognitionException {
        try {
            int _type = T9;
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:3:4: ( 'INSERT INTO' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:3:6: 'INSERT INTO'
            {
            match("INSERT INTO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T9

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:4:5: ( '(' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:4:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:5:5: ( ')' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:5:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:6:5: ( 'VALUES' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:6:7: 'VALUES'
            {
            match("VALUES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:7:5: ( ';' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:7:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:8:5: ( ',' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:8:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:241:2: ( ( '0' .. '9' | '.' )* )
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:241:4: ( '0' .. '9' | '.' )*
            {
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:241:4: ( '0' .. '9' | '.' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.'||(LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:245:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' | '@' | '.' )* )
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:245:4: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' | '@' | '.' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:245:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' | '@' | '.' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='#' && LA2_0<='$')||(LA2_0>='-' && LA2_0<='.')||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='@' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start SQUOTE
    public final void mSQUOTE() throws RecognitionException {
        try {
            int _type = SQUOTE;
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:249:2: ( '\\u0027' )
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:249:4: '\\u0027'
            {
            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SQUOTE

    // $ANTLR start CVALUE
    public final void mCVALUE() throws RecognitionException {
        try {
            int _type = CVALUE;
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:253:2: ( SQUOTE ( options {greedy=false; } : . )* SQUOTE )
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:253:4: SQUOTE ( options {greedy=false; } : . )* SQUOTE
            {
            mSQUOTE(); 
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:253:11: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFE')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:253:39: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mSQUOTE(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CVALUE

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:257:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:257:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:257:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    public void mTokens() throws RecognitionException {
        // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:8: ( T9 | T10 | T11 | T12 | T13 | T14 | NUMBER | ID | SQUOTE | CVALUE | WS )
        int alt5=11;
        switch ( input.LA(1) ) {
        case 'I':
            {
            int LA5_1 = input.LA(2);

            if ( (LA5_1=='N') ) {
                int LA5_11 = input.LA(3);

                if ( (LA5_11=='S') ) {
                    int LA5_15 = input.LA(4);

                    if ( (LA5_15=='E') ) {
                        int LA5_17 = input.LA(5);

                        if ( (LA5_17=='R') ) {
                            int LA5_19 = input.LA(6);

                            if ( (LA5_19=='T') ) {
                                int LA5_21 = input.LA(7);

                                if ( (LA5_21==' ') ) {
                                    alt5=1;
                                }
                                else {
                                    alt5=8;}
                            }
                            else {
                                alt5=8;}
                        }
                        else {
                            alt5=8;}
                    }
                    else {
                        alt5=8;}
                }
                else {
                    alt5=8;}
            }
            else {
                alt5=8;}
            }
            break;
        case '(':
            {
            alt5=2;
            }
            break;
        case ')':
            {
            alt5=3;
            }
            break;
        case 'V':
            {
            int LA5_4 = input.LA(2);

            if ( (LA5_4=='A') ) {
                int LA5_12 = input.LA(3);

                if ( (LA5_12=='L') ) {
                    int LA5_16 = input.LA(4);

                    if ( (LA5_16=='U') ) {
                        int LA5_18 = input.LA(5);

                        if ( (LA5_18=='E') ) {
                            int LA5_20 = input.LA(6);

                            if ( (LA5_20=='S') ) {
                                int LA5_22 = input.LA(7);

                                if ( ((LA5_22>='#' && LA5_22<='$')||(LA5_22>='-' && LA5_22<='.')||(LA5_22>='0' && LA5_22<='9')||(LA5_22>='@' && LA5_22<='Z')||LA5_22=='_'||(LA5_22>='a' && LA5_22<='z')) ) {
                                    alt5=8;
                                }
                                else {
                                    alt5=4;}
                            }
                            else {
                                alt5=8;}
                        }
                        else {
                            alt5=8;}
                    }
                    else {
                        alt5=8;}
                }
                else {
                    alt5=8;}
            }
            else {
                alt5=8;}
            }
            break;
        case ';':
            {
            alt5=5;
            }
            break;
        case ',':
            {
            alt5=6;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=8;
            }
            break;
        case '\'':
            {
            int LA5_9 = input.LA(2);

            if ( ((LA5_9>='\u0000' && LA5_9<='\uFFFE')) ) {
                alt5=10;
            }
            else {
                alt5=9;}
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt5=11;
            }
            break;
        default:
            alt5=7;}

        switch (alt5) {
            case 1 :
                // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:10: T9
                {
                mT9(); 

                }
                break;
            case 2 :
                // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:13: T10
                {
                mT10(); 

                }
                break;
            case 3 :
                // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:17: T11
                {
                mT11(); 

                }
                break;
            case 4 :
                // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:21: T12
                {
                mT12(); 

                }
                break;
            case 5 :
                // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:25: T13
                {
                mT13(); 

                }
                break;
            case 6 :
                // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:29: T14
                {
                mT14(); 

                }
                break;
            case 7 :
                // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:33: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 8 :
                // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:40: ID
                {
                mID(); 

                }
                break;
            case 9 :
                // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:43: SQUOTE
                {
                mSQUOTE(); 

                }
                break;
            case 10 :
                // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:50: CVALUE
                {
                mCVALUE(); 

                }
                break;
            case 11 :
                // /Users/fjavier/UMU/Tesis/workspace/M_F2_DML/files/gen/DML.ge3:1:57: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}