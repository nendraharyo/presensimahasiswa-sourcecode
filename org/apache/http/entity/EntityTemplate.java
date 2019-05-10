package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;

public class EntityTemplate
  extends AbstractHttpEntity
{
  private final ContentProducer contentproducer;
  
  public EntityTemplate(ContentProducer paramContentProducer)
  {
    ContentProducer localContentProducer = (ContentProducer)Args.notNull(paramContentProducer, "Content producer");
    this.contentproducer = localContentProducer;
  }
  
  public InputStream getContent()
  {
    Object localObject = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject).<init>();
    writeTo((OutputStream)localObject);
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localObject = ((ByteArrayOutputStream)localObject).toByteArray();
    localByteArrayInputStream.<init>((byte[])localObject);
    return localByteArrayInputStream;
  }
  
  public long getContentLength()
  {
    return -1;
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    return false;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Args.notNull(paramOutputStream, "Output stream");
    this.contentproducer.writeTo(paramOutputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\EntityTemplate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */