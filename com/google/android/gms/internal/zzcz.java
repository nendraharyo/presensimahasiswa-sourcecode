package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;

public class zzcz
  extends zzcu.zza
{
  private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzyV;
  
  public zzcz(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener paramOnCustomTemplateAdLoadedListener)
  {
    this.zzyV = paramOnCustomTemplateAdLoadedListener;
  }
  
  public void zza(zzcp paramzzcp)
  {
    NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener localOnCustomTemplateAdLoadedListener = this.zzyV;
    zzcq localzzcq = new com/google/android/gms/internal/zzcq;
    localzzcq.<init>(paramzzcp);
    localOnCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(localzzcq);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */