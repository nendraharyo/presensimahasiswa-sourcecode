package org.apache.http.client.entity;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.util.Args;

abstract class DecompressingEntity
  extends HttpEntityWrapper
{
  private static final int BUFFER_SIZE = 2048;
  private InputStream content;
  
  public DecompressingEntity(HttpEntity paramHttpEntity)
  {
    super(paramHttpEntity);
  }
  
  private InputStream getDecompressingStream()
  {
    InputStream localInputStream = this.wrappedEntity.getContent();
    LazyDecompressingInputStream localLazyDecompressingInputStream = new org/apache/http/client/entity/LazyDecompressingInputStream;
    localLazyDecompressingInputStream.<init>(localInputStream, this);
    return localLazyDecompressingInputStream;
  }
  
  abstract InputStream decorate(InputStream paramInputStream);
  
  public InputStream getContent()
  {
    Object localObject = this.wrappedEntity;
    boolean bool = ((HttpEntity)localObject).isStreaming();
    if (bool)
    {
      localObject = this.content;
      if (localObject == null)
      {
        localObject = getDecompressingStream();
        this.content = ((InputStream)localObject);
      }
    }
    for (localObject = this.content;; localObject = getDecompressingStream()) {
      return (InputStream)localObject;
    }
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Object localObject1 = "Output stream";
    Args.notNull(paramOutputStream, (String)localObject1);
    InputStream localInputStream = getContent();
    int i = 2048;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\entity\DecompressingEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */