package io.fabric.sdk.android;

import android.util.Log;

public class DefaultLogger
  implements Logger
{
  private int logLevel;
  
  public DefaultLogger()
  {
    this.logLevel = 4;
  }
  
  public DefaultLogger(int paramInt)
  {
    this.logLevel = paramInt;
  }
  
  public void d(String paramString1, String paramString2)
  {
    d(paramString1, paramString2, null);
  }
  
  public void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    boolean bool = isLoggable(paramString1, 3);
    if (bool) {
      Log.d(paramString1, paramString2, paramThrowable);
    }
  }
  
  public void e(String paramString1, String paramString2)
  {
    e(paramString1, paramString2, null);
  }
  
  public void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    boolean bool = isLoggable(paramString1, 6);
    if (bool) {
      Log.e(paramString1, paramString2, paramThrowable);
    }
  }
  
  public int getLogLevel()
  {
    return this.logLevel;
  }
  
  public void i(String paramString1, String paramString2)
  {
    i(paramString1, paramString2, null);
  }
  
  public void i(String paramString1, String paramString2, Throwable paramThrowable)
  {
    boolean bool = isLoggable(paramString1, 4);
    if (bool) {
      Log.i(paramString1, paramString2, paramThrowable);
    }
  }
  
  public boolean isLoggable(String paramString, int paramInt)
  {
    int i = this.logLevel;
    if (i <= paramInt) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public void log(int paramInt, String paramString1, String paramString2)
  {
    log(paramInt, paramString1, paramString2, false);
  }
  
  public void log(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      boolean bool = isLoggable(paramString1, paramInt);
      if (!bool) {}
    }
    else
    {
      Log.println(paramInt, paramString1, paramString2);
    }
  }
  
  public void setLogLevel(int paramInt)
  {
    this.logLevel = paramInt;
  }
  
  public void v(String paramString1, String paramString2)
  {
    v(paramString1, paramString2, null);
  }
  
  public void v(String paramString1, String paramString2, Throwable paramThrowable)
  {
    boolean bool = isLoggable(paramString1, 2);
    if (bool) {
      Log.v(paramString1, paramString2, paramThrowable);
    }
  }
  
  public void w(String paramString1, String paramString2)
  {
    w(paramString1, paramString2, null);
  }
  
  public void w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    boolean bool = isLoggable(paramString1, 5);
    if (bool) {
      Log.w(paramString1, paramString2, paramThrowable);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\DefaultLogger.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */