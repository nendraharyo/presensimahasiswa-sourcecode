package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

class am
{
  static final Property a;
  static final Property b;
  private static final as c;
  private static Field d;
  private static boolean e;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 22;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/transition/ar;
      ((ar)localObject).<init>();
      c = (as)localObject;
    }
    for (;;)
    {
      localObject = new android/support/transition/am$1;
      ((am.1)localObject).<init>(Float.class, "translationAlpha");
      a = (Property)localObject;
      localObject = new android/support/transition/am$2;
      ((am.2)localObject).<init>(Rect.class, "clipBounds");
      b = (Property)localObject;
      return;
      i = Build.VERSION.SDK_INT;
      j = 21;
      if (i >= j)
      {
        localObject = new android/support/transition/aq;
        ((aq)localObject).<init>();
        c = (as)localObject;
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 19;
        if (i >= j)
        {
          localObject = new android/support/transition/ap;
          ((ap)localObject).<init>();
          c = (as)localObject;
        }
        else
        {
          i = Build.VERSION.SDK_INT;
          j = 18;
          if (i >= j)
          {
            localObject = new android/support/transition/ao;
            ((ao)localObject).<init>();
            c = (as)localObject;
          }
          else
          {
            localObject = new android/support/transition/an;
            ((an)localObject).<init>();
            c = (as)localObject;
          }
        }
      }
    }
  }
  
  static al a(View paramView)
  {
    return c.a(paramView);
  }
  
  private static void a()
  {
    boolean bool1 = true;
    boolean bool2 = e;
    Object localObject;
    if (!bool2)
    {
      localObject = View.class;
      str2 = "mViewFlags";
    }
    try
    {
      localObject = ((Class)localObject).getDeclaredField(str2);
      d = (Field)localObject;
      localObject = d;
      boolean bool3 = true;
      ((Field)localObject).setAccessible(bool3);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        String str1 = "ViewUtils";
        str2 = "fetchViewFlagsField: ";
        Log.i(str1, str2);
      }
    }
    e = bool1;
  }
  
  static void a(View paramView, float paramFloat)
  {
    c.a(paramView, paramFloat);
  }
  
  static void a(View paramView, int paramInt)
  {
    a();
    Field localField1 = d;
    if (localField1 != null) {}
    try
    {
      localField1 = d;
      int i = localField1.getInt(paramView);
      Field localField2 = d;
      i = i & 0xFFFFFFF3 | paramInt;
      localField2.setInt(paramView, i);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
  }
  
  static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    c.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  static void a(View paramView, Matrix paramMatrix)
  {
    c.a(paramView, paramMatrix);
  }
  
  static aw b(View paramView)
  {
    return c.b(paramView);
  }
  
  static void b(View paramView, Matrix paramMatrix)
  {
    c.b(paramView, paramMatrix);
  }
  
  static float c(View paramView)
  {
    return c.c(paramView);
  }
  
  static void d(View paramView)
  {
    c.d(paramView);
  }
  
  static void e(View paramView)
  {
    c.e(paramView);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\am.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */