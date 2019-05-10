package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.support.v4.h.f;
import android.support.v4.view.r;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class u
  implements Cloneable
{
  private static final int[] g;
  private static final l h;
  private static ThreadLocal z;
  private ViewGroup A;
  private ArrayList B;
  private int C;
  private boolean D;
  private boolean E;
  private ArrayList F;
  private ArrayList G;
  private u.b H;
  private android.support.v4.h.a I;
  private l J;
  long a;
  ArrayList b;
  ArrayList c;
  y d;
  boolean e;
  x f;
  private String i;
  private long j;
  private TimeInterpolator k;
  private ArrayList l;
  private ArrayList m;
  private ArrayList n;
  private ArrayList o;
  private ArrayList p;
  private ArrayList q;
  private ArrayList r;
  private ArrayList s;
  private ArrayList t;
  private ab u;
  private ab v;
  private int[] w;
  private ArrayList x;
  private ArrayList y;
  
  static
  {
    Object localObject = new int[4];
    localObject[0] = 2;
    localObject[1] = 1;
    localObject[2] = 3;
    localObject[3] = 4;
    g = (int[])localObject;
    localObject = new android/support/transition/u$1;
    ((u.1)localObject).<init>();
    h = (l)localObject;
    localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    z = (ThreadLocal)localObject;
  }
  
  public u()
  {
    Object localObject = getClass().getName();
    this.i = ((String)localObject);
    this.j = l1;
    this.a = l1;
    this.k = null;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.b = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.c = ((ArrayList)localObject);
    this.l = null;
    this.m = null;
    this.n = null;
    this.o = null;
    this.p = null;
    this.q = null;
    this.r = null;
    this.s = null;
    this.t = null;
    localObject = new android/support/transition/ab;
    ((ab)localObject).<init>();
    this.u = ((ab)localObject);
    localObject = new android/support/transition/ab;
    ((ab)localObject).<init>();
    this.v = ((ab)localObject);
    this.d = null;
    localObject = g;
    this.w = ((int[])localObject);
    this.A = null;
    this.e = false;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.B = ((ArrayList)localObject);
    this.C = 0;
    this.D = false;
    this.E = false;
    this.F = null;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.G = ((ArrayList)localObject);
    localObject = h;
    this.J = ((l)localObject);
  }
  
  private void a(Animator paramAnimator, android.support.v4.h.a parama)
  {
    if (paramAnimator != null)
    {
      u.2 local2 = new android/support/transition/u$2;
      local2.<init>(this, parama);
      paramAnimator.addListener(local2);
      a(paramAnimator);
    }
  }
  
  private void a(ab paramab1, ab paramab2)
  {
    android.support.v4.h.a locala1 = new android/support/v4/h/a;
    android.support.v4.h.a locala2 = paramab1.a;
    locala1.<init>(locala2);
    android.support.v4.h.a locala3 = new android/support/v4/h/a;
    locala2 = paramab2.a;
    locala3.<init>(locala2);
    int i1 = 0;
    locala2 = null;
    Object localObject1 = this.w;
    int i2 = localObject1.length;
    if (i1 < i2)
    {
      localObject1 = this.w;
      i2 = localObject1[i1];
      switch (i2)
      {
      }
      for (;;)
      {
        i1 += 1;
        break;
        a(locala1, locala3);
        continue;
        localObject1 = paramab1.d;
        Object localObject2 = paramab2.d;
        a(locala1, locala3, (android.support.v4.h.a)localObject1, (android.support.v4.h.a)localObject2);
        continue;
        localObject1 = paramab1.b;
        localObject2 = paramab2.b;
        a(locala1, locala3, (SparseArray)localObject1, (SparseArray)localObject2);
        continue;
        localObject1 = paramab1.c;
        localObject2 = paramab2.c;
        a(locala1, locala3, (f)localObject1, (f)localObject2);
      }
    }
    b(locala1, locala3);
  }
  
  private static void a(ab paramab, View paramView, aa paramaa)
  {
    Object localObject1 = paramab.a;
    ((android.support.v4.h.a)localObject1).put(paramView, paramaa);
    int i1 = paramView.getId();
    Object localObject2;
    label99:
    long l1;
    int i2;
    if (i1 >= 0)
    {
      localObject2 = paramab.b;
      int i3 = ((SparseArray)localObject2).indexOfKey(i1);
      if (i3 >= 0)
      {
        localObject2 = paramab.b;
        ((SparseArray)localObject2).put(i1, null);
      }
    }
    else
    {
      localObject1 = r.m(paramView);
      boolean bool2;
      if (localObject1 != null)
      {
        localObject2 = paramab.d;
        bool2 = ((android.support.v4.h.a)localObject2).containsKey(localObject1);
        if (!bool2) {
          break label234;
        }
        localObject2 = paramab.d;
        ((android.support.v4.h.a)localObject2).put(localObject1, null);
      }
      localObject1 = paramView.getParent();
      boolean bool1 = localObject1 instanceof ListView;
      if (bool1)
      {
        localObject1 = (ListView)paramView.getParent();
        localObject2 = ((ListView)localObject1).getAdapter();
        bool2 = ((ListAdapter)localObject2).hasStableIds();
        if (bool2)
        {
          int i4 = ((ListView)localObject1).getPositionForView(paramView);
          l1 = ((ListView)localObject1).getItemIdAtPosition(i4);
          localObject1 = paramab.c;
          i2 = ((f)localObject1).c(l1);
          if (i2 < 0) {
            break label251;
          }
          localObject1 = (View)paramab.c.a(l1);
          if (localObject1 != null)
          {
            i4 = 0;
            localObject2 = null;
            r.a((View)localObject1, false);
            localObject1 = paramab.c;
            ((f)localObject1).b(l1, null);
          }
        }
      }
    }
    for (;;)
    {
      return;
      localObject2 = paramab.b;
      ((SparseArray)localObject2).put(i2, paramView);
      break;
      label234:
      localObject2 = paramab.d;
      ((android.support.v4.h.a)localObject2).put(localObject1, paramView);
      break label99;
      label251:
      i2 = 1;
      r.a(paramView, i2);
      localObject1 = paramab.c;
      ((f)localObject1).b(l1, paramView);
    }
  }
  
  private void a(android.support.v4.h.a parama1, android.support.v4.h.a parama2)
  {
    int i1 = parama1.size() + -1;
    for (int i2 = i1; i2 >= 0; i2 = i1)
    {
      Object localObject1 = (View)parama1.keyAt(i2);
      if (localObject1 != null)
      {
        boolean bool = a((View)localObject1);
        if (bool)
        {
          localObject1 = (aa)parama2.remove(localObject1);
          if (localObject1 != null)
          {
            Object localObject2 = ((aa)localObject1).b;
            if (localObject2 != null)
            {
              localObject2 = ((aa)localObject1).b;
              bool = a((View)localObject2);
              if (bool)
              {
                localObject2 = (aa)parama1.removeAt(i2);
                ArrayList localArrayList = this.x;
                localArrayList.add(localObject2);
                localObject2 = this.y;
                ((ArrayList)localObject2).add(localObject1);
              }
            }
          }
        }
      }
      i1 = i2 + -1;
    }
  }
  
  private void a(android.support.v4.h.a parama1, android.support.v4.h.a parama2, android.support.v4.h.a parama3, android.support.v4.h.a parama4)
  {
    int i1 = parama3.size();
    int i2 = 0;
    View localView = null;
    for (int i3 = 0; i3 < i1; i3 = i2)
    {
      localView = (View)parama3.valueAt(i3);
      if (localView != null)
      {
        boolean bool1 = a(localView);
        if (bool1)
        {
          Object localObject1 = parama3.keyAt(i3);
          localObject1 = (View)parama4.get(localObject1);
          if (localObject1 != null)
          {
            boolean bool2 = a((View)localObject1);
            if (bool2)
            {
              Object localObject2 = (aa)parama1.get(localView);
              aa localaa = (aa)parama2.get(localObject1);
              if ((localObject2 != null) && (localaa != null))
              {
                ArrayList localArrayList = this.x;
                localArrayList.add(localObject2);
                localObject2 = this.y;
                ((ArrayList)localObject2).add(localaa);
                parama1.remove(localView);
                parama2.remove(localObject1);
              }
            }
          }
        }
      }
      i2 = i3 + 1;
    }
  }
  
  private void a(android.support.v4.h.a parama1, android.support.v4.h.a parama2, f paramf1, f paramf2)
  {
    int i1 = paramf1.b();
    int i2 = 0;
    View localView1 = null;
    for (int i3 = 0; i3 < i1; i3 = i2)
    {
      localView1 = (View)paramf1.c(i3);
      if (localView1 != null)
      {
        boolean bool1 = a(localView1);
        if (bool1)
        {
          long l1 = paramf1.b(i3);
          View localView2 = (View)paramf2.a(l1);
          if (localView2 != null)
          {
            boolean bool2 = a(localView2);
            if (bool2)
            {
              Object localObject = (aa)parama1.get(localView1);
              aa localaa = (aa)parama2.get(localView2);
              if ((localObject != null) && (localaa != null))
              {
                ArrayList localArrayList = this.x;
                localArrayList.add(localObject);
                localObject = this.y;
                ((ArrayList)localObject).add(localaa);
                parama1.remove(localView1);
                parama2.remove(localView2);
              }
            }
          }
        }
      }
      i2 = i3 + 1;
    }
  }
  
  private void a(android.support.v4.h.a parama1, android.support.v4.h.a parama2, SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    int i1 = paramSparseArray1.size();
    int i2 = 0;
    View localView1 = null;
    for (int i3 = 0; i3 < i1; i3 = i2)
    {
      localView1 = (View)paramSparseArray1.valueAt(i3);
      if (localView1 != null)
      {
        boolean bool1 = a(localView1);
        if (bool1)
        {
          int i4 = paramSparseArray1.keyAt(i3);
          View localView2 = (View)paramSparseArray2.get(i4);
          if (localView2 != null)
          {
            boolean bool2 = a(localView2);
            if (bool2)
            {
              Object localObject = (aa)parama1.get(localView1);
              aa localaa = (aa)parama2.get(localView2);
              if ((localObject != null) && (localaa != null))
              {
                ArrayList localArrayList = this.x;
                localArrayList.add(localObject);
                localObject = this.y;
                ((ArrayList)localObject).add(localaa);
                parama1.remove(localView1);
                parama2.remove(localView2);
              }
            }
          }
        }
      }
      i2 = i3 + 1;
    }
  }
  
  private static boolean a(aa paramaa1, aa paramaa2, String paramString)
  {
    boolean bool1 = true;
    Object localObject1 = paramaa1.a.get(paramString);
    Object localObject2 = paramaa2.a.get(paramString);
    if ((localObject1 == null) && (localObject2 == null)) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if ((localObject1 != null) && (localObject2 != null))
      {
        boolean bool2 = localObject1.equals(localObject2);
        if (bool2) {
          bool1 = false;
        }
      }
    }
  }
  
  private void b(android.support.v4.h.a parama1, android.support.v4.h.a parama2)
  {
    int i1 = 0;
    int i2 = 0;
    Object localObject1 = null;
    int i3;
    Object localObject2;
    for (;;)
    {
      i3 = parama1.size();
      if (i2 >= i3) {
        break;
      }
      localObject2 = (aa)parama1.valueAt(i2);
      Object localObject3 = ((aa)localObject2).b;
      boolean bool2 = a((View)localObject3);
      if (bool2)
      {
        localObject3 = this.x;
        ((ArrayList)localObject3).add(localObject2);
        localObject2 = this.y;
        ((ArrayList)localObject2).add(null);
      }
      i3 = i2 + 1;
      i2 = i3;
    }
    for (;;)
    {
      i3 = parama2.size();
      if (i1 >= i3) {
        break;
      }
      localObject2 = (aa)parama2.valueAt(i1);
      localObject1 = ((aa)localObject2).b;
      boolean bool1 = a((View)localObject1);
      if (bool1)
      {
        localObject1 = this.y;
        ((ArrayList)localObject1).add(localObject2);
        localObject2 = this.x;
        ((ArrayList)localObject2).add(null);
      }
      i1 += 1;
    }
  }
  
  private void c(View paramView, boolean paramBoolean)
  {
    int i1 = 0;
    View localView = null;
    if (paramView == null) {}
    int i2;
    Object localObject2;
    boolean bool1;
    do
    {
      do
      {
        return;
        i2 = paramView.getId();
        localObject1 = this.n;
        if (localObject1 == null) {
          break;
        }
        localObject1 = this.n;
        localObject2 = Integer.valueOf(i2);
        bool1 = ((ArrayList)localObject1).contains(localObject2);
      } while (bool1);
      localObject1 = this.o;
      if (localObject1 == null) {
        break;
      }
      localObject1 = this.o;
      bool1 = ((ArrayList)localObject1).contains(paramView);
    } while (bool1);
    Object localObject1 = this.p;
    int i6;
    if (localObject1 != null)
    {
      localObject1 = this.p;
      int i5 = ((ArrayList)localObject1).size();
      i6 = 0;
      localObject2 = null;
      for (;;)
      {
        if (i6 >= i5) {
          break label161;
        }
        localObject1 = (Class)this.p.get(i6);
        bool1 = ((Class)localObject1).isInstance(paramView);
        if (bool1) {
          break;
        }
        int i3 = i6 + 1;
        i6 = i3;
      }
    }
    label161:
    localObject1 = paramView.getParent();
    boolean bool2 = localObject1 instanceof ViewGroup;
    if (bool2)
    {
      localObject1 = new android/support/transition/aa;
      ((aa)localObject1).<init>();
      ((aa)localObject1).b = paramView;
      if (!paramBoolean) {
        break label399;
      }
      a((aa)localObject1);
      label205:
      localObject2 = ((aa)localObject1).c;
      ((ArrayList)localObject2).add(this);
      c((aa)localObject1);
      if (!paramBoolean) {
        break label408;
      }
      localObject2 = this.u;
      a((ab)localObject2, paramView, (aa)localObject1);
    }
    for (;;)
    {
      bool2 = paramView instanceof ViewGroup;
      if (!bool2) {
        break;
      }
      localObject1 = this.r;
      if (localObject1 != null)
      {
        localObject1 = this.r;
        localObject2 = Integer.valueOf(i2);
        bool2 = ((ArrayList)localObject1).contains(localObject2);
        if (bool2) {
          break;
        }
      }
      localObject1 = this.s;
      if (localObject1 != null)
      {
        localObject1 = this.s;
        bool2 = ((ArrayList)localObject1).contains(paramView);
        if (bool2) {
          break;
        }
      }
      localObject1 = this.t;
      if (localObject1 == null) {
        break label425;
      }
      localObject1 = this.t;
      i2 = ((ArrayList)localObject1).size();
      i6 = 0;
      localObject2 = null;
      for (;;)
      {
        if (i6 >= i2) {
          break label425;
        }
        localObject1 = (Class)this.t.get(i6);
        bool2 = ((Class)localObject1).isInstance(paramView);
        if (bool2) {
          break;
        }
        i4 = i6 + 1;
        i6 = i4;
      }
      label399:
      b((aa)localObject1);
      break label205;
      label408:
      localObject2 = this.v;
      a((ab)localObject2, paramView, (aa)localObject1);
    }
    label425:
    paramView = (ViewGroup)paramView;
    int i4 = 0;
    localObject1 = null;
    for (;;)
    {
      i1 = paramView.getChildCount();
      if (i4 >= i1) {
        break;
      }
      localView = paramView.getChildAt(i4);
      c(localView, paramBoolean);
      i4 += 1;
    }
  }
  
  private static android.support.v4.h.a o()
  {
    android.support.v4.h.a locala = (android.support.v4.h.a)z.get();
    if (locala == null)
    {
      locala = new android/support/v4/h/a;
      locala.<init>();
      ThreadLocal localThreadLocal = z;
      localThreadLocal.set(locala);
    }
    return locala;
  }
  
  public Animator a(ViewGroup paramViewGroup, aa paramaa1, aa paramaa2)
  {
    return null;
  }
  
  public aa a(View paramView, boolean paramBoolean)
  {
    Object localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d.a(paramView, paramBoolean);
      return (aa)localObject;
    }
    if (paramBoolean) {}
    for (localObject = this.u;; localObject = this.v)
    {
      localObject = (aa)((ab)localObject).a.get(paramView);
      break;
    }
  }
  
  public u a(long paramLong)
  {
    this.a = paramLong;
    return this;
  }
  
  public u a(TimeInterpolator paramTimeInterpolator)
  {
    this.k = paramTimeInterpolator;
    return this;
  }
  
  public u a(u.c paramc)
  {
    ArrayList localArrayList = this.F;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.F = localArrayList;
    }
    this.F.add(paramc);
    return this;
  }
  
  String a(String paramString)
  {
    long l1 = -1;
    int i1 = 0;
    String str = null;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(paramString);
    Object localObject2 = getClass().getSimpleName();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("@");
    localObject2 = Integer.toHexString(hashCode());
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = ": ";
    localObject1 = (String)localObject2;
    long l2 = this.a;
    boolean bool = l2 < l1;
    if (bool)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append("dur(");
      l2 = this.a;
      localObject1 = ((StringBuilder)localObject1).append(l2);
      localObject2 = ") ";
      localObject1 = (String)localObject2;
    }
    l2 = this.j;
    bool = l2 < l1;
    if (bool)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append("dly(");
      l2 = this.j;
      localObject1 = ((StringBuilder)localObject1).append(l2);
      localObject2 = ") ";
      localObject1 = (String)localObject2;
    }
    localObject2 = this.k;
    if (localObject2 != null)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append("interp(");
      localObject2 = this.k;
      localObject1 = ((StringBuilder)localObject1).append(localObject2);
      localObject2 = ") ";
      localObject1 = (String)localObject2;
    }
    localObject2 = this.b;
    int i2 = ((ArrayList)localObject2).size();
    if (i2 <= 0)
    {
      localObject2 = this.c;
      i2 = ((ArrayList)localObject2).size();
      if (i2 <= 0) {}
    }
    else
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = (String)localObject1 + "tgts(";
      localObject2 = this.b;
      i2 = ((ArrayList)localObject2).size();
      if (i2 > 0)
      {
        localObject2 = localObject1;
        i3 = 0;
        localObject1 = null;
        for (;;)
        {
          Object localObject3 = this.b;
          int i4 = ((ArrayList)localObject3).size();
          if (i3 >= i4) {
            break;
          }
          if (i3 > 0)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
            localObject3 = ", ";
            localObject2 = (String)localObject3;
          }
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
          localObject3 = this.b.get(i3);
          localObject2 = localObject3;
          i3 += 1;
        }
      }
      localObject2 = localObject1;
      localObject1 = this.c;
      int i3 = ((ArrayList)localObject1).size();
      if (i3 > 0) {
        for (;;)
        {
          localObject1 = this.c;
          i3 = ((ArrayList)localObject1).size();
          if (i1 >= i3) {
            break;
          }
          if (i1 > 0)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", ");
            localObject2 = ((StringBuilder)localObject1).toString();
          }
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = this.c.get(i1);
          localObject1 = ((StringBuilder)localObject1).append(localObject2);
          localObject2 = ((StringBuilder)localObject1).toString();
          i1 += 1;
        }
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      str = ")";
      localObject1 = str;
    }
    return (String)localObject1;
  }
  
  protected void a(Animator paramAnimator)
  {
    long l1 = 0L;
    if (paramAnimator == null) {
      k();
    }
    for (;;)
    {
      return;
      long l2 = b();
      boolean bool = l2 < l1;
      if (!bool)
      {
        l2 = b();
        paramAnimator.setDuration(l2);
      }
      l2 = c();
      bool = l2 < l1;
      if (!bool)
      {
        l2 = c();
        paramAnimator.setStartDelay(l2);
      }
      Object localObject = d();
      if (localObject != null)
      {
        localObject = d();
        paramAnimator.setInterpolator((TimeInterpolator)localObject);
      }
      localObject = new android/support/transition/u$3;
      ((u.3)localObject).<init>(this);
      paramAnimator.addListener((Animator.AnimatorListener)localObject);
      paramAnimator.start();
    }
  }
  
  public abstract void a(aa paramaa);
  
  public void a(u.b paramb)
  {
    this.H = paramb;
  }
  
  void a(ViewGroup paramViewGroup)
  {
    boolean bool1 = true;
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.x = ((ArrayList)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.y = ((ArrayList)localObject1);
    localObject1 = this.u;
    Object localObject2 = this.v;
    a((ab)localObject1, (ab)localObject2);
    Object localObject3 = o();
    int i1 = ((android.support.v4.h.a)localObject3).size();
    Object localObject4 = am.b(paramViewGroup);
    i1 += -1;
    int i2 = i1;
    if (i2 >= 0)
    {
      localObject1 = (Animator)((android.support.v4.h.a)localObject3).keyAt(i2);
      boolean bool3;
      if (localObject1 != null)
      {
        localObject2 = (u.a)((android.support.v4.h.a)localObject3).get(localObject1);
        if (localObject2 != null)
        {
          Object localObject5 = ((u.a)localObject2).a;
          if (localObject5 != null)
          {
            localObject5 = ((u.a)localObject2).d;
            boolean bool2 = localObject4.equals(localObject5);
            if (bool2)
            {
              localObject5 = ((u.a)localObject2).c;
              Object localObject6 = ((u.a)localObject2).a;
              aa localaa = a((View)localObject6, bool1);
              localObject6 = b((View)localObject6, bool1);
              if ((localaa == null) && (localObject6 == null)) {
                break label255;
              }
              localObject2 = ((u.a)localObject2).e;
              bool3 = ((u)localObject2).a((aa)localObject5, (aa)localObject6);
              if (!bool3) {
                break label255;
              }
              bool3 = bool1;
              label211:
              if (bool3)
              {
                bool3 = ((Animator)localObject1).isRunning();
                if (!bool3)
                {
                  bool3 = ((Animator)localObject1).isStarted();
                  if (!bool3) {
                    break label264;
                  }
                }
                ((Animator)localObject1).cancel();
              }
            }
          }
        }
      }
      for (;;)
      {
        i1 = i2 + -1;
        i2 = i1;
        break;
        label255:
        bool3 = false;
        localObject2 = null;
        break label211;
        label264:
        ((android.support.v4.h.a)localObject3).remove(localObject1);
      }
    }
    ab localab1 = this.u;
    ab localab2 = this.v;
    localObject3 = this.x;
    localObject4 = this.y;
    localObject1 = this;
    localObject2 = paramViewGroup;
    a(paramViewGroup, localab1, localab2, (ArrayList)localObject3, (ArrayList)localObject4);
    e();
  }
  
  protected void a(ViewGroup paramViewGroup, ab paramab1, ab paramab2, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    android.support.v4.h.a locala = o();
    long l1 = Long.MAX_VALUE;
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    int i1 = paramArrayList1.size();
    boolean bool1 = false;
    Object localObject1 = null;
    int i5 = 0;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (i5 < i1)
    {
      localObject2 = paramArrayList1;
      localObject1 = (aa)paramArrayList1.get(i5);
      localObject2 = paramArrayList2;
      localObject3 = (aa)paramArrayList2.get(i5);
      if (localObject1 == null) {
        break label887;
      }
      localObject4 = ((aa)localObject1).c;
      localObject2 = this;
      boolean bool4 = ((ArrayList)localObject4).contains(this);
      if (bool4) {
        break label887;
      }
      bool1 = false;
      localObject1 = null;
    }
    label403:
    label405:
    label424:
    label719:
    label737:
    label873:
    label887:
    for (Object localObject5 = null;; localObject5 = localObject1)
    {
      int i7;
      if (localObject3 != null)
      {
        localObject1 = ((aa)localObject3).c;
        localObject2 = this;
        bool1 = ((ArrayList)localObject1).contains(this);
        if (!bool1)
        {
          i7 = 0;
          localObject3 = null;
        }
      }
      for (Object localObject6 = null;; localObject6 = localObject3)
      {
        if ((localObject5 == null) && (localObject6 == null)) {}
        Object localObject7;
        Object localObject8;
        Object localObject9;
        Object localObject10;
        Object localObject11;
        for (;;)
        {
          int i2 = i5 + 1;
          i5 = i2;
          break;
          if ((localObject5 != null) && (localObject6 != null))
          {
            localObject2 = this;
            bool2 = a((aa)localObject5, (aa)localObject6);
            if (!bool2) {}
          }
          else
          {
            bool2 = true;
          }
          for (;;)
          {
            if (!bool2) {
              break label403;
            }
            localObject2 = this;
            localObject7 = a(paramViewGroup, (aa)localObject5, (aa)localObject6);
            if (localObject7 == null) {
              break;
            }
            bool2 = false;
            localObject1 = null;
            if (localObject6 == null) {
              break label719;
            }
            localObject8 = ((aa)localObject6).b;
            localObject9 = a();
            if ((localObject8 == null) || (localObject9 == null)) {
              break label873;
            }
            i7 = localObject9.length;
            if (i7 <= 0) {
              break label873;
            }
            localObject4 = new android/support/transition/aa;
            ((aa)localObject4).<init>();
            ((aa)localObject4).b = ((View)localObject8);
            localObject2 = paramab2;
            localObject1 = (aa)paramab2.a.get(localObject8);
            if (localObject1 == null) {
              break label405;
            }
            i7 = 0;
            localObject3 = null;
            for (;;)
            {
              int i8 = localObject9.length;
              if (i7 >= i8) {
                break;
              }
              localObject10 = ((aa)localObject4).a;
              localObject11 = localObject9[i7];
              localObject2 = ((aa)localObject1).a;
              Object localObject12 = localObject2;
              Object localObject13 = localObject9[i7];
              localObject12 = ((Map)localObject2).get(localObject13);
              localObject2 = localObject11;
              ((Map)localObject10).put(localObject11, localObject12);
              i7 += 1;
            }
            bool2 = false;
            localObject1 = null;
          }
        }
        int i9 = locala.size();
        boolean bool2 = false;
        localObject1 = null;
        i7 = 0;
        localObject3 = null;
        if (i7 < i9)
        {
          localObject1 = (Animator)locala.keyAt(i7);
          localObject1 = (u.a)locala.get(localObject1);
          localObject10 = ((u.a)localObject1).c;
          if (localObject10 != null)
          {
            localObject10 = ((u.a)localObject1).a;
            if (localObject10 == localObject8)
            {
              localObject10 = ((u.a)localObject1).b;
              localObject11 = n();
              localObject2 = localObject11;
              boolean bool5 = ((String)localObject10).equals(localObject11);
              if (bool5)
              {
                localObject1 = ((u.a)localObject1).c;
                bool2 = ((aa)localObject1).equals(localObject4);
                if (bool2)
                {
                  bool2 = false;
                  i7 = 0;
                  localObject3 = null;
                  localObject1 = localObject4;
                }
              }
            }
          }
        }
        for (;;)
        {
          localObject9 = localObject1;
          localObject10 = localObject3;
          localObject3 = localObject8;
          long l2;
          for (;;)
          {
            if (localObject10 == null) {
              break label737;
            }
            localObject2 = this;
            localObject1 = this.f;
            if (localObject1 != null)
            {
              localObject1 = this.f;
              localObject2 = paramViewGroup;
              l2 = ((x)localObject1).a(paramViewGroup, this, (aa)localObject5, (aa)localObject6);
              localObject2 = this;
              localObject1 = this.G;
              i3 = ((ArrayList)localObject1).size();
              int i10 = (int)l2;
              localSparseIntArray.put(i3, i10);
              l2 = Math.min(l2, l1);
              l1 = l2;
            }
            localObject1 = new android/support/transition/u$a;
            localObject4 = n();
            localObject8 = am.b(paramViewGroup);
            localObject7 = this;
            ((u.a)localObject1).<init>((View)localObject3, (String)localObject4, this, (aw)localObject8, (aa)localObject9);
            locala.put(localObject10, localObject1);
            localObject2 = this;
            localObject1 = this.G;
            ((ArrayList)localObject1).add(localObject10);
            break;
            int i3 = i7 + 1;
            i7 = i3;
            break label424;
            localObject3 = ((aa)localObject5).b;
            i9 = 0;
            localObject9 = null;
            localObject10 = localObject7;
          }
          break;
          long l3 = 0L;
          boolean bool3 = l1 < l3;
          if (bool3)
          {
            bool3 = false;
            localObject1 = null;
            i7 = 0;
            localObject3 = null;
            for (;;)
            {
              int i4 = localSparseIntArray.size();
              if (i7 >= i4) {
                break;
              }
              i4 = localSparseIntArray.keyAt(i7);
              localObject2 = this;
              localObject4 = this.G;
              localObject1 = (Animator)((ArrayList)localObject4).get(i4);
              int i6 = localSparseIntArray.valueAt(i7);
              l2 = i6 - l1;
              long l4 = ((Animator)localObject1).getStartDelay();
              l2 += l4;
              ((Animator)localObject1).setStartDelay(l2);
              i4 = i7 + 1;
              i7 = i4;
            }
          }
          return;
          localObject1 = localObject4;
          localObject3 = localObject7;
          continue;
          localObject3 = localObject7;
        }
      }
    }
  }
  
  void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i1 = 0;
    a(paramBoolean);
    Object localObject1 = this.b;
    int i2 = ((ArrayList)localObject1).size();
    int i4;
    String str;
    int i3;
    label184:
    Object localObject2;
    if (i2 <= 0)
    {
      localObject1 = this.c;
      i2 = ((ArrayList)localObject1).size();
      if (i2 <= 0) {}
    }
    else
    {
      localObject1 = this.l;
      boolean bool;
      if (localObject1 != null)
      {
        localObject1 = this.l;
        bool = ((ArrayList)localObject1).isEmpty();
        if (!bool) {}
      }
      else
      {
        localObject1 = this.m;
        if (localObject1 != null)
        {
          localObject1 = this.m;
          bool = ((ArrayList)localObject1).isEmpty();
          if (!bool) {}
        }
        else
        {
          i4 = 0;
          str = null;
          localObject1 = this.b;
          i3 = ((ArrayList)localObject1).size();
          if (i4 < i3)
          {
            i3 = ((Integer)this.b.get(i4)).intValue();
            localObject1 = paramViewGroup.findViewById(i3);
            if (localObject1 != null)
            {
              localaa = new android/support/transition/aa;
              localaa.<init>();
              localaa.b = ((View)localObject1);
              if (!paramBoolean) {
                break label236;
              }
              a(localaa);
              localObject2 = localaa.c;
              ((ArrayList)localObject2).add(this);
              c(localaa);
              if (!paramBoolean) {
                break label245;
              }
              localObject2 = this.u;
              a((ab)localObject2, (View)localObject1, localaa);
            }
            for (;;)
            {
              i3 = i4 + 1;
              i4 = i3;
              break;
              label236:
              b(localaa);
              break label184;
              label245:
              localObject2 = this.v;
              a((ab)localObject2, (View)localObject1, localaa);
            }
          }
          i4 = 0;
          str = null;
          localObject1 = this.c;
          i3 = ((ArrayList)localObject1).size();
          if (i4 >= i3) {
            break label415;
          }
          localObject1 = (View)this.c.get(i4);
          aa localaa = new android/support/transition/aa;
          localaa.<init>();
          localaa.b = ((View)localObject1);
          if (paramBoolean)
          {
            a(localaa);
            label330:
            localObject2 = localaa.c;
            ((ArrayList)localObject2).add(this);
            c(localaa);
            if (!paramBoolean) {
              break label391;
            }
            localObject2 = this.u;
            a((ab)localObject2, (View)localObject1, localaa);
          }
          for (;;)
          {
            i3 = i4 + 1;
            i4 = i3;
            break;
            b(localaa);
            break label330;
            label391:
            localObject2 = this.v;
            a((ab)localObject2, (View)localObject1, localaa);
          }
        }
      }
    }
    c(paramViewGroup, paramBoolean);
    label415:
    if (!paramBoolean)
    {
      localObject1 = this.I;
      if (localObject1 != null)
      {
        localObject1 = this.I;
        int i5 = ((android.support.v4.h.a)localObject1).size();
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(i5);
        i4 = 0;
        str = null;
        android.support.v4.h.a locala;
        while (i4 < i5)
        {
          localObject1 = (String)this.I.keyAt(i4);
          locala = this.u.d;
          localObject1 = locala.remove(localObject1);
          ((ArrayList)localObject2).add(localObject1);
          i3 = i4 + 1;
          i4 = i3;
        }
        while (i1 < i5)
        {
          localObject1 = (View)((ArrayList)localObject2).get(i1);
          if (localObject1 != null)
          {
            str = (String)this.I.valueAt(i1);
            locala = this.u.d;
            locala.put(str, localObject1);
          }
          i1 += 1;
        }
      }
    }
  }
  
  void a(boolean paramBoolean)
  {
    f localf;
    if (paramBoolean)
    {
      this.u.a.clear();
      this.u.b.clear();
      localf = this.u.c;
      localf.c();
    }
    for (;;)
    {
      return;
      this.v.a.clear();
      this.v.b.clear();
      localf = this.v.c;
      localf.c();
    }
  }
  
  public boolean a(aa paramaa1, aa paramaa2)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    Object localObject1;
    int i3;
    Object localObject2;
    if ((paramaa1 != null) && (paramaa2 != null))
    {
      localObject1 = a();
      if (localObject1 == null) {
        break label86;
      }
      int i2 = localObject1.length;
      i3 = 0;
      localObject2 = null;
      if (i3 >= i2) {
        break label152;
      }
      String str = localObject1[i3];
      boolean bool3 = a(paramaa1, paramaa2, str);
      if (!bool3) {
        break label77;
      }
      i3 = i1;
    }
    for (;;)
    {
      bool1 = i3;
      for (;;)
      {
        return bool1;
        label77:
        i3 += 1;
        break;
        label86:
        localObject2 = paramaa1.a.keySet();
        localObject1 = ((Set)localObject2).iterator();
        do
        {
          bool2 = ((Iterator)localObject1).hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = (String)((Iterator)localObject1).next();
          bool2 = a(paramaa1, paramaa2, (String)localObject2);
        } while (!bool2);
        bool1 = i1;
      }
      label152:
      boolean bool2 = false;
      localObject2 = null;
    }
  }
  
  boolean a(View paramView)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int i1 = paramView.getId();
    Object localObject1 = this.n;
    boolean bool3;
    if (localObject1 != null)
    {
      localObject1 = this.n;
      localObject2 = Integer.valueOf(i1);
      bool3 = ((ArrayList)localObject1).contains(localObject2);
      if (!bool3) {}
    }
    label157:
    do
    {
      for (;;)
      {
        return bool2;
        localObject1 = this.o;
        if (localObject1 != null)
        {
          localObject1 = this.o;
          bool3 = ((ArrayList)localObject1).contains(paramView);
          if (bool3) {}
        }
        else
        {
          localObject1 = this.p;
          if (localObject1 != null)
          {
            localObject1 = this.p;
            int i6 = ((ArrayList)localObject1).size();
            i7 = 0;
            localObject2 = null;
            for (;;)
            {
              if (i7 >= i6) {
                break label157;
              }
              localObject1 = (Class)this.p.get(i7);
              bool3 = ((Class)localObject1).isInstance(paramView);
              if (bool3) {
                break;
              }
              int i2 = i7 + 1;
              i7 = i2;
            }
          }
          localObject1 = this.q;
          if (localObject1 != null)
          {
            localObject1 = r.m(paramView);
            if (localObject1 != null)
            {
              localObject1 = this.q;
              localObject2 = r.m(paramView);
              boolean bool4 = ((ArrayList)localObject1).contains(localObject2);
              if (bool4) {
                continue;
              }
            }
          }
          localObject1 = this.b;
          int i3 = ((ArrayList)localObject1).size();
          if (i3 == 0)
          {
            localObject1 = this.c;
            i3 = ((ArrayList)localObject1).size();
            if (i3 == 0)
            {
              localObject1 = this.m;
              if (localObject1 != null)
              {
                localObject1 = this.m;
                bool5 = ((ArrayList)localObject1).isEmpty();
                if (!bool5) {}
              }
              else
              {
                localObject1 = this.l;
                if (localObject1 != null)
                {
                  localObject1 = this.l;
                  bool5 = ((ArrayList)localObject1).isEmpty();
                  if (!bool5) {}
                }
                else
                {
                  bool2 = bool1;
                  continue;
                }
              }
            }
          }
          localObject1 = this.b;
          localObject2 = Integer.valueOf(i1);
          boolean bool5 = ((ArrayList)localObject1).contains(localObject2);
          if (!bool5)
          {
            localObject1 = this.c;
            bool5 = ((ArrayList)localObject1).contains(paramView);
            if (!bool5) {}
          }
          else
          {
            bool2 = bool1;
            continue;
          }
          localObject1 = this.l;
          if (localObject1 == null) {
            break;
          }
          localObject1 = this.l;
          localObject2 = r.m(paramView);
          bool5 = ((ArrayList)localObject1).contains(localObject2);
          if (!bool5) {
            break;
          }
          bool2 = bool1;
        }
      }
      localObject1 = this.m;
    } while (localObject1 == null);
    int i7 = 0;
    Object localObject2 = null;
    for (;;)
    {
      localObject1 = this.m;
      int i4 = ((ArrayList)localObject1).size();
      if (i7 >= i4) {
        break;
      }
      localObject1 = (Class)this.m.get(i7);
      boolean bool6 = ((Class)localObject1).isInstance(paramView);
      if (bool6)
      {
        bool2 = bool1;
        break;
      }
      int i5 = i7 + 1;
      i7 = i5;
    }
  }
  
  public String[] a()
  {
    return null;
  }
  
  public long b()
  {
    return this.a;
  }
  
  aa b(View paramView, boolean paramBoolean)
  {
    Object localObject1 = null;
    Object localObject2 = this.d;
    if (localObject2 != null)
    {
      localObject2 = this.d;
      localObject1 = ((y)localObject2).b(paramView, paramBoolean);
    }
    Object localObject3;
    label43:
    int i2;
    int i3;
    label61:
    do
    {
      return (aa)localObject1;
      if (!paramBoolean) {
        break;
      }
      localObject2 = this.x;
      localObject3 = localObject2;
      if (localObject3 == null) {
        break label142;
      }
      int i1 = ((ArrayList)localObject3).size();
      i2 = -1;
      i3 = 0;
      if (i3 >= i1) {
        break label168;
      }
      localObject2 = (aa)((ArrayList)localObject3).get(i3);
    } while (localObject2 == null);
    localObject2 = ((aa)localObject2).b;
    if (localObject2 == paramView) {}
    for (;;)
    {
      if (i3 >= 0) {
        if (paramBoolean) {
          localObject2 = this.y;
        }
      }
      label113:
      for (localObject2 = (aa)((ArrayList)localObject2).get(i3);; localObject2 = null)
      {
        localObject1 = localObject2;
        break;
        localObject2 = this.y;
        localObject3 = localObject2;
        break label43;
        label142:
        break;
        i3 += 1;
        break label61;
        localObject2 = this.x;
        break label113;
      }
      label168:
      i3 = i2;
    }
  }
  
  public u b(long paramLong)
  {
    this.j = paramLong;
    return this;
  }
  
  public u b(u.c paramc)
  {
    ArrayList localArrayList = this.F;
    if (localArrayList == null) {}
    for (;;)
    {
      return this;
      this.F.remove(paramc);
      localArrayList = this.F;
      int i1 = localArrayList.size();
      if (i1 == 0)
      {
        i1 = 0;
        localArrayList = null;
        this.F = null;
      }
    }
  }
  
  public u b(View paramView)
  {
    this.c.add(paramView);
    return this;
  }
  
  public abstract void b(aa paramaa);
  
  public long c()
  {
    return this.j;
  }
  
  public u c(View paramView)
  {
    this.c.remove(paramView);
    return this;
  }
  
  void c(aa paramaa)
  {
    int i1 = 0;
    Object localObject = this.f;
    int i2;
    String[] arrayOfString;
    if (localObject != null)
    {
      localObject = paramaa.a;
      i2 = ((Map)localObject).isEmpty();
      if (i2 == 0)
      {
        localObject = this.f;
        arrayOfString = ((x)localObject).a();
        if (arrayOfString != null) {
          break label46;
        }
      }
    }
    label46:
    label54:
    label125:
    for (;;)
    {
      return;
      int i4 = 1;
      i2 = 0;
      localObject = null;
      int i5 = arrayOfString.length;
      if (i2 < i5)
      {
        Map localMap = paramaa.a;
        String str = arrayOfString[i2];
        boolean bool = localMap.containsKey(str);
        if (bool) {}
      }
      for (;;)
      {
        if (i1 != 0) {
          break label125;
        }
        localObject = this.f;
        ((x)localObject).a(paramaa);
        break;
        int i3;
        i2 += 1;
        break label54;
        i1 = i4;
      }
    }
  }
  
  public TimeInterpolator d()
  {
    return this.k;
  }
  
  public void d(View paramView)
  {
    boolean bool1 = this.E;
    if (!bool1)
    {
      android.support.v4.h.a locala = o();
      int i1 = locala.size();
      aw localaw = am.b(paramView);
      i1 += -1;
      for (int i3 = i1; i3 >= 0; i3 = i2)
      {
        localObject = (u.a)locala.valueAt(i3);
        View localView = ((u.a)localObject).a;
        if (localView != null)
        {
          localObject = ((u.a)localObject).d;
          boolean bool2 = localaw.equals(localObject);
          if (bool2)
          {
            localObject = (Animator)locala.keyAt(i3);
            a.a((Animator)localObject);
          }
        }
        i2 = i3 + -1;
      }
      Object localObject = this.F;
      if (localObject != null)
      {
        localObject = this.F;
        i2 = ((ArrayList)localObject).size();
        if (i2 > 0)
        {
          localObject = (ArrayList)this.F.clone();
          int i4 = ((ArrayList)localObject).size();
          i3 = 0;
          u.c localc = null;
          int i5 = 0;
          locala = null;
          while (i5 < i4)
          {
            localc = (u.c)((ArrayList)localObject).get(i5);
            localc.b(this);
            i3 = i5 + 1;
            i5 = i3;
          }
        }
      }
      int i2 = 1;
      this.D = i2;
    }
  }
  
  protected void e()
  {
    j();
    android.support.v4.h.a locala = o();
    Object localObject = this.G;
    Iterator localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Animator)localIterator.next();
      boolean bool2 = locala.containsKey(localObject);
      if (bool2)
      {
        j();
        a((Animator)localObject, locala);
      }
    }
    this.G.clear();
    k();
  }
  
  public void e(View paramView)
  {
    boolean bool1 = this.D;
    if (bool1)
    {
      bool1 = this.E;
      if (!bool1)
      {
        android.support.v4.h.a locala = o();
        int i1 = locala.size();
        aw localaw = am.b(paramView);
        i1 += -1;
        int i2;
        for (int i3 = i1; i3 >= 0; i3 = i2)
        {
          localObject = (u.a)locala.valueAt(i3);
          View localView = ((u.a)localObject).a;
          if (localView != null)
          {
            localObject = ((u.a)localObject).d;
            boolean bool2 = localaw.equals(localObject);
            if (bool2)
            {
              localObject = (Animator)locala.keyAt(i3);
              a.b((Animator)localObject);
            }
          }
          i2 = i3 + -1;
        }
        Object localObject = this.F;
        if (localObject != null)
        {
          localObject = this.F;
          i2 = ((ArrayList)localObject).size();
          if (i2 > 0)
          {
            localObject = (ArrayList)this.F.clone();
            int i4 = ((ArrayList)localObject).size();
            int i5 = 0;
            locala = null;
            while (i5 < i4)
            {
              u.c localc = (u.c)((ArrayList)localObject).get(i5);
              localc.c(this);
              i3 = i5 + 1;
              i5 = i3;
            }
          }
        }
      }
      this.D = false;
    }
  }
  
  public List f()
  {
    return this.b;
  }
  
  public List g()
  {
    return this.c;
  }
  
  public List h()
  {
    return this.l;
  }
  
  public List i()
  {
    return this.m;
  }
  
  protected void j()
  {
    int i1 = this.C;
    if (i1 == 0)
    {
      ArrayList localArrayList = this.F;
      if (localArrayList != null)
      {
        localArrayList = this.F;
        i1 = localArrayList.size();
        if (i1 > 0)
        {
          localArrayList = (ArrayList)this.F.clone();
          int i2 = localArrayList.size();
          int i4;
          for (int i3 = 0; i3 < i2; i3 = i4)
          {
            u.c localc = (u.c)localArrayList.get(i3);
            localc.d(this);
            i4 = i3 + 1;
          }
        }
      }
      this.E = false;
    }
    i1 = this.C + 1;
    this.C = i1;
  }
  
  protected void k()
  {
    int i1 = this.C + -1;
    this.C = i1;
    i1 = this.C;
    if (i1 == 0)
    {
      Object localObject = this.F;
      if (localObject != null)
      {
        localObject = this.F;
        i1 = ((ArrayList)localObject).size();
        if (i1 > 0)
        {
          localObject = (ArrayList)this.F.clone();
          int i2 = ((ArrayList)localObject).size();
          for (int i3 = 0; i3 < i2; i3 = i4)
          {
            localc = (u.c)((ArrayList)localObject).get(i3);
            localc.a(this);
            i4 = i3 + 1;
          }
        }
      }
      int i4 = 0;
      u.c localc = null;
      for (;;)
      {
        localObject = this.u.c;
        i1 = ((f)localObject).b();
        if (i4 >= i1) {
          break;
        }
        localObject = (View)this.u.c.c(i4);
        if (localObject != null) {
          r.a((View)localObject, false);
        }
        i1 = i4 + 1;
        i4 = i1;
      }
      i4 = 0;
      localc = null;
      for (;;)
      {
        localObject = this.v.c;
        i1 = ((f)localObject).b();
        if (i4 >= i1) {
          break;
        }
        localObject = (View)this.v.c.c(i4);
        if (localObject != null) {
          r.a((View)localObject, false);
        }
        i1 = i4 + 1;
        i4 = i1;
      }
      i1 = 1;
      this.E = i1;
    }
  }
  
  public l l()
  {
    return this.J;
  }
  
  public u m()
  {
    try
    {
      localObject1 = super.clone();
      localObject1 = (u)localObject1;
      Object localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      ((u)localObject1).G = ((ArrayList)localObject3);
      localObject3 = new android/support/transition/ab;
      ((ab)localObject3).<init>();
      ((u)localObject1).u = ((ab)localObject3);
      localObject3 = new android/support/transition/ab;
      ((ab)localObject3).<init>();
      ((u)localObject1).v = ((ab)localObject3);
      localObject3 = null;
      ((u)localObject1).x = null;
      localObject3 = null;
      ((u)localObject1).y = null;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (u)localObject1;
  }
  
  public String n()
  {
    return this.i;
  }
  
  public String toString()
  {
    return a("");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transitio\\u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */