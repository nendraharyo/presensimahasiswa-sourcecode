package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.List;

public final class PlaceLocalization
  implements SafeParcelable
{
  public static final zzo CREATOR;
  public final String address;
  public final String name;
  public final int versionCode;
  public final String zzaQO;
  public final String zzaQP;
  public final List zzaQQ;
  
  static
  {
    zzo localzzo = new com/google/android/gms/location/places/internal/zzo;
    localzzo.<init>();
    CREATOR = localzzo;
  }
  
  public PlaceLocalization(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, List paramList)
  {
    this.versionCode = paramInt;
    this.name = paramString1;
    this.address = paramString2;
    this.zzaQO = paramString3;
    this.zzaQP = paramString4;
    this.zzaQQ = paramList;
  }
  
  public static PlaceLocalization zza(String paramString1, String paramString2, String paramString3, String paramString4, List paramList)
  {
    PlaceLocalization localPlaceLocalization = new com/google/android/gms/location/places/internal/PlaceLocalization;
    localPlaceLocalization.<init>(0, paramString1, paramString2, paramString3, paramString4, paramList);
    return localPlaceLocalization;
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
      boolean bool2 = paramObject instanceof PlaceLocalization;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (PlaceLocalization)paramObject;
        Object localObject1 = this.name;
        Object localObject2 = ((PlaceLocalization)paramObject).name;
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.address;
          localObject2 = ((PlaceLocalization)paramObject).address;
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = this.zzaQO;
            localObject2 = ((PlaceLocalization)paramObject).zzaQO;
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = this.zzaQP;
              localObject2 = ((PlaceLocalization)paramObject).zzaQP;
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = this.zzaQQ;
                localObject2 = ((PlaceLocalization)paramObject).zzaQQ;
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2) {
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
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    String str = this.name;
    arrayOfObject[0] = str;
    str = this.address;
    arrayOfObject[1] = str;
    str = this.zzaQO;
    arrayOfObject[2] = str;
    str = this.zzaQP;
    arrayOfObject[3] = str;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.name;
    localzza = localzza.zzg("name", localObject);
    localObject = this.address;
    localzza = localzza.zzg("address", localObject);
    localObject = this.zzaQO;
    localzza = localzza.zzg("internationalPhoneNumber", localObject);
    localObject = this.zzaQP;
    localzza = localzza.zzg("regularOpenHours", localObject);
    localObject = this.zzaQQ;
    return localzza.zzg("attributions", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\PlaceLocalization.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */