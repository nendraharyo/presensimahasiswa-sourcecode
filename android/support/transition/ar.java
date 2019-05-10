package android.support.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ar
  extends aq
{
  private static Method a;
  private static boolean b;
  
  private void a()
  {
    boolean bool1 = true;
    boolean bool2 = b;
    Object localObject1;
    int i;
    if (!bool2)
    {
      localObject1 = View.class;
      str = "setLeftTopRightBottom";
      i = 4;
    }
    try
    {
      localObject2 = new Class[i];
      int j = 0;
      Class localClass = Integer.TYPE;
      localObject2[0] = localClass;
      j = 1;
      localClass = Integer.TYPE;
      localObject2[j] = localClass;
      j = 2;
      localClass = Integer.TYPE;
      localObject2[j] = localClass;
      j = 3;
      localClass = Integer.TYPE;
      localObject2[j] = localClass;
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
        str = "ViewUtilsApi22";
        Object localObject2 = "Failed to retrieve setLeftTopRightBottom method";
        Log.i(str, (String)localObject2, localNoSuchMethodException);
      }
    }
    b = bool1;
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a();
    Method localMethod = a;
    if (localMethod != null) {}
    try
    {
      localMethod = a;
      int i = 4;
      localObject = new Object[i];
      int j = 0;
      Integer localInteger = Integer.valueOf(paramInt1);
      localObject[0] = localInteger;
      j = 1;
      localInteger = Integer.valueOf(paramInt2);
      localObject[j] = localInteger;
      j = 2;
      localInteger = Integer.valueOf(paramInt3);
      localObject[j] = localInteger;
      j = 3;
      localInteger = Integer.valueOf(paramInt4);
      localObject[j] = localInteger;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\ar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */