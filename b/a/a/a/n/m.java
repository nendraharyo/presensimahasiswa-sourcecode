package b.a.a.a.n;

import b.a.a.a.o.a;
import b.a.a.a.q;
import b.a.a.a.r;

public class m
  implements r
{
  private final String a;
  
  public m()
  {
    this(null);
  }
  
  public m(String paramString)
  {
    this.a = paramString;
  }
  
  public void process(q paramq, e parame)
  {
    a.a(paramq, "HTTP request");
    String str = "User-Agent";
    boolean bool = paramq.containsHeader(str);
    if (!bool)
    {
      bool = false;
      str = null;
      Object localObject = paramq.getParams();
      if (localObject != null) {
        str = (String)((b.a.a.a.l.e)localObject).a("http.useragent");
      }
      if (str == null) {
        str = this.a;
      }
      if (str != null)
      {
        localObject = "User-Agent";
        paramq.addHeader((String)localObject, str);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */