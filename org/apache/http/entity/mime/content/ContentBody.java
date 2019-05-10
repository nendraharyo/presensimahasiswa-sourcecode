package org.apache.http.entity.mime.content;

import java.io.OutputStream;

public abstract interface ContentBody
  extends ContentDescriptor
{
  public abstract String getFilename();
  
  public abstract void writeTo(OutputStream paramOutputStream);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\content\ContentBody.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */