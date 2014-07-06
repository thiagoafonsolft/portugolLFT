/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ASenaoDoispontos extends PSenaoDoispontos
{
    private TSenao _senao_;
    private TDoispontos _doispontos_;
    private PComandoOpLista _comandoOpLista_;

    public ASenaoDoispontos()
    {
        // Constructor
    }

    public ASenaoDoispontos(
        @SuppressWarnings("hiding") TSenao _senao_,
        @SuppressWarnings("hiding") TDoispontos _doispontos_,
        @SuppressWarnings("hiding") PComandoOpLista _comandoOpLista_)
    {
        // Constructor
        setSenao(_senao_);

        setDoispontos(_doispontos_);

        setComandoOpLista(_comandoOpLista_);

    }

    @Override
    public Object clone()
    {
        return new ASenaoDoispontos(
            cloneNode(this._senao_),
            cloneNode(this._doispontos_),
            cloneNode(this._comandoOpLista_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASenaoDoispontos(this);
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

    public TDoispontos getDoispontos()
    {
        return this._doispontos_;
    }

    public void setDoispontos(TDoispontos node)
    {
        if(this._doispontos_ != null)
        {
            this._doispontos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doispontos_ = node;
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
            + toString(this._doispontos_)
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

        if(this._doispontos_ == child)
        {
            this._doispontos_ = null;
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

        if(this._doispontos_ == oldChild)
        {
            setDoispontos((TDoispontos) newChild);
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
