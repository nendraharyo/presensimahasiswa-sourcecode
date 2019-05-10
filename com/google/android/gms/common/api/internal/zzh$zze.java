package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.zzrn;

class zzh$zze
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private zzh$zze(zzh paramzzh) {}
  
  public void onConnected(Bundle paramBundle)
  {
    zzrn localzzrn = zzh.zzf(this.zzahC);
    zzh.zzd localzzd = new com/google/android/gms/common/api/internal/zzh$zzd;
    zzh localzzh = this.zzahC;
    localzzd.<init>(localzzh);
    localzzrn.zza(localzzd);
  }
  
  /* Error */
  public void onConnectionFailed(com.google.android.gms.common.ConnectionResult paramConnectionResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   4: invokestatic 38	com/google/android/gms/common/api/internal/zzh:zzc	(Lcom/google/android/gms/common/api/internal/zzh;)Ljava/util/concurrent/locks/Lock;
    //   7: astore_2
    //   8: aload_2
    //   9: invokeinterface 43 1 0
    //   14: aload_0
    //   15: getfield 12	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   18: astore_2
    //   19: aload_2
    //   20: aload_1
    //   21: invokestatic 47	com/google/android/gms/common/api/internal/zzh:zzb	(Lcom/google/android/gms/common/api/internal/zzh;Lcom/google/android/gms/common/ConnectionResult;)Z
    //   24: istore_3
    //   25: iload_3
    //   26: ifeq +34 -> 60
    //   29: aload_0
    //   30: getfield 12	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   33: astore_2
    //   34: aload_2
    //   35: invokestatic 50	com/google/android/gms/common/api/internal/zzh:zzi	(Lcom/google/android/gms/common/api/internal/zzh;)V
    //   38: aload_0
    //   39: getfield 12	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   42: astore_2
    //   43: aload_2
    //   44: invokestatic 53	com/google/android/gms/common/api/internal/zzh:zzj	(Lcom/google/android/gms/common/api/internal/zzh;)V
    //   47: aload_0
    //   48: getfield 12	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   51: invokestatic 38	com/google/android/gms/common/api/internal/zzh:zzc	(Lcom/google/android/gms/common/api/internal/zzh;)Ljava/util/concurrent/locks/Lock;
    //   54: invokeinterface 56 1 0
    //   59: return
    //   60: aload_0
    //   61: getfield 12	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   64: astore_2
    //   65: aload_2
    //   66: aload_1
    //   67: invokestatic 59	com/google/android/gms/common/api/internal/zzh:zza	(Lcom/google/android/gms/common/api/internal/zzh;Lcom/google/android/gms/common/ConnectionResult;)V
    //   70: goto -23 -> 47
    //   73: astore_2
    //   74: aload_0
    //   75: getfield 12	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   78: invokestatic 38	com/google/android/gms/common/api/internal/zzh:zzc	(Lcom/google/android/gms/common/api/internal/zzh;)Ljava/util/concurrent/locks/Lock;
    //   81: invokeinterface 56 1 0
    //   86: aload_2
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	zze
    //   0	88	1	paramConnectionResult	com.google.android.gms.common.ConnectionResult
    //   7	59	2	localObject1	Object
    //   73	14	2	localObject2	Object
    //   24	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   14	18	73	finally
    //   20	24	73	finally
    //   29	33	73	finally
    //   34	38	73	finally
    //   38	42	73	finally
    //   43	47	73	finally
    //   60	64	73	finally
    //   66	70	73	finally
  }
  
  public void onConnectionSuspended(int paramInt) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzh$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */