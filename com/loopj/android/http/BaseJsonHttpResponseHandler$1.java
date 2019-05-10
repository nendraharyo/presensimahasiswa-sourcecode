package com.loopj.android.http;

import b.a.a.a.e;

class BaseJsonHttpResponseHandler$1
  implements Runnable
{
  BaseJsonHttpResponseHandler$1(BaseJsonHttpResponseHandler paramBaseJsonHttpResponseHandler, String paramString, int paramInt, e[] paramArrayOfe) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.this$0;
      localObject2 = this.val$responseString;
      localObject3 = null;
      localObject1 = ((BaseJsonHttpResponseHandler)localObject1).parseResponse((String)localObject2, false);
      localObject2 = this.this$0;
      localObject3 = new com/loopj/android/http/BaseJsonHttpResponseHandler$1$1;
      ((BaseJsonHttpResponseHandler.1.1)localObject3).<init>(this, localObject1);
      ((BaseJsonHttpResponseHandler)localObject2).postRunnable((Runnable)localObject3);
      return;
    }
    finally
    {
      for (;;)
      {
        Object localObject2 = AsyncHttpClient.log;
        String str = "parseResponse thrown an problem";
        ((LogInterface)localObject2).d("BaseJsonHttpRH", str, localThrowable);
        localObject2 = this.this$0;
        Object localObject3 = new com/loopj/android/http/BaseJsonHttpResponseHandler$1$2;
        ((BaseJsonHttpResponseHandler.1.2)localObject3).<init>(this, localThrowable);
        ((BaseJsonHttpResponseHandler)localObject2).postRunnable((Runnable)localObject3);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\BaseJsonHttpResponseHandler$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */