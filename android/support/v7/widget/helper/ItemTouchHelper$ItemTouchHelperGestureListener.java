package android.support.v7.widget.helper;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

class ItemTouchHelper$ItemTouchHelperGestureListener
  extends GestureDetector.SimpleOnGestureListener
{
  private boolean mShouldReactToLongPress = true;
  
  ItemTouchHelper$ItemTouchHelperGestureListener(ItemTouchHelper paramItemTouchHelper) {}
  
  void doNotReactToLongPress()
  {
    this.mShouldReactToLongPress = false;
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.mShouldReactToLongPress;
    if (!bool1) {}
    for (;;)
    {
      return;
      Object localObject1 = this.this$0.findChildView(paramMotionEvent);
      if (localObject1 != null)
      {
        Object localObject2 = this.this$0.mRecyclerView;
        localObject1 = ((RecyclerView)localObject2).getChildViewHolder((View)localObject1);
        if (localObject1 != null)
        {
          localObject2 = this.this$0.mCallback;
          Object localObject3 = this.this$0.mRecyclerView;
          boolean bool2 = ((ItemTouchHelper.Callback)localObject2).hasDragFlag((RecyclerView)localObject3, (RecyclerView.ViewHolder)localObject1);
          if (bool2)
          {
            float f1 = 0.0F;
            localObject2 = null;
            int i = paramMotionEvent.getPointerId(0);
            localObject3 = this.this$0;
            int j = ((ItemTouchHelper)localObject3).mActivePointerId;
            if (i == j)
            {
              i = this.this$0.mActivePointerId;
              i = paramMotionEvent.findPointerIndex(i);
              float f2 = paramMotionEvent.getX(i);
              f1 = paramMotionEvent.getY(i);
              this.this$0.mInitialTouchX = f2;
              this.this$0.mInitialTouchY = f1;
              localObject2 = this.this$0;
              localObject3 = this.this$0;
              ((ItemTouchHelper)localObject3).mDy = 0.0F;
              ((ItemTouchHelper)localObject2).mDx = 0.0F;
              localObject2 = this.this$0.mCallback;
              boolean bool3 = ((ItemTouchHelper.Callback)localObject2).isLongPressDragEnabled();
              if (bool3)
              {
                localObject2 = this.this$0;
                j = 2;
                f2 = 2.8E-45F;
                ((ItemTouchHelper)localObject2).select((RecyclerView.ViewHolder)localObject1, j);
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchHelper$ItemTouchHelperGestureListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */