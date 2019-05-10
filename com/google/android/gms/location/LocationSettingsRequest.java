package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final List zzaBm;
  private final boolean zzaOf;
  private final boolean zzaOg;
  
  static
  {
    zzf localzzf = new com/google/android/gms/location/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  LocationSettingsRequest(int paramInt, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.mVersionCode = paramInt;
    this.zzaBm = paramList;
    this.zzaOf = paramBoolean1;
    this.zzaOg = paramBoolean2;
  }
  
  private LocationSettingsRequest(List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(3, paramList, paramBoolean1, paramBoolean2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public List zzuZ()
  {
    return Collections.unmodifiableList(this.zzaBm);
  }
  
  public boolean zzyK()
  {
    return this.zzaOf;
  }
  
  public boolean zzyL()
  {
    return this.zzaOg;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\LocationSettingsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */