package com.loopj.android.http;

import b.a.a.a.e;

class BaseJsonHttpResponseHandler$2
  implements Runnable
{
  BaseJsonHttpResponseHandler$2(BaseJsonHttpResponseHandler paramBaseJsonHttpResponseHandler, String paramString, int paramInt, e[] paramArrayOfe, Throwable paramThrowable) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.this$0;
      localObject2 = this.val$responseString;
      boolean bool = true;
      localObject1 = ((BaseJsonHttpResponseHandler)localObject1).parseResponse((String)localObject2, bool);
      localObject2 = this.this$0;
      localObject3 = new com/loopj/android/http/BaseJsonHttpResponseHandler$2$1;
      ((BaseJsonHttpResponseHandler.2.1)localObject3).<init>(this, localObject1);
      ((BaseJsonHttpResponseHandler)localObject2).postRunnable((Runnable)localObject3);
      return;
    }
    finally
    {
      for (;;)
      {
        Object localObject2 = AsyncHttpClient.log;
        Object localObject3 = "BaseJsonHttpRH";
        String str = "parseResponse thrown an problem";
        ((LogInterface)localObject2).d((String)localObject3, str, localThrowable);
        BaseJsonHttpResponseHandler localBaseJsonHttpResponseHandler = this.this$0;
        localObject2 = new com/loopj/android/http/BaseJsonHttpResponseHandler$2$2;
        ((BaseJsonHttpResponseHandler.2.2)localObject2).<init>(this);
        localBaseJsonHttpResponseHandler.postRunnable((Runnable)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\BaseJsonHttpResponseHandler$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */