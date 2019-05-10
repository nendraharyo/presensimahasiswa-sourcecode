package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.l;
import android.support.v4.view.n;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;

public class ActionBarOverlayLayout
  extends ViewGroup
  implements l, DecorContentParent
{
  static final int[] ATTRS;
  private static final String TAG = "ActionBarOverlayLayout";
  private final int ACTION_BAR_ANIMATE_DELAY;
  private int mActionBarHeight;
  ActionBarContainer mActionBarTop;
  private ActionBarOverlayLayout.ActionBarVisibilityCallback mActionBarVisibilityCallback;
  private final Runnable mAddActionBarHideOffset;
  boolean mAnimatingForFling;
  private final Rect mBaseContentInsets;
  private final Rect mBaseInnerInsets;
  private ContentFrameLayout mContent;
  private final Rect mContentInsets;
  ViewPropertyAnimator mCurrentActionBarTopAnimator;
  private DecorToolbar mDecorToolbar;
  private OverScroller mFlingEstimator;
  private boolean mHasNonEmbeddedTabs;
  private boolean mHideOnContentScroll;
  private int mHideOnContentScrollReference;
  private boolean mIgnoreWindowContentOverlay;
  private final Rect mInnerInsets;
  private final Rect mLastBaseContentInsets;
  private final Rect mLastBaseInnerInsets;
  private final Rect mLastInnerInsets;
  private int mLastSystemUiVisibility;
  private boolean mOverlayMode;
  private final n mParentHelper;
  private final Runnable mRemoveActionBarHideOffset;
  final AnimatorListenerAdapter mTopAnimatorListener;
  private Drawable mWindowContentOverlay;
  private int mWindowVisibility = 0;
  
  static
  {
    int[] arrayOfInt = new int[2];
    int i = R.attr.actionBarSize;
    arrayOfInt[0] = i;
    arrayOfInt[1] = 16842841;
    ATTRS = arrayOfInt;
  }
  
  public ActionBarOverlayLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mBaseContentInsets = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mLastBaseContentInsets = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mContentInsets = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mBaseInnerInsets = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mLastBaseInnerInsets = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mInnerInsets = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mLastInnerInsets = ((Rect)localObject);
    this.ACTION_BAR_ANIMATE_DELAY = 600;
    localObject = new android/support/v7/widget/ActionBarOverlayLayout$1;
    ((ActionBarOverlayLayout.1)localObject).<init>(this);
    this.mTopAnimatorListener = ((AnimatorListenerAdapter)localObject);
    localObject = new android/support/v7/widget/ActionBarOverlayLayout$2;
    ((ActionBarOverlayLayout.2)localObject).<init>(this);
    this.mRemoveActionBarHideOffset = ((Runnable)localObject);
    localObject = new android/support/v7/widget/ActionBarOverlayLayout$3;
    ((ActionBarOverlayLayout.3)localObject).<init>(this);
    this.mAddActionBarHideOffset = ((Runnable)localObject);
    init(paramContext);
    localObject = new android/support/v4/view/n;
    ((n)localObject).<init>(this);
    this.mParentHelper = ((n)localObject);
  }
  
  private void addActionBarHideOffset()
  {
    haltActionBarHideOffsetAnimations();
    this.mAddActionBarHideOffset.run();
  }
  
  private boolean applyInsets(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    int j = 0;
    ActionBarOverlayLayout.LayoutParams localLayoutParams = (ActionBarOverlayLayout.LayoutParams)paramView.getLayoutParams();
    int k;
    int m;
    if (paramBoolean1)
    {
      k = localLayoutParams.leftMargin;
      m = paramRect.left;
      if (k != m)
      {
        j = paramRect.left;
        localLayoutParams.leftMargin = j;
        j = i;
      }
    }
    if (paramBoolean2)
    {
      k = localLayoutParams.topMargin;
      m = paramRect.top;
      if (k != m)
      {
        j = paramRect.top;
        localLayoutParams.topMargin = j;
        j = i;
      }
    }
    if (paramBoolean4)
    {
      k = localLayoutParams.rightMargin;
      m = paramRect.right;
      if (k != m)
      {
        j = paramRect.right;
        localLayoutParams.rightMargin = j;
        j = i;
      }
    }
    if (paramBoolean3)
    {
      k = localLayoutParams.bottomMargin;
      m = paramRect.bottom;
      if (k != m)
      {
        j = paramRect.bottom;
        localLayoutParams.bottomMargin = j;
      }
    }
    for (boolean bool = i;; bool = j) {
      return bool;
    }
  }
  
  private DecorToolbar getDecorToolbar(View paramView)
  {
    boolean bool = paramView instanceof DecorToolbar;
    if (bool) {}
    for (paramView = (DecorToolbar)paramView;; paramView = ((Toolbar)paramView).getWrapper())
    {
      return paramView;
      bool = paramView instanceof Toolbar;
      if (!bool) {
        break;
      }
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Can't make a decor toolbar out of ");
    String str = paramView.getClass().getSimpleName();
    localObject = str;
    localIllegalStateException.<init>((String)localObject);
    throw localIllegalStateException;
  }
  
  private void init(Context paramContext)
  {
    int i = 1;
    Object localObject1 = getContext().getTheme();
    Object localObject2 = ATTRS;
    localObject2 = ((Resources.Theme)localObject1).obtainStyledAttributes((int[])localObject2);
    int j = ((TypedArray)localObject2).getDimensionPixelSize(0, 0);
    this.mActionBarHeight = j;
    localObject1 = ((TypedArray)localObject2).getDrawable(i);
    this.mWindowContentOverlay = ((Drawable)localObject1);
    localObject1 = this.mWindowContentOverlay;
    int k;
    if (localObject1 == null)
    {
      j = i;
      setWillNotDraw(j);
      ((TypedArray)localObject2).recycle();
      localObject1 = paramContext.getApplicationInfo();
      k = ((ApplicationInfo)localObject1).targetSdkVersion;
      int m = 19;
      if (k >= m) {
        break label123;
      }
    }
    for (;;)
    {
      this.mIgnoreWindowContentOverlay = i;
      localObject1 = new android/widget/OverScroller;
      ((OverScroller)localObject1).<init>(paramContext);
      this.mFlingEstimator = ((OverScroller)localObject1);
      return;
      k = 0;
      localObject1 = null;
      break;
      label123:
      i = 0;
    }
  }
  
  private void postAddActionBarHideOffset()
  {
    haltActionBarHideOffsetAnimations();
    Runnable localRunnable = this.mAddActionBarHideOffset;
    postDelayed(localRunnable, 600L);
  }
  
  private void postRemoveActionBarHideOffset()
  {
    haltActionBarHideOffsetAnimations();
    Runnable localRunnable = this.mRemoveActionBarHideOffset;
    postDelayed(localRunnable, 600L);
  }
  
  private void removeActionBarHideOffset()
  {
    haltActionBarHideOffsetAnimations();
    this.mRemoveActionBarHideOffset.run();
  }
  
  private boolean shouldHideActionBarOnFling(float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    OverScroller localOverScroller = this.mFlingEstimator;
    int i = (int)paramFloat2;
    int j = -1 << -1;
    int k = -1 >>> 1;
    localOverScroller.fling(0, 0, 0, i, 0, 0, j, k);
    localOverScroller = this.mFlingEstimator;
    int m = localOverScroller.getFinalY();
    ActionBarContainer localActionBarContainer = this.mActionBarTop;
    int n = localActionBarContainer.getHeight();
    if (m > n) {
      bool = true;
    }
    return bool;
  }
  
  public boolean canShowOverflowMenu()
  {
    pullChildren();
    return this.mDecorToolbar.canShowOverflowMenu();
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ActionBarOverlayLayout.LayoutParams;
  }
  
  public void dismissPopups()
  {
    pullChildren();
    this.mDecorToolbar.dismissPopupMenus();
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Object localObject1 = this.mWindowContentOverlay;
    int i;
    float f1;
    Object localObject2;
    if (localObject1 != null)
    {
      boolean bool = this.mIgnoreWindowContentOverlay;
      if (!bool)
      {
        localObject1 = this.mActionBarTop;
        i = ((ActionBarContainer)localObject1).getVisibility();
        if (i != 0) {
          break label134;
        }
        localObject1 = this.mActionBarTop;
        f1 = ((ActionBarContainer)localObject1).getBottom();
        localObject2 = this.mActionBarTop;
        float f2 = ((ActionBarContainer)localObject2).getTranslationY();
        f1 += f2;
        f2 = 0.5F;
        f1 += f2;
        i = (int)f1;
      }
    }
    for (;;)
    {
      localObject2 = this.mWindowContentOverlay;
      int j = getWidth();
      Drawable localDrawable = this.mWindowContentOverlay;
      int k = localDrawable.getIntrinsicHeight() + i;
      ((Drawable)localObject2).setBounds(0, i, j, k);
      localObject1 = this.mWindowContentOverlay;
      ((Drawable)localObject1).draw(paramCanvas);
      return;
      label134:
      i = 0;
      localObject1 = null;
      f1 = 0.0F;
    }
  }
  
  protected boolean fitSystemWindows(Rect paramRect)
  {
    boolean bool1 = true;
    pullChildren();
    int i = r.n(this) & 0x100;
    if (i != 0) {}
    Object localObject1 = this.mActionBarTop;
    Object localObject2 = this;
    Rect localRect = paramRect;
    boolean bool2 = applyInsets((View)localObject1, paramRect, bool1, bool1, false, bool1);
    this.mBaseInnerInsets.set(paramRect);
    localObject1 = this.mBaseInnerInsets;
    localRect = this.mBaseContentInsets;
    ViewUtils.computeFitSystemWindows(this, (Rect)localObject1, localRect);
    localObject1 = this.mLastBaseInnerInsets;
    localRect = this.mBaseInnerInsets;
    boolean bool3 = ((Rect)localObject1).equals(localRect);
    if (!bool3)
    {
      localObject2 = this.mLastBaseInnerInsets;
      localObject1 = this.mBaseInnerInsets;
      ((Rect)localObject2).set((Rect)localObject1);
      bool2 = bool1;
    }
    localObject1 = this.mLastBaseContentInsets;
    localRect = this.mBaseContentInsets;
    bool3 = ((Rect)localObject1).equals(localRect);
    if (!bool3)
    {
      localObject2 = this.mLastBaseContentInsets;
      localObject1 = this.mBaseContentInsets;
      ((Rect)localObject2).set((Rect)localObject1);
      bool2 = bool1;
    }
    if (bool2) {
      requestLayout();
    }
    return bool1;
  }
  
  protected ActionBarOverlayLayout.LayoutParams generateDefaultLayoutParams()
  {
    int i = -1;
    ActionBarOverlayLayout.LayoutParams localLayoutParams = new android/support/v7/widget/ActionBarOverlayLayout$LayoutParams;
    localLayoutParams.<init>(i, i);
    return localLayoutParams;
  }
  
  public ActionBarOverlayLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    ActionBarOverlayLayout.LayoutParams localLayoutParams = new android/support/v7/widget/ActionBarOverlayLayout$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    ActionBarOverlayLayout.LayoutParams localLayoutParams = new android/support/v7/widget/ActionBarOverlayLayout$LayoutParams;
    localLayoutParams.<init>(paramLayoutParams);
    return localLayoutParams;
  }
  
  public int getActionBarHideOffset()
  {
    ActionBarContainer localActionBarContainer = this.mActionBarTop;
    float f;
    int i;
    if (localActionBarContainer != null)
    {
      localActionBarContainer = this.mActionBarTop;
      f = localActionBarContainer.getTranslationY();
      i = -(int)f;
    }
    for (;;)
    {
      return i;
      i = 0;
      f = 0.0F;
      localActionBarContainer = null;
    }
  }
  
  public int getNestedScrollAxes()
  {
    return this.mParentHelper.a();
  }
  
  public CharSequence getTitle()
  {
    pullChildren();
    return this.mDecorToolbar.getTitle();
  }
  
  void haltActionBarHideOffsetAnimations()
  {
    Object localObject = this.mRemoveActionBarHideOffset;
    removeCallbacks((Runnable)localObject);
    localObject = this.mAddActionBarHideOffset;
    removeCallbacks((Runnable)localObject);
    localObject = this.mCurrentActionBarTopAnimator;
    if (localObject != null)
    {
      localObject = this.mCurrentActionBarTopAnimator;
      ((ViewPropertyAnimator)localObject).cancel();
    }
  }
  
  public boolean hasIcon()
  {
    pullChildren();
    return this.mDecorToolbar.hasIcon();
  }
  
  public boolean hasLogo()
  {
    pullChildren();
    return this.mDecorToolbar.hasLogo();
  }
  
  public boolean hideOverflowMenu()
  {
    pullChildren();
    return this.mDecorToolbar.hideOverflowMenu();
  }
  
  public void initFeature(int paramInt)
  {
    pullChildren();
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      DecorToolbar localDecorToolbar = this.mDecorToolbar;
      localDecorToolbar.initProgress();
      continue;
      localDecorToolbar = this.mDecorToolbar;
      localDecorToolbar.initIndeterminateProgress();
      continue;
      boolean bool = true;
      setOverlayMode(bool);
    }
  }
  
  public boolean isHideOnContentScrollEnabled()
  {
    return this.mHideOnContentScroll;
  }
  
  public boolean isInOverlayMode()
  {
    return this.mOverlayMode;
  }
  
  public boolean isOverflowMenuShowPending()
  {
    pullChildren();
    return this.mDecorToolbar.isOverflowMenuShowPending();
  }
  
  public boolean isOverflowMenuShowing()
  {
    pullChildren();
    return this.mDecorToolbar.isOverflowMenuShowing();
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Context localContext = getContext();
    init(localContext);
    r.o(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    haltActionBarHideOffsetAnimations();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    int j = getPaddingLeft();
    int k = paramInt3 - paramInt1;
    int m = getPaddingRight();
    k -= m;
    int n = getPaddingTop();
    k = paramInt4 - paramInt2;
    m = getPaddingBottom();
    k -= m;
    k = 0;
    ActionBarOverlayLayout.LayoutParams localLayoutParams = null;
    for (m = 0; m < i; m = k)
    {
      View localView = getChildAt(m);
      k = localView.getVisibility();
      int i1 = 8;
      if (k != i1)
      {
        localLayoutParams = (ActionBarOverlayLayout.LayoutParams)localView.getLayoutParams();
        i1 = localView.getMeasuredWidth();
        int i2 = localView.getMeasuredHeight();
        int i3 = localLayoutParams.leftMargin + j;
        k = localLayoutParams.topMargin + n;
        i1 += i3;
        i2 += k;
        localView.layout(i3, k, i1, i2);
      }
      k = m + 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    pullChildren();
    boolean bool1 = false;
    Object localObject1 = this.mActionBarTop;
    boolean bool2 = false;
    Rect localRect = null;
    boolean bool3 = false;
    Object localObject2 = this;
    int j = paramInt1;
    int n = paramInt2;
    measureChildWithMargins((View)localObject1, paramInt1, 0, paramInt2, 0);
    localObject2 = (ActionBarOverlayLayout.LayoutParams)this.mActionBarTop.getLayoutParams();
    int i2 = this.mActionBarTop.getMeasuredWidth();
    j = ((ActionBarOverlayLayout.LayoutParams)localObject2).leftMargin;
    i2 += j;
    j = ((ActionBarOverlayLayout.LayoutParams)localObject2).rightMargin;
    i2 += j;
    int i3 = Math.max(0, i2);
    localObject1 = this.mActionBarTop;
    i2 = ((ActionBarContainer)localObject1).getMeasuredHeight();
    j = ((ActionBarOverlayLayout.LayoutParams)localObject2).topMargin;
    i2 += j;
    int i4 = ((ActionBarOverlayLayout.LayoutParams)localObject2).bottomMargin + i2;
    int i6 = Math.max(0, i4);
    localObject2 = this.mActionBarTop;
    i4 = ((ActionBarContainer)localObject2).getMeasuredState();
    int i7 = View.combineMeasuredStates(0, i4);
    i4 = r.n(this) & 0x100;
    Object localObject3;
    if (i4 != 0)
    {
      i4 = 1;
      i2 = i4;
      if (i2 == 0) {
        break label715;
      }
      i4 = this.mActionBarHeight;
      boolean bool4 = this.mHasNonEmbeddedTabs;
      if (bool4)
      {
        localObject3 = this.mActionBarTop.getTabContainer();
        if (localObject3 != null)
        {
          int k = this.mActionBarHeight;
          i4 += k;
        }
      }
    }
    for (;;)
    {
      label234:
      localObject3 = this.mContentInsets;
      localRect = this.mBaseContentInsets;
      ((Rect)localObject3).set(localRect);
      localObject3 = this.mInnerInsets;
      localRect = this.mBaseInnerInsets;
      ((Rect)localObject3).set(localRect);
      boolean bool5 = this.mOverlayMode;
      int m;
      if ((!bool5) && (i2 == 0))
      {
        localObject1 = this.mContentInsets;
        m = ((Rect)localObject1).top;
        i4 += m;
        ((Rect)localObject1).top = i4;
        localObject2 = this.mContentInsets;
        i2 = ((Rect)localObject2).bottom + 0;
      }
      for (((Rect)localObject2).bottom = i2;; ((Rect)localObject2).bottom = i2)
      {
        localObject1 = this.mContent;
        localObject3 = this.mContentInsets;
        bool2 = true;
        n = 1;
        bool3 = true;
        bool1 = true;
        localObject2 = this;
        applyInsets((View)localObject1, (Rect)localObject3, bool2, n, bool3, bool1);
        localObject2 = this.mLastInnerInsets;
        localObject1 = this.mInnerInsets;
        boolean bool6 = ((Rect)localObject2).equals(localObject1);
        if (!bool6)
        {
          localObject2 = this.mLastInnerInsets;
          localObject1 = this.mInnerInsets;
          ((Rect)localObject2).set((Rect)localObject1);
          localObject2 = this.mContent;
          localObject1 = this.mInnerInsets;
          ((ContentFrameLayout)localObject2).dispatchFitSystemWindows((Rect)localObject1);
        }
        localObject1 = this.mContent;
        localObject2 = this;
        m = paramInt1;
        int i1 = paramInt2;
        measureChildWithMargins((View)localObject1, paramInt1, 0, paramInt2, 0);
        localObject2 = (ActionBarOverlayLayout.LayoutParams)this.mContent.getLayoutParams();
        i2 = this.mContent.getMeasuredWidth();
        m = ((ActionBarOverlayLayout.LayoutParams)localObject2).leftMargin;
        i2 += m;
        m = ((ActionBarOverlayLayout.LayoutParams)localObject2).rightMargin;
        i2 += m;
        i2 = Math.max(i3, i2);
        m = this.mContent.getMeasuredHeight();
        int i = ((ActionBarOverlayLayout.LayoutParams)localObject2).topMargin;
        m += i;
        i5 = ((ActionBarOverlayLayout.LayoutParams)localObject2).bottomMargin + m;
        i5 = Math.max(i6, i5);
        m = this.mContent.getMeasuredState();
        m = View.combineMeasuredStates(i7, m);
        i = getPaddingLeft();
        i1 = getPaddingRight();
        i += i1;
        i2 += i;
        i = getPaddingTop();
        i1 = getPaddingBottom();
        i += i1;
        i5 += i;
        i = getSuggestedMinimumHeight();
        i5 = Math.max(i5, i);
        i = getSuggestedMinimumWidth();
        i2 = View.resolveSizeAndState(Math.max(i2, i), paramInt1, m);
        m <<= 16;
        i5 = View.resolveSizeAndState(i5, paramInt2, m);
        setMeasuredDimension(i2, i5);
        return;
        i5 = 0;
        localObject2 = null;
        i2 = 0;
        localObject1 = null;
        break;
        label715:
        localObject2 = this.mActionBarTop;
        i5 = ((ActionBarContainer)localObject2).getVisibility();
        m = 8;
        if (i5 == m) {
          break label807;
        }
        localObject2 = this.mActionBarTop;
        i5 = ((ActionBarContainer)localObject2).getMeasuredHeight();
        break label234;
        localObject1 = this.mInnerInsets;
        m = ((Rect)localObject1).top;
        i5 += m;
        ((Rect)localObject1).top = i5;
        localObject2 = this.mInnerInsets;
        i2 = ((Rect)localObject2).bottom + 0;
      }
      label807:
      int i5 = 0;
      localObject2 = null;
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = this.mHideOnContentScroll;
    if ((!bool2) || (!paramBoolean))
    {
      bool1 = false;
      return bool1;
    }
    bool2 = shouldHideActionBarOnFling(paramFloat1, paramFloat2);
    if (bool2) {
      addActionBarHideOffset();
    }
    for (;;)
    {
      this.mAnimatingForFling = bool1;
      break;
      removeActionBarHideOffset();
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.mHideOnContentScrollReference + paramInt2;
    this.mHideOnContentScrollReference = i;
    i = this.mHideOnContentScrollReference;
    setActionBarHideOffset(i);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.mParentHelper.a(paramView1, paramView2, paramInt);
    int i = getActionBarHideOffset();
    this.mHideOnContentScrollReference = i;
    haltActionBarHideOffsetAnimations();
    ActionBarOverlayLayout.ActionBarVisibilityCallback localActionBarVisibilityCallback = this.mActionBarVisibilityCallback;
    if (localActionBarVisibilityCallback != null)
    {
      localActionBarVisibilityCallback = this.mActionBarVisibilityCallback;
      localActionBarVisibilityCallback.onContentScrollStarted();
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    int i = paramInt & 0x2;
    ActionBarContainer localActionBarContainer;
    if (i != 0)
    {
      localActionBarContainer = this.mActionBarTop;
      i = localActionBarContainer.getVisibility();
      if (i == 0) {}
    }
    else
    {
      i = 0;
      localActionBarContainer = null;
    }
    for (;;)
    {
      return i;
      boolean bool = this.mHideOnContentScroll;
    }
  }
  
  public void onStopNestedScroll(View paramView)
  {
    boolean bool = this.mHideOnContentScroll;
    if (bool)
    {
      bool = this.mAnimatingForFling;
      if (!bool)
      {
        int i = this.mHideOnContentScrollReference;
        ActionBarContainer localActionBarContainer = this.mActionBarTop;
        int j = localActionBarContainer.getHeight();
        if (i > j) {
          break label69;
        }
        postRemoveActionBarHideOffset();
      }
    }
    for (;;)
    {
      ActionBarOverlayLayout.ActionBarVisibilityCallback localActionBarVisibilityCallback = this.mActionBarVisibilityCallback;
      if (localActionBarVisibilityCallback != null)
      {
        localActionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        localActionBarVisibilityCallback.onContentScrollStopped();
      }
      return;
      label69:
      postAddActionBarHideOffset();
    }
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    int i = 1;
    int j = Build.VERSION.SDK_INT;
    int k = 16;
    if (j >= k) {
      super.onWindowSystemUiVisibilityChanged(paramInt);
    }
    pullChildren();
    int m = this.mLastSystemUiVisibility ^ paramInt;
    this.mLastSystemUiVisibility = paramInt;
    j = paramInt & 0x4;
    label61:
    label82:
    ActionBarOverlayLayout.ActionBarVisibilityCallback localActionBarVisibilityCallback2;
    if (j == 0)
    {
      k = i;
      j = paramInt & 0x100;
      if (j == 0) {
        break label145;
      }
      j = i;
      ActionBarOverlayLayout.ActionBarVisibilityCallback localActionBarVisibilityCallback1 = this.mActionBarVisibilityCallback;
      if (localActionBarVisibilityCallback1 != null)
      {
        localActionBarVisibilityCallback1 = this.mActionBarVisibilityCallback;
        if (j != 0) {
          break label153;
        }
        localActionBarVisibilityCallback1.enableContentAnimations(i);
        if ((k == 0) && (j != 0)) {
          break label158;
        }
        localActionBarVisibilityCallback2 = this.mActionBarVisibilityCallback;
        localActionBarVisibilityCallback2.showForSystem();
      }
    }
    for (;;)
    {
      j = m & 0x100;
      if (j != 0)
      {
        localActionBarVisibilityCallback2 = this.mActionBarVisibilityCallback;
        if (localActionBarVisibilityCallback2 != null) {
          r.o(this);
        }
      }
      return;
      k = 0;
      break;
      label145:
      j = 0;
      localActionBarVisibilityCallback2 = null;
      break label61;
      label153:
      i = 0;
      break label82;
      label158:
      localActionBarVisibilityCallback2 = this.mActionBarVisibilityCallback;
      localActionBarVisibilityCallback2.hideForSystem();
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    this.mWindowVisibility = paramInt;
    ActionBarOverlayLayout.ActionBarVisibilityCallback localActionBarVisibilityCallback = this.mActionBarVisibilityCallback;
    if (localActionBarVisibilityCallback != null)
    {
      localActionBarVisibilityCallback = this.mActionBarVisibilityCallback;
      localActionBarVisibilityCallback.onWindowVisibilityChanged(paramInt);
    }
  }
  
  void pullChildren()
  {
    Object localObject = this.mContent;
    if (localObject == null)
    {
      int i = R.id.action_bar_activity_content;
      localObject = (ContentFrameLayout)findViewById(i);
      this.mContent = ((ContentFrameLayout)localObject);
      i = R.id.action_bar_container;
      localObject = (ActionBarContainer)findViewById(i);
      this.mActionBarTop = ((ActionBarContainer)localObject);
      i = R.id.action_bar;
      localObject = findViewById(i);
      localObject = getDecorToolbar((View)localObject);
      this.mDecorToolbar = ((DecorToolbar)localObject);
    }
  }
  
  public void restoreToolbarHierarchyState(SparseArray paramSparseArray)
  {
    pullChildren();
    this.mDecorToolbar.restoreHierarchyState(paramSparseArray);
  }
  
  public void saveToolbarHierarchyState(SparseArray paramSparseArray)
  {
    pullChildren();
    this.mDecorToolbar.saveHierarchyState(paramSparseArray);
  }
  
  public void setActionBarHideOffset(int paramInt)
  {
    haltActionBarHideOffsetAnimations();
    int i = this.mActionBarTop.getHeight();
    i = Math.min(paramInt, i);
    i = Math.max(0, i);
    ActionBarContainer localActionBarContainer = this.mActionBarTop;
    float f = -i;
    localActionBarContainer.setTranslationY(f);
  }
  
  public void setActionBarVisibilityCallback(ActionBarOverlayLayout.ActionBarVisibilityCallback paramActionBarVisibilityCallback)
  {
    this.mActionBarVisibilityCallback = paramActionBarVisibilityCallback;
    Object localObject = getWindowToken();
    if (localObject != null)
    {
      localObject = this.mActionBarVisibilityCallback;
      int i = this.mWindowVisibility;
      ((ActionBarOverlayLayout.ActionBarVisibilityCallback)localObject).onWindowVisibilityChanged(i);
      int j = this.mLastSystemUiVisibility;
      if (j != 0)
      {
        j = this.mLastSystemUiVisibility;
        onWindowSystemUiVisibilityChanged(j);
        r.o(this);
      }
    }
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean)
  {
    this.mHasNonEmbeddedTabs = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    boolean bool = this.mHideOnContentScroll;
    if (paramBoolean != bool)
    {
      this.mHideOnContentScroll = paramBoolean;
      if (!paramBoolean)
      {
        haltActionBarHideOffsetAnimations();
        bool = false;
        setActionBarHideOffset(0);
      }
    }
  }
  
  public void setIcon(int paramInt)
  {
    pullChildren();
    this.mDecorToolbar.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    pullChildren();
    this.mDecorToolbar.setIcon(paramDrawable);
  }
  
  public void setLogo(int paramInt)
  {
    pullChildren();
    this.mDecorToolbar.setLogo(paramInt);
  }
  
  public void setMenu(Menu paramMenu, MenuPresenter.Callback paramCallback)
  {
    pullChildren();
    this.mDecorToolbar.setMenu(paramMenu, paramCallback);
  }
  
  public void setMenuPrepared()
  {
    pullChildren();
    this.mDecorToolbar.setMenuPrepared();
  }
  
  public void setOverlayMode(boolean paramBoolean)
  {
    this.mOverlayMode = paramBoolean;
    ApplicationInfo localApplicationInfo;
    int i;
    if (paramBoolean)
    {
      localApplicationInfo = getContext().getApplicationInfo();
      i = localApplicationInfo.targetSdkVersion;
      int j = 19;
      if (i < j) {
        i = 1;
      }
    }
    for (;;)
    {
      this.mIgnoreWindowContentOverlay = i;
      return;
      i = 0;
      localApplicationInfo = null;
    }
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    pullChildren();
    this.mDecorToolbar.setWindowCallback(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    pullChildren();
    this.mDecorToolbar.setWindowTitle(paramCharSequence);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public boolean showOverflowMenu()
  {
    pullChildren();
    return this.mDecorToolbar.showOverflowMenu();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionBarOverlayLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */