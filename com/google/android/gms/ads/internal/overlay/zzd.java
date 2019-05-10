package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzdb;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzfv.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjq.zza;
import com.google.android.gms.internal.zzjr;
import java.util.Collections;
import java.util.Map;

public class zzd
  extends zzfv.zza
  implements zzs
{
  static final int zzEg = Color.argb(0, 0, 0, 0);
  private final Activity mActivity;
  RelativeLayout zzDm;
  AdOverlayInfoParcel zzEh;
  zzd.zzc zzEi;
  zzo zzEj;
  boolean zzEk = false;
  FrameLayout zzEl;
  WebChromeClient.CustomViewCallback zzEm;
  boolean zzEn = false;
  boolean zzEo = false;
  boolean zzEp = false;
  int zzEq = 0;
  zzl zzEr;
  private boolean zzEs;
  private boolean zzEt = false;
  private boolean zzEu = true;
  zzjp zzpD;
  
  public zzd(Activity paramActivity)
  {
    this.mActivity = paramActivity;
    zzq localzzq = new com/google/android/gms/ads/internal/overlay/zzq;
    localzzq.<init>();
    this.zzEr = localzzq;
  }
  
  public void close()
  {
    this.zzEq = 2;
    this.mActivity.finish();
  }
  
  public void onBackPressed()
  {
    this.zzEq = 0;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 1;
    int j = 3;
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2;
    if (paramBundle != null)
    {
      localObject2 = "com.google.android.gms.ads.internal.overlay.hasResumed";
      bool1 = paramBundle.getBoolean((String)localObject2, false);
    }
    this.zzEn = bool1;
    try
    {
      localObject1 = this.mActivity;
      localObject1 = ((Activity)localObject1).getIntent();
      localObject1 = AdOverlayInfoParcel.zzb((Intent)localObject1);
      this.zzEh = ((AdOverlayInfoParcel)localObject1);
      localObject1 = this.zzEh;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/ads/internal/overlay/zzd$zza;
        localObject2 = "Could not get info for ad overlay.";
        ((zzd.zza)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    catch (zzd.zza localzza)
    {
      zzin.zzaK(localzza.getMessage());
      this.zzEq = j;
      localObject1 = this.mActivity;
      ((Activity)localObject1).finish();
    }
    for (;;)
    {
      return;
      localObject1 = this.zzEh;
      localObject1 = ((AdOverlayInfoParcel)localObject1).zzrl;
      int k = ((VersionInfoParcel)localObject1).zzNa;
      int i2 = 7500000;
      if (k > i2)
      {
        k = 3;
        this.zzEq = k;
      }
      localObject1 = this.mActivity;
      localObject1 = ((Activity)localObject1).getIntent();
      boolean bool2;
      if (localObject1 != null)
      {
        localObject1 = this.mActivity;
        localObject1 = ((Activity)localObject1).getIntent();
        localObject2 = "shouldCallOnOverlayOpened";
        boolean bool5 = true;
        bool2 = ((Intent)localObject1).getBooleanExtra((String)localObject2, bool5);
        this.zzEu = bool2;
      }
      localObject1 = this.zzEh;
      localObject1 = ((AdOverlayInfoParcel)localObject1).zzEM;
      if (localObject1 != null)
      {
        localObject1 = this.zzEh;
        localObject1 = ((AdOverlayInfoParcel)localObject1).zzEM;
        bool2 = ((InterstitialAdParameterParcel)localObject1).zzql;
      }
      Object localObject3;
      for (this.zzEo = bool2;; this.zzEo = false)
      {
        localObject1 = zzbt.zzxe;
        localObject1 = ((zzbp)localObject1).get();
        localObject1 = (Boolean)localObject1;
        bool2 = ((Boolean)localObject1).booleanValue();
        if (bool2)
        {
          bool2 = this.zzEo;
          if (bool2)
          {
            localObject1 = this.zzEh;
            localObject1 = ((AdOverlayInfoParcel)localObject1).zzEM;
            localObject1 = ((InterstitialAdParameterParcel)localObject1).zzqn;
            if (localObject1 != null)
            {
              localObject1 = new com/google/android/gms/ads/internal/overlay/zzd$zzd;
              i2 = 0;
              localObject2 = null;
              ((zzd.zzd)localObject1).<init>(this, null);
              ((zzd.zzd)localObject1).zzhn();
            }
          }
        }
        if (paramBundle == null)
        {
          localObject1 = this.zzEh;
          localObject1 = ((AdOverlayInfoParcel)localObject1).zzEC;
          if (localObject1 != null)
          {
            bool2 = this.zzEu;
            if (bool2)
            {
              localObject1 = this.zzEh;
              localObject1 = ((AdOverlayInfoParcel)localObject1).zzEC;
              ((zzg)localObject1).zzaX();
            }
          }
          localObject1 = this.zzEh;
          m = ((AdOverlayInfoParcel)localObject1).zzEJ;
          if (m != i)
          {
            localObject1 = this.zzEh;
            localObject1 = ((AdOverlayInfoParcel)localObject1).zzEB;
            if (localObject1 != null)
            {
              localObject1 = this.zzEh;
              localObject1 = ((AdOverlayInfoParcel)localObject1).zzEB;
              ((com.google.android.gms.ads.internal.client.zza)localObject1).onAdClicked();
            }
          }
        }
        localObject1 = new com/google/android/gms/ads/internal/overlay/zzd$zzb;
        localObject2 = this.mActivity;
        localObject3 = this.zzEh;
        localObject3 = ((AdOverlayInfoParcel)localObject3).zzEL;
        ((zzd.zzb)localObject1).<init>((Context)localObject2, (String)localObject3);
        this.zzDm = ((RelativeLayout)localObject1);
        localObject1 = this.zzDm;
        i2 = 1000;
        ((RelativeLayout)localObject1).setId(i2);
        localObject1 = this.zzEh;
        m = ((AdOverlayInfoParcel)localObject1).zzEJ;
        switch (m)
        {
        default: 
          localObject1 = new com/google/android/gms/ads/internal/overlay/zzd$zza;
          localObject2 = "Could not determine ad overlay type.";
          ((zzd.zza)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
          m = 0;
          localObject1 = null;
        }
      }
      int m = 0;
      localObject1 = null;
      zzx(false);
      continue;
      localObject1 = new com/google/android/gms/ads/internal/overlay/zzd$zzc;
      localObject2 = this.zzEh;
      localObject2 = ((AdOverlayInfoParcel)localObject2).zzED;
      ((zzd.zzc)localObject1).<init>((zzjp)localObject2);
      this.zzEi = ((zzd.zzc)localObject1);
      m = 0;
      localObject1 = null;
      zzx(false);
      continue;
      m = 1;
      zzx(m);
      continue;
      boolean bool3 = this.zzEn;
      if (bool3)
      {
        int n = 3;
        this.zzEq = n;
        localObject1 = this.mActivity;
        ((Activity)localObject1).finish();
      }
      else
      {
        localObject1 = zzr.zzbz();
        localObject2 = this.mActivity;
        localObject3 = this.zzEh;
        localObject3 = ((AdOverlayInfoParcel)localObject3).zzEA;
        Object localObject4 = this.zzEh;
        localObject4 = ((AdOverlayInfoParcel)localObject4).zzEI;
        boolean bool4 = ((zza)localObject1).zza((Context)localObject2, (AdLauncherIntentInfoParcel)localObject3, (zzp)localObject4);
        if (!bool4)
        {
          int i1 = 3;
          this.zzEq = i1;
          localObject1 = this.mActivity;
          ((Activity)localObject1).finish();
        }
      }
    }
  }
  
  public void onDestroy()
  {
    Object localObject = this.zzpD;
    if (localObject != null)
    {
      localObject = this.zzDm;
      View localView = this.zzpD.getView();
      ((RelativeLayout)localObject).removeView(localView);
    }
    zzfp();
  }
  
  public void onPause()
  {
    this.zzEr.pause();
    zzfl();
    Object localObject = this.zzEh.zzEC;
    if (localObject != null)
    {
      localObject = this.zzEh.zzEC;
      ((zzg)localObject).onPause();
    }
    localObject = this.zzpD;
    if (localObject != null)
    {
      localObject = this.mActivity;
      boolean bool = ((Activity)localObject).isFinishing();
      if (bool)
      {
        localObject = this.zzEi;
        if (localObject != null) {}
      }
      else
      {
        localObject = zzr.zzbE();
        zzjp localzzjp = this.zzpD;
        ((zzis)localObject).zzi(localzzjp);
      }
    }
    zzfp();
  }
  
  public void onRestart() {}
  
  public void onResume()
  {
    Object localObject = this.zzEh;
    if (localObject != null)
    {
      localObject = this.zzEh;
      int i = ((AdOverlayInfoParcel)localObject).zzEJ;
      int k = 4;
      if (i == k)
      {
        boolean bool1 = this.zzEn;
        if (!bool1) {
          break label129;
        }
        int j = 3;
        this.zzEq = j;
        localObject = this.mActivity;
        ((Activity)localObject).finish();
      }
    }
    localObject = this.zzEh.zzEC;
    if (localObject != null)
    {
      localObject = this.zzEh.zzEC;
      ((zzg)localObject).onResume();
    }
    localObject = this.zzpD;
    boolean bool2;
    if (localObject != null)
    {
      localObject = this.zzpD;
      bool2 = ((zzjp)localObject).isDestroyed();
      if (!bool2)
      {
        localObject = zzr.zzbE();
        zzjp localzzjp = this.zzpD;
        ((zzis)localObject).zzj(localzzjp);
      }
    }
    for (;;)
    {
      this.zzEr.resume();
      return;
      label129:
      bool2 = true;
      this.zzEn = bool2;
      break;
      localObject = "The webview does not exit. Ignoring action.";
      zzin.zzaK((String)localObject);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    boolean bool = this.zzEn;
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", bool);
  }
  
  public void onStart() {}
  
  public void onStop()
  {
    zzfp();
  }
  
  public void setRequestedOrientation(int paramInt)
  {
    this.mActivity.setRequestedOrientation(paramInt);
  }
  
  public void zza(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    int i = -1;
    Object localObject1 = new android/widget/FrameLayout;
    Object localObject2 = this.mActivity;
    ((FrameLayout)localObject1).<init>((Context)localObject2);
    this.zzEl = ((FrameLayout)localObject1);
    this.zzEl.setBackgroundColor(-16777216);
    this.zzEl.addView(paramView, i, i);
    localObject1 = this.mActivity;
    localObject2 = this.zzEl;
    ((Activity)localObject1).setContentView((View)localObject2);
    zzaD();
    this.zzEm = paramCustomViewCallback;
    this.zzEk = true;
  }
  
  public void zza(boolean paramBoolean1, boolean paramBoolean2)
  {
    zzo localzzo = this.zzEj;
    if (localzzo != null)
    {
      localzzo = this.zzEj;
      localzzo.zza(paramBoolean1, paramBoolean2);
    }
  }
  
  public void zzaD()
  {
    this.zzEs = true;
  }
  
  public void zzfl()
  {
    Object localObject = this.zzEh;
    if (localObject != null)
    {
      boolean bool = this.zzEk;
      if (bool)
      {
        localObject = this.zzEh;
        int i = ((AdOverlayInfoParcel)localObject).orientation;
        setRequestedOrientation(i);
      }
    }
    localObject = this.zzEl;
    if (localObject != null)
    {
      localObject = this.mActivity;
      RelativeLayout localRelativeLayout = this.zzDm;
      ((Activity)localObject).setContentView(localRelativeLayout);
      zzaD();
      localObject = this.zzEl;
      ((FrameLayout)localObject).removeAllViews();
      this.zzEl = null;
    }
    localObject = this.zzEm;
    if (localObject != null)
    {
      localObject = this.zzEm;
      ((WebChromeClient.CustomViewCallback)localObject).onCustomViewHidden();
      this.zzEm = null;
    }
    this.zzEk = false;
  }
  
  public void zzfm()
  {
    this.zzEq = 1;
    this.mActivity.finish();
  }
  
  public boolean zzfn()
  {
    boolean bool1 = true;
    zzjp localzzjp = null;
    this.zzEq = 0;
    Object localObject = this.zzpD;
    if (localObject == null) {}
    label89:
    for (;;)
    {
      return bool1;
      localObject = this.zzpD;
      boolean bool2 = ((zzjp)localObject).zzfL();
      if (bool2)
      {
        localObject = this.zzEr;
        bool2 = ((zzl)localObject).zzfL();
        if (!bool2) {}
      }
      for (;;)
      {
        if (bool1) {
          break label89;
        }
        localzzjp = this.zzpD;
        localObject = "onbackblocked";
        Map localMap = Collections.emptyMap();
        localzzjp.zza((String)localObject, localMap);
        break;
        bool1 = false;
      }
    }
  }
  
  public void zzfo()
  {
    RelativeLayout localRelativeLayout = this.zzDm;
    zzo localzzo = this.zzEj;
    localRelativeLayout.removeView(localzzo);
    zzw(true);
  }
  
  protected void zzfp()
  {
    Object localObject1 = this.mActivity;
    boolean bool = ((Activity)localObject1).isFinishing();
    if (bool)
    {
      bool = this.zzEt;
      if (!bool) {}
    }
    else
    {
      return;
    }
    bool = true;
    this.zzEt = bool;
    localObject1 = this.zzpD;
    Object localObject2;
    if (localObject1 != null)
    {
      int i = this.zzEq;
      zzy(i);
      localObject1 = this.zzDm;
      localObject2 = this.zzpD.getView();
      ((RelativeLayout)localObject1).removeView((View)localObject2);
      localObject1 = this.zzEi;
      if (localObject1 == null) {
        break label217;
      }
      localObject1 = this.zzpD;
      localObject2 = this.zzEi.context;
      ((zzjp)localObject1).setContext((Context)localObject2);
      this.zzpD.zzD(false);
      localObject1 = this.zzEi.zzEx;
      localObject2 = this.zzpD.getView();
      zzd.zzc localzzc = this.zzEi;
      int j = localzzc.index;
      ViewGroup.LayoutParams localLayoutParams = this.zzEi.zzEw;
      ((ViewGroup)localObject1).addView((View)localObject2, j, localLayoutParams);
      this.zzEi = null;
    }
    for (;;)
    {
      this.zzpD = null;
      localObject1 = this.zzEh;
      if (localObject1 != null)
      {
        localObject1 = this.zzEh.zzEC;
        if (localObject1 != null)
        {
          localObject1 = this.zzEh.zzEC;
          ((zzg)localObject1).zzaW();
        }
      }
      localObject1 = this.zzEr;
      ((zzl)localObject1).destroy();
      break;
      label217:
      localObject1 = this.mActivity.getApplicationContext();
      if (localObject1 != null)
      {
        localObject1 = this.zzpD;
        localObject2 = this.mActivity.getApplicationContext();
        ((zzjp)localObject1).setContext((Context)localObject2);
      }
    }
  }
  
  public void zzfq()
  {
    boolean bool = this.zzEp;
    if (bool)
    {
      bool = false;
      this.zzEp = false;
      zzfr();
    }
  }
  
  protected void zzfr()
  {
    this.zzpD.zzfr();
  }
  
  public void zzg(zzjp paramzzjp, Map paramMap)
  {
    this.zzEr.zzg(paramzzjp, paramMap);
  }
  
  public void zzw(boolean paramBoolean)
  {
    int i = -2;
    Object localObject1;
    Object localObject2;
    if (paramBoolean)
    {
      j = 50;
      localObject1 = new com/google/android/gms/ads/internal/overlay/zzo;
      localObject2 = this.mActivity;
      ((zzo)localObject1).<init>((Context)localObject2, j, this);
      this.zzEj = ((zzo)localObject1);
      localObject1 = new android/widget/RelativeLayout$LayoutParams;
      ((RelativeLayout.LayoutParams)localObject1).<init>(i, i);
      j = 10;
      ((RelativeLayout.LayoutParams)localObject1).addRule(j);
      if (!paramBoolean) {
        break label121;
      }
    }
    label121:
    for (int j = 11;; j = 9)
    {
      ((RelativeLayout.LayoutParams)localObject1).addRule(j);
      Object localObject3 = this.zzEj;
      boolean bool = this.zzEh.zzEG;
      ((zzo)localObject3).zza(paramBoolean, bool);
      localObject3 = this.zzDm;
      localObject2 = this.zzEj;
      ((RelativeLayout)localObject3).addView((View)localObject2, (ViewGroup.LayoutParams)localObject1);
      return;
      j = 32;
      break;
    }
  }
  
  protected void zzx(boolean paramBoolean)
  {
    boolean bool1 = this.zzEs;
    int k;
    if (!bool1)
    {
      localObject1 = this.mActivity;
      k = 1;
      ((Activity)localObject1).requestWindowFeature(k);
    }
    Object localObject1 = this.mActivity;
    Object localObject2 = ((Activity)localObject1).getWindow();
    if (localObject2 == null)
    {
      localObject1 = new com/google/android/gms/ads/internal/overlay/zzd$zza;
      ((zzd.zza)localObject1).<init>("Invalid activity, no window available.");
      throw ((Throwable)localObject1);
    }
    bool1 = this.zzEo;
    int n;
    if (bool1)
    {
      localObject1 = this.zzEh.zzEM;
      if (localObject1 != null)
      {
        localObject1 = this.zzEh.zzEM;
        bool1 = ((InterstitialAdParameterParcel)localObject1).zzqm;
        if (!bool1) {}
      }
    }
    else
    {
      i = 1024;
      n = 1024;
      ((Window)localObject2).setFlags(i, n);
    }
    boolean bool5 = this.zzEh.zzED.zzhU().zzcv();
    int i = 0;
    localObject1 = null;
    this.zzEp = false;
    Object localObject3;
    label199:
    boolean bool2;
    label298:
    Object localObject4;
    Object localObject5;
    Object localObject6;
    String str;
    Object localObject7;
    boolean bool7;
    label541:
    label568:
    int m;
    int i1;
    if (bool5)
    {
      localObject1 = this.zzEh;
      i = ((AdOverlayInfoParcel)localObject1).orientation;
      localObject3 = zzr.zzbE();
      n = ((zzis)localObject3).zzhv();
      if (i != n) {
        break label799;
      }
      localObject1 = this.mActivity.getResources().getConfiguration();
      i = ((Configuration)localObject1).orientation;
      n = 1;
      if (i == n)
      {
        i = 1;
        this.zzEp = i;
      }
    }
    else
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = "Delay onShow to next orientation change: ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      boolean bool4 = this.zzEp;
      zzin.zzaI(bool4);
      i = this.zzEh.orientation;
      setRequestedOrientation(i);
      localObject1 = zzr.zzbE();
      bool2 = ((zzis)localObject1).zza((Window)localObject2);
      if (bool2)
      {
        localObject1 = "Hardware acceleration on the AdActivity window enabled.";
        zzin.zzaI((String)localObject1);
      }
      bool2 = this.zzEo;
      if (bool2) {
        break label869;
      }
      localObject1 = this.zzDm;
      k = -16777216;
      ((RelativeLayout)localObject1).setBackgroundColor(k);
      localObject1 = this.mActivity;
      localObject2 = this.zzDm;
      ((Activity)localObject1).setContentView((View)localObject2);
      zzaD();
      if (!paramBoolean) {
        break label971;
      }
      localObject1 = zzr.zzbD();
      localObject2 = this.mActivity;
      localObject3 = this.zzEh.zzED.zzaN();
      boolean bool6 = true;
      localObject4 = this.zzEh.zzrl;
      localObject5 = this.zzEh.zzED.zzhR();
      localObject1 = ((zzjr)localObject1).zza((Context)localObject2, (AdSizeParcel)localObject3, bool6, bool5, null, (VersionInfoParcel)localObject4, null, (com.google.android.gms.ads.internal.zzd)localObject5);
      this.zzpD = ((zzjp)localObject1);
      localObject6 = this.zzpD.zzhU();
      localObject4 = null;
      str = null;
      localObject5 = this.zzEh.zzEE;
      localObject7 = this.zzEh.zzEI;
      bool7 = true;
      zzdh localzzdh = this.zzEh.zzEK;
      zze localzze = this.zzEh.zzED.zzhU().zzig();
      ((zzjq)localObject6).zzb(null, null, (zzdb)localObject5, (zzp)localObject7, bool7, localzzdh, null, localzze, null);
      localObject1 = this.zzpD.zzhU();
      localObject2 = new com/google/android/gms/ads/internal/overlay/zzd$1;
      ((zzd.1)localObject2).<init>(this);
      ((zzjq)localObject1).zza((zzjq.zza)localObject2);
      localObject1 = this.zzEh.url;
      if (localObject1 == null) {
        break label888;
      }
      localObject1 = this.zzpD;
      localObject2 = this.zzEh.url;
      ((zzjp)localObject1).loadUrl((String)localObject2);
      localObject1 = this.zzEh.zzED;
      if (localObject1 != null)
      {
        localObject1 = this.zzEh.zzED;
        ((zzjp)localObject1).zzc(this);
      }
      this.zzpD.zzb(this);
      localObject1 = this.zzpD.getParent();
      if (localObject1 != null)
      {
        boolean bool3 = localObject1 instanceof ViewGroup;
        if (bool3)
        {
          localObject1 = (ViewGroup)localObject1;
          localObject2 = this.zzpD.getView();
          ((ViewGroup)localObject1).removeView((View)localObject2);
        }
      }
      bool2 = this.zzEo;
      if (bool2)
      {
        localObject1 = this.zzpD;
        m = zzEg;
        ((zzjp)localObject1).setBackgroundColor(m);
      }
      localObject1 = this.zzDm;
      localObject2 = this.zzpD.getView();
      i1 = -1;
      int i2 = -1;
      ((RelativeLayout)localObject1).addView((View)localObject2, i1, i2);
      if (!paramBoolean)
      {
        bool2 = this.zzEp;
        if (!bool2) {
          zzfr();
        }
      }
      zzw(bool5);
      localObject1 = this.zzpD;
      bool2 = ((zzjp)localObject1).zzhV();
      if (bool2)
      {
        bool2 = true;
        zza(bool5, bool2);
      }
      localObject1 = this.zzpD.zzhR();
      if (localObject1 == null) {
        break label1006;
      }
      localObject1 = ((com.google.android.gms.ads.internal.zzd)localObject1).zzpy;
      label751:
      if (localObject1 == null) {
        break label1013;
      }
      localObject2 = this.mActivity;
      localObject3 = this.zzpD;
      RelativeLayout localRelativeLayout = this.zzDm;
      localObject1 = ((zzm)localObject1).zza((Activity)localObject2, (zzjp)localObject3, localRelativeLayout);
      this.zzEr = ((zzl)localObject1);
    }
    for (;;)
    {
      return;
      bool2 = false;
      localObject1 = null;
      break;
      label799:
      localObject1 = this.zzEh;
      int j = ((AdOverlayInfoParcel)localObject1).orientation;
      localObject3 = zzr.zzbE();
      i1 = ((zzis)localObject3).zzhw();
      if (j != i1) {
        break label199;
      }
      localObject1 = this.mActivity.getResources().getConfiguration();
      j = ((Configuration)localObject1).orientation;
      i1 = 2;
      if (j == i1) {
        j = 1;
      }
      for (;;)
      {
        this.zzEp = j;
        break;
        j = 0;
        localObject1 = null;
      }
      label869:
      localObject1 = this.zzDm;
      m = zzEg;
      ((RelativeLayout)localObject1).setBackgroundColor(m);
      break label298;
      label888:
      localObject1 = this.zzEh.zzEH;
      if (localObject1 != null)
      {
        localObject6 = this.zzpD;
        localObject4 = this.zzEh.zzEF;
        localObject1 = this.zzEh;
        str = ((AdOverlayInfoParcel)localObject1).zzEH;
        localObject5 = "text/html";
        localObject7 = "UTF-8";
        bool7 = false;
        ((zzjp)localObject6).loadDataWithBaseURL((String)localObject4, str, (String)localObject5, (String)localObject7, null);
        break label541;
      }
      localObject1 = new com/google/android/gms/ads/internal/overlay/zzd$zza;
      ((zzd.zza)localObject1).<init>("No URL or HTML to display in ad overlay.");
      throw ((Throwable)localObject1);
      label971:
      localObject1 = this.zzEh.zzED;
      this.zzpD = ((zzjp)localObject1);
      localObject1 = this.zzpD;
      localObject2 = this.mActivity;
      ((zzjp)localObject1).setContext((Context)localObject2);
      break label568;
      label1006:
      j = 0;
      localObject1 = null;
      break label751;
      label1013:
      localObject1 = "Appstreaming controller is null.";
      zzin.zzaK((String)localObject1);
    }
  }
  
  protected void zzy(int paramInt)
  {
    this.zzpD.zzy(paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */