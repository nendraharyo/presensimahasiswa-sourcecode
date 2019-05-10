package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public final class AppMetadata
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final List zzbaZ;
  
  static
  {
    zzb localzzb = new com/google/android/gms/nearby/connection/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  AppMetadata(int paramInt, List paramList)
  {
    this.mVersionCode = paramInt;
    List localList = (List)zzx.zzb(paramList, "Must specify application identifiers");
    this.zzbaZ = localList;
    zzx.zza(paramList.size(), "Application identifiers cannot be empty");
  }
  
  public AppMetadata(List paramList)
  {
    this(1, paramList);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public List getAppIdentifiers()
  {
    return this.zzbaZ;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\connection\AppMetadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */