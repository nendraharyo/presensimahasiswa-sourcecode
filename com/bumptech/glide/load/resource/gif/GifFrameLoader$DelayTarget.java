package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

class GifFrameLoader$DelayTarget
  extends SimpleTarget
{
  private final Handler handler;
  final int index;
  private Bitmap resource;
  private final long targetTime;
  
  GifFrameLoader$DelayTarget(Handler paramHandler, int paramInt, long paramLong)
  {
    this.handler = paramHandler;
    this.index = paramInt;
    this.targetTime = paramLong;
  }
  
  Bitmap getResource()
  {
    return this.resource;
  }
  
  public void onResourceReady(Bitmap paramBitmap, Transition paramTransition)
  {
    this.resource = paramBitmap;
    Message localMessage = this.handler.obtainMessage(1, this);
    Handler localHandler = this.handler;
    long l = this.targetTime;
    localHandler.sendMessageAtTime(localMessage, l);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\GifFrameLoader$DelayTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */