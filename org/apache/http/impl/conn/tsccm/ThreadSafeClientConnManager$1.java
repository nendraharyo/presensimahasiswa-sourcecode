package org.apache.http.impl.conn.tsccm;

import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.AbstractPoolEntry;
import org.apache.http.util.Args;

class ThreadSafeClientConnManager$1
  implements ClientConnectionRequest
{
  ThreadSafeClientConnManager$1(ThreadSafeClientConnManager paramThreadSafeClientConnManager, PoolEntryRequest paramPoolEntryRequest, HttpRoute paramHttpRoute) {}
  
  public void abortRequest()
  {
    this.val$poolRequest.abortRequest();
  }
  
  public ManagedClientConnection getConnection(long paramLong, TimeUnit paramTimeUnit)
  {
    Object localObject1 = this.val$route;
    Object localObject2 = "Route";
    Args.notNull(localObject1, (String)localObject2);
    localObject1 = ThreadSafeClientConnManager.access$000(this.this$0);
    boolean bool = ((Log)localObject1).isDebugEnabled();
    if (bool)
    {
      localObject1 = ThreadSafeClientConnManager.access$000(this.this$0);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Get connection: ");
      localObject3 = this.val$route;
      localObject2 = ((StringBuilder)localObject2).append(localObject3);
      localObject3 = ", timeout = ";
      localObject2 = (String)localObject3 + paramLong;
      ((Log)localObject1).debug(localObject2);
    }
    localObject1 = this.val$poolRequest.getPoolEntry(paramLong, paramTimeUnit);
    localObject2 = new org/apache/http/impl/conn/tsccm/BasicPooledConnAdapter;
    Object localObject3 = this.this$0;
    ((BasicPooledConnAdapter)localObject2).<init>((ThreadSafeClientConnManager)localObject3, (AbstractPoolEntry)localObject1);
    return (ManagedClientConnection)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\tsccm\ThreadSafeClientConnManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */