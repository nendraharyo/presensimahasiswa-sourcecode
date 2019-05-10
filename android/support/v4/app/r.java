package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

class r
  extends s
{
  private static boolean a(Transition paramTransition)
  {
    List localList = paramTransition.getTargetIds();
    boolean bool = a(localList);
    if (bool)
    {
      localList = paramTransition.getTargetNames();
      bool = a(localList);
      if (bool)
      {
        localList = paramTransition.getTargetTypes();
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
    TransitionSet localTransitionSet = new android/transition/TransitionSet;
    localTransitionSet.<init>();
    if (paramObject1 != null)
    {
      paramObject1 = (Transition)paramObject1;
      localTransitionSet.addTransition((Transition)paramObject1);
    }
    if (paramObject2 != null)
    {
      paramObject2 = (Transition)paramObject2;
      localTransitionSet.addTransition((Transition)paramObject2);
    }
    if (paramObject3 != null)
    {
      paramObject3 = (Transition)paramObject3;
      localTransitionSet.addTransition((Transition)paramObject3);
    }
    return localTransitionSet;
  }
  
  public void a(ViewGroup paramViewGroup, Object paramObject)
  {
    paramObject = (Transition)paramObject;
    TransitionManager.beginDelayedTransition(paramViewGroup, (Transition)paramObject);
  }
  
  public void a(Object paramObject, Rect paramRect)
  {
    if (paramObject != null)
    {
      paramObject = (Transition)paramObject;
      r.4 local4 = new android/support/v4/app/r$4;
      local4.<init>(this, paramRect);
      ((Transition)paramObject).setEpicenterCallback(local4);
    }
  }
  
  public void a(Object paramObject, View paramView)
  {
    if (paramView != null)
    {
      paramObject = (Transition)paramObject;
      Rect localRect = new android/graphics/Rect;
      localRect.<init>();
      a(paramView, localRect);
      r.1 local1 = new android/support/v4/app/r$1;
      local1.<init>(this, localRect);
      ((Transition)paramObject).setEpicenterCallback(local1);
    }
  }
  
  public void a(Object paramObject, View paramView, ArrayList paramArrayList)
  {
    paramObject = (TransitionSet)paramObject;
    List localList = ((TransitionSet)paramObject).getTargets();
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
    paramObject1 = (Transition)paramObject1;
    r.3 local3 = new android/support/v4/app/r$3;
    local3.<init>(this, paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3);
    ((Transition)paramObject1).addListener(local3);
  }
  
  public void a(Object paramObject, ArrayList paramArrayList)
  {
    int i = 0;
    View localView = null;
    paramObject = (Transition)paramObject;
    if (paramObject == null) {}
    for (;;)
    {
      return;
      boolean bool = paramObject instanceof TransitionSet;
      if (bool)
      {
        paramObject = (TransitionSet)paramObject;
        int j = ((TransitionSet)paramObject).getTransitionCount();
        while (i < j)
        {
          Transition localTransition = ((TransitionSet)paramObject).getTransitionAt(i);
          a(localTransition, paramArrayList);
          i += 1;
        }
      }
      else
      {
        int k = a((Transition)paramObject);
        if (k == 0)
        {
          List localList = ((Transition)paramObject).getTargets();
          k = a(localList);
          if (k != 0)
          {
            int m = paramArrayList.size();
            k = 0;
            localList = null;
            while (k < m)
            {
              localView = (View)paramArrayList.get(k);
              ((Transition)paramObject).addTarget(localView);
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
    paramObject = (TransitionSet)paramObject;
    if (paramObject != null)
    {
      ((TransitionSet)paramObject).getTargets().clear();
      List localList = ((TransitionSet)paramObject).getTargets();
      localList.addAll(paramArrayList2);
      b(paramObject, paramArrayList1, paramArrayList2);
    }
  }
  
  public boolean a(Object paramObject)
  {
    return paramObject instanceof Transition;
  }
  
  public Object b(Object paramObject)
  {
    Transition localTransition = null;
    if (paramObject != null)
    {
      paramObject = (Transition)paramObject;
      localTransition = ((Transition)paramObject).clone();
    }
    return localTransition;
  }
  
  public Object b(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    int i = 0;
    Object localObject1 = null;
    paramObject1 = (Transition)paramObject1;
    paramObject2 = (Transition)paramObject2;
    paramObject3 = (Transition)paramObject3;
    Object localObject2;
    if ((paramObject1 != null) && (paramObject2 != null))
    {
      localObject2 = new android/transition/TransitionSet;
      ((TransitionSet)localObject2).<init>();
      localObject2 = ((TransitionSet)localObject2).addTransition((Transition)paramObject1).addTransition((Transition)paramObject2);
      i = 1;
      localObject1 = ((TransitionSet)localObject2).setOrdering(i);
      if (paramObject3 == null) {
        break label120;
      }
      localObject2 = new android/transition/TransitionSet;
      ((TransitionSet)localObject2).<init>();
      if (localObject1 != null) {
        ((TransitionSet)localObject2).addTransition((Transition)localObject1);
      }
      ((TransitionSet)localObject2).addTransition((Transition)paramObject3);
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
      paramObject = (Transition)paramObject;
      ((Transition)paramObject).addTarget(paramView);
    }
  }
  
  public void b(Object paramObject, View paramView, ArrayList paramArrayList)
  {
    paramObject = (Transition)paramObject;
    r.2 local2 = new android/support/v4/app/r$2;
    local2.<init>(this, paramView, paramArrayList);
    ((Transition)paramObject).addListener(local2);
  }
  
  public void b(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i = 0;
    View localView = null;
    paramObject = (Transition)paramObject;
    boolean bool = paramObject instanceof TransitionSet;
    Transition localTransition;
    if (bool)
    {
      paramObject = (TransitionSet)paramObject;
      int j = ((TransitionSet)paramObject).getTransitionCount();
      while (i < j)
      {
        localTransition = ((TransitionSet)paramObject).getTransitionAt(i);
        b(localTransition, paramArrayList1, paramArrayList2);
        i += 1;
      }
    }
    int k = a((Transition)paramObject);
    if (k == 0)
    {
      List localList = ((Transition)paramObject).getTargets();
      if (localList != null)
      {
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
              localTransition = null;
              while (n < k)
              {
                localView = (View)paramArrayList2.get(n);
                ((Transition)paramObject).addTarget(localView);
                i = n + 1;
                n = i;
              }
              m = paramArrayList2.size();
            }
            i = paramArrayList1.size() + -1;
            for (int m = i; m >= 0; m = i)
            {
              localView = (View)paramArrayList1.get(m);
              ((Transition)paramObject).removeTarget(localView);
              i = m + -1;
            }
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
      localObject = new android/transition/TransitionSet;
      ((TransitionSet)localObject).<init>();
      paramObject = (Transition)paramObject;
      ((TransitionSet)localObject).addTransition((Transition)paramObject);
    }
  }
  
  public void c(Object paramObject, View paramView)
  {
    if (paramObject != null)
    {
      paramObject = (Transition)paramObject;
      ((Transition)paramObject).removeTarget(paramView);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */