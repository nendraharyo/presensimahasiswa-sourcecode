package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public final class LocationRequest
  implements SafeParcelable
{
  public static final LocationRequestCreator CREATOR;
  public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
  public static final int PRIORITY_HIGH_ACCURACY = 100;
  public static final int PRIORITY_LOW_POWER = 104;
  public static final int PRIORITY_NO_POWER = 105;
  int mPriority;
  private final int mVersionCode;
  boolean zzaBr;
  long zzaND;
  long zzaNY;
  long zzaNZ;
  int zzaOa;
  float zzaOb;
  long zzaOc;
  
  static
  {
    LocationRequestCreator localLocationRequestCreator = new com/google/android/gms/location/LocationRequestCreator;
    localLocationRequestCreator.<init>();
    CREATOR = localLocationRequestCreator;
  }
  
  public LocationRequest()
  {
    this.mVersionCode = 1;
    this.mPriority = 102;
    this.zzaNY = 3600000L;
    this.zzaNZ = 600000L;
    this.zzaBr = false;
    this.zzaND = Long.MAX_VALUE;
    this.zzaOa = (-1 >>> 1);
    this.zzaOb = 0.0F;
    this.zzaOc = 0L;
  }
  
  LocationRequest(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, int paramInt3, float paramFloat, long paramLong4)
  {
    this.mVersionCode = paramInt1;
    this.mPriority = paramInt2;
    this.zzaNY = paramLong1;
    this.zzaNZ = paramLong2;
    this.zzaBr = paramBoolean;
    this.zzaND = paramLong3;
    this.zzaOa = paramInt3;
    this.zzaOb = paramFloat;
    this.zzaOc = paramLong4;
  }
  
  public static LocationRequest create()
  {
    LocationRequest localLocationRequest = new com/google/android/gms/location/LocationRequest;
    localLocationRequest.<init>();
    return localLocationRequest;
  }
  
  private static void zzL(long paramLong)
  {
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "invalid interval: " + paramLong;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  private static void zzd(float paramFloat)
  {
    IllegalArgumentException localIllegalArgumentException = null;
    boolean bool = paramFloat < 0.0F;
    if (bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "invalid displacement: " + paramFloat;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  private static void zzhs(int paramInt)
  {
    switch (paramInt)
    {
    case 101: 
    case 103: 
    default: 
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "invalid quality: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  public static String zzht(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    case 101: 
    case 103: 
    default: 
      str = "???";
    }
    for (;;)
    {
      return str;
      str = "PRIORITY_HIGH_ACCURACY";
      continue;
      str = "PRIORITY_BALANCED_POWER_ACCURACY";
      continue;
      str = "PRIORITY_LOW_POWER";
      continue;
      str = "PRIORITY_NO_POWER";
    }
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
      boolean bool2 = paramObject instanceof LocationRequest;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (LocationRequest)paramObject;
        int i = this.mPriority;
        int k = ((LocationRequest)paramObject).mPriority;
        if (i == k)
        {
          long l1 = this.zzaNY;
          long l2 = ((LocationRequest)paramObject).zzaNY;
          boolean bool3 = l1 < l2;
          if (!bool3)
          {
            l1 = this.zzaNZ;
            l2 = ((LocationRequest)paramObject).zzaNZ;
            bool3 = l1 < l2;
            if (!bool3)
            {
              bool3 = this.zzaBr;
              boolean bool5 = ((LocationRequest)paramObject).zzaBr;
              if (bool3 == bool5)
              {
                l1 = this.zzaND;
                l2 = ((LocationRequest)paramObject).zzaND;
                bool3 = l1 < l2;
                if (!bool3)
                {
                  int j = this.zzaOa;
                  int m = ((LocationRequest)paramObject).zzaOa;
                  if (j == m)
                  {
                    float f1 = this.zzaOb;
                    float f2 = ((LocationRequest)paramObject).zzaOb;
                    boolean bool4 = f1 < f2;
                    if (!bool4) {
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
  
  public long getExpirationTime()
  {
    return this.zzaND;
  }
  
  public long getFastestInterval()
  {
    return this.zzaNZ;
  }
  
  public long getInterval()
  {
    return this.zzaNY;
  }
  
  public long getMaxWaitTime()
  {
    long l1 = this.zzaOc;
    long l2 = this.zzaNY;
    boolean bool = l1 < l2;
    if (bool) {
      l1 = this.zzaNY;
    }
    return l1;
  }
  
  public int getNumUpdates()
  {
    return this.zzaOa;
  }
  
  public int getPriority()
  {
    return this.mPriority;
  }
  
  public float getSmallestDisplacement()
  {
    return this.zzaOb;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    Object localObject = Integer.valueOf(this.mPriority);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzaNY);
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzaNZ);
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(this.zzaBr);
    arrayOfObject[3] = localObject;
    localObject = Long.valueOf(this.zzaND);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(this.zzaOa);
    arrayOfObject[5] = localObject;
    localObject = Float.valueOf(this.zzaOb);
    arrayOfObject[6] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public LocationRequest setExpirationDuration(long paramLong)
  {
    long l1 = Long.MAX_VALUE;
    long l2 = 0L;
    long l3 = SystemClock.elapsedRealtime();
    long l4 = l1 - l3;
    boolean bool1 = paramLong < l4;
    if (bool1) {}
    for (this.zzaND = l1;; this.zzaND = l3)
    {
      l3 = this.zzaND;
      boolean bool2 = l3 < l2;
      if (bool2) {
        this.zzaND = l2;
      }
      return this;
      l3 += paramLong;
    }
  }
  
  public LocationRequest setExpirationTime(long paramLong)
  {
    long l1 = 0L;
    this.zzaND = paramLong;
    long l2 = this.zzaND;
    boolean bool = l2 < l1;
    if (bool) {
      this.zzaND = l1;
    }
    return this;
  }
  
  public LocationRequest setFastestInterval(long paramLong)
  {
    zzL(paramLong);
    this.zzaBr = true;
    this.zzaNZ = paramLong;
    return this;
  }
  
  public LocationRequest setInterval(long paramLong)
  {
    zzL(paramLong);
    this.zzaNY = paramLong;
    boolean bool = this.zzaBr;
    if (!bool)
    {
      double d1 = this.zzaNY;
      double d2 = 6.0D;
      d1 /= d2;
      long l = d1;
      this.zzaNZ = l;
    }
    return this;
  }
  
  public LocationRequest setMaxWaitTime(long paramLong)
  {
    zzL(paramLong);
    this.zzaOc = paramLong;
    return this;
  }
  
  public LocationRequest setNumUpdates(int paramInt)
  {
    if (paramInt <= 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "invalid numUpdates: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    this.zzaOa = paramInt;
    return this;
  }
  
  public LocationRequest setPriority(int paramInt)
  {
    zzhs(paramInt);
    this.mPriority = paramInt;
    return this;
  }
  
  public LocationRequest setSmallestDisplacement(float paramFloat)
  {
    zzd(paramFloat);
    this.zzaOb = paramFloat;
    return this;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("Request[");
    String str = zzht(this.mPriority);
    localStringBuilder2.append(str);
    int i = this.mPriority;
    int k = 105;
    if (i != k)
    {
      localStringBuilder1.append(" requested=");
      l1 = this.zzaNY;
      localStringBuilder2 = localStringBuilder1.append(l1);
      str = "ms";
      localStringBuilder2.append(str);
    }
    localStringBuilder1.append(" fastest=");
    long l1 = this.zzaNZ;
    localStringBuilder2 = localStringBuilder1.append(l1);
    str = "ms";
    localStringBuilder2.append(str);
    l1 = this.zzaOc;
    long l2 = this.zzaNY;
    boolean bool = l1 < l2;
    if (bool)
    {
      localStringBuilder1.append(" maxWait=");
      l1 = this.zzaOc;
      localStringBuilder2 = localStringBuilder1.append(l1);
      str = "ms";
      localStringBuilder2.append(str);
    }
    l1 = this.zzaND;
    l2 = Long.MAX_VALUE;
    bool = l1 < l2;
    if (bool)
    {
      l1 = this.zzaND;
      l2 = SystemClock.elapsedRealtime();
      l1 -= l2;
      localStringBuilder1.append(" expireIn=");
      localStringBuilder2 = localStringBuilder1.append(l1);
      str = "ms";
      localStringBuilder2.append(str);
    }
    int j = this.zzaOa;
    k = -1 >>> 1;
    if (j != k)
    {
      localStringBuilder2 = localStringBuilder1.append(" num=");
      k = this.zzaOa;
      localStringBuilder2.append(k);
    }
    localStringBuilder1.append(']');
    return localStringBuilder1.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    LocationRequestCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\LocationRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */