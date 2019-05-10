package b.a.a.a.k;

import b.a.a.a.aa;
import b.a.a.a.o.a;
import java.io.Serializable;

public class p
  implements b.a.a.a.d, Serializable, Cloneable
{
  private final String a;
  private final b.a.a.a.o.d b;
  private final int c;
  
  public p(b.a.a.a.o.d paramd)
  {
    Object localObject1 = "Char array buffer";
    a.a(paramd, (String)localObject1);
    int i = paramd.c(58);
    int j = -1;
    String str;
    if (i == j)
    {
      localObject1 = new b/a/a/a/aa;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Invalid header: ");
      str = paramd.toString();
      localObject2 = str;
      ((aa)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    j = 0;
    Object localObject2 = paramd.b(0, i);
    int k = ((String)localObject2).length();
    if (k == 0)
    {
      localObject1 = new b/a/a/a/aa;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Invalid header: ");
      str = paramd.toString();
      localObject2 = str;
      ((aa)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.b = paramd;
    this.a = ((String)localObject2);
    i += 1;
    this.c = i;
  }
  
  public b.a.a.a.o.d a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.a;
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public String d()
  {
    b.a.a.a.o.d locald = this.b;
    int i = this.c;
    int j = this.b.c();
    return locald.b(i, j);
  }
  
  public b.a.a.a.f[] e()
  {
    u localu = new b/a/a/a/k/u;
    int i = this.b.c();
    localu.<init>(0, i);
    int j = this.c;
    localu.a(j);
    f localf = f.b;
    b.a.a.a.o.d locald = this.b;
    return localf.a(locald, localu);
  }
  
  public String toString()
  {
    return this.b.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */