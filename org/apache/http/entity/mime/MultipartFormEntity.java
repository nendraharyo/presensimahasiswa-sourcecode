package org.apache.http.entity.mime;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

class MultipartFormEntity
  implements HttpEntity
{
  private final long contentLength;
  private final Header contentType;
  private final AbstractMultipartForm multipart;
  
  MultipartFormEntity(AbstractMultipartForm paramAbstractMultipartForm, String paramString, long paramLong)
  {
    this.multipart = paramAbstractMultipartForm;
    BasicHeader localBasicHeader = new org/apache/http/message/BasicHeader;
    localBasicHeader.<init>("Content-Type", paramString);
    this.contentType = localBasicHeader;
    this.contentLength = paramLong;
  }
  
  public void consumeContent()
  {
    boolean bool = isStreaming();
    if (bool)
    {
      UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localUnsupportedOperationException.<init>("Streaming entity does not implement #consumeContent()");
      throw localUnsupportedOperationException;
    }
  }
  
  public InputStream getContent()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Multipart form entity does not implement #getContent()");
    throw localUnsupportedOperationException;
  }
  
  public Header getContentEncoding()
  {
    return null;
  }
  
  public long getContentLength()
  {
    return this.contentLength;
  }
  
  public Header getContentType()
  {
    return this.contentType;
  }
  
  AbstractMultipartForm getMultipart()
  {
    return this.multipart;
  }
  
  public boolean isChunked()
  {
    boolean bool = isRepeatable();
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isRepeatable()
  {
    long l1 = this.contentLength;
    long l2 = -1;
    boolean bool = l1 < l2;
    if (bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isStreaming()
  {
    boolean bool = isRepeatable();
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    this.multipart.writeTo(paramOutputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\MultipartFormEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */