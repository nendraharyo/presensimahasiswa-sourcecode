package io.fabric.sdk.android.services.concurrency.internal;

public class DefaultRetryPolicy
  implements RetryPolicy
{
  private final int maxRetries;
  
  public DefaultRetryPolicy()
  {
    this(1);
  }
  
  public DefaultRetryPolicy(int paramInt)
  {
    this.maxRetries = paramInt;
  }
  
  public boolean shouldRetry(int paramInt, Throwable paramThrowable)
  {
    int i = this.maxRetries;
    if (paramInt < i) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\internal\DefaultRetryPolicy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */