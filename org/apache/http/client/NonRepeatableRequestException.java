package org.apache.http.client;

import org.apache.http.ProtocolException;

public class NonRepeatableRequestException
  extends ProtocolException
{
  private static final long serialVersionUID = 82685265288806048L;
  
  public NonRepeatableRequestException() {}
  
  public NonRepeatableRequestException(String paramString)
  {
    super(paramString);
  }
  
  public NonRepeatableRequestException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\NonRepeatableRequestException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */