package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

public class zzhx
  extends zza.zza
{
  private zzhy zzKC;
  private zzhv zzKJ;
  private zzhw zzKK;
  
  public zzhx(zzhw paramzzhw)
  {
    this.zzKK = paramzzhw;
  }
  
  public void zza(zzd paramzzd, RewardItemParcel paramRewardItemParcel)
  {
    zzhw localzzhw = this.zzKK;
    if (localzzhw != null)
    {
      localzzhw = this.zzKK;
      localzzhw.zzc(paramRewardItemParcel);
    }
  }
  
  public void zza(zzhv paramzzhv)
  {
    this.zzKJ = paramzzhv;
  }
  
  public void zza(zzhy paramzzhy)
  {
    this.zzKC = paramzzhy;
  }
  
  public void zzb(zzd paramzzd, int paramInt)
  {
    zzhv localzzhv = this.zzKJ;
    if (localzzhv != null)
    {
      localzzhv = this.zzKJ;
      localzzhv.zzN(paramInt);
    }
  }
  
  public void zzc(zzd paramzzd, int paramInt)
  {
    zzhy localzzhy = this.zzKC;
    if (localzzhy != null)
    {
      localzzhy = this.zzKC;
      String str = zze.zzp(paramzzd).getClass().getName();
      localzzhy.zza(str, paramInt);
    }
  }
  
  public void zzg(zzd paramzzd)
  {
    zzhv localzzhv = this.zzKJ;
    if (localzzhv != null)
    {
      localzzhv = this.zzKJ;
      localzzhv.zzgN();
    }
  }
  
  public void zzh(zzd paramzzd)
  {
    zzhy localzzhy = this.zzKC;
    if (localzzhy != null)
    {
      localzzhy = this.zzKC;
      String str = zze.zzp(paramzzd).getClass().getName();
      localzzhy.zzax(str);
    }
  }
  
  public void zzi(zzd paramzzd)
  {
    zzhw localzzhw = this.zzKK;
    if (localzzhw != null)
    {
      localzzhw = this.zzKK;
      localzzhw.onRewardedVideoAdOpened();
    }
  }
  
  public void zzj(zzd paramzzd)
  {
    zzhw localzzhw = this.zzKK;
    if (localzzhw != null)
    {
      localzzhw = this.zzKK;
      localzzhw.onRewardedVideoStarted();
    }
  }
  
  public void zzk(zzd paramzzd)
  {
    zzhw localzzhw = this.zzKK;
    if (localzzhw != null)
    {
      localzzhw = this.zzKK;
      localzzhw.onRewardedVideoAdClosed();
    }
  }
  
  public void zzl(zzd paramzzd)
  {
    zzhw localzzhw = this.zzKK;
    if (localzzhw != null)
    {
      localzzhw = this.zzKK;
      localzzhw.zzgM();
    }
  }
  
  public void zzm(zzd paramzzd)
  {
    zzhw localzzhw = this.zzKK;
    if (localzzhw != null)
    {
      localzzhw = this.zzKK;
      localzzhw.onRewardedVideoAdLeftApplication();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */