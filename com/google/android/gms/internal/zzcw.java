package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;

public class zzcw
  extends zzcr.zza
{
  private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzyS;
  
  public zzcw(NativeAppInstallAd.OnAppInstallAdLoadedListener paramOnAppInstallAdLoadedListener)
  {
    this.zzyS = paramOnAppInstallAdLoadedListener;
  }
  
  public void zza(zzcl paramzzcl)
  {
    NativeAppInstallAd.OnAppInstallAdLoadedListener localOnAppInstallAdLoadedListener = this.zzyS;
    zzcm localzzcm = zzb(paramzzcl);
    localOnAppInstallAdLoadedListener.onAppInstallAdLoaded(localzzcm);
  }
  
  zzcm zzb(zzcl paramzzcl)
  {
    zzcm localzzcm = new com/google/android/gms/internal/zzcm;
    localzzcm.<init>(paramzzcl);
    return localzzcm;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */