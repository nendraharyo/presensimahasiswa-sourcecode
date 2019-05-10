package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GetAllCapabilitiesResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int statusCode;
  public final int versionCode;
  final List zzbsA;
  
  static
  {
    zzah localzzah = new com/google/android/gms/wearable/internal/zzah;
    localzzah.<init>();
    CREATOR = localzzah;
  }
  
  GetAllCapabilitiesResponse(int paramInt1, int paramInt2, List paramList)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.zzbsA = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzah.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\GetAllCapabilitiesResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */