package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.dynamic.zzd;
import java.util.List;

public abstract interface zzey
  extends IInterface
{
  public abstract void destroy();
  
  public abstract Bundle getInterstitialAdapterInfo();
  
  public abstract zzd getView();
  
  public abstract boolean isInitialized();
  
  public abstract void pause();
  
  public abstract void resume();
  
  public abstract void showInterstitial();
  
  public abstract void showVideo();
  
  public abstract void zza(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2);
  
  public abstract void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, zza paramzza, String paramString2);
  
  public abstract void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez);
  
  public abstract void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez);
  
  public abstract void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList);
  
  public abstract void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez);
  
  public abstract void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez);
  
  public abstract void zzb(AdRequestParcel paramAdRequestParcel, String paramString);
  
  public abstract zzfb zzeF();
  
  public abstract zzfc zzeG();
  
  public abstract Bundle zzeH();
  
  public abstract Bundle zzeI();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */