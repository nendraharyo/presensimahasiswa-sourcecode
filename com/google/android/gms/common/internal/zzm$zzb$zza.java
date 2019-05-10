package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

public class zzm$zzb$zza
  implements ServiceConnection
{
  public zzm$zzb$zza(zzm.zzb paramzzb) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Object localObject1 = this.zzami.zzamh;
    synchronized (zzm.zza((zzm)localObject1))
    {
      localObject1 = this.zzami;
      zzm.zzb.zza((zzm.zzb)localObject1, paramIBinder);
      localObject1 = this.zzami;
      zzm.zzb.zza((zzm.zzb)localObject1, paramComponentName);
      localObject1 = this.zzami;
      localObject1 = zzm.zzb.zzb((zzm.zzb)localObject1);
      Iterator localIterator = ((Set)localObject1).iterator();
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = localIterator.next();
        localObject1 = (ServiceConnection)localObject1;
        ((ServiceConnection)localObject1).onServiceConnected(paramComponentName, paramIBinder);
      }
    }
    zzm.zzb localzzb = this.zzami;
    int i = 1;
    zzm.zzb.zza(localzzb, i);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Object localObject1 = this.zzami.zzamh;
    synchronized (zzm.zza((zzm)localObject1))
    {
      localObject1 = this.zzami;
      i = 0;
      Iterator localIterator = null;
      zzm.zzb.zza((zzm.zzb)localObject1, null);
      localObject1 = this.zzami;
      zzm.zzb.zza((zzm.zzb)localObject1, paramComponentName);
      localObject1 = this.zzami;
      localObject1 = zzm.zzb.zzb((zzm.zzb)localObject1);
      localIterator = ((Set)localObject1).iterator();
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = localIterator.next();
        localObject1 = (ServiceConnection)localObject1;
        ((ServiceConnection)localObject1).onServiceDisconnected(paramComponentName);
      }
    }
    zzm.zzb localzzb = this.zzami;
    int i = 2;
    zzm.zzb.zza(localzzb, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzm$zzb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */