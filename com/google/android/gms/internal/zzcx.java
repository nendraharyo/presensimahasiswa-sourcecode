package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;

public class zzcx
  extends zzcs.zza
{
  private final NativeContentAd.OnContentAdLoadedListener zzyT;
  
  public zzcx(NativeContentAd.OnContentAdLoadedListener paramOnContentAdLoadedListener)
  {
    this.zzyT = paramOnContentAdLoadedListener;
  }
  
  public void zza(zzcn paramzzcn)
  {
    NativeContentAd.OnContentAdLoadedListener localOnContentAdLoadedListener = this.zzyT;
    zzco localzzco = zzb(paramzzcn);
    localOnContentAdLoadedListener.onContentAdLoaded(localzzco);
  }
  
  zzco zzb(zzcn paramzzcn)
  {
    zzco localzzco = new com/google/android/gms/internal/zzco;
    localzzco.<init>(paramzzcn);
    return localzzco;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */