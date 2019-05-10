package b.a.a.a.i.c.a;

import b.a.a.a.e.c.i;
import b.a.a.a.e.o;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class g
  implements b.a.a.a.e.b
{
  public b.a.a.a.h.b a;
  protected final i b;
  protected final a c;
  protected final d d;
  protected final b.a.a.a.e.d e;
  protected final b.a.a.a.e.a.c f;
  
  public g()
  {
    this(locali);
  }
  
  public g(i parami)
  {
    this(parami, -1, localTimeUnit);
  }
  
  public g(i parami, long paramLong, TimeUnit paramTimeUnit)
  {
    this(parami, paramLong, paramTimeUnit, localc);
  }
  
  public g(i parami, long paramLong, TimeUnit paramTimeUnit, b.a.a.a.e.a.c paramc)
  {
    b.a.a.a.o.a.a(parami, "Scheme registry");
    Object localObject = new b/a/a/a/h/b;
    Class localClass = getClass();
    ((b.a.a.a.h.b)localObject).<init>(localClass);
    this.a = ((b.a.a.a.h.b)localObject);
    this.b = parami;
    this.f = paramc;
    localObject = a(parami);
    this.e = ((b.a.a.a.e.d)localObject);
    localObject = a(paramLong, paramTimeUnit);
    this.d = ((d)localObject);
    localObject = this.d;
    this.c = ((a)localObject);
  }
  
  public g(b.a.a.a.l.e parame, i parami)
  {
    b.a.a.a.o.a.a(parami, "Scheme registry");
    Object localObject = new b/a/a/a/h/b;
    Class localClass = getClass();
    ((b.a.a.a.h.b)localObject).<init>(localClass);
    this.a = ((b.a.a.a.h.b)localObject);
    this.b = parami;
    localObject = new b/a/a/a/e/a/c;
    ((b.a.a.a.e.a.c)localObject).<init>();
    this.f = ((b.a.a.a.e.a.c)localObject);
    localObject = a(parami);
    this.e = ((b.a.a.a.e.d)localObject);
    localObject = (d)a(parame);
    this.d = ((d)localObject);
    localObject = this.d;
    this.c = ((a)localObject);
  }
  
  public i a()
  {
    return this.b;
  }
  
  protected b.a.a.a.e.d a(i parami)
  {
    b.a.a.a.i.c.g localg = new b/a/a/a/i/c/g;
    localg.<init>(parami);
    return localg;
  }
  
  public b.a.a.a.e.e a(b.a.a.a.e.b.b paramb, Object paramObject)
  {
    e locale = this.d.a(paramb, paramObject);
    g.1 local1 = new b/a/a/a/i/c/a/g$1;
    local1.<init>(this, locale, paramb);
    return local1;
  }
  
  protected a a(b.a.a.a.l.e parame)
  {
    d locald = new b/a/a/a/i/c/a/d;
    b.a.a.a.e.d locald1 = this.e;
    locald.<init>(locald1, parame);
    return locald;
  }
  
  protected d a(long paramLong, TimeUnit paramTimeUnit)
  {
    d locald = new b/a/a/a/i/c/a/d;
    b.a.a.a.e.d locald1 = this.e;
    b.a.a.a.e.a.c localc = this.f;
    locald.<init>(locald1, localc, 20, paramLong, paramTimeUnit);
    return locald;
  }
  
  public void a(o paramo, long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1 = paramo instanceof c;
    Object localObject1 = "Connection class mismatch, connection not obtained from this manager";
    b.a.a.a.o.a.a(bool1, (String)localObject1);
    paramo = (c)paramo;
    Object localObject2 = paramo.q();
    if (localObject2 != null)
    {
      localObject2 = paramo.n();
      if (localObject2 != this) {
        break label82;
      }
      bool1 = true;
      localObject1 = "Connection not obtained from this manager";
      b.a.a.a.o.b.a(bool1, (String)localObject1);
    }
    Object localObject5;
    label82:
    boolean bool2;
    for (;;)
    {
      try
      {
        localObject5 = paramo.q();
        localObject5 = (b)localObject5;
        if (localObject5 == null)
        {
          return;
          bool1 = false;
          localObject2 = null;
          break;
        }
      }
      finally {}
      try
      {
        bool1 = paramo.c();
        if (bool1)
        {
          bool1 = paramo.p();
          if (!bool1) {
            paramo.e();
          }
        }
        bool2 = paramo.p();
        localObject2 = this.a;
        bool1 = ((b.a.a.a.h.b)localObject2).a();
        if (bool1)
        {
          if (!bool2) {
            break label197;
          }
          localObject2 = this.a;
          localObject1 = "Released connection is reusable.";
          ((b.a.a.a.h.b)localObject2).a(localObject1);
        }
        paramo.l();
        localObject1 = this.d;
        ((d)localObject1).a((b)localObject5, bool2, paramLong, paramTimeUnit);
      }
      catch (IOException localIOException)
      {
        b.a.a.a.h.b localb1;
        localObject1 = this.a;
        bool3 = ((b.a.a.a.h.b)localObject1).a();
        if (!bool3) {
          break label256;
        }
        localObject1 = this.a;
        str1 = "Exception shutting down released connection.";
        ((b.a.a.a.h.b)localObject1).a(str1, localIOException);
        bool2 = paramo.p();
        localb2 = this.a;
        bool1 = localb2.a();
        if (!bool1) {
          break label302;
        }
        if (!bool2) {
          break label327;
        }
        localb2 = this.a;
        localObject1 = "Released connection is reusable.";
        localb2.a(localObject1);
        for (;;)
        {
          paramo.l();
          localObject1 = this.d;
          ((d)localObject1).a((b)localObject5, bool2, paramLong, paramTimeUnit);
          break;
          localb2 = this.a;
          localObject1 = "Released connection is not reusable.";
          localb2.a(localObject1);
        }
      }
      finally
      {
        bool2 = paramo.p();
        localObject1 = this.a;
        bool3 = ((b.a.a.a.h.b)localObject1).a();
        if (!bool3) {
          break label395;
        }
        if (!bool2) {
          break label420;
        }
        localObject1 = this.a;
        str2 = "Released connection is reusable.";
        ((b.a.a.a.h.b)localObject1).a(str2);
      }
      continue;
      label197:
      localb1 = this.a;
      localObject1 = "Released connection is not reusable.";
      localb1.a(localObject1);
    }
    for (;;)
    {
      boolean bool3;
      String str1;
      label256:
      b.a.a.a.h.b localb2;
      label302:
      label327:
      label395:
      paramo.l();
      localObject1 = this.d;
      ((d)localObject1).a((b)localObject5, bool2, paramLong, paramTimeUnit);
      throw ((Throwable)localObject4);
      label420:
      localObject1 = this.a;
      String str2 = "Released connection is not reusable.";
      ((b.a.a.a.h.b)localObject1).a(str2);
    }
  }
  
  public void b()
  {
    this.a.a("Shutting down");
    this.d.a();
  }
  
  protected void finalize()
  {
    try
    {
      b();
      return;
    }
    finally
    {
      super.finalize();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\a\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */