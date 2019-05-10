package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;

public final class g
{
  static final g.c a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 26;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/g$a;
      ((g.a)localObject).<init>();
    }
    for (a = (g.c)localObject;; a = (g.c)localObject)
    {
      return;
      localObject = new android/support/v4/view/g$b;
      ((g.b)localObject).<init>();
    }
  }
  
  public static MenuItem a(MenuItem paramMenuItem, b paramb)
  {
    boolean bool = paramMenuItem instanceof android.support.v4.d.a.b;
    if (bool) {
      paramMenuItem = ((android.support.v4.d.a.b)paramMenuItem).setSupportActionProvider(paramb);
    }
    for (;;)
    {
      return paramMenuItem;
      String str1 = "MenuItemCompat";
      String str2 = "setActionProvider: item does not implement SupportMenuItem; ignoring";
      Log.w(str1, str2);
    }
  }
  
  public static void a(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    boolean bool = paramMenuItem instanceof android.support.v4.d.a.b;
    if (bool)
    {
      paramMenuItem = (android.support.v4.d.a.b)paramMenuItem;
      paramMenuItem.setNumericShortcut(paramChar, paramInt);
    }
    for (;;)
    {
      return;
      g.c localc = a;
      localc.b(paramMenuItem, paramChar, paramInt);
    }
  }
  
  public static void a(MenuItem paramMenuItem, ColorStateList paramColorStateList)
  {
    boolean bool = paramMenuItem instanceof android.support.v4.d.a.b;
    if (bool)
    {
      paramMenuItem = (android.support.v4.d.a.b)paramMenuItem;
      paramMenuItem.setIconTintList(paramColorStateList);
    }
    for (;;)
    {
      return;
      g.c localc = a;
      localc.a(paramMenuItem, paramColorStateList);
    }
  }
  
  public static void a(MenuItem paramMenuItem, PorterDuff.Mode paramMode)
  {
    boolean bool = paramMenuItem instanceof android.support.v4.d.a.b;
    if (bool)
    {
      paramMenuItem = (android.support.v4.d.a.b)paramMenuItem;
      paramMenuItem.setIconTintMode(paramMode);
    }
    for (;;)
    {
      return;
      g.c localc = a;
      localc.a(paramMenuItem, paramMode);
    }
  }
  
  public static void a(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    boolean bool = paramMenuItem instanceof android.support.v4.d.a.b;
    if (bool)
    {
      paramMenuItem = (android.support.v4.d.a.b)paramMenuItem;
      paramMenuItem.setContentDescription(paramCharSequence);
    }
    for (;;)
    {
      return;
      g.c localc = a;
      localc.a(paramMenuItem, paramCharSequence);
    }
  }
  
  public static void b(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    boolean bool = paramMenuItem instanceof android.support.v4.d.a.b;
    if (bool)
    {
      paramMenuItem = (android.support.v4.d.a.b)paramMenuItem;
      paramMenuItem.setAlphabeticShortcut(paramChar, paramInt);
    }
    for (;;)
    {
      return;
      g.c localc = a;
      localc.a(paramMenuItem, paramChar, paramInt);
    }
  }
  
  public static void b(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    boolean bool = paramMenuItem instanceof android.support.v4.d.a.b;
    if (bool)
    {
      paramMenuItem = (android.support.v4.d.a.b)paramMenuItem;
      paramMenuItem.setTooltipText(paramCharSequence);
    }
    for (;;)
    {
      return;
      g.c localc = a;
      localc.b(paramMenuItem, paramCharSequence);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */