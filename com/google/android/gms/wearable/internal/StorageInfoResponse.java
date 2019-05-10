package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class StorageInfoResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int statusCode;
  public final int versionCode;
  public final long zzbta;
  public final List zzbtc;
  
  static
  {
    zzbl localzzbl = new com/google/android/gms/wearable/internal/zzbl;
    localzzbl.<init>();
    CREATOR = localzzbl;
  }
  
  StorageInfoResponse(int paramInt1, int paramInt2, long paramLong, List paramList)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.zzbta = paramLong;
    this.zzbtc = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbl.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\StorageInfoResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */