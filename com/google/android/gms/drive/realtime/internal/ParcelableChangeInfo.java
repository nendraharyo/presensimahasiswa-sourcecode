package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ParcelableChangeInfo
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final long zzaez;
  final List zzpH;
  
  static
  {
    zzp localzzp = new com/google/android/gms/drive/realtime/internal/zzp;
    localzzp.<init>();
    CREATOR = localzzp;
  }
  
  ParcelableChangeInfo(int paramInt, long paramLong, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzaez = paramLong;
    this.zzpH = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\ParcelableChangeInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */