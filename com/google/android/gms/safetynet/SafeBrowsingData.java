package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SafeBrowsingData
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int mVersionCode;
  private String zzbgv;
  
  static
  {
    zzb localzzb = new com/google/android/gms/safetynet/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  SafeBrowsingData(int paramInt, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzbgv = paramString;
  }
  
  public SafeBrowsingData(String paramString)
  {
    this(1, paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getMetadata()
  {
    return this.zzbgv;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\safetynet\SafeBrowsingData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */