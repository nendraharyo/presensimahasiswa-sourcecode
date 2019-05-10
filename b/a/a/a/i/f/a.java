package b.a.a.a.i.f;

import b.a.a.a.aa;
import b.a.a.a.ab;
import b.a.a.a.d.b;
import b.a.a.a.j.c;
import b.a.a.a.j.f;
import b.a.a.a.k.j;
import b.a.a.a.k.t;
import b.a.a.a.p;
import b.a.a.a.x;
import java.util.ArrayList;
import java.util.List;

public abstract class a
  implements c
{
  private final f a;
  protected final t b;
  private final b c;
  private final List d;
  private int e;
  private p f;
  
  public a(f paramf, t paramt, b.a.a.a.l.e parame)
  {
    b.a.a.a.o.a.a(paramf, "Session input buffer");
    b.a.a.a.o.a.a(parame, "HTTP parameters");
    this.a = paramf;
    Object localObject = b.a.a.a.l.d.a(parame);
    this.c = ((b)localObject);
    if (paramt != null) {}
    for (;;)
    {
      this.b = paramt;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.d = ((List)localObject);
      this.e = 0;
      return;
      paramt = j.b;
    }
  }
  
  public static b.a.a.a.e[] a(f paramf, int paramInt1, int paramInt2, t paramt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramt != null) {}
    for (;;)
    {
      return a(paramf, paramInt1, paramInt2, paramt, localArrayList);
      paramt = j.b;
    }
  }
  
  public static b.a.a.a.e[] a(f paramf, int paramInt1, int paramInt2, t paramt, List paramList)
  {
    int i = 9;
    int j = 32;
    int k = 0;
    b.a.a.a.o.a.a(paramf, "Session input buffer");
    b.a.a.a.o.a.a(paramt, "Line parser");
    b.a.a.a.o.a.a(paramList, "Header line list");
    int m = 0;
    Object localObject1 = null;
    int n = 0;
    Object localObject3;
    for (Object localObject2 = null;; localObject2 = localObject3)
    {
      if (localObject2 == null)
      {
        localObject2 = new b/a/a/a/o/d;
        i1 = 64;
        ((b.a.a.a.o.d)localObject2).<init>(i1);
      }
      for (;;)
      {
        i1 = paramf.a((b.a.a.a.o.d)localObject2);
        int i3 = -1;
        if (i1 != i3)
        {
          i1 = ((b.a.a.a.o.d)localObject2).c();
          int i4 = 1;
          if (i1 >= i4) {
            break;
          }
        }
        n = paramList.size();
        localObject3 = new b.a.a.a.e[n];
        for (;;)
        {
          n = paramList.size();
          if (k >= n) {
            break;
          }
          localObject2 = (b.a.a.a.o.d)paramList.get(k);
          try
          {
            localObject2 = paramt.a((b.a.a.a.o.d)localObject2);
            localObject3[k] = localObject2;
            k += 1;
          }
          catch (aa localaa)
          {
            int i2;
            int i6;
            localObject3 = new b/a/a/a/ab;
            String str = localaa.getMessage();
            ((ab)localObject3).<init>(str);
            throw ((Throwable)localObject3);
          }
        }
        ((b.a.a.a.o.d)localObject2).a();
      }
      int i1 = ((b.a.a.a.o.d)localObject2).a(0);
      if (i1 != j)
      {
        i2 = ((b.a.a.a.o.d)localObject2).a(0);
        if (i2 != i) {}
      }
      else if (localObject1 != null)
      {
        i2 = 0;
        localObject3 = null;
        for (;;)
        {
          int i5 = ((b.a.a.a.o.d)localObject2).c();
          if (i2 < i5)
          {
            i5 = ((b.a.a.a.o.d)localObject2).a(i2);
            if ((i5 == j) || (i5 == i)) {}
          }
          else
          {
            if (paramInt2 <= 0) {
              break;
            }
            i6 = ((b.a.a.a.o.d)localObject1).c() + 1;
            int i7 = ((b.a.a.a.o.d)localObject2).c();
            i6 = i6 + i7 - i2;
            if (i6 <= paramInt2) {
              break;
            }
            localObject2 = new b/a/a/a/x;
            ((x)localObject2).<init>("Maximum line length limit exceeded");
            throw ((Throwable)localObject2);
          }
          i2 += 1;
        }
        ((b.a.a.a.o.d)localObject1).a(j);
        i6 = ((b.a.a.a.o.d)localObject2).c() - i2;
        ((b.a.a.a.o.d)localObject1).a((b.a.a.a.o.d)localObject2, i2, i6);
        localObject3 = localObject2;
        localObject2 = localObject1;
      }
      while (paramInt1 > 0)
      {
        m = paramList.size();
        if (m < paramInt1) {
          break;
        }
        localObject2 = new b/a/a/a/x;
        ((x)localObject2).<init>("Maximum header count exceeded");
        throw ((Throwable)localObject2);
        paramList.add(localObject2);
        i2 = 0;
        localObject3 = null;
      }
      localObject1 = localObject2;
    }
    return (b.a.a.a.e[])localObject3;
  }
  
  public p a()
  {
    int i = this.e;
    Object localObject;
    switch (i)
    {
    default: 
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Inconsistent parser state");
      throw ((Throwable)localObject);
    }
    try
    {
      localObject = this.a;
      localObject = b((f)localObject);
      this.f = ((p)localObject);
      i = 1;
      this.e = i;
      localObject = this.a;
      int j = this.c.b();
      int k = this.c.a();
      t localt = this.b;
      List localList = this.d;
      localObject = a((f)localObject, j, k, localt, localList);
      this.f.setHeaders((b.a.a.a.e[])localObject);
      localObject = this.f;
      this.f = null;
      this.d.clear();
      this.e = 0;
      return (p)localObject;
    }
    catch (aa localaa)
    {
      ab localab = new b/a/a/a/ab;
      String str = localaa.getMessage();
      localab.<init>(str, localaa);
      throw localab;
    }
  }
  
  protected abstract p b(f paramf);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */