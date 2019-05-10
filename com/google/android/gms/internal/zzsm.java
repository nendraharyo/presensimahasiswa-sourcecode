package com.google.android.gms.internal;

public final class zzsm
{
  private final byte[] buffer;
  private int zzbtZ;
  private int zzbua;
  private int zzbub;
  private int zzbuc;
  private int zzbud;
  private int zzbue = -1 >>> 1;
  private int zzbuf;
  private int zzbug = 64;
  private int zzbuh = 67108864;
  
  private zzsm(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.zzbtZ = paramInt1;
    int i = paramInt1 + paramInt2;
    this.zzbua = i;
    this.zzbuc = paramInt1;
  }
  
  public static zzsm zzD(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return zza(paramArrayOfByte, 0, i);
  }
  
  private void zzJj()
  {
    int i = this.zzbua;
    int j = this.zzbub;
    i += j;
    this.zzbua = i;
    i = this.zzbua;
    j = this.zzbue;
    if (i > j)
    {
      j = this.zzbue;
      i -= j;
      this.zzbub = i;
      i = this.zzbua;
      j = this.zzbub;
      i -= j;
      this.zzbua = i;
    }
    for (;;)
    {
      return;
      i = 0;
      this.zzbub = 0;
    }
  }
  
  public static zzsm zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzsm localzzsm = new com/google/android/gms/internal/zzsm;
    localzzsm.<init>(paramArrayOfByte, paramInt1, paramInt2);
    return localzzsm;
  }
  
  public static long zzan(long paramLong)
  {
    long l1 = paramLong >>> 1;
    long l2 = -(1L & paramLong);
    return l1 ^ l2;
  }
  
  public static int zzmp(int paramInt)
  {
    int i = paramInt >>> 1;
    int j = -(paramInt & 0x1);
    return i ^ j;
  }
  
  public int getPosition()
  {
    int i = this.zzbuc;
    int j = this.zzbtZ;
    return i - j;
  }
  
  public byte[] readBytes()
  {
    int i = zzJf();
    int j = this.zzbua;
    int k = this.zzbuc;
    j -= k;
    byte[] arrayOfByte1;
    if ((i <= j) && (i > 0))
    {
      arrayOfByte1 = new byte[i];
      byte[] arrayOfByte2 = this.buffer;
      int m = this.zzbuc;
      System.arraycopy(arrayOfByte2, m, arrayOfByte1, 0, i);
      k = this.zzbuc;
      i += k;
      this.zzbuc = i;
    }
    for (;;)
    {
      return arrayOfByte1;
      if (i == 0) {
        arrayOfByte1 = zzsx.zzbuD;
      } else {
        arrayOfByte1 = zzmt(i);
      }
    }
  }
  
  public double readDouble()
  {
    return Double.longBitsToDouble(zzJi());
  }
  
  public float readFloat()
  {
    return Float.intBitsToFloat(zzJh());
  }
  
  public String readString()
  {
    int i = zzJf();
    int j = this.zzbua;
    int k = this.zzbuc;
    j -= k;
    String str1;
    Object localObject;
    if ((i <= j) && (i > 0))
    {
      str1 = new java/lang/String;
      localObject = this.buffer;
      int m = this.zzbuc;
      String str2 = "UTF-8";
      str1.<init>((byte[])localObject, m, i, str2);
      k = this.zzbuc;
      i += k;
      this.zzbuc = i;
    }
    for (;;)
    {
      return str1;
      str1 = new java/lang/String;
      byte[] arrayOfByte = zzmt(i);
      localObject = "UTF-8";
      str1.<init>(arrayOfByte, (String)localObject);
    }
  }
  
  public int zzIX()
  {
    int i = 0;
    boolean bool = zzJl();
    if (bool) {
      this.zzbud = 0;
    }
    for (;;)
    {
      return i;
      i = zzJf();
      this.zzbud = i;
      i = this.zzbud;
      if (i == 0) {
        throw zzst.zzJv();
      }
      i = this.zzbud;
    }
  }
  
  public void zzIY()
  {
    boolean bool;
    do
    {
      int i = zzIX();
      if (i == 0) {
        break;
      }
      bool = zzmo(i);
    } while (bool);
  }
  
  public long zzIZ()
  {
    return zzJg();
  }
  
  public long zzJa()
  {
    return zzJg();
  }
  
  public int zzJb()
  {
    return zzJf();
  }
  
  public boolean zzJc()
  {
    int i = zzJf();
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public int zzJd()
  {
    return zzmp(zzJf());
  }
  
  public long zzJe()
  {
    return zzan(zzJg());
  }
  
  public int zzJf()
  {
    int i = zzJm();
    if (i >= 0) {}
    int k;
    do
    {
      for (;;)
      {
        return i;
        i &= 0x7F;
        j = zzJm();
        if (j >= 0)
        {
          j <<= 7;
          i |= j;
        }
        else
        {
          j = (j & 0x7F) << 7;
          i |= j;
          j = zzJm();
          if (j >= 0)
          {
            j <<= 14;
            i |= j;
          }
          else
          {
            j = (j & 0x7F) << 14;
            i |= j;
            j = zzJm();
            if (j < 0) {
              break;
            }
            j <<= 21;
            i |= j;
          }
        }
      }
      j = (j & 0x7F) << 21;
      i |= j;
      j = zzJm();
      k = j << 28;
      i |= k;
    } while (j >= 0);
    int j = 0;
    for (;;)
    {
      k = 5;
      if (j >= k) {
        break label158;
      }
      k = zzJm();
      if (k >= 0) {
        break;
      }
      j += 1;
    }
    label158:
    throw zzst.zzJu();
  }
  
  public long zzJg()
  {
    int i = 0;
    long l1 = 0L;
    for (;;)
    {
      int j = 64;
      if (i >= j) {
        break;
      }
      j = zzJm();
      int k = j & 0x7F;
      long l2 = k << i;
      l1 |= l2;
      j &= 0x80;
      if (j == 0) {
        return l1;
      }
      i += 7;
    }
    throw zzst.zzJu();
  }
  
  public int zzJh()
  {
    int i = zzJm();
    int j = zzJm();
    int k = zzJm();
    int m = zzJm();
    i &= 0xFF;
    j = (j & 0xFF) << 8;
    i |= j;
    j = (k & 0xFF) << 16;
    i |= j;
    j = (m & 0xFF) << 24;
    return i | j;
  }
  
  public long zzJi()
  {
    long l1 = 255L;
    int i = zzJm();
    int j = zzJm();
    int k = zzJm();
    int m = zzJm();
    int n = zzJm();
    int i1 = zzJm();
    int i2 = zzJm();
    int i3 = zzJm();
    long l2 = i & l1;
    long l3 = (j & l1) << 8 | l2;
    l2 = (k & l1) << 16;
    l3 |= l2;
    long l4 = (m & l1) << 24;
    l3 |= l4;
    l4 = (n & l1) << 32;
    l3 |= l4;
    l4 = (i1 & l1) << 40;
    l3 |= l4;
    l4 = (i2 & l1) << 48;
    l3 |= l4;
    l4 = (i3 & l1) << 56;
    return l3 | l4;
  }
  
  public int zzJk()
  {
    int i = this.zzbue;
    int j = -1 >>> 1;
    if (i == j) {}
    for (i = -1;; i = j - i)
    {
      return i;
      i = this.zzbuc;
      j = this.zzbue;
    }
  }
  
  public boolean zzJl()
  {
    int i = this.zzbuc;
    int k = this.zzbua;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public byte zzJm()
  {
    int i = this.zzbuc;
    int j = this.zzbua;
    if (i == j) {
      throw zzst.zzJs();
    }
    byte[] arrayOfByte = this.buffer;
    j = this.zzbuc;
    int k = j + 1;
    this.zzbuc = k;
    return arrayOfByte[j];
  }
  
  public void zza(zzsu paramzzsu)
  {
    int i = zzJf();
    int j = this.zzbuf;
    int k = this.zzbug;
    if (j >= k) {
      throw zzst.zzJy();
    }
    i = zzmq(i);
    j = this.zzbuf + 1;
    this.zzbuf = j;
    paramzzsu.mergeFrom(this);
    zzmn(0);
    j = this.zzbuf + -1;
    this.zzbuf = j;
    zzmr(i);
  }
  
  public void zza(zzsu paramzzsu, int paramInt)
  {
    int i = this.zzbuf;
    int j = this.zzbug;
    if (i >= j) {
      throw zzst.zzJy();
    }
    i = this.zzbuf + 1;
    this.zzbuf = i;
    paramzzsu.mergeFrom(this);
    i = zzsx.zzF(paramInt, 4);
    zzmn(i);
    i = this.zzbuf + -1;
    this.zzbuf = i;
  }
  
  public void zzmn(int paramInt)
  {
    int i = this.zzbud;
    if (i != paramInt) {
      throw zzst.zzJw();
    }
  }
  
  public boolean zzmo(int paramInt)
  {
    boolean bool = true;
    int i = zzsx.zzmI(paramInt);
    switch (i)
    {
    default: 
      throw zzst.zzJx();
    case 0: 
      zzJb();
    }
    for (;;)
    {
      return bool;
      zzJi();
      continue;
      i = zzJf();
      zzmu(i);
      continue;
      zzIY();
      i = zzsx.zzmJ(paramInt);
      int j = 4;
      i = zzsx.zzF(i, j);
      zzmn(i);
      continue;
      bool = false;
      continue;
      zzJh();
    }
  }
  
  public int zzmq(int paramInt)
  {
    if (paramInt < 0) {
      throw zzst.zzJt();
    }
    int i = this.zzbuc + paramInt;
    int j = this.zzbue;
    if (i > j) {
      throw zzst.zzJs();
    }
    this.zzbue = i;
    zzJj();
    return j;
  }
  
  public void zzmr(int paramInt)
  {
    this.zzbue = paramInt;
    zzJj();
  }
  
  public void zzms(int paramInt)
  {
    int i = this.zzbuc;
    int j = this.zzbtZ;
    i -= j;
    IllegalArgumentException localIllegalArgumentException;
    Object localObject;
    if (paramInt > i)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Position ").append(paramInt).append(" is beyond current ");
      int k = this.zzbuc;
      int m = this.zzbtZ;
      k -= m;
      localObject = k;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    if (paramInt < 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Bad position " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    i = this.zzbtZ + paramInt;
    this.zzbuc = i;
  }
  
  public byte[] zzmt(int paramInt)
  {
    if (paramInt < 0) {
      throw zzst.zzJt();
    }
    int i = this.zzbuc + paramInt;
    int j = this.zzbue;
    if (i > j)
    {
      i = this.zzbue;
      j = this.zzbuc;
      i -= j;
      zzmu(i);
      throw zzst.zzJs();
    }
    i = this.zzbua;
    j = this.zzbuc;
    i -= j;
    if (paramInt <= i)
    {
      byte[] arrayOfByte1 = new byte[paramInt];
      byte[] arrayOfByte2 = this.buffer;
      int k = this.zzbuc;
      System.arraycopy(arrayOfByte2, k, arrayOfByte1, 0, paramInt);
      j = this.zzbuc + paramInt;
      this.zzbuc = j;
      return arrayOfByte1;
    }
    throw zzst.zzJs();
  }
  
  public void zzmu(int paramInt)
  {
    if (paramInt < 0) {
      throw zzst.zzJt();
    }
    int i = this.zzbuc + paramInt;
    int j = this.zzbue;
    if (i > j)
    {
      i = this.zzbue;
      j = this.zzbuc;
      i -= j;
      zzmu(i);
      throw zzst.zzJs();
    }
    i = this.zzbua;
    j = this.zzbuc;
    i -= j;
    if (paramInt <= i)
    {
      i = this.zzbuc + paramInt;
      this.zzbuc = i;
      return;
    }
    throw zzst.zzJs();
  }
  
  public byte[] zzz(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte1;
    if (paramInt2 == 0) {
      arrayOfByte1 = zzsx.zzbuD;
    }
    for (;;)
    {
      return arrayOfByte1;
      arrayOfByte1 = new byte[paramInt2];
      int i = this.zzbtZ + paramInt1;
      byte[] arrayOfByte2 = this.buffer;
      System.arraycopy(arrayOfByte2, i, arrayOfByte1, 0, paramInt2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */