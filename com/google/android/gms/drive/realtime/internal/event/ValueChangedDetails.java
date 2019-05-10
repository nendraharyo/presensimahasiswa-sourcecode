package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValueChangedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int zzauO;
  
  static
  {
    zzh localzzh = new com/google/android/gms/drive/realtime/internal/event/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  ValueChangedDetails(int paramInt1, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzauO = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\ValueChangedDetails.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */