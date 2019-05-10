package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

public final class zzj$zze
  implements ServiceConnection
{
  private final int zzalO;
  
  public zzj$zze(zzj paramzzj, int paramInt)
  {
    this.zzalO = paramInt;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    zzx.zzb(paramIBinder, "Expecting a valid IBinder");
    zzj localzzj = this.zzalL;
    synchronized (zzj.zza(localzzj))
    {
      localzzj = this.zzalL;
      zzs localzzs = zzs.zza.zzaS(paramIBinder);
      zzj.zza(localzzj, localzzs);
      localzzj = this.zzalL;
      int i = this.zzalO;
      localzzj.zzm(0, i);
      return;
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Object localObject1 = this.zzalL;
    synchronized (zzj.zza((zzj)localObject1))
    {
      localObject1 = this.zzalL;
      zzj.zza((zzj)localObject1, null);
      localObject1 = this.zzalL.mHandler;
      ??? = this.zzalL.mHandler;
      int i = this.zzalO;
      ??? = ((Handler)???).obtainMessage(4, i, 1);
      ((Handler)localObject1).sendMessage((Message)???);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzj$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */