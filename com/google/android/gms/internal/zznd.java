package com.google.android.gms.internal;

public class zznd
{
  public static int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 461845907;
    int j = -862048943;
    int k = paramInt2 & 0xFFFFFFFC;
    int m = paramInt1 + k;
    int n = paramInt3;
    while (paramInt1 < m)
    {
      k = paramArrayOfByte[paramInt1] & 0xFF;
      i1 = paramInt1 + 1;
      i1 = (paramArrayOfByte[i1] & 0xFF) << 8;
      k |= i1;
      i1 = paramInt1 + 2;
      i1 = (paramArrayOfByte[i1] & 0xFF) << 16;
      k |= i1;
      i1 = paramInt1 + 3;
      i1 = paramArrayOfByte[i1] << 24;
      k = (k | i1) * j;
      i1 = k << 15;
      k = (k >>> 17 | i1) * i ^ n;
      n = k << 13;
      k = (k >>> 19 | n) * 5;
      n = -430675100 + k;
      paramInt1 += 4;
    }
    k = 0;
    int i1 = paramInt2 & 0x3;
    switch (i1)
    {
    }
    for (k = n;; k = (k >>> 17 | m) * i ^ n)
    {
      k ^= paramInt2;
      n = k >>> 16;
      k = (k ^ n) * -2048144789;
      n = k >>> 13;
      k = (k ^ n) * -1028477387;
      n = k >>> 16;
      return k ^ n;
      k = m + 2;
      k = (paramArrayOfByte[k] & 0xFF) << 16;
      i1 = m + 1;
      i1 = (paramArrayOfByte[i1] & 0xFF) << 8;
      k |= i1;
      m = paramArrayOfByte[m] & 0xFF;
      k = (k | m) * j;
      m = k << 15;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */