package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzu.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzr;
import java.util.Set;

public class zzeb
  extends zzu.zza
{
  private zzk zzAD;
  private zzdx zzAJ;
  private zzgh zzAK;
  private String zzAL;
  private zzdv zzAz;
  private String zzpS;
  
  public zzeb(Context paramContext, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, com.google.android.gms.ads.internal.zzd paramzzd)
  {
    this(paramString, localzzdv);
  }
  
  public zzeb(String paramString, zzdv paramzzdv)
  {
    this.zzpS = paramString;
    this.zzAz = paramzzdv;
    zzdx localzzdx = new com/google/android/gms/internal/zzdx;
    localzzdx.<init>();
    this.zzAJ = localzzdx;
    zzr.zzbN().zza(paramzzdv);
  }
  
  private void zzel()
  {
    Object localObject = this.zzAD;
    if (localObject != null)
    {
      localObject = this.zzAK;
      if (localObject != null)
      {
        localObject = this.zzAD;
        zzgh localzzgh = this.zzAK;
        String str = this.zzAL;
        ((zzk)localObject).zza(localzzgh, str);
      }
    }
  }
  
  void abort()
  {
    Object localObject1 = this.zzAD;
    if (localObject1 != null) {}
    for (;;)
    {
      return;
      localObject1 = this.zzAz;
      Object localObject2 = this.zzpS;
      localObject1 = ((zzdv)localObject1).zzX((String)localObject2);
      this.zzAD = ((zzk)localObject1);
      localObject1 = this.zzAJ;
      localObject2 = this.zzAD;
      ((zzdx)localObject1).zzc((zzk)localObject2);
      zzel();
    }
  }
  
  public void destroy()
  {
    zzk localzzk = this.zzAD;
    if (localzzk != null)
    {
      localzzk = this.zzAD;
      localzzk.destroy();
    }
  }
  
  public String getMediationAdapterClassName()
  {
    Object localObject = this.zzAD;
    if (localObject != null) {}
    for (localObject = this.zzAD.getMediationAdapterClassName();; localObject = null) {
      return (String)localObject;
    }
  }
  
  public boolean isLoading()
  {
    zzk localzzk = this.zzAD;
    boolean bool;
    if (localzzk != null)
    {
      localzzk = this.zzAD;
      bool = localzzk.isLoading();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzk = null;
    }
  }
  
  public boolean isReady()
  {
    zzk localzzk = this.zzAD;
    boolean bool;
    if (localzzk != null)
    {
      localzzk = this.zzAD;
      bool = localzzk.isReady();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzk = null;
    }
  }
  
  public void pause()
  {
    zzk localzzk = this.zzAD;
    if (localzzk != null)
    {
      localzzk = this.zzAD;
      localzzk.pause();
    }
  }
  
  public void resume()
  {
    zzk localzzk = this.zzAD;
    if (localzzk != null)
    {
      localzzk = this.zzAD;
      localzzk.resume();
    }
  }
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    abort();
    zzk localzzk = this.zzAD;
    if (localzzk != null)
    {
      localzzk = this.zzAD;
      localzzk.setManualImpressionsEnabled(paramBoolean);
    }
  }
  
  public void setUserId(String paramString) {}
  
  public void showInterstitial()
  {
    Object localObject = this.zzAD;
    if (localObject != null)
    {
      localObject = this.zzAD;
      ((zzk)localObject).showInterstitial();
    }
    for (;;)
    {
      return;
      localObject = "Interstitial ad must be loaded before showInterstitial().";
      zzin.zzaK((String)localObject);
    }
  }
  
  public void stopLoading()
  {
    zzk localzzk = this.zzAD;
    if (localzzk != null)
    {
      localzzk = this.zzAD;
      localzzk.stopLoading();
    }
  }
  
  public void zza(AdSizeParcel paramAdSizeParcel)
  {
    zzk localzzk = this.zzAD;
    if (localzzk != null)
    {
      localzzk = this.zzAD;
      localzzk.zza(paramAdSizeParcel);
    }
  }
  
  public void zza(zzp paramzzp)
  {
    this.zzAJ.zzAt = paramzzp;
    Object localObject = this.zzAD;
    if (localObject != null)
    {
      localObject = this.zzAJ;
      zzk localzzk = this.zzAD;
      ((zzdx)localObject).zzc(localzzk);
    }
  }
  
  public void zza(zzq paramzzq)
  {
    this.zzAJ.zzpK = paramzzq;
    Object localObject = this.zzAD;
    if (localObject != null)
    {
      localObject = this.zzAJ;
      zzk localzzk = this.zzAD;
      ((zzdx)localObject).zzc(localzzk);
    }
  }
  
  public void zza(zzw paramzzw)
  {
    this.zzAJ.zzAq = paramzzw;
    Object localObject = this.zzAD;
    if (localObject != null)
    {
      localObject = this.zzAJ;
      zzk localzzk = this.zzAD;
      ((zzdx)localObject).zzc(localzzk);
    }
  }
  
  public void zza(zzx paramzzx)
  {
    abort();
    zzk localzzk = this.zzAD;
    if (localzzk != null)
    {
      localzzk = this.zzAD;
      localzzk.zza(paramzzx);
    }
  }
  
  public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
  {
    this.zzAJ.zzAu = paramzzd;
    Object localObject = this.zzAD;
    if (localObject != null)
    {
      localObject = this.zzAJ;
      zzk localzzk = this.zzAD;
      ((zzdx)localObject).zzc(localzzk);
    }
  }
  
  public void zza(zzcf paramzzcf)
  {
    this.zzAJ.zzAs = paramzzcf;
    Object localObject = this.zzAD;
    if (localObject != null)
    {
      localObject = this.zzAJ;
      zzk localzzk = this.zzAD;
      ((zzdx)localObject).zzc(localzzk);
    }
  }
  
  public void zza(zzgd paramzzgd)
  {
    this.zzAJ.zzAr = paramzzgd;
    Object localObject = this.zzAD;
    if (localObject != null)
    {
      localObject = this.zzAJ;
      zzk localzzk = this.zzAD;
      ((zzdx)localObject).zzc(localzzk);
    }
  }
  
  public void zza(zzgh paramzzgh, String paramString)
  {
    this.zzAK = paramzzgh;
    this.zzAL = paramString;
    zzel();
  }
  
  public com.google.android.gms.dynamic.zzd zzaM()
  {
    Object localObject = this.zzAD;
    if (localObject != null) {}
    for (localObject = this.zzAD.zzaM();; localObject = null) {
      return (com.google.android.gms.dynamic.zzd)localObject;
    }
  }
  
  public AdSizeParcel zzaN()
  {
    Object localObject = this.zzAD;
    if (localObject != null) {}
    for (localObject = this.zzAD.zzaN();; localObject = null) {
      return (AdSizeParcel)localObject;
    }
  }
  
  public void zzaP()
  {
    Object localObject = this.zzAD;
    if (localObject != null)
    {
      localObject = this.zzAD;
      ((zzk)localObject).zzaP();
    }
    for (;;)
    {
      return;
      localObject = "Interstitial ad must be loaded before pingManualTrackingUrl().";
      zzin.zzaK((String)localObject);
    }
  }
  
  public boolean zzb(AdRequestParcel paramAdRequestParcel)
  {
    boolean bool1 = zzi(paramAdRequestParcel);
    if (bool1) {
      abort();
    }
    Object localObject1 = paramAdRequestParcel.zztJ;
    if (localObject1 != null) {
      abort();
    }
    localObject1 = this.zzAD;
    if (localObject1 != null)
    {
      localObject1 = this.zzAD;
      bool1 = ((zzk)localObject1).zzb(paramAdRequestParcel);
    }
    for (;;)
    {
      return bool1;
      localObject1 = zzr.zzbN();
      Object localObject2 = this.zzpS;
      localObject1 = ((zzdy)localObject1).zza(paramAdRequestParcel, (String)localObject2);
      if (localObject1 != null)
      {
        boolean bool2 = ((zzea.zza)localObject1).zzAG;
        if (!bool2) {
          ((zzea.zza)localObject1).zzh(paramAdRequestParcel);
        }
        localObject2 = ((zzea.zza)localObject1).zzAD;
        this.zzAD = ((zzk)localObject2);
        localObject2 = this.zzAz;
        ((zzea.zza)localObject1).zzc((zzdv)localObject2);
        localObject2 = ((zzea.zza)localObject1).zzAE;
        Object localObject3 = this.zzAJ;
        ((zzdw)localObject2).zza((zzdx)localObject3);
        localObject2 = this.zzAJ;
        localObject3 = this.zzAD;
        ((zzdx)localObject2).zzc((zzk)localObject3);
        zzel();
        bool1 = ((zzea.zza)localObject1).zzAH;
      }
      else
      {
        localObject1 = this.zzAz;
        localObject2 = this.zzpS;
        localObject1 = ((zzdv)localObject1).zzX((String)localObject2);
        this.zzAD = ((zzk)localObject1);
        localObject1 = this.zzAJ;
        localObject2 = this.zzAD;
        ((zzdx)localObject1).zzc((zzk)localObject2);
        zzel();
        localObject1 = this.zzAD;
        bool1 = ((zzk)localObject1).zzb(paramAdRequestParcel);
      }
    }
  }
  
  boolean zzi(AdRequestParcel paramAdRequestParcel)
  {
    boolean bool = false;
    String str1 = null;
    Object localObject = paramAdRequestParcel.zztM;
    if (localObject == null) {}
    for (;;)
    {
      return bool;
      String str2 = AdMobAdapter.class.getCanonicalName();
      localObject = ((Bundle)localObject).getBundle(str2);
      if (localObject != null)
      {
        str1 = "gw";
        localObject = ((Bundle)localObject).keySet();
        bool = ((Set)localObject).contains(str1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzeb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */