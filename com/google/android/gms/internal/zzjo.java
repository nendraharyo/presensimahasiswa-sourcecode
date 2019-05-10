package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.common.internal.zzx;

public class zzjo
{
  private final Context mContext;
  private zzk zzFo;
  private final ViewGroup zzNx;
  private final zzjp zzpD;
  
  public zzjo(Context paramContext, ViewGroup paramViewGroup, zzjp paramzzjp)
  {
    this(paramContext, paramViewGroup, paramzzjp, null);
  }
  
  zzjo(Context paramContext, ViewGroup paramViewGroup, zzjp paramzzjp, zzk paramzzk)
  {
    this.mContext = paramContext;
    this.zzNx = paramViewGroup;
    this.zzpD = paramzzjp;
    this.zzFo = paramzzk;
  }
  
  public void onDestroy()
  {
    zzx.zzcD("onDestroy must be called from the UI thread.");
    zzk localzzk = this.zzFo;
    if (localzzk != null)
    {
      localzzk = this.zzFo;
      localzzk.destroy();
    }
  }
  
  public void onPause()
  {
    zzx.zzcD("onPause must be called from the UI thread.");
    zzk localzzk = this.zzFo;
    if (localzzk != null)
    {
      localzzk = this.zzFo;
      localzzk.pause();
    }
  }
  
  public void zza(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = -1;
    Object localObject1 = this.zzFo;
    if (localObject1 != null) {}
    for (;;)
    {
      return;
      localObject1 = this.zzpD.zzic().zzdA();
      Object localObject2 = this.zzpD.zzib();
      int j = 1;
      Object localObject3 = new String[j];
      localObject3[0] = "vpr";
      zzbx.zza((zzcb)localObject1, (zzbz)localObject2, (String[])localObject3);
      zzbz localzzbz = zzbx.zzb(this.zzpD.zzic().zzdA());
      localObject1 = new com/google/android/gms/ads/internal/overlay/zzk;
      localObject2 = this.mContext;
      localObject3 = this.zzpD;
      zzca localzzca = this.zzpD.zzic();
      zzcb localzzcb = localzzca.zzdA();
      ((zzk)localObject1).<init>((Context)localObject2, (zzjp)localObject3, paramInt5, localzzcb, localzzbz);
      this.zzFo = ((zzk)localObject1);
      localObject1 = this.zzNx;
      localObject2 = this.zzFo;
      localObject3 = new android/view/ViewGroup$LayoutParams;
      ((ViewGroup.LayoutParams)localObject3).<init>(i, i);
      ((ViewGroup)localObject1).addView((View)localObject2, 0, (ViewGroup.LayoutParams)localObject3);
      this.zzFo.zzd(paramInt1, paramInt2, paramInt3, paramInt4);
      localObject1 = this.zzpD.zzhU();
      ((zzjq)localObject1).zzG(false);
    }
  }
  
  public void zze(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    zzx.zzcD("The underlay may only be modified from the UI thread.");
    zzk localzzk = this.zzFo;
    if (localzzk != null)
    {
      localzzk = this.zzFo;
      localzzk.zzd(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public zzk zzhM()
  {
    zzx.zzcD("getAdVideoUnderlay must be called from the UI thread.");
    return this.zzFo;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */