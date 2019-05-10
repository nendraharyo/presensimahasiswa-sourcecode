package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

public final class c
{
  private static final c.c a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/widget/c$b;
      ((c.b)localObject).<init>();
      a = (c.c)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 21;
      if (i >= j)
      {
        localObject = new android/support/v4/widget/c$a;
        ((c.a)localObject).<init>();
        a = (c.c)localObject;
      }
      else
      {
        localObject = new android/support/v4/widget/c$c;
        ((c.c)localObject).<init>();
        a = (c.c)localObject;
      }
    }
  }
  
  public static Drawable a(CompoundButton paramCompoundButton)
  {
    return a.a(paramCompoundButton);
  }
  
  public static void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    a.a(paramCompoundButton, paramColorStateList);
  }
  
  public static void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    a.a(paramCompoundButton, paramMode);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */