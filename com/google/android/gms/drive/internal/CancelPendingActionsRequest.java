package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CancelPendingActionsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final List zzapG;
  
  static
  {
    zze localzze = new com/google/android/gms/drive/internal/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  CancelPendingActionsRequest(int paramInt, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzapG = paramList;
  }
  
  public CancelPendingActionsRequest(List paramList)
  {
    this(1, paramList);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\CancelPendingActionsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */