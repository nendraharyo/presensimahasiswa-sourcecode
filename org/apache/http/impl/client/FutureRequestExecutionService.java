package org.apache.http.impl.client;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.protocol.HttpContext;

public class FutureRequestExecutionService
  implements Closeable
{
  private final AtomicBoolean closed;
  private final ExecutorService executorService;
  private final HttpClient httpclient;
  private final FutureRequestExecutionMetrics metrics;
  
  public FutureRequestExecutionService(HttpClient paramHttpClient, ExecutorService paramExecutorService)
  {
    Object localObject = new org/apache/http/impl/client/FutureRequestExecutionMetrics;
    ((FutureRequestExecutionMetrics)localObject).<init>();
    this.metrics = ((FutureRequestExecutionMetrics)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    this.closed = ((AtomicBoolean)localObject);
    this.httpclient = paramHttpClient;
    this.executorService = paramExecutorService;
  }
  
  public void close()
  {
    Object localObject = this.closed;
    boolean bool1 = true;
    ((AtomicBoolean)localObject).set(bool1);
    this.executorService.shutdownNow();
    localObject = this.httpclient;
    boolean bool2 = localObject instanceof Closeable;
    if (bool2)
    {
      localObject = (Closeable)this.httpclient;
      ((Closeable)localObject).close();
    }
  }
  
  public HttpRequestFutureTask execute(HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext, ResponseHandler paramResponseHandler)
  {
    return execute(paramHttpUriRequest, paramHttpContext, paramResponseHandler, null);
  }
  
  public HttpRequestFutureTask execute(HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext, ResponseHandler paramResponseHandler, FutureCallback paramFutureCallback)
  {
    Object localObject1 = this.closed;
    boolean bool = ((AtomicBoolean)localObject1).get();
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Close has been called on this httpclient instance.");
      throw ((Throwable)localObject1);
    }
    this.metrics.getScheduledConnections().incrementAndGet();
    localObject1 = new org/apache/http/impl/client/HttpRequestTaskCallable;
    Object localObject2 = this.httpclient;
    FutureRequestExecutionMetrics localFutureRequestExecutionMetrics = this.metrics;
    ((HttpRequestTaskCallable)localObject1).<init>((HttpClient)localObject2, paramHttpUriRequest, paramHttpContext, paramResponseHandler, paramFutureCallback, localFutureRequestExecutionMetrics);
    localObject2 = new org/apache/http/impl/client/HttpRequestFutureTask;
    ((HttpRequestFutureTask)localObject2).<init>(paramHttpUriRequest, (HttpRequestTaskCallable)localObject1);
    this.executorService.execute((Runnable)localObject2);
    return (HttpRequestFutureTask)localObject2;
  }
  
  public FutureRequestExecutionMetrics metrics()
  {
    return this.metrics;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\FutureRequestExecutionService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */