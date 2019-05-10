package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Map;

public class zzdn
  implements zzdf
{
  private final zzdn.zza zzzH;
  
  public zzdn(zzdn.zza paramzza)
  {
    this.zzzH = paramzza;
  }
  
  public static void zza(zzjp paramzzjp, zzdn.zza paramzza)
  {
    zzjq localzzjq = paramzzjp.zzhU();
    zzdn localzzdn = new com/google/android/gms/internal/zzdn;
    localzzdn.<init>(paramzza);
    localzzjq.zza("/reward", localzzdn);
  }
  
  private void zze(Map paramMap)
  {
    Object localObject1 = "amount";
    try
    {
      localObject1 = paramMap.get(localObject1);
      localObject1 = (String)localObject1;
      int i = Integer.parseInt((String)localObject1);
      localObject1 = "type";
      localObject1 = paramMap.get(localObject1);
      localObject1 = (String)localObject1;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool) {
        break label85;
      }
      localObject3 = new com/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;
      ((RewardItemParcel)localObject3).<init>((String)localObject1, i);
      localObject1 = localObject3;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        Object localObject3 = "Unable to parse reward amount.";
        zzin.zzd((String)localObject3, localNumberFormatException);
        Object localObject2 = null;
      }
    }
    this.zzzH.zzb((RewardItemParcel)localObject1);
  }
  
  private void zzf(Map paramMap)
  {
    this.zzzH.zzbq();
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    String str1 = (String)paramMap.get("action");
    String str2 = "grant";
    boolean bool1 = str2.equals(str1);
    if (bool1) {
      zze(paramMap);
    }
    for (;;)
    {
      return;
      str2 = "video_start";
      boolean bool2 = str2.equals(str1);
      if (bool2) {
        zzf(paramMap);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */