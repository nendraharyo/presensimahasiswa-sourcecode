package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.UUID;

public class zzd
{
  private final zze zzbca;
  
  public zzd(byte[] paramArrayOfByte)
  {
    zze localzze = new com/google/android/gms/nearby/messages/devices/zze;
    byte[] arrayOfByte = zzu(paramArrayOfByte);
    localzze.<init>(arrayOfByte);
    this.zzbca = localzze;
  }
  
  private static byte[] zzu(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int k = 20;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0)
    {
      zzx.zzb(i, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
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
      bool = paramObject instanceof zzd;
      zze localzze1;
      if (!bool)
      {
        bool = false;
        localzze1 = null;
      }
      else
      {
        paramObject = (zzd)paramObject;
        localzze1 = this.zzbca;
        zze localzze2 = ((zzd)paramObject).zzbca;
        bool = zzw.equal(localzze1, localzze2);
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    zze localzze = this.zzbca;
    arrayOfObject[0] = localzze;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("IBeaconId{proximityUuid=");
    UUID localUUID = zzEu();
    localStringBuilder = localStringBuilder.append(localUUID).append(", major=");
    int i = zzEv();
    localStringBuilder = localStringBuilder.append(i).append(", minor=");
    i = zzEw();
    return i + '}';
  }
  
  public UUID zzEu()
  {
    return this.zzbca.zzEu();
  }
  
  public short zzEv()
  {
    return this.zzbca.zzEx().shortValue();
  }
  
  public short zzEw()
  {
    return this.zzbca.zzEy().shortValue();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\devices\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */