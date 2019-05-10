package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AttestationData
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int mVersionCode;
  private String zzbgu;
  
  static
  {
    zza localzza = new com/google/android/gms/safetynet/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  AttestationData(int paramInt, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzbgu = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getJwsResult()
  {
    return this.zzbgu;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\safetynet\AttestationData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */