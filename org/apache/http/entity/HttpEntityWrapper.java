package org.apache.http.entity;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.util.Args;

public class HttpEntityWrapper
  implements HttpEntity
{
  protected HttpEntity wrappedEntity;
  
  public HttpEntityWrapper(HttpEntity paramHttpEntity)
  {
    HttpEntity localHttpEntity = (HttpEntity)Args.notNull(paramHttpEntity, "Wrapped entity");
    this.wrappedEntity = localHttpEntity;
  }
  
  public void consumeContent()
  {
    this.wrappedEntity.consumeContent();
  }
  
  public InputStream getContent()
  {
    return this.wrappedEntity.getContent();
  }
  
  public Header getContentEncoding()
  {
    return this.wrappedEntity.getContentEncoding();
  }
  
  public long getContentLength()
  {
    return this.wrappedEntity.getContentLength();
  }
  
  public Header getContentType()
  {
    return this.wrappedEntity.getContentType();
  }
  
  public boolean isChunked()
  {
    return this.wrappedEntity.isChunked();
  }
  
  public boolean isRepeatable()
  {
    return this.wrappedEntity.isRepeatable();
  }
  
  public boolean isStreaming()
  {
    return this.wrappedEntity.isStreaming();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    this.wrappedEntity.writeTo(paramOutputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\HttpEntityWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */