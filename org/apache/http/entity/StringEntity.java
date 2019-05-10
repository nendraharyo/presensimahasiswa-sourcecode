package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

public class StringEntity
  extends AbstractHttpEntity
  implements Cloneable
{
  protected final byte[] content;
  
  public StringEntity(String paramString)
  {
    this(paramString, localContentType);
  }
  
  public StringEntity(String paramString1, String paramString2)
  {
    this(paramString1, localContentType);
  }
  
  public StringEntity(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = "Source string";
    Args.notNull(paramString1, (String)localObject);
    if (paramString2 != null) {
      if (paramString3 == null) {
        break label79;
      }
    }
    for (;;)
    {
      localObject = paramString1.getBytes(paramString3);
      this.content = ((byte[])localObject);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString2 + "; charset=" + paramString3;
      setContentType((String)localObject);
      return;
      paramString2 = "text/plain";
      break;
      label79:
      paramString3 = "ISO-8859-1";
    }
  }
  
  public StringEntity(String paramString, Charset paramCharset)
  {
    this(paramString, localContentType);
  }
  
  public StringEntity(String paramString, ContentType paramContentType)
  {
    localObject1 = "Source string";
    Args.notNull(paramString, (String)localObject1);
    if (paramContentType != null) {}
    for (localObject1 = paramContentType.getCharset();; localObject1 = null)
    {
      if (localObject1 == null) {
        localObject1 = HTTP.DEF_CONTENT_CHARSET;
      }
      try
      {
        Object localObject2 = ((Charset)localObject1).name();
        localObject2 = paramString.getBytes((String)localObject2);
        this.content = ((byte[])localObject2);
        if (paramContentType != null)
        {
          localObject1 = paramContentType.toString();
          setContentType((String)localObject1);
        }
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        UnsupportedCharsetException localUnsupportedCharsetException = new java/nio/charset/UnsupportedCharsetException;
        localObject1 = ((Charset)localObject1).name();
        localUnsupportedCharsetException.<init>((String)localObject1);
        throw localUnsupportedCharsetException;
      }
    }
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public InputStream getContent()
  {
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    byte[] arrayOfByte = this.content;
    localByteArrayInputStream.<init>(arrayOfByte);
    return localByteArrayInputStream;
  }
  
  public long getContentLength()
  {
    return this.content.length;
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
    byte[] arrayOfByte = this.content;
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.flush();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\StringEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */