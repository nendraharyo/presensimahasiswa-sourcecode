package com.google.android.gms.analytics.internal;

import java.util.Map;

class zzak$zza
  extends zzc
  implements zzq.zza
{
  private final zzal zzTn;
  
  public zzak$zza(zzf paramzzf)
  {
    super(paramzzf);
    zzal localzzal = new com/google/android/gms/analytics/internal/zzal;
    localzzal.<init>();
    this.zzTn = localzzal;
  }
  
  public void zzc(String paramString, int paramInt)
  {
    Object localObject = "ga_sessionTimeout";
    boolean bool = ((String)localObject).equals(paramString);
    if (bool)
    {
      localObject = this.zzTn;
      ((zzal)localObject).zzTp = paramInt;
    }
    for (;;)
    {
      return;
      localObject = "int configuration name not recognized";
      zzd((String)localObject, paramString);
    }
  }
  
  public void zzf(String paramString, boolean paramBoolean)
  {
    int i = 1;
    Object localObject = "ga_autoActivityTracking";
    boolean bool = ((String)localObject).equals(paramString);
    if (bool)
    {
      localObject = this.zzTn;
      if (paramBoolean) {
        ((zzal)localObject).zzTq = i;
      }
    }
    for (;;)
    {
      return;
      i = 0;
      String str = null;
      break;
      localObject = "ga_anonymizeIp";
      bool = ((String)localObject).equals(paramString);
      if (bool)
      {
        localObject = this.zzTn;
        if (paramBoolean) {}
        for (;;)
        {
          ((zzal)localObject).zzTr = i;
          break;
          i = 0;
          str = null;
        }
      }
      localObject = "ga_reportUncaughtExceptions";
      bool = ((String)localObject).equals(paramString);
      if (bool)
      {
        localObject = this.zzTn;
        if (paramBoolean) {}
        for (;;)
        {
          ((zzal)localObject).zzTs = i;
          break;
          i = 0;
          str = null;
        }
      }
      str = "bool configuration name not recognized";
      zzd(str, paramString);
    }
  }
  
  public void zzj(String paramString1, String paramString2)
  {
    this.zzTn.zzTt.put(paramString1, paramString2);
  }
  
  public void zzk(String paramString1, String paramString2)
  {
    Object localObject = "ga_trackingId";
    boolean bool = ((String)localObject).equals(paramString1);
    if (bool)
    {
      localObject = this.zzTn;
      ((zzal)localObject).zzOV = paramString2;
    }
    for (;;)
    {
      return;
      localObject = "ga_sampleFrequency";
      bool = ((String)localObject).equals(paramString1);
      if (bool)
      {
        try
        {
          localObject = this.zzTn;
          double d = Double.parseDouble(paramString2);
          ((zzal)localObject).zzTo = d;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          String str2 = "Error parsing ga_sampleFrequency value";
          zzc(str2, paramString2, localNumberFormatException);
        }
      }
      else
      {
        String str1 = "string configuration name not recognized";
        zzd(str1, paramString1);
      }
    }
  }
  
  public zzal zzlS()
  {
    return this.zzTn;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzak$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */