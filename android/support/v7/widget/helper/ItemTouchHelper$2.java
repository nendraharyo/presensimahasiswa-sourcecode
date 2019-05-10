package android.support.v7.widget.helper;

import android.support.v4.view.c;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.List;

class ItemTouchHelper$2
  implements RecyclerView.OnItemTouchListener
{
  ItemTouchHelper$2(ItemTouchHelper paramItemTouchHelper) {}
  
  public boolean onInterceptTouchEvent(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
  {
    int i = -1;
    float f1 = 0.0F / 0.0F;
    int j = 1;
    Object localObject1 = this.this$0.mGestureDetector;
    ((c)localObject1).a(paramMotionEvent);
    int k = paramMotionEvent.getActionMasked();
    float f2;
    Object localObject2;
    Object localObject3;
    int n;
    if (k == 0)
    {
      localObject1 = this.this$0;
      int m = paramMotionEvent.getPointerId(0);
      ((ItemTouchHelper)localObject1).mActivePointerId = m;
      localObject1 = this.this$0;
      f2 = paramMotionEvent.getX();
      ((ItemTouchHelper)localObject1).mInitialTouchX = f2;
      localObject1 = this.this$0;
      f2 = paramMotionEvent.getY();
      ((ItemTouchHelper)localObject1).mInitialTouchY = f2;
      this.this$0.obtainVelocityTracker();
      localObject1 = this.this$0.mSelected;
      if (localObject1 == null)
      {
        localObject1 = this.this$0.findAnimation(paramMotionEvent);
        if (localObject1 != null)
        {
          localObject2 = this.this$0;
          f1 = ((ItemTouchHelper)localObject2).mInitialTouchX;
          float f3 = ((ItemTouchHelper.RecoverAnimation)localObject1).mX;
          f1 -= f3;
          ((ItemTouchHelper)localObject2).mInitialTouchX = f1;
          localObject2 = this.this$0;
          f1 = ((ItemTouchHelper)localObject2).mInitialTouchY;
          f3 = ((ItemTouchHelper.RecoverAnimation)localObject1).mY;
          f1 -= f3;
          ((ItemTouchHelper)localObject2).mInitialTouchY = f1;
          localObject2 = this.this$0;
          localObject3 = ((ItemTouchHelper.RecoverAnimation)localObject1).mViewHolder;
          ((ItemTouchHelper)localObject2).endRecoverAnimation((RecyclerView.ViewHolder)localObject3, j);
          localObject2 = this.this$0.mPendingCleanup;
          localObject3 = ((ItemTouchHelper.RecoverAnimation)localObject1).mViewHolder.itemView;
          boolean bool = ((List)localObject2).remove(localObject3);
          if (bool)
          {
            localObject2 = this.this$0.mCallback;
            localObject3 = this.this$0.mRecyclerView;
            RecyclerView.ViewHolder localViewHolder = ((ItemTouchHelper.RecoverAnimation)localObject1).mViewHolder;
            ((ItemTouchHelper.Callback)localObject2).clearView((RecyclerView)localObject3, localViewHolder);
          }
          localObject2 = this.this$0;
          localObject3 = ((ItemTouchHelper.RecoverAnimation)localObject1).mViewHolder;
          k = ((ItemTouchHelper.RecoverAnimation)localObject1).mActionState;
          ((ItemTouchHelper)localObject2).select((RecyclerView.ViewHolder)localObject3, k);
          localObject1 = this.this$0;
          localObject2 = this.this$0;
          n = ((ItemTouchHelper)localObject2).mSelectedFlags;
          ((ItemTouchHelper)localObject1).updateDxDy(paramMotionEvent, n, 0);
        }
      }
      localObject1 = this.this$0.mVelocityTracker;
      if (localObject1 != null)
      {
        localObject1 = this.this$0.mVelocityTracker;
        ((VelocityTracker)localObject1).addMovement(paramMotionEvent);
      }
      localObject1 = this.this$0.mSelected;
      if (localObject1 == null) {
        break label513;
      }
    }
    for (;;)
    {
      return j;
      n = 3;
      f2 = 4.2E-45F;
      if ((k == n) || (k == j))
      {
        this.this$0.mActivePointerId = i;
        localObject1 = this.this$0;
        i1 = 0;
        f2 = 0.0F;
        localObject2 = null;
        ((ItemTouchHelper)localObject1).select(null, 0);
        break;
      }
      localObject2 = this.this$0;
      int i1 = ((ItemTouchHelper)localObject2).mActivePointerId;
      if (i1 == i) {
        break;
      }
      localObject2 = this.this$0;
      i1 = ((ItemTouchHelper)localObject2).mActivePointerId;
      i1 = paramMotionEvent.findPointerIndex(i1);
      if (i1 < 0) {
        break;
      }
      localObject3 = this.this$0;
      ((ItemTouchHelper)localObject3).checkSelectForSwipe(k, paramMotionEvent, i1);
      break;
      label513:
      j = 0;
    }
  }
  
  public void onRequestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    for (;;)
    {
      return;
      ItemTouchHelper localItemTouchHelper = this.this$0;
      localItemTouchHelper.select(null, 0);
    }
  }
  
  public void onTouchEvent(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
  {
    int i = 0;
    Object localObject1 = null;
    int j = -1;
    this.this$0.mGestureDetector.a(paramMotionEvent);
    Object localObject2 = this.this$0.mVelocityTracker;
    if (localObject2 != null)
    {
      localObject2 = this.this$0.mVelocityTracker;
      ((VelocityTracker)localObject2).addMovement(paramMotionEvent);
    }
    localObject2 = this.this$0;
    int k = ((ItemTouchHelper)localObject2).mActivePointerId;
    if (k == j) {}
    for (;;)
    {
      return;
      k = paramMotionEvent.getActionMasked();
      ItemTouchHelper localItemTouchHelper = this.this$0;
      int m = localItemTouchHelper.mActivePointerId;
      m = paramMotionEvent.findPointerIndex(m);
      if (m >= 0)
      {
        localObject3 = this.this$0;
        ((ItemTouchHelper)localObject3).checkSelectForSwipe(k, paramMotionEvent, m);
      }
      Object localObject3 = this.this$0.mSelected;
      if (localObject3 != null) {
        switch (k)
        {
        case 4: 
        case 5: 
        default: 
          break;
        case 1: 
        case 2: 
        case 3: 
          for (;;)
          {
            localObject2 = this.this$0;
            m = 0;
            localItemTouchHelper = null;
            ((ItemTouchHelper)localObject2).select(null, 0);
            localObject1 = this.this$0;
            ((ItemTouchHelper)localObject1).mActivePointerId = j;
            break;
            if (m < 0) {
              break;
            }
            localObject1 = this.this$0;
            k = this.this$0.mSelectedFlags;
            ((ItemTouchHelper)localObject1).updateDxDy(paramMotionEvent, k, m);
            this.this$0.moveIfNecessary((RecyclerView.ViewHolder)localObject3);
            localObject1 = this.this$0.mRecyclerView;
            localObject2 = this.this$0.mScrollRunnable;
            ((RecyclerView)localObject1).removeCallbacks((Runnable)localObject2);
            this.this$0.mScrollRunnable.run();
            localObject1 = this.this$0.mRecyclerView;
            ((RecyclerView)localObject1).invalidate();
            break;
            localObject2 = this.this$0.mVelocityTracker;
            if (localObject2 != null)
            {
              localObject2 = this.this$0.mVelocityTracker;
              ((VelocityTracker)localObject2).clear();
            }
          }
        case 6: 
          k = paramMotionEvent.getActionIndex();
          m = paramMotionEvent.getPointerId(k);
          localObject3 = this.this$0;
          int n = ((ItemTouchHelper)localObject3).mActivePointerId;
          if (m == n)
          {
            if (k == 0) {
              i = 1;
            }
            localItemTouchHelper = this.this$0;
            i = paramMotionEvent.getPointerId(i);
            localItemTouchHelper.mActivePointerId = i;
            localObject1 = this.this$0;
            localItemTouchHelper = this.this$0;
            m = localItemTouchHelper.mSelectedFlags;
            ((ItemTouchHelper)localObject1).updateDxDy(paramMotionEvent, m, k);
          }
          break;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchHelper$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */