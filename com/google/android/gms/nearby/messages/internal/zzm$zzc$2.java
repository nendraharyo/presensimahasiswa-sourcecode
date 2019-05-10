package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;

class zzm$zzc$2
  implements zzq.zzb
{
  zzm$zzc$2(zzm.zzc paramzzc, MessageWrapper[] paramArrayOfMessageWrapper) {}
  
  public void zza(MessageListener paramMessageListener)
  {
    MessageWrapper[] arrayOfMessageWrapper = this.zzbcE;
    int i = arrayOfMessageWrapper.length;
    int j = 0;
    while (j < i)
    {
      Message localMessage = arrayOfMessageWrapper[j].zzbcu;
      paramMessageListener.zza(localMessage);
      j += 1;
    }
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzm$zzc$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */