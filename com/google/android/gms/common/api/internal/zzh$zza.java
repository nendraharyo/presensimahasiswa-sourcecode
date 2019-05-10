package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.zza;
import com.google.android.gms.common.internal.zzx;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

class zzh$zza
  implements GoogleApiClient.zza
{
  private final Api zzagT;
  private final int zzagU;
  private final WeakReference zzahD;
  
  public zzh$zza(zzh paramzzh, Api paramApi, int paramInt)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramzzh);
    this.zzahD = localWeakReference;
    this.zzagT = paramApi;
    this.zzagU = paramInt;
  }
  
  public void zza(ConnectionResult paramConnectionResult)
  {
    boolean bool = false;
    Api localApi = null;
    Object localObject2 = (zzh)this.zzahD.get();
    if (localObject2 == null) {}
    for (;;)
    {
      return;
      Object localObject3 = Looper.myLooper();
      Looper localLooper = zzh.zzd((zzh)localObject2).zzagW.getLooper();
      if (localObject3 == localLooper) {
        bool = true;
      }
      localObject3 = "onReportServiceBinding must be called on the GoogleApiClient handler thread";
      zzx.zza(bool, localObject3);
      zzh.zzc((zzh)localObject2).lock();
      bool = false;
      localApi = null;
      try
      {
        bool = zzh.zza((zzh)localObject2, 0);
        if (!bool)
        {
          localObject2 = zzh.zzc((zzh)localObject2);
          ((Lock)localObject2).unlock();
          continue;
        }
        bool = paramConnectionResult.isSuccess();
        if (!bool)
        {
          localApi = this.zzagT;
          int i = this.zzagU;
          zzh.zza((zzh)localObject2, paramConnectionResult, localApi, i);
        }
        bool = zzh.zzk((zzh)localObject2);
        if (bool) {
          zzh.zzj((zzh)localObject2);
        }
        localObject2 = zzh.zzc((zzh)localObject2);
        ((Lock)localObject2).unlock();
      }
      finally
      {
        zzh.zzc((zzh)localObject2).unlock();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzh$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */