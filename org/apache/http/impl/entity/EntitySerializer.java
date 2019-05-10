package org.apache.http.impl.entity;

import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.io.ChunkedOutputStream;
import org.apache.http.impl.io.ContentLengthOutputStream;
import org.apache.http.impl.io.IdentityOutputStream;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;

public class EntitySerializer
{
  private final ContentLengthStrategy lenStrategy;
  
  public EntitySerializer(ContentLengthStrategy paramContentLengthStrategy)
  {
    ContentLengthStrategy localContentLengthStrategy = (ContentLengthStrategy)Args.notNull(paramContentLengthStrategy, "Content length strategy");
    this.lenStrategy = localContentLengthStrategy;
  }
  
  protected OutputStream doSerialize(SessionOutputBuffer paramSessionOutputBuffer, HttpMessage paramHttpMessage)
  {
    Object localObject = this.lenStrategy;
    long l1 = ((ContentLengthStrategy)localObject).determineLength(paramHttpMessage);
    long l2 = -2;
    boolean bool = l1 < l2;
    if (!bool)
    {
      localObject = new org/apache/http/impl/io/ChunkedOutputStream;
      ((ChunkedOutputStream)localObject).<init>(paramSessionOutputBuffer);
    }
    for (;;)
    {
      return (OutputStream)localObject;
      l2 = -1;
      bool = l1 < l2;
      if (!bool)
      {
        localObject = new org/apache/http/impl/io/IdentityOutputStream;
        ((IdentityOutputStream)localObject).<init>(paramSessionOutputBuffer);
      }
      else
      {
        localObject = new org/apache/http/impl/io/ContentLengthOutputStream;
        ((ContentLengthOutputStream)localObject).<init>(paramSessionOutputBuffer, l1);
      }
    }
  }
  
  public void serialize(SessionOutputBuffer paramSessionOutputBuffer, HttpMessage paramHttpMessage, HttpEntity paramHttpEntity)
  {
    Args.notNull(paramSessionOutputBuffer, "Session output buffer");
    Args.notNull(paramHttpMessage, "HTTP message");
    Args.notNull(paramHttpEntity, "HTTP entity");
    OutputStream localOutputStream = doSerialize(paramSessionOutputBuffer, paramHttpMessage);
    paramHttpEntity.writeTo(localOutputStream);
    localOutputStream.close();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\entity\EntitySerializer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */