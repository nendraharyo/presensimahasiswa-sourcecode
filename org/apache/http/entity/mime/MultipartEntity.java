package org.apache.http.entity.mime;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.content.ContentBody;

public class MultipartEntity
  implements HttpEntity
{
  private static final char[] MULTIPART_CHARS = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  private final MultipartEntityBuilder builder;
  private volatile MultipartFormEntity entity;
  
  public MultipartEntity()
  {
    this(localHttpMultipartMode, null, null);
  }
  
  public MultipartEntity(HttpMultipartMode paramHttpMultipartMode)
  {
    this(paramHttpMultipartMode, null, null);
  }
  
  public MultipartEntity(HttpMultipartMode paramHttpMultipartMode, String paramString, Charset paramCharset)
  {
    MultipartEntityBuilder localMultipartEntityBuilder = new org/apache/http/entity/mime/MultipartEntityBuilder;
    localMultipartEntityBuilder.<init>();
    localMultipartEntityBuilder = localMultipartEntityBuilder.setMode(paramHttpMultipartMode).setCharset(paramCharset).setBoundary(paramString);
    this.builder = localMultipartEntityBuilder;
    this.entity = null;
  }
  
  private MultipartFormEntity getEntity()
  {
    MultipartFormEntity localMultipartFormEntity = this.entity;
    if (localMultipartFormEntity == null)
    {
      localMultipartFormEntity = this.builder.buildEntity();
      this.entity = localMultipartFormEntity;
    }
    return this.entity;
  }
  
  public void addPart(String paramString, ContentBody paramContentBody)
  {
    FormBodyPart localFormBodyPart = new org/apache/http/entity/mime/FormBodyPart;
    localFormBodyPart.<init>(paramString, paramContentBody);
    addPart(localFormBodyPart);
  }
  
  public void addPart(FormBodyPart paramFormBodyPart)
  {
    this.builder.addPart(paramFormBodyPart);
    this.entity = null;
  }
  
  public void consumeContent()
  {
    boolean bool = isStreaming();
    if (bool)
    {
      UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localUnsupportedOperationException.<init>("Streaming entity does not implement #consumeContent()");
      throw localUnsupportedOperationException;
    }
  }
  
  protected String generateBoundary()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Random localRandom = new java/util/Random;
    localRandom.<init>();
    int i = localRandom.nextInt(11) + 30;
    int j = 0;
    while (j < i)
    {
      char[] arrayOfChar1 = MULTIPART_CHARS;
      char[] arrayOfChar2 = MULTIPART_CHARS;
      int k = arrayOfChar2.length;
      k = localRandom.nextInt(k);
      char c = arrayOfChar1[k];
      localStringBuilder.append(c);
      j += 1;
    }
    return localStringBuilder.toString();
  }
  
  protected String generateContentType(String paramString, Charset paramCharset)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = "multipart/form-data; boundary=";
    localStringBuilder.append(str);
    localStringBuilder.append(paramString);
    if (paramCharset != null)
    {
      localStringBuilder.append("; charset=");
      str = paramCharset.name();
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
  
  public InputStream getContent()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Multipart form entity does not implement #getContent()");
    throw localUnsupportedOperationException;
  }
  
  public Header getContentEncoding()
  {
    return getEntity().getContentEncoding();
  }
  
  public long getContentLength()
  {
    return getEntity().getContentLength();
  }
  
  public Header getContentType()
  {
    return getEntity().getContentType();
  }
  
  public boolean isChunked()
  {
    return getEntity().isChunked();
  }
  
  public boolean isRepeatable()
  {
    return getEntity().isRepeatable();
  }
  
  public boolean isStreaming()
  {
    return getEntity().isStreaming();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    getEntity().writeTo(paramOutputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\MultipartEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */