package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class TextInsertedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mIndex;
  final int mVersionCode;
  final int zzavn;
  
  static
  {
    zzg localzzg = new com/google/android/gms/drive/realtime/internal/event/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  TextInsertedDetails(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.mIndex = paramInt2;
    this.zzavn = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\TextInsertedDetails.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */