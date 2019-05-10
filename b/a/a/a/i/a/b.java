package b.a.a.a.i.a;

import b.a.a.a.k.p;
import b.a.a.a.o.d;
import b.a.a.a.q;
import java.nio.charset.Charset;
import java.security.Principal;

public class b
  extends m
{
  private boolean a = false;
  
  public b()
  {
    this(localCharset);
  }
  
  public b(Charset paramCharset)
  {
    super(paramCharset);
  }
  
  public b.a.a.a.e a(b.a.a.a.a.m paramm, q paramq)
  {
    b.a.a.a.n.a locala = new b/a/a/a/n/a;
    locala.<init>();
    return a(paramm, paramq, locala);
  }
  
  public b.a.a.a.e a(b.a.a.a.a.m paramm, q paramq, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(paramm, "Credentials");
    b.a.a.a.o.a.a(paramq, "HTTP request");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramm.a().getName();
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(":");
    localObject2 = paramm.b();
    String str;
    if (localObject2 == null)
    {
      localObject2 = "null";
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject1).toString();
      localObject1 = a(paramq);
      localObject2 = b.a.a.a.o.e.a((String)localObject2, (String)localObject1);
      int i = 2;
      localObject2 = b.a.a.a.h.a.b((byte[])localObject2, i);
      localObject1 = new b/a/a/a/o/d;
      ((d)localObject1).<init>(32);
      boolean bool = e();
      if (!bool) {
        break label195;
      }
      str = "Proxy-Authorization";
      ((d)localObject1).a(str);
    }
    for (;;)
    {
      ((d)localObject1).a(": Basic ");
      int j = localObject2.length;
      ((d)localObject1).a((byte[])localObject2, 0, j);
      localObject2 = new b/a/a/a/k/p;
      ((p)localObject2).<init>((d)localObject1);
      return (b.a.a.a.e)localObject2;
      localObject2 = paramm.b();
      break;
      label195:
      str = "Authorization";
      ((d)localObject1).a(str);
    }
  }
  
  public String a()
  {
    return "basic";
  }
  
  public void a(b.a.a.a.e parame)
  {
    super.a(parame);
    this.a = true;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return this.a;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */