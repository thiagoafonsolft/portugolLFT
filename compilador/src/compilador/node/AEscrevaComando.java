/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AEscrevaComando extends PComando
{
    private TEscreva _escreva_;
    private TAbreparentese _abreparentese_;
    private PExpVirgulaOp _expVirgulaOp_;
    private PExp _exp_;
    private TFechaparentese _fechaparentese_;
    private TPontovirgula _pontovirgula_;

    public AEscrevaComando()
    {
        // Constructor
    }

    public AEscrevaComando(
        @SuppressWarnings("hiding") TEscreva _escreva_,
        @SuppressWarnings("hiding") TAbreparentese _abreparentese_,
        @SuppressWarnings("hiding") PExpVirgulaOp _expVirgulaOp_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TFechaparentese _fechaparentese_,
        @SuppressWarnings("hiding") TPontovirgula _pontovirgula_)
    {
        // Constructor
        setEscreva(_escreva_);

        setAbreparentese(_abreparentese_);

        setExpVirgulaOp(_expVirgulaOp_);

        setExp(_exp_);

        setFechaparentese(_fechaparentese_);

        setPontovirgula(_pontovirgula_);

    }

    @Override
    public Object clone()
    {
        return new AEscrevaComando(
            cloneNode(this._escreva_),
            cloneNode(this._abreparentese_),
            cloneNode(this._expVirgulaOp_),
            cloneNode(this._exp_),
            cloneNode(this._fechaparentese_),
            cloneNode(this._pontovirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEscrevaComando(this);
    }

    public TEscreva getEscreva()
    {
        return this._escreva_;
    }

    public void setEscreva(TEscreva node)
    {
        if(this._escreva_ != null)
        {
            this._escreva_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._escreva_ = node;
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

    public PExpVirgulaOp getExpVirgulaOp()
    {
        return this._expVirgulaOp_;
    }

    public void setExpVirgulaOp(PExpVirgulaOp node)
    {
        if(this._expVirgulaOp_ != null)
        {
            this._expVirgulaOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expVirgulaOp_ = node;
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
            + toString(this._escreva_)
            + toString(this._abreparentese_)
            + toString(this._expVirgulaOp_)
            + toString(this._exp_)
            + toString(this._fechaparentese_)
            + toString(this._pontovirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._escreva_ == child)
        {
            this._escreva_ = null;
            return;
        }

        if(this._abreparentese_ == child)
        {
            this._abreparentese_ = null;
            return;
        }

        if(this._expVirgulaOp_ == child)
        {
            this._expVirgulaOp_ = null;
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
        if(this._escreva_ == oldChild)
        {
            setEscreva((TEscreva) newChild);
            return;
        }

        if(this._abreparentese_ == oldChild)
        {
            setAbreparentese((TAbreparentese) newChild);
            return;
        }

        if(this._expVirgulaOp_ == oldChild)
        {
            setExpVirgulaOp((PExpVirgulaOp) newChild);
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

        if(this._pontovirgula_ == oldChild)
        {
            setPontovirgula((TPontovirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}