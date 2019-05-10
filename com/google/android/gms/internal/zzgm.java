package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

public final class zzgm
  extends zzgh.zza
{
  private final PlayStorePurchaseListener zzuP;
  
  public zzgm(PlayStorePurchaseListener paramPlayStorePurchaseListener)
  {
    this.zzuP = paramPlayStorePurchaseListener;
  }
  
  public boolean isValidPurchase(String paramString)
  {
    return this.zzuP.isValidPurchase(paramString);
  }
  
  public void zza(zzgg paramzzgg)
  {
    PlayStorePurchaseListener localPlayStorePurchaseListener = this.zzuP;
    zzgk localzzgk = new com/google/android/gms/internal/zzgk;
    localzzgk.<init>(paramzzgg);
    localPlayStorePurchaseListener.onInAppPurchaseFinished(localzzgk);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */