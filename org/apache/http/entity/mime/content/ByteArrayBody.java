package org.apache.http.entity.mime.content;

import java.io.OutputStream;
import org.apache.http.entity.ContentType;
import org.apache.http.util.Args;

public class ByteArrayBody
  extends AbstractContentBody
{
  private final byte[] data;
  private final String filename;
  
  public ByteArrayBody(byte[] paramArrayOfByte, String paramString)
  {
    this(paramArrayOfByte, "application/octet-stream", paramString);
  }
  
  public ByteArrayBody(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    this(paramArrayOfByte, localContentType, paramString2);
  }
  
  public ByteArrayBody(byte[] paramArrayOfByte, ContentType paramContentType, String paramString)
  {
    super(paramContentType);
    Args.notNull(paramArrayOfByte, "byte[]");
    this.data = paramArrayOfByte;
    this.filename = paramString;
  }
  
  public String getCharset()
  {
    return null;
  }
  
  public long getContentLength()
  {
    return this.data.length;
  }
  
  public String getFilename()
  {
    return this.filename;
  }
  
  public String getTransferEncoding()
  {
    return "binary";
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = this.data;
    paramOutputStream.write(arrayOfByte);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\content\ByteArrayBody.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */