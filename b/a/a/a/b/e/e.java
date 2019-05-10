package b.a.a.a.b.e;

import b.a.a.a.ae;
import b.a.a.a.h.b;
import b.a.a.a.q;
import b.a.a.a.r;

public class e
  implements r
{
  public b a;
  
  public e()
  {
    b localb = new b/a/a/a/h/b;
    Class localClass = getClass();
    localb.<init>(localClass);
    this.a = localb;
  }
  
  public void process(q paramq, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(paramq, "HTTP request");
    Object localObject = paramq.getRequestLine().a();
    String str1 = "CONNECT";
    boolean bool1 = ((String)localObject).equalsIgnoreCase(str1);
    if (bool1)
    {
      localObject = "Proxy-Connection";
      str1 = "Keep-Alive";
      paramq.setHeader((String)localObject, str1);
    }
    for (;;)
    {
      return;
      localObject = a.a(parame).a();
      if (localObject == null)
      {
        localObject = this.a;
        str1 = "Connection route not set in the context";
        ((b)localObject).a(str1);
      }
      else
      {
        int i = ((b.a.a.a.e.b.e)localObject).c();
        int k = 1;
        boolean bool2;
        if (i != k)
        {
          bool2 = ((b.a.a.a.e.b.e)localObject).e();
          if (!bool2) {}
        }
        else
        {
          str1 = "Connection";
          bool2 = paramq.containsHeader(str1);
          if (!bool2)
          {
            str1 = "Connection";
            String str2 = "Keep-Alive";
            paramq.addHeader(str1, str2);
          }
        }
        int j = ((b.a.a.a.e.b.e)localObject).c();
        k = 2;
        if (j == k)
        {
          bool1 = ((b.a.a.a.e.b.e)localObject).e();
          if (!bool1)
          {
            localObject = "Proxy-Connection";
            bool1 = paramq.containsHeader((String)localObject);
            if (!bool1)
            {
              localObject = "Proxy-Connection";
              str1 = "Keep-Alive";
              paramq.addHeader((String)localObject, str1);
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\e\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */