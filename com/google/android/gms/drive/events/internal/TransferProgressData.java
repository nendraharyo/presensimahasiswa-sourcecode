package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.drive.DriveId;

public class TransferProgressData
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int zzBc;
  final DriveId zzaoz;
  final int zzapT;
  final long zzapW;
  final long zzapX;
  
  static
  {
    zzc localzzc = new com/google/android/gms/drive/events/internal/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  TransferProgressData(int paramInt1, int paramInt2, DriveId paramDriveId, int paramInt3, long paramLong1, long paramLong2)
  {
    this.mVersionCode = paramInt1;
    this.zzapT = paramInt2;
    this.zzaoz = paramDriveId;
    this.zzBc = paramInt3;
    this.zzapW = paramLong1;
    this.zzapX = paramLong2;
  }
  
  public int describeContents()
  {
    return 0;
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
        paramObject = (TransferProgressData)paramObject;
        int i = this.zzapT;
        int k = ((TransferProgressData)paramObject).zzapT;
        if (i == k)
        {
          localObject1 = this.zzaoz;
          localObject2 = ((TransferProgressData)paramObject).zzaoz;
          boolean bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            int j = this.zzBc;
            k = ((TransferProgressData)paramObject).zzBc;
            if (j == k)
            {
              long l1 = this.zzapW;
              long l2 = ((TransferProgressData)paramObject).zzapW;
              boolean bool3 = l1 < l2;
              if (!bool3)
              {
                l1 = this.zzapX;
                l2 = ((TransferProgressData)paramObject).zzapX;
                bool3 = l1 < l2;
                if (!bool3) {
                  continue;
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public long getBytesTransferred()
  {
    return this.zzapW;
  }
  
  public DriveId getDriveId()
  {
    return this.zzaoz;
  }
  
  public int getStatus()
  {
    return this.zzBc;
  }
  
  public long getTotalBytes()
  {
    return this.zzapX;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Integer.valueOf(this.zzapT);
    arrayOfObject[0] = localObject;
    localObject = this.zzaoz;
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzBc);
    arrayOfObject[2] = localObject;
    localObject = Long.valueOf(this.zzapW);
    arrayOfObject[3] = localObject;
    localObject = Long.valueOf(this.zzapX);
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Integer.valueOf(this.zzapT);
    arrayOfObject[0] = localObject;
    localObject = this.zzaoz;
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzBc);
    arrayOfObject[2] = localObject;
    localObject = Long.valueOf(this.zzapW);
    arrayOfObject[3] = localObject;
    localObject = Long.valueOf(this.zzapX);
    arrayOfObject[4] = localObject;
    return String.format("TransferProgressData[TransferType: %d, DriveId: %s, status: %d, bytes transferred: %d, total bytes: %d]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public int zztb()
  {
    return this.zzapT;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\internal\TransferProgressData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */