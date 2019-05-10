package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class NearbyAlertFilter
  extends zza
  implements SafeParcelable
{
  public static final zzd CREATOR;
  final int mVersionCode;
  final List zzaPj;
  final List zzaPk;
  final List zzaPl;
  final String zzaPm;
  final boolean zzaPn;
  private final Set zzaPo;
  private final Set zzaPp;
  private final Set zzaPq;
  
  static
  {
    zzd localzzd = new com/google/android/gms/location/places/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  NearbyAlertFilter(int paramInt, List paramList1, List paramList2, List paramList3, String paramString, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    if (paramList2 == null)
    {
      localObject = Collections.emptyList();
      this.zzaPk = ((List)localObject);
      if (paramList3 != null) {
        break label122;
      }
      localObject = Collections.emptyList();
      label34:
      this.zzaPl = ((List)localObject);
      if (paramList1 != null) {
        break label132;
      }
    }
    label122:
    label132:
    for (Object localObject = Collections.emptyList();; localObject = Collections.unmodifiableList(paramList1))
    {
      this.zzaPj = ((List)localObject);
      localObject = zzw(this.zzaPk);
      this.zzaPp = ((Set)localObject);
      localObject = zzw(this.zzaPl);
      this.zzaPq = ((Set)localObject);
      localObject = zzw(this.zzaPj);
      this.zzaPo = ((Set)localObject);
      this.zzaPm = paramString;
      this.zzaPn = paramBoolean;
      return;
      localObject = Collections.unmodifiableList(paramList2);
      break;
      localObject = Collections.unmodifiableList(paramList3);
      break label34;
    }
  }
  
  public static NearbyAlertFilter zzh(Collection paramCollection)
  {
    if (paramCollection != null)
    {
      boolean bool = paramCollection.isEmpty();
      if (!bool) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("NearbyAlertFilters must contain at least oneplace ID to match results with.");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/location/places/NearbyAlertFilter;
    List localList = zzf(paramCollection);
    ((NearbyAlertFilter)localObject).<init>(0, localList, null, null, null, false);
    return (NearbyAlertFilter)localObject;
  }
  
  public static NearbyAlertFilter zzi(Collection paramCollection)
  {
    if (paramCollection != null)
    {
      boolean bool = paramCollection.isEmpty();
      if (!bool) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("NearbyAlertFilters must contain at least oneplace type to match results with.");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/location/places/NearbyAlertFilter;
    List localList = zzf(paramCollection);
    ((NearbyAlertFilter)localObject).<init>(0, null, localList, null, null, false);
    return (NearbyAlertFilter)localObject;
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
      boolean bool2 = paramObject instanceof NearbyAlertFilter;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (NearbyAlertFilter)paramObject;
        Object localObject1 = this.zzaPm;
        if (localObject1 == null)
        {
          localObject1 = ((NearbyAlertFilter)paramObject).zzaPm;
          if (localObject1 != null)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaPp;
        Object localObject2 = ((NearbyAlertFilter)paramObject).zzaPp;
        bool2 = ((Set)localObject1).equals(localObject2);
        if (bool2)
        {
          localObject1 = this.zzaPq;
          localObject2 = ((NearbyAlertFilter)paramObject).zzaPq;
          bool2 = ((Set)localObject1).equals(localObject2);
          if (bool2)
          {
            localObject1 = this.zzaPo;
            localObject2 = ((NearbyAlertFilter)paramObject).zzaPo;
            bool2 = ((Set)localObject1).equals(localObject2);
            if (bool2)
            {
              localObject1 = this.zzaPm;
              if (localObject1 != null)
              {
                localObject1 = this.zzaPm;
                localObject2 = ((NearbyAlertFilter)paramObject).zzaPm;
                bool2 = ((String)localObject1).equals(localObject2);
                if (!bool2) {}
              }
              else
              {
                bool2 = this.zzaPn;
                boolean bool3 = ((NearbyAlertFilter)paramObject).zzyX();
                if (bool2 == bool3) {
                  continue;
                }
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
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = this.zzaPp;
    arrayOfObject[0] = localObject;
    localObject = this.zzaPq;
    arrayOfObject[1] = localObject;
    localObject = this.zzaPo;
    arrayOfObject[2] = localObject;
    localObject = this.zzaPm;
    arrayOfObject[3] = localObject;
    localObject = Boolean.valueOf(this.zzaPn);
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject1 = this.zzaPp;
    boolean bool = ((Set)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = "types";
      localObject2 = this.zzaPp;
      localzza.zzg((String)localObject1, localObject2);
    }
    localObject1 = this.zzaPo;
    bool = ((Set)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = "placeIds";
      localObject2 = this.zzaPo;
      localzza.zzg((String)localObject1, localObject2);
    }
    localObject1 = this.zzaPq;
    bool = ((Set)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = "requestedUserDataTypes";
      localObject2 = this.zzaPq;
      localzza.zzg((String)localObject1, localObject2);
    }
    localObject1 = this.zzaPm;
    if (localObject1 != null)
    {
      localObject1 = "chainName";
      localObject2 = this.zzaPm;
      localzza.zzg((String)localObject1, localObject2);
    }
    Object localObject2 = Boolean.valueOf(this.zzaPn);
    localzza.zzg("Beacon required: ", localObject2);
    return localzza.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzyX()
  {
    return this.zzaPn;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\NearbyAlertFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */