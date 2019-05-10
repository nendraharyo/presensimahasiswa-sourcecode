package org.apache.http.client;

import org.apache.http.ProtocolException;

public class RedirectException
  extends ProtocolException
{
  private static final long serialVersionUID = 4418824536372559326L;
  
  public RedirectException() {}
  
  public RedirectException(String paramString)
  {
    super(paramString);
  }
  
  public RedirectException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\RedirectException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */