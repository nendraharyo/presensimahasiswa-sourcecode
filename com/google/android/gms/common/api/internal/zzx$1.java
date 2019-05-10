package com.google.android.gms.common.api.internal;

import android.os.Message;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import java.lang.ref.WeakReference;

class zzx$1
  implements Runnable
{
  zzx$1(zzx paramzzx, Result paramResult) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.zzaiU;
      localObject1 = zzx.zzc((zzx)localObject1);
      localObject3 = this.zzaiT;
      localObject1 = ((ResultTransform)localObject1).onSuccess((Result)localObject3);
      localObject3 = this.zzaiU;
      localObject3 = zzx.zzd((zzx)localObject3);
      localObject5 = this.zzaiU;
      localObject5 = zzx.zzd((zzx)localObject5);
      i = 0;
      localObject1 = ((zzx.zza)localObject5).obtainMessage(0, localObject1);
      ((zzx.zza)localObject3).sendMessage((Message)localObject1);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        Object localObject3 = this.zzaiU;
        localObject3 = zzx.zzd((zzx)localObject3);
        localObject5 = this.zzaiU;
        localObject5 = zzx.zzd((zzx)localObject5);
        int i = 1;
        localObject2 = ((zzx.zza)localObject5).obtainMessage(i, localRuntimeException);
        ((zzx.zza)localObject3).sendMessage((Message)localObject2);
        localObject2 = this.zzaiU;
        localObject3 = this.zzaiT;
        zzx.zza((zzx)localObject2, (Result)localObject3);
        localObject2 = (GoogleApiClient)zzx.zze(this.zzaiU).get();
        if (localObject2 != null)
        {
          localObject3 = this.zzaiU;
          ((GoogleApiClient)localObject2).zzb((zzx)localObject3);
        }
      }
    }
    finally
    {
      Object localObject2 = this.zzaiU;
      Object localObject5 = this.zzaiT;
      zzx.zza((zzx)localObject2, (Result)localObject5);
      localObject2 = (GoogleApiClient)zzx.zze(this.zzaiU).get();
      if (localObject2 != null)
      {
        localObject5 = this.zzaiU;
        ((GoogleApiClient)localObject2).zzb((zzx)localObject5);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzx$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */