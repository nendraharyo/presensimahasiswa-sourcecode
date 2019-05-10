package com.google.android.gms.location;

import java.util.ArrayList;
import java.util.Collection;

public final class LocationSettingsRequest$Builder
{
  private boolean zzaOf;
  private boolean zzaOg;
  private final ArrayList zzaOh;
  
  public LocationSettingsRequest$Builder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaOh = localArrayList;
    this.zzaOf = false;
    this.zzaOg = false;
  }
  
  public Builder addAllLocationRequests(Collection paramCollection)
  {
    this.zzaOh.addAll(paramCollection);
    return this;
  }
  
  public Builder addLocationRequest(LocationRequest paramLocationRequest)
  {
    this.zzaOh.add(paramLocationRequest);
    return this;
  }
  
  public LocationSettingsRequest build()
  {
    LocationSettingsRequest localLocationSettingsRequest = new com/google/android/gms/location/LocationSettingsRequest;
    ArrayList localArrayList = this.zzaOh;
    boolean bool1 = this.zzaOf;
    boolean bool2 = this.zzaOg;
    localLocationSettingsRequest.<init>(localArrayList, bool1, bool2, null);
    return localLocationSettingsRequest;
  }
  
  public Builder setAlwaysShow(boolean paramBoolean)
  {
    this.zzaOf = paramBoolean;
    return this;
  }
  
  public Builder setNeedBle(boolean paramBoolean)
  {
    this.zzaOg = paramBoolean;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\LocationSettingsRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */