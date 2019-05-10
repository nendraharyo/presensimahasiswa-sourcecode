package org.apache.http.auth.params;

import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

public class AuthParamBean
  extends HttpAbstractParamBean
{
  public AuthParamBean(HttpParams paramHttpParams)
  {
    super(paramHttpParams);
  }
  
  public void setCredentialCharset(String paramString)
  {
    AuthParams.setCredentialCharset(this.params, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\params\AuthParamBean.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */