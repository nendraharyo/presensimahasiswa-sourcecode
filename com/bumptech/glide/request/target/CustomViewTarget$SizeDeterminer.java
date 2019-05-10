package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class CustomViewTarget$SizeDeterminer
{
  private static final int PENDING_SIZE;
  static Integer maxDisplayLength;
  private final List cbs;
  private CustomViewTarget.SizeDeterminer.SizeDeterminerLayoutListener layoutListener;
  private final View view;
  boolean waitForLayout;
  
  CustomViewTarget$SizeDeterminer(View paramView)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.cbs = localArrayList;
    this.view = paramView;
  }
  
  private static int getMaxDisplayLength(Context paramContext)
  {
    Object localObject = maxDisplayLength;
    if (localObject == null)
    {
      localObject = ((WindowManager)Preconditions.checkNotNull((WindowManager)paramContext.getSystemService("window"))).getDefaultDisplay();
      Point localPoint = new android/graphics/Point;
      localPoint.<init>();
      ((Display)localObject).getSize(localPoint);
      int i = localPoint.x;
      int j = localPoint.y;
      i = Math.max(i, j);
      localObject = Integer.valueOf(i);
      maxDisplayLength = (Integer)localObject;
    }
    return maxDisplayLength.intValue();
  }
  
  private int getTargetDimen(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    String str = null;
    int j = paramInt2 - paramInt3;
    if (j > 0) {}
    for (;;)
    {
      return j;
      boolean bool1 = this.waitForLayout;
      Object localObject;
      if (bool1)
      {
        localObject = this.view;
        bool1 = ((View)localObject).isLayoutRequested();
        if (bool1)
        {
          bool1 = false;
          localObject = null;
          continue;
        }
      }
      int k = paramInt1 - paramInt3;
      if (k <= 0)
      {
        localObject = this.view;
        boolean bool2 = ((View)localObject).isLayoutRequested();
        if (!bool2)
        {
          int m = -2;
          if (paramInt2 == m)
          {
            localObject = "CustomViewTarget";
            i = 4;
            boolean bool3 = Log.isLoggable((String)localObject, i);
            if (bool3)
            {
              localObject = "CustomViewTarget";
              str = "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.";
              Log.i((String)localObject, str);
            }
            localObject = this.view.getContext();
            n = getMaxDisplayLength((Context)localObject);
            continue;
          }
        }
        int n = 0;
        localObject = null;
      }
    }
  }
  
  private int getTargetHeight()
  {
    int i = this.view.getPaddingTop();
    View localView = this.view;
    int j = localView.getPaddingBottom() + i;
    ViewGroup.LayoutParams localLayoutParams = this.view.getLayoutParams();
    if (localLayoutParams != null) {
      i = localLayoutParams.height;
    }
    for (;;)
    {
      int k = this.view.getHeight();
      return getTargetDimen(k, i, j);
      i = 0;
      localLayoutParams = null;
    }
  }
  
  private int getTargetWidth()
  {
    int i = this.view.getPaddingLeft();
    View localView = this.view;
    int j = localView.getPaddingRight() + i;
    ViewGroup.LayoutParams localLayoutParams = this.view.getLayoutParams();
    if (localLayoutParams != null) {
      i = localLayoutParams.width;
    }
    for (;;)
    {
      int k = this.view.getWidth();
      return getTargetDimen(k, i, j);
      i = 0;
      localLayoutParams = null;
    }
  }
  
  private boolean isDimensionValid(int paramInt)
  {
    if (paramInt <= 0)
    {
      i = -1 << -1;
      if (paramInt != i) {
        break label17;
      }
    }
    label17:
    for (int i = 1;; i = 0) {
      return i;
    }
  }
  
  private boolean isViewStateAndSizeValid(int paramInt1, int paramInt2)
  {
    boolean bool = isDimensionValid(paramInt1);
    if (bool)
    {
      bool = isDimensionValid(paramInt2);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void notifyCbs(int paramInt1, int paramInt2)
  {
    Object localObject1 = new java/util/ArrayList;
    Object localObject2 = this.cbs;
    ((ArrayList)localObject1).<init>((Collection)localObject2);
    localObject2 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (SizeReadyCallback)((Iterator)localObject2).next();
      ((SizeReadyCallback)localObject1).onSizeReady(paramInt1, paramInt2);
    }
  }
  
  void checkCurrentDimens()
  {
    List localList = this.cbs;
    boolean bool1 = localList.isEmpty();
    if (bool1) {}
    for (;;)
    {
      return;
      int i = getTargetWidth();
      int j = getTargetHeight();
      boolean bool2 = isViewStateAndSizeValid(i, j);
      if (bool2)
      {
        notifyCbs(i, j);
        clearCallbacksAndListener();
      }
    }
  }
  
  void clearCallbacksAndListener()
  {
    ViewTreeObserver localViewTreeObserver = this.view.getViewTreeObserver();
    boolean bool = localViewTreeObserver.isAlive();
    if (bool)
    {
      CustomViewTarget.SizeDeterminer.SizeDeterminerLayoutListener localSizeDeterminerLayoutListener = this.layoutListener;
      localViewTreeObserver.removeOnPreDrawListener(localSizeDeterminerLayoutListener);
    }
    this.layoutListener = null;
    this.cbs.clear();
  }
  
  void getSize(SizeReadyCallback paramSizeReadyCallback)
  {
    int i = getTargetWidth();
    int j = getTargetHeight();
    boolean bool2 = isViewStateAndSizeValid(i, j);
    if (bool2) {
      paramSizeReadyCallback.onSizeReady(i, j);
    }
    for (;;)
    {
      return;
      Object localObject = this.cbs;
      boolean bool1 = ((List)localObject).contains(paramSizeReadyCallback);
      if (!bool1)
      {
        localObject = this.cbs;
        ((List)localObject).add(paramSizeReadyCallback);
      }
      localObject = this.layoutListener;
      if (localObject == null)
      {
        localObject = this.view.getViewTreeObserver();
        CustomViewTarget.SizeDeterminer.SizeDeterminerLayoutListener localSizeDeterminerLayoutListener = new com/bumptech/glide/request/target/CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener;
        localSizeDeterminerLayoutListener.<init>(this);
        this.layoutListener = localSizeDeterminerLayoutListener;
        localSizeDeterminerLayoutListener = this.layoutListener;
        ((ViewTreeObserver)localObject).addOnPreDrawListener(localSizeDeterminerLayoutListener);
      }
    }
  }
  
  void removeCallback(SizeReadyCallback paramSizeReadyCallback)
  {
    this.cbs.remove(paramSizeReadyCallback);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\CustomViewTarget$SizeDeterminer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */