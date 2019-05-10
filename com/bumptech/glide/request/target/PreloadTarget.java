package com.bumptech.glide.request.target;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.transition.Transition;

public final class PreloadTarget
  extends SimpleTarget
{
  private static final Handler HANDLER;
  private static final int MESSAGE_CLEAR = 1;
  private final RequestManager requestManager;
  
  static
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    PreloadTarget.1 local1 = new com/bumptech/glide/request/target/PreloadTarget$1;
    local1.<init>();
    localHandler.<init>(localLooper, local1);
    HANDLER = localHandler;
  }
  
  private PreloadTarget(RequestManager paramRequestManager, int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.requestManager = paramRequestManager;
  }
  
  public static PreloadTarget obtain(RequestManager paramRequestManager, int paramInt1, int paramInt2)
  {
    PreloadTarget localPreloadTarget = new com/bumptech/glide/request/target/PreloadTarget;
    localPreloadTarget.<init>(paramRequestManager, paramInt1, paramInt2);
    return localPreloadTarget;
  }
  
  void clear()
  {
    this.requestManager.clear(this);
  }
  
  public void onResourceReady(Object paramObject, Transition paramTransition)
  {
    HANDLER.obtainMessage(1, this).sendToTarget();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\PreloadTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */