package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionEntity
  implements SafeParcelable, AppContentAction
{
  public static final AppContentActionEntityCreator CREATOR;
  private final Bundle mExtras;
  private final int mVersionCode;
  private final String zzJN;
  private final ArrayList zzaDv;
  private final String zzaDw;
  private final AppContentAnnotationEntity zzaDx;
  private final String zzaDy;
  private final String zzyv;
  
  static
  {
    AppContentActionEntityCreator localAppContentActionEntityCreator = new com/google/android/gms/games/appcontent/AppContentActionEntityCreator;
    localAppContentActionEntityCreator.<init>();
    CREATOR = localAppContentActionEntityCreator;
  }
  
  AppContentActionEntity(int paramInt, ArrayList paramArrayList, String paramString1, Bundle paramBundle, String paramString2, String paramString3, AppContentAnnotationEntity paramAppContentAnnotationEntity, String paramString4)
  {
    this.mVersionCode = paramInt;
    this.zzaDx = paramAppContentAnnotationEntity;
    this.zzaDv = paramArrayList;
    this.zzaDw = paramString1;
    this.mExtras = paramBundle;
    this.zzyv = paramString3;
    this.zzaDy = paramString4;
    this.zzJN = paramString2;
  }
  
  public AppContentActionEntity(AppContentAction paramAppContentAction)
  {
    this.mVersionCode = 5;
    Object localObject = (AppContentAnnotationEntity)paramAppContentAction.zzvO().freeze();
    this.zzaDx = ((AppContentAnnotationEntity)localObject);
    localObject = paramAppContentAction.zzvQ();
    this.zzaDw = ((String)localObject);
    localObject = paramAppContentAction.getExtras();
    this.mExtras = ((Bundle)localObject);
    localObject = paramAppContentAction.getId();
    this.zzyv = ((String)localObject);
    localObject = paramAppContentAction.zzvR();
    this.zzaDy = ((String)localObject);
    localObject = paramAppContentAction.getType();
    this.zzJN = ((String)localObject);
    List localList = paramAppContentAction.zzvP();
    int i = localList.size();
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(i);
    this.zzaDv = ((ArrayList)localObject);
    int j = 0;
    localObject = null;
    for (int k = 0; k < i; k = j)
    {
      ArrayList localArrayList = this.zzaDv;
      localObject = (AppContentConditionEntity)((AppContentCondition)localList.get(k)).freeze();
      localArrayList.add(localObject);
      j = k + 1;
    }
  }
  
  static int zza(AppContentAction paramAppContentAction)
  {
    Object[] arrayOfObject = new Object[7];
    Object localObject = paramAppContentAction.zzvO();
    arrayOfObject[0] = localObject;
    localObject = paramAppContentAction.zzvP();
    arrayOfObject[1] = localObject;
    localObject = paramAppContentAction.zzvQ();
    arrayOfObject[2] = localObject;
    localObject = paramAppContentAction.getExtras();
    arrayOfObject[3] = localObject;
    localObject = paramAppContentAction.getId();
    arrayOfObject[4] = localObject;
    localObject = paramAppContentAction.zzvR();
    arrayOfObject[5] = localObject;
    localObject = paramAppContentAction.getType();
    arrayOfObject[6] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(AppContentAction paramAppContentAction, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof AppContentAction;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramAppContentAction != paramObject)
      {
        paramObject = (AppContentAction)paramObject;
        Object localObject1 = ((AppContentAction)paramObject).zzvO();
        Object localObject2 = paramAppContentAction.zzvO();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((AppContentAction)paramObject).zzvP();
          localObject2 = paramAppContentAction.zzvP();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((AppContentAction)paramObject).zzvQ();
            localObject2 = paramAppContentAction.zzvQ();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((AppContentAction)paramObject).getExtras();
              localObject2 = paramAppContentAction.getExtras();
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((AppContentAction)paramObject).getId();
                localObject2 = paramAppContentAction.getId();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = ((AppContentAction)paramObject).zzvR();
                  localObject2 = paramAppContentAction.zzvR();
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((AppContentAction)paramObject).getType();
                    localObject2 = paramAppContentAction.getType();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2) {
                      continue;
                    }
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  static String zzb(AppContentAction paramAppContentAction)
  {
    zzw.zza localzza = zzw.zzy(paramAppContentAction);
    Object localObject = paramAppContentAction.zzvO();
    localzza = localzza.zzg("Annotation", localObject);
    localObject = paramAppContentAction.zzvP();
    localzza = localzza.zzg("Conditions", localObject);
    localObject = paramAppContentAction.zzvQ();
    localzza = localzza.zzg("ContentDescription", localObject);
    localObject = paramAppContentAction.getExtras();
    localzza = localzza.zzg("Extras", localObject);
    localObject = paramAppContentAction.getId();
    localzza = localzza.zzg("Id", localObject);
    localObject = paramAppContentAction.zzvR();
    localzza = localzza.zzg("OverflowText", localObject);
    localObject = paramAppContentAction.getType();
    return localzza.zzg("Type", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public Bundle getExtras()
  {
    return this.mExtras;
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public String getType()
  {
    return this.zzJN;
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
    AppContentActionEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public AppContentAnnotation zzvO()
  {
    return this.zzaDx;
  }
  
  public List zzvP()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.zzaDv;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public String zzvQ()
  {
    return this.zzaDw;
  }
  
  public String zzvR()
  {
    return this.zzaDy;
  }
  
  public AppContentAction zzvS()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentActionEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */