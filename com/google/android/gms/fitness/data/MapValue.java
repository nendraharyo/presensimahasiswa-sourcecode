package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class MapValue
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final int zzawZ;
  private final float zzaxe;
  
  static
  {
    zzm localzzm = new com/google/android/gms/fitness/data/zzm;
    localzzm.<init>();
    CREATOR = localzzm;
  }
  
  public MapValue(int paramInt, float paramFloat)
  {
    this(1, paramInt, paramFloat);
  }
  
  MapValue(int paramInt1, int paramInt2, float paramFloat)
  {
    this.mVersionCode = paramInt1;
    this.zzawZ = paramInt2;
    this.zzaxe = paramFloat;
  }
  
  private boolean zza(MapValue paramMapValue)
  {
    boolean bool1 = true;
    int i = this.zzawZ;
    int j = paramMapValue.zzawZ;
    float f1;
    float f2;
    boolean bool2;
    if (i == j)
    {
      i = this.zzawZ;
      switch (i)
      {
      default: 
        f1 = this.zzaxe;
        f2 = paramMapValue.zzaxe;
        bool2 = f1 < f2;
        if (bool2) {
          break;
        }
      }
    }
    for (;;)
    {
      return bool1;
      f1 = asFloat();
      f2 = paramMapValue.asFloat();
      bool2 = f1 < f2;
      if (bool2)
      {
        bool1 = false;
        continue;
        bool1 = false;
        continue;
        bool1 = false;
      }
    }
  }
  
  public static MapValue zzc(float paramFloat)
  {
    MapValue localMapValue = new com/google/android/gms/fitness/data/MapValue;
    localMapValue.<init>(2, paramFloat);
    return localMapValue;
  }
  
  public float asFloat()
  {
    int i = this.zzawZ;
    int k = 2;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0)
    {
      zzx.zza(i, "Value is not in float format");
      return this.zzaxe;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      bool = paramObject instanceof MapValue;
      if (!bool) {
        break label33;
      }
      paramObject = (MapValue)paramObject;
      bool = zza((MapValue)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  int getFormat()
  {
    return this.zzawZ;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return (int)this.zzaxe;
  }
  
  public String toString()
  {
    int i = this.zzawZ;
    switch (i)
    {
    }
    float f;
    for (String str = "unknown";; str = Float.toString(f))
    {
      return str;
      f = asFloat();
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
  
  float zzuv()
  {
    return this.zzaxe;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\MapValue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */