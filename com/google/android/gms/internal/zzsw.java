package com.google.android.gms.internal;

import java.util.Arrays;

final class zzsw
{
  final int tag;
  final byte[] zzbuv;
  
  zzsw(int paramInt, byte[] paramArrayOfByte)
  {
    this.tag = paramInt;
    this.zzbuv = paramArrayOfByte;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzsw;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zzsw)paramObject;
        int i = this.tag;
        int j = ((zzsw)paramObject).tag;
        if (i == j)
        {
          byte[] arrayOfByte1 = this.zzbuv;
          byte[] arrayOfByte2 = ((zzsw)paramObject).zzbuv;
          boolean bool3 = Arrays.equals(arrayOfByte1, arrayOfByte2);
          if (bool3) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = (this.tag + 527) * 31;
    int j = Arrays.hashCode(this.zzbuv);
    return i + j;
  }
  
  void writeTo(zzsn paramzzsn)
  {
    int i = this.tag;
    paramzzsn.zzmB(i);
    byte[] arrayOfByte = this.zzbuv;
    paramzzsn.zzH(arrayOfByte);
  }
  
  int zzz()
  {
    int i = zzsn.zzmC(this.tag);
    int j = 0 + i;
    i = this.zzbuv.length;
    return j + i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */