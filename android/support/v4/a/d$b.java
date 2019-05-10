package android.support.v4.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class d$b
  extends Handler
{
  d$b()
  {
    super(localLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject = (d.a)paramMessage.obj;
    int i = paramMessage.what;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      d locald = ((d.a)localObject).a;
      localObject = localObject.b[0];
      locald.e(localObject);
      continue;
      locald = ((d.a)localObject).a;
      localObject = ((d.a)localObject).b;
      locald.b((Object[])localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\d$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */