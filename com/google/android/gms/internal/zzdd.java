package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

public final class zzdd
  implements zzdf
{
  private void zzb(zzjp paramzzjp, Map paramMap)
  {
    String str1 = (String)paramMap.get("label");
    String str2 = (String)paramMap.get("start_label");
    String str3 = (String)paramMap.get("timestamp");
    boolean bool1 = TextUtils.isEmpty(str1);
    if (bool1)
    {
      str1 = "No label given for CSI tick.";
      zzin.zzaK(str1);
    }
    for (;;)
    {
      return;
      bool1 = TextUtils.isEmpty(str3);
      if (bool1)
      {
        str1 = "No timestamp given for CSI tick.";
        zzin.zzaK(str1);
      }
      else
      {
        try
        {
          long l = Long.parseLong(str3);
          l = zzc(l);
          boolean bool2 = TextUtils.isEmpty(str2);
          if (bool2) {
            str2 = "native:view_load";
          }
          zzca localzzca = paramzzjp.zzic();
          localzzca.zza(str1, str2, l);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          str2 = "Malformed timestamp for CSI tick.";
          zzin.zzd(str2, localNumberFormatException);
        }
      }
    }
  }
  
  private long zzc(long paramLong)
  {
    long l1 = zzr.zzbG().currentTimeMillis();
    long l2 = zzr.zzbG().elapsedRealtime();
    return paramLong - l1 + l2;
  }
  
  private void zzc(zzjp paramzzjp, Map paramMap)
  {
    String str1 = (String)paramMap.get("value");
    boolean bool = TextUtils.isEmpty(str1);
    if (bool)
    {
      str1 = "No value given for CSI experiment.";
      zzin.zzaK(str1);
    }
    for (;;)
    {
      return;
      zzcb localzzcb = paramzzjp.zzic().zzdA();
      if (localzzcb == null)
      {
        str1 = "No ticker for WebView, dropping experiment ID.";
        zzin.zzaK(str1);
      }
      else
      {
        String str2 = "e";
        localzzcb.zzc(str2, str1);
      }
    }
  }
  
  private void zzd(zzjp paramzzjp, Map paramMap)
  {
    String str1 = (String)paramMap.get("name");
    String str2 = (String)paramMap.get("value");
    boolean bool = TextUtils.isEmpty(str2);
    if (bool)
    {
      str1 = "No value given for CSI extra.";
      zzin.zzaK(str1);
    }
    for (;;)
    {
      return;
      bool = TextUtils.isEmpty(str1);
      if (bool)
      {
        str1 = "No name given for CSI extra.";
        zzin.zzaK(str1);
      }
      else
      {
        zzcb localzzcb = paramzzjp.zzic().zzdA();
        if (localzzcb == null)
        {
          str1 = "No ticker for WebView, dropping extra parameter.";
          zzin.zzaK(str1);
        }
        else
        {
          localzzcb.zzc(str1, str2);
        }
      }
    }
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    String str1 = (String)paramMap.get("action");
    String str2 = "tick";
    boolean bool1 = str2.equals(str1);
    if (bool1) {
      zzb(paramzzjp, paramMap);
    }
    for (;;)
    {
      return;
      str2 = "experiment";
      bool1 = str2.equals(str1);
      if (bool1)
      {
        zzc(paramzzjp, paramMap);
      }
      else
      {
        str2 = "extra";
        boolean bool2 = str2.equals(str1);
        if (bool2) {
          zzd(paramzzjp, paramMap);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */