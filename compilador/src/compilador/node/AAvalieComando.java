/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AAvalieComando extends PComando
{
    private TAvalie _avalie_;
    private TAbreparentese _abreparentese_;
    private PExp _exp_;
    private TFechaparentese _fechaparentese_;
    private PCasoValorOp _casoValorOp_;
    private PSenaoDoispontosOp _senaoDoispontosOp_;
    private TFimavalie _fimavalie_;
    private TPontovirgula _pontovirgula_;

    public AAvalieComando()
    {
        // Constructor
    }

    public AAvalieComando(
        @SuppressWarnings("hiding") TAvalie _avalie_,
        @SuppressWarnings("hiding") TAbreparentese _abreparentese_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TFechaparentese _fechaparentese_,
        @SuppressWarnings("hiding") PCasoValorOp _casoValorOp_,
        @SuppressWarnings("hiding") PSenaoDoispontosOp _senaoDoispontosOp_,
        @SuppressWarnings("hiding") TFimavalie _fimavalie_,
        @SuppressWarnings("hiding") TPontovirgula _pontovirgula_)
    {
        // Constructor
        setAvalie(_avalie_);

        setAbreparentese(_abreparentese_);

        setExp(_exp_);

        setFechaparentese(_fechaparentese_);

        setCasoValorOp(_casoValorOp_);

        setSenaoDoispontosOp(_senaoDoispontosOp_);

        setFimavalie(_fimavalie_);

        setPontovirgula(_pontovirgula_);

    }

    @Override
    public Object clone()
    {
        return new AAvalieComando(
            cloneNode(this._avalie_),
            cloneNode(this._abreparentese_),
            cloneNode(this._exp_),
            cloneNode(this._fechaparentese_),
            cloneNode(this._casoValorOp_),
            cloneNode(this._senaoDoispontosOp_),
            cloneNode(this._fimavalie_),
            cloneNode(this._pontovirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAvalieComando(this);
    }

    public TAvalie getAvalie()
    {
        return this._avalie_;
    }

    public void setAvalie(TAvalie node)
    {
        if(this._avalie_ != null)
        {
            this._avalie_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._avalie_ = node;
    }

    public TAbreparentese getAbreparentese()
    {
        return this._abreparentese_;
    }

    public void setAbreparentese(TAbreparentese node)
    {
        if(this._abreparentese_ != null)
        {
            this._abreparentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreparentese_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TFechaparentese getFechaparentese()
    {
        return this._fechaparentese_;
    }

    public void setFechaparentese(TFechaparentese node)
    {
        if(this._fechaparentese_ != null)
        {
            this._fechaparentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaparentese_ = node;
    }

    public PCasoValorOp getCasoValorOp()
    {
        return this._casoValorOp_;
    }

    public void setCasoValorOp(PCasoValorOp node)
    {
        if(this._casoValorOp_ != null)
        {
            this._casoValorOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._casoValorOp_ = node;
    }

    public PSenaoDoispontosOp getSenaoDoispontosOp()
    {
        return this._senaoDoispontosOp_;
    }

    public void setSenaoDoispontosOp(PSenaoDoispontosOp node)
    {
        if(this._senaoDoispontosOp_ != null)
        {
            this._senaoDoispontosOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._senaoDoispontosOp_ = node;
    }

    public TFimavalie getFimavalie()
    {
        return this._fimavalie_;
    }

    public void setFimavalie(TFimavalie node)
    {
        if(this._fimavalie_ != null)
        {
            this._fimavalie_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimavalie_ = node;
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
            + toString(this._avalie_)
            + toString(this._abreparentese_)
            + toString(this._exp_)
            + toString(this._fechaparentese_)
            + toString(this._casoValorOp_)
            + toString(this._senaoDoispontosOp_)
            + toString(this._fimavalie_)
            + toString(this._pontovirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._avalie_ == child)
        {
            this._avalie_ = null;
            return;
        }

        if(this._abreparentese_ == child)
        {
            this._abreparentese_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._fechaparentese_ == child)
        {
            this._fechaparentese_ = null;
            return;
        }

        if(this._casoValorOp_ == child)
        {
            this._casoValorOp_ = null;
            return;
        }

        if(this._senaoDoispontosOp_ == child)
        {
            this._senaoDoispontosOp_ = null;
            return;
        }

        if(this._fimavalie_ == child)
        {
            this._fimavalie_ = null;
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
        if(this._avalie_ == oldChild)
        {
            setAvalie((TAvalie) newChild);
            return;
        }

        if(this._abreparentese_ == oldChild)
        {
            setAbreparentese((TAbreparentese) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._fechaparentese_ == oldChild)
        {
            setFechaparentese((TFechaparentese) newChild);
            return;
        }

        if(this._casoValorOp_ == oldChild)
        {
            setCasoValorOp((PCasoValorOp) newChild);
            return;
        }

        if(this._senaoDoispontosOp_ == oldChild)
        {
            setSenaoDoispontosOp((PSenaoDoispontosOp) newChild);
            return;
        }

        if(this._fimavalie_ == oldChild)
        {
            setFimavalie((TFimavalie) newChild);
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