package android.support.v4.h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class h
{
  h.b b;
  h.c c;
  h.e d;
  
  public static boolean a(Map paramMap, Collection paramCollection)
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
      bool1 = paramMap.containsKey(localObject);
    } while (bool1);
    boolean bool2 = false;
    localIterator = null;
    for (;;)
    {
      return bool2;
      bool2 = true;
    }
  }
  
  public static boolean a(Set paramSet, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramSet == paramObject) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      boolean bool3 = paramObject instanceof Set;
      if (bool3)
      {
        paramObject = (Set)paramObject;
        try
        {
          int i = paramSet.size();
          int j = ((Set)paramObject).size();
          if (i == j)
          {
            boolean bool4 = paramSet.containsAll((Collection)paramObject);
            if (!bool4) {}
          }
          for (;;)
          {
            bool2 = bool1;
            break;
            bool1 = false;
          }
        }
        catch (ClassCastException localClassCastException) {}catch (NullPointerException localNullPointerException) {}
      }
    }
  }
  
  public static boolean b(Map paramMap, Collection paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      paramMap.remove(localObject);
    }
    int k = paramMap.size();
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean c(Map paramMap, Collection paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      bool = paramCollection.contains(localObject);
      if (!bool) {
        localIterator.remove();
      }
    }
    int k = paramMap.size();
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected abstract int a();
  
  protected abstract int a(Object paramObject);
  
  protected abstract Object a(int paramInt1, int paramInt2);
  
  protected abstract Object a(int paramInt, Object paramObject);
  
  protected abstract void a(int paramInt);
  
  protected abstract void a(Object paramObject1, Object paramObject2);
  
  public Object[] a(Object[] paramArrayOfObject, int paramInt)
  {
    int i = a();
    int j = paramArrayOfObject.length;
    if (j < i) {}
    for (Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);; arrayOfObject = paramArrayOfObject)
    {
      int k = 0;
      while (k < i)
      {
        Object localObject = a(k, paramInt);
        arrayOfObject[k] = localObject;
        k += 1;
      }
      k = arrayOfObject.length;
      if (k > i)
      {
        k = 0;
        arrayOfObject[i] = null;
      }
      return arrayOfObject;
    }
  }
  
  protected abstract int b(Object paramObject);
  
  protected abstract Map b();
  
  public Object[] b(int paramInt)
  {
    int i = a();
    Object[] arrayOfObject = new Object[i];
    int j = 0;
    while (j < i)
    {
      Object localObject = a(j, paramInt);
      arrayOfObject[j] = localObject;
      j += 1;
    }
    return arrayOfObject;
  }
  
  protected abstract void c();
  
  public Set d()
  {
    h.b localb = this.b;
    if (localb == null)
    {
      localb = new android/support/v4/h/h$b;
      localb.<init>(this);
      this.b = localb;
    }
    return this.b;
  }
  
  public Set e()
  {
    h.c localc = this.c;
    if (localc == null)
    {
      localc = new android/support/v4/h/h$c;
      localc.<init>(this);
      this.c = localc;
    }
    return this.c;
  }
  
  public Collection f()
  {
    h.e locale = this.d;
    if (locale == null)
    {
      locale = new android/support/v4/h/h$e;
      locale.<init>(this);
      this.d = locale;
    }
    return this.d;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */