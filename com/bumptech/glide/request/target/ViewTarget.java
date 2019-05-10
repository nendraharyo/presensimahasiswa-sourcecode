package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;

public abstract class ViewTarget
  extends BaseTarget
{
  private static final String TAG = "ViewTarget";
  private static boolean isTagUsedAtLeastOnce;
  private static Integer tagId;
  private View.OnAttachStateChangeListener attachStateListener;
  private boolean isAttachStateListenerAdded;
  private boolean isClearedByUs;
  private final ViewTarget.SizeDeterminer sizeDeterminer;
  protected final View view;
  
  public ViewTarget(View paramView)
  {
    Object localObject = (View)Preconditions.checkNotNull(paramView);
    this.view = ((View)localObject);
    localObject = new com/bumptech/glide/request/target/ViewTarget$SizeDeterminer;
    ((ViewTarget.SizeDeterminer)localObject).<init>(paramView);
    this.sizeDeterminer = ((ViewTarget.SizeDeterminer)localObject);
  }
  
  public ViewTarget(View paramView, boolean paramBoolean)
  {
    this(paramView);
    if (paramBoolean) {
      waitForLayout();
    }
  }
  
  private Object getTag()
  {
    Object localObject = tagId;
    if (localObject == null) {}
    int i;
    for (localObject = this.view.getTag();; localObject = ((View)localObject).getTag(i))
    {
      return localObject;
      localObject = this.view;
      Integer localInteger = tagId;
      i = localInteger.intValue();
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
    Object localObject = tagId;
    if (localObject == null)
    {
      boolean bool = true;
      isTagUsedAtLeastOnce = bool;
      localObject = this.view;
      ((View)localObject).setTag(paramObject);
    }
    for (;;)
    {
      return;
      localObject = this.view;
      Integer localInteger = tagId;
      int i = localInteger.intValue();
      ((View)localObject).setTag(i, paramObject);
    }
  }
  
  public static void setTagId(int paramInt)
  {
    Object localObject = tagId;
    if (localObject == null)
    {
      boolean bool = isTagUsedAtLeastOnce;
      if (!bool) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("You cannot set the tag id more than once or change the tag id after the first request has been made");
      throw ((Throwable)localObject);
    }
    tagId = Integer.valueOf(paramInt);
  }
  
  public final ViewTarget clearOnDetach()
  {
    Object localObject = this.attachStateListener;
    if (localObject != null) {}
    for (;;)
    {
      return this;
      localObject = new com/bumptech/glide/request/target/ViewTarget$1;
      ((ViewTarget.1)localObject).<init>(this);
      this.attachStateListener = ((View.OnAttachStateChangeListener)localObject);
      maybeAddAttachStateListener();
    }
  }
  
  public Request getRequest()
  {
    Object localObject = getTag();
    boolean bool = false;
    if (localObject != null)
    {
      bool = localObject instanceof Request;
      if (!bool) {}
    }
    for (localObject = (Request)localObject;; localObject = null)
    {
      return (Request)localObject;
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("You must not call setTag() on a view Glide is targeting");
      throw ((Throwable)localObject);
    }
  }
  
  public void getSize(SizeReadyCallback paramSizeReadyCallback)
  {
    this.sizeDeterminer.getSize(paramSizeReadyCallback);
  }
  
  public View getView()
  {
    return this.view;
  }
  
  public void onLoadCleared(Drawable paramDrawable)
  {
    super.onLoadCleared(paramDrawable);
    ViewTarget.SizeDeterminer localSizeDeterminer = this.sizeDeterminer;
    localSizeDeterminer.clearCallbacksAndListener();
    boolean bool = this.isClearedByUs;
    if (!bool) {
      maybeRemoveAttachStateListener();
    }
  }
  
  public void onLoadStarted(Drawable paramDrawable)
  {
    super.onLoadStarted(paramDrawable);
    maybeAddAttachStateListener();
  }
  
  void pauseMyRequest()
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
  
  public void removeCallback(SizeReadyCallback paramSizeReadyCallback)
  {
    this.sizeDeterminer.removeCallback(paramSizeReadyCallback);
  }
  
  void resumeMyRequest()
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
  
  public void setRequest(Request paramRequest)
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
  
  public final ViewTarget waitForLayout()
  {
    this.sizeDeterminer.waitForLayout = true;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\ViewTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */