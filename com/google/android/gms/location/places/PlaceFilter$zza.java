package com.google.android.gms.location.places;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class PlaceFilter$zza
{
  private boolean zzaPA = false;
  private Collection zzaPB = null;
  private Collection zzaPC = null;
  private String[] zzaPD = null;
  
  public PlaceFilter zzze()
  {
    List localList = null;
    Object localObject1 = this.zzaPB;
    Object localObject2;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = new java/util/ArrayList;
      localObject2 = this.zzaPB;
      ((ArrayList)localObject1).<init>((Collection)localObject2);
      localObject2 = this.zzaPC;
      if (localObject2 == null) {
        break label98;
      }
      localObject2 = new java/util/ArrayList;
      localObject3 = this.zzaPC;
      ((ArrayList)localObject2).<init>((Collection)localObject3);
    }
    for (;;)
    {
      localObject3 = this.zzaPD;
      if (localObject3 != null) {
        localList = Arrays.asList(this.zzaPD);
      }
      localObject3 = new com/google/android/gms/location/places/PlaceFilter;
      boolean bool = this.zzaPA;
      ((PlaceFilter)localObject3).<init>((Collection)localObject1, bool, localList, (Collection)localObject2);
      return (PlaceFilter)localObject3;
      localObject1 = null;
      break;
      label98:
      localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlaceFilter$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */