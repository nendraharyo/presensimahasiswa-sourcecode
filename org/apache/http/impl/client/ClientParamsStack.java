package org.apache.http.impl.client;

import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public class ClientParamsStack
  extends AbstractHttpParams
{
  protected final HttpParams applicationParams;
  protected final HttpParams clientParams;
  protected final HttpParams overrideParams;
  protected final HttpParams requestParams;
  
  public ClientParamsStack(ClientParamsStack paramClientParamsStack)
  {
    this(localHttpParams1, localHttpParams2, localHttpParams3, localHttpParams4);
  }
  
  public ClientParamsStack(ClientParamsStack paramClientParamsStack, HttpParams paramHttpParams1, HttpParams paramHttpParams2, HttpParams paramHttpParams3, HttpParams paramHttpParams4) {}
  
  public ClientParamsStack(HttpParams paramHttpParams1, HttpParams paramHttpParams2, HttpParams paramHttpParams3, HttpParams paramHttpParams4)
  {
    this.applicationParams = paramHttpParams1;
    this.clientParams = paramHttpParams2;
    this.requestParams = paramHttpParams3;
    this.overrideParams = paramHttpParams4;
  }
  
  public HttpParams copy()
  {
    return this;
  }
  
  public final HttpParams getApplicationParams()
  {
    return this.applicationParams;
  }
  
  public final HttpParams getClientParams()
  {
    return this.clientParams;
  }
  
  public final HttpParams getOverrideParams()
  {
    return this.overrideParams;
  }
  
  public Object getParameter(String paramString)
  {
    Args.notNull(paramString, "Parameter name");
    Object localObject = null;
    HttpParams localHttpParams = this.overrideParams;
    if (localHttpParams != null) {
      localObject = this.overrideParams.getParameter(paramString);
    }
    if (localObject == null)
    {
      localHttpParams = this.requestParams;
      if (localHttpParams != null) {
        localObject = this.requestParams.getParameter(paramString);
      }
    }
    if (localObject == null)
    {
      localHttpParams = this.clientParams;
      if (localHttpParams != null) {
        localObject = this.clientParams.getParameter(paramString);
      }
    }
    if (localObject == null)
    {
      localHttpParams = this.applicationParams;
      if (localHttpParams != null) {
        localObject = this.applicationParams.getParameter(paramString);
      }
    }
    return localObject;
  }
  
  public final HttpParams getRequestParams()
  {
    return this.requestParams;
  }
  
  public boolean removeParameter(String paramString)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Removing parameters in a stack is not supported.");
    throw localUnsupportedOperationException;
  }
  
  public HttpParams setParameter(String paramString, Object paramObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Setting parameters in a stack is not supported.");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\ClientParamsStack.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */