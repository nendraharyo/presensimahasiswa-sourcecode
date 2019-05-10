package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeofencingEvent
{
  private final int zzGu;
  private final int zzaNK;
  private final List zzaNL;
  private final Location zzaNM;
  
  private GeofencingEvent(int paramInt1, int paramInt2, List paramList, Location paramLocation)
  {
    this.zzGu = paramInt1;
    this.zzaNK = paramInt2;
    this.zzaNL = paramList;
    this.zzaNM = paramLocation;
  }
  
  public static GeofencingEvent fromIntent(Intent paramIntent)
  {
    if (paramIntent == null) {}
    GeofencingEvent localGeofencingEvent;
    for (Object localObject = null;; localObject = localGeofencingEvent)
    {
      return (GeofencingEvent)localObject;
      int i = -1;
      int j = paramIntent.getIntExtra("gms_error_code", i);
      int k = zzx(paramIntent);
      List localList = zzy(paramIntent);
      localObject = (Location)paramIntent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
      localGeofencingEvent = new com/google/android/gms/location/GeofencingEvent;
      localGeofencingEvent.<init>(j, k, localList, (Location)localObject);
    }
  }
  
  private static int zzx(Intent paramIntent)
  {
    int i = -1;
    String str = "com.google.android.location.intent.extra.transition";
    int j = paramIntent.getIntExtra(str, i);
    if (j == i) {}
    for (;;)
    {
      return i;
      int k = 1;
      if (j != k)
      {
        k = 2;
        if (j != k)
        {
          k = 4;
          if (j != k) {
            continue;
          }
        }
      }
      i = j;
    }
  }
  
  private static List zzy(Intent paramIntent)
  {
    Object localObject = (ArrayList)paramIntent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
    boolean bool;
    if (localObject == null) {
      bool = false;
    }
    ArrayList localArrayList;
    for (localObject = null;; localObject = localArrayList)
    {
      return (List)localObject;
      localArrayList = new java/util/ArrayList;
      int i = ((ArrayList)localObject).size();
      localArrayList.<init>(i);
      Iterator localIterator = ((ArrayList)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = ParcelableGeofence.zzo((byte[])localIterator.next());
        localArrayList.add(localObject);
      }
    }
  }
  
  public int getErrorCode()
  {
    return this.zzGu;
  }
  
  public int getGeofenceTransition()
  {
    return this.zzaNK;
  }
  
  public List getTriggeringGeofences()
  {
    return this.zzaNL;
  }
  
  public Location getTriggeringLocation()
  {
    return this.zzaNM;
  }
  
  public boolean hasError()
  {
    int i = this.zzGu;
    int k = -1;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\GeofencingEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */