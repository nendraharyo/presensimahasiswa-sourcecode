package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;

public class PlaceReport
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final String mTag;
  final int mVersionCode;
  private final String zzaPH;
  private final String zzaPI;
  
  static
  {
    zzj localzzj = new com/google/android/gms/location/places/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  PlaceReport(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.mVersionCode = paramInt;
    this.zzaPH = paramString1;
    this.mTag = paramString2;
    this.zzaPI = paramString3;
  }
  
  public static PlaceReport create(String paramString1, String paramString2)
  {
    return zzk(paramString1, paramString2, "unknown");
  }
  
  private static boolean zzel(String paramString)
  {
    int i = 1;
    int j = -1;
    int k = paramString.hashCode();
    switch (k)
    {
    }
    for (;;)
    {
      switch (j)
      {
      default: 
        i = 0;
      }
      return i;
      String str = "unknown";
      boolean bool = paramString.equals(str);
      if (bool)
      {
        j = 0;
        continue;
        str = "userReported";
        bool = paramString.equals(str);
        if (bool)
        {
          j = i;
          continue;
          str = "inferredGeofencing";
          bool = paramString.equals(str);
          if (bool)
          {
            j = 2;
            continue;
            str = "inferredRadioSignals";
            bool = paramString.equals(str);
            if (bool)
            {
              j = 3;
              continue;
              str = "inferredReverseGeocoding";
              bool = paramString.equals(str);
              if (bool)
              {
                j = 4;
                continue;
                str = "inferredSnappedToRoad";
                bool = paramString.equals(str);
                if (bool) {
                  j = 5;
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static PlaceReport zzk(String paramString1, String paramString2, String paramString3)
  {
    zzx.zzz(paramString1);
    zzx.zzcM(paramString2);
    zzx.zzcM(paramString3);
    zzx.zzb(zzel(paramString3), "Invalid source");
    PlaceReport localPlaceReport = new com/google/android/gms/location/places/PlaceReport;
    localPlaceReport.<init>(1, paramString1, paramString2, paramString3);
    return localPlaceReport;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof PlaceReport;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (PlaceReport)paramObject;
      String str1 = this.zzaPH;
      String str2 = ((PlaceReport)paramObject).zzaPH;
      bool2 = zzw.equal(str1, str2);
      if (bool2)
      {
        str1 = this.mTag;
        str2 = ((PlaceReport)paramObject).mTag;
        bool2 = zzw.equal(str1, str2);
        if (bool2)
        {
          str1 = this.zzaPI;
          str2 = ((PlaceReport)paramObject).zzaPI;
          bool2 = zzw.equal(str1, str2);
          if (bool2) {
            bool1 = true;
          }
        }
      }
    }
  }
  
  public String getPlaceId()
  {
    return this.zzaPH;
  }
  
  public String getSource()
  {
    return this.zzaPI;
  }
  
  public String getTag()
  {
    return this.mTag;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    String str = this.zzaPH;
    arrayOfObject[0] = str;
    str = this.mTag;
    arrayOfObject[1] = str;
    str = this.zzaPI;
    arrayOfObject[2] = str;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    String str1 = this.zzaPH;
    localzza.zzg("placeId", str1);
    str1 = this.mTag;
    localzza.zzg("tag", str1);
    String str2 = "unknown";
    str1 = this.zzaPI;
    boolean bool = str2.equals(str1);
    if (!bool)
    {
      str2 = "source";
      str1 = this.zzaPI;
      localzza.zzg(str2, str1);
    }
    return localzza.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlaceReport.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */