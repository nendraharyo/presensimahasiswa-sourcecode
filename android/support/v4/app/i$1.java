package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

class i$1
  extends Handler
{
  i$1(i parami) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    switch (i)
    {
    default: 
      super.handleMessage(paramMessage);
    }
    for (;;)
    {
      return;
      Object localObject = this.a;
      boolean bool = ((i)localObject).mStopped;
      if (bool)
      {
        localObject = this.a;
        ((i)localObject).doReallyStop(false);
        continue;
        this.a.onResumeFragments();
        localObject = this.a.mFragments;
        ((k)localObject).n();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\i$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */