/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ANInteiroValor extends PValor
{
    private TNInteiro _nInteiro_;

    public ANInteiroValor()
    {
        // Constructor
    }

    public ANInteiroValor(
        @SuppressWarnings("hiding") TNInteiro _nInteiro_)
    {
        // Constructor
        setNInteiro(_nInteiro_);

    }

    @Override
    public Object clone()
    {
        return new ANInteiroValor(
            cloneNode(this._nInteiro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANInteiroValor(this);
    }

    public TNInteiro getNInteiro()
    {
        return this._nInteiro_;
    }

    public void setNInteiro(TNInteiro node)
    {
        if(this._nInteiro_ != null)
        {
            this._nInteiro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nInteiro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nInteiro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nInteiro_ == child)
        {
            this._nInteiro_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nInteiro_ == oldChild)
        {
            setNInteiro((TNInteiro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
