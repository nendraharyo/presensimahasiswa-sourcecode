package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ObjectChangedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int zzauP;
  final int zzauQ;
  
  static
  {
    zzb localzzb = new com/google/android/gms/drive/realtime/internal/event/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  ObjectChangedDetails(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.zzauP = paramInt2;
    this.zzauQ = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\ObjectChangedDetails.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */