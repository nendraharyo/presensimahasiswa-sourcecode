package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;

class zzm$zzc$1
  implements zzq.zzb
{
  zzm$zzc$1(zzm.zzc paramzzc, MessageWrapper paramMessageWrapper) {}
  
  public void zza(MessageListener paramMessageListener)
  {
    Message localMessage = this.zzbcC.zzbcu;
    paramMessageListener.onFound(localMessage);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzm$zzc$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */