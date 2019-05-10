package b.a.a.a.i.d;

import b.a.a.a.f.b;
import b.a.a.a.f.c;
import b.a.a.a.f.e;
import b.a.a.a.f.g;
import b.a.a.a.f.m;
import b.a.a.a.o.a;
import b.a.a.a.o.h;

public class i
  implements c
{
  public void a(b paramb, e parame)
  {
    boolean bool = b(paramb, parame);
    if (!bool)
    {
      g localg = new b/a/a/a/f/g;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Illegal path attribute \"");
      String str = paramb.g();
      localObject = ((StringBuilder)localObject).append(str).append("\". Path of origin: \"");
      str = parame.b();
      localObject = str + "\"";
      localg.<init>((String)localObject);
      throw localg;
    }
  }
  
  public void a(m paramm, String paramString)
  {
    String str = "Cookie";
    a.a(paramm, str);
    boolean bool = h.b(paramString);
    if (!bool) {}
    for (;;)
    {
      paramm.e(paramString);
      return;
      paramString = "/";
    }
  }
  
  public boolean b(b paramb, e parame)
  {
    int i = 1;
    a.a(paramb, "Cookie");
    a.a(parame, "Cookie origin");
    String str1 = parame.b();
    String str2 = paramb.g();
    if (str2 == null) {
      str2 = "/";
    }
    int j = str2.length();
    if (j > i)
    {
      String str3 = "/";
      boolean bool1 = str2.endsWith(str3);
      if (bool1)
      {
        int k = str2.length() + -1;
        str2 = str2.substring(0, k);
      }
    }
    boolean bool2 = str1.startsWith(str2);
    int i2;
    int m;
    if (bool2)
    {
      int n = str1.length();
      int i1 = str2.length();
      if (n != i1)
      {
        String str4 = "/";
        boolean bool3 = str2.endsWith(str4);
        if (!bool3)
        {
          i2 = str2.length();
          i2 = str1.charAt(i2);
          m = 47;
          if (i2 == m) {
            i2 = i;
          }
        }
      }
    }
    for (;;)
    {
      return i2;
      int i3 = 0;
      str2 = null;
      continue;
      i3 = m;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */