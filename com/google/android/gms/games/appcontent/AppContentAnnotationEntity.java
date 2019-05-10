package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class AppContentAnnotationEntity
  implements SafeParcelable, AppContentAnnotation
{
  public static final AppContentAnnotationEntityCreator CREATOR;
  private final int mVersionCode;
  private final String zzaDA;
  private final String zzaDB;
  private final int zzaDC;
  private final int zzaDD;
  private final Bundle zzaDE;
  private final Uri zzaDz;
  private final String zzapg;
  private final String zzaxl;
  private final String zzyv;
  
  static
  {
    AppContentAnnotationEntityCreator localAppContentAnnotationEntityCreator = new com/google/android/gms/games/appcontent/AppContentAnnotationEntityCreator;
    localAppContentAnnotationEntityCreator.<init>();
    CREATOR = localAppContentAnnotationEntityCreator;
  }
  
  AppContentAnnotationEntity(int paramInt1, String paramString1, Uri paramUri, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, int paramInt3, Bundle paramBundle)
  {
    this.mVersionCode = paramInt1;
    this.zzaxl = paramString1;
    this.zzyv = paramString3;
    this.zzaDB = paramString5;
    this.zzaDC = paramInt2;
    this.zzaDz = paramUri;
    this.zzaDD = paramInt3;
    this.zzaDA = paramString4;
    this.zzaDE = paramBundle;
    this.zzapg = paramString2;
  }
  
  public AppContentAnnotationEntity(AppContentAnnotation paramAppContentAnnotation)
  {
    this.mVersionCode = 4;
    Object localObject = paramAppContentAnnotation.getDescription();
    this.zzaxl = ((String)localObject);
    localObject = paramAppContentAnnotation.getId();
    this.zzyv = ((String)localObject);
    localObject = paramAppContentAnnotation.zzvT();
    this.zzaDB = ((String)localObject);
    int i = paramAppContentAnnotation.zzvU();
    this.zzaDC = i;
    localObject = paramAppContentAnnotation.zzvV();
    this.zzaDz = ((Uri)localObject);
    i = paramAppContentAnnotation.zzvX();
    this.zzaDD = i;
    localObject = paramAppContentAnnotation.zzvY();
    this.zzaDA = ((String)localObject);
    localObject = paramAppContentAnnotation.zzvW();
    this.zzaDE = ((Bundle)localObject);
    localObject = paramAppContentAnnotation.getTitle();
    this.zzapg = ((String)localObject);
  }
  
  static int zza(AppContentAnnotation paramAppContentAnnotation)
  {
    Object[] arrayOfObject = new Object[9];
    Object localObject = paramAppContentAnnotation.getDescription();
    arrayOfObject[0] = localObject;
    localObject = paramAppContentAnnotation.getId();
    arrayOfObject[1] = localObject;
    localObject = paramAppContentAnnotation.zzvT();
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramAppContentAnnotation.zzvU());
    arrayOfObject[3] = localObject;
    localObject = paramAppContentAnnotation.zzvV();
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(paramAppContentAnnotation.zzvX());
    arrayOfObject[5] = localObject;
    localObject = paramAppContentAnnotation.zzvY();
    arrayOfObject[6] = localObject;
    localObject = paramAppContentAnnotation.zzvW();
    arrayOfObject[7] = localObject;
    localObject = paramAppContentAnnotation.getTitle();
    arrayOfObject[8] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(AppContentAnnotation paramAppContentAnnotation, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof AppContentAnnotation;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramAppContentAnnotation != paramObject)
      {
        paramObject = (AppContentAnnotation)paramObject;
        Object localObject1 = ((AppContentAnnotation)paramObject).getDescription();
        Object localObject2 = paramAppContentAnnotation.getDescription();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((AppContentAnnotation)paramObject).getId();
          localObject2 = paramAppContentAnnotation.getId();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((AppContentAnnotation)paramObject).zzvT();
            localObject2 = paramAppContentAnnotation.zzvT();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = Integer.valueOf(((AppContentAnnotation)paramObject).zzvU());
              int i = paramAppContentAnnotation.zzvU();
              localObject2 = Integer.valueOf(i);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((AppContentAnnotation)paramObject).zzvV();
                localObject2 = paramAppContentAnnotation.zzvV();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = Integer.valueOf(((AppContentAnnotation)paramObject).zzvX());
                  i = paramAppContentAnnotation.zzvX();
                  localObject2 = Integer.valueOf(i);
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((AppContentAnnotation)paramObject).zzvY();
                    localObject2 = paramAppContentAnnotation.zzvY();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = ((AppContentAnnotation)paramObject).zzvW();
                      localObject2 = paramAppContentAnnotation.zzvW();
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = ((AppContentAnnotation)paramObject).getTitle();
                        localObject2 = paramAppContentAnnotation.getTitle();
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
        bool1 = false;
      }
    }
  }
  
  static String zzb(AppContentAnnotation paramAppContentAnnotation)
  {
    zzw.zza localzza = zzw.zzy(paramAppContentAnnotation);
    Object localObject = paramAppContentAnnotation.getDescription();
    localzza = localzza.zzg("Description", localObject);
    localObject = paramAppContentAnnotation.getId();
    localzza = localzza.zzg("Id", localObject);
    localObject = paramAppContentAnnotation.zzvT();
    localzza = localzza.zzg("ImageDefaultId", localObject);
    localObject = Integer.valueOf(paramAppContentAnnotation.zzvU());
    localzza = localzza.zzg("ImageHeight", localObject);
    localObject = paramAppContentAnnotation.zzvV();
    localzza = localzza.zzg("ImageUri", localObject);
    localObject = Integer.valueOf(paramAppContentAnnotation.zzvX());
    localzza = localzza.zzg("ImageWidth", localObject);
    localObject = paramAppContentAnnotation.zzvY();
    localzza = localzza.zzg("LayoutSlot", localObject);
    localObject = paramAppContentAnnotation.zzvW();
    localzza = localzza.zzg("Modifiers", localObject);
    localObject = paramAppContentAnnotation.getTitle();
    return localzza.zzg("Title", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public String getTitle()
  {
    return this.zzapg;
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
    AppContentAnnotationEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public String zzvT()
  {
    return this.zzaDB;
  }
  
  public int zzvU()
  {
    return this.zzaDC;
  }
  
  public Uri zzvV()
  {
    return this.zzaDz;
  }
  
  public Bundle zzvW()
  {
    return this.zzaDE;
  }
  
  public int zzvX()
  {
    return this.zzaDD;
  }
  
  public String zzvY()
  {
    return this.zzaDA;
  }
  
  public AppContentAnnotation zzvZ()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentAnnotationEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */