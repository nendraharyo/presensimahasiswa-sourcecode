package b.a.a.a.i.b;

import b.a.a.a.a.g;
import b.a.a.a.a.m;
import b.a.a.a.b.i;
import b.a.a.a.o.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class f
  implements i
{
  private final ConcurrentHashMap a;
  
  public f()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.a = localConcurrentHashMap;
  }
  
  private static m a(Map paramMap, g paramg)
  {
    m localm = (m)paramMap.get(paramg);
    int i;
    Object localObject1;
    Object localObject2;
    int k;
    if (localm == null)
    {
      i = -1;
      j = 0;
      localObject1 = null;
      localObject2 = paramMap.keySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject2 = (g)localIterator.next();
        k = paramg.a((g)localObject2);
        if (k <= i) {
          break label113;
        }
      }
    }
    for (int j = k;; j = i)
    {
      i = j;
      localObject1 = localObject2;
      break;
      if (localObject1 != null) {
        localm = (m)paramMap.get(localObject1);
      }
      return localm;
      label113:
      localObject2 = localObject1;
    }
  }
  
  public m a(g paramg)
  {
    a.a(paramg, "Authentication scope");
    return a(this.a, paramg);
  }
  
  public void a()
  {
    this.a.clear();
  }
  
  public void a(g paramg, m paramm)
  {
    a.a(paramg, "Authentication scope");
    this.a.put(paramg, paramm);
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */