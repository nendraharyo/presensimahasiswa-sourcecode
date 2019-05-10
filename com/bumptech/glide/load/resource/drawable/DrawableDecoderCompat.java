package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.ContextThemeWrapper;

public final class DrawableDecoderCompat
{
  private static volatile boolean shouldCallAppCompatResources = true;
  
  public static Drawable getDrawable(Context paramContext, int paramInt, Resources.Theme paramTheme)
  {
    return getDrawable(paramContext, paramContext, paramInt, paramTheme);
  }
  
  public static Drawable getDrawable(Context paramContext1, Context paramContext2, int paramInt)
  {
    return getDrawable(paramContext1, paramContext2, paramInt, null);
  }
  
  private static Drawable getDrawable(Context paramContext1, Context paramContext2, int paramInt, Resources.Theme paramTheme)
  {
    try
    {
      bool1 = shouldCallAppCompatResources;
      if (!bool1) {
        break label33;
      }
      localDrawable1 = loadDrawableV7(paramContext2, paramInt, paramTheme);
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      for (;;)
      {
        Drawable localDrawable1;
        boolean bool1 = false;
        Drawable localDrawable2 = null;
        shouldCallAppCompatResources = false;
        if (paramTheme == null) {
          break;
        }
        localDrawable2 = loadDrawableV4(paramContext2, paramInt, paramTheme);
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        String str1 = paramContext1.getPackageName();
        String str2 = paramContext2.getPackageName();
        boolean bool2 = str1.equals(str2);
        if (bool2) {
          throw localIllegalStateException;
        }
        Drawable localDrawable3 = android.support.v4.a.b.a(paramContext2, paramInt);
        continue;
        paramTheme = paramContext2.getTheme();
      }
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      label33:
      for (;;) {}
    }
    return localDrawable1;
  }
  
  private static Drawable loadDrawableV4(Context paramContext, int paramInt, Resources.Theme paramTheme)
  {
    return android.support.v4.a.a.b.a(paramContext.getResources(), paramInt, paramTheme);
  }
  
  private static Drawable loadDrawableV7(Context paramContext, int paramInt, Resources.Theme paramTheme)
  {
    if (paramTheme != null)
    {
      ContextThemeWrapper localContextThemeWrapper = new android/support/v7/view/ContextThemeWrapper;
      localContextThemeWrapper.<init>(paramContext, paramTheme);
      paramContext = localContextThemeWrapper;
    }
    return AppCompatResources.getDrawable(paramContext, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\drawable\DrawableDecoderCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */