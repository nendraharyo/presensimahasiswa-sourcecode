package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.v4.h.m;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzaj;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzik;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zziz;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public final class zzs
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  public final Context context;
  boolean zzql = false;
  zzcs zzrA;
  m zzrB;
  m zzrC;
  NativeAdOptionsParcel zzrD;
  zzcf zzrE;
  zzd zzrF;
  private String zzrG;
  List zzrH;
  zzk zzrI;
  public zzik zzrJ = null;
  View zzrK = null;
  public int zzrL = 0;
  boolean zzrM = false;
  private HashSet zzrN = null;
  private int zzrO;
  private int zzrP;
  private zziz zzrQ;
  private boolean zzrR;
  private boolean zzrS;
  private boolean zzrT;
  final String zzri;
  public String zzrj;
  final zzan zzrk;
  public final VersionInfoParcel zzrl;
  zzs.zza zzrm;
  public zzim zzrn;
  public zzit zzro;
  public AdSizeParcel zzrp;
  public zzif zzrq;
  public zzif.zza zzrr;
  public zzig zzrs;
  zzp zzrt;
  zzq zzru;
  zzw zzrv;
  zzx zzrw;
  zzgd zzrx;
  zzgh zzry;
  zzcr zzrz;
  
  public zzs(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel)
  {
    this(paramContext, paramAdSizeParcel, paramString, paramVersionInfoParcel, null);
  }
  
  zzs(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel, zzan paramzzan)
  {
    this.zzrO = i;
    this.zzrP = i;
    this.zzrR = bool1;
    this.zzrS = bool1;
    this.zzrT = false;
    zzbt.initialize(paramContext);
    Object localObject1 = zzr.zzbF().zzhb();
    if (localObject1 != null)
    {
      localObject1 = zzbt.zzds();
      i = paramVersionInfoParcel.zzMZ;
      if (i != 0)
      {
        i = paramVersionInfoParcel.zzMZ;
        localObject2 = Integer.toString(i);
        ((List)localObject1).add(localObject2);
      }
      Object localObject2 = zzr.zzbF().zzhb();
      ((zzbv)localObject2).zzb((List)localObject1);
    }
    localObject1 = UUID.randomUUID().toString();
    this.zzri = ((String)localObject1);
    bool2 = paramAdSizeParcel.zzui;
    if (!bool2)
    {
      bool2 = paramAdSizeParcel.zzuk;
      if (!bool2) {}
    }
    else
    {
      this.zzrm = null;
      this.zzrp = paramAdSizeParcel;
      this.zzrj = paramString;
      this.context = paramContext;
      this.zzrl = paramVersionInfoParcel;
      if (paramzzan == null) {
        break label330;
      }
    }
    for (;;)
    {
      this.zzrk = paramzzan;
      localObject1 = new com/google/android/gms/internal/zziz;
      ((zziz)localObject1).<init>(200L);
      this.zzrQ = ((zziz)localObject1);
      localObject1 = new android/support/v4/h/m;
      ((m)localObject1).<init>();
      this.zzrC = ((m)localObject1);
      return;
      localObject1 = new com/google/android/gms/ads/internal/zzs$zza;
      ((zzs.zza)localObject1).<init>(paramContext, this, this);
      this.zzrm = ((zzs.zza)localObject1);
      localObject1 = this.zzrm;
      i = paramAdSizeParcel.widthPixels;
      ((zzs.zza)localObject1).setMinimumWidth(i);
      localObject1 = this.zzrm;
      i = paramAdSizeParcel.heightPixels;
      ((zzs.zza)localObject1).setMinimumHeight(i);
      localObject1 = this.zzrm;
      i = 4;
      ((zzs.zza)localObject1).setVisibility(i);
      break;
      label330:
      paramzzan = new com/google/android/gms/internal/zzan;
      localObject1 = new com/google/android/gms/ads/internal/zzh;
      ((zzh)localObject1).<init>(this);
      paramzzan.<init>((zzaj)localObject1);
    }
  }
  
  private void zzbZ()
  {
    View localView = this.zzrm.getRootView();
    int i = 16908290;
    localView = localView.findViewById(i);
    if (localView == null) {}
    for (;;)
    {
      return;
      Rect localRect1 = new android/graphics/Rect;
      localRect1.<init>();
      Rect localRect2 = new android/graphics/Rect;
      localRect2.<init>();
      zzs.zza localzza = this.zzrm;
      localzza.getGlobalVisibleRect(localRect1);
      localView.getGlobalVisibleRect(localRect2);
      int j = localRect1.top;
      int k = localRect2.top;
      if (j != k) {
        this.zzrR = false;
      }
      j = localRect1.bottom;
      i = localRect2.bottom;
      if (j != i) {
        this.zzrS = false;
      }
    }
  }
  
  private void zze(boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject1 = this.zzrm;
    if (localObject1 != null)
    {
      localObject1 = this.zzrq;
      if (localObject1 != null)
      {
        localObject1 = this.zzrq.zzED;
        if (localObject1 != null) {
          break label33;
        }
      }
    }
    label33:
    do
    {
      return;
      if (!paramBoolean) {
        break;
      }
      localObject1 = this.zzrQ;
      bool2 = ((zziz)localObject1).tryAcquire();
    } while (!bool2);
    localObject1 = this.zzrq.zzED.zzhU();
    boolean bool2 = ((zzjq)localObject1).zzcv();
    int k;
    int m;
    if (bool2)
    {
      localObject1 = new int[2];
      this.zzrm.getLocationOnScreen((int[])localObject1);
      zza localzza = zzn.zzcS();
      Object localObject2 = this.context;
      int j = localObject1[0];
      k = localzza.zzc((Context)localObject2, j);
      localObject2 = zzn.zzcS();
      Context localContext = this.context;
      int i = localObject1[bool1];
      i = ((zza)localObject2).zzc(localContext, i);
      m = this.zzrO;
      if (k == m)
      {
        m = this.zzrP;
        if (i == m) {}
      }
      else
      {
        this.zzrO = k;
        this.zzrP = i;
        localObject1 = this.zzrq.zzED.zzhU();
        k = this.zzrO;
        m = this.zzrP;
        if (paramBoolean) {
          break label226;
        }
      }
    }
    for (;;)
    {
      ((zzjq)localObject1).zza(k, m, bool1);
      zzbZ();
      break;
      label226:
      bool1 = false;
    }
  }
  
  public void destroy()
  {
    zzbY();
    this.zzru = null;
    this.zzrv = null;
    this.zzry = null;
    this.zzrx = null;
    this.zzrE = null;
    this.zzrw = null;
    zzf(false);
    zzs.zza localzza = this.zzrm;
    if (localzza != null)
    {
      localzza = this.zzrm;
      localzza.removeAllViews();
    }
    zzbT();
    zzbV();
    this.zzrq = null;
  }
  
  public String getUserId()
  {
    return this.zzrG;
  }
  
  public void onGlobalLayout()
  {
    zze(false);
  }
  
  public void onScrollChanged()
  {
    boolean bool = true;
    zze(bool);
    this.zzrT = bool;
  }
  
  void setUserId(String paramString)
  {
    this.zzrG = paramString;
  }
  
  public void zza(HashSet paramHashSet)
  {
    this.zzrN = paramHashSet;
  }
  
  public HashSet zzbS()
  {
    return this.zzrN;
  }
  
  public void zzbT()
  {
    Object localObject = this.zzrq;
    if (localObject != null)
    {
      localObject = this.zzrq.zzED;
      if (localObject != null)
      {
        localObject = this.zzrq.zzED;
        ((zzjp)localObject).destroy();
      }
    }
  }
  
  public void zzbU()
  {
    Object localObject = this.zzrq;
    if (localObject != null)
    {
      localObject = this.zzrq.zzED;
      if (localObject != null)
      {
        localObject = this.zzrq.zzED;
        ((zzjp)localObject).stopLoading();
      }
    }
  }
  
  public void zzbV()
  {
    Object localObject = this.zzrq;
    if (localObject != null)
    {
      localObject = this.zzrq.zzCq;
      if (localObject == null) {}
    }
    try
    {
      localObject = this.zzrq;
      localObject = ((zzif)localObject).zzCq;
      ((zzey)localObject).destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not destroy mediation adapter.";
        zzin.zzaK(str);
      }
    }
  }
  
  public boolean zzbW()
  {
    int i = this.zzrL;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean zzbX()
  {
    int i = 1;
    int j = this.zzrL;
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public void zzbY()
  {
    zzs.zza localzza = this.zzrm;
    if (localzza != null)
    {
      localzza = this.zzrm;
      localzza.zzbY();
    }
  }
  
  public String zzca()
  {
    boolean bool = this.zzrR;
    String str;
    if (bool)
    {
      bool = this.zzrS;
      if (bool) {
        str = "";
      }
    }
    for (;;)
    {
      return str;
      bool = this.zzrR;
      if (bool)
      {
        bool = this.zzrT;
        if (bool) {
          str = "top-scrollable";
        } else {
          str = "top-locked";
        }
      }
      else
      {
        bool = this.zzrS;
        if (bool)
        {
          bool = this.zzrT;
          if (bool) {
            str = "bottom-scrollable";
          } else {
            str = "bottom-locked";
          }
        }
        else
        {
          str = "";
        }
      }
    }
  }
  
  public void zzcb()
  {
    zzig localzzig = this.zzrs;
    long l = this.zzrq.zzKY;
    localzzig.zzl(l);
    localzzig = this.zzrs;
    l = this.zzrq.zzKZ;
    localzzig.zzm(l);
    localzzig = this.zzrs;
    boolean bool = this.zzrp.zzui;
    localzzig.zzz(bool);
    localzzig = this.zzrs;
    bool = this.zzrq.zzHT;
    localzzig.zzA(bool);
  }
  
  public void zzf(boolean paramBoolean)
  {
    int i = this.zzrL;
    if (i == 0) {
      zzbU();
    }
    Object localObject = this.zzrn;
    if (localObject != null)
    {
      localObject = this.zzrn;
      ((zzim)localObject).cancel();
    }
    localObject = this.zzro;
    if (localObject != null)
    {
      localObject = this.zzro;
      ((zzit)localObject).cancel();
    }
    if (paramBoolean)
    {
      i = 0;
      localObject = null;
      this.zzrq = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */