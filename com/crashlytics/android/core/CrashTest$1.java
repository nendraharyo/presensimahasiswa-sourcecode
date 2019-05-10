package com.crashlytics.android.core;

import android.os.AsyncTask;

class CrashTest$1
  extends AsyncTask
{
  CrashTest$1(CrashTest paramCrashTest, long paramLong) {}
  
  protected Void doInBackground(Void... paramVarArgs)
  {
    try
    {
      long l = this.val$delayMs;
      Thread.sleep(l);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    this.this$0.throwRuntimeException("Background thread crash");
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashTest$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */