package b.a.a.a.i;

import b.a.a.a.aa;
import b.a.a.a.ac;
import b.a.a.a.af;
import b.a.a.a.ag;
import b.a.a.a.h;
import b.a.a.a.k.o;
import b.a.a.a.o.a;
import b.a.a.a.s;
import b.a.a.a.v;

public class b
  implements b.a.a.a.b
{
  public static final b a;
  
  static
  {
    b localb = new b/a/a/a/i/b;
    localb.<init>();
    a = localb;
  }
  
  private boolean a(s params)
  {
    af localaf = params.a();
    int i = localaf.b();
    int k = 200;
    if (i >= k)
    {
      int m = 204;
      if (i != m)
      {
        int n = 304;
        if (i != n)
        {
          int i1 = 205;
          if (i != i1) {
            i = 1;
          }
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localaf = null;
    }
  }
  
  protected ag a(h paramh)
  {
    o localo = new b/a/a/a/k/o;
    localo.<init>(paramh);
    return localo;
  }
  
  public boolean a(s params, b.a.a.a.n.e parame)
  {
    int i = 1;
    boolean bool1 = false;
    a.a(params, "HTTP response");
    a.a(parame, "HTTP context");
    ac localac = params.a().a();
    Object localObject1 = params.getFirstHeader("Transfer-Encoding");
    Object localObject2;
    boolean bool2;
    if (localObject1 != null)
    {
      localObject2 = "chunked";
      localObject1 = ((b.a.a.a.e)localObject1).d();
      bool2 = ((String)localObject2).equalsIgnoreCase((String)localObject1);
      if (bool2) {
        break label137;
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = a(params);
      if (bool2)
      {
        localObject1 = params.getHeaders("Content-Length");
        int k = localObject1.length;
        if (k != i) {
          continue;
        }
        localObject1 = localObject1[0];
      }
      try
      {
        localObject1 = ((b.a.a.a.e)localObject1).d();
        int j = Integer.parseInt((String)localObject1);
        if (j < 0) {
          continue;
        }
        label137:
        localObject1 = params.headerIterator("Connection");
        boolean bool4 = ((h)localObject1).hasNext();
        if (!bool4) {
          localObject1 = params.headerIterator("Proxy-Connection");
        }
        bool4 = ((h)localObject1).hasNext();
        if (bool4) {}
        try
        {
          localObject2 = a((h)localObject1);
          j = 0;
          localObject1 = null;
          for (;;)
          {
            boolean bool5 = ((ag)localObject2).hasNext();
            if (!bool5) {
              break label264;
            }
            String str1 = ((ag)localObject2).a();
            String str2 = "Close";
            boolean bool6 = str2.equalsIgnoreCase(str1);
            if (bool6) {
              break;
            }
            str2 = "Keep-Alive";
            bool5 = str2.equalsIgnoreCase(str1);
            if (bool5) {
              j = i;
            }
          }
          label264:
          if (j != 0)
          {
            bool1 = i;
            continue;
          }
          localObject1 = v.b;
          boolean bool3 = localac.c((ac)localObject1);
          if (!bool3) {}
          for (;;)
          {
            bool1 = i;
            break;
            i = 0;
          }
        }
        catch (aa localaa) {}
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */