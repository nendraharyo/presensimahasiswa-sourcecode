package android.support.v7.widget.helper;

import android.support.v4.view.r;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;

class ItemTouchHelper$1
  implements Runnable
{
  ItemTouchHelper$1(ItemTouchHelper paramItemTouchHelper) {}
  
  public void run()
  {
    Object localObject1 = this.this$0.mSelected;
    if (localObject1 != null)
    {
      localObject1 = this.this$0;
      boolean bool = ((ItemTouchHelper)localObject1).scrollIfNecessary();
      if (bool)
      {
        localObject1 = this.this$0.mSelected;
        if (localObject1 != null)
        {
          localObject1 = this.this$0;
          localObject2 = this.this$0.mSelected;
          ((ItemTouchHelper)localObject1).moveIfNecessary((RecyclerView.ViewHolder)localObject2);
        }
        localObject1 = this.this$0.mRecyclerView;
        Object localObject2 = this.this$0.mScrollRunnable;
        ((RecyclerView)localObject1).removeCallbacks((Runnable)localObject2);
        localObject1 = this.this$0.mRecyclerView;
        r.a((View)localObject1, this);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchHelper$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */