package b.a.a.a.e.b;

import b.a.a.a.n;
import java.net.InetAddress;

public class a
  implements c
{
  protected int a(e parame)
  {
    int i = 1;
    int j = parame.c();
    if (j > i) {
      i = 2;
    }
    return i;
  }
  
  public int a(e parame1, e parame2)
  {
    int i = 1;
    String str = "Planned route";
    b.a.a.a.o.a.a(parame1, str);
    int j;
    if (parame2 != null)
    {
      j = parame2.c();
      if (j >= i) {}
    }
    else
    {
      j = a(parame1);
    }
    for (;;)
    {
      return j;
      j = parame1.c();
      if (j > i) {
        j = c(parame1, parame2);
      } else {
        j = b(parame1, parame2);
      }
    }
  }
  
  protected int b(e parame1, e parame2)
  {
    int i = -1;
    int j = parame2.c();
    int k = 1;
    if (j > k) {}
    for (;;)
    {
      return i;
      Object localObject1 = parame1.a();
      Object localObject2 = parame2.a();
      boolean bool1 = ((n)localObject1).equals(localObject2);
      if (bool1)
      {
        bool1 = parame1.g();
        boolean bool2 = parame2.g();
        if (bool1 == bool2)
        {
          localObject1 = parame1.b();
          if (localObject1 != null)
          {
            localObject1 = parame1.b();
            localObject2 = parame2.b();
            bool1 = ((InetAddress)localObject1).equals(localObject2);
            if (!bool1) {}
          }
          else
          {
            i = 0;
          }
        }
      }
    }
  }
  
  protected int c(e parame1, e parame2)
  {
    int i = -1;
    int j = parame2.c();
    int n = 1;
    if (j <= n) {}
    for (;;)
    {
      return i;
      n localn1 = parame1.a();
      n localn2 = parame2.a();
      int k = localn1.equals(localn2);
      if (k != 0)
      {
        n = parame1.c();
        int i1 = parame2.c();
        if (n >= i1)
        {
          k = 0;
          localn1 = null;
          for (;;)
          {
            int i2 = i1 + -1;
            if (k >= i2) {
              break label137;
            }
            n localn3 = parame1.a(k);
            n localn4 = parame2.a(k);
            boolean bool3 = localn3.equals(localn4);
            if (!bool3) {
              break;
            }
            int m;
            k += 1;
          }
          label137:
          if (n > i1)
          {
            i = 4;
          }
          else
          {
            boolean bool1 = parame2.e();
            if (bool1)
            {
              bool1 = parame1.e();
              if (!bool1) {}
            }
            else
            {
              bool1 = parame2.f();
              if (bool1)
              {
                bool1 = parame1.f();
                if (!bool1) {}
              }
              else
              {
                bool1 = parame1.e();
                if (bool1)
                {
                  bool1 = parame2.e();
                  if (!bool1)
                  {
                    i = 3;
                    continue;
                  }
                }
                bool1 = parame1.f();
                if (bool1)
                {
                  bool1 = parame2.f();
                  if (!bool1)
                  {
                    i = 5;
                    continue;
                  }
                }
                bool1 = parame1.g();
                boolean bool2 = parame2.g();
                if (bool1 == bool2) {
                  i = 0;
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\b\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */