package android.support.v7.widget;

import android.view.View;

class RecyclerView$ItemAnimatorRestoreListener
  implements RecyclerView.ItemAnimator.ItemAnimatorListener
{
  RecyclerView$ItemAnimatorRestoreListener(RecyclerView paramRecyclerView) {}
  
  public void onAnimationFinished(RecyclerView.ViewHolder paramViewHolder)
  {
    View localView = null;
    boolean bool = true;
    paramViewHolder.setIsRecyclable(bool);
    Object localObject = paramViewHolder.mShadowedHolder;
    if (localObject != null)
    {
      localObject = paramViewHolder.mShadowingHolder;
      if (localObject == null) {
        paramViewHolder.mShadowedHolder = null;
      }
    }
    paramViewHolder.mShadowingHolder = null;
    bool = RecyclerView.ViewHolder.access$1500(paramViewHolder);
    if (!bool)
    {
      localObject = this.this$0;
      localView = paramViewHolder.itemView;
      bool = ((RecyclerView)localObject).removeAnimatingView(localView);
      if (!bool)
      {
        bool = paramViewHolder.isTmpDetached();
        if (bool)
        {
          localObject = this.this$0;
          localView = paramViewHolder.itemView;
          ((RecyclerView)localObject).removeDetachedView(localView, false);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$ItemAnimatorRestoreListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */