package b.a.a.a.i.d;

import b.a.a.a.f;
import b.a.a.a.k.c;
import b.a.a.a.k.l;
import b.a.a.a.k.u;
import b.a.a.a.o.a;
import b.a.a.a.y;
import java.util.ArrayList;
import java.util.List;

public class t
{
  public static final t a;
  
  static
  {
    t localt = new b/a/a/a/i/d/t;
    localt.<init>();
    a = localt;
  }
  
  private y b(b.a.a.a.o.d paramd, u paramu)
  {
    int i = 59;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = 0;
    float f2 = 0.0F;
    int m = paramu.b();
    int n = paramu.b();
    int i2 = paramu.a();
    int i3;
    int i4;
    label60:
    String str1;
    String str2;
    if (m < i2)
    {
      i3 = paramd.a(m);
      i4 = 61;
      if (i3 != i4) {}
    }
    else
    {
      if (m != i2) {
        break label151;
      }
      str1 = paramd.b(n, i2);
      str2 = str1;
      n = j;
    }
    l locall;
    for (float f3 = f1;; f3 = f2)
    {
      if (n == 0) {
        break label182;
      }
      paramu.a(m);
      locall = new b/a/a/a/k/l;
      n = 0;
      f3 = 0.0F;
      str1 = null;
      locall.<init>(str2, null);
      return locall;
      if (i3 == i)
      {
        k = j;
        f2 = f1;
        break label60;
      }
      m += 1;
      break;
      label151:
      str1 = paramd.b(n, m);
      m += 1;
      str2 = str1;
      n = k;
    }
    label182:
    k = m;
    label186:
    if (k < i2)
    {
      i4 = paramd.a(k);
      if (i4 != i) {}
    }
    for (;;)
    {
      int i1;
      if (m < k)
      {
        boolean bool1 = b.a.a.a.n.d.a(paramd.a(m));
        if (bool1)
        {
          i1 = m + 1;
          m = i1;
          continue;
          k += 1;
          break label186;
        }
      }
      for (;;)
      {
        if (i1 > m)
        {
          i2 = i1 + -1;
          boolean bool2 = b.a.a.a.n.d.a(paramd.a(i2));
          if (bool2)
          {
            i1 += -1;
            continue;
          }
        }
        str1 = paramd.a(m, i1);
        if (j != 0) {}
        for (j = k + 1;; j = k)
        {
          paramu.a(j);
          locall = new b/a/a/a/k/l;
          locall.<init>(str2, str1);
          break;
        }
        i1 = k;
      }
      j = i1;
      f1 = f3;
    }
  }
  
  public f a(b.a.a.a.o.d paramd, u paramu)
  {
    a.a(paramd, "Char array buffer");
    a.a(paramu, "Parser cursor");
    Object localObject1 = b(paramd, paramu);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      boolean bool = paramu.c();
      if (bool) {
        break;
      }
      localObject2 = b(paramd, paramu);
      localArrayList.add(localObject2);
    }
    Object localObject2 = new b/a/a/a/k/c;
    String str1 = ((y)localObject1).a();
    String str2 = ((y)localObject1).b();
    localObject1 = new y[localArrayList.size()];
    localObject1 = (y[])localArrayList.toArray((Object[])localObject1);
    ((c)localObject2).<init>(str1, str2, (y[])localObject1);
    return (f)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */