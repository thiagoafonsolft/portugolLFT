/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AParaFim extends PParaFim
{
    private TAte _ate_;
    private TNInteiro _nInteiro_;
    private TFaca _faca_;
    private PComandoOpLista _comandoOpLista_;
    private TFimpara _fimpara_;
    private TPontovirgula _pontovirgula_;

    public AParaFim()
    {
        // Constructor
    }

    public AParaFim(
        @SuppressWarnings("hiding") TAte _ate_,
        @SuppressWarnings("hiding") TNInteiro _nInteiro_,
        @SuppressWarnings("hiding") TFaca _faca_,
        @SuppressWarnings("hiding") PComandoOpLista _comandoOpLista_,
        @SuppressWarnings("hiding") TFimpara _fimpara_,
        @SuppressWarnings("hiding") TPontovirgula _pontovirgula_)
    {
        // Constructor
        setAte(_ate_);

        setNInteiro(_nInteiro_);

        setFaca(_faca_);

        setComandoOpLista(_comandoOpLista_);

        setFimpara(_fimpara_);

        setPontovirgula(_pontovirgula_);

    }

    @Override
    public Object clone()
    {
        return new AParaFim(
            cloneNode(this._ate_),
            cloneNode(this._nInteiro_),
            cloneNode(this._faca_),
            cloneNode(this._comandoOpLista_),
            cloneNode(this._fimpara_),
            cloneNode(this._pontovirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaFim(this);
    }

    public TAte getAte()
    {
        return this._ate_;
    }

    public void setAte(TAte node)
    {
        if(this._ate_ != null)
        {
            this._ate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ate_ = node;
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

    public TFaca getFaca()
    {
        return this._faca_;
    }

    public void setFaca(TFaca node)
    {
        if(this._faca_ != null)
        {
            this._faca_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._faca_ = node;
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

    public TFimpara getFimpara()
    {
        return this._fimpara_;
    }

    public void setFimpara(TFimpara node)
    {
        if(this._fimpara_ != null)
        {
            this._fimpara_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimpara_ = node;
    }

    public TPontovirgula getPontovirgula()
    {
        return this._pontovirgula_;
    }

    public void setPontovirgula(TPontovirgula node)
    {
        if(this._pontovirgula_ != null)
        {
            this._pontovirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontovirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ate_)
            + toString(this._nInteiro_)
            + toString(this._faca_)
            + toString(this._comandoOpLista_)
            + toString(this._fimpara_)
            + toString(this._pontovirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ate_ == child)
        {
            this._ate_ = null;
            return;
        }

        if(this._nInteiro_ == child)
        {
            this._nInteiro_ = null;
            return;
        }

        if(this._faca_ == child)
        {
            this._faca_ = null;
            return;
        }

        if(this._comandoOpLista_ == child)
        {
            this._comandoOpLista_ = null;
            return;
        }

        if(this._fimpara_ == child)
        {
            this._fimpara_ = null;
            return;
        }

        if(this._pontovirgula_ == child)
        {
            this._pontovirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ate_ == oldChild)
        {
            setAte((TAte) newChild);
            return;
        }

        if(this._nInteiro_ == oldChild)
        {
            setNInteiro((TNInteiro) newChild);
            return;
        }

        if(this._faca_ == oldChild)
        {
            setFaca((TFaca) newChild);
            return;
        }

        if(this._comandoOpLista_ == oldChild)
        {
            setComandoOpLista((PComandoOpLista) newChild);
            return;
        }

        if(this._fimpara_ == oldChild)
        {
            setFimpara((TFimpara) newChild);
            return;
        }

        if(this._pontovirgula_ == oldChild)
        {
            setPontovirgula((TPontovirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
