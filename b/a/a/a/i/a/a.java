package b.a.a.a.i.a;

import b.a.a.a.a.k;
import b.a.a.a.a.l;
import b.a.a.a.a.m;
import b.a.a.a.a.o;
import b.a.a.a.q;
import java.util.Locale;

public abstract class a
  implements l
{
  private k a;
  
  public b.a.a.a.e a(m paramm, q paramq, b.a.a.a.n.e parame)
  {
    return a(paramm, paramq);
  }
  
  public void a(b.a.a.a.e parame)
  {
    b.a.a.a.o.a.a(parame, "Header");
    Object localObject1 = parame.c();
    Object localObject2 = "WWW-Authenticate";
    boolean bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    if (bool1)
    {
      localObject1 = k.a;
      this.a = ((k)localObject1);
      boolean bool2 = parame instanceof b.a.a.a.d;
      if (!bool2) {
        break label177;
      }
      localObject1 = parame;
      localObject1 = (b.a.a.a.d)parame;
      localObject2 = ((b.a.a.a.d)localObject1).a();
      parame = (b.a.a.a.d)parame;
      i = parame.b();
    }
    StringBuilder localStringBuilder;
    for (;;)
    {
      int j = ((b.a.a.a.o.d)localObject2).c();
      if (i >= j) {
        break label229;
      }
      boolean bool3 = b.a.a.a.n.d.a(((b.a.a.a.o.d)localObject2).a(i));
      if (!bool3) {
        break label229;
      }
      i += 1;
      continue;
      localObject2 = "Proxy-Authenticate";
      bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
      if (bool1)
      {
        localObject1 = k.b;
        this.a = ((k)localObject1);
        break;
      }
      localObject2 = new b/a/a/a/a/o;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject1 = "Unexpected header name: " + (String)localObject1;
      ((o)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      label177:
      localObject1 = parame.d();
      if (localObject1 == null)
      {
        localObject1 = new b/a/a/a/a/o;
        ((o)localObject1).<init>("Header value is null");
        throw ((Throwable)localObject1);
      }
      localObject2 = new b/a/a/a/o/d;
      k = ((String)localObject1).length();
      ((b.a.a.a.o.d)localObject2).<init>(k);
      ((b.a.a.a.o.d)localObject2).a((String)localObject1);
      i = 0;
      localObject1 = null;
    }
    label229:
    int k = i;
    for (;;)
    {
      int m = ((b.a.a.a.o.d)localObject2).c();
      if (k >= m) {
        break;
      }
      bool4 = b.a.a.a.n.d.a(((b.a.a.a.o.d)localObject2).a(k));
      if (bool4) {
        break;
      }
      k += 1;
    }
    localObject1 = ((b.a.a.a.o.d)localObject2).a(i, k);
    String str = a();
    boolean bool4 = ((String)localObject1).equalsIgnoreCase(str);
    if (!bool4)
    {
      localObject2 = new b/a/a/a/a/o;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject1 = "Invalid scheme identifier: " + (String)localObject1;
      ((o)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    int i = ((b.a.a.a.o.d)localObject2).c();
    a((b.a.a.a.o.d)localObject2, k, i);
  }
  
  protected abstract void a(b.a.a.a.o.d paramd, int paramInt1, int paramInt2);
  
  public boolean e()
  {
    k localk1 = this.a;
    boolean bool;
    if (localk1 != null)
    {
      localk1 = this.a;
      k localk2 = k.b;
      if (localk1 == localk2) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localk1 = null;
    }
  }
  
  public String toString()
  {
    String str = a();
    Locale localLocale;
    if (str != null) {
      localLocale = Locale.ENGLISH;
    }
    for (str = str.toUpperCase(localLocale);; str = super.toString()) {
      return str;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */