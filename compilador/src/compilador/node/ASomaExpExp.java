/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ASomaExpExp extends PExp
{
    private PSomaExp _somaExp_;

    public ASomaExpExp()
    {
        // Constructor
    }

    public ASomaExpExp(
        @SuppressWarnings("hiding") PSomaExp _somaExp_)
    {
        // Constructor
        setSomaExp(_somaExp_);

    }

    @Override
    public Object clone()
    {
        return new ASomaExpExp(
            cloneNode(this._somaExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASomaExpExp(this);
    }

    public PSomaExp getSomaExp()
    {
        return this._somaExp_;
    }

    public void setSomaExp(PSomaExp node)
    {
        if(this._somaExp_ != null)
        {
            this._somaExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._somaExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._somaExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._somaExp_ == child)
        {
            this._somaExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._somaExp_ == oldChild)
        {
            setSomaExp((PSomaExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
