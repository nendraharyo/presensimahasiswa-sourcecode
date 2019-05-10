package b.a.a.a.i.b;

import b.a.a.a.ab;
import b.a.a.a.ac;
import b.a.a.a.af;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public class p
  implements b.a.a.a.b.q
{
  public b.a.a.a.h.b a;
  protected final b.a.a.a.e.b b;
  protected final b.a.a.a.e.b.d c;
  protected final b.a.a.a.b d;
  protected final b.a.a.a.e.g e;
  protected final b.a.a.a.n.h f;
  protected final b.a.a.a.n.g g;
  protected final b.a.a.a.b.k h;
  protected final b.a.a.a.b.o i;
  protected final b.a.a.a.b.p j;
  protected final b.a.a.a.b.b k;
  protected final b.a.a.a.b.c l;
  protected final b.a.a.a.b.b m;
  protected final b.a.a.a.b.c n;
  protected final b.a.a.a.b.r o;
  protected final b.a.a.a.l.e p;
  protected b.a.a.a.e.o q;
  protected final b.a.a.a.a.h r;
  protected final b.a.a.a.a.h s;
  private final s t;
  private int u;
  private int v;
  private final int w;
  private b.a.a.a.n x;
  
  public p(b.a.a.a.h.b paramb, b.a.a.a.n.h paramh, b.a.a.a.e.b paramb1, b.a.a.a.b paramb2, b.a.a.a.e.g paramg, b.a.a.a.e.b.d paramd, b.a.a.a.n.g paramg1, b.a.a.a.b.k paramk, b.a.a.a.b.p paramp, b.a.a.a.b.c paramc1, b.a.a.a.b.c paramc2, b.a.a.a.b.r paramr, b.a.a.a.l.e parame)
  {
    b.a.a.a.o.a.a(paramb, "Log");
    b.a.a.a.o.a.a(paramh, "Request executor");
    b.a.a.a.o.a.a(paramb1, "Client connection manager");
    b.a.a.a.o.a.a(paramb2, "Connection reuse strategy");
    b.a.a.a.o.a.a(paramg, "Connection keep alive strategy");
    b.a.a.a.o.a.a(paramd, "Route planner");
    b.a.a.a.o.a.a(paramg1, "HTTP protocol processor");
    b.a.a.a.o.a.a(paramk, "HTTP request retry handler");
    b.a.a.a.o.a.a(paramp, "Redirect strategy");
    b.a.a.a.o.a.a(paramc1, "Target authentication strategy");
    b.a.a.a.o.a.a(paramc2, "Proxy authentication strategy");
    b.a.a.a.o.a.a(paramr, "User token handler");
    b.a.a.a.o.a.a(parame, "HTTP parameters");
    this.a = paramb;
    Object localObject = new b/a/a/a/i/b/s;
    ((s)localObject).<init>(paramb);
    this.t = ((s)localObject);
    this.f = paramh;
    this.b = paramb1;
    this.d = paramb2;
    this.e = paramg;
    this.c = paramd;
    this.g = paramg1;
    this.h = paramk;
    this.j = paramp;
    this.l = paramc1;
    this.n = paramc2;
    this.o = paramr;
    this.p = parame;
    boolean bool = paramp instanceof o;
    if (bool)
    {
      paramp = (o)paramp;
      localObject = paramp.a();
      this.i = ((b.a.a.a.b.o)localObject);
      bool = paramc1 instanceof b;
      if (!bool) {
        break label376;
      }
      paramc1 = (b)paramc1;
      localObject = paramc1.a();
      this.k = ((b.a.a.a.b.b)localObject);
      label261:
      bool = paramc2 instanceof b;
      if (!bool) {
        break label390;
      }
      paramc2 = (b)paramc2;
      localObject = paramc2.a();
    }
    for (this.m = ((b.a.a.a.b.b)localObject);; this.m = null)
    {
      this.q = null;
      this.u = 0;
      this.v = 0;
      localObject = new b/a/a/a/a/h;
      ((b.a.a.a.a.h)localObject).<init>();
      this.r = ((b.a.a.a.a.h)localObject);
      localObject = new b/a/a/a/a/h;
      ((b.a.a.a.a.h)localObject).<init>();
      this.s = ((b.a.a.a.a.h)localObject);
      int i1 = this.p.a("http.protocol.max-redirects", 100);
      this.w = i1;
      return;
      i1 = 0;
      localObject = null;
      this.i = null;
      break;
      label376:
      i1 = 0;
      localObject = null;
      this.k = null;
      break label261;
      label390:
      i1 = 0;
      localObject = null;
    }
  }
  
  private w a(b.a.a.a.q paramq)
  {
    boolean bool = paramq instanceof b.a.a.a.l;
    Object localObject;
    if (bool)
    {
      localObject = new b/a/a/a/i/b/r;
      paramq = (b.a.a.a.l)paramq;
      ((r)localObject).<init>(paramq);
    }
    for (;;)
    {
      return (w)localObject;
      localObject = new b/a/a/a/i/b/w;
      ((w)localObject).<init>(paramq);
    }
  }
  
  private void a(x paramx, b.a.a.a.n.e parame)
  {
    b.a.a.a.e.b.b localb = paramx.b();
    w localw = paramx.a();
    int i1 = 0;
    for (;;)
    {
      Object localObject1 = "http.request";
      parame.a((String)localObject1, localw);
      i1 += 1;
      try
      {
        localObject1 = this.q;
        boolean bool1 = ((b.a.a.a.e.o)localObject1).c();
        Object localObject2;
        if (!bool1)
        {
          localObject1 = this.q;
          localObject2 = this.p;
          ((b.a.a.a.e.o)localObject1).a(localb, parame, (b.a.a.a.l.e)localObject2);
        }
        for (;;)
        {
          a(localb, parame);
          return;
          localObject1 = this.q;
          localObject2 = this.p;
          int i2 = b.a.a.a.l.c.a((b.a.a.a.l.e)localObject2);
          ((b.a.a.a.e.o)localObject1).b(i2);
        }
        try
        {
          localObject2 = this.q;
          ((b.a.a.a.e.o)localObject2).close();
        }
        catch (IOException localIOException2)
        {
          boolean bool2;
          Object localObject3;
          String str;
          b.a.a.a.h.b localb1;
          for (;;) {}
        }
      }
      catch (IOException localIOException1) {}
      localObject2 = this.h;
      bool2 = ((b.a.a.a.b.k)localObject2).retryRequest(localIOException1, i1, parame);
      if (!bool2) {
        break;
      }
      localObject2 = this.a;
      bool2 = ((b.a.a.a.h.b)localObject2).d();
      if (bool2)
      {
        localObject2 = this.a;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("I/O exception (");
        str = localIOException1.getClass().getName();
        localObject3 = ((StringBuilder)localObject3).append(str).append(") caught when connecting to ").append(localb).append(": ");
        str = localIOException1.getMessage();
        localObject3 = str;
        ((b.a.a.a.h.b)localObject2).d(localObject3);
        localObject2 = this.a;
        bool2 = ((b.a.a.a.h.b)localObject2).a();
        if (bool2)
        {
          localObject2 = this.a;
          localObject3 = localIOException1.getMessage();
          ((b.a.a.a.h.b)localObject2).a(localObject3, localIOException1);
        }
        localb1 = this.a;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "Retrying connect to ";
        localObject2 = (String)localObject3 + localb;
        localb1.d(localObject2);
      }
    }
    throw localb1;
  }
  
  private b.a.a.a.s b(x paramx, b.a.a.a.n.e parame)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = paramx.a();
    Object localObject3 = paramx.b();
    boolean bool2 = false;
    Object localObject4 = null;
    for (;;)
    {
      int i1 = this.u + 1;
      this.u = i1;
      ((w)localObject2).e();
      boolean bool3 = ((w)localObject2).a();
      if (!bool3)
      {
        localObject1 = this.a;
        localObject2 = "Cannot retry non-repeatable request";
        ((b.a.a.a.h.b)localObject1).a(localObject2);
        if (localObject4 != null)
        {
          localObject1 = new b/a/a/a/b/m;
          ((b.a.a.a.b.m)localObject1).<init>("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", (Throwable)localObject4);
          throw ((Throwable)localObject1);
        }
        localObject4 = new b/a/a/a/b/m;
        ((b.a.a.a.b.m)localObject4).<init>("Cannot retry request with a non-repeatable request entity.");
        throw ((Throwable)localObject4);
      }
      try
      {
        localObject4 = this.q;
        bool2 = ((b.a.a.a.e.o)localObject4).c();
        Object localObject5;
        Object localObject6;
        int i2;
        if (!bool2)
        {
          bool2 = ((b.a.a.a.e.b.b)localObject3).e();
          if (!bool2)
          {
            localObject4 = this.a;
            localObject5 = "Reopening the direct connection.";
            ((b.a.a.a.h.b)localObject4).a(localObject5);
            localObject4 = this.q;
            localObject5 = this.p;
            ((b.a.a.a.e.o)localObject4).a((b.a.a.a.e.b.b)localObject3, parame, (b.a.a.a.l.e)localObject5);
          }
        }
        else
        {
          localObject4 = this.a;
          bool2 = ((b.a.a.a.h.b)localObject4).a();
          if (bool2)
          {
            localObject4 = this.a;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "Attempt ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            i2 = this.u;
            localObject5 = ((StringBuilder)localObject5).append(i2);
            localObject6 = " to execute request";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).toString();
            ((b.a.a.a.h.b)localObject4).a(localObject5);
          }
          localObject4 = this.f;
          localObject5 = this.q;
          localObject1 = ((b.a.a.a.n.h)localObject4).a((b.a.a.a.q)localObject2, (b.a.a.a.i)localObject5, parame);
        }
        for (;;)
        {
          return (b.a.a.a.s)localObject1;
          localObject4 = this.a;
          localObject5 = "Proxied connection. Need to start over.";
          ((b.a.a.a.h.b)localObject4).a(localObject5);
        }
        try
        {
          localObject5 = this.q;
          ((b.a.a.a.e.o)localObject5).close();
        }
        catch (IOException localIOException2)
        {
          String str;
          StackTraceElement[] arrayOfStackTraceElement;
          for (;;) {}
        }
      }
      catch (IOException localIOException1)
      {
        localObject5 = this.a;
        localObject6 = "Closing the connection.";
        ((b.a.a.a.h.b)localObject5).a(localObject6);
      }
      localObject5 = this.h;
      i2 = ((w)localObject2).d();
      bool3 = ((b.a.a.a.b.k)localObject5).retryRequest(localIOException1, i2, parame);
      if (!bool3) {
        break;
      }
      localObject5 = this.a;
      bool3 = ((b.a.a.a.h.b)localObject5).d();
      if (bool3)
      {
        localObject5 = this.a;
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        localObject6 = ((StringBuilder)localObject6).append("I/O exception (");
        str = localIOException1.getClass().getName();
        localObject6 = ((StringBuilder)localObject6).append(str).append(") caught when processing request to ").append(localObject3).append(": ");
        str = localIOException1.getMessage();
        localObject6 = str;
        ((b.a.a.a.h.b)localObject5).d(localObject6);
      }
      localObject5 = this.a;
      bool3 = ((b.a.a.a.h.b)localObject5).a();
      if (bool3)
      {
        localObject5 = this.a;
        localObject6 = localIOException1.getMessage();
        ((b.a.a.a.h.b)localObject5).a(localObject6, localIOException1);
      }
      localObject5 = this.a;
      bool3 = ((b.a.a.a.h.b)localObject5).d();
      if (bool3)
      {
        localObject5 = this.a;
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        str = "Retrying request to ";
        localObject6 = str + localObject3;
        ((b.a.a.a.h.b)localObject5).d(localObject6);
      }
    }
    bool1 = localIOException1 instanceof b.a.a.a.z;
    if (bool1)
    {
      localObject1 = new b/a/a/a/z;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = ((b.a.a.a.e.b.b)localObject3).a().e();
      localObject2 = (String)localObject3 + " failed to respond";
      ((b.a.a.a.z)localObject1).<init>((String)localObject2);
      arrayOfStackTraceElement = ((IOException)localIOException1).getStackTrace();
      ((b.a.a.a.z)localObject1).setStackTrace(arrayOfStackTraceElement);
      throw ((Throwable)localObject1);
    }
    throw arrayOfStackTraceElement;
  }
  
  private void b()
  {
    b.a.a.a.e.o localo = this.q;
    if (localo != null)
    {
      Object localObject1 = null;
      this.q = null;
    }
    try
    {
      localo.b();
    }
    catch (IOException localIOException2)
    {
      try
      {
        for (;;)
        {
          localo.b_();
          return;
          localIOException2 = localIOException2;
          localObject2 = this.a;
          boolean bool = ((b.a.a.a.h.b)localObject2).a();
          if (bool)
          {
            localObject2 = this.a;
            String str = localIOException2.getMessage();
            ((b.a.a.a.h.b)localObject2).a(str, localIOException2);
          }
        }
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          b.a.a.a.h.b localb = this.a;
          Object localObject2 = "Error releasing connection";
          localb.a(localObject2, localIOException1);
        }
      }
    }
  }
  
  protected x a(x paramx, b.a.a.a.s params, b.a.a.a.n.e parame)
  {
    b.a.a.a.e.b.b localb = paramx.b();
    w localw = paramx.a();
    b.a.a.a.l.e locale = localw.getParams();
    boolean bool1 = b.a.a.a.b.d.b.b(locale);
    Object localObject1;
    int i2;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool1)
    {
      localObject1 = (b.a.a.a.n)parame.a("http.target_host");
      if (localObject1 == null) {
        localObject1 = localb.a();
      }
      i2 = ((b.a.a.a.n)localObject1).b();
      if (i2 >= 0) {
        break label787;
      }
      localObject2 = this.b.a().a((b.a.a.a.n)localObject1);
      localObject3 = new b/a/a/a/n;
      localObject4 = ((b.a.a.a.n)localObject1).a();
      int i3 = ((b.a.a.a.e.c.e)localObject2).a();
      localObject1 = ((b.a.a.a.n)localObject1).c();
      ((b.a.a.a.n)localObject3).<init>((String)localObject4, i3, (String)localObject1);
    }
    for (;;)
    {
      localObject1 = this.t;
      localObject4 = this.l;
      Object localObject5 = this.r;
      localObject2 = params;
      Object localObject6 = parame;
      bool1 = ((s)localObject1).a((b.a.a.a.n)localObject3, params, (b.a.a.a.b.c)localObject4, (b.a.a.a.a.h)localObject5, parame);
      localObject4 = localb.d();
      if (localObject4 == null) {
        localObject4 = localb.a();
      }
      localObject2 = this.t;
      localObject6 = this.n;
      Object localObject7 = this.s;
      localObject5 = params;
      Object localObject8 = parame;
      boolean bool3 = ((s)localObject2).a((b.a.a.a.n)localObject4, params, (b.a.a.a.b.c)localObject6, (b.a.a.a.a.h)localObject7, parame);
      if (bool1)
      {
        localObject5 = this.t;
        localObject8 = this.l;
        b.a.a.a.a.h localh = this.r;
        localObject6 = localObject3;
        localObject7 = params;
        bool1 = ((s)localObject5).c((b.a.a.a.n)localObject3, params, (b.a.a.a.b.c)localObject8, localh, parame);
        if (!bool1) {}
      }
      for (;;)
      {
        return paramx;
        if (bool3)
        {
          localObject2 = this.t;
          localObject6 = this.n;
          localObject7 = this.s;
          localObject5 = params;
          localObject8 = parame;
          bool1 = ((s)localObject2).c((b.a.a.a.n)localObject4, params, (b.a.a.a.b.c)localObject6, (b.a.a.a.a.h)localObject7, parame);
          if (bool1) {}
        }
        else
        {
          bool1 = b.a.a.a.b.d.b.a(locale);
          if (bool1)
          {
            localObject1 = this.j;
            bool1 = ((b.a.a.a.b.p)localObject1).a(localw, params, parame);
            if (bool1)
            {
              int i1 = this.v;
              i2 = this.w;
              if (i1 >= i2)
              {
                localObject1 = new b/a/a/a/b/n;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                localObject3 = ((StringBuilder)localObject3).append("Maximum redirects (");
                int i4 = this.w;
                localObject3 = i4 + ") exceeded";
                ((b.a.a.a.b.n)localObject1).<init>((String)localObject3);
                throw ((Throwable)localObject1);
              }
              i1 = this.v + 1;
              this.v = i1;
              i1 = 0;
              this.x = null;
              localObject1 = this.j.b(localw, params, parame);
              localObject3 = localw.c().getAllHeaders();
              ((b.a.a.a.b.c.l)localObject1).setHeaders((b.a.a.a.e[])localObject3);
              localObject3 = ((b.a.a.a.b.c.l)localObject1).getURI();
              localObject2 = b.a.a.a.b.f.d.b((URI)localObject3);
              if (localObject2 == null)
              {
                localObject1 = new b/a/a/a/ab;
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                localObject3 = "Redirect URI does not specify a valid host name: " + localObject3;
                ((ab)localObject1).<init>((String)localObject3);
                throw ((Throwable)localObject1);
              }
              localObject4 = localb.a();
              boolean bool4 = ((b.a.a.a.n)localObject4).equals(localObject2);
              if (!bool4)
              {
                localObject4 = this.a;
                localObject5 = "Resetting target auth state";
                ((b.a.a.a.h.b)localObject4).a(localObject5);
                this.r.a();
                localObject4 = this.s.c();
                if (localObject4 != null)
                {
                  bool4 = ((b.a.a.a.a.c)localObject4).c();
                  if (bool4)
                  {
                    localObject4 = this.a;
                    localObject5 = "Resetting proxy auth state";
                    ((b.a.a.a.h.b)localObject4).a(localObject5);
                    localObject4 = this.s;
                    ((b.a.a.a.a.h)localObject4).a();
                  }
                }
              }
              localObject1 = a((b.a.a.a.q)localObject1);
              ((w)localObject1).setParams(locale);
              localObject2 = b((b.a.a.a.n)localObject2, (b.a.a.a.q)localObject1, parame);
              paramx = new b/a/a/a/i/b/x;
              paramx.<init>((w)localObject1, (b.a.a.a.e.b.b)localObject2);
              localObject1 = this.a;
              boolean bool2 = ((b.a.a.a.h.b)localObject1).a();
              if (!bool2) {
                continue;
              }
              localObject1 = this.a;
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              localObject5 = "Redirecting to '";
              localObject3 = ((StringBuilder)localObject4).append((String)localObject5).append(localObject3);
              localObject4 = "' via ";
              localObject3 = (String)localObject4 + localObject2;
              ((b.a.a.a.h.b)localObject1).a(localObject3);
              continue;
            }
          }
          paramx = null;
        }
      }
      label787:
      localObject3 = localObject1;
    }
  }
  
  public b.a.a.a.s a(b.a.a.a.n paramn, b.a.a.a.q paramq, b.a.a.a.n.e parame)
  {
    int i1 = 0;
    Object localObject1 = null;
    int i2 = -1;
    Object localObject2 = this.r;
    Object localObject3 = parame;
    parame.a("http.auth.target-scope", localObject2);
    localObject2 = this.s;
    parame.a("http.auth.proxy-scope", localObject2);
    localObject2 = a(paramq);
    Object localObject4 = this.p;
    ((w)localObject2).setParams((b.a.a.a.l.e)localObject4);
    Object localObject8 = b(paramn, (b.a.a.a.q)localObject2, parame);
    localObject4 = ((w)localObject2).getParams();
    Object localObject9 = "http.virtual-host";
    localObject4 = (b.a.a.a.n)((b.a.a.a.l.e)localObject4).a((String)localObject9);
    this.x = ((b.a.a.a.n)localObject4);
    localObject4 = this.x;
    Object localObject11;
    if (localObject4 != null)
    {
      localObject4 = this.x;
      i3 = ((b.a.a.a.n)localObject4).b();
      if (i3 == i2)
      {
        if (paramn == null) {
          break label710;
        }
        localObject4 = paramn;
        i3 = ((b.a.a.a.n)localObject4).b();
        if (i3 != i2)
        {
          localObject9 = new b/a/a/a/n;
          localObject10 = this.x.a();
          localObject11 = this.x.c();
          ((b.a.a.a.n)localObject9).<init>((String)localObject10, i3, (String)localObject11);
          this.x = ((b.a.a.a.n)localObject9);
        }
      }
    }
    localObject9 = new b/a/a/a/i/b/x;
    ((x)localObject9).<init>((w)localObject2, (b.a.a.a.e.b.b)localObject8);
    int i3 = 0;
    localObject4 = null;
    i2 = 0;
    Object localObject10 = null;
    label226:
    if (i1 == 0) {}
    for (;;)
    {
      try
      {
        localObject8 = ((x)localObject9).a();
        localObject11 = ((x)localObject9).b();
        localObject4 = "http.user-token";
        localObject3 = parame;
        localObject2 = parame.a((String)localObject4);
        localObject4 = this.q;
        if (localObject4 == null)
        {
          localObject4 = this.b;
          localObject12 = ((b.a.a.a.e.b)localObject4).a((b.a.a.a.e.b.b)localObject11, localObject2);
          bool2 = paramq instanceof b.a.a.a.b.c.a;
          if (bool2)
          {
            localObject3 = paramq;
            localObject3 = (b.a.a.a.b.c.a)paramq;
            localObject4 = localObject3;
            ((b.a.a.a.b.c.a)localObject3).setConnectionRequest((b.a.a.a.e.e)localObject12);
          }
          localObject4 = this.p;
          l1 = b.a.a.a.b.d.b.c((b.a.a.a.l.e)localObject4);
        }
        try
        {
          localObject4 = TimeUnit.MILLISECONDS;
          localObject4 = ((b.a.a.a.e.e)localObject12).a(l1, (TimeUnit)localObject4);
          this.q = ((b.a.a.a.e.o)localObject4);
          localObject4 = this.p;
          bool2 = b.a.a.a.l.c.f((b.a.a.a.l.e)localObject4);
          if (bool2)
          {
            localObject4 = this.q;
            bool2 = ((b.a.a.a.e.o)localObject4).c();
            if (bool2)
            {
              localObject4 = this.a;
              localObject12 = "Stale connection check";
              ((b.a.a.a.h.b)localObject4).a(localObject12);
              localObject4 = this.q;
              bool2 = ((b.a.a.a.e.o)localObject4).d();
              if (bool2)
              {
                localObject4 = this.a;
                localObject12 = "Stale connection detected";
                ((b.a.a.a.h.b)localObject4).a(localObject12);
                localObject4 = this.q;
                ((b.a.a.a.e.o)localObject4).close();
              }
            }
          }
          bool2 = paramq instanceof b.a.a.a.b.c.a;
          if (bool2)
          {
            localObject3 = paramq;
            localObject3 = (b.a.a.a.b.c.a)paramq;
            localObject4 = localObject3;
            localObject12 = this.q;
            ((b.a.a.a.b.c.a)localObject3).setReleaseTrigger((b.a.a.a.e.i)localObject12);
          }
          localObject3 = parame;
        }
        catch (InterruptedException localInterruptedException)
        {
          label710:
          Object localObject5 = Thread.currentThread();
          ((Thread)localObject5).interrupt();
          localObject5 = new java/io/InterruptedIOException;
          ((InterruptedIOException)localObject5).<init>();
          throw ((Throwable)localObject5);
        }
        try
        {
          a((x)localObject9, parame);
          localObject4 = ((w)localObject8).getURI();
          localObject4 = ((URI)localObject4).getUserInfo();
          if (localObject4 != null)
          {
            localObject12 = this.r;
            localObject13 = new b/a/a/a/i/a/b;
            ((b.a.a.a.i.a.b)localObject13).<init>();
            localObject14 = new b/a/a/a/a/r;
            ((b.a.a.a.a.r)localObject14).<init>((String)localObject4);
            ((b.a.a.a.a.h)localObject12).a((b.a.a.a.a.c)localObject13, (b.a.a.a.a.m)localObject14);
          }
          localObject4 = this.x;
          if (localObject4 == null) {
            continue;
          }
          paramn = this.x;
          if (paramn == null) {
            paramn = ((b.a.a.a.e.b.b)localObject11).a();
          }
          ((w)localObject8).b();
          a((w)localObject8, (b.a.a.a.e.b.b)localObject11);
          localObject4 = "http.target_host";
          localObject3 = parame;
          parame.a((String)localObject4, paramn);
          localObject4 = "http.route";
          parame.a((String)localObject4, localObject11);
          localObject4 = "http.connection";
          localObject11 = this.q;
          parame.a((String)localObject4, localObject11);
          localObject4 = this.f;
          localObject11 = this.g;
          ((b.a.a.a.n.h)localObject4).a((b.a.a.a.q)localObject8, (b.a.a.a.n.g)localObject11, parame);
          localObject8 = b((x)localObject9, parame);
          if (localObject8 != null) {
            continue;
          }
          localObject4 = localObject8;
        }
        catch (z localz)
        {
          localObject2 = this.a;
          bool3 = ((b.a.a.a.h.b)localObject2).a();
          if (!bool3) {
            continue;
          }
          localObject2 = this.a;
          localObject1 = localz.getMessage();
          ((b.a.a.a.h.b)localObject2).a(localObject1);
          localObject6 = localz.a();
        }
        localObject4 = ((b.a.a.a.e.b.b)localObject8).a();
      }
      catch (b.a.a.a.i.c.e locale)
      {
        boolean bool2;
        long l1;
        Object localObject13;
        Object localObject14;
        localObject2 = new java/io/InterruptedIOException;
        ((InterruptedIOException)localObject2).<init>("Connection has been shut down");
        ((InterruptedIOException)localObject2).initCause(locale);
        throw ((Throwable)localObject2);
        boolean bool3;
        if (localObject6 != null)
        {
          localObject2 = ((b.a.a.a.s)localObject6).b();
          if (localObject2 != null)
          {
            localObject2 = ((b.a.a.a.s)localObject6).b();
            bool3 = ((b.a.a.a.k)localObject2).isStreaming();
            if (bool3) {
              continue;
            }
          }
        }
        if (i2 != 0)
        {
          localObject2 = this.q;
          ((b.a.a.a.e.o)localObject2).i();
        }
        a();
        return (b.a.a.a.s)localObject6;
        Object localObject6 = ((w)localObject8).getURI();
        boolean bool4 = ((URI)localObject6).isAbsolute();
        if (!bool4) {
          continue;
        }
        paramn = b.a.a.a.b.f.d.b((URI)localObject6);
        continue;
        localObject6 = this.p;
        ((b.a.a.a.s)localObject8).setParams((b.a.a.a.l.e)localObject6);
        localObject6 = this.f;
        localObject10 = this.g;
        ((b.a.a.a.n.h)localObject6).a((b.a.a.a.s)localObject8, (b.a.a.a.n.g)localObject10, parame);
        localObject6 = this.d;
        bool1 = ((b.a.a.a.b)localObject6).a((b.a.a.a.s)localObject8, parame);
        if (bool1)
        {
          localObject6 = this.e;
          long l2 = ((b.a.a.a.e.g)localObject6).a((b.a.a.a.s)localObject8, parame);
          localObject6 = this.a;
          bool2 = ((b.a.a.a.h.b)localObject6).a();
          if (bool2)
          {
            l1 = 0L;
            bool2 = l2 < l1;
            if (bool2)
            {
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>();
              localObject13 = "for ";
              localObject6 = ((StringBuilder)localObject6).append((String)localObject13);
              localObject6 = ((StringBuilder)localObject6).append(l2);
              localObject13 = " ";
              localObject6 = ((StringBuilder)localObject6).append((String)localObject13);
              localObject13 = TimeUnit.MILLISECONDS;
              localObject6 = ((StringBuilder)localObject6).append(localObject13);
              localObject6 = ((StringBuilder)localObject6).toString();
              localObject13 = this.a;
              localObject14 = new java/lang/StringBuilder;
              ((StringBuilder)localObject14).<init>();
              String str = "Connection can be kept alive ";
              localObject14 = ((StringBuilder)localObject14).append(str);
              localObject6 = ((StringBuilder)localObject14).append((String)localObject6);
              localObject6 = ((StringBuilder)localObject6).toString();
              ((b.a.a.a.h.b)localObject13).a(localObject6);
            }
          }
          else
          {
            localObject6 = this.q;
            localObject13 = TimeUnit.MILLISECONDS;
            ((b.a.a.a.e.o)localObject6).a(l2, (TimeUnit)localObject13);
          }
        }
        else
        {
          localObject3 = parame;
          localObject6 = a((x)localObject9, (b.a.a.a.s)localObject8, parame);
          if (localObject6 != null) {
            continue;
          }
          bool2 = true;
          i1 = bool2;
          localObject6 = this.q;
          if (localObject6 != null)
          {
            if (localObject2 != null) {
              break label1647;
            }
            localObject6 = this.o;
            localObject3 = parame;
            localObject6 = ((b.a.a.a.b.r)localObject6).a(parame);
            localObject2 = "http.user-token";
            parame.a((String)localObject2, localObject6);
            if (localObject6 != null)
            {
              localObject2 = this.q;
              ((b.a.a.a.e.o)localObject2).a(localObject6);
            }
          }
          localObject6 = localObject8;
          break label226;
        }
        localObject6 = "indefinitely";
        continue;
        if (bool1)
        {
          localObject11 = ((b.a.a.a.s)localObject8).b();
          b.a.a.a.o.f.a((b.a.a.a.k)localObject11);
          localObject11 = this.q;
          ((b.a.a.a.e.o)localObject11).i();
          localObject11 = ((x)localObject6).b();
          localObject9 = ((x)localObject9).b();
          boolean bool5 = ((b.a.a.a.e.b.b)localObject11).equals(localObject9);
          if (!bool5) {
            a();
          }
          localObject9 = localObject6;
          continue;
        }
        localObject11 = this.q;
        ((b.a.a.a.e.o)localObject11).close();
        localObject11 = this.s;
        localObject11 = ((b.a.a.a.a.h)localObject11).b();
        Object localObject12 = b.a.a.a.a.b.b;
        int i4 = ((b.a.a.a.a.b)localObject11).compareTo((Enum)localObject12);
        if (i4 > 0)
        {
          localObject11 = this.s;
          localObject11 = ((b.a.a.a.a.h)localObject11).c();
          if (localObject11 != null)
          {
            localObject11 = this.s;
            localObject11 = ((b.a.a.a.a.h)localObject11).c();
            boolean bool6 = ((b.a.a.a.a.c)localObject11).c();
            if (bool6)
            {
              localObject11 = this.a;
              localObject12 = "Resetting proxy auth state";
              ((b.a.a.a.h.b)localObject11).a(localObject12);
              localObject11 = this.s;
              ((b.a.a.a.a.h)localObject11).a();
            }
          }
        }
        localObject11 = this.r;
        localObject11 = ((b.a.a.a.a.h)localObject11).b();
        localObject12 = b.a.a.a.a.b.b;
        int i5 = ((b.a.a.a.a.b)localObject11).compareTo((Enum)localObject12);
        if (i5 <= 0) {
          continue;
        }
        localObject11 = this.r;
        localObject11 = ((b.a.a.a.a.h)localObject11).c();
        if (localObject11 == null) {
          continue;
        }
        localObject11 = this.r;
        localObject11 = ((b.a.a.a.a.h)localObject11).c();
        boolean bool7 = ((b.a.a.a.a.c)localObject11).c();
        if (!bool7) {
          continue;
        }
        localObject11 = this.a;
        localObject12 = "Resetting target auth state";
        ((b.a.a.a.h.b)localObject11).a(localObject12);
        localObject11 = this.r;
        ((b.a.a.a.a.h)localObject11).a();
        continue;
      }
      catch (b.a.a.a.m localm)
      {
        boolean bool1;
        b();
        throw localm;
        localObject2 = localm.b();
        localObject1 = new b/a/a/a/e/a;
        localObject9 = this.q;
        ((b.a.a.a.e.a)localObject1).<init>((b.a.a.a.k)localObject2, (b.a.a.a.e.o)localObject9, bool1);
        localm.a((b.a.a.a.k)localObject1);
        continue;
      }
      catch (IOException localIOException)
      {
        b();
        throw localIOException;
      }
      catch (RuntimeException localRuntimeException)
      {
        b();
        throw localRuntimeException;
      }
      label1647:
      Object localObject7 = localObject2;
    }
  }
  
  protected void a()
  {
    try
    {
      b.a.a.a.e.o localo = this.q;
      localo.b_();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        b.a.a.a.h.b localb = this.a;
        String str = "IOException releasing connection";
        localb.a(str, localIOException);
      }
    }
    this.q = null;
  }
  
  protected void a(b.a.a.a.e.b.b paramb, b.a.a.a.n.e parame)
  {
    Object localObject1 = new b/a/a/a/e/b/a;
    ((b.a.a.a.e.b.a)localObject1).<init>();
    Object localObject2 = this.q.h();
    int i1 = ((b.a.a.a.e.b.c)localObject1).a(paramb, (b.a.a.a.e.b.e)localObject2);
    Object localObject3;
    switch (i1)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unknown step indicator " + i1 + " from RouteDirector.";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
    case 2: 
      localObject2 = this.q;
      localObject3 = this.p;
      ((b.a.a.a.e.o)localObject2).a(paramb, parame, (b.a.a.a.l.e)localObject3);
    case 0: 
    case 3: 
    case 4: 
    case 5: 
      while (i1 <= 0)
      {
        return;
        boolean bool1 = b(paramb, parame);
        this.a.a("Tunnel to target created.");
        localObject3 = this.q;
        Object localObject4 = this.p;
        ((b.a.a.a.e.o)localObject3).a(bool1, (b.a.a.a.l.e)localObject4);
        continue;
        int i2 = ((b.a.a.a.e.b.b)localObject2).c() + -1;
        boolean bool2 = a(paramb, i2, parame);
        this.a.a("Tunnel to proxy created.");
        localObject4 = this.q;
        localObject2 = paramb.a(i2);
        b.a.a.a.l.e locale = this.p;
        ((b.a.a.a.e.o)localObject4).a((b.a.a.a.n)localObject2, bool2, locale);
        continue;
        localObject2 = this.q;
        localObject3 = this.p;
        ((b.a.a.a.e.o)localObject2).a(parame, (b.a.a.a.l.e)localObject3);
      }
    }
    localObject1 = new b/a/a/a/m;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localObject2 = "Unable to establish route: planned = " + paramb + "; current = " + localObject2;
    ((b.a.a.a.m)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  /* Error */
  protected void a(w paramw, b.a.a.a.e.b.b paramb)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 506	b/a/a/a/i/b/w:getURI	()Ljava/net/URI;
    //   4: astore_3
    //   5: aload_2
    //   6: invokevirtual 376	b/a/a/a/e/b/b:d	()Lb/a/a/a/n;
    //   9: astore 4
    //   11: aload 4
    //   13: ifnull +57 -> 70
    //   16: aload_2
    //   17: invokevirtual 282	b/a/a/a/e/b/b:e	()Z
    //   20: istore 5
    //   22: iload 5
    //   24: ifne +46 -> 70
    //   27: aload_3
    //   28: invokevirtual 574	java/net/URI:isAbsolute	()Z
    //   31: istore 5
    //   33: iload 5
    //   35: ifne +27 -> 62
    //   38: aload_2
    //   39: invokevirtual 312	b/a/a/a/e/b/b:a	()Lb/a/a/a/n;
    //   42: astore 4
    //   44: iconst_1
    //   45: istore 6
    //   47: aload_3
    //   48: aload 4
    //   50: iload 6
    //   52: invokestatic 696	b/a/a/a/b/f/d:a	(Ljava/net/URI;Lb/a/a/a/n;Z)Ljava/net/URI;
    //   55: astore_3
    //   56: aload_1
    //   57: aload_3
    //   58: invokevirtual 699	b/a/a/a/i/b/w:a	(Ljava/net/URI;)V
    //   61: return
    //   62: aload_3
    //   63: invokestatic 702	b/a/a/a/b/f/d:a	(Ljava/net/URI;)Ljava/net/URI;
    //   66: astore_3
    //   67: goto -11 -> 56
    //   70: aload_3
    //   71: invokevirtual 574	java/net/URI:isAbsolute	()Z
    //   74: istore 5
    //   76: iload 5
    //   78: ifeq +23 -> 101
    //   81: iconst_0
    //   82: istore 5
    //   84: aconst_null
    //   85: astore 4
    //   87: iconst_1
    //   88: istore 6
    //   90: aload_3
    //   91: aconst_null
    //   92: iload 6
    //   94: invokestatic 696	b/a/a/a/b/f/d:a	(Ljava/net/URI;Lb/a/a/a/n;Z)Ljava/net/URI;
    //   97: astore_3
    //   98: goto -42 -> 56
    //   101: aload_3
    //   102: invokestatic 702	b/a/a/a/b/f/d:a	(Ljava/net/URI;)Ljava/net/URI;
    //   105: astore_3
    //   106: goto -50 -> 56
    //   109: astore_3
    //   110: new 423	b/a/a/a/ab
    //   113: astore 4
    //   115: new 217	java/lang/StringBuilder
    //   118: astore 7
    //   120: aload 7
    //   122: invokespecial 218	java/lang/StringBuilder:<init>	()V
    //   125: aload 7
    //   127: ldc_w 704
    //   130: invokevirtual 224	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: astore 7
    //   135: aload_1
    //   136: invokevirtual 708	b/a/a/a/i/b/w:getRequestLine	()Lb/a/a/a/ae;
    //   139: invokeinterface 711 1 0
    //   144: astore 8
    //   146: aload 7
    //   148: aload 8
    //   150: invokevirtual 224	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: invokevirtual 249	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: astore 7
    //   158: aload 4
    //   160: aload 7
    //   162: aload_3
    //   163: invokespecial 712	b/a/a/a/ab:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   166: aload 4
    //   168: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	p
    //   0	169	1	paramw	w
    //   0	169	2	paramb	b.a.a.a.e.b.b
    //   4	102	3	localURI	URI
    //   109	54	3	localURISyntaxException	java.net.URISyntaxException
    //   9	158	4	localObject1	Object
    //   20	63	5	bool1	boolean
    //   45	48	6	bool2	boolean
    //   118	43	7	localObject2	Object
    //   144	5	8	str	String
    // Exception table:
    //   from	to	target	type
    //   0	4	109	java/net/URISyntaxException
    //   5	9	109	java/net/URISyntaxException
    //   16	20	109	java/net/URISyntaxException
    //   27	31	109	java/net/URISyntaxException
    //   38	42	109	java/net/URISyntaxException
    //   50	55	109	java/net/URISyntaxException
    //   57	61	109	java/net/URISyntaxException
    //   62	66	109	java/net/URISyntaxException
    //   70	74	109	java/net/URISyntaxException
    //   92	97	109	java/net/URISyntaxException
    //   101	105	109	java/net/URISyntaxException
  }
  
  protected boolean a(b.a.a.a.e.b.b paramb, int paramInt, b.a.a.a.n.e parame)
  {
    b.a.a.a.m localm = new b/a/a/a/m;
    localm.<init>("Proxy chains are not supported.");
    throw localm;
  }
  
  protected b.a.a.a.e.b.b b(b.a.a.a.n paramn, b.a.a.a.q paramq, b.a.a.a.n.e parame)
  {
    b.a.a.a.e.b.d locald = this.c;
    if (paramn != null) {}
    for (;;)
    {
      return locald.a(paramn, paramq, parame);
      Object localObject = paramq.getParams();
      String str = "http.default-host";
      localObject = (b.a.a.a.n)((b.a.a.a.l.e)localObject).a(str);
      paramn = (b.a.a.a.n)localObject;
    }
  }
  
  protected boolean b(b.a.a.a.e.b.b paramb, b.a.a.a.n.e parame)
  {
    Object localObject1 = paramb.d();
    b.a.a.a.n localn = paramb.a();
    Object localObject3;
    Object localObject4;
    for (;;)
    {
      localObject2 = this.q;
      boolean bool1 = ((b.a.a.a.e.o)localObject2).c();
      if (!bool1)
      {
        localObject2 = this.q;
        localObject3 = this.p;
        ((b.a.a.a.e.o)localObject2).a(paramb, parame, (b.a.a.a.l.e)localObject3);
      }
      localObject2 = c(paramb, parame);
      localObject3 = this.p;
      ((b.a.a.a.q)localObject2).setParams((b.a.a.a.l.e)localObject3);
      parame.a("http.target_host", localn);
      parame.a("http.route", paramb);
      parame.a("http.proxy_host", localObject1);
      localObject4 = this.q;
      parame.a("http.connection", localObject4);
      parame.a("http.request", localObject2);
      localObject3 = this.f;
      localObject4 = this.g;
      ((b.a.a.a.n.h)localObject3).a((b.a.a.a.q)localObject2, (b.a.a.a.n.g)localObject4, parame);
      localObject3 = this.f;
      localObject4 = this.q;
      localObject3 = ((b.a.a.a.n.h)localObject3).a((b.a.a.a.q)localObject2, (b.a.a.a.i)localObject4, parame);
      localObject2 = this.p;
      ((b.a.a.a.s)localObject3).setParams((b.a.a.a.l.e)localObject2);
      localObject2 = this.f;
      localObject4 = this.g;
      ((b.a.a.a.n.h)localObject2).a((b.a.a.a.s)localObject3, (b.a.a.a.n.g)localObject4, parame);
      localObject2 = ((b.a.a.a.s)localObject3).a();
      int i1 = ((af)localObject2).b();
      int i3 = 200;
      if (i1 < i3)
      {
        localObject2 = new b/a/a/a/m;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Unexpected response to CONNECT request: ");
        localObject3 = ((b.a.a.a.s)localObject3).a();
        localObject1 = localObject3;
        ((b.a.a.a.m)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      localObject2 = this.p;
      boolean bool2 = b.a.a.a.b.d.b.b((b.a.a.a.l.e)localObject2);
      if (bool2)
      {
        localObject2 = this.t;
        localObject4 = this.n;
        b.a.a.a.a.h localh = this.s;
        bool2 = ((s)localObject2).a((b.a.a.a.n)localObject1, (b.a.a.a.s)localObject3, (b.a.a.a.b.c)localObject4, localh, parame);
        if (!bool2) {
          break;
        }
        localObject2 = this.t;
        localObject4 = this.n;
        localh = this.s;
        bool2 = ((s)localObject2).c((b.a.a.a.n)localObject1, (b.a.a.a.s)localObject3, (b.a.a.a.b.c)localObject4, localh, parame);
        if (!bool2) {
          break;
        }
        localObject2 = this.d;
        bool2 = ((b.a.a.a.b)localObject2).a((b.a.a.a.s)localObject3, parame);
        if (bool2)
        {
          localObject2 = this.a;
          localObject4 = "Connection kept alive";
          ((b.a.a.a.h.b)localObject2).a(localObject4);
          localObject2 = ((b.a.a.a.s)localObject3).b();
          b.a.a.a.o.f.a((b.a.a.a.k)localObject2);
        }
        else
        {
          localObject2 = this.q;
          ((b.a.a.a.e.o)localObject2).close();
        }
      }
    }
    Object localObject2 = ((b.a.a.a.s)localObject3).a();
    int i2 = ((af)localObject2).b();
    int i4 = 299;
    if (i2 > i4)
    {
      localObject2 = ((b.a.a.a.s)localObject3).b();
      if (localObject2 != null)
      {
        localObject1 = new b/a/a/a/g/c;
        ((b.a.a.a.g.c)localObject1).<init>((b.a.a.a.k)localObject2);
        ((b.a.a.a.s)localObject3).a((b.a.a.a.k)localObject1);
      }
      this.q.close();
      localObject2 = new b/a/a/a/i/b/z;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("CONNECT refused by proxy: ");
      localObject4 = ((b.a.a.a.s)localObject3).a();
      localObject1 = localObject4;
      ((z)localObject2).<init>((String)localObject1, (b.a.a.a.s)localObject3);
      throw ((Throwable)localObject2);
    }
    this.q.i();
    return false;
  }
  
  protected b.a.a.a.q c(b.a.a.a.e.b.b paramb, b.a.a.a.n.e parame)
  {
    Object localObject1 = paramb.a();
    Object localObject2 = ((b.a.a.a.n)localObject1).a();
    int i1 = ((b.a.a.a.n)localObject1).b();
    if (i1 < 0)
    {
      localObject3 = this.b.a();
      localObject1 = ((b.a.a.a.n)localObject1).c();
      localObject3 = ((b.a.a.a.e.c.i)localObject3).a((String)localObject1);
      i1 = ((b.a.a.a.e.c.e)localObject3).a();
    }
    localObject1 = new java/lang/StringBuilder;
    int i2 = ((String)localObject2).length() + 6;
    ((StringBuilder)localObject1).<init>(i2);
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(':');
    Object localObject3 = Integer.toString(i1);
    ((StringBuilder)localObject1).append((String)localObject3);
    localObject3 = ((StringBuilder)localObject1).toString();
    localObject1 = b.a.a.a.l.f.b(this.p);
    localObject2 = new b/a/a/a/k/g;
    ((b.a.a.a.k.g)localObject2).<init>("CONNECT", (String)localObject3, (ac)localObject1);
    return (b.a.a.a.q)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */