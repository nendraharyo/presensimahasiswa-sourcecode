package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.h.m;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzg;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgr;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzit;
import java.util.List;

public class zzp
  extends zzb
{
  public zzp(Context paramContext, zzd paramzzd, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramzzex, paramVersionInfoParcel, paramzzd);
  }
  
  private static com.google.android.gms.ads.internal.formats.zzd zza(zzfb paramzzfb)
  {
    com.google.android.gms.ads.internal.formats.zzd localzzd = new com/google/android/gms/ads/internal/formats/zzd;
    String str1 = paramzzfb.getHeadline();
    List localList = paramzzfb.getImages();
    String str2 = paramzzfb.getBody();
    zzch localzzch = paramzzfb.zzdK();
    if (localzzch != null) {}
    for (localzzch = paramzzfb.zzdK();; localzzch = null)
    {
      String str3 = paramzzfb.getCallToAction();
      double d = paramzzfb.getStarRating();
      String str4 = paramzzfb.getStore();
      String str5 = paramzzfb.getPrice();
      Bundle localBundle = paramzzfb.getExtras();
      localzzd.<init>(str1, localList, str2, localzzch, str3, d, str4, str5, null, localBundle);
      return localzzd;
    }
  }
  
  private static zze zza(zzfc paramzzfc)
  {
    zze localzze = new com/google/android/gms/ads/internal/formats/zze;
    String str1 = paramzzfc.getHeadline();
    List localList = paramzzfc.getImages();
    String str2 = paramzzfc.getBody();
    zzch localzzch = paramzzfc.zzdO();
    if (localzzch != null) {}
    for (localzzch = paramzzfc.zzdO();; localzzch = null)
    {
      String str3 = paramzzfc.getCallToAction();
      String str4 = paramzzfc.getAdvertiser();
      Bundle localBundle = paramzzfc.getExtras();
      localzze.<init>(str1, localList, str2, localzzch, str3, str4, null, localBundle);
      return localzze;
    }
  }
  
  private void zza(com.google.android.gms.ads.internal.formats.zzd paramzzd)
  {
    Handler localHandler = zzir.zzMc;
    zzp.2 local2 = new com/google/android/gms/ads/internal/zzp$2;
    local2.<init>(this, paramzzd);
    localHandler.post(local2);
  }
  
  private void zza(zze paramzze)
  {
    Handler localHandler = zzir.zzMc;
    zzp.3 local3 = new com/google/android/gms/ads/internal/zzp$3;
    local3.<init>(this, paramzze);
    localHandler.post(local3);
  }
  
  private void zza(zzif paramzzif, String paramString)
  {
    Handler localHandler = zzir.zzMc;
    zzp.4 local4 = new com/google/android/gms/ads/internal/zzp$4;
    local4.<init>(this, paramString, paramzzif);
    localHandler.post(local4);
  }
  
  public void pause()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Native Ad DOES NOT support pause().");
    throw localIllegalStateException;
  }
  
  public void resume()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Native Ad DOES NOT support resume().");
    throw localIllegalStateException;
  }
  
  public void showInterstitial()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Interstitial is NOT supported by NativeAdManager.");
    throw localIllegalStateException;
  }
  
  public void zza(m paramm)
  {
    zzx.zzcD("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    this.zzpj.zzrC = paramm;
  }
  
  public void zza(zzh paramzzh)
  {
    Object localObject = this.zzpj.zzrq.zzKT;
    if (localObject != null)
    {
      localObject = zzr.zzbF().zzhh();
      AdSizeParcel localAdSizeParcel = this.zzpj.zzrp;
      zzif localzzif = this.zzpj.zzrq;
      ((zzax)localObject).zza(localAdSizeParcel, localzzif, paramzzh);
    }
  }
  
  public void zza(zzcf paramzzcf)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("CustomRendering is NOT supported by NativeAdManager.");
    throw localIllegalStateException;
  }
  
  public void zza(zzgd paramzzgd)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("In App Purchase is NOT supported by NativeAdManager.");
    throw localIllegalStateException;
  }
  
  public void zza(zzif.zza paramzza, zzcb paramzzcb)
  {
    Object localObject1 = paramzza.zzrp;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.zzpj;
      localObject2 = paramzza.zzrp;
      ((zzs)localObject1).zzrp = ((AdSizeParcel)localObject2);
    }
    int i = paramzza.errorCode;
    int j = -2;
    if (i != j)
    {
      localObject1 = zzir.zzMc;
      localObject2 = new com/google/android/gms/ads/internal/zzp$1;
      ((zzp.1)localObject2).<init>(this, paramzza);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
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
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("AdRenderer: ");
      localObject2 = this.zzpj.zzro.getClass().getName();
      localObject1 = (String)localObject2;
      zzin.zzaI((String)localObject1);
    }
  }
  
  public void zza(List paramList)
  {
    zzx.zzcD("setNativeTemplates must be called on the main UI thread.");
    this.zzpj.zzrH = paramList;
  }
  
  protected boolean zza(AdRequestParcel paramAdRequestParcel, zzif paramzzif, boolean paramBoolean)
  {
    return this.zzpi.zzbw();
  }
  
  protected boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    zzg localzzg = null;
    zza(null);
    Object localObject1 = this.zzpj;
    boolean bool = ((zzs)localObject1).zzbW();
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Native ad DOES NOT have custom rendering mode.");
      throw ((Throwable)localObject1);
    }
    bool = paramzzif2.zzHT;
    Object localObject3;
    Object localObject4;
    if (bool)
    {
      try
      {
        localObject1 = paramzzif2.zzCq;
        localObject1 = ((zzey)localObject1).zzeF();
        localObject3 = paramzzif2.zzCq;
        localObject3 = ((zzey)localObject3).zzeG();
        if (localObject1 == null) {
          break label157;
        }
        localObject3 = zza((zzfb)localObject1);
        localzzg = new com/google/android/gms/ads/internal/formats/zzg;
        localObject4 = this.zzpj;
        localObject4 = ((zzs)localObject4).context;
        localObject5 = this.zzpj;
        localObject5 = ((zzs)localObject5).zzrk;
        localzzg.<init>((Context)localObject4, this, (zzan)localObject5, (zzfb)localObject1);
        ((com.google.android.gms.ads.internal.formats.zzd)localObject3).zzb(localzzg);
        zza((com.google.android.gms.ads.internal.formats.zzd)localObject3);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          Object localObject5;
          localObject3 = "Failed to get native ad mapper";
          zzin.zzd((String)localObject3, localRemoteException);
          continue;
          localObject2 = "No matching mapper for retrieved native ad template.";
          zzin.zzaK((String)localObject2);
          bool = false;
          localObject2 = null;
          zzf(0);
          bool = false;
          localObject2 = null;
        }
      }
      bool = super.zza(paramzzif1, paramzzif2);
    }
    for (;;)
    {
      return bool;
      label157:
      if (localObject3 != null)
      {
        localObject1 = zza((zzfc)localObject3);
        localzzg = new com/google/android/gms/ads/internal/formats/zzg;
        localObject4 = this.zzpj;
        localObject4 = ((zzs)localObject4).context;
        localObject5 = this.zzpj;
        localObject5 = ((zzs)localObject5).zzrk;
        localzzg.<init>((Context)localObject4, this, (zzan)localObject5, (zzfc)localObject3);
        ((zze)localObject1).zzb(localzzg);
        zza((zze)localObject1);
        break;
      }
      localObject3 = paramzzif2.zzLa;
      bool = localObject3 instanceof zze;
      if (bool)
      {
        localObject2 = this.zzpj.zzrA;
        if (localObject2 != null)
        {
          localObject2 = (zze)paramzzif2.zzLa;
          zza((zze)localObject2);
          break;
        }
      }
      bool = localObject3 instanceof com.google.android.gms.ads.internal.formats.zzd;
      if (bool)
      {
        localObject2 = this.zzpj.zzrz;
        if (localObject2 != null)
        {
          localObject2 = (com.google.android.gms.ads.internal.formats.zzd)paramzzif2.zzLa;
          zza((com.google.android.gms.ads.internal.formats.zzd)localObject2);
          break;
        }
      }
      bool = localObject3 instanceof zzf;
      if (bool)
      {
        localObject2 = this.zzpj.zzrC;
        if (localObject2 != null)
        {
          localObject4 = this.zzpj.zzrC;
          localObject2 = localObject3;
          localObject2 = ((zzf)localObject3).getCustomTemplateId();
          localObject2 = ((m)localObject4).get(localObject2);
          if (localObject2 != null)
          {
            localObject3 = (zzf)localObject3;
            localObject2 = ((zzf)localObject3).getCustomTemplateId();
            zza(paramzzif2, (String)localObject2);
            break;
          }
        }
      }
      zzin.zzaK("No matching listener for retrieved native ad template.");
      zzf(0);
      bool = false;
      Object localObject2 = null;
    }
  }
  
  public void zzb(m paramm)
  {
    zzx.zzcD("setOnCustomClickListener must be called on the main UI thread.");
    this.zzpj.zzrB = paramm;
  }
  
  public void zzb(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    zzx.zzcD("setNativeAdOptions must be called on the main UI thread.");
    this.zzpj.zzrD = paramNativeAdOptionsParcel;
  }
  
  public void zzb(zzcr paramzzcr)
  {
    zzx.zzcD("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
    this.zzpj.zzrz = paramzzcr;
  }
  
  public void zzb(zzcs paramzzcs)
  {
    zzx.zzcD("setOnContentAdLoadedListener must be called on the main UI thread.");
    this.zzpj.zzrA = paramzzcs;
  }
  
  public m zzbv()
  {
    zzx.zzcD("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    return this.zzpj.zzrC;
  }
  
  public zzct zzs(String paramString)
  {
    zzx.zzcD("getOnCustomClickListener must be called on the main UI thread.");
    return (zzct)this.zzpj.zzrB.get(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */