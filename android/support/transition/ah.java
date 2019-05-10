package android.support.transition;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ah
  extends ag
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
      localObject1 = ViewGroup.class;
      str = "suppressLayout";
      i = 1;
    }
    try
    {
      localObject2 = new Class[i];
      Class localClass = Boolean.TYPE;
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
        str = "ViewUtilsApi18";
        Object localObject2 = "Failed to retrieve suppressLayout method";
        Log.i(str, (String)localObject2, localNoSuchMethodException);
      }
    }
    b = bool1;
  }
  
  public ae a(ViewGroup paramViewGroup)
  {
    ad localad = new android/support/transition/ad;
    localad.<init>(paramViewGroup);
    return localad;
  }
  
  public void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a();
    Method localMethod = a;
    if (localMethod != null) {}
    try
    {
      localMethod = a;
      int i = 1;
      localObject = new Object[i];
      str = null;
      Boolean localBoolean = Boolean.valueOf(paramBoolean);
      localObject[0] = localBoolean;
      localMethod.invoke(paramViewGroup, (Object[])localObject);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localObject = "ViewUtilsApi18";
        str = "Failed to invoke suppressLayout method";
        Log.i((String)localObject, str, localIllegalAccessException);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        Object localObject = "ViewUtilsApi18";
        String str = "Error invoking suppressLayout method";
        Log.i((String)localObject, str, localInvocationTargetException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\ah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */