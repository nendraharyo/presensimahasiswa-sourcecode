package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetDataItemResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int statusCode;
  public final int versionCode;
  public final DataItemParcelable zzbsJ;
  
  static
  {
    zzar localzzar = new com/google/android/gms/wearable/internal/zzar;
    localzzar.<init>();
    CREATOR = localzzar;
  }
  
  GetDataItemResponse(int paramInt1, int paramInt2, DataItemParcelable paramDataItemParcelable)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.zzbsJ = paramDataItemParcelable;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\GetDataItemResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */