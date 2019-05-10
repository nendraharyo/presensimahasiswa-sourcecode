package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Map;

public abstract class at
  extends u
{
  private static final String[] g;
  private int h = 3;
  
  static
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "android:visibility:visibility";
    arrayOfString[1] = "android:visibility:parent";
    g = arrayOfString;
  }
  
  private at.b b(aa paramaa1, aa paramaa2)
  {
    int i = -1;
    boolean bool1 = true;
    at.b localb = new android/support/transition/at$b;
    localb.<init>(null);
    localb.a = false;
    localb.b = false;
    Object localObject1;
    Object localObject2;
    int k;
    if (paramaa1 != null)
    {
      localObject1 = paramaa1.a;
      localObject2 = "android:visibility:visibility";
      boolean bool2 = ((Map)localObject1).containsKey(localObject2);
      if (bool2)
      {
        int j = ((Integer)paramaa1.a.get("android:visibility:visibility")).intValue();
        localb.c = j;
        localObject1 = paramaa1.a;
        localObject2 = "android:visibility:parent";
        localObject1 = (ViewGroup)((Map)localObject1).get(localObject2);
        localb.e = ((ViewGroup)localObject1);
        if (paramaa2 == null) {
          break label274;
        }
        localObject1 = paramaa2.a;
        localObject2 = "android:visibility:visibility";
        boolean bool3 = ((Map)localObject1).containsKey(localObject2);
        if (!bool3) {
          break label274;
        }
        k = ((Integer)paramaa2.a.get("android:visibility:visibility")).intValue();
        localb.d = k;
        localObject1 = paramaa2.a;
        localObject2 = "android:visibility:parent";
        localObject1 = (ViewGroup)((Map)localObject1).get(localObject2);
        localb.f = ((ViewGroup)localObject1);
      }
    }
    for (;;)
    {
      if ((paramaa1 != null) && (paramaa2 != null))
      {
        k = localb.c;
        int m = localb.d;
        if (k == m)
        {
          localObject1 = localb.e;
          localObject2 = localb.f;
          if (localObject1 == localObject2)
          {
            localObject1 = localb;
            return (at.b)localObject1;
            localb.c = i;
            localb.e = null;
            break;
            label274:
            localb.d = i;
            localb.f = null;
            continue;
          }
        }
        k = localb.c;
        m = localb.d;
        if (k != m)
        {
          k = localb.c;
          if (k == 0)
          {
            localb.b = false;
            localb.a = bool1;
          }
        }
      }
    }
    for (;;)
    {
      localObject1 = localb;
      break;
      k = localb.d;
      if (k == 0)
      {
        localb.b = bool1;
        localb.a = bool1;
        continue;
        localObject1 = localb.f;
        if (localObject1 == null)
        {
          localb.b = false;
          localb.a = bool1;
        }
        else
        {
          localObject1 = localb.e;
          if (localObject1 == null)
          {
            localb.b = bool1;
            localb.a = bool1;
            continue;
            if (paramaa1 == null)
            {
              k = localb.d;
              if (k == 0)
              {
                localb.b = bool1;
                localb.a = bool1;
                continue;
              }
            }
            if (paramaa2 == null)
            {
              k = localb.c;
              if (k == 0)
              {
                localb.b = false;
                localb.a = bool1;
              }
            }
          }
        }
      }
    }
  }
  
  private void d(aa paramaa)
  {
    int i = paramaa.b.getVisibility();
    Map localMap = paramaa.a;
    Object localObject = Integer.valueOf(i);
    localMap.put("android:visibility:visibility", localObject);
    localObject = paramaa.a;
    ViewParent localViewParent = paramaa.b.getParent();
    ((Map)localObject).put("android:visibility:parent", localViewParent);
    localObject = new int[2];
    paramaa.b.getLocationOnScreen((int[])localObject);
    paramaa.a.put("android:visibility:screenLocation", localObject);
  }
  
  public Animator a(ViewGroup paramViewGroup, aa paramaa1, int paramInt1, aa paramaa2, int paramInt2)
  {
    int i = this.h & 0x1;
    int j = 1;
    Object localObject;
    if ((i != j) || (paramaa2 == null))
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (Animator)localObject;
      if (paramaa1 == null)
      {
        localObject = (View)paramaa2.b.getParent();
        aa localaa = b((View)localObject, false);
        localObject = a((View)localObject, false);
        localObject = b(localaa, (aa)localObject);
        boolean bool = ((at.b)localObject).a;
        if (bool)
        {
          bool = false;
          localObject = null;
          continue;
        }
      }
      localObject = paramaa2.b;
      localObject = a(paramViewGroup, (View)localObject, paramaa1, paramaa2);
    }
  }
  
  public Animator a(ViewGroup paramViewGroup, aa paramaa1, aa paramaa2)
  {
    Object localObject = b(paramaa1, paramaa2);
    boolean bool = ((at.b)localObject).a;
    ViewGroup localViewGroup;
    int i;
    int j;
    if (bool)
    {
      localViewGroup = ((at.b)localObject).e;
      if (localViewGroup == null)
      {
        localViewGroup = ((at.b)localObject).f;
        if (localViewGroup == null) {}
      }
      else
      {
        bool = ((at.b)localObject).b;
        if (bool)
        {
          i = ((at.b)localObject).c;
          j = ((at.b)localObject).d;
          localObject = this;
          localViewGroup = paramViewGroup;
          localObject = a(paramViewGroup, paramaa1, i, paramaa2, j);
        }
      }
    }
    for (;;)
    {
      return (Animator)localObject;
      i = ((at.b)localObject).c;
      j = ((at.b)localObject).d;
      localObject = this;
      localViewGroup = paramViewGroup;
      localObject = b(paramViewGroup, paramaa1, i, paramaa2, j);
      continue;
      localObject = null;
    }
  }
  
  public Animator a(ViewGroup paramViewGroup, View paramView, aa paramaa1, aa paramaa2)
  {
    return null;
  }
  
  public void a(int paramInt)
  {
    int i = paramInt & 0xFFFFFFFC;
    if (i != 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Only MODE_IN and MODE_OUT flags are allowed");
      throw localIllegalArgumentException;
    }
    this.h = paramInt;
  }
  
  public void a(aa paramaa)
  {
    d(paramaa);
  }
  
  public boolean a(aa paramaa1, aa paramaa2)
  {
    boolean bool1 = false;
    if ((paramaa1 == null) && (paramaa2 == null)) {}
    for (;;)
    {
      return bool1;
      Object localObject;
      boolean bool3;
      if ((paramaa1 != null) && (paramaa2 != null))
      {
        localObject = paramaa2.a;
        boolean bool2 = ((Map)localObject).containsKey("android:visibility:visibility");
        Map localMap = paramaa1.a;
        String str = "android:visibility:visibility";
        bool3 = localMap.containsKey(str);
        if (bool2 != bool3) {}
      }
      else
      {
        localObject = b(paramaa1, paramaa2);
        bool3 = ((at.b)localObject).a;
        if (bool3)
        {
          int j = ((at.b)localObject).c;
          if (j != 0)
          {
            int i = ((at.b)localObject).d;
            if (i != 0) {}
          }
          else
          {
            bool1 = true;
          }
        }
      }
    }
  }
  
  public String[] a()
  {
    return g;
  }
  
  public Animator b(ViewGroup paramViewGroup, aa paramaa1, int paramInt1, aa paramaa2, int paramInt2)
  {
    int i = 2;
    boolean bool1 = true;
    int j = 0;
    Animator localAnimator = null;
    int k = this.h & 0x2;
    if (k != i) {
      return localAnimator;
    }
    Object localObject1;
    label40:
    Object localObject2;
    label52:
    Object localObject3;
    if (paramaa1 != null)
    {
      localObject1 = paramaa1.b;
      if (paramaa2 == null) {
        break label259;
      }
      localObject2 = paramaa2.b;
      if (localObject2 != null)
      {
        localObject3 = ((View)localObject2).getParent();
        if (localObject3 != null) {
          break label448;
        }
      }
      if (localObject2 == null) {
        break label268;
      }
      localObject1 = localObject2;
      k = 0;
      localObject2 = null;
    }
    for (;;)
    {
      label84:
      label259:
      label268:
      boolean bool2;
      if ((localObject1 != null) && (paramaa1 != null))
      {
        localObject2 = (int[])paramaa1.a.get("android:visibility:screenLocation");
        j = localObject2[0];
        k = localObject2[bool1];
        localObject3 = new int[i];
        paramViewGroup.getLocationOnScreen((int[])localObject3);
        int n = localObject3[0];
        j -= n;
        n = ((View)localObject1).getLeft();
        j -= n;
        ((View)localObject1).offsetLeftAndRight(j);
        j = localObject3[bool1];
        k -= j;
        j = ((View)localObject1).getTop();
        k -= j;
        ((View)localObject1).offsetTopAndBottom(k);
        localObject2 = af.a(paramViewGroup);
        ((ae)localObject2).a((View)localObject1);
        localAnimator = b(paramViewGroup, (View)localObject1, paramaa1, paramaa2);
        if (localAnimator == null)
        {
          ((ae)localObject2).b((View)localObject1);
          break;
          i1 = 0;
          localObject1 = null;
          break label40;
          k = 0;
          localObject2 = null;
          break label52;
          if (localObject1 == null) {
            break label611;
          }
          localObject2 = ((View)localObject1).getParent();
          if (localObject2 == null)
          {
            k = 0;
            localObject2 = null;
            continue;
          }
          localObject2 = ((View)localObject1).getParent();
          bool2 = localObject2 instanceof View;
          if (!bool2) {
            break label611;
          }
          localObject2 = (View)((View)localObject1).getParent();
          localObject3 = a((View)localObject2, bool1);
          aa localaa = b((View)localObject2, bool1);
          localObject3 = b((aa)localObject3, localaa);
          boolean bool4 = ((at.b)localObject3).a;
          if (!bool4) {
            localObject2 = z.a(paramViewGroup, (View)localObject1, (View)localObject2);
          }
        }
      }
      for (;;)
      {
        localObject1 = localObject2;
        bool2 = false;
        localObject2 = null;
        break label84;
        localObject3 = ((View)localObject2).getParent();
        if (localObject3 == null)
        {
          int m = ((View)localObject2).getId();
          int i2 = -1;
          if (m != i2)
          {
            localObject2 = paramViewGroup.findViewById(m);
            if (localObject2 != null)
            {
              bool3 = this.e;
              if (bool3)
              {
                localObject2 = localObject1;
                continue;
                label448:
                i2 = 4;
                if (paramInt2 == i2)
                {
                  i1 = 0;
                  localObject1 = null;
                  break label84;
                }
                if (localObject1 == localObject2)
                {
                  i1 = 0;
                  localObject1 = null;
                  break label84;
                }
                bool3 = false;
                localObject2 = null;
                break label84;
                localObject3 = new android/support/transition/at$1;
                ((at.1)localObject3).<init>(this, (ae)localObject2, (View)localObject1);
                localAnimator.addListener((Animator.AnimatorListener)localObject3);
                break;
                if (localObject2 == null) {
                  break;
                }
                i1 = ((View)localObject2).getVisibility();
                am.a((View)localObject2, 0);
                localAnimator = b(paramViewGroup, (View)localObject2, paramaa1, paramaa2);
                if (localAnimator != null)
                {
                  localObject1 = new android/support/transition/at$a;
                  ((at.a)localObject1).<init>((View)localObject2, paramInt2, bool1);
                  localAnimator.addListener((Animator.AnimatorListener)localObject1);
                  a.a(localAnimator, (AnimatorListenerAdapter)localObject1);
                  a((u.c)localObject1);
                  break;
                }
                am.a((View)localObject2, i1);
                break;
              }
            }
          }
        }
        bool3 = false;
        localObject2 = null;
      }
      label611:
      boolean bool3 = false;
      localObject2 = null;
      int i1 = 0;
      localObject1 = null;
    }
  }
  
  public Animator b(ViewGroup paramViewGroup, View paramView, aa paramaa1, aa paramaa2)
  {
    return null;
  }
  
  public void b(aa paramaa)
  {
    d(paramaa);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\at.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */