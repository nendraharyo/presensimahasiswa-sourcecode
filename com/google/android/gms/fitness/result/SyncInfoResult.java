package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class SyncInfoResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Status zzUX;
  private final long zzaez;
  
  static
  {
    zzl localzzl = new com/google/android/gms/fitness/result/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  SyncInfoResult(int paramInt, Status paramStatus, long paramLong)
  {
    this.mVersionCode = paramInt;
    this.zzUX = paramStatus;
    this.zzaez = paramLong;
  }
  
  private boolean zzb(SyncInfoResult paramSyncInfoResult)
  {
    Object localObject1 = this.zzUX;
    Object localObject2 = paramSyncInfoResult.zzUX;
    boolean bool = ((Status)localObject1).equals(localObject2);
    if (bool)
    {
      long l1 = this.zzaez;
      localObject1 = Long.valueOf(l1);
      long l2 = paramSyncInfoResult.zzaez;
      localObject2 = Long.valueOf(l2);
      bool = zzw.equal(localObject1, localObject2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      bool = paramObject instanceof SyncInfoResult;
      if (!bool) {
        break label33;
      }
      paramObject = (SyncInfoResult)paramObject;
      bool = zzb((SyncInfoResult)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzUX;
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzaez);
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzUX;
    localzza = localzza.zzg("status", localObject);
    localObject = Long.valueOf(this.zzaez);
    return localzza.zzg("timestamp", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public long zzvq()
  {
    return this.zzaez;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\SyncInfoResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */