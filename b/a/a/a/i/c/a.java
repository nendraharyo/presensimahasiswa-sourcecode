package b.a.a.a.i.c;

import b.a.a.a.e.b;
import b.a.a.a.e.o;
import b.a.a.a.l;
import b.a.a.a.s;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

public abstract class a
  implements o, b.a.a.a.n.e
{
  private final b a;
  private volatile b.a.a.a.e.q b;
  private volatile boolean c;
  private volatile boolean d;
  private volatile long e;
  
  protected a(b paramb, b.a.a.a.e.q paramq)
  {
    this.a = paramb;
    this.b = paramq;
    this.c = false;
    this.d = false;
    this.e = Long.MAX_VALUE;
  }
  
  public s a()
  {
    b.a.a.a.e.q localq = m();
    a(localq);
    j();
    return localq.a();
  }
  
  public Object a(String paramString)
  {
    Object localObject = m();
    a((b.a.a.a.e.q)localObject);
    boolean bool = localObject instanceof b.a.a.a.n.e;
    if (bool) {}
    for (localObject = ((b.a.a.a.n.e)localObject).a(paramString);; localObject = null) {
      return localObject;
    }
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
  
  protected final void a(b.a.a.a.e.q paramq)
  {
    boolean bool = o();
    if ((bool) || (paramq == null))
    {
      e locale = new b/a/a/a/i/c/e;
      locale.<init>();
      throw locale;
    }
  }
  
  public void a(l paraml)
  {
    b.a.a.a.e.q localq = m();
    a(localq);
    j();
    localq.a(paraml);
  }
  
  public void a(b.a.a.a.q paramq)
  {
    b.a.a.a.e.q localq = m();
    a(localq);
    j();
    localq.a(paramq);
  }
  
  public void a(s params)
  {
    b.a.a.a.e.q localq = m();
    a(localq);
    j();
    localq.a(params);
  }
  
  public void a(String paramString, Object paramObject)
  {
    Object localObject = m();
    a((b.a.a.a.e.q)localObject);
    boolean bool = localObject instanceof b.a.a.a.n.e;
    if (bool)
    {
      localObject = (b.a.a.a.n.e)localObject;
      ((b.a.a.a.n.e)localObject).a(paramString, paramObject);
    }
  }
  
  public boolean a(int paramInt)
  {
    b.a.a.a.e.q localq = m();
    a(localq);
    return localq.a(paramInt);
  }
  
  public void a_()
  {
    b.a.a.a.e.q localq = m();
    a(localq);
    localq.a_();
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 29	b/a/a/a/i/c/a:d	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: iconst_1
    //   15: istore_1
    //   16: aload_0
    //   17: iload_1
    //   18: putfield 29	b/a/a/a/i/c/a:d	Z
    //   21: aload_0
    //   22: invokevirtual 43	b/a/a/a/i/c/a:j	()V
    //   25: aload_0
    //   26: invokevirtual 85	b/a/a/a/i/c/a:e	()V
    //   29: aload_0
    //   30: getfield 23	b/a/a/a/i/c/a:a	Lb/a/a/a/e/b;
    //   33: astore_2
    //   34: aload_0
    //   35: getfield 33	b/a/a/a/i/c/a:e	J
    //   38: lstore_3
    //   39: getstatic 89	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   42: astore 5
    //   44: aload_2
    //   45: aload_0
    //   46: lload_3
    //   47: aload 5
    //   49: invokeinterface 94 5 0
    //   54: goto -43 -> 11
    //   57: astore_2
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_2
    //   61: athrow
    //   62: astore_2
    //   63: goto -34 -> 29
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	a
    //   6	12	1	bool	boolean
    //   33	12	2	localb	b
    //   57	4	2	localObject	Object
    //   62	1	2	localIOException	java.io.IOException
    //   38	9	3	l	long
    //   42	6	5	localTimeUnit	TimeUnit
    // Exception table:
    //   from	to	target	type
    //   2	6	57	finally
    //   17	21	57	finally
    //   21	25	57	finally
    //   25	29	57	finally
    //   29	33	57	finally
    //   34	38	57	finally
    //   39	42	57	finally
    //   47	54	57	finally
    //   25	29	62	java/io/IOException
  }
  
  public void b(int paramInt)
  {
    b.a.a.a.e.q localq = m();
    a(localq);
    localq.b(paramInt);
  }
  
  /* Error */
  public void b_()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 29	b/a/a/a/i/c/a:d	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: iconst_1
    //   15: istore_1
    //   16: aload_0
    //   17: iload_1
    //   18: putfield 29	b/a/a/a/i/c/a:d	Z
    //   21: aload_0
    //   22: getfield 23	b/a/a/a/i/c/a:a	Lb/a/a/a/e/b;
    //   25: astore_2
    //   26: aload_0
    //   27: getfield 33	b/a/a/a/i/c/a:e	J
    //   30: lstore_3
    //   31: getstatic 89	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   34: astore 5
    //   36: aload_2
    //   37: aload_0
    //   38: lload_3
    //   39: aload 5
    //   41: invokeinterface 94 5 0
    //   46: goto -35 -> 11
    //   49: astore_2
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_2
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	a
    //   6	12	1	bool	boolean
    //   25	12	2	localb	b
    //   49	4	2	localObject	Object
    //   30	9	3	l	long
    //   34	6	5	localTimeUnit	TimeUnit
    // Exception table:
    //   from	to	target	type
    //   2	6	49	finally
    //   17	21	49	finally
    //   21	25	49	finally
    //   26	30	49	finally
    //   31	34	49	finally
    //   39	46	49	finally
  }
  
  public boolean c()
  {
    b.a.a.a.e.q localq = m();
    boolean bool;
    if (localq == null)
    {
      bool = false;
      localq = null;
    }
    for (;;)
    {
      return bool;
      bool = localq.c();
    }
  }
  
  public boolean d()
  {
    boolean bool1 = true;
    boolean bool2 = o();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      b.a.a.a.e.q localq = m();
      if (localq != null) {
        bool1 = localq.d();
      }
    }
  }
  
  public InetAddress f()
  {
    b.a.a.a.e.q localq = m();
    a(localq);
    return localq.f();
  }
  
  public int g()
  {
    b.a.a.a.e.q localq = m();
    a(localq);
    return localq.g();
  }
  
  public void i()
  {
    this.c = true;
  }
  
  public void j()
  {
    this.c = false;
  }
  
  public SSLSession k()
  {
    Object localObject1 = null;
    Object localObject2 = m();
    a((b.a.a.a.e.q)localObject2);
    boolean bool = c();
    if (!bool) {
      return (SSLSession)localObject1;
    }
    localObject2 = ((b.a.a.a.e.q)localObject2).i();
    bool = localObject2 instanceof SSLSocket;
    if (bool) {}
    for (localObject2 = ((SSLSocket)localObject2).getSession();; localObject2 = null)
    {
      localObject1 = localObject2;
      break;
    }
  }
  
  protected void l()
  {
    Object localObject1 = null;
    try
    {
      this.b = null;
      long l = Long.MAX_VALUE;
      this.e = l;
      return;
    }
    finally {}
  }
  
  protected b.a.a.a.e.q m()
  {
    return this.b;
  }
  
  protected b n()
  {
    return this.a;
  }
  
  protected boolean o()
  {
    return this.d;
  }
  
  public boolean p()
  {
    return this.c;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */