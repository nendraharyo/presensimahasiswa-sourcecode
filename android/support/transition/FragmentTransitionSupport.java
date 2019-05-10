package android.support.transition;

import android.graphics.Rect;
import android.support.v4.app.s;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class FragmentTransitionSupport
  extends s
{
  private static boolean a(u paramu)
  {
    List localList = paramu.f();
    boolean bool = a(localList);
    if (bool)
    {
      localList = paramu.h();
      bool = a(localList);
      if (bool)
      {
        localList = paramu.i();
        bool = a(localList);
        if (bool) {
          break label46;
        }
      }
    }
    bool = true;
    for (;;)
    {
      return bool;
      label46:
      bool = false;
      localList = null;
    }
  }
  
  public Object a(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    y localy = new android/support/transition/y;
    localy.<init>();
    if (paramObject1 != null)
    {
      paramObject1 = (u)paramObject1;
      localy.b((u)paramObject1);
    }
    if (paramObject2 != null)
    {
      paramObject2 = (u)paramObject2;
      localy.b((u)paramObject2);
    }
    if (paramObject3 != null)
    {
      paramObject3 = (u)paramObject3;
      localy.b((u)paramObject3);
    }
    return localy;
  }
  
  public void a(ViewGroup paramViewGroup, Object paramObject)
  {
    paramObject = (u)paramObject;
    w.a(paramViewGroup, (u)paramObject);
  }
  
  public void a(Object paramObject, Rect paramRect)
  {
    if (paramObject != null)
    {
      paramObject = (u)paramObject;
      FragmentTransitionSupport.4 local4 = new android/support/transition/FragmentTransitionSupport$4;
      local4.<init>(this, paramRect);
      ((u)paramObject).a(local4);
    }
  }
  
  public void a(Object paramObject, View paramView)
  {
    if (paramView != null)
    {
      paramObject = (u)paramObject;
      Rect localRect = new android/graphics/Rect;
      localRect.<init>();
      a(paramView, localRect);
      FragmentTransitionSupport.1 local1 = new android/support/transition/FragmentTransitionSupport$1;
      local1.<init>(this, localRect);
      ((u)paramObject).a(local1);
    }
  }
  
  public void a(Object paramObject, View paramView, ArrayList paramArrayList)
  {
    paramObject = (y)paramObject;
    List localList = ((y)paramObject).g();
    localList.clear();
    int i = paramArrayList.size();
    int j = 0;
    View localView = null;
    for (int k = 0; k < i; k = j)
    {
      localView = (View)paramArrayList.get(k);
      a(localList, localView);
      j = k + 1;
    }
    localList.add(paramView);
    paramArrayList.add(paramView);
    a(paramObject, paramArrayList);
  }
  
  public void a(Object paramObject1, Object paramObject2, ArrayList paramArrayList1, Object paramObject3, ArrayList paramArrayList2, Object paramObject4, ArrayList paramArrayList3)
  {
    paramObject1 = (u)paramObject1;
    FragmentTransitionSupport.3 local3 = new android/support/transition/FragmentTransitionSupport$3;
    local3.<init>(this, paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3);
    ((u)paramObject1).a(local3);
  }
  
  public void a(Object paramObject, ArrayList paramArrayList)
  {
    int i = 0;
    View localView = null;
    paramObject = (u)paramObject;
    if (paramObject == null) {}
    for (;;)
    {
      return;
      boolean bool = paramObject instanceof y;
      if (bool)
      {
        paramObject = (y)paramObject;
        int j = ((y)paramObject).o();
        while (i < j)
        {
          u localu = ((y)paramObject).b(i);
          a(localu, paramArrayList);
          i += 1;
        }
      }
      else
      {
        int k = a((u)paramObject);
        if (k == 0)
        {
          List localList = ((u)paramObject).g();
          k = a(localList);
          if (k != 0)
          {
            int m = paramArrayList.size();
            k = 0;
            localList = null;
            while (k < m)
            {
              localView = (View)paramArrayList.get(k);
              ((u)paramObject).b(localView);
              i = k + 1;
              k = i;
            }
          }
        }
      }
    }
  }
  
  public void a(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    paramObject = (y)paramObject;
    if (paramObject != null)
    {
      ((y)paramObject).g().clear();
      List localList = ((y)paramObject).g();
      localList.addAll(paramArrayList2);
      b(paramObject, paramArrayList1, paramArrayList2);
    }
  }
  
  public boolean a(Object paramObject)
  {
    return paramObject instanceof u;
  }
  
  public Object b(Object paramObject)
  {
    u localu = null;
    if (paramObject != null)
    {
      paramObject = (u)paramObject;
      localu = ((u)paramObject).m();
    }
    return localu;
  }
  
  public Object b(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    int i = 0;
    Object localObject1 = null;
    paramObject1 = (u)paramObject1;
    paramObject2 = (u)paramObject2;
    paramObject3 = (u)paramObject3;
    Object localObject2;
    if ((paramObject1 != null) && (paramObject2 != null))
    {
      localObject2 = new android/support/transition/y;
      ((y)localObject2).<init>();
      localObject2 = ((y)localObject2).b((u)paramObject1).b((u)paramObject2);
      i = 1;
      localObject1 = ((y)localObject2).a(i);
      if (paramObject3 == null) {
        break label120;
      }
      localObject2 = new android/support/transition/y;
      ((y)localObject2).<init>();
      if (localObject1 != null) {
        ((y)localObject2).b((u)localObject1);
      }
      ((y)localObject2).b((u)paramObject3);
    }
    for (;;)
    {
      return localObject2;
      if (paramObject1 != null)
      {
        localObject1 = paramObject1;
        break;
      }
      if (paramObject2 == null) {
        break;
      }
      localObject1 = paramObject2;
      break;
      label120:
      localObject2 = localObject1;
    }
  }
  
  public void b(Object paramObject, View paramView)
  {
    if (paramObject != null)
    {
      paramObject = (u)paramObject;
      ((u)paramObject).b(paramView);
    }
  }
  
  public void b(Object paramObject, View paramView, ArrayList paramArrayList)
  {
    paramObject = (u)paramObject;
    FragmentTransitionSupport.2 local2 = new android/support/transition/FragmentTransitionSupport$2;
    local2.<init>(this, paramView, paramArrayList);
    ((u)paramObject).a(local2);
  }
  
  public void b(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i = 0;
    View localView = null;
    paramObject = (u)paramObject;
    boolean bool = paramObject instanceof y;
    u localu;
    if (bool)
    {
      paramObject = (y)paramObject;
      int j = ((y)paramObject).o();
      while (i < j)
      {
        localu = ((y)paramObject).b(i);
        b(localu, paramArrayList1, paramArrayList2);
        i += 1;
      }
    }
    int k = a((u)paramObject);
    if (k == 0)
    {
      List localList = ((u)paramObject).g();
      int n = localList.size();
      int i1 = paramArrayList1.size();
      if (n == i1)
      {
        k = localList.containsAll(paramArrayList1);
        if (k != 0)
        {
          if (paramArrayList2 == null)
          {
            k = 0;
            localList = null;
          }
          for (;;)
          {
            n = 0;
            localu = null;
            while (n < k)
            {
              localView = (View)paramArrayList2.get(n);
              ((u)paramObject).b(localView);
              i = n + 1;
              n = i;
            }
            m = paramArrayList2.size();
          }
          i = paramArrayList1.size() + -1;
          for (int m = i; m >= 0; m = i)
          {
            localView = (View)paramArrayList1.get(m);
            ((u)paramObject).c(localView);
            i = m + -1;
          }
        }
      }
    }
  }
  
  public Object c(Object paramObject)
  {
    Object localObject;
    if (paramObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return localObject;
      localObject = new android/support/transition/y;
      ((y)localObject).<init>();
      paramObject = (u)paramObject;
      ((y)localObject).b((u)paramObject);
    }
  }
  
  public void c(Object paramObject, View paramView)
  {
    if (paramObject != null)
    {
      paramObject = (u)paramObject;
      ((u)paramObject).c(paramView);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\FragmentTransitionSupport.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */