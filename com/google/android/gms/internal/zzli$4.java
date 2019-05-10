package com.google.android.gms.internal;

import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

class zzli$4
  implements ResultCallback
{
  zzli$4(zzli paramzzli, long paramLong) {}
  
  public void zzp(Status paramStatus)
  {
    boolean bool = paramStatus.isSuccess();
    if (!bool)
    {
      zzli localzzli = this.zzacN;
      long l = this.zzacS;
      int i = paramStatus.getStatusCode();
      localzzli.zzb(l, i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzli$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */