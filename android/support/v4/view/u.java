package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

public final class u
{
  static final u.c a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/u$b;
      ((u.b)localObject).<init>();
      a = (u.c)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 19;
      if (i >= j)
      {
        localObject = new android/support/v4/view/u$a;
        ((u.a)localObject).<init>();
        a = (u.c)localObject;
      }
      else
      {
        localObject = new android/support/v4/view/u$c;
        ((u.c)localObject).<init>();
        a = (u.c)localObject;
      }
    }
  }
  
  public static void a(ViewParent paramViewParent, View paramView, int paramInt)
  {
    boolean bool = paramViewParent instanceof m;
    if (bool)
    {
      paramViewParent = (m)paramViewParent;
      paramViewParent.c(paramView, paramInt);
    }
    for (;;)
    {
      return;
      if (paramInt == 0)
      {
        u.c localc = a;
        localc.a(paramViewParent, paramView);
      }
    }
  }
  
  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    boolean bool = paramViewParent instanceof m;
    Object localObject;
    if (bool)
    {
      localObject = paramViewParent;
      localObject = (m)paramViewParent;
      ((m)localObject).a(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    }
    for (;;)
    {
      return;
      if (paramInt5 == 0)
      {
        localObject = a;
        ((u.c)localObject).a(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
  }
  
  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    boolean bool = paramViewParent instanceof m;
    Object localObject;
    if (bool)
    {
      localObject = paramViewParent;
      localObject = (m)paramViewParent;
      ((m)localObject).a(paramView, paramInt1, paramInt2, paramArrayOfInt, paramInt3);
    }
    for (;;)
    {
      return;
      if (paramInt3 == 0)
      {
        localObject = a;
        ((u.c)localObject).a(paramViewParent, paramView, paramInt1, paramInt2, paramArrayOfInt);
      }
    }
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    return a.a(paramViewParent, paramView, paramFloat1, paramFloat2);
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return a.a(paramViewParent, paramView, paramFloat1, paramFloat2, paramBoolean);
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool = paramViewParent instanceof m;
    if (bool)
    {
      paramViewParent = (m)paramViewParent;
      bool = paramViewParent.a(paramView1, paramView2, paramInt1, paramInt2);
    }
    for (;;)
    {
      return bool;
      u.c localc;
      if (paramInt2 == 0)
      {
        localc = a;
        bool = localc.a(paramViewParent, paramView1, paramView2, paramInt1);
      }
      else
      {
        bool = false;
        localc = null;
      }
    }
  }
  
  public static void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool = paramViewParent instanceof m;
    if (bool)
    {
      paramViewParent = (m)paramViewParent;
      paramViewParent.b(paramView1, paramView2, paramInt1, paramInt2);
    }
    for (;;)
    {
      return;
      if (paramInt2 == 0)
      {
        u.c localc = a;
        localc.b(paramViewParent, paramView1, paramView2, paramInt1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\vie\\u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */