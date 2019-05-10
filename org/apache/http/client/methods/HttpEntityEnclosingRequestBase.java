package org.apache.http.client.methods;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.utils.CloneUtils;

public abstract class HttpEntityEnclosingRequestBase
  extends HttpRequestBase
  implements HttpEntityEnclosingRequest
{
  private HttpEntity entity;
  
  public Object clone()
  {
    HttpEntityEnclosingRequestBase localHttpEntityEnclosingRequestBase = (HttpEntityEnclosingRequestBase)super.clone();
    HttpEntity localHttpEntity = this.entity;
    if (localHttpEntity != null)
    {
      localHttpEntity = (HttpEntity)CloneUtils.cloneObject(this.entity);
      localHttpEntityEnclosingRequestBase.entity = localHttpEntity;
    }
    return localHttpEntityEnclosingRequestBase;
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
  
  public void setEntity(HttpEntity paramHttpEntity)
  {
    this.entity = paramHttpEntity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\HttpEntityEnclosingRequestBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */