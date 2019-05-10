package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v7.mediarouter.R.attr;
import android.support.v7.mediarouter.R.style;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

final class MediaRouterThemeHelper
{
  public static Context createThemedContext(Context paramContext)
  {
    boolean bool = isLightTheme(paramContext);
    ContextThemeWrapper localContextThemeWrapper = new android/view/ContextThemeWrapper;
    if (bool) {}
    for (int i = R.style.Theme_MediaRouter_Light;; i = R.style.Theme_MediaRouter)
    {
      localContextThemeWrapper.<init>(paramContext, i);
      return localContextThemeWrapper;
    }
  }
  
  public static Drawable getThemeDrawable(Context paramContext, int paramInt)
  {
    int i = getThemeResource(paramContext, paramInt);
    Resources localResources;
    if (i != 0) {
      localResources = paramContext.getResources();
    }
    for (Drawable localDrawable = localResources.getDrawable(i);; localDrawable = null)
    {
      return localDrawable;
      i = 0;
    }
  }
  
  public static int getThemeResource(Context paramContext, int paramInt)
  {
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    Resources.Theme localTheme = paramContext.getTheme();
    boolean bool1 = true;
    boolean bool2 = localTheme.resolveAttribute(paramInt, localTypedValue, bool1);
    int i;
    if (bool2) {
      i = localTypedValue.resourceId;
    }
    for (;;)
    {
      return i;
      i = 0;
      localTypedValue = null;
    }
  }
  
  private static boolean isLightTheme(Context paramContext)
  {
    boolean bool1 = true;
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    Resources.Theme localTheme = paramContext.getTheme();
    int i = R.attr.isLightTheme;
    boolean bool2 = localTheme.resolveAttribute(i, localTypedValue, bool1);
    if (bool2)
    {
      int j = localTypedValue.data;
      if (j == 0) {}
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouterThemeHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */