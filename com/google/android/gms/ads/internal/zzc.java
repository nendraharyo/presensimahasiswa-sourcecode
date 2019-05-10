package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzft;
import com.google.android.gms.internal.zzgr;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zziu;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjr;

public abstract class zzc
  extends zzb
  implements zzg, zzft
{
  public zzc(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramzzex, paramVersionInfoParcel, paramzzd);
  }
  
  protected zzjp zza(zzif.zza paramzza, zze paramzze)
  {
    Object localObject1 = this.zzpj.zzrm.getNextView();
    boolean bool = localObject1 instanceof zzjp;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool)
    {
      zzin.zzaI("Reusing webview...");
      localObject1 = (zzjp)localObject1;
      localObject2 = this.zzpj.context;
      localObject3 = this.zzpj.zzrp;
      localObject4 = this.zzpe;
      ((zzjp)localObject1).zza((Context)localObject2, (AdSizeParcel)localObject3, (zzcb)localObject4);
    }
    for (Object localObject5 = localObject1;; localObject5 = localObject1)
    {
      localObject1 = ((zzjp)localObject5).zzhU();
      localObject2 = this;
      localObject3 = this;
      localObject4 = this;
      Object localObject6 = this;
      Object localObject7 = paramzze;
      ((zzjq)localObject1).zzb(this, this, this, this, false, this, null, paramzze, this);
      zza((zzeh)localObject5);
      localObject1 = paramzza.zzLd.zzHI;
      ((zzjp)localObject5).zzaM((String)localObject1);
      return (zzjp)localObject5;
      if (localObject1 != null)
      {
        localObject2 = this.zzpj.zzrm;
        ((zzs.zza)localObject2).removeView((View)localObject1);
      }
      localObject1 = zzr.zzbD();
      localObject2 = this.zzpj.context;
      localObject3 = this.zzpj.zzrp;
      localObject4 = null;
      zzan localzzan = this.zzpj.zzrk;
      localObject6 = this.zzpj.zzrl;
      zzcb localzzcb = this.zzpe;
      localObject7 = this.zzpm;
      localObject1 = ((zzjr)localObject1).zza((Context)localObject2, (AdSizeParcel)localObject3, false, false, localzzan, (VersionInfoParcel)localObject6, localzzcb, (zzd)localObject7);
      localObject2 = this.zzpj.zzrp.zzuj;
      if (localObject2 == null)
      {
        localObject2 = ((zzjp)localObject1).getView();
        zzb((View)localObject2);
      }
    }
  }
  
  public void zza(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    zzaS();
  }
  
  public void zza(zzcf paramzzcf)
  {
    zzx.zzcD("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
    this.zzpj.zzrE = paramzzcf;
  }
  
  protected void zza(zzeh paramzzeh)
  {
    zzc.1 local1 = new com/google/android/gms/ads/internal/zzc$1;
    local1.<init>(this);
    paramzzeh.zza("/trackActiveViewUnit", local1);
  }
  
  protected void zza(zzif.zza paramzza, zzcb paramzzcb)
  {
    int i = paramzza.errorCode;
    int j = -2;
    Object localObject1;
    Object localObject2;
    if (i != j)
    {
      localObject1 = zzir.zzMc;
      localObject2 = new com/google/android/gms/ads/internal/zzc$2;
      ((zzc.2)localObject2).<init>(this, paramzza);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = paramzza.zzrp;
      if (localObject1 != null)
      {
        localObject1 = this.zzpj;
        localObject2 = paramzza.zzrp;
        ((zzs)localObject1).zzrp = ((AdSizeParcel)localObject2);
      }
      localObject1 = paramzza.zzLe;
      boolean bool = ((AdResponseParcel)localObject1).zzHT;
      if (bool)
      {
        localObject1 = paramzza.zzLe;
        bool = ((AdResponseParcel)localObject1).zzum;
        if (!bool)
        {
          localObject1 = this.zzpj;
          j = 0;
          ((zzs)localObject1).zzrL = 0;
          zzs localzzs = this.zzpj;
          localObject1 = zzr.zzbB();
          localObject2 = this.zzpj.context;
          zzan localzzan = this.zzpj.zzrk;
          zzex localzzex = this.zzpn;
          localObject1 = ((zzgr)localObject1).zza((Context)localObject2, this, paramzza, localzzan, null, localzzex, this, paramzzcb);
          localzzs.zzro = ((zzit)localObject1);
          continue;
        }
      }
      localObject1 = zzir.zzMc;
      localObject2 = new com/google/android/gms/ads/internal/zzc$3;
      ((zzc.3)localObject2).<init>(this, paramzza, paramzzcb);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
  }
  
  protected boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    Object localObject = this.zzpj;
    boolean bool = ((zzs)localObject).zzbW();
    if (bool)
    {
      localObject = this.zzpj.zzrm;
      if (localObject != null)
      {
        localObject = this.zzpj.zzrm.zzcc();
        String str = paramzzif2.zzHY;
        ((zziu)localObject).zzaF(str);
      }
    }
    return super.zza(paramzzif1, paramzzif2);
  }
  
  public void zzbd()
  {
    onAdClicked();
  }
  
  public void zzbe()
  {
    recordImpression();
    zzaP();
  }
  
  public void zzbf()
  {
    zzaQ();
  }
  
  public void zzc(View paramView)
  {
    this.zzpj.zzrK = paramView;
    zzif localzzif = new com/google/android/gms/internal/zzif;
    zzif.zza localzza = this.zzpj.zzrr;
    localzzif.<init>(localzza, null, null, null, null, null, null);
    zzb(localzzif);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */