package com.loopj.android.http;

import b.a.a.a.e;

public abstract class BaseJsonHttpResponseHandler
  extends TextHttpResponseHandler
{
  private static final String LOG_TAG = "BaseJsonHttpRH";
  
  public BaseJsonHttpResponseHandler()
  {
    this("UTF-8");
  }
  
  public BaseJsonHttpResponseHandler(String paramString)
  {
    super(paramString);
  }
  
  public final void onFailure(int paramInt, e[] paramArrayOfe, String paramString, Throwable paramThrowable)
  {
    Object localObject1;
    if (paramString != null)
    {
      localObject1 = new com/loopj/android/http/BaseJsonHttpResponseHandler$2;
      Object localObject2 = this;
      ((BaseJsonHttpResponseHandler.2)localObject1).<init>(this, paramString, paramInt, paramArrayOfe, paramThrowable);
      boolean bool = getUseSynchronousMode();
      if (!bool)
      {
        bool = getUsePoolThread();
        if (!bool)
        {
          localObject2 = new java/lang/Thread;
          ((Thread)localObject2).<init>((Runnable)localObject1);
          ((Thread)localObject2).start();
        }
      }
    }
    for (;;)
    {
      return;
      ((Runnable)localObject1).run();
      continue;
      localObject1 = this;
      int i = paramInt;
      onFailure(paramInt, paramArrayOfe, paramThrowable, null, null);
    }
  }
  
  public abstract void onFailure(int paramInt, e[] paramArrayOfe, Throwable paramThrowable, String paramString, Object paramObject);
  
  public final void onSuccess(int paramInt, e[] paramArrayOfe, String paramString)
  {
    boolean bool = false;
    Thread localThread = null;
    int i = 204;
    BaseJsonHttpResponseHandler.1 local1;
    if (paramInt != i)
    {
      local1 = new com/loopj/android/http/BaseJsonHttpResponseHandler$1;
      local1.<init>(this, paramString, paramInt, paramArrayOfe);
      bool = getUseSynchronousMode();
      if (!bool)
      {
        bool = getUsePoolThread();
        if (!bool)
        {
          localThread = new java/lang/Thread;
          localThread.<init>(local1);
          localThread.start();
        }
      }
    }
    for (;;)
    {
      return;
      local1.run();
      continue;
      onSuccess(paramInt, paramArrayOfe, null, null);
    }
  }
  
  public abstract void onSuccess(int paramInt, e[] paramArrayOfe, String paramString, Object paramObject);
  
  protected abstract Object parseResponse(String paramString, boolean paramBoolean);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\BaseJsonHttpResponseHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */