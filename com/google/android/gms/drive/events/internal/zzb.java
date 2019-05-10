package com.google.android.gms.drive.events.internal;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.zzj;

public class zzb
  implements zzj
{
  private final int zzBc;
  private final DriveId zzaoz;
  private final int zzapT;
  
  public zzb(TransferProgressData paramTransferProgressData)
  {
    DriveId localDriveId = paramTransferProgressData.getDriveId();
    this.zzaoz = localDriveId;
    int i = paramTransferProgressData.zztb();
    this.zzapT = i;
    i = paramTransferProgressData.getStatus();
    this.zzBc = i;
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
        paramObject = (zzb)paramObject;
        localObject1 = this.zzaoz;
        localObject2 = ((zzb)paramObject).zzaoz;
        boolean bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          int i = this.zzapT;
          int j = ((zzb)paramObject).zzapT;
          if (i == j)
          {
            i = this.zzBc;
            j = ((zzb)paramObject).zzBc;
            if (i == j) {
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
    Object localObject = this.zzaoz;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzapT);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzBc);
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Integer.valueOf(this.zzapT);
    arrayOfObject[0] = localObject;
    localObject = this.zzaoz;
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzBc);
    arrayOfObject[2] = localObject;
    return String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", arrayOfObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */