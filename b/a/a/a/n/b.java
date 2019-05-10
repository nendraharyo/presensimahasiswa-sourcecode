package b.a.a.a.n;

import b.a.a.a.q;
import b.a.a.a.r;
import b.a.a.a.s;
import b.a.a.a.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
  implements g, Cloneable
{
  protected final List a;
  protected final List b;
  
  public b()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.a = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.b = localArrayList;
  }
  
  public int a()
  {
    return this.a.size();
  }
  
  public r a(int paramInt)
  {
    int i;
    if (paramInt >= 0)
    {
      localObject = this.a;
      i = ((List)localObject).size();
      if (paramInt < i) {}
    }
    else
    {
      i = 0;
    }
    for (Object localObject = null;; localObject = (r)this.a.get(paramInt)) {
      return (r)localObject;
    }
  }
  
  protected void a(b paramb)
  {
    paramb.a.clear();
    List localList1 = paramb.a;
    List localList2 = this.a;
    localList1.addAll(localList2);
    paramb.b.clear();
    localList1 = paramb.b;
    localList2 = this.b;
    localList1.addAll(localList2);
  }
  
  public void a(r paramr)
  {
    if (paramr == null) {}
    for (;;)
    {
      return;
      List localList = this.a;
      localList.add(paramr);
    }
  }
  
  public void a(r paramr, int paramInt)
  {
    if (paramr == null) {}
    for (;;)
    {
      return;
      List localList = this.a;
      localList.add(paramInt, paramr);
    }
  }
  
  public void a(u paramu)
  {
    if (paramu == null) {}
    for (;;)
    {
      return;
      List localList = this.b;
      localList.add(paramu);
    }
  }
  
  public void a(Class paramClass)
  {
    Iterator localIterator = this.a.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Class localClass = localIterator.next().getClass();
      bool = localClass.equals(paramClass);
      if (bool) {
        localIterator.remove();
      }
    }
  }
  
  public int b()
  {
    return this.b.size();
  }
  
  public u b(int paramInt)
  {
    int i;
    if (paramInt >= 0)
    {
      localObject = this.b;
      i = ((List)localObject).size();
      if (paramInt < i) {}
    }
    else
    {
      i = 0;
    }
    for (Object localObject = null;; localObject = (u)this.b.get(paramInt)) {
      return (u)localObject;
    }
  }
  
  public final void b(r paramr)
  {
    a(paramr);
  }
  
  public final void b(r paramr, int paramInt)
  {
    a(paramr, paramInt);
  }
  
  public final void b(u paramu)
  {
    a(paramu);
  }
  
  public Object clone()
  {
    b localb = (b)super.clone();
    a(localb);
    return localb;
  }
  
  public void process(q paramq, e parame)
  {
    Object localObject = this.a;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (r)localIterator.next();
      ((r)localObject).process(paramq, parame);
    }
  }
  
  public void process(s params, e parame)
  {
    Object localObject = this.b;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (u)localIterator.next();
      ((u)localObject).process(params, parame);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */