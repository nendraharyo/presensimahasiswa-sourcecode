package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AutocompleteFilter
  implements SafeParcelable
{
  public static final zzc CREATOR;
  public static final int TYPE_FILTER_ADDRESS = 2;
  public static final int TYPE_FILTER_CITIES = 5;
  public static final int TYPE_FILTER_ESTABLISHMENT = 34;
  public static final int TYPE_FILTER_GEOCODE = 1007;
  public static final int TYPE_FILTER_NONE = 0;
  public static final int TYPE_FILTER_REGIONS = 4;
  final int mVersionCode;
  final boolean zzaPg;
  final List zzaPh;
  final int zzaPi;
  
  static
  {
    zzc localzzc = new com/google/android/gms/location/places/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  AutocompleteFilter(int paramInt, boolean paramBoolean, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzaPh = paramList;
    int j = zzg(paramList);
    this.zzaPi = j;
    j = this.mVersionCode;
    if (j < i) {
      if (paramBoolean) {}
    }
    for (this.zzaPg = i;; this.zzaPg = paramBoolean)
    {
      return;
      i = 0;
      break;
    }
  }
  
  public static AutocompleteFilter create(Collection paramCollection)
  {
    AutocompleteFilter.Builder localBuilder = new com/google/android/gms/location/places/AutocompleteFilter$Builder;
    localBuilder.<init>();
    int i = zzg(paramCollection);
    return localBuilder.setTypeFilter(i).build();
  }
  
  private static int zzg(Collection paramCollection)
  {
    int i;
    Integer localInteger;
    if (paramCollection != null)
    {
      i = paramCollection.isEmpty();
      if (i == 0) {}
    }
    else
    {
      i = 0;
      localInteger = null;
    }
    for (;;)
    {
      return i;
      localInteger = (Integer)paramCollection.iterator().next();
      int j = localInteger.intValue();
    }
  }
  
  private static List zzhJ(int paramInt)
  {
    Integer[] arrayOfInteger = new Integer[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfInteger[0] = localInteger;
    return Arrays.asList(arrayOfInteger);
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
      boolean bool2 = paramObject instanceof AutocompleteFilter;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (AutocompleteFilter)paramObject;
        int i = this.zzaPi;
        int j = this.zzaPi;
        if (i == j)
        {
          boolean bool3 = this.zzaPg;
          boolean bool4 = ((AutocompleteFilter)paramObject).zzaPg;
          if (bool3 == bool4) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public Set getPlaceTypes()
  {
    HashSet localHashSet = new java/util/HashSet;
    List localList = zzhJ(this.zzaPi);
    localHashSet.<init>(localList);
    return localHashSet;
  }
  
  public int getTypeFilter()
  {
    return this.zzaPi;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = Boolean.valueOf(this.zzaPg);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzaPi);
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Boolean.valueOf(this.zzaPg);
    localzza = localzza.zzg("includeQueryPredictions", localObject);
    localObject = Integer.valueOf(this.zzaPi);
    return localzza.zzg("typeFilter", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\AutocompleteFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */