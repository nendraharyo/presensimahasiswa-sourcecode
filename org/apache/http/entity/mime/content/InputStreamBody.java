package org.apache.http.entity.mime.content;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.ContentType;
import org.apache.http.util.Args;

public class InputStreamBody
  extends AbstractContentBody
{
  private final String filename;
  private final InputStream in;
  
  public InputStreamBody(InputStream paramInputStream, String paramString)
  {
    this(paramInputStream, localContentType, paramString);
  }
  
  public InputStreamBody(InputStream paramInputStream, String paramString1, String paramString2)
  {
    this(paramInputStream, localContentType, paramString2);
  }
  
  public InputStreamBody(InputStream paramInputStream, ContentType paramContentType)
  {
    this(paramInputStream, paramContentType, null);
  }
  
  public InputStreamBody(InputStream paramInputStream, ContentType paramContentType, String paramString)
  {
    super(paramContentType);
    Args.notNull(paramInputStream, "Input stream");
    this.in = paramInputStream;
    this.filename = paramString;
  }
  
  public long getContentLength()
  {
    return -1;
  }
  
  public String getFilename()
  {
    return this.filename;
  }
  
  public InputStream getInputStream()
  {
    return this.in;
  }
  
  public String getTransferEncoding()
  {
    return "binary";
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Object localObject1 = "Output stream";
    Args.notNull(paramOutputStream, (String)localObject1);
    int i = 4096;
    try
    {
      localObject1 = new byte[i];
      for (;;)
      {
        InputStream localInputStream = this.in;
        int j = localInputStream.read((byte[])localObject1);
        int k = -1;
        if (j == k) {
          break;
        }
        k = 0;
        paramOutputStream.write((byte[])localObject1, 0, j);
      }
      paramOutputStream.flush();
    }
    finally
    {
      this.in.close();
    }
    this.in.close();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\content\InputStreamBody.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */