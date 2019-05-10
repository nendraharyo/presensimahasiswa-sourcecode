package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.zzx;

class zzc
  extends zza
{
  public zzc(byte[] paramArrayOfByte)
  {
    super(arrayOfByte);
  }
  
  private static byte[] zzu(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int k = 10;
    if (i != k)
    {
      i = paramArrayOfByte.length;
      int m = 16;
      if (i != m) {
        break label32;
      }
    }
    label32:
    int j;
    for (i = 1;; j = 0)
    {
      zzx.zzb(i, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
      return paramArrayOfByte;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("EddystoneUidPrefix{bytes=");
    String str = zzEt();
    return str + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\devices\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */