package b.a.a.a.b.c;

import b.a.a.a.ac;
import b.a.a.a.ae;
import b.a.a.a.b.f.c;
import b.a.a.a.e;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

public class m
{
  private String a;
  private ac b;
  private URI c;
  private b.a.a.a.k.q d;
  private b.a.a.a.k e;
  private LinkedList f;
  private b.a.a.a.b.a.a g;
  
  m()
  {
    this(null);
  }
  
  m(String paramString)
  {
    this.a = paramString;
  }
  
  public static m a(b.a.a.a.q paramq)
  {
    b.a.a.a.o.a.a(paramq, "HTTP request");
    m localm = new b/a/a/a/b/c/m;
    localm.<init>();
    return localm.b(paramq);
  }
  
  private m b(b.a.a.a.q paramq)
  {
    if (paramq == null) {
      return this;
    }
    Object localObject = paramq.getRequestLine().a();
    this.a = ((String)localObject);
    localObject = paramq.getRequestLine().b();
    this.b = ((ac)localObject);
    boolean bool = paramq instanceof l;
    if (bool)
    {
      localObject = paramq;
      localObject = ((l)paramq).getURI();
      this.c = ((URI)localObject);
      label66:
      localObject = this.d;
      if (localObject == null)
      {
        localObject = new b/a/a/a/k/q;
        ((b.a.a.a.k.q)localObject).<init>();
        this.d = ((b.a.a.a.k.q)localObject);
      }
      this.d.a();
      localObject = this.d;
      e[] arrayOfe = ((b.a.a.a.q)paramq).getAllHeaders();
      ((b.a.a.a.k.q)localObject).a(arrayOfe);
      bool = paramq instanceof b.a.a.a.l;
      if (!bool) {
        break label200;
      }
      localObject = paramq;
      localObject = ((b.a.a.a.l)paramq).getEntity();
      this.e = ((b.a.a.a.k)localObject);
      label143:
      bool = paramq instanceof d;
      if (!bool) {
        break label208;
      }
      paramq = (d)paramq;
      localObject = paramq.getConfig();
    }
    label200:
    label208:
    for (this.g = ((b.a.a.a.b.a.a)localObject);; this.g = null)
    {
      this.f = null;
      break;
      localObject = URI.create(paramq.getRequestLine().c());
      this.c = ((URI)localObject);
      break label66;
      this.e = null;
      break label143;
    }
  }
  
  public l a()
  {
    Object localObject1 = this.c;
    Object localObject2;
    Object localObject3;
    Object localObject5;
    if (localObject1 != null)
    {
      localObject1 = this.c;
      localObject2 = this.e;
      localObject3 = this.f;
      if (localObject3 == null) {
        break label253;
      }
      localObject3 = this.f;
      boolean bool = ((LinkedList)localObject3).isEmpty();
      if (bool) {
        break label253;
      }
      if (localObject2 != null) {
        break label191;
      }
      localObject3 = "POST";
      localObject5 = this.a;
      bool = ((String)localObject3).equalsIgnoreCase((String)localObject5);
      if (!bool)
      {
        localObject3 = "PUT";
        localObject5 = this.a;
        bool = ((String)localObject3).equalsIgnoreCase((String)localObject5);
        if (!bool) {
          break label191;
        }
      }
      localObject2 = new b/a/a/a/b/b/a;
      localObject3 = this.f;
      localObject5 = b.a.a.a.n.d.a;
      ((b.a.a.a.b.b.a)localObject2).<init>((Iterable)localObject3, (Charset)localObject5);
      localObject3 = localObject1;
    }
    for (;;)
    {
      label115:
      if (localObject2 == null)
      {
        localObject1 = new b/a/a/a/b/c/m$b;
        localObject2 = this.a;
        ((m.b)localObject1).<init>((String)localObject2);
      }
      for (;;)
      {
        localObject2 = this.b;
        ((k)localObject1).setProtocolVersion((ac)localObject2);
        ((k)localObject1).setURI((URI)localObject3);
        localObject2 = this.d;
        if (localObject2 != null)
        {
          localObject2 = this.d.b();
          ((k)localObject1).setHeaders((e[])localObject2);
        }
        localObject2 = this.g;
        ((k)localObject1).setConfig((b.a.a.a.b.a.a)localObject2);
        return (l)localObject1;
        localObject1 = URI.create("/");
        break;
        try
        {
          label191:
          localObject3 = new b/a/a/a/b/f/c;
          ((c)localObject3).<init>((URI)localObject1);
          localObject5 = this.f;
          localObject3 = ((c)localObject3).a((List)localObject5);
          localObject1 = ((c)localObject3).a();
          localObject3 = localObject1;
        }
        catch (URISyntaxException localURISyntaxException)
        {
          localObject4 = localObject1;
        }
        break label115;
        localObject1 = new b/a/a/a/b/c/m$a;
        localObject5 = this.a;
        ((m.a)localObject1).<init>((String)localObject5);
        ((m.a)localObject1).setEntity((b.a.a.a.k)localObject2);
      }
      label253:
      Object localObject4 = localObject1;
    }
  }
  
  public m a(URI paramURI)
  {
    this.c = paramURI;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\c\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */