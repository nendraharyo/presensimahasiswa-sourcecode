package org.apache.http.impl.entity;

import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.io.ChunkedInputStream;
import org.apache.http.impl.io.ContentLengthInputStream;
import org.apache.http.impl.io.IdentityInputStream;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;

public class EntityDeserializer
{
  private final ContentLengthStrategy lenStrategy;
  
  public EntityDeserializer(ContentLengthStrategy paramContentLengthStrategy)
  {
    ContentLengthStrategy localContentLengthStrategy = (ContentLengthStrategy)Args.notNull(paramContentLengthStrategy, "Content length strategy");
    this.lenStrategy = localContentLengthStrategy;
  }
  
  public HttpEntity deserialize(SessionInputBuffer paramSessionInputBuffer, HttpMessage paramHttpMessage)
  {
    Args.notNull(paramSessionInputBuffer, "Session input buffer");
    Args.notNull(paramHttpMessage, "HTTP message");
    return doDeserialize(paramSessionInputBuffer, paramHttpMessage);
  }
  
  protected BasicHttpEntity doDeserialize(SessionInputBuffer paramSessionInputBuffer, HttpMessage paramHttpMessage)
  {
    long l1 = -1;
    BasicHttpEntity localBasicHttpEntity = new org/apache/http/entity/BasicHttpEntity;
    localBasicHttpEntity.<init>();
    Object localObject = this.lenStrategy;
    long l2 = ((ContentLengthStrategy)localObject).determineLength(paramHttpMessage);
    long l3 = -2;
    boolean bool = l2 < l3;
    if (!bool)
    {
      bool = true;
      localBasicHttpEntity.setChunked(bool);
      localBasicHttpEntity.setContentLength(l1);
      localObject = new org/apache/http/impl/io/ChunkedInputStream;
      ((ChunkedInputStream)localObject).<init>(paramSessionInputBuffer);
      localBasicHttpEntity.setContent((InputStream)localObject);
    }
    for (;;)
    {
      localObject = paramHttpMessage.getFirstHeader("Content-Type");
      if (localObject != null) {
        localBasicHttpEntity.setContentType((Header)localObject);
      }
      localObject = paramHttpMessage.getFirstHeader("Content-Encoding");
      if (localObject != null) {
        localBasicHttpEntity.setContentEncoding((Header)localObject);
      }
      return localBasicHttpEntity;
      bool = l2 < l1;
      if (!bool)
      {
        localBasicHttpEntity.setChunked(false);
        localBasicHttpEntity.setContentLength(l1);
        localObject = new org/apache/http/impl/io/IdentityInputStream;
        ((IdentityInputStream)localObject).<init>(paramSessionInputBuffer);
        localBasicHttpEntity.setContent((InputStream)localObject);
      }
      else
      {
        localBasicHttpEntity.setChunked(false);
        localBasicHttpEntity.setContentLength(l2);
        localObject = new org/apache/http/impl/io/ContentLengthInputStream;
        ((ContentLengthInputStream)localObject).<init>(paramSessionInputBuffer, l2);
        localBasicHttpEntity.setContent((InputStream)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\entity\EntityDeserializer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */