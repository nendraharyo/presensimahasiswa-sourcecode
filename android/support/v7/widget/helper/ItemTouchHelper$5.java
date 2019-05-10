package android.support.v7.widget.helper;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback;
import android.view.View;

class ItemTouchHelper$5
  implements RecyclerView.ChildDrawingOrderCallback
{
  ItemTouchHelper$5(ItemTouchHelper paramItemTouchHelper) {}
  
  public int onGetChildDrawingOrder(int paramInt1, int paramInt2)
  {
    Object localObject1 = this.this$0.mOverdrawChild;
    if (localObject1 == null) {}
    for (;;)
    {
      return paramInt2;
      localObject1 = this.this$0;
      int i = ((ItemTouchHelper)localObject1).mOverdrawChildPosition;
      int j = -1;
      if (i == j)
      {
        localObject1 = this.this$0.mRecyclerView;
        Object localObject2 = this.this$0.mOverdrawChild;
        i = ((RecyclerView)localObject1).indexOfChild((View)localObject2);
        localObject2 = this.this$0;
        ((ItemTouchHelper)localObject2).mOverdrawChildPosition = i;
      }
      j = paramInt1 + -1;
      if (paramInt2 == j) {
        paramInt2 = i;
      } else if (paramInt2 >= i) {
        paramInt2 += 1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchHelper$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */