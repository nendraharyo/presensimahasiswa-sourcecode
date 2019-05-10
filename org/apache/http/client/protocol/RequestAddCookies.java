package org.apache.http.client.protocol;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.RequestLine;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.config.Lookup;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.cookie.SetCookie2;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

public class RequestAddCookies
  implements HttpRequestInterceptor
{
  private final Log log;
  
  public RequestAddCookies()
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Args.notNull(paramHttpRequest, "HTTP request");
    Args.notNull(paramHttpContext, "HTTP context");
    Object localObject2 = paramHttpRequest.getRequestLine().getMethod();
    Object localObject4 = "CONNECT";
    boolean bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject4);
    if (bool1) {}
    Object localObject5;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    Object localObject9;
    for (;;)
    {
      return;
      localObject5 = HttpClientContext.adapt(paramHttpContext);
      localObject6 = ((HttpClientContext)localObject5).getCookieStore();
      if (localObject6 == null)
      {
        localObject2 = this.log;
        localObject4 = "Cookie store not specified in HTTP context";
        ((Log)localObject2).debug(localObject4);
      }
      else
      {
        localObject7 = ((HttpClientContext)localObject5).getCookieSpecRegistry();
        if (localObject7 == null)
        {
          localObject2 = this.log;
          localObject4 = "CookieSpec registry not specified in HTTP context";
          ((Log)localObject2).debug(localObject4);
        }
        else
        {
          localObject8 = ((HttpClientContext)localObject5).getTargetHost();
          if (localObject8 == null)
          {
            localObject2 = this.log;
            localObject4 = "Target host not set in the context";
            ((Log)localObject2).debug(localObject4);
          }
          else
          {
            localObject9 = ((HttpClientContext)localObject5).getHttpRoute();
            if (localObject9 != null) {
              break;
            }
            localObject2 = this.log;
            localObject4 = "Connection route not set in the context";
            ((Log)localObject2).debug(localObject4);
          }
        }
      }
    }
    localObject2 = ((HttpClientContext)localObject5).getRequestConfig().getCookieSpec();
    if (localObject2 == null) {
      localObject2 = "best-match";
    }
    label322:
    label363:
    Object localObject3;
    for (localObject4 = localObject2;; localObject4 = localObject3)
    {
      localObject2 = this.log;
      bool1 = ((Log)localObject2).isDebugEnabled();
      Object localObject10;
      if (bool1)
      {
        localObject2 = this.log;
        localObject10 = new java/lang/StringBuilder;
        ((StringBuilder)localObject10).<init>();
        String str = "CookieSpec selected: ";
        localObject10 = str + (String)localObject4;
        ((Log)localObject2).debug(localObject10);
      }
      bool1 = paramHttpRequest instanceof HttpUriRequest;
      if (bool1)
      {
        localObject2 = paramHttpRequest;
        localObject2 = ((HttpUriRequest)paramHttpRequest).getURI();
        if (localObject2 == null) {
          break label500;
        }
        localObject2 = ((URI)localObject2).getPath();
        localObject10 = ((HttpHost)localObject8).getHostName();
        i = ((HttpHost)localObject8).getPort();
        if (i < 0)
        {
          localObject1 = ((RouteInfo)localObject9).getTargetHost();
          i = ((HttpHost)localObject1).getPort();
        }
        localObject8 = new org/apache/http/cookie/CookieOrigin;
        if (i < 0) {
          break label509;
        }
        boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
        if (bool2) {
          break label517;
        }
      }
      for (;;)
      {
        boolean bool3 = ((RouteInfo)localObject9).isSecure();
        ((CookieOrigin)localObject8).<init>((String)localObject10, i, (String)localObject2, bool3);
        localObject2 = (CookieSpecProvider)((Lookup)localObject7).lookup((String)localObject4);
        if (localObject2 != null) {
          break label524;
        }
        localObject2 = new org/apache/http/HttpException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject4 = "Unsupported cookie policy: " + (String)localObject4;
        ((HttpException)localObject2).<init>((String)localObject4);
        throw ((Throwable)localObject2);
        try
        {
          localObject2 = new java/net/URI;
          localObject10 = paramHttpRequest.getRequestLine();
          localObject10 = ((RequestLine)localObject10).getUri();
          ((URI)localObject2).<init>((String)localObject10);
        }
        catch (URISyntaxException localURISyntaxException)
        {
          bool1 = false;
          localObject3 = null;
        }
        break;
        label500:
        bool1 = false;
        localObject3 = null;
        break label322;
        label509:
        i = 0;
        localObject1 = null;
        break label363;
        label517:
        localObject3 = "/";
      }
      label524:
      localObject4 = ((CookieSpecProvider)localObject3).create((HttpContext)localObject5);
      localObject3 = new java/util/ArrayList;
      localObject1 = ((CookieStore)localObject6).getCookies();
      ((ArrayList)localObject3).<init>((Collection)localObject1);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      localObject5 = new java/util/Date;
      ((Date)localObject5).<init>();
      localObject6 = ((List)localObject3).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject6).hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = (Cookie)((Iterator)localObject6).next();
        boolean bool4 = ((Cookie)localObject3).isExpired((Date)localObject5);
        if (!bool4)
        {
          bool4 = ((CookieSpec)localObject4).match((Cookie)localObject3, (CookieOrigin)localObject8);
          if (bool4)
          {
            localObject7 = this.log;
            bool4 = ((Log)localObject7).isDebugEnabled();
            if (bool4)
            {
              localObject7 = this.log;
              localObject9 = new java/lang/StringBuilder;
              ((StringBuilder)localObject9).<init>();
              localObject9 = ((StringBuilder)localObject9).append("Cookie ").append(localObject3);
              localObject10 = " match ";
              localObject9 = (String)localObject10 + localObject8;
              ((Log)localObject7).debug(localObject9);
            }
            ((List)localObject1).add(localObject3);
          }
        }
        else
        {
          localObject7 = this.log;
          bool4 = ((Log)localObject7).isDebugEnabled();
          if (bool4)
          {
            localObject7 = this.log;
            localObject9 = new java/lang/StringBuilder;
            ((StringBuilder)localObject9).<init>();
            localObject10 = "Cookie ";
            localObject3 = ((StringBuilder)localObject9).append((String)localObject10).append(localObject3);
            localObject9 = " expired";
            localObject3 = (String)localObject9;
            ((Log)localObject7).debug(localObject3);
          }
        }
      }
      bool1 = ((List)localObject1).isEmpty();
      if (!bool1)
      {
        localObject3 = ((CookieSpec)localObject4).formatCookies((List)localObject1);
        localObject5 = ((List)localObject3).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject5).hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = (Header)((Iterator)localObject5).next();
          ((HttpRequest)paramHttpRequest).addHeader((Header)localObject3);
        }
      }
      int k = ((CookieSpec)localObject4).getVersion();
      if (k > 0)
      {
        localObject1 = ((List)localObject1).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject1).hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = (Cookie)((Iterator)localObject1).next();
          int m = ((Cookie)localObject3).getVersion();
          if (k == m)
          {
            bool1 = localObject3 instanceof SetCookie2;
            if (bool1) {}
          }
          else
          {
            j = 1;
          }
        }
        if (j != 0)
        {
          localObject3 = ((CookieSpec)localObject4).getVersionHeader();
          if (localObject3 != null) {
            ((HttpRequest)paramHttpRequest).addHeader((Header)localObject3);
          }
        }
      }
      paramHttpContext.setAttribute("http.cookie-spec", localObject4);
      localObject3 = "http.cookie-origin";
      paramHttpContext.setAttribute((String)localObject3, localObject8);
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\RequestAddCookies.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */