package io.fabric.sdk.android.services.network;

import java.io.Flushable;

public abstract class HttpRequest$FlushOperation
  extends HttpRequest.Operation
{
  private final Flushable flushable;
  
  protected HttpRequest$FlushOperation(Flushable paramFlushable)
  {
    this.flushable = paramFlushable;
  }
  
  protected void done()
  {
    this.flushable.flush();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$FlushOperation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */