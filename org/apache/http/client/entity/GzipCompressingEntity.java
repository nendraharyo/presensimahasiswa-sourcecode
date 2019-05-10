package org.apache.http.client.entity;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.Args;

public class GzipCompressingEntity
  extends HttpEntityWrapper
{
  private static final String GZIP_CODEC = "gzip";
  
  public GzipCompressingEntity(HttpEntity paramHttpEntity)
  {
    super(paramHttpEntity);
  }
  
  public InputStream getContent()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public Header getContentEncoding()
  {
    BasicHeader localBasicHeader = new org/apache/http/message/BasicHeader;
    localBasicHeader.<init>("Content-Encoding", "gzip");
    return localBasicHeader;
  }
  
  public long getContentLength()
  {
    return -1;
  }
  
  public boolean isChunked()
  {
    return true;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Args.notNull(paramOutputStream, "Output stream");
    GZIPOutputStream localGZIPOutputStream = new java/util/zip/GZIPOutputStream;
    localGZIPOutputStream.<init>(paramOutputStream);
    this.wrappedEntity.writeTo(localGZIPOutputStream);
    localGZIPOutputStream.close();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\entity\GzipCompressingEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */