package b.a.a.a.k;

import b.a.a.a.o.a;
import b.a.a.a.y;
import java.util.ArrayList;
import java.util.List;

public class f
  implements r
{
  public static final f a;
  public static final f b;
  private static final char[] c;
  
  static
  {
    Object localObject = new b/a/a/a/k/f;
    ((f)localObject).<init>();
    a = (f)localObject;
    localObject = new b/a/a/a/k/f;
    ((f)localObject).<init>();
    b = (f)localObject;
    localObject = new char[2];
    localObject[0] = 59;
    localObject[1] = 44;
    c = (char[])localObject;
  }
  
  private static boolean a(char paramChar, char[] paramArrayOfChar)
  {
    boolean bool = false;
    int i;
    int j;
    if (paramArrayOfChar != null)
    {
      i = paramArrayOfChar.length;
      j = 0;
    }
    for (;;)
    {
      if (j < i)
      {
        char c1 = paramArrayOfChar[j];
        if (paramChar == c1) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      j += 1;
    }
  }
  
  public static b.a.a.a.f[] a(String paramString, r paramr)
  {
    a.a(paramString, "Value");
    b.a.a.a.o.d locald = new b/a/a/a/o/d;
    int i = paramString.length();
    locald.<init>(i);
    locald.a(paramString);
    u localu = new b/a/a/a/k/u;
    int j = paramString.length();
    localu.<init>(0, j);
    if (paramr != null) {}
    for (;;)
    {
      return paramr.a(locald, localu);
      paramr = b;
    }
  }
  
  protected b.a.a.a.f a(String paramString1, String paramString2, y[] paramArrayOfy)
  {
    c localc = new b/a/a/a/k/c;
    localc.<init>(paramString1, paramString2, paramArrayOfy);
    return localc;
  }
  
  public y a(b.a.a.a.o.d paramd, u paramu, char[] paramArrayOfChar)
  {
    int i = 34;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = 0;
    String str = null;
    a.a(paramd, "Char array buffer");
    Object localObject1 = "Parser cursor";
    a.a(paramu, (String)localObject1);
    int m = paramu.b();
    int n = paramu.b();
    int i2 = paramu.a();
    char c1;
    int i5;
    float f2;
    if (m < i2)
    {
      c1 = paramd.a(m);
      i5 = 61;
      if (c1 == i5)
      {
        c1 = '\000';
        f2 = 0.0F;
      }
    }
    for (;;)
    {
      label85:
      Object localObject2;
      if (m == i2)
      {
        localObject1 = paramd.b(n, i2);
        localObject2 = localObject1;
        c1 = j;
        f2 = f1;
      }
      for (;;)
      {
        if (c1 == 0) {
          break label199;
        }
        paramu.a(m);
        n = 0;
        f3 = 0.0F;
        localObject1 = a((String)localObject2, null);
        return (y)localObject1;
        boolean bool2 = a(c1, paramArrayOfChar);
        if (bool2)
        {
          bool2 = j;
          f2 = f1;
          break label85;
        }
        m += 1;
        break;
        localObject1 = paramd.b(n, m);
        m += 1;
        localObject2 = localObject1;
      }
      label199:
      int i7 = 0;
      n = 0;
      localObject1 = null;
      float f3 = 0.0F;
      i5 = m;
      int i8;
      int i9;
      float f4;
      label263:
      boolean bool1;
      if (i5 < i2)
      {
        i8 = paramd.a(i5);
        if ((i8 == i) && (i7 == 0)) {
          if (n == 0)
          {
            n = j;
            f3 = f1;
            i9 = n;
            f4 = f3;
            if ((i9 != 0) || (i7 != 0)) {
              break label334;
            }
            bool1 = a(i8, paramArrayOfChar);
            if (!bool1) {
              break label334;
            }
          }
        }
      }
      for (;;)
      {
        k = m;
        label334:
        int i6;
        int i1;
        for (;;)
        {
          if (k < i5)
          {
            bool1 = b.a.a.a.n.d.a(paramd.a(k));
            if (bool1)
            {
              k += 1;
              continue;
              bool1 = false;
              localObject1 = null;
              f3 = 0.0F;
              break;
              if (i7 != 0)
              {
                bool1 = false;
                localObject1 = null;
                f3 = 0.0F;
              }
              for (;;)
              {
                i5 += 1;
                i7 = bool1;
                bool1 = i9;
                f3 = f4;
                break;
                if (i9 != 0)
                {
                  i1 = 92;
                  f3 = 1.29E-43F;
                  if (i8 == i1)
                  {
                    i1 = j;
                    f3 = f1;
                    continue;
                  }
                }
                i1 = 0;
                localObject1 = null;
                f3 = 0.0F;
              }
            }
          }
        }
        for (;;)
        {
          if (i1 > k)
          {
            int i3 = i1 + -1;
            boolean bool3 = b.a.a.a.n.d.a(paramd.a(i3));
            if (bool3)
            {
              i1 += -1;
              continue;
            }
          }
          i4 = i1 - k;
          m = 2;
          if (i4 >= m)
          {
            i4 = paramd.a(k);
            if (i4 == i)
            {
              i4 = i1 + -1;
              i4 = paramd.a(i4);
              if (i4 == i)
              {
                k += 1;
                i1 += -1;
              }
            }
          }
          str = paramd.a(k, i1);
          if (j != 0) {}
          for (i1 = i6 + 1;; i1 = i6)
          {
            paramu.a(i1);
            localObject1 = a((String)localObject2, str);
            break;
          }
          i1 = i6;
        }
        i9 = i1;
        f4 = f3;
        break label263;
        j = i4;
        f1 = f2;
      }
      int i4 = 0;
      f2 = 0.0F;
    }
  }
  
  protected y a(String paramString1, String paramString2)
  {
    l locall = new b/a/a/a/k/l;
    locall.<init>(paramString1, paramString2);
    return locall;
  }
  
  public b.a.a.a.f[] a(b.a.a.a.o.d paramd, u paramu)
  {
    a.a(paramd, "Char array buffer");
    a.a(paramu, "Parser cursor");
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      boolean bool = paramu.c();
      if (bool) {
        break;
      }
      localObject = b(paramd, paramu);
      String str = ((b.a.a.a.f)localObject).a();
      int i = str.length();
      if (i == 0)
      {
        str = ((b.a.a.a.f)localObject).b();
        if (str == null) {}
      }
      else
      {
        localArrayList.add(localObject);
      }
    }
    Object localObject = new b.a.a.a.f[localArrayList.size()];
    return (b.a.a.a.f[])localArrayList.toArray((Object[])localObject);
  }
  
  public b.a.a.a.f b(b.a.a.a.o.d paramd, u paramu)
  {
    a.a(paramd, "Char array buffer");
    a.a(paramu, "Parser cursor");
    Object localObject = d(paramd, paramu);
    y[] arrayOfy = null;
    boolean bool = paramu.c();
    if (!bool)
    {
      int i = paramu.b() + -1;
      i = paramd.a(i);
      int j = 44;
      if (i != j) {
        arrayOfy = c(paramd, paramu);
      }
    }
    String str = ((y)localObject).a();
    localObject = ((y)localObject).b();
    return a(str, (String)localObject, arrayOfy);
  }
  
  public y[] c(b.a.a.a.o.d paramd, u paramu)
  {
    a.a(paramd, "Char array buffer");
    Object localObject1 = "Parser cursor";
    a.a(paramu, (String)localObject1);
    int i = paramu.b();
    int j = paramu.a();
    while (i < j)
    {
      boolean bool3 = b.a.a.a.n.d.a(paramd.a(i));
      if (!bool3) {
        break;
      }
      i += 1;
    }
    paramu.a(i);
    boolean bool1 = paramu.c();
    if (bool1) {
      bool1 = false;
    }
    Object localObject2;
    for (localObject1 = new y[0];; localObject1 = (y[])((List)localObject1).toArray((Object[])localObject2))
    {
      return (y[])localObject1;
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      int m;
      do
      {
        boolean bool2 = paramu.c();
        if (bool2) {
          break;
        }
        localObject2 = d(paramd, paramu);
        ((List)localObject1).add(localObject2);
        k = paramu.b() + -1;
        k = paramd.a(k);
        m = 44;
      } while (k != m);
      int k = ((List)localObject1).size();
      localObject2 = new y[k];
    }
  }
  
  public y d(b.a.a.a.o.d paramd, u paramu)
  {
    char[] arrayOfChar = c;
    return a(paramd, paramu, arrayOfChar);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */