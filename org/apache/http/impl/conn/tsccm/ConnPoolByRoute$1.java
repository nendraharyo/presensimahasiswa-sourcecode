package org.apache.http.impl.conn.tsccm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.apache.http.conn.routing.HttpRoute;

class ConnPoolByRoute$1
  implements PoolEntryRequest
{
  ConnPoolByRoute$1(ConnPoolByRoute paramConnPoolByRoute, WaitingThreadAborter paramWaitingThreadAborter, HttpRoute paramHttpRoute, Object paramObject) {}
  
  public void abortRequest()
  {
    Object localObject1 = ConnPoolByRoute.access$000(this.this$0);
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.val$aborter;
      ((WaitingThreadAborter)localObject1).abort();
      return;
    }
    finally
    {
      ConnPoolByRoute.access$000(this.this$0).unlock();
    }
  }
  
  public BasicPoolEntry getPoolEntry(long paramLong, TimeUnit paramTimeUnit)
  {
    ConnPoolByRoute localConnPoolByRoute = this.this$0;
    HttpRoute localHttpRoute = this.val$route;
    Object localObject = this.val$state;
    WaitingThreadAborter localWaitingThreadAborter = this.val$aborter;
    return localConnPoolByRoute.getEntryBlocking(localHttpRoute, localObject, paramLong, paramTimeUnit, localWaitingThreadAborter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\tsccm\ConnPoolByRoute$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */