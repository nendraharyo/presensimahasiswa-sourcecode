package org.apache.http.client.methods;

import org.apache.http.concurrent.Cancellable;

public abstract interface HttpExecutionAware
{
  public abstract boolean isAborted();
  
  public abstract void setCancellable(Cancellable paramCancellable);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\HttpExecutionAware.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */