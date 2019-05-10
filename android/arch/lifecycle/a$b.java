package android.arch.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class a$b
{
  final int a;
  final Method b;
  
  a$b(int paramInt, Method paramMethod)
  {
    this.a = paramInt;
    this.b = paramMethod;
    this.b.setAccessible(true);
  }
  
  void a(e parame, c.a parama, Object paramObject)
  {
    for (;;)
    {
      try
      {
        int i = this.a;
        switch (i)
        {
        default: 
          return;
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        Method localMethod1;
        localObject2 = new java/lang/RuntimeException;
        Object localObject1 = localInvocationTargetException.getCause();
        ((RuntimeException)localObject2).<init>("Failed to call observer method", (Throwable)localObject1);
        throw ((Throwable)localObject2);
        localObject1 = this.b;
        j = 1;
        localObject2 = new Object[j];
        k = 0;
        localObject2[0] = parame;
        ((Method)localObject1).invoke(paramObject, (Object[])localObject2);
        continue;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject2 = new java/lang/RuntimeException;
        ((RuntimeException)localObject2).<init>(localIllegalAccessException);
        throw ((Throwable)localObject2);
      }
      localMethod1 = this.b;
      int j = 0;
      Object localObject2 = null;
      localObject2 = new Object[0];
      localMethod1.invoke(paramObject, (Object[])localObject2);
      continue;
      Method localMethod2 = this.b;
      j = 2;
      localObject2 = new Object[j];
      int k = 0;
      localObject2[0] = parame;
      k = 1;
      localObject2[k] = parama;
      localMethod2.invoke(paramObject, (Object[])localObject2);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      Object localObject1;
      Object localObject2;
      if (paramObject != null)
      {
        localObject1 = getClass();
        localObject2 = paramObject.getClass();
        if (localObject1 == localObject2) {}
      }
      else
      {
        bool1 = false;
        continue;
      }
      paramObject = (b)paramObject;
      int i = this.a;
      int j = ((b)paramObject).a;
      if (i == j)
      {
        localObject1 = this.b.getName();
        localObject2 = ((b)paramObject).b.getName();
        boolean bool2 = ((String)localObject1).equals(localObject2);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.a * 31;
    int j = this.b.getName().hashCode();
    return i + j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\a$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */