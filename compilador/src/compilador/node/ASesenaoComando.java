/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import java.util.*;
import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ASesenaoComando extends PComando
{
    private PExpLogica _expLogica_;
    private final LinkedList<PComando> _entao_ = new LinkedList<PComando>();
    private final LinkedList<PComando> _senao_ = new LinkedList<PComando>();

    public ASesenaoComando()
    {
        // Constructor
    }

    public ASesenaoComando(
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") List<?> _entao_,
        @SuppressWarnings("hiding") List<?> _senao_)
    {
        // Constructor
        setExpLogica(_expLogica_);

        setEntao(_entao_);

        setSenao(_senao_);

    }

    @Override
    public Object clone()
    {
        return new ASesenaoComando(
            cloneNode(this._expLogica_),
            cloneList(this._entao_),
            cloneList(this._senao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASesenaoComando(this);
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    public LinkedList<PComando> getEntao()
    {
        return this._entao_;
    }

    public void setEntao(List<?> list)
    {
        for(PComando e : this._entao_)
        {
            e.parent(null);
        }
        this._entao_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._entao_.add(e);
        }
    }

    public LinkedList<PComando> getSenao()
    {
        return this._senao_;
    }

    public void setSenao(List<?> list)
    {
        for(PComando e : this._senao_)
        {
            e.parent(null);
        }
        this._senao_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._senao_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogica_)
            + toString(this._entao_)
            + toString(this._senao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._entao_.remove(child))
        {
            return;
        }

        if(this._senao_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        for(ListIterator<PComando> i = this._entao_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._senao_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}