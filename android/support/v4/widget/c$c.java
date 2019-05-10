package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

class c$c
{
  private static Field a;
  private static boolean b;
  
  public Drawable a(CompoundButton paramCompoundButton)
  {
    boolean bool1 = true;
    bool2 = b;
    if (!bool2)
    {
      localObject1 = CompoundButton.class;
      str1 = "mButtonDrawable";
    }
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField(str1);
      a = (Field)localObject1;
      localObject1 = a;
      boolean bool3 = true;
      ((Field)localObject1).setAccessible(bool3);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        try
        {
          localObject1 = a;
          localObject1 = ((Field)localObject1).get(paramCompoundButton);
          localObject1 = (Drawable)localObject1;
          return (Drawable)localObject1;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          str1 = "CompoundButtonCompat";
          String str2 = "Failed to get button drawable via reflection";
          Log.i(str1, str2, localIllegalAccessException);
          a = null;
        }
        localNoSuchFieldException = localNoSuchFieldException;
        str1 = "CompoundButtonCompat";
        str2 = "Failed to retrieve mButtonDrawable field";
        Log.i(str1, str2, localNoSuchFieldException);
        continue;
        bool2 = false;
        Object localObject2 = null;
      }
    }
    b = bool1;
    localObject1 = a;
    if (localObject1 == null) {}
  }
  
  public void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    boolean bool = paramCompoundButton instanceof o;
    if (bool)
    {
      paramCompoundButton = (o)paramCompoundButton;
      paramCompoundButton.setSupportButtonTintList(paramColorStateList);
    }
  }
  
  public void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    boolean bool = paramCompoundButton instanceof o;
    if (bool)
    {
      paramCompoundButton = (o)paramCompoundButton;
      paramCompoundButton.setSupportButtonTintMode(paramMode);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\c$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */