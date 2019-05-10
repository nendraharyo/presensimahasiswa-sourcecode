package b.a.a.a.i.c.a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

class d$1
  implements e
{
  d$1(d paramd, i parami, b.a.a.a.e.b.b paramb, Object paramObject) {}
  
  public b a(long paramLong, TimeUnit paramTimeUnit)
  {
    d locald = this.d;
    b.a.a.a.e.b.b localb = this.b;
    Object localObject = this.c;
    i locali = this.a;
    return locald.a(localb, localObject, paramLong, paramTimeUnit, locali);
  }
  
  public void a()
  {
    Object localObject1 = d.a(this.d);
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.a;
      ((i)localObject1).a();
      return;
    }
    finally
    {
      d.a(this.d).unlock();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\a\d$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */