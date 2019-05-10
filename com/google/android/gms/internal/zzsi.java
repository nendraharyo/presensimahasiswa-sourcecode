package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public final class zzsi
{
  private static int zza(String paramString, zzsj.zza.zza[] paramArrayOfzza)
  {
    int i = 14;
    int j = paramArrayOfzza.length;
    Object localObject1 = null;
    int k = 0;
    Object localObject2 = null;
    int m = i;
    if (k < j)
    {
      zzsj.zza.zza localzza = paramArrayOfzza[k];
      int n;
      if (m == i)
      {
        n = localzza.type;
        int i1 = 9;
        if (n != i1)
        {
          n = localzza.type;
          i1 = 2;
          if (n != i1)
          {
            n = localzza.type;
            i1 = 6;
            if (n != i1) {
              break label105;
            }
          }
        }
        m = localzza.type;
      }
      label105:
      do
      {
        do
        {
          k += 1;
          break;
          n = localzza.type;
        } while (n == i);
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Unexpected TypedValue type: ");
        i = localzza.type;
        localObject2 = i + " for key " + paramString;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        n = localzza.type;
      } while (n == m);
      localObject2 = new java/lang/IllegalArgumentException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject1 = localStringBuilder.append("The ArrayList elements should all be the same type, but ArrayList with key ").append(paramString).append(" contains items of type ").append(m).append(" and ");
      i = localzza.type;
      localObject1 = i;
      ((IllegalArgumentException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    return m;
  }
  
  static int zza(List paramList, Asset paramAsset)
  {
    paramList.add(paramAsset);
    return paramList.size() + -1;
  }
  
  public static zzsi.zza zza(DataMap paramDataMap)
  {
    zzsj localzzsj = new com/google/android/gms/internal/zzsj;
    localzzsj.<init>();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = zza(paramDataMap, localArrayList);
    localzzsj.zzbtA = ((zzsj.zza[])localObject);
    localObject = new com/google/android/gms/internal/zzsi$zza;
    ((zzsi.zza)localObject).<init>(localzzsj, localArrayList);
    return (zzsi.zza)localObject;
  }
  
  private static zzsj.zza.zza zza(List paramList, Object paramObject)
  {
    int i = 9;
    int j = 6;
    int k = 2;
    int m = 0;
    Object localObject1 = null;
    int i1 = 14;
    Object localObject2 = new com/google/android/gms/internal/zzsj$zza$zza;
    ((zzsj.zza.zza)localObject2).<init>();
    if (paramObject == null)
    {
      ((zzsj.zza.zza)localObject2).type = i1;
      localObject1 = localObject2;
      return (zzsj.zza.zza)localObject1;
    }
    Object localObject3 = new com/google/android/gms/internal/zzsj$zza$zza$zza;
    ((zzsj.zza.zza.zza)localObject3).<init>();
    ((zzsj.zza.zza)localObject2).zzbtE = ((zzsj.zza.zza.zza)localObject3);
    boolean bool2 = paramObject instanceof String;
    if (bool2)
    {
      ((zzsj.zza.zza)localObject2).type = k;
      localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
      paramObject = (String)paramObject;
      ((zzsj.zza.zza.zza)localObject1).zzbtG = ((String)paramObject);
    }
    float f;
    Object localObject4;
    int i6;
    Iterator localIterator;
    for (;;)
    {
      localObject1 = localObject2;
      break;
      bool2 = paramObject instanceof Integer;
      if (bool2)
      {
        ((zzsj.zza.zza)localObject2).type = j;
        localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
        paramObject = (Integer)paramObject;
        int i2 = ((Integer)paramObject).intValue();
        ((zzsj.zza.zza.zza)localObject1).zzbtK = i2;
      }
      else
      {
        boolean bool3 = paramObject instanceof Long;
        long l;
        if (bool3)
        {
          m = 5;
          ((zzsj.zza.zza)localObject2).type = m;
          localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
          paramObject = (Long)paramObject;
          l = ((Long)paramObject).longValue();
          ((zzsj.zza.zza.zza)localObject1).zzbtJ = l;
        }
        else
        {
          bool3 = paramObject instanceof Double;
          if (bool3)
          {
            m = 3;
            ((zzsj.zza.zza)localObject2).type = m;
            localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
            paramObject = (Double)paramObject;
            double d = ((Double)paramObject).doubleValue();
            ((zzsj.zza.zza.zza)localObject1).zzbtH = d;
          }
          else
          {
            bool3 = paramObject instanceof Float;
            if (bool3)
            {
              m = 4;
              ((zzsj.zza.zza)localObject2).type = m;
              localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
              paramObject = (Float)paramObject;
              f = ((Float)paramObject).floatValue();
              ((zzsj.zza.zza.zza)localObject1).zzbtI = f;
            }
            else
            {
              bool3 = paramObject instanceof Boolean;
              if (bool3)
              {
                m = 8;
                ((zzsj.zza.zza)localObject2).type = m;
                localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
                paramObject = (Boolean)paramObject;
                bool3 = ((Boolean)paramObject).booleanValue();
                ((zzsj.zza.zza.zza)localObject1).zzbtM = bool3;
              }
              else
              {
                bool3 = paramObject instanceof Byte;
                if (bool3)
                {
                  m = 7;
                  ((zzsj.zza.zza)localObject2).type = m;
                  localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
                  paramObject = (Byte)paramObject;
                  int i3 = ((Byte)paramObject).byteValue();
                  ((zzsj.zza.zza.zza)localObject1).zzbtL = i3;
                }
                else
                {
                  boolean bool4 = paramObject instanceof byte[];
                  if (bool4)
                  {
                    m = 1;
                    ((zzsj.zza.zza)localObject2).type = m;
                    localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
                    paramObject = (byte[])paramObject;
                    ((zzsj.zza.zza.zza)localObject1).zzbtF = ((byte[])paramObject);
                  }
                  else
                  {
                    bool4 = paramObject instanceof String[];
                    if (bool4)
                    {
                      m = 11;
                      ((zzsj.zza.zza)localObject2).type = m;
                      localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
                      paramObject = (String[])paramObject;
                      ((zzsj.zza.zza.zza)localObject1).zzbtP = ((String[])paramObject);
                    }
                    else
                    {
                      bool4 = paramObject instanceof long[];
                      if (bool4)
                      {
                        m = 12;
                        ((zzsj.zza.zza)localObject2).type = m;
                        localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
                        paramObject = (long[])paramObject;
                        ((zzsj.zza.zza.zza)localObject1).zzbtQ = ((long[])paramObject);
                      }
                      else
                      {
                        bool4 = paramObject instanceof float[];
                        if (bool4)
                        {
                          m = 15;
                          ((zzsj.zza.zza)localObject2).type = m;
                          localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
                          paramObject = (float[])paramObject;
                          ((zzsj.zza.zza.zza)localObject1).zzbtR = ((float[])paramObject);
                        }
                        else
                        {
                          bool4 = paramObject instanceof Asset;
                          if (bool4)
                          {
                            m = 13;
                            ((zzsj.zza.zza)localObject2).type = m;
                            localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
                            paramObject = (Asset)paramObject;
                            int i4 = zza(paramList, (Asset)paramObject);
                            l = i4;
                            ((zzsj.zza.zza.zza)localObject1).zzbtS = l;
                          }
                          else
                          {
                            bool5 = paramObject instanceof DataMap;
                            if (!bool5) {
                              break label821;
                            }
                            ((zzsj.zza.zza)localObject2).type = i;
                            paramObject = (DataMap)paramObject;
                            localObject3 = new java/util/TreeSet;
                            localObject4 = ((DataMap)paramObject).keySet();
                            ((TreeSet)localObject3).<init>((Collection)localObject4);
                            i6 = ((TreeSet)localObject3).size();
                            localObject4 = new zzsj.zza[i6];
                            localIterator = ((TreeSet)localObject3).iterator();
                            bool5 = false;
                            localObject3 = null;
                            f = 0.0F;
                            for (;;)
                            {
                              boolean bool1 = localIterator.hasNext();
                              if (!bool1) {
                                break;
                              }
                              localObject1 = (String)localIterator.next();
                              zzsj.zza localzza = new com/google/android/gms/internal/zzsj$zza;
                              localzza.<init>();
                              localObject4[bool5] = localzza;
                              localObject4[bool5].name = ((String)localObject1);
                              localzza = localObject4[bool5];
                              localObject1 = ((DataMap)paramObject).get((String)localObject1);
                              localObject1 = zza(paramList, localObject1);
                              localzza.zzbtC = ((zzsj.zza.zza)localObject1);
                              int n = bool5 + true;
                              bool5 = n;
                            }
                            localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
                            ((zzsj.zza.zza.zza)localObject1).zzbtN = ((zzsj.zza[])localObject4);
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
    label821:
    boolean bool5 = paramObject instanceof ArrayList;
    zzsj.zza.zza[] arrayOfzza;
    int i8;
    label878:
    zzsj.zza.zza localzza1;
    int i9;
    if (bool5)
    {
      ((zzsj.zza.zza)localObject2).type = 10;
      paramObject = (ArrayList)paramObject;
      arrayOfzza = new zzsj.zza.zza[((ArrayList)paramObject).size()];
      bool5 = false;
      f = 0.0F;
      localObject3 = null;
      int i7 = ((ArrayList)paramObject).size();
      i8 = 0;
      localIterator = null;
      i6 = i1;
      if (i8 < i7)
      {
        localObject1 = ((ArrayList)paramObject).get(i8);
        localzza1 = zza(paramList, localObject1);
        i9 = localzza1.type;
        if (i9 != i1)
        {
          i9 = localzza1.type;
          if (i9 != k)
          {
            i9 = localzza1.type;
            if (i9 != j)
            {
              i9 = localzza1.type;
              if (i9 != i)
              {
                localObject3 = new java/lang/IllegalArgumentException;
                localObject4 = new java/lang/StringBuilder;
                ((StringBuilder)localObject4).<init>();
                localObject4 = ((StringBuilder)localObject4).append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ");
                localObject1 = localObject1.getClass();
                localObject1 = localObject1;
                ((IllegalArgumentException)localObject3).<init>((String)localObject1);
                throw ((Throwable)localObject3);
              }
            }
          }
        }
        if (i6 == i1)
        {
          i9 = localzza1.type;
          if (i9 == i1) {}
        }
      }
    }
    for (int i5 = localzza1.type;; i5 = i6)
    {
      arrayOfzza[i8] = localzza1;
      i8 += 1;
      i6 = i5;
      localObject3 = localObject1;
      break label878;
      i9 = localzza1.type;
      if (i9 != i6)
      {
        localObject4 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("ArrayList elements must all be of the sameclass, but this one contains a ");
        localObject3 = localObject3.getClass();
        localObject3 = ((StringBuilder)localObject2).append(localObject3).append(" and a ");
        localObject1 = localObject1.getClass();
        localObject1 = localObject1;
        ((IllegalArgumentException)localObject4).<init>((String)localObject1);
        throw ((Throwable)localObject4);
        localObject1 = ((zzsj.zza.zza)localObject2).zzbtE;
        ((zzsj.zza.zza.zza)localObject1).zzbtO = arrayOfzza;
        break;
        localObject1 = new java/lang/RuntimeException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("newFieldValueFromValue: unexpected value ");
        localObject4 = paramObject.getClass().getSimpleName();
        localObject3 = (String)localObject4;
        ((RuntimeException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
      localObject1 = localObject3;
    }
  }
  
  public static DataMap zza(zzsi.zza paramzza)
  {
    DataMap localDataMap = new com/google/android/gms/wearable/DataMap;
    localDataMap.<init>();
    zzsj.zza[] arrayOfzza = paramzza.zzbty.zzbtA;
    int i = arrayOfzza.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = arrayOfzza[j];
      List localList = paramzza.zzbtz;
      String str = ((zzsj.zza)localObject).name;
      localObject = ((zzsj.zza)localObject).zzbtC;
      zza(localList, localDataMap, str, (zzsj.zza.zza)localObject);
      j += 1;
    }
    return localDataMap;
  }
  
  private static ArrayList zza(List paramList, zzsj.zza.zza.zza paramzza, int paramInt)
  {
    Object localObject1 = null;
    ArrayList localArrayList = new java/util/ArrayList;
    Object localObject2 = paramzza.zzbtO;
    int i = localObject2.length;
    localArrayList.<init>(i);
    zzsj.zza.zza[] arrayOfzza = paramzza.zzbtO;
    int j = arrayOfzza.length;
    int k = 0;
    if (k < j)
    {
      localObject2 = arrayOfzza[k];
      int m = ((zzsj.zza.zza)localObject2).type;
      int n = 14;
      if (m == n)
      {
        i = 0;
        localObject2 = null;
        localArrayList.add(null);
      }
      for (;;)
      {
        i = k + 1;
        k = i;
        break;
        m = 9;
        if (paramInt == m)
        {
          DataMap localDataMap = new com/google/android/gms/wearable/DataMap;
          localDataMap.<init>();
          zzsj.zza[] arrayOfzza1 = ((zzsj.zza.zza)localObject2).zzbtE.zzbtN;
          int i1 = arrayOfzza1.length;
          i = 0;
          localObject2 = null;
          while (i < i1)
          {
            Object localObject3 = arrayOfzza1[i];
            String str = ((zzsj.zza)localObject3).name;
            localObject3 = ((zzsj.zza)localObject3).zzbtC;
            zza(paramList, localDataMap, str, (zzsj.zza.zza)localObject3);
            i += 1;
          }
          localArrayList.add(localDataMap);
        }
        else
        {
          m = 2;
          if (paramInt == m)
          {
            localObject2 = ((zzsj.zza.zza)localObject2).zzbtE.zzbtG;
            localArrayList.add(localObject2);
          }
          else
          {
            m = 6;
            if (paramInt != m) {
              break label264;
            }
            i = ((zzsj.zza.zza)localObject2).zzbtE.zzbtK;
            localObject2 = Integer.valueOf(i);
            localArrayList.add(localObject2);
          }
        }
      }
      label264:
      localObject2 = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Unexpected typeOfArrayList: " + paramInt;
      ((IllegalArgumentException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    return localArrayList;
  }
  
  private static void zza(List paramList, DataMap paramDataMap, String paramString, zzsj.zza.zza paramzza)
  {
    int i = 14;
    int j = 9;
    int k = 6;
    int m = 2;
    int n = paramzza.type;
    float f;
    if (n == i)
    {
      n = 0;
      f = 0.0F;
      localObject1 = null;
      paramDataMap.putString(paramString, null);
    }
    int i2;
    for (;;)
    {
      return;
      localObject2 = paramzza.zzbtE;
      int i3 = 1;
      if (n == i3)
      {
        localObject1 = ((zzsj.zza.zza.zza)localObject2).zzbtF;
        paramDataMap.putByteArray(paramString, (byte[])localObject1);
      }
      else
      {
        int i4 = 11;
        if (n == i4)
        {
          localObject1 = ((zzsj.zza.zza.zza)localObject2).zzbtP;
          paramDataMap.putStringArray(paramString, (String[])localObject1);
        }
        else
        {
          int i5 = 12;
          if (n == i5)
          {
            localObject1 = ((zzsj.zza.zza.zza)localObject2).zzbtQ;
            paramDataMap.putLongArray(paramString, (long[])localObject1);
          }
          else
          {
            int i6 = 15;
            if (n == i6)
            {
              localObject1 = ((zzsj.zza.zza.zza)localObject2).zzbtR;
              paramDataMap.putFloatArray(paramString, (float[])localObject1);
            }
            else if (n == m)
            {
              localObject1 = ((zzsj.zza.zza.zza)localObject2).zzbtG;
              paramDataMap.putString(paramString, (String)localObject1);
            }
            else
            {
              int i7 = 3;
              if (n == i7)
              {
                double d = ((zzsj.zza.zza.zza)localObject2).zzbtH;
                paramDataMap.putDouble(paramString, d);
              }
              else
              {
                int i8 = 4;
                if (n == i8)
                {
                  f = ((zzsj.zza.zza.zza)localObject2).zzbtI;
                  paramDataMap.putFloat(paramString, f);
                }
                else
                {
                  int i9 = 5;
                  long l;
                  if (n == i9)
                  {
                    l = ((zzsj.zza.zza.zza)localObject2).zzbtJ;
                    paramDataMap.putLong(paramString, l);
                  }
                  else if (n == k)
                  {
                    n = ((zzsj.zza.zza.zza)localObject2).zzbtK;
                    paramDataMap.putInt(paramString, n);
                  }
                  else
                  {
                    int i10 = 7;
                    if (n == i10)
                    {
                      n = (byte)((zzsj.zza.zza.zza)localObject2).zzbtL;
                      paramDataMap.putByte(paramString, n);
                    }
                    else
                    {
                      int i11 = 8;
                      int i1;
                      if (n == i11)
                      {
                        i1 = ((zzsj.zza.zza.zza)localObject2).zzbtM;
                        paramDataMap.putBoolean(paramString, i1);
                      }
                      else
                      {
                        int i12 = 13;
                        if (i1 == i12)
                        {
                          if (paramList == null)
                          {
                            localObject1 = new java/lang/RuntimeException;
                            localObject2 = new java/lang/StringBuilder;
                            ((StringBuilder)localObject2).<init>();
                            localObject2 = "populateBundle: unexpected type for: " + paramString;
                            ((RuntimeException)localObject1).<init>((String)localObject2);
                            throw ((Throwable)localObject1);
                          }
                          l = ((zzsj.zza.zza.zza)localObject2).zzbtS;
                          i2 = (int)l;
                          localObject1 = (Asset)paramList.get(i2);
                          paramDataMap.putAsset(paramString, (Asset)localObject1);
                        }
                        else if (i2 == j)
                        {
                          localObject3 = new com/google/android/gms/wearable/DataMap;
                          ((DataMap)localObject3).<init>();
                          localObject2 = ((zzsj.zza.zza.zza)localObject2).zzbtN;
                          m = localObject2.length;
                          i2 = 0;
                          f = 0.0F;
                          localObject1 = null;
                          while (i2 < m)
                          {
                            zzsj.zza.zza localzza = localObject2[i2];
                            String str = localzza.name;
                            localzza = localzza.zzbtC;
                            zza(paramList, (DataMap)localObject3, str, localzza);
                            i2 += 1;
                          }
                          paramDataMap.putDataMap(paramString, (DataMap)localObject3);
                        }
                        else
                        {
                          int i13 = 10;
                          if (i2 != i13) {
                            break label681;
                          }
                          localObject1 = ((zzsj.zza.zza.zza)localObject2).zzbtO;
                          i2 = zza(paramString, (zzsj.zza.zza[])localObject1);
                          localObject2 = zza(paramList, (zzsj.zza.zza.zza)localObject2, i2);
                          if (i2 == i)
                          {
                            paramDataMap.putStringArrayList(paramString, (ArrayList)localObject2);
                          }
                          else if (i2 == j)
                          {
                            paramDataMap.putDataMapArrayList(paramString, (ArrayList)localObject2);
                          }
                          else if (i2 == m)
                          {
                            paramDataMap.putStringArrayList(paramString, (ArrayList)localObject2);
                          }
                          else
                          {
                            if (i2 != k) {
                              break;
                            }
                            paramDataMap.putIntegerArrayList(paramString, (ArrayList)localObject2);
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
    Object localObject2 = new java/lang/IllegalStateException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    Object localObject1 = "Unexpected typeOfArrayList: " + i2;
    ((IllegalStateException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
    label681:
    localObject2 = new java/lang/RuntimeException;
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject1 = "populateBundle: unexpected type " + i2;
    ((RuntimeException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  private static zzsj.zza[] zza(DataMap paramDataMap, List paramList)
  {
    TreeSet localTreeSet = new java/util/TreeSet;
    Object localObject1 = paramDataMap.keySet();
    localTreeSet.<init>((Collection)localObject1);
    zzsj.zza[] arrayOfzza = new zzsj.zza[localTreeSet.size()];
    boolean bool = false;
    localObject1 = null;
    Iterator localIterator = localTreeSet.iterator();
    int j = 0;
    localTreeSet = null;
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      Object localObject2 = paramDataMap.get((String)localObject1);
      zzsj.zza localzza = new com/google/android/gms/internal/zzsj$zza;
      localzza.<init>();
      arrayOfzza[j] = localzza;
      localzza = arrayOfzza[j];
      localzza.name = ((String)localObject1);
      localObject1 = arrayOfzza[j];
      localObject2 = zza(paramList, localObject2);
      ((zzsj.zza)localObject1).zzbtC = ((zzsj.zza.zza)localObject2);
      int i = j + 1;
      j = i;
    }
    return arrayOfzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */