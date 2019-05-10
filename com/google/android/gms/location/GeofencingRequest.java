package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public class GeofencingRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int INITIAL_TRIGGER_DWELL = 4;
  public static final int INITIAL_TRIGGER_ENTER = 1;
  public static final int INITIAL_TRIGGER_EXIT = 2;
  private final int mVersionCode;
  private final List zzaNN;
  private final int zzaNO;
  
  static
  {
    zza localzza = new com/google/android/gms/location/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  GeofencingRequest(int paramInt1, List paramList, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzaNN = paramList;
    this.zzaNO = paramInt2;
  }
  
  private GeofencingRequest(List paramList, int paramInt)
  {
    this(1, paramList, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public List getGeofences()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    List localList = this.zzaNN;
    localArrayList.addAll(localList);
    return localArrayList;
  }
  
  public int getInitialTrigger()
  {
    return this.zzaNO;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public List zzyI()
  {
    return this.zzaNN;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\GeofencingRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */