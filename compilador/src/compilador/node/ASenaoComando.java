/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ASenaoComando extends PSenaoComando
{
    private TSenao _senao_;
    private PComandoOpLista _comandoOpLista_;

    public ASenaoComando()
    {
        // Constructor
    }

    public ASenaoComando(
        @SuppressWarnings("hiding") TSenao _senao_,
        @SuppressWarnings("hiding") PComandoOpLista _comandoOpLista_)
    {
        // Constructor
        setSenao(_senao_);

        setComandoOpLista(_comandoOpLista_);

    }

    @Override
    public Object clone()
    {
        return new ASenaoComando(
            cloneNode(this._senao_),
            cloneNode(this._comandoOpLista_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASenaoComando(this);
    }

    public TSenao getSenao()
    {
        return this._senao_;
    }

    public void setSenao(TSenao node)
    {
        if(this._senao_ != null)
        {
            this._senao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._senao_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._senao_)
            + toString(this._comandoOpLista_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._senao_ == child)
        {
            this._senao_ = null;
            return;
        }

        if(this._comandoOpLista_ == child)
        {
            this._comandoOpLista_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._senao_ == oldChild)
        {
            setSenao((TSenao) newChild);
            return;
        }

        if(this._comandoOpLista_ == oldChild)
        {
            setComandoOpLista((PComandoOpLista) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
