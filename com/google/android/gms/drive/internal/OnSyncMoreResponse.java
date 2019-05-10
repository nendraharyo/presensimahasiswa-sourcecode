package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnSyncMoreResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final boolean zzaqJ;
  
  static
  {
    zzbj localzzbj = new com/google/android/gms/drive/internal/zzbj;
    localzzbj.<init>();
    CREATOR = localzzbj;
  }
  
  OnSyncMoreResponse(int paramInt, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    this.zzaqJ = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnSyncMoreResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */