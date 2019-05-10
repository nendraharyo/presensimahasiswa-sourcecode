package org.apache.http.client.methods;

import java.io.IOException;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ConnectionReleaseTrigger;

class AbstractExecutionAwareRequest$2
  implements Cancellable
{
  AbstractExecutionAwareRequest$2(AbstractExecutionAwareRequest paramAbstractExecutionAwareRequest, ConnectionReleaseTrigger paramConnectionReleaseTrigger) {}
  
  public boolean cancel()
  {
    try
    {
      ConnectionReleaseTrigger localConnectionReleaseTrigger = this.val$releaseTrigger;
      localConnectionReleaseTrigger.abortConnection();
      bool = true;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\AbstractExecutionAwareRequest$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */