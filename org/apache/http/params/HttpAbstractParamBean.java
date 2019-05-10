package org.apache.http.params;

import org.apache.http.util.Args;

public abstract class HttpAbstractParamBean
{
  protected final HttpParams params;
  
  public HttpAbstractParamBean(HttpParams paramHttpParams)
  {
    HttpParams localHttpParams = (HttpParams)Args.notNull(paramHttpParams, "HTTP parameters");
    this.params = localHttpParams;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\params\HttpAbstractParamBean.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */