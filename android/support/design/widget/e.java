package android.support.design.widget;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.util.Log;
import java.lang.reflect.Method;

class e
{
  private static Method a;
  private static boolean b;
  
  static boolean a(DrawableContainer paramDrawableContainer, Drawable.ConstantState paramConstantState)
  {
    return b(paramDrawableContainer, paramConstantState);
  }
  
  private static boolean b(DrawableContainer paramDrawableContainer, Drawable.ConstantState paramConstantState)
  {
    bool1 = true;
    boolean bool2 = b;
    if (!bool2)
    {
      localObject1 = DrawableContainer.class;
      localObject2 = "setConstantState";
      i = 1;
    }
    try
    {
      arrayOfClass = new Class[i];
      Class localClass = DrawableContainer.DrawableContainerState.class;
      arrayOfClass[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      a = (Method)localObject1;
      localObject1 = a;
      bool3 = true;
      ((Method)localObject1).setAccessible(bool3);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          localObject1 = a;
          boolean bool3 = true;
          localObject2 = new Object[bool3];
          i = 0;
          Class[] arrayOfClass = null;
          localObject2[0] = paramConstantState;
          ((Method)localObject1).invoke(paramDrawableContainer, (Object[])localObject2);
          return bool1;
        }
        catch (Exception localException)
        {
          str2 = "DrawableUtils";
          String str1 = "Could not invoke setConstantState(). Oh well.";
          Log.e(str2, str1);
        }
        localNoSuchMethodException = localNoSuchMethodException;
        str1 = "DrawableUtils";
        localObject2 = "Could not fetch setConstantState(). Oh well.";
        Log.e(str1, (String)localObject2);
        continue;
        bool1 = false;
        String str2 = null;
      }
    }
    b = bool1;
    localObject1 = a;
    if (localObject1 == null) {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */