package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public class zzb
{
  private final zzc zzbbZ;
  
  public zzb(byte[] paramArrayOfByte)
  {
    zzc localzzc = new com/google/android/gms/nearby/messages/devices/zzc;
    byte[] arrayOfByte = zzu(paramArrayOfByte);
    localzzc.<init>(arrayOfByte);
    this.zzbbZ = localzzc;
  }
  
  private static byte[] zzu(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int k = 16;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0)
    {
      zzx.zzb(i, "Bytes must be a namespace plus instance (16 bytes).");
      return paramArrayOfByte;
    }
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
      bool = paramObject instanceof zzb;
      zzc localzzc1;
      if (!bool)
      {
        bool = false;
        localzzc1 = null;
      }
      else
      {
        paramObject = (zzb)paramObject;
        localzzc1 = this.zzbbZ;
        zzc localzzc2 = ((zzb)paramObject).zzbbZ;
        bool = zzw.equal(localzzc1, localzzc2);
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    zzc localzzc = this.zzbbZ;
    arrayOfObject[0] = localzzc;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("EddystoneUid{id=");
    String str = zzEt();
    return str + '}';
  }
  
  public String zzEt()
  {
    return this.zzbbZ.zzEt();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\devices\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */