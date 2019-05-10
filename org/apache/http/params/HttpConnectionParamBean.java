package org.apache.http.params;

public class HttpConnectionParamBean
  extends HttpAbstractParamBean
{
  public HttpConnectionParamBean(HttpParams paramHttpParams)
  {
    super(paramHttpParams);
  }
  
  public void setConnectionTimeout(int paramInt)
  {
    HttpConnectionParams.setConnectionTimeout(this.params, paramInt);
  }
  
  public void setLinger(int paramInt)
  {
    HttpConnectionParams.setLinger(this.params, paramInt);
  }
  
  public void setSoTimeout(int paramInt)
  {
    HttpConnectionParams.setSoTimeout(this.params, paramInt);
  }
  
  public void setSocketBufferSize(int paramInt)
  {
    HttpConnectionParams.setSocketBufferSize(this.params, paramInt);
  }
  
  public void setStaleCheckingEnabled(boolean paramBoolean)
  {
    HttpConnectionParams.setStaleCheckingEnabled(this.params, paramBoolean);
  }
  
  public void setTcpNoDelay(boolean paramBoolean)
  {
    HttpConnectionParams.setTcpNoDelay(this.params, paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\params\HttpConnectionParamBean.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */