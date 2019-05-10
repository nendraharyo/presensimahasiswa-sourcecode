package android.support.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ap
  extends ao
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
      str = "setTransitionAlpha";
      i = 1;
    }
    try
    {
      localObject2 = new Class[i];
      Class localClass = Float.TYPE;
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
        str = "ViewUtilsApi19";
        Object localObject2 = "Failed to retrieve setTransitionAlpha method";
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
    if (!bool2)
    {
      localObject1 = View.class;
      str = "getTransitionAlpha";
      localObject2 = null;
    }
    try
    {
      localObject2 = new Class[0];
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
        str = "ViewUtilsApi19";
        localObject2 = "Failed to retrieve getTransitionAlpha method";
        Log.i(str, (String)localObject2, localNoSuchMethodException);
      }
    }
    d = bool1;
  }
  
  public void a(View paramView, float paramFloat)
  {
    a();
    Method localMethod = a;
    if (localMethod != null) {}
    try
    {
      localMethod = a;
      int i = 1;
      localObject = new Object[i];
      Float localFloat = Float.valueOf(paramFloat);
      localObject[0] = localFloat;
      localMethod.invoke(paramView, (Object[])localObject);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        Object localObject = new java/lang/RuntimeException;
        Throwable localThrowable = localInvocationTargetException.getCause();
        ((RuntimeException)localObject).<init>(localThrowable);
        throw ((Throwable)localObject);
        paramView.setAlpha(paramFloat);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
  }
  
  public float c(View paramView)
  {
    b();
    Object localObject1 = c;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = c;
        localObject2 = null;
        localObject2 = new Object[0];
        localObject1 = ((Method)localObject1).invoke(paramView, (Object[])localObject2);
        localObject1 = (Float)localObject1;
        f = ((Float)localObject1).floatValue();
        return f;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        Object localObject2 = new java/lang/RuntimeException;
        Throwable localThrowable = localInvocationTargetException.getCause();
        ((RuntimeException)localObject2).<init>(localThrowable);
        throw ((Throwable)localObject2);
      }
      catch (IllegalAccessException localIllegalAccessException) {}
      float f = super.c(paramView);
    }
  }
  
  public void d(View paramView) {}
  
  public void e(View paramView) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\ap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */