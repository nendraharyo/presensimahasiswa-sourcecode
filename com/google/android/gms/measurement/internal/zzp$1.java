package com.google.android.gms.measurement.internal;

class zzp$1
  implements Runnable
{
  zzp$1(zzp paramzzp, String paramString) {}
  
  public void run()
  {
    Object localObject = this.zzaWM.zzaTV.zzCo();
    boolean bool = ((zzt)localObject).isInitialized();
    if (bool)
    {
      bool = ((zzt)localObject).zzDi();
      if (!bool) {}
    }
    else
    {
      localObject = this.zzaWM;
      int i = 6;
      String str1 = "Persisted config not initialized . Not logging error/warn.";
      ((zzp)localObject).zzl(i, str1);
    }
    for (;;)
    {
      return;
      localObject = ((zzt)localObject).zzaXi;
      String str2 = this.zzaWL;
      ((zzt.zzc)localObject).zzbq(str2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzp$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */