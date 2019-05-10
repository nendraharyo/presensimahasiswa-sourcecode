package org.apache.http.entity;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class BasicHttpEntity
  extends AbstractHttpEntity
{
  private InputStream content;
  private long length = -1;
  
  public InputStream getContent()
  {
    InputStream localInputStream = this.content;
    boolean bool;
    if (localInputStream != null) {
      bool = true;
    }
    for (;;)
    {
      Asserts.check(bool, "Content has not been provided");
      return this.content;
      bool = false;
      localInputStream = null;
    }
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
    InputStream localInputStream = this.content;
    boolean bool;
    if (localInputStream != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localInputStream = null;
    }
  }
  
  public void setContent(InputStream paramInputStream)
  {
    this.content = paramInputStream;
  }
  
  public void setContentLength(long paramLong)
  {
    this.length = paramLong;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Object localObject1 = "Output stream";
    Args.notNull(paramOutputStream, (String)localObject1);
    InputStream localInputStream = getContent();
    int i = 4096;
    try
    {
      localObject1 = new byte[i];
      for (;;)
      {
        int j = localInputStream.read((byte[])localObject1);
        int k = -1;
        if (j == k) {
          break;
        }
        k = 0;
        paramOutputStream.write((byte[])localObject1, 0, j);
      }
    }
    finally
    {
      localInputStream.close();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\BasicHttpEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */