package android.support.v7.widget;

import android.view.View;

class RecyclerView$4
  implements ViewInfoStore.ProcessCallback
{
  RecyclerView$4(RecyclerView paramRecyclerView) {}
  
  public void processAppeared(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    this.this$0.animateAppearance(paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2);
  }
  
  public void processDisappeared(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    this.this$0.mRecycler.unscrapView(paramViewHolder);
    this.this$0.animateDisappearance(paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2);
  }
  
  public void processPersistent(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    paramViewHolder.setIsRecyclable(false);
    Object localObject = this.this$0;
    boolean bool = ((RecyclerView)localObject).mDataSetHasChangedAfterLayout;
    if (bool)
    {
      localObject = this.this$0.mItemAnimator;
      bool = ((RecyclerView.ItemAnimator)localObject).animateChange(paramViewHolder, paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2);
      if (bool)
      {
        localObject = this.this$0;
        ((RecyclerView)localObject).postAnimationRunner();
      }
    }
    for (;;)
    {
      return;
      localObject = this.this$0.mItemAnimator;
      bool = ((RecyclerView.ItemAnimator)localObject).animatePersistence(paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2);
      if (bool)
      {
        localObject = this.this$0;
        ((RecyclerView)localObject).postAnimationRunner();
      }
    }
  }
  
  public void unused(RecyclerView.ViewHolder paramViewHolder)
  {
    RecyclerView.LayoutManager localLayoutManager = this.this$0.mLayout;
    View localView = paramViewHolder.itemView;
    RecyclerView.Recycler localRecycler = this.this$0.mRecycler;
    localLayoutManager.removeAndRecycleView(localView, localRecycler);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */