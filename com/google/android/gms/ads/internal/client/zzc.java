package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

public final class zzc
  extends zzq.zza
{
  private final AdListener zztA;
  
  public zzc(AdListener paramAdListener)
  {
    this.zztA = paramAdListener;
  }
  
  public void onAdClosed()
  {
    this.zztA.onAdClosed();
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    this.zztA.onAdFailedToLoad(paramInt);
  }
  
  public void onAdLeftApplication()
  {
    this.zztA.onAdLeftApplication();
  }
  
  public void onAdLoaded()
  {
    this.zztA.onAdLoaded();
  }
  
  public void onAdOpened()
  {
    this.zztA.onAdOpened();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */