package b.a.a.a.i.c.a;

import b.a.a.a.e.o;
import b.a.a.a.o.a;
import java.util.concurrent.TimeUnit;

class g$1
  implements b.a.a.a.e.e
{
  g$1(g paramg, e parame, b.a.a.a.e.b.b paramb) {}
  
  public o a(long paramLong, TimeUnit paramTimeUnit)
  {
    Object localObject1 = this.b;
    Object localObject2 = "Route";
    a.a(localObject1, (String)localObject2);
    localObject1 = this.c.a;
    boolean bool = ((b.a.a.a.h.b)localObject1).a();
    if (bool)
    {
      localObject1 = this.c.a;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Get connection: ");
      localObject3 = this.b;
      localObject2 = ((StringBuilder)localObject2).append(localObject3);
      localObject3 = ", timeout = ";
      localObject2 = (String)localObject3 + paramLong;
      ((b.a.a.a.h.b)localObject1).a(localObject2);
    }
    localObject1 = this.a.a(paramLong, paramTimeUnit);
    localObject2 = new b/a/a/a/i/c/a/c;
    Object localObject3 = this.c;
    ((c)localObject2).<init>((g)localObject3, (b.a.a.a.i.c.b)localObject1);
    return (o)localObject2;
  }
  
  public void a()
  {
    this.a.a();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\a\g$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */