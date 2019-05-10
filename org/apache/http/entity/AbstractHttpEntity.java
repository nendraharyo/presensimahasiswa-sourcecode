package org.apache.http.entity;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

public abstract class AbstractHttpEntity
  implements HttpEntity
{
  protected static final int OUTPUT_BUFFER_SIZE = 4096;
  protected boolean chunked;
  protected Header contentEncoding;
  protected Header contentType;
  
  public void consumeContent() {}
  
  public Header getContentEncoding()
  {
    return this.contentEncoding;
  }
  
  public Header getContentType()
  {
    return this.contentType;
  }
  
  public boolean isChunked()
  {
    return this.chunked;
  }
  
  public void setChunked(boolean paramBoolean)
  {
    this.chunked = paramBoolean;
  }
  
  public void setContentEncoding(String paramString)
  {
    BasicHeader localBasicHeader = null;
    if (paramString != null)
    {
      localBasicHeader = new org/apache/http/message/BasicHeader;
      String str = "Content-Encoding";
      localBasicHeader.<init>(str, paramString);
    }
    setContentEncoding(localBasicHeader);
  }
  
  public void setContentEncoding(Header paramHeader)
  {
    this.contentEncoding = paramHeader;
  }
  
  public void setContentType(String paramString)
  {
    BasicHeader localBasicHeader = null;
    if (paramString != null)
    {
      localBasicHeader = new org/apache/http/message/BasicHeader;
      String str = "Content-Type";
      localBasicHeader.<init>(str, paramString);
    }
    setContentType(localBasicHeader);
  }
  
  public void setContentType(Header paramHeader)
  {
    this.contentType = paramHeader;
  }
  
  public String toString()
  {
    char c1 = ',';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    char c2 = '[';
    localStringBuilder.append(c2);
    Object localObject = this.contentType;
    if (localObject != null)
    {
      localStringBuilder.append("Content-Type: ");
      localObject = this.contentType.getValue();
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(c1);
    }
    localObject = this.contentEncoding;
    if (localObject != null)
    {
      localStringBuilder.append("Content-Encoding: ");
      localObject = this.contentEncoding.getValue();
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(c1);
    }
    long l1 = getContentLength();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      localObject = "Content-Length: ";
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(l1);
      localStringBuilder.append(c1);
    }
    localStringBuilder.append("Chunked: ");
    bool = this.chunked;
    localStringBuilder.append(bool);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\AbstractHttpEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */