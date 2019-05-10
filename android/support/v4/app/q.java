package android.support.v4.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.h.a;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class q
{
  private static final int[] a;
  private static final s b;
  private static final s c;
  
  static
  {
    Object localObject = new int[10];
    localObject[0] = 0;
    localObject[1] = 3;
    localObject[2] = 0;
    localObject[3] = 1;
    localObject[4] = 5;
    localObject[5] = 4;
    localObject[6] = 7;
    localObject[7] = 6;
    localObject[8] = 9;
    localObject[9] = 8;
    a = (int[])localObject;
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j)
    {
      localObject = new android/support/v4/app/r;
      ((r)localObject).<init>();
    }
    for (;;)
    {
      b = (s)localObject;
      c = a();
      return;
      i = 0;
      localObject = null;
    }
  }
  
  private static q.a a(q.a parama, SparseArray paramSparseArray, int paramInt)
  {
    if (parama == null)
    {
      parama = new android/support/v4/app/q$a;
      parama.<init>();
      paramSparseArray.put(paramInt, parama);
    }
    return parama;
  }
  
  private static s a()
  {
    Object localObject1 = "android.support.transition.FragmentTransitionSupport";
    try
    {
      localObject1 = Class.forName((String)localObject1);
      Object localObject3 = null;
      localObject3 = new Class[0];
      localObject1 = ((Class)localObject1).getDeclaredConstructor((Class[])localObject3);
      localObject3 = null;
      localObject3 = new Object[0];
      localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject3);
      localObject1 = (s)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return (s)localObject1;
  }
  
  private static s a(Fragment paramFragment1, Fragment paramFragment2)
  {
    Object localObject1 = null;
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    Object localObject3;
    if (paramFragment1 != null)
    {
      localObject3 = paramFragment1.getExitTransition();
      if (localObject3 != null) {
        ((ArrayList)localObject2).add(localObject3);
      }
      localObject3 = paramFragment1.getReturnTransition();
      if (localObject3 != null) {
        ((ArrayList)localObject2).add(localObject3);
      }
      localObject3 = paramFragment1.getSharedElementReturnTransition();
      if (localObject3 != null) {
        ((ArrayList)localObject2).add(localObject3);
      }
    }
    if (paramFragment2 != null)
    {
      localObject3 = paramFragment2.getEnterTransition();
      if (localObject3 != null) {
        ((ArrayList)localObject2).add(localObject3);
      }
      localObject3 = paramFragment2.getReenterTransition();
      if (localObject3 != null) {
        ((ArrayList)localObject2).add(localObject3);
      }
      localObject3 = paramFragment2.getSharedElementEnterTransition();
      if (localObject3 != null) {
        ((ArrayList)localObject2).add(localObject3);
      }
    }
    boolean bool1 = ((ArrayList)localObject2).isEmpty();
    if (bool1) {}
    do
    {
      for (;;)
      {
        return (s)localObject1;
        localObject3 = b;
        if (localObject3 != null)
        {
          localObject3 = b;
          bool1 = a((s)localObject3, (List)localObject2);
          if (bool1)
          {
            localObject1 = b;
            continue;
          }
        }
        localObject3 = c;
        if (localObject3 == null) {
          break;
        }
        localObject3 = c;
        boolean bool2 = a((s)localObject3, (List)localObject2);
        if (!bool2) {
          break;
        }
        localObject1 = c;
      }
      localObject2 = b;
      if (localObject2 != null) {
        break;
      }
      localObject2 = c;
    } while (localObject2 == null);
    localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>("Invalid Transition types");
    throw ((Throwable)localObject1);
  }
  
  private static a a(int paramInt1, ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt2, int paramInt3)
  {
    a locala = new android/support/v4/h/a;
    locala.<init>();
    int i = paramInt3 + -1;
    int j = i;
    if (j >= paramInt2)
    {
      Object localObject1 = (d)paramArrayList1.get(j);
      boolean bool = ((d)localObject1).b(paramInt1);
      if (!bool) {}
      Object localObject2;
      do
      {
        i = j + -1;
        j = i;
        break;
        localObject2 = (Boolean)paramArrayList2.get(j);
        bool = ((Boolean)localObject2).booleanValue();
        localObject3 = ((d)localObject1).r;
      } while (localObject3 == null);
      Object localObject3 = ((d)localObject1).r;
      int k = ((ArrayList)localObject3).size();
      Object localObject4;
      Object localObject5;
      label134:
      int m;
      if (bool)
      {
        localObject2 = ((d)localObject1).r;
        localObject1 = ((d)localObject1).s;
        localObject4 = localObject2;
        localObject5 = localObject1;
        i = 0;
        localObject1 = null;
        m = 0;
        label143:
        if (m < k)
        {
          localObject1 = (String)((ArrayList)localObject5).get(m);
          localObject2 = (String)((ArrayList)localObject4).get(m);
          localObject3 = (String)locala.remove(localObject2);
          if (localObject3 == null) {
            break label239;
          }
          locala.put(localObject1, localObject3);
        }
      }
      for (;;)
      {
        i = m + 1;
        m = i;
        break label143;
        break;
        localObject2 = ((d)localObject1).r;
        localObject1 = ((d)localObject1).s;
        localObject4 = localObject1;
        localObject5 = localObject2;
        break label134;
        label239:
        locala.put(localObject1, localObject2);
      }
    }
    return locala;
  }
  
  private static Object a(s params, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean)
  {
    if ((paramFragment1 == null) || (paramFragment2 == null))
    {
      localObject = null;
      return localObject;
    }
    if (paramBoolean) {}
    for (Object localObject = paramFragment2.getSharedElementReturnTransition();; localObject = paramFragment1.getSharedElementEnterTransition())
    {
      localObject = params.b(localObject);
      localObject = params.c(localObject);
      break;
    }
  }
  
  private static Object a(s params, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null)
    {
      localObject = null;
      return localObject;
    }
    if (paramBoolean) {}
    for (Object localObject = paramFragment.getReenterTransition();; localObject = paramFragment.getEnterTransition())
    {
      localObject = params.b(localObject);
      break;
    }
  }
  
  private static Object a(s params, ViewGroup paramViewGroup, View paramView, a parama, q.a parama1, ArrayList paramArrayList1, ArrayList paramArrayList2, Object paramObject1, Object paramObject2)
  {
    Object localObject1 = parama1.a;
    Fragment localFragment = parama1.d;
    Object localObject2;
    boolean bool1;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject2 = ((Fragment)localObject1).getView();
      bool1 = false;
      localObject3 = null;
      ((View)localObject2).setVisibility(0);
    }
    if ((localObject1 == null) || (localFragment == null))
    {
      bool1 = false;
      localObject3 = null;
      return localObject3;
    }
    boolean bool2 = parama1.b;
    boolean bool3 = parama.isEmpty();
    label81:
    Object localObject4;
    a locala;
    if (bool3)
    {
      bool3 = false;
      localObject2 = null;
      localObject4 = b(params, parama, localObject2, parama1);
      locala = c(params, parama, localObject2, parama1);
      bool1 = parama.isEmpty();
      if (!bool1) {
        break label179;
      }
      bool1 = false;
      localObject3 = null;
      if (localObject4 != null) {
        ((a)localObject4).clear();
      }
      if (locala != null) {
        locala.clear();
      }
    }
    for (;;)
    {
      if ((paramObject1 != null) || (paramObject2 != null) || (localObject3 != null)) {
        break label216;
      }
      bool1 = false;
      localObject3 = null;
      break;
      localObject2 = a(params, (Fragment)localObject1, localFragment, bool2);
      break label81;
      label179:
      localObject3 = parama.keySet();
      a(paramArrayList1, (a)localObject4, (Collection)localObject3);
      localObject3 = parama.values();
      a(paramArrayList2, locala, (Collection)localObject3);
      localObject3 = localObject2;
    }
    label216:
    bool3 = true;
    b((Fragment)localObject1, localFragment, bool2, (a)localObject4, bool3);
    Object localObject5;
    Rect localRect;
    View localView;
    if (localObject3 != null)
    {
      paramArrayList2.add(paramView);
      params.a(localObject3, paramView, paramArrayList1);
      boolean bool4 = parama1.e;
      d locald = parama1.f;
      localObject2 = params;
      localObject5 = paramObject2;
      a(params, localObject3, paramObject2, (a)localObject4, bool4, locald);
      localRect = new android/graphics/Rect;
      localRect.<init>();
      localView = b(locala, parama1, paramObject1, bool2);
      if (localView != null) {
        params.a(paramObject1, localRect);
      }
    }
    for (;;)
    {
      localObject5 = new android/support/v4/app/q$3;
      localObject4 = localObject1;
      localObject1 = params;
      ((q.3)localObject5).<init>((Fragment)localObject4, localFragment, bool2, locala, localView, params, localRect);
      z.a(paramViewGroup, (Runnable)localObject5);
      break;
      localRect = null;
      localView = null;
    }
  }
  
  private static Object a(s params, Object paramObject1, Object paramObject2, Object paramObject3, Fragment paramFragment, boolean paramBoolean)
  {
    boolean bool = true;
    if ((paramObject1 != null) && (paramObject2 != null) && (paramFragment != null))
    {
      if (paramBoolean) {
        bool = paramFragment.getAllowReturnTransitionOverlap();
      }
    }
    else {
      if (!bool) {
        break label55;
      }
    }
    label55:
    for (Object localObject = params.a(paramObject2, paramObject1, paramObject3);; localObject = params.b(paramObject2, paramObject1, paramObject3))
    {
      return localObject;
      bool = paramFragment.getAllowEnterTransitionOverlap();
      break;
    }
  }
  
  private static String a(a parama, String paramString)
  {
    int i = parama.size();
    int j = 0;
    String str = null;
    if (j < i)
    {
      Object localObject = parama.valueAt(j);
      boolean bool = paramString.equals(localObject);
      if (!bool) {}
    }
    for (str = (String)parama.keyAt(j);; str = null)
    {
      return str;
      j += 1;
      break;
      j = 0;
    }
  }
  
  private static void a(d paramd, d.a parama, SparseArray paramSparseArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    Fragment localFragment1 = parama.b;
    if (localFragment1 == null) {}
    int j;
    do
    {
      return;
      j = localFragment1.mContainerId;
    } while (j == 0);
    Object localObject1;
    int k;
    int m;
    label53:
    int i1;
    int i2;
    int i3;
    Object localObject2;
    if (paramBoolean1)
    {
      localObject1 = a;
      k = parama.a;
      m = localObject1[k];
      switch (m)
      {
      case 2: 
      default: 
        k = 0;
        i1 = 0;
        i2 = 0;
        i3 = 0;
        localObject1 = (q.a)paramSparseArray.get(j);
        if (i3 != 0)
        {
          localObject2 = a((q.a)localObject1, paramSparseArray, j);
          ((q.a)localObject2).a = localFragment1;
          ((q.a)localObject2).b = paramBoolean1;
          ((q.a)localObject2).c = paramd;
        }
        break;
      }
    }
    for (;;)
    {
      boolean bool1;
      if ((!paramBoolean2) && (k != 0))
      {
        if (localObject2 != null)
        {
          localObject1 = ((q.a)localObject2).d;
          if (localObject1 == localFragment1) {
            ((q.a)localObject2).d = null;
          }
        }
        localObject1 = paramd.a;
        k = localFragment1.mState;
        if (k < i)
        {
          k = ((n)localObject1).l;
          if (k >= i)
          {
            bool1 = paramd.t;
            if (!bool1)
            {
              ((n)localObject1).f(localFragment1);
              bool1 = false;
              i3 = 0;
              ((n)localObject1).a(localFragment1, i, 0, 0, false);
            }
          }
        }
      }
      if (i1 != 0) {
        if (localObject2 != null)
        {
          localObject1 = ((q.a)localObject2).d;
          if (localObject1 != null) {}
        }
        else
        {
          localObject1 = a((q.a)localObject2, paramSparseArray, j);
          ((q.a)localObject1).d = localFragment1;
          ((q.a)localObject1).e = paramBoolean1;
          ((q.a)localObject1).f = paramd;
        }
      }
      while ((!paramBoolean2) && (i2 != 0) && (localObject1 != null))
      {
        Fragment localFragment2 = ((q.a)localObject1).a;
        if (localFragment2 != localFragment1) {
          break;
        }
        ((q.a)localObject1).a = null;
        break;
        m = parama.a;
        break label53;
        boolean bool2;
        float f2;
        if (paramBoolean2)
        {
          bool2 = localFragment1.mHiddenChanged;
          if (bool2)
          {
            bool2 = localFragment1.mHidden;
            if (!bool2)
            {
              bool2 = localFragment1.mAdded;
              if (bool2)
              {
                bool2 = i;
                f2 = f1;
              }
            }
          }
        }
        for (;;)
        {
          bool1 = i;
          i1 = 0;
          i2 = 0;
          i3 = bool2;
          break;
          bool2 = false;
          localObject1 = null;
          f2 = 0.0F;
          continue;
          bool2 = localFragment1.mHidden;
        }
        if (paramBoolean2) {
          bool2 = localFragment1.mIsNewlyAdded;
        }
        for (;;)
        {
          bool1 = i;
          i1 = 0;
          i2 = 0;
          i3 = bool2;
          break;
          bool2 = localFragment1.mAdded;
          if (!bool2)
          {
            bool2 = localFragment1.mHidden;
            if (!bool2)
            {
              bool2 = i;
              f2 = f1;
              continue;
            }
          }
          bool2 = false;
          localObject1 = null;
          f2 = 0.0F;
        }
        if (paramBoolean2)
        {
          bool2 = localFragment1.mHiddenChanged;
          if (bool2)
          {
            bool2 = localFragment1.mAdded;
            if (bool2)
            {
              bool2 = localFragment1.mHidden;
              if (bool2)
              {
                bool2 = i;
                f2 = f1;
              }
            }
          }
        }
        for (;;)
        {
          bool1 = false;
          i1 = bool2;
          i2 = i;
          i3 = 0;
          break;
          bool2 = false;
          localObject1 = null;
          f2 = 0.0F;
          continue;
          bool2 = localFragment1.mAdded;
          if (bool2)
          {
            bool2 = localFragment1.mHidden;
            if (!bool2)
            {
              bool2 = i;
              f2 = f1;
              continue;
            }
          }
          bool2 = false;
          localObject1 = null;
          f2 = 0.0F;
        }
        boolean bool3;
        if (paramBoolean2)
        {
          bool2 = localFragment1.mAdded;
          if (!bool2)
          {
            localObject1 = localFragment1.mView;
            if (localObject1 != null)
            {
              localObject1 = localFragment1.mView;
              int n = ((View)localObject1).getVisibility();
              if (n == 0)
              {
                f2 = localFragment1.mPostponedAlpha;
                bool1 = false;
                bool3 = f2 < 0.0F;
                if (!bool3)
                {
                  bool3 = i;
                  f2 = f1;
                }
              }
            }
          }
        }
        for (;;)
        {
          bool1 = false;
          i1 = bool3;
          i2 = i;
          i3 = 0;
          break;
          bool3 = false;
          localObject1 = null;
          f2 = 0.0F;
          continue;
          bool3 = localFragment1.mAdded;
          if (bool3)
          {
            bool3 = localFragment1.mHidden;
            if (!bool3)
            {
              bool3 = i;
              f2 = f1;
              continue;
            }
          }
          bool3 = false;
          localObject1 = null;
          f2 = 0.0F;
        }
        localObject1 = localObject2;
      }
      localObject2 = localObject1;
    }
  }
  
  public static void a(d paramd, SparseArray paramSparseArray, boolean paramBoolean)
  {
    Object localObject = paramd.b;
    int i = ((ArrayList)localObject).size();
    int k;
    for (int j = 0; j < i; j = k)
    {
      localObject = (d.a)paramd.b.get(j);
      a(paramd, (d.a)localObject, paramSparseArray, false, paramBoolean);
      k = j + 1;
    }
  }
  
  private static void a(n paramn, int paramInt, q.a parama, View paramView, a parama1)
  {
    Object localObject1 = null;
    Object localObject2 = paramn;
    Object localObject3 = paramn.n;
    boolean bool1 = ((j)localObject3).a();
    if (bool1)
    {
      localObject3 = paramn.n;
      int i = paramInt;
      localObject3 = (ViewGroup)((j)localObject3).a(paramInt);
      localObject1 = localObject3;
    }
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject2 = parama;
      Object localObject4 = parama.a;
      localObject2 = parama.d;
      Object localObject5 = localObject2;
      localObject3 = a((Fragment)localObject2, (Fragment)localObject4);
      if (localObject3 != null)
      {
        localObject2 = parama;
        boolean bool2 = parama.b;
        boolean bool3 = bool2;
        boolean bool4 = parama.e;
        ArrayList localArrayList1 = new java/util/ArrayList;
        localArrayList1.<init>();
        ArrayList localArrayList2 = new java/util/ArrayList;
        localArrayList2.<init>();
        Object localObject6 = a((s)localObject3, (Fragment)localObject4, bool2);
        localObject2 = localObject5;
        Object localObject7 = b((s)localObject3, (Fragment)localObject5, bool4);
        Object localObject8 = paramView;
        Object localObject9 = a((s)localObject3, (ViewGroup)localObject1, paramView, parama1, parama, localArrayList2, localArrayList1, localObject6, localObject7);
        if ((localObject6 != null) || (localObject9 != null) || (localObject7 != null))
        {
          localObject2 = localObject5;
          ArrayList localArrayList3 = b((s)localObject3, localObject7, (Fragment)localObject5, localArrayList2, paramView);
          localObject2 = paramView;
          ArrayList localArrayList4 = b((s)localObject3, localObject6, (Fragment)localObject4, localArrayList1, paramView);
          int j = 4;
          localObject2 = localArrayList4;
          b(localArrayList4, j);
          Object localObject10 = a((s)localObject3, localObject6, localObject7, localObject9, (Fragment)localObject4, bool3);
          if (localObject10 != null)
          {
            localObject2 = localObject5;
            a((s)localObject3, localObject7, (Fragment)localObject5, localArrayList3);
            localObject8 = ((s)localObject3).a(localArrayList1);
            localObject4 = localObject3;
            localObject5 = localObject6;
            ((s)localObject3).a(localObject10, localObject6, localArrayList4, localObject7, localArrayList3, localObject9, localArrayList1);
            localObject2 = localObject10;
            ((s)localObject3).a((ViewGroup)localObject1, localObject10);
            localObject6 = localObject8;
            localObject7 = parama1;
            ((s)localObject3).a((View)localObject1, localArrayList2, localArrayList1, (ArrayList)localObject8, parama1);
            localObject1 = null;
            localObject2 = localArrayList4;
            b(localArrayList4, 0);
            ((s)localObject3).a(localObject9, localArrayList2, localArrayList1);
          }
        }
      }
    }
  }
  
  static void a(n paramn, ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramn.l;
    int j = 1;
    if (i < j) {}
    SparseArray localSparseArray;
    do
    {
      return;
      localSparseArray = new android/util/SparseArray;
      localSparseArray.<init>();
      int m = paramInt1;
      if (m < paramInt2)
      {
        localObject = (d)paramArrayList1.get(m);
        localBoolean = (Boolean)paramArrayList2.get(m);
        k = localBoolean.booleanValue();
        if (k != 0) {
          b((d)localObject, localSparseArray, paramBoolean);
        }
        for (;;)
        {
          i = m + 1;
          m = i;
          break;
          a((d)localObject, localSparseArray, paramBoolean);
        }
      }
      i = localSparseArray.size();
    } while (i == 0);
    View localView = new android/view/View;
    Object localObject = paramn.m.i();
    localView.<init>((Context)localObject);
    int n = localSparseArray.size();
    i = 0;
    localObject = null;
    int k = 0;
    Boolean localBoolean = null;
    label157:
    int i1;
    a locala;
    if (k < n)
    {
      i1 = localSparseArray.keyAt(k);
      locala = a(i1, paramArrayList1, paramArrayList2, paramInt1, paramInt2);
      localObject = (q.a)localSparseArray.valueAt(k);
      if (!paramBoolean) {
        break label227;
      }
      a(paramn, i1, (q.a)localObject, localView, locala);
    }
    for (;;)
    {
      i = k + 1;
      k = i;
      break label157;
      break;
      label227:
      b(paramn, i1, (q.a)localObject, localView, locala);
    }
  }
  
  private static void a(s params, ViewGroup paramViewGroup, Fragment paramFragment, View paramView, ArrayList paramArrayList1, Object paramObject1, ArrayList paramArrayList2, Object paramObject2, ArrayList paramArrayList3)
  {
    q.2 local2 = new android/support/v4/app/q$2;
    local2.<init>(paramObject1, params, paramView, paramFragment, paramArrayList1, paramArrayList2, paramArrayList3, paramObject2);
    z.a(paramViewGroup, local2);
  }
  
  private static void a(s params, Object paramObject, Fragment paramFragment, ArrayList paramArrayList)
  {
    if ((paramFragment != null) && (paramObject != null))
    {
      boolean bool = paramFragment.mAdded;
      if (bool)
      {
        bool = paramFragment.mHidden;
        if (bool)
        {
          bool = paramFragment.mHiddenChanged;
          if (bool)
          {
            bool = true;
            paramFragment.setHideReplaced(bool);
            Object localObject = paramFragment.getView();
            params.b(paramObject, (View)localObject, paramArrayList);
            localObject = paramFragment.mContainer;
            q.1 local1 = new android/support/v4/app/q$1;
            local1.<init>(paramArrayList);
            z.a((View)localObject, local1);
          }
        }
      }
    }
  }
  
  private static void a(s params, Object paramObject1, Object paramObject2, a parama, boolean paramBoolean, d paramd)
  {
    Object localObject = paramd.r;
    if (localObject != null)
    {
      localObject = paramd.r;
      boolean bool = ((ArrayList)localObject).isEmpty();
      if (!bool) {
        if (!paramBoolean) {
          break label80;
        }
      }
    }
    label80:
    for (localObject = (String)paramd.s.get(0);; localObject = (String)paramd.r.get(0))
    {
      localObject = (View)parama.get(localObject);
      params.a(paramObject1, (View)localObject);
      if (paramObject2 != null) {
        params.a(paramObject2, (View)localObject);
      }
      return;
    }
  }
  
  private static void a(a parama1, a parama2)
  {
    int i = parama1.size() + -1;
    int j;
    for (int k = i; k >= 0; k = j)
    {
      String str = (String)parama1.valueAt(k);
      boolean bool = parama2.containsKey(str);
      if (!bool) {
        parama1.removeAt(k);
      }
      j = k + -1;
    }
  }
  
  private static void a(ArrayList paramArrayList, a parama, Collection paramCollection)
  {
    int i = parama.size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      View localView = (View)parama.valueAt(j);
      String str = android.support.v4.view.r.m(localView);
      boolean bool = paramCollection.contains(str);
      if (bool) {
        paramArrayList.add(localView);
      }
      i = j + -1;
    }
  }
  
  private static boolean a(s params, List paramList)
  {
    boolean bool1 = false;
    int i = paramList.size();
    int j = 0;
    if (j < i)
    {
      Object localObject = paramList.get(j);
      boolean bool2 = params.a(localObject);
      if (bool2) {}
    }
    for (;;)
    {
      return bool1;
      j += 1;
      break;
      bool1 = true;
    }
  }
  
  private static a b(s params, a parama, Object paramObject, q.a parama1)
  {
    boolean bool1 = parama.isEmpty();
    if ((bool1) || (paramObject == null))
    {
      parama.clear();
      bool1 = false;
    }
    a locala;
    for (Object localObject1 = null;; localObject1 = locala)
    {
      return (a)localObject1;
      localObject1 = parama1.d;
      locala = new android/support/v4/h/a;
      locala.<init>();
      Object localObject2 = ((Fragment)localObject1).getView();
      params.a(locala, (View)localObject2);
      Object localObject3 = parama1.f;
      boolean bool2 = parama1.e;
      int i;
      int j;
      if (bool2)
      {
        localObject2 = ((Fragment)localObject1).getEnterTransitionCallback();
        localObject3 = ((d)localObject3).s;
        localObject1 = localObject2;
        locala.retainAll((Collection)localObject3);
        if (localObject1 == null) {
          break label255;
        }
        ((ab)localObject1).a((List)localObject3, locala);
        i = ((ArrayList)localObject3).size() + -1;
        j = i;
        label129:
        if (j < 0) {
          continue;
        }
        localObject1 = (String)((ArrayList)localObject3).get(j);
        localObject2 = (View)locala.get(localObject1);
        if (localObject2 != null) {
          break label204;
        }
        parama.remove(localObject1);
      }
      for (;;)
      {
        i = j + -1;
        j = i;
        break label129;
        localObject2 = ((Fragment)localObject1).getExitTransitionCallback();
        localObject3 = ((d)localObject3).r;
        localObject1 = localObject2;
        break;
        label204:
        String str = android.support.v4.view.r.m((View)localObject2);
        boolean bool3 = ((String)localObject1).equals(str);
        if (!bool3)
        {
          localObject1 = (String)parama.remove(localObject1);
          localObject2 = android.support.v4.view.r.m((View)localObject2);
          parama.put(localObject2, localObject1);
        }
      }
      label255:
      localObject1 = locala.keySet();
      parama.retainAll((Collection)localObject1);
    }
  }
  
  private static View b(a parama, q.a parama1, Object paramObject, boolean paramBoolean)
  {
    Object localObject = parama1.c;
    if ((paramObject != null) && (parama != null))
    {
      ArrayList localArrayList = ((d)localObject).r;
      if (localArrayList != null)
      {
        localArrayList = ((d)localObject).r;
        boolean bool = localArrayList.isEmpty();
        if (!bool) {
          if (paramBoolean) {
            localObject = (String)((d)localObject).r.get(0);
          }
        }
      }
    }
    for (localObject = (View)parama.get(localObject);; localObject = null)
    {
      return (View)localObject;
      localObject = (String)((d)localObject).s.get(0);
      break;
    }
  }
  
  private static Object b(s params, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null)
    {
      localObject = null;
      return localObject;
    }
    if (paramBoolean) {}
    for (Object localObject = paramFragment.getReturnTransition();; localObject = paramFragment.getExitTransition())
    {
      localObject = params.b(localObject);
      break;
    }
  }
  
  private static Object b(s params, ViewGroup paramViewGroup, View paramView, a parama, q.a parama1, ArrayList paramArrayList1, ArrayList paramArrayList2, Object paramObject1, Object paramObject2)
  {
    Fragment localFragment1 = parama1.a;
    Fragment localFragment2 = parama1.d;
    boolean bool1;
    if ((localFragment1 == null) || (localFragment2 == null))
    {
      bool1 = false;
      localObject1 = null;
      return localObject1;
    }
    boolean bool2 = parama1.b;
    boolean bool3 = parama.isEmpty();
    Object localObject2;
    label57:
    Object localObject3;
    if (bool3)
    {
      bool3 = false;
      localObject2 = null;
      localObject3 = b(params, parama, localObject2, parama1);
      bool1 = parama.isEmpty();
      if (!bool1) {
        break label124;
      }
      bool1 = false;
    }
    for (Object localObject1 = null;; localObject1 = localObject2)
    {
      if ((paramObject1 != null) || (paramObject2 != null) || (localObject1 != null)) {
        break label146;
      }
      bool1 = false;
      localObject1 = null;
      break;
      localObject2 = a(params, localFragment1, localFragment2, bool2);
      break label57;
      label124:
      localObject1 = ((a)localObject3).values();
      paramArrayList1.addAll((Collection)localObject1);
    }
    label146:
    bool3 = true;
    b(localFragment1, localFragment2, bool2, (a)localObject3, bool3);
    Rect localRect;
    Object localObject4;
    Object localObject5;
    if (localObject1 != null)
    {
      localRect = new android/graphics/Rect;
      localRect.<init>();
      params.a(localObject1, paramView, paramArrayList1);
      boolean bool4 = parama1.e;
      localObject4 = parama1.f;
      localObject2 = params;
      localObject5 = paramObject2;
      a(params, localObject1, paramObject2, (a)localObject3, bool4, (d)localObject4);
      if (paramObject1 != null) {
        params.a(paramObject1, localRect);
      }
    }
    for (;;)
    {
      localObject5 = new android/support/v4/app/q$4;
      localObject3 = params;
      localObject4 = localObject1;
      ((q.4)localObject5).<init>(params, parama, localObject1, parama1, paramArrayList2, paramView, localFragment1, localFragment2, bool2, paramArrayList1, paramObject1, localRect);
      z.a(paramViewGroup, (Runnable)localObject5);
      break;
      localRect = null;
    }
  }
  
  private static ArrayList b(s params, Object paramObject, Fragment paramFragment, ArrayList paramArrayList, View paramView)
  {
    ArrayList localArrayList = null;
    if (paramObject != null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      View localView = paramFragment.getView();
      if (localView != null) {
        params.a(localArrayList, localView);
      }
      if (paramArrayList != null) {
        localArrayList.removeAll(paramArrayList);
      }
      boolean bool = localArrayList.isEmpty();
      if (!bool)
      {
        localArrayList.add(paramView);
        params.a(paramObject, localArrayList);
      }
    }
    return localArrayList;
  }
  
  private static void b(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean1, a parama, boolean paramBoolean2)
  {
    int i = 0;
    ab localab1;
    ab localab2;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    int j;
    if (paramBoolean1)
    {
      localab1 = paramFragment2.getEnterTransitionCallback();
      localab2 = localab1;
      if (localab2 == null) {
        break label137;
      }
      localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>();
      localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>();
      if (parama != null) {
        break label113;
      }
      j = 0;
      localab1 = null;
    }
    for (;;)
    {
      if (i >= j) {
        break label122;
      }
      Object localObject = parama.keyAt(i);
      localArrayList2.add(localObject);
      localObject = parama.valueAt(i);
      localArrayList1.add(localObject);
      i += 1;
      continue;
      localab1 = paramFragment1.getEnterTransitionCallback();
      localab2 = localab1;
      break;
      label113:
      j = parama.size();
    }
    label122:
    if (paramBoolean2) {
      localab2.a(localArrayList2, localArrayList1, null);
    }
    for (;;)
    {
      label137:
      return;
      localab2.b(localArrayList2, localArrayList1, null);
    }
  }
  
  public static void b(d paramd, SparseArray paramSparseArray, boolean paramBoolean)
  {
    Object localObject = paramd.a.n;
    boolean bool1 = ((j)localObject).a();
    if (!bool1) {}
    for (;;)
    {
      return;
      localObject = paramd.b;
      int i = ((ArrayList)localObject).size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        localObject = (d.a)paramd.b.get(j);
        boolean bool2 = true;
        a(paramd, (d.a)localObject, paramSparseArray, bool2, paramBoolean);
        i = j + -1;
      }
    }
  }
  
  private static void b(n paramn, int paramInt, q.a parama, View paramView, a parama1)
  {
    Object localObject1 = null;
    Object localObject2 = paramn.n;
    boolean bool1 = ((j)localObject2).a();
    if (bool1)
    {
      localObject2 = (ViewGroup)paramn.n.a(paramInt);
      localObject1 = localObject2;
    }
    if (localObject1 == null) {}
    Fragment localFragment;
    Object localObject3;
    boolean bool2;
    Object localObject4;
    Object localObject5;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    Object localObject6;
    do
    {
      do
      {
        return;
        localFragment = parama.a;
        localObject3 = parama.d;
        localObject2 = a((Fragment)localObject3, localFragment);
      } while (localObject2 == null);
      bool2 = parama.b;
      boolean bool3 = parama.e;
      localObject4 = a((s)localObject2, localFragment, bool2);
      localObject5 = b((s)localObject2, (Fragment)localObject3, bool3);
      localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>();
      localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>();
      localObject6 = b((s)localObject2, (ViewGroup)localObject1, paramView, parama1, parama, localArrayList1, localArrayList2, localObject4, localObject5);
    } while ((localObject4 == null) && (localObject6 == null) && (localObject5 == null));
    ArrayList localArrayList3 = b((s)localObject2, localObject5, (Fragment)localObject3, localArrayList1, paramView);
    if (localArrayList3 != null)
    {
      bool2 = localArrayList3.isEmpty();
      if (!bool2) {
        break label321;
      }
    }
    label321:
    for (Object localObject7 = null;; localObject7 = localObject5)
    {
      ((s)localObject2).b(localObject4, paramView);
      boolean bool4 = parama.b;
      localObject5 = localObject2;
      localObject3 = localObject4;
      Object localObject8 = a((s)localObject2, localObject4, localObject7, localObject6, localFragment, bool4);
      if (localObject8 == null) {
        break;
      }
      ArrayList localArrayList4 = new java/util/ArrayList;
      localArrayList4.<init>();
      ((s)localObject2).a(localObject8, localObject4, localArrayList4, localObject7, localArrayList3, localObject6, localArrayList2);
      a((s)localObject2, (ViewGroup)localObject1, localFragment, paramView, localArrayList2, localObject4, localArrayList4, localObject7, localArrayList3);
      ((s)localObject2).a((View)localObject1, localArrayList2, parama1);
      ((s)localObject2).a((ViewGroup)localObject1, localObject8);
      ((s)localObject2).a((ViewGroup)localObject1, localArrayList2, parama1);
      break;
    }
  }
  
  private static void b(ArrayList paramArrayList, int paramInt)
  {
    if (paramArrayList == null) {}
    for (;;)
    {
      return;
      int i = paramArrayList.size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        View localView = (View)paramArrayList.get(j);
        localView.setVisibility(paramInt);
        i = j + -1;
      }
    }
  }
  
  private static a c(s params, a parama, Object paramObject, q.a parama1)
  {
    Object localObject1 = parama1.a;
    Object localObject2 = ((Fragment)localObject1).getView();
    boolean bool1 = parama.isEmpty();
    int i;
    if ((bool1) || (paramObject == null) || (localObject2 == null))
    {
      parama.clear();
      i = 0;
    }
    a locala;
    for (localObject1 = null;; localObject1 = locala)
    {
      return (a)localObject1;
      locala = new android/support/v4/h/a;
      locala.<init>();
      params.a(locala, (View)localObject2);
      d locald = parama1.c;
      boolean bool2 = parama1.b;
      ArrayList localArrayList;
      int j;
      if (bool2)
      {
        localObject2 = ((Fragment)localObject1).getExitTransitionCallback();
        localArrayList = locald.r;
        localObject1 = localObject2;
        if (localArrayList != null)
        {
          locala.retainAll(localArrayList);
          localObject2 = parama.values();
          locala.retainAll((Collection)localObject2);
        }
        if (localObject1 == null) {
          break label294;
        }
        ((ab)localObject1).a(localArrayList, locala);
        i = localArrayList.size() + -1;
        j = i;
        label153:
        if (j < 0) {
          continue;
        }
        localObject1 = (String)localArrayList.get(j);
        localObject2 = (View)locala.get(localObject1);
        if (localObject2 != null) {
          break label241;
        }
        localObject1 = a(parama, (String)localObject1);
        if (localObject1 != null) {
          parama.remove(localObject1);
        }
      }
      for (;;)
      {
        i = j + -1;
        j = i;
        break label153;
        localObject2 = ((Fragment)localObject1).getEnterTransitionCallback();
        localArrayList = locald.s;
        localObject1 = localObject2;
        break;
        label241:
        String str = android.support.v4.view.r.m((View)localObject2);
        boolean bool3 = ((String)localObject1).equals(str);
        if (!bool3)
        {
          localObject1 = a(parama, (String)localObject1);
          if (localObject1 != null)
          {
            localObject2 = android.support.v4.view.r.m((View)localObject2);
            parama.put(localObject1, localObject2);
          }
        }
      }
      label294:
      a(parama, locala);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */