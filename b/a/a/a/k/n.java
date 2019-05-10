package b.a.a.a.k;

import b.a.a.a.ac;
import b.a.a.a.af;
import b.a.a.a.o.a;
import b.a.a.a.o.d;
import java.io.Serializable;

public class n
  implements af, Serializable, Cloneable
{
  private final ac a;
  private final int b;
  private final String c;
  
  public n(ac paramac, int paramInt, String paramString)
  {
    ac localac = (ac)a.a(paramac, "Version");
    this.a = localac;
    int i = a.b(paramInt, "Status code");
    this.b = i;
    this.c = paramString;
  }
  
  public ac a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public String toString()
  {
    return i.b.a(null, this).toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */