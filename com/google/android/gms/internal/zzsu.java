package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

public abstract class zzsu
{
  protected volatile int zzbuu = -1;
  
  public static final zzsu mergeFrom(zzsu paramzzsu, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return mergeFrom(paramzzsu, paramArrayOfByte, 0, i);
  }
  
  public static final zzsu mergeFrom(zzsu paramzzsu, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      zzsm localzzsm = zzsm.zza(paramArrayOfByte, paramInt1, paramInt2);
      paramzzsu.mergeFrom(localzzsm);
      localzzsm.zzmn(0);
      return paramzzsu;
    }
    catch (zzst localzzst)
    {
      throw localzzst;
    }
    catch (IOException localIOException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Reading from a byte array threw an IOException (should never happen).");
      throw localRuntimeException;
    }
  }
  
  public static final boolean messageNanoEquals(zzsu paramzzsu1, zzsu paramzzsu2)
  {
    boolean bool = false;
    if (paramzzsu1 == paramzzsu2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if ((paramzzsu1 != null) && (paramzzsu2 != null))
      {
        Class localClass = paramzzsu1.getClass();
        Object localObject = paramzzsu2.getClass();
        if (localClass == localObject)
        {
          int i = paramzzsu1.getSerializedSize();
          int j = paramzzsu2.getSerializedSize();
          if (j == i)
          {
            localObject = new byte[i];
            byte[] arrayOfByte = new byte[i];
            toByteArray(paramzzsu1, (byte[])localObject, 0, i);
            toByteArray(paramzzsu2, arrayOfByte, 0, i);
            bool = Arrays.equals((byte[])localObject, arrayOfByte);
          }
        }
      }
    }
  }
  
  public static final void toByteArray(zzsu paramzzsu, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      zzsn localzzsn = zzsn.zzb(paramArrayOfByte, paramInt1, paramInt2);
      paramzzsu.writeTo(localzzsn);
      localzzsn.zzJo();
      return;
    }
    catch (IOException localIOException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Serializing to a byte array threw an IOException (should never happen).", localIOException);
      throw localRuntimeException;
    }
  }
  
  public static final byte[] toByteArray(zzsu paramzzsu)
  {
    byte[] arrayOfByte = new byte[paramzzsu.getSerializedSize()];
    int i = arrayOfByte.length;
    toByteArray(paramzzsu, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public zzsu clone()
  {
    return (zzsu)super.clone();
  }
  
  public int getCachedSize()
  {
    int i = this.zzbuu;
    if (i < 0) {
      getSerializedSize();
    }
    return this.zzbuu;
  }
  
  public int getSerializedSize()
  {
    int i = zzz();
    this.zzbuu = i;
    return i;
  }
  
  public abstract zzsu mergeFrom(zzsm paramzzsm);
  
  public String toString()
  {
    return zzsv.zzf(this);
  }
  
  public void writeTo(zzsn paramzzsn) {}
  
  protected int zzz()
  {
    return 0;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */