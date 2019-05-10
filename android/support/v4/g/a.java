package android.support.v4.g;

import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class a
{
  private static Method a;
  private static Method b;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject1;
    if (i >= j) {
      localObject1 = "libcore.icu.ICU";
    }
    for (;;)
    {
      Object localObject3;
      int k;
      Class[] arrayOfClass;
      Class localClass;
      try
      {
        localObject1 = Class.forName((String)localObject1);
        localObject3 = "addLikelySubtags";
        k = 1;
        arrayOfClass = new Class[k];
        localClass = Locale.class;
        arrayOfClass[0] = localClass;
        localObject1 = ((Class)localObject1).getMethod((String)localObject3, arrayOfClass);
        b = (Method)localObject1;
        return;
      }
      catch (Exception localException1)
      {
        localObject3 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject3).<init>(localException1);
        throw ((Throwable)localObject3);
      }
      Object localObject2 = "libcore.icu.ICU";
      try
      {
        localObject2 = Class.forName((String)localObject2);
        if (localObject2 != null)
        {
          localObject3 = "getScript";
          k = 1;
          arrayOfClass = new Class[k];
          localClass = String.class;
          arrayOfClass[0] = localClass;
          localObject3 = ((Class)localObject2).getMethod((String)localObject3, arrayOfClass);
          a = (Method)localObject3;
          localObject3 = "addLikelySubtags";
          k = 1;
          arrayOfClass = new Class[k];
          localClass = String.class;
          arrayOfClass[0] = localClass;
          localObject2 = ((Class)localObject2).getMethod((String)localObject3, arrayOfClass);
          b = (Method)localObject2;
        }
      }
      catch (Exception localException2)
      {
        a = null;
        b = null;
        localObject3 = "ICUCompat";
        Log.w((String)localObject3, localException2);
      }
    }
  }
  
  private static String a(String paramString)
  {
    try
    {
      localObject1 = a;
      if (localObject1 == null) {
        break label49;
      }
      i = 1;
      localObject1 = new Object[i];
      localObject3 = null;
      localObject1[0] = paramString;
      localObject3 = a;
      localObject1 = ((Method)localObject3).invoke(null, (Object[])localObject1);
      localObject1 = (String)localObject1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Object localObject1;
        localObject3 = "ICUCompat";
        Log.w((String)localObject3, localIllegalAccessException);
        int i = 0;
        Object localObject2 = null;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        label49:
        Object localObject3 = "ICUCompat";
        Log.w((String)localObject3, localInvocationTargetException);
      }
    }
    return (String)localObject1;
  }
  
  public static String a(Locale paramLocale)
  {
    int i = 0;
    Object localObject1 = null;
    int j = Build.VERSION.SDK_INT;
    int k = 21;
    if (j >= k) {
      i = 1;
    }
    for (;;)
    {
      try
      {
        localObject1 = new Object[i];
        j = 0;
        localObject2 = null;
        localObject1[0] = paramLocale;
        localObject2 = b;
        k = 0;
        localObject1 = ((Method)localObject2).invoke(null, (Object[])localObject1);
        localObject1 = (Locale)localObject1;
        localObject1 = ((Locale)localObject1).getScript();
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localObject2 = "ICUCompat";
        Log.w((String)localObject2, localInvocationTargetException);
        String str1 = paramLocale.getScript();
        continue;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject2 = "ICUCompat";
        Log.w((String)localObject2, localIllegalAccessException);
        continue;
      }
      return (String)localObject1;
      Object localObject2 = b(paramLocale);
      if (localObject2 != null) {
        String str2 = a((String)localObject2);
      }
    }
  }
  
  private static String b(Locale paramLocale)
  {
    str1 = paramLocale.toString();
    try
    {
      localObject1 = b;
      if (localObject1 == null) {
        break label59;
      }
      int i = 1;
      localObject1 = new Object[i];
      localObject2 = null;
      localObject1[0] = str1;
      localObject2 = b;
      localObject1 = ((Method)localObject2).invoke(null, (Object[])localObject1);
      localObject1 = (String)localObject1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Object localObject1;
        localObject2 = "ICUCompat";
        Log.w((String)localObject2, localIllegalAccessException);
        String str2 = str1;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        Object localObject2 = "ICUCompat";
        Log.w((String)localObject2, localInvocationTargetException);
      }
    }
    return (String)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\g\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */