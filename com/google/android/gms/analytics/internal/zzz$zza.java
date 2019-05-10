package com.google.android.gms.analytics.internal;

class zzz$zza
  implements zzq.zza
{
  private final zzf zzQj;
  private final zzaa zzSD;
  
  public zzz$zza(zzf paramzzf)
  {
    this.zzQj = paramzzf;
    zzaa localzzaa = new com/google/android/gms/analytics/internal/zzaa;
    localzzaa.<init>();
    this.zzSD = localzzaa;
  }
  
  public void zzc(String paramString, int paramInt)
  {
    Object localObject = "ga_dispatchPeriod";
    boolean bool = ((String)localObject).equals(paramString);
    if (bool)
    {
      localObject = this.zzSD;
      ((zzaa)localObject).zzSH = paramInt;
    }
    for (;;)
    {
      return;
      localObject = this.zzQj.zzjm();
      String str = "Int xml configuration name not recognized";
      ((zzaf)localObject).zzd(str, paramString);
    }
  }
  
  public void zzf(String paramString, boolean paramBoolean)
  {
    Object localObject1 = "ga_dryRun";
    int i = ((String)localObject1).equals(paramString);
    Object localObject2;
    if (i != 0)
    {
      localObject2 = this.zzSD;
      if (paramBoolean)
      {
        i = 1;
        ((zzaa)localObject2).zzSI = i;
      }
    }
    for (;;)
    {
      return;
      i = 0;
      localObject1 = null;
      break;
      localObject1 = this.zzQj.zzjm();
      localObject2 = "Bool xml configuration name not recognized";
      ((zzaf)localObject1).zzd((String)localObject2, paramString);
    }
  }
  
  public void zzj(String paramString1, String paramString2) {}
  
  public void zzk(String paramString1, String paramString2)
  {
    Object localObject = "ga_appName";
    boolean bool = ((String)localObject).equals(paramString1);
    if (bool)
    {
      localObject = this.zzSD;
      ((zzaa)localObject).zzSE = paramString2;
    }
    for (;;)
    {
      return;
      localObject = "ga_appVersion";
      bool = ((String)localObject).equals(paramString1);
      if (bool)
      {
        localObject = this.zzSD;
        ((zzaa)localObject).zzSF = paramString2;
      }
      else
      {
        localObject = "ga_logLevel";
        bool = ((String)localObject).equals(paramString1);
        if (bool)
        {
          localObject = this.zzSD;
          ((zzaa)localObject).zzSG = paramString2;
        }
        else
        {
          localObject = this.zzQj.zzjm();
          String str = "String xml configuration name not recognized";
          ((zzaf)localObject).zzd(str, paramString1);
        }
      }
    }
  }
  
  public zzaa zzle()
  {
    return this.zzSD;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzz$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */