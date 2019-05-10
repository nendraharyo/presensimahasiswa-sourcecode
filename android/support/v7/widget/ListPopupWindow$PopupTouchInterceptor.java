package android.support.v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

class ListPopupWindow$PopupTouchInterceptor
  implements View.OnTouchListener
{
  ListPopupWindow$PopupTouchInterceptor(ListPopupWindow paramListPopupWindow) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    int j = (int)f1;
    float f2 = paramMotionEvent.getY();
    int k = (int)f2;
    Object localObject;
    Handler localHandler;
    if (i == 0)
    {
      PopupWindow localPopupWindow = this.this$0.mPopup;
      if (localPopupWindow != null)
      {
        localPopupWindow = this.this$0.mPopup;
        boolean bool = localPopupWindow.isShowing();
        if ((bool) && (j >= 0))
        {
          localPopupWindow = this.this$0.mPopup;
          int m = localPopupWindow.getWidth();
          if ((j < m) && (k >= 0))
          {
            localObject = this.this$0.mPopup;
            j = ((PopupWindow)localObject).getHeight();
            if (k < j)
            {
              localHandler = this.this$0.mHandler;
              localObject = this.this$0.mResizePopupRunnable;
              long l = 250L;
              localHandler.postDelayed((Runnable)localObject, l);
            }
          }
        }
      }
    }
    for (;;)
    {
      return false;
      j = 1;
      f1 = Float.MIN_VALUE;
      if (i == j)
      {
        localHandler = this.this$0.mHandler;
        localObject = this.this$0.mResizePopupRunnable;
        localHandler.removeCallbacks((Runnable)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ListPopupWindow$PopupTouchInterceptor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */