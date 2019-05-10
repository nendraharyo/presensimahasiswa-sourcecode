package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.zza;
import java.util.concurrent.atomic.AtomicInteger;

final class zzj$zzb
  extends Handler
{
  public zzj$zzb(zzj paramzzj, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  private void zza(Message paramMessage)
  {
    zzj.zzc localzzc = (zzj.zzc)paramMessage.obj;
    localzzc.zzqM();
    localzzc.unregister();
  }
  
  private boolean zzb(Message paramMessage)
  {
    int i = 1;
    int j = paramMessage.what;
    int m = 2;
    if (j != m)
    {
      j = paramMessage.what;
      if (j != i)
      {
        int k = paramMessage.what;
        int n = 5;
        if (k != n) {
          break label42;
        }
      }
    }
    for (;;)
    {
      return i;
      label42:
      i = 0;
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = 1;
    int j = 4;
    Object localObject1 = this.zzalL.zzalI;
    int k = ((AtomicInteger)localObject1).get();
    int i1 = paramMessage.arg1;
    if (k != i1)
    {
      boolean bool1 = zzb(paramMessage);
      if (bool1) {
        zza(paramMessage);
      }
    }
    for (;;)
    {
      return;
      int m = paramMessage.what;
      if (m != i)
      {
        m = paramMessage.what;
        i1 = 5;
        if (m != i1) {}
      }
      else
      {
        localObject1 = this.zzalL;
        boolean bool2 = ((zzj)localObject1).isConnecting();
        if (!bool2)
        {
          zza(paramMessage);
          continue;
        }
      }
      int n = paramMessage.what;
      i1 = 3;
      Object localObject2;
      if (n == i1)
      {
        localObject1 = new com/google/android/gms/common/ConnectionResult;
        i1 = paramMessage.arg2;
        ((ConnectionResult)localObject1).<init>(i1, null);
        zzj.zzb(this.zzalL).zza((ConnectionResult)localObject1);
        localObject2 = this.zzalL;
        ((zzj)localObject2).onConnectionFailed((ConnectionResult)localObject1);
      }
      else
      {
        n = paramMessage.what;
        if (n == j)
        {
          zzj.zza(this.zzalL, j, null);
          localObject1 = zzj.zzc(this.zzalL);
          if (localObject1 != null)
          {
            localObject1 = zzj.zzc(this.zzalL);
            i1 = paramMessage.arg2;
            ((GoogleApiClient.ConnectionCallbacks)localObject1).onConnectionSuspended(i1);
          }
          localObject1 = this.zzalL;
          i1 = paramMessage.arg2;
          ((zzj)localObject1).onConnectionSuspended(i1);
          localObject1 = this.zzalL;
          zzj.zza((zzj)localObject1, j, i, null);
        }
        else
        {
          n = paramMessage.what;
          i1 = 2;
          if (n == i1)
          {
            localObject1 = this.zzalL;
            bool3 = ((zzj)localObject1).isConnected();
            if (!bool3)
            {
              zza(paramMessage);
              continue;
            }
          }
          boolean bool3 = zzb(paramMessage);
          if (bool3)
          {
            localObject1 = (zzj.zzc)paramMessage.obj;
            ((zzj.zzc)localObject1).zzqN();
          }
          else
          {
            localObject1 = "GmsClient";
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("Don't know how to handle message: ");
            j = paramMessage.what;
            localObject2 = j;
            Exception localException = new java/lang/Exception;
            localException.<init>();
            Log.wtf((String)localObject1, (String)localObject2, localException);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzj$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */