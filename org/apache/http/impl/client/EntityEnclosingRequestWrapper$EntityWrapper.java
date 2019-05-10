package org.apache.http.impl.client;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

class EntityEnclosingRequestWrapper$EntityWrapper
  extends HttpEntityWrapper
{
  EntityEnclosingRequestWrapper$EntityWrapper(EntityEnclosingRequestWrapper paramEntityEnclosingRequestWrapper, HttpEntity paramHttpEntity)
  {
    super(paramHttpEntity);
  }
  
  public void consumeContent()
  {
    EntityEnclosingRequestWrapper.access$002(this.this$0, true);
    super.consumeContent();
  }
  
  public InputStream getContent()
  {
    EntityEnclosingRequestWrapper.access$002(this.this$0, true);
    return super.getContent();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    EntityEnclosingRequestWrapper.access$002(this.this$0, true);
    super.writeTo(paramOutputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\EntityEnclosingRequestWrapper$EntityWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */