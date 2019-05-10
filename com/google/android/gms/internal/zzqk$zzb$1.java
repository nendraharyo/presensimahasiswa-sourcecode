package com.google.android.gms.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.nearby.connection.Connections.MessageListener;

class zzqk$zzb$1
  implements zzq.zzb
{
  zzqk$zzb$1(zzqk.zzb paramzzb, String paramString, byte[] paramArrayOfByte, boolean paramBoolean) {}
  
  public void zza(Connections.MessageListener paramMessageListener)
  {
    String str = this.zzbbc;
    byte[] arrayOfByte = this.zzaHk;
    boolean bool = this.zzbbd;
    paramMessageListener.onMessageReceived(str, arrayOfByte, bool);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqk$zzb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */