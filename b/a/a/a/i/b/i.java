package b.a.a.a.i.b;

import b.a.a.a.b.c.c;
import b.a.a.a.o.f;
import b.a.a.a.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class i
  implements InvocationHandler
{
  private static final Constructor a;
  private final s b;
  
  static
  {
    Object localObject1 = i.class;
    try
    {
      localObject1 = ((Class)localObject1).getClassLoader();
      int i = 1;
      localObject2 = new Class[i];
      Class localClass = c.class;
      localObject2[0] = localClass;
      localObject1 = Proxy.getProxyClass((ClassLoader)localObject1, (Class[])localObject2);
      i = 1;
      localObject2 = new Class[i];
      localClass = InvocationHandler.class;
      localObject2[0] = localClass;
      localObject1 = ((Class)localObject1).getConstructor((Class[])localObject2);
      a = (Constructor)localObject1;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localNoSuchMethodException);
      throw ((Throwable)localObject2);
    }
  }
  
  i(s params)
  {
    this.b = params;
  }
  
  public static c a(s params)
  {
    try
    {
      Object localObject1 = a;
      int i = 1;
      localObject2 = new Object[i];
      i locali = new b/a/a/a/i/b/i;
      locali.<init>(params);
      localObject2[0] = locali;
      localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
      return (c)localObject1;
    }
    catch (InstantiationException localInstantiationException)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localInstantiationException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localInvocationTargetException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
  }
  
  public void a()
  {
    f.a(this.b.b());
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    Object localObject1 = paramMethod.getName();
    Object localObject2 = "close";
    boolean bool = ((String)localObject1).equals(localObject2);
    if (bool)
    {
      a();
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return localObject1;
      try
      {
        localObject1 = this.b;
        localObject1 = paramMethod.invoke(localObject1, paramArrayOfObject);
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localObject2 = localInvocationTargetException.getCause();
        if (localObject2 != null) {
          throw ((Throwable)localObject2);
        }
        throw localInvocationTargetException;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */