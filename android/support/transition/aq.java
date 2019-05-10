package android.support.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class aq
  extends ap
{
  private static Method a;
  private static boolean b;
  private static Method c;
  private static boolean d;
  
  private void a()
  {
    boolean bool1 = true;
    boolean bool2 = b;
    Object localObject1;
    int i;
    if (!bool2)
    {
      localObject1 = View.class;
      str = "transformMatrixToGlobal";
      i = 1;
    }
    try
    {
      localObject2 = new Class[i];
      Class localClass = Matrix.class;
      localObject2[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod(str, (Class[])localObject2);
      a = (Method)localObject1;
      localObject1 = a;
      boolean bool3 = true;
      ((Method)localObject1).setAccessible(bool3);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        str = "ViewUtilsApi21";
        Object localObject2 = "Failed to retrieve transformMatrixToGlobal method";
        Log.i(str, (String)localObject2, localNoSuchMethodException);
      }
    }
    b = bool1;
  }
  
  private void b()
  {
    boolean bool1 = true;
    boolean bool2 = d;
    Object localObject1;
    int i;
    if (!bool2)
    {
      localObject1 = View.class;
      str = "transformMatrixToLocal";
      i = 1;
    }
    try
    {
      localObject2 = new Class[i];
      Class localClass = Matrix.class;
      localObject2[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod(str, (Class[])localObject2);
      c = (Method)localObject1;
      localObject1 = c;
      boolean bool3 = true;
      ((Method)localObject1).setAccessible(bool3);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        str = "ViewUtilsApi21";
        Object localObject2 = "Failed to retrieve transformMatrixToLocal method";
        Log.i(str, (String)localObject2, localNoSuchMethodException);
      }
    }
    d = bool1;
  }
  
  public void a(View paramView, Matrix paramMatrix)
  {
    a();
    Method localMethod = a;
    if (localMethod != null) {}
    try
    {
      localMethod = a;
      int i = 1;
      localObject = new Object[i];
      localObject[0] = paramMatrix;
      localMethod.invoke(paramView, (Object[])localObject);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Object localObject = new java/lang/RuntimeException;
      Throwable localThrowable = localInvocationTargetException.getCause();
      ((RuntimeException)localObject).<init>(localThrowable);
      throw ((Throwable)localObject);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
  }
  
  public void b(View paramView, Matrix paramMatrix)
  {
    b();
    Method localMethod = c;
    if (localMethod != null) {}
    try
    {
      localMethod = c;
      int i = 1;
      localObject = new Object[i];
      localObject[0] = paramMatrix;
      localMethod.invoke(paramView, (Object[])localObject);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Object localObject = new java/lang/RuntimeException;
      Throwable localThrowable = localInvocationTargetException.getCause();
      ((RuntimeException)localObject).<init>(localThrowable);
      throw ((Throwable)localObject);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\aq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */