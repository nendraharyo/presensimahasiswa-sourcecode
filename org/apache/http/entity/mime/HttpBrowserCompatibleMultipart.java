package org.apache.http.entity.mime;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.http.entity.mime.content.ContentBody;

class HttpBrowserCompatibleMultipart
  extends AbstractMultipartForm
{
  private final List parts;
  
  public HttpBrowserCompatibleMultipart(String paramString1, Charset paramCharset, String paramString2, List paramList)
  {
    super(paramString1, paramCharset, paramString2);
    this.parts = paramList;
  }
  
  protected void formatMultipartHeader(FormBodyPart paramFormBodyPart, OutputStream paramOutputStream)
  {
    Object localObject1 = paramFormBodyPart.getHeader();
    Object localObject2 = ((Header)localObject1).getField("Content-Disposition");
    Charset localCharset = this.charset;
    writeField((MinimalField)localObject2, localCharset, paramOutputStream);
    localObject2 = paramFormBodyPart.getBody().getFilename();
    if (localObject2 != null)
    {
      localObject1 = ((Header)localObject1).getField("Content-Type");
      localObject2 = this.charset;
      writeField((MinimalField)localObject1, (Charset)localObject2, paramOutputStream);
    }
  }
  
  public List getBodyParts()
  {
    return this.parts;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\HttpBrowserCompatibleMultipart.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */