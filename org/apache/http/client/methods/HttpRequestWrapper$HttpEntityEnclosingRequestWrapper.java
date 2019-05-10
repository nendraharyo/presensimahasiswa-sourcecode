package org.apache.http.client.methods;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;

class HttpRequestWrapper$HttpEntityEnclosingRequestWrapper
  extends HttpRequestWrapper
  implements HttpEntityEnclosingRequest
{
  private HttpEntity entity;
  
  public HttpRequestWrapper$HttpEntityEnclosingRequestWrapper(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    super(paramHttpEntityEnclosingRequest, null);
    HttpEntity localHttpEntity = paramHttpEntityEnclosingRequest.getEntity();
    this.entity = localHttpEntity;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\HttpRequestWrapper$HttpEntityEnclosingRequestWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */