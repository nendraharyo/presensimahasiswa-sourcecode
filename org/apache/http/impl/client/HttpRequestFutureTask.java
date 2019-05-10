package org.apache.http.impl.client;

import java.util.concurrent.FutureTask;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;

public class HttpRequestFutureTask
  extends FutureTask
{
  private final HttpRequestTaskCallable callable;
  private final HttpUriRequest request;
  
  public HttpRequestFutureTask(HttpUriRequest paramHttpUriRequest, HttpRequestTaskCallable paramHttpRequestTaskCallable)
  {
    super(paramHttpRequestTaskCallable);
    this.request = paramHttpUriRequest;
    this.callable = paramHttpRequestTaskCallable;
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    Object localObject = this.callable;
    ((HttpRequestTaskCallable)localObject).cancel();
    if (paramBoolean)
    {
      localObject = this.request;
      ((HttpUriRequest)localObject).abort();
    }
    return super.cancel(paramBoolean);
  }
  
  public long endedTime()
  {
    boolean bool = isDone();
    if (bool) {
      return this.callable.getEnded();
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Task is not done yet");
    throw localIllegalStateException;
  }
  
  public long requestDuration()
  {
    boolean bool = isDone();
    if (bool)
    {
      long l1 = endedTime();
      long l2 = startedTime();
      return l1 - l2;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Task is not done yet");
    throw localIllegalStateException;
  }
  
  public long scheduledTime()
  {
    return this.callable.getScheduled();
  }
  
  public long startedTime()
  {
    return this.callable.getStarted();
  }
  
  public long taskDuration()
  {
    boolean bool = isDone();
    if (bool)
    {
      long l1 = endedTime();
      long l2 = scheduledTime();
      return l1 - l2;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Task is not done yet");
    throw localIllegalStateException;
  }
  
  public String toString()
  {
    return this.request.getRequestLine().getUri();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\HttpRequestFutureTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */