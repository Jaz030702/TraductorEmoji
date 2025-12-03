grammar EmojiTranslator;

// REGLA PRINCIPAL 
program
    : line* EOF
    ;

// UNA LÍNEA DEL DICCIONARIO 
line
    : mapping NEWLINE
    ;

//  REGLA DE MAPEOS 
mapping
    : STRING '->' emojiSeq
    ;

// SECUENCIA DE EMOJIS
emojiSeq
    : EMOJI+
    ;


// TOKENS


// Cadena como: "Ya llegué al trabajo"
STRING
    : '"' (~["\r\n] | '\\"')* '"'
    ;

// Emojis (cualquier carácter Unicode fuera de ASCII)
EMOJI
    : ~[\u0000-\u007F]
    ;

// Saltos de línea Windows (\r\n) o Unix (\n)
NEWLINE
    : '\r'? '\n'
    ;

// Ignorar espacios
WS
    : [ \t]+ -> skip
    ;
