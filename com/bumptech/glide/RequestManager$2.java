package com.bumptech.glide;

import com.bumptech.glide.request.target.Target;

class RequestManager$2
  implements Runnable
{
  RequestManager$2(RequestManager paramRequestManager, Target paramTarget) {}
  
  public void run()
  {
    RequestManager localRequestManager = this.this$0;
    Target localTarget = this.val$target;
    localRequestManager.clear(localTarget);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\RequestManager$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */