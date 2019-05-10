package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class zzh
{
  public static final zzh zzug;
  
  static
  {
    zzh localzzh = new com/google/android/gms/ads/internal/client/zzh;
    localzzh.<init>();
    zzug = localzzh;
  }
  
  public static zzh zzcO()
  {
    return zzug;
  }
  
  public AdRequestParcel zza(Context paramContext, zzaa paramzzaa)
  {
    int i = 7;
    Object localObject1 = paramzzaa.getBirthday();
    long l;
    String str1;
    int j;
    Object localObject2;
    List localList;
    label72:
    boolean bool2;
    int k;
    Location localLocation;
    boolean bool3;
    String str2;
    SearchAdRequestParcel localSearchAdRequestParcel;
    if (localObject1 != null)
    {
      l = ((Date)localObject1).getTime();
      str1 = paramzzaa.getContentUrl();
      j = paramzzaa.getGender();
      localObject1 = paramzzaa.getKeywords();
      boolean bool1 = ((Set)localObject1).isEmpty();
      if (bool1) {
        break label283;
      }
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>((Collection)localObject1);
      localList = Collections.unmodifiableList((List)localObject2);
      bool2 = paramzzaa.isTestDevice(paramContext);
      k = paramzzaa.zzdd();
      localLocation = paramzzaa.getLocation();
      localObject2 = paramzzaa.getNetworkExtrasBundle(AdMobAdapter.class);
      bool3 = paramzzaa.getManualImpressionsEnabled();
      str2 = paramzzaa.getPublisherProvidedId();
      localObject1 = paramzzaa.zzda();
      if (localObject1 == null) {
        break label289;
      }
      localSearchAdRequestParcel = new com/google/android/gms/ads/internal/client/SearchAdRequestParcel;
      localSearchAdRequestParcel.<init>((SearchAdRequest)localObject1);
    }
    for (;;)
    {
      String str3 = null;
      localObject1 = paramContext.getApplicationContext();
      if (localObject1 != null)
      {
        localObject1 = ((Context)localObject1).getPackageName();
        localObject3 = zzn.zzcS();
        localObject4 = Thread.currentThread().getStackTrace();
        str3 = ((zza)localObject3).zza((StackTraceElement[])localObject4, (String)localObject1);
      }
      boolean bool4 = paramzzaa.isDesignedForFamilies();
      localObject1 = new com/google/android/gms/ads/internal/client/AdRequestParcel;
      Object localObject3 = paramzzaa.zzdc();
      Object localObject4 = paramzzaa.getCustomTargeting();
      Object localObject5 = new java/util/ArrayList;
      Object localObject6 = paramzzaa.zzde();
      ((ArrayList)localObject5).<init>((Collection)localObject6);
      localObject5 = Collections.unmodifiableList((List)localObject5);
      localObject6 = paramzzaa.zzcZ();
      ((AdRequestParcel)localObject1).<init>(i, l, (Bundle)localObject2, j, localList, bool2, k, bool3, str2, localSearchAdRequestParcel, localLocation, str1, (Bundle)localObject3, (Bundle)localObject4, (List)localObject5, (String)localObject6, str3, bool4);
      return (AdRequestParcel)localObject1;
      l = -1;
      break;
      label283:
      localList = null;
      break label72;
      label289:
      localSearchAdRequestParcel = null;
    }
  }
  
  public RewardedVideoAdRequestParcel zza(Context paramContext, zzaa paramzzaa, String paramString)
  {
    AdRequestParcel localAdRequestParcel = zza(paramContext, paramzzaa);
    RewardedVideoAdRequestParcel localRewardedVideoAdRequestParcel = new com/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;
    localRewardedVideoAdRequestParcel.<init>(localAdRequestParcel, paramString);
    return localRewardedVideoAdRequestParcel;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */