package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.a.a;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zzu;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class zzb
  extends a
  implements zzu
{
  private Semaphore zzXp;
  private Set zzXq;
  
  public zzb(Context paramContext, Set paramSet)
  {
    super(paramContext);
    Semaphore localSemaphore = new java/util/concurrent/Semaphore;
    localSemaphore.<init>(0);
    this.zzXp = localSemaphore;
    this.zzXq = paramSet;
  }
  
  protected void onStartLoading()
  {
    this.zzXp.drainPermits();
    forceLoad();
  }
  
  public Void zzmZ()
  {
    boolean bool = false;
    Object localObject1 = null;
    Object localObject2 = this.zzXq.iterator();
    int j = 0;
    String str = null;
    bool = ((Iterator)localObject2).hasNext();
    if (bool)
    {
      localObject1 = (GoogleApiClient)((Iterator)localObject2).next();
      bool = ((GoogleApiClient)localObject1).zza(this);
      if (!bool) {
        break label116;
      }
    }
    label116:
    for (int i = j + 1;; i = j)
    {
      j = i;
      break;
      try
      {
        localObject1 = this.zzXp;
        long l = 5;
        TimeUnit localTimeUnit = TimeUnit.SECONDS;
        ((Semaphore)localObject1).tryAcquire(j, l, localTimeUnit);
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          str = "GACSignInLoader";
          localObject2 = "Unexpected InterruptedException";
          Log.i(str, (String)localObject2, localInterruptedException);
          Thread localThread = Thread.currentThread();
          localThread.interrupt();
        }
      }
      return null;
    }
  }
  
  public void zzna()
  {
    this.zzXp.release();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */