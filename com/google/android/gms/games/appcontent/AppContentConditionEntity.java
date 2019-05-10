package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class AppContentConditionEntity
  implements SafeParcelable, AppContentCondition
{
  public static final AppContentConditionEntityCreator CREATOR;
  private final int mVersionCode;
  private final String zzaDJ;
  private final String zzaDK;
  private final String zzaDL;
  private final Bundle zzaDM;
  
  static
  {
    AppContentConditionEntityCreator localAppContentConditionEntityCreator = new com/google/android/gms/games/appcontent/AppContentConditionEntityCreator;
    localAppContentConditionEntityCreator.<init>();
    CREATOR = localAppContentConditionEntityCreator;
  }
  
  AppContentConditionEntity(int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    this.mVersionCode = paramInt;
    this.zzaDJ = paramString1;
    this.zzaDK = paramString2;
    this.zzaDL = paramString3;
    this.zzaDM = paramBundle;
  }
  
  public AppContentConditionEntity(AppContentCondition paramAppContentCondition)
  {
    this.mVersionCode = 1;
    Object localObject = paramAppContentCondition.zzwf();
    this.zzaDJ = ((String)localObject);
    localObject = paramAppContentCondition.zzwg();
    this.zzaDK = ((String)localObject);
    localObject = paramAppContentCondition.zzwh();
    this.zzaDL = ((String)localObject);
    localObject = paramAppContentCondition.zzwi();
    this.zzaDM = ((Bundle)localObject);
  }
  
  static int zza(AppContentCondition paramAppContentCondition)
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = paramAppContentCondition.zzwf();
    arrayOfObject[0] = localObject;
    localObject = paramAppContentCondition.zzwg();
    arrayOfObject[1] = localObject;
    localObject = paramAppContentCondition.zzwh();
    arrayOfObject[2] = localObject;
    localObject = paramAppContentCondition.zzwi();
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(AppContentCondition paramAppContentCondition, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof AppContentCondition;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramAppContentCondition != paramObject)
      {
        paramObject = (AppContentCondition)paramObject;
        Object localObject1 = ((AppContentCondition)paramObject).zzwf();
        Object localObject2 = paramAppContentCondition.zzwf();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((AppContentCondition)paramObject).zzwg();
          localObject2 = paramAppContentCondition.zzwg();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((AppContentCondition)paramObject).zzwh();
            localObject2 = paramAppContentCondition.zzwh();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((AppContentCondition)paramObject).zzwi();
              localObject2 = paramAppContentCondition.zzwi();
              bool2 = zzw.equal(localObject1, localObject2);
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
  
  static String zzb(AppContentCondition paramAppContentCondition)
  {
    zzw.zza localzza = zzw.zzy(paramAppContentCondition);
    Object localObject = paramAppContentCondition.zzwf();
    localzza = localzza.zzg("DefaultValue", localObject);
    localObject = paramAppContentCondition.zzwg();
    localzza = localzza.zzg("ExpectedValue", localObject);
    localObject = paramAppContentCondition.zzwh();
    localzza = localzza.zzg("Predicate", localObject);
    localObject = paramAppContentCondition.zzwi();
    return localzza.zzg("PredicateParameters", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
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
    AppContentConditionEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public String zzwf()
  {
    return this.zzaDJ;
  }
  
  public String zzwg()
  {
    return this.zzaDK;
  }
  
  public String zzwh()
  {
    return this.zzaDL;
  }
  
  public Bundle zzwi()
  {
    return this.zzaDM;
  }
  
  public AppContentCondition zzwj()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentConditionEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */