package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzaa.zza;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.common.internal.zzx;
import java.util.Date;
import java.util.List;

public final class PublisherAdRequest$Builder
{
  private final zzaa.zza zzoF;
  
  public PublisherAdRequest$Builder()
  {
    zzaa.zza localzza = new com/google/android/gms/ads/internal/client/zzaa$zza;
    localzza.<init>();
    this.zzoF = localzza;
  }
  
  public Builder addCategoryExclusion(String paramString)
  {
    this.zzoF.zzG(paramString);
    return this;
  }
  
  public Builder addCustomEventExtrasBundle(Class paramClass, Bundle paramBundle)
  {
    this.zzoF.zzb(paramClass, paramBundle);
    return this;
  }
  
  public Builder addCustomTargeting(String paramString1, String paramString2)
  {
    this.zzoF.zza(paramString1, paramString2);
    return this;
  }
  
  public Builder addCustomTargeting(String paramString, List paramList)
  {
    if (paramList != null)
    {
      zzaa.zza localzza = this.zzoF;
      String str = zzv.zzcL(",").zza(paramList);
      localzza.zza(paramString, str);
    }
    return this;
  }
  
  public Builder addKeyword(String paramString)
  {
    this.zzoF.zzA(paramString);
    return this;
  }
  
  public Builder addNetworkExtras(NetworkExtras paramNetworkExtras)
  {
    this.zzoF.zza(paramNetworkExtras);
    return this;
  }
  
  public Builder addNetworkExtrasBundle(Class paramClass, Bundle paramBundle)
  {
    this.zzoF.zza(paramClass, paramBundle);
    return this;
  }
  
  public Builder addTestDevice(String paramString)
  {
    this.zzoF.zzB(paramString);
    return this;
  }
  
  public PublisherAdRequest build()
  {
    PublisherAdRequest localPublisherAdRequest = new com/google/android/gms/ads/doubleclick/PublisherAdRequest;
    localPublisherAdRequest.<init>(this, null);
    return localPublisherAdRequest;
  }
  
  public Builder setBirthday(Date paramDate)
  {
    this.zzoF.zza(paramDate);
    return this;
  }
  
  public Builder setContentUrl(String paramString)
  {
    int i = 512;
    int j = 1;
    Integer localInteger1 = null;
    zzx.zzb(paramString, "Content URL must be non-null.");
    String str = "Content URL must be non-empty.";
    zzx.zzh(paramString, str);
    int k = paramString.length();
    if (k <= i) {
      k = j;
    }
    for (;;)
    {
      Object[] arrayOfObject = new Object[2];
      Integer localInteger2 = Integer.valueOf(i);
      arrayOfObject[0] = localInteger2;
      localInteger1 = Integer.valueOf(paramString.length());
      arrayOfObject[j] = localInteger1;
      zzx.zzb(k, "Content URL must not exceed %d in length.  Provided length was %d.", arrayOfObject);
      this.zzoF.zzD(paramString);
      return this;
      int m = 0;
      str = null;
    }
  }
  
  public Builder setGender(int paramInt)
  {
    this.zzoF.zzn(paramInt);
    return this;
  }
  
  public Builder setIsDesignedForFamilies(boolean paramBoolean)
  {
    this.zzoF.zzl(paramBoolean);
    return this;
  }
  
  public Builder setLocation(Location paramLocation)
  {
    this.zzoF.zzb(paramLocation);
    return this;
  }
  
  public Builder setManualImpressionsEnabled(boolean paramBoolean)
  {
    this.zzoF.setManualImpressionsEnabled(paramBoolean);
    return this;
  }
  
  public Builder setPublisherProvidedId(String paramString)
  {
    this.zzoF.zzE(paramString);
    return this;
  }
  
  public Builder setRequestAgent(String paramString)
  {
    this.zzoF.zzF(paramString);
    return this;
  }
  
  public Builder tagForChildDirectedTreatment(boolean paramBoolean)
  {
    this.zzoF.zzk(paramBoolean);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\doubleclick\PublisherAdRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */