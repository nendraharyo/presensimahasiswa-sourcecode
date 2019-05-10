package com.google.android.gms.analytics.internal;

class zzf$1
  implements Thread.UncaughtExceptionHandler
{
  zzf$1(zzf paramzzf) {}
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    zzaf localzzaf = this.zzQB.zzjy();
    if (localzzaf != null)
    {
      String str = "Job execution failed";
      localzzaf.zze(str, paramThrowable);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzf$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */