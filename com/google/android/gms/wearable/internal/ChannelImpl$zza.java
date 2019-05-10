package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel.GetInputStreamResult;
import java.io.IOException;
import java.io.InputStream;

final class ChannelImpl$zza
  implements Channel.GetInputStreamResult
{
  private final Status zzUX;
  private final InputStream zzbsh;
  
  ChannelImpl$zza(Status paramStatus, InputStream paramInputStream)
  {
    Status localStatus = (Status)zzx.zzz(paramStatus);
    this.zzUX = localStatus;
    this.zzbsh = paramInputStream;
  }
  
  public InputStream getInputStream()
  {
    return this.zzbsh;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public void release()
  {
    InputStream localInputStream = this.zzbsh;
    if (localInputStream != null) {}
    try
    {
      localInputStream = this.zzbsh;
      localInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\ChannelImpl$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */