package com.google.android.gms.measurement;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

class zzg$zzb
  implements ThreadFactory
{
  private static final AtomicInteger zzaUD;
  
  static
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>();
    zzaUD = localAtomicInteger;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("measurement-");
    int i = zzaUD.incrementAndGet();
    localObject = i;
    zzg.zzc localzzc = new com/google/android/gms/measurement/zzg$zzc;
    localzzc.<init>(paramRunnable, (String)localObject);
    return localzzc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\zzg$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */