package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class zzgu
  extends zzgq
{
  private zzeo zzCf;
  private boolean zzGA;
  private zzem zzGy;
  protected zzes zzGz;
  private final zzjp zzpD;
  private final zzcb zzpe;
  private zzex zzpn;
  
  zzgu(Context paramContext, zzif.zza paramzza, zzex paramzzex, zzgr.zza paramzza1, zzcb paramzzcb, zzjp paramzzjp)
  {
    super(paramContext, paramzza, paramzza1);
    this.zzpn = paramzzex;
    zzeo localzzeo = paramzza.zzKV;
    this.zzCf = localzzeo;
    this.zzpe = paramzzcb;
    this.zzpD = paramzzjp;
  }
  
  private void zzgk()
  {
    Object localObject1 = new java/util/concurrent/CountDownLatch;
    int i = 1;
    ((CountDownLatch)localObject1).<init>(i);
    ??? = zzir.zzMc;
    Object localObject5 = new com/google/android/gms/internal/zzgu$1;
    ((zzgu.1)localObject5).<init>(this, (CountDownLatch)localObject1);
    ((Handler)???).post((Runnable)localObject5);
    long l = 10;
    Object localObject3;
    try
    {
      ??? = TimeUnit.SECONDS;
      ((CountDownLatch)localObject1).await(l, (TimeUnit)???);
      synchronized (this.zzGg)
      {
        bool = this.zzGA;
        if (!bool)
        {
          localObject1 = new com/google/android/gms/internal/zzgq$zza;
          localObject5 = "View could not be prepared";
          ((zzgq.zza)localObject1).<init>((String)localObject5, 0);
          throw ((Throwable)localObject1);
        }
      }
      localObject3 = this.zzpD;
    }
    catch (InterruptedException localInterruptedException)
    {
      ??? = new com/google/android/gms/internal/zzgq$zza;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject3 = "Interrupted while waiting for latch : " + localInterruptedException;
      ((zzgq.zza)???).<init>((String)localObject3, 0);
      throw ((Throwable)???);
    }
    boolean bool = ((zzjp)localObject3).isDestroyed();
    if (bool)
    {
      localObject3 = new com/google/android/gms/internal/zzgq$zza;
      localObject5 = "Assets not loaded, web view is destroyed";
      ((zzgq.zza)localObject3).<init>((String)localObject5, 0);
      throw ((Throwable)localObject3);
    }
  }
  
  public void onStop()
  {
    synchronized (this.zzGg)
    {
      super.onStop();
      zzem localzzem = this.zzGy;
      if (localzzem != null)
      {
        localzzem = this.zzGy;
        localzzem.cancel();
      }
      return;
    }
  }
  
  protected zzif zzD(int paramInt)
  {
    Object localObject1 = this;
    Object localObject2 = this.zzGd.zzLd;
    zzif localzzif = new com/google/android/gms/internal/zzif;
    AdRequestParcel localAdRequestParcel = ((AdRequestInfoParcel)localObject2).zzHt;
    zzjp localzzjp = this.zzpD;
    List localList1 = this.zzGe.zzBQ;
    List localList2 = this.zzGe.zzBR;
    List localList3 = this.zzGe.zzHV;
    AdResponseParcel localAdResponseParcel1 = this.zzGe;
    int i = localAdResponseParcel1.orientation;
    AdResponseParcel localAdResponseParcel2 = this.zzGe;
    long l1 = localAdResponseParcel2.zzBU;
    String str1 = ((AdRequestInfoParcel)localObject2).zzHw;
    boolean bool1 = this.zzGe.zzHT;
    localObject2 = this.zzGz;
    zzen localzzen;
    zzey localzzey;
    label137:
    Object localObject3;
    label161:
    zzeo localzzeo;
    if (localObject2 != null)
    {
      localObject2 = this.zzGz;
      localzzen = ((zzes)localObject2).zzCp;
      localObject1 = this;
      localObject2 = this.zzGz;
      if (localObject2 == null) {
        break label372;
      }
      localObject2 = this.zzGz;
      localzzey = ((zzes)localObject2).zzCq;
      localObject1 = this;
      localObject2 = this.zzGz;
      if (localObject2 == null) {
        break label378;
      }
      localObject2 = this.zzGz;
      localObject1 = ((zzes)localObject2).zzCr;
      localObject3 = localObject1;
      localObject1 = this;
      localzzeo = this.zzCf;
      localObject1 = this;
      localObject2 = this.zzGz;
      if (localObject2 == null) {
        break label390;
      }
      localObject2 = this.zzGz;
      localObject1 = ((zzes)localObject2).zzCs;
    }
    label372:
    label378:
    label390:
    for (Object localObject4 = localObject1;; localObject4 = null)
    {
      localObject1 = this;
      long l2 = this.zzGe.zzHU;
      AdSizeParcel localAdSizeParcel = this.zzGd.zzrp;
      localObject1 = this;
      long l3 = this.zzGe.zzHS;
      long l4 = this.zzGd.zzKY;
      long l5 = this.zzGe.zzHX;
      String str2 = this.zzGe.zzHY;
      localObject1 = this;
      JSONObject localJSONObject = this.zzGd.zzKT;
      localObject1 = this;
      RewardItemParcel localRewardItemParcel = this.zzGe.zzIj;
      localObject1 = this;
      List localList4 = this.zzGe.zzIk;
      localObject1 = this;
      List localList5 = this.zzGe.zzIl;
      localObject1 = this;
      boolean bool2 = this.zzGe.zzIm;
      localzzif.<init>(localAdRequestParcel, localzzjp, localList1, paramInt, localList2, localList3, i, l1, str1, bool1, localzzen, localzzey, (String)localObject3, localzzeo, (zzeq)localObject4, l2, localAdSizeParcel, l3, l4, l5, str2, localJSONObject, null, localRewardItemParcel, localList4, localList5, bool2);
      return localzzif;
      localzzen = null;
      break;
      localzzey = null;
      break label137;
      localObject2 = AdMobAdapter.class;
      localObject3 = ((Class)localObject2).getName();
      break label161;
    }
  }
  
  protected void zzh(long paramLong)
  {
    synchronized (this.zzGg)
    {
      Object localObject2 = zzi(paramLong);
      this.zzGy = ((zzem)localObject2);
      localObject2 = this.zzGy;
      ??? = this.zzCf.zzBO;
      localObject2 = ((zzem)localObject2).zzc((List)???);
      this.zzGz = ((zzes)localObject2);
      localObject2 = this.zzGz;
      int i = ((zzes)localObject2).zzCo;
      switch (i)
      {
      default: 
        localObject2 = new com/google/android/gms/internal/zzgq$zza;
        ??? = new java/lang/StringBuilder;
        ((StringBuilder)???).<init>();
        ??? = ((StringBuilder)???).append("Unexpected mediation result: ");
        int j = this.zzGz.zzCo;
        ??? = j;
        ((zzgq.zza)localObject2).<init>((String)???, 0);
        throw ((Throwable)localObject2);
      }
    }
    Object localObject4 = new com/google/android/gms/internal/zzgq$zza;
    ((zzgq.zza)localObject4).<init>("No fill from any mediation ad networks.", 3);
    throw ((Throwable)localObject4);
    localObject4 = this.zzGz.zzCp;
    if (localObject4 != null)
    {
      localObject4 = this.zzGz.zzCp.zzBJ;
      if (localObject4 != null) {
        zzgk();
      }
    }
  }
  
  zzem zzi(long paramLong)
  {
    Object localObject1 = this.zzCf;
    int i = ((zzeo)localObject1).zzBX;
    int j = -1;
    Object localObject2;
    Context localContext;
    AdRequestInfoParcel localAdRequestInfoParcel;
    zzex localzzex;
    zzeo localzzeo;
    boolean bool1;
    boolean bool2;
    long l;
    if (i != j)
    {
      localObject2 = new com/google/android/gms/internal/zzeu;
      localContext = this.mContext;
      localAdRequestInfoParcel = this.zzGd.zzLd;
      localzzex = this.zzpn;
      localzzeo = this.zzCf;
      bool1 = this.zzGe.zzuk;
      bool2 = this.zzGe.zzum;
      localObject1 = (Long)zzbt.zzwY.get();
      l = ((Long)localObject1).longValue();
      int k = 2;
      ((zzeu)localObject2).<init>(localContext, localAdRequestInfoParcel, localzzex, localzzeo, bool1, bool2, paramLong, l, k);
    }
    for (;;)
    {
      return (zzem)localObject2;
      localObject2 = new com/google/android/gms/internal/zzev;
      localContext = this.mContext;
      localAdRequestInfoParcel = this.zzGd.zzLd;
      localzzex = this.zzpn;
      localzzeo = this.zzCf;
      bool1 = this.zzGe.zzuk;
      bool2 = this.zzGe.zzum;
      localObject1 = (Long)zzbt.zzwY.get();
      l = ((Long)localObject1).longValue();
      zzcb localzzcb = this.zzpe;
      ((zzev)localObject2).<init>(localContext, localAdRequestInfoParcel, localzzex, localzzeo, bool1, bool2, paramLong, l, localzzcb);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */