package android.support.v7.widget;

import android.view.View;

public abstract class SimpleItemAnimator
  extends RecyclerView.ItemAnimator
{
  private static final boolean DEBUG = false;
  private static final String TAG = "SimpleItemAnimator";
  boolean mSupportsChangeAnimations = true;
  
  public abstract boolean animateAdd(RecyclerView.ViewHolder paramViewHolder);
  
  public boolean animateAppearance(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    int k;
    int m;
    int n;
    int i1;
    if (paramItemHolderInfo1 != null)
    {
      int i = paramItemHolderInfo1.left;
      int j = paramItemHolderInfo2.left;
      if (i == j)
      {
        i = paramItemHolderInfo1.top;
        j = paramItemHolderInfo2.top;
        if (i == j) {}
      }
      else
      {
        k = paramItemHolderInfo1.left;
        m = paramItemHolderInfo1.top;
        n = paramItemHolderInfo2.left;
        i1 = paramItemHolderInfo2.top;
      }
    }
    for (boolean bool = animateMove(paramViewHolder, k, m, n, i1);; bool = animateAdd(paramViewHolder)) {
      return bool;
    }
  }
  
  public abstract boolean animateChange(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean animateChange(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    int i = paramItemHolderInfo1.left;
    int j = paramItemHolderInfo1.top;
    boolean bool = paramViewHolder2.shouldIgnore();
    int k;
    if (bool) {
      k = paramItemHolderInfo1.left;
    }
    for (int m = paramItemHolderInfo1.top;; m = paramItemHolderInfo2.top)
    {
      return animateChange(paramViewHolder1, paramViewHolder2, i, j, k, m);
      k = paramItemHolderInfo2.left;
    }
  }
  
  public boolean animateDisappearance(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    int i = paramItemHolderInfo1.left;
    int j = paramItemHolderInfo1.top;
    Object localObject = paramViewHolder.itemView;
    int k;
    int m;
    if (paramItemHolderInfo2 == null)
    {
      k = ((View)localObject).getLeft();
      if (paramItemHolderInfo2 != null) {
        break label128;
      }
      m = ((View)localObject).getTop();
      label40:
      boolean bool1 = paramViewHolder.isRemoved();
      if ((bool1) || ((i == k) && (j == m))) {
        break label137;
      }
      int n = ((View)localObject).getWidth() + k;
      int i1 = ((View)localObject).getHeight() + m;
      ((View)localObject).layout(k, m, n, i1);
      localObject = this;
    }
    label128:
    label137:
    for (boolean bool2 = animateMove(paramViewHolder, i, j, k, m);; bool2 = animateRemove(paramViewHolder))
    {
      return bool2;
      k = paramItemHolderInfo2.left;
      break;
      m = paramItemHolderInfo2.top;
      break label40;
    }
  }
  
  public abstract boolean animateMove(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean animatePersistence(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    int i = paramItemHolderInfo1.left;
    int j = paramItemHolderInfo2.left;
    int k;
    int m;
    int n;
    int i1;
    if (i == j)
    {
      i = paramItemHolderInfo1.top;
      j = paramItemHolderInfo2.top;
      if (i == j) {}
    }
    else
    {
      k = paramItemHolderInfo1.left;
      m = paramItemHolderInfo1.top;
      n = paramItemHolderInfo2.left;
      i1 = paramItemHolderInfo2.top;
    }
    for (boolean bool = animateMove(paramViewHolder, k, m, n, i1);; bool = false)
    {
      return bool;
      dispatchMoveFinished(paramViewHolder);
    }
  }
  
  public abstract boolean animateRemove(RecyclerView.ViewHolder paramViewHolder);
  
  public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder paramViewHolder)
  {
    boolean bool = this.mSupportsChangeAnimations;
    if (bool)
    {
      bool = paramViewHolder.isInvalid();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void dispatchAddFinished(RecyclerView.ViewHolder paramViewHolder)
  {
    onAddFinished(paramViewHolder);
    dispatchAnimationFinished(paramViewHolder);
  }
  
  public final void dispatchAddStarting(RecyclerView.ViewHolder paramViewHolder)
  {
    onAddStarting(paramViewHolder);
  }
  
  public final void dispatchChangeFinished(RecyclerView.ViewHolder paramViewHolder, boolean paramBoolean)
  {
    onChangeFinished(paramViewHolder, paramBoolean);
    dispatchAnimationFinished(paramViewHolder);
  }
  
  public final void dispatchChangeStarting(RecyclerView.ViewHolder paramViewHolder, boolean paramBoolean)
  {
    onChangeStarting(paramViewHolder, paramBoolean);
  }
  
  public final void dispatchMoveFinished(RecyclerView.ViewHolder paramViewHolder)
  {
    onMoveFinished(paramViewHolder);
    dispatchAnimationFinished(paramViewHolder);
  }
  
  public final void dispatchMoveStarting(RecyclerView.ViewHolder paramViewHolder)
  {
    onMoveStarting(paramViewHolder);
  }
  
  public final void dispatchRemoveFinished(RecyclerView.ViewHolder paramViewHolder)
  {
    onRemoveFinished(paramViewHolder);
    dispatchAnimationFinished(paramViewHolder);
  }
  
  public final void dispatchRemoveStarting(RecyclerView.ViewHolder paramViewHolder)
  {
    onRemoveStarting(paramViewHolder);
  }
  
  public boolean getSupportsChangeAnimations()
  {
    return this.mSupportsChangeAnimations;
  }
  
  public void onAddFinished(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void onAddStarting(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void onChangeFinished(RecyclerView.ViewHolder paramViewHolder, boolean paramBoolean) {}
  
  public void onChangeStarting(RecyclerView.ViewHolder paramViewHolder, boolean paramBoolean) {}
  
  public void onMoveFinished(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void onMoveStarting(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void onRemoveFinished(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void onRemoveStarting(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void setSupportsChangeAnimations(boolean paramBoolean)
  {
    this.mSupportsChangeAnimations = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SimpleItemAnimator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */