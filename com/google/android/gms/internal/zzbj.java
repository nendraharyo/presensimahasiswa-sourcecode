package com.google.android.gms.internal;

import java.security.MessageDigest;

public class zzbj
  extends zzbg
{
  private MessageDigest zztw;
  
  byte[] zza(String[] paramArrayOfString)
  {
    byte[] arrayOfByte = new byte[paramArrayOfString.length];
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfString.length;
      if (i >= j) {
        break;
      }
      String str = paramArrayOfString[i];
      j = zzbi.zzx(str);
      j = zzk(j);
      arrayOfByte[i] = j;
      i += 1;
    }
    return arrayOfByte;
  }
  
  byte zzk(int paramInt)
  {
    int i = paramInt & 0xFF;
    int j = (0xFF00 & paramInt) >> 8;
    i ^= j;
    j = (0xFF0000 & paramInt) >> 16;
    i ^= j;
    j = (0xFF000000 & paramInt) >> 24;
    return (byte)(i ^ j);
  }
  
  public byte[] zzu(String paramString)
  {
    Object localObject1 = paramString.split(" ");
    localObject1 = zza((String[])localObject1);
    ??? = zzcL();
    this.zztw = ((MessageDigest)???);
    for (;;)
    {
      Object localObject4;
      synchronized (this.zzpV)
      {
        localObject4 = this.zztw;
        if (localObject4 == null)
        {
          i = 0;
          localObject1 = null;
          localObject1 = new byte[0];
          return (byte[])localObject1;
        }
        localObject4 = this.zztw;
        ((MessageDigest)localObject4).reset();
        localObject4 = this.zztw;
        ((MessageDigest)localObject4).update((byte[])localObject1);
        localObject1 = this.zztw;
        localObject4 = ((MessageDigest)localObject1).digest();
        i = 4;
        int j = localObject4.length;
        if (j > i)
        {
          localObject1 = new byte[i];
          j = 0;
          int k = localObject1.length;
          System.arraycopy(localObject4, 0, localObject1, 0, k);
        }
      }
      int i = localObject4.length;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */