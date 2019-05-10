package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.r;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

class TooltipCompatHandler
  implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener
{
  private static final long HOVER_HIDE_TIMEOUT_MS = 15000L;
  private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000L;
  private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500L;
  private static final String TAG = "TooltipCompatHandler";
  private static TooltipCompatHandler sActiveHandler;
  private static TooltipCompatHandler sPendingHandler;
  private final View mAnchor;
  private int mAnchorX;
  private int mAnchorY;
  private boolean mFromTouch;
  private final Runnable mHideRunnable;
  private TooltipPopup mPopup;
  private final Runnable mShowRunnable;
  private final CharSequence mTooltipText;
  
  private TooltipCompatHandler(View paramView, CharSequence paramCharSequence)
  {
    Object localObject = new android/support/v7/widget/TooltipCompatHandler$1;
    ((TooltipCompatHandler.1)localObject).<init>(this);
    this.mShowRunnable = ((Runnable)localObject);
    localObject = new android/support/v7/widget/TooltipCompatHandler$2;
    ((TooltipCompatHandler.2)localObject).<init>(this);
    this.mHideRunnable = ((Runnable)localObject);
    this.mAnchor = paramView;
    this.mTooltipText = paramCharSequence;
    this.mAnchor.setOnLongClickListener(this);
    this.mAnchor.setOnHoverListener(this);
  }
  
  private void cancelPendingShow()
  {
    View localView = this.mAnchor;
    Runnable localRunnable = this.mShowRunnable;
    localView.removeCallbacks(localRunnable);
  }
  
  private void hide()
  {
    Object localObject1 = sActiveHandler;
    if (localObject1 == this)
    {
      sActiveHandler = null;
      localObject1 = this.mPopup;
      if (localObject1 == null) {
        break label74;
      }
      this.mPopup.hide();
      this.mPopup = null;
      localObject1 = this.mAnchor;
      ((View)localObject1).removeOnAttachStateChangeListener(this);
    }
    for (;;)
    {
      localObject1 = sPendingHandler;
      if (localObject1 == this) {
        setPendingHandler(null);
      }
      localObject1 = this.mAnchor;
      Object localObject2 = this.mHideRunnable;
      ((View)localObject1).removeCallbacks((Runnable)localObject2);
      return;
      label74:
      localObject1 = "TooltipCompatHandler";
      localObject2 = "sActiveHandler.mPopup == null";
      Log.e((String)localObject1, (String)localObject2);
    }
  }
  
  private void scheduleShow()
  {
    View localView = this.mAnchor;
    Runnable localRunnable = this.mShowRunnable;
    long l = ViewConfiguration.getLongPressTimeout();
    localView.postDelayed(localRunnable, l);
  }
  
  private static void setPendingHandler(TooltipCompatHandler paramTooltipCompatHandler)
  {
    TooltipCompatHandler localTooltipCompatHandler = sPendingHandler;
    if (localTooltipCompatHandler != null)
    {
      localTooltipCompatHandler = sPendingHandler;
      localTooltipCompatHandler.cancelPendingShow();
    }
    sPendingHandler = paramTooltipCompatHandler;
    localTooltipCompatHandler = sPendingHandler;
    if (localTooltipCompatHandler != null)
    {
      localTooltipCompatHandler = sPendingHandler;
      localTooltipCompatHandler.scheduleShow();
    }
  }
  
  public static void setTooltipText(View paramView, CharSequence paramCharSequence)
  {
    Object localObject = sPendingHandler;
    if (localObject != null)
    {
      localObject = sPendingHandler.mAnchor;
      if (localObject == paramView) {
        setPendingHandler(null);
      }
    }
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (bool)
    {
      localObject = sActiveHandler;
      if (localObject != null)
      {
        localObject = sActiveHandler.mAnchor;
        if (localObject == paramView)
        {
          localObject = sActiveHandler;
          ((TooltipCompatHandler)localObject).hide();
        }
      }
      paramView.setOnLongClickListener(null);
      bool = false;
      localObject = null;
      paramView.setLongClickable(false);
      paramView.setOnHoverListener(null);
    }
    for (;;)
    {
      return;
      localObject = new android/support/v7/widget/TooltipCompatHandler;
      ((TooltipCompatHandler)localObject).<init>(paramView, paramCharSequence);
    }
  }
  
  private void show(boolean paramBoolean)
  {
    Object localObject1 = this.mAnchor;
    boolean bool1 = r.z((View)localObject1);
    if (!bool1) {
      return;
    }
    bool1 = false;
    setPendingHandler(null);
    localObject1 = sActiveHandler;
    if (localObject1 != null)
    {
      localObject1 = sActiveHandler;
      ((TooltipCompatHandler)localObject1).hide();
    }
    sActiveHandler = this;
    this.mFromTouch = paramBoolean;
    localObject1 = new android/support/v7/widget/TooltipPopup;
    Object localObject2 = this.mAnchor.getContext();
    ((TooltipPopup)localObject1).<init>((Context)localObject2);
    this.mPopup = ((TooltipPopup)localObject1);
    localObject1 = this.mPopup;
    localObject2 = this.mAnchor;
    int j = this.mAnchorX;
    int k = this.mAnchorY;
    boolean bool2 = this.mFromTouch;
    CharSequence localCharSequence = this.mTooltipText;
    ((TooltipPopup)localObject1).show((View)localObject2, j, k, bool2, localCharSequence);
    localObject1 = this.mAnchor;
    ((View)localObject1).addOnAttachStateChangeListener(this);
    bool1 = this.mFromTouch;
    long l1;
    if (bool1) {
      l1 = 2500L;
    }
    for (;;)
    {
      View localView = this.mAnchor;
      Runnable localRunnable = this.mHideRunnable;
      localView.removeCallbacks(localRunnable);
      localView = this.mAnchor;
      localRunnable = this.mHideRunnable;
      localView.postDelayed(localRunnable, l1);
      break;
      localObject1 = this.mAnchor;
      int i = r.n((View)localObject1) & 0x1;
      int m = 1;
      long l2;
      if (i == m)
      {
        j = ViewConfiguration.getLongPressTimeout();
        l2 = j;
        l1 = 3000L - l2;
      }
      else
      {
        j = ViewConfiguration.getLongPressTimeout();
        l2 = j;
        l1 = 15000L - l2;
      }
    }
  }
  
  public boolean onHover(View paramView, MotionEvent paramMotionEvent)
  {
    Object localObject = this.mPopup;
    boolean bool1;
    if (localObject != null)
    {
      bool1 = this.mFromTouch;
      if (!bool1) {}
    }
    for (;;)
    {
      return false;
      localObject = this.mAnchor.getContext();
      String str = "accessibility";
      localObject = (AccessibilityManager)((Context)localObject).getSystemService(str);
      boolean bool3 = ((AccessibilityManager)localObject).isEnabled();
      if (bool3)
      {
        bool1 = ((AccessibilityManager)localObject).isTouchExplorationEnabled();
        if (bool1) {}
      }
      else
      {
        int i = paramMotionEvent.getAction();
        switch (i)
        {
        default: 
          break;
        case 7: 
          localObject = this.mAnchor;
          boolean bool2 = ((View)localObject).isEnabled();
          if (bool2)
          {
            localObject = this.mPopup;
            if (localObject == null)
            {
              int j = (int)paramMotionEvent.getX();
              this.mAnchorX = j;
              float f = paramMotionEvent.getY();
              j = (int)f;
              this.mAnchorY = j;
              setPendingHandler(this);
            }
          }
          break;
        case 10: 
          hide();
        }
      }
    }
  }
  
  public boolean onLongClick(View paramView)
  {
    boolean bool = true;
    int i = paramView.getWidth() / 2;
    this.mAnchorX = i;
    i = paramView.getHeight() / 2;
    this.mAnchorY = i;
    show(bool);
    return bool;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    hide();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\TooltipCompatHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */