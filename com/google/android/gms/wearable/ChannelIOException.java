package com.google.android.gms.wearable;

import java.io.IOException;

public class ChannelIOException
  extends IOException
{
  private final int zzbqW;
  private final int zzbqX;
  
  public ChannelIOException(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString);
    this.zzbqW = paramInt1;
    this.zzbqX = paramInt2;
  }
  
  public int getAppSpecificErrorCode()
  {
    return this.zzbqX;
  }
  
  public int getCloseReason()
  {
    return this.zzbqW;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\ChannelIOException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */