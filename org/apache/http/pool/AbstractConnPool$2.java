package org.apache.http.pool;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.apache.http.concurrent.FutureCallback;

class AbstractConnPool$2
  extends PoolEntryFuture
{
  AbstractConnPool$2(AbstractConnPool paramAbstractConnPool, Lock paramLock, FutureCallback paramFutureCallback, Object paramObject1, Object paramObject2)
  {
    super(paramLock, paramFutureCallback);
  }
  
  public PoolEntry getPoolEntry(long paramLong, TimeUnit paramTimeUnit)
  {
    AbstractConnPool localAbstractConnPool = this.this$0;
    Object localObject1 = this.val$route;
    Object localObject2 = this.val$state;
    PoolEntry localPoolEntry = AbstractConnPool.access$000(localAbstractConnPool, localObject1, localObject2, paramLong, paramTimeUnit, this);
    this.this$0.onLease(localPoolEntry);
    return localPoolEntry;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\pool\AbstractConnPool$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */