package android.support.v7.widget;

import android.view.View;

public class RecyclerView$ItemAnimator$ItemHolderInfo
{
  public int bottom;
  public int changeFlags;
  public int left;
  public int right;
  public int top;
  
  public ItemHolderInfo setFrom(RecyclerView.ViewHolder paramViewHolder)
  {
    return setFrom(paramViewHolder, 0);
  }
  
  public ItemHolderInfo setFrom(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    View localView = paramViewHolder.itemView;
    int i = localView.getLeft();
    this.left = i;
    i = localView.getTop();
    this.top = i;
    i = localView.getRight();
    this.right = i;
    int j = localView.getBottom();
    this.bottom = j;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$ItemAnimator$ItemHolderInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */