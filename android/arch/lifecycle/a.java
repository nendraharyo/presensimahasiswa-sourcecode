package android.arch.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class a
{
  static a a;
  private final Map b;
  private final Map c;
  
  static
  {
    a locala = new android/arch/lifecycle/a;
    locala.<init>();
    a = locala;
  }
  
  a()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.b = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.c = localHashMap;
  }
  
  private a.a a(Class paramClass, Method[] paramArrayOfMethod)
  {
    int i = 2;
    float f1 = 2.8E-45F;
    int j = 1;
    float f2 = Float.MIN_VALUE;
    Object localObject1 = paramClass.getSuperclass();
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    if (localObject1 != null)
    {
      localObject1 = b((Class)localObject1);
      if (localObject1 != null)
      {
        localObject1 = ((a.a)localObject1).b;
        localHashMap.putAll((Map)localObject1);
      }
    }
    Class[] arrayOfClass = paramClass.getInterfaces();
    int k = arrayOfClass.length;
    Object localObject3;
    int n;
    for (int m = 0; m < k; m = n)
    {
      localObject1 = arrayOfClass[m];
      localObject1 = b((Class)localObject1).b.entrySet();
      localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject2).next();
        localObject3 = (a.b)((Map.Entry)localObject1).getKey();
        localObject1 = (c.a)((Map.Entry)localObject1).getValue();
        a(localHashMap, (a.b)localObject3, (c.a)localObject1, paramClass);
      }
      n = m + 1;
    }
    if (paramArrayOfMethod != null) {}
    Method localMethod;
    float f4;
    for (;;)
    {
      int i1 = paramArrayOfMethod.length;
      m = 0;
      i2 = 0;
      localObject3 = null;
      for (f3 = 0.0F;; f3 = f4)
      {
        if (m >= i1) {
          break label498;
        }
        localMethod = paramArrayOfMethod[m];
        localObject1 = (l)localMethod.getAnnotation(l.class);
        if (localObject1 != null) {
          break;
        }
        n = i2;
        f4 = f3;
        m += 1;
        i2 = n;
      }
      paramArrayOfMethod = c(paramClass);
    }
    Object localObject2 = localMethod.getParameterTypes();
    int i2 = localObject2.length;
    Class localClass;
    int i3;
    if (i2 > 0)
    {
      localObject3 = localObject2[0];
      localClass = e.class;
      i3 = ((Class)localObject3).isAssignableFrom(localClass);
      if (i3 == 0)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("invalid parameter type. Must be one and instanceof LifecycleOwner");
        throw ((Throwable)localObject1);
      }
      i3 = j;
    }
    for (float f3 = f2;; f3 = 0.0F)
    {
      localObject1 = ((l)localObject1).a();
      int i5 = localObject2.length;
      if (i5 > j)
      {
        localObject3 = localObject2[j];
        localClass = c.a.class;
        i3 = ((Class)localObject3).isAssignableFrom(localClass);
        if (i3 == 0)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject1).<init>("invalid parameter type. second arg must be an event");
          throw ((Throwable)localObject1);
        }
        localObject3 = c.a.ON_ANY;
        if (localObject1 != localObject3)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject1).<init>("Second arg is supported only for ON_ANY value");
          throw ((Throwable)localObject1);
        }
        i3 = i;
        f3 = f1;
      }
      int i6 = localObject2.length;
      if (i6 > i)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("cannot have more than 2 params");
        throw ((Throwable)localObject1);
      }
      localObject2 = new android/arch/lifecycle/a$b;
      ((a.b)localObject2).<init>(i3, localMethod);
      a(localHashMap, (a.b)localObject2, (c.a)localObject1, paramClass);
      n = j;
      f4 = f2;
      break;
      label498:
      localObject1 = new android/arch/lifecycle/a$a;
      ((a.a)localObject1).<init>(localHashMap);
      this.b.put(paramClass, localObject1);
      Map localMap = this.c;
      localObject3 = Boolean.valueOf(i3);
      localMap.put(paramClass, localObject3);
      return (a.a)localObject1;
      int i4 = 0;
      localObject3 = null;
    }
  }
  
  private void a(Map paramMap, a.b paramb, c.a parama, Class paramClass)
  {
    Object localObject1 = (c.a)paramMap.get(paramb);
    if ((localObject1 != null) && (parama != localObject1))
    {
      Object localObject2 = paramb.b;
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Method ");
      localObject2 = ((Method)localObject2).getName();
      localObject2 = ((StringBuilder)localObject3).append((String)localObject2).append(" in ");
      localObject3 = paramClass.getName();
      localObject1 = (String)localObject3 + " already declared with different @OnLifecycleEvent value: previous" + " value " + localObject1 + ", new value " + parama;
      localIllegalArgumentException.<init>((String)localObject1);
      throw localIllegalArgumentException;
    }
    if (localObject1 == null) {
      paramMap.put(paramb, parama);
    }
  }
  
  private Method[] c(Class paramClass)
  {
    try
    {
      return paramClass.getDeclaredMethods();
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", localNoClassDefFoundError);
      throw localIllegalArgumentException;
    }
  }
  
  boolean a(Class paramClass)
  {
    Object localObject = this.c;
    boolean bool = ((Map)localObject).containsKey(paramClass);
    if (bool)
    {
      localObject = (Boolean)this.c.get(paramClass);
      bool = ((Boolean)localObject).booleanValue();
    }
    for (;;)
    {
      return bool;
      Method[] arrayOfMethod = c(paramClass);
      int j = arrayOfMethod.length;
      int k = 0;
      Boolean localBoolean = null;
      for (;;)
      {
        if (k >= j) {
          break label111;
        }
        localObject = arrayOfMethod[k];
        Class localClass = l.class;
        localObject = (l)((Method)localObject).getAnnotation(localClass);
        if (localObject != null)
        {
          a(paramClass, arrayOfMethod);
          bool = true;
          break;
        }
        i = k + 1;
        k = i;
      }
      label111:
      localObject = this.c;
      localBoolean = Boolean.valueOf(false);
      ((Map)localObject).put(paramClass, localBoolean);
      int i = 0;
      localObject = null;
    }
  }
  
  a.a b(Class paramClass)
  {
    a.a locala = (a.a)this.b.get(paramClass);
    if (locala != null) {}
    for (;;)
    {
      return locala;
      locala = a(paramClass, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */