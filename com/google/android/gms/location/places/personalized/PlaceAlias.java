package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class PlaceAlias
  implements SafeParcelable
{
  public static final zzb CREATOR;
  public static final PlaceAlias zzaRc;
  public static final PlaceAlias zzaRd;
  final int mVersionCode;
  private final String zzaRe;
  
  static
  {
    Object localObject = new com/google/android/gms/location/places/personalized/zzb;
    ((zzb)localObject).<init>();
    CREATOR = (zzb)localObject;
    localObject = new com/google/android/gms/location/places/personalized/PlaceAlias;
    ((PlaceAlias)localObject).<init>(0, "Home");
    zzaRc = (PlaceAlias)localObject;
    localObject = new com/google/android/gms/location/places/personalized/PlaceAlias;
    ((PlaceAlias)localObject).<init>(0, "Work");
    zzaRd = (PlaceAlias)localObject;
  }
  
  PlaceAlias(int paramInt, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzaRe = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof PlaceAlias;
      String str1;
      if (!bool)
      {
        bool = false;
        str1 = null;
      }
      else
      {
        paramObject = (PlaceAlias)paramObject;
        str1 = this.zzaRe;
        String str2 = ((PlaceAlias)paramObject).zzaRe;
        bool = zzw.equal(str1, str2);
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    String str = this.zzaRe;
    arrayOfObject[0] = str;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    String str = this.zzaRe;
    return localzza.zzg("alias", str).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public String zzzB()
  {
    return this.zzaRe;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\personalized\PlaceAlias.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */