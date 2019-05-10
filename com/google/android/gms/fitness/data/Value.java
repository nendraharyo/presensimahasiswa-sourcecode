package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.h.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.zzmy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class Value
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final int zzawZ;
  private float zzaxe;
  private boolean zzaxq;
  private String zzaxr;
  private Map zzaxs;
  private int[] zzaxt;
  private float[] zzaxu;
  private byte[] zzaxv;
  
  static
  {
    zzu localzzu = new com/google/android/gms/fitness/data/zzu;
    localzzu.<init>();
    CREATOR = localzzu;
  }
  
  public Value(int paramInt)
  {
    this(3, paramInt, false, 0.0F, null, null, null, null, null);
  }
  
  Value(int paramInt1, int paramInt2, boolean paramBoolean, float paramFloat, String paramString, Bundle paramBundle, int[] paramArrayOfInt, float[] paramArrayOfFloat, byte[] paramArrayOfByte)
  {
    this.mVersionCode = paramInt1;
    this.zzawZ = paramInt2;
    this.zzaxq = paramBoolean;
    this.zzaxe = paramFloat;
    this.zzaxr = paramString;
    Map localMap = zzv(paramBundle);
    this.zzaxs = localMap;
    this.zzaxt = paramArrayOfInt;
    this.zzaxu = paramArrayOfFloat;
    this.zzaxv = paramArrayOfByte;
  }
  
  private boolean zza(Value paramValue)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    int i = this.zzawZ;
    int m = paramValue.zzawZ;
    float f1;
    float f2;
    if (i == m)
    {
      boolean bool2 = this.zzaxq;
      boolean bool5 = paramValue.zzaxq;
      if (bool2 == bool5)
      {
        int j = this.zzawZ;
        switch (j)
        {
        default: 
          f1 = this.zzaxe;
          f2 = paramValue.zzaxe;
          boolean bool3 = f1 < f2;
          if (bool3) {
            break;
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      int k = asInt();
      int n = paramValue.asInt();
      if (k != n)
      {
        bool1 = false;
        Object localObject2 = null;
        continue;
        f1 = this.zzaxe;
        f2 = paramValue.zzaxe;
        boolean bool4 = f1 < f2;
        if (bool4)
        {
          bool1 = false;
          localObject2 = null;
          continue;
          localObject2 = this.zzaxr;
          localObject1 = paramValue.zzaxr;
          bool1 = zzw.equal(localObject2, localObject1);
          continue;
          localObject2 = this.zzaxs;
          localObject1 = paramValue.zzaxs;
          bool1 = zzw.equal(localObject2, localObject1);
          continue;
          localObject2 = this.zzaxt;
          localObject1 = paramValue.zzaxt;
          bool1 = Arrays.equals((int[])localObject2, (int[])localObject1);
          continue;
          localObject2 = this.zzaxu;
          localObject1 = paramValue.zzaxu;
          bool1 = Arrays.equals((float[])localObject2, (float[])localObject1);
          continue;
          localObject2 = this.zzaxv;
          localObject1 = paramValue.zzaxv;
          bool1 = Arrays.equals((byte[])localObject2, (byte[])localObject1);
          continue;
          bool1 = false;
          localObject2 = null;
          continue;
          bool1 = false;
          localObject2 = null;
        }
      }
    }
  }
  
  private static Map zzv(Bundle paramBundle)
  {
    int i;
    if (paramBundle == null) {
      i = 0;
    }
    a locala;
    for (Object localObject = null;; localObject = locala)
    {
      return (Map)localObject;
      localObject = MapValue.class.getClassLoader();
      paramBundle.setClassLoader((ClassLoader)localObject);
      locala = new android/support/v4/h/a;
      i = paramBundle.size();
      locala.<init>(i);
      localObject = paramBundle.keySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (String)localIterator.next();
        Parcelable localParcelable = paramBundle.getParcelable((String)localObject);
        locala.put(localObject, localParcelable);
      }
    }
  }
  
  public String asActivity()
  {
    return FitnessActivities.getName(asInt());
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
  
  public int asInt()
  {
    int i = 1;
    int j = this.zzawZ;
    if (j == i) {}
    for (;;)
    {
      zzx.zza(i, "Value is not in int format");
      return Float.floatToRawIntBits(this.zzaxe);
      i = 0;
    }
  }
  
  public String asString()
  {
    int i = this.zzawZ;
    int k = 3;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0)
    {
      zzx.zza(i, "Value is not in string format");
      return this.zzaxr;
    }
  }
  
  public void clearKey(String paramString)
  {
    int i = this.zzawZ;
    int k = 4;
    if (i == k) {
      i = 1;
    }
    for (;;)
    {
      String str = "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.";
      zzx.zza(i, str);
      Map localMap = this.zzaxs;
      if (localMap != null)
      {
        localMap = this.zzaxs;
        localMap.remove(paramString);
      }
      return;
      int j = 0;
      localMap = null;
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
      bool = paramObject instanceof Value;
      if (!bool) {
        break label33;
      }
      paramObject = (Value)paramObject;
      bool = zza((Value)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int getFormat()
  {
    return this.zzawZ;
  }
  
  public Float getKeyValue(String paramString)
  {
    int i = this.zzawZ;
    int j = 4;
    float f;
    boolean bool;
    if (i == j)
    {
      i = 1;
      f = Float.MIN_VALUE;
      String str = "Value is not in float map format";
      zzx.zza(i, str);
      localObject = this.zzaxs;
      if (localObject == null) {
        break label97;
      }
      localObject = this.zzaxs;
      bool = ((Map)localObject).containsKey(paramString);
      if (!bool) {
        break label97;
      }
      f = ((MapValue)this.zzaxs.get(paramString)).asFloat();
    }
    for (Object localObject = Float.valueOf(f);; localObject = null)
    {
      return (Float)localObject;
      bool = false;
      f = 0.0F;
      localObject = null;
      break;
      label97:
      bool = false;
      f = 0.0F;
    }
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    Object localObject = Float.valueOf(this.zzaxe);
    arrayOfObject[0] = localObject;
    localObject = this.zzaxr;
    arrayOfObject[1] = localObject;
    localObject = this.zzaxs;
    arrayOfObject[2] = localObject;
    localObject = this.zzaxt;
    arrayOfObject[3] = localObject;
    localObject = this.zzaxu;
    arrayOfObject[4] = localObject;
    localObject = this.zzaxv;
    arrayOfObject[5] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isSet()
  {
    return this.zzaxq;
  }
  
  public void setActivity(String paramString)
  {
    int i = FitnessActivities.zzdm(paramString);
    setInt(i);
  }
  
  public void setFloat(float paramFloat)
  {
    int i = 1;
    int j = this.zzawZ;
    int m = 2;
    if (j == m) {}
    int k;
    for (j = i;; k = 0)
    {
      zzx.zza(j, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
      this.zzaxq = i;
      this.zzaxe = paramFloat;
      return;
    }
  }
  
  public void setInt(int paramInt)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int j = this.zzawZ;
    if (j == i) {
      j = i;
    }
    for (float f2 = f1;; f2 = 0.0F)
    {
      zzx.zza(j, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
      this.zzaxq = i;
      f2 = Float.intBitsToFloat(paramInt);
      this.zzaxe = f2;
      return;
      int k = 0;
    }
  }
  
  public void setKeyValue(String paramString, float paramFloat)
  {
    int i = 1;
    int j = this.zzawZ;
    int m = 4;
    if (j == m) {
      j = i;
    }
    for (;;)
    {
      String str = "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.";
      zzx.zza(j, str);
      this.zzaxq = i;
      Object localObject = this.zzaxs;
      if (localObject == null)
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
        this.zzaxs = ((Map)localObject);
      }
      localObject = this.zzaxs;
      MapValue localMapValue = MapValue.zzc(paramFloat);
      ((Map)localObject).put(paramString, localMapValue);
      return;
      int k = 0;
      localObject = null;
    }
  }
  
  public void setString(String paramString)
  {
    int i = 1;
    int j = this.zzawZ;
    int m = 3;
    if (j == m) {}
    int k;
    for (j = i;; k = 0)
    {
      zzx.zza(j, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
      this.zzaxq = i;
      this.zzaxr = paramString;
      return;
    }
  }
  
  public String toString()
  {
    boolean bool = this.zzaxq;
    Object localObject1;
    if (!bool) {
      localObject1 = "unset";
    }
    for (;;)
    {
      return (String)localObject1;
      int i = this.zzawZ;
      Object localObject2;
      switch (i)
      {
      default: 
        localObject1 = "unknown";
        break;
      case 1: 
        i = asInt();
        localObject1 = Integer.toString(i);
        break;
      case 2: 
        float f = this.zzaxe;
        localObject1 = Float.toString(f);
        break;
      case 3: 
        localObject1 = this.zzaxr;
        break;
      case 4: 
        localObject1 = new java/util/TreeMap;
        localObject2 = this.zzaxs;
        ((TreeMap)localObject1).<init>((Map)localObject2);
        localObject1 = ((TreeMap)localObject1).toString();
        break;
      case 5: 
        localObject1 = Arrays.toString(this.zzaxt);
        break;
      case 6: 
        localObject1 = Arrays.toString(this.zzaxu);
        break;
      case 7: 
        localObject1 = this.zzaxv;
        localObject2 = this.zzaxv;
        int j = localObject2.length;
        localObject1 = zzmy.zza((byte[])localObject1, 0, j, false);
      }
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzu.zza(this, paramParcel, paramInt);
  }
  
  String zzuA()
  {
    return this.zzaxr;
  }
  
  Bundle zzuB()
  {
    Object localObject = this.zzaxs;
    int i;
    if (localObject == null) {
      i = 0;
    }
    Bundle localBundle;
    for (localObject = null;; localObject = localBundle)
    {
      return (Bundle)localObject;
      localBundle = new android/os/Bundle;
      i = this.zzaxs.size();
      localBundle.<init>(i);
      localObject = this.zzaxs.entrySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        String str = (String)((Map.Entry)localObject).getKey();
        localObject = (Parcelable)((Map.Entry)localObject).getValue();
        localBundle.putParcelable(str, (Parcelable)localObject);
      }
    }
  }
  
  int[] zzuC()
  {
    return this.zzaxt;
  }
  
  float[] zzuD()
  {
    return this.zzaxu;
  }
  
  byte[] zzuE()
  {
    return this.zzaxv;
  }
  
  float zzuv()
  {
    return this.zzaxe;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\Value.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */