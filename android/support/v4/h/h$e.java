package android.support.v4.h;

import java.util.Collection;
import java.util.Iterator;

final class h$e
  implements Collection
{
  h$e(h paramh) {}
  
  public boolean add(Object paramObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void clear()
  {
    this.a.c();
  }
  
  public boolean contains(Object paramObject)
  {
    h localh = this.a;
    int i = localh.b(paramObject);
    if (i >= 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localh = null;
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
    h.a locala = new android/support/v4/h/h$a;
    h localh = this.a;
    locala.<init>(localh, 1);
    return locala;
  }
  
  public boolean remove(Object paramObject)
  {
    h localh1 = this.a;
    int i = localh1.b(paramObject);
    if (i >= 0)
    {
      h localh2 = this.a;
      localh2.a(i);
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localh1 = null;
    }
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    int i = 1;
    int j = 0;
    int k = this.a.a();
    boolean bool1 = false;
    h localh = null;
    while (j < k)
    {
      Object localObject = this.a.a(j, i);
      boolean bool2 = paramCollection.contains(localObject);
      if (bool2)
      {
        localh = this.a;
        localh.a(j);
        j += -1;
        k += -1;
        bool1 = i;
      }
      j += 1;
    }
    return bool1;
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    int i = 1;
    int j = 0;
    int k = this.a.a();
    boolean bool1 = false;
    h localh = null;
    while (j < k)
    {
      Object localObject = this.a.a(j, i);
      boolean bool2 = paramCollection.contains(localObject);
      if (!bool2)
      {
        localh = this.a;
        localh.a(j);
        j += -1;
        k += -1;
        bool1 = i;
      }
      j += 1;
    }
    return bool1;
  }
  
  public int size()
  {
    return this.a.a();
  }
  
  public Object[] toArray()
  {
    return this.a.b(1);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return this.a.a(paramArrayOfObject, 1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\h$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */