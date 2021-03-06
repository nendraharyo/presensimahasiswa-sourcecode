package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ReferenceShiftedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzavj;
  final String zzavk;
  final int zzavl;
  final int zzavm;
  
  static
  {
    zze localzze = new com/google/android/gms/drive/realtime/internal/event/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  ReferenceShiftedDetails(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.zzavj = paramString1;
    this.zzavk = paramString2;
    this.zzavl = paramInt2;
    this.zzavm = paramInt3;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\ReferenceShiftedDetails.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */