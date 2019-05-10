package b.a.a.a.i.c;

import b.a.a.a.e.b.f;
import b.a.a.a.e.d;
import b.a.a.a.e.q;
import b.a.a.a.n;
import b.a.a.a.o.a;
import java.io.InterruptedIOException;
import java.net.InetAddress;

public abstract class b
{
  protected final d a;
  protected final q b;
  protected volatile b.a.a.a.e.b.b c;
  protected volatile Object d;
  protected volatile f e;
  
  protected b(d paramd, b.a.a.a.e.b.b paramb)
  {
    a.a(paramd, "Connection operator");
    this.a = paramd;
    q localq = paramd.a();
    this.b = localq;
    this.c = paramb;
    this.e = null;
  }
  
  public Object a()
  {
    return this.d;
  }
  
  public void a(b.a.a.a.e.b.b paramb, b.a.a.a.n.e parame, b.a.a.a.l.e parame1)
  {
    a.a(paramb, "Route");
    a.a(parame1, "HTTP parameters");
    Object localObject1 = this.e;
    boolean bool1;
    Object localObject2;
    n localn1;
    if (localObject1 != null)
    {
      localObject1 = this.e;
      bool1 = ((f)localObject1).i();
      if (!bool1)
      {
        bool1 = true;
        localObject2 = "Connection already open";
        b.a.a.a.o.b.a(bool1, (String)localObject2);
      }
    }
    else
    {
      localObject1 = new b/a/a/a/e/b/f;
      ((f)localObject1).<init>(paramb);
      this.e = ((f)localObject1);
      localn1 = paramb.d();
      localObject1 = this.a;
      localObject2 = this.b;
      if (localn1 == null) {
        break label157;
      }
    }
    label157:
    for (n localn2 = localn1;; localn2 = paramb.a())
    {
      InetAddress localInetAddress = paramb.b();
      ((d)localObject1).a((q)localObject2, localn2, localInetAddress, parame, parame1);
      localObject1 = this.e;
      if (localObject1 != null) {
        break label166;
      }
      localObject1 = new java/io/InterruptedIOException;
      ((InterruptedIOException)localObject1).<init>("Request aborted");
      throw ((Throwable)localObject1);
      bool1 = false;
      localObject1 = null;
      break;
    }
    label166:
    boolean bool2;
    if (localn1 == null)
    {
      localObject2 = this.b;
      bool2 = ((q)localObject2).h();
      ((f)localObject1).a(bool2);
    }
    for (;;)
    {
      return;
      localObject2 = this.b;
      bool2 = ((q)localObject2).h();
      ((f)localObject1).a(localn1, bool2);
    }
  }
  
  public void a(b.a.a.a.n.e parame, b.a.a.a.l.e parame1)
  {
    a.a(parame1, "HTTP parameters");
    b.a.a.a.o.b.a(this.e, "Route tracker");
    b.a.a.a.o.b.a(this.e.i(), "Connection not open");
    boolean bool1 = this.e.e();
    Object localObject1 = "Protocol layering without a tunnel not supported";
    b.a.a.a.o.b.a(bool1, (String)localObject1);
    Object localObject2 = this.e;
    bool1 = ((f)localObject2).f();
    if (!bool1) {
      bool1 = true;
    }
    for (;;)
    {
      b.a.a.a.o.b.a(bool1, "Multiple protocol layering not supported");
      localObject2 = this.e.a();
      localObject1 = this.a;
      q localq = this.b;
      ((d)localObject1).a(localq, (n)localObject2, parame, parame1);
      localObject2 = this.e;
      boolean bool2 = this.b.h();
      ((f)localObject2).c(bool2);
      return;
      bool1 = false;
      localObject2 = null;
    }
  }
  
  public void a(n paramn, boolean paramBoolean, b.a.a.a.l.e parame)
  {
    a.a(paramn, "Next proxy");
    a.a(parame, "Parameters");
    b.a.a.a.o.b.a(this.e, "Route tracker");
    b.a.a.a.o.b.a(this.e.i(), "Connection not open");
    this.b.a(null, paramn, paramBoolean, parame);
    this.e.b(paramn, paramBoolean);
  }
  
  public void a(Object paramObject)
  {
    this.d = paramObject;
  }
  
  public void a(boolean paramBoolean, b.a.a.a.l.e parame)
  {
    a.a(parame, "HTTP parameters");
    b.a.a.a.o.b.a(this.e, "Route tracker");
    boolean bool = this.e.i();
    String str = "Connection not open";
    b.a.a.a.o.b.a(bool, str);
    Object localObject = this.e;
    bool = ((f)localObject).e();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      b.a.a.a.o.b.a(bool, "Connection is already tunnelled");
      localObject = this.b;
      n localn = this.e.a();
      ((q)localObject).a(null, localn, paramBoolean, parame);
      this.e.b(paramBoolean);
      return;
      bool = false;
      localObject = null;
    }
  }
  
  protected void b()
  {
    this.e = null;
    this.d = null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */