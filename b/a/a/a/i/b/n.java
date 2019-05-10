package b.a.a.a.i.b;

import b.a.a.a.ab;
import b.a.a.a.ae;
import b.a.a.a.af;
import b.a.a.a.b.c.f;
import b.a.a.a.b.c.g;
import b.a.a.a.b.c.l;
import b.a.a.a.b.c.m;
import b.a.a.a.b.f.c;
import b.a.a.a.b.f.d;
import b.a.a.a.b.p;
import b.a.a.a.o.h;
import b.a.a.a.q;
import b.a.a.a.s;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;

public class n
  implements p
{
  public static final n b;
  private static final String[] c;
  public b.a.a.a.h.b a;
  
  static
  {
    Object localObject = new b/a/a/a/i/b/n;
    ((n)localObject).<init>();
    b = (n)localObject;
    localObject = new String[2];
    localObject[0] = "GET";
    localObject[1] = "HEAD";
    c = (String[])localObject;
  }
  
  public n()
  {
    b.a.a.a.h.b localb = new b/a/a/a/h/b;
    Class localClass = getClass();
    localb.<init>(localClass);
    this.a = localb;
  }
  
  protected URI a(String paramString)
  {
    try
    {
      c localc = new b/a/a/a/b/f/c;
      localObject1 = new java/net/URI;
      ((URI)localObject1).<init>(paramString);
      localObject1 = ((URI)localObject1).normalize();
      localc.<init>((URI)localObject1);
      localObject1 = localc.c();
      if (localObject1 != null)
      {
        localObject2 = Locale.ENGLISH;
        localObject1 = ((String)localObject1).toLowerCase((Locale)localObject2);
        localc.c((String)localObject1);
      }
      localObject1 = localc.d();
      boolean bool = h.a((CharSequence)localObject1);
      if (bool)
      {
        localObject1 = "/";
        localc.d((String)localObject1);
      }
      return localc.a();
    }
    catch (URISyntaxException localURISyntaxException)
    {
      Object localObject1 = new b/a/a/a/ab;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Invalid redirect URI: " + paramString;
      ((ab)localObject1).<init>((String)localObject2, localURISyntaxException);
      throw ((Throwable)localObject1);
    }
  }
  
  public boolean a(q paramq, s params, b.a.a.a.n.e parame)
  {
    boolean bool1 = true;
    b.a.a.a.o.a.a(paramq, "HTTP request");
    b.a.a.a.o.a.a(params, "HTTP response");
    af localaf = params.a();
    int i = localaf.b();
    String str = paramq.getRequestLine().a();
    b.a.a.a.e locale = params.getFirstHeader("location");
    switch (i)
    {
    default: 
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      boolean bool2 = b(str);
      if ((!bool2) || (locale == null))
      {
        bool1 = false;
        continue;
        bool1 = b(str);
      }
    }
  }
  
  public l b(q paramq, s params, b.a.a.a.n.e parame)
  {
    URI localURI = c(paramq, params, parame);
    Object localObject = paramq.getRequestLine().a();
    String str = "HEAD";
    boolean bool1 = ((String)localObject).equalsIgnoreCase(str);
    if (bool1)
    {
      localObject = new b/a/a/a/b/c/g;
      ((g)localObject).<init>(localURI);
    }
    for (;;)
    {
      return (l)localObject;
      str = "GET";
      boolean bool2 = ((String)localObject).equalsIgnoreCase(str);
      if (bool2)
      {
        localObject = new b/a/a/a/b/c/f;
        ((f)localObject).<init>(localURI);
      }
      else
      {
        localObject = params.a();
        int j = ((af)localObject).b();
        int i = 307;
        if (j == i)
        {
          localObject = m.a(paramq).a(localURI).a();
        }
        else
        {
          localObject = new b/a/a/a/b/c/f;
          ((f)localObject).<init>(localURI);
        }
      }
    }
  }
  
  protected boolean b(String paramString)
  {
    boolean bool1 = false;
    String[] arrayOfString = c;
    int i = arrayOfString.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        String str = arrayOfString[j];
        boolean bool2 = str.equalsIgnoreCase(paramString);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      j += 1;
    }
  }
  
  public URI c(q paramq, s params, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(paramq, "HTTP request");
    b.a.a.a.o.a.a(params, "HTTP response");
    b.a.a.a.o.a.a(parame, "HTTP context");
    Object localObject1 = b.a.a.a.b.e.a.a(parame);
    Object localObject2 = params.getFirstHeader("location");
    if (localObject2 == null)
    {
      localObject2 = new b/a/a/a/ab;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append("Received redirect response ");
      localObject1 = params.a();
      localObject4 = localObject1 + " but no location header";
      ((ab)localObject2).<init>((String)localObject4);
      throw ((Throwable)localObject2);
    }
    localObject2 = ((b.a.a.a.e)localObject2).d();
    Object localObject4 = this.a;
    boolean bool1 = ((b.a.a.a.h.b)localObject4).a();
    if (bool1)
    {
      localObject4 = this.a;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append("Redirect requested to location '").append((String)localObject2);
      localObject6 = "'";
      localObject5 = (String)localObject6;
      ((b.a.a.a.h.b)localObject4).a(localObject5);
    }
    Object localObject5 = ((b.a.a.a.b.e.a)localObject1).k();
    localObject2 = a((String)localObject2);
    try
    {
      bool1 = ((URI)localObject2).isAbsolute();
      if (bool1) {
        break label510;
      }
      bool1 = ((b.a.a.a.b.a.a)localObject5).b();
      if (!bool1)
      {
        localObject4 = new b/a/a/a/ab;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject5 = "Relative redirect location '";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
        localObject2 = ((StringBuilder)localObject1).append(localObject2);
        localObject1 = "' not allowed";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((ab)localObject4).<init>((String)localObject2);
        throw ((Throwable)localObject4);
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
      localObject4 = new b/a/a/a/ab;
      localObject1 = localURISyntaxException.getMessage();
      ((ab)localObject4).<init>((String)localObject1, localURISyntaxException);
      throw ((Throwable)localObject4);
    }
    localObject4 = ((b.a.a.a.b.e.a)localObject1).o();
    Object localObject6 = "Target host";
    b.a.a.a.o.b.a(localObject4, (String)localObject6);
    localObject6 = new java/net/URI;
    Object localObject7 = paramq.getRequestLine();
    localObject7 = ((ae)localObject7).c();
    ((URI)localObject6).<init>((String)localObject7);
    localObject7 = null;
    localObject4 = d.a((URI)localObject6, (b.a.a.a.n)localObject4, false);
    Object localObject3 = d.a((URI)localObject4, localURISyntaxException);
    label510:
    for (localObject4 = localObject3;; localObject4 = localObject3)
    {
      localObject3 = (v)((b.a.a.a.b.e.a)localObject1).a("http.protocol.redirect-locations");
      if (localObject3 == null)
      {
        localObject3 = new b/a/a/a/i/b/v;
        ((v)localObject3).<init>();
        localObject1 = "http.protocol.redirect-locations";
        parame.a((String)localObject1, localObject3);
      }
      boolean bool2 = ((b.a.a.a.b.a.a)localObject5).c();
      if (!bool2)
      {
        bool2 = ((v)localObject3).a((URI)localObject4);
        if (bool2)
        {
          localObject3 = new b/a/a/a/b/e;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject4 = "Circular redirect to '" + localObject4 + "'";
          ((b.a.a.a.b.e)localObject3).<init>((String)localObject4);
          throw ((Throwable)localObject3);
        }
      }
      ((v)localObject3).b((URI)localObject4);
      return (URI)localObject4;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */