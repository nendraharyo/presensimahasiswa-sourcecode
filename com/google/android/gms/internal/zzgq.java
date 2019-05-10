package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public abstract class zzgq
  extends zzim
{
  protected final Context mContext;
  protected final zzgr.zza zzGc;
  protected final zzif.zza zzGd;
  protected AdResponseParcel zzGe;
  protected final Object zzGg;
  protected final Object zzpV;
  
  protected zzgq(Context paramContext, zzif.zza paramzza, zzgr.zza paramzza1)
  {
    super(true);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    this.zzGg = localObject;
    this.mContext = paramContext;
    this.zzGd = paramzza;
    localObject = paramzza.zzLe;
    this.zzGe = ((AdResponseParcel)localObject);
    this.zzGc = paramzza1;
  }
  
  public void onStop() {}
  
  protected abstract zzif zzD(int paramInt);
  
  public void zzbr()
  {
    Object localObject1 = this.zzpV;
    Object localObject2 = "AdRendererBackgroundTask started.";
    for (;;)
    {
      int j;
      try
      {
        zzin.zzaI((String)localObject2);
        localObject2 = this.zzGd;
        int i = ((zzif.zza)localObject2).errorCode;
        try
        {
          l = SystemClock.elapsedRealtime();
          zzh(l);
          localObject2 = zzD(i);
          Handler localHandler = zzir.zzMc;
          localObject5 = new com/google/android/gms/internal/zzgq$2;
          ((zzgq.2)localObject5).<init>(this, (zzif)localObject2);
          localHandler.post((Runnable)localObject5);
          return;
        }
        catch (zzgq.zza localzza)
        {
          j = localzza.getErrorCode();
          int k = 3;
          if (j != k)
          {
            k = -1;
            if (j != k) {
              continue;
            }
          }
          localObject3 = localzza.getMessage();
          zzin.zzaJ((String)localObject3);
        }
        Object localObject3 = this.zzGe;
        if (localObject3 == null)
        {
          localObject3 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
          ((AdResponseParcel)localObject3).<init>(j);
          this.zzGe = ((AdResponseParcel)localObject3);
          localObject3 = zzir.zzMc;
          localObject5 = new com/google/android/gms/internal/zzgq$1;
          ((zzgq.1)localObject5).<init>(this);
          ((Handler)localObject3).post((Runnable)localObject5);
          i = j;
          continue;
          localObject3 = ((zzgq.zza)localObject3).getMessage();
          zzin.zzaK((String)localObject3);
          continue;
        }
        localAdResponseParcel = new com/google/android/gms/ads/internal/request/AdResponseParcel;
      }
      finally {}
      AdResponseParcel localAdResponseParcel;
      Object localObject5 = this.zzGe;
      long l = ((AdResponseParcel)localObject5).zzBU;
      localAdResponseParcel.<init>(j, l);
      this.zzGe = localAdResponseParcel;
    }
  }
  
  protected abstract void zzh(long paramLong);
  
  protected void zzm(zzif paramzzif)
  {
    this.zzGc.zzb(paramzzif);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */