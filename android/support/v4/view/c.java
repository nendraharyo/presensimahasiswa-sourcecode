package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

public final class c
{
  private final c.a a;
  
  public c(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener)
  {
    this(paramContext, paramOnGestureListener, null);
  }
  
  public c(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    Object localObject;
    if (i > j)
    {
      localObject = new android/support/v4/view/c$c;
      ((c.c)localObject).<init>(paramContext, paramOnGestureListener, paramHandler);
    }
    for (this.a = ((c.a)localObject);; this.a = ((c.a)localObject))
    {
      return;
      localObject = new android/support/v4/view/c$b;
      ((c.b)localObject).<init>(paramContext, paramOnGestureListener, paramHandler);
    }
  }
  
  public boolean a(MotionEvent paramMotionEvent)
  {
    return this.a.a(paramMotionEvent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */