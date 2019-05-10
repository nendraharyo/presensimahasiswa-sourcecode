package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;

public abstract interface zzu
  extends IInterface
{
  public abstract void destroy();
  
  public abstract String getMediationAdapterClassName();
  
  public abstract boolean isLoading();
  
  public abstract boolean isReady();
  
  public abstract void pause();
  
  public abstract void resume();
  
  public abstract void setManualImpressionsEnabled(boolean paramBoolean);
  
  public abstract void setUserId(String paramString);
  
  public abstract void showInterstitial();
  
  public abstract void stopLoading();
  
  public abstract void zza(AdSizeParcel paramAdSizeParcel);
  
  public abstract void zza(zzp paramzzp);
  
  public abstract void zza(zzq paramzzq);
  
  public abstract void zza(zzw paramzzw);
  
  public abstract void zza(zzx paramzzx);
  
  public abstract void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd);
  
  public abstract void zza(zzcf paramzzcf);
  
  public abstract void zza(zzgd paramzzgd);
  
  public abstract void zza(zzgh paramzzgh, String paramString);
  
  public abstract com.google.android.gms.dynamic.zzd zzaM();
  
  public abstract AdSizeParcel zzaN();
  
  public abstract void zzaP();
  
  public abstract boolean zzb(AdRequestParcel paramAdRequestParcel);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */