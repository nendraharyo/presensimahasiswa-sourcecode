package org.apache.http.impl.execchain;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;

class RequestEntityProxy
  implements HttpEntity
{
  private boolean consumed = false;
  private final HttpEntity original;
  
  RequestEntityProxy(HttpEntity paramHttpEntity)
  {
    this.original = paramHttpEntity;
  }
  
  static void enhance(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    HttpEntity localHttpEntity = paramHttpEntityEnclosingRequest.getEntity();
    if (localHttpEntity != null)
    {
      boolean bool = localHttpEntity.isRepeatable();
      if (!bool)
      {
        bool = isEnhanced(localHttpEntity);
        if (!bool)
        {
          RequestEntityProxy localRequestEntityProxy = new org/apache/http/impl/execchain/RequestEntityProxy;
          localRequestEntityProxy.<init>(localHttpEntity);
          paramHttpEntityEnclosingRequest.setEntity(localRequestEntityProxy);
        }
      }
    }
  }
  
  static boolean isEnhanced(HttpEntity paramHttpEntity)
  {
    return paramHttpEntity instanceof RequestEntityProxy;
  }
  
  static boolean isRepeatable(HttpRequest paramHttpRequest)
  {
    boolean bool1 = true;
    boolean bool2 = paramHttpRequest instanceof HttpEntityEnclosingRequest;
    HttpEntity localHttpEntity;
    if (bool2)
    {
      paramHttpRequest = (HttpEntityEnclosingRequest)paramHttpRequest;
      localHttpEntity = paramHttpRequest.getEntity();
      if (localHttpEntity != null)
      {
        bool2 = isEnhanced(localHttpEntity);
        if (bool2)
        {
          Object localObject = localHttpEntity;
          localObject = (RequestEntityProxy)localHttpEntity;
          bool2 = ((RequestEntityProxy)localObject).isConsumed();
          if (!bool2) {
            bool2 = bool1;
          }
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = localHttpEntity.isRepeatable();
      continue;
      bool2 = bool1;
    }
  }
  
  public void consumeContent()
  {
    this.consumed = true;
    this.original.consumeContent();
  }
  
  public InputStream getContent()
  {
    return this.original.getContent();
  }
  
  public Header getContentEncoding()
  {
    return this.original.getContentEncoding();
  }
  
  public long getContentLength()
  {
    return this.original.getContentLength();
  }
  
  public Header getContentType()
  {
    return this.original.getContentType();
  }
  
  public HttpEntity getOriginal()
  {
    return this.original;
  }
  
  public boolean isChunked()
  {
    return this.original.isChunked();
  }
  
  public boolean isConsumed()
  {
    return this.consumed;
  }
  
  public boolean isRepeatable()
  {
    return this.original.isRepeatable();
  }
  
  public boolean isStreaming()
  {
    return this.original.isStreaming();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("RequestEntityProxy{");
    HttpEntity localHttpEntity = this.original;
    localStringBuilder.append(localHttpEntity);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    this.consumed = true;
    this.original.writeTo(paramOutputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\execchain\RequestEntityProxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */