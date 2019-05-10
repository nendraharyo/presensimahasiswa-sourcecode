package pub.devrel.easypermissions;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class b
{
  public static void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt, Object... paramVarArgs)
  {
    int i = 0;
    Object localObject1 = null;
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    int j = 0;
    Object localObject2 = null;
    int k = paramArrayOfString.length;
    if (j < k)
    {
      str = paramArrayOfString[j];
      m = paramArrayOfInt[j];
      if (m == 0) {
        localArrayList1.add(str);
      }
      for (;;)
      {
        j += 1;
        break;
        localArrayList2.add(str);
      }
    }
    int m = paramVarArgs.length;
    k = 0;
    String str = null;
    while (k < m)
    {
      localObject1 = paramVarArgs[k];
      boolean bool = localArrayList1.isEmpty();
      if (!bool)
      {
        bool = localObject1 instanceof b.a;
        if (bool)
        {
          localObject2 = localObject1;
          localObject2 = (b.a)localObject1;
          ((b.a)localObject2).a(paramInt, localArrayList1);
        }
      }
      bool = localArrayList2.isEmpty();
      if (!bool)
      {
        bool = localObject1 instanceof b.a;
        if (bool)
        {
          localObject2 = localObject1;
          localObject2 = (b.a)localObject1;
          ((b.a)localObject2).b(paramInt, localArrayList2);
        }
      }
      bool = localArrayList1.isEmpty();
      if (!bool)
      {
        bool = localArrayList2.isEmpty();
        if (bool) {
          a(localObject1, paramInt);
        }
      }
      i = k + 1;
      k = i;
    }
  }
  
  private static void a(Object paramObject, int paramInt)
  {
    String str1 = null;
    Object localObject1 = paramObject.getClass();
    int i = a(paramObject);
    Object localObject2;
    if (i != 0)
    {
      localObject1 = ((Class)localObject1).getSuperclass();
      localObject2 = localObject1;
    }
    for (;;)
    {
      Class localClass;
      if (localObject2 != null)
      {
        Method[] arrayOfMethod = ((Class)localObject2).getDeclaredMethods();
        int j = arrayOfMethod.length;
        i = 0;
        Object localObject3 = null;
        Object localObject4;
        while (i < j)
        {
          localObject4 = arrayOfMethod[i];
          localObject1 = a.class;
          boolean bool1 = ((Method)localObject4).isAnnotationPresent((Class)localObject1);
          if (bool1)
          {
            localObject1 = (a)((Method)localObject4).getAnnotation(a.class);
            int k = ((a)localObject1).a();
            if (k == paramInt)
            {
              localObject1 = ((Method)localObject4).getParameterTypes();
              k = localObject1.length;
              if (k > 0)
              {
                localObject1 = new java/lang/RuntimeException;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                localObject3 = ((StringBuilder)localObject3).append("Cannot execute method ");
                str1 = ((Method)localObject4).getName();
                localObject3 = str1 + " because it is non-void method and/or has input parameters.";
                ((RuntimeException)localObject1).<init>((String)localObject3);
                throw ((Throwable)localObject1);
              }
            }
          }
          try
          {
            boolean bool2 = ((Method)localObject4).isAccessible();
            if (!bool2)
            {
              bool2 = true;
              ((Method)localObject4).setAccessible(bool2);
            }
            bool2 = false;
            localObject1 = null;
            localObject1 = new Object[0];
            ((Method)localObject4).invoke(paramObject, (Object[])localObject1);
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            for (;;)
            {
              int m;
              localObject4 = "EasyPermissions";
              str2 = "runDefaultMethod:IllegalAccessException";
              Log.e((String)localObject4, str2, localIllegalAccessException);
            }
          }
          catch (InvocationTargetException localInvocationTargetException)
          {
            for (;;)
            {
              localObject4 = "EasyPermissions";
              String str2 = "runDefaultMethod:InvocationTargetException";
              Log.e((String)localObject4, str2, localInvocationTargetException);
            }
          }
          m = i + 1;
          i = m;
        }
        localClass = ((Class)localObject2).getSuperclass();
        localObject2 = localClass;
      }
      else
      {
        return;
        localObject2 = localClass;
      }
    }
  }
  
  public static boolean a(Context paramContext, String... paramVarArgs)
  {
    boolean bool = true;
    String str1 = null;
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    String str2;
    if (i < j)
    {
      str1 = "EasyPermissions";
      str2 = "hasPermissions: API version < M, returning true by default";
      Log.w(str1, str2);
    }
    label106:
    for (;;)
    {
      return bool;
      IllegalArgumentException localIllegalArgumentException;
      if (paramContext == null)
      {
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("Can't check permissions for null context");
        throw localIllegalArgumentException;
      }
      j = paramVarArgs.length;
      i = 0;
      str2 = null;
      for (;;)
      {
        if (i >= j) {
          break label106;
        }
        String str3 = paramVarArgs[i];
        int k = android.support.v4.a.b.a(paramContext, str3);
        if (k != 0)
        {
          bool = false;
          localIllegalArgumentException = null;
          break;
        }
        i += 1;
      }
    }
  }
  
  private static boolean a(Object paramObject)
  {
    boolean bool1 = false;
    Object localObject = paramObject.getClass().getSimpleName();
    String str = "_";
    boolean bool2 = ((String)localObject).endsWith(str);
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      localObject = "org.androidannotations.api.view.HasViews";
      try
      {
        localObject = Class.forName((String)localObject);
        bool1 = ((Class)localObject).isInstance(paramObject);
      }
      catch (ClassNotFoundException localClassNotFoundException) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\pub\devrel\easypermissions\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */