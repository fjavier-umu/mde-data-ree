lexer grammar DML;

T9 : 'INSERT INTO' ;
T10 : '(' ;
T11 : ')' ;
T12 : 'VALUES' ;
T13 : ';' ;
T14 : ',' ;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3" 240
NUMBER
	:	('0'..'9' | '.')*
	;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3" 244
ID
	:	('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' | '$' | '#' | '-' | '@' | '.')*
	;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3" 248
SQUOTE
	:	'\u0027'
	;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3" 252
CVALUE
	:	SQUOTE ( options {greedy=false;} : . )* SQUOTE
	;

// $ANTLR src "/Users/fjavier/Copy/workspace/M_F2_DML/files/gen/DML.ge3" 256
WS
	:	( ' ' | '\t' | '\n' | '\r' )+ {$channel=HIDDEN;}
	;
