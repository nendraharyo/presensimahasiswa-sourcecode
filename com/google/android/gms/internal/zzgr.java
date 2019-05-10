package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzp;

public class zzgr
{
  public zzit zza(Context paramContext, zza paramzza, zzif.zza paramzza1, zzan paramzzan, zzjp paramzzjp, zzex paramzzex, zzgr.zza paramzza2, zzcb paramzzcb)
  {
    Object localObject1 = paramzza1.zzLe;
    boolean bool1 = ((AdResponseParcel)localObject1).zzHT;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool1)
    {
      localObject1 = new com/google/android/gms/internal/zzgu;
      localObject2 = paramContext;
      localObject3 = paramzza1;
      localObject4 = paramzzex;
      ((zzgu)localObject1).<init>(paramContext, paramzza1, paramzzex, paramzza2, paramzzcb, paramzzjp);
    }
    for (;;)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("AdRenderer: ");
      localObject3 = localObject1.getClass().getName();
      zzin.zzaI((String)localObject3);
      ((zzit)localObject1).zzgd();
      return (zzit)localObject1;
      bool1 = ((AdResponseParcel)localObject1).zzuk;
      boolean bool2;
      if (bool1)
      {
        bool2 = paramzza instanceof zzp;
        if (bool2)
        {
          localObject1 = new com/google/android/gms/internal/zzgv;
          localObject3 = paramzza;
          localObject3 = (zzp)paramzza;
          localObject4 = new com/google/android/gms/internal/zzee;
          ((zzee)localObject4).<init>();
          localObject2 = paramContext;
          ((zzgv)localObject1).<init>(paramContext, (zzp)localObject3, (zzee)localObject4, paramzza1, paramzzan, paramzza2);
        }
        else
        {
          localObject2 = new java/lang/IllegalArgumentException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject3 = ((StringBuilder)localObject1).append("Invalid NativeAdManager type. Found: ");
          if (paramzza != null) {}
          for (localObject1 = paramzza.getClass().getName();; localObject1 = "null")
          {
            localObject1 = (String)localObject1 + "; Required: NativeAdManager.";
            ((IllegalArgumentException)localObject2).<init>((String)localObject1);
            throw ((Throwable)localObject2);
          }
        }
      }
      else
      {
        bool2 = ((AdResponseParcel)localObject1).zzHZ;
        if (bool2)
        {
          localObject1 = new com/google/android/gms/internal/zzgp;
          ((zzgp)localObject1).<init>(paramContext, paramzza1, paramzzjp, paramzza2);
        }
        else
        {
          localObject1 = (Boolean)zzbt.zzwu.get();
          bool2 = ((Boolean)localObject1).booleanValue();
          if (bool2)
          {
            bool2 = zzne.zzsk();
            if (bool2)
            {
              bool2 = zzne.isAtLeastL();
              if (!bool2)
              {
                localObject1 = paramzzjp.zzaN();
                bool2 = ((AdSizeParcel)localObject1).zzui;
                if (bool2)
                {
                  localObject1 = new com/google/android/gms/internal/zzgt;
                  ((zzgt)localObject1).<init>(paramContext, paramzza1, paramzzjp, paramzza2);
                  continue;
                }
              }
            }
          }
          localObject1 = new com/google/android/gms/internal/zzgs;
          ((zzgs)localObject1).<init>(paramContext, paramzza1, paramzzjp, paramzza2);
        }
      }
    }
  }
  
  public zzit zza(Context paramContext, String paramString, zzif.zza paramzza, zzht paramzzht)
  {
    zzhz localzzhz = new com/google/android/gms/internal/zzhz;
    localzzhz.<init>(paramContext, paramString, paramzza, paramzzht);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("AdRenderer: ");
    String str = localzzhz.getClass().getName();
    zzin.zzaI(str);
    localzzhz.zzgd();
    return localzzhz;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */