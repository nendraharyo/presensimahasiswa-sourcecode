package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class BeginCompoundOperationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final String mName;
  final int mVersionCode;
  final boolean zzauG;
  final boolean zzauH;
  
  static
  {
    zza localzza = new com/google/android/gms/drive/realtime/internal/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  BeginCompoundOperationRequest(int paramInt, boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    this.mVersionCode = paramInt;
    this.zzauG = paramBoolean1;
    this.mName = paramString;
    this.zzauH = paramBoolean2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\BeginCompoundOperationRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */