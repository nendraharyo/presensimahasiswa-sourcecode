package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetCloudSyncSettingResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final boolean enabled;
  public final int statusCode;
  public final int versionCode;
  
  static
  {
    zzan localzzan = new com/google/android/gms/wearable/internal/zzan;
    localzzan.<init>();
    CREATOR = localzzan;
  }
  
  GetCloudSyncSettingResponse(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.enabled = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzan.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\GetCloudSyncSettingResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */