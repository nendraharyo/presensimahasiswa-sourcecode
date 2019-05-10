package io.fabric.sdk.android.services.concurrency.internal;

public class RetryState
{
  private final Backoff backoff;
  private final int retryCount;
  private final RetryPolicy retryPolicy;
  
  public RetryState(int paramInt, Backoff paramBackoff, RetryPolicy paramRetryPolicy)
  {
    this.retryCount = paramInt;
    this.backoff = paramBackoff;
    this.retryPolicy = paramRetryPolicy;
  }
  
  public RetryState(Backoff paramBackoff, RetryPolicy paramRetryPolicy)
  {
    this(0, paramBackoff, paramRetryPolicy);
  }
  
  public Backoff getBackoff()
  {
    return this.backoff;
  }
  
  public int getRetryCount()
  {
    return this.retryCount;
  }
  
  public long getRetryDelay()
  {
    Backoff localBackoff = this.backoff;
    int i = this.retryCount;
    return localBackoff.getDelayMillis(i);
  }
  
  public RetryPolicy getRetryPolicy()
  {
    return this.retryPolicy;
  }
  
  public RetryState initialRetryState()
  {
    RetryState localRetryState = new io/fabric/sdk/android/services/concurrency/internal/RetryState;
    Backoff localBackoff = this.backoff;
    RetryPolicy localRetryPolicy = this.retryPolicy;
    localRetryState.<init>(localBackoff, localRetryPolicy);
    return localRetryState;
  }
  
  public RetryState nextRetryState()
  {
    RetryState localRetryState = new io/fabric/sdk/android/services/concurrency/internal/RetryState;
    int i = this.retryCount + 1;
    Backoff localBackoff = this.backoff;
    RetryPolicy localRetryPolicy = this.retryPolicy;
    localRetryState.<init>(i, localBackoff, localRetryPolicy);
    return localRetryState;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\internal\RetryState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */