package com.loopj.android.http;

import b.a.a.a.ab;
import b.a.a.a.ae;
import b.a.a.a.af;
import b.a.a.a.b.f.d;
import b.a.a.a.i.b.m;
import b.a.a.a.i.b.v;
import b.a.a.a.n;
import b.a.a.a.q;
import b.a.a.a.s;
import java.net.URI;
import java.net.URISyntaxException;

class MyRedirectHandler
  extends m
{
  private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
  private final boolean enableRedirects;
  
  public MyRedirectHandler(boolean paramBoolean)
  {
    this.enableRedirects = paramBoolean;
  }
  
  public URI getLocationURI(s params, b.a.a.a.n.e parame)
  {
    if (params == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("HTTP response may not be null");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = params.getFirstHeader("location");
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
    localObject1 = ((b.a.a.a.e)localObject1).d();
    Object localObject4 = "%20";
    Object localObject3 = ((String)localObject1).replaceAll(" ", (String)localObject4);
    Object localObject5;
    boolean bool1;
    try
    {
      localObject4 = new java/net/URI;
      ((URI)localObject4).<init>((String)localObject3);
      localObject5 = params.getParams();
      bool1 = ((URI)localObject4).isAbsolute();
      if (bool1) {
        break label574;
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
    if (localObject2 == null)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>("Target host not available in the HTTP context");
      throw ((Throwable)localObject2);
    }
    label571:
    label574:
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
            break label571;
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
    boolean bool1 = false;
    IllegalArgumentException localIllegalArgumentException = null;
    boolean bool2 = this.enableRedirects;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      if (params == null)
      {
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("HTTP response may not be null");
        throw localIllegalArgumentException;
      }
      af localaf = params.a();
      int i = localaf.b();
      switch (i)
      {
      default: 
        break;
      case 301: 
      case 302: 
      case 303: 
      case 307: 
        bool1 = true;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\MyRedirectHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */