package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.Collections;
import java.util.List;

public class AutocompletePredictionEntity
  implements SafeParcelable, AutocompletePrediction
{
  public static final Parcelable.Creator CREATOR;
  private static final List zzaQc = Collections.emptyList();
  final int mVersionCode;
  final String zzaPH;
  final List zzaPd;
  final String zzaQd;
  final List zzaQe;
  final int zzaQf;
  final String zzaQg;
  final List zzaQh;
  final String zzaQi;
  final List zzaQj;
  
  static
  {
    zza localzza = new com/google/android/gms/location/places/internal/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  AutocompletePredictionEntity(int paramInt1, String paramString1, List paramList1, int paramInt2, String paramString2, List paramList2, String paramString3, List paramList3, String paramString4, List paramList4)
  {
    this.mVersionCode = paramInt1;
    this.zzaPH = paramString1;
    this.zzaPd = paramList1;
    this.zzaQf = paramInt2;
    this.zzaQd = paramString2;
    this.zzaQe = paramList2;
    this.zzaQg = paramString3;
    this.zzaQh = paramList3;
    this.zzaQi = paramString4;
    this.zzaQj = paramList4;
  }
  
  public static AutocompletePredictionEntity zza(String paramString1, List paramList1, int paramInt, String paramString2, List paramList2, String paramString3, List paramList3, String paramString4, List paramList4)
  {
    AutocompletePredictionEntity localAutocompletePredictionEntity = new com/google/android/gms/location/places/internal/AutocompletePredictionEntity;
    String str = (String)zzx.zzz(paramString2);
    localAutocompletePredictionEntity.<init>(0, paramString1, paramList1, paramInt, str, paramList2, paramString3, paramList3, paramString4, paramList4);
    return localAutocompletePredictionEntity;
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
      boolean bool2 = paramObject instanceof AutocompletePredictionEntity;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (AutocompletePredictionEntity)paramObject;
        Object localObject1 = this.zzaPH;
        Object localObject2 = ((AutocompletePredictionEntity)paramObject).zzaPH;
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.zzaPd;
          localObject2 = ((AutocompletePredictionEntity)paramObject).zzaPd;
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = Integer.valueOf(this.zzaQf);
            int i = ((AutocompletePredictionEntity)paramObject).zzaQf;
            localObject2 = Integer.valueOf(i);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = this.zzaQd;
              localObject2 = ((AutocompletePredictionEntity)paramObject).zzaQd;
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = this.zzaQe;
                localObject2 = ((AutocompletePredictionEntity)paramObject).zzaQe;
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = this.zzaQg;
                  localObject2 = ((AutocompletePredictionEntity)paramObject).zzaQg;
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = this.zzaQh;
                    localObject2 = ((AutocompletePredictionEntity)paramObject).zzaQh;
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = this.zzaQi;
                      localObject2 = ((AutocompletePredictionEntity)paramObject).zzaQi;
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = this.zzaQj;
                        localObject2 = ((AutocompletePredictionEntity)paramObject).zzaQj;
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
  
  public String getDescription()
  {
    return this.zzaQd;
  }
  
  public CharSequence getFullText(CharacterStyle paramCharacterStyle)
  {
    String str = this.zzaQd;
    List localList = this.zzaQe;
    return zzc.zza(str, localList, paramCharacterStyle);
  }
  
  public List getMatchedSubstrings()
  {
    return this.zzaQe;
  }
  
  public String getPlaceId()
  {
    return this.zzaPH;
  }
  
  public List getPlaceTypes()
  {
    return this.zzaPd;
  }
  
  public CharSequence getPrimaryText(CharacterStyle paramCharacterStyle)
  {
    String str = this.zzaQg;
    List localList = this.zzaQh;
    return zzc.zza(str, localList, paramCharacterStyle);
  }
  
  public CharSequence getSecondaryText(CharacterStyle paramCharacterStyle)
  {
    String str = this.zzaQi;
    List localList = this.zzaQj;
    return zzc.zza(str, localList, paramCharacterStyle);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[9];
    Object localObject = this.zzaPH;
    arrayOfObject[0] = localObject;
    localObject = this.zzaPd;
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzaQf);
    arrayOfObject[2] = localObject;
    localObject = this.zzaQd;
    arrayOfObject[3] = localObject;
    localObject = this.zzaQe;
    arrayOfObject[4] = localObject;
    localObject = this.zzaQg;
    arrayOfObject[5] = localObject;
    localObject = this.zzaQh;
    arrayOfObject[6] = localObject;
    localObject = this.zzaQi;
    arrayOfObject[7] = localObject;
    localObject = this.zzaQj;
    arrayOfObject[8] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzaPH;
    localzza = localzza.zzg("placeId", localObject);
    localObject = this.zzaPd;
    localzza = localzza.zzg("placeTypes", localObject);
    localObject = this.zzaQd;
    localzza = localzza.zzg("fullText", localObject);
    localObject = this.zzaQe;
    localzza = localzza.zzg("fullTextMatchedSubstrings", localObject);
    localObject = this.zzaQg;
    localzza = localzza.zzg("primaryText", localObject);
    localObject = this.zzaQh;
    localzza = localzza.zzg("primaryTextMatchedSubstrings", localObject);
    localObject = this.zzaQi;
    localzza = localzza.zzg("secondaryText", localObject);
    localObject = this.zzaQj;
    return localzza.zzg("secondaryTextMatchedSubstrings", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public AutocompletePrediction zzzf()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\AutocompletePredictionEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */