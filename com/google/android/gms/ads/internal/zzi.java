package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.support.v4.h.m;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr.zza;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzir;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class zzi
  extends zzr.zza
{
  private final Context mContext;
  private final zzq zzpK;
  private final zzcr zzpL;
  private final zzcs zzpM;
  private final m zzpN;
  private final m zzpO;
  private final NativeAdOptionsParcel zzpP;
  private final List zzpQ;
  private final zzx zzpR;
  private final String zzpS;
  private final VersionInfoParcel zzpT;
  private WeakReference zzpU;
  private final Object zzpV;
  private final zzd zzpm;
  private final zzex zzpn;
  
  zzi(Context paramContext, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzq paramzzq, zzcr paramzzcr, zzcs paramzzcs, m paramm1, m paramm2, NativeAdOptionsParcel paramNativeAdOptionsParcel, zzx paramzzx, zzd paramzzd)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.mContext = paramContext;
    this.zzpS = paramString;
    this.zzpn = paramzzex;
    this.zzpT = paramVersionInfoParcel;
    this.zzpK = paramzzq;
    this.zzpM = paramzzcs;
    this.zzpL = paramzzcr;
    this.zzpN = paramm1;
    this.zzpO = paramm2;
    this.zzpP = paramNativeAdOptionsParcel;
    localObject = zzbl();
    this.zzpQ = ((List)localObject);
    this.zzpR = paramzzx;
    this.zzpm = paramzzd;
  }
  
  private List zzbl()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.zzpM;
    if (localObject != null)
    {
      localObject = "1";
      localArrayList.add(localObject);
    }
    localObject = this.zzpL;
    if (localObject != null)
    {
      localObject = "2";
      localArrayList.add(localObject);
    }
    localObject = this.zzpN;
    int i = ((m)localObject).size();
    if (i > 0)
    {
      localObject = "3";
      localArrayList.add(localObject);
    }
    return localArrayList;
  }
  
  public String getMediationAdapterClassName()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzpU;
      if (localObject2 != null)
      {
        localObject2 = this.zzpU;
        localObject2 = ((WeakReference)localObject2).get();
        localObject2 = (zzp)localObject2;
        if (localObject2 != null) {}
        for (localObject2 = ((zzp)localObject2).getMediationAdapterClassName();; localObject2 = null) {
          return (String)localObject2;
        }
      }
      localObject2 = null;
    }
  }
  
  public boolean isLoading()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzpU;
      if (localObject2 != null)
      {
        localObject2 = this.zzpU;
        localObject2 = ((WeakReference)localObject2).get();
        localObject2 = (zzp)localObject2;
        if (localObject2 != null) {
          bool = ((zzp)localObject2).isLoading();
        }
        for (;;)
        {
          return bool;
          bool = false;
          localObject2 = null;
        }
      }
      boolean bool = false;
      localObject2 = null;
    }
  }
  
  protected void runOnUiThread(Runnable paramRunnable)
  {
    zzir.zzMc.post(paramRunnable);
  }
  
  protected zzp zzbm()
  {
    zzp localzzp = new com/google/android/gms/ads/internal/zzp;
    Context localContext = this.mContext;
    zzd localzzd = this.zzpm;
    AdSizeParcel localAdSizeParcel = AdSizeParcel.zzt(this.mContext);
    String str = this.zzpS;
    zzex localzzex = this.zzpn;
    VersionInfoParcel localVersionInfoParcel = this.zzpT;
    localzzp.<init>(localContext, localzzd, localAdSizeParcel, str, localzzex, localVersionInfoParcel);
    return localzzp;
  }
  
  public void zzf(AdRequestParcel paramAdRequestParcel)
  {
    zzi.1 local1 = new com/google/android/gms/ads/internal/zzi$1;
    local1.<init>(this, paramAdRequestParcel);
    runOnUiThread(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */