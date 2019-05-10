package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class PlaceFilter
  extends zza
  implements SafeParcelable
{
  public static final zzg CREATOR;
  private static final PlaceFilter zzaPz;
  final int mVersionCode;
  final boolean zzaPA;
  final List zzaPj;
  final List zzaPk;
  final List zzaPl;
  private final Set zzaPo;
  private final Set zzaPp;
  private final Set zzaPq;
  
  static
  {
    Object localObject = new com/google/android/gms/location/places/zzg;
    ((zzg)localObject).<init>();
    CREATOR = (zzg)localObject;
    localObject = new com/google/android/gms/location/places/PlaceFilter;
    ((PlaceFilter)localObject).<init>();
    zzaPz = (PlaceFilter)localObject;
  }
  
  public PlaceFilter()
  {
    this(false, null);
  }
  
  PlaceFilter(int paramInt, List paramList1, boolean paramBoolean, List paramList2, List paramList3)
  {
    this.mVersionCode = paramInt;
    if (paramList1 == null)
    {
      localObject = Collections.emptyList();
      this.zzaPk = ((List)localObject);
      this.zzaPA = paramBoolean;
      if (paramList3 != null) {
        break label116;
      }
      localObject = Collections.emptyList();
      label39:
      this.zzaPl = ((List)localObject);
      if (paramList2 != null) {
        break label126;
      }
    }
    label116:
    label126:
    for (Object localObject = Collections.emptyList();; localObject = Collections.unmodifiableList(paramList2))
    {
      this.zzaPj = ((List)localObject);
      localObject = zzw(this.zzaPk);
      this.zzaPp = ((Set)localObject);
      localObject = zzw(this.zzaPl);
      this.zzaPq = ((Set)localObject);
      localObject = zzw(this.zzaPj);
      this.zzaPo = ((Set)localObject);
      return;
      localObject = Collections.unmodifiableList(paramList1);
      break;
      localObject = Collections.unmodifiableList(paramList3);
      break label39;
    }
  }
  
  public PlaceFilter(Collection paramCollection1, boolean paramBoolean, Collection paramCollection2, Collection paramCollection3)
  {
    this(0, localList1, paramBoolean, localList2, localList3);
  }
  
  public PlaceFilter(boolean paramBoolean, Collection paramCollection)
  {
    this(null, paramBoolean, paramCollection, null);
  }
  
  public static PlaceFilter zzzd()
  {
    PlaceFilter.zza localzza = new com/google/android/gms/location/places/PlaceFilter$zza;
    localzza.<init>(null);
    return localzza.zzze();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof PlaceFilter;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (PlaceFilter)paramObject;
        Set localSet1 = this.zzaPp;
        Set localSet2 = ((PlaceFilter)paramObject).zzaPp;
        bool2 = localSet1.equals(localSet2);
        if (bool2)
        {
          bool2 = this.zzaPA;
          boolean bool3 = ((PlaceFilter)paramObject).zzaPA;
          if (bool2 == bool3)
          {
            localSet1 = this.zzaPq;
            localSet2 = ((PlaceFilter)paramObject).zzaPq;
            bool2 = localSet1.equals(localSet2);
            if (bool2)
            {
              localSet1 = this.zzaPo;
              localSet2 = ((PlaceFilter)paramObject).zzaPo;
              bool2 = localSet1.equals(localSet2);
              if (bool2) {
                continue;
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public Set getPlaceIds()
  {
    return this.zzaPo;
  }
  
  public Set getPlaceTypes()
  {
    return this.zzaPp;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.zzaPp;
    arrayOfObject[0] = localObject;
    localObject = Boolean.valueOf(this.zzaPA);
    arrayOfObject[1] = localObject;
    localObject = this.zzaPq;
    arrayOfObject[2] = localObject;
    localObject = this.zzaPo;
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isRestrictedToPlacesOpenNow()
  {
    return this.zzaPA;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject1 = this.zzaPp;
    boolean bool1 = ((Set)localObject1).isEmpty();
    if (!bool1)
    {
      localObject1 = "types";
      localObject2 = this.zzaPp;
      localzza.zzg((String)localObject1, localObject2);
    }
    boolean bool2 = this.zzaPA;
    Object localObject2 = Boolean.valueOf(bool2);
    localzza.zzg("requireOpenNow", localObject2);
    localObject1 = this.zzaPo;
    bool1 = ((Set)localObject1).isEmpty();
    if (!bool1)
    {
      localObject1 = "placeIds";
      localObject2 = this.zzaPo;
      localzza.zzg((String)localObject1, localObject2);
    }
    localObject1 = this.zzaPq;
    bool1 = ((Set)localObject1).isEmpty();
    if (!bool1)
    {
      localObject1 = "requestedUserDataTypes";
      localObject2 = this.zzaPq;
      localzza.zzg((String)localObject1, localObject2);
    }
    return localzza.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlaceFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */