package com.google.android.gms.measurement;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public abstract class zze
{
  public static String zzF(Object paramObject)
  {
    return zza(paramObject, 0);
  }
  
  public static String zzO(Map paramMap)
  {
    return zza(paramMap, 1);
  }
  
  private static String zza(Object paramObject, int paramInt)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int j = 10;
    if (paramInt > j) {
      localObject1 = "ERROR: Recursive toString calls";
    }
    for (;;)
    {
      return (String)localObject1;
      if (paramObject == null)
      {
        localObject1 = "";
      }
      else
      {
        boolean bool3 = paramObject instanceof String;
        if (bool3)
        {
          localObject1 = paramObject;
          localObject1 = (String)paramObject;
          bool1 = TextUtils.isEmpty((CharSequence)localObject1);
          if (bool1) {
            localObject1 = "";
          } else {
            localObject1 = paramObject.toString();
          }
        }
        else
        {
          bool3 = paramObject instanceof Integer;
          if (bool3)
          {
            localObject1 = paramObject;
            localObject1 = (Integer)paramObject;
            int i = ((Integer)localObject1).intValue();
            if (i == 0) {
              localObject1 = "";
            } else {
              localObject1 = paramObject.toString();
            }
          }
          else
          {
            bool3 = paramObject instanceof Long;
            long l2;
            double d1;
            boolean bool2;
            if (bool3)
            {
              localObject1 = paramObject;
              localObject1 = (Long)paramObject;
              long l1 = ((Long)localObject1).longValue();
              l2 = 0L;
              d1 = 0.0D;
              bool2 = l1 < l2;
              if (!bool2) {
                localObject1 = "";
              } else {
                localObject1 = paramObject.toString();
              }
            }
            else
            {
              bool3 = paramObject instanceof Double;
              if (bool3)
              {
                localObject1 = paramObject;
                localObject1 = (Double)paramObject;
                double d2 = ((Double)localObject1).doubleValue();
                l2 = 0L;
                d1 = 0.0D;
                bool2 = d2 < d1;
                if (!bool2) {
                  localObject1 = "";
                } else {
                  localObject1 = paramObject.toString();
                }
              }
              else
              {
                bool3 = paramObject instanceof Boolean;
                if (bool3)
                {
                  localObject1 = paramObject;
                  localObject1 = (Boolean)paramObject;
                  bool2 = ((Boolean)localObject1).booleanValue();
                  if (!bool2) {
                    localObject1 = "";
                  } else {
                    localObject1 = paramObject.toString();
                  }
                }
                else
                {
                  bool3 = paramObject instanceof List;
                  Object localObject2;
                  Iterator localIterator;
                  Object localObject3;
                  Object localObject4;
                  if (bool3)
                  {
                    localObject1 = new java/lang/StringBuffer;
                    ((StringBuffer)localObject1).<init>();
                    if (paramInt > 0)
                    {
                      localObject2 = "[";
                      ((StringBuffer)localObject1).append((String)localObject2);
                    }
                    paramObject = (List)paramObject;
                    int k = ((StringBuffer)localObject1).length();
                    localIterator = ((List)paramObject).iterator();
                    for (;;)
                    {
                      boolean bool5 = localIterator.hasNext();
                      if (!bool5) {
                        break;
                      }
                      localObject3 = localIterator.next();
                      int n = ((StringBuffer)localObject1).length();
                      if (n > k)
                      {
                        localObject4 = ", ";
                        ((StringBuffer)localObject1).append((String)localObject4);
                      }
                      n = paramInt + 1;
                      localObject3 = zza(localObject3, n);
                      ((StringBuffer)localObject1).append((String)localObject3);
                    }
                    if (paramInt > 0)
                    {
                      localObject2 = "]";
                      ((StringBuffer)localObject1).append((String)localObject2);
                    }
                    localObject1 = ((StringBuffer)localObject1).toString();
                  }
                  else
                  {
                    boolean bool4 = paramObject instanceof Map;
                    if (bool4)
                    {
                      localObject3 = new java/lang/StringBuffer;
                      ((StringBuffer)localObject3).<init>();
                      localObject2 = new java/util/TreeMap;
                      paramObject = (Map)paramObject;
                      ((TreeMap)localObject2).<init>((Map)paramObject);
                      localObject4 = ((Map)localObject2).entrySet().iterator();
                      bool4 = false;
                      localObject2 = null;
                      int i1 = 0;
                      localIterator = null;
                      for (;;)
                      {
                        bool2 = ((Iterator)localObject4).hasNext();
                        if (!bool2) {
                          break;
                        }
                        localObject1 = (Map.Entry)((Iterator)localObject4).next();
                        Object localObject5 = ((Map.Entry)localObject1).getValue();
                        int i2 = paramInt + 1;
                        localObject5 = zza(localObject5, i2);
                        boolean bool6 = TextUtils.isEmpty((CharSequence)localObject5);
                        if (!bool6)
                        {
                          int m;
                          if ((paramInt > 0) && (i1 == 0))
                          {
                            localObject2 = "{";
                            ((StringBuffer)localObject3).append((String)localObject2);
                            i1 = 1;
                            m = ((StringBuffer)localObject3).length();
                          }
                          int i3 = ((StringBuffer)localObject3).length();
                          if (i3 > m)
                          {
                            String str = ", ";
                            ((StringBuffer)localObject3).append(str);
                          }
                          localObject1 = (String)((Map.Entry)localObject1).getKey();
                          ((StringBuffer)localObject3).append((String)localObject1);
                          char c = '=';
                          ((StringBuffer)localObject3).append(c);
                          ((StringBuffer)localObject3).append((String)localObject5);
                        }
                      }
                      if (i1 != 0)
                      {
                        localObject1 = "}";
                        ((StringBuffer)localObject3).append((String)localObject1);
                      }
                      localObject1 = ((StringBuffer)localObject3).toString();
                    }
                    else
                    {
                      localObject1 = paramObject.toString();
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
  
  public abstract void zza(zze paramzze);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */