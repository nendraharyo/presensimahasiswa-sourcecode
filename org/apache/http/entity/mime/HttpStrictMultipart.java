package org.apache.http.entity.mime;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

class HttpStrictMultipart
  extends AbstractMultipartForm
{
  private final List parts;
  
  public HttpStrictMultipart(String paramString1, Charset paramCharset, String paramString2, List paramList)
  {
    super(paramString1, paramCharset, paramString2);
    this.parts = paramList;
  }
  
  protected void formatMultipartHeader(FormBodyPart paramFormBodyPart, OutputStream paramOutputStream)
  {
    Object localObject = paramFormBodyPart.getHeader();
    Iterator localIterator = ((Header)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (MinimalField)localIterator.next();
      writeField((MinimalField)localObject, paramOutputStream);
    }
  }
  
  public List getBodyParts()
  {
    return this.parts;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\HttpStrictMultipart.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */