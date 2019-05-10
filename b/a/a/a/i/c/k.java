package b.a.a.a.i.c;

import b.a.a.a.e.b.f;
import b.a.a.a.e.q;
import b.a.a.a.m.a;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class k
  extends a
{
  public b.a.a.a.h.b a;
  private final f b;
  
  public k(b.a.a.a.h.b paramb, String paramString, b.a.a.a.e.b.b paramb1, q paramq, long paramLong, TimeUnit paramTimeUnit)
  {
    super(paramString, paramb1, paramq, paramLong, paramTimeUnit);
    this.a = paramb;
    localObject = new b/a/a/a/e/b/f;
    ((f)localObject).<init>(paramb1);
    this.b = ((f)localObject);
  }
  
  f a()
  {
    return this.b;
  }
  
  public boolean a(long paramLong)
  {
    boolean bool1 = super.a(paramLong);
    if (bool1)
    {
      b.a.a.a.h.b localb = this.a;
      boolean bool2 = localb.a();
      if (bool2)
      {
        localb = this.a;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("Connection ").append(this).append(" expired @ ");
        Date localDate = new java/util/Date;
        long l = h();
        localDate.<init>(l);
        localObject = localDate;
        localb.a(localObject);
      }
    }
    return bool1;
  }
  
  b.a.a.a.e.b.b b()
  {
    return (b.a.a.a.e.b.b)f();
  }
  
  b.a.a.a.e.b.b c()
  {
    return this.b.j();
  }
  
  public boolean d()
  {
    q localq = (q)g();
    boolean bool = localq.c();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localq = null;
    }
  }
  
  public void e()
  {
    q localq = (q)g();
    try
    {
      localq.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        b.a.a.a.h.b localb = this.a;
        String str = "I/O error closing connection";
        localb.a(str, localIOException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */