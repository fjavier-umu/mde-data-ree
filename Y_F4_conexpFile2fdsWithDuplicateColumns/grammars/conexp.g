grammar conexp;

mainRule 
	:	database ';' (table_and_implications)*
	;

database
	:	ID
	;
	
table_and_implications
	:	table '(' implications ')'
	;

table
	:	ID
	;
	
implications
	:	(implication)*
	;
	
implication
	:	no '<' number_of_objects '>' premise '==>' conclusion ';'
	;

no
	:	NUMBER
	;
	
number_of_objects
	:	NUMBER
	;
	
premise
	:	(attribute+ | '{' '}')
	;
	
conclusion
	:	attribute+
	;
	
attribute
	:	ID
	;

NUMBER 	
	:	'0'..'9'+
	;

ID
	:	('a'..'z' | 'A'..'Z')('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-')*
	;

WS
	:	( ' ' | '\t' | '\n' | '\r' )+ 
		{$channel=HIDDEN;}
	;