package org.apache.http.auth;

import org.apache.http.ProtocolException;

public class AuthenticationException
  extends ProtocolException
{
  private static final long serialVersionUID = -6794031905674764776L;
  
  public AuthenticationException() {}
  
  public AuthenticationException(String paramString)
  {
    super(paramString);
  }
  
  public AuthenticationException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\AuthenticationException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */