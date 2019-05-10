package b.a.a.a.i.b;

import b.a.a.a.f;
import b.a.a.a.h;
import b.a.a.a.k.d;
import b.a.a.a.n.e;
import b.a.a.a.o.a;
import b.a.a.a.s;

public class j
  implements b.a.a.a.e.g
{
  public static final j a;
  
  static
  {
    j localj = new b/a/a/a/i/b/j;
    localj.<init>();
    a = localj;
  }
  
  public long a(s params, e parame)
  {
    a.a(params, "HTTP response");
    d locald = new b/a/a/a/k/d;
    Object localObject = params.headerIterator("Keep-Alive");
    locald.<init>((h)localObject);
    for (;;)
    {
      boolean bool1 = locald.hasNext();
      if (bool1)
      {
        localObject = locald.a();
        String str1 = ((f)localObject).a();
        localObject = ((f)localObject).b();
        if (localObject != null)
        {
          String str2 = "timeout";
          boolean bool2 = str1.equalsIgnoreCase(str2);
          if (!bool2) {}
        }
      }
      else
      {
        for (;;)
        {
          try
          {
            l1 = Long.parseLong((String)localObject);
            long l2 = 1000L;
            l1 *= l2;
            return l1;
          }
          catch (NumberFormatException localNumberFormatException) {}
          long l1 = -1;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */