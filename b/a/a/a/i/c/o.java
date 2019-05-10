package b.a.a.a.i.c;

import b.a.a.a.e.b.f;
import b.a.a.a.e.d;
import b.a.a.a.l;
import b.a.a.a.n;
import b.a.a.a.o.a;
import b.a.a.a.s;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

class o
  implements b.a.a.a.e.o
{
  private final b.a.a.a.e.b a;
  private final d b;
  private volatile k c;
  private volatile boolean d;
  private volatile long e;
  
  o(b.a.a.a.e.b paramb, d paramd, k paramk)
  {
    a.a(paramb, "Connection manager");
    a.a(paramd, "Connection operator");
    a.a(paramk, "HTTP pool entry");
    this.a = paramb;
    this.b = paramd;
    this.c = paramk;
    this.d = false;
    this.e = Long.MAX_VALUE;
  }
  
  private b.a.a.a.e.q p()
  {
    Object localObject = this.c;
    if (localObject == null) {}
    for (localObject = null;; localObject = (b.a.a.a.e.q)((k)localObject).g()) {
      return (b.a.a.a.e.q)localObject;
    }
  }
  
  private b.a.a.a.e.q q()
  {
    Object localObject = this.c;
    if (localObject == null)
    {
      localObject = new b/a/a/a/i/c/e;
      ((e)localObject).<init>();
      throw ((Throwable)localObject);
    }
    return (b.a.a.a.e.q)((k)localObject).g();
  }
  
  private k r()
  {
    Object localObject = this.c;
    if (localObject == null)
    {
      localObject = new b/a/a/a/i/c/e;
      ((e)localObject).<init>();
      throw ((Throwable)localObject);
    }
    return (k)localObject;
  }
  
  public s a()
  {
    return q().a();
  }
  
  public void a(long paramLong, TimeUnit paramTimeUnit)
  {
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool) {
      l = paramTimeUnit.toMillis(paramLong);
    }
    for (this.e = l;; this.e = l)
    {
      return;
      l = -1;
    }
  }
  
  public void a(b.a.a.a.e.b.b paramb, b.a.a.a.n.e parame, b.a.a.a.l.e parame1)
  {
    a.a(paramb, "Route");
    Object localObject1 = "HTTP parameters";
    a.a(parame1, (String)localObject1);
    try
    {
      localObject1 = this.c;
      if (localObject1 == null)
      {
        localObject1 = new b/a/a/a/i/c/e;
        ((e)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.c;
    localObject3 = ((k)localObject3).a();
    Object localObject6 = "Route tracker";
    b.a.a.a.o.b.a(localObject3, (String)localObject6);
    boolean bool1 = ((f)localObject3).i();
    n localn1;
    if (!bool1)
    {
      bool1 = true;
      localObject6 = "Connection already open";
      b.a.a.a.o.b.a(bool1, (String)localObject6);
      localObject3 = this.c;
      localObject6 = ((k)localObject3).g();
      localObject6 = (b.a.a.a.e.q)localObject6;
      localn1 = paramb.d();
      localObject3 = this.b;
      if (localn1 == null) {
        break label207;
      }
    }
    label207:
    for (n localn2 = localn1;; localn2 = paramb.a())
    {
      InetAddress localInetAddress = paramb.b();
      ((d)localObject3).a((b.a.a.a.e.q)localObject6, localn2, localInetAddress, parame, parame1);
      try
      {
        localObject3 = this.c;
        if (localObject3 != null) {
          break label216;
        }
        localObject3 = new java/io/InterruptedIOException;
        ((InterruptedIOException)localObject3).<init>();
        throw ((Throwable)localObject3);
      }
      finally {}
      bool1 = false;
      localObject5 = null;
      break;
    }
    label216:
    Object localObject5 = this.c;
    localObject5 = ((k)localObject5).a();
    boolean bool2;
    if (localn1 == null)
    {
      bool2 = ((b.a.a.a.e.q)localObject6).h();
      ((f)localObject5).a(bool2);
    }
    for (;;)
    {
      return;
      bool2 = ((b.a.a.a.e.q)localObject6).h();
      ((f)localObject5).a(localn1, bool2);
    }
  }
  
  public void a(l paraml)
  {
    q().a(paraml);
  }
  
  public void a(b.a.a.a.n.e parame, b.a.a.a.l.e parame1)
  {
    Object localObject1 = "HTTP parameters";
    a.a(parame1, (String)localObject1);
    try
    {
      localObject1 = this.c;
      if (localObject1 == null)
      {
        localObject1 = new b/a/a/a/i/c/e;
        ((e)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.c;
    Object localObject6 = ((k)localObject3).a();
    localObject3 = "Route tracker";
    b.a.a.a.o.b.a(localObject6, (String)localObject3);
    boolean bool = ((f)localObject6).i();
    Object localObject7 = "Connection not open";
    b.a.a.a.o.b.a(bool, (String)localObject7);
    bool = ((f)localObject6).e();
    localObject7 = "Protocol layering without a tunnel not supported";
    b.a.a.a.o.b.a(bool, (String)localObject7);
    bool = ((f)localObject6).f();
    if (!bool) {
      bool = true;
    }
    Object localObject5;
    for (;;)
    {
      localObject7 = "Multiple protocol layering not supported";
      b.a.a.a.o.b.a(bool, (String)localObject7);
      localObject6 = ((f)localObject6).a();
      localObject3 = this.c;
      localObject3 = ((k)localObject3).g();
      localObject3 = (b.a.a.a.e.q)localObject3;
      localObject7 = this.b;
      ((d)localObject7).a((b.a.a.a.e.q)localObject3, (n)localObject6, parame, parame1);
      try
      {
        localObject6 = this.c;
        if (localObject6 != null) {
          break;
        }
        localObject3 = new java/io/InterruptedIOException;
        ((InterruptedIOException)localObject3).<init>();
        throw ((Throwable)localObject3);
      }
      finally {}
      bool = false;
      localObject5 = null;
    }
    localObject6 = this.c;
    localObject6 = ((k)localObject6).a();
    bool = ((b.a.a.a.e.q)localObject5).h();
    ((f)localObject6).c(bool);
  }
  
  public void a(n paramn, boolean paramBoolean, b.a.a.a.l.e parame)
  {
    a.a(paramn, "Next proxy");
    Object localObject1 = "HTTP parameters";
    a.a(parame, (String)localObject1);
    try
    {
      localObject1 = this.c;
      if (localObject1 == null)
      {
        localObject1 = new b/a/a/a/i/c/e;
        ((e)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.c;
    localObject3 = ((k)localObject3).a();
    String str = "Route tracker";
    b.a.a.a.o.b.a(localObject3, str);
    boolean bool = ((f)localObject3).i();
    str = "Connection not open";
    b.a.a.a.o.b.a(bool, str);
    localObject3 = this.c;
    localObject3 = ((k)localObject3).g();
    localObject3 = (b.a.a.a.e.q)localObject3;
    str = null;
    ((b.a.a.a.e.q)localObject3).a(null, paramn, paramBoolean, parame);
    try
    {
      localObject3 = this.c;
      if (localObject3 == null)
      {
        localObject3 = new java/io/InterruptedIOException;
        ((InterruptedIOException)localObject3).<init>();
        throw ((Throwable)localObject3);
      }
    }
    finally {}
    Object localObject5 = this.c;
    localObject5 = ((k)localObject5).a();
    ((f)localObject5).b(paramn, paramBoolean);
  }
  
  public void a(b.a.a.a.q paramq)
  {
    q().a(paramq);
  }
  
  public void a(s params)
  {
    q().a(params);
  }
  
  public void a(Object paramObject)
  {
    r().a(paramObject);
  }
  
  public void a(boolean paramBoolean, b.a.a.a.l.e parame)
  {
    Object localObject1 = "HTTP parameters";
    a.a(parame, (String)localObject1);
    try
    {
      localObject1 = this.c;
      if (localObject1 == null)
      {
        localObject1 = new b/a/a/a/i/c/e;
        ((e)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.c;
    Object localObject6 = ((k)localObject3).a();
    localObject3 = "Route tracker";
    b.a.a.a.o.b.a(localObject6, (String)localObject3);
    boolean bool = ((f)localObject6).i();
    String str = "Connection not open";
    b.a.a.a.o.b.a(bool, str);
    bool = ((f)localObject6).e();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      str = "Connection is already tunnelled";
      b.a.a.a.o.b.a(bool, str);
      localObject6 = ((f)localObject6).a();
      localObject3 = this.c;
      localObject3 = ((k)localObject3).g();
      localObject3 = (b.a.a.a.e.q)localObject3;
      str = null;
      ((b.a.a.a.e.q)localObject3).a(null, (n)localObject6, paramBoolean, parame);
      try
      {
        localObject3 = this.c;
        if (localObject3 != null) {
          break;
        }
        localObject3 = new java/io/InterruptedIOException;
        ((InterruptedIOException)localObject3).<init>();
        throw ((Throwable)localObject3);
      }
      finally {}
      bool = false;
      localObject5 = null;
    }
    Object localObject5 = this.c;
    localObject5 = ((k)localObject5).a();
    ((f)localObject5).b(paramBoolean);
  }
  
  public boolean a(int paramInt)
  {
    return q().a(paramInt);
  }
  
  public void a_()
  {
    q().a_();
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 37	b/a/a/a/i/c/o:c	Lb/a/a/a/i/c/k;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aconst_null
    //   15: astore_1
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield 39	b/a/a/a/i/c/o:d	Z
    //   21: aload_0
    //   22: getfield 37	b/a/a/a/i/c/o:c	Lb/a/a/a/i/c/k;
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual 49	b/a/a/a/i/c/k:g	()Ljava/lang/Object;
    //   30: astore_1
    //   31: aload_1
    //   32: checkcast 51	b/a/a/a/e/q
    //   35: astore_1
    //   36: aload_1
    //   37: invokeinterface 172 1 0
    //   42: aload_0
    //   43: getfield 33	b/a/a/a/i/c/o:a	Lb/a/a/a/e/b;
    //   46: astore_1
    //   47: aload_0
    //   48: getfield 43	b/a/a/a/i/c/o:e	J
    //   51: lstore_2
    //   52: getstatic 176	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   55: astore 4
    //   57: aload_1
    //   58: aload_0
    //   59: lload_2
    //   60: aload 4
    //   62: invokeinterface 181 5 0
    //   67: aconst_null
    //   68: astore_1
    //   69: aload_0
    //   70: aconst_null
    //   71: putfield 37	b/a/a/a/i/c/o:c	Lb/a/a/a/i/c/k;
    //   74: aload_0
    //   75: monitorexit
    //   76: goto -63 -> 13
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    //   84: astore_1
    //   85: goto -43 -> 42
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	o
    //   6	63	1	localObject1	Object
    //   79	4	1	localObject2	Object
    //   84	1	1	localIOException	java.io.IOException
    //   51	9	2	l	long
    //   55	6	4	localTimeUnit	TimeUnit
    // Exception table:
    //   from	to	target	type
    //   2	6	79	finally
    //   11	13	79	finally
    //   17	21	79	finally
    //   21	25	79	finally
    //   26	30	79	finally
    //   31	35	79	finally
    //   36	42	79	finally
    //   42	46	79	finally
    //   47	51	79	finally
    //   52	55	79	finally
    //   60	67	79	finally
    //   70	74	79	finally
    //   74	76	79	finally
    //   80	82	79	finally
    //   36	42	84	java/io/IOException
  }
  
  public void b(int paramInt)
  {
    q().b(paramInt);
  }
  
  /* Error */
  public void b_()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 37	b/a/a/a/i/c/o:c	Lb/a/a/a/i/c/k;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 33	b/a/a/a/i/c/o:a	Lb/a/a/a/e/b;
    //   18: astore_1
    //   19: aload_0
    //   20: getfield 43	b/a/a/a/i/c/o:e	J
    //   23: lstore_2
    //   24: getstatic 176	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   27: astore 4
    //   29: aload_1
    //   30: aload_0
    //   31: lload_2
    //   32: aload 4
    //   34: invokeinterface 181 5 0
    //   39: aconst_null
    //   40: astore_1
    //   41: aload_0
    //   42: aconst_null
    //   43: putfield 37	b/a/a/a/i/c/o:c	Lb/a/a/a/i/c/k;
    //   46: aload_0
    //   47: monitorexit
    //   48: goto -35 -> 13
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	o
    //   6	35	1	localObject1	Object
    //   51	4	1	localObject2	Object
    //   23	9	2	l	long
    //   27	6	4	localTimeUnit	TimeUnit
    // Exception table:
    //   from	to	target	type
    //   2	6	51	finally
    //   11	13	51	finally
    //   14	18	51	finally
    //   19	23	51	finally
    //   24	27	51	finally
    //   32	39	51	finally
    //   42	46	51	finally
    //   46	48	51	finally
    //   52	54	51	finally
  }
  
  public boolean c()
  {
    b.a.a.a.e.q localq = p();
    boolean bool;
    if (localq != null) {
      bool = localq.c();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localq = null;
    }
  }
  
  public void close()
  {
    Object localObject = this.c;
    if (localObject != null)
    {
      b.a.a.a.e.q localq = (b.a.a.a.e.q)((k)localObject).g();
      localObject = ((k)localObject).a();
      ((f)localObject).h();
      localq.close();
    }
  }
  
  public boolean d()
  {
    b.a.a.a.e.q localq = p();
    if (localq != null) {}
    for (boolean bool = localq.d();; bool = true) {
      return bool;
    }
  }
  
  public void e()
  {
    Object localObject = this.c;
    if (localObject != null)
    {
      b.a.a.a.e.q localq = (b.a.a.a.e.q)((k)localObject).g();
      localObject = ((k)localObject).a();
      ((f)localObject).h();
      localq.e();
    }
  }
  
  public InetAddress f()
  {
    return q().f();
  }
  
  public int g()
  {
    return q().g();
  }
  
  public b.a.a.a.e.b.b h()
  {
    return r().c();
  }
  
  public void i()
  {
    this.d = true;
  }
  
  public void j()
  {
    this.d = false;
  }
  
  public SSLSession k()
  {
    Object localObject = q().i();
    boolean bool = localObject instanceof SSLSocket;
    if (bool) {}
    for (localObject = ((SSLSocket)localObject).getSession();; localObject = null) {
      return (SSLSession)localObject;
    }
  }
  
  k l()
  {
    return this.c;
  }
  
  k m()
  {
    k localk = this.c;
    this.c = null;
    return localk;
  }
  
  public b.a.a.a.e.b n()
  {
    return this.a;
  }
  
  public boolean o()
  {
    return this.d;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */