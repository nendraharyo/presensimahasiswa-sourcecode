package com.google.android.gms.drive.events.internal;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.drive.events.zzh;
import com.google.android.gms.drive.events.zzj;

public class zza
  implements zzh
{
  private final zzj zzapV;
  private final long zzapW;
  private final long zzapX;
  
  public zza(TransferProgressData paramTransferProgressData)
  {
    zzb localzzb = new com/google/android/gms/drive/events/internal/zzb;
    localzzb.<init>(paramTransferProgressData);
    this.zzapV = localzzb;
    long l = paramTransferProgressData.getBytesTransferred();
    this.zzapW = l;
    l = paramTransferProgressData.getTotalBytes();
    this.zzapX = l;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    Object localObject1;
    Object localObject2;
    if (paramObject != null)
    {
      localObject1 = paramObject.getClass();
      localObject2 = getClass();
      if (localObject1 == localObject2) {}
    }
    else
    {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramObject != this)
      {
        paramObject = (zza)paramObject;
        localObject1 = this.zzapV;
        localObject2 = ((zza)paramObject).zzapV;
        boolean bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          long l1 = this.zzapW;
          long l2 = ((zza)paramObject).zzapW;
          bool2 = l1 < l2;
          if (!bool2)
          {
            l1 = this.zzapX;
            l2 = ((zza)paramObject).zzapX;
            bool2 = l1 < l2;
            if (!bool2) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Long localLong = Long.valueOf(this.zzapX);
    arrayOfObject[0] = localLong;
    localLong = Long.valueOf(this.zzapW);
    arrayOfObject[1] = localLong;
    localLong = Long.valueOf(this.zzapX);
    arrayOfObject[2] = localLong;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzapV.toString();
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzapW);
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzapX);
    arrayOfObject[2] = localObject;
    return String.format("FileTransferProgress[FileTransferState: %s, BytesTransferred: %d, TotalBytes: %d]", arrayOfObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */