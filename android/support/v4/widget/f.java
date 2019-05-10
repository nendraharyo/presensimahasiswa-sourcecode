package android.support.v4.widget;

import android.support.v4.h.k.a;
import android.support.v4.h.k.b;
import android.support.v4.h.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class f
{
  private final k.a a;
  private final m b;
  private final ArrayList c;
  private final HashSet d;
  
  public f()
  {
    Object localObject = new android/support/v4/h/k$b;
    ((k.b)localObject).<init>(10);
    this.a = ((k.a)localObject);
    localObject = new android/support/v4/h/m;
    ((m)localObject).<init>();
    this.b = ((m)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.c = ((ArrayList)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.d = ((HashSet)localObject);
  }
  
  private void a(Object paramObject, ArrayList paramArrayList, HashSet paramHashSet)
  {
    boolean bool = paramArrayList.contains(paramObject);
    if (bool) {}
    for (;;)
    {
      return;
      bool = paramHashSet.contains(paramObject);
      if (bool)
      {
        localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>("This graph contains cyclic dependencies");
        throw ((Throwable)localObject1);
      }
      paramHashSet.add(paramObject);
      Object localObject1 = (ArrayList)this.b.get(paramObject);
      if (localObject1 != null)
      {
        int i = 0;
        int j = ((ArrayList)localObject1).size();
        while (i < j)
        {
          Object localObject2 = ((ArrayList)localObject1).get(i);
          a(localObject2, paramArrayList, paramHashSet);
          i += 1;
        }
      }
      paramHashSet.remove(paramObject);
      paramArrayList.add(paramObject);
    }
  }
  
  private void a(ArrayList paramArrayList)
  {
    paramArrayList.clear();
    this.a.release(paramArrayList);
  }
  
  private ArrayList c()
  {
    ArrayList localArrayList = (ArrayList)this.a.acquire();
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
    }
    return localArrayList;
  }
  
  public void a()
  {
    int i = 0;
    ArrayList localArrayList = null;
    int j = this.b.size();
    for (int k = 0; k < j; k = i)
    {
      localArrayList = (ArrayList)this.b.valueAt(k);
      if (localArrayList != null) {
        a(localArrayList);
      }
      i = k + 1;
    }
    this.b.clear();
  }
  
  public void a(Object paramObject)
  {
    m localm = this.b;
    boolean bool = localm.containsKey(paramObject);
    if (!bool)
    {
      localm = this.b;
      localm.put(paramObject, null);
    }
  }
  
  public void a(Object paramObject1, Object paramObject2)
  {
    Object localObject = this.b;
    boolean bool = ((m)localObject).containsKey(paramObject1);
    if (bool)
    {
      localObject = this.b;
      bool = ((m)localObject).containsKey(paramObject2);
      if (bool) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("All nodes must be present in the graph before being added as an edge");
      throw ((Throwable)localObject);
    }
    localObject = (ArrayList)this.b.get(paramObject1);
    if (localObject == null)
    {
      localObject = c();
      m localm = this.b;
      localm.put(paramObject1, localObject);
    }
    ((ArrayList)localObject).add(paramObject2);
  }
  
  public ArrayList b()
  {
    this.c.clear();
    this.d.clear();
    int i = 0;
    m localm = this.b;
    int j = localm.size();
    while (i < j)
    {
      Object localObject = this.b.keyAt(i);
      ArrayList localArrayList = this.c;
      HashSet localHashSet = this.d;
      a(localObject, localArrayList, localHashSet);
      i += 1;
    }
    return this.c;
  }
  
  public boolean b(Object paramObject)
  {
    return this.b.containsKey(paramObject);
  }
  
  public List c(Object paramObject)
  {
    return (List)this.b.get(paramObject);
  }
  
  public List d(Object paramObject)
  {
    Object localObject1 = null;
    boolean bool = false;
    Object localObject2 = null;
    int j = this.b.size();
    int k = 0;
    if (k < j)
    {
      localObject2 = (ArrayList)this.b.valueAt(k);
      if (localObject2 != null)
      {
        bool = ((ArrayList)localObject2).contains(paramObject);
        if (bool)
        {
          if (localObject1 != null) {
            break label103;
          }
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
        }
      }
    }
    for (;;)
    {
      localObject1 = this.b.keyAt(k);
      ((ArrayList)localObject2).add(localObject1);
      localObject1 = localObject2;
      int i = k + 1;
      k = i;
      break;
      return (List)localObject1;
      label103:
      localObject2 = localObject1;
    }
  }
  
  public boolean e(Object paramObject)
  {
    Object localObject = this.b;
    int i = ((m)localObject).size();
    int j = 0;
    boolean bool;
    if (j < i)
    {
      localObject = (ArrayList)this.b.valueAt(j);
      if (localObject != null)
      {
        bool = ((ArrayList)localObject).contains(paramObject);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      int k = j + 1;
      j = k;
      break;
      k = 0;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */