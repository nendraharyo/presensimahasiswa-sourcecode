package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.support.v4.view.r;
import android.support.v4.view.v;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

abstract class AbsActionBarView
  extends ViewGroup
{
  private static final int FADE_DURATION = 200;
  protected ActionMenuPresenter mActionMenuPresenter;
  protected int mContentHeight;
  private boolean mEatingHover;
  private boolean mEatingTouch;
  protected ActionMenuView mMenuView;
  protected final Context mPopupContext;
  protected final AbsActionBarView.VisibilityAnimListener mVisAnimListener;
  protected v mVisibilityAnim;
  
  AbsActionBarView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  AbsActionBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  AbsActionBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/support/v7/widget/AbsActionBarView$VisibilityAnimListener;
    ((AbsActionBarView.VisibilityAnimListener)localObject1).<init>(this);
    this.mVisAnimListener = ((AbsActionBarView.VisibilityAnimListener)localObject1);
    localObject1 = new android/util/TypedValue;
    ((TypedValue)localObject1).<init>();
    Object localObject2 = paramContext.getTheme();
    int i = R.attr.actionBarPopupTheme;
    boolean bool1 = true;
    boolean bool2 = ((Resources.Theme)localObject2).resolveAttribute(i, (TypedValue)localObject1, bool1);
    if (bool2)
    {
      int j = ((TypedValue)localObject1).resourceId;
      if (j != 0)
      {
        localObject2 = new android/view/ContextThemeWrapper;
        int k = ((TypedValue)localObject1).resourceId;
        ((ContextThemeWrapper)localObject2).<init>(paramContext, k);
      }
    }
    for (this.mPopupContext = ((Context)localObject2);; this.mPopupContext = paramContext) {
      return;
    }
  }
  
  protected static int next(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = paramInt1 - paramInt2;; i = paramInt1 + paramInt2) {
      return i;
    }
  }
  
  public void animateToVisibility(int paramInt)
  {
    setupAnimatorToVisibility(paramInt, 200L).c();
  }
  
  public boolean canShowOverflowMenu()
  {
    boolean bool = isOverflowReserved();
    if (bool)
    {
      i = getVisibility();
      if (i != 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public void dismissPopupMenus()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mActionMenuPresenter;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mActionMenuPresenter;
      localActionMenuPresenter.dismissPopupMenus();
    }
  }
  
  public int getAnimatedVisibility()
  {
    Object localObject = this.mVisibilityAnim;
    if (localObject != null) {
      localObject = this.mVisAnimListener;
    }
    for (int i = ((AbsActionBarView.VisibilityAnimListener)localObject).mFinalVisibility;; i = getVisibility()) {
      return i;
    }
  }
  
  public int getContentHeight()
  {
    return this.mContentHeight;
  }
  
  public boolean hideOverflowMenu()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mActionMenuPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mActionMenuPresenter;
      bool = localActionMenuPresenter.hideOverflowMenu();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
  
  public boolean isOverflowMenuShowPending()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mActionMenuPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mActionMenuPresenter;
      bool = localActionMenuPresenter.isOverflowMenuShowPending();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mActionMenuPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mActionMenuPresenter;
      bool = localActionMenuPresenter.isOverflowMenuShowing();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
  
  public boolean isOverflowReserved()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mActionMenuPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mActionMenuPresenter;
      bool = localActionMenuPresenter.isOverflowReserved();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
  
  protected int measureChildView(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.makeMeasureSpec(paramInt1, -1 << -1);
    paramView.measure(i, paramInt2);
    i = paramView.getMeasuredWidth();
    i = paramInt1 - i - paramInt3;
    return Math.max(0, i);
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Object localObject = getContext();
    int[] arrayOfInt = R.styleable.ActionBar;
    int i = R.attr.actionBarStyle;
    localObject = ((Context)localObject).obtainStyledAttributes(null, arrayOfInt, i, 0);
    int j = R.styleable.ActionBar_height;
    j = ((TypedArray)localObject).getLayoutDimension(j, 0);
    setContentHeight(j);
    ((TypedArray)localObject).recycle();
    localObject = this.mActionMenuPresenter;
    if (localObject != null)
    {
      localObject = this.mActionMenuPresenter;
      ((ActionMenuPresenter)localObject).onConfigurationChanged(paramConfiguration);
    }
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = 9;
    boolean bool1 = true;
    int j = paramMotionEvent.getActionMasked();
    if (j == i) {
      this.mEatingHover = false;
    }
    boolean bool2 = this.mEatingHover;
    if (!bool2)
    {
      bool2 = super.onHoverEvent(paramMotionEvent);
      if ((j == i) && (!bool2)) {
        this.mEatingHover = bool1;
      }
    }
    int k = 10;
    if (j != k)
    {
      k = 3;
      if (j != k) {}
    }
    else
    {
      this.mEatingHover = false;
    }
    return bool1;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    int j = paramMotionEvent.getActionMasked();
    if (j == 0) {
      this.mEatingTouch = false;
    }
    boolean bool = this.mEatingTouch;
    if (!bool)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      if ((j == 0) && (!bool)) {
        this.mEatingTouch = i;
      }
    }
    if (j != i)
    {
      int k = 3;
      if (j != k) {}
    }
    else
    {
      this.mEatingTouch = false;
    }
    return i;
  }
  
  protected int positionChild(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    int k = (paramInt3 - j) / 2 + paramInt2;
    int m;
    if (paramBoolean)
    {
      m = paramInt1 - i;
      j += k;
      paramView.layout(m, k, paramInt1, j);
    }
    for (;;)
    {
      if (paramBoolean) {
        i = -i;
      }
      return i;
      m = paramInt1 + i;
      j += k;
      paramView.layout(paramInt1, k, m, j);
    }
  }
  
  public void postShowOverflowMenu()
  {
    AbsActionBarView.1 local1 = new android/support/v7/widget/AbsActionBarView$1;
    local1.<init>(this);
    post(local1);
  }
  
  public void setContentHeight(int paramInt)
  {
    this.mContentHeight = paramInt;
    requestLayout();
  }
  
  public void setVisibility(int paramInt)
  {
    int i = getVisibility();
    if (paramInt != i)
    {
      v localv = this.mVisibilityAnim;
      if (localv != null)
      {
        localv = this.mVisibilityAnim;
        localv.b();
      }
      super.setVisibility(paramInt);
    }
  }
  
  public v setupAnimatorToVisibility(int paramInt, long paramLong)
  {
    float f = 0.0F;
    AbsActionBarView.VisibilityAnimListener localVisibilityAnimListener = null;
    v localv = this.mVisibilityAnim;
    if (localv != null)
    {
      localv = this.mVisibilityAnim;
      localv.b();
    }
    if (paramInt == 0)
    {
      int i = getVisibility();
      if (i != 0) {
        setAlpha(0.0F);
      }
      localv = r.k(this);
      f = 1.0F;
      localv = localv.a(f);
      localv.a(paramLong);
      localVisibilityAnimListener = this.mVisAnimListener.withFinalVisibility(localv, paramInt);
      localv.a(localVisibilityAnimListener);
    }
    for (;;)
    {
      return localv;
      localv = r.k(this).a(0.0F);
      localv.a(paramLong);
      localVisibilityAnimListener = this.mVisAnimListener.withFinalVisibility(localv, paramInt);
      localv.a(localVisibilityAnimListener);
    }
  }
  
  public boolean showOverflowMenu()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mActionMenuPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mActionMenuPresenter;
      bool = localActionMenuPresenter.showOverflowMenu();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AbsActionBarView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */