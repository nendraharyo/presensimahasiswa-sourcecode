package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.h.m;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs.zza;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzex;

public class zzj
  extends zzs.zza
{
  private final Context mContext;
  private zzq zzpK;
  private NativeAdOptionsParcel zzpP;
  private zzx zzpR;
  private final String zzpS;
  private final VersionInfoParcel zzpT;
  private zzcr zzpY;
  private zzcs zzpZ;
  private final zzd zzpm;
  private final zzex zzpn;
  private m zzqa;
  private m zzqb;
  
  public zzj(Context paramContext, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    this.mContext = paramContext;
    this.zzpS = paramString;
    this.zzpn = paramzzex;
    this.zzpT = paramVersionInfoParcel;
    m localm = new android/support/v4/h/m;
    localm.<init>();
    this.zzqb = localm;
    localm = new android/support/v4/h/m;
    localm.<init>();
    this.zzqa = localm;
    this.zzpm = paramzzd;
  }
  
  public void zza(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    this.zzpP = paramNativeAdOptionsParcel;
  }
  
  public void zza(zzcr paramzzcr)
  {
    this.zzpY = paramzzcr;
  }
  
  public void zza(zzcs paramzzcs)
  {
    this.zzpZ = paramzzcs;
  }
  
  public void zza(String paramString, zzcu paramzzcu, zzct paramzzct)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
      throw localIllegalArgumentException;
    }
    this.zzqb.put(paramString, paramzzcu);
    this.zzqa.put(paramString, paramzzct);
  }
  
  public void zzb(zzq paramzzq)
  {
    this.zzpK = paramzzq;
  }
  
  public void zzb(zzx paramzzx)
  {
    this.zzpR = paramzzx;
  }
  
  public zzr zzbn()
  {
    zzi localzzi = new com/google/android/gms/ads/internal/zzi;
    Context localContext = this.mContext;
    String str = this.zzpS;
    zzex localzzex = this.zzpn;
    VersionInfoParcel localVersionInfoParcel = this.zzpT;
    zzq localzzq = this.zzpK;
    zzcr localzzcr = this.zzpY;
    zzcs localzzcs = this.zzpZ;
    m localm1 = this.zzqb;
    m localm2 = this.zzqa;
    NativeAdOptionsParcel localNativeAdOptionsParcel = this.zzpP;
    zzx localzzx = this.zzpR;
    zzd localzzd = this.zzpm;
    localzzi.<init>(localContext, str, localzzex, localVersionInfoParcel, localzzq, localzzcr, localzzcs, localm1, localm2, localNativeAdOptionsParcel, localzzx, localzzd);
    return localzzi;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */