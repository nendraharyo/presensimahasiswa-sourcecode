package android.support.v7.widget.helper;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.ViewHolder;

class ItemTouchHelper$4
  implements Runnable
{
  ItemTouchHelper$4(ItemTouchHelper paramItemTouchHelper, ItemTouchHelper.RecoverAnimation paramRecoverAnimation, int paramInt) {}
  
  public void run()
  {
    Object localObject = this.this$0.mRecyclerView;
    if (localObject != null)
    {
      localObject = this.this$0.mRecyclerView;
      boolean bool1 = ((RecyclerView)localObject).isAttachedToWindow();
      if (bool1)
      {
        localObject = this.val$anim;
        bool1 = ((ItemTouchHelper.RecoverAnimation)localObject).mOverridden;
        if (!bool1)
        {
          localObject = this.val$anim.mViewHolder;
          int i = ((RecyclerView.ViewHolder)localObject).getAdapterPosition();
          int j = -1;
          if (i != j)
          {
            localObject = this.this$0.mRecyclerView.getItemAnimator();
            if (localObject != null)
            {
              j = 0;
              localViewHolder = null;
              bool2 = ((RecyclerView.ItemAnimator)localObject).isRunning(null);
              if (bool2) {
                break label139;
              }
            }
            localObject = this.this$0;
            boolean bool2 = ((ItemTouchHelper)localObject).hasRunningRecoverAnim();
            if (bool2) {
              break label139;
            }
            localObject = this.this$0.mCallback;
            RecyclerView.ViewHolder localViewHolder = this.val$anim.mViewHolder;
            int k = this.val$swipeDir;
            ((ItemTouchHelper.Callback)localObject).onSwiped(localViewHolder, k);
          }
        }
      }
    }
    for (;;)
    {
      return;
      label139:
      localObject = this.this$0.mRecyclerView;
      ((RecyclerView)localObject).post(this);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchHelper$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */