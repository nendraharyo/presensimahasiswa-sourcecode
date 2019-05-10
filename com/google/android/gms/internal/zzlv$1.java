package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;

class zzlv$1
  implements Runnable
{
  zzlv$1(zzlv paramzzlv) {}
  
  public void run()
  {
    Object localObject1 = this.zzafw;
    synchronized (zzlv.zza((zzlv)localObject1))
    {
      localObject1 = this.zzafw;
      long l1 = zzlv.zzb((zzlv)localObject1);
      localObject1 = this.zzafw;
      localObject1 = zzlv.zzc((zzlv)localObject1);
      long l2 = ((zzmq)localObject1).elapsedRealtime();
      boolean bool = l1 < l2;
      if (!bool)
      {
        localObject1 = this.zzafw;
        localObject1 = zzlv.zzd((zzlv)localObject1);
        if (localObject1 != null)
        {
          localObject1 = "ClearcutLoggerApiImpl";
          String str = "disconnect managed GoogleApiClient";
          Log.i((String)localObject1, str);
          localObject1 = this.zzafw;
          localObject1 = zzlv.zzd((zzlv)localObject1);
          ((GoogleApiClient)localObject1).disconnect();
          localObject1 = this.zzafw;
          str = null;
          zzlv.zza((zzlv)localObject1, null);
        }
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlv$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */