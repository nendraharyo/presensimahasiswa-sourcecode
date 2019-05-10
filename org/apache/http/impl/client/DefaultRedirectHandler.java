package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class DefaultRedirectHandler
  implements RedirectHandler
{
  private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
  private final Log log;
  
  public DefaultRedirectHandler()
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
  }
  
  public URI getLocationURI(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    Object localObject1 = paramHttpResponse.getFirstHeader("location");
    Object localObject4;
    if (localObject1 == null)
    {
      localObject1 = new org/apache/http/ProtocolException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Received redirect response ");
      localObject4 = paramHttpResponse.getStatusLine();
      localObject3 = localObject4 + " but no location header";
      ((ProtocolException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    Object localObject3 = ((Header)localObject1).getValue();
    localObject1 = this.log;
    boolean bool1 = ((Log)localObject1).isDebugEnabled();
    Object localObject5;
    if (bool1)
    {
      localObject1 = this.log;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append("Redirect requested to location '").append((String)localObject3);
      localObject5 = "'";
      localObject4 = (String)localObject5;
      ((Log)localObject1).debug(localObject4);
    }
    try
    {
      localObject4 = new java/net/URI;
      ((URI)localObject4).<init>((String)localObject3);
      localObject5 = paramHttpResponse.getParams();
      bool1 = ((URI)localObject4).isAbsolute();
      if (bool1) {
        break label613;
      }
      localObject1 = "http.protocol.reject-relative-redirect";
      bool1 = ((HttpParams)localObject5).isParameterTrue((String)localObject1);
      if (bool1)
      {
        localObject1 = new org/apache/http/ProtocolException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = "Relative redirect location '" + localObject4 + "' not allowed";
        ((ProtocolException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    catch (URISyntaxException localURISyntaxException1)
    {
      localObject4 = new org/apache/http/ProtocolException;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject3 = "Invalid redirect URI: " + (String)localObject3;
      ((ProtocolException)localObject4).<init>((String)localObject3, localURISyntaxException1);
      throw ((Throwable)localObject4);
    }
    Object localObject2 = (HttpHost)paramHttpContext.getAttribute("http.target_host");
    Asserts.notNull(localObject2, "Target host");
    label610:
    label613:
    for (localObject3 = (HttpRequest)paramHttpContext.getAttribute("http.request");; localObject3 = localObject4)
    {
      for (;;)
      {
        try
        {
          URI localURI = new java/net/URI;
          localObject3 = ((HttpRequest)localObject3).getRequestLine();
          localObject3 = ((RequestLine)localObject3).getUri();
          localURI.<init>((String)localObject3);
          boolean bool2 = true;
          localObject2 = URIUtils.rewriteURI(localURI, (HttpHost)localObject2, bool2);
          localObject2 = URIUtils.resolve((URI)localObject2, (URI)localObject4);
          localObject3 = localObject2;
          localObject2 = "http.protocol.allow-circular-redirects";
          bool1 = ((HttpParams)localObject5).isParameterFalse((String)localObject2);
          if (!bool1) {
            break label610;
          }
          localObject2 = (RedirectLocations)paramHttpContext.getAttribute("http.protocol.redirect-locations");
          if (localObject2 == null)
          {
            localObject2 = new org/apache/http/impl/client/RedirectLocations;
            ((RedirectLocations)localObject2).<init>();
            localObject4 = "http.protocol.redirect-locations";
            paramHttpContext.setAttribute((String)localObject4, localObject2);
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
            localObject4 = new org/apache/http/HttpHost;
            localObject5 = ((URI)localObject3).getHost();
            i = ((URI)localObject3).getPort();
            str = ((URI)localObject3).getScheme();
            ((HttpHost)localObject4).<init>((String)localObject5, i, str);
            bool3 = true;
            localObject4 = URIUtils.rewriteURI((URI)localObject3, (HttpHost)localObject4, bool3);
            bool3 = ((RedirectLocations)localObject2).contains((URI)localObject4);
            if (!bool3) {
              break;
            }
            localObject2 = new org/apache/http/client/CircularRedirectException;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject3 = "Circular redirect to '" + localObject4 + "'";
            ((CircularRedirectException)localObject2).<init>((String)localObject3);
            throw ((Throwable)localObject2);
          }
          catch (URISyntaxException localURISyntaxException3)
          {
            localObject3 = new org/apache/http/ProtocolException;
            localObject4 = localURISyntaxException3.getMessage();
            ((ProtocolException)localObject3).<init>((String)localObject4, localURISyntaxException3);
            throw ((Throwable)localObject3);
          }
          localURISyntaxException2 = localURISyntaxException2;
          localObject3 = new org/apache/http/ProtocolException;
          localObject4 = localURISyntaxException2.getMessage();
          ((ProtocolException)localObject3).<init>((String)localObject4, localURISyntaxException2);
          throw ((Throwable)localObject3);
        }
      }
      localURISyntaxException3.add((URI)localObject4);
      return (URI)localObject3;
    }
  }
  
  public boolean isRedirectRequested(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    boolean bool1 = true;
    Args.notNull(paramHttpResponse, "HTTP response");
    Object localObject = paramHttpResponse.getStatusLine();
    int i = ((StatusLine)localObject).getStatusCode();
    switch (i)
    {
    default: 
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = ((HttpRequest)paramHttpContext.getAttribute("http.request")).getRequestLine().getMethod();
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DefaultRedirectHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */