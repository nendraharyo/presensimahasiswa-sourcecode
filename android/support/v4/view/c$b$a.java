package android.support.v4.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

class c$b$a
  extends Handler
{
  c$b$a(c.b paramb) {}
  
  c$b$a(c.b paramb, Handler paramHandler)
  {
    super(localLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1;
    Object localObject2;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/RuntimeException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unknown message " + paramMessage;
      ((RuntimeException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = this.a.a;
      localObject2 = this.a.e;
      ((GestureDetector.OnGestureListener)localObject1).onShowPress((MotionEvent)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.a;
      ((c.b)localObject1).a();
      continue;
      localObject1 = this.a.b;
      if (localObject1 != null)
      {
        localObject1 = this.a;
        boolean bool1 = ((c.b)localObject1).c;
        if (!bool1)
        {
          localObject1 = this.a.b;
          localObject2 = this.a.e;
          ((GestureDetector.OnDoubleTapListener)localObject1).onSingleTapConfirmed((MotionEvent)localObject2);
        }
        else
        {
          localObject1 = this.a;
          boolean bool2 = true;
          ((c.b)localObject1).d = bool2;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\c$b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */