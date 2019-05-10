package android.support.v4.h;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a
  extends m
  implements Map
{
  h mCollections;
  
  public a() {}
  
  public a(int paramInt)
  {
    super(paramInt);
  }
  
  public a(m paramm)
  {
    super(paramm);
  }
  
  private h getCollection()
  {
    Object localObject = this.mCollections;
    if (localObject == null)
    {
      localObject = new android/support/v4/h/a$1;
      ((a.1)localObject).<init>(this);
      this.mCollections = ((h)localObject);
    }
    return this.mCollections;
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    return h.a(this, paramCollection);
  }
  
  public Set entrySet()
  {
    return getCollection().d();
  }
  
  public Set keySet()
  {
    return getCollection().e();
  }
  
  public void putAll(Map paramMap)
  {
    int i = this.mSize;
    int j = paramMap.size();
    i += j;
    ensureCapacity(i);
    Object localObject1 = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = ((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      put(localObject2, localObject1);
    }
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    return h.b(this, paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    return h.c(this, paramCollection);
  }
  
  public Collection values()
  {
    return getCollection().f();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */