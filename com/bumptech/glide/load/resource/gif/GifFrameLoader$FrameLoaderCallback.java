package com.bumptech.glide.load.resource.gif;

import android.os.Handler.Callback;
import android.os.Message;
import com.bumptech.glide.RequestManager;

class GifFrameLoader$FrameLoaderCallback
  implements Handler.Callback
{
  static final int MSG_CLEAR = 2;
  static final int MSG_DELAY = 1;
  
  GifFrameLoader$FrameLoaderCallback(GifFrameLoader paramGifFrameLoader) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = 1;
    int j = paramMessage.what;
    GifFrameLoader.DelayTarget localDelayTarget;
    if (j == i)
    {
      localDelayTarget = (GifFrameLoader.DelayTarget)paramMessage.obj;
      GifFrameLoader localGifFrameLoader = this.this$0;
      localGifFrameLoader.onFrameReady(localDelayTarget);
      j = i;
    }
    for (;;)
    {
      return j;
      int k = paramMessage.what;
      i = 2;
      if (k == i)
      {
        localDelayTarget = (GifFrameLoader.DelayTarget)paramMessage.obj;
        RequestManager localRequestManager = this.this$0.requestManager;
        localRequestManager.clear(localDelayTarget);
      }
      k = 0;
      localDelayTarget = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\GifFrameLoader$FrameLoaderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */