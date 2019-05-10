package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.bumptech.glide.R.id;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;

public abstract class CustomViewTarget
  implements Target
{
  private static final String TAG = "CustomViewTarget";
  private static final int VIEW_TAG_ID = R.id.glide_custom_view_target_tag;
  private View.OnAttachStateChangeListener attachStateListener;
  private boolean isAttachStateListenerAdded;
  private boolean isClearedByUs;
  private int overrideTag;
  private final CustomViewTarget.SizeDeterminer sizeDeterminer;
  protected final View view;
  
  public CustomViewTarget(View paramView)
  {
    Object localObject = (View)Preconditions.checkNotNull(paramView);
    this.view = ((View)localObject);
    localObject = new com/bumptech/glide/request/target/CustomViewTarget$SizeDeterminer;
    ((CustomViewTarget.SizeDeterminer)localObject).<init>(paramView);
    this.sizeDeterminer = ((CustomViewTarget.SizeDeterminer)localObject);
  }
  
  private Object getTag()
  {
    View localView = this.view;
    int i = this.overrideTag;
    if (i == 0) {}
    for (i = VIEW_TAG_ID;; i = this.overrideTag) {
      return localView.getTag(i);
    }
  }
  
  private void maybeAddAttachStateListener()
  {
    Object localObject = this.attachStateListener;
    boolean bool;
    if (localObject != null)
    {
      bool = this.isAttachStateListenerAdded;
      if (!bool) {
        break label19;
      }
    }
    for (;;)
    {
      return;
      label19:
      localObject = this.view;
      View.OnAttachStateChangeListener localOnAttachStateChangeListener = this.attachStateListener;
      ((View)localObject).addOnAttachStateChangeListener(localOnAttachStateChangeListener);
      bool = true;
      this.isAttachStateListenerAdded = bool;
    }
  }
  
  private void maybeRemoveAttachStateListener()
  {
    Object localObject = this.attachStateListener;
    boolean bool;
    if (localObject != null)
    {
      bool = this.isAttachStateListenerAdded;
      if (bool) {
        break label19;
      }
    }
    for (;;)
    {
      return;
      label19:
      localObject = this.view;
      View.OnAttachStateChangeListener localOnAttachStateChangeListener = this.attachStateListener;
      ((View)localObject).removeOnAttachStateChangeListener(localOnAttachStateChangeListener);
      bool = false;
      localObject = null;
      this.isAttachStateListenerAdded = false;
    }
  }
  
  private void setTag(Object paramObject)
  {
    View localView = this.view;
    int i = this.overrideTag;
    if (i == 0) {}
    for (i = VIEW_TAG_ID;; i = this.overrideTag)
    {
      localView.setTag(i, paramObject);
      return;
    }
  }
  
  public final CustomViewTarget clearOnDetach()
  {
    Object localObject = this.attachStateListener;
    if (localObject != null) {}
    for (;;)
    {
      return this;
      localObject = new com/bumptech/glide/request/target/CustomViewTarget$1;
      ((CustomViewTarget.1)localObject).<init>(this);
      this.attachStateListener = ((View.OnAttachStateChangeListener)localObject);
      maybeAddAttachStateListener();
    }
  }
  
  public final Request getRequest()
  {
    Object localObject = getTag();
    if (localObject != null)
    {
      boolean bool = localObject instanceof Request;
      if (!bool) {}
    }
    for (localObject = (Request)localObject;; localObject = null)
    {
      return (Request)localObject;
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("You must not pass non-R.id ids to setTag(id)");
      throw ((Throwable)localObject);
    }
  }
  
  public final void getSize(SizeReadyCallback paramSizeReadyCallback)
  {
    this.sizeDeterminer.getSize(paramSizeReadyCallback);
  }
  
  public final View getView()
  {
    return this.view;
  }
  
  public void onDestroy() {}
  
  public final void onLoadCleared(Drawable paramDrawable)
  {
    CustomViewTarget.SizeDeterminer localSizeDeterminer = this.sizeDeterminer;
    localSizeDeterminer.clearCallbacksAndListener();
    onResourceCleared(paramDrawable);
    boolean bool = this.isClearedByUs;
    if (!bool) {
      maybeRemoveAttachStateListener();
    }
  }
  
  public final void onLoadStarted(Drawable paramDrawable)
  {
    maybeAddAttachStateListener();
    onResourceLoading(paramDrawable);
  }
  
  protected abstract void onResourceCleared(Drawable paramDrawable);
  
  protected void onResourceLoading(Drawable paramDrawable) {}
  
  public void onStart() {}
  
  public void onStop() {}
  
  final void pauseMyRequest()
  {
    Request localRequest = getRequest();
    if (localRequest != null)
    {
      boolean bool = true;
      this.isClearedByUs = bool;
      localRequest.clear();
      localRequest = null;
      this.isClearedByUs = false;
    }
  }
  
  public final void removeCallback(SizeReadyCallback paramSizeReadyCallback)
  {
    this.sizeDeterminer.removeCallback(paramSizeReadyCallback);
  }
  
  final void resumeMyRequest()
  {
    Request localRequest = getRequest();
    if (localRequest != null)
    {
      boolean bool = localRequest.isCleared();
      if (bool) {
        localRequest.begin();
      }
    }
  }
  
  public final void setRequest(Request paramRequest)
  {
    setTag(paramRequest);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Target for: ");
    View localView = this.view;
    return localView;
  }
  
  public final CustomViewTarget useTagId(int paramInt)
  {
    int i = this.overrideTag;
    if (i != 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("You cannot change the tag id once it has been set.");
      throw localIllegalArgumentException;
    }
    this.overrideTag = paramInt;
    return this;
  }
  
  public final CustomViewTarget waitForLayout()
  {
    this.sizeDeterminer.waitForLayout = true;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\CustomViewTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */