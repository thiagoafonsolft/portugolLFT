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

    public static String texto;
    
    public Sintatico(Lexico lexer) {
        super(lexer);
    }

    public String AnalisarCST() throws LexerException, LexerException, IOException, ParserException {
        Start tree = parse();
        System.out.println("Arvore Concreta Formada!!");        
        return "Arvore Concreta Formada!!";
    }   
    
        public String AnalisarAST() throws LexerException, LexerException, IOException, ParserException {
        texto = "";
        Start tree = parse();                           
        System.out.println("Arvore Formada!!");                
        tree.getPProgram().apply(new Organizador());
        return "Arvore Formada!! \n" + texto;
    }
}
