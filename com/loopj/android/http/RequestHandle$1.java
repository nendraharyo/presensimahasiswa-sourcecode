package com.loopj.android.http;

class RequestHandle$1
  implements Runnable
{
  RequestHandle$1(RequestHandle paramRequestHandle, AsyncHttpRequest paramAsyncHttpRequest, boolean paramBoolean) {}
  
  public void run()
  {
    AsyncHttpRequest localAsyncHttpRequest = this.val$_request;
    boolean bool = this.val$mayInterruptIfRunning;
    localAsyncHttpRequest.cancel(bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\RequestHandle$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */