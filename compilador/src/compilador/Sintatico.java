/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import compilador.lexer.*;
import compilador.node.*;
import compilador.node.EOF;
import compilador.parser.Parser;
import compilador.parser.ParserException;
import java.io.IOException;
import java.io.PushbackReader;

public class Sintatico extends Parser {

    public Sintatico(Lexico lexer) {
        super(lexer);
    }

    public String Analisar() throws LexerException, LexerException, IOException, ParserException {
        Start tree = parse();
        System.out.println("Arvore Formada!!\n" + tree.toString());        
        return "Arvore Formada!!\n" + tree.toString();
    }
}
