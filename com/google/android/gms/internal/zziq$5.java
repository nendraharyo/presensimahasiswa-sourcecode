package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zziq$5
  implements ThreadFactory
{
  private final AtomicInteger zzMa;
  
  zziq$5(String paramString)
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>(1);
    this.zzMa = localAtomicInteger;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new java/lang/Thread;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("AdWorker(");
    String str = this.zzMb;
    localObject = ((StringBuilder)localObject).append(str).append(") #");
    int i = this.zzMa.getAndIncrement();
    localObject = i;
    localThread.<init>(paramRunnable, (String)localObject);
    return localThread;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziq$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */