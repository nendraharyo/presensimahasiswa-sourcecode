package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

class c$c
  implements c.a
{
  private final GestureDetector a;
  
  c$c(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    GestureDetector localGestureDetector = new android/view/GestureDetector;
    localGestureDetector.<init>(paramContext, paramOnGestureListener, paramHandler);
    this.a = localGestureDetector;
  }
  
  public boolean a(MotionEvent paramMotionEvent)
  {
    return this.a.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\c$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */