package com.google.android.gms.internal;

import android.location.Location;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.zza;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public final class zzfl
{
  public static int zza(AdRequest.ErrorCode paramErrorCode)
  {
    int[] arrayOfInt = zzfl.1.zzCT;
    int i = paramErrorCode.ordinal();
    int j = arrayOfInt[i];
    switch (j)
    {
    default: 
      j = 0;
      arrayOfInt = null;
    }
    for (;;)
    {
      return j;
      j = 1;
      continue;
      j = 2;
      continue;
      j = 3;
    }
  }
  
  public static com.google.ads.AdSize zzb(AdSizeParcel paramAdSizeParcel)
  {
    int i = 0;
    com.google.ads.AdSize localAdSize1 = null;
    int j = 6;
    Object localObject1 = new com.google.ads.AdSize[j];
    com.google.ads.AdSize localAdSize2 = com.google.ads.AdSize.SMART_BANNER;
    localObject1[0] = localAdSize2;
    Object localObject2 = com.google.ads.AdSize.BANNER;
    localObject1[1] = localObject2;
    localObject2 = com.google.ads.AdSize.IAB_MRECT;
    localObject1[2] = localObject2;
    localObject2 = com.google.ads.AdSize.IAB_BANNER;
    localObject1[3] = localObject2;
    localObject2 = com.google.ads.AdSize.IAB_LEADERBOARD;
    localObject1[4] = localObject2;
    int k = 5;
    localObject2 = com.google.ads.AdSize.IAB_WIDE_SKYSCRAPER;
    localObject1[k] = localObject2;
    k = localObject1.length;
    if (i < k)
    {
      localAdSize2 = localObject1[i];
      k = localAdSize2.getWidth();
      int m = paramAdSizeParcel.width;
      if (k == m)
      {
        localAdSize2 = localObject1[i];
        k = localAdSize2.getHeight();
        m = paramAdSizeParcel.height;
        if (k == m) {
          localAdSize1 = localObject1[i];
        }
      }
    }
    for (;;)
    {
      return localAdSize1;
      i += 1;
      break;
      localAdSize1 = new com/google/ads/AdSize;
      j = paramAdSizeParcel.width;
      k = paramAdSizeParcel.height;
      localObject2 = paramAdSizeParcel.zzuh;
      localObject1 = zza.zza(j, k, (String)localObject2);
      localAdSize1.<init>((com.google.android.gms.ads.AdSize)localObject1);
    }
  }
  
  public static MediationAdRequest zzj(AdRequestParcel paramAdRequestParcel)
  {
    Object localObject = paramAdRequestParcel.zztE;
    HashSet localHashSet;
    if (localObject != null)
    {
      localHashSet = new java/util/HashSet;
      localObject = paramAdRequestParcel.zztE;
      localHashSet.<init>((Collection)localObject);
    }
    for (;;)
    {
      localObject = new com/google/ads/mediation/MediationAdRequest;
      Date localDate = new java/util/Date;
      long l = paramAdRequestParcel.zztC;
      localDate.<init>(l);
      AdRequest.Gender localGender = zzu(paramAdRequestParcel.zztD);
      boolean bool = paramAdRequestParcel.zztF;
      Location localLocation = paramAdRequestParcel.zztK;
      ((MediationAdRequest)localObject).<init>(localDate, localGender, localHashSet, bool, localLocation);
      return (MediationAdRequest)localObject;
      localHashSet = null;
    }
  }
  
  public static AdRequest.Gender zzu(int paramInt)
  {
    AdRequest.Gender localGender;
    switch (paramInt)
    {
    default: 
      localGender = AdRequest.Gender.UNKNOWN;
    }
    for (;;)
    {
      return localGender;
      localGender = AdRequest.Gender.FEMALE;
      continue;
      localGender = AdRequest.Gender.MALE;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */