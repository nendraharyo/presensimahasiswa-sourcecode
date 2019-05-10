package b.a.a.a.i.b;

import b.a.a.a.ab;
import b.a.a.a.ae;
import b.a.a.a.af;
import b.a.a.a.b.f.d;
import b.a.a.a.b.o;
import b.a.a.a.n;
import b.a.a.a.o.a;
import b.a.a.a.q;
import b.a.a.a.s;
import java.net.URI;
import java.net.URISyntaxException;

public class m
  implements o
{
  private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
  public b.a.a.a.h.b log;
  
  public m()
  {
    b.a.a.a.h.b localb = new b/a/a/a/h/b;
    Class localClass = getClass();
    localb.<init>(localClass);
    this.log = localb;
  }
  
  public URI getLocationURI(s params, b.a.a.a.n.e parame)
  {
    a.a(params, "HTTP response");
    Object localObject1 = params.getFirstHeader("location");
    Object localObject4;
    if (localObject1 == null)
    {
      localObject1 = new b/a/a/a/ab;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Received redirect response ");
      localObject4 = params.a();
      localObject3 = localObject4 + " but no location header";
      ((ab)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    Object localObject3 = ((b.a.a.a.e)localObject1).d();
    localObject1 = this.log;
    boolean bool1 = ((b.a.a.a.h.b)localObject1).a();
    Object localObject5;
    if (bool1)
    {
      localObject1 = this.log;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append("Redirect requested to location '").append((String)localObject3);
      localObject5 = "'";
      localObject4 = (String)localObject5;
      ((b.a.a.a.h.b)localObject1).a(localObject4);
    }
    try
    {
      localObject4 = new java/net/URI;
      ((URI)localObject4).<init>((String)localObject3);
      localObject5 = params.getParams();
      bool1 = ((URI)localObject4).isAbsolute();
      if (bool1) {
        break label609;
      }
      localObject1 = "http.protocol.reject-relative-redirect";
      bool1 = ((b.a.a.a.l.e)localObject5).b((String)localObject1);
      if (bool1)
      {
        localObject1 = new b/a/a/a/ab;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = "Relative redirect location '" + localObject4 + "' not allowed";
        ((ab)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    catch (URISyntaxException localURISyntaxException1)
    {
      localObject4 = new b/a/a/a/ab;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject3 = "Invalid redirect URI: " + (String)localObject3;
      ((ab)localObject4).<init>((String)localObject3, localURISyntaxException1);
      throw ((Throwable)localObject4);
    }
    Object localObject2 = (n)parame.a("http.target_host");
    b.a.a.a.o.b.a(localObject2, "Target host");
    label606:
    label609:
    for (localObject3 = (q)parame.a("http.request");; localObject3 = localObject4)
    {
      for (;;)
      {
        try
        {
          URI localURI = new java/net/URI;
          localObject3 = ((q)localObject3).getRequestLine();
          localObject3 = ((ae)localObject3).c();
          localURI.<init>((String)localObject3);
          boolean bool2 = true;
          localObject2 = d.a(localURI, (n)localObject2, bool2);
          localObject2 = d.a((URI)localObject2, (URI)localObject4);
          localObject3 = localObject2;
          localObject2 = "http.protocol.allow-circular-redirects";
          bool1 = ((b.a.a.a.l.e)localObject5).c((String)localObject2);
          if (!bool1) {
            break label606;
          }
          localObject2 = (v)parame.a("http.protocol.redirect-locations");
          if (localObject2 == null)
          {
            localObject2 = new b/a/a/a/i/b/v;
            ((v)localObject2).<init>();
            localObject4 = "http.protocol.redirect-locations";
            parame.a((String)localObject4, localObject2);
          }
          localObject4 = ((URI)localObject3).getFragment();
          if (localObject4 != null) {}
          int i;
          String str;
          boolean bool3;
          localObject4 = localObject3;
        }
        catch (URISyntaxException localURISyntaxException2)
        {
          try
          {
            localObject4 = new b/a/a/a/n;
            localObject5 = ((URI)localObject3).getHost();
            i = ((URI)localObject3).getPort();
            str = ((URI)localObject3).getScheme();
            ((n)localObject4).<init>((String)localObject5, i, str);
            bool3 = true;
            localObject4 = d.a((URI)localObject3, (n)localObject4, bool3);
            bool3 = ((v)localObject2).a((URI)localObject4);
            if (!bool3) {
              break;
            }
            localObject2 = new b/a/a/a/b/e;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject3 = "Circular redirect to '" + localObject4 + "'";
            ((b.a.a.a.b.e)localObject2).<init>((String)localObject3);
            throw ((Throwable)localObject2);
          }
          catch (URISyntaxException localURISyntaxException3)
          {
            localObject3 = new b/a/a/a/ab;
            localObject4 = localURISyntaxException3.getMessage();
            ((ab)localObject3).<init>((String)localObject4, localURISyntaxException3);
            throw ((Throwable)localObject3);
          }
          localURISyntaxException2 = localURISyntaxException2;
          localObject3 = new b/a/a/a/ab;
          localObject4 = localURISyntaxException2.getMessage();
          ((ab)localObject3).<init>((String)localObject4, localURISyntaxException2);
          throw ((Throwable)localObject3);
        }
      }
      localURISyntaxException3.b((URI)localObject4);
      return (URI)localObject3;
    }
  }
  
  public boolean isRedirectRequested(s params, b.a.a.a.n.e parame)
  {
    boolean bool1 = true;
    a.a(params, "HTTP response");
    Object localObject = params.a();
    int i = ((af)localObject).b();
    switch (i)
    {
    default: 
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = ((q)parame.a("http.request")).getRequestLine().a();
      String str = "GET";
      boolean bool3 = ((String)localObject).equalsIgnoreCase(str);
      if (!bool3)
      {
        str = "HEAD";
        bool2 = ((String)localObject).equalsIgnoreCase(str);
        if (!bool2) {}
      }
      else
      {
        bool2 = bool1;
        continue;
      }
      boolean bool2 = false;
      localObject = null;
      continue;
      bool2 = bool1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */