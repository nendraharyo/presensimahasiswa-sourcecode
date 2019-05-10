package org.apache.http.auth;

public class InvalidCredentialsException
  extends AuthenticationException
{
  private static final long serialVersionUID = -4834003835215460648L;
  
  public InvalidCredentialsException() {}
  
  public InvalidCredentialsException(String paramString)
  {
    super(paramString);
  }
  
  public InvalidCredentialsException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\InvalidCredentialsException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */