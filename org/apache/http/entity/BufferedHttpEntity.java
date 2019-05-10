package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

public class BufferedHttpEntity
  extends HttpEntityWrapper
{
  private final byte[] buffer;
  
  public BufferedHttpEntity(HttpEntity paramHttpEntity)
  {
    super(paramHttpEntity);
    boolean bool = paramHttpEntity.isRepeatable();
    byte[] arrayOfByte;
    if (bool)
    {
      long l1 = paramHttpEntity.getContentLength();
      long l2 = 0L;
      bool = l1 < l2;
      if (!bool) {}
    }
    else
    {
      arrayOfByte = EntityUtils.toByteArray(paramHttpEntity);
    }
    for (this.buffer = arrayOfByte;; this.buffer = null)
    {
      return;
      bool = false;
      arrayOfByte = null;
    }
  }
  
  public InputStream getContent()
  {
    Object localObject = this.buffer;
    if (localObject != null)
    {
      localObject = new java/io/ByteArrayInputStream;
      byte[] arrayOfByte = this.buffer;
      ((ByteArrayInputStream)localObject).<init>(arrayOfByte);
    }
    for (;;)
    {
      return (InputStream)localObject;
      localObject = super.getContent();
    }
  }
  
  public long getContentLength()
  {
    byte[] arrayOfByte = this.buffer;
    int i;
    if (arrayOfByte != null)
    {
      arrayOfByte = this.buffer;
      i = arrayOfByte.length;
    }
    for (long l = i;; l = super.getContentLength()) {
      return l;
    }
  }
  
  public boolean isChunked()
  {
    byte[] arrayOfByte = this.buffer;
    boolean bool;
    if (arrayOfByte == null)
    {
      bool = super.isChunked();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      arrayOfByte = null;
    }
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    byte[] arrayOfByte = this.buffer;
    boolean bool;
    if (arrayOfByte == null)
    {
      bool = super.isStreaming();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      arrayOfByte = null;
    }
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Args.notNull(paramOutputStream, "Output stream");
    byte[] arrayOfByte = this.buffer;
    if (arrayOfByte != null)
    {
      arrayOfByte = this.buffer;
      paramOutputStream.write(arrayOfByte);
    }
    for (;;)
    {
      return;
      super.writeTo(paramOutputStream);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\BufferedHttpEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */