/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import java.util.*;
import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AProgram extends PProgram
{
    private TId _id_;
    private final LinkedList<PDecl> _decl_ = new LinkedList<PDecl>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public AProgram()
    {
        // Constructor
    }

    public AProgram(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") List<?> _decl_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setId(_id_);

        setDecl(_decl_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AProgram(
            cloneNode(this._id_),
            cloneList(this._decl_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgram(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public LinkedList<PDecl> getDecl()
    {
        return this._decl_;
    }

    public void setDecl(List<?> list)
    {
        for(PDecl e : this._decl_)
        {
            e.parent(null);
        }
        this._decl_.clear();

        for(Object obj_e : list)
        {
            PDecl e = (PDecl) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decl_.add(e);
        }
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._decl_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._decl_.remove(child))
        {
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        for(ListIterator<PDecl> i = this._decl_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecl) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
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
