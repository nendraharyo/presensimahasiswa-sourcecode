package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class zzfi
  implements NativeMediationAdRequest
{
  private final int zzCH;
  private final Date zzbf;
  private final Set zzbh;
  private final boolean zzbi;
  private final Location zzbj;
  private final NativeAdOptionsParcel zzpP;
  private final List zzpQ;
  private final int zztT;
  private final boolean zzuf;
  
  public zzfi(Date paramDate, int paramInt1, Set paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList, boolean paramBoolean2)
  {
    this.zzbf = paramDate;
    this.zztT = paramInt1;
    this.zzbh = paramSet;
    this.zzbj = paramLocation;
    this.zzbi = paramBoolean1;
    this.zzCH = paramInt2;
    this.zzpP = paramNativeAdOptionsParcel;
    this.zzpQ = paramList;
    this.zzuf = paramBoolean2;
  }
  
  public Date getBirthday()
  {
    return this.zzbf;
  }
  
  public int getGender()
  {
    return this.zztT;
  }
  
  public Set getKeywords()
  {
    return this.zzbh;
  }
  
  public Location getLocation()
  {
    return this.zzbj;
  }
  
  public NativeAdOptions getNativeAdOptions()
  {
    Object localObject = this.zzpP;
    if (localObject == null) {}
    boolean bool2;
    for (localObject = null;; localObject = ((NativeAdOptions.Builder)localObject).setRequestMultipleImages(bool2).build())
    {
      return (NativeAdOptions)localObject;
      localObject = new com/google/android/gms/ads/formats/NativeAdOptions$Builder;
      ((NativeAdOptions.Builder)localObject).<init>();
      boolean bool1 = this.zzpP.zzyA;
      localObject = ((NativeAdOptions.Builder)localObject).setReturnUrlsForImageAssets(bool1);
      int i = this.zzpP.zzyB;
      localObject = ((NativeAdOptions.Builder)localObject).setImageOrientation(i);
      NativeAdOptionsParcel localNativeAdOptionsParcel = this.zzpP;
      bool2 = localNativeAdOptionsParcel.zzyC;
    }
  }
  
  public boolean isAppInstallAdRequested()
  {
    List localList = this.zzpQ;
    boolean bool;
    if (localList != null)
    {
      localList = this.zzpQ;
      String str = "2";
      bool = localList.contains(str);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
  
  public boolean isContentAdRequested()
  {
    List localList = this.zzpQ;
    boolean bool;
    if (localList != null)
    {
      localList = this.zzpQ;
      String str = "1";
      bool = localList.contains(str);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
  
  public boolean isDesignedForFamilies()
  {
    return this.zzuf;
  }
  
  public boolean isTesting()
  {
    return this.zzbi;
  }
  
  public int taggedForChildDirectedTreatment()
  {
    return this.zzCH;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */