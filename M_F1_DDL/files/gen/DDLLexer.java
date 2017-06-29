// $ANTLR 3.0.1 /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3 2014-03-21 16:59:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DDLLexer extends Lexer {
    public static final int BITS=12;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int ID=5;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int ML_COMMENT=18;
    public static final int CHARACTERS=11;
    public static final int INTERVALS=14;
    public static final int COMPARATOR=8;
    public static final int BINARIES=15;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int EXACTO=9;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int APROXIMADO=10;
    public static final int NUMBER=7;
    public static final int T49=49;
    public static final int T48=48;
    public static final int OL_COMMENT=19;
    public static final int LOG_CONJ=4;
    public static final int SQUOTE=16;
    public static final int T43=43;
    public static final int Tokens=59;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int T44=44;
    public static final int CVALUE=6;
    public static final int WS=17;
    public static final int T50=50;
    public static final int T52=52;
    public static final int TIMES=13;
    public static final int T51=51;
    public static final int T54=54;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public DDLLexer() {;} 
    public DDLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3"; }

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:3:5: ( 'CREATE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:3:7: 'CREATE'
            {
            match("CREATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:4:5: ( 'REPLACE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:4:7: 'REPLACE'
            {
            match("REPLACE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:5:5: ( 'TABLE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:5:7: 'TABLE'
            {
            match("TABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:6:5: ( '(' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:6:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:7:5: ( ',' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:7:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:8:5: ( ')' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:8:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:9:5: ( 'LOGGING' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:9:7: 'LOGGING'
            {
            match("LOGGING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:10:5: ( 'NOCOMPRESS' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:10:7: 'NOCOMPRESS'
            {
            match("NOCOMPRESS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:11:5: ( 'NOCACHE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:11:7: 'NOCACHE'
            {
            match("NOCACHE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:12:5: ( 'NOPARALLEL' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:12:7: 'NOPARALLEL'
            {
            match("NOPARALLEL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:13:5: ( 'MONITORING' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:13:7: 'MONITORING'
            {
            match("MONITORING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:14:5: ( ';' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:14:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:15:5: ( 'COMMENT ON TABLE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:15:7: 'COMMENT ON TABLE'
            {
            match("COMMENT ON TABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:16:5: ( 'IS' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:16:7: 'IS'
            {
            match("IS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:17:5: ( 'BYTE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:17:7: 'BYTE'
            {
            match("BYTE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:18:5: ( 'CONSTRAINT' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:18:7: 'CONSTRAINT'
            {
            match("CONSTRAINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:19:5: ( 'NULL' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:19:7: 'NULL'
            {
            match("NULL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:20:5: ( 'NOT NULL' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:20:7: 'NOT NULL'
            {
            match("NOT NULL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:21:5: ( 'DEFAULT' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:21:7: 'DEFAULT'
            {
            match("DEFAULT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:22:5: ( 'COMMENT ON COLUMN' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:22:7: 'COMMENT ON COLUMN'
            {
            match("COMMENT ON COLUMN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:23:5: ( '\\.' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:23:7: '\\.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:24:5: ( 'ALTER TABLE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:24:7: 'ALTER TABLE'
            {
            match("ALTER TABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:25:5: ( 'DROP CONSTRAINT' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:25:7: 'DROP CONSTRAINT'
            {
            match("DROP CONSTRAINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:26:5: ( 'CHECK' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:26:7: 'CHECK'
            {
            match("CHECK"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:27:5: ( 'FOREIGN KEY' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:27:7: 'FOREIGN KEY'
            {
            match("FOREIGN KEY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:28:5: ( 'REFERENCES' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:28:7: 'REFERENCES'
            {
            match("REFERENCES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:29:5: ( 'ON' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:29:7: 'ON'
            {
            match("ON"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:30:5: ( 'DELETE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:30:7: 'DELETE'
            {
            match("DELETE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:31:5: ( 'UPDATE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:31:7: 'UPDATE'
            {
            match("UPDATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:32:5: ( 'CASCADE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:32:7: 'CASCADE'
            {
            match("CASCADE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:33:5: ( 'DISABLE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:33:7: 'DISABLE'
            {
            match("DISABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:34:5: ( 'PRIMARY KEY' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:34:7: 'PRIMARY KEY'
            {
            match("PRIMARY KEY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:35:5: ( 'DATABASE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:35:7: 'DATABASE'
            {
            match("DATABASE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:36:5: ( 'SCHEMA' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:36:7: 'SCHEMA'
            {
            match("SCHEMA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:37:5: ( 'IF NOT EXISTS' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:37:7: 'IF NOT EXISTS'
            {
            match("IF NOT EXISTS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:38:5: ( 'CHARACTER' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:38:7: 'CHARACTER'
            {
            match("CHARACTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:39:5: ( 'SET' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:39:7: 'SET'
            {
            match("SET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:40:5: ( 'COLLATE' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:40:7: 'COLLATE'
            {
            match("COLLATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:41:5: ( 'IN' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:41:7: 'IN'
            {
            match("IN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start EXACTO
    public final void mEXACTO() throws RecognitionException {
        try {
            int _type = EXACTO;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1551:2: ( ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' ) )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )
            {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 'N':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='U') ) {
                    int LA1_5 = input.LA(3);

                    if ( (LA1_5=='M') ) {
                        int LA1_8 = input.LA(4);

                        if ( (LA1_8=='E') ) {
                            alt1=2;
                        }
                        else if ( (LA1_8=='B') ) {
                            alt1=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'I':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='N') ) {
                    int LA1_6 = input.LA(3);

                    if ( (LA1_6=='T') ) {
                        int LA1_9 = input.LA(4);

                        if ( (LA1_9=='E') ) {
                            alt1=3;
                        }
                        else {
                            alt1=6;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'S':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='M') ) {
                    int LA1_7 = input.LA(3);

                    if ( (LA1_7=='A') ) {
                        int LA1_10 = input.LA(4);

                        if ( (LA1_10=='L') ) {
                            int LA1_15 = input.LA(5);

                            if ( (LA1_15=='L') ) {
                                int LA1_16 = input.LA(6);

                                if ( (LA1_16==' ') ) {
                                    int LA1_17 = input.LA(7);

                                    if ( (LA1_17=='I') ) {
                                        int LA1_18 = input.LA(8);

                                        if ( (LA1_18=='N') ) {
                                            int LA1_19 = input.LA(9);

                                            if ( (LA1_19=='T') ) {
                                                int LA1_20 = input.LA(10);

                                                if ( (LA1_20=='E') ) {
                                                    alt1=4;
                                                }
                                                else {
                                                    alt1=7;}
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 19, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 18, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 17, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 10, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'D':
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1551:4: ( 'NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT' )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1551:5: 'NUMBER'
                    {
                    match("NUMBER"); 


                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1551:16: 'NUMERIC'
                    {
                    match("NUMERIC"); 


                    }
                    break;
                case 3 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1551:28: 'INTEGER'
                    {
                    match("INTEGER"); 


                    }
                    break;
                case 4 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1551:40: 'SMALL INTEGER'
                    {
                    match("SMALL INTEGER"); 


                    }
                    break;
                case 5 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1551:58: 'DECIMAL'
                    {
                    match("DECIMAL"); 


                    }
                    break;
                case 6 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1551:70: 'INT'
                    {
                    match("INT"); 


                    }
                    break;
                case 7 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1551:78: 'SMALL INT'
                    {
                    match("SMALL INT"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXACTO

    // $ANTLR start APROXIMADO
    public final void mAPROXIMADO() throws RecognitionException {
        try {
            int _type = APROXIMADO;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1555:2: ( ( 'DOUBLE PRECISION' | 'LONG' | 'LONG RAW' | 'FLOAT' | 'REAL' ) )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1555:4: ( 'DOUBLE PRECISION' | 'LONG' | 'LONG RAW' | 'FLOAT' | 'REAL' )
            {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1555:4: ( 'DOUBLE PRECISION' | 'LONG' | 'LONG RAW' | 'FLOAT' | 'REAL' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 'D':
                {
                alt2=1;
                }
                break;
            case 'L':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='O') ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5=='N') ) {
                        int LA2_6 = input.LA(4);

                        if ( (LA2_6=='G') ) {
                            int LA2_7 = input.LA(5);

                            if ( (LA2_7==' ') ) {
                                alt2=3;
                            }
                            else {
                                alt2=2;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1555:4: ( 'DOUBLE PRECISION' | 'LONG' | 'LONG RAW' | 'FLOAT' | 'REAL' )", 2, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1555:4: ( 'DOUBLE PRECISION' | 'LONG' | 'LONG RAW' | 'FLOAT' | 'REAL' )", 2, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1555:4: ( 'DOUBLE PRECISION' | 'LONG' | 'LONG RAW' | 'FLOAT' | 'REAL' )", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'F':
                {
                alt2=4;
                }
                break;
            case 'R':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1555:4: ( 'DOUBLE PRECISION' | 'LONG' | 'LONG RAW' | 'FLOAT' | 'REAL' )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1555:5: 'DOUBLE PRECISION'
                    {
                    match("DOUBLE PRECISION"); 


                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1555:26: 'LONG'
                    {
                    match("LONG"); 


                    }
                    break;
                case 3 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1555:35: 'LONG RAW'
                    {
                    match("LONG RAW"); 


                    }
                    break;
                case 4 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1555:48: 'FLOAT'
                    {
                    match("FLOAT"); 


                    }
                    break;
                case 5 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1555:58: 'REAL'
                    {
                    match("REAL"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end APROXIMADO

    // $ANTLR start CHARACTERS
    public final void mCHARACTERS() throws RecognitionException {
        try {
            int _type = CHARACTERS;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:2: ( ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' ) )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )
            {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )
            int alt3=16;
            switch ( input.LA(1) ) {
            case 'C':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='H') ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5=='A') ) {
                        int LA3_11 = input.LA(4);

                        if ( (LA3_11=='R') ) {
                            switch ( input.LA(5) ) {
                            case 'A':
                                {
                                int LA3_20 = input.LA(6);

                                if ( (LA3_20=='C') ) {
                                    int LA3_26 = input.LA(7);

                                    if ( (LA3_26=='T') ) {
                                        int LA3_31 = input.LA(8);

                                        if ( (LA3_31=='E') ) {
                                            int LA3_34 = input.LA(9);

                                            if ( (LA3_34=='R') ) {
                                                int LA3_38 = input.LA(10);

                                                if ( (LA3_38==' ') ) {
                                                    alt3=9;
                                                }
                                                else {
                                                    alt3=8;}
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 34, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 31, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 26, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 20, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case ' ':
                                {
                                alt3=7;
                                }
                                break;
                            default:
                                alt3=1;}

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 11, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1=='L') ) {
                    alt3=15;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'V':
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='A') ) {
                    int LA3_7 = input.LA(3);

                    if ( (LA3_7=='R') ) {
                        int LA3_12 = input.LA(4);

                        if ( (LA3_12=='C') ) {
                            int LA3_17 = input.LA(5);

                            if ( (LA3_17=='H') ) {
                                int LA3_23 = input.LA(6);

                                if ( (LA3_23=='A') ) {
                                    int LA3_27 = input.LA(7);

                                    if ( (LA3_27=='R') ) {
                                        int LA3_32 = input.LA(8);

                                        if ( (LA3_32=='2') ) {
                                            alt3=3;
                                        }
                                        else {
                                            alt3=2;}
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 27, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 23, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 12, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'T':
                {
                alt3=4;
                }
                break;
            case 'N':
                {
                switch ( input.LA(2) ) {
                case 'A':
                    {
                    int LA3_8 = input.LA(3);

                    if ( (LA3_8=='T') ) {
                        int LA3_13 = input.LA(4);

                        if ( (LA3_13=='I') ) {
                            int LA3_18 = input.LA(5);

                            if ( (LA3_18=='O') ) {
                                int LA3_24 = input.LA(6);

                                if ( (LA3_24=='N') ) {
                                    int LA3_28 = input.LA(7);

                                    if ( (LA3_28=='A') ) {
                                        int LA3_33 = input.LA(8);

                                        if ( (LA3_33=='L') ) {
                                            int LA3_37 = input.LA(9);

                                            if ( (LA3_37==' ') ) {
                                                int LA3_39 = input.LA(10);

                                                if ( (LA3_39=='C') ) {
                                                    int LA3_42 = input.LA(11);

                                                    if ( (LA3_42=='H') ) {
                                                        int LA3_43 = input.LA(12);

                                                        if ( (LA3_43=='A') ) {
                                                            int LA3_44 = input.LA(13);

                                                            if ( (LA3_44=='R') ) {
                                                                switch ( input.LA(14) ) {
                                                                case ' ':
                                                                    {
                                                                    alt3=11;
                                                                    }
                                                                    break;
                                                                case 'A':
                                                                    {
                                                                    int LA3_47 = input.LA(15);

                                                                    if ( (LA3_47=='C') ) {
                                                                        int LA3_49 = input.LA(16);

                                                                        if ( (LA3_49=='T') ) {
                                                                            int LA3_50 = input.LA(17);

                                                                            if ( (LA3_50=='E') ) {
                                                                                int LA3_51 = input.LA(18);

                                                                                if ( (LA3_51=='R') ) {
                                                                                    int LA3_52 = input.LA(19);

                                                                                    if ( (LA3_52==' ') ) {
                                                                                        alt3=13;
                                                                                    }
                                                                                    else {
                                                                                        alt3=12;}
                                                                                }
                                                                                else {
                                                                                    NoViableAltException nvae =
                                                                                        new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 51, input);

                                                                                    throw nvae;
                                                                                }
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 50, input);

                                                                                throw nvae;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 49, input);

                                                                            throw nvae;
                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 47, input);

                                                                        throw nvae;
                                                                    }
                                                                    }
                                                                    break;
                                                                default:
                                                                    alt3=10;}

                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 44, input);

                                                                throw nvae;
                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 43, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 42, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 39, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 37, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 33, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 28, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 24, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 18, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 13, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'V':
                    {
                    alt3=5;
                    }
                    break;
                case 'C':
                    {
                    int LA3_10 = input.LA(3);

                    if ( (LA3_10=='H') ) {
                        int LA3_14 = input.LA(4);

                        if ( (LA3_14=='A') ) {
                            int LA3_19 = input.LA(5);

                            if ( (LA3_19=='R') ) {
                                int LA3_25 = input.LA(6);

                                if ( (LA3_25==' ') ) {
                                    alt3=14;
                                }
                                else {
                                    alt3=6;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 19, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 14, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_10=='L') ) {
                        alt3=16;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1559:4: ( 'CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB' )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:5: 'CHAR'
                    {
                    match("CHAR"); 


                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:14: 'VARCHAR'
                    {
                    match("VARCHAR"); 


                    }
                    break;
                case 3 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:26: 'VARCHAR2'
                    {
                    match("VARCHAR2"); 


                    }
                    break;
                case 4 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:39: 'TEXT'
                    {
                    match("TEXT"); 


                    }
                    break;
                case 5 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:48: 'NVARCHAR2'
                    {
                    match("NVARCHAR2"); 


                    }
                    break;
                case 6 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:62: 'NCHAR'
                    {
                    match("NCHAR"); 


                    }
                    break;
                case 7 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:72: 'CHAR VARYING'
                    {
                    match("CHAR VARYING"); 


                    }
                    break;
                case 8 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:89: 'CHARACTER'
                    {
                    match("CHARACTER"); 


                    }
                    break;
                case 9 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:103: 'CHARACTER VARYING'
                    {
                    match("CHARACTER VARYING"); 


                    }
                    break;
                case 10 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:125: 'NATIONAL CHAR'
                    {
                    match("NATIONAL CHAR"); 


                    }
                    break;
                case 11 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:143: 'NATIONAL CHAR VARYING'
                    {
                    match("NATIONAL CHAR VARYING"); 


                    }
                    break;
                case 12 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:169: 'NATIONAL CHARACTER'
                    {
                    match("NATIONAL CHARACTER"); 


                    }
                    break;
                case 13 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:192: 'NATIONAL CHARACTER VARYING'
                    {
                    match("NATIONAL CHARACTER VARYING"); 


                    }
                    break;
                case 14 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:223: 'NCHAR VARYING'
                    {
                    match("NCHAR VARYING"); 


                    }
                    break;
                case 15 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:241: 'CLOB'
                    {
                    match("CLOB"); 


                    }
                    break;
                case 16 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1559:250: 'NCLOB'
                    {
                    match("NCLOB"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHARACTERS

    // $ANTLR start BITS
    public final void mBITS() throws RecognitionException {
        try {
            int _type = BITS;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1563:2: ( ( 'BIT' | 'BIT VARYING' ) )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1563:4: ( 'BIT' | 'BIT VARYING' )
            {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1563:4: ( 'BIT' | 'BIT VARYING' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='B') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='I') ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2=='T') ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==' ') ) {
                            alt4=2;
                        }
                        else {
                            alt4=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1563:4: ( 'BIT' | 'BIT VARYING' )", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1563:4: ( 'BIT' | 'BIT VARYING' )", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1563:4: ( 'BIT' | 'BIT VARYING' )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1563:5: 'BIT'
                    {
                    match("BIT"); 


                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1563:13: 'BIT VARYING'
                    {
                    match("BIT VARYING"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BITS

    // $ANTLR start TIMES
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1567:2: ( ( 'DATE' | 'TIME' | 'TIMESTAMP' ) )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1567:4: ( 'DATE' | 'TIME' | 'TIMESTAMP' )
            {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1567:4: ( 'DATE' | 'TIME' | 'TIMESTAMP' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='D') ) {
                alt5=1;
            }
            else if ( (LA5_0=='T') ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='I') ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3=='M') ) {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4=='E') ) {
                            int LA5_5 = input.LA(5);

                            if ( (LA5_5=='S') ) {
                                alt5=3;
                            }
                            else {
                                alt5=2;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1567:4: ( 'DATE' | 'TIME' | 'TIMESTAMP' )", 5, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1567:4: ( 'DATE' | 'TIME' | 'TIMESTAMP' )", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1567:4: ( 'DATE' | 'TIME' | 'TIMESTAMP' )", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1567:4: ( 'DATE' | 'TIME' | 'TIMESTAMP' )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1567:5: 'DATE'
                    {
                    match("DATE"); 


                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1567:14: 'TIME'
                    {
                    match("TIME"); 


                    }
                    break;
                case 3 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1567:23: 'TIMESTAMP'
                    {
                    match("TIMESTAMP"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TIMES

    // $ANTLR start INTERVALS
    public final void mINTERVALS() throws RecognitionException {
        try {
            int _type = INTERVALS;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1571:2: ( ( 'YEAR-MONTH' | 'DAY-TIME' ) )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1571:4: ( 'YEAR-MONTH' | 'DAY-TIME' )
            {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1571:4: ( 'YEAR-MONTH' | 'DAY-TIME' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='Y') ) {
                alt6=1;
            }
            else if ( (LA6_0=='D') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1571:4: ( 'YEAR-MONTH' | 'DAY-TIME' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1571:5: 'YEAR-MONTH'
                    {
                    match("YEAR-MONTH"); 


                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1571:20: 'DAY-TIME'
                    {
                    match("DAY-TIME"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INTERVALS

    // $ANTLR start BINARIES
    public final void mBINARIES() throws RecognitionException {
        try {
            int _type = BINARIES;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1575:2: ( ( 'BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' ) )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1575:4: ( 'BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' )
            {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1575:4: ( 'BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='B') ) {
                switch ( input.LA(2) ) {
                case 'L':
                    {
                    alt7=2;
                    }
                    break;
                case 'I':
                    {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3=='N') ) {
                        int LA7_5 = input.LA(4);

                        if ( (LA7_5=='A') ) {
                            int LA7_6 = input.LA(5);

                            if ( (LA7_6=='R') ) {
                                int LA7_7 = input.LA(6);

                                if ( (LA7_7=='Y') ) {
                                    int LA7_8 = input.LA(7);

                                    if ( (LA7_8=='_') ) {
                                        int LA7_9 = input.LA(8);

                                        if ( (LA7_9=='D') ) {
                                            alt7=3;
                                        }
                                        else if ( (LA7_9=='F') ) {
                                            alt7=4;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1575:4: ( 'BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' )", 7, 9, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1575:4: ( 'BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' )", 7, 8, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1575:4: ( 'BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' )", 7, 7, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1575:4: ( 'BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' )", 7, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1575:4: ( 'BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' )", 7, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1575:4: ( 'BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' )", 7, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'F':
                    {
                    alt7=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1575:4: ( 'BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' )", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1575:4: ( 'BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1575:5: 'BFILE'
                    {
                    match("BFILE"); 


                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1575:15: 'BLOB'
                    {
                    match("BLOB"); 


                    }
                    break;
                case 3 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1575:24: 'BINARY_DOUBLE'
                    {
                    match("BINARY_DOUBLE"); 


                    }
                    break;
                case 4 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1575:42: 'BINARY_FLOAT'
                    {
                    match("BINARY_FLOAT"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BINARIES

    // $ANTLR start SQUOTE
    public final void mSQUOTE() throws RecognitionException {
        try {
            int _type = SQUOTE;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1578:12: ( '\\u0027' )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1578:14: '\\u0027'
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
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1579:12: ( SQUOTE ( options {greedy=false; } : . )* SQUOTE )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1579:14: SQUOTE ( options {greedy=false; } : . )* SQUOTE
            {
            mSQUOTE(); 
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1579:21: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\'') ) {
                    alt8=2;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1579:49: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1580:12: ( ( '0' .. '9' | ',' )* )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1580:14: ( '0' .. '9' | ',' )*
            {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1580:14: ( '0' .. '9' | ',' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==','||(LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:
            	    {
            	    if ( input.LA(1)==','||(input.LA(1)>='0' && input.LA(1)<='9') ) {
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
            	    break loop9;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start COMPARATOR
    public final void mCOMPARATOR() throws RecognitionException {
        try {
            int _type = COMPARATOR;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1581:15: ( '<>' | '>=' | '<=' | '=' | '>' | '<' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt10=1;
                    }
                    break;
                case '=':
                    {
                    alt10=3;
                    }
                    break;
                default:
                    alt10=6;}

                }
                break;
            case '>':
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2=='=') ) {
                    alt10=2;
                }
                else {
                    alt10=5;}
                }
                break;
            case '=':
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1581:1: COMPARATOR : ( '<>' | '>=' | '<=' | '=' | '>' | '<' );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1581:18: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1581:25: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 3 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1581:32: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1581:39: '='
                    {
                    match('='); 

                    }
                    break;
                case 5 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1581:45: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1581:51: '<'
                    {
                    match('<'); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMPARATOR

    // $ANTLR start LOG_CONJ
    public final void mLOG_CONJ() throws RecognitionException {
        try {
            int _type = LOG_CONJ;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1582:13: ( 'OR' | 'AND' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='O') ) {
                alt11=1;
            }
            else if ( (LA11_0=='A') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1582:1: LOG_CONJ : ( 'OR' | 'AND' );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1582:15: 'OR'
                    {
                    match("OR"); 


                    }
                    break;
                case 2 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1582:22: 'AND'
                    {
                    match("AND"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOG_CONJ

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1583:10: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )* )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1583:12: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1583:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='#' && LA12_0<='$')||LA12_0=='-'||(LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            	    break loop12;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1584:10: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1584:12: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1584:12: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start ML_COMMENT
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1585:11: ( '/*' ( options {greedy=false; } : . )* '*/' ( ';' )? )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1586:2: '/*' ( options {greedy=false; } : . )* '*/' ( ';' )?
            {
            match("/*"); 

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1586:7: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFE')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFE')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1586:34: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1586:43: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==';') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1586:44: ';'
                    {
                    match(';'); 

                    }
                    break;

            }

             channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ML_COMMENT

    // $ANTLR start OL_COMMENT
    public final void mOL_COMMENT() throws RecognitionException {
        try {
            int _type = OL_COMMENT;
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1589:11: ( '--' ( options {greedy=false; } : . )* ( '\\n' )+ )
            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1589:13: '--' ( options {greedy=false; } : . )* ( '\\n' )+
            {
            match("--"); 

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1589:18: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\n') ) {
                    alt16=2;
                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\uFFFE')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1589:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1589:51: ( '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\n') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1589:51: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

             channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OL_COMMENT

    public void mTokens() throws RecognitionException {
        // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:8: ( T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | EXACTO | APROXIMADO | CHARACTERS | BITS | TIMES | INTERVALS | BINARIES | SQUOTE | CVALUE | NUMBER | COMPARATOR | LOG_CONJ | ID | WS | ML_COMMENT | OL_COMMENT )
        int alt18=55;
        switch ( input.LA(1) ) {
        case 'C':
            {
            switch ( input.LA(2) ) {
            case 'R':
                {
                int LA18_30 = input.LA(3);

                if ( (LA18_30=='E') ) {
                    int LA18_74 = input.LA(4);

                    if ( (LA18_74=='A') ) {
                        int LA18_130 = input.LA(5);

                        if ( (LA18_130=='T') ) {
                            int LA18_184 = input.LA(6);

                            if ( (LA18_184=='E') ) {
                                int LA18_232 = input.LA(7);

                                if ( ((LA18_232>='#' && LA18_232<='$')||LA18_232=='-'||(LA18_232>='0' && LA18_232<='9')||(LA18_232>='A' && LA18_232<='Z')||LA18_232=='_'||(LA18_232>='a' && LA18_232<='z')) ) {
                                    alt18=52;
                                }
                                else {
                                    alt18=1;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'H':
                {
                switch ( input.LA(3) ) {
                case 'A':
                    {
                    int LA18_75 = input.LA(4);

                    if ( (LA18_75=='R') ) {
                        switch ( input.LA(5) ) {
                        case 'A':
                            {
                            int LA18_185 = input.LA(6);

                            if ( (LA18_185=='C') ) {
                                int LA18_233 = input.LA(7);

                                if ( (LA18_233=='T') ) {
                                    int LA18_269 = input.LA(8);

                                    if ( (LA18_269=='E') ) {
                                        int LA18_299 = input.LA(9);

                                        if ( (LA18_299=='R') ) {
                                            switch ( input.LA(10) ) {
                                            case ' ':
                                                {
                                                alt18=42;
                                                }
                                                break;
                                            case '#':
                                            case '$':
                                            case '-':
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                            case 'A':
                                            case 'B':
                                            case 'C':
                                            case 'D':
                                            case 'E':
                                            case 'F':
                                            case 'G':
                                            case 'H':
                                            case 'I':
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
                                            case 'V':
                                            case 'W':
                                            case 'X':
                                            case 'Y':
                                            case 'Z':
                                            case '_':
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
                                                alt18=52;
                                                }
                                                break;
                                            default:
                                                alt18=36;}

                                        }
                                        else {
                                            alt18=52;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                            }
                            break;
                        case '#':
                        case '$':
                        case '-':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
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
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
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
                            alt18=52;
                            }
                            break;
                        default:
                            alt18=42;}

                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'E':
                    {
                    int LA18_76 = input.LA(4);

                    if ( (LA18_76=='C') ) {
                        int LA18_132 = input.LA(5);

                        if ( (LA18_132=='K') ) {
                            int LA18_187 = input.LA(6);

                            if ( ((LA18_187>='#' && LA18_187<='$')||LA18_187=='-'||(LA18_187>='0' && LA18_187<='9')||(LA18_187>='A' && LA18_187<='Z')||LA18_187=='_'||(LA18_187>='a' && LA18_187<='z')) ) {
                                alt18=52;
                            }
                            else {
                                alt18=24;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                default:
                    alt18=52;}

                }
                break;
            case 'O':
                {
                switch ( input.LA(3) ) {
                case 'M':
                    {
                    int LA18_77 = input.LA(4);

                    if ( (LA18_77=='M') ) {
                        int LA18_133 = input.LA(5);

                        if ( (LA18_133=='E') ) {
                            int LA18_188 = input.LA(6);

                            if ( (LA18_188=='N') ) {
                                int LA18_235 = input.LA(7);

                                if ( (LA18_235=='T') ) {
                                    int LA18_270 = input.LA(8);

                                    if ( (LA18_270==' ') ) {
                                        int LA18_300 = input.LA(9);

                                        if ( (LA18_300=='O') ) {
                                            int LA18_325 = input.LA(10);

                                            if ( (LA18_325=='N') ) {
                                                int LA18_339 = input.LA(11);

                                                if ( (LA18_339==' ') ) {
                                                    int LA18_348 = input.LA(12);

                                                    if ( (LA18_348=='C') ) {
                                                        alt18=20;
                                                    }
                                                    else if ( (LA18_348=='T') ) {
                                                        alt18=13;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("1:1: Tokens : ( T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | EXACTO | APROXIMADO | CHARACTERS | BITS | TIMES | INTERVALS | BINARIES | SQUOTE | CVALUE | NUMBER | COMPARATOR | LOG_CONJ | ID | WS | ML_COMMENT | OL_COMMENT );", 18, 348, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1:1: Tokens : ( T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | EXACTO | APROXIMADO | CHARACTERS | BITS | TIMES | INTERVALS | BINARIES | SQUOTE | CVALUE | NUMBER | COMPARATOR | LOG_CONJ | ID | WS | ML_COMMENT | OL_COMMENT );", 18, 339, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1:1: Tokens : ( T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | EXACTO | APROXIMADO | CHARACTERS | BITS | TIMES | INTERVALS | BINARIES | SQUOTE | CVALUE | NUMBER | COMPARATOR | LOG_CONJ | ID | WS | ML_COMMENT | OL_COMMENT );", 18, 325, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1:1: Tokens : ( T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | EXACTO | APROXIMADO | CHARACTERS | BITS | TIMES | INTERVALS | BINARIES | SQUOTE | CVALUE | NUMBER | COMPARATOR | LOG_CONJ | ID | WS | ML_COMMENT | OL_COMMENT );", 18, 300, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'L':
                    {
                    int LA18_78 = input.LA(4);

                    if ( (LA18_78=='L') ) {
                        int LA18_134 = input.LA(5);

                        if ( (LA18_134=='A') ) {
                            int LA18_189 = input.LA(6);

                            if ( (LA18_189=='T') ) {
                                int LA18_236 = input.LA(7);

                                if ( (LA18_236=='E') ) {
                                    int LA18_271 = input.LA(8);

                                    if ( ((LA18_271>='#' && LA18_271<='$')||LA18_271=='-'||(LA18_271>='0' && LA18_271<='9')||(LA18_271>='A' && LA18_271<='Z')||LA18_271=='_'||(LA18_271>='a' && LA18_271<='z')) ) {
                                        alt18=52;
                                    }
                                    else {
                                        alt18=38;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'N':
                    {
                    int LA18_79 = input.LA(4);

                    if ( (LA18_79=='S') ) {
                        int LA18_135 = input.LA(5);

                        if ( (LA18_135=='T') ) {
                            int LA18_190 = input.LA(6);

                            if ( (LA18_190=='R') ) {
                                int LA18_237 = input.LA(7);

                                if ( (LA18_237=='A') ) {
                                    int LA18_272 = input.LA(8);

                                    if ( (LA18_272=='I') ) {
                                        int LA18_302 = input.LA(9);

                                        if ( (LA18_302=='N') ) {
                                            int LA18_326 = input.LA(10);

                                            if ( (LA18_326=='T') ) {
                                                int LA18_340 = input.LA(11);

                                                if ( ((LA18_340>='#' && LA18_340<='$')||LA18_340=='-'||(LA18_340>='0' && LA18_340<='9')||(LA18_340>='A' && LA18_340<='Z')||LA18_340=='_'||(LA18_340>='a' && LA18_340<='z')) ) {
                                                    alt18=52;
                                                }
                                                else {
                                                    alt18=16;}
                                            }
                                            else {
                                                alt18=52;}
                                        }
                                        else {
                                            alt18=52;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                default:
                    alt18=52;}

                }
                break;
            case 'L':
                {
                int LA18_33 = input.LA(3);

                if ( (LA18_33=='O') ) {
                    int LA18_80 = input.LA(4);

                    if ( (LA18_80=='B') ) {
                        int LA18_136 = input.LA(5);

                        if ( ((LA18_136>='#' && LA18_136<='$')||LA18_136=='-'||(LA18_136>='0' && LA18_136<='9')||(LA18_136>='A' && LA18_136<='Z')||LA18_136=='_'||(LA18_136>='a' && LA18_136<='z')) ) {
                            alt18=52;
                        }
                        else {
                            alt18=42;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'A':
                {
                int LA18_34 = input.LA(3);

                if ( (LA18_34=='S') ) {
                    int LA18_81 = input.LA(4);

                    if ( (LA18_81=='C') ) {
                        int LA18_137 = input.LA(5);

                        if ( (LA18_137=='A') ) {
                            int LA18_191 = input.LA(6);

                            if ( (LA18_191=='D') ) {
                                int LA18_238 = input.LA(7);

                                if ( (LA18_238=='E') ) {
                                    int LA18_273 = input.LA(8);

                                    if ( ((LA18_273>='#' && LA18_273<='$')||LA18_273=='-'||(LA18_273>='0' && LA18_273<='9')||(LA18_273>='A' && LA18_273<='Z')||LA18_273=='_'||(LA18_273>='a' && LA18_273<='z')) ) {
                                        alt18=52;
                                    }
                                    else {
                                        alt18=30;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            default:
                alt18=52;}

            }
            break;
        case 'R':
            {
            int LA18_2 = input.LA(2);

            if ( (LA18_2=='E') ) {
                switch ( input.LA(3) ) {
                case 'P':
                    {
                    int LA18_82 = input.LA(4);

                    if ( (LA18_82=='L') ) {
                        int LA18_138 = input.LA(5);

                        if ( (LA18_138=='A') ) {
                            int LA18_192 = input.LA(6);

                            if ( (LA18_192=='C') ) {
                                int LA18_239 = input.LA(7);

                                if ( (LA18_239=='E') ) {
                                    int LA18_274 = input.LA(8);

                                    if ( ((LA18_274>='#' && LA18_274<='$')||LA18_274=='-'||(LA18_274>='0' && LA18_274<='9')||(LA18_274>='A' && LA18_274<='Z')||LA18_274=='_'||(LA18_274>='a' && LA18_274<='z')) ) {
                                        alt18=52;
                                    }
                                    else {
                                        alt18=2;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'A':
                    {
                    int LA18_83 = input.LA(4);

                    if ( (LA18_83=='L') ) {
                        int LA18_139 = input.LA(5);

                        if ( ((LA18_139>='#' && LA18_139<='$')||LA18_139=='-'||(LA18_139>='0' && LA18_139<='9')||(LA18_139>='A' && LA18_139<='Z')||LA18_139=='_'||(LA18_139>='a' && LA18_139<='z')) ) {
                            alt18=52;
                        }
                        else {
                            alt18=41;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'F':
                    {
                    int LA18_84 = input.LA(4);

                    if ( (LA18_84=='E') ) {
                        int LA18_140 = input.LA(5);

                        if ( (LA18_140=='R') ) {
                            int LA18_194 = input.LA(6);

                            if ( (LA18_194=='E') ) {
                                int LA18_240 = input.LA(7);

                                if ( (LA18_240=='N') ) {
                                    int LA18_275 = input.LA(8);

                                    if ( (LA18_275=='C') ) {
                                        int LA18_305 = input.LA(9);

                                        if ( (LA18_305=='E') ) {
                                            int LA18_327 = input.LA(10);

                                            if ( (LA18_327=='S') ) {
                                                int LA18_341 = input.LA(11);

                                                if ( ((LA18_341>='#' && LA18_341<='$')||LA18_341=='-'||(LA18_341>='0' && LA18_341<='9')||(LA18_341>='A' && LA18_341<='Z')||LA18_341=='_'||(LA18_341>='a' && LA18_341<='z')) ) {
                                                    alt18=52;
                                                }
                                                else {
                                                    alt18=26;}
                                            }
                                            else {
                                                alt18=52;}
                                        }
                                        else {
                                            alt18=52;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                default:
                    alt18=52;}

            }
            else {
                alt18=52;}
            }
            break;
        case 'T':
            {
            switch ( input.LA(2) ) {
            case 'A':
                {
                int LA18_36 = input.LA(3);

                if ( (LA18_36=='B') ) {
                    int LA18_85 = input.LA(4);

                    if ( (LA18_85=='L') ) {
                        int LA18_141 = input.LA(5);

                        if ( (LA18_141=='E') ) {
                            int LA18_195 = input.LA(6);

                            if ( ((LA18_195>='#' && LA18_195<='$')||LA18_195=='-'||(LA18_195>='0' && LA18_195<='9')||(LA18_195>='A' && LA18_195<='Z')||LA18_195=='_'||(LA18_195>='a' && LA18_195<='z')) ) {
                                alt18=52;
                            }
                            else {
                                alt18=3;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'E':
                {
                int LA18_37 = input.LA(3);

                if ( (LA18_37=='X') ) {
                    int LA18_86 = input.LA(4);

                    if ( (LA18_86=='T') ) {
                        int LA18_142 = input.LA(5);

                        if ( ((LA18_142>='#' && LA18_142<='$')||LA18_142=='-'||(LA18_142>='0' && LA18_142<='9')||(LA18_142>='A' && LA18_142<='Z')||LA18_142=='_'||(LA18_142>='a' && LA18_142<='z')) ) {
                            alt18=52;
                        }
                        else {
                            alt18=42;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'I':
                {
                int LA18_38 = input.LA(3);

                if ( (LA18_38=='M') ) {
                    int LA18_87 = input.LA(4);

                    if ( (LA18_87=='E') ) {
                        switch ( input.LA(5) ) {
                        case 'S':
                            {
                            int LA18_196 = input.LA(6);

                            if ( (LA18_196=='T') ) {
                                int LA18_242 = input.LA(7);

                                if ( (LA18_242=='A') ) {
                                    int LA18_276 = input.LA(8);

                                    if ( (LA18_276=='M') ) {
                                        int LA18_306 = input.LA(9);

                                        if ( (LA18_306=='P') ) {
                                            int LA18_328 = input.LA(10);

                                            if ( ((LA18_328>='#' && LA18_328<='$')||LA18_328=='-'||(LA18_328>='0' && LA18_328<='9')||(LA18_328>='A' && LA18_328<='Z')||LA18_328=='_'||(LA18_328>='a' && LA18_328<='z')) ) {
                                                alt18=52;
                                            }
                                            else {
                                                alt18=44;}
                                        }
                                        else {
                                            alt18=52;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                            }
                            break;
                        case '#':
                        case '$':
                        case '-':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
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
                            alt18=52;
                            }
                            break;
                        default:
                            alt18=44;}

                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            default:
                alt18=52;}

            }
            break;
        case '(':
            {
            alt18=4;
            }
            break;
        case ',':
            {
            int LA18_5 = input.LA(2);

            if ( (LA18_5==','||(LA18_5>='0' && LA18_5<='9')) ) {
                alt18=49;
            }
            else {
                alt18=5;}
            }
            break;
        case ')':
            {
            alt18=6;
            }
            break;
        case 'L':
            {
            int LA18_7 = input.LA(2);

            if ( (LA18_7=='O') ) {
                switch ( input.LA(3) ) {
                case 'N':
                    {
                    int LA18_88 = input.LA(4);

                    if ( (LA18_88=='G') ) {
                        int LA18_144 = input.LA(5);

                        if ( ((LA18_144>='#' && LA18_144<='$')||LA18_144=='-'||(LA18_144>='0' && LA18_144<='9')||(LA18_144>='A' && LA18_144<='Z')||LA18_144=='_'||(LA18_144>='a' && LA18_144<='z')) ) {
                            alt18=52;
                        }
                        else {
                            alt18=41;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'G':
                    {
                    int LA18_89 = input.LA(4);

                    if ( (LA18_89=='G') ) {
                        int LA18_145 = input.LA(5);

                        if ( (LA18_145=='I') ) {
                            int LA18_198 = input.LA(6);

                            if ( (LA18_198=='N') ) {
                                int LA18_243 = input.LA(7);

                                if ( (LA18_243=='G') ) {
                                    int LA18_277 = input.LA(8);

                                    if ( ((LA18_277>='#' && LA18_277<='$')||LA18_277=='-'||(LA18_277>='0' && LA18_277<='9')||(LA18_277>='A' && LA18_277<='Z')||LA18_277=='_'||(LA18_277>='a' && LA18_277<='z')) ) {
                                        alt18=52;
                                    }
                                    else {
                                        alt18=7;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                default:
                    alt18=52;}

            }
            else {
                alt18=52;}
            }
            break;
        case 'N':
            {
            switch ( input.LA(2) ) {
            case 'U':
                {
                switch ( input.LA(3) ) {
                case 'L':
                    {
                    int LA18_90 = input.LA(4);

                    if ( (LA18_90=='L') ) {
                        int LA18_146 = input.LA(5);

                        if ( ((LA18_146>='#' && LA18_146<='$')||LA18_146=='-'||(LA18_146>='0' && LA18_146<='9')||(LA18_146>='A' && LA18_146<='Z')||LA18_146=='_'||(LA18_146>='a' && LA18_146<='z')) ) {
                            alt18=52;
                        }
                        else {
                            alt18=17;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'M':
                    {
                    switch ( input.LA(4) ) {
                    case 'E':
                        {
                        int LA18_147 = input.LA(5);

                        if ( (LA18_147=='R') ) {
                            int LA18_200 = input.LA(6);

                            if ( (LA18_200=='I') ) {
                                int LA18_244 = input.LA(7);

                                if ( (LA18_244=='C') ) {
                                    int LA18_278 = input.LA(8);

                                    if ( ((LA18_278>='#' && LA18_278<='$')||LA18_278=='-'||(LA18_278>='0' && LA18_278<='9')||(LA18_278>='A' && LA18_278<='Z')||LA18_278=='_'||(LA18_278>='a' && LA18_278<='z')) ) {
                                        alt18=52;
                                    }
                                    else {
                                        alt18=40;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                        }
                        break;
                    case 'B':
                        {
                        int LA18_148 = input.LA(5);

                        if ( (LA18_148=='E') ) {
                            int LA18_201 = input.LA(6);

                            if ( (LA18_201=='R') ) {
                                int LA18_245 = input.LA(7);

                                if ( ((LA18_245>='#' && LA18_245<='$')||LA18_245=='-'||(LA18_245>='0' && LA18_245<='9')||(LA18_245>='A' && LA18_245<='Z')||LA18_245=='_'||(LA18_245>='a' && LA18_245<='z')) ) {
                                    alt18=52;
                                }
                                else {
                                    alt18=40;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                        }
                        break;
                    default:
                        alt18=52;}

                    }
                    break;
                default:
                    alt18=52;}

                }
                break;
            case 'V':
                {
                int LA18_42 = input.LA(3);

                if ( (LA18_42=='A') ) {
                    int LA18_92 = input.LA(4);

                    if ( (LA18_92=='R') ) {
                        int LA18_149 = input.LA(5);

                        if ( (LA18_149=='C') ) {
                            int LA18_202 = input.LA(6);

                            if ( (LA18_202=='H') ) {
                                int LA18_246 = input.LA(7);

                                if ( (LA18_246=='A') ) {
                                    int LA18_279 = input.LA(8);

                                    if ( (LA18_279=='R') ) {
                                        int LA18_308 = input.LA(9);

                                        if ( (LA18_308=='2') ) {
                                            int LA18_329 = input.LA(10);

                                            if ( ((LA18_329>='#' && LA18_329<='$')||LA18_329=='-'||(LA18_329>='0' && LA18_329<='9')||(LA18_329>='A' && LA18_329<='Z')||LA18_329=='_'||(LA18_329>='a' && LA18_329<='z')) ) {
                                                alt18=52;
                                            }
                                            else {
                                                alt18=42;}
                                        }
                                        else {
                                            alt18=52;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'C':
                {
                switch ( input.LA(3) ) {
                case 'L':
                    {
                    int LA18_93 = input.LA(4);

                    if ( (LA18_93=='O') ) {
                        int LA18_150 = input.LA(5);

                        if ( (LA18_150=='B') ) {
                            int LA18_203 = input.LA(6);

                            if ( ((LA18_203>='#' && LA18_203<='$')||LA18_203=='-'||(LA18_203>='0' && LA18_203<='9')||(LA18_203>='A' && LA18_203<='Z')||LA18_203=='_'||(LA18_203>='a' && LA18_203<='z')) ) {
                                alt18=52;
                            }
                            else {
                                alt18=42;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'H':
                    {
                    int LA18_94 = input.LA(4);

                    if ( (LA18_94=='A') ) {
                        int LA18_151 = input.LA(5);

                        if ( (LA18_151=='R') ) {
                            int LA18_204 = input.LA(6);

                            if ( ((LA18_204>='#' && LA18_204<='$')||LA18_204=='-'||(LA18_204>='0' && LA18_204<='9')||(LA18_204>='A' && LA18_204<='Z')||LA18_204=='_'||(LA18_204>='a' && LA18_204<='z')) ) {
                                alt18=52;
                            }
                            else {
                                alt18=42;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                default:
                    alt18=52;}

                }
                break;
            case 'O':
                {
                switch ( input.LA(3) ) {
                case 'T':
                    {
                    int LA18_95 = input.LA(4);

                    if ( (LA18_95==' ') ) {
                        alt18=18;
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'C':
                    {
                    switch ( input.LA(4) ) {
                    case 'A':
                        {
                        int LA18_153 = input.LA(5);

                        if ( (LA18_153=='C') ) {
                            int LA18_205 = input.LA(6);

                            if ( (LA18_205=='H') ) {
                                int LA18_247 = input.LA(7);

                                if ( (LA18_247=='E') ) {
                                    int LA18_280 = input.LA(8);

                                    if ( ((LA18_280>='#' && LA18_280<='$')||LA18_280=='-'||(LA18_280>='0' && LA18_280<='9')||(LA18_280>='A' && LA18_280<='Z')||LA18_280=='_'||(LA18_280>='a' && LA18_280<='z')) ) {
                                        alt18=52;
                                    }
                                    else {
                                        alt18=9;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                        }
                        break;
                    case 'O':
                        {
                        int LA18_154 = input.LA(5);

                        if ( (LA18_154=='M') ) {
                            int LA18_206 = input.LA(6);

                            if ( (LA18_206=='P') ) {
                                int LA18_248 = input.LA(7);

                                if ( (LA18_248=='R') ) {
                                    int LA18_281 = input.LA(8);

                                    if ( (LA18_281=='E') ) {
                                        int LA18_310 = input.LA(9);

                                        if ( (LA18_310=='S') ) {
                                            int LA18_330 = input.LA(10);

                                            if ( (LA18_330=='S') ) {
                                                int LA18_342 = input.LA(11);

                                                if ( ((LA18_342>='#' && LA18_342<='$')||LA18_342=='-'||(LA18_342>='0' && LA18_342<='9')||(LA18_342>='A' && LA18_342<='Z')||LA18_342=='_'||(LA18_342>='a' && LA18_342<='z')) ) {
                                                    alt18=52;
                                                }
                                                else {
                                                    alt18=8;}
                                            }
                                            else {
                                                alt18=52;}
                                        }
                                        else {
                                            alt18=52;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                        }
                        break;
                    default:
                        alt18=52;}

                    }
                    break;
                case 'P':
                    {
                    int LA18_97 = input.LA(4);

                    if ( (LA18_97=='A') ) {
                        int LA18_155 = input.LA(5);

                        if ( (LA18_155=='R') ) {
                            int LA18_207 = input.LA(6);

                            if ( (LA18_207=='A') ) {
                                int LA18_249 = input.LA(7);

                                if ( (LA18_249=='L') ) {
                                    int LA18_282 = input.LA(8);

                                    if ( (LA18_282=='L') ) {
                                        int LA18_311 = input.LA(9);

                                        if ( (LA18_311=='E') ) {
                                            int LA18_331 = input.LA(10);

                                            if ( (LA18_331=='L') ) {
                                                int LA18_343 = input.LA(11);

                                                if ( ((LA18_343>='#' && LA18_343<='$')||LA18_343=='-'||(LA18_343>='0' && LA18_343<='9')||(LA18_343>='A' && LA18_343<='Z')||LA18_343=='_'||(LA18_343>='a' && LA18_343<='z')) ) {
                                                    alt18=52;
                                                }
                                                else {
                                                    alt18=10;}
                                            }
                                            else {
                                                alt18=52;}
                                        }
                                        else {
                                            alt18=52;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                default:
                    alt18=52;}

                }
                break;
            case 'A':
                {
                int LA18_45 = input.LA(3);

                if ( (LA18_45=='T') ) {
                    int LA18_98 = input.LA(4);

                    if ( (LA18_98=='I') ) {
                        int LA18_156 = input.LA(5);

                        if ( (LA18_156=='O') ) {
                            int LA18_208 = input.LA(6);

                            if ( (LA18_208=='N') ) {
                                int LA18_250 = input.LA(7);

                                if ( (LA18_250=='A') ) {
                                    int LA18_283 = input.LA(8);

                                    if ( (LA18_283=='L') ) {
                                        int LA18_312 = input.LA(9);

                                        if ( (LA18_312==' ') ) {
                                            alt18=42;
                                        }
                                        else {
                                            alt18=52;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            default:
                alt18=52;}

            }
            break;
        case 'M':
            {
            int LA18_9 = input.LA(2);

            if ( (LA18_9=='O') ) {
                int LA18_46 = input.LA(3);

                if ( (LA18_46=='N') ) {
                    int LA18_99 = input.LA(4);

                    if ( (LA18_99=='I') ) {
                        int LA18_157 = input.LA(5);

                        if ( (LA18_157=='T') ) {
                            int LA18_209 = input.LA(6);

                            if ( (LA18_209=='O') ) {
                                int LA18_251 = input.LA(7);

                                if ( (LA18_251=='R') ) {
                                    int LA18_284 = input.LA(8);

                                    if ( (LA18_284=='I') ) {
                                        int LA18_313 = input.LA(9);

                                        if ( (LA18_313=='N') ) {
                                            int LA18_332 = input.LA(10);

                                            if ( (LA18_332=='G') ) {
                                                int LA18_344 = input.LA(11);

                                                if ( ((LA18_344>='#' && LA18_344<='$')||LA18_344=='-'||(LA18_344>='0' && LA18_344<='9')||(LA18_344>='A' && LA18_344<='Z')||LA18_344=='_'||(LA18_344>='a' && LA18_344<='z')) ) {
                                                    alt18=52;
                                                }
                                                else {
                                                    alt18=11;}
                                            }
                                            else {
                                                alt18=52;}
                                        }
                                        else {
                                            alt18=52;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
            }
            else {
                alt18=52;}
            }
            break;
        case ';':
            {
            alt18=12;
            }
            break;
        case 'I':
            {
            switch ( input.LA(2) ) {
            case 'N':
                {
                switch ( input.LA(3) ) {
                case 'T':
                    {
                    switch ( input.LA(4) ) {
                    case 'E':
                        {
                        int LA18_158 = input.LA(5);

                        if ( (LA18_158=='G') ) {
                            int LA18_210 = input.LA(6);

                            if ( (LA18_210=='E') ) {
                                int LA18_252 = input.LA(7);

                                if ( (LA18_252=='R') ) {
                                    int LA18_285 = input.LA(8);

                                    if ( ((LA18_285>='#' && LA18_285<='$')||LA18_285=='-'||(LA18_285>='0' && LA18_285<='9')||(LA18_285>='A' && LA18_285<='Z')||LA18_285=='_'||(LA18_285>='a' && LA18_285<='z')) ) {
                                        alt18=52;
                                    }
                                    else {
                                        alt18=40;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                        }
                        break;
                    case '#':
                    case '$':
                    case '-':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
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
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
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
                        alt18=52;
                        }
                        break;
                    default:
                        alt18=40;}

                    }
                    break;
                case '#':
                case '$':
                case '-':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
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
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
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
                    alt18=52;
                    }
                    break;
                default:
                    alt18=39;}

                }
                break;
            case 'S':
                {
                int LA18_48 = input.LA(3);

                if ( ((LA18_48>='#' && LA18_48<='$')||LA18_48=='-'||(LA18_48>='0' && LA18_48<='9')||(LA18_48>='A' && LA18_48<='Z')||LA18_48=='_'||(LA18_48>='a' && LA18_48<='z')) ) {
                    alt18=52;
                }
                else {
                    alt18=14;}
                }
                break;
            case 'F':
                {
                int LA18_49 = input.LA(3);

                if ( (LA18_49==' ') ) {
                    alt18=35;
                }
                else {
                    alt18=52;}
                }
                break;
            default:
                alt18=52;}

            }
            break;
        case 'B':
            {
            switch ( input.LA(2) ) {
            case 'Y':
                {
                int LA18_50 = input.LA(3);

                if ( (LA18_50=='T') ) {
                    int LA18_104 = input.LA(4);

                    if ( (LA18_104=='E') ) {
                        int LA18_160 = input.LA(5);

                        if ( ((LA18_160>='#' && LA18_160<='$')||LA18_160=='-'||(LA18_160>='0' && LA18_160<='9')||(LA18_160>='A' && LA18_160<='Z')||LA18_160=='_'||(LA18_160>='a' && LA18_160<='z')) ) {
                            alt18=52;
                        }
                        else {
                            alt18=15;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'I':
                {
                switch ( input.LA(3) ) {
                case 'N':
                    {
                    int LA18_105 = input.LA(4);

                    if ( (LA18_105=='A') ) {
                        int LA18_161 = input.LA(5);

                        if ( (LA18_161=='R') ) {
                            int LA18_212 = input.LA(6);

                            if ( (LA18_212=='Y') ) {
                                int LA18_253 = input.LA(7);

                                if ( (LA18_253=='_') ) {
                                    switch ( input.LA(8) ) {
                                    case 'D':
                                        {
                                        int LA18_314 = input.LA(9);

                                        if ( (LA18_314=='O') ) {
                                            int LA18_333 = input.LA(10);

                                            if ( (LA18_333=='U') ) {
                                                int LA18_345 = input.LA(11);

                                                if ( (LA18_345=='B') ) {
                                                    int LA18_354 = input.LA(12);

                                                    if ( (LA18_354=='L') ) {
                                                        int LA18_358 = input.LA(13);

                                                        if ( (LA18_358=='E') ) {
                                                            int LA18_360 = input.LA(14);

                                                            if ( ((LA18_360>='#' && LA18_360<='$')||LA18_360=='-'||(LA18_360>='0' && LA18_360<='9')||(LA18_360>='A' && LA18_360<='Z')||LA18_360=='_'||(LA18_360>='a' && LA18_360<='z')) ) {
                                                                alt18=52;
                                                            }
                                                            else {
                                                                alt18=46;}
                                                        }
                                                        else {
                                                            alt18=52;}
                                                    }
                                                    else {
                                                        alt18=52;}
                                                }
                                                else {
                                                    alt18=52;}
                                            }
                                            else {
                                                alt18=52;}
                                        }
                                        else {
                                            alt18=52;}
                                        }
                                        break;
                                    case 'F':
                                        {
                                        int LA18_315 = input.LA(9);

                                        if ( (LA18_315=='L') ) {
                                            int LA18_334 = input.LA(10);

                                            if ( (LA18_334=='O') ) {
                                                int LA18_346 = input.LA(11);

                                                if ( (LA18_346=='A') ) {
                                                    int LA18_355 = input.LA(12);

                                                    if ( (LA18_355=='T') ) {
                                                        int LA18_359 = input.LA(13);

                                                        if ( ((LA18_359>='#' && LA18_359<='$')||LA18_359=='-'||(LA18_359>='0' && LA18_359<='9')||(LA18_359>='A' && LA18_359<='Z')||LA18_359=='_'||(LA18_359>='a' && LA18_359<='z')) ) {
                                                            alt18=52;
                                                        }
                                                        else {
                                                            alt18=46;}
                                                    }
                                                    else {
                                                        alt18=52;}
                                                }
                                                else {
                                                    alt18=52;}
                                            }
                                            else {
                                                alt18=52;}
                                        }
                                        else {
                                            alt18=52;}
                                        }
                                        break;
                                    default:
                                        alt18=52;}

                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'T':
                    {
                    int LA18_106 = input.LA(4);

                    if ( ((LA18_106>='#' && LA18_106<='$')||LA18_106=='-'||(LA18_106>='0' && LA18_106<='9')||(LA18_106>='A' && LA18_106<='Z')||LA18_106=='_'||(LA18_106>='a' && LA18_106<='z')) ) {
                        alt18=52;
                    }
                    else {
                        alt18=43;}
                    }
                    break;
                default:
                    alt18=52;}

                }
                break;
            case 'L':
                {
                int LA18_52 = input.LA(3);

                if ( (LA18_52=='O') ) {
                    int LA18_107 = input.LA(4);

                    if ( (LA18_107=='B') ) {
                        int LA18_163 = input.LA(5);

                        if ( ((LA18_163>='#' && LA18_163<='$')||LA18_163=='-'||(LA18_163>='0' && LA18_163<='9')||(LA18_163>='A' && LA18_163<='Z')||LA18_163=='_'||(LA18_163>='a' && LA18_163<='z')) ) {
                            alt18=52;
                        }
                        else {
                            alt18=46;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'F':
                {
                int LA18_53 = input.LA(3);

                if ( (LA18_53=='I') ) {
                    int LA18_108 = input.LA(4);

                    if ( (LA18_108=='L') ) {
                        int LA18_164 = input.LA(5);

                        if ( (LA18_164=='E') ) {
                            int LA18_214 = input.LA(6);

                            if ( ((LA18_214>='#' && LA18_214<='$')||LA18_214=='-'||(LA18_214>='0' && LA18_214<='9')||(LA18_214>='A' && LA18_214<='Z')||LA18_214=='_'||(LA18_214>='a' && LA18_214<='z')) ) {
                                alt18=52;
                            }
                            else {
                                alt18=46;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            default:
                alt18=52;}

            }
            break;
        case 'D':
            {
            switch ( input.LA(2) ) {
            case 'O':
                {
                int LA18_54 = input.LA(3);

                if ( (LA18_54=='U') ) {
                    int LA18_109 = input.LA(4);

                    if ( (LA18_109=='B') ) {
                        int LA18_165 = input.LA(5);

                        if ( (LA18_165=='L') ) {
                            int LA18_215 = input.LA(6);

                            if ( (LA18_215=='E') ) {
                                int LA18_254 = input.LA(7);

                                if ( (LA18_254==' ') ) {
                                    alt18=41;
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'E':
                {
                switch ( input.LA(3) ) {
                case 'C':
                    {
                    int LA18_110 = input.LA(4);

                    if ( (LA18_110=='I') ) {
                        int LA18_166 = input.LA(5);

                        if ( (LA18_166=='M') ) {
                            int LA18_216 = input.LA(6);

                            if ( (LA18_216=='A') ) {
                                int LA18_255 = input.LA(7);

                                if ( (LA18_255=='L') ) {
                                    int LA18_287 = input.LA(8);

                                    if ( ((LA18_287>='#' && LA18_287<='$')||LA18_287=='-'||(LA18_287>='0' && LA18_287<='9')||(LA18_287>='A' && LA18_287<='Z')||LA18_287=='_'||(LA18_287>='a' && LA18_287<='z')) ) {
                                        alt18=52;
                                    }
                                    else {
                                        alt18=40;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'L':
                    {
                    int LA18_111 = input.LA(4);

                    if ( (LA18_111=='E') ) {
                        int LA18_167 = input.LA(5);

                        if ( (LA18_167=='T') ) {
                            int LA18_217 = input.LA(6);

                            if ( (LA18_217=='E') ) {
                                int LA18_256 = input.LA(7);

                                if ( ((LA18_256>='#' && LA18_256<='$')||LA18_256=='-'||(LA18_256>='0' && LA18_256<='9')||(LA18_256>='A' && LA18_256<='Z')||LA18_256=='_'||(LA18_256>='a' && LA18_256<='z')) ) {
                                    alt18=52;
                                }
                                else {
                                    alt18=28;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                case 'F':
                    {
                    int LA18_112 = input.LA(4);

                    if ( (LA18_112=='A') ) {
                        int LA18_168 = input.LA(5);

                        if ( (LA18_168=='U') ) {
                            int LA18_218 = input.LA(6);

                            if ( (LA18_218=='L') ) {
                                int LA18_257 = input.LA(7);

                                if ( (LA18_257=='T') ) {
                                    int LA18_289 = input.LA(8);

                                    if ( ((LA18_289>='#' && LA18_289<='$')||LA18_289=='-'||(LA18_289>='0' && LA18_289<='9')||(LA18_289>='A' && LA18_289<='Z')||LA18_289=='_'||(LA18_289>='a' && LA18_289<='z')) ) {
                                        alt18=52;
                                    }
                                    else {
                                        alt18=19;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                default:
                    alt18=52;}

                }
                break;
            case 'R':
                {
                int LA18_56 = input.LA(3);

                if ( (LA18_56=='O') ) {
                    int LA18_113 = input.LA(4);

                    if ( (LA18_113=='P') ) {
                        int LA18_169 = input.LA(5);

                        if ( (LA18_169==' ') ) {
                            alt18=23;
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'A':
                {
                switch ( input.LA(3) ) {
                case 'T':
                    {
                    switch ( input.LA(4) ) {
                    case 'A':
                        {
                        int LA18_170 = input.LA(5);

                        if ( (LA18_170=='B') ) {
                            int LA18_220 = input.LA(6);

                            if ( (LA18_220=='A') ) {
                                int LA18_258 = input.LA(7);

                                if ( (LA18_258=='S') ) {
                                    int LA18_290 = input.LA(8);

                                    if ( (LA18_290=='E') ) {
                                        int LA18_317 = input.LA(9);

                                        if ( ((LA18_317>='#' && LA18_317<='$')||LA18_317=='-'||(LA18_317>='0' && LA18_317<='9')||(LA18_317>='A' && LA18_317<='Z')||LA18_317=='_'||(LA18_317>='a' && LA18_317<='z')) ) {
                                            alt18=52;
                                        }
                                        else {
                                            alt18=33;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                        }
                        break;
                    case 'E':
                        {
                        int LA18_171 = input.LA(5);

                        if ( ((LA18_171>='#' && LA18_171<='$')||LA18_171=='-'||(LA18_171>='0' && LA18_171<='9')||(LA18_171>='A' && LA18_171<='Z')||LA18_171=='_'||(LA18_171>='a' && LA18_171<='z')) ) {
                            alt18=52;
                        }
                        else {
                            alt18=44;}
                        }
                        break;
                    default:
                        alt18=52;}

                    }
                    break;
                case 'Y':
                    {
                    int LA18_115 = input.LA(4);

                    if ( (LA18_115=='-') ) {
                        int LA18_172 = input.LA(5);

                        if ( (LA18_172=='T') ) {
                            int LA18_221 = input.LA(6);

                            if ( (LA18_221=='I') ) {
                                int LA18_259 = input.LA(7);

                                if ( (LA18_259=='M') ) {
                                    int LA18_291 = input.LA(8);

                                    if ( (LA18_291=='E') ) {
                                        int LA18_318 = input.LA(9);

                                        if ( ((LA18_318>='#' && LA18_318<='$')||LA18_318=='-'||(LA18_318>='0' && LA18_318<='9')||(LA18_318>='A' && LA18_318<='Z')||LA18_318=='_'||(LA18_318>='a' && LA18_318<='z')) ) {
                                            alt18=52;
                                        }
                                        else {
                                            alt18=45;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                    }
                    break;
                default:
                    alt18=52;}

                }
                break;
            case 'I':
                {
                int LA18_58 = input.LA(3);

                if ( (LA18_58=='S') ) {
                    int LA18_116 = input.LA(4);

                    if ( (LA18_116=='A') ) {
                        int LA18_173 = input.LA(5);

                        if ( (LA18_173=='B') ) {
                            int LA18_222 = input.LA(6);

                            if ( (LA18_222=='L') ) {
                                int LA18_260 = input.LA(7);

                                if ( (LA18_260=='E') ) {
                                    int LA18_292 = input.LA(8);

                                    if ( ((LA18_292>='#' && LA18_292<='$')||LA18_292=='-'||(LA18_292>='0' && LA18_292<='9')||(LA18_292>='A' && LA18_292<='Z')||LA18_292=='_'||(LA18_292>='a' && LA18_292<='z')) ) {
                                        alt18=52;
                                    }
                                    else {
                                        alt18=31;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            default:
                alt18=52;}

            }
            break;
        case '.':
            {
            alt18=21;
            }
            break;
        case 'A':
            {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA18_59 = input.LA(3);

                if ( (LA18_59=='D') ) {
                    int LA18_117 = input.LA(4);

                    if ( ((LA18_117>='#' && LA18_117<='$')||LA18_117=='-'||(LA18_117>='0' && LA18_117<='9')||(LA18_117>='A' && LA18_117<='Z')||LA18_117=='_'||(LA18_117>='a' && LA18_117<='z')) ) {
                        alt18=52;
                    }
                    else {
                        alt18=51;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'L':
                {
                int LA18_60 = input.LA(3);

                if ( (LA18_60=='T') ) {
                    int LA18_118 = input.LA(4);

                    if ( (LA18_118=='E') ) {
                        int LA18_174 = input.LA(5);

                        if ( (LA18_174=='R') ) {
                            int LA18_223 = input.LA(6);

                            if ( (LA18_223==' ') ) {
                                alt18=22;
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            default:
                alt18=52;}

            }
            break;
        case 'F':
            {
            switch ( input.LA(2) ) {
            case 'L':
                {
                int LA18_61 = input.LA(3);

                if ( (LA18_61=='O') ) {
                    int LA18_119 = input.LA(4);

                    if ( (LA18_119=='A') ) {
                        int LA18_175 = input.LA(5);

                        if ( (LA18_175=='T') ) {
                            int LA18_224 = input.LA(6);

                            if ( ((LA18_224>='#' && LA18_224<='$')||LA18_224=='-'||(LA18_224>='0' && LA18_224<='9')||(LA18_224>='A' && LA18_224<='Z')||LA18_224=='_'||(LA18_224>='a' && LA18_224<='z')) ) {
                                alt18=52;
                            }
                            else {
                                alt18=41;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'O':
                {
                int LA18_62 = input.LA(3);

                if ( (LA18_62=='R') ) {
                    int LA18_120 = input.LA(4);

                    if ( (LA18_120=='E') ) {
                        int LA18_176 = input.LA(5);

                        if ( (LA18_176=='I') ) {
                            int LA18_225 = input.LA(6);

                            if ( (LA18_225=='G') ) {
                                int LA18_262 = input.LA(7);

                                if ( (LA18_262=='N') ) {
                                    int LA18_293 = input.LA(8);

                                    if ( (LA18_293==' ') ) {
                                        alt18=25;
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            default:
                alt18=52;}

            }
            break;
        case 'O':
            {
            switch ( input.LA(2) ) {
            case 'R':
                {
                int LA18_63 = input.LA(3);

                if ( ((LA18_63>='#' && LA18_63<='$')||LA18_63=='-'||(LA18_63>='0' && LA18_63<='9')||(LA18_63>='A' && LA18_63<='Z')||LA18_63=='_'||(LA18_63>='a' && LA18_63<='z')) ) {
                    alt18=52;
                }
                else {
                    alt18=51;}
                }
                break;
            case 'N':
                {
                int LA18_64 = input.LA(3);

                if ( ((LA18_64>='#' && LA18_64<='$')||LA18_64=='-'||(LA18_64>='0' && LA18_64<='9')||(LA18_64>='A' && LA18_64<='Z')||LA18_64=='_'||(LA18_64>='a' && LA18_64<='z')) ) {
                    alt18=52;
                }
                else {
                    alt18=27;}
                }
                break;
            default:
                alt18=52;}

            }
            break;
        case 'U':
            {
            int LA18_18 = input.LA(2);

            if ( (LA18_18=='P') ) {
                int LA18_65 = input.LA(3);

                if ( (LA18_65=='D') ) {
                    int LA18_123 = input.LA(4);

                    if ( (LA18_123=='A') ) {
                        int LA18_177 = input.LA(5);

                        if ( (LA18_177=='T') ) {
                            int LA18_226 = input.LA(6);

                            if ( (LA18_226=='E') ) {
                                int LA18_263 = input.LA(7);

                                if ( ((LA18_263>='#' && LA18_263<='$')||LA18_263=='-'||(LA18_263>='0' && LA18_263<='9')||(LA18_263>='A' && LA18_263<='Z')||LA18_263=='_'||(LA18_263>='a' && LA18_263<='z')) ) {
                                    alt18=52;
                                }
                                else {
                                    alt18=29;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
            }
            else {
                alt18=52;}
            }
            break;
        case 'P':
            {
            int LA18_19 = input.LA(2);

            if ( (LA18_19=='R') ) {
                int LA18_66 = input.LA(3);

                if ( (LA18_66=='I') ) {
                    int LA18_124 = input.LA(4);

                    if ( (LA18_124=='M') ) {
                        int LA18_178 = input.LA(5);

                        if ( (LA18_178=='A') ) {
                            int LA18_227 = input.LA(6);

                            if ( (LA18_227=='R') ) {
                                int LA18_264 = input.LA(7);

                                if ( (LA18_264=='Y') ) {
                                    int LA18_295 = input.LA(8);

                                    if ( (LA18_295==' ') ) {
                                        alt18=32;
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
            }
            else {
                alt18=52;}
            }
            break;
        case 'S':
            {
            switch ( input.LA(2) ) {
            case 'M':
                {
                int LA18_67 = input.LA(3);

                if ( (LA18_67=='A') ) {
                    int LA18_125 = input.LA(4);

                    if ( (LA18_125=='L') ) {
                        int LA18_179 = input.LA(5);

                        if ( (LA18_179=='L') ) {
                            int LA18_228 = input.LA(6);

                            if ( (LA18_228==' ') ) {
                                alt18=40;
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'E':
                {
                int LA18_68 = input.LA(3);

                if ( (LA18_68=='T') ) {
                    int LA18_126 = input.LA(4);

                    if ( ((LA18_126>='#' && LA18_126<='$')||LA18_126=='-'||(LA18_126>='0' && LA18_126<='9')||(LA18_126>='A' && LA18_126<='Z')||LA18_126=='_'||(LA18_126>='a' && LA18_126<='z')) ) {
                        alt18=52;
                    }
                    else {
                        alt18=37;}
                }
                else {
                    alt18=52;}
                }
                break;
            case 'C':
                {
                int LA18_69 = input.LA(3);

                if ( (LA18_69=='H') ) {
                    int LA18_127 = input.LA(4);

                    if ( (LA18_127=='E') ) {
                        int LA18_181 = input.LA(5);

                        if ( (LA18_181=='M') ) {
                            int LA18_229 = input.LA(6);

                            if ( (LA18_229=='A') ) {
                                int LA18_265 = input.LA(7);

                                if ( ((LA18_265>='#' && LA18_265<='$')||LA18_265=='-'||(LA18_265>='0' && LA18_265<='9')||(LA18_265>='A' && LA18_265<='Z')||LA18_265=='_'||(LA18_265>='a' && LA18_265<='z')) ) {
                                    alt18=52;
                                }
                                else {
                                    alt18=34;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
                }
                break;
            default:
                alt18=52;}

            }
            break;
        case 'V':
            {
            int LA18_21 = input.LA(2);

            if ( (LA18_21=='A') ) {
                int LA18_70 = input.LA(3);

                if ( (LA18_70=='R') ) {
                    int LA18_128 = input.LA(4);

                    if ( (LA18_128=='C') ) {
                        int LA18_182 = input.LA(5);

                        if ( (LA18_182=='H') ) {
                            int LA18_230 = input.LA(6);

                            if ( (LA18_230=='A') ) {
                                int LA18_266 = input.LA(7);

                                if ( (LA18_266=='R') ) {
                                    switch ( input.LA(8) ) {
                                    case '2':
                                        {
                                        int LA18_322 = input.LA(9);

                                        if ( ((LA18_322>='#' && LA18_322<='$')||LA18_322=='-'||(LA18_322>='0' && LA18_322<='9')||(LA18_322>='A' && LA18_322<='Z')||LA18_322=='_'||(LA18_322>='a' && LA18_322<='z')) ) {
                                            alt18=52;
                                        }
                                        else {
                                            alt18=42;}
                                        }
                                        break;
                                    case '#':
                                    case '$':
                                    case '-':
                                    case '0':
                                    case '1':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
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
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '_':
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
                                        alt18=52;
                                        }
                                        break;
                                    default:
                                        alt18=42;}

                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
            }
            else {
                alt18=52;}
            }
            break;
        case 'Y':
            {
            int LA18_22 = input.LA(2);

            if ( (LA18_22=='E') ) {
                int LA18_71 = input.LA(3);

                if ( (LA18_71=='A') ) {
                    int LA18_129 = input.LA(4);

                    if ( (LA18_129=='R') ) {
                        int LA18_183 = input.LA(5);

                        if ( (LA18_183=='-') ) {
                            int LA18_231 = input.LA(6);

                            if ( (LA18_231=='M') ) {
                                int LA18_267 = input.LA(7);

                                if ( (LA18_267=='O') ) {
                                    int LA18_298 = input.LA(8);

                                    if ( (LA18_298=='N') ) {
                                        int LA18_323 = input.LA(9);

                                        if ( (LA18_323=='T') ) {
                                            int LA18_337 = input.LA(10);

                                            if ( (LA18_337=='H') ) {
                                                int LA18_347 = input.LA(11);

                                                if ( ((LA18_347>='#' && LA18_347<='$')||LA18_347=='-'||(LA18_347>='0' && LA18_347<='9')||(LA18_347>='A' && LA18_347<='Z')||LA18_347=='_'||(LA18_347>='a' && LA18_347<='z')) ) {
                                                    alt18=52;
                                                }
                                                else {
                                                    alt18=45;}
                                            }
                                            else {
                                                alt18=52;}
                                        }
                                        else {
                                            alt18=52;}
                                    }
                                    else {
                                        alt18=52;}
                                }
                                else {
                                    alt18=52;}
                            }
                            else {
                                alt18=52;}
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=52;}
                }
                else {
                    alt18=52;}
            }
            else {
                alt18=52;}
            }
            break;
        case '\'':
            {
            int LA18_23 = input.LA(2);

            if ( ((LA18_23>='\u0000' && LA18_23<='\uFFFE')) ) {
                alt18=48;
            }
            else {
                alt18=47;}
            }
            break;
        case '<':
        case '=':
        case '>':
            {
            alt18=50;
            }
            break;
        case 'E':
        case 'G':
        case 'H':
        case 'J':
        case 'K':
        case 'Q':
        case 'W':
        case 'X':
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
            alt18=52;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt18=53;
            }
            break;
        case '/':
            {
            alt18=54;
            }
            break;
        case '-':
            {
            alt18=55;
            }
            break;
        default:
            alt18=49;}

        switch (alt18) {
            case 1 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:10: T20
                {
                mT20(); 

                }
                break;
            case 2 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:14: T21
                {
                mT21(); 

                }
                break;
            case 3 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:18: T22
                {
                mT22(); 

                }
                break;
            case 4 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:22: T23
                {
                mT23(); 

                }
                break;
            case 5 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:26: T24
                {
                mT24(); 

                }
                break;
            case 6 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:30: T25
                {
                mT25(); 

                }
                break;
            case 7 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:34: T26
                {
                mT26(); 

                }
                break;
            case 8 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:38: T27
                {
                mT27(); 

                }
                break;
            case 9 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:42: T28
                {
                mT28(); 

                }
                break;
            case 10 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:46: T29
                {
                mT29(); 

                }
                break;
            case 11 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:50: T30
                {
                mT30(); 

                }
                break;
            case 12 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:54: T31
                {
                mT31(); 

                }
                break;
            case 13 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:58: T32
                {
                mT32(); 

                }
                break;
            case 14 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:62: T33
                {
                mT33(); 

                }
                break;
            case 15 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:66: T34
                {
                mT34(); 

                }
                break;
            case 16 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:70: T35
                {
                mT35(); 

                }
                break;
            case 17 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:74: T36
                {
                mT36(); 

                }
                break;
            case 18 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:78: T37
                {
                mT37(); 

                }
                break;
            case 19 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:82: T38
                {
                mT38(); 

                }
                break;
            case 20 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:86: T39
                {
                mT39(); 

                }
                break;
            case 21 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:90: T40
                {
                mT40(); 

                }
                break;
            case 22 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:94: T41
                {
                mT41(); 

                }
                break;
            case 23 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:98: T42
                {
                mT42(); 

                }
                break;
            case 24 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:102: T43
                {
                mT43(); 

                }
                break;
            case 25 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:106: T44
                {
                mT44(); 

                }
                break;
            case 26 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:110: T45
                {
                mT45(); 

                }
                break;
            case 27 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:114: T46
                {
                mT46(); 

                }
                break;
            case 28 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:118: T47
                {
                mT47(); 

                }
                break;
            case 29 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:122: T48
                {
                mT48(); 

                }
                break;
            case 30 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:126: T49
                {
                mT49(); 

                }
                break;
            case 31 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:130: T50
                {
                mT50(); 

                }
                break;
            case 32 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:134: T51
                {
                mT51(); 

                }
                break;
            case 33 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:138: T52
                {
                mT52(); 

                }
                break;
            case 34 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:142: T53
                {
                mT53(); 

                }
                break;
            case 35 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:146: T54
                {
                mT54(); 

                }
                break;
            case 36 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:150: T55
                {
                mT55(); 

                }
                break;
            case 37 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:154: T56
                {
                mT56(); 

                }
                break;
            case 38 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:158: T57
                {
                mT57(); 

                }
                break;
            case 39 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:162: T58
                {
                mT58(); 

                }
                break;
            case 40 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:166: EXACTO
                {
                mEXACTO(); 

                }
                break;
            case 41 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:173: APROXIMADO
                {
                mAPROXIMADO(); 

                }
                break;
            case 42 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:184: CHARACTERS
                {
                mCHARACTERS(); 

                }
                break;
            case 43 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:195: BITS
                {
                mBITS(); 

                }
                break;
            case 44 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:200: TIMES
                {
                mTIMES(); 

                }
                break;
            case 45 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:206: INTERVALS
                {
                mINTERVALS(); 

                }
                break;
            case 46 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:216: BINARIES
                {
                mBINARIES(); 

                }
                break;
            case 47 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:225: SQUOTE
                {
                mSQUOTE(); 

                }
                break;
            case 48 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:232: CVALUE
                {
                mCVALUE(); 

                }
                break;
            case 49 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:239: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 50 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:246: COMPARATOR
                {
                mCOMPARATOR(); 

                }
                break;
            case 51 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:257: LOG_CONJ
                {
                mLOG_CONJ(); 

                }
                break;
            case 52 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:266: ID
                {
                mID(); 

                }
                break;
            case 53 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:269: WS
                {
                mWS(); 

                }
                break;
            case 54 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:272: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 55 :
                // /Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3:1:283: OL_COMMENT
                {
                mOL_COMMENT(); 

                }
                break;

        }

    }


 

}