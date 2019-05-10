package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

public final class zzcg
  extends zzcf.zza
{
  private final OnCustomRenderedAdLoadedListener zzuQ;
  
  public zzcg(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    this.zzuQ = paramOnCustomRenderedAdLoadedListener;
  }
  
  public void zza(zzce paramzzce)
  {
    OnCustomRenderedAdLoadedListener localOnCustomRenderedAdLoadedListener = this.zzuQ;
    zzcd localzzcd = new com/google/android/gms/internal/zzcd;
    localzzcd.<init>(paramzzce);
    localOnCustomRenderedAdLoadedListener.onCustomRenderedAdLoaded(localzzcd);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */