package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnLoadRealtimeResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final boolean zzqA;
  
  static
  {
    zzbg localzzbg = new com/google/android/gms/drive/internal/zzbg;
    localzzbg.<init>();
    CREATOR = localzzbg;
  }
  
  OnLoadRealtimeResponse(int paramInt, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    this.zzqA = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbg.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnLoadRealtimeResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */