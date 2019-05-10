package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.data.Value;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class zznw
{
  private static final Set zzazD;
  
  static
  {
    HashSet localHashSet = new java/util/HashSet;
    Object localObject = new String[2];
    String str = zznt.zzaxI.name;
    localObject[0] = str;
    str = zznt.zzaxW.name;
    localObject[1] = str;
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    zzazD = Collections.unmodifiableSet(localHashSet);
  }
  
  public static String zzd(DataPoint paramDataPoint)
  {
    Object localObject1 = null;
    DataType localDataType = paramDataPoint.getDataType();
    Object localObject2 = localDataType.getName();
    boolean bool1 = zznu.zzdD((String)localObject2);
    if (!bool1)
    {
      bool1 = false;
      localObject2 = null;
    }
    for (;;)
    {
      return (String)localObject2;
      localObject2 = localDataType.getFields();
      Iterator localIterator = ((List)localObject2).iterator();
      label43:
      label252:
      do
      {
        double d1;
        do
        {
          Object localObject3;
          boolean bool3;
          do
          {
            bool1 = localIterator.hasNext();
            if (!bool1) {
              break label375;
            }
            localObject2 = (Field)localIterator.next();
            localObject3 = paramDataPoint.getValue((Field)localObject2);
            boolean bool2 = ((Value)localObject3).isSet();
            if (bool2) {
              break;
            }
            localObject3 = zzazD;
            String str1 = ((Field)localObject2).getName();
            bool3 = ((Set)localObject3).contains(str1);
          } while (bool3);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = ((Field)localObject2).getName();
          localObject2 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject1 = " not set";
          localObject2 = (String)localObject1;
          break;
          int i = ((Field)localObject2).getFormat();
          int k = 1;
          int j;
          if (i == k) {
            j = ((Value)localObject3).asInt();
          }
          float f;
          for (d1 = j;; d1 = f)
          {
            localObject4 = zznx.zzuG();
            str2 = ((Field)localObject2).getName();
            localObject4 = ((zznx)localObject4).zzdE(str2);
            if (localObject4 == null) {
              break label252;
            }
            boolean bool4 = ((zznx.zza)localObject4).zzh(d1);
            if (bool4) {
              break label252;
            }
            localObject2 = "Field out of range";
            break;
            i = ((Field)localObject2).getFormat();
            int m = 2;
            if (i != m) {
              break label43;
            }
            f = ((Value)localObject3).asFloat();
          }
          Object localObject4 = zznx.zzuG();
          String str2 = localDataType.getName();
          localObject2 = ((Field)localObject2).getName();
          localObject2 = ((zznx)localObject4).zzC(str2, (String)localObject2);
        } while (localObject2 == null);
        long l1 = paramDataPoint.getTimestampNanos();
        long l2 = paramDataPoint.zzuj();
        l1 -= l2;
        l2 = 0L;
        boolean bool5 = l1 < l2;
        if (!bool5)
        {
          double d2 = 0.0D;
          bool1 = d1 < d2;
          if (!bool1)
          {
            bool1 = false;
            localObject2 = null;
            break;
          }
          localObject2 = "DataPoint out of range";
          break;
        }
        double d3 = l1;
        d1 /= d3;
        bool1 = ((zznx.zza)localObject2).zzh(d1);
      } while (bool1);
      localObject2 = "DataPoint out of range";
      continue;
      label375:
      bool1 = false;
      localObject2 = null;
    }
  }
  
  public static void zze(DataPoint paramDataPoint)
  {
    String str = zzd(paramDataPoint);
    if (str != null)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Invalid data point: " + paramDataPoint;
      Log.w("Fitness", (String)localObject);
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */