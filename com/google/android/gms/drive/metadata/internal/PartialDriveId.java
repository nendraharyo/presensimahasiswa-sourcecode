package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class PartialDriveId
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzaoL;
  final long zzaoM;
  final int zzaoN;
  
  static
  {
    zzn localzzn = new com/google/android/gms/drive/metadata/internal/zzn;
    localzzn.<init>();
    CREATOR = localzzn;
  }
  
  PartialDriveId(int paramInt1, String paramString, long paramLong, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzaoL = paramString;
    this.zzaoM = paramLong;
    this.zzaoN = paramInt2;
  }
  
  public PartialDriveId(String paramString, long paramLong, int paramInt)
  {
    this(1, paramString, paramLong, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
  
  public DriveId zzE(long paramLong)
  {
    DriveId localDriveId = new com/google/android/gms/drive/DriveId;
    String str = this.zzaoL;
    long l = this.zzaoM;
    int i = this.zzaoN;
    localDriveId.<init>(str, l, paramLong, i);
    return localDriveId;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\PartialDriveId.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */