package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public class k
{
  private ViewParent a;
  private ViewParent b;
  private final View c;
  private boolean d;
  private int[] e;
  
  public k(View paramView)
  {
    this.c = paramView;
  }
  
  private void a(int paramInt, ViewParent paramViewParent)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      this.a = paramViewParent;
      continue;
      this.b = paramViewParent;
    }
  }
  
  private ViewParent d(int paramInt)
  {
    ViewParent localViewParent;
    switch (paramInt)
    {
    default: 
      localViewParent = null;
    }
    for (;;)
    {
      return localViewParent;
      localViewParent = this.a;
      continue;
      localViewParent = this.b;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    boolean bool = this.d;
    if (bool)
    {
      View localView = this.c;
      r.v(localView);
    }
    this.d = paramBoolean;
  }
  
  public boolean a()
  {
    return this.d;
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    View localView = null;
    boolean bool2 = a();
    if (bool2)
    {
      ViewParent localViewParent = d(0);
      if (localViewParent != null)
      {
        localView = this.c;
        bool1 = u.a(localViewParent, localView, paramFloat1, paramFloat2);
      }
    }
    return bool1;
  }
  
  public boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool1 = false;
    View localView = null;
    boolean bool2 = a();
    if (bool2)
    {
      ViewParent localViewParent = d(0);
      if (localViewParent != null)
      {
        localView = this.c;
        bool1 = u.a(localViewParent, localView, paramFloat1, paramFloat2, paramBoolean);
      }
    }
    return bool1;
  }
  
  public boolean a(int paramInt)
  {
    ViewParent localViewParent = d(paramInt);
    boolean bool;
    if (localViewParent != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localViewParent = null;
    }
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2 = a(paramInt2);
    if (bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      bool2 = a();
      if (bool2)
      {
        ViewParent localViewParent = this.c.getParent();
        localObject = this.c;
        for (;;)
        {
          if (localViewParent == null) {
            break label143;
          }
          View localView = this.c;
          boolean bool3 = u.a(localViewParent, (View)localObject, localView, paramInt1, paramInt2);
          if (bool3)
          {
            a(paramInt2, localViewParent);
            localView = this.c;
            u.b(localViewParent, (View)localObject, localView, paramInt1, paramInt2);
            bool2 = bool1;
            break;
          }
          bool3 = localViewParent instanceof View;
          if (bool3)
          {
            localObject = localViewParent;
            localObject = (View)localViewParent;
          }
          localViewParent = ((ViewParent)localViewParent).getParent();
        }
      }
      label143:
      bool2 = false;
      Object localObject = null;
    }
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, 0);
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    boolean bool = a();
    ViewParent localViewParent;
    int i;
    int j;
    View localView;
    int k;
    if (bool)
    {
      localViewParent = d(paramInt5);
      if (localViewParent == null)
      {
        bool = false;
        localViewParent = null;
        return bool;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0) || (paramInt3 != 0) || (paramInt4 != 0))
      {
        i = 0;
        j = 0;
        localView = null;
        if (paramArrayOfInt == null) {
          break label214;
        }
        this.c.getLocationInWindow(paramArrayOfInt);
        localView = null;
        i = paramArrayOfInt[0];
        j = paramArrayOfInt[1];
        k = j;
      }
    }
    for (int m = i;; m = 0)
    {
      localView = this.c;
      i = paramInt1;
      u.a(localViewParent, localView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      if (paramArrayOfInt != null)
      {
        this.c.getLocationInWindow(paramArrayOfInt);
        localViewParent = null;
        j = paramArrayOfInt[0] - m;
        paramArrayOfInt[0] = j;
        bool = true;
        j = paramArrayOfInt[bool] - k;
        paramArrayOfInt[bool] = j;
      }
      bool = true;
      break;
      if (paramArrayOfInt != null)
      {
        localViewParent = null;
        paramArrayOfInt[0] = 0;
        bool = true;
        j = 0;
        localView = null;
        paramArrayOfInt[bool] = 0;
      }
      bool = false;
      localViewParent = null;
      break;
      label214:
      k = 0;
    }
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 0);
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool1 = false;
    boolean bool2 = a();
    Object localObject1;
    if (bool2)
    {
      localObject1 = d(paramInt3);
      if (localObject1 != null) {}
    }
    else
    {
      return bool1;
    }
    Object localObject2;
    int k;
    int m;
    int n;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (paramArrayOfInt2 == null) {
        break label271;
      }
      localObject2 = this.c;
      ((View)localObject2).getLocationInWindow(paramArrayOfInt2);
      k = paramArrayOfInt2[0];
      m = paramArrayOfInt2[i];
      n = m;
    }
    for (int i1 = k;; i1 = 0)
    {
      if (paramArrayOfInt1 == null)
      {
        localObject2 = this.e;
        if (localObject2 == null)
        {
          m = 2;
          localObject2 = new int[m];
          this.e = ((int[])localObject2);
        }
      }
      for (int[] arrayOfInt = this.e;; arrayOfInt = paramArrayOfInt1)
      {
        arrayOfInt[0] = 0;
        arrayOfInt[i] = 0;
        localObject2 = this.c;
        k = paramInt1;
        u.a((ViewParent)localObject1, (View)localObject2, paramInt1, paramInt2, arrayOfInt, paramInt3);
        if (paramArrayOfInt2 != null)
        {
          localObject1 = this.c;
          ((View)localObject1).getLocationInWindow(paramArrayOfInt2);
          j = paramArrayOfInt2[0] - i1;
          paramArrayOfInt2[0] = j;
          j = paramArrayOfInt2[i] - n;
          paramArrayOfInt2[i] = j;
        }
        int j = arrayOfInt[0];
        if (j == 0)
        {
          j = arrayOfInt[i];
          if (j == 0) {}
        }
        else
        {
          j = i;
        }
        for (;;)
        {
          bool1 = j;
          break;
          j = 0;
          localObject1 = null;
        }
        if (paramArrayOfInt2 == null) {
          break;
        }
        paramArrayOfInt2[0] = 0;
        paramArrayOfInt2[i] = 0;
        break;
      }
      label271:
      n = 0;
    }
  }
  
  public boolean b()
  {
    return a(0);
  }
  
  public boolean b(int paramInt)
  {
    return a(paramInt, 0);
  }
  
  public void c()
  {
    c(0);
  }
  
  public void c(int paramInt)
  {
    ViewParent localViewParent = d(paramInt);
    if (localViewParent != null)
    {
      View localView = this.c;
      u.a(localViewParent, localView, paramInt);
      localViewParent = null;
      a(paramInt, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */