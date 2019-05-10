package com.crashlytics.android.core;

import android.os.AsyncTask;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

public class CrashTest
{
  private void privateMethodThatThrowsException(String paramString)
  {
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    localRuntimeException.<init>(paramString);
    throw localRuntimeException;
  }
  
  public void crashAsyncTask(long paramLong)
  {
    CrashTest.1 local1 = new com/crashlytics/android/core/CrashTest$1;
    local1.<init>(this, paramLong);
    Void[] arrayOfVoid = new Void[1];
    ((Void)null);
    arrayOfVoid[0] = null;
    local1.execute(arrayOfVoid);
  }
  
  public void indexOutOfBounds()
  {
    int i = new int[2][10];
    Logger localLogger = Fabric.getLogger();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = "Out of bounds value: " + i;
    localLogger.d("CrashlyticsCore", str);
  }
  
  public int stackOverflow()
  {
    int i = stackOverflow();
    int j = (int)Math.random();
    return i + j;
  }
  
  public void throwFiveChainedExceptions()
  {
    String str1 = "1";
    try
    {
      privateMethodThatThrowsException(str1);
      return;
    }
    catch (Exception localException1)
    {
      try
      {
        localRuntimeException = new java/lang/RuntimeException;
        str2 = "2";
        localRuntimeException.<init>(str2, localException1);
        throw localRuntimeException;
      }
      catch (Exception localException2)
      {
        try
        {
          localRuntimeException = new java/lang/RuntimeException;
          str2 = "3";
          localRuntimeException.<init>(str2, localException2);
          throw localRuntimeException;
        }
        catch (Exception localException3)
        {
          try
          {
            localRuntimeException = new java/lang/RuntimeException;
            String str2 = "4";
            localRuntimeException.<init>(str2, localException3);
            throw localRuntimeException;
          }
          catch (Exception localException4)
          {
            RuntimeException localRuntimeException = new java/lang/RuntimeException;
            localRuntimeException.<init>("5", localException4);
            throw localRuntimeException;
          }
        }
      }
    }
  }
  
  public void throwRuntimeException(String paramString)
  {
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    localRuntimeException.<init>(paramString);
    throw localRuntimeException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashTest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */