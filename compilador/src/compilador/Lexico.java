/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import compilador.lexer.*;
import compilador.node.*;
import compilador.node.EOF;
import java.io.IOException;
import java.io.PushbackReader;

/**
 *
 * @author Affonso
 */
public class Lexico extends Lexer {

    int contador = 0;
    TComentario comentario = null;
    String teste = "";
    int linha = 0;
    int igualCount = 0;

    public Lexico(PushbackReader in) {
        super(in);
    }

    public String Analisar() throws LexerException, LexerException, IOException {
        while (!(peek() instanceof EOF)) {
            if (state.equals(State.COMENTARIO)) {
                if (comentario == null) {
                    comentario = (TComentario) token;
                    contador++;
                    token = null;
                } else {
                    if (token instanceof TComentario) {
                        contador++;
                    } else if (token instanceof TComentarioFim) {
                        contador--;
                    }
                    if (contador != 0) {
                        token = null;
                    } else {
                        token = comentario;
                        state = State.NORMAL;
                        comentario = null;
                    }
                }
            } else {
                if (peek().getLine() > linha) {
                    linha = peek().getLine();
                    if (!teste.isEmpty())
                        teste = teste + "\n";
                }
                teste = teste + " " + next().getClass().getSimpleName();
            }
        }
        System.out.println(teste);
        return teste;
    }

    @Override
    public void filter() throws LexerException, LexerException, IOException {
        if (state.equals(State.COMENTARIO)) {
            if (comentario == null) {
                comentario = (TComentario) token;
                contador++;
                token = null;
            } else {
                if (token instanceof TComentario) {
                    contador++;
                } else if (token instanceof TComentarioFim) {
                    contador--;
                }
                if (contador != 0) {
                    token = null;
                } else {
                    token = comentario;
                    state = State.NORMAL;
                    comentario = null;
                }
            }
        }        
    }
}
