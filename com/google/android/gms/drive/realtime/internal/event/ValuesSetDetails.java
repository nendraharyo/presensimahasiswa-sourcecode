package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesSetDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mIndex;
  final int mVersionCode;
  final int zzauP;
  final int zzauQ;
  
  static
  {
    zzk localzzk = new com/google/android/gms/drive/realtime/internal/event/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  ValuesSetDetails(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mVersionCode = paramInt1;
    this.mIndex = paramInt2;
    this.zzauP = paramInt3;
    this.zzauQ = paramInt4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\ValuesSetDetails.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */