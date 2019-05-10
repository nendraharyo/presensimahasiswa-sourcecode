package com.bumptech.glide;

import com.bumptech.glide.request.target.BaseTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;

final class ListPreloader$PreloadTarget
  extends BaseTarget
{
  int photoHeight;
  int photoWidth;
  
  public void getSize(SizeReadyCallback paramSizeReadyCallback)
  {
    int i = this.photoWidth;
    int j = this.photoHeight;
    paramSizeReadyCallback.onSizeReady(i, j);
  }
  
  public void onResourceReady(Object paramObject, Transition paramTransition) {}
  
  public void removeCallback(SizeReadyCallback paramSizeReadyCallback) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\ListPreloader$PreloadTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */