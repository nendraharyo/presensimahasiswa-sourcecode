package b.a.a.a.k;

import b.a.a.a.ac;
import b.a.a.a.ae;
import b.a.a.a.o.a;
import b.a.a.a.o.d;
import java.io.Serializable;

public class m
  implements ae, Serializable, Cloneable
{
  private final ac a;
  private final String b;
  private final String c;
  
  public m(String paramString1, String paramString2, ac paramac)
  {
    Object localObject = (String)a.a(paramString1, "Method");
    this.b = ((String)localObject);
    localObject = (String)a.a(paramString2, "URI");
    this.c = ((String)localObject);
    localObject = (ac)a.a(paramac, "Version");
    this.a = ((ac)localObject);
  }
  
  public String a()
  {
    return this.b;
  }
  
  public ac b()
  {
    return this.a;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */