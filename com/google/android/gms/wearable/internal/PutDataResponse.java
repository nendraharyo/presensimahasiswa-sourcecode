package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class PutDataResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int statusCode;
  public final int versionCode;
  public final DataItemParcelable zzbsJ;
  
  static
  {
    zzbf localzzbf = new com/google/android/gms/wearable/internal/zzbf;
    localzzbf.<init>();
    CREATOR = localzzbf;
  }
  
  PutDataResponse(int paramInt1, int paramInt2, DataItemParcelable paramDataItemParcelable)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.zzbsJ = paramDataItemParcelable;
  }
  
  public PutDataResponse(int paramInt, DataItemParcelable paramDataItemParcelable)
  {
    this(1, paramInt, paramDataItemParcelable);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbf.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\PutDataResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */