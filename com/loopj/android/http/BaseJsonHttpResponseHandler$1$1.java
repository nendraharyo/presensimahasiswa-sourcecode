package com.loopj.android.http;

import b.a.a.a.e;

class BaseJsonHttpResponseHandler$1$1
  implements Runnable
{
  BaseJsonHttpResponseHandler$1$1(BaseJsonHttpResponseHandler.1 param1, Object paramObject) {}
  
  public void run()
  {
    BaseJsonHttpResponseHandler localBaseJsonHttpResponseHandler = this.this$1.this$0;
    int i = this.this$1.val$statusCode;
    e[] arrayOfe = this.this$1.val$headers;
    String str = this.this$1.val$responseString;
    Object localObject = this.val$jsonResponse;
    localBaseJsonHttpResponseHandler.onSuccess(i, arrayOfe, str, localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\BaseJsonHttpResponseHandler$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */