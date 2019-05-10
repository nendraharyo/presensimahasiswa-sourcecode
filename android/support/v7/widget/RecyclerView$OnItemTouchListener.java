package android.support.v7.widget;

import android.view.MotionEvent;

public abstract interface RecyclerView$OnItemTouchListener
{
  public abstract boolean onInterceptTouchEvent(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent);
  
  public abstract void onRequestDisallowInterceptTouchEvent(boolean paramBoolean);
  
  public abstract void onTouchEvent(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$OnItemTouchListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */