package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Locale;

public class PlacesParams
  implements SafeParcelable
{
  public static final zzs CREATOR;
  public static final PlacesParams zzaQW;
  public final int versionCode;
  public final String zzaPU;
  public final String zzaQX;
  public final String zzaQY;
  public final String zzaQZ;
  public final int zzaRa;
  public final int zzaRb;
  
  static
  {
    Object localObject = new com/google/android/gms/location/places/internal/PlacesParams;
    Locale localLocale = Locale.getDefault();
    ((PlacesParams)localObject).<init>("com.google.android.gms", localLocale, null);
    zzaQW = (PlacesParams)localObject;
    localObject = new com/google/android/gms/location/places/internal/zzs;
    ((zzs)localObject).<init>();
    CREATOR = (zzs)localObject;
  }
  
  public PlacesParams(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, int paramInt3)
  {
    this.versionCode = paramInt1;
    this.zzaQX = paramString1;
    this.zzaQY = paramString2;
    this.zzaQZ = paramString3;
    this.zzaPU = paramString4;
    this.zzaRa = paramInt2;
    this.zzaRb = paramInt3;
  }
  
  public PlacesParams(String paramString1, Locale paramLocale, String paramString2)
  {
    this(3, paramString1, str, paramString2, null, i, 0);
  }
  
  public PlacesParams(String paramString1, Locale paramLocale, String paramString2, String paramString3, int paramInt)
  {
    this(3, paramString1, str, paramString2, paramString3, i, paramInt);
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
      if (paramObject != null)
      {
        boolean bool2 = paramObject instanceof PlacesParams;
        if (bool2) {}
      }
      else
      {
        bool1 = false;
        continue;
      }
      paramObject = (PlacesParams)paramObject;
      int i = this.zzaRa;
      int j = ((PlacesParams)paramObject).zzaRa;
      if (i == j)
      {
        i = this.zzaRb;
        j = ((PlacesParams)paramObject).zzaRb;
        if (i == j)
        {
          String str1 = this.zzaQY;
          String str2 = ((PlacesParams)paramObject).zzaQY;
          boolean bool3 = str1.equals(str2);
          if (bool3)
          {
            str1 = this.zzaQX;
            str2 = ((PlacesParams)paramObject).zzaQX;
            bool3 = str1.equals(str2);
            if (bool3)
            {
              str1 = this.zzaQZ;
              str2 = ((PlacesParams)paramObject).zzaQZ;
              bool3 = zzw.equal(str1, str2);
              if (bool3)
              {
                str1 = this.zzaPU;
                str2 = ((PlacesParams)paramObject).zzaPU;
                bool3 = zzw.equal(str1, str2);
                if (bool3) {
                  continue;
                }
              }
            }
          }
        }
      }
      bool1 = false;
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    Object localObject = this.zzaQX;
    arrayOfObject[0] = localObject;
    localObject = this.zzaQY;
    arrayOfObject[1] = localObject;
    localObject = this.zzaQZ;
    arrayOfObject[2] = localObject;
    localObject = this.zzaPU;
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(this.zzaRa);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(this.zzaRb);
    arrayOfObject[5] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    String str = this.zzaQX;
    localzza = localzza.zzg("clientPackageName", str);
    str = this.zzaQY;
    localzza = localzza.zzg("locale", str);
    str = this.zzaQZ;
    localzza = localzza.zzg("accountName", str);
    str = this.zzaPU;
    return localzza.zzg("gCoreClientName", str).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzs.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\PlacesParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */