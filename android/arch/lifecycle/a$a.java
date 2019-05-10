package android.arch.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class a$a
{
  final Map a;
  final Map b;
  
  a$a(Map paramMap)
  {
    this.b = paramMap;
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.a = ((Map)localObject1);
    localObject1 = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      c.a locala = (c.a)((Map.Entry)localObject1).getValue();
      Object localObject2 = (List)this.a.get(locala);
      if (localObject2 == null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        Map localMap = this.a;
        localMap.put(locala, localObject2);
      }
      localObject1 = ((Map.Entry)localObject1).getKey();
      ((List)localObject2).add(localObject1);
    }
  }
  
  private static void a(List paramList, e parame, c.a parama, Object paramObject)
  {
    if (paramList != null)
    {
      int i = paramList.size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        a.b localb = (a.b)paramList.get(j);
        localb.a(parame, parama, paramObject);
        i = j + -1;
      }
    }
  }
  
  void a(e parame, c.a parama, Object paramObject)
  {
    a((List)this.a.get(parama), parame, parama, paramObject);
    Map localMap = this.a;
    c.a locala = c.a.ON_ANY;
    a((List)localMap.get(locala), parame, parama, paramObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */