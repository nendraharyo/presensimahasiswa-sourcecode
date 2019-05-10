package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetCloudSyncOptInStatusResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int statusCode;
  public final int versionCode;
  public final boolean zzbsE;
  public final boolean zzbsF;
  
  static
  {
    zzam localzzam = new com/google/android/gms/wearable/internal/zzam;
    localzzam.<init>();
    CREATOR = localzzam;
  }
  
  GetCloudSyncOptInStatusResponse(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.zzbsE = paramBoolean1;
    this.zzbsF = paramBoolean2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzam.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\GetCloudSyncOptInStatusResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */