// $ANTLR 3.2 Sep 23, 2009 12:02:23 DMLSelect.g 2014-05-05 17:55:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DMLSelectLexer extends Lexer {
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
    public static final int T__32=32;
    public static final int UNSIGNED_INTEGER=12;
    public static final int T__33=33;
    public static final int WS=23;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int GREATER_THAN_OPERATOR=16;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int COMMA=9;
    public static final int SET_QUANTIFIER=4;
    public static final int LESS_THAN_OPERATOR=15;
    public static final int ORDERING_SPECIFICATION=21;
    public static final int GREATER_THAN_OR_EQUALS_OPERATOR=18;
    public static final int NOT_EQUALS_OPERATOR=14;
    public static final int TRUTH_VALUE=22;

    // delegates
    // delegators

    public DMLSelectLexer() {;} 
    public DMLSelectLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DMLSelectLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "DMLSelect.g"; }

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:3:7: ( 'SELECT' )
            // DMLSelect.g:3:9: 'SELECT'
            {
            match("SELECT"); 


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
            // DMLSelect.g:4:7: ( 'AS' )
            // DMLSelect.g:4:9: 'AS'
            {
            match("AS"); 


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
            // DMLSelect.g:5:7: ( 'FROM' )
            // DMLSelect.g:5:9: 'FROM'
            {
            match("FROM"); 


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
            // DMLSelect.g:6:7: ( 'WHERE' )
            // DMLSelect.g:6:9: 'WHERE'
            {
            match("WHERE"); 


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
            // DMLSelect.g:7:7: ( 'GROUP BY' )
            // DMLSelect.g:7:9: 'GROUP BY'
            {
            match("GROUP BY"); 


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
            // DMLSelect.g:8:7: ( 'HAVING' )
            // DMLSelect.g:8:9: 'HAVING'
            {
            match("HAVING"); 


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
            // DMLSelect.g:9:7: ( 'OR' )
            // DMLSelect.g:9:9: 'OR'
            {
            match("OR"); 


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
            // DMLSelect.g:10:7: ( 'AND' )
            // DMLSelect.g:10:9: 'AND'
            {
            match("AND"); 


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
            // DMLSelect.g:11:7: ( 'NOT' )
            // DMLSelect.g:11:9: 'NOT'
            {
            match("NOT"); 


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
            // DMLSelect.g:12:7: ( 'BETWEEN' )
            // DMLSelect.g:12:9: 'BETWEEN'
            {
            match("BETWEEN"); 


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
            // DMLSelect.g:13:7: ( 'IN' )
            // DMLSelect.g:13:9: 'IN'
            {
            match("IN"); 


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
            // DMLSelect.g:14:7: ( 'LIKE' )
            // DMLSelect.g:14:9: 'LIKE'
            {
            match("LIKE"); 


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
            // DMLSelect.g:15:7: ( 'IS' )
            // DMLSelect.g:15:9: 'IS'
            {
            match("IS"); 


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
            // DMLSelect.g:16:7: ( 'ORDER BY' )
            // DMLSelect.g:16:9: 'ORDER BY'
            {
            match("ORDER BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "EQUALS_OPERATOR"
    public final void mEQUALS_OPERATOR() throws RecognitionException {
        try {
            int _type = EQUALS_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1516:2: ( '=' )
            // DMLSelect.g:1516:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS_OPERATOR"

    // $ANTLR start "NOT_EQUALS_OPERATOR"
    public final void mNOT_EQUALS_OPERATOR() throws RecognitionException {
        try {
            int _type = NOT_EQUALS_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1520:2: ( '<>' )
            // DMLSelect.g:1520:4: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUALS_OPERATOR"

    // $ANTLR start "LESS_THAN_OPERATOR"
    public final void mLESS_THAN_OPERATOR() throws RecognitionException {
        try {
            int _type = LESS_THAN_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1524:2: ( '<' )
            // DMLSelect.g:1524:4: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_THAN_OPERATOR"

    // $ANTLR start "GREATER_THAN_OPERATOR"
    public final void mGREATER_THAN_OPERATOR() throws RecognitionException {
        try {
            int _type = GREATER_THAN_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1528:2: ( '>' )
            // DMLSelect.g:1528:4: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_THAN_OPERATOR"

    // $ANTLR start "LESS_THAN_OR_EQUALS_OPERATOR"
    public final void mLESS_THAN_OR_EQUALS_OPERATOR() throws RecognitionException {
        try {
            int _type = LESS_THAN_OR_EQUALS_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1532:2: ( '<=' )
            // DMLSelect.g:1532:4: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_THAN_OR_EQUALS_OPERATOR"

    // $ANTLR start "GREATER_THAN_OR_EQUALS_OPERATOR"
    public final void mGREATER_THAN_OR_EQUALS_OPERATOR() throws RecognitionException {
        try {
            int _type = GREATER_THAN_OR_EQUALS_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1536:2: ( '>=' )
            // DMLSelect.g:1536:4: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_THAN_OR_EQUALS_OPERATOR"

    // $ANTLR start "NULL_SPECIFICATION"
    public final void mNULL_SPECIFICATION() throws RecognitionException {
        try {
            int _type = NULL_SPECIFICATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1539:2: ( 'NULL' )
            // DMLSelect.g:1539:4: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL_SPECIFICATION"

    // $ANTLR start "DEFAULT_SPECIFICATION"
    public final void mDEFAULT_SPECIFICATION() throws RecognitionException {
        try {
            int _type = DEFAULT_SPECIFICATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1543:2: ( 'DEFAULT' )
            // DMLSelect.g:1543:4: 'DEFAULT'
            {
            match("DEFAULT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT_SPECIFICATION"

    // $ANTLR start "TRUTH_VALUE"
    public final void mTRUTH_VALUE() throws RecognitionException {
        try {
            int _type = TRUTH_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1547:2: ( 'TRUE' | 'FALSE' | 'UNKNOWN' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'T':
                {
                alt1=1;
                }
                break;
            case 'F':
                {
                alt1=2;
                }
                break;
            case 'U':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // DMLSelect.g:1547:4: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // DMLSelect.g:1547:13: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;
                case 3 :
                    // DMLSelect.g:1547:23: 'UNKNOWN'
                    {
                    match("UNKNOWN"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUTH_VALUE"

    // $ANTLR start "LEFT_PARENT"
    public final void mLEFT_PARENT() throws RecognitionException {
        try {
            int _type = LEFT_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1551:2: ( '(' )
            // DMLSelect.g:1551:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_PARENT"

    // $ANTLR start "RIGHT_PARENT"
    public final void mRIGHT_PARENT() throws RecognitionException {
        try {
            int _type = RIGHT_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1555:2: ( ')' )
            // DMLSelect.g:1555:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_PARENT"

    // $ANTLR start "SET_QUANTIFIER"
    public final void mSET_QUANTIFIER() throws RecognitionException {
        try {
            int _type = SET_QUANTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1559:2: ( 'DISTINCT' | 'ALL' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='D') ) {
                alt2=1;
            }
            else if ( (LA2_0=='A') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // DMLSelect.g:1559:4: 'DISTINCT'
                    {
                    match("DISTINCT"); 


                    }
                    break;
                case 2 :
                    // DMLSelect.g:1559:17: 'ALL'
                    {
                    match("ALL"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET_QUANTIFIER"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1563:2: ( '*' )
            // DMLSelect.g:1563:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1567:2: ( ',' )
            // DMLSelect.g:1567:4: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "PERIOD"
    public final void mPERIOD() throws RecognitionException {
        try {
            int _type = PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1571:2: ( '.' )
            // DMLSelect.g:1571:4: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERIOD"

    // $ANTLR start "ORDERING_SPECIFICATION"
    public final void mORDERING_SPECIFICATION() throws RecognitionException {
        try {
            int _type = ORDERING_SPECIFICATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1575:2: ( 'ASC' | 'DESC' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='A') ) {
                alt3=1;
            }
            else if ( (LA3_0=='D') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // DMLSelect.g:1575:4: 'ASC'
                    {
                    match("ASC"); 


                    }
                    break;
                case 2 :
                    // DMLSelect.g:1575:12: 'DESC'
                    {
                    match("DESC"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDERING_SPECIFICATION"

    // $ANTLR start "UNSIGNED_INTEGER"
    public final void mUNSIGNED_INTEGER() throws RecognitionException {
        try {
            int _type = UNSIGNED_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1579:2: ( ( '0' .. '9' )* )
            // DMLSelect.g:1579:4: ( '0' .. '9' )*
            {
            // DMLSelect.g:1579:4: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // DMLSelect.g:1579:5: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "UNSIGNED_INTEGER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1583:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '?' | ':' )* )
            // DMLSelect.g:1583:4: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '?' | ':' )*
            {
            // DMLSelect.g:1583:4: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '?' | ':' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<=':')||LA5_0=='?'||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // DMLSelect.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<=':')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
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

    // $ANTLR start "IDEXPRESSION"
    public final void mIDEXPRESSION() throws RecognitionException {
        try {
            int _type = IDEXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1587:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '?' | ':' | '(' | ')' | '+' | '-' | '*' | '/' | '%' | '\\'' )* )
            // DMLSelect.g:1587:4: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '?' | ':' | '(' | ')' | '+' | '-' | '*' | '/' | '%' | '\\'' )*
            {
            // DMLSelect.g:1587:4: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '?' | ':' | '(' | ')' | '+' | '-' | '*' | '/' | '%' | '\\'' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='%'||(LA6_0>='\'' && LA6_0<='+')||LA6_0=='-'||(LA6_0>='/' && LA6_0<=':')||LA6_0=='?'||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // DMLSelect.g:
            	    {
            	    if ( input.LA(1)=='%'||(input.LA(1)>='\'' && input.LA(1)<='+')||input.LA(1)=='-'||(input.LA(1)>='/' && input.LA(1)<=':')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDEXPRESSION"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DMLSelect.g:1590:5: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )+ )
            // DMLSelect.g:1590:7: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )+
            {
            // DMLSelect.g:1590:7: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||(LA7_0>='\f' && LA7_0<='\r')||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // DMLSelect.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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

    public void mTokens() throws RecognitionException {
        // DMLSelect.g:1:8: ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | EQUALS_OPERATOR | NOT_EQUALS_OPERATOR | LESS_THAN_OPERATOR | GREATER_THAN_OPERATOR | LESS_THAN_OR_EQUALS_OPERATOR | GREATER_THAN_OR_EQUALS_OPERATOR | NULL_SPECIFICATION | DEFAULT_SPECIFICATION | TRUTH_VALUE | LEFT_PARENT | RIGHT_PARENT | SET_QUANTIFIER | ASTERISK | COMMA | PERIOD | ORDERING_SPECIFICATION | UNSIGNED_INTEGER | ID | IDEXPRESSION | WS )
        int alt8=34;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // DMLSelect.g:1:10: T__24
                {
                mT__24(); 

                }
                break;
            case 2 :
                // DMLSelect.g:1:16: T__25
                {
                mT__25(); 

                }
                break;
            case 3 :
                // DMLSelect.g:1:22: T__26
                {
                mT__26(); 

                }
                break;
            case 4 :
                // DMLSelect.g:1:28: T__27
                {
                mT__27(); 

                }
                break;
            case 5 :
                // DMLSelect.g:1:34: T__28
                {
                mT__28(); 

                }
                break;
            case 6 :
                // DMLSelect.g:1:40: T__29
                {
                mT__29(); 

                }
                break;
            case 7 :
                // DMLSelect.g:1:46: T__30
                {
                mT__30(); 

                }
                break;
            case 8 :
                // DMLSelect.g:1:52: T__31
                {
                mT__31(); 

                }
                break;
            case 9 :
                // DMLSelect.g:1:58: T__32
                {
                mT__32(); 

                }
                break;
            case 10 :
                // DMLSelect.g:1:64: T__33
                {
                mT__33(); 

                }
                break;
            case 11 :
                // DMLSelect.g:1:70: T__34
                {
                mT__34(); 

                }
                break;
            case 12 :
                // DMLSelect.g:1:76: T__35
                {
                mT__35(); 

                }
                break;
            case 13 :
                // DMLSelect.g:1:82: T__36
                {
                mT__36(); 

                }
                break;
            case 14 :
                // DMLSelect.g:1:88: T__37
                {
                mT__37(); 

                }
                break;
            case 15 :
                // DMLSelect.g:1:94: EQUALS_OPERATOR
                {
                mEQUALS_OPERATOR(); 

                }
                break;
            case 16 :
                // DMLSelect.g:1:110: NOT_EQUALS_OPERATOR
                {
                mNOT_EQUALS_OPERATOR(); 

                }
                break;
            case 17 :
                // DMLSelect.g:1:130: LESS_THAN_OPERATOR
                {
                mLESS_THAN_OPERATOR(); 

                }
                break;
            case 18 :
                // DMLSelect.g:1:149: GREATER_THAN_OPERATOR
                {
                mGREATER_THAN_OPERATOR(); 

                }
                break;
            case 19 :
                // DMLSelect.g:1:171: LESS_THAN_OR_EQUALS_OPERATOR
                {
                mLESS_THAN_OR_EQUALS_OPERATOR(); 

                }
                break;
            case 20 :
                // DMLSelect.g:1:200: GREATER_THAN_OR_EQUALS_OPERATOR
                {
                mGREATER_THAN_OR_EQUALS_OPERATOR(); 

                }
                break;
            case 21 :
                // DMLSelect.g:1:232: NULL_SPECIFICATION
                {
                mNULL_SPECIFICATION(); 

                }
                break;
            case 22 :
                // DMLSelect.g:1:251: DEFAULT_SPECIFICATION
                {
                mDEFAULT_SPECIFICATION(); 

                }
                break;
            case 23 :
                // DMLSelect.g:1:273: TRUTH_VALUE
                {
                mTRUTH_VALUE(); 

                }
                break;
            case 24 :
                // DMLSelect.g:1:285: LEFT_PARENT
                {
                mLEFT_PARENT(); 

                }
                break;
            case 25 :
                // DMLSelect.g:1:297: RIGHT_PARENT
                {
                mRIGHT_PARENT(); 

                }
                break;
            case 26 :
                // DMLSelect.g:1:310: SET_QUANTIFIER
                {
                mSET_QUANTIFIER(); 

                }
                break;
            case 27 :
                // DMLSelect.g:1:325: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 28 :
                // DMLSelect.g:1:334: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 29 :
                // DMLSelect.g:1:340: PERIOD
                {
                mPERIOD(); 

                }
                break;
            case 30 :
                // DMLSelect.g:1:347: ORDERING_SPECIFICATION
                {
                mORDERING_SPECIFICATION(); 

                }
                break;
            case 31 :
                // DMLSelect.g:1:370: UNSIGNED_INTEGER
                {
                mUNSIGNED_INTEGER(); 

                }
                break;
            case 32 :
                // DMLSelect.g:1:387: ID
                {
                mID(); 

                }
                break;
            case 33 :
                // DMLSelect.g:1:390: IDEXPRESSION
                {
                mIDEXPRESSION(); 

                }
                break;
            case 34 :
                // DMLSelect.g:1:403: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\30\13\35\1\uffff\1\57\1\61\3\35\1\66\1\67\1\70\2\uffff\1\30\1"+
        "\uffff\1\35\2\uffff\1\35\1\uffff\1\73\7\35\1\104\3\35\1\110\1\111"+
        "\1\35\5\uffff\4\35\3\uffff\1\35\1\121\1\uffff\1\122\1\123\6\35\1"+
        "\uffff\1\132\2\35\2\uffff\7\35\3\uffff\1\144\5\35\1\uffff\1\152"+
        "\1\35\1\154\1\35\1\121\1\35\1\157\2\35\1\uffff\1\157\1\162\3\35"+
        "\1\uffff\1\35\1\uffff\2\35\1\uffff\1\35\1\172\2\uffff\1\173\1\uffff"+
        "\4\35\2\uffff\1\u0080\1\u0081\1\35\1\157\2\uffff\1\123";
    static final String DFA8_eofS =
        "\u0083\uffff";
    static final String DFA8_minS =
        "\1\11\13\45\1\uffff\2\75\6\45\2\uffff\1\45\1\uffff\1\45\2\uffff"+
        "\1\45\1\uffff\17\45\5\uffff\4\45\3\uffff\2\45\1\uffff\10\45\1\uffff"+
        "\3\45\2\uffff\7\45\3\uffff\6\45\1\uffff\11\45\1\uffff\2\45\1\40"+
        "\1\45\1\40\1\uffff\1\45\1\uffff\2\45\1\uffff\2\45\2\uffff\1\45\1"+
        "\uffff\4\45\2\uffff\4\45\2\uffff\1\45";
    static final String DFA8_maxS =
        "\14\172\1\uffff\1\76\1\75\6\172\2\uffff\1\172\1\uffff\1\172\2\uffff"+
        "\1\172\1\uffff\17\172\5\uffff\4\172\3\uffff\2\172\1\uffff\10\172"+
        "\1\uffff\3\172\2\uffff\7\172\3\uffff\6\172\1\uffff\11\172\1\uffff"+
        "\5\172\1\uffff\1\172\1\uffff\2\172\1\uffff\2\172\2\uffff\1\172\1"+
        "\uffff\4\172\2\uffff\4\172\2\uffff\1\172";
    static final String DFA8_acceptS =
        "\14\uffff\1\17\10\uffff\1\34\1\35\1\uffff\1\37\1\uffff\1\41\1\42"+
        "\1\uffff\1\40\17\uffff\1\20\1\23\1\21\1\24\1\22\4\uffff\1\30\1\31"+
        "\1\33\2\uffff\1\2\10\uffff\1\7\3\uffff\1\13\1\15\7\uffff\1\36\1"+
        "\10\1\32\6\uffff\1\11\11\uffff\1\3\5\uffff\1\25\1\uffff\1\14\2\uffff"+
        "\1\27\2\uffff\1\4\1\5\1\uffff\1\16\4\uffff\1\1\1\6\4\uffff\1\12"+
        "\1\26\1\uffff";
    static final String DFA8_specialS =
        "\u0083\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\33\1\uffff\2\33\22\uffff\1\33\4\uffff\1\32\1\uffff\1\32\1"+
            "\22\1\23\1\24\1\32\1\25\1\32\1\26\1\32\12\27\1\31\1\uffff\1"+
            "\15\1\14\1\16\1\31\1\uffff\1\2\1\11\1\31\1\17\1\31\1\3\1\5\1"+
            "\6\1\12\2\31\1\13\1\31\1\10\1\7\3\31\1\1\1\20\1\21\1\31\1\4"+
            "\3\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\34\25\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\13\31\1\40\1\31\1\37\4\31\1\36\7\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\1\42\20\31\1\41\10\31\4\uffff\1\31\1\uffff\32"+
            "\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\7\31\1\43\22\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\21\31\1\44\10\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\1\45\31\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\21\31\1\46\10\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\16\31\1\47\5\31\1\50\5\31\4\uffff\1\31\1\uffff"+
            "\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\51\25\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\15\31\1\52\4\31\1\53\7\31\4\uffff\1\31\1\uffff"+
            "\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\10\31\1\54\21\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\56\1\55",
            "\1\60",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\62\3\31\1\63\21\31\4\uffff\1\31\1\uffff"+
            "\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\21\31\1\64\10\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\15\31\1\65\14\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\14\32\4\uffff\1\32"+
            "\1\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\14\32\4\uffff\1\32"+
            "\1\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\14\32\4\uffff\1\32"+
            "\1\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\12\27\1\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\13\31\1\71\16\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\2\31\1\72\27\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\3\31\1\74\26\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\13\31\1\75\16\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\16\31\1\76\13\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\13\31\1\77\16\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\100\25\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\16\31\1\101\13\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\25\31\1\102\4\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\3\31\1\103\26\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\23\31\1\105\6\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\13\31\1\106\16\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\23\31\1\107\6\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\12\31\1\112\17\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\5\31\1\113\14\31\1\114\7\31\4\uffff\1\31\1\uffff"+
            "\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\22\31\1\115\7\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\24\31\1\116\5\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\12\31\1\117\17\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\120\25\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\14\31\1\124\15\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\22\31\1\125\7\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\21\31\1\126\10\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\24\31\1\127\5\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\10\31\1\130\21\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\131\25\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\13\31\1\133\16\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\26\31\1\134\3\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\135\25\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\1\136\31\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\2\31\1\137\27\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\23\31\1\140\6\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\141\25\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\15\31\1\142\14\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\2\31\1\143\27\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\145\25\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\146\25\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\17\31\1\147\12\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\15\31\1\150\14\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\21\31\1\151\10\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\153\25\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\24\31\1\155\5\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\10\31\1\156\21\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\16\31\1\160\13\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\23\31\1\161\6\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\163\4\uffff\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32"+
            "\13\31\4\uffff\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\6\31\1\164\23\31\4\uffff\1\31\1\uffff\32\31",
            "\1\165\4\uffff\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32"+
            "\13\31\4\uffff\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\4\31\1\166\25\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\13\31\1\167\16\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\15\31\1\170\14\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\26\31\1\171\3\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\15\31\1\174\14\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\23\31\1\175\6\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\2\31\1\176\27\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\15\31\1\177\14\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\23\31\1\u0082\6\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\1\32\13\31\4\uffff"+
            "\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | EQUALS_OPERATOR | NOT_EQUALS_OPERATOR | LESS_THAN_OPERATOR | GREATER_THAN_OPERATOR | LESS_THAN_OR_EQUALS_OPERATOR | GREATER_THAN_OR_EQUALS_OPERATOR | NULL_SPECIFICATION | DEFAULT_SPECIFICATION | TRUTH_VALUE | LEFT_PARENT | RIGHT_PARENT | SET_QUANTIFIER | ASTERISK | COMMA | PERIOD | ORDERING_SPECIFICATION | UNSIGNED_INTEGER | ID | IDEXPRESSION | WS );";
        }
    }
 

}