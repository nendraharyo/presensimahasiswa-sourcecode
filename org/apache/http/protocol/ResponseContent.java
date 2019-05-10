package org.apache.http.protocol;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.util.Args;

public class ResponseContent
  implements HttpResponseInterceptor
{
  private final boolean overwrite;
  
  public ResponseContent()
  {
    this(false);
  }
  
  public ResponseContent(boolean paramBoolean)
  {
    this.overwrite = paramBoolean;
  }
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Object localObject1 = "HTTP response";
    Args.notNull(paramHttpResponse, (String)localObject1);
    boolean bool1 = this.overwrite;
    Object localObject2;
    long l1;
    String str;
    if (bool1)
    {
      paramHttpResponse.removeHeaders("Transfer-Encoding");
      localObject1 = "Content-Length";
      paramHttpResponse.removeHeaders((String)localObject1);
      localObject1 = paramHttpResponse.getStatusLine().getProtocolVersion();
      localObject2 = paramHttpResponse.getEntity();
      if (localObject2 == null) {
        break label313;
      }
      l1 = ((HttpEntity)localObject2).getContentLength();
      boolean bool2 = ((HttpEntity)localObject2).isChunked();
      if (!bool2) {
        break label267;
      }
      HttpVersion localHttpVersion = HttpVersion.HTTP_1_0;
      bool1 = ((ProtocolVersion)localObject1).lessEquals(localHttpVersion);
      if (bool1) {
        break label267;
      }
      localObject1 = "Transfer-Encoding";
      str = "chunked";
      paramHttpResponse.addHeader((String)localObject1, str);
      label120:
      localObject1 = ((HttpEntity)localObject2).getContentType();
      if (localObject1 != null)
      {
        localObject1 = "Content-Type";
        bool1 = paramHttpResponse.containsHeader((String)localObject1);
        if (!bool1)
        {
          localObject1 = ((HttpEntity)localObject2).getContentType();
          paramHttpResponse.addHeader((Header)localObject1);
        }
      }
      localObject1 = ((HttpEntity)localObject2).getContentEncoding();
      if (localObject1 != null)
      {
        localObject1 = "Content-Encoding";
        bool1 = paramHttpResponse.containsHeader((String)localObject1);
        if (!bool1)
        {
          localObject1 = ((HttpEntity)localObject2).getContentEncoding();
          paramHttpResponse.addHeader((Header)localObject1);
        }
      }
    }
    for (;;)
    {
      return;
      localObject1 = "Transfer-Encoding";
      bool1 = paramHttpResponse.containsHeader((String)localObject1);
      if (bool1)
      {
        localObject1 = new org/apache/http/ProtocolException;
        ((ProtocolException)localObject1).<init>("Transfer-encoding header already present");
        throw ((Throwable)localObject1);
      }
      localObject1 = "Content-Length";
      bool1 = paramHttpResponse.containsHeader((String)localObject1);
      if (!bool1) {
        break;
      }
      localObject1 = new org/apache/http/ProtocolException;
      ((ProtocolException)localObject1).<init>("Content-Length header already present");
      throw ((Throwable)localObject1);
      label267:
      long l2 = 0L;
      bool1 = l1 < l2;
      if (bool1) {
        break label120;
      }
      localObject1 = "Content-Length";
      l1 = ((HttpEntity)localObject2).getContentLength();
      str = Long.toString(l1);
      paramHttpResponse.addHeader((String)localObject1, str);
      break label120;
      label313:
      localObject1 = paramHttpResponse.getStatusLine();
      int i = ((StatusLine)localObject1).getStatusCode();
      int j = 204;
      if (i != j)
      {
        j = 304;
        if (i != j)
        {
          j = 205;
          if (i != j)
          {
            localObject1 = "Content-Length";
            localObject2 = "0";
            paramHttpResponse.addHeader((String)localObject1, (String)localObject2);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\ResponseContent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */