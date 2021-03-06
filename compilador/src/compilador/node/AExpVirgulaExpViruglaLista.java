/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpVirgulaExpViruglaLista extends PExpViruglaLista
{
    private PExpVirgula _expVirgula_;

    public AExpVirgulaExpViruglaLista()
    {
        // Constructor
    }

    public AExpVirgulaExpViruglaLista(
        @SuppressWarnings("hiding") PExpVirgula _expVirgula_)
    {
        // Constructor
        setExpVirgula(_expVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AExpVirgulaExpViruglaLista(
            cloneNode(this._expVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpVirgulaExpViruglaLista(this);
    }

    public PExpVirgula getExpVirgula()
    {
        return this._expVirgula_;
    }

    public void setExpVirgula(PExpVirgula node)
    {
        if(this._expVirgula_ != null)
        {
            this._expVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expVirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expVirgula_ == child)
        {
            this._expVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expVirgula_ == oldChild)
        {
            setExpVirgula((PExpVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
