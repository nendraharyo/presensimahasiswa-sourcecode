package org.apache.http.entity.mime;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.content.AbstractContentBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.util.Args;

public class FormBodyPart
{
  private final ContentBody body;
  private final Header header;
  private final String name;
  
  public FormBodyPart(String paramString, ContentBody paramContentBody)
  {
    Args.notNull(paramString, "Name");
    Args.notNull(paramContentBody, "Body");
    this.name = paramString;
    this.body = paramContentBody;
    Header localHeader = new org/apache/http/entity/mime/Header;
    localHeader.<init>();
    this.header = localHeader;
    generateContentDisp(paramContentBody);
    generateContentType(paramContentBody);
    generateTransferEncoding(paramContentBody);
  }
  
  public void addField(String paramString1, String paramString2)
  {
    Args.notNull(paramString1, "Field name");
    Header localHeader = this.header;
    MinimalField localMinimalField = new org/apache/http/entity/mime/MinimalField;
    localMinimalField.<init>(paramString1, paramString2);
    localHeader.addField(localMinimalField);
  }
  
  protected void generateContentDisp(ContentBody paramContentBody)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("form-data; name=\"");
    String str = getName();
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append("\"");
    str = paramContentBody.getFilename();
    if (str != null)
    {
      ((StringBuilder)localObject).append("; filename=\"");
      str = paramContentBody.getFilename();
      ((StringBuilder)localObject).append(str);
      str = "\"";
      ((StringBuilder)localObject).append(str);
    }
    localObject = ((StringBuilder)localObject).toString();
    addField("Content-Disposition", (String)localObject);
  }
  
  protected void generateContentType(ContentBody paramContentBody)
  {
    boolean bool = paramContentBody instanceof AbstractContentBody;
    Object localObject;
    String str;
    if (bool)
    {
      localObject = paramContentBody;
      localObject = ((AbstractContentBody)paramContentBody).getContentType();
      if (localObject == null) {
        break label47;
      }
      str = "Content-Type";
      localObject = ((ContentType)localObject).toString();
      addField(str, (String)localObject);
    }
    for (;;)
    {
      return;
      bool = false;
      localObject = null;
      break;
      label47:
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      str = ((ContentBody)paramContentBody).getMimeType();
      ((StringBuilder)localObject).append(str);
      str = ((ContentBody)paramContentBody).getCharset();
      if (str != null)
      {
        ((StringBuilder)localObject).append("; charset=");
        str = ((ContentBody)paramContentBody).getCharset();
        ((StringBuilder)localObject).append(str);
      }
      str = "Content-Type";
      localObject = ((StringBuilder)localObject).toString();
      addField(str, (String)localObject);
    }
  }
  
  protected void generateTransferEncoding(ContentBody paramContentBody)
  {
    String str = paramContentBody.getTransferEncoding();
    addField("Content-Transfer-Encoding", str);
  }
  
  public ContentBody getBody()
  {
    return this.body;
  }
  
  public Header getHeader()
  {
    return this.header;
  }
  
  public String getName()
  {
    return this.name;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\FormBodyPart.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */