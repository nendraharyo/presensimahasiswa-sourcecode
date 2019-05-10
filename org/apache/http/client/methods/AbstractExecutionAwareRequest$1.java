package org.apache.http.client.methods;

import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ClientConnectionRequest;

class AbstractExecutionAwareRequest$1
  implements Cancellable
{
  AbstractExecutionAwareRequest$1(AbstractExecutionAwareRequest paramAbstractExecutionAwareRequest, ClientConnectionRequest paramClientConnectionRequest) {}
  
  public boolean cancel()
  {
    this.val$connRequest.abortRequest();
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\AbstractExecutionAwareRequest$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */