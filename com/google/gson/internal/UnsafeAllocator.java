package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class UnsafeAllocator
{
  public static UnsafeAllocator create()
  {
    Object localObject1 = "sun.misc.Unsafe";
    try
    {
      localObject1 = Class.forName((String)localObject1);
      localObject4 = "theUnsafe";
      localObject4 = ((Class)localObject1).getDeclaredField((String)localObject4);
      bool1 = true;
      ((Field)localObject4).setAccessible(bool1);
      bool1 = false;
      localObject5 = null;
      localObject4 = ((Field)localObject4).get(null);
      localObject5 = "allocateInstance";
      j = 1;
      arrayOfClass = new Class[j];
      k = 0;
      localClass1 = null;
      localClass2 = Class.class;
      arrayOfClass[0] = localClass2;
      localObject5 = ((Class)localObject1).getMethod((String)localObject5, arrayOfClass);
      localObject1 = new com/google/gson/internal/UnsafeAllocator$1;
      ((UnsafeAllocator.1)localObject1).<init>((Method)localObject5, localObject4);
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        Object localObject5;
        int j;
        Class[] arrayOfClass;
        int k;
        Class localClass1;
        Class localClass2;
        Object localObject2 = ObjectStreamClass.class;
        Object localObject4 = "getConstructorId";
        boolean bool1 = true;
        try
        {
          localObject5 = new Class[bool1];
          j = 0;
          arrayOfClass = null;
          localClass1 = Class.class;
          localObject5[0] = localClass1;
          localObject2 = ((Class)localObject2).getDeclaredMethod((String)localObject4, (Class[])localObject5);
          boolean bool2 = true;
          ((Method)localObject2).setAccessible(bool2);
          bool2 = false;
          localObject4 = null;
          bool1 = true;
          localObject5 = new Object[bool1];
          j = 0;
          arrayOfClass = null;
          localClass1 = Object.class;
          localObject5[0] = localClass1;
          localObject2 = ((Method)localObject2).invoke(null, (Object[])localObject5);
          localObject2 = (Integer)localObject2;
          int m = ((Integer)localObject2).intValue();
          localObject2 = ObjectStreamClass.class;
          localObject5 = "newInstance";
          j = 2;
          arrayOfClass = new Class[j];
          k = 0;
          localClass1 = null;
          localClass2 = Class.class;
          arrayOfClass[0] = localClass2;
          k = 1;
          localClass2 = Integer.TYPE;
          arrayOfClass[k] = localClass2;
          localObject5 = ((Class)localObject2).getDeclaredMethod((String)localObject5, arrayOfClass);
          bool3 = true;
          ((Method)localObject5).setAccessible(bool3);
          localObject2 = new com/google/gson/internal/UnsafeAllocator$2;
          ((UnsafeAllocator.2)localObject2).<init>((Method)localObject5, m);
        }
        catch (Exception localException2)
        {
          boolean bool3;
          Object localObject3 = ObjectInputStream.class;
          localObject4 = "newInstance";
          int i = 2;
          try
          {
            localObject5 = new Class[i];
            j = 0;
            arrayOfClass = null;
            localClass1 = Class.class;
            localObject5[0] = localClass1;
            j = 1;
            localClass1 = Class.class;
            localObject5[j] = localClass1;
            localObject4 = ((Class)localObject3).getDeclaredMethod((String)localObject4, (Class[])localObject5);
            bool3 = true;
            ((Method)localObject4).setAccessible(bool3);
            localObject3 = new com/google/gson/internal/UnsafeAllocator$3;
            ((UnsafeAllocator.3)localObject3).<init>((Method)localObject4);
          }
          catch (Exception localException3)
          {
            UnsafeAllocator.4 local4 = new com/google/gson/internal/UnsafeAllocator$4;
            local4.<init>();
          }
        }
      }
    }
    return (UnsafeAllocator)localObject1;
  }
  
  public abstract Object newInstance(Class paramClass);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\UnsafeAllocator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */