package com.crashlytics.android.core;

import java.util.concurrent.CountDownLatch;

class CrashPromptDialog$OptInLatch
{
  private final CountDownLatch latch;
  private boolean send = false;
  
  private CrashPromptDialog$OptInLatch()
  {
    CountDownLatch localCountDownLatch = new java/util/concurrent/CountDownLatch;
    localCountDownLatch.<init>(1);
    this.latch = localCountDownLatch;
  }
  
  void await()
  {
    try
    {
      CountDownLatch localCountDownLatch = this.latch;
      localCountDownLatch.await();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  boolean getOptIn()
  {
    return this.send;
  }
  
  void setOptIn(boolean paramBoolean)
  {
    this.send = paramBoolean;
    this.latch.countDown();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashPromptDialog$OptInLatch.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */