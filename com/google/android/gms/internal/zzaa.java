package com.google.android.gms.internal;

import java.io.ByteArrayOutputStream;

public class zzaa
  extends ByteArrayOutputStream
{
  private final zzu zzar;
  
  public zzaa(zzu paramzzu, int paramInt)
  {
    this.zzar = paramzzu;
    Object localObject = this.zzar;
    int i = Math.max(paramInt, 256);
    localObject = ((zzu)localObject).zzb(i);
    this.buf = ((byte[])localObject);
  }
  
  private void zzd(int paramInt)
  {
    int i = this.count + paramInt;
    Object localObject1 = this.buf;
    int j = localObject1.length;
    if (i <= j) {}
    for (;;)
    {
      return;
      Object localObject2 = this.zzar;
      j = (this.count + paramInt) * 2;
      localObject2 = ((zzu)localObject2).zzb(j);
      localObject1 = this.buf;
      int k = this.count;
      System.arraycopy(localObject1, 0, localObject2, 0, k);
      localObject1 = this.zzar;
      byte[] arrayOfByte = this.buf;
      ((zzu)localObject1).zza(arrayOfByte);
      this.buf = ((byte[])localObject2);
    }
  }
  
  public void close()
  {
    zzu localzzu = this.zzar;
    byte[] arrayOfByte = this.buf;
    localzzu.zza(arrayOfByte);
    this.buf = null;
    super.close();
  }
  
  public void finalize()
  {
    zzu localzzu = this.zzar;
    byte[] arrayOfByte = this.buf;
    localzzu.zza(arrayOfByte);
  }
  
  public void write(int paramInt)
  {
    int i = 1;
    try
    {
      zzd(i);
      super.write(paramInt);
      return;
    }
    finally {}
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      zzd(paramInt2);
      super.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */