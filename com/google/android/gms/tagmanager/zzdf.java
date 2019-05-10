package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzdf
{
  private static final Object zzblE;
  private static Long zzblF;
  private static Double zzblG;
  private static zzde zzblH;
  private static String zzblI;
  private static Boolean zzblJ;
  private static List zzblK;
  private static Map zzblL;
  private static zzag.zza zzblM = zzR(zzblI);
  
  static
  {
    long l = 0L;
    zzblE = null;
    Object localObject = new java/lang/Long;
    ((Long)localObject).<init>(l);
    zzblF = (Long)localObject;
    localObject = new java/lang/Double;
    ((Double)localObject).<init>(0.0D);
    zzblG = (Double)localObject;
    zzblH = zzde.zzam(l);
    localObject = new java/lang/String;
    ((String)localObject).<init>("");
    zzblI = (String)localObject;
    localObject = new java/lang/Boolean;
    ((Boolean)localObject).<init>(false);
    zzblJ = (Boolean)localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(0);
    zzblK = (List)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzblL = (Map)localObject;
  }
  
  private static double getDouble(Object paramObject)
  {
    boolean bool = paramObject instanceof Number;
    if (bool) {
      paramObject = (Number)paramObject;
    }
    for (double d = ((Number)paramObject).doubleValue();; d = 0.0D)
    {
      return d;
      String str = "getDouble received non-Number";
      zzbg.e(str);
    }
  }
  
  public static Long zzHA()
  {
    return zzblF;
  }
  
  public static Double zzHB()
  {
    return zzblG;
  }
  
  public static Boolean zzHC()
  {
    return zzblJ;
  }
  
  public static zzde zzHD()
  {
    return zzblH;
  }
  
  public static String zzHE()
  {
    return zzblI;
  }
  
  public static zzag.zza zzHF()
  {
    return zzblM;
  }
  
  public static Object zzHz()
  {
    return zzblE;
  }
  
  public static String zzM(Object paramObject)
  {
    if (paramObject == null) {}
    for (String str = zzblI;; str = paramObject.toString()) {
      return str;
    }
  }
  
  public static zzde zzN(Object paramObject)
  {
    boolean bool = paramObject instanceof zzde;
    if (bool) {
      paramObject = (zzde)paramObject;
    }
    for (;;)
    {
      return (zzde)paramObject;
      bool = zzT(paramObject);
      if (bool)
      {
        long l = zzU(paramObject);
        paramObject = zzde.zzam(l);
      }
      else
      {
        bool = zzS(paramObject);
        Object localObject;
        if (bool)
        {
          double d = getDouble(paramObject);
          localObject = Double.valueOf(d);
          paramObject = zzde.zza((Double)localObject);
        }
        else
        {
          localObject = zzM(paramObject);
          paramObject = zzgu((String)localObject);
        }
      }
    }
  }
  
  public static Long zzO(Object paramObject)
  {
    boolean bool = zzT(paramObject);
    long l;
    if (bool) {
      l = zzU(paramObject);
    }
    for (Long localLong = Long.valueOf(l);; localLong = zzgv(zzM(paramObject))) {
      return localLong;
    }
  }
  
  public static Double zzP(Object paramObject)
  {
    boolean bool = zzS(paramObject);
    double d;
    if (bool) {
      d = getDouble(paramObject);
    }
    for (Double localDouble = Double.valueOf(d);; localDouble = zzgw(zzM(paramObject))) {
      return localDouble;
    }
  }
  
  public static Boolean zzQ(Object paramObject)
  {
    boolean bool = paramObject instanceof Boolean;
    if (bool) {}
    String str;
    for (paramObject = (Boolean)paramObject;; paramObject = zzgx(str))
    {
      return (Boolean)paramObject;
      str = zzM(paramObject);
    }
  }
  
  public static zzag.zza zzR(Object paramObject)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    zzag.zza localzza1 = new com/google/android/gms/internal/zzag$zza;
    localzza1.<init>();
    boolean bool2 = paramObject instanceof zzag.zza;
    if (bool2)
    {
      paramObject = (zzag.zza)paramObject;
      return (zzag.zza)paramObject;
    }
    bool2 = paramObject instanceof String;
    if (bool2)
    {
      localzza1.type = i;
      paramObject = (String)paramObject;
      localzza1.zzjx = ((String)paramObject);
    }
    for (;;)
    {
      localzza1.zzjH = bool1;
      paramObject = localzza1;
      break;
      bool2 = paramObject instanceof List;
      float f2;
      ArrayList localArrayList;
      Object localObject1;
      int i2;
      Object localObject2;
      if (bool2)
      {
        f2 = 2.8E-45F;
        localzza1.type = 2;
        paramObject = (List)paramObject;
        localArrayList = new java/util/ArrayList;
        int j = ((List)paramObject).size();
        localArrayList.<init>(j);
        localObject1 = ((List)paramObject).iterator();
        i2 = 0;
        localStringBuilder = null;
        k = ((Iterator)localObject1).hasNext();
        if (k != 0)
        {
          localObject2 = zzR(((Iterator)localObject1).next());
          localObject3 = zzblM;
          if (localObject2 == localObject3)
          {
            paramObject = zzblM;
            break;
          }
          if (i2 == 0)
          {
            k = ((zzag.zza)localObject2).zzjH;
            if (k == 0) {}
          }
          else
          {
            k = i;
          }
          for (f2 = f1;; f2 = 0.0F)
          {
            localArrayList.add(localObject2);
            i2 = k;
            break;
            k = 0;
            localObject3 = null;
          }
        }
        localObject3 = new zzag.zza[0];
        localObject3 = (zzag.zza[])localArrayList.toArray((Object[])localObject3);
        localzza1.zzjy = ((zzag.zza[])localObject3);
        bool1 = i2;
        continue;
      }
      int k = paramObject instanceof Map;
      if (k != 0)
      {
        int m = 3;
        f2 = 4.2E-45F;
        localzza1.type = m;
        paramObject = (Map)paramObject;
        localObject3 = ((Map)paramObject).entrySet();
        localArrayList = new java/util/ArrayList;
        i2 = ((Set)localObject3).size();
        localArrayList.<init>(i2);
        localObject1 = new java/util/ArrayList;
        i2 = ((Set)localObject3).size();
        ((ArrayList)localObject1).<init>(i2);
        localObject2 = ((Set)localObject3).iterator();
        i2 = 0;
        localStringBuilder = null;
        n = ((Iterator)localObject2).hasNext();
        if (n != 0)
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          zzag.zza localzza2 = zzR(((Map.Entry)localObject3).getKey());
          zzag.zza localzza3 = zzR(((Map.Entry)localObject3).getValue());
          localObject3 = zzblM;
          if (localzza2 != localObject3)
          {
            localObject3 = zzblM;
            if (localzza3 != localObject3) {}
          }
          else
          {
            paramObject = zzblM;
            break;
          }
          if (i2 == 0)
          {
            n = localzza2.zzjH;
            if (n == 0)
            {
              n = localzza3.zzjH;
              if (n == 0) {
                break label503;
              }
            }
          }
          n = i;
          for (f2 = f1;; f2 = 0.0F)
          {
            localArrayList.add(localzza2);
            ((List)localObject1).add(localzza3);
            i2 = n;
            break;
            label503:
            n = 0;
            localObject3 = null;
          }
        }
        localObject3 = new zzag.zza[0];
        localObject3 = (zzag.zza[])localArrayList.toArray((Object[])localObject3);
        localzza1.zzjz = ((zzag.zza[])localObject3);
        localObject3 = new zzag.zza[0];
        localObject3 = (zzag.zza[])((List)localObject1).toArray((Object[])localObject3);
        localzza1.zzjA = ((zzag.zza[])localObject3);
        bool1 = i2;
        continue;
      }
      int n = zzS(paramObject);
      if (n != 0)
      {
        localzza1.type = i;
        localObject3 = paramObject.toString();
        localzza1.zzjx = ((String)localObject3);
      }
      else
      {
        n = zzT(paramObject);
        if (n != 0)
        {
          int i1 = 6;
          f2 = 8.4E-45F;
          localzza1.type = i1;
          long l = zzU(paramObject);
          localzza1.zzjD = l;
        }
        else
        {
          boolean bool3 = paramObject instanceof Boolean;
          if (!bool3) {
            break label693;
          }
          f2 = 1.1E-44F;
          localzza1.type = 8;
          paramObject = (Boolean)paramObject;
          bool3 = ((Boolean)paramObject).booleanValue();
          localzza1.zzjE = bool3;
        }
      }
    }
    label693:
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    StringBuilder localStringBuilder = ((StringBuilder)localObject3).append("Converting to Value from unknown object type: ");
    if (paramObject == null) {}
    for (localObject3 = "null";; localObject3 = paramObject.getClass().toString())
    {
      localObject3 = (String)localObject3;
      zzbg.e((String)localObject3);
      paramObject = zzblM;
      break;
    }
  }
  
  private static boolean zzS(Object paramObject)
  {
    boolean bool = paramObject instanceof Double;
    if (!bool)
    {
      bool = paramObject instanceof Float;
      if (!bool)
      {
        bool = paramObject instanceof zzde;
        if (!bool) {
          break label45;
        }
        paramObject = (zzde)paramObject;
        bool = ((zzde)paramObject).zzHu();
        if (!bool) {
          break label45;
        }
      }
    }
    label45:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static boolean zzT(Object paramObject)
  {
    boolean bool = paramObject instanceof Byte;
    if (!bool)
    {
      bool = paramObject instanceof Short;
      if (!bool)
      {
        bool = paramObject instanceof Integer;
        if (!bool)
        {
          bool = paramObject instanceof Long;
          if (!bool)
          {
            bool = paramObject instanceof zzde;
            if (!bool) {
              break label63;
            }
            paramObject = (zzde)paramObject;
            bool = ((zzde)paramObject).zzHv();
            if (!bool) {
              break label63;
            }
          }
        }
      }
    }
    label63:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static long zzU(Object paramObject)
  {
    boolean bool = paramObject instanceof Number;
    if (bool) {
      paramObject = (Number)paramObject;
    }
    for (long l = ((Number)paramObject).longValue();; l = 0L)
    {
      return l;
      String str = "getInt64 received non-Number";
      zzbg.e(str);
    }
  }
  
  public static String zzg(zzag.zza paramzza)
  {
    return zzM(zzl(paramzza));
  }
  
  public static zzag.zza zzgt(String paramString)
  {
    zzag.zza localzza = new com/google/android/gms/internal/zzag$zza;
    localzza.<init>();
    localzza.type = 5;
    localzza.zzjC = paramString;
    return localzza;
  }
  
  private static zzde zzgu(String paramString)
  {
    try
    {
      localzzde = zzde.zzgs(paramString);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        zzde localzzde;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("Failed to convert '").append(paramString);
        String str = "' to a number.";
        zzbg.e(str);
        localObject = zzblH;
      }
    }
    return localzzde;
  }
  
  private static Long zzgv(String paramString)
  {
    Object localObject = zzgu(paramString);
    zzde localzzde = zzblH;
    if (localObject == localzzde) {}
    long l;
    for (localObject = zzblF;; localObject = Long.valueOf(l))
    {
      return (Long)localObject;
      l = ((zzde)localObject).longValue();
    }
  }
  
  private static Double zzgw(String paramString)
  {
    Object localObject = zzgu(paramString);
    zzde localzzde = zzblH;
    if (localObject == localzzde) {}
    double d;
    for (localObject = zzblG;; localObject = Double.valueOf(d))
    {
      return (Double)localObject;
      d = ((zzde)localObject).doubleValue();
    }
  }
  
  private static Boolean zzgx(String paramString)
  {
    Object localObject = "true";
    boolean bool = ((String)localObject).equalsIgnoreCase(paramString);
    if (bool) {
      localObject = Boolean.TRUE;
    }
    for (;;)
    {
      return (Boolean)localObject;
      localObject = "false";
      bool = ((String)localObject).equalsIgnoreCase(paramString);
      if (bool) {
        localObject = Boolean.FALSE;
      } else {
        localObject = zzblJ;
      }
    }
  }
  
  public static zzde zzh(zzag.zza paramzza)
  {
    return zzN(zzl(paramzza));
  }
  
  public static Long zzi(zzag.zza paramzza)
  {
    return zzO(zzl(paramzza));
  }
  
  public static Double zzj(zzag.zza paramzza)
  {
    return zzP(zzl(paramzza));
  }
  
  public static Boolean zzk(zzag.zza paramzza)
  {
    return zzQ(zzl(paramzza));
  }
  
  public static Object zzl(zzag.zza paramzza)
  {
    int i = 0;
    Object localObject1 = null;
    if (paramzza == null) {
      localObject1 = zzblE;
    }
    for (;;)
    {
      return localObject1;
      int j = paramzza.type;
      Object localObject2;
      int k;
      Object localObject3;
      int m;
      Object localObject4;
      Object localObject5;
      switch (j)
      {
      default: 
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "Failed to convert a value of type: ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        j = paramzza.type;
        zzbg.e(j);
        localObject1 = zzblE;
        break;
      case 1: 
        localObject1 = paramzza.zzjx;
        break;
      case 2: 
        localObject2 = new java/util/ArrayList;
        k = paramzza.zzjy.length;
        ((ArrayList)localObject2).<init>(k);
        localObject3 = paramzza.zzjy;
        m = localObject3.length;
        for (;;)
        {
          if (i >= m) {
            break label198;
          }
          localObject4 = zzl(localObject3[i]);
          localObject5 = zzblE;
          if (localObject4 == localObject5)
          {
            localObject1 = zzblE;
            break;
          }
          ((ArrayList)localObject2).add(localObject4);
          i += 1;
        }
        localObject1 = localObject2;
        break;
      case 3: 
        localObject2 = paramzza.zzjz;
        j = localObject2.length;
        localObject3 = paramzza.zzjA;
        k = localObject3.length;
        if (j != k)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append("Converting an invalid value to object: ");
          localObject2 = paramzza.toString();
          zzbg.e((String)localObject2);
          localObject1 = zzblE;
        }
        else
        {
          localObject2 = new java/util/HashMap;
          localObject3 = paramzza.zzjA;
          k = localObject3.length;
          ((HashMap)localObject2).<init>(k);
          for (;;)
          {
            localObject3 = paramzza.zzjz;
            k = localObject3.length;
            if (i >= k) {
              break label384;
            }
            localObject3 = zzl(paramzza.zzjz[i]);
            Object localObject6 = zzl(paramzza.zzjA[i]);
            localObject4 = zzblE;
            if (localObject3 != localObject4)
            {
              localObject4 = zzblE;
              if (localObject6 != localObject4) {}
            }
            else
            {
              localObject1 = zzblE;
              break;
            }
            ((Map)localObject2).put(localObject3, localObject6);
            i += 1;
          }
          localObject1 = localObject2;
        }
        break;
      case 4: 
        zzbg.e("Trying to convert a macro reference to object");
        localObject1 = zzblE;
        break;
      case 5: 
        zzbg.e("Trying to convert a function id to object");
        localObject1 = zzblE;
        break;
      case 6: 
        long l = paramzza.zzjD;
        localObject1 = Long.valueOf(l);
        break;
      case 7: 
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject3 = paramzza.zzjF;
        m = localObject3.length;
        for (;;)
        {
          if (i >= m) {
            break label501;
          }
          localObject4 = zzg(localObject3[i]);
          localObject5 = zzblI;
          if (localObject4 == localObject5)
          {
            localObject1 = zzblE;
            break;
          }
          ((StringBuffer)localObject2).append((String)localObject4);
          i += 1;
        }
        localObject1 = ((StringBuffer)localObject2).toString();
        break;
      case 8: 
        label198:
        label384:
        label501:
        boolean bool = paramzza.zzjE;
        localObject1 = Boolean.valueOf(bool);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzdf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */