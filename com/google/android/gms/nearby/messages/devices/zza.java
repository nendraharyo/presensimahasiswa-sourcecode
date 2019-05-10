package com.google.android.gms.nearby.messages.devices;

import java.util.Arrays;

abstract class zza
{
  private static final char[] zzbbX = "0123456789abcdef".toCharArray();
  private final byte[] zzbbY;
  
  protected zza(byte[] paramArrayOfByte)
  {
    this.zzbbY = paramArrayOfByte;
  }
  
  static String zzt(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = paramArrayOfByte.length * 2;
    localStringBuilder.<init>(i);
    int j = paramArrayOfByte.length;
    i = 0;
    while (i < j)
    {
      int k = paramArrayOfByte[i];
      Object localObject = zzbbX;
      int m = k >> 4 & 0xF;
      char c = localObject[m];
      localObject = localStringBuilder.append(c);
      char[] arrayOfChar = zzbbX;
      k &= 0xF;
      k = arrayOfChar[k];
      ((StringBuilder)localObject).append(k);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      Object localObject1 = paramObject.getClass();
      Object localObject2 = getClass();
      bool = ((Class)localObject1).isAssignableFrom((Class)localObject2);
      if (!bool)
      {
        bool = false;
        localObject1 = null;
      }
      else
      {
        paramObject = (zza)paramObject;
        localObject1 = this.zzbbY;
        localObject2 = ((zza)paramObject).zzbbY;
        bool = Arrays.equals((byte[])localObject1, (byte[])localObject2);
      }
    }
  }
  
  byte[] getBytes()
  {
    return this.zzbbY;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(this.zzbbY);
  }
  
  public String toString()
  {
    return zzt(this.zzbbY);
  }
  
  String zzEt()
  {
    return zzt(this.zzbbY);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\devices\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */