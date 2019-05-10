package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;

public class zzaz$zzb
  implements MessageApi.SendMessageResult
{
  private final Status zzUX;
  private final int zzaox;
  
  public zzaz$zzb(Status paramStatus, int paramInt)
  {
    this.zzUX = paramStatus;
    this.zzaox = paramInt;
  }
  
  public int getRequestId()
  {
    return this.zzaox;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzaz$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */