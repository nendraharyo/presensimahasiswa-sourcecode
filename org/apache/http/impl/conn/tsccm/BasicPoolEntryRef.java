package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;

public class BasicPoolEntryRef
  extends WeakReference
{
  private final HttpRoute route;
  
  public BasicPoolEntryRef(BasicPoolEntry paramBasicPoolEntry, ReferenceQueue paramReferenceQueue)
  {
    super(paramBasicPoolEntry, paramReferenceQueue);
    Args.notNull(paramBasicPoolEntry, "Pool entry");
    HttpRoute localHttpRoute = paramBasicPoolEntry.getPlannedRoute();
    this.route = localHttpRoute;
  }
  
  public final HttpRoute getRoute()
  {
    return this.route;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\tsccm\BasicPoolEntryRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */