package com.loopj.android.http;

import java.util.List;

class AsyncHttpClient$4
  implements Runnable
{
  AsyncHttpClient$4(AsyncHttpClient paramAsyncHttpClient, List paramList, boolean paramBoolean) {}
  
  public void run()
  {
    AsyncHttpClient localAsyncHttpClient = this.this$0;
    List localList = this.val$requestList;
    boolean bool = this.val$mayInterruptIfRunning;
    AsyncHttpClient.access$100(localAsyncHttpClient, localList, bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\AsyncHttpClient$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */