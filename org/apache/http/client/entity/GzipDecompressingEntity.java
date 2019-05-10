package org.apache.http.client.entity;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public class GzipDecompressingEntity
  extends DecompressingEntity
{
  public GzipDecompressingEntity(HttpEntity paramHttpEntity)
  {
    super(paramHttpEntity);
  }
  
  InputStream decorate(InputStream paramInputStream)
  {
    GZIPInputStream localGZIPInputStream = new java/util/zip/GZIPInputStream;
    localGZIPInputStream.<init>(paramInputStream);
    return localGZIPInputStream;
  }
  
  public Header getContentEncoding()
  {
    return null;
  }
  
  public long getContentLength()
  {
    return -1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\entity\GzipDecompressingEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */