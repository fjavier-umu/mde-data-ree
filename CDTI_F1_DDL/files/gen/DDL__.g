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
T43 : 'ADD' ;
T44 : 'CHECK' ;
T45 : 'FOREIGN KEY' ;
T46 : 'REFERENCES' ;
T47 : 'ON' ;
T48 : 'DELETE' ;
T49 : 'UPDATE' ;
T50 : 'CASCADE' ;
T51 : 'DISABLE' ;
T52 : 'PRIMARY KEY' ;
T53 : 'DATABASE' ;
T54 : 'SCHEMA' ;
T55 : 'IF NOT EXISTS' ;
T56 : 'CHARACTER' ;
T57 : 'SET' ;
T58 : 'COLLATE' ;
T59 : 'IN' ;

// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1684
EXACTO
	:	('NUMBER' | 'NUMERIC' | 'INTEGER' | 'SMALL INTEGER' | 'DECIMAL' | 'INT' | 'SMALL INT')
	;

// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1688
APROXIMADO
	: ('DOUBLE PRECISION' | 'LONG' | 'LONG RAW' | 'FLOAT' | 'REAL')
	;

// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1692
CHARACTERS
	: ('CHAR' | 'VARCHAR' | 'VARCHAR2' | 'NVARCHAR2' | 'NCHAR' | 'CHAR VARYING' | 'CHARACTER' | 'CHARACTER VARYING' | 'NATIONAL CHAR' | 'NATIONAL CHAR VARYING' | 'NATIONAL CHARACTER' | 'NATIONAL CHARACTER VARYING' | 'NCHAR VARYING' | 'CLOB' | 'NCLOB')
	;

// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1696
BITS
	: ('BIT' | 'BIT VARYING')
	;

// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1700
TIMES
	: ('DATE' | 'TIME' | 'TIMESTAMP')
	;

// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1704
INTERVALS
	: ('YEAR-MONTH' | 'DAY-TIME')
	;

// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1708
BINARIES
	: ('BFILE' | 'BLOB' | 'BINARY_DOUBLE' | 'BINARY_FLOAT')
	;

// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1712
SQUOTE					: '\u0027';
// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1713
CVALUE					: SQUOTE ( options {greedy=false;} : . )* SQUOTE;
// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1714
NUMBER					: ('0'..'9' | ',')*;
// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1715
COMPARATOR				:  '<>' | '>=' | '<=' | '=' | '>' | '<';
// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1716
LOG_CONJ				: 'OR' | 'AND';
// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1717
ID 						: ('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*;
// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1718
WS 						: (' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;};
// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1719
ML_COMMENT:
	'/*' (options {greedy=false;} : .)* '*/' (';')? { $channel=HIDDEN;}
	;
	
// $ANTLR src "/Users/fjavier/UMU/Tesis/workspace/M_F1_DDL/files/gen/DDL.ge3" 1723
OL_COMMENT: '--' ( options {greedy=false;} : . )* '\n'+ { $channel=HIDDEN;}
	;