package android.support.v4.app;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class g$a
{
  private static Method a;
  private static boolean b;
  
  public static IBinder a(Bundle paramBundle, String paramString)
  {
    boolean bool1 = true;
    bool2 = b;
    int i;
    if (!bool2)
    {
      localObject1 = Bundle.class;
      localObject3 = "getIBinder";
      i = 1;
    }
    try
    {
      localObject4 = new Class[i];
      Class localClass = String.class;
      localObject4[0] = localClass;
      localObject1 = ((Class)localObject1).getMethod((String)localObject3, (Class[])localObject4);
      a = (Method)localObject1;
      localObject1 = a;
      bool3 = true;
      ((Method)localObject1).setAccessible(bool3);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        boolean bool3;
        localObject3 = "BundleCompatBaseImpl";
        localObject4 = "Failed to retrieve getIBinder method";
        Log.i((String)localObject3, (String)localObject4, localNoSuchMethodException);
      }
    }
    b = bool1;
    Object localObject1 = a;
    if (localObject1 != null) {}
    try
    {
      localObject1 = a;
      bool3 = true;
      localObject3 = new Object[bool3];
      i = 0;
      localObject4 = null;
      localObject3[0] = paramString;
      localObject1 = ((Method)localObject1).invoke(paramBundle, (Object[])localObject3);
      localObject1 = (IBinder)localObject1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localObject3 = "BundleCompatBaseImpl";
        localObject4 = "Failed to invoke getIBinder via reflection";
        Log.i((String)localObject3, (String)localObject4, localIllegalAccessException);
        a = null;
        bool2 = false;
        Object localObject2 = null;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
    return (IBinder)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\g$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */