package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.List;

public class PlaceUserData
  implements SafeParcelable
{
  public static final zze CREATOR;
  final int mVersionCode;
  private final String zzVa;
  private final String zzaPH;
  private final List zzaRg;
  
  static
  {
    zze localzze = new com/google/android/gms/location/places/personalized/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  PlaceUserData(int paramInt, String paramString1, String paramString2, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzVa = paramString1;
    this.zzaPH = paramString2;
    this.zzaRg = paramList;
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
      boolean bool2 = paramObject instanceof PlaceUserData;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (PlaceUserData)paramObject;
        Object localObject1 = this.zzVa;
        Object localObject2 = ((PlaceUserData)paramObject).zzVa;
        bool2 = ((String)localObject1).equals(localObject2);
        if (bool2)
        {
          localObject1 = this.zzaPH;
          localObject2 = ((PlaceUserData)paramObject).zzaPH;
          bool2 = ((String)localObject1).equals(localObject2);
          if (bool2)
          {
            localObject1 = this.zzaRg;
            localObject2 = ((PlaceUserData)paramObject).zzaRg;
            bool2 = ((List)localObject1).equals(localObject2);
            if (bool2) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public String getPlaceId()
  {
    return this.zzaPH;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzVa;
    arrayOfObject[0] = localObject;
    localObject = this.zzaPH;
    arrayOfObject[1] = localObject;
    localObject = this.zzaRg;
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzVa;
    localzza = localzza.zzg("accountName", localObject);
    localObject = this.zzaPH;
    localzza = localzza.zzg("placeId", localObject);
    localObject = this.zzaRg;
    return localzza.zzg("placeAliases", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public String zzzD()
  {
    return this.zzVa;
  }
  
  public List zzzE()
  {
    return this.zzaRg;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\personalized\PlaceUserData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */