package org.apache.http.util;

import java.lang.reflect.Method;

public final class ExceptionUtils
{
  private static final Method INIT_CAUSE_METHOD = ;
  
  private static Method getInitCauseMethod()
  {
    i = 1;
    try
    {
      localObject1 = new Class[i];
      Class localClass = null;
      Object localObject3 = Throwable.class;
      localObject1[0] = localObject3;
      localClass = Throwable.class;
      localObject3 = "initCause";
      localObject1 = localClass.getMethod((String)localObject3, (Class[])localObject1);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        Object localObject1;
        i = 0;
        Object localObject2 = null;
      }
    }
    return (Method)localObject1;
  }
  
  public static void initCause(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    Method localMethod = INIT_CAUSE_METHOD;
    if (localMethod != null) {}
    try
    {
      localMethod = INIT_CAUSE_METHOD;
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramThrowable2;
      localMethod.invoke(paramThrowable1, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\htt\\util\ExceptionUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */