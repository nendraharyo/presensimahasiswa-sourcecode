package android.support.v4.a;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

class d$2
  extends d.d
{
  d$2(d paramd) {}
  
  public Object call()
  {
    Object localObject1 = d.a(this.a);
    ((AtomicBoolean)localObject1).set(true);
    Object localObject4 = null;
    int i = 10;
    try
    {
      Process.setThreadPriority(i);
      localObject1 = this.a;
      localObject5 = this.b;
      localObject4 = ((d)localObject1).a((Object[])localObject5);
      Binder.flushPendingCommands();
      this.a.d(localObject4);
      return localObject4;
    }
    finally
    {
      try
      {
        Object localObject5 = this.a;
        localObject5 = d.b((d)localObject5);
        boolean bool = true;
        ((AtomicBoolean)localObject5).set(bool);
        throw ((Throwable)localObject2);
      }
      finally
      {
        this.a.d(localObject4);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\d$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */