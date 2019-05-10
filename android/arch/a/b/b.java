package android.arch.a.b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class b
  implements Iterable
{
  private b.c a;
  private b.c b;
  private WeakHashMap c;
  private int d;
  
  public b()
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    this.c = localWeakHashMap;
    this.d = 0;
  }
  
  public int a()
  {
    return this.d;
  }
  
  protected b.c a(Object paramObject)
  {
    for (b.c localc = this.a;; localc = localc.c) {
      if (localc != null)
      {
        Object localObject = localc.a;
        boolean bool = localObject.equals(paramObject);
        if (!bool) {}
      }
      else
      {
        return localc;
      }
    }
  }
  
  public Object a(Object paramObject1, Object paramObject2)
  {
    Object localObject = a(paramObject1);
    if (localObject != null) {}
    for (localObject = ((b.c)localObject).b;; localObject = null)
    {
      return localObject;
      b(paramObject1, paramObject2);
    }
  }
  
  protected b.c b(Object paramObject1, Object paramObject2)
  {
    b.c localc1 = new android/arch/a/b/b$c;
    localc1.<init>(paramObject1, paramObject2);
    int i = this.d + 1;
    this.d = i;
    b.c localc2 = this.b;
    if (localc2 == null)
    {
      this.a = localc1;
      localc2 = this.a;
    }
    for (this.b = localc2;; this.b = localc1)
    {
      return localc1;
      this.b.c = localc1;
      localc2 = this.b;
      localc1.d = localc2;
    }
  }
  
  public Object b(Object paramObject)
  {
    b.c localc = a(paramObject);
    if (localc == null)
    {
      i = 0;
      localObject1 = null;
      return localObject1;
    }
    int i = this.d + -1;
    this.d = i;
    Object localObject1 = this.c;
    boolean bool = ((WeakHashMap)localObject1).isEmpty();
    Object localObject2;
    if (!bool)
    {
      localObject1 = this.c.keySet();
      localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (b.f)((Iterator)localObject2).next();
        ((b.f)localObject1).a_(localc);
      }
    }
    localObject1 = localc.d;
    if (localObject1 != null)
    {
      localObject1 = localc.d;
      localObject2 = localc.c;
      ((b.c)localObject1).c = ((b.c)localObject2);
      label129:
      localObject1 = localc.c;
      if (localObject1 == null) {
        break label193;
      }
      localObject1 = localc.c;
      localObject2 = localc.d;
      ((b.c)localObject1).d = ((b.c)localObject2);
    }
    for (;;)
    {
      localc.c = null;
      localc.d = null;
      localObject1 = localc.b;
      break;
      localObject1 = localc.c;
      this.a = ((b.c)localObject1);
      break label129;
      label193:
      localObject1 = localc.d;
      this.b = ((b.c)localObject1);
    }
  }
  
  public Iterator b()
  {
    b.b localb = new android/arch/a/b/b$b;
    Object localObject1 = this.b;
    Object localObject2 = this.a;
    localb.<init>((b.c)localObject1, (b.c)localObject2);
    localObject1 = this.c;
    localObject2 = Boolean.valueOf(false);
    ((WeakHashMap)localObject1).put(localb, localObject2);
    return localb;
  }
  
  public b.d c()
  {
    b.d locald = new android/arch/a/b/b$d;
    locald.<init>(this, null);
    WeakHashMap localWeakHashMap = this.c;
    Boolean localBoolean = Boolean.valueOf(false);
    localWeakHashMap.put(locald, localBoolean);
    return locald;
  }
  
  public Map.Entry d()
  {
    return this.a;
  }
  
  public Map.Entry e()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    boolean bool2 = false;
    if (paramObject == this) {
      bool2 = bool1;
    }
    Iterator localIterator1;
    Iterator localIterator2;
    Map.Entry localEntry;
    for (;;)
    {
      return bool2;
      boolean bool3 = paramObject instanceof b;
      if (bool3)
      {
        paramObject = (b)paramObject;
        int i = a();
        int j = ((b)paramObject).a();
        if (i == j)
        {
          localIterator1 = iterator();
          localIterator2 = ((b)paramObject).iterator();
          do
          {
            Object localObject;
            do
            {
              bool4 = localIterator1.hasNext();
              if (!bool4) {
                break label149;
              }
              bool4 = localIterator2.hasNext();
              if (!bool4) {
                break label149;
              }
              localEntry = (Map.Entry)localIterator1.next();
              localObject = localIterator2.next();
              if ((localEntry == null) && (localObject != null)) {
                break;
              }
            } while (localEntry == null);
            bool4 = localEntry.equals(localObject);
          } while (bool4);
        }
      }
    }
    label149:
    boolean bool4 = localIterator1.hasNext();
    if (!bool4)
    {
      bool4 = localIterator2.hasNext();
      if (!bool4) {
        bool4 = bool1;
      }
    }
    for (;;)
    {
      bool2 = bool4;
      break;
      bool4 = false;
      localEntry = null;
    }
  }
  
  public Iterator iterator()
  {
    b.a locala = new android/arch/a/b/b$a;
    Object localObject1 = this.a;
    Object localObject2 = this.b;
    locala.<init>((b.c)localObject1, (b.c)localObject2);
    localObject1 = this.c;
    localObject2 = Boolean.valueOf(false);
    ((WeakHashMap)localObject1).put(locala, localObject2);
    return locala;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = "[";
    localStringBuilder.append(str);
    Iterator localIterator = iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      str = ((Map.Entry)localIterator.next()).toString();
      localStringBuilder.append(str);
      bool = localIterator.hasNext();
      if (bool)
      {
        str = ", ";
        localStringBuilder.append(str);
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\a\b\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */