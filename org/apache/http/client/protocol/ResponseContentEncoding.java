package org.apache.http.client.protocol;

import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.entity.DeflateDecompressingEntity;
import org.apache.http.client.entity.GzipDecompressingEntity;
import org.apache.http.protocol.HttpContext;

public class ResponseContentEncoding
  implements HttpResponseInterceptor
{
  public static final String UNCOMPRESSED = "http.client.response.uncompressed";
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    Object localObject2 = paramHttpResponse.getEntity();
    Object localObject3;
    boolean bool3;
    if (localObject2 != null)
    {
      long l1 = ((HttpEntity)localObject2).getContentLength();
      long l2 = 0L;
      boolean bool2 = l1 < l2;
      if (bool2)
      {
        localObject2 = ((HttpEntity)localObject2).getContentEncoding();
        if (localObject2 != null)
        {
          localObject2 = ((Header)localObject2).getElements();
          int i = localObject2.length;
          if (0 >= i) {
            break label322;
          }
          localObject1 = localObject2[0];
          localObject2 = ((HeaderElement)localObject1).getName();
          localObject3 = Locale.ENGLISH;
          localObject2 = ((String)localObject2).toLowerCase((Locale)localObject3);
          localObject3 = "gzip";
          bool3 = ((String)localObject3).equals(localObject2);
          if (!bool3)
          {
            localObject3 = "x-gzip";
            bool3 = ((String)localObject3).equals(localObject2);
            if (!bool3) {
              break label202;
            }
          }
          localObject1 = new org/apache/http/client/entity/GzipDecompressingEntity;
          localObject2 = paramHttpResponse.getEntity();
          ((GzipDecompressingEntity)localObject1).<init>((HttpEntity)localObject2);
          paramHttpResponse.setEntity((HttpEntity)localObject1);
        }
      }
    }
    for (;;)
    {
      if (bool1)
      {
        paramHttpResponse.removeHeaders("Content-Length");
        paramHttpResponse.removeHeaders("Content-Encoding");
        localObject4 = "Content-MD5";
        paramHttpResponse.removeHeaders((String)localObject4);
      }
      label202:
      do
      {
        return;
        localObject3 = "deflate";
        bool3 = ((String)localObject3).equals(localObject2);
        if (bool3)
        {
          localObject1 = new org/apache/http/client/entity/DeflateDecompressingEntity;
          localObject2 = paramHttpResponse.getEntity();
          ((DeflateDecompressingEntity)localObject1).<init>((HttpEntity)localObject2);
          paramHttpResponse.setEntity((HttpEntity)localObject1);
          break;
        }
        localObject4 = "identity";
        bool1 = ((String)localObject4).equals(localObject2);
      } while (bool1);
      Object localObject4 = new org/apache/http/HttpException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unsupported Content-Coding: ");
      localObject1 = ((HeaderElement)localObject1).getName();
      localObject1 = (String)localObject1;
      ((HttpException)localObject4).<init>((String)localObject1);
      throw ((Throwable)localObject4);
      label322:
      bool1 = false;
      localObject4 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\ResponseContentEncoding.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */