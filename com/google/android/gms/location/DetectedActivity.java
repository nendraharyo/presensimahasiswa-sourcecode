package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Comparator;

public class DetectedActivity
  implements SafeParcelable
{
  public static final DetectedActivityCreator CREATOR;
  public static final int IN_VEHICLE = 0;
  public static final int ON_BICYCLE = 1;
  public static final int ON_FOOT = 2;
  public static final int RUNNING = 8;
  public static final int STILL = 3;
  public static final int TILTING = 5;
  public static final int UNKNOWN = 4;
  public static final int WALKING = 7;
  public static final Comparator zzaNy;
  public static final int[] zzaNz;
  private final int mVersionCode;
  int zzaNA;
  int zzaNB;
  
  static
  {
    Object localObject = new com/google/android/gms/location/DetectedActivity$1;
    ((DetectedActivity.1)localObject).<init>();
    zzaNy = (Comparator)localObject;
    localObject = new int[13];
    localObject[0] = 0;
    localObject[1] = 1;
    localObject[2] = 2;
    localObject[3] = 4;
    localObject[4] = 5;
    localObject[5] = 6;
    localObject[6] = 7;
    localObject[7] = 8;
    localObject[8] = 10;
    localObject[9] = 11;
    localObject[10] = 12;
    localObject[11] = 13;
    localObject[12] = 14;
    zzaNz = (int[])localObject;
    localObject = new com/google/android/gms/location/DetectedActivityCreator;
    ((DetectedActivityCreator)localObject).<init>();
    CREATOR = (DetectedActivityCreator)localObject;
  }
  
  public DetectedActivity(int paramInt1, int paramInt2)
  {
    this.mVersionCode = 1;
    this.zzaNA = paramInt1;
    this.zzaNB = paramInt2;
  }
  
  public DetectedActivity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.zzaNA = paramInt2;
    this.zzaNB = paramInt3;
  }
  
  private int zzhn(int paramInt)
  {
    int i = 15;
    if (paramInt > i) {
      paramInt = 4;
    }
    return paramInt;
  }
  
  public static String zzho(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    case 6: 
    default: 
      str = Integer.toString(paramInt);
    }
    for (;;)
    {
      return str;
      str = "IN_VEHICLE";
      continue;
      str = "ON_BICYCLE";
      continue;
      str = "ON_FOOT";
      continue;
      str = "STILL";
      continue;
      str = "UNKNOWN";
      continue;
      str = "TILTING";
      continue;
      str = "WALKING";
      continue;
      str = "RUNNING";
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (paramObject != null)
      {
        Class localClass1 = getClass();
        Class localClass2 = paramObject.getClass();
        if (localClass1 == localClass2) {}
      }
      else
      {
        bool = false;
        continue;
      }
      paramObject = (DetectedActivity)paramObject;
      int i = this.zzaNA;
      int j = ((DetectedActivity)paramObject).zzaNA;
      if (i == j)
      {
        i = this.zzaNB;
        j = ((DetectedActivity)paramObject).zzaNB;
        if (i == j) {}
      }
      else
      {
        bool = false;
      }
    }
  }
  
  public int getConfidence()
  {
    return this.zzaNB;
  }
  
  public int getType()
  {
    int i = this.zzaNA;
    return zzhn(i);
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(this.zzaNA);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(this.zzaNB);
    arrayOfObject[1] = localInteger;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("DetectedActivity [type=");
    String str = zzho(getType());
    localStringBuilder = localStringBuilder.append(str).append(", confidence=");
    int i = this.zzaNB;
    return i + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    DetectedActivityCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\DetectedActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */