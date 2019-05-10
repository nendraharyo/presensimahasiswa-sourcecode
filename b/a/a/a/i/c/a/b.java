package b.a.a.a.i.c.a;

import b.a.a.a.e.d;
import b.a.a.a.e.q;
import b.a.a.a.o.a;
import java.util.concurrent.TimeUnit;

public class b
  extends b.a.a.a.i.c.b
{
  private final long f;
  private long g;
  private final long h;
  private long i;
  
  public b(d paramd, b.a.a.a.e.b.b paramb, long paramLong, TimeUnit paramTimeUnit)
  {
    super(paramd, paramb);
    String str = "HTTP route";
    a.a(paramb, str);
    long l1 = System.currentTimeMillis();
    this.f = l1;
    l1 = 0L;
    boolean bool = paramLong < l1;
    if (bool)
    {
      l1 = this.f;
      long l2 = paramTimeUnit.toMillis(paramLong);
      l1 += l2;
    }
    for (this.h = l1;; this.h = l1)
    {
      l1 = this.h;
      this.i = l1;
      return;
      l1 = Long.MAX_VALUE;
    }
  }
  
  public void a(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = System.currentTimeMillis();
    this.g = l1;
    l1 = 0L;
    boolean bool = paramLong < l1;
    long l2;
    if (bool)
    {
      l1 = this.g;
      l2 = paramTimeUnit.toMillis(paramLong);
    }
    for (l1 += l2;; l1 = Long.MAX_VALUE)
    {
      l1 = Math.min(this.h, l1);
      this.i = l1;
      return;
    }
  }
  
  public boolean a(long paramLong)
  {
    long l = this.i;
    boolean bool = paramLong < l;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected void b()
  {
    super.b();
  }
  
  protected final q c()
  {
    return this.b;
  }
  
  protected final b.a.a.a.e.b.b d()
  {
    return this.c;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\a\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */