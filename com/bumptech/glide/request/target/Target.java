package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.transition.Transition;

public abstract interface Target
  extends LifecycleListener
{
  public static final int SIZE_ORIGINAL = Integer.MIN_VALUE;
  
  public abstract Request getRequest();
  
  public abstract void getSize(SizeReadyCallback paramSizeReadyCallback);
  
  public abstract void onLoadCleared(Drawable paramDrawable);
  
  public abstract void onLoadFailed(Drawable paramDrawable);
  
  public abstract void onLoadStarted(Drawable paramDrawable);
  
  public abstract void onResourceReady(Object paramObject, Transition paramTransition);
  
  public abstract void removeCallback(SizeReadyCallback paramSizeReadyCallback);
  
  public abstract void setRequest(Request paramRequest);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\Target.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */