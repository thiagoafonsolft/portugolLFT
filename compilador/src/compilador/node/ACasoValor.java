/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ACasoValor extends PCasoValor
{
    private TCaso _caso_;
    private PValor _valor_;
    private TDoispontos _doispontos_;
    private PComandoOpLista _comandoOpLista_;

    public ACasoValor()
    {
        // Constructor
    }

    public ACasoValor(
        @SuppressWarnings("hiding") TCaso _caso_,
        @SuppressWarnings("hiding") PValor _valor_,
        @SuppressWarnings("hiding") TDoispontos _doispontos_,
        @SuppressWarnings("hiding") PComandoOpLista _comandoOpLista_)
    {
        // Constructor
        setCaso(_caso_);

        setValor(_valor_);

        setDoispontos(_doispontos_);

        setComandoOpLista(_comandoOpLista_);

    }

    @Override
    public Object clone()
    {
        return new ACasoValor(
            cloneNode(this._caso_),
            cloneNode(this._valor_),
            cloneNode(this._doispontos_),
            cloneNode(this._comandoOpLista_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACasoValor(this);
    }

    public TCaso getCaso()
    {
        return this._caso_;
    }

    public void setCaso(TCaso node)
    {
        if(this._caso_ != null)
        {
            this._caso_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caso_ = node;
    }

    public PValor getValor()
    {
        return this._valor_;
    }

    public void setValor(PValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
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
            + toString(this._caso_)
            + toString(this._valor_)
            + toString(this._doispontos_)
            + toString(this._comandoOpLista_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._caso_ == child)
        {
            this._caso_ = null;
            return;
        }

        if(this._valor_ == child)
        {
            this._valor_ = null;
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
        if(this._caso_ == oldChild)
        {
            setCaso((TCaso) newChild);
            return;
        }

        if(this._valor_ == oldChild)
        {
            setValor((PValor) newChild);
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