package com.google.android.gms.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener;

class zzqk$zze$1
  implements zzq.zzb
{
  zzqk$zze$1(zzqk.zze paramzze, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte) {}
  
  public void zza(Connections.ConnectionRequestListener paramConnectionRequestListener)
  {
    String str1 = this.zzbbc;
    String str2 = this.zzbbj;
    String str3 = this.zzbbk;
    byte[] arrayOfByte = this.zzaHk;
    paramConnectionRequestListener.onConnectionRequest(str1, str2, str3, arrayOfByte);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqk$zze$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */