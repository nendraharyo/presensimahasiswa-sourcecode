package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class AppContentTupleEntity
  implements SafeParcelable, AppContentTuple
{
  public static final AppContentTupleEntityCreator CREATOR;
  private final String mName;
  private final String mValue;
  private final int mVersionCode;
  
  static
  {
    AppContentTupleEntityCreator localAppContentTupleEntityCreator = new com/google/android/gms/games/appcontent/AppContentTupleEntityCreator;
    localAppContentTupleEntityCreator.<init>();
    CREATOR = localAppContentTupleEntityCreator;
  }
  
  AppContentTupleEntity(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.mName = paramString1;
    this.mValue = paramString2;
  }
  
  public AppContentTupleEntity(AppContentTuple paramAppContentTuple)
  {
    this.mVersionCode = 1;
    String str = paramAppContentTuple.getName();
    this.mName = str;
    str = paramAppContentTuple.getValue();
    this.mValue = str;
  }
  
  static int zza(AppContentTuple paramAppContentTuple)
  {
    Object[] arrayOfObject = new Object[2];
    String str = paramAppContentTuple.getName();
    arrayOfObject[0] = str;
    str = paramAppContentTuple.getValue();
    arrayOfObject[1] = str;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(AppContentTuple paramAppContentTuple, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof AppContentTuple;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramAppContentTuple != paramObject)
      {
        paramObject = (AppContentTuple)paramObject;
        String str1 = ((AppContentTuple)paramObject).getName();
        String str2 = paramAppContentTuple.getName();
        bool2 = zzw.equal(str1, str2);
        if (bool2)
        {
          str1 = ((AppContentTuple)paramObject).getValue();
          str2 = paramAppContentTuple.getValue();
          bool2 = zzw.equal(str1, str2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  static String zzb(AppContentTuple paramAppContentTuple)
  {
    zzw.zza localzza = zzw.zzy(paramAppContentTuple);
    String str = paramAppContentTuple.getName();
    localzza = localzza.zzg("Name", str);
    str = paramAppContentTuple.getValue();
    return localzza.zzg("Value", str).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public String getValue()
  {
    return this.mValue;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return zza(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppContentTupleEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public AppContentTuple zzwq()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentTupleEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */