package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpRequestInterceptor;

public abstract interface HttpRequestInterceptorList
{
  public abstract void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor);
  
  public abstract void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor, int paramInt);
  
  public abstract void clearRequestInterceptors();
  
  public abstract HttpRequestInterceptor getRequestInterceptor(int paramInt);
  
  public abstract int getRequestInterceptorCount();
  
  public abstract void removeRequestInterceptorByClass(Class paramClass);
  
  public abstract void setInterceptors(List paramList);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\HttpRequestInterceptorList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */