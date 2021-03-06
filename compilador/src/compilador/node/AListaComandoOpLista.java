/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AListaComandoOpLista extends PComandoOpLista
{
    private PComandoOpLista _comandoOpLista_;
    private PComando _comando_;

    public AListaComandoOpLista()
    {
        // Constructor
    }

    public AListaComandoOpLista(
        @SuppressWarnings("hiding") PComandoOpLista _comandoOpLista_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setComandoOpLista(_comandoOpLista_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AListaComandoOpLista(
            cloneNode(this._comandoOpLista_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaComandoOpLista(this);
    }

    public PComandoOpLista getComandoOpLista()
    {
        return this._comandoOpLista_;
    }

    public void setComandoOpLista(PComandoOpLista node)
    {
        if(this._comandoOpLista_ != null)
        {
            this._comandoOpLista_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoOpLista_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comandoOpLista_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comandoOpLista_ == child)
        {
            this._comandoOpLista_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comandoOpLista_ == oldChild)
        {
            setComandoOpLista((PComandoOpLista) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
