package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class zzj$zzd
  extends zzr.zza
{
  private zzj zzalN;
  private final int zzalO;
  
  public zzj$zzd(zzj paramzzj, int paramInt)
  {
    this.zzalN = paramzzj;
    this.zzalO = paramInt;
  }
  
  private void zzqP()
  {
    this.zzalN = null;
  }
  
  public void zza(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    zzx.zzb(this.zzalN, "onPostInitComplete can be called only once per call to getRemoteService");
    zzj localzzj = this.zzalN;
    int i = this.zzalO;
    localzzj.zza(paramInt, paramIBinder, paramBundle, i);
    zzqP();
  }
  
  public void zzb(int paramInt, Bundle paramBundle)
  {
    Exception localException = new java/lang/Exception;
    localException.<init>();
    Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", localException);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzj$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */