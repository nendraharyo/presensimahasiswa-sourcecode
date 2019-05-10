package com.loopj.android.http;

import b.a.a.a.b.c.l;
import b.a.a.a.b.k;
import b.a.a.a.i.b.a;
import b.a.a.a.n.e;
import b.a.a.a.s;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicBoolean;

public class AsyncHttpRequest
  implements Runnable
{
  private boolean cancelIsNotified;
  private final a client;
  private final e context;
  private int executionCount;
  private final AtomicBoolean isCancelled;
  private volatile boolean isFinished;
  private boolean isRequestPreProcessed;
  private final l request;
  private final ResponseHandlerInterface responseHandler;
  
  public AsyncHttpRequest(a parama, e parame, l paraml, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    Object localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    this.isCancelled = ((AtomicBoolean)localObject);
    localObject = (a)Utils.notNull(parama, "client");
    this.client = ((a)localObject);
    localObject = (e)Utils.notNull(parame, "context");
    this.context = ((e)localObject);
    localObject = (l)Utils.notNull(paraml, "request");
    this.request = ((l)localObject);
    localObject = (ResponseHandlerInterface)Utils.notNull(paramResponseHandlerInterface, "responseHandler");
    this.responseHandler = ((ResponseHandlerInterface)localObject);
  }
  
  private void makeRequest()
  {
    boolean bool1 = isCancelled();
    if (bool1) {}
    for (;;)
    {
      return;
      Object localObject1 = this.request.getURI().getScheme();
      if (localObject1 == null)
      {
        localObject1 = new java/net/MalformedURLException;
        ((MalformedURLException)localObject1).<init>("No valid URI scheme was provided");
        throw ((Throwable)localObject1);
      }
      localObject1 = this.responseHandler;
      bool1 = localObject1 instanceof RangeFileAsyncHttpResponseHandler;
      if (bool1)
      {
        localObject1 = (RangeFileAsyncHttpResponseHandler)this.responseHandler;
        localObject2 = this.request;
        ((RangeFileAsyncHttpResponseHandler)localObject1).updateRequestHeaders((l)localObject2);
      }
      localObject1 = this.client;
      Object localObject2 = this.request;
      Object localObject3 = this.context;
      localObject1 = ((a)localObject1).a((l)localObject2, (e)localObject3);
      boolean bool2 = isCancelled();
      if (!bool2)
      {
        localObject2 = this.responseHandler;
        localObject3 = this.responseHandler;
        ((ResponseHandlerInterface)localObject2).onPreProcessResponse((ResponseHandlerInterface)localObject3, (s)localObject1);
        bool2 = isCancelled();
        if (!bool2)
        {
          localObject2 = this.responseHandler;
          ((ResponseHandlerInterface)localObject2).sendResponseMessage((s)localObject1);
          bool2 = isCancelled();
          if (!bool2)
          {
            localObject2 = this.responseHandler;
            localObject3 = this.responseHandler;
            ((ResponseHandlerInterface)localObject2).onPostProcessResponse((ResponseHandlerInterface)localObject3, (s)localObject1);
          }
        }
      }
    }
  }
  
  private void makeRequestWithRetries()
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    int j = 0;
    Object localObject1 = null;
    Object localObject3 = this.client;
    Object localObject5 = ((a)localObject3).z();
    int k = i;
    for (;;)
    {
      if (k != 0) {}
      try
      {
        makeRequest();
        return;
      }
      catch (UnknownHostException localUnknownHostException)
      {
        localObject3 = new java/io/IOException;
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        localObject7 = "UnknownHostException exception: ";
        localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
        localObject7 = localUnknownHostException.getMessage();
        localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
        localObject6 = ((StringBuilder)localObject6).toString();
        ((IOException)localObject3).<init>((String)localObject6);
        int n = this.executionCount;
        if (n > 0)
        {
          n = this.executionCount + 1;
          this.executionCount = n;
          localObject7 = this.context;
          j = ((k)localObject5).retryRequest(localUnknownHostException, n, (e)localObject7);
          if (j != 0)
          {
            j = i;
            k = j;
            localObject2 = localObject3;
            if (k == 0) {
              continue;
            }
            localObject6 = this.responseHandler;
            int i1 = this.executionCount;
            ((ResponseHandlerInterface)localObject6).sendRetryMessage(i1);
          }
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          AsyncHttpClient.log.e("AsyncHttpRequest", "Unhandled exception origin cause", localException);
          localObject2 = new java/io/IOException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject5 = "Unhandled exception: ";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
          String str = localException.getMessage();
          str = str;
          ((IOException)localObject2).<init>(str);
          throw ((Throwable)localObject2);
          j = 0;
          localObject2 = null;
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          Object localObject2 = new java/io/IOException;
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          Object localObject7 = "NPE in HttpClient: ";
          localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
          Object localObject4 = localNullPointerException.getMessage();
          localObject4 = ((StringBuilder)localObject6).append((String)localObject4);
          localObject4 = ((StringBuilder)localObject4).toString();
          ((IOException)localObject2).<init>((String)localObject4);
          k = this.executionCount + 1;
          this.executionCount = k;
          localObject6 = this.context;
          bool1 = ((k)localObject5).retryRequest((IOException)localObject2, k, (e)localObject6);
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Object localObject6;
          boolean bool1 = isCancelled();
          if (!bool1)
          {
            int m = this.executionCount + 1;
            this.executionCount = m;
            localObject6 = this.context;
            boolean bool2 = ((k)localObject5).retryRequest(localIOException, m, (e)localObject6);
          }
        }
      }
    }
  }
  
  private void sendCancelNotification()
  {
    try
    {
      boolean bool = this.isFinished;
      if (!bool)
      {
        Object localObject1 = this.isCancelled;
        bool = ((AtomicBoolean)localObject1).get();
        if (bool)
        {
          bool = this.cancelIsNotified;
          if (!bool)
          {
            bool = true;
            this.cancelIsNotified = bool;
            localObject1 = this.responseHandler;
            ((ResponseHandlerInterface)localObject1).sendCancelMessage();
          }
        }
      }
      return;
    }
    finally {}
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    this.isCancelled.set(true);
    this.request.abort();
    return isCancelled();
  }
  
  public Object getTag()
  {
    return this.responseHandler.getTag();
  }
  
  public boolean isCancelled()
  {
    AtomicBoolean localAtomicBoolean = this.isCancelled;
    boolean bool = localAtomicBoolean.get();
    if (bool) {
      sendCancelNotification();
    }
    return bool;
  }
  
  public boolean isDone()
  {
    boolean bool = isCancelled();
    if (!bool)
    {
      bool = this.isFinished;
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void onPostProcessRequest(AsyncHttpRequest paramAsyncHttpRequest) {}
  
  public void onPreProcessRequest(AsyncHttpRequest paramAsyncHttpRequest) {}
  
  public void run()
  {
    String str1 = null;
    boolean bool1 = true;
    boolean bool2 = isCancelled();
    if (bool2) {}
    for (;;)
    {
      return;
      bool2 = this.isRequestPreProcessed;
      if (!bool2)
      {
        this.isRequestPreProcessed = bool1;
        onPreProcessRequest(this);
      }
      bool2 = isCancelled();
      if (bool2) {
        continue;
      }
      ResponseHandlerInterface localResponseHandlerInterface = this.responseHandler;
      localResponseHandlerInterface.sendStartMessage();
      bool2 = isCancelled();
      if (bool2) {
        continue;
      }
      try
      {
        makeRequestWithRetries();
        bool2 = isCancelled();
        if (bool2) {
          continue;
        }
        localResponseHandlerInterface = this.responseHandler;
        localResponseHandlerInterface.sendFinishMessage();
        bool2 = isCancelled();
        if (bool2) {
          continue;
        }
        onPostProcessRequest(this);
        this.isFinished = bool1;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          boolean bool3 = isCancelled();
          Object localObject;
          String str2;
          if (!bool3)
          {
            localObject = this.responseHandler;
            str2 = null;
            ((ResponseHandlerInterface)localObject).sendFailureMessage(0, null, null, localIOException);
          }
          else
          {
            localObject = AsyncHttpClient.log;
            str2 = "AsyncHttpRequest";
            str1 = "makeRequestWithRetries returned error";
            ((LogInterface)localObject).e(str2, str1, localIOException);
          }
        }
      }
    }
  }
  
  public AsyncHttpRequest setRequestTag(Object paramObject)
  {
    this.responseHandler.setTag(paramObject);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\AsyncHttpRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */