package b.a.a.a.a;

import b.a.a.a.o.g;
import java.io.Serializable;
import java.security.Principal;

public class q
  implements Serializable, Principal
{
  private final String a;
  private final String b;
  private final String c;
  
  public String a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof q;
      if (bool2)
      {
        paramObject = (q)paramObject;
        String str1 = this.a;
        String str2 = ((q)paramObject).a;
        bool2 = g.a(str1, str2);
        if (bool2)
        {
          str1 = this.b;
          str2 = ((q)paramObject).b;
          bool2 = g.a(str1, str2);
          if (bool2) {
            continue;
          }
        }
      }
      bool1 = false;
    }
  }
  
  public String getName()
  {
    return this.c;
  }
  
  public int hashCode()
  {
    String str = this.a;
    int i = g.a(17, str);
    str = this.b;
    return g.a(i, str);
  }
  
  public String toString()
  {
    return this.c;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\a\q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */