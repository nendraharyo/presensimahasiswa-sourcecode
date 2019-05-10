package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class a
{
  private static Method a;
  private static boolean b;
  private static Method c;
  private static boolean d;
  
  public static void a(Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }
  
  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      paramDrawable.setHotspot(paramFloat1, paramFloat2);
    }
  }
  
  public static void a(Drawable paramDrawable, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      paramDrawable.setTint(paramInt);
    }
    for (;;)
    {
      return;
      boolean bool = paramDrawable instanceof b;
      if (bool)
      {
        paramDrawable = (b)paramDrawable;
        paramDrawable.setTint(paramInt);
      }
    }
  }
  
  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      paramDrawable.setTintList(paramColorStateList);
    }
    for (;;)
    {
      return;
      boolean bool = paramDrawable instanceof b;
      if (bool)
      {
        paramDrawable = (b)paramDrawable;
        paramDrawable.setTintList(paramColorStateList);
      }
    }
  }
  
  public static void a(Drawable paramDrawable, Resources.Theme paramTheme)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      paramDrawable.applyTheme(paramTheme);
    }
  }
  
  public static void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    for (;;)
    {
      return;
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
    }
  }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      paramDrawable.setTintMode(paramMode);
    }
    for (;;)
    {
      return;
      boolean bool = paramDrawable instanceof b;
      if (bool)
      {
        paramDrawable = (b)paramDrawable;
        paramDrawable.setTintMode(paramMode);
      }
    }
  }
  
  public static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j) {
      paramDrawable.setAutoMirrored(paramBoolean);
    }
  }
  
  public static boolean b(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j) {}
    for (boolean bool = paramDrawable.isAutoMirrored();; bool = false) {
      return bool;
    }
  }
  
  public static boolean b(Drawable paramDrawable, int paramInt)
  {
    boolean bool1 = true;
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j) {
      bool1 = paramDrawable.setLayoutDirection(paramInt);
    }
    for (;;)
    {
      return bool1;
      i = Build.VERSION.SDK_INT;
      j = 17;
      Object localObject2;
      if (i >= j)
      {
        boolean bool2 = b;
        int m;
        if (!bool2)
        {
          localObject1 = Drawable.class;
          localObject2 = "setLayoutDirection";
          m = 1;
        }
        try
        {
          localObject3 = new Class[m];
          localInteger = null;
          Class localClass = Integer.TYPE;
          localObject3[0] = localClass;
          localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
          a = (Method)localObject1;
          localObject1 = a;
          j = 1;
          ((Method)localObject1).setAccessible(j);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          for (;;)
          {
            Integer localInteger;
            localObject2 = "DrawableCompat";
            Object localObject3 = "Failed to retrieve setLayoutDirection(int) method";
            Log.i((String)localObject2, (String)localObject3, localNoSuchMethodException);
          }
        }
        b = bool1;
        Object localObject1 = a;
        if (localObject1 != null) {
          try
          {
            localObject1 = a;
            int k = 1;
            localObject2 = new Object[k];
            m = 0;
            localObject3 = null;
            localInteger = Integer.valueOf(paramInt);
            localObject2[0] = localInteger;
            ((Method)localObject1).invoke(paramDrawable, (Object[])localObject2);
          }
          catch (Exception localException)
          {
            localObject1 = "DrawableCompat";
            localObject2 = "Failed to invoke setLayoutDirection(int) via reflection";
            Log.i((String)localObject1, (String)localObject2, localException);
            bool1 = false;
            localObject4 = null;
            a = null;
          }
        }
        bool1 = false;
        localObject4 = null;
        continue;
      }
      bool1 = false;
      Object localObject4 = null;
    }
  }
  
  public static int c(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j) {}
    for (i = paramDrawable.getAlpha();; i = 0) {
      return i;
    }
  }
  
  public static boolean d(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {}
    for (boolean bool = paramDrawable.canApplyTheme();; bool = false) {
      return bool;
    }
  }
  
  public static ColorFilter e(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {}
    for (ColorFilter localColorFilter = paramDrawable.getColorFilter();; localColorFilter = null)
    {
      return localColorFilter;
      i = 0;
    }
  }
  
  public static void f(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j) {
      paramDrawable.clearColorFilter();
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 21;
      if (i >= j)
      {
        paramDrawable.clearColorFilter();
        boolean bool = paramDrawable instanceof InsetDrawable;
        Object localObject;
        if (bool)
        {
          paramDrawable = (InsetDrawable)paramDrawable;
          localObject = paramDrawable.getDrawable();
          f((Drawable)localObject);
        }
        else
        {
          bool = paramDrawable instanceof c;
          if (bool)
          {
            paramDrawable = (c)paramDrawable;
            localObject = paramDrawable.a();
            f((Drawable)localObject);
          }
          else
          {
            bool = paramDrawable instanceof DrawableContainer;
            if (bool)
            {
              paramDrawable = (DrawableContainer)paramDrawable;
              localObject = (DrawableContainer.DrawableContainerState)paramDrawable.getConstantState();
              if (localObject != null)
              {
                j = 0;
                int k = ((DrawableContainer.DrawableContainerState)localObject).getChildCount();
                while (j < k)
                {
                  Drawable localDrawable = ((DrawableContainer.DrawableContainerState)localObject).getChild(j);
                  if (localDrawable != null) {
                    f(localDrawable);
                  }
                  j += 1;
                }
              }
            }
          }
        }
      }
      else
      {
        paramDrawable.clearColorFilter();
      }
    }
  }
  
  public static Drawable g(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    int k = 23;
    if (i >= k) {}
    for (;;)
    {
      return (Drawable)paramDrawable;
      i = Build.VERSION.SDK_INT;
      k = 21;
      Object localObject;
      if (i >= k)
      {
        boolean bool1 = paramDrawable instanceof b;
        if (!bool1)
        {
          localObject = new android/support/v4/b/a/f;
          ((f)localObject).<init>(paramDrawable);
          paramDrawable = (Drawable)localObject;
        }
      }
      else
      {
        int j = Build.VERSION.SDK_INT;
        k = 19;
        boolean bool2;
        if (j >= k)
        {
          bool2 = paramDrawable instanceof b;
          if (!bool2)
          {
            localObject = new android/support/v4/b/a/e;
            ((e)localObject).<init>(paramDrawable);
            paramDrawable = (Drawable)localObject;
          }
        }
        else
        {
          bool2 = paramDrawable instanceof b;
          if (!bool2)
          {
            localObject = new android/support/v4/b/a/d;
            ((d)localObject).<init>(paramDrawable);
            paramDrawable = (Drawable)localObject;
          }
        }
      }
    }
  }
  
  public static Drawable h(Drawable paramDrawable)
  {
    boolean bool = paramDrawable instanceof c;
    if (bool) {
      paramDrawable = ((c)paramDrawable).a();
    }
    return paramDrawable;
  }
  
  public static int i(Drawable paramDrawable)
  {
    boolean bool1 = true;
    int i = Build.VERSION.SDK_INT;
    int k = 23;
    if (i >= k) {
      i = paramDrawable.getLayoutDirection();
    }
    for (;;)
    {
      return i;
      i = Build.VERSION.SDK_INT;
      k = 17;
      int j;
      Object localObject2;
      if (i >= k)
      {
        boolean bool2 = d;
        Object localObject1;
        Object localObject3;
        Object localObject4;
        if (!bool2)
        {
          localObject1 = Drawable.class;
          localObject3 = "getLayoutDirection";
          localObject4 = null;
        }
        try
        {
          localObject4 = new Class[0];
          localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject3, (Class[])localObject4);
          c = (Method)localObject1;
          localObject1 = c;
          k = 1;
          ((Method)localObject1).setAccessible(k);
          d = bool1;
          localObject1 = c;
          if (localObject1 == null) {}
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          for (;;)
          {
            try
            {
              localObject1 = c;
              int m = 0;
              localObject3 = null;
              localObject3 = new Object[0];
              localObject1 = ((Method)localObject1).invoke(paramDrawable, (Object[])localObject3);
              localObject1 = (Integer)localObject1;
              j = ((Integer)localObject1).intValue();
            }
            catch (Exception localException)
            {
              localObject3 = "DrawableCompat";
              localObject4 = "Failed to invoke getLayoutDirection() via reflection";
              Log.i((String)localObject3, (String)localObject4, localException);
              j = 0;
              localObject2 = null;
              c = null;
            }
            localNoSuchMethodException = localNoSuchMethodException;
            localObject3 = "DrawableCompat";
            localObject4 = "Failed to retrieve getLayoutDirection() method";
            Log.i((String)localObject3, (String)localObject4, localNoSuchMethodException);
          }
          j = 0;
          localObject2 = null;
        }
      }
      else
      {
        j = 0;
        localObject2 = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */