package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v4.b.a.a;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.support.v7.mediarouter.R.styleable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Toast;

public class MediaRouteButton
  extends View
{
  private static final int[] CHECKABLE_STATE_SET;
  private static final int[] CHECKED_STATE_SET;
  private static final String CHOOSER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
  private static final String CONTROLLER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
  private static final String TAG = "MediaRouteButton";
  private boolean mAttachedToWindow;
  private final MediaRouteButton.MediaRouterCallback mCallback;
  private boolean mCheatSheetEnabled;
  private MediaRouteDialogFactory mDialogFactory;
  private boolean mIsConnecting;
  private int mMinHeight;
  private int mMinWidth;
  private boolean mRemoteActive;
  private Drawable mRemoteIndicator;
  private final MediaRouter mRouter;
  private MediaRouteSelector mSelector;
  
  static
  {
    int i = 1;
    int[] arrayOfInt = new int[i];
    arrayOfInt[0] = 16842912;
    CHECKED_STATE_SET = arrayOfInt;
    arrayOfInt = new int[i];
    arrayOfInt[0] = 16842911;
    CHECKABLE_STATE_SET = arrayOfInt;
  }
  
  public MediaRouteButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MediaRouteButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public MediaRouteButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super((Context)localObject1, paramAttributeSet, paramInt);
    localObject1 = MediaRouteSelector.EMPTY;
    this.mSelector = ((MediaRouteSelector)localObject1);
    localObject1 = MediaRouteDialogFactory.getDefault();
    this.mDialogFactory = ((MediaRouteDialogFactory)localObject1);
    localObject1 = getContext();
    Object localObject2 = MediaRouter.getInstance((Context)localObject1);
    this.mRouter = ((MediaRouter)localObject2);
    localObject2 = new android/support/v7/app/MediaRouteButton$MediaRouterCallback;
    ((MediaRouteButton.MediaRouterCallback)localObject2).<init>(this, null);
    this.mCallback = ((MediaRouteButton.MediaRouterCallback)localObject2);
    localObject2 = R.styleable.MediaRouteButton;
    localObject1 = ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, 0);
    int i = R.styleable.MediaRouteButton_externalRouteEnabledDrawable;
    localObject2 = ((TypedArray)localObject1).getDrawable(i);
    setRemoteIndicatorDrawable((Drawable)localObject2);
    i = R.styleable.MediaRouteButton_android_minWidth;
    i = ((TypedArray)localObject1).getDimensionPixelSize(i, 0);
    this.mMinWidth = i;
    i = R.styleable.MediaRouteButton_android_minHeight;
    i = ((TypedArray)localObject1).getDimensionPixelSize(i, 0);
    this.mMinHeight = i;
    ((TypedArray)localObject1).recycle();
    setClickable(bool);
    setLongClickable(bool);
  }
  
  private Activity getActivity()
  {
    Object localObject = getContext();
    boolean bool = localObject instanceof ContextWrapper;
    if (bool)
    {
      bool = localObject instanceof Activity;
      if (!bool) {}
    }
    for (localObject = (Activity)localObject;; localObject = null)
    {
      return (Activity)localObject;
      localObject = ((ContextWrapper)localObject).getBaseContext();
      break;
    }
  }
  
  private m getFragmentManager()
  {
    Object localObject = getActivity();
    boolean bool = localObject instanceof i;
    if (bool) {}
    for (localObject = ((i)localObject).getSupportFragmentManager();; localObject = null) {
      return (m)localObject;
    }
  }
  
  private void refreshRoute()
  {
    boolean bool1 = false;
    MediaRouteSelector localMediaRouteSelector1 = null;
    int i = 1;
    boolean bool2 = this.mAttachedToWindow;
    Object localObject;
    boolean bool3;
    MediaRouteSelector localMediaRouteSelector2;
    if (bool2)
    {
      localObject = this.mRouter.getSelectedRoute();
      bool3 = ((MediaRouter.RouteInfo)localObject).isDefault();
      if (bool3) {
        break label217;
      }
      localMediaRouteSelector2 = this.mSelector;
      bool3 = ((MediaRouter.RouteInfo)localObject).matchesSelector(localMediaRouteSelector2);
      if (!bool3) {
        break label217;
      }
      bool3 = i;
      if (!bool3) {
        break label226;
      }
      bool2 = ((MediaRouter.RouteInfo)localObject).isConnecting();
      if (!bool2) {
        break label226;
      }
      bool2 = i;
    }
    for (;;)
    {
      boolean bool4 = this.mRemoteActive;
      if (bool4 != bool3)
      {
        this.mRemoteActive = bool3;
        bool1 = i;
      }
      bool3 = this.mIsConnecting;
      if (bool3 != bool2)
      {
        this.mIsConnecting = bool2;
        bool1 = i;
      }
      if (bool1)
      {
        refreshDrawableState();
        bool2 = this.mIsConnecting;
        if (bool2)
        {
          localObject = this.mRemoteIndicator.getCurrent();
          bool2 = localObject instanceof AnimationDrawable;
          if (bool2)
          {
            localObject = (AnimationDrawable)this.mRemoteIndicator.getCurrent();
            bool1 = ((AnimationDrawable)localObject).isRunning();
            if (!bool1) {
              ((AnimationDrawable)localObject).start();
            }
          }
        }
      }
      localObject = this.mRouter;
      localMediaRouteSelector1 = this.mSelector;
      bool2 = ((MediaRouter)localObject).isRouteAvailable(localMediaRouteSelector1, i);
      setEnabled(bool2);
      return;
      label217:
      bool3 = false;
      localMediaRouteSelector2 = null;
      break;
      label226:
      bool2 = false;
      localObject = null;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = this.mRemoteIndicator;
    if (localObject != null)
    {
      localObject = getDrawableState();
      Drawable localDrawable = this.mRemoteIndicator;
      localDrawable.setState((int[])localObject);
      invalidate();
    }
  }
  
  public MediaRouteDialogFactory getDialogFactory()
  {
    return this.mDialogFactory;
  }
  
  public MediaRouteSelector getRouteSelector()
  {
    return this.mSelector;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    Drawable localDrawable = getBackground();
    if (localDrawable != null)
    {
      localDrawable = getBackground();
      a.a(localDrawable);
    }
    localDrawable = this.mRemoteIndicator;
    if (localDrawable != null)
    {
      localDrawable = this.mRemoteIndicator;
      a.a(localDrawable);
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mAttachedToWindow = true;
    Object localObject = this.mSelector;
    boolean bool = ((MediaRouteSelector)localObject).isEmpty();
    if (!bool)
    {
      localObject = this.mRouter;
      MediaRouteSelector localMediaRouteSelector = this.mSelector;
      MediaRouteButton.MediaRouterCallback localMediaRouterCallback = this.mCallback;
      ((MediaRouter)localObject).addCallback(localMediaRouteSelector, localMediaRouterCallback);
    }
    refreshRoute();
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int i = paramInt + 1;
    int[] arrayOfInt1 = super.onCreateDrawableState(i);
    boolean bool = this.mIsConnecting;
    int[] arrayOfInt2;
    if (bool)
    {
      arrayOfInt2 = CHECKABLE_STATE_SET;
      mergeDrawableStates(arrayOfInt1, arrayOfInt2);
    }
    for (;;)
    {
      return arrayOfInt1;
      bool = this.mRemoteActive;
      if (bool)
      {
        arrayOfInt2 = CHECKED_STATE_SET;
        mergeDrawableStates(arrayOfInt1, arrayOfInt2);
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    this.mAttachedToWindow = false;
    Object localObject = this.mSelector;
    boolean bool = ((MediaRouteSelector)localObject).isEmpty();
    if (!bool)
    {
      localObject = this.mRouter;
      MediaRouteButton.MediaRouterCallback localMediaRouterCallback = this.mCallback;
      ((MediaRouter)localObject).removeCallback(localMediaRouterCallback);
    }
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Drawable localDrawable1 = this.mRemoteIndicator;
    if (localDrawable1 != null)
    {
      int i = getPaddingLeft();
      int j = getWidth();
      int k = getPaddingRight();
      j -= k;
      k = getPaddingTop();
      int m = getHeight();
      int n = getPaddingBottom();
      m -= n;
      Drawable localDrawable2 = this.mRemoteIndicator;
      n = localDrawable2.getIntrinsicWidth();
      Drawable localDrawable3 = this.mRemoteIndicator;
      int i1 = localDrawable3.getIntrinsicHeight();
      j = (j - i - n) / 2;
      i += j;
      j = (m - k - i1) / 2 + k;
      Drawable localDrawable4 = this.mRemoteIndicator;
      m = i + n;
      n = j + i1;
      localDrawable4.setBounds(i, j, m, n);
      localDrawable1 = this.mRemoteIndicator;
      localDrawable1.draw(paramCanvas);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Drawable localDrawable1 = null;
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getSize(paramInt2);
    int m = View.MeasureSpec.getMode(paramInt1);
    int n = View.MeasureSpec.getMode(paramInt2);
    int i1 = this.mMinWidth;
    Drawable localDrawable2 = this.mRemoteIndicator;
    int i2;
    if (localDrawable2 != null)
    {
      localDrawable2 = this.mRemoteIndicator;
      i2 = localDrawable2.getIntrinsicWidth();
      i2 = Math.max(i1, i2);
      i1 = this.mMinHeight;
      Drawable localDrawable3 = this.mRemoteIndicator;
      if (localDrawable3 != null)
      {
        localDrawable1 = this.mRemoteIndicator;
        i = localDrawable1.getIntrinsicHeight();
      }
      i1 = Math.max(i1, i);
      switch (m)
      {
      default: 
        i = getPaddingLeft();
        i2 += i;
        i = getPaddingRight();
        i2 += i;
        i = i2;
        switch (n)
        {
        default: 
          label157:
          i2 = getPaddingTop() + i1;
          k = getPaddingBottom();
          i2 += k;
        }
        break;
      }
    }
    for (;;)
    {
      setMeasuredDimension(i, i2);
      return;
      i2 = 0;
      localDrawable2 = null;
      break;
      i = j;
      break label157;
      i = getPaddingLeft();
      i2 += i;
      i = getPaddingRight();
      i2 += i;
      i2 = Math.min(j, i2);
      i = i2;
      break label157;
      i2 = k;
      continue;
      i2 = getPaddingTop() + i1;
      j = getPaddingBottom();
      i2 += j;
      i2 = Math.min(k, i2);
    }
  }
  
  public boolean performClick()
  {
    boolean bool1 = false;
    boolean bool2 = super.performClick();
    if (!bool2) {
      playSoundEffect(0);
    }
    boolean bool3 = showDialog();
    if ((bool3) || (bool2)) {
      bool1 = true;
    }
    return bool1;
  }
  
  public boolean performLongClick()
  {
    boolean bool1 = true;
    boolean bool2 = super.performLongClick();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = this.mCheatSheetEnabled;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        localObject = getContentDescription();
        boolean bool3 = TextUtils.isEmpty((CharSequence)localObject);
        if (!bool3) {
          break;
        }
        bool1 = false;
      }
    }
    int i = 2;
    int[] arrayOfInt = new int[i];
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Context localContext = getContext();
    int j = getWidth();
    int k = getHeight();
    int m = arrayOfInt[bool1];
    int n = k / 2;
    m += n;
    DisplayMetrics localDisplayMetrics = localContext.getResources().getDisplayMetrics();
    n = localDisplayMetrics.widthPixels;
    Object localObject = Toast.makeText(localContext, (CharSequence)localObject, 0);
    int i1 = localRect.height();
    if (m < i1)
    {
      i1 = 8388661;
      i = arrayOfInt[0];
      i = n - i;
      int i2 = j / 2;
      i -= i2;
      ((Toast)localObject).setGravity(i1, i, k);
    }
    for (;;)
    {
      ((Toast)localObject).show();
      performHapticFeedback(0);
      break;
      i = 81;
      ((Toast)localObject).setGravity(i, 0, k);
    }
  }
  
  void setCheatSheetEnabled(boolean paramBoolean)
  {
    this.mCheatSheetEnabled = paramBoolean;
  }
  
  public void setDialogFactory(MediaRouteDialogFactory paramMediaRouteDialogFactory)
  {
    if (paramMediaRouteDialogFactory == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("factory must not be null");
      throw localIllegalArgumentException;
    }
    this.mDialogFactory = paramMediaRouteDialogFactory;
  }
  
  public void setRemoteIndicatorDrawable(Drawable paramDrawable)
  {
    Object localObject = this.mRemoteIndicator;
    if (localObject != null)
    {
      this.mRemoteIndicator.setCallback(null);
      localObject = this.mRemoteIndicator;
      unscheduleDrawable((Drawable)localObject);
    }
    this.mRemoteIndicator = paramDrawable;
    int i;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      localObject = getDrawableState();
      paramDrawable.setState((int[])localObject);
      i = getVisibility();
      if (i != 0) {
        break label75;
      }
      i = 1;
    }
    for (;;)
    {
      paramDrawable.setVisible(i, false);
      refreshDrawableState();
      return;
      label75:
      int j = 0;
      localObject = null;
    }
  }
  
  public void setRouteSelector(MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("selector must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.mSelector;
    boolean bool = ((MediaRouteSelector)localObject).equals(paramMediaRouteSelector);
    if (!bool)
    {
      bool = this.mAttachedToWindow;
      if (bool)
      {
        localObject = this.mSelector;
        bool = ((MediaRouteSelector)localObject).isEmpty();
        MediaRouteButton.MediaRouterCallback localMediaRouterCallback;
        if (!bool)
        {
          localObject = this.mRouter;
          localMediaRouterCallback = this.mCallback;
          ((MediaRouter)localObject).removeCallback(localMediaRouterCallback);
        }
        bool = paramMediaRouteSelector.isEmpty();
        if (!bool)
        {
          localObject = this.mRouter;
          localMediaRouterCallback = this.mCallback;
          ((MediaRouter)localObject).addCallback(paramMediaRouteSelector, localMediaRouterCallback);
        }
      }
      this.mSelector = paramMediaRouteSelector;
      refreshRoute();
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    Drawable localDrawable1 = this.mRemoteIndicator;
    Drawable localDrawable2;
    int i;
    if (localDrawable1 != null)
    {
      localDrawable2 = this.mRemoteIndicator;
      i = getVisibility();
      if (i != 0) {
        break label42;
      }
      i = 1;
    }
    for (;;)
    {
      localDrawable2.setVisible(i, false);
      return;
      label42:
      int j = 0;
      localDrawable1 = null;
    }
  }
  
  public boolean showDialog()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = this.mAttachedToWindow;
    if (!bool2) {}
    Object localObject2;
    for (;;)
    {
      return bool1;
      localObject2 = getFragmentManager();
      if (localObject2 == null)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("The activity must be a subclass of FragmentActivity");
        throw ((Throwable)localObject1);
      }
      localObject3 = this.mRouter.getSelectedRoute();
      boolean bool3 = ((MediaRouter.RouteInfo)localObject3).isDefault();
      if (!bool3)
      {
        MediaRouteSelector localMediaRouteSelector = this.mSelector;
        boolean bool4 = ((MediaRouter.RouteInfo)localObject3).matchesSelector(localMediaRouteSelector);
        if (bool4) {
          break label151;
        }
      }
      localObject3 = ((m)localObject2).a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
      if (localObject3 == null) {
        break;
      }
      localObject2 = "MediaRouteButton";
      localObject3 = "showDialog(): Route chooser dialog already showing!";
      Log.w((String)localObject2, (String)localObject3);
    }
    localObject1 = this.mDialogFactory.onCreateChooserDialogFragment();
    Object localObject3 = this.mSelector;
    ((MediaRouteChooserDialogFragment)localObject1).setRouteSelector((MediaRouteSelector)localObject3);
    localObject3 = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
    ((MediaRouteChooserDialogFragment)localObject1).show((m)localObject2, (String)localObject3);
    for (;;)
    {
      bool1 = true;
      break;
      label151:
      localObject3 = ((m)localObject2).a("android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
      if (localObject3 != null)
      {
        localObject2 = "MediaRouteButton";
        localObject3 = "showDialog(): Route controller dialog already showing!";
        Log.w((String)localObject2, (String)localObject3);
        break;
      }
      localObject1 = this.mDialogFactory.onCreateControllerDialogFragment();
      localObject3 = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
      ((MediaRouteControllerDialogFragment)localObject1).show((m)localObject2, (String)localObject3);
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool = super.verifyDrawable(paramDrawable);
    Drawable localDrawable;
    if (!bool)
    {
      localDrawable = this.mRemoteIndicator;
      if (paramDrawable != localDrawable) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteButton.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */