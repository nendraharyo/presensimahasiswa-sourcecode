package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class zzgn
  implements zzit, zzjq.zza
{
  protected final Context mContext;
  protected final zzgr.zza zzGc;
  protected final zzif.zza zzGd;
  protected AdResponseParcel zzGe;
  private Runnable zzGf;
  protected final Object zzGg;
  private AtomicBoolean zzGh;
  protected final zzjp zzpD;
  
  protected zzgn(Context paramContext, zzif.zza paramzza, zzjp paramzzjp, zzgr.zza paramzza1)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzGg = localObject;
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(true);
    this.zzGh = ((AtomicBoolean)localObject);
    this.mContext = paramContext;
    this.zzGd = paramzza;
    localObject = this.zzGd.zzLe;
    this.zzGe = ((AdResponseParcel)localObject);
    this.zzpD = paramzzjp;
    this.zzGc = paramzza1;
  }
  
  private zzif zzD(int paramInt)
  {
    AdRequestInfoParcel localAdRequestInfoParcel = this.zzGd.zzLd;
    zzif localzzif = new com/google/android/gms/internal/zzif;
    AdRequestParcel localAdRequestParcel = localAdRequestInfoParcel.zzHt;
    zzjp localzzjp = this.zzpD;
    List localList1 = this.zzGe.zzBQ;
    List localList2 = this.zzGe.zzBR;
    List localList3 = this.zzGe.zzHV;
    int i = this.zzGe.orientation;
    long l1 = this.zzGe.zzBU;
    String str1 = localAdRequestInfoParcel.zzHw;
    boolean bool1 = this.zzGe.zzHT;
    long l2 = this.zzGe.zzHU;
    AdSizeParcel localAdSizeParcel = this.zzGd.zzrp;
    long l3 = this.zzGe.zzHS;
    long l4 = this.zzGd.zzKY;
    long l5 = this.zzGe.zzHX;
    String str2 = this.zzGe.zzHY;
    JSONObject localJSONObject = this.zzGd.zzKT;
    RewardItemParcel localRewardItemParcel = this.zzGe.zzIj;
    List localList4 = this.zzGe.zzIk;
    List localList5 = this.zzGe.zzIl;
    boolean bool2 = this.zzGe.zzIm;
    localzzif.<init>(localAdRequestParcel, localzzjp, localList1, paramInt, localList2, localList3, i, l1, str1, bool1, null, null, null, null, null, l2, localAdSizeParcel, l3, l4, l5, str2, localJSONObject, null, localRewardItemParcel, localList4, localList5, bool2);
    return localzzif;
  }
  
  public void cancel()
  {
    Object localObject1 = this.zzGh;
    Object localObject2 = null;
    boolean bool = ((AtomicBoolean)localObject1).getAndSet(false);
    if (!bool) {}
    for (;;)
    {
      return;
      this.zzpD.stopLoading();
      localObject1 = zzr.zzbE();
      localObject2 = this.zzpD;
      ((zzis)localObject1).zzi((zzjp)localObject2);
      int i = -1;
      zzC(i);
      localObject1 = zzir.zzMc;
      localObject2 = this.zzGf;
      ((Handler)localObject1).removeCallbacks((Runnable)localObject2);
    }
  }
  
  protected void zzC(int paramInt)
  {
    int i = -2;
    if (paramInt != i)
    {
      localObject1 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
      localObject2 = this.zzGe;
      long l = ((AdResponseParcel)localObject2).zzBU;
      ((AdResponseParcel)localObject1).<init>(paramInt, l);
      this.zzGe = ((AdResponseParcel)localObject1);
    }
    this.zzpD.zzhO();
    Object localObject1 = this.zzGc;
    Object localObject2 = zzD(paramInt);
    ((zzgr.zza)localObject1).zzb((zzif)localObject2);
  }
  
  public void zza(zzjp paramzzjp, boolean paramBoolean)
  {
    zzin.zzaI("WebView finished loading.");
    Object localObject = this.zzGh;
    Runnable localRunnable = null;
    boolean bool = ((AtomicBoolean)localObject).getAndSet(false);
    if (!bool) {
      return;
    }
    if (paramBoolean) {}
    for (int i = zzgc();; i = -1)
    {
      zzC(i);
      localObject = zzir.zzMc;
      localRunnable = this.zzGf;
      ((Handler)localObject).removeCallbacks(localRunnable);
      break;
    }
  }
  
  public final Void zzga()
  {
    zzx.zzcD("Webview render task needs to be called on UI thread.");
    zzgn.1 local1 = new com/google/android/gms/internal/zzgn$1;
    local1.<init>(this);
    this.zzGf = local1;
    Handler localHandler = zzir.zzMc;
    Runnable localRunnable = this.zzGf;
    long l = ((Long)zzbt.zzwY.get()).longValue();
    localHandler.postDelayed(localRunnable, l);
    zzgb();
    return null;
  }
  
  protected abstract void zzgb();
  
  protected int zzgc()
  {
    return -2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */