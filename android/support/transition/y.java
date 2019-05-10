package android.support.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class y
  extends u
{
  private ArrayList g;
  private boolean h;
  private int i;
  private boolean j;
  
  public y()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.g = localArrayList;
    this.h = true;
    this.j = false;
  }
  
  private void p()
  {
    y.a locala = new android/support/transition/y$a;
    locala.<init>(this);
    Object localObject = this.g;
    Iterator localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (u)localIterator.next();
      ((u)localObject).a(locala);
    }
    int k = this.g.size();
    this.i = k;
  }
  
  public y a(int paramInt)
  {
    AndroidRuntimeException localAndroidRuntimeException;
    boolean bool;
    switch (paramInt)
    {
    default: 
      localAndroidRuntimeException = new android/util/AndroidRuntimeException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Invalid parameter for TransitionSet ordering: " + paramInt;
      localAndroidRuntimeException.<init>((String)localObject);
      throw localAndroidRuntimeException;
    case 1: 
      bool = false;
      localAndroidRuntimeException = null;
    }
    for (this.h = false;; this.h = bool)
    {
      return this;
      bool = true;
    }
  }
  
  String a(String paramString)
  {
    String str1 = super.a(paramString);
    int k = 0;
    Object localObject1 = str1;
    int m = 0;
    str1 = null;
    for (;;)
    {
      Object localObject2 = this.g;
      int n = ((ArrayList)localObject2).size();
      if (m >= n) {
        break;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append("\n");
      localObject1 = (u)this.g.get(m);
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(paramString);
      String str2 = "  ";
      localObject3 = str2;
      localObject1 = ((u)localObject1).a((String)localObject3);
      localObject2 = (String)localObject1;
      k = m + 1;
      m = k;
      localObject1 = localObject2;
    }
    return (String)localObject1;
  }
  
  public void a(aa paramaa)
  {
    Object localObject1 = paramaa.b;
    boolean bool1 = a((View)localObject1);
    if (bool1)
    {
      localObject1 = this.g;
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (u)localIterator.next();
        Object localObject2 = paramaa.b;
        boolean bool2 = ((u)localObject1).a((View)localObject2);
        if (bool2)
        {
          ((u)localObject1).a(paramaa);
          localObject2 = paramaa.c;
          ((ArrayList)localObject2).add(localObject1);
        }
      }
    }
  }
  
  public void a(u.b paramb)
  {
    super.a(paramb);
    int k = this.g.size();
    int m = 0;
    u localu = null;
    for (int n = 0; n < k; n = m)
    {
      localu = (u)this.g.get(n);
      localu.a(paramb);
      m = n + 1;
    }
  }
  
  protected void a(ViewGroup paramViewGroup, ab paramab1, ab paramab2, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    long l1 = c();
    int k = this.g.size();
    int m = 0;
    u localu = null;
    int n = 0;
    if (n < k)
    {
      localu = (u)this.g.get(n);
      long l2 = 0L;
      boolean bool = l1 < l2;
      if (bool)
      {
        bool = this.h;
        if ((bool) || (n == 0))
        {
          l2 = localu.c();
          long l3 = 0L;
          bool = l2 < l3;
          if (!bool) {
            break label138;
          }
          l2 += l1;
          localu.b(l2);
        }
      }
      for (;;)
      {
        localu.a(paramViewGroup, paramab1, paramab2, paramArrayList1, paramArrayList2);
        m = n + 1;
        n = m;
        break;
        label138:
        localu.b(l1);
      }
    }
  }
  
  public u b(int paramInt)
  {
    int k;
    if (paramInt >= 0)
    {
      localObject = this.g;
      k = ((ArrayList)localObject).size();
      if (paramInt < k) {}
    }
    else
    {
      k = 0;
    }
    for (Object localObject = null;; localObject = (u)this.g.get(paramInt)) {
      return (u)localObject;
    }
  }
  
  public y b(TimeInterpolator paramTimeInterpolator)
  {
    return (y)super.a(paramTimeInterpolator);
  }
  
  public y b(u paramu)
  {
    ArrayList localArrayList = this.g;
    localArrayList.add(paramu);
    paramu.d = this;
    long l1 = this.a;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      l1 = this.a;
      paramu.a(l1);
    }
    return this;
  }
  
  public void b(aa paramaa)
  {
    Object localObject1 = paramaa.b;
    boolean bool1 = a((View)localObject1);
    if (bool1)
    {
      localObject1 = this.g;
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (u)localIterator.next();
        Object localObject2 = paramaa.b;
        boolean bool2 = ((u)localObject1).a((View)localObject2);
        if (bool2)
        {
          ((u)localObject1).b(paramaa);
          localObject2 = paramaa.c;
          ((ArrayList)localObject2).add(localObject1);
        }
      }
    }
  }
  
  public y c(long paramLong)
  {
    super.a(paramLong);
    long l1 = this.a;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      int m = this.g.size();
      bool = false;
      u localu = null;
      int k;
      for (int n = 0; n < m; n = k)
      {
        localu = (u)this.g.get(n);
        localu.a(paramLong);
        k = n + 1;
      }
    }
    return this;
  }
  
  public y c(u.c paramc)
  {
    return (y)super.a(paramc);
  }
  
  void c(aa paramaa)
  {
    super.c(paramaa);
    int k = this.g.size();
    int m = 0;
    u localu = null;
    for (int n = 0; n < k; n = m)
    {
      localu = (u)this.g.get(n);
      localu.c(paramaa);
      m = n + 1;
    }
  }
  
  public y d(long paramLong)
  {
    return (y)super.b(paramLong);
  }
  
  public y d(u.c paramc)
  {
    return (y)super.b(paramc);
  }
  
  public void d(View paramView)
  {
    super.d(paramView);
    int k = this.g.size();
    int m = 0;
    u localu = null;
    for (int n = 0; n < k; n = m)
    {
      localu = (u)this.g.get(n);
      localu.d(paramView);
      m = n + 1;
    }
  }
  
  protected void e()
  {
    Object localObject1 = this.g;
    int k = ((ArrayList)localObject1).isEmpty();
    if (k != 0)
    {
      j();
      k();
    }
    for (;;)
    {
      return;
      p();
      k = this.h;
      if (k != 0) {
        break;
      }
      k = 1;
      int m;
      for (int n = k;; n = m)
      {
        localObject1 = this.g;
        m = ((ArrayList)localObject1).size();
        if (n >= m) {
          break;
        }
        localObject1 = this.g;
        i1 = n + -1;
        localObject1 = (u)((ArrayList)localObject1).get(i1);
        localObject2 = (u)this.g.get(n);
        y.1 local1 = new android/support/transition/y$1;
        local1.<init>(this, (u)localObject2);
        ((u)localObject1).a(local1);
        m = n + 1;
      }
      localObject1 = this.g;
      int i1 = 0;
      localObject2 = null;
      localObject1 = (u)((ArrayList)localObject1).get(0);
      if (localObject1 != null) {
        ((u)localObject1).e();
      }
    }
    localObject1 = this.g;
    Object localObject2 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (u)((Iterator)localObject2).next();
      ((u)localObject1).e();
    }
  }
  
  public void e(View paramView)
  {
    super.e(paramView);
    int k = this.g.size();
    int m = 0;
    u localu = null;
    for (int n = 0; n < k; n = m)
    {
      localu = (u)this.g.get(n);
      localu.e(paramView);
      m = n + 1;
    }
  }
  
  public y f(View paramView)
  {
    int k = 0;
    Object localObject = null;
    for (int m = 0;; m = k)
    {
      localObject = this.g;
      k = ((ArrayList)localObject).size();
      if (m >= k) {
        break;
      }
      localObject = (u)this.g.get(m);
      ((u)localObject).b(paramView);
      k = m + 1;
    }
    return (y)super.b(paramView);
  }
  
  public y g(View paramView)
  {
    int k = 0;
    Object localObject = null;
    for (int m = 0;; m = k)
    {
      localObject = this.g;
      k = ((ArrayList)localObject).size();
      if (m >= k) {
        break;
      }
      localObject = (u)this.g.get(m);
      ((u)localObject).c(paramView);
      k = m + 1;
    }
    return (y)super.c(paramView);
  }
  
  public u m()
  {
    y localy = (y)super.m();
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localy.g = ((ArrayList)localObject);
    int k = this.g.size();
    int m = 0;
    localObject = null;
    for (int n = 0; n < k; n = m)
    {
      localObject = ((u)this.g.get(n)).m();
      localy.b((u)localObject);
      m = n + 1;
    }
    return localy;
  }
  
  public int o()
  {
    return this.g.size();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */