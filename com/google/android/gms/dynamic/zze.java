package com.google.android.gms.dynamic;

import java.lang.reflect.Field;

public final class zze
  extends zzd.zza
{
  private final Object mWrappedObject;
  
  private zze(Object paramObject)
  {
    this.mWrappedObject = paramObject;
  }
  
  public static zzd zzC(Object paramObject)
  {
    zze localzze = new com/google/android/gms/dynamic/zze;
    localzze.<init>(paramObject);
    return localzze;
  }
  
  public static Object zzp(zzd paramzzd)
  {
    int i = 1;
    boolean bool1 = paramzzd instanceof zze;
    Object localObject1;
    if (bool1)
    {
      paramzzd = (zze)paramzzd;
      localObject1 = paramzzd.mWrappedObject;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = paramzzd.asBinder();
      Object localObject2 = localObject1.getClass().getDeclaredFields();
      int j = localObject2.length;
      if (j != i) {
        break label147;
      }
      localObject2 = localObject2[0];
      boolean bool2 = ((Field)localObject2).isAccessible();
      if (!bool2)
      {
        ((Field)localObject2).setAccessible(i);
        try
        {
          localObject1 = ((Field)localObject2).get(localObject1);
        }
        catch (NullPointerException localNullPointerException)
        {
          localObject2 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject2).<init>("Binder object is null.", localNullPointerException);
          throw ((Throwable)localObject2);
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          localObject2 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject2).<init>("remoteBinder is the wrong class.", localIllegalArgumentException1);
          throw ((Throwable)localObject2);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          localObject2 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject2).<init>("Could not access the field in remoteBinder.", localIllegalAccessException);
          throw ((Throwable)localObject2);
        }
      }
    }
    IllegalArgumentException localIllegalArgumentException2 = new java/lang/IllegalArgumentException;
    localIllegalArgumentException2.<init>("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
    throw localIllegalArgumentException2;
    label147:
    localIllegalArgumentException2 = new java/lang/IllegalArgumentException;
    localIllegalArgumentException2.<init>("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    throw localIllegalArgumentException2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\dynamic\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */