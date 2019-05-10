package org.apache.http.entity;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;

public class InputStreamEntity
  extends AbstractHttpEntity
{
  private final InputStream content;
  private final long length;
  
  public InputStreamEntity(InputStream paramInputStream)
  {
    this(paramInputStream, -1);
  }
  
  public InputStreamEntity(InputStream paramInputStream, long paramLong)
  {
    this(paramInputStream, paramLong, null);
  }
  
  public InputStreamEntity(InputStream paramInputStream, long paramLong, ContentType paramContentType)
  {
    Object localObject = (InputStream)Args.notNull(paramInputStream, "Source input stream");
    this.content = ((InputStream)localObject);
    this.length = paramLong;
    if (paramContentType != null)
    {
      localObject = paramContentType.toString();
      setContentType((String)localObject);
    }
  }
  
  public InputStreamEntity(InputStream paramInputStream, ContentType paramContentType)
  {
    this(paramInputStream, -1, paramContentType);
  }
  
  public InputStream getContent()
  {
    return this.content;
  }
  
  public long getContentLength()
  {
    return this.length;
  }
  
  public boolean isRepeatable()
  {
    return false;
  }
  
  public boolean isStreaming()
  {
    return true;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    long l1 = 0L;
    int i = -1;
    String str = "Output stream";
    Args.notNull(paramOutputStream, str);
    InputStream localInputStream = this.content;
    int j = 4096;
    byte[] arrayOfByte;
    long l2;
    try
    {
      arrayOfByte = new byte[j];
      l2 = this.length;
      boolean bool1 = l2 < l1;
      if (bool1) {
        for (;;)
        {
          int k = localInputStream.read(arrayOfByte);
          if (k == i) {
            break;
          }
          paramOutputStream.write(arrayOfByte, 0, k);
        }
      }
      l2 = this.length;
    }
    finally
    {
      localInputStream.close();
    }
    for (;;)
    {
      boolean bool2 = l2 < l1;
      int m;
      if (bool2)
      {
        bool2 = false;
        long l3 = 4096L;
        l3 = Math.min(l3, l2);
        n = (int)l3;
        m = localInputStream.read(arrayOfByte, 0, n);
        if (m != i) {}
      }
      else
      {
        localInputStream.close();
        return;
      }
      int n = 0;
      paramOutputStream.write(arrayOfByte, 0, m);
      long l4 = m;
      l2 -= l4;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\InputStreamEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */