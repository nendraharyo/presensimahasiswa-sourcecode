package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardEntity
  implements SafeParcelable, AppContentCard
{
  public static final AppContentCardEntityCreator CREATOR;
  private final ArrayList mActions;
  private final Bundle mExtras;
  private final int mVersionCode;
  private final String zzJN;
  private final ArrayList zzaDF;
  private final int zzaDG;
  private final String zzaDH;
  private final int zzaDI;
  private final ArrayList zzaDv;
  private final String zzaDw;
  private final String zzapg;
  private final String zzaxl;
  private final String zzyv;
  
  static
  {
    AppContentCardEntityCreator localAppContentCardEntityCreator = new com/google/android/gms/games/appcontent/AppContentCardEntityCreator;
    localAppContentCardEntityCreator.<init>();
    CREATOR = localAppContentCardEntityCreator;
  }
  
  AppContentCardEntity(int paramInt1, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, String paramString1, int paramInt2, String paramString2, Bundle paramBundle, String paramString3, String paramString4, int paramInt3, String paramString5, String paramString6)
  {
    this.mVersionCode = paramInt1;
    this.mActions = paramArrayList1;
    this.zzaDF = paramArrayList2;
    this.zzaDv = paramArrayList3;
    this.zzaDw = paramString1;
    this.zzaDG = paramInt2;
    this.zzaxl = paramString2;
    this.mExtras = paramBundle;
    this.zzyv = paramString6;
    this.zzaDH = paramString3;
    this.zzapg = paramString4;
    this.zzaDI = paramInt3;
    this.zzJN = paramString5;
  }
  
  public AppContentCardEntity(AppContentCard paramAppContentCard)
  {
    this.mVersionCode = 4;
    Object localObject = paramAppContentCard.zzvQ();
    this.zzaDw = ((String)localObject);
    int j = paramAppContentCard.zzwb();
    this.zzaDG = j;
    localObject = paramAppContentCard.getDescription();
    this.zzaxl = ((String)localObject);
    localObject = paramAppContentCard.getExtras();
    this.mExtras = ((Bundle)localObject);
    localObject = paramAppContentCard.getId();
    this.zzyv = ((String)localObject);
    localObject = paramAppContentCard.getTitle();
    this.zzapg = ((String)localObject);
    localObject = paramAppContentCard.zzwc();
    this.zzaDH = ((String)localObject);
    j = paramAppContentCard.zzwd();
    this.zzaDI = j;
    localObject = paramAppContentCard.getType();
    this.zzJN = ((String)localObject);
    List localList1 = paramAppContentCard.getActions();
    int k = localList1.size();
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(k);
    this.mActions = ((ArrayList)localObject);
    int m = 0;
    List localList2 = null;
    ArrayList localArrayList1;
    while (m < k)
    {
      localArrayList1 = this.mActions;
      localObject = (AppContentActionEntity)((AppContentAction)localList1.get(m)).freeze();
      localArrayList1.add(localObject);
      j = m + 1;
      m = j;
    }
    localList1 = paramAppContentCard.zzwa();
    k = localList1.size();
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(k);
    this.zzaDF = ((ArrayList)localObject);
    m = 0;
    localList2 = null;
    while (m < k)
    {
      localArrayList1 = this.zzaDF;
      localObject = (AppContentAnnotationEntity)((AppContentAnnotation)localList1.get(m)).freeze();
      localArrayList1.add(localObject);
      j = m + 1;
      m = j;
    }
    localList2 = paramAppContentCard.zzvP();
    int n = localList2.size();
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(n);
    this.zzaDv = ((ArrayList)localObject);
    while (i < n)
    {
      ArrayList localArrayList2 = this.zzaDv;
      localObject = (AppContentConditionEntity)((AppContentCondition)localList2.get(i)).freeze();
      localArrayList2.add(localObject);
      j = i + 1;
      i = j;
    }
  }
  
  static int zza(AppContentCard paramAppContentCard)
  {
    Object[] arrayOfObject = new Object[12];
    Object localObject = paramAppContentCard.getActions();
    arrayOfObject[0] = localObject;
    localObject = paramAppContentCard.zzwa();
    arrayOfObject[1] = localObject;
    localObject = paramAppContentCard.zzvP();
    arrayOfObject[2] = localObject;
    localObject = paramAppContentCard.zzvQ();
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramAppContentCard.zzwb());
    arrayOfObject[4] = localObject;
    localObject = paramAppContentCard.getDescription();
    arrayOfObject[5] = localObject;
    localObject = paramAppContentCard.getExtras();
    arrayOfObject[6] = localObject;
    localObject = paramAppContentCard.getId();
    arrayOfObject[7] = localObject;
    localObject = paramAppContentCard.zzwc();
    arrayOfObject[8] = localObject;
    localObject = paramAppContentCard.getTitle();
    arrayOfObject[9] = localObject;
    localObject = Integer.valueOf(paramAppContentCard.zzwd());
    arrayOfObject[10] = localObject;
    localObject = paramAppContentCard.getType();
    arrayOfObject[11] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(AppContentCard paramAppContentCard, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof AppContentCard;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramAppContentCard != paramObject)
      {
        paramObject = (AppContentCard)paramObject;
        Object localObject1 = ((AppContentCard)paramObject).getActions();
        Object localObject2 = paramAppContentCard.getActions();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((AppContentCard)paramObject).zzwa();
          localObject2 = paramAppContentCard.zzwa();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((AppContentCard)paramObject).zzvP();
            localObject2 = paramAppContentCard.zzvP();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((AppContentCard)paramObject).zzvQ();
              localObject2 = paramAppContentCard.zzvQ();
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = Integer.valueOf(((AppContentCard)paramObject).zzwb());
                int i = paramAppContentCard.zzwb();
                localObject2 = Integer.valueOf(i);
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = ((AppContentCard)paramObject).getDescription();
                  localObject2 = paramAppContentCard.getDescription();
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((AppContentCard)paramObject).getExtras();
                    localObject2 = paramAppContentCard.getExtras();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = ((AppContentCard)paramObject).getId();
                      localObject2 = paramAppContentCard.getId();
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = ((AppContentCard)paramObject).zzwc();
                        localObject2 = paramAppContentCard.zzwc();
                        bool2 = zzw.equal(localObject1, localObject2);
                        if (bool2)
                        {
                          localObject1 = ((AppContentCard)paramObject).getTitle();
                          localObject2 = paramAppContentCard.getTitle();
                          bool2 = zzw.equal(localObject1, localObject2);
                          if (bool2)
                          {
                            localObject1 = Integer.valueOf(((AppContentCard)paramObject).zzwd());
                            i = paramAppContentCard.zzwd();
                            localObject2 = Integer.valueOf(i);
                            bool2 = zzw.equal(localObject1, localObject2);
                            if (bool2)
                            {
                              localObject1 = ((AppContentCard)paramObject).getType();
                              localObject2 = paramAppContentCard.getType();
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
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  static String zzb(AppContentCard paramAppContentCard)
  {
    zzw.zza localzza = zzw.zzy(paramAppContentCard);
    Object localObject = paramAppContentCard.getActions();
    localzza = localzza.zzg("Actions", localObject);
    localObject = paramAppContentCard.zzwa();
    localzza = localzza.zzg("Annotations", localObject);
    localObject = paramAppContentCard.zzvP();
    localzza = localzza.zzg("Conditions", localObject);
    localObject = paramAppContentCard.zzvQ();
    localzza = localzza.zzg("ContentDescription", localObject);
    localObject = Integer.valueOf(paramAppContentCard.zzwb());
    localzza = localzza.zzg("CurrentSteps", localObject);
    localObject = paramAppContentCard.getDescription();
    localzza = localzza.zzg("Description", localObject);
    localObject = paramAppContentCard.getExtras();
    localzza = localzza.zzg("Extras", localObject);
    localObject = paramAppContentCard.getId();
    localzza = localzza.zzg("Id", localObject);
    localObject = paramAppContentCard.zzwc();
    localzza = localzza.zzg("Subtitle", localObject);
    localObject = paramAppContentCard.getTitle();
    localzza = localzza.zzg("Title", localObject);
    localObject = Integer.valueOf(paramAppContentCard.zzwd());
    localzza = localzza.zzg("TotalSteps", localObject);
    localObject = paramAppContentCard.getType();
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
  
  public List getActions()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.mActions;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public Bundle getExtras()
  {
    return this.mExtras;
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public String getTitle()
  {
    return this.zzapg;
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
    AppContentCardEntityCreator.zza(this, paramParcel, paramInt);
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
  
  public List zzwa()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.zzaDF;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public int zzwb()
  {
    return this.zzaDG;
  }
  
  public String zzwc()
  {
    return this.zzaDH;
  }
  
  public int zzwd()
  {
    return this.zzaDI;
  }
  
  public AppContentCard zzwe()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentCardEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */