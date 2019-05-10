package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DriveFileRange
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final long zzaoJ;
  final long zzaoK;
  
  static
  {
    zzc localzzc = new com/google/android/gms/drive/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  DriveFileRange(int paramInt, long paramLong1, long paramLong2)
  {
    this.mVersionCode = paramInt;
    this.zzaoJ = paramLong1;
    this.zzaoK = paramLong2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\DriveFileRange.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */