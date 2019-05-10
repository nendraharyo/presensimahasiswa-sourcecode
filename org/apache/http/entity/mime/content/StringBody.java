package org.apache.http.entity.mime.content;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.http.Consts;
import org.apache.http.entity.ContentType;
import org.apache.http.util.Args;

public class StringBody
  extends AbstractContentBody
{
  private final byte[] content;
  
  public StringBody(String paramString)
  {
    this(paramString, "text/plain", localCharset);
  }
  
  public StringBody(String paramString1, String paramString2, Charset paramCharset)
  {
    this(paramString1, localContentType);
  }
  
  public StringBody(String paramString, Charset paramCharset)
  {
    this(paramString, "text/plain", paramCharset);
  }
  
  public StringBody(String paramString, ContentType paramContentType)
  {
    super(paramContentType);
    Args.notNull(paramString, "Text");
    localObject = paramContentType.getCharset();
    if (localObject != null) {}
    for (localObject = ((Charset)localObject).name();; localObject = Consts.ASCII.name()) {
      try
      {
        byte[] arrayOfByte = paramString.getBytes((String)localObject);
        this.content = arrayOfByte;
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        UnsupportedCharsetException localUnsupportedCharsetException = new java/nio/charset/UnsupportedCharsetException;
        localUnsupportedCharsetException.<init>((String)localObject);
        throw localUnsupportedCharsetException;
      }
    }
  }
  
  public static StringBody create(String paramString)
  {
    return create(paramString, null, null);
  }
  
  public static StringBody create(String paramString1, String paramString2, Charset paramCharset)
  {
    try
    {
      StringBody localStringBody = new org/apache/http/entity/mime/content/StringBody;
      localStringBody.<init>(paramString1, paramString2, paramCharset);
      return localStringBody;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Charset " + paramCharset + " is not supported";
      localIllegalArgumentException.<init>((String)localObject, localUnsupportedEncodingException);
      throw localIllegalArgumentException;
    }
  }
  
  public static StringBody create(String paramString, Charset paramCharset)
  {
    return create(paramString, null, paramCharset);
  }
  
  public long getContentLength()
  {
    return this.content.length;
  }
  
  public String getFilename()
  {
    return null;
  }
  
  public Reader getReader()
  {
    Charset localCharset = getContentType().getCharset();
    InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    byte[] arrayOfByte = this.content;
    localByteArrayInputStream.<init>(arrayOfByte);
    if (localCharset != null) {}
    for (;;)
    {
      localInputStreamReader.<init>(localByteArrayInputStream, localCharset);
      return localInputStreamReader;
      localCharset = Consts.ASCII;
    }
  }
  
  public String getTransferEncoding()
  {
    return "8bit";
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Args.notNull(paramOutputStream, "Output stream");
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    byte[] arrayOfByte = this.content;
    localByteArrayInputStream.<init>(arrayOfByte);
    int i = 4096;
    arrayOfByte = new byte[i];
    for (;;)
    {
      int j = localByteArrayInputStream.read(arrayOfByte);
      int k = -1;
      if (j == k) {
        break;
      }
      k = 0;
      paramOutputStream.write(arrayOfByte, 0, j);
    }
    paramOutputStream.flush();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\content\StringBody.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */