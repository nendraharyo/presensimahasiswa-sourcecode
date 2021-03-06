package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesRemovedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mIndex;
  final int mVersionCode;
  final int zzauP;
  final int zzauQ;
  final String zzavq;
  final int zzavr;
  
  static
  {
    zzj localzzj = new com/google/android/gms/drive/realtime/internal/event/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  ValuesRemovedDetails(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, int paramInt5)
  {
    this.mVersionCode = paramInt1;
    this.mIndex = paramInt2;
    this.zzauP = paramInt3;
    this.zzauQ = paramInt4;
    this.zzavq = paramString;
    this.zzavr = paramInt5;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\ValuesRemovedDetails.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */