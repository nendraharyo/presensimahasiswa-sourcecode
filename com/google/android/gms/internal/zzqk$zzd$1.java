package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback;

class zzqk$zzd$1
  implements zzq.zzb
{
  zzqk$zzd$1(zzqk.zzd paramzzd, String paramString, int paramInt, byte[] paramArrayOfByte) {}
  
  public void zza(Connections.ConnectionResponseCallback paramConnectionResponseCallback)
  {
    String str = this.zzbbc;
    Status localStatus = new com/google/android/gms/common/api/Status;
    int i = this.zzadW;
    localStatus.<init>(i);
    byte[] arrayOfByte = this.zzaHk;
    paramConnectionResponseCallback.onConnectionResponse(str, localStatus, arrayOfByte);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqk$zzd$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */