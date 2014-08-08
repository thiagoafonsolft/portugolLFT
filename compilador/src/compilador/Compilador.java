package compilador;

import compilador.lexer.*;
import compilador.lexer.Lexer.State;
import compilador.node.*;
import compilador.parser.ParserException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Compilador {

    public static void main(String[] args) throws FileNotFoundException, LexerException, IOException {
        FileReader file = new FileReader(args[0]);
        PushbackReader pushbackReader = new PushbackReader(new BufferedReader(file),1024);
        Lexico lex = new Lexico(pushbackReader);
        Sintatico sint = new Sintatico(lex);
        try {
            System.out.println(sint.AnalisarAST());
        } catch (LexerException ex) {            
            Logger.getLogger(formPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(formPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserException ex) {            
            Logger.getLogger(formPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //formPrincipal form = new formPrincipal();
        //form.setTitle("Analisador");
        //form.setLocationRelativeTo(null);
        //form.setVisible(true);
    }

}
