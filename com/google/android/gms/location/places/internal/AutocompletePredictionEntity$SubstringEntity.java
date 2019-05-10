package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.location.places.AutocompletePrediction.Substring;

public class AutocompletePredictionEntity$SubstringEntity
  implements SafeParcelable, AutocompletePrediction.Substring
{
  public static final Parcelable.Creator CREATOR;
  final int mLength;
  final int mOffset;
  final int mVersionCode;
  
  static
  {
    zzu localzzu = new com/google/android/gms/location/places/internal/zzu;
    localzzu.<init>();
    CREATOR = localzzu;
  }
  
  public AutocompletePredictionEntity$SubstringEntity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.mOffset = paramInt2;
    this.mLength = paramInt3;
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
      boolean bool2 = paramObject instanceof SubstringEntity;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (SubstringEntity)paramObject;
        Integer localInteger1 = Integer.valueOf(this.mOffset);
        int i = ((SubstringEntity)paramObject).mOffset;
        Integer localInteger2 = Integer.valueOf(i);
        bool2 = zzw.equal(localInteger1, localInteger2);
        if (bool2)
        {
          localInteger1 = Integer.valueOf(this.mLength);
          i = ((SubstringEntity)paramObject).mLength;
          localInteger2 = Integer.valueOf(i);
          bool2 = zzw.equal(localInteger1, localInteger2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public int getLength()
  {
    return this.mLength;
  }
  
  public int getOffset()
  {
    return this.mOffset;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(this.mOffset);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(this.mLength);
    arrayOfObject[1] = localInteger;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Integer localInteger = Integer.valueOf(this.mOffset);
    localzza = localzza.zzg("offset", localInteger);
    localInteger = Integer.valueOf(this.mLength);
    return localzza.zzg("length", localInteger).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzu.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\AutocompletePredictionEntity$SubstringEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */