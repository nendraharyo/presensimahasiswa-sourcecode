package com.google.android.gms.wearable;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.zzsi;
import com.google.android.gms.internal.zzsi.zza;
import com.google.android.gms.internal.zzsj;
import com.google.android.gms.internal.zzst;
import com.google.android.gms.internal.zzsu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DataMap
{
  public static final String TAG = "DataMap";
  private final HashMap zzbrc;
  
  public DataMap()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzbrc = localHashMap;
  }
  
  public static ArrayList arrayListFromBundleArrayList(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = paramArrayList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      DataMap localDataMap = fromBundle((Bundle)localIterator.next());
      localArrayList.add(localDataMap);
    }
    return localArrayList;
  }
  
  public static DataMap fromBundle(Bundle paramBundle)
  {
    Object localObject1 = Asset.class.getClassLoader();
    paramBundle.setClassLoader((ClassLoader)localObject1);
    DataMap localDataMap = new com/google/android/gms/wearable/DataMap;
    localDataMap.<init>();
    localObject1 = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      Object localObject2 = paramBundle.get((String)localObject1);
      zza(localDataMap, (String)localObject1, localObject2);
    }
    return localDataMap;
  }
  
  public static DataMap fromByteArray(byte[] paramArrayOfByte)
  {
    try
    {
      zzsi.zza localzza = new com/google/android/gms/internal/zzsi$zza;
      localObject = zzsj.zzA(paramArrayOfByte);
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localzza.<init>((zzsj)localObject, localArrayList);
      return zzsi.zza(localzza);
    }
    catch (zzst localzzst)
    {
      Object localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Unable to convert data", localzzst);
      throw ((Throwable)localObject);
    }
  }
  
  private static void zza(DataMap paramDataMap, String paramString, Object paramObject)
  {
    boolean bool1 = paramObject instanceof String;
    if (bool1)
    {
      paramObject = (String)paramObject;
      paramDataMap.putString(paramString, (String)paramObject);
    }
    for (;;)
    {
      return;
      bool1 = paramObject instanceof Integer;
      if (bool1)
      {
        paramObject = (Integer)paramObject;
        int i = ((Integer)paramObject).intValue();
        paramDataMap.putInt(paramString, i);
      }
      else
      {
        boolean bool2 = paramObject instanceof Long;
        if (bool2)
        {
          paramObject = (Long)paramObject;
          long l = ((Long)paramObject).longValue();
          paramDataMap.putLong(paramString, l);
        }
        else
        {
          bool2 = paramObject instanceof Double;
          if (bool2)
          {
            paramObject = (Double)paramObject;
            double d = ((Double)paramObject).doubleValue();
            paramDataMap.putDouble(paramString, d);
          }
          else
          {
            bool2 = paramObject instanceof Float;
            if (bool2)
            {
              paramObject = (Float)paramObject;
              float f = ((Float)paramObject).floatValue();
              paramDataMap.putFloat(paramString, f);
            }
            else
            {
              bool2 = paramObject instanceof Boolean;
              if (bool2)
              {
                paramObject = (Boolean)paramObject;
                bool2 = ((Boolean)paramObject).booleanValue();
                paramDataMap.putBoolean(paramString, bool2);
              }
              else
              {
                bool2 = paramObject instanceof Byte;
                if (bool2)
                {
                  paramObject = (Byte)paramObject;
                  byte b = ((Byte)paramObject).byteValue();
                  paramDataMap.putByte(paramString, b);
                }
                else
                {
                  boolean bool3 = paramObject instanceof byte[];
                  if (bool3)
                  {
                    paramObject = (byte[])paramObject;
                    paramDataMap.putByteArray(paramString, (byte[])paramObject);
                  }
                  else
                  {
                    bool3 = paramObject instanceof String[];
                    if (bool3)
                    {
                      paramObject = (String[])paramObject;
                      paramDataMap.putStringArray(paramString, (String[])paramObject);
                    }
                    else
                    {
                      bool3 = paramObject instanceof long[];
                      if (bool3)
                      {
                        paramObject = (long[])paramObject;
                        paramDataMap.putLongArray(paramString, (long[])paramObject);
                      }
                      else
                      {
                        bool3 = paramObject instanceof float[];
                        if (bool3)
                        {
                          paramObject = (float[])paramObject;
                          paramDataMap.putFloatArray(paramString, (float[])paramObject);
                        }
                        else
                        {
                          bool3 = paramObject instanceof Asset;
                          if (bool3)
                          {
                            paramObject = (Asset)paramObject;
                            paramDataMap.putAsset(paramString, (Asset)paramObject);
                          }
                          else
                          {
                            bool3 = paramObject instanceof Bundle;
                            Object localObject;
                            if (bool3)
                            {
                              paramObject = (Bundle)paramObject;
                              localObject = fromBundle((Bundle)paramObject);
                              paramDataMap.putDataMap(paramString, (DataMap)localObject);
                            }
                            else
                            {
                              bool3 = paramObject instanceof ArrayList;
                              if (bool3)
                              {
                                localObject = paramObject;
                                localObject = (ArrayList)paramObject;
                                int j = zzf((ArrayList)localObject);
                                switch (j)
                                {
                                case 4: 
                                default: 
                                  break;
                                case 0: 
                                  paramObject = (ArrayList)paramObject;
                                  paramDataMap.putStringArrayList(paramString, (ArrayList)paramObject);
                                  break;
                                case 1: 
                                  paramObject = (ArrayList)paramObject;
                                  paramDataMap.putStringArrayList(paramString, (ArrayList)paramObject);
                                  break;
                                case 3: 
                                  paramObject = (ArrayList)paramObject;
                                  paramDataMap.putStringArrayList(paramString, (ArrayList)paramObject);
                                  break;
                                case 2: 
                                  paramObject = (ArrayList)paramObject;
                                  paramDataMap.putIntegerArrayList(paramString, (ArrayList)paramObject);
                                  break;
                                case 5: 
                                  paramObject = (ArrayList)paramObject;
                                  localObject = arrayListFromBundleArrayList((ArrayList)paramObject);
                                  paramDataMap.putDataMapArrayList(paramString, (ArrayList)localObject);
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
        }
      }
    }
  }
  
  private void zza(String paramString1, Object paramObject, String paramString2, ClassCastException paramClassCastException)
  {
    zza(paramString1, paramObject, paramString2, "<null>", paramClassCastException);
  }
  
  private void zza(String paramString1, Object paramObject1, String paramString2, Object paramObject2, ClassCastException paramClassCastException)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("Key ");
    ((StringBuilder)localObject).append(paramString1);
    ((StringBuilder)localObject).append(" expected ");
    ((StringBuilder)localObject).append(paramString2);
    ((StringBuilder)localObject).append(" but value was a ");
    String str = paramObject1.getClass().getName();
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(".  The default value ");
    ((StringBuilder)localObject).append(paramObject2);
    ((StringBuilder)localObject).append(" was returned.");
    localObject = ((StringBuilder)localObject).toString();
    Log.w("DataMap", (String)localObject);
    Log.w("DataMap", "Attempt to cast generated internal exception:", paramClassCastException);
  }
  
  private static boolean zza(Asset paramAsset1, Asset paramAsset2)
  {
    boolean bool;
    if ((paramAsset1 == null) || (paramAsset2 == null)) {
      if (paramAsset1 == paramAsset2) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      Object localObject1 = null;
      continue;
      localObject1 = paramAsset1.getDigest();
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      Object localObject2;
      if (!bool)
      {
        localObject1 = paramAsset1.getDigest();
        localObject2 = paramAsset2.getDigest();
        bool = ((String)localObject1).equals(localObject2);
      }
      else
      {
        localObject1 = paramAsset1.getData();
        localObject2 = paramAsset2.getData();
        bool = Arrays.equals((byte[])localObject1, (byte[])localObject2);
      }
    }
  }
  
  private static boolean zza(DataMap paramDataMap1, DataMap paramDataMap2)
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    boolean bool2 = false;
    int i = paramDataMap1.size();
    int j = paramDataMap2.size();
    if (i != j) {}
    for (;;)
    {
      return bool2;
      Object localObject1 = paramDataMap1.keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      boolean bool3;
      label151:
      label212:
      label273:
      label334:
      label395:
      do
      {
        Object localObject2;
        Object localObject3;
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  bool3 = localIterator.hasNext();
                  if (!bool3) {
                    break label448;
                  }
                  localObject1 = (String)localIterator.next();
                  localObject2 = paramDataMap1.get((String)localObject1);
                  localObject3 = paramDataMap2.get((String)localObject1);
                  bool3 = localObject2 instanceof Asset;
                  if (!bool3) {
                    break label151;
                  }
                  bool3 = localObject3 instanceof Asset;
                  if (!bool3) {
                    break;
                  }
                  localObject1 = localObject2;
                  localObject1 = (Asset)localObject2;
                  localObject2 = localObject3;
                  localObject2 = (Asset)localObject3;
                  bool3 = zza((Asset)localObject1, (Asset)localObject2);
                } while (bool3);
                break;
                bool3 = localObject2 instanceof String[];
                if (!bool3) {
                  break label212;
                }
                bool3 = localObject3 instanceof String[];
                if (!bool3) {
                  break;
                }
                localObject2 = (String[])localObject2;
                localObject3 = (String[])localObject3;
                bool3 = Arrays.equals((Object[])localObject2, (Object[])localObject3);
              } while (bool3);
              break;
              bool3 = localObject2 instanceof long[];
              if (!bool3) {
                break label273;
              }
              bool3 = localObject3 instanceof long[];
              if (!bool3) {
                break;
              }
              localObject2 = (long[])localObject2;
              localObject3 = (long[])localObject3;
              bool3 = Arrays.equals((long[])localObject2, (long[])localObject3);
            } while (bool3);
            break;
            bool3 = localObject2 instanceof float[];
            if (!bool3) {
              break label334;
            }
            bool3 = localObject3 instanceof float[];
            if (!bool3) {
              break;
            }
            localObject2 = (float[])localObject2;
            localObject3 = (float[])localObject3;
            bool3 = Arrays.equals((float[])localObject2, (float[])localObject3);
          } while (bool3);
          break;
          bool3 = localObject2 instanceof byte[];
          if (!bool3) {
            break label395;
          }
          bool3 = localObject3 instanceof byte[];
          if (!bool3) {
            break;
          }
          localObject2 = (byte[])localObject2;
          localObject3 = (byte[])localObject3;
          bool3 = Arrays.equals((byte[])localObject2, (byte[])localObject3);
        } while (bool3);
        break;
        if ((localObject2 == null) || (localObject3 == null))
        {
          if (localObject2 == localObject3) {
            bool3 = bool1;
          }
          for (;;)
          {
            bool2 = bool3;
            break;
            bool3 = false;
            localObject1 = null;
          }
        }
        bool3 = localObject2.equals(localObject3);
      } while (bool3);
      continue;
      label448:
      bool2 = bool1;
    }
  }
  
  private static void zzb(Bundle paramBundle, String paramString, Object paramObject)
  {
    boolean bool1 = paramObject instanceof String;
    if (bool1)
    {
      paramObject = (String)paramObject;
      paramBundle.putString(paramString, (String)paramObject);
    }
    for (;;)
    {
      return;
      bool1 = paramObject instanceof Integer;
      if (bool1)
      {
        paramObject = (Integer)paramObject;
        int i = ((Integer)paramObject).intValue();
        paramBundle.putInt(paramString, i);
      }
      else
      {
        boolean bool2 = paramObject instanceof Long;
        if (bool2)
        {
          paramObject = (Long)paramObject;
          long l = ((Long)paramObject).longValue();
          paramBundle.putLong(paramString, l);
        }
        else
        {
          bool2 = paramObject instanceof Double;
          if (bool2)
          {
            paramObject = (Double)paramObject;
            double d = ((Double)paramObject).doubleValue();
            paramBundle.putDouble(paramString, d);
          }
          else
          {
            bool2 = paramObject instanceof Float;
            if (bool2)
            {
              paramObject = (Float)paramObject;
              float f = ((Float)paramObject).floatValue();
              paramBundle.putFloat(paramString, f);
            }
            else
            {
              bool2 = paramObject instanceof Boolean;
              if (bool2)
              {
                paramObject = (Boolean)paramObject;
                bool2 = ((Boolean)paramObject).booleanValue();
                paramBundle.putBoolean(paramString, bool2);
              }
              else
              {
                bool2 = paramObject instanceof Byte;
                if (bool2)
                {
                  paramObject = (Byte)paramObject;
                  byte b = ((Byte)paramObject).byteValue();
                  paramBundle.putByte(paramString, b);
                }
                else
                {
                  boolean bool3 = paramObject instanceof byte[];
                  if (bool3)
                  {
                    paramObject = (byte[])paramObject;
                    paramBundle.putByteArray(paramString, (byte[])paramObject);
                  }
                  else
                  {
                    bool3 = paramObject instanceof String[];
                    if (bool3)
                    {
                      paramObject = (String[])paramObject;
                      paramBundle.putStringArray(paramString, (String[])paramObject);
                    }
                    else
                    {
                      bool3 = paramObject instanceof long[];
                      if (bool3)
                      {
                        paramObject = (long[])paramObject;
                        paramBundle.putLongArray(paramString, (long[])paramObject);
                      }
                      else
                      {
                        bool3 = paramObject instanceof float[];
                        if (bool3)
                        {
                          paramObject = (float[])paramObject;
                          paramBundle.putFloatArray(paramString, (float[])paramObject);
                        }
                        else
                        {
                          bool3 = paramObject instanceof Asset;
                          if (bool3)
                          {
                            paramObject = (Asset)paramObject;
                            paramBundle.putParcelable(paramString, (Parcelable)paramObject);
                          }
                          else
                          {
                            bool3 = paramObject instanceof DataMap;
                            Object localObject;
                            if (bool3)
                            {
                              paramObject = (DataMap)paramObject;
                              localObject = ((DataMap)paramObject).toBundle();
                              paramBundle.putParcelable(paramString, (Parcelable)localObject);
                            }
                            else
                            {
                              bool3 = paramObject instanceof ArrayList;
                              if (bool3)
                              {
                                localObject = paramObject;
                                localObject = (ArrayList)paramObject;
                                int j = zzf((ArrayList)localObject);
                                switch (j)
                                {
                                default: 
                                  break;
                                case 0: 
                                  paramObject = (ArrayList)paramObject;
                                  paramBundle.putStringArrayList(paramString, (ArrayList)paramObject);
                                  break;
                                case 1: 
                                  paramObject = (ArrayList)paramObject;
                                  paramBundle.putStringArrayList(paramString, (ArrayList)paramObject);
                                  break;
                                case 3: 
                                  paramObject = (ArrayList)paramObject;
                                  paramBundle.putStringArrayList(paramString, (ArrayList)paramObject);
                                  break;
                                case 2: 
                                  paramObject = (ArrayList)paramObject;
                                  paramBundle.putIntegerArrayList(paramString, (ArrayList)paramObject);
                                  break;
                                case 4: 
                                  ArrayList localArrayList = new java/util/ArrayList;
                                  localArrayList.<init>();
                                  paramObject = (ArrayList)paramObject;
                                  Iterator localIterator = ((ArrayList)paramObject).iterator();
                                  for (;;)
                                  {
                                    boolean bool4 = localIterator.hasNext();
                                    if (!bool4) {
                                      break;
                                    }
                                    localObject = ((DataMap)localIterator.next()).toBundle();
                                    localArrayList.add(localObject);
                                  }
                                  paramBundle.putParcelableArrayList(paramString, localArrayList);
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
        }
      }
    }
  }
  
  private static int zzf(ArrayList paramArrayList)
  {
    int i = paramArrayList.isEmpty();
    Iterator localIterator;
    if (i != 0)
    {
      i = 0;
      localIterator = null;
    }
    for (;;)
    {
      return i;
      localIterator = paramArrayList.iterator();
      boolean bool1;
      do
      {
        Object localObject;
        do
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject = localIterator.next();
        } while (localObject == null);
        boolean bool2 = localObject instanceof Integer;
        if (bool2)
        {
          j = 2;
          break;
        }
        bool2 = localObject instanceof String;
        if (bool2)
        {
          j = 3;
          break;
        }
        bool2 = localObject instanceof DataMap;
        if (bool2)
        {
          j = 4;
          break;
        }
        bool1 = localObject instanceof Bundle;
      } while (!bool1);
      int j = 5;
      continue;
      j = 1;
    }
  }
  
  public void clear()
  {
    this.zzbrc.clear();
  }
  
  public boolean containsKey(String paramString)
  {
    return this.zzbrc.containsKey(paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof DataMap;
    if (!bool) {}
    for (bool = false;; bool = zza(this, (DataMap)paramObject))
    {
      return bool;
      paramObject = (DataMap)paramObject;
    }
  }
  
  public Object get(String paramString)
  {
    return this.zzbrc.get(paramString);
  }
  
  public Asset getAsset(String paramString)
  {
    Object localObject = this.zzbrc.get(paramString);
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (Asset)localObject;
      try
      {
        localObject = (Asset)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "Asset";
        zza(paramString, localObject, str, localClassCastException);
        localObject = null;
      }
    }
  }
  
  public boolean getBoolean(String paramString)
  {
    return getBoolean(paramString, false);
  }
  
  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    Object localObject1 = this.zzbrc;
    Object localObject2 = ((HashMap)localObject1).get(paramString);
    if (localObject2 == null) {}
    for (;;)
    {
      return paramBoolean;
      Object localObject3 = localObject2;
      try
      {
        localObject3 = (Boolean)localObject2;
        localObject1 = localObject3;
        paramBoolean = ((Boolean)localObject3).booleanValue();
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "Boolean";
        Boolean localBoolean = Boolean.valueOf(paramBoolean);
        localObject1 = this;
        zza(paramString, localObject2, str, localBoolean, localClassCastException);
      }
    }
  }
  
  public byte getByte(String paramString)
  {
    return getByte(paramString, (byte)0);
  }
  
  public byte getByte(String paramString, byte paramByte)
  {
    Object localObject1 = this.zzbrc;
    Object localObject2 = ((HashMap)localObject1).get(paramString);
    if (localObject2 == null) {}
    for (;;)
    {
      return paramByte;
      Object localObject3 = localObject2;
      try
      {
        localObject3 = (Byte)localObject2;
        localObject1 = localObject3;
        paramByte = ((Byte)localObject3).byteValue();
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "Byte";
        Byte localByte = Byte.valueOf(paramByte);
        localObject1 = this;
        zza(paramString, localObject2, str, localByte, localClassCastException);
      }
    }
  }
  
  public byte[] getByteArray(String paramString)
  {
    Object localObject1 = this.zzbrc;
    Object localObject3 = ((HashMap)localObject1).get(paramString);
    if (localObject3 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (byte[])localObject1;
      Object localObject4 = localObject3;
      try
      {
        localObject4 = (byte[])localObject3;
        localObject1 = localObject4;
        localObject1 = (byte[])localObject4;
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "byte[]";
        zza(paramString, localObject3, str, localClassCastException);
        Object localObject2 = null;
      }
    }
  }
  
  public DataMap getDataMap(String paramString)
  {
    Object localObject = this.zzbrc.get(paramString);
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (DataMap)localObject;
      try
      {
        localObject = (DataMap)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "DataMap";
        zza(paramString, localObject, str, localClassCastException);
        localObject = null;
      }
    }
  }
  
  public ArrayList getDataMapArrayList(String paramString)
  {
    Object localObject = this.zzbrc.get(paramString);
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ArrayList)localObject;
      try
      {
        localObject = (ArrayList)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "ArrayList<DataMap>";
        zza(paramString, localObject, str, localClassCastException);
        localObject = null;
      }
    }
  }
  
  public double getDouble(String paramString)
  {
    return getDouble(paramString, 0.0D);
  }
  
  public double getDouble(String paramString, double paramDouble)
  {
    Object localObject1 = this.zzbrc;
    Object localObject2 = ((HashMap)localObject1).get(paramString);
    if (localObject2 == null) {}
    for (;;)
    {
      return paramDouble;
      Object localObject3 = localObject2;
      try
      {
        localObject3 = (Double)localObject2;
        localObject1 = localObject3;
        paramDouble = ((Double)localObject3).doubleValue();
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "Double";
        Double localDouble = Double.valueOf(paramDouble);
        localObject1 = this;
        zza(paramString, localObject2, str, localDouble, localClassCastException);
      }
    }
  }
  
  public float getFloat(String paramString)
  {
    return getFloat(paramString, 0.0F);
  }
  
  public float getFloat(String paramString, float paramFloat)
  {
    Object localObject1 = this.zzbrc;
    Object localObject2 = ((HashMap)localObject1).get(paramString);
    if (localObject2 == null) {}
    for (;;)
    {
      return paramFloat;
      Object localObject3 = localObject2;
      try
      {
        localObject3 = (Float)localObject2;
        localObject1 = localObject3;
        paramFloat = ((Float)localObject3).floatValue();
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "Float";
        Float localFloat = Float.valueOf(paramFloat);
        localObject1 = this;
        zza(paramString, localObject2, str, localFloat, localClassCastException);
      }
    }
  }
  
  public float[] getFloatArray(String paramString)
  {
    Object localObject1 = this.zzbrc;
    Object localObject3 = ((HashMap)localObject1).get(paramString);
    if (localObject3 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (float[])localObject1;
      Object localObject4 = localObject3;
      try
      {
        localObject4 = (float[])localObject3;
        localObject1 = localObject4;
        localObject1 = (float[])localObject4;
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "float[]";
        zza(paramString, localObject3, str, localClassCastException);
        Object localObject2 = null;
      }
    }
  }
  
  public int getInt(String paramString)
  {
    return getInt(paramString, 0);
  }
  
  public int getInt(String paramString, int paramInt)
  {
    Object localObject1 = this.zzbrc;
    Object localObject2 = ((HashMap)localObject1).get(paramString);
    if (localObject2 == null) {}
    for (;;)
    {
      return paramInt;
      Object localObject3 = localObject2;
      try
      {
        localObject3 = (Integer)localObject2;
        localObject1 = localObject3;
        paramInt = ((Integer)localObject3).intValue();
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "Integer";
        zza(paramString, localObject2, str, localClassCastException);
      }
    }
  }
  
  public ArrayList getIntegerArrayList(String paramString)
  {
    Object localObject = this.zzbrc.get(paramString);
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ArrayList)localObject;
      try
      {
        localObject = (ArrayList)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "ArrayList<Integer>";
        zza(paramString, localObject, str, localClassCastException);
        localObject = null;
      }
    }
  }
  
  public long getLong(String paramString)
  {
    return getLong(paramString, 0L);
  }
  
  public long getLong(String paramString, long paramLong)
  {
    Object localObject1 = this.zzbrc;
    Object localObject2 = ((HashMap)localObject1).get(paramString);
    if (localObject2 == null) {}
    for (;;)
    {
      return paramLong;
      Object localObject3 = localObject2;
      try
      {
        localObject3 = (Long)localObject2;
        localObject1 = localObject3;
        paramLong = ((Long)localObject3).longValue();
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "long";
        zza(paramString, localObject2, str, localClassCastException);
      }
    }
  }
  
  public long[] getLongArray(String paramString)
  {
    Object localObject1 = this.zzbrc;
    Object localObject3 = ((HashMap)localObject1).get(paramString);
    if (localObject3 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (long[])localObject1;
      Object localObject4 = localObject3;
      try
      {
        localObject4 = (long[])localObject3;
        localObject1 = localObject4;
        localObject1 = (long[])localObject4;
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "long[]";
        zza(paramString, localObject3, str, localClassCastException);
        Object localObject2 = null;
      }
    }
  }
  
  public String getString(String paramString)
  {
    Object localObject = this.zzbrc.get(paramString);
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      try
      {
        localObject = (String)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "String";
        zza(paramString, localObject, str, localClassCastException);
        localObject = null;
      }
    }
  }
  
  public String getString(String paramString1, String paramString2)
  {
    String str = getString(paramString1);
    if (str == null) {}
    for (;;)
    {
      return paramString2;
      paramString2 = str;
    }
  }
  
  public String[] getStringArray(String paramString)
  {
    Object localObject1 = this.zzbrc;
    Object localObject3 = ((HashMap)localObject1).get(paramString);
    if (localObject3 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (String[])localObject1;
      Object localObject4 = localObject3;
      try
      {
        localObject4 = (String[])localObject3;
        localObject1 = localObject4;
        localObject1 = (String[])localObject4;
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "String[]";
        zza(paramString, localObject3, str, localClassCastException);
        Object localObject2 = null;
      }
    }
  }
  
  public ArrayList getStringArrayList(String paramString)
  {
    Object localObject = this.zzbrc.get(paramString);
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ArrayList)localObject;
      try
      {
        localObject = (ArrayList)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        String str = "ArrayList<String>";
        zza(paramString, localObject, str, localClassCastException);
        localObject = null;
      }
    }
  }
  
  public int hashCode()
  {
    return this.zzbrc.hashCode() * 29;
  }
  
  public boolean isEmpty()
  {
    return this.zzbrc.isEmpty();
  }
  
  public Set keySet()
  {
    return this.zzbrc.keySet();
  }
  
  public void putAll(DataMap paramDataMap)
  {
    Object localObject1 = paramDataMap.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      HashMap localHashMap = this.zzbrc;
      Object localObject2 = paramDataMap.get((String)localObject1);
      localHashMap.put(localObject1, localObject2);
    }
  }
  
  public void putAsset(String paramString, Asset paramAsset)
  {
    this.zzbrc.put(paramString, paramAsset);
  }
  
  public void putBoolean(String paramString, boolean paramBoolean)
  {
    HashMap localHashMap = this.zzbrc;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localHashMap.put(paramString, localBoolean);
  }
  
  public void putByte(String paramString, byte paramByte)
  {
    HashMap localHashMap = this.zzbrc;
    Byte localByte = Byte.valueOf(paramByte);
    localHashMap.put(paramString, localByte);
  }
  
  public void putByteArray(String paramString, byte[] paramArrayOfByte)
  {
    this.zzbrc.put(paramString, paramArrayOfByte);
  }
  
  public void putDataMap(String paramString, DataMap paramDataMap)
  {
    this.zzbrc.put(paramString, paramDataMap);
  }
  
  public void putDataMapArrayList(String paramString, ArrayList paramArrayList)
  {
    this.zzbrc.put(paramString, paramArrayList);
  }
  
  public void putDouble(String paramString, double paramDouble)
  {
    HashMap localHashMap = this.zzbrc;
    Double localDouble = Double.valueOf(paramDouble);
    localHashMap.put(paramString, localDouble);
  }
  
  public void putFloat(String paramString, float paramFloat)
  {
    HashMap localHashMap = this.zzbrc;
    Float localFloat = Float.valueOf(paramFloat);
    localHashMap.put(paramString, localFloat);
  }
  
  public void putFloatArray(String paramString, float[] paramArrayOfFloat)
  {
    this.zzbrc.put(paramString, paramArrayOfFloat);
  }
  
  public void putInt(String paramString, int paramInt)
  {
    HashMap localHashMap = this.zzbrc;
    Integer localInteger = Integer.valueOf(paramInt);
    localHashMap.put(paramString, localInteger);
  }
  
  public void putIntegerArrayList(String paramString, ArrayList paramArrayList)
  {
    this.zzbrc.put(paramString, paramArrayList);
  }
  
  public void putLong(String paramString, long paramLong)
  {
    HashMap localHashMap = this.zzbrc;
    Long localLong = Long.valueOf(paramLong);
    localHashMap.put(paramString, localLong);
  }
  
  public void putLongArray(String paramString, long[] paramArrayOfLong)
  {
    this.zzbrc.put(paramString, paramArrayOfLong);
  }
  
  public void putString(String paramString1, String paramString2)
  {
    this.zzbrc.put(paramString1, paramString2);
  }
  
  public void putStringArray(String paramString, String[] paramArrayOfString)
  {
    this.zzbrc.put(paramString, paramArrayOfString);
  }
  
  public void putStringArrayList(String paramString, ArrayList paramArrayList)
  {
    this.zzbrc.put(paramString, paramArrayList);
  }
  
  public Object remove(String paramString)
  {
    return this.zzbrc.remove(paramString);
  }
  
  public int size()
  {
    return this.zzbrc.size();
  }
  
  public Bundle toBundle()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject1 = this.zzbrc.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      Object localObject2 = this.zzbrc.get(localObject1);
      zzb(localBundle, (String)localObject1, localObject2);
    }
    return localBundle;
  }
  
  public byte[] toByteArray()
  {
    return zzsu.toByteArray(zzsi.zza(this).zzbty);
  }
  
  public String toString()
  {
    return this.zzbrc.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\DataMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */