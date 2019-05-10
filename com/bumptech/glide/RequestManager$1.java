package com.bumptech.glide;

import com.bumptech.glide.manager.Lifecycle;

class RequestManager$1
  implements Runnable
{
  RequestManager$1(RequestManager paramRequestManager) {}
  
  public void run()
  {
    Lifecycle localLifecycle = this.this$0.lifecycle;
    RequestManager localRequestManager = this.this$0;
    localLifecycle.addListener(localRequestManager);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\RequestManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */