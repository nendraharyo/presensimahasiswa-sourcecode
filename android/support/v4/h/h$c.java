package android.support.v4.h;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class h$c
  implements Set
{
  h$c(h paramh) {}
  
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
    int i = localh.a(paramObject);
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
    return h.a(this.a.b(), paramCollection);
  }
  
  public boolean equals(Object paramObject)
  {
    return h.a(this, paramObject);
  }
  
  public int hashCode()
  {
    Object localObject = this.a;
    int i = ((h)localObject).a() + -1;
    int j = i;
    int k = 0;
    if (j >= 0)
    {
      localObject = this.a.a(j, 0);
      if (localObject == null)
      {
        i = 0;
        localObject = null;
      }
      for (;;)
      {
        k += i;
        i = j + -1;
        j = i;
        break;
        i = localObject.hashCode();
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
    h.a locala = new android/support/v4/h/h$a;
    h localh = this.a;
    locala.<init>(localh, 0);
    return locala;
  }
  
  public boolean remove(Object paramObject)
  {
    h localh1 = this.a;
    int i = localh1.a(paramObject);
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
    return h.b(this.a.b(), paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    return h.c(this.a.b(), paramCollection);
  }
  
  public int size()
  {
    return this.a.a();
  }
  
  public Object[] toArray()
  {
    return this.a.b(0);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return this.a.a(paramArrayOfObject, 0);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\h$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */