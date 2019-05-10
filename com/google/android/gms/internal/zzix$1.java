package com.google.android.gms.internal;

class zzix$1
  implements Runnable
{
  zzix$1(zzix paramzzix) {}
  
  public void run()
  {
    Object localObject1 = zzix.zza(this.zzMI);
    Object localObject2 = "Suspending the looper thread";
    try
    {
      zzin.v((String)localObject2);
      for (;;)
      {
        localObject2 = this.zzMI;
        int i = zzix.zzb((zzix)localObject2);
        if (i != 0) {
          break;
        }
        try
        {
          localObject2 = this.zzMI;
          localObject2 = zzix.zza((zzix)localObject2);
          localObject2.wait();
          localObject2 = "Looper thread resumed";
          zzin.v((String)localObject2);
        }
        catch (InterruptedException localInterruptedException)
        {
          String str = "Looper thread interrupted.";
          zzin.v(str);
        }
      }
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzix$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */