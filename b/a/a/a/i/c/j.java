package b.a.a.a.i.c;

import b.a.a.a.e.r;
import b.a.a.a.e.s;
import b.a.a.a.n;
import b.a.a.a.o.a;

public class j
  implements r
{
  public static final j a;
  
  static
  {
    j localj = new b/a/a/a/i/c/j;
    localj.<init>();
    a = localj;
  }
  
  public int a(n paramn)
  {
    String str = "HTTP host";
    a.a(paramn, str);
    int i = paramn.b();
    if (i > 0) {}
    for (;;)
    {
      return i;
      str = paramn.c();
      localObject = "http";
      boolean bool = str.equalsIgnoreCase((String)localObject);
      if (bool)
      {
        i = 80;
      }
      else
      {
        localObject = "https";
        bool = str.equalsIgnoreCase((String)localObject);
        if (!bool) {
          break;
        }
        i = 443;
      }
    }
    Object localObject = new b/a/a/a/e/s;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    str = str + " protocol is not supported";
    ((s)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */