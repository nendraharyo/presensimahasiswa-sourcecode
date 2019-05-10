package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class DowngradeableSafeParcel
  implements SafeParcelable
{
  private static final Object zzalh;
  private static ClassLoader zzali = null;
  private static Integer zzalj = null;
  private boolean zzalk = false;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzalh = localObject;
  }
  
  private static boolean zza(Class paramClass)
  {
    boolean bool = false;
    Object localObject = "NULL";
    try
    {
      localObject = paramClass.getField((String)localObject);
      String str = "SAFE_PARCELABLE_NULL_STRING";
      localObject = ((Field)localObject).get(null);
      bool = str.equals(localObject);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
    return bool;
  }
  
  protected static boolean zzcF(String paramString)
  {
    Object localObject1 = zzqA();
    boolean bool;
    if (localObject1 == null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      try
      {
        localObject1 = ((ClassLoader)localObject1).loadClass(paramString);
        bool = zza((Class)localObject1);
      }
      catch (Exception localException)
      {
        bool = false;
        Object localObject2 = null;
      }
    }
  }
  
  protected static ClassLoader zzqA()
  {
    synchronized (zzalh)
    {
      ClassLoader localClassLoader = zzali;
      return localClassLoader;
    }
  }
  
  protected static Integer zzqB()
  {
    synchronized (zzalh)
    {
      Integer localInteger = zzalj;
      return localInteger;
    }
  }
  
  protected boolean zzqC()
  {
    return this.zzalk;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\DowngradeableSafeParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */