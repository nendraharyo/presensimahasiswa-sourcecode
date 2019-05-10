package com.google.android.gms.internal;

public class zzsl
{
  private final byte[] zzbtW;
  private int zzbtX;
  private int zzbtY;
  
  public zzsl(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = new byte[i];
    this.zzbtW = arrayOfByte1;
    int j = 0;
    arrayOfByte1 = null;
    int k;
    while (j < i)
    {
      arrayOfByte2 = this.zzbtW;
      k = (byte)j;
      arrayOfByte2[j] = k;
      j += 1;
    }
    j = 0;
    arrayOfByte1 = null;
    int m = 0;
    byte[] arrayOfByte2 = null;
    while (m < i)
    {
      k = this.zzbtW[m];
      j += k;
      k = paramArrayOfByte.length;
      k = m % k;
      k = paramArrayOfByte[k];
      j = j + k & 0xFF;
      byte[] arrayOfByte3 = this.zzbtW;
      k = arrayOfByte3[m];
      byte[] arrayOfByte4 = this.zzbtW;
      byte[] arrayOfByte5 = this.zzbtW;
      int n = arrayOfByte5[j];
      arrayOfByte4[m] = n;
      arrayOfByte4 = this.zzbtW;
      arrayOfByte4[j] = k;
      m += 1;
    }
    this.zzbtX = 0;
    this.zzbtY = 0;
  }
  
  public void zzC(byte[] paramArrayOfByte)
  {
    int i = this.zzbtX;
    int j = this.zzbtY;
    int k = 0;
    for (;;)
    {
      int m = paramArrayOfByte.length;
      if (k >= m) {
        break;
      }
      i = i + 1 & 0xFF;
      m = this.zzbtW[i];
      j = j + m & 0xFF;
      byte[] arrayOfByte1 = this.zzbtW;
      m = arrayOfByte1[i];
      byte[] arrayOfByte2 = this.zzbtW;
      int n = this.zzbtW[j];
      arrayOfByte2[i] = n;
      this.zzbtW[j] = m;
      m = paramArrayOfByte[k];
      arrayOfByte2 = this.zzbtW;
      byte[] arrayOfByte3 = this.zzbtW;
      n = arrayOfByte3[i];
      byte[] arrayOfByte4 = this.zzbtW;
      int i1 = arrayOfByte4[j];
      n = n + i1 & 0xFF;
      int i2 = arrayOfByte2[n];
      m = (byte)(m ^ i2);
      paramArrayOfByte[k] = m;
      k += 1;
    }
    this.zzbtX = i;
    this.zzbtY = j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */