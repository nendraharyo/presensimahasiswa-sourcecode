package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.request.transition.Transition.ViewAdapter;

public abstract class ImageViewTarget
  extends ViewTarget
  implements Transition.ViewAdapter
{
  private Animatable animatable;
  
  public ImageViewTarget(ImageView paramImageView)
  {
    super(paramImageView);
  }
  
  public ImageViewTarget(ImageView paramImageView, boolean paramBoolean)
  {
    super(paramImageView, paramBoolean);
  }
  
  private void maybeUpdateAnimatable(Object paramObject)
  {
    boolean bool = paramObject instanceof Animatable;
    Animatable localAnimatable;
    if (bool)
    {
      paramObject = (Animatable)paramObject;
      this.animatable = ((Animatable)paramObject);
      localAnimatable = this.animatable;
      localAnimatable.start();
    }
    for (;;)
    {
      return;
      bool = false;
      localAnimatable = null;
      this.animatable = null;
    }
  }
  
  private void setResourceInternal(Object paramObject)
  {
    setResource(paramObject);
    maybeUpdateAnimatable(paramObject);
  }
  
  public Drawable getCurrentDrawable()
  {
    return ((ImageView)this.view).getDrawable();
  }
  
  public void onLoadCleared(Drawable paramDrawable)
  {
    super.onLoadCleared(paramDrawable);
    Animatable localAnimatable = this.animatable;
    if (localAnimatable != null)
    {
      localAnimatable = this.animatable;
      localAnimatable.stop();
    }
    setResourceInternal(null);
    setDrawable(paramDrawable);
  }
  
  public void onLoadFailed(Drawable paramDrawable)
  {
    super.onLoadFailed(paramDrawable);
    setResourceInternal(null);
    setDrawable(paramDrawable);
  }
  
  public void onLoadStarted(Drawable paramDrawable)
  {
    super.onLoadStarted(paramDrawable);
    setResourceInternal(null);
    setDrawable(paramDrawable);
  }
  
  public void onResourceReady(Object paramObject, Transition paramTransition)
  {
    if (paramTransition != null)
    {
      boolean bool = paramTransition.transition(paramObject, this);
      if (bool) {}
    }
    else
    {
      setResourceInternal(paramObject);
    }
    for (;;)
    {
      return;
      maybeUpdateAnimatable(paramObject);
    }
  }
  
  public void onStart()
  {
    Animatable localAnimatable = this.animatable;
    if (localAnimatable != null)
    {
      localAnimatable = this.animatable;
      localAnimatable.start();
    }
  }
  
  public void onStop()
  {
    Animatable localAnimatable = this.animatable;
    if (localAnimatable != null)
    {
      localAnimatable = this.animatable;
      localAnimatable.stop();
    }
  }
  
  public void setDrawable(Drawable paramDrawable)
  {
    ((ImageView)this.view).setImageDrawable(paramDrawable);
  }
  
  protected abstract void setResource(Object paramObject);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\ImageViewTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */