package android.support.v7.widget.helper;

import android.animation.Animator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import java.util.List;

class ItemTouchHelper$3
  extends ItemTouchHelper.RecoverAnimation
{
  ItemTouchHelper$3(ItemTouchHelper paramItemTouchHelper, RecyclerView.ViewHolder paramViewHolder1, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt3, RecyclerView.ViewHolder paramViewHolder2)
  {
    super(paramViewHolder1, paramInt1, paramInt2, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    super.onAnimationEnd(paramAnimator);
    boolean bool = this.mOverridden;
    if (bool) {
      return;
    }
    int i = this.val$swipeDir;
    Object localObject1;
    Object localObject2;
    if (i <= 0)
    {
      localObject1 = this.this$0.mCallback;
      localObject2 = this.this$0.mRecyclerView;
      RecyclerView.ViewHolder localViewHolder = this.val$prevSelected;
      ((ItemTouchHelper.Callback)localObject1).clearView((RecyclerView)localObject2, localViewHolder);
    }
    for (;;)
    {
      localObject1 = this.this$0.mOverdrawChild;
      localObject2 = this.val$prevSelected.itemView;
      if (localObject1 != localObject2) {
        break;
      }
      localObject1 = this.this$0;
      localObject2 = this.val$prevSelected.itemView;
      ((ItemTouchHelper)localObject1).removeChildDrawingOrderCallbackIfNecessary((View)localObject2);
      break;
      localObject1 = this.this$0.mPendingCleanup;
      localObject2 = this.val$prevSelected.itemView;
      ((List)localObject1).add(localObject2);
      this.mIsPendingCleanup = true;
      i = this.val$swipeDir;
      if (i > 0)
      {
        localObject1 = this.this$0;
        int j = this.val$swipeDir;
        ((ItemTouchHelper)localObject1).postDispatchSwipe(this, j);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchHelper$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */