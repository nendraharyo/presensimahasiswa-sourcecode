package b.a.a.a.b.f;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class a
{
  public static Object a(Object paramObject)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    if (paramObject == null) {}
    Object localObject4;
    for (;;)
    {
      return localObject1;
      bool1 = paramObject instanceof Cloneable;
      if (bool1)
      {
        localObject4 = paramObject.getClass();
        String str = "clone";
        bool1 = false;
        localObject1 = null;
        try
        {
          localObject1 = (Class[])null;
          localObject4 = ((Class)localObject4).getMethod(str, null);
          bool1 = false;
          localObject1 = null;
        }
        catch (NoSuchMethodException localInvocationTargetException)
        {
          try
          {
            localObject1 = (Object[])null;
            localObject1 = ((Method)localObject4).invoke(paramObject, null);
          }
          catch (InvocationTargetException localInvocationTargetException)
          {
            Object localObject2 = localInvocationTargetException.getCause();
            boolean bool2 = localObject2 instanceof CloneNotSupportedException;
            if (!bool2) {
              break label101;
            }
            throw ((CloneNotSupportedException)localObject2);
            localObject4 = new java/lang/Error;
            ((Error)localObject4).<init>("Unexpected exception", (Throwable)localObject2);
            throw ((Throwable)localObject4);
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            localObject4 = new java/lang/IllegalAccessError;
            localObject3 = localIllegalAccessException.getMessage();
            ((IllegalAccessError)localObject4).<init>((String)localObject3);
            throw ((Throwable)localObject4);
          }
          localNoSuchMethodException = localNoSuchMethodException;
          localObject4 = new java/lang/NoSuchMethodError;
          localObject2 = localNoSuchMethodException.getMessage();
          ((NoSuchMethodError)localObject4).<init>((String)localObject2);
          throw ((Throwable)localObject4);
        }
      }
    }
    label101:
    Object localObject3 = new java/lang/CloneNotSupportedException;
    ((CloneNotSupportedException)localObject3).<init>();
    throw ((Throwable)localObject3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\f\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */