package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.Backoff;
import io.fabric.sdk.android.services.concurrency.internal.DefaultRetryPolicy;
import io.fabric.sdk.android.services.concurrency.internal.ExponentialBackoff;
import io.fabric.sdk.android.services.concurrency.internal.RetryPolicy;
import io.fabric.sdk.android.services.concurrency.internal.RetryState;
import io.fabric.sdk.android.services.events.FilesSender;
import java.util.List;

class AnswersRetryFilesSender
  implements FilesSender
{
  private static final int BACKOFF_MS = 1000;
  private static final int BACKOFF_POWER = 8;
  private static final double JITTER_PERCENT = 0.1D;
  private static final int MAX_RETRIES = 5;
  private final SessionAnalyticsFilesSender filesSender;
  private final RetryManager retryManager;
  
  AnswersRetryFilesSender(SessionAnalyticsFilesSender paramSessionAnalyticsFilesSender, RetryManager paramRetryManager)
  {
    this.filesSender = paramSessionAnalyticsFilesSender;
    this.retryManager = paramRetryManager;
  }
  
  public static AnswersRetryFilesSender build(SessionAnalyticsFilesSender paramSessionAnalyticsFilesSender)
  {
    Object localObject1 = new com/crashlytics/android/answers/RandomBackoff;
    Object localObject2 = new io/fabric/sdk/android/services/concurrency/internal/ExponentialBackoff;
    ((ExponentialBackoff)localObject2).<init>(1000L, 8);
    ((RandomBackoff)localObject1).<init>((Backoff)localObject2, 0.1D);
    localObject2 = new io/fabric/sdk/android/services/concurrency/internal/DefaultRetryPolicy;
    ((DefaultRetryPolicy)localObject2).<init>(5);
    RetryState localRetryState = new io/fabric/sdk/android/services/concurrency/internal/RetryState;
    localRetryState.<init>((Backoff)localObject1, (RetryPolicy)localObject2);
    localObject1 = new com/crashlytics/android/answers/RetryManager;
    ((RetryManager)localObject1).<init>(localRetryState);
    localObject2 = new com/crashlytics/android/answers/AnswersRetryFilesSender;
    ((AnswersRetryFilesSender)localObject2).<init>(paramSessionAnalyticsFilesSender, (RetryManager)localObject1);
    return (AnswersRetryFilesSender)localObject2;
  }
  
  public boolean send(List paramList)
  {
    boolean bool1 = false;
    RetryManager localRetryManager = null;
    long l = System.nanoTime();
    Object localObject = this.retryManager;
    boolean bool2 = ((RetryManager)localObject).canRetry(l);
    if (bool2)
    {
      localObject = this.filesSender;
      bool2 = ((SessionAnalyticsFilesSender)localObject).send(paramList);
      if (!bool2) {
        break label61;
      }
      localRetryManager = this.retryManager;
      localRetryManager.reset();
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      label61:
      localObject = this.retryManager;
      ((RetryManager)localObject).recordRetry(l);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersRetryFilesSender.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */