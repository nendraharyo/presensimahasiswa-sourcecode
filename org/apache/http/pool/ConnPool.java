package org.apache.http.pool;

import java.util.concurrent.Future;
import org.apache.http.concurrent.FutureCallback;

public abstract interface ConnPool
{
  public abstract Future lease(Object paramObject1, Object paramObject2, FutureCallback paramFutureCallback);
  
  public abstract void release(Object paramObject, boolean paramBoolean);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\pool\ConnPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */