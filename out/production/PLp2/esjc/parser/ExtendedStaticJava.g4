grammar ExtendedStaticJava;

program: compilationUnit EOF;

compilationUnit
  : simpleClassDefintion* classDefinition simpleClassDefintion*
  ;

classDefinition
  : 'public' 'class' ID '{'
    mainMethodDeclaration
    memberDeclaration*
    '}'
  ;

simpleClassDefintion
  : 'class' ID '{' publicFieldDeclaration* '}';

publicFieldDeclaration
  : 'public' type ID ';';

memberDeclaration
  : fieldDeclaration | methodDeclaration
  ;

mainMethodDeclaration
  : 'public' 'static' 'void'
    id1=ID                   { "main".equals($id1.text) }?
    '(' id2=ID               { "String".equals($id2.text) }?
    '[' ']' id3=ID ')'
    '{' methodBody '}'
  ;

fieldDeclaration
  : 'static' type ID ';'
  ;

methodDeclaration
  : 'static' returnType ID '(' params? ')' '{' methodBody '}'
  ;

type
  : ( basicType | ID ) ( '[' ']')?;

basicType
  : 'boolean'                #BooleanType
  | 'int'                    #IntType
  ;

returnType
  : 'void'                   #VoidType
  | type                     #NonVoidReturnType
  ;

params
  : param ( ',' param )*
  ;

param
  : type ID
  ;

methodBody
  : localDeclaration* statement*
  ;

localDeclaration
  : type ID ';'
  ;

statement
  : assignStatement
  | ifStatement
  | whileStatement
  | invokeExpStatement
  | returnStatement
  | forStatement
  | doWhileStatement
  | incDecStatement
  ;

incDecStatement: incDec ';';

assign
  : lhs '=' exp
  ;

assignStatement
  : assign ';'
  ;

lhs
  : ID | exp '.' ID | exp '[' exp ']';

forStatement
  : 'for' '(' forInits? ';' exp? ';' forUpdates? ')' '{' statement* '}';

forInits
  : assign (',' assign)*;

forUpdates
  : incDec (',' incDec)*;

incDec
  : lhs '++' | lhs '--';

doWhileStatement
  : 'do' '{' statement* '}'* 'while' '(' exp ')' ';';

booleanLiteral
  : 'true'      #TrueLiteral
  | 'false'     #FalseLiteral
  ;

ifStatement
  : 'if' '(' exp ')' '{' ts+=statement* '}'
    ( 'else' '{' fs+=statement* '}' )?
  ;

whileStatement
  : 'while' '(' exp ')' '{' statement* '}'
  ;

invokeExpStatement
  : invoke ';'
  ;

returnStatement
  : 'return' ( exp )? ';'
  ;

exp
  : INT                      { new java.math.BigInteger($INT.text).bitLength() < 32 }?
                             #IntLiteral
  | booleanLiteral           #LiteralExp
//  | INT                      #IntLiteral
  | 'null'                   #NullLiteral
  | '(' exp ')'              #ParenExp
  | invoke                   #InvokeExp
  | ID                       #IdExp
  | op=( '-' | '+' | '!' | '~' ) exp     #UnaryExp
  | e1=exp
    op=( '*' | '/' | '%' )
    e2=exp                   #BinaryExp
  | e1=exp
    op=( '+' | '-' )
    e2=exp                   #BinaryExp
  | e1=exp
    op=( '<' | '>' | '<=' | '>=' )
    e2=exp                   #BinaryExp
  | e1=exp
    op=( '==' | '!=' )
    e2=exp                   #BinaryExp
  | e1=exp op='&&' e2=exp    #BinaryExp
  | e1=exp op='||' e2=exp    #BinaryExp
  | e1=exp op='<<' e2=exp    #BinaryExp
  | e1=exp op='>>' e2=exp    #BinaryExp
  | e1=exp op='>>>' e2=exp    #BinaryExp
  | condition=exp '?' p1=exp ':' p2=exp #CondExp
  | e1=exp '.' ID #FieldAccessExp
  | e1=exp '[' exp ']' #ArrayAccessExp
  | 'new' ID '(' ')' #NewExp
  | 'new' type '[' exp ']' #NewExp
  | 'new' type '[' ']' arrayInit #NewExp
  ;

arrayInit
  : '{' exp ( ',' exp )* '}';

invoke
  : ( id1=ID '.' )? id2=ID '(' args? ')'
  ;

args
  : exp ( ',' exp )*
  ;

ID
  : ( 'a'..'z' | 'A'..'Z' | '_' | '$' )
    ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '$' )*
  ;

INT
  : '0' | ('1'..'9') ('0'..'9')*
  ;

// Whitespace -- ignored
WS
  : [ \r\t\u000C\n]+ -> skip
  ;

// Any other character is an error character
ERROR
  : .
  ;