package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.zzq;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

class zzj$5
  implements ResultCallback
{
  zzj$5(zzj paramzzj, zzv paramzzv, boolean paramBoolean, GoogleApiClient paramGoogleApiClient) {}
  
  public void zzp(Status paramStatus)
  {
    Object localObject = zzq.zzaf(zzj.zzd(this.zzaid));
    ((zzq)localObject).zznr();
    boolean bool = paramStatus.isSuccess();
    if (bool)
    {
      localObject = this.zzaid;
      bool = ((zzj)localObject).isConnected();
      if (bool)
      {
        localObject = this.zzaid;
        ((zzj)localObject).reconnect();
      }
    }
    localObject = this.zzaif;
    ((zzv)localObject).zza(paramStatus);
    bool = this.zzaig;
    if (bool)
    {
      localObject = this.zzabL;
      ((GoogleApiClient)localObject).disconnect();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzj$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */