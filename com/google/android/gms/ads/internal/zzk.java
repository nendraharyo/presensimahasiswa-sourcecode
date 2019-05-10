package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzdj;
import com.google.android.gms.internal.zzdn;
import com.google.android.gms.internal.zzdn.zza;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjr;
import java.util.List;

public class zzk
  extends zzc
  implements zzdj, zzdn.zza
{
  protected transient boolean zzqc = false;
  private boolean zzqd;
  private float zzqe;
  private String zzqf;
  
  public zzk(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramzzex, paramVersionInfoParcel, paramzzd);
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("background");
    int i = hashCode();
    localObject = i + "." + "png";
    this.zzqf = ((String)localObject);
  }
  
  private void zzb(Bundle paramBundle)
  {
    zzir localzzir = zzr.zzbC();
    Context localContext = this.zzpj.context;
    String str = this.zzpj.zzrl.afmaVersion;
    localzzir.zzb(localContext, str, "gmob-apps", paramBundle, false);
  }
  
  public void showInterstitial()
  {
    zzx.zzcD("showInterstitial must be called on the main UI thread.");
    Object localObject1 = this.zzpj.zzrq;
    if (localObject1 == null)
    {
      localObject1 = "The interstitial has not loaded.";
      zzin.zzaK((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = (Boolean)zzbt.zzwN.get();
      boolean bool1 = ((Boolean)localObject1).booleanValue();
      if (bool1)
      {
        localObject1 = this.zzpj.context.getApplicationContext();
        if (localObject1 == null) {
          break label271;
        }
      }
      boolean bool2;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      label271:
      for (localObject1 = this.zzpj.context.getApplicationContext().getPackageName();; localObject2 = this.zzpj.context.getPackageName())
      {
        bool2 = this.zzqc;
        if (!bool2)
        {
          zzin.zzaK("It is not recommended to show an interstitial before onAdLoaded completes.");
          localObject3 = new android/os/Bundle;
          ((Bundle)localObject3).<init>();
          ((Bundle)localObject3).putString("appid", (String)localObject1);
          localObject4 = "action";
          localObject5 = "show_interstitial_before_load_finish";
          ((Bundle)localObject3).putString((String)localObject4, (String)localObject5);
          zzb((Bundle)localObject3);
        }
        localObject3 = zzr.zzbC();
        localObject4 = this.zzpj.context;
        bool2 = ((zzir)localObject3).zzO((Context)localObject4);
        if (!bool2)
        {
          zzin.zzaK("It is not recommended to show an interstitial when app is not in foreground.");
          localObject3 = new android/os/Bundle;
          ((Bundle)localObject3).<init>();
          ((Bundle)localObject3).putString("appid", (String)localObject1);
          localObject1 = "action";
          localObject4 = "show_interstitial_app_not_in_foreground";
          ((Bundle)localObject3).putString((String)localObject1, (String)localObject4);
          zzb((Bundle)localObject3);
        }
        localObject1 = this.zzpj;
        bool1 = ((zzs)localObject1).zzbX();
        if (bool1) {
          break;
        }
        localObject1 = this.zzpj.zzrq;
        bool1 = ((zzif)localObject1).zzHT;
        if (!bool1) {
          break label285;
        }
        try
        {
          localObject1 = this.zzpj;
          localObject1 = ((zzs)localObject1).zzrq;
          localObject1 = ((zzif)localObject1).zzCq;
          ((zzey)localObject1).showInterstitial();
        }
        catch (RemoteException localRemoteException)
        {
          localObject3 = "Could not show interstitial.";
          zzin.zzd((String)localObject3, localRemoteException);
          zzbp();
        }
        break;
      }
      label285:
      Object localObject2 = this.zzpj.zzrq.zzED;
      if (localObject2 == null)
      {
        localObject2 = "The interstitial failed to load.";
        zzin.zzaK((String)localObject2);
      }
      else
      {
        localObject2 = this.zzpj.zzrq.zzED;
        bool1 = ((zzjp)localObject2).zzhY();
        if (bool1)
        {
          localObject2 = "The interstitial is already showing.";
          zzin.zzaK((String)localObject2);
        }
        else
        {
          localObject2 = this.zzpj.zzrq.zzED;
          bool2 = true;
          ((zzjp)localObject2).zzD(bool2);
          localObject2 = this.zzpj.zzrq.zzKT;
          if (localObject2 != null)
          {
            localObject2 = this.zzpl;
            localObject3 = this.zzpj.zzrp;
            localObject4 = this.zzpj.zzrq;
            ((zzax)localObject2).zza((AdSizeParcel)localObject3, (zzif)localObject4);
          }
          localObject2 = this.zzpj;
          bool1 = ((zzs)localObject2).zzql;
          if (bool1)
          {
            localObject2 = zzr.zzbC();
            localObject3 = this.zzpj.context;
            localObject2 = ((zzir)localObject2).zzP((Context)localObject3);
          }
          for (localObject3 = localObject2;; localObject3 = null)
          {
            localObject2 = (Boolean)zzbt.zzxe.get();
            bool1 = ((Boolean)localObject2).booleanValue();
            if ((!bool1) || (localObject3 == null)) {
              break label505;
            }
            localObject2 = new com/google/android/gms/ads/internal/zzk$zzb;
            localObject4 = this.zzqf;
            ((zzk.zzb)localObject2).<init>(this, (Bitmap)localObject3, (String)localObject4);
            ((zzk.zzb)localObject2).zzhn();
            break;
            bool2 = false;
          }
          label505:
          localObject2 = new com/google/android/gms/ads/internal/InterstitialAdParameterParcel;
          bool2 = this.zzpj.zzql;
          boolean bool3 = zzbo();
          localObject5 = null;
          zzjp localzzjp = null;
          ((InterstitialAdParameterParcel)localObject2).<init>(bool2, bool3, null, false, 0.0F);
          localObject3 = this.zzpj.zzrq.zzED;
          int j = ((zzjp)localObject3).getRequestedOrientation();
          int i = -1;
          if (j == i)
          {
            localObject3 = this.zzpj.zzrq;
            j = ((zzif)localObject3).orientation;
          }
          localObject3 = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
          localzzjp = this.zzpj.zzrq.zzED;
          VersionInfoParcel localVersionInfoParcel = this.zzpj.zzrl;
          String str = this.zzpj.zzrq.zzHY;
          localObject4 = this;
          localObject5 = this;
          ((AdOverlayInfoParcel)localObject3).<init>(this, this, this, localzzjp, j, localVersionInfoParcel, str, (InterstitialAdParameterParcel)localObject2);
          localObject2 = zzr.zzbA();
          localObject4 = this.zzpj.context;
          ((com.google.android.gms.ads.internal.overlay.zze)localObject2).zza((Context)localObject4, (AdOverlayInfoParcel)localObject3);
        }
      }
    }
  }
  
  protected zzjp zza(zzif.zza paramzza, zze paramzze)
  {
    Object localObject1 = zzr.zzbD();
    Object localObject2 = this.zzpj.context;
    AdSizeParcel localAdSizeParcel = this.zzpj.zzrp;
    zzan localzzan = this.zzpj.zzrk;
    Object localObject3 = this.zzpj.zzrl;
    Object localObject4 = this.zzpe;
    Object localObject5 = this.zzpm;
    zzjp localzzjp = ((zzjr)localObject1).zza((Context)localObject2, localAdSizeParcel, false, false, localzzan, (VersionInfoParcel)localObject3, (zzcb)localObject4, (zzd)localObject5);
    localObject1 = localzzjp.zzhU();
    boolean bool = ((Boolean)zzbt.zzwv.get()).booleanValue();
    localObject2 = this;
    localObject3 = this;
    localObject4 = this;
    localObject5 = paramzze;
    ((zzjq)localObject1).zzb(this, null, this, this, bool, this, this, paramzze, null);
    zza(localzzjp);
    localObject1 = paramzza.zzLd.zzHI;
    localzzjp.zzaM((String)localObject1);
    zzdn.zza(localzzjp, this);
    return localzzjp;
  }
  
  public void zza(boolean paramBoolean, float paramFloat)
  {
    this.zzqd = paramBoolean;
    this.zzqe = paramFloat;
  }
  
  public boolean zza(AdRequestParcel paramAdRequestParcel, zzcb paramzzcb)
  {
    zzif localzzif = this.zzpj.zzrq;
    boolean bool;
    if (localzzif != null)
    {
      zzin.zzaK("An interstitial is already loading. Aborting.");
      bool = false;
      localzzif = null;
    }
    for (;;)
    {
      return bool;
      bool = super.zza(paramAdRequestParcel, paramzzcb);
    }
  }
  
  protected boolean zza(AdRequestParcel paramAdRequestParcel, zzif paramzzif, boolean paramBoolean)
  {
    Object localObject = this.zzpj;
    boolean bool = ((zzs)localObject).zzbW();
    if (bool)
    {
      localObject = paramzzif.zzED;
      if (localObject != null)
      {
        localObject = zzr.zzbE();
        zzjp localzzjp = paramzzif.zzED;
        ((zzis)localObject).zzi(localzzjp);
      }
    }
    return this.zzpi.zzbw();
  }
  
  public boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    boolean bool = super.zza(paramzzif1, paramzzif2);
    Object localObject;
    if (!bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = this.zzpj;
      bool = ((zzs)localObject).zzbW();
      if (!bool)
      {
        localObject = this.zzpj.zzrK;
        if (localObject != null)
        {
          localObject = paramzzif2.zzKT;
          if (localObject != null)
          {
            localObject = this.zzpl;
            AdSizeParcel localAdSizeParcel = this.zzpj.zzrp;
            View localView = this.zzpj.zzrK;
            ((zzax)localObject).zza(localAdSizeParcel, paramzzif2, localView);
          }
        }
      }
      bool = true;
    }
  }
  
  protected void zzaQ()
  {
    zzbp();
    super.zzaQ();
  }
  
  protected void zzaT()
  {
    super.zzaT();
    this.zzqc = true;
  }
  
  public void zzaX()
  {
    recordImpression();
    super.zzaX();
  }
  
  public void zzb(RewardItemParcel paramRewardItemParcel)
  {
    Object localObject = this.zzpj.zzrq;
    if (localObject != null)
    {
      localObject = this.zzpj.zzrq.zzIl;
      if (localObject != null)
      {
        localObject = zzr.zzbC();
        Context localContext = this.zzpj.context;
        String str = this.zzpj.zzrl.afmaVersion;
        List localList = this.zzpj.zzrq.zzIl;
        ((zzir)localObject).zza(localContext, str, localList);
      }
      localObject = this.zzpj.zzrq.zzIj;
      if (localObject != null)
      {
        localObject = this.zzpj.zzrq;
        paramRewardItemParcel = ((zzif)localObject).zzIj;
      }
    }
    zza(paramRewardItemParcel);
  }
  
  protected boolean zzbo()
  {
    boolean bool1 = false;
    Object localObject1 = this.zzpj.context;
    boolean bool2 = localObject1 instanceof Activity;
    if (!bool2) {}
    do
    {
      do
      {
        return bool1;
        localObject1 = ((Activity)this.zzpj.context).getWindow();
      } while (localObject1 == null);
      localObject2 = ((Window)localObject1).getDecorView();
    } while (localObject2 == null);
    Object localObject2 = new android/graphics/Rect;
    ((Rect)localObject2).<init>();
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    View localView = ((Window)localObject1).getDecorView();
    localView.getGlobalVisibleRect((Rect)localObject2, null);
    localObject1 = ((Window)localObject1).getDecorView();
    ((View)localObject1).getWindowVisibleDisplayFrame(localRect);
    int i = ((Rect)localObject2).bottom;
    if (i != 0)
    {
      i = localRect.bottom;
      if (i != 0)
      {
        i = ((Rect)localObject2).top;
        int j = localRect.top;
        if (i == j) {
          i = 1;
        }
      }
    }
    for (;;)
    {
      bool1 = i;
      break;
      i = 0;
      localObject1 = null;
    }
  }
  
  public void zzbp()
  {
    Object localObject = new com/google/android/gms/ads/internal/zzk$zza;
    String str = this.zzqf;
    ((zzk.zza)localObject).<init>(this, str);
    ((zzk.zza)localObject).zzhn();
    localObject = this.zzpj;
    boolean bool = ((zzs)localObject).zzbW();
    if (bool)
    {
      this.zzpj.zzbT();
      localObject = this.zzpj;
      str = null;
      ((zzs)localObject).zzrq = null;
      localObject = this.zzpj;
      ((zzs)localObject).zzql = false;
      this.zzqc = false;
    }
  }
  
  public void zzbq()
  {
    Object localObject = this.zzpj.zzrq;
    if (localObject != null)
    {
      localObject = this.zzpj.zzrq.zzKX;
      if (localObject != null)
      {
        localObject = zzr.zzbC();
        Context localContext = this.zzpj.context;
        String str = this.zzpj.zzrl.afmaVersion;
        List localList = this.zzpj.zzrq.zzKX;
        ((zzir)localObject).zza(localContext, str, localList);
      }
    }
    zzaU();
  }
  
  public void zzd(boolean paramBoolean)
  {
    this.zzpj.zzql = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */