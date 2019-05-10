package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;

public final class zzq
  extends OutputStream
{
  private volatile zzm zzbsk;
  private final OutputStream zzbsm;
  
  public zzq(OutputStream paramOutputStream)
  {
    OutputStream localOutputStream = (OutputStream)zzx.zzz(paramOutputStream);
    this.zzbsm = localOutputStream;
  }
  
  private IOException zza(IOException paramIOException)
  {
    zzm localzzm = this.zzbsk;
    if (localzzm != null)
    {
      String str1 = "ChannelOutputStream";
      int i = 2;
      boolean bool = Log.isLoggable(str1, i);
      if (bool)
      {
        str1 = "ChannelOutputStream";
        String str2 = "Caught IOException, but channel has been closed. Translating to ChannelIOException.";
        Log.v(str1, str2, paramIOException);
      }
      paramIOException = new com/google/android/gms/wearable/ChannelIOException;
      str1 = "Channel closed unexpectedly before stream was finished";
      i = localzzm.zzbsa;
      int j = localzzm.zzbsb;
      paramIOException.<init>(str1, i, j);
    }
    return paramIOException;
  }
  
  public void close()
  {
    try
    {
      OutputStream localOutputStream = this.zzbsm;
      localOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      throw zza(localIOException);
    }
  }
  
  public void flush()
  {
    try
    {
      OutputStream localOutputStream = this.zzbsm;
      localOutputStream.flush();
      return;
    }
    catch (IOException localIOException)
    {
      throw zza(localIOException);
    }
  }
  
  public void write(int paramInt)
  {
    try
    {
      OutputStream localOutputStream = this.zzbsm;
      localOutputStream.write(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      throw zza(localIOException);
    }
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    try
    {
      OutputStream localOutputStream = this.zzbsm;
      localOutputStream.write(paramArrayOfByte);
      return;
    }
    catch (IOException localIOException)
    {
      throw zza(localIOException);
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      OutputStream localOutputStream = this.zzbsm;
      localOutputStream.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (IOException localIOException)
    {
      throw zza(localIOException);
    }
  }
  
  zzu zzIJ()
  {
    zzq.1 local1 = new com/google/android/gms/wearable/internal/zzq$1;
    local1.<init>(this);
    return local1;
  }
  
  void zzc(zzm paramzzm)
  {
    this.zzbsk = paramzzm;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */