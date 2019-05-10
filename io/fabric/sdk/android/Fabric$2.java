package io.fabric.sdk.android;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

class Fabric$2
  implements InitializationCallback
{
  final CountDownLatch kitInitializedLatch;
  
  Fabric$2(Fabric paramFabric, int paramInt)
  {
    CountDownLatch localCountDownLatch = new java/util/concurrent/CountDownLatch;
    int i = this.val$size;
    localCountDownLatch.<init>(i);
    this.kitInitializedLatch = localCountDownLatch;
  }
  
  public void failure(Exception paramException)
  {
    Fabric.access$300(this.this$0).failure(paramException);
  }
  
  public void success(Object paramObject)
  {
    this.kitInitializedLatch.countDown();
    Object localObject = this.kitInitializedLatch;
    long l1 = ((CountDownLatch)localObject).getCount();
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    if (!bool1)
    {
      localObject = Fabric.access$200(this.this$0);
      boolean bool2 = true;
      ((AtomicBoolean)localObject).set(bool2);
      localObject = Fabric.access$300(this.this$0);
      Fabric localFabric = this.this$0;
      ((InitializationCallback)localObject).success(localFabric);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\Fabric$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */