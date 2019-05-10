package b.a.a.a.i.b;

import b.a.a.a.ab;
import b.a.a.a.ac;
import b.a.a.a.ae;
import b.a.a.a.b.c.l;
import b.a.a.a.k.m;
import b.a.a.a.l.f;
import java.net.URI;
import java.net.URISyntaxException;

public class w
  extends b.a.a.a.k.a
  implements l
{
  private final b.a.a.a.q a;
  private URI b;
  private String c;
  private ac d;
  private int e;
  
  public w(b.a.a.a.q paramq)
  {
    b.a.a.a.o.a.a(paramq, "HTTP request");
    this.a = paramq;
    Object localObject1 = paramq.getParams();
    setParams((b.a.a.a.l.e)localObject1);
    localObject1 = paramq.getAllHeaders();
    setHeaders((b.a.a.a.e[])localObject1);
    boolean bool = paramq instanceof l;
    if (bool)
    {
      localObject1 = paramq;
      localObject1 = ((l)paramq).getURI();
      this.b = ((URI)localObject1);
      paramq = (l)paramq;
      localObject1 = paramq.getMethod();
      this.c = ((String)localObject1);
      bool = false;
      localObject1 = null;
      this.d = null;
    }
    for (;;)
    {
      this.e = 0;
      return;
      Object localObject2 = paramq.getRequestLine();
      try
      {
        localObject1 = new java/net/URI;
        localObject3 = ((ae)localObject2).c();
        ((URI)localObject1).<init>((String)localObject3);
        this.b = ((URI)localObject1);
        localObject1 = ((ae)localObject2).a();
        this.c = ((String)localObject1);
        localObject1 = paramq.getProtocolVersion();
        this.d = ((ac)localObject1);
      }
      catch (URISyntaxException localURISyntaxException)
      {
        Object localObject3 = new b/a/a/a/ab;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Invalid request URI: ");
        localObject2 = ((ae)localObject2).c();
        localObject2 = (String)localObject2;
        ((ab)localObject3).<init>((String)localObject2, localURISyntaxException);
        throw ((Throwable)localObject3);
      }
    }
  }
  
  public void a(URI paramURI)
  {
    this.b = paramURI;
  }
  
  public boolean a()
  {
    return true;
  }
  
  public void abort()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void b()
  {
    this.headergroup.a();
    b.a.a.a.e[] arrayOfe = this.a.getAllHeaders();
    setHeaders(arrayOfe);
  }
  
  public b.a.a.a.q c()
  {
    return this.a;
  }
  
  public int d()
  {
    return this.e;
  }
  
  public void e()
  {
    int i = this.e + 1;
    this.e = i;
  }
  
  public String getMethod()
  {
    return this.c;
  }
  
  public ac getProtocolVersion()
  {
    ac localac = this.d;
    if (localac == null)
    {
      localac = f.b(getParams());
      this.d = localac;
    }
    return this.d;
  }
  
  public ae getRequestLine()
  {
    String str1 = getMethod();
    ac localac = getProtocolVersion();
    String str2 = null;
    Object localObject = this.b;
    if (localObject != null) {
      str2 = this.b.toASCIIString();
    }
    if (str2 != null)
    {
      int i = str2.length();
      if (i != 0) {}
    }
    else
    {
      str2 = "/";
    }
    localObject = new b/a/a/a/k/m;
    ((m)localObject).<init>(str1, str2, localac);
    return (ae)localObject;
  }
  
  public URI getURI()
  {
    return this.b;
  }
  
  public boolean isAborted()
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */