package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.zzq.zza;
import java.util.List;

class zzdw$1
  extends zzq.zza
{
  zzdw$1(zzdw paramzzdw) {}
  
  public void onAdClosed()
  {
    List localList = zzdw.zza(this.zzAc);
    zzdw.1.1 local1 = new com/google/android/gms/internal/zzdw$1$1;
    local1.<init>(this);
    localList.add(local1);
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    List localList = zzdw.zza(this.zzAc);
    zzdw.1.2 local2 = new com/google/android/gms/internal/zzdw$1$2;
    local2.<init>(this, paramInt);
    localList.add(local2);
    zzin.v("Pooled interstitial failed to load.");
  }
  
  public void onAdLeftApplication()
  {
    List localList = zzdw.zza(this.zzAc);
    zzdw.1.3 local3 = new com/google/android/gms/internal/zzdw$1$3;
    local3.<init>(this);
    localList.add(local3);
  }
  
  public void onAdLoaded()
  {
    List localList = zzdw.zza(this.zzAc);
    zzdw.1.4 local4 = new com/google/android/gms/internal/zzdw$1$4;
    local4.<init>(this);
    localList.add(local4);
    zzin.v("Pooled interstitial loaded.");
  }
  
  public void onAdOpened()
  {
    List localList = zzdw.zza(this.zzAc);
    zzdw.1.5 local5 = new com/google/android/gms/internal/zzdw$1$5;
    local5.<init>(this);
    localList.add(local5);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdw$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */