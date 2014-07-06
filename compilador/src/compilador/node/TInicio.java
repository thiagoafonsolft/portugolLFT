/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TInicio extends Token
{
    public TInicio()
    {
        super.setText("inicio");
    }

    public TInicio(int line, int pos)
    {
        super.setText("inicio");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInicio(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInicio(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInicio text.");
    }
}
