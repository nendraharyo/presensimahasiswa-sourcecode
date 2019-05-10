package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;

public class r
{
  static final r.j a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 26;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/r$i;
      ((r.i)localObject).<init>();
      a = (r.j)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 24;
      if (i >= j)
      {
        localObject = new android/support/v4/view/r$h;
        ((r.h)localObject).<init>();
        a = (r.j)localObject;
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 23;
        if (i >= j)
        {
          localObject = new android/support/v4/view/r$g;
          ((r.g)localObject).<init>();
          a = (r.j)localObject;
        }
        else
        {
          i = Build.VERSION.SDK_INT;
          j = 21;
          if (i >= j)
          {
            localObject = new android/support/v4/view/r$f;
            ((r.f)localObject).<init>();
            a = (r.j)localObject;
          }
          else
          {
            i = Build.VERSION.SDK_INT;
            j = 19;
            if (i >= j)
            {
              localObject = new android/support/v4/view/r$e;
              ((r.e)localObject).<init>();
              a = (r.j)localObject;
            }
            else
            {
              i = Build.VERSION.SDK_INT;
              j = 18;
              if (i >= j)
              {
                localObject = new android/support/v4/view/r$d;
                ((r.d)localObject).<init>();
                a = (r.j)localObject;
              }
              else
              {
                i = Build.VERSION.SDK_INT;
                j = 17;
                if (i >= j)
                {
                  localObject = new android/support/v4/view/r$c;
                  ((r.c)localObject).<init>();
                  a = (r.j)localObject;
                }
                else
                {
                  i = Build.VERSION.SDK_INT;
                  j = 16;
                  if (i >= j)
                  {
                    localObject = new android/support/v4/view/r$b;
                    ((r.b)localObject).<init>();
                    a = (r.j)localObject;
                  }
                  else
                  {
                    i = Build.VERSION.SDK_INT;
                    j = 15;
                    if (i >= j)
                    {
                      localObject = new android/support/v4/view/r$a;
                      ((r.a)localObject).<init>();
                      a = (r.j)localObject;
                    }
                    else
                    {
                      localObject = new android/support/v4/view/r$j;
                      ((r.j)localObject).<init>();
                      a = (r.j)localObject;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static boolean A(View paramView)
  {
    return a.a(paramView);
  }
  
  public static Display B(View paramView)
  {
    return a.p(paramView);
  }
  
  public static z a(View paramView, z paramz)
  {
    return a.a(paramView, paramz);
  }
  
  public static void a(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }
  
  public static void a(View paramView, int paramInt)
  {
    a.a(paramView, paramInt);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2)
  {
    a.a(paramView, paramInt1, paramInt2);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(View paramView, ColorStateList paramColorStateList)
  {
    a.a(paramView, paramColorStateList);
  }
  
  public static void a(View paramView, PorterDuff.Mode paramMode)
  {
    a.a(paramView, paramMode);
  }
  
  public static void a(View paramView, Rect paramRect)
  {
    a.a(paramView, paramRect);
  }
  
  public static void a(View paramView, Drawable paramDrawable)
  {
    a.a(paramView, paramDrawable);
  }
  
  public static void a(View paramView, a parama)
  {
    a.a(paramView, parama);
  }
  
  public static void a(View paramView, o paramo)
  {
    a.a(paramView, paramo);
  }
  
  public static void a(View paramView, p paramp)
  {
    a.a(paramView, paramp);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    a.a(paramView, paramRunnable, paramLong);
  }
  
  public static void a(View paramView, String paramString)
  {
    a.a(paramView, paramString);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    a.a(paramView, paramBoolean);
  }
  
  public static boolean a(View paramView)
  {
    return a.B(paramView);
  }
  
  public static void b(View paramView, int paramInt)
  {
    a.b(paramView, paramInt);
  }
  
  public static void b(View paramView, boolean paramBoolean)
  {
    paramView.setFitsSystemWindows(paramBoolean);
  }
  
  public static boolean b(View paramView)
  {
    return a.b(paramView);
  }
  
  public static void c(View paramView)
  {
    a.c(paramView);
  }
  
  public static void c(View paramView, int paramInt)
  {
    a.d(paramView, paramInt);
  }
  
  public static int d(View paramView)
  {
    return a.d(paramView);
  }
  
  public static void d(View paramView, int paramInt)
  {
    a.c(paramView, paramInt);
  }
  
  public static int e(View paramView)
  {
    return a.k(paramView);
  }
  
  public static ViewParent f(View paramView)
  {
    return a.e(paramView);
  }
  
  public static int g(View paramView)
  {
    return a.l(paramView);
  }
  
  public static int h(View paramView)
  {
    return a.m(paramView);
  }
  
  public static int i(View paramView)
  {
    return a.f(paramView);
  }
  
  public static int j(View paramView)
  {
    return a.g(paramView);
  }
  
  public static v k(View paramView)
  {
    return a.C(paramView);
  }
  
  public static float l(View paramView)
  {
    return a.u(paramView);
  }
  
  public static String m(View paramView)
  {
    return a.t(paramView);
  }
  
  public static int n(View paramView)
  {
    return a.n(paramView);
  }
  
  public static void o(View paramView)
  {
    a.h(paramView);
  }
  
  public static boolean p(View paramView)
  {
    return a.i(paramView);
  }
  
  public static boolean q(View paramView)
  {
    return a.j(paramView);
  }
  
  public static boolean r(View paramView)
  {
    return a.o(paramView);
  }
  
  public static ColorStateList s(View paramView)
  {
    return a.y(paramView);
  }
  
  public static PorterDuff.Mode t(View paramView)
  {
    return a.z(paramView);
  }
  
  public static boolean u(View paramView)
  {
    return a.w(paramView);
  }
  
  public static void v(View paramView)
  {
    a.x(paramView);
  }
  
  public static boolean w(View paramView)
  {
    return a.r(paramView);
  }
  
  public static float x(View paramView)
  {
    return a.A(paramView);
  }
  
  public static Rect y(View paramView)
  {
    return a.q(paramView);
  }
  
  public static boolean z(View paramView)
  {
    return a.s(paramView);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */