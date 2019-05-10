package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.zzx;
import java.nio.ByteBuffer;
import java.util.UUID;

class zze
  extends zza
{
  public zze(byte[] paramArrayOfByte)
  {
    super(arrayOfByte);
  }
  
  private static byte[] zzu(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int k = 16;
    if (i != k)
    {
      i = paramArrayOfByte.length;
      int m = 18;
      if (i != m)
      {
        i = paramArrayOfByte.length;
        int n = 20;
        if (i != n) {
          break label43;
        }
      }
    }
    label43:
    int j;
    for (i = 1;; j = 0)
    {
      zzx.zzb(i, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
      return paramArrayOfByte;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("IBeaconIdPrefix{proximityUuid=");
    Object localObject = zzEu();
    localStringBuilder = localStringBuilder.append(localObject).append(", major=");
    localObject = zzEx();
    localStringBuilder = localStringBuilder.append(localObject).append(", minor=");
    localObject = zzEy();
    return localObject + '}';
  }
  
  public UUID zzEu()
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(getBytes());
    UUID localUUID = new java/util/UUID;
    long l1 = localByteBuffer.getLong();
    long l2 = localByteBuffer.getLong();
    localUUID.<init>(l1, l2);
    return localUUID;
  }
  
  public Short zzEx()
  {
    Object localObject = getBytes();
    int i = localObject.length;
    int j = 18;
    short s;
    if (i >= j)
    {
      localObject = ByteBuffer.wrap((byte[])localObject);
      i = 16;
      s = ((ByteBuffer)localObject).getShort(i);
    }
    for (localObject = Short.valueOf(s);; localObject = null)
    {
      return (Short)localObject;
      s = 0;
    }
  }
  
  public Short zzEy()
  {
    Object localObject = getBytes();
    int i = 18;
    int j = localObject.length;
    int k = 20;
    short s;
    if (j == k) {
      s = ByteBuffer.wrap((byte[])localObject).getShort(i);
    }
    for (localObject = Short.valueOf(s);; localObject = null)
    {
      return (Short)localObject;
      s = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\devices\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */