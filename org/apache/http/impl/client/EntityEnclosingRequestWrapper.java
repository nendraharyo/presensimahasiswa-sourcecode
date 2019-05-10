package org.apache.http.impl.client;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;

public class EntityEnclosingRequestWrapper
  extends RequestWrapper
  implements HttpEntityEnclosingRequest
{
  private boolean consumed;
  private HttpEntity entity;
  
  public EntityEnclosingRequestWrapper(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    super(paramHttpEntityEnclosingRequest);
    HttpEntity localHttpEntity = paramHttpEntityEnclosingRequest.getEntity();
    setEntity(localHttpEntity);
  }
  
  public boolean expectContinue()
  {
    Object localObject = getFirstHeader("Expect");
    boolean bool;
    if (localObject != null)
    {
      String str = "100-continue";
      localObject = ((Header)localObject).getValue();
      bool = str.equalsIgnoreCase((String)localObject);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public HttpEntity getEntity()
  {
    return this.entity;
  }
  
  public boolean isRepeatable()
  {
    HttpEntity localHttpEntity = this.entity;
    if (localHttpEntity != null)
    {
      localHttpEntity = this.entity;
      bool = localHttpEntity.isRepeatable();
      if (!bool)
      {
        bool = this.consumed;
        if (bool) {
          break label38;
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label38:
      bool = false;
      localHttpEntity = null;
    }
  }
  
  public void setEntity(HttpEntity paramHttpEntity)
  {
    EntityEnclosingRequestWrapper.EntityWrapper localEntityWrapper;
    if (paramHttpEntity != null)
    {
      localEntityWrapper = new org/apache/http/impl/client/EntityEnclosingRequestWrapper$EntityWrapper;
      localEntityWrapper.<init>(this, paramHttpEntity);
    }
    for (;;)
    {
      this.entity = localEntityWrapper;
      this.consumed = false;
      return;
      localEntityWrapper = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\EntityEnclosingRequestWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */