package com.google.android.gms.ads.search;

import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzaa.zza;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class SearchAdRequest$Builder
{
  private int zzOA;
  private int zzOB;
  private int zzOC;
  private int zzOD;
  private String zzOE;
  private int zzOF;
  private String zzOG;
  private int zzOH;
  private int zzOI;
  private String zzOJ;
  private int zzOx;
  private int zzOy;
  private int zzOz;
  private final zzaa.zza zzoF;
  private int zzxO;
  
  public SearchAdRequest$Builder()
  {
    zzaa.zza localzza = new com/google/android/gms/ads/internal/client/zzaa$zza;
    localzza.<init>();
    this.zzoF = localzza;
    this.zzOC = 0;
  }
  
  public Builder addCustomEventExtrasBundle(Class paramClass, Bundle paramBundle)
  {
    this.zzoF.zzb(paramClass, paramBundle);
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
  
  public SearchAdRequest build()
  {
    SearchAdRequest localSearchAdRequest = new com/google/android/gms/ads/search/SearchAdRequest;
    localSearchAdRequest.<init>(this, null);
    return localSearchAdRequest;
  }
  
  public Builder setAnchorTextColor(int paramInt)
  {
    this.zzOx = paramInt;
    return this;
  }
  
  public Builder setBackgroundColor(int paramInt)
  {
    this.zzxO = paramInt;
    int i = Color.argb(0, 0, 0, 0);
    this.zzOy = i;
    i = Color.argb(0, 0, 0, 0);
    this.zzOz = i;
    return this;
  }
  
  public Builder setBackgroundGradient(int paramInt1, int paramInt2)
  {
    int i = Color.argb(0, 0, 0, 0);
    this.zzxO = i;
    this.zzOy = paramInt2;
    this.zzOz = paramInt1;
    return this;
  }
  
  public Builder setBorderColor(int paramInt)
  {
    this.zzOA = paramInt;
    return this;
  }
  
  public Builder setBorderThickness(int paramInt)
  {
    this.zzOB = paramInt;
    return this;
  }
  
  public Builder setBorderType(int paramInt)
  {
    this.zzOC = paramInt;
    return this;
  }
  
  public Builder setCallButtonColor(int paramInt)
  {
    this.zzOD = paramInt;
    return this;
  }
  
  public Builder setCustomChannels(String paramString)
  {
    this.zzOE = paramString;
    return this;
  }
  
  public Builder setDescriptionTextColor(int paramInt)
  {
    this.zzOF = paramInt;
    return this;
  }
  
  public Builder setFontFace(String paramString)
  {
    this.zzOG = paramString;
    return this;
  }
  
  public Builder setHeaderTextColor(int paramInt)
  {
    this.zzOH = paramInt;
    return this;
  }
  
  public Builder setHeaderTextSize(int paramInt)
  {
    this.zzOI = paramInt;
    return this;
  }
  
  public Builder setLocation(Location paramLocation)
  {
    this.zzoF.zzb(paramLocation);
    return this;
  }
  
  public Builder setQuery(String paramString)
  {
    this.zzOJ = paramString;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\search\SearchAdRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */