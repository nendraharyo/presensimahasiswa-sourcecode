package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.InputStream;

public final class zzp
  extends InputStream
{
  private final InputStream zzbsj;
  private volatile zzm zzbsk;
  
  public zzp(InputStream paramInputStream)
  {
    InputStream localInputStream = (InputStream)zzx.zzz(paramInputStream);
    this.zzbsj = localInputStream;
  }
  
  private int zzlK(int paramInt)
  {
    int i = -1;
    if (paramInt == i)
    {
      zzm localzzm = this.zzbsk;
      if (localzzm != null)
      {
        ChannelIOException localChannelIOException = new com/google/android/gms/wearable/ChannelIOException;
        int j = localzzm.zzbsa;
        i = localzzm.zzbsb;
        localChannelIOException.<init>("Channel closed unexpectedly before stream was finished", j, i);
        throw localChannelIOException;
      }
    }
    return paramInt;
  }
  
  public int available()
  {
    return this.zzbsj.available();
  }
  
  public void close()
  {
    this.zzbsj.close();
  }
  
  public void mark(int paramInt)
  {
    this.zzbsj.mark(paramInt);
  }
  
  public boolean markSupported()
  {
    return this.zzbsj.markSupported();
  }
  
  public int read()
  {
    int i = this.zzbsj.read();
    return zzlK(i);
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    int i = this.zzbsj.read(paramArrayOfByte);
    return zzlK(i);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = this.zzbsj.read(paramArrayOfByte, paramInt1, paramInt2);
    return zzlK(i);
  }
  
  public void reset()
  {
    this.zzbsj.reset();
  }
  
  public long skip(long paramLong)
  {
    return this.zzbsj.skip(paramLong);
  }
  
  zzu zzIJ()
  {
    zzp.1 local1 = new com/google/android/gms/wearable/internal/zzp$1;
    local1.<init>(this);
    return local1;
  }
  
  void zza(zzm paramzzm)
  {
    zzm localzzm = (zzm)zzx.zzz(paramzzm);
    this.zzbsk = localzzm;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */