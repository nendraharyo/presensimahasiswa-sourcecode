package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.ArrayList;
import java.util.List;

public final class AppContentSectionEntity
  implements SafeParcelable, AppContentSection
{
  public static final AppContentSectionEntityCreator CREATOR;
  private final ArrayList mActions;
  private final Bundle mExtras;
  private final int mVersionCode;
  private final String zzJN;
  private final ArrayList zzaDF;
  private final String zzaDH;
  private final ArrayList zzaDO;
  private final String zzaDP;
  private final String zzaDw;
  private final String zzapg;
  private final String zzyv;
  
  static
  {
    AppContentSectionEntityCreator localAppContentSectionEntityCreator = new com/google/android/gms/games/appcontent/AppContentSectionEntityCreator;
    localAppContentSectionEntityCreator.<init>();
    CREATOR = localAppContentSectionEntityCreator;
  }
  
  AppContentSectionEntity(int paramInt, ArrayList paramArrayList1, ArrayList paramArrayList2, String paramString1, Bundle paramBundle, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, ArrayList paramArrayList3)
  {
    this.mVersionCode = paramInt;
    this.mActions = paramArrayList1;
    this.zzaDF = paramArrayList3;
    this.zzaDO = paramArrayList2;
    this.zzaDP = paramString6;
    this.zzaDw = paramString1;
    this.mExtras = paramBundle;
    this.zzyv = paramString5;
    this.zzaDH = paramString2;
    this.zzapg = paramString3;
    this.zzJN = paramString4;
  }
  
  public AppContentSectionEntity(AppContentSection paramAppContentSection)
  {
    int j = 5;
    this.mVersionCode = j;
    Object localObject = paramAppContentSection.zzwl();
    this.zzaDP = ((String)localObject);
    localObject = paramAppContentSection.zzvQ();
    this.zzaDw = ((String)localObject);
    localObject = paramAppContentSection.getExtras();
    this.mExtras = ((Bundle)localObject);
    localObject = paramAppContentSection.getId();
    this.zzyv = ((String)localObject);
    localObject = paramAppContentSection.zzwc();
    this.zzaDH = ((String)localObject);
    localObject = paramAppContentSection.getTitle();
    this.zzapg = ((String)localObject);
    localObject = paramAppContentSection.getType();
    this.zzJN = ((String)localObject);
    List localList1 = paramAppContentSection.getActions();
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
    localList1 = paramAppContentSection.zzwk();
    k = localList1.size();
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(k);
    this.zzaDO = ((ArrayList)localObject);
    m = 0;
    localList2 = null;
    while (m < k)
    {
      localArrayList1 = this.zzaDO;
      localObject = (AppContentCardEntity)((AppContentCard)localList1.get(m)).freeze();
      localArrayList1.add(localObject);
      j = m + 1;
      m = j;
    }
    localList2 = paramAppContentSection.zzwa();
    int n = localList2.size();
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(n);
    this.zzaDF = ((ArrayList)localObject);
    while (i < n)
    {
      ArrayList localArrayList2 = this.zzaDF;
      localObject = (AppContentAnnotationEntity)((AppContentAnnotation)localList2.get(i)).freeze();
      localArrayList2.add(localObject);
      j = i + 1;
      i = j;
    }
  }
  
  static int zza(AppContentSection paramAppContentSection)
  {
    Object[] arrayOfObject = new Object[10];
    Object localObject = paramAppContentSection.getActions();
    arrayOfObject[0] = localObject;
    localObject = paramAppContentSection.zzwa();
    arrayOfObject[1] = localObject;
    localObject = paramAppContentSection.zzwk();
    arrayOfObject[2] = localObject;
    localObject = paramAppContentSection.zzwl();
    arrayOfObject[3] = localObject;
    localObject = paramAppContentSection.zzvQ();
    arrayOfObject[4] = localObject;
    localObject = paramAppContentSection.getExtras();
    arrayOfObject[5] = localObject;
    localObject = paramAppContentSection.getId();
    arrayOfObject[6] = localObject;
    localObject = paramAppContentSection.zzwc();
    arrayOfObject[7] = localObject;
    localObject = paramAppContentSection.getTitle();
    arrayOfObject[8] = localObject;
    localObject = paramAppContentSection.getType();
    arrayOfObject[9] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(AppContentSection paramAppContentSection, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof AppContentSection;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramAppContentSection != paramObject)
      {
        paramObject = (AppContentSection)paramObject;
        Object localObject1 = ((AppContentSection)paramObject).getActions();
        Object localObject2 = paramAppContentSection.getActions();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((AppContentSection)paramObject).zzwa();
          localObject2 = paramAppContentSection.zzwa();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((AppContentSection)paramObject).zzwk();
            localObject2 = paramAppContentSection.zzwk();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((AppContentSection)paramObject).zzwl();
              localObject2 = paramAppContentSection.zzwl();
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((AppContentSection)paramObject).zzvQ();
                localObject2 = paramAppContentSection.zzvQ();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = ((AppContentSection)paramObject).getExtras();
                  localObject2 = paramAppContentSection.getExtras();
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((AppContentSection)paramObject).getId();
                    localObject2 = paramAppContentSection.getId();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = ((AppContentSection)paramObject).zzwc();
                      localObject2 = paramAppContentSection.zzwc();
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = ((AppContentSection)paramObject).getTitle();
                        localObject2 = paramAppContentSection.getTitle();
                        bool2 = zzw.equal(localObject1, localObject2);
                        if (bool2)
                        {
                          localObject1 = ((AppContentSection)paramObject).getType();
                          localObject2 = paramAppContentSection.getType();
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
        bool1 = false;
      }
    }
  }
  
  static String zzb(AppContentSection paramAppContentSection)
  {
    zzw.zza localzza = zzw.zzy(paramAppContentSection);
    Object localObject = paramAppContentSection.getActions();
    localzza = localzza.zzg("Actions", localObject);
    localObject = paramAppContentSection.zzwa();
    localzza = localzza.zzg("Annotations", localObject);
    localObject = paramAppContentSection.zzwk();
    localzza = localzza.zzg("Cards", localObject);
    localObject = paramAppContentSection.zzwl();
    localzza = localzza.zzg("CardType", localObject);
    localObject = paramAppContentSection.zzvQ();
    localzza = localzza.zzg("ContentDescription", localObject);
    localObject = paramAppContentSection.getExtras();
    localzza = localzza.zzg("Extras", localObject);
    localObject = paramAppContentSection.getId();
    localzza = localzza.zzg("Id", localObject);
    localObject = paramAppContentSection.zzwc();
    localzza = localzza.zzg("Subtitle", localObject);
    localObject = paramAppContentSection.getTitle();
    localzza = localzza.zzg("Title", localObject);
    localObject = paramAppContentSection.getType();
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
    AppContentSectionEntityCreator.zza(this, paramParcel, paramInt);
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
  
  public String zzwc()
  {
    return this.zzaDH;
  }
  
  public List zzwk()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.zzaDO;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public String zzwl()
  {
    return this.zzaDP;
  }
  
  public AppContentSection zzwm()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentSectionEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */