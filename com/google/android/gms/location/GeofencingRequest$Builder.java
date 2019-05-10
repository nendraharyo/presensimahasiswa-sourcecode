package com.google.android.gms.location;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class GeofencingRequest$Builder
{
  private final List zzaNN;
  private int zzaNO;
  
  public GeofencingRequest$Builder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaNN = localArrayList;
    this.zzaNO = 5;
  }
  
  public static int zzhp(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public Builder addGeofence(Geofence paramGeofence)
  {
    zzx.zzb(paramGeofence, "geofence can't be null.");
    zzx.zzb(paramGeofence instanceof ParcelableGeofence, "Geofence must be created using Geofence.Builder.");
    List localList = this.zzaNN;
    paramGeofence = (ParcelableGeofence)paramGeofence;
    localList.add(paramGeofence);
    return this;
  }
  
  public Builder addGeofences(List paramList)
  {
    boolean bool;
    if (paramList != null)
    {
      bool = paramList.isEmpty();
      if (!bool) {}
    }
    else
    {
      return this;
    }
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Geofence localGeofence = (Geofence)localIterator.next();
      if (localGeofence != null) {
        addGeofence(localGeofence);
      }
    }
  }
  
  public GeofencingRequest build()
  {
    Object localObject = this.zzaNN;
    boolean bool = ((List)localObject).isEmpty();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "No geofence has been added to this request.");
      localObject = new com/google/android/gms/location/GeofencingRequest;
      List localList = this.zzaNN;
      int i = this.zzaNO;
      ((GeofencingRequest)localObject).<init>(localList, i, null);
      return (GeofencingRequest)localObject;
      bool = false;
      localObject = null;
    }
  }
  
  public Builder setInitialTrigger(int paramInt)
  {
    int i = zzhp(paramInt);
    this.zzaNO = i;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\GeofencingRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */