package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.wearable.MessageApi.MessageListener;

final class zzbq$4
  implements zzq.zzb
{
  zzbq$4(MessageEventParcelable paramMessageEventParcelable) {}
  
  public void zza(MessageApi.MessageListener paramMessageListener)
  {
    MessageEventParcelable localMessageEventParcelable = this.zzbrt;
    paramMessageListener.onMessageReceived(localMessageEventParcelable);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbq$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */