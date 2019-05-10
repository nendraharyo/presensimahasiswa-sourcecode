package org.apache.http.entity.mime.content;

import java.nio.charset.Charset;
import org.apache.http.entity.ContentType;
import org.apache.http.util.Args;

public abstract class AbstractContentBody
  implements ContentBody
{
  private final ContentType contentType;
  
  public AbstractContentBody(String paramString)
  {
    this(localContentType);
  }
  
  public AbstractContentBody(ContentType paramContentType)
  {
    Args.notNull(paramContentType, "Content type");
    this.contentType = paramContentType;
  }
  
  public String getCharset()
  {
    Object localObject = this.contentType.getCharset();
    if (localObject != null) {}
    for (localObject = ((Charset)localObject).name();; localObject = null) {
      return (String)localObject;
    }
  }
  
  public ContentType getContentType()
  {
    return this.contentType;
  }
  
  public String getMediaType()
  {
    String str = this.contentType.getMimeType();
    int i = str.indexOf('/');
    int j = -1;
    if (i != j)
    {
      j = 0;
      str = str.substring(0, i);
    }
    return str;
  }
  
  public String getMimeType()
  {
    return this.contentType.getMimeType();
  }
  
  public String getSubType()
  {
    String str = this.contentType.getMimeType();
    int i = str.indexOf('/');
    int j = -1;
    if (i != j) {
      i += 1;
    }
    for (str = str.substring(i);; str = null) {
      return str;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\content\AbstractContentBody.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */