package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel.GetOutputStreamResult;
import java.io.IOException;
import java.io.OutputStream;

final class ChannelImpl$zzb
  implements Channel.GetOutputStreamResult
{
  private final Status zzUX;
  private final OutputStream zzbsi;
  
  ChannelImpl$zzb(Status paramStatus, OutputStream paramOutputStream)
  {
    Status localStatus = (Status)zzx.zzz(paramStatus);
    this.zzUX = localStatus;
    this.zzbsi = paramOutputStream;
  }
  
  public OutputStream getOutputStream()
  {
    return this.zzbsi;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public void release()
  {
    OutputStream localOutputStream = this.zzbsi;
    if (localOutputStream != null) {}
    try
    {
      localOutputStream = this.zzbsi;
      localOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\ChannelImpl$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */