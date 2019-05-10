package com.bumptech.glide;

import com.bumptech.glide.request.RequestFutureTarget;

class RequestBuilder$1
  implements Runnable
{
  RequestBuilder$1(RequestBuilder paramRequestBuilder, RequestFutureTarget paramRequestFutureTarget) {}
  
  public void run()
  {
    Object localObject = this.val$target;
    boolean bool = ((RequestFutureTarget)localObject).isCancelled();
    if (!bool)
    {
      localObject = this.this$0;
      RequestFutureTarget localRequestFutureTarget1 = this.val$target;
      RequestFutureTarget localRequestFutureTarget2 = this.val$target;
      ((RequestBuilder)localObject).into(localRequestFutureTarget1, localRequestFutureTarget2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\RequestBuilder$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */