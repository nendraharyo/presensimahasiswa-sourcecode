package io.fabric.sdk.android.services.network;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public abstract class HttpRequest$CloseOperation
  extends HttpRequest.Operation
{
  private final Closeable closeable;
  private final boolean ignoreCloseExceptions;
  
  protected HttpRequest$CloseOperation(Closeable paramCloseable, boolean paramBoolean)
  {
    this.closeable = paramCloseable;
    this.ignoreCloseExceptions = paramBoolean;
  }
  
  protected void done()
  {
    Object localObject = this.closeable;
    boolean bool = localObject instanceof Flushable;
    if (bool)
    {
      localObject = (Flushable)this.closeable;
      ((Flushable)localObject).flush();
    }
    bool = this.ignoreCloseExceptions;
    if (bool) {}
    for (;;)
    {
      try
      {
        localObject = this.closeable;
        ((Closeable)localObject).close();
        return;
      }
      catch (IOException localIOException)
      {
        continue;
      }
      localObject = this.closeable;
      ((Closeable)localObject).close();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$CloseOperation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */