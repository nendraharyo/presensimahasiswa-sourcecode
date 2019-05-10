package org.apache.http.protocol;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.util.Args;

public class RequestContent
  implements HttpRequestInterceptor
{
  private final boolean overwrite;
  
  public RequestContent()
  {
    this(false);
  }
  
  public RequestContent(boolean paramBoolean)
  {
    this.overwrite = paramBoolean;
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Object localObject1 = "HTTP request";
    Args.notNull(paramHttpRequest, (String)localObject1);
    boolean bool1 = paramHttpRequest instanceof HttpEntityEnclosingRequest;
    if (bool1)
    {
      bool1 = this.overwrite;
      if (!bool1) {
        break label107;
      }
      ((HttpRequest)paramHttpRequest).removeHeaders("Transfer-Encoding");
      localObject1 = "Content-Length";
      ((HttpRequest)paramHttpRequest).removeHeaders((String)localObject1);
    }
    Object localObject2;
    label107:
    do
    {
      localObject2 = ((HttpRequest)paramHttpRequest).getRequestLine().getProtocolVersion();
      localObject1 = paramHttpRequest;
      localObject1 = ((HttpEntityEnclosingRequest)paramHttpRequest).getEntity();
      if (localObject1 != null) {
        break;
      }
      localObject1 = "Content-Length";
      localObject2 = "0";
      ((HttpRequest)paramHttpRequest).addHeader((String)localObject1, (String)localObject2);
      return;
      localObject1 = "Transfer-Encoding";
      bool1 = ((HttpRequest)paramHttpRequest).containsHeader((String)localObject1);
      if (bool1)
      {
        localObject1 = new org/apache/http/ProtocolException;
        ((ProtocolException)localObject1).<init>("Transfer-encoding header already present");
        throw ((Throwable)localObject1);
      }
      localObject1 = "Content-Length";
      bool1 = ((HttpRequest)paramHttpRequest).containsHeader((String)localObject1);
    } while (!bool1);
    localObject1 = new org/apache/http/ProtocolException;
    ((ProtocolException)localObject1).<init>("Content-Length header already present");
    throw ((Throwable)localObject1);
    boolean bool2 = ((HttpEntity)localObject1).isChunked();
    long l1;
    Object localObject3;
    if (!bool2)
    {
      l1 = ((HttpEntity)localObject1).getContentLength();
      long l2 = 0L;
      bool2 = l1 < l2;
      if (!bool2) {}
    }
    else
    {
      localObject3 = HttpVersion.HTTP_1_0;
      bool2 = ((ProtocolVersion)localObject2).lessEquals((ProtocolVersion)localObject3);
      if (bool2)
      {
        localObject1 = new org/apache/http/ProtocolException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject2 = "Chunked transfer encoding not allowed for " + localObject2;
        ((ProtocolException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject2 = "Transfer-Encoding";
      localObject3 = "chunked";
      ((HttpRequest)paramHttpRequest).addHeader((String)localObject2, (String)localObject3);
    }
    for (;;)
    {
      localObject2 = ((HttpEntity)localObject1).getContentType();
      if (localObject2 != null)
      {
        localObject2 = "Content-Type";
        bool3 = ((HttpRequest)paramHttpRequest).containsHeader((String)localObject2);
        if (!bool3)
        {
          localObject2 = ((HttpEntity)localObject1).getContentType();
          ((HttpRequest)paramHttpRequest).addHeader((Header)localObject2);
        }
      }
      localObject2 = ((HttpEntity)localObject1).getContentEncoding();
      if (localObject2 == null) {
        break;
      }
      localObject2 = "Content-Encoding";
      boolean bool3 = ((HttpRequest)paramHttpRequest).containsHeader((String)localObject2);
      if (bool3) {
        break;
      }
      localObject1 = ((HttpEntity)localObject1).getContentEncoding();
      ((HttpRequest)paramHttpRequest).addHeader((Header)localObject1);
      break;
      localObject2 = "Content-Length";
      l1 = ((HttpEntity)localObject1).getContentLength();
      localObject3 = Long.toString(l1);
      ((HttpRequest)paramHttpRequest).addHeader((String)localObject2, (String)localObject3);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\RequestContent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */