package com.google.android.gms.internal;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzk;

public class zzdv
{
  private MutableContextWrapper zzAb;
  private final VersionInfoParcel zzpT;
  private final zzd zzpm;
  private final zzex zzpn;
  
  zzdv(Context paramContext, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    MutableContextWrapper localMutableContextWrapper = new android/content/MutableContextWrapper;
    Context localContext = paramContext.getApplicationContext();
    localMutableContextWrapper.<init>(localContext);
    this.zzAb = localMutableContextWrapper;
    this.zzpn = paramzzex;
    this.zzpT = paramVersionInfoParcel;
    this.zzpm = paramzzd;
  }
  
  public zzk zzX(String paramString)
  {
    zzk localzzk = new com/google/android/gms/ads/internal/zzk;
    MutableContextWrapper localMutableContextWrapper = this.zzAb;
    AdSizeParcel localAdSizeParcel = new com/google/android/gms/ads/internal/client/AdSizeParcel;
    localAdSizeParcel.<init>();
    zzex localzzex = this.zzpn;
    VersionInfoParcel localVersionInfoParcel = this.zzpT;
    zzd localzzd = this.zzpm;
    localzzk.<init>(localMutableContextWrapper, localAdSizeParcel, paramString, localzzex, localVersionInfoParcel, localzzd);
    return localzzk;
  }
  
  public zzdv zzec()
  {
    zzdv localzzdv = new com/google/android/gms/internal/zzdv;
    Context localContext = this.zzAb.getBaseContext();
    zzex localzzex = this.zzpn;
    VersionInfoParcel localVersionInfoParcel = this.zzpT;
    zzd localzzd = this.zzpm;
    localzzdv.<init>(localContext, localzzex, localVersionInfoParcel, localzzd);
    return localzzdv;
  }
  
  public MutableContextWrapper zzed()
  {
    return this.zzAb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */