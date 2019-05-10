package org.apache.http.impl.client;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.protocol.HttpContext;

class HttpRequestTaskCallable
  implements Callable
{
  private final FutureCallback callback;
  private final AtomicBoolean cancelled;
  private final HttpContext context;
  private long ended;
  private final HttpClient httpclient;
  private final FutureRequestExecutionMetrics metrics;
  private final HttpUriRequest request;
  private final ResponseHandler responseHandler;
  private final long scheduled;
  private long started;
  
  HttpRequestTaskCallable(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext, ResponseHandler paramResponseHandler, FutureCallback paramFutureCallback, FutureRequestExecutionMetrics paramFutureRequestExecutionMetrics)
  {
    AtomicBoolean localAtomicBoolean = new java/util/concurrent/atomic/AtomicBoolean;
    localAtomicBoolean.<init>(false);
    this.cancelled = localAtomicBoolean;
    long l2 = System.currentTimeMillis();
    this.scheduled = l2;
    this.started = l1;
    this.ended = l1;
    this.httpclient = paramHttpClient;
    this.responseHandler = paramResponseHandler;
    this.request = paramHttpUriRequest;
    this.context = paramHttpContext;
    this.callback = paramFutureCallback;
    this.metrics = paramFutureRequestExecutionMetrics;
  }
  
  public Object call()
  {
    Object localObject1 = this.cancelled;
    boolean bool = ((AtomicBoolean)localObject1).get();
    if (!bool) {
      try
      {
        localObject1 = this.metrics;
        localObject1 = ((FutureRequestExecutionMetrics)localObject1).getActiveConnections();
        ((AtomicLong)localObject1).incrementAndGet();
        long l1 = System.currentTimeMillis();
        this.started = l1;
        long l2;
        try
        {
          localObject1 = this.metrics;
          localObject1 = ((FutureRequestExecutionMetrics)localObject1).getScheduledConnections();
          ((AtomicLong)localObject1).decrementAndGet();
          localObject1 = this.httpclient;
          localObject3 = this.request;
          localObject4 = this.responseHandler;
          HttpContext localHttpContext = this.context;
          localObject1 = ((HttpClient)localObject1).execute((HttpUriRequest)localObject3, (ResponseHandler)localObject4, localHttpContext);
          l2 = System.currentTimeMillis();
          this.ended = l2;
          localObject3 = this.metrics;
          localObject3 = ((FutureRequestExecutionMetrics)localObject3).getSuccessfulConnections();
          l2 = this.started;
          ((FutureRequestExecutionMetrics.DurationCounter)localObject3).increment(l2);
          localObject3 = this.callback;
          if (localObject3 != null)
          {
            localObject3 = this.callback;
            ((FutureCallback)localObject3).completed(localObject1);
          }
          return localObject1;
        }
        catch (Exception localException)
        {
          localObject3 = this.metrics;
          localObject3 = ((FutureRequestExecutionMetrics)localObject3).getFailedConnections();
          l2 = this.started;
          ((FutureRequestExecutionMetrics.DurationCounter)localObject3).increment(l2);
          l2 = System.currentTimeMillis();
          this.ended = l2;
          localObject3 = this.callback;
          if (localObject3 != null)
          {
            localObject3 = this.callback;
            ((FutureCallback)localObject3).failed(localException);
          }
          throw localException;
        }
        localIllegalStateException = new java/lang/IllegalStateException;
      }
      finally
      {
        localObject3 = this.metrics.getRequests();
        l2 = this.started;
        ((FutureRequestExecutionMetrics.DurationCounter)localObject3).increment(l2);
        localObject3 = this.metrics.getTasks();
        l2 = this.started;
        ((FutureRequestExecutionMetrics.DurationCounter)localObject3).increment(l2);
        this.metrics.getActiveConnections().decrementAndGet();
      }
    }
    IllegalStateException localIllegalStateException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("call has been cancelled for request ");
    Object localObject4 = this.request.getURI();
    localObject3 = localObject4;
    localIllegalStateException.<init>((String)localObject3);
    throw localIllegalStateException;
  }
  
  public void cancel()
  {
    Object localObject = this.cancelled;
    boolean bool = true;
    ((AtomicBoolean)localObject).set(bool);
    localObject = this.callback;
    if (localObject != null)
    {
      localObject = this.callback;
      ((FutureCallback)localObject).cancelled();
    }
  }
  
  public long getEnded()
  {
    return this.ended;
  }
  
  public long getScheduled()
  {
    return this.scheduled;
  }
  
  public long getStarted()
  {
    return this.started;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\HttpRequestTaskCallable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */