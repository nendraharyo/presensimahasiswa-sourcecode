package android.support.v4.h;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class h$b
  implements Set
{
  h$b(h paramh) {}
  
  public boolean a(Map.Entry paramEntry)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    Object localObject1 = this.a;
    int i = ((h)localObject1).a();
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      h localh = this.a;
      Object localObject2 = ((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      localh.a(localObject2, localObject1);
    }
    localObject1 = this.a;
    int j = ((h)localObject1).a();
    if (i != j) {
      j = 1;
    }
    for (;;)
    {
      return j;
      int k = 0;
      localObject1 = null;
    }
  }
  
  public void clear()
  {
    this.a.c();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = paramObject instanceof Map.Entry;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (Map.Entry)paramObject;
      Object localObject2 = this.a;
      Object localObject3 = ((Map.Entry)paramObject).getKey();
      int i = ((h)localObject2).a(localObject3);
      if (i >= 0)
      {
        localObject1 = this.a;
        int j = 1;
        localObject1 = ((h)localObject1).a(i, j);
        localObject2 = ((Map.Entry)paramObject).getValue();
        bool1 = c.a(localObject1, localObject2);
      }
    }
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    boolean bool1;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject = localIterator.next();
      bool1 = contains(localObject);
    } while (bool1);
    boolean bool2 = false;
    localIterator = null;
    for (;;)
    {
      return bool2;
      bool2 = true;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    return h.a(this, paramObject);
  }
  
  public int hashCode()
  {
    Object localObject1 = this.a;
    int i = ((h)localObject1).a() + -1;
    int j = i;
    int k = 0;
    if (j >= 0)
    {
      localObject1 = this.a.a(j, 0);
      h localh = this.a;
      int m = 1;
      Object localObject2 = localh.a(j, m);
      int n;
      if (localObject1 == null)
      {
        n = 0;
        localh = null;
        label60:
        if (localObject2 != null) {
          break label104;
        }
        i = 0;
        localObject1 = null;
      }
      for (;;)
      {
        i ^= n;
        n = k + i;
        i = j + -1;
        j = i;
        k = n;
        break;
        i = localObject1.hashCode();
        n = i;
        break label60;
        label104:
        i = localObject2.hashCode();
      }
    }
    return k;
  }
  
  public boolean isEmpty()
  {
    h localh = this.a;
    int i = localh.a();
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localh = null;
    }
  }
  
  public Iterator iterator()
  {
    h.d locald = new android/support/v4/h/h$d;
    h localh = this.a;
    locald.<init>(localh);
    return locald;
  }
  
  public boolean remove(Object paramObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public int size()
  {
    return this.a.a();
  }
  
  public Object[] toArray()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\h$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */