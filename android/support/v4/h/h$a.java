package android.support.v4.h;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class h$a
  implements Iterator
{
  final int a;
  int b;
  int c;
  boolean d = false;
  
  h$a(h paramh, int paramInt)
  {
    this.a = paramInt;
    int i = paramh.a();
    this.b = i;
  }
  
  public boolean hasNext()
  {
    int i = this.c;
    int k = this.b;
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public Object next()
  {
    boolean bool = hasNext();
    if (!bool)
    {
      localObject = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    Object localObject = this.e;
    int i = this.c;
    int j = this.a;
    localObject = ((h)localObject).a(i, j);
    i = this.c + 1;
    this.c = i;
    this.d = true;
    return localObject;
  }
  
  public void remove()
  {
    boolean bool = this.d;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    int i = this.c + -1;
    this.c = i;
    i = this.b + -1;
    this.b = i;
    this.d = false;
    Object localObject = this.e;
    int j = this.c;
    ((h)localObject).a(j);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\h$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */