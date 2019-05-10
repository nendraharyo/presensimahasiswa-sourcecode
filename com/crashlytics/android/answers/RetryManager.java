package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.RetryState;

class RetryManager
{
  private static final long NANOSECONDS_IN_MS = 1000000L;
  long lastRetry;
  private RetryState retryState;
  
  public RetryManager(RetryState paramRetryState)
  {
    if (paramRetryState == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("retryState must not be null");
      throw localNullPointerException;
    }
    this.retryState = paramRetryState;
  }
  
  public boolean canRetry(long paramLong)
  {
    RetryState localRetryState = this.retryState;
    long l1 = localRetryState.getRetryDelay();
    long l2 = 1000000L * l1;
    l1 = this.lastRetry;
    l1 = paramLong - l1;
    boolean bool = l1 < l2;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void recordRetry(long paramLong)
  {
    this.lastRetry = paramLong;
    RetryState localRetryState = this.retryState.nextRetryState();
    this.retryState = localRetryState;
  }
  
  public void reset()
  {
    this.lastRetry = 0L;
    RetryState localRetryState = this.retryState.initialRetryState();
    this.retryState = localRetryState;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\RetryManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */