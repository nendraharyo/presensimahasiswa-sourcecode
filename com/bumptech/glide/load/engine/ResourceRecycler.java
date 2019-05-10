package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.util.Util;

class ResourceRecycler
{
  private final Handler handler;
  private boolean isRecycling;
  
  ResourceRecycler()
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    ResourceRecycler.ResourceRecyclerCallback localResourceRecyclerCallback = new com/bumptech/glide/load/engine/ResourceRecycler$ResourceRecyclerCallback;
    localResourceRecyclerCallback.<init>();
    localHandler.<init>(localLooper, localResourceRecyclerCallback);
    this.handler = localHandler;
  }
  
  void recycle(Resource paramResource)
  {
    int i = 1;
    Util.assertMainThread();
    boolean bool = this.isRecycling;
    Message localMessage;
    if (bool)
    {
      localMessage = this.handler.obtainMessage(i, paramResource);
      localMessage.sendToTarget();
    }
    for (;;)
    {
      return;
      this.isRecycling = i;
      paramResource.recycle();
      bool = false;
      localMessage = null;
      this.isRecycling = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\ResourceRecycler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */