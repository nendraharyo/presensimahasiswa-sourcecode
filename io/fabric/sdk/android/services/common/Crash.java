package io.fabric.sdk.android.services.common;

public abstract class Crash
{
  private static final String UNKNOWN_EXCEPTION = "<unknown>";
  private final String exceptionName;
  private final String sessionId;
  
  public Crash(String paramString)
  {
    this(paramString, "<unknown>");
  }
  
  public Crash(String paramString1, String paramString2)
  {
    this.sessionId = paramString1;
    this.exceptionName = paramString2;
  }
  
  public String getExceptionName()
  {
    return this.exceptionName;
  }
  
  public String getSessionId()
  {
    return this.sessionId;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\Crash.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */