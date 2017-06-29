lexer grammar DDL;

T20 : 'CREATE' ;
T21 : 'REPLACE' ;
T22 : 'TABLE' ;
T23 : '(' ;
T24 : ',' ;
T25 : ')' ;
T26 : 'LOGGING' ;
T27 : 'NOCOMPRESS' ;
T28 : 'NOCACHE' ;
T29 : 'NOPARALLEL' ;
T30 : 'MONITORING' ;
T31 : ';' ;
T32 : 'COMMENT ON TABLE' ;
T33 : 'IS' ;
T34 : 'BYTE' ;
T35 : 'CONSTRAINT' ;
T36 : 'NULL' ;
T37 : 'NOT NULL' ;
T38 : 'DEFAULT' ;
T39 : 'COMMENT ON COLUMN' ;
T40 : '\.' ;
T41 : 'ALTER TABLE' ;
T42 : 'DROP CONSTRAINT' ;
T43 : 'CHECK' ;
T44 : 'FOREIGN KEY' ;
T45 : 'REFERENCES' ;
T46 : 'ON' ;
T47 : 'DELETE' ;
T48 : 'UPDATE' ;
T49 : 'CASCADE' ;
T50 : 'DISABLE' ;
T51 : 'PRIMARY KEY' ;
T52 : 'DATABASE' ;
T53 : 'SCHEMA' ;
T54 : 'IF NOT EXISTS' ;
T55 : 'CHARACTER' ;
T56 : 'SET' ;
T57 : 'COLLATE' ;
T58 : 'IN' ;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1550
EXACTO
	:	('NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT')
	;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1554
APROXIMADO
	: ('DOUBLE PRECISION' | 'LONG' | 'LONG RAW' | 'FLOAT' | 'REAL')
	;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1558
CHARACTERS
	: ('CHAR' | 'VARCHAR' | 'VARCHAR2' | 'TEXT' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB')
	;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1562
BITS
	: ('BIT' | 'BIT VARYING')
	;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1566
TIMES
	: ('DATE' | 'TIME' | 'TIMESTAMP')
	;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1570
INTERVALS
	: ('YEAR-MONTH' | 'DAY-TIME')
	;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1574
BINARIES
	: ('BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT')
	;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1578
SQUOTE					: '\u0027';
// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1579
CVALUE					: SQUOTE ( options {greedy=false;} : . )* SQUOTE;
// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1580
NUMBER					: ('0'..'9' | ',')*;
// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1581
COMPARATOR				:  '<>' | '>=' | '<=' | '=' | '>' | '<';
// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1582
LOG_CONJ				: 'OR' | 'AND';
// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1583
ID 						: ('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*;
// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1584
WS 						: (' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;};
// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1585
ML_COMMENT:
	'/*' (options {greedy=false;} : .)* '*/' (';')? { $channel=HIDDEN;}
	;
	
// $ANTLR src "/Users/fjavier/Copy/workspace/M_F1_DDL/files/gen/DDL.ge3" 1589
OL_COMMENT: '--' ( options {greedy=false;} : . )* '\n'+ { $channel=HIDDEN;}
	;