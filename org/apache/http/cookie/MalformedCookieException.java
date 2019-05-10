package org.apache.http.cookie;

import org.apache.http.ProtocolException;

public class MalformedCookieException
  extends ProtocolException
{
  private static final long serialVersionUID = -6695462944287282185L;
  
  public MalformedCookieException() {}
  
  public MalformedCookieException(String paramString)
  {
    super(paramString);
  }
  
  public MalformedCookieException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\cookie\MalformedCookieException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */