package android.support.v4.f;

import android.os.Handler;
import java.util.concurrent.Callable;

class c$2
  implements Runnable
{
  c$2(c paramc, Callable paramCallable, Handler paramHandler, c.a parama) {}
  
  public void run()
  {
    try
    {
      localObject1 = this.a;
      localObject1 = ((Callable)localObject1).call();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Handler localHandler;
        c.2.1 local1;
        Object localObject2 = null;
      }
    }
    localHandler = this.b;
    local1 = new android/support/v4/f/c$2$1;
    local1.<init>(this, localObject1);
    localHandler.post(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\f\c$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */