package org.apache.http.client.protocol;

import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class ResponseProcessCookies
  implements HttpResponseInterceptor
{
  private final Log log;
  
  public ResponseProcessCookies()
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
  }
  
  private static String formatCooke(Cookie paramCookie)
  {
    int i = 100;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = paramCookie.getName();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append("=\"");
    localObject1 = paramCookie.getValue();
    if (localObject1 != null)
    {
      int j = ((String)localObject1).length();
      if (j > i)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = ((String)localObject1).substring(0, i);
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = "...";
        localObject1 = (String)localObject2;
      }
      localStringBuilder.append((String)localObject1);
    }
    localStringBuilder.append("\"");
    localStringBuilder.append(", version:");
    localObject1 = Integer.toString(paramCookie.getVersion());
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(", domain:");
    localObject1 = paramCookie.getDomain();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(", path:");
    localObject1 = paramCookie.getPath();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(", expiry:");
    localObject1 = paramCookie.getExpiryDate();
    localStringBuilder.append(localObject1);
    return localStringBuilder.toString();
  }
  
  private void processCookies(HeaderIterator paramHeaderIterator, CookieSpec paramCookieSpec, CookieOrigin paramCookieOrigin, CookieStore paramCookieStore)
  {
    for (;;)
    {
      boolean bool1 = paramHeaderIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject1 = paramHeaderIterator.nextHeader();
      try
      {
        Object localObject2 = paramCookieSpec.parse((Header)localObject1, paramCookieOrigin);
        localObject3 = ((List)localObject2).iterator();
        boolean bool2;
        for (;;)
        {
          bool1 = ((Iterator)localObject3).hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = ((Iterator)localObject3).next();
          localObject2 = (Cookie)localObject2;
          Object localObject6;
          boolean bool3;
          try
          {
            paramCookieSpec.validate((Cookie)localObject2, paramCookieOrigin);
            paramCookieStore.addCookie((Cookie)localObject2);
            Log localLog = this.log;
            bool2 = localLog.isDebugEnabled();
            if (!bool2) {
              continue;
            }
            localLog = this.log;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "Cookie accepted [";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = formatCooke((Cookie)localObject2);
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = "]";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).toString();
            localLog.debug(localObject5);
          }
          catch (MalformedCookieException localMalformedCookieException2)
          {
            localObject5 = this.log;
            bool3 = ((Log)localObject5).isWarnEnabled();
          }
          if (bool3)
          {
            localObject5 = this.log;
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            String str2 = "Cookie rejected [";
            localObject6 = ((StringBuilder)localObject6).append(str2);
            localObject2 = formatCooke((Cookie)localObject2);
            localObject2 = ((StringBuilder)localObject6).append((String)localObject2);
            localObject6 = "] ";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
            localObject4 = localMalformedCookieException2.getMessage();
            localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
            localObject2 = ((StringBuilder)localObject2).toString();
            ((Log)localObject5).warn(localObject2);
          }
        }
        if (!bool2) {
          continue;
        }
      }
      catch (MalformedCookieException localMalformedCookieException1)
      {
        localObject4 = this.log;
        bool2 = ((Log)localObject4).isWarnEnabled();
      }
      Object localObject4 = this.log;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      Object localObject5 = "Invalid cookie header: \"";
      localObject1 = ((StringBuilder)localObject3).append((String)localObject5).append(localObject1);
      localObject3 = "\". ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      String str1 = localMalformedCookieException1.getMessage();
      str1 = str1;
      ((Log)localObject4).warn(str1);
    }
  }
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP request");
    Args.notNull(paramHttpContext, "HTTP context");
    Object localObject1 = HttpClientContext.adapt(paramHttpContext);
    Object localObject2 = ((HttpClientContext)localObject1).getCookieSpec();
    if (localObject2 == null)
    {
      localObject1 = this.log;
      localObject2 = "Cookie spec not specified in HTTP context";
      ((Log)localObject1).debug(localObject2);
    }
    for (;;)
    {
      return;
      CookieStore localCookieStore = ((HttpClientContext)localObject1).getCookieStore();
      if (localCookieStore == null)
      {
        localObject1 = this.log;
        localObject2 = "Cookie store not specified in HTTP context";
        ((Log)localObject1).debug(localObject2);
      }
      else
      {
        localObject1 = ((HttpClientContext)localObject1).getCookieOrigin();
        if (localObject1 == null)
        {
          localObject1 = this.log;
          localObject2 = "Cookie origin not specified in HTTP context";
          ((Log)localObject1).debug(localObject2);
        }
        else
        {
          HeaderIterator localHeaderIterator = paramHttpResponse.headerIterator("Set-Cookie");
          processCookies(localHeaderIterator, (CookieSpec)localObject2, (CookieOrigin)localObject1, localCookieStore);
          int i = ((CookieSpec)localObject2).getVersion();
          if (i > 0)
          {
            localHeaderIterator = paramHttpResponse.headerIterator("Set-Cookie2");
            processCookies(localHeaderIterator, (CookieSpec)localObject2, (CookieOrigin)localObject1, localCookieStore);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\ResponseProcessCookies.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */