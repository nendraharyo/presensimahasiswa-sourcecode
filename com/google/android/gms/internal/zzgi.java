package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

public final class zzgi
  extends zzgd.zza
{
  private final InAppPurchaseListener zzuO;
  
  public zzgi(InAppPurchaseListener paramInAppPurchaseListener)
  {
    this.zzuO = paramInAppPurchaseListener;
  }
  
  public void zza(zzgc paramzzgc)
  {
    InAppPurchaseListener localInAppPurchaseListener = this.zzuO;
    zzgl localzzgl = new com/google/android/gms/internal/zzgl;
    localzzgl.<init>(paramzzgc);
    localInAppPurchaseListener.onInAppPurchaseRequested(localzzgl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */