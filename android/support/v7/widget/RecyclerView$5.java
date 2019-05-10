package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

class RecyclerView$5
  implements ChildHelper.Callback
{
  RecyclerView$5(RecyclerView paramRecyclerView) {}
  
  public void addView(View paramView, int paramInt)
  {
    this.this$0.addView(paramView, paramInt);
    this.this$0.dispatchChildAttached(paramView);
  }
  
  public void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    Object localObject1 = RecyclerView.getChildViewHolderInt(paramView);
    if (localObject1 != null)
    {
      boolean bool = ((RecyclerView.ViewHolder)localObject1).isTmpDetached();
      if (!bool)
      {
        bool = ((RecyclerView.ViewHolder)localObject1).shouldIgnore();
        if (!bool)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject1 = ((StringBuilder)localObject2).append("Called attach on a child which is not detached: ").append(localObject1);
          localObject2 = this.this$0.exceptionLabel();
          localObject1 = (String)localObject2;
          localIllegalArgumentException.<init>((String)localObject1);
          throw localIllegalArgumentException;
        }
      }
      ((RecyclerView.ViewHolder)localObject1).clearTmpDetachFlag();
    }
    RecyclerView.access$000(this.this$0, paramView, paramInt, paramLayoutParams);
  }
  
  public void detachViewFromParent(int paramInt)
  {
    Object localObject1 = getChildAt(paramInt);
    if (localObject1 != null)
    {
      localObject1 = RecyclerView.getChildViewHolderInt((View)localObject1);
      if (localObject1 != null)
      {
        boolean bool = ((RecyclerView.ViewHolder)localObject1).isTmpDetached();
        if (bool)
        {
          bool = ((RecyclerView.ViewHolder)localObject1).shouldIgnore();
          if (!bool)
          {
            IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
            Object localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject1 = ((StringBuilder)localObject2).append("called detach on an already detached child ").append(localObject1);
            localObject2 = this.this$0.exceptionLabel();
            localObject1 = (String)localObject2;
            localIllegalArgumentException.<init>((String)localObject1);
            throw localIllegalArgumentException;
          }
        }
        int i = 256;
        ((RecyclerView.ViewHolder)localObject1).addFlags(i);
      }
    }
    RecyclerView.access$100(this.this$0, paramInt);
  }
  
  public View getChildAt(int paramInt)
  {
    return this.this$0.getChildAt(paramInt);
  }
  
  public int getChildCount()
  {
    return this.this$0.getChildCount();
  }
  
  public RecyclerView.ViewHolder getChildViewHolder(View paramView)
  {
    return RecyclerView.getChildViewHolderInt(paramView);
  }
  
  public int indexOfChild(View paramView)
  {
    return this.this$0.indexOfChild(paramView);
  }
  
  public void onEnteredHiddenState(View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    if (localViewHolder != null)
    {
      RecyclerView localRecyclerView = this.this$0;
      RecyclerView.ViewHolder.access$200(localViewHolder, localRecyclerView);
    }
  }
  
  public void onLeftHiddenState(View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    if (localViewHolder != null)
    {
      RecyclerView localRecyclerView = this.this$0;
      RecyclerView.ViewHolder.access$300(localViewHolder, localRecyclerView);
    }
  }
  
  public void removeAllViews()
  {
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = getChildAt(j);
      RecyclerView localRecyclerView = this.this$0;
      localRecyclerView.dispatchChildDetached(localView);
      localView.clearAnimation();
      j += 1;
    }
    this.this$0.removeAllViews();
  }
  
  public void removeViewAt(int paramInt)
  {
    View localView = this.this$0.getChildAt(paramInt);
    if (localView != null)
    {
      RecyclerView localRecyclerView = this.this$0;
      localRecyclerView.dispatchChildDetached(localView);
      localView.clearAnimation();
    }
    this.this$0.removeViewAt(paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */