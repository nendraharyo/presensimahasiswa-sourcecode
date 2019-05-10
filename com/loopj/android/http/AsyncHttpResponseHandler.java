package com.loopj.android.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b.a.a.a.af;
import b.a.a.a.b.l;
import b.a.a.a.e;
import b.a.a.a.k;
import b.a.a.a.o.c;
import b.a.a.a.s;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;

public abstract class AsyncHttpResponseHandler
  implements ResponseHandlerInterface
{
  protected static final int BUFFER_SIZE = 4096;
  protected static final int CANCEL_MESSAGE = 6;
  public static final String DEFAULT_CHARSET = "UTF-8";
  protected static final int FAILURE_MESSAGE = 1;
  protected static final int FINISH_MESSAGE = 3;
  private static final String LOG_TAG = "AsyncHttpRH";
  protected static final int PROGRESS_MESSAGE = 4;
  protected static final int RETRY_MESSAGE = 5;
  protected static final int START_MESSAGE = 2;
  protected static final int SUCCESS_MESSAGE = 0;
  public static final String UTF8_BOM = "﻿";
  private WeakReference TAG;
  private Handler handler;
  private Looper looper = null;
  private e[] requestHeaders = null;
  private URI requestURI = null;
  private String responseCharset = "UTF-8";
  private boolean usePoolThread;
  private boolean useSynchronousMode;
  
  public AsyncHttpResponseHandler()
  {
    this(null);
  }
  
  public AsyncHttpResponseHandler(Looper paramLooper)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(null);
    this.TAG = localWeakReference;
    if (paramLooper == null) {
      paramLooper = Looper.myLooper();
    }
    this.looper = paramLooper;
    setUseSynchronousMode(false);
    setUsePoolThread(false);
  }
  
  public AsyncHttpResponseHandler(boolean paramBoolean)
  {
    Object localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(null);
    this.TAG = ((WeakReference)localObject);
    setUsePoolThread(paramBoolean);
    boolean bool = getUsePoolThread();
    if (!bool)
    {
      localObject = Looper.myLooper();
      this.looper = ((Looper)localObject);
      bool = false;
      localObject = null;
      setUseSynchronousMode(false);
    }
  }
  
  public String getCharset()
  {
    String str = this.responseCharset;
    if (str == null) {}
    for (str = "UTF-8";; str = this.responseCharset) {
      return str;
    }
  }
  
  public e[] getRequestHeaders()
  {
    return this.requestHeaders;
  }
  
  public URI getRequestURI()
  {
    return this.requestURI;
  }
  
  byte[] getResponseData(k paramk)
  {
    int i = 4096;
    long l1 = 0L;
    boolean bool2 = false;
    InputStream localInputStream;
    long l2;
    long l3;
    Object localObject1;
    if (paramk != null)
    {
      localInputStream = paramk.getContent();
      if (localInputStream != null)
      {
        l2 = paramk.getContentLength();
        l3 = 2147483647L;
        bool2 = l2 < l3;
        if (bool2)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject1).<init>("HTTP entity too large to be buffered in memory");
          throw ((Throwable)localObject1);
        }
        bool2 = l2 < l1;
        if (bool2) {}
      }
    }
    for (;;)
    {
      try
      {
        c localc = new b/a/a/a/o/c;
        localc.<init>(i);
        i = 4096;
        try
        {
          byte[] arrayOfByte = new byte[i];
          long l4 = l1;
          int k = localInputStream.read(arrayOfByte);
          int m = -1;
          if (k != m)
          {
            Thread localThread = Thread.currentThread();
            boolean bool3 = localThread.isInterrupted();
            if (!bool3)
            {
              l3 = k + l4;
              i = 0;
              localObject1 = null;
              localc.a(arrayOfByte, 0, k);
              boolean bool1 = l2 < l1;
              if (!bool1)
              {
                l4 = 1L;
                sendProgressMessage(l3, l4);
                l4 = l3;
                continue;
                j = (int)l2;
                continue;
              }
              l4 = l2;
              continue;
            }
          }
          AsyncHttpClient.silentCloseInputStream(localInputStream);
          AsyncHttpClient.endEntityViaReflection(paramk);
          localObject1 = localc.b();
          return (byte[])localObject1;
        }
        finally
        {
          AsyncHttpClient.silentCloseInputStream(localInputStream);
          AsyncHttpClient.endEntityViaReflection(paramk);
        }
        int j = 0;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        System.gc();
        localIOException = new java/io/IOException;
        localIOException.<init>("File too large to fit into available memory");
        throw localIOException;
      }
      IOException localIOException = null;
    }
  }
  
  public Object getTag()
  {
    return this.TAG.get();
  }
  
  public boolean getUsePoolThread()
  {
    return this.usePoolThread;
  }
  
  public boolean getUseSynchronousMode()
  {
    return this.useSynchronousMode;
  }
  
  protected void handleMessage(Message paramMessage)
  {
    i = 3;
    j = 2;
    k = 1;
    for (;;)
    {
      try
      {
        m = paramMessage.what;
        switch (m)
        {
        default: 
          return;
        }
      }
      finally
      {
        Object localObject1;
        onUserException(localThrowable1);
        continue;
        Object localObject2 = AsyncHttpClient.log;
        Object localObject4 = "AsyncHttpRH";
        Object localObject5 = "SUCCESS_MESSAGE didn't got enough params";
        ((LogInterface)localObject2).e((String)localObject4, (String)localObject5);
        continue;
        localObject2 = paramMessage.obj;
        localObject2 = (Object[])localObject2;
        localObject2 = (Object[])localObject2;
        if (localObject2 == null) {
          continue;
        }
        int n = localObject2.length;
        k = 4;
        if (n < k) {
          continue;
        }
        n = 0;
        localObject4 = null;
        localObject4 = localObject2[0];
        localObject4 = (Integer)localObject4;
        j = ((Integer)localObject4).intValue();
        n = 1;
        localObject4 = localObject2[n];
        localObject4 = (e[])localObject4;
        localObject4 = (e[])localObject4;
        k = 2;
        localObject5 = localObject2[k];
        localObject5 = (byte[])localObject5;
        localObject5 = (byte[])localObject5;
        i = 3;
        localObject2 = localObject2[i];
        localObject2 = (Throwable)localObject2;
        onFailure(j, (e[])localObject4, (byte[])localObject5, (Throwable)localObject2);
        continue;
        localObject2 = AsyncHttpClient.log;
        localObject4 = "AsyncHttpRH";
        localObject5 = "FAILURE_MESSAGE didn't got enough params";
        ((LogInterface)localObject2).e((String)localObject4, (String)localObject5);
        continue;
        onStart();
        continue;
        onFinish();
        continue;
        localObject2 = paramMessage.obj;
        localObject2 = (Object[])localObject2;
        localObject2 = (Object[])localObject2;
        if (localObject2 == null) {
          continue;
        }
        n = localObject2.length;
        if (n < j) {
          continue;
        }
        n = 0;
        localObject4 = null;
        try
        {
          localObject4 = localObject2[0];
          localObject4 = (Long)localObject4;
          long l1 = ((Long)localObject4).longValue();
          n = 1;
          localObject2 = localObject2[n];
          localObject2 = (Long)localObject2;
          long l2 = ((Long)localObject2).longValue();
          onProgress(l1, l2);
          continue;
        }
        finally
        {
          localObject4 = AsyncHttpClient.log;
          localObject5 = "AsyncHttpRH";
          String str = "custom onProgress contains an error";
          ((LogInterface)localObject4).e((String)localObject5, str, localThrowable2);
        }
        continue;
        Object localObject3 = AsyncHttpClient.log;
        localObject4 = "AsyncHttpRH";
        localObject5 = "PROGRESS_MESSAGE didn't got enough params";
        ((LogInterface)localObject3).e((String)localObject4, (String)localObject5);
        continue;
        localObject3 = paramMessage.obj;
        localObject3 = (Object[])localObject3;
        localObject3 = (Object[])localObject3;
        if (localObject3 == null) {
          continue;
        }
        n = localObject3.length;
        if (n != k) {
          continue;
        }
        n = 0;
        localObject4 = null;
        localObject3 = localObject3[0];
        localObject3 = (Integer)localObject3;
        int m = ((Integer)localObject3).intValue();
        onRetry(m);
        continue;
        localObject3 = AsyncHttpClient.log;
        localObject4 = "AsyncHttpRH";
        localObject5 = "RETRY_MESSAGE didn't get enough params";
        ((LogInterface)localObject3).e((String)localObject4, (String)localObject5);
        continue;
        onCancel();
        continue;
      }
      localObject1 = paramMessage.obj;
      localObject1 = (Object[])localObject1;
      localObject1 = (Object[])localObject1;
      if (localObject1 == null) {
        continue;
      }
      n = localObject1.length;
      if (n < i) {
        continue;
      }
      n = 0;
      localObject4 = null;
      localObject4 = localObject1[0];
      localObject4 = (Integer)localObject4;
      k = ((Integer)localObject4).intValue();
      n = 1;
      localObject4 = localObject1[n];
      localObject4 = (e[])localObject4;
      localObject4 = (e[])localObject4;
      j = 2;
      localObject1 = localObject1[j];
      localObject1 = (byte[])localObject1;
      localObject1 = (byte[])localObject1;
      onSuccess(k, (e[])localObject4, (byte[])localObject1);
    }
  }
  
  protected Message obtainMessage(int paramInt, Object paramObject)
  {
    return Message.obtain(this.handler, paramInt, paramObject);
  }
  
  public void onCancel()
  {
    AsyncHttpClient.log.d("AsyncHttpRH", "Request got cancelled");
  }
  
  public abstract void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable);
  
  public void onFinish() {}
  
  public void onPostProcessResponse(ResponseHandlerInterface paramResponseHandlerInterface, s params) {}
  
  public void onPreProcessResponse(ResponseHandlerInterface paramResponseHandlerInterface, s params) {}
  
  public void onProgress(long paramLong1, long paramLong2)
  {
    LogInterface localLogInterface = AsyncHttpClient.log;
    String str1 = "AsyncHttpRH";
    String str2 = "Progress %d from %d (%2.0f%%)";
    Object[] arrayOfObject = new Object[3];
    Object localObject = null;
    Long localLong = Long.valueOf(paramLong1);
    arrayOfObject[0] = localLong;
    localLong = Long.valueOf(paramLong2);
    arrayOfObject[1] = localLong;
    int i = 2;
    long l = 0L;
    double d1 = 0.0D;
    boolean bool = paramLong2 < l;
    double d2;
    if (bool)
    {
      d1 = paramLong1 * 1.0D;
      d2 = paramLong2;
      d1 /= d2;
      d2 = 100.0D;
    }
    for (d1 *= d2;; d1 = -1.0D)
    {
      localObject = Double.valueOf(d1);
      arrayOfObject[i] = localObject;
      localObject = String.format(str2, arrayOfObject);
      localLogInterface.v(str1, (String)localObject);
      return;
      l = -4616189618054758400L;
    }
  }
  
  public void onRetry(int paramInt)
  {
    LogInterface localLogInterface = AsyncHttpClient.log;
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    String str = String.format("Request retry no. %d", arrayOfObject);
    localLogInterface.d("AsyncHttpRH", str);
  }
  
  public void onStart() {}
  
  public abstract void onSuccess(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte);
  
  public void onUserException(Throwable paramThrowable)
  {
    AsyncHttpClient.log.e("AsyncHttpRH", "User-space exception detected!", paramThrowable);
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    localRuntimeException.<init>(paramThrowable);
    throw localRuntimeException;
  }
  
  protected void postRunnable(Runnable paramRunnable)
  {
    Handler localHandler;
    if (paramRunnable != null)
    {
      boolean bool = getUseSynchronousMode();
      if (!bool)
      {
        localHandler = this.handler;
        if (localHandler != null) {
          break label29;
        }
      }
      paramRunnable.run();
    }
    for (;;)
    {
      return;
      label29:
      localHandler = this.handler;
      localHandler.post(paramRunnable);
    }
  }
  
  public final void sendCancelMessage()
  {
    Message localMessage = obtainMessage(6, null);
    sendMessage(localMessage);
  }
  
  public final void sendFailureMessage(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    int i = 1;
    Object localObject = new Object[4];
    Integer localInteger = Integer.valueOf(paramInt);
    localObject[0] = localInteger;
    localObject[i] = paramArrayOfe;
    localObject[2] = paramArrayOfByte;
    localObject[3] = paramThrowable;
    localObject = obtainMessage(i, localObject);
    sendMessage((Message)localObject);
  }
  
  public final void sendFinishMessage()
  {
    Message localMessage = obtainMessage(3, null);
    sendMessage(localMessage);
  }
  
  protected void sendMessage(Message paramMessage)
  {
    boolean bool = getUseSynchronousMode();
    if (!bool)
    {
      localObject = this.handler;
      if (localObject != null) {}
    }
    else
    {
      handleMessage(paramMessage);
    }
    do
    {
      return;
      localObject = Thread.currentThread();
      bool = ((Thread)localObject).isInterrupted();
    } while (bool);
    Object localObject = this.handler;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      String str = "handler should not be null!";
      Utils.asserts(bool, str);
      localObject = this.handler;
      ((Handler)localObject).sendMessage(paramMessage);
      break;
      bool = false;
      localObject = null;
    }
  }
  
  public final void sendProgressMessage(long paramLong1, long paramLong2)
  {
    Object[] arrayOfObject = new Object[2];
    Long localLong = Long.valueOf(paramLong1);
    arrayOfObject[0] = localLong;
    localLong = Long.valueOf(paramLong2);
    arrayOfObject[1] = localLong;
    Message localMessage = obtainMessage(4, arrayOfObject);
    sendMessage(localMessage);
  }
  
  public void sendResponseMessage(s params)
  {
    Object localObject1 = Thread.currentThread();
    boolean bool1 = ((Thread)localObject1).isInterrupted();
    Object localObject2;
    Object localObject3;
    if (!bool1)
    {
      localObject1 = params.a();
      localObject2 = params.b();
      localObject2 = getResponseData((k)localObject2);
      localObject3 = Thread.currentThread();
      boolean bool2 = ((Thread)localObject3).isInterrupted();
      if (!bool2)
      {
        int j = ((af)localObject1).b();
        int k = 300;
        if (j < k) {
          break label130;
        }
        j = ((af)localObject1).b();
        e[] arrayOfe = params.getAllHeaders();
        l locall = new b/a/a/a/b/l;
        int m = ((af)localObject1).b();
        localObject1 = ((af)localObject1).c();
        locall.<init>(m, (String)localObject1);
        sendFailureMessage(j, arrayOfe, (byte[])localObject2, locall);
      }
    }
    for (;;)
    {
      return;
      label130:
      int i = ((af)localObject1).b();
      localObject3 = params.getAllHeaders();
      sendSuccessMessage(i, (e[])localObject3, (byte[])localObject2);
    }
  }
  
  public final void sendRetryMessage(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    Message localMessage = obtainMessage(5, arrayOfObject);
    sendMessage(localMessage);
  }
  
  public final void sendStartMessage()
  {
    Message localMessage = obtainMessage(2, null);
    sendMessage(localMessage);
  }
  
  public final void sendSuccessMessage(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte)
  {
    Object localObject = new Object[3];
    Integer localInteger = Integer.valueOf(paramInt);
    localObject[0] = localInteger;
    localObject[1] = paramArrayOfe;
    localObject[2] = paramArrayOfByte;
    localObject = obtainMessage(0, localObject);
    sendMessage((Message)localObject);
  }
  
  public void setCharset(String paramString)
  {
    this.responseCharset = paramString;
  }
  
  public void setRequestHeaders(e[] paramArrayOfe)
  {
    this.requestHeaders = paramArrayOfe;
  }
  
  public void setRequestURI(URI paramURI)
  {
    this.requestURI = paramURI;
  }
  
  public void setTag(Object paramObject)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramObject);
    this.TAG = localWeakReference;
  }
  
  public void setUsePoolThread(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.looper = null;
      this.handler = null;
    }
    this.usePoolThread = paramBoolean;
  }
  
  public void setUseSynchronousMode(boolean paramBoolean)
  {
    Object localObject1;
    Object localObject2;
    if (!paramBoolean)
    {
      localObject1 = this.looper;
      if (localObject1 == null)
      {
        paramBoolean = true;
        localObject1 = AsyncHttpClient.log;
        localObject2 = "AsyncHttpRH";
        String str = "Current thread has not called Looper.prepare(). Forcing synchronous mode.";
        ((LogInterface)localObject1).w((String)localObject2, str);
      }
    }
    if (!paramBoolean)
    {
      localObject1 = this.handler;
      if (localObject1 == null)
      {
        localObject1 = new com/loopj/android/http/AsyncHttpResponseHandler$ResponderHandler;
        localObject2 = this.looper;
        ((AsyncHttpResponseHandler.ResponderHandler)localObject1).<init>(this, (Looper)localObject2);
        this.handler = ((Handler)localObject1);
      }
    }
    for (;;)
    {
      this.useSynchronousMode = paramBoolean;
      return;
      if (paramBoolean)
      {
        localObject1 = this.handler;
        if (localObject1 != null)
        {
          localObject1 = null;
          this.handler = null;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\AsyncHttpResponseHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */