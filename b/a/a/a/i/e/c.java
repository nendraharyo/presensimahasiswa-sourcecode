package b.a.a.a.i.e;

import b.a.a.a.aa;
import b.a.a.a.ab;
import b.a.a.a.e;
import b.a.a.a.f;
import b.a.a.a.g.d;
import b.a.a.a.o.a;
import b.a.a.a.p;

public class c
  implements d
{
  public static final c a;
  private final int b;
  
  static
  {
    c localc = new b/a/a/a/i/e/c;
    localc.<init>();
    a = localc;
  }
  
  public c()
  {
    this(-1);
  }
  
  public c(int paramInt)
  {
    this.b = paramInt;
  }
  
  public long a(p paramp)
  {
    long l1 = -1;
    a.a(paramp, "HTTP message");
    Object localObject1 = paramp.getFirstHeader("Transfer-Encoding");
    Object localObject2;
    if (localObject1 != null) {
      for (;;)
      {
        int i;
        boolean bool2;
        try
        {
          localObject2 = ((e)localObject1).e();
          i = localObject2.length;
          String str1 = "identity";
          localObject1 = ((e)localObject1).d();
          bool2 = str1.equalsIgnoreCase((String)localObject1);
          if (bool2) {
            return l1;
          }
        }
        catch (aa localaa)
        {
          ab localab = new b/a/a/a/ab;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject1 = "Invalid Transfer-Encoding header value: " + localObject1;
          localab.<init>((String)localObject1, localaa);
          throw localab;
        }
        if (i > 0)
        {
          localObject1 = "chunked";
          i += -1;
          localObject2 = localObject2[i].a();
          bool2 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
          if (bool2) {
            l1 = -2;
          }
        }
      }
    }
    localObject1 = paramp.getFirstHeader("Content-Length");
    int j;
    label198:
    String str2;
    if (localObject1 != null)
    {
      localObject1 = "Content-Length";
      localObject2 = paramp.getHeaders((String)localObject1);
      j = localObject2.length + -1;
      if (j < 0) {
        break label271;
      }
      str2 = localObject2[j];
    }
    for (;;)
    {
      try
      {
        str2 = str2.d();
        l2 = Long.parseLong(str2);
        long l3 = 0L;
        boolean bool1 = l2 < l3;
        if (bool1) {
          break;
        }
        l1 = l2;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        j += -1;
      }
      break label198;
      int k = this.b;
      l1 = k;
      break;
      label271:
      long l2 = l1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\e\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */