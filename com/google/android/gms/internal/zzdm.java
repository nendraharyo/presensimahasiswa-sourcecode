package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public final class zzdm
  implements zzdf
{
  private final zze zzzA;
  private final zzfn zzzB;
  private final zzdh zzzD;
  
  public zzdm(zzdh paramzzdh, zze paramzze, zzfn paramzzfn)
  {
    this.zzzD = paramzzdh;
    this.zzzA = paramzze;
    this.zzzB = paramzzfn;
  }
  
  private static boolean zzc(Map paramMap)
  {
    Object localObject = paramMap.get("custom_close");
    return "1".equals(localObject);
  }
  
  private static int zzd(Map paramMap)
  {
    Object localObject = (String)paramMap.get("o");
    String str;
    boolean bool1;
    int i;
    if (localObject != null)
    {
      str = "p";
      bool1 = str.equalsIgnoreCase((String)localObject);
      if (bool1)
      {
        localObject = zzr.zzbE();
        i = ((zzis)localObject).zzhw();
      }
    }
    for (;;)
    {
      return i;
      str = "l";
      bool1 = str.equalsIgnoreCase((String)localObject);
      if (bool1)
      {
        localObject = zzr.zzbE();
        i = ((zzis)localObject).zzhv();
      }
      else
      {
        str = "c";
        boolean bool2 = str.equalsIgnoreCase((String)localObject);
        int j;
        if (bool2)
        {
          localObject = zzr.zzbE();
          j = ((zzis)localObject).zzhx();
        }
        else
        {
          j = -1;
        }
      }
    }
  }
  
  private static void zze(zzjp paramzzjp, Map paramMap)
  {
    String str = (String)paramMap.get("u");
    boolean bool = TextUtils.isEmpty(str);
    if (bool)
    {
      str = "Destination url cannot be empty.";
      zzin.zzaK(str);
    }
    for (;;)
    {
      return;
      zzdm.zza localzza = new com/google/android/gms/internal/zzdm$zza;
      localzza.<init>(paramzzjp, str);
      localzza.zzhn();
    }
  }
  
  private static void zzf(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = paramzzjp.getContext();
    Object localObject2 = (String)paramMap.get("u");
    boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
    if (bool)
    {
      localObject2 = "Destination url cannot be empty.";
      zzin.zzaK((String)localObject2);
    }
    for (;;)
    {
      return;
      localObject2 = paramzzjp.zzhU();
      Object localObject3 = new com/google/android/gms/internal/zzdm$zzb;
      ((zzdm.zzb)localObject3).<init>(paramzzjp);
      localObject1 = ((zzdm.zzb)localObject3).zza((Context)localObject1, paramMap);
      try
      {
        localObject3 = new com/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;
        ((AdLauncherIntentInfoParcel)localObject3).<init>((Intent)localObject1);
        ((zzjq)localObject2).zza((AdLauncherIntentInfoParcel)localObject3);
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        localObject2 = localActivityNotFoundException.getMessage();
        zzin.zzaK((String)localObject2);
      }
    }
  }
  
  private void zzo(boolean paramBoolean)
  {
    zzfn localzzfn = this.zzzB;
    if (localzzfn != null)
    {
      localzzfn = this.zzzB;
      localzzfn.zzp(paramBoolean);
    }
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = (String)paramMap.get("a");
    if (localObject2 == null)
    {
      localObject2 = "Action missing from an open GMSG.";
      zzin.zzaK((String)localObject2);
    }
    Object localObject3;
    zzjq localzzjq;
    Object localObject4;
    for (;;)
    {
      return;
      localObject3 = this.zzzA;
      if (localObject3 != null)
      {
        localObject3 = this.zzzA;
        bool2 = ((zze)localObject3).zzbh();
        if (!bool2)
        {
          localObject3 = this.zzzA;
          localObject2 = (String)paramMap.get("u");
          ((zze)localObject3).zzq((String)localObject2);
          continue;
        }
      }
      localzzjq = paramzzjp.zzhU();
      localObject3 = "expand";
      boolean bool2 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
      boolean bool4;
      if (bool2)
      {
        bool4 = paramzzjp.zzhY();
        if (bool4)
        {
          localObject2 = "Cannot expand WebView that is already expanded.";
          zzin.zzaK((String)localObject2);
        }
        else
        {
          zzo(false);
          bool4 = zzc(paramMap);
          int k = zzd(paramMap);
          localzzjq.zza(bool4, k);
        }
      }
      else
      {
        localObject3 = "webapp";
        bool3 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
        boolean bool1;
        if (bool3)
        {
          localObject2 = (String)paramMap.get("u");
          zzo(false);
          if (localObject2 != null)
          {
            bool3 = zzc(paramMap);
            j = zzd(paramMap);
            localzzjq.zza(bool3, j, (String)localObject2);
          }
          else
          {
            bool1 = zzc(paramMap);
            i = zzd(paramMap);
            localObject2 = (String)paramMap.get("html");
            localObject3 = (String)paramMap.get("baseurl");
            localzzjq.zza(bool1, i, (String)localObject2, (String)localObject3);
          }
        }
        else
        {
          localObject3 = "in_app_purchase";
          bool3 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
          if (bool3)
          {
            localObject2 = (String)paramMap.get("product_id");
            localObject3 = (String)paramMap.get("report_urls");
            localObject1 = this.zzzD;
            if (localObject1 != null)
            {
              if (localObject3 != null)
              {
                bool1 = ((String)localObject3).isEmpty();
                if (!bool1)
                {
                  localObject3 = ((String)localObject3).split(" ");
                  localObject1 = this.zzzD;
                  localObject4 = new java/util/ArrayList;
                  localObject3 = Arrays.asList((Object[])localObject3);
                  ((ArrayList)localObject4).<init>((Collection)localObject3);
                  ((zzdh)localObject1).zza((String)localObject2, (ArrayList)localObject4);
                  continue;
                }
              }
              localObject3 = this.zzzD;
              localObject1 = new java/util/ArrayList;
              ((ArrayList)localObject1).<init>();
              ((zzdh)localObject3).zza((String)localObject2, (ArrayList)localObject1);
            }
          }
          else
          {
            localObject3 = "app";
            bool3 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
            if (bool3)
            {
              localObject1 = "true";
              localObject3 = (String)paramMap.get("play_store");
              bool3 = ((String)localObject1).equalsIgnoreCase((String)localObject3);
              if (bool3)
              {
                zze(paramzzjp, paramMap);
                continue;
              }
            }
            localObject3 = "app";
            bool4 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
            if (!bool4) {
              break;
            }
            localObject3 = "true";
            localObject2 = (String)paramMap.get("system_browser");
            bool4 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
            if (!bool4) {
              break;
            }
            zzo(i);
            zzf(paramzzjp, paramMap);
          }
        }
      }
    }
    zzo(i);
    localObject2 = (String)paramMap.get("u");
    boolean bool3 = TextUtils.isEmpty((CharSequence)localObject2);
    if (!bool3) {
      localObject3 = zzr.zzbC();
    }
    for (localObject1 = ((zzir)localObject3).zza(paramzzjp, (String)localObject2);; localObject1 = localObject2)
    {
      localObject2 = new com/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;
      localObject3 = (String)paramMap.get("i");
      localObject4 = (String)paramMap.get("m");
      String str1 = (String)paramMap.get("p");
      String str2 = (String)paramMap.get("c");
      String str3 = (String)paramMap.get("f");
      String str4 = (String)paramMap.get("e");
      ((AdLauncherIntentInfoParcel)localObject2).<init>((String)localObject3, (String)localObject1, (String)localObject4, str1, str2, str3, str4);
      localzzjq.zza((AdLauncherIntentInfoParcel)localObject2);
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */