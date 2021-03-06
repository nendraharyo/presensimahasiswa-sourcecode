package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class LoadRealtimeRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final DriveId zzaoz;
  final boolean zzarQ;
  final List zzarR;
  final boolean zzarS;
  final DataHolder zzarT;
  final String zzarU;
  
  static
  {
    zzar localzzar = new com/google/android/gms/drive/internal/zzar;
    localzzar.<init>();
    CREATOR = localzzar;
  }
  
  LoadRealtimeRequest(int paramInt, DriveId paramDriveId, boolean paramBoolean1, List paramList, boolean paramBoolean2, DataHolder paramDataHolder, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzaoz = paramDriveId;
    this.zzarQ = paramBoolean1;
    this.zzarR = paramList;
    this.zzarS = paramBoolean2;
    this.zzarT = paramDataHolder;
    this.zzarU = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzar.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\LoadRealtimeRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */