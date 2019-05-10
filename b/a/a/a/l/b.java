package b.a.a.a.l;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class b
  extends a
  implements Serializable, Cloneable
{
  private final Map a;
  
  public b()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.a = localConcurrentHashMap;
  }
  
  public e a(String paramString, Object paramObject)
  {
    if (paramString == null) {}
    for (;;)
    {
      return this;
      Map localMap;
      if (paramObject != null)
      {
        localMap = this.a;
        localMap.put(paramString, paramObject);
      }
      else
      {
        localMap = this.a;
        localMap.remove(paramString);
      }
    }
  }
  
  public Object a(String paramString)
  {
    return this.a.get(paramString);
  }
  
  public void a(e parame)
  {
    Object localObject = this.a.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      parame.a(str, localObject);
    }
  }
  
  public Object clone()
  {
    b localb = (b)super.clone();
    a(localb);
    return localb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\l\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */