package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h
{
  private static Map a;
  private static Map b;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    a = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    b = localHashMap;
  }
  
  static GenericLifecycleObserver a(Object paramObject)
  {
    int i = 0;
    b localb = null;
    boolean bool = paramObject instanceof FullLifecycleObserver;
    Object localObject;
    if (bool)
    {
      localObject = new android/arch/lifecycle/FullLifecycleObserverAdapter;
      paramObject = (FullLifecycleObserver)paramObject;
      ((FullLifecycleObserverAdapter)localObject).<init>((FullLifecycleObserver)paramObject);
      paramObject = localObject;
    }
    for (;;)
    {
      return (GenericLifecycleObserver)paramObject;
      bool = paramObject instanceof GenericLifecycleObserver;
      if (bool)
      {
        paramObject = (GenericLifecycleObserver)paramObject;
      }
      else
      {
        localObject = paramObject.getClass();
        int j = b((Class)localObject);
        int k = 2;
        if (j == k)
        {
          Map localMap = b;
          localObject = (List)localMap.get(localObject);
          j = ((List)localObject).size();
          k = 1;
          if (j == k)
          {
            localObject = a((Constructor)((List)localObject).get(0), paramObject);
            paramObject = new android/arch/lifecycle/SingleGeneratedAdapterObserver;
            ((SingleGeneratedAdapterObserver)paramObject).<init>((b)localObject);
          }
          else
          {
            b[] arrayOfb = new b[((List)localObject).size()];
            j = 0;
            localMap = null;
            for (;;)
            {
              i = ((List)localObject).size();
              if (j >= i) {
                break;
              }
              localb = a((Constructor)((List)localObject).get(j), paramObject);
              arrayOfb[j] = localb;
              i = j + 1;
              j = i;
            }
            paramObject = new android/arch/lifecycle/CompositeGeneratedAdaptersObserver;
            ((CompositeGeneratedAdaptersObserver)paramObject).<init>(arrayOfb);
          }
        }
        else
        {
          localObject = new android/arch/lifecycle/ReflectiveGenericLifecycleObserver;
          ((ReflectiveGenericLifecycleObserver)localObject).<init>(paramObject);
          paramObject = localObject;
        }
      }
    }
  }
  
  private static b a(Constructor paramConstructor, Object paramObject)
  {
    int i = 1;
    try
    {
      Object localObject = new Object[i];
      localRuntimeException = null;
      localObject[0] = paramObject;
      localObject = paramConstructor.newInstance((Object[])localObject);
      return (b)localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localIllegalAccessException);
      throw localRuntimeException;
    }
    catch (InstantiationException localInstantiationException)
    {
      localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localInstantiationException);
      throw localRuntimeException;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localInvocationTargetException);
      throw localRuntimeException;
    }
  }
  
  public static String a(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = paramString.replace(".", "_");
    return str + "_LifecycleAdapter";
  }
  
  private static Constructor a(Class paramClass)
  {
    for (;;)
    {
      try
      {
        localObject1 = paramClass.getPackage();
        localObject2 = paramClass.getCanonicalName();
        if (localObject1 == null) {
          continue;
        }
        localObject1 = ((Package)localObject1).getName();
        boolean bool1 = ((String)localObject1).isEmpty();
        if (!bool1) {
          continue;
        }
        localObject2 = a((String)localObject2);
        bool1 = ((String)localObject1).isEmpty();
        if (!bool1) {
          continue;
        }
        localObject2 = Class.forName((String)localObject2);
        boolean bool2 = true;
        localObject1 = new Class[bool2];
        bool1 = false;
        localObject4 = null;
        localObject1[0] = paramClass;
        localObject2 = ((Class)localObject2).getDeclaredConstructor((Class[])localObject1);
        bool2 = ((Constructor)localObject2).isAccessible();
        if (!bool2)
        {
          bool2 = true;
          ((Constructor)localObject2).setAccessible(bool2);
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Object localObject2;
        Object localObject4;
        int i;
        Object localObject3 = null;
        continue;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Object localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>(localNoSuchMethodException);
        throw ((Throwable)localObject1);
      }
      return (Constructor)localObject2;
      localObject1 = "";
      continue;
      i = ((String)localObject1).length() + 1;
      localObject2 = ((String)localObject2).substring(i);
      continue;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
      localObject4 = ".";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject2 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject2).toString();
    }
  }
  
  private static int b(Class paramClass)
  {
    Object localObject = a;
    boolean bool = ((Map)localObject).containsKey(paramClass);
    int i;
    if (bool)
    {
      localObject = (Integer)a.get(paramClass);
      i = ((Integer)localObject).intValue();
    }
    for (;;)
    {
      return i;
      i = c(paramClass);
      Map localMap = a;
      Integer localInteger = Integer.valueOf(i);
      localMap.put(paramClass, localInteger);
    }
  }
  
  private static int c(Class paramClass)
  {
    int i = 2;
    int j = 1;
    Object localObject1 = paramClass.getCanonicalName();
    int k;
    if (localObject1 == null) {
      k = j;
    }
    int m;
    Class localClass2;
    for (;;)
    {
      return k;
      localObject1 = a(paramClass);
      if (localObject1 != null)
      {
        localObject2 = b;
        localObject1 = Collections.singletonList(localObject1);
        ((Map)localObject2).put(paramClass, localObject1);
        k = i;
      }
      else
      {
        localObject1 = a.a;
        boolean bool1 = ((a)localObject1).a(paramClass);
        if (bool1)
        {
          bool1 = j;
        }
        else
        {
          Class localClass1 = paramClass.getSuperclass();
          bool1 = false;
          localObject1 = null;
          boolean bool2 = d(localClass1);
          if (bool2)
          {
            m = b(localClass1);
            if (m == j)
            {
              m = j;
            }
            else
            {
              localObject2 = new java/util/ArrayList;
              localObject1 = (Collection)b.get(localClass1);
              ((ArrayList)localObject2).<init>((Collection)localObject1);
              localObject1 = localObject2;
            }
          }
          else
          {
            Class[] arrayOfClass = paramClass.getInterfaces();
            int i1 = arrayOfClass.length;
            bool2 = false;
            localObject2 = null;
            int i2 = 0;
            localClass1 = null;
            for (;;)
            {
              if (i2 >= i1) {
                break label271;
              }
              localClass2 = arrayOfClass[i2];
              bool2 = d(localClass2);
              if (bool2) {
                break;
              }
              label195:
              n = i2 + 1;
              i2 = n;
            }
            int n = b(localClass2);
            if (n != j) {
              break;
            }
            m = j;
          }
        }
      }
    }
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      localObject1 = (Collection)b.get(localClass2);
      ((List)localObject2).addAll((Collection)localObject1);
      localObject1 = localObject2;
      break label195;
      label271:
      if (localObject1 != null)
      {
        localObject2 = b;
        ((Map)localObject2).put(paramClass, localObject1);
        m = i;
        break;
      }
      m = j;
      break;
    }
  }
  
  private static boolean d(Class paramClass)
  {
    Class localClass;
    boolean bool;
    if (paramClass != null)
    {
      localClass = d.class;
      bool = localClass.isAssignableFrom(paramClass);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localClass = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */