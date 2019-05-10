package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
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
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.TextUtils;

public class DefaultRedirectStrategy
  implements RedirectStrategy
{
  public static final DefaultRedirectStrategy INSTANCE;
  public static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
  private static final String[] REDIRECT_METHODS;
  private final Log log;
  
  static
  {
    Object localObject = new org/apache/http/impl/client/DefaultRedirectStrategy;
    ((DefaultRedirectStrategy)localObject).<init>();
    INSTANCE = (DefaultRedirectStrategy)localObject;
    localObject = new String[2];
    localObject[0] = "GET";
    localObject[1] = "HEAD";
    REDIRECT_METHODS = (String[])localObject;
  }
  
  public DefaultRedirectStrategy()
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
  }
  
  protected URI createLocationURI(String paramString)
  {
    try
    {
      URIBuilder localURIBuilder = new org/apache/http/client/utils/URIBuilder;
      localObject1 = new java/net/URI;
      ((URI)localObject1).<init>(paramString);
      localObject1 = ((URI)localObject1).normalize();
      localURIBuilder.<init>((URI)localObject1);
      localObject1 = localURIBuilder.getHost();
      if (localObject1 != null)
      {
        localObject2 = Locale.ENGLISH;
        localObject1 = ((String)localObject1).toLowerCase((Locale)localObject2);
        localURIBuilder.setHost((String)localObject1);
      }
      localObject1 = localURIBuilder.getPath();
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool)
      {
        localObject1 = "/";
        localURIBuilder.setPath((String)localObject1);
      }
      return localURIBuilder.build();
    }
    catch (URISyntaxException localURISyntaxException)
    {
      Object localObject1 = new org/apache/http/ProtocolException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Invalid redirect URI: " + paramString;
      ((ProtocolException)localObject1).<init>((String)localObject2, localURISyntaxException);
      throw ((Throwable)localObject1);
    }
  }
  
  public URI getLocationURI(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Args.notNull(paramHttpResponse, "HTTP response");
    Args.notNull(paramHttpContext, "HTTP context");
    Object localObject1 = HttpClientContext.adapt(paramHttpContext);
    Object localObject2 = paramHttpResponse.getFirstHeader("location");
    if (localObject2 == null)
    {
      localObject2 = new org/apache/http/ProtocolException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append("Received redirect response ");
      localObject1 = paramHttpResponse.getStatusLine();
      localObject4 = localObject1 + " but no location header";
      ((ProtocolException)localObject2).<init>((String)localObject4);
      throw ((Throwable)localObject2);
    }
    localObject2 = ((Header)localObject2).getValue();
    Object localObject4 = this.log;
    boolean bool1 = ((Log)localObject4).isDebugEnabled();
    if (bool1)
    {
      localObject4 = this.log;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append("Redirect requested to location '").append((String)localObject2);
      localObject6 = "'";
      localObject5 = (String)localObject6;
      ((Log)localObject4).debug(localObject5);
    }
    Object localObject5 = ((HttpClientContext)localObject1).getRequestConfig();
    localObject2 = createLocationURI((String)localObject2);
    try
    {
      bool1 = ((URI)localObject2).isAbsolute();
      if (bool1) {
        break label514;
      }
      bool1 = ((RequestConfig)localObject5).isRelativeRedirectsAllowed();
      if (!bool1)
      {
        localObject4 = new org/apache/http/ProtocolException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject5 = "Relative redirect location '";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
        localObject2 = ((StringBuilder)localObject1).append(localObject2);
        localObject1 = "' not allowed";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((ProtocolException)localObject4).<init>((String)localObject2);
        throw ((Throwable)localObject4);
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
      localObject4 = new org/apache/http/ProtocolException;
      localObject1 = localURISyntaxException.getMessage();
      ((ProtocolException)localObject4).<init>((String)localObject1, localURISyntaxException);
      throw ((Throwable)localObject4);
    }
    localObject4 = ((HttpClientContext)localObject1).getTargetHost();
    Object localObject6 = "Target host";
    Asserts.notNull(localObject4, (String)localObject6);
    localObject6 = new java/net/URI;
    Object localObject7 = paramHttpRequest.getRequestLine();
    localObject7 = ((RequestLine)localObject7).getUri();
    ((URI)localObject6).<init>((String)localObject7);
    localObject7 = null;
    localObject4 = URIUtils.rewriteURI((URI)localObject6, (HttpHost)localObject4, false);
    Object localObject3 = URIUtils.resolve((URI)localObject4, localURISyntaxException);
    label514:
    for (localObject4 = localObject3;; localObject4 = localObject3)
    {
      localObject3 = (RedirectLocations)((HttpClientContext)localObject1).getAttribute("http.protocol.redirect-locations");
      if (localObject3 == null)
      {
        localObject3 = new org/apache/http/impl/client/RedirectLocations;
        ((RedirectLocations)localObject3).<init>();
        localObject1 = "http.protocol.redirect-locations";
        paramHttpContext.setAttribute((String)localObject1, localObject3);
      }
      boolean bool2 = ((RequestConfig)localObject5).isCircularRedirectsAllowed();
      if (!bool2)
      {
        bool2 = ((RedirectLocations)localObject3).contains((URI)localObject4);
        if (bool2)
        {
          localObject3 = new org/apache/http/client/CircularRedirectException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject4 = "Circular redirect to '" + localObject4 + "'";
          ((CircularRedirectException)localObject3).<init>((String)localObject4);
          throw ((Throwable)localObject3);
        }
      }
      ((RedirectLocations)localObject3).add((URI)localObject4);
      return (URI)localObject4;
    }
  }
  
  public HttpUriRequest getRedirect(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    URI localURI = getLocationURI(paramHttpRequest, paramHttpResponse, paramHttpContext);
    Object localObject = paramHttpRequest.getRequestLine().getMethod();
    String str = "HEAD";
    boolean bool1 = ((String)localObject).equalsIgnoreCase(str);
    if (bool1)
    {
      localObject = new org/apache/http/client/methods/HttpHead;
      ((HttpHead)localObject).<init>(localURI);
    }
    for (;;)
    {
      return (HttpUriRequest)localObject;
      str = "GET";
      boolean bool2 = ((String)localObject).equalsIgnoreCase(str);
      if (bool2)
      {
        localObject = new org/apache/http/client/methods/HttpGet;
        ((HttpGet)localObject).<init>(localURI);
      }
      else
      {
        localObject = paramHttpResponse.getStatusLine();
        int j = ((StatusLine)localObject).getStatusCode();
        int i = 307;
        if (j == i)
        {
          localObject = RequestBuilder.copy(paramHttpRequest).setUri(localURI).build();
        }
        else
        {
          localObject = new org/apache/http/client/methods/HttpGet;
          ((HttpGet)localObject).<init>(localURI);
        }
      }
    }
  }
  
  protected boolean isRedirectable(String paramString)
  {
    boolean bool1 = false;
    String[] arrayOfString = REDIRECT_METHODS;
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
  
  public boolean isRedirected(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    boolean bool1 = true;
    Args.notNull(paramHttpRequest, "HTTP request");
    Args.notNull(paramHttpResponse, "HTTP response");
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    int i = localStatusLine.getStatusCode();
    String str = paramHttpRequest.getRequestLine().getMethod();
    Header localHeader = paramHttpResponse.getFirstHeader("location");
    switch (i)
    {
    default: 
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      boolean bool2 = isRedirectable(str);
      if ((!bool2) || (localHeader == null))
      {
        bool1 = false;
        continue;
        bool1 = isRedirectable(str);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DefaultRedirectStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */