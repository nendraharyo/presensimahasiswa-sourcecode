package b.a.a.a.k;

import b.a.a.a.aa;
import b.a.a.a.ac;
import b.a.a.a.af;
import b.a.a.a.e;
import b.a.a.a.o.a;
import b.a.a.a.v;

public class j
  implements t
{
  public static final j a;
  public static final j b;
  protected final ac c;
  
  static
  {
    j localj = new b/a/a/a/k/j;
    localj.<init>();
    a = localj;
    localj = new b/a/a/a/k/j;
    localj.<init>();
    b = localj;
  }
  
  public j()
  {
    this(null);
  }
  
  public j(ac paramac)
  {
    if (paramac != null) {}
    for (;;)
    {
      this.c = paramac;
      return;
      paramac = v.c;
    }
  }
  
  protected ac a(int paramInt1, int paramInt2)
  {
    return this.c.a(paramInt1, paramInt2);
  }
  
  public ac a(b.a.a.a.o.d paramd, u paramu)
  {
    int i = -1;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = 0;
    String str1 = null;
    a.a(paramd, "Char array buffer");
    a.a(paramu, "Parser cursor");
    Object localObject1 = this.c;
    String str2 = ((ac)localObject1).a();
    int m = str2.length();
    int n = paramu.b();
    int i1 = paramu.a();
    d(paramd, paramu);
    int i2 = paramu.b();
    int i3 = i2 + m + 4;
    Object localObject2;
    if (i3 > i1)
    {
      localObject1 = new b/a/a/a/aa;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Not a valid protocol version: ");
      str1 = paramd.a(n, i1);
      localObject2 = str1;
      ((aa)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int i4 = 0;
    i3 = j;
    float f2 = f1;
    if ((i3 != 0) && (i4 < m))
    {
      i3 = i2 + i4;
      i3 = paramd.a(i3);
      int i5 = str2.charAt(i4);
      if (i3 == i5) {
        i3 = j;
      }
      for (f2 = f1;; f2 = 0.0F)
      {
        i4 += 1;
        break;
        i3 = 0;
        localObject1 = null;
      }
    }
    if (i3 != 0)
    {
      i3 = i2 + m;
      i3 = paramd.a(i3);
      i4 = 47;
      if (i3 != i4) {}
    }
    for (;;)
    {
      if (j == 0)
      {
        localObject1 = new b/a/a/a/aa;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Not a valid protocol version: ");
        str1 = paramd.a(n, i1);
        localObject2 = str1;
        ((aa)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        j = 0;
        localObject2 = null;
        f1 = 0.0F;
      }
      else
      {
        i3 = m + 1 + i2;
        f1 = 6.4E-44F;
        j = paramd.a(46, i3, i1);
        if (j == i)
        {
          localObject1 = new b/a/a/a/aa;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Invalid protocol version number: ");
          str1 = paramd.a(n, i1);
          localObject2 = str1;
          ((aa)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        try
        {
          localObject1 = paramd.b(i3, j);
          k = Integer.parseInt((String)localObject1);
          j += 1;
          f2 = 4.5E-44F;
          i3 = paramd.a(32, j, i1);
          if (i3 == i) {
            i3 = i1;
          }
          aa localaa1;
          aa localaa2;
          j = i3;
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          try
          {
            localObject2 = paramd.b(j, i3);
            j = Integer.parseInt((String)localObject2);
            paramu.a(i3);
            return a(k, j);
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            localaa2 = new b/a/a/a/aa;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("Invalid protocol minor version number: ");
            str1 = paramd.a(n, i1);
            localObject2 = str1;
            localaa2.<init>((String)localObject2);
            throw localaa2;
          }
          localNumberFormatException1 = localNumberFormatException1;
          localaa1 = new b/a/a/a/aa;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Invalid protocol major version number: ");
          str1 = paramd.a(n, i1);
          localObject2 = str1;
          localaa1.<init>((String)localObject2);
          throw localaa1;
        }
        f1 = f2;
      }
    }
  }
  
  protected af a(ac paramac, int paramInt, String paramString)
  {
    n localn = new b/a/a/a/k/n;
    localn.<init>(paramac, paramInt, paramString);
    return localn;
  }
  
  public e a(b.a.a.a.o.d paramd)
  {
    p localp = new b/a/a/a/k/p;
    localp.<init>(paramd);
    return localp;
  }
  
  public boolean b(b.a.a.a.o.d paramd, u paramu)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    a.a(paramd, "Char array buffer");
    String str1 = "Parser cursor";
    a.a(paramu, str1);
    int j = paramu.b();
    ac localac = this.c;
    String str2 = localac.a();
    int k = str2.length();
    int m = paramd.c();
    int i1 = k + 4;
    if (m < i1) {}
    do
    {
      return bool1;
      if (j >= 0) {
        break;
      }
      j = paramd.c() + -4 - k;
      m = j + k + 4;
      i1 = paramd.c();
    } while (m > i1);
    i1 = 0;
    m = i;
    float f2 = f1;
    label124:
    boolean bool2;
    if ((m != 0) && (i1 < k))
    {
      m = j + i1;
      m = paramd.a(m);
      int i2 = str2.charAt(i1);
      if (m == i2) {
        m = i;
      }
      for (f2 = f1;; f2 = 0.0F)
      {
        i1 += 1;
        break label124;
        if (j != 0) {
          break;
        }
        for (;;)
        {
          m = paramd.c();
          if (j >= m) {
            break;
          }
          bool2 = b.a.a.a.n.d.a(paramd.a(j));
          if (!bool2) {
            break;
          }
          j += 1;
        }
        bool2 = false;
        localac = null;
      }
    }
    int n;
    if (bool2)
    {
      j += k;
      j = paramd.a(j);
      n = 47;
      f2 = 6.6E-44F;
      if (j != n) {}
    }
    for (;;)
    {
      bool1 = i;
      break;
      i = 0;
      f1 = 0.0F;
      continue;
      i = n;
      f1 = f2;
    }
  }
  
  public af c(b.a.a.a.o.d paramd, u paramu)
  {
    a.a(paramd, "Char array buffer");
    Object localObject1 = "Parser cursor";
    a.a(paramu, (String)localObject1);
    int i = paramu.b();
    int j = paramu.a();
    for (;;)
    {
      Object localObject4;
      int k;
      int m;
      String str1;
      Object localObject5;
      Object localObject2;
      try
      {
        localObject4 = a(paramd, paramu);
        d(paramd, paramu);
        k = paramu.b();
        m = 32;
        m = paramd.a(m, k, j);
        if (m >= 0) {
          break label348;
        }
        n = j;
        str1 = paramd.b(k, n);
        m = 0;
        localObject1 = null;
        int i1 = str1.length();
        if (m >= i1) {
          break label247;
        }
        i1 = str1.charAt(m);
        boolean bool = Character.isDigit(i1);
        if (!bool)
        {
          localObject1 = new b/a/a/a/aa;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject4 = "Status line contains invalid status code: ";
          localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject4 = paramd.a(i, j);
          localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject5 = ((StringBuilder)localObject5).toString();
          ((aa)localObject1).<init>((String)localObject5);
          throw ((Throwable)localObject1);
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        localObject2 = new b/a/a/a/aa;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Invalid status line: ");
        String str2 = paramd.a(i, j);
        localObject5 = str2;
        ((aa)localObject2).<init>((String)localObject5);
        throw ((Throwable)localObject2);
      }
      m += 1;
      continue;
      for (;;)
      {
        try
        {
          label247:
          k = Integer.parseInt(str1);
          if (n < j)
          {
            localObject2 = paramd.b(n, j);
            return a((ac)localObject4, k, (String)localObject2);
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localObject3 = new b/a/a/a/aa;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject4 = "Status line contains invalid status code: ";
          localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject4 = paramd.a(i, j);
          localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject5 = ((StringBuilder)localObject5).toString();
          ((aa)localObject3).<init>((String)localObject5);
          throw ((Throwable)localObject3);
        }
        Object localObject3 = "";
      }
      label348:
      int n = m;
    }
  }
  
  protected void d(b.a.a.a.o.d paramd, u paramu)
  {
    int i = paramu.b();
    int j = paramu.a();
    while (i < j)
    {
      boolean bool = b.a.a.a.n.d.a(paramd.a(i));
      if (!bool) {
        break;
      }
      i += 1;
    }
    paramu.a(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */