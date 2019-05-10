package org.apache.http.auth;

import org.apache.http.ProtocolException;

public class MalformedChallengeException
  extends ProtocolException
{
  private static final long serialVersionUID = 814586927989932284L;
  
  public MalformedChallengeException() {}
  
  public MalformedChallengeException(String paramString)
  {
    super(paramString);
  }
  
  public MalformedChallengeException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\MalformedChallengeException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */