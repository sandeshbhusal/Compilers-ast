grammar ExtendedStaticJava;

program: compilationUnit EOF;

compilationUnit
  : scd1+=simpleClassDefintion* classDefinition scd2+=simpleClassDefintion*
  ;

classDefinition
  : 'public' 'class' ID '{'
    mainMethodDeclaration
    memberDeclaration*
    '}'
  ;

simpleClassDefintion
  : 'class' ID '{' declarations+=publicFieldDeclaration* '}';

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
  : booleanType
  | intType
  | simpleType
  | arrayType
  ;

booleanType: 'boolean';
intType: 'int';
simpleType: ID;

arrayType
  : (booleanType | intType | ID) '[' size=exp? ']'
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
  : ID #SimpleLHS
  | qualifier=exp '.' name=ID #FieldAccessLHS
  | arrayname=exp '[' arrayexp=exp ']' #ArrayAccessLHS
  ;

forStatement
  : 'for' '(' (inits+=assign (',' inits+=assign)*)? ';' cond=exp? ';' (updates+=incDec (',' updates+=incDec)*)? ')' '{' statements+=statement* '}';

incDec
  : operand=lhs operator='++'
  | operand=lhs operator='--'
  ;

doWhileStatement
  : 'do' '{' contents+=statement* '}'* 'while' '(' exp ')' ';';

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
  | booleanLiteral                              #LiteralExp
  | 'null'                                      #NullLiteral
  | '(' exp ')'                                 #ParenExp
  | invoke                                      #InvokeExp
  | ID                                          #IdExp
  | op=( '-' | '+' | '!' | '~' ) exp            #UnaryExp
  | e1=exp
    op=( '*' | '/' | '%' )
    e2=exp                                      #BinaryExp
  | e1=exp
    op=( '+' | '-' )
    e2=exp                                      #BinaryExp
  | e1=exp
    op=( '<' | '>' | '<=' | '>=' )
    e2=exp                                      #BinaryExp
  | e1=exp
    op=( '==' | '!=' )
    e2=exp                                      #BinaryExp
  | e1=exp op='&&' e2=exp                       #BinaryExp
  | e1=exp op='||' e2=exp                       #BinaryExp
  | e1=exp op='<<' e2=exp                       #ShiftLeftExp
  | e1=exp op='>>' e2=exp                       #ShiftRightExp
  | e1=exp op='>>>' e2=exp                      #UnsignedShiftRightExp
  | condition=exp '?' p1=exp ':' p2=exp         #CondExp

  | e1=exp '.' id=ID                            #FieldAccessExp
  | id=exp '[' inner=exp ']'                    #ArrayAccessExp

  | 'new' name=ID '(' ')'                       #NewExp
  | 'new' typename=arrayType                    #ArrayCreationExp
  | 'new' typename=arrayType initexpr=arrayInit #ArrayCreationExp
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