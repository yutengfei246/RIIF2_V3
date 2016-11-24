/*
    ANTlr.4 for RIIF-2  language  First Try wih the starting point from RIIF-1
*/


//TODO: First Task: Extended Tevmplate Feature (ETF)
//TODO: 1) TABLE 2) [#] operator
grammar RIIF2;

/*Programmar File RIIF-2 */
program
    : declaration+ EOF
    ;

/*Declarations in RIIF-2 */
declaration
    : componentDecl
    | environmentDecl
    | requirementDecl
    | templateDecl      //RIIF-2: template
    ;

/*RIIF-2: Template Declaration */
/*RIIF-2: Template indentification could extends an template that existed */
templateDecl
    : TEMPLATE Ident ( EXTENDS Ident)? ';'
      templateBodyElement* END_TEMPLATE
    ;
/*RIIF-2: Template body statment */
templateBodyElement
    : abstractDecl
    | imposeAssignment
    ;

/*RIIF-2: Abstract declaration */
abstractDecl
    : abstractConstanceDecl
    | abstractParameterDecl
    | abstractAttributeDecl
    | abstractPlatformDecl
    | abstractFailModeDecl
    | failModeDecl
    ;
abstractFailModeDecl
    : ABSTRACT FAIL_MODE Ident ';'
    ;
abstractConstanceDecl
    : ABSTRACT CONSTANT
      Ident ':' primitiveType
      (':=' expression)? ';' //  abstract constant mConstant : integer := {1,2,3,4,....}
    | ABSTRACT CONSTANT
      Ident ':=' listConstructor
       // abstract constant mConstant := {whatever , ... , ...}
    ;
abstractParameterDecl
    : ABSTRACT PARAMETER
      Ident ':' complexType
      (':=' expression)? ';'
    | ABSTRACT PARAMETER
      Ident ':=' listConstructor

    ;
abstractAttributeDecl
    : ABSTRACT (AttrIdent|AssocAttrIdent) ';'
    ;
abstractPlatformDecl
    : ABSTRACT PLATFORM Ident ';'
    ;

/*RIIF-2*: Impose assignment */
imposeAssignment
    : IMPOSE
      ( Ident
      | AttrIdent
      | HierIdent
      | AssocInstanceIdent
      | AssocAttrIdent
      | AssocHierIdent
      )
      vector? '=' (expression|listConstructor
      ) ';'
    ;

/*RIIF-2: Component Declaration */
/*RIIF-2: Components may become an implementation of some templates */
componentDecl
    : COMPONENT Ident
      (EXTENDS Ident (',' Ident)*)?
      (IMPLEMENTS Ident (',' Ident)*)?  ';'
      componentBodyElement*
      END_COMPONENT
    ;
componentBodyElement
    : parameterDecl
    | constanceDecl
    | childComponentDecl
    | failModeDecl
    | assignment
    | setTemplate
    | assertion
    ;

/*RIIF-2: Set*/
setTemplate
    : SET
      ( Ident
      | AttrIdent
      | HierIdent
      | AssocInstanceIdent
      | AssocAttrIdent
      | AssocHierIdent
      )
      '=' (expression|listConstructor
      ) ';'
    ;

/*RIIF-1: Environment declaration*/
environmentDecl
    : ENVIRONMENT Ident ';'
      environmentBodyElements*
      END_ENVIRONMENT
    ;
environmentBodyElements
    : assignment
    | envParameterDecl
    ;

/*RIIF-1: Requirement Declaration*/
requirementDecl
    : REQUIREMENT Ident ';'
      assertion*
      END_REQUIREMENT
    ;

/*RIIF-2: Parameter Declaration*/
parameterDecl
    : PARAMETER Ident ':' complexType (':=' expression )? ';'
    | PARAMETER AssocDecl
    | PARAMETER Ident ':=' listConstructor

    ;

/*RIIF-2: Environment Declaration*/
envParameterDecl
    : (INPUT|OUTPUT) PARAMETER (Ident|AssocDecl) ':' complexType (':=' expression)? ';'
    ;

/*RIIF-2: Constant Declaration*/
constanceDecl
    : CONSTANT Ident ':' primitiveType (':=' expression)? ';'
    | CONSTANT AssocDecl
    | CONSTANT Ident ':=' listConstructor

    ;

/*RIIF-2: Child Component*/
childComponentDecl
    : CHILD_COMPONENT Ident (Ident|AssocDecl) vector? ';'
    ;

/*RIIF-2: FailModeDecl */
failModeDecl
    : FAIL_MODE (Ident|AssocDecl) ';'
    ;

/*RIIF-2: Assignment*/
assignment
    : ASSIGN
      ( Ident
      | HierIdent
      | AttrIdent
      | AssocInstanceIdent
      | AssocAttrIdent
      | AssocHierIdent
      | attrIdent
      )
      vector? '=' (expression|listConstructor) ';'
    ;

/*RIIF-1: Assertions*/
assertion
    : ASSERT (AttrIdent) ('<' | '>') expression ';'
    ;

/*
    This grammar file introduces expression and types for RIIF-2 ( same with JAVA )
*/


/*RIIF-2: ANTlr.4 expression (Same with JAVA)*/
expression
    : primary
    | ('+'|'-') expression
    | ('~'|'!') expression
    | expression ( '*' | '/' | '%' ) expression
    | expression ( '-' | '+' ) expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression ('<=' | '>=' | '>' | '<') expression
    | expression ('==' | '!=') expression
    | expression '&' expression
    | expression '^' expression
    | expression '|' expression
    | expression '&&' expression
    | expression '||' expression
    | expression '?' expression ':' expression
    | <assoc=right> expression
      (   '='
      |   '+='
      |   '-='
      |   '*='
      |   '/='
      |   '&='
      |   '|='
      |   '^='
      |   '>>='
      |   '>>>='
      |   '<<='
      |   '%='
      )
      expression
    ;

primary
    : '(' expression ')'
    | SELF
    | Ident  // user defined variable
    | HierIdent
    | AttrIdent
    | AssocInstanceIdent
    | AssocAttrIdent
    | AssocHierIdent
    | attrIdent
    | literal
    | funcCall
    | arrayConstructor
    ;

/*RIIF-2: List Type*/
listConstructor
    : '{' constructorType (',' constructorType)* '}'
    ;
/*RIIF-2: Array Type*/
arrayConstructor
    : '[' constructorType (',' constructorType)* ']'
    ;
/*RIIF-2: constructor type*/
constructorType
    : listConstructor
    | expression
    ;

tableColumns
    : '[' '#' ']'
      '[' Ident ']'
    ;

attrIdent
    : (Ident|HierIdent) '\''(Ident (tableColumns)? )
    ;

funcCall
    : funcName '(' funcArg ( ',' funcArg ) ? ')'
    ;
funcName
    : FUNC_LOG
    | FUNC_EXP
    | FUNC_AGG_SINGLE
    | FUNC_GT_N_FAIL
    ;
funcArg
    : (Ident|HierIdent|AttrIdent) vector
    | expression
    ;


/*Literal*/
literal
    : StringLiteral
    | DecimalLiteral
    | FloatingPointLiteral
    ;

/*Variable Type*/
complexType
    : primitiveType
    | enumType
    | Ident //user defined type
    ;

/*Vector Declaration*/
vector
    : '[' expression ':' expression ']'
    ;

/*Types*/
primitiveType
    : TYPE_FLOAT
    | TYPE_INTEGER
    | TYPE_STRING
    | TYPE_TABLE
    ;

/*Enum declaration*/
enumType
    : TYPE_ENUM '{' Ident ( ',' Ident)* '}'
    ;

/*Lexer*/
/**
 * First part of this file is including the keywords of RIIF-1
 * Second part of this file is including the keywords of RIIF-2
 *
 **/



// First part
COMPONENT: 'component';
END_COMPONENT: 'endcomponent';

ENVIRONMENT: 'environment';
END_ENVIRONMENT: 'endenvironment';

REQUIREMENT: 'requirement';
END_REQUIREMENT: 'endrequirement';

CHILD_COMPONENT: 'child_component';
FAIL_MODE: 'fail_mode';

EXTENDS: 'extends';
ASSIGN: 'assign';
ASSERT: 'assert';
INPUT: 'input';
OUTPUT: 'output';

PARAMETER: 'parameter';
CONSTANT: 'constant';

TYPE_FLOAT: 'float';
TYPE_INTEGER: 'integer';
TYPE_STRING: 'string';
TYPE_ENUM: 'enum';

FUNC_AGG_SINGLE: 'agg_single_fail';
FUNC_GT_N_FAIL: 'agg_gt_n_fail';

FUNC_LOG: 'LOG';
FUNC_EXP: 'EXP';

//Second part
TEMPLATE: 'template';
END_TEMPLATE: 'endtemplate';
IMPOSE: 'impose';
ABSTRACT: 'abstract';
IMPLEMENTS: 'implements';
SELF: 'self';
SET: 'set';
TYPE_TABLE: 'table';
PLATFORM: 'platform';


/*Literal Tokens */
StringLiteral
    : '"' ( ~('\\' | '"') )* '"'
    ;
FloatingPointLiteral
    : DIGIT+ '.' DIGIT* Exponent? FloatTypeSuffix?
    | '.' DIGIT+ Exponent? FloatTypeSuffix?
    | DIGIT+ Exponent FloatTypeSuffix?
    ;
DecimalLiteral
    : DIGIT+
    ;

/*Identification */
Ident
    : (LETTER) (LETTER|DIGIT|UNDERSCORE)*
    ;

HierIdent
    : Ident ('.' Ident )+
    ;

AttrIdent
    : (Ident|HierIdent) '\''(Ident)
    ;

/*Associative Identification*/
AssocDecl
    : Ident '[' ']'
    ;
AssocInstanceIdent
    : Ident '[' Ident ']'
    ;
AssocHierIdent
    : Ident '.' AssocInstanceIdent
    ;
AssocAttrIdent
    : (AssocInstanceIdent|AssocHierIdent) '\'' Ident
    ;



WS: (' ' | '\r' | '\t' |' \u000C' | '\n' ) ->channel(HIDDEN) ;

COMMENT
    : '/*' .*? '*/'  ->channel(HIDDEN)
    ;
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' -> channel(HIDDEN)
    ;

fragment
DIGIT: '0'..'9';
fragment
LETTER: ( 'a'..'z' | 'A'..'Z' );
fragment
UNDERSCORE: '_';
fragment
EscapeSequence
    : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    | UnicodeEscape
    | OctalEscape
    ;
fragment
OctalEscape
    : '\\' ('0'..'3')('0'..'7')('0'..'7')
    | '\\' ('0'..'7')('0'..'7')
    | '\\' ('0'..'7')
    ;
fragment
HexDigit
    : ('0'..'9' | 'a'..'f' | 'A'..'F')
    ;
fragment
UnicodeEscape
    : '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
fragment
Exponent
    : ('e'|'E')('+'|'-')?DIGIT+
    ;
fragment
FloatTypeSuffix
    : ('f'|'F'|'d'|'D')
    ;
