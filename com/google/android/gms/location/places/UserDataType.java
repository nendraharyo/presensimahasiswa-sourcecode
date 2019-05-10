package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmr;
import java.util.Set;

public final class UserDataType
  implements SafeParcelable
{
  public static final zzm CREATOR;
  public static final UserDataType zzaPX = zzy("test_type", 1);
  public static final UserDataType zzaPY = zzy("labeled_place", 6);
  public static final UserDataType zzaPZ = zzy("here_content", 7);
  public static final Set zzaQa;
  final int mVersionCode;
  final String zzJN;
  final int zzaQb;
  
  static
  {
    Object localObject = zzaPX;
    UserDataType localUserDataType1 = zzaPY;
    UserDataType localUserDataType2 = zzaPZ;
    zzaQa = zzmr.zza(localObject, localUserDataType1, localUserDataType2);
    localObject = new com/google/android/gms/location/places/zzm;
    ((zzm)localObject).<init>();
    CREATOR = (zzm)localObject;
  }
  
  UserDataType(int paramInt1, String paramString, int paramInt2)
  {
    zzx.zzcM(paramString);
    this.mVersionCode = paramInt1;
    this.zzJN = paramString;
    this.zzaQb = paramInt2;
  }
  
  private static UserDataType zzy(String paramString, int paramInt)
  {
    UserDataType localUserDataType = new com/google/android/gms/location/places/UserDataType;
    localUserDataType.<init>(0, paramString, paramInt);
    return localUserDataType;
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
      boolean bool2 = paramObject instanceof UserDataType;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (UserDataType)paramObject;
        String str1 = this.zzJN;
        String str2 = ((UserDataType)paramObject).zzJN;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          int i = this.zzaQb;
          int j = ((UserDataType)paramObject).zzaQb;
          if (i == j) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    return this.zzJN.hashCode();
  }
  
  public String toString()
  {
    return this.zzJN;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\UserDataType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */