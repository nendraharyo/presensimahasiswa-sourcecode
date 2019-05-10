package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GetPermissionsResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final List zzarO;
  final int zzzw;
  
  static
  {
    zzal localzzal = new com/google/android/gms/drive/internal/zzal;
    localzzal.<init>();
    CREATOR = localzzal;
  }
  
  GetPermissionsResponse(int paramInt1, List paramList, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzarO = paramList;
    this.zzzw = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzal.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\GetPermissionsResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */