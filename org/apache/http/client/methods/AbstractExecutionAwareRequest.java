package org.apache.http.client.methods;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpRequest;
import org.apache.http.client.utils.CloneUtils;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.HttpParams;

public abstract class AbstractExecutionAwareRequest
  extends AbstractHttpMessage
  implements Cloneable, HttpRequest, AbortableHttpRequest, HttpExecutionAware
{
  private final AtomicBoolean aborted;
  private final AtomicReference cancellableRef;
  
  protected AbstractExecutionAwareRequest()
  {
    Object localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    this.aborted = ((AtomicBoolean)localObject);
    localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>(null);
    this.cancellableRef = ((AtomicReference)localObject);
  }
  
  public void abort()
  {
    Object localObject = this.aborted;
    boolean bool1 = true;
    boolean bool2 = ((AtomicBoolean)localObject).compareAndSet(false, bool1);
    if (bool2)
    {
      localObject = (Cancellable)this.cancellableRef.getAndSet(null);
      if (localObject != null) {
        ((Cancellable)localObject).cancel();
      }
    }
  }
  
  public Object clone()
  {
    AbstractExecutionAwareRequest localAbstractExecutionAwareRequest = (AbstractExecutionAwareRequest)super.clone();
    Object localObject = (HeaderGroup)CloneUtils.cloneObject(this.headergroup);
    localAbstractExecutionAwareRequest.headergroup = ((HeaderGroup)localObject);
    localObject = (HttpParams)CloneUtils.cloneObject(this.params);
    localAbstractExecutionAwareRequest.params = ((HttpParams)localObject);
    return localAbstractExecutionAwareRequest;
  }
  
  public void completed()
  {
    this.cancellableRef.set(null);
  }
  
  public boolean isAborted()
  {
    return this.aborted.get();
  }
  
  public void reset()
  {
    Cancellable localCancellable = (Cancellable)this.cancellableRef.getAndSet(null);
    if (localCancellable != null) {
      localCancellable.cancel();
    }
    this.aborted.set(false);
  }
  
  public void setCancellable(Cancellable paramCancellable)
  {
    Object localObject = this.aborted;
    boolean bool = ((AtomicBoolean)localObject).get();
    if (!bool)
    {
      localObject = this.cancellableRef;
      ((AtomicReference)localObject).set(paramCancellable);
    }
  }
  
  public void setConnectionRequest(ClientConnectionRequest paramClientConnectionRequest)
  {
    AbstractExecutionAwareRequest.1 local1 = new org/apache/http/client/methods/AbstractExecutionAwareRequest$1;
    local1.<init>(this, paramClientConnectionRequest);
    setCancellable(local1);
  }
  
  public void setReleaseTrigger(ConnectionReleaseTrigger paramConnectionReleaseTrigger)
  {
    AbstractExecutionAwareRequest.2 local2 = new org/apache/http/client/methods/AbstractExecutionAwareRequest$2;
    local2.<init>(this, paramConnectionReleaseTrigger);
    setCancellable(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\AbstractExecutionAwareRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */