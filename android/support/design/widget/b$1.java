package android.support.design.widget;

import android.os.Handler.Callback;
import android.os.Message;

final class b$1
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    int i = 1;
    int j = paramMessage.what;
    b localb;
    switch (j)
    {
    default: 
      j = 0;
      localb = null;
    }
    for (;;)
    {
      return j;
      localb = (b)paramMessage.obj;
      localb.b();
      j = i;
      continue;
      localb = (b)paramMessage.obj;
      int k = paramMessage.arg1;
      localb.b(k);
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\b$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */