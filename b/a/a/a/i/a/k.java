package b.a.a.a.i.a;

import b.a.a.a.a.i;
import b.a.a.a.a.m;
import b.a.a.a.a.n;
import b.a.a.a.a.o;
import b.a.a.a.e;
import b.a.a.a.o.d;
import b.a.a.a.q;

public class k
  extends a
{
  private final h a;
  private k.a b;
  private String c;
  
  public k()
  {
    this(localj);
  }
  
  public k(h paramh)
  {
    b.a.a.a.o.a.a(paramh, "NTLM engine");
    this.a = paramh;
    k.a locala = k.a.a;
    this.b = locala;
    this.c = null;
  }
  
  public e a(m paramm, q paramq)
  {
    Object localObject4;
    try
    {
      paramm = (b.a.a.a.a.p)paramm;
      Object localObject1 = this.b;
      localObject3 = k.a.f;
      if (localObject1 == localObject3)
      {
        localObject1 = new b/a/a/a/a/i;
        ((i)localObject1).<init>("NTLM authentication failed");
        throw ((Throwable)localObject1);
      }
    }
    catch (ClassCastException localClassCastException)
    {
      localObject2 = new b/a/a/a/a/n;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Credentials cannot be used for NTLM authentication: ");
      localObject4 = paramm.getClass().getName();
      localObject3 = (String)localObject4;
      ((n)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    }
    Object localObject2 = this.b;
    Object localObject3 = k.a.b;
    if (localObject2 == localObject3)
    {
      localObject2 = this.a;
      localObject3 = paramm.d();
      localObject4 = paramm.e();
      localObject2 = ((h)localObject2).a((String)localObject3, (String)localObject4);
      localObject3 = k.a.c;
      this.b = ((k.a)localObject3);
      localObject3 = new b/a/a/a/o/d;
      ((d)localObject3).<init>(32);
      boolean bool = e();
      if (!bool) {
        break label331;
      }
      localObject4 = "Proxy-Authorization";
      ((d)localObject3).a((String)localObject4);
    }
    for (;;)
    {
      ((d)localObject3).a(": NTLM ");
      ((d)localObject3).a((String)localObject2);
      localObject2 = new b/a/a/a/k/p;
      ((b.a.a.a.k.p)localObject2).<init>((d)localObject3);
      return (e)localObject2;
      localObject2 = this.b;
      localObject3 = k.a.d;
      if (localObject2 == localObject3)
      {
        localObject2 = this.a;
        localObject3 = paramm.c();
        localObject4 = paramm.b();
        String str1 = paramm.d();
        String str2 = paramm.e();
        String str3 = this.c;
        localObject2 = ((h)localObject2).a((String)localObject3, (String)localObject4, str1, str2, str3);
        localObject3 = k.a.e;
        this.b = ((k.a)localObject3);
        break;
      }
      localObject2 = new b/a/a/a/a/i;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Unexpected state: ");
      localObject4 = this.b;
      localObject3 = localObject4;
      ((i)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
      label331:
      localObject4 = "Authorization";
      ((d)localObject3).a((String)localObject4);
    }
  }
  
  public String a()
  {
    return "ntlm";
  }
  
  protected void a(d paramd, int paramInt1, int paramInt2)
  {
    Object localObject = paramd.b(paramInt1, paramInt2);
    this.c = ((String)localObject);
    localObject = this.c;
    int i = ((String)localObject).length();
    k.a locala;
    if (i == 0)
    {
      localObject = this.b;
      locala = k.a.a;
      if (localObject == locala)
      {
        localObject = k.a.b;
        this.b = ((k.a)localObject);
      }
    }
    for (;;)
    {
      return;
      localObject = k.a.f;
      this.b = ((k.a)localObject);
      continue;
      localObject = this.b;
      locala = k.a.c;
      i = ((k.a)localObject).compareTo(locala);
      if (i < 0)
      {
        localObject = k.a.f;
        this.b = ((k.a)localObject);
        localObject = new b/a/a/a/a/o;
        ((o)localObject).<init>("Out of sequence NTLM response message");
        throw ((Throwable)localObject);
      }
      localObject = this.b;
      locala = k.a.c;
      if (localObject == locala)
      {
        localObject = k.a.d;
        this.b = ((k.a)localObject);
      }
    }
  }
  
  public String b()
  {
    return null;
  }
  
  public boolean c()
  {
    return true;
  }
  
  public boolean d()
  {
    k.a locala1 = this.b;
    k.a locala2 = k.a.e;
    boolean bool;
    if (locala1 != locala2)
    {
      locala1 = this.b;
      locala2 = k.a.f;
      if (locala1 != locala2) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */