package org.apache.http.entity.mime;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.entity.mime.content.ContentBody;

public class HttpMultipart
  extends AbstractMultipartForm
{
  private final HttpMultipartMode mode;
  private final List parts;
  
  public HttpMultipart(String paramString1, String paramString2)
  {
    this(paramString1, null, paramString2);
  }
  
  public HttpMultipart(String paramString1, Charset paramCharset, String paramString2)
  {
    this(paramString1, paramCharset, paramString2, localHttpMultipartMode);
  }
  
  public HttpMultipart(String paramString1, Charset paramCharset, String paramString2, HttpMultipartMode paramHttpMultipartMode)
  {
    super(paramString1, paramCharset, paramString2);
    this.mode = paramHttpMultipartMode;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.parts = localArrayList;
  }
  
  public void addBodyPart(FormBodyPart paramFormBodyPart)
  {
    if (paramFormBodyPart == null) {}
    for (;;)
    {
      return;
      List localList = this.parts;
      localList.add(paramFormBodyPart);
    }
  }
  
  protected void formatMultipartHeader(FormBodyPart paramFormBodyPart, OutputStream paramOutputStream)
  {
    Object localObject1 = paramFormBodyPart.getHeader();
    Object localObject2 = HttpMultipart.1.$SwitchMap$org$apache$http$entity$mime$HttpMultipartMode;
    Object localObject3 = this.mode;
    int i = ((HttpMultipartMode)localObject3).ordinal();
    int j = localObject2[i];
    switch (j)
    {
    default: 
      localObject2 = ((Header)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (MinimalField)((Iterator)localObject2).next();
        writeField((MinimalField)localObject1, paramOutputStream);
      }
    }
    localObject2 = ((Header)localObject1).getField("Content-Disposition");
    localObject3 = this.charset;
    writeField((MinimalField)localObject2, (Charset)localObject3, paramOutputStream);
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
  
  public HttpMultipartMode getMode()
  {
    return this.mode;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\HttpMultipart.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */