package io.fabric.sdk.android.services.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class ExecutorUtils$1
  implements ThreadFactory
{
  ExecutorUtils$1(String paramString, AtomicLong paramAtomicLong) {}
  
  public Thread newThread(Runnable paramRunnable)
  {
    Object localObject1 = Executors.defaultThreadFactory();
    Object localObject2 = new io/fabric/sdk/android/services/common/ExecutorUtils$1$1;
    ((ExecutorUtils.1.1)localObject2).<init>(this, paramRunnable);
    localObject1 = ((ThreadFactory)localObject1).newThread((Runnable)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = this.val$threadNameTemplate;
    localObject2 = ((StringBuilder)localObject2).append(str);
    long l = this.val$count.getAndIncrement();
    localObject2 = l;
    ((Thread)localObject1).setName((String)localObject2);
    return (Thread)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\ExecutorUtils$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */