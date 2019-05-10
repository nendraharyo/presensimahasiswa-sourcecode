package android.support.v4.h;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class h$d
  implements Iterator, Map.Entry
{
  int a;
  int b;
  boolean c = false;
  
  h$d(h paramh)
  {
    int i = paramh.a() + -1;
    this.a = i;
    this.b = -1;
  }
  
  public Map.Entry a()
  {
    boolean bool = hasNext();
    if (!bool)
    {
      NoSuchElementException localNoSuchElementException = new java/util/NoSuchElementException;
      localNoSuchElementException.<init>();
      throw localNoSuchElementException;
    }
    int i = this.b + 1;
    this.b = i;
    this.c = true;
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2 = this.c;
    IllegalStateException localIllegalStateException;
    if (!bool2)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("This container does not support retaining Map.Entry objects");
      throw localIllegalStateException;
    }
    bool2 = paramObject instanceof Map.Entry;
    if (!bool2) {
      return bool1;
    }
    paramObject = (Map.Entry)paramObject;
    Object localObject1 = ((Map.Entry)paramObject).getKey();
    Object localObject2 = this.d;
    int j = this.b;
    localObject2 = ((h)localObject2).a(j, 0);
    bool2 = c.a(localObject1, localObject2);
    if (bool2)
    {
      localObject1 = ((Map.Entry)paramObject).getValue();
      localObject2 = this.d;
      j = this.b;
      localObject2 = ((h)localObject2).a(j, i);
      bool2 = c.a(localObject1, localObject2);
      if (!bool2) {}
    }
    for (;;)
    {
      bool1 = i;
      break;
      i = 0;
      localIllegalStateException = null;
    }
  }
  
  public Object getKey()
  {
    boolean bool = this.c;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("This container does not support retaining Map.Entry objects");
      throw ((Throwable)localObject);
    }
    Object localObject = this.d;
    int i = this.b;
    return ((h)localObject).a(i, 0);
  }
  
  public Object getValue()
  {
    boolean bool = this.c;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("This container does not support retaining Map.Entry objects");
      throw ((Throwable)localObject);
    }
    Object localObject = this.d;
    int i = this.b;
    return ((h)localObject).a(i, 1);
  }
  
  public boolean hasNext()
  {
    int i = this.b;
    int k = this.a;
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    IllegalStateException localIllegalStateException = null;
    int j = this.c;
    if (j == 0)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("This container does not support retaining Map.Entry objects");
      throw localIllegalStateException;
    }
    Object localObject1 = this.d;
    int m = this.b;
    localObject1 = ((h)localObject1).a(m, 0);
    Object localObject2 = this.d;
    int n = this.b;
    int i1 = 1;
    localObject2 = ((h)localObject2).a(n, i1);
    if (localObject1 == null)
    {
      j = 0;
      localObject1 = null;
      if (localObject2 != null) {
        break label101;
      }
    }
    for (;;)
    {
      return i ^ j;
      int k = localObject1.hashCode();
      break;
      label101:
      i = localObject2.hashCode();
    }
  }
  
  public void remove()
  {
    boolean bool = this.c;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    Object localObject = this.d;
    int j = this.b;
    ((h)localObject).a(j);
    int i = this.b + -1;
    this.b = i;
    i = this.a + -1;
    this.a = i;
    this.c = false;
  }
  
  public Object setValue(Object paramObject)
  {
    boolean bool = this.c;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("This container does not support retaining Map.Entry objects");
      throw ((Throwable)localObject);
    }
    Object localObject = this.d;
    int i = this.b;
    return ((h)localObject).a(i, paramObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = getKey();
    localStringBuilder = localStringBuilder.append(localObject).append("=");
    localObject = getValue();
    return (String)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\h$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */