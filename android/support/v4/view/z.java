package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

public class z
{
  private final Object a;
  
  private z(Object paramObject)
  {
    this.a = paramObject;
  }
  
  static z a(Object paramObject)
  {
    z localz;
    if (paramObject == null) {
      localz = null;
    }
    for (;;)
    {
      return localz;
      localz = new android/support/v4/view/z;
      localz.<init>(paramObject);
    }
  }
  
  static Object a(z paramz)
  {
    if (paramz == null) {}
    for (Object localObject = null;; localObject = paramz.a) {
      return localObject;
    }
  }
  
  public int a()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 20;
    WindowInsets localWindowInsets;
    if (i >= j)
    {
      localWindowInsets = (WindowInsets)this.a;
      i = localWindowInsets.getSystemWindowInsetLeft();
    }
    for (;;)
    {
      return i;
      i = 0;
      localWindowInsets = null;
    }
  }
  
  public z a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 20;
    z localz;
    if (i >= j)
    {
      localz = new android/support/v4/view/z;
      localObject = ((WindowInsets)this.a).replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4);
      localz.<init>(localObject);
    }
    for (Object localObject = localz;; localObject = null)
    {
      return (z)localObject;
      i = 0;
    }
  }
  
  public int b()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 20;
    WindowInsets localWindowInsets;
    if (i >= j)
    {
      localWindowInsets = (WindowInsets)this.a;
      i = localWindowInsets.getSystemWindowInsetTop();
    }
    for (;;)
    {
      return i;
      i = 0;
      localWindowInsets = null;
    }
  }
  
  public int c()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 20;
    WindowInsets localWindowInsets;
    if (i >= j)
    {
      localWindowInsets = (WindowInsets)this.a;
      i = localWindowInsets.getSystemWindowInsetRight();
    }
    for (;;)
    {
      return i;
      i = 0;
      localWindowInsets = null;
    }
  }
  
  public int d()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 20;
    WindowInsets localWindowInsets;
    if (i >= j)
    {
      localWindowInsets = (WindowInsets)this.a;
      i = localWindowInsets.getSystemWindowInsetBottom();
    }
    for (;;)
    {
      return i;
      i = 0;
      localWindowInsets = null;
    }
  }
  
  public boolean e()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    WindowInsets localWindowInsets;
    boolean bool;
    if (i >= j)
    {
      localWindowInsets = (WindowInsets)this.a;
      bool = localWindowInsets.isConsumed();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localWindowInsets = null;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    Object localObject1 = null;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      Object localObject3;
      if (paramObject != null)
      {
        localObject2 = getClass();
        Class localClass = paramObject.getClass();
        if (localObject2 == localClass) {}
      }
      else
      {
        bool = false;
        localObject3 = null;
        continue;
      }
      paramObject = (z)paramObject;
      Object localObject2 = this.a;
      if (localObject2 == null)
      {
        localObject2 = ((z)paramObject).a;
        if (localObject2 != null)
        {
          bool = false;
          localObject3 = null;
        }
      }
      else
      {
        localObject3 = this.a;
        localObject1 = ((z)paramObject).a;
        bool = localObject3.equals(localObject1);
      }
    }
  }
  
  public int hashCode()
  {
    Object localObject = this.a;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = this.a;
      i = localObject.hashCode();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */