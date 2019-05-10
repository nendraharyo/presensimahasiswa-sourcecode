package com.bumptech.glide.util;

import android.view.View;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.request.transition.Transition;

final class ViewPreloadSizeProvider$SizeViewTarget
  extends ViewTarget
{
  ViewPreloadSizeProvider$SizeViewTarget(View paramView, SizeReadyCallback paramSizeReadyCallback)
  {
    super(paramView);
    getSize(paramSizeReadyCallback);
  }
  
  public void onResourceReady(Object paramObject, Transition paramTransition) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\ViewPreloadSizeProvider$SizeViewTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */