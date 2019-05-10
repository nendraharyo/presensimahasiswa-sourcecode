package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzq.zza;
import com.google.android.gms.ads.internal.zzr;

class zzdx$zza
  extends zzq.zza
{
  zzq zzAv;
  
  zzdx$zza(zzdx paramzzdx, zzq paramzzq)
  {
    this.zzAv = paramzzq;
  }
  
  public void onAdClosed()
  {
    this.zzAv.onAdClosed();
    zzr.zzbN().zzee();
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    this.zzAv.onAdFailedToLoad(paramInt);
  }
  
  public void onAdLeftApplication()
  {
    this.zzAv.onAdLeftApplication();
  }
  
  public void onAdLoaded()
  {
    this.zzAv.onAdLoaded();
  }
  
  public void onAdOpened()
  {
    this.zzAv.onAdOpened();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdx$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */