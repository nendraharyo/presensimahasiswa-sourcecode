package com.loopj.android.http;

import b.a.a.a.e;

class BaseJsonHttpResponseHandler$2$2
  implements Runnable
{
  BaseJsonHttpResponseHandler$2$2(BaseJsonHttpResponseHandler.2 param2) {}
  
  public void run()
  {
    BaseJsonHttpResponseHandler localBaseJsonHttpResponseHandler = this.this$1.this$0;
    int i = this.this$1.val$statusCode;
    e[] arrayOfe = this.this$1.val$headers;
    Throwable localThrowable = this.this$1.val$throwable;
    String str = this.this$1.val$responseString;
    localBaseJsonHttpResponseHandler.onFailure(i, arrayOfe, localThrowable, str, null);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\BaseJsonHttpResponseHandler$2$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */