package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

public final class s
{
  private static Method a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 25;
    Object localObject;
    String str2;
    Class[] arrayOfClass;
    if (i == j)
    {
      localObject = ViewConfiguration.class;
      str2 = "getScaledScrollFactor";
      arrayOfClass = null;
    }
    try
    {
      arrayOfClass = new Class[0];
      localObject = ((Class)localObject).getDeclaredMethod(str2, arrayOfClass);
      a = (Method)localObject;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str1 = "ViewConfigCompat";
        str2 = "Could not find method getScaledScrollFactor() on ViewConfiguration";
        Log.i(str1, str2);
      }
    }
  }
  
  public static float a(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 26;
    if (i >= j) {}
    for (float f = paramViewConfiguration.getScaledHorizontalScrollFactor();; f = c(paramViewConfiguration, paramContext)) {
      return f;
    }
  }
  
  public static float b(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 26;
    if (i >= j) {}
    for (float f = paramViewConfiguration.getScaledVerticalScrollFactor();; f = c(paramViewConfiguration, paramContext)) {
      return f;
    }
  }
  
  private static float c(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 25;
    Object localObject1;
    if (i >= j)
    {
      localObject1 = a;
      if (localObject1 == null) {}
    }
    for (;;)
    {
      float f;
      try
      {
        localObject1 = a;
        j = 0;
        localObject3 = null;
        localObject3 = new Object[0];
        localObject1 = ((Method)localObject1).invoke(paramViewConfiguration, (Object[])localObject3);
        localObject1 = (Integer)localObject1;
        i = ((Integer)localObject1).intValue();
        f = i;
        return f;
      }
      catch (Exception localException)
      {
        localObject2 = "ViewConfigCompat";
        localObject3 = "Could not find method getScaledScrollFactor() on ViewConfiguration";
        Log.i((String)localObject2, (String)localObject3);
      }
      Object localObject2 = new android/util/TypedValue;
      ((TypedValue)localObject2).<init>();
      Object localObject3 = paramContext.getTheme();
      int k = 16842829;
      boolean bool2 = true;
      boolean bool1 = ((Resources.Theme)localObject3).resolveAttribute(k, (TypedValue)localObject2, bool2);
      if (bool1)
      {
        localObject3 = paramContext.getResources().getDisplayMetrics();
        f = ((TypedValue)localObject2).getDimension((DisplayMetrics)localObject3);
      }
      else
      {
        i = 0;
        f = 0.0F;
        localObject2 = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */