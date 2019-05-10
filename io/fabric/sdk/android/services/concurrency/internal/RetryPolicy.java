package io.fabric.sdk.android.services.concurrency.internal;

public abstract interface RetryPolicy
{
  public abstract boolean shouldRetry(int paramInt, Throwable paramThrowable);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\internal\RetryPolicy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */