/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compilador;

import compilador.analysis.DepthFirstAdapter;
import compilador.node.Node;
import compilador.node.Token;

class Organizador extends DepthFirstAdapter
{
  private int indentacao;

  private void indentar()
  {
    Sintatico.texto = Sintatico.texto + "\n";
    System.out.println();
    for(int i = 0; i < indentacao; i++)
      {
        Sintatico.texto = Sintatico.texto + "       ";
	System.out.print("       ");
      }
  }

  @Override
  public void defaultIn(Node node)
  {
    indentar();
    Sintatico.texto = Sintatico.texto + "<" + node.getClass().getSimpleName().replaceFirst("A", "") + ">";
    System.out.print("<" + node.getClass().getSimpleName() + ">");
    indentacao++;
  }

  @Override
  public void defaultCase(Node node)
  {
    Token token = (Token) node;
    indentar();
    Sintatico.texto = Sintatico.texto + token.getClass().getSimpleName().replaceFirst("T", "") + ": " + token.getText();
    System.out.print(token.getText());
  }

  @Override
  public void defaultOut(Node node)
  {
    indentacao--;
    indentar();
    Sintatico.texto = Sintatico.texto + "</" + node.getClass().getSimpleName().replaceFirst("A", "") + ">";
    System.out.print("</" + node.getClass().getSimpleName() + ">");
  }
}
