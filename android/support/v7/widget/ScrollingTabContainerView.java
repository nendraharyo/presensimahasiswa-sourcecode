package android.support.v7.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.appcompat.R.attr;
import android.support.v7.view.ActionBarPolicy;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class ScrollingTabContainerView
  extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  private static final int FADE_DURATION = 200;
  private static final String TAG = "ScrollingTabContainerView";
  private static final Interpolator sAlphaInterpolator;
  private boolean mAllowCollapse;
  private int mContentHeight;
  int mMaxTabWidth;
  private int mSelectedTabIndex;
  int mStackedTabMaxWidth;
  private ScrollingTabContainerView.TabClickListener mTabClickListener;
  LinearLayoutCompat mTabLayout;
  Runnable mTabSelector;
  private Spinner mTabSpinner;
  protected final ScrollingTabContainerView.VisibilityAnimListener mVisAnimListener;
  protected ViewPropertyAnimator mVisibilityAnim;
  
  static
  {
    DecelerateInterpolator localDecelerateInterpolator = new android/view/animation/DecelerateInterpolator;
    localDecelerateInterpolator.<init>();
    sAlphaInterpolator = localDecelerateInterpolator;
  }
  
  public ScrollingTabContainerView(Context paramContext)
  {
    super(paramContext);
    Object localObject = new android/support/v7/widget/ScrollingTabContainerView$VisibilityAnimListener;
    ((ScrollingTabContainerView.VisibilityAnimListener)localObject).<init>(this);
    this.mVisAnimListener = ((ScrollingTabContainerView.VisibilityAnimListener)localObject);
    setHorizontalScrollBarEnabled(false);
    localObject = ActionBarPolicy.get(paramContext);
    int i = ((ActionBarPolicy)localObject).getTabContainerHeight();
    setContentHeight(i);
    int j = ((ActionBarPolicy)localObject).getStackedTabMaxWidth();
    this.mStackedTabMaxWidth = j;
    localObject = createTabLayout();
    this.mTabLayout = ((LinearLayoutCompat)localObject);
    localObject = this.mTabLayout;
    ViewGroup.LayoutParams localLayoutParams = new android/view/ViewGroup$LayoutParams;
    localLayoutParams.<init>(-2, -1);
    addView((View)localObject, localLayoutParams);
  }
  
  private Spinner createSpinner()
  {
    AppCompatSpinner localAppCompatSpinner = new android/support/v7/widget/AppCompatSpinner;
    Object localObject = getContext();
    int i = R.attr.actionDropDownStyle;
    localAppCompatSpinner.<init>((Context)localObject, null, i);
    localObject = new android/support/v7/widget/LinearLayoutCompat$LayoutParams;
    ((LinearLayoutCompat.LayoutParams)localObject).<init>(-2, -1);
    localAppCompatSpinner.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localAppCompatSpinner.setOnItemSelectedListener(this);
    return localAppCompatSpinner;
  }
  
  private LinearLayoutCompat createTabLayout()
  {
    LinearLayoutCompat localLinearLayoutCompat = new android/support/v7/widget/LinearLayoutCompat;
    Object localObject = getContext();
    int i = R.attr.actionBarTabBarStyle;
    localLinearLayoutCompat.<init>((Context)localObject, null, i);
    localLinearLayoutCompat.setMeasureWithLargestChildEnabled(true);
    localLinearLayoutCompat.setGravity(17);
    localObject = new android/support/v7/widget/LinearLayoutCompat$LayoutParams;
    ((LinearLayoutCompat.LayoutParams)localObject).<init>(-2, -1);
    localLinearLayoutCompat.setLayoutParams((ViewGroup.LayoutParams)localObject);
    return localLinearLayoutCompat;
  }
  
  private boolean isCollapsed()
  {
    Object localObject = this.mTabSpinner;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.mTabSpinner.getParent();
      if (localObject == this) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private void performCollapse()
  {
    boolean bool = isCollapsed();
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject1 = this.mTabSpinner;
      if (localObject1 == null)
      {
        localObject1 = createSpinner();
        this.mTabSpinner = ((Spinner)localObject1);
      }
      localObject1 = this.mTabLayout;
      removeView((View)localObject1);
      localObject1 = this.mTabSpinner;
      Object localObject2 = new android/view/ViewGroup$LayoutParams;
      int i = -2;
      int j = -1;
      ((ViewGroup.LayoutParams)localObject2).<init>(i, j);
      addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
      localObject1 = this.mTabSpinner.getAdapter();
      if (localObject1 == null)
      {
        localObject1 = this.mTabSpinner;
        localObject2 = new android/support/v7/widget/ScrollingTabContainerView$TabAdapter;
        ((ScrollingTabContainerView.TabAdapter)localObject2).<init>(this);
        ((Spinner)localObject1).setAdapter((SpinnerAdapter)localObject2);
      }
      localObject1 = this.mTabSelector;
      if (localObject1 != null)
      {
        localObject1 = this.mTabSelector;
        removeCallbacks((Runnable)localObject1);
        bool = false;
        localObject1 = null;
        this.mTabSelector = null;
      }
      localObject1 = this.mTabSpinner;
      int k = this.mSelectedTabIndex;
      ((Spinner)localObject1).setSelection(k);
    }
  }
  
  private boolean performExpand()
  {
    boolean bool = isCollapsed();
    if (!bool) {}
    for (;;)
    {
      return false;
      Object localObject = this.mTabSpinner;
      removeView((View)localObject);
      localObject = this.mTabLayout;
      ViewGroup.LayoutParams localLayoutParams = new android/view/ViewGroup$LayoutParams;
      int j = -2;
      int k = -1;
      localLayoutParams.<init>(j, k);
      addView((View)localObject, localLayoutParams);
      localObject = this.mTabSpinner;
      int i = ((Spinner)localObject).getSelectedItemPosition();
      setTabSelected(i);
    }
  }
  
  public void addTab(ActionBar.Tab paramTab, int paramInt, boolean paramBoolean)
  {
    ScrollingTabContainerView.TabView localTabView = createTabView(paramTab, false);
    Object localObject = this.mTabLayout;
    LinearLayoutCompat.LayoutParams localLayoutParams = new android/support/v7/widget/LinearLayoutCompat$LayoutParams;
    int i = -1;
    float f = 1.0F;
    localLayoutParams.<init>(0, i, f);
    ((LinearLayoutCompat)localObject).addView(localTabView, paramInt, localLayoutParams);
    localObject = this.mTabSpinner;
    if (localObject != null)
    {
      localObject = (ScrollingTabContainerView.TabAdapter)this.mTabSpinner.getAdapter();
      ((ScrollingTabContainerView.TabAdapter)localObject).notifyDataSetChanged();
    }
    if (paramBoolean)
    {
      bool = true;
      localTabView.setSelected(bool);
    }
    boolean bool = this.mAllowCollapse;
    if (bool) {
      requestLayout();
    }
  }
  
  public void addTab(ActionBar.Tab paramTab, boolean paramBoolean)
  {
    ScrollingTabContainerView.TabView localTabView = createTabView(paramTab, false);
    Object localObject = this.mTabLayout;
    LinearLayoutCompat.LayoutParams localLayoutParams = new android/support/v7/widget/LinearLayoutCompat$LayoutParams;
    int i = -1;
    float f = 1.0F;
    localLayoutParams.<init>(0, i, f);
    ((LinearLayoutCompat)localObject).addView(localTabView, localLayoutParams);
    localObject = this.mTabSpinner;
    if (localObject != null)
    {
      localObject = (ScrollingTabContainerView.TabAdapter)this.mTabSpinner.getAdapter();
      ((ScrollingTabContainerView.TabAdapter)localObject).notifyDataSetChanged();
    }
    if (paramBoolean)
    {
      bool = true;
      localTabView.setSelected(bool);
    }
    boolean bool = this.mAllowCollapse;
    if (bool) {
      requestLayout();
    }
  }
  
  public void animateToTab(int paramInt)
  {
    Object localObject1 = this.mTabLayout.getChildAt(paramInt);
    Object localObject2 = this.mTabSelector;
    if (localObject2 != null)
    {
      localObject2 = this.mTabSelector;
      removeCallbacks((Runnable)localObject2);
    }
    localObject2 = new android/support/v7/widget/ScrollingTabContainerView$1;
    ((ScrollingTabContainerView.1)localObject2).<init>(this, (View)localObject1);
    this.mTabSelector = ((Runnable)localObject2);
    localObject1 = this.mTabSelector;
    post((Runnable)localObject1);
  }
  
  public void animateToVisibility(int paramInt)
  {
    long l = 200L;
    float f = 0.0F;
    Object localObject = null;
    ViewPropertyAnimator localViewPropertyAnimator = this.mVisibilityAnim;
    if (localViewPropertyAnimator != null)
    {
      localViewPropertyAnimator = this.mVisibilityAnim;
      localViewPropertyAnimator.cancel();
    }
    if (paramInt == 0)
    {
      int i = getVisibility();
      if (i != 0) {
        setAlpha(0.0F);
      }
      localViewPropertyAnimator = animate();
      f = 1.0F;
      localViewPropertyAnimator = localViewPropertyAnimator.alpha(f);
      localViewPropertyAnimator.setDuration(l);
      localObject = sAlphaInterpolator;
      localViewPropertyAnimator.setInterpolator((TimeInterpolator)localObject);
      localObject = this.mVisAnimListener.withFinalVisibility(localViewPropertyAnimator, paramInt);
      localViewPropertyAnimator.setListener((Animator.AnimatorListener)localObject);
      localViewPropertyAnimator.start();
    }
    for (;;)
    {
      return;
      localViewPropertyAnimator = animate().alpha(0.0F);
      localViewPropertyAnimator.setDuration(l);
      localObject = sAlphaInterpolator;
      localViewPropertyAnimator.setInterpolator((TimeInterpolator)localObject);
      localObject = this.mVisAnimListener.withFinalVisibility(localViewPropertyAnimator, paramInt);
      localViewPropertyAnimator.setListener((Animator.AnimatorListener)localObject);
      localViewPropertyAnimator.start();
    }
  }
  
  ScrollingTabContainerView.TabView createTabView(ActionBar.Tab paramTab, boolean paramBoolean)
  {
    ScrollingTabContainerView.TabView localTabView = new android/support/v7/widget/ScrollingTabContainerView$TabView;
    Object localObject = getContext();
    localTabView.<init>(this, (Context)localObject, paramTab, paramBoolean);
    boolean bool;
    if (paramBoolean)
    {
      bool = false;
      localTabView.setBackgroundDrawable(null);
      localObject = new android/widget/AbsListView$LayoutParams;
      int i = -1;
      int j = this.mContentHeight;
      ((AbsListView.LayoutParams)localObject).<init>(i, j);
      localTabView.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    for (;;)
    {
      return localTabView;
      bool = true;
      localTabView.setFocusable(bool);
      localObject = this.mTabClickListener;
      if (localObject == null)
      {
        localObject = new android/support/v7/widget/ScrollingTabContainerView$TabClickListener;
        ((ScrollingTabContainerView.TabClickListener)localObject).<init>(this);
        this.mTabClickListener = ((ScrollingTabContainerView.TabClickListener)localObject);
      }
      localObject = this.mTabClickListener;
      localTabView.setOnClickListener((View.OnClickListener)localObject);
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Runnable localRunnable = this.mTabSelector;
    if (localRunnable != null)
    {
      localRunnable = this.mTabSelector;
      post(localRunnable);
    }
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    ActionBarPolicy localActionBarPolicy = ActionBarPolicy.get(getContext());
    int i = localActionBarPolicy.getTabContainerHeight();
    setContentHeight(i);
    int j = localActionBarPolicy.getStackedTabMaxWidth();
    this.mStackedTabMaxWidth = j;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Runnable localRunnable = this.mTabSelector;
    if (localRunnable != null)
    {
      localRunnable = this.mTabSelector;
      removeCallbacks(localRunnable);
    }
  }
  
  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ((ScrollingTabContainerView.TabView)paramView).getTab().select();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1073741824;
    int j = 1;
    int k = 0;
    int m = View.MeasureSpec.getMode(paramInt1);
    int n;
    float f1;
    label120:
    label147:
    label173:
    LinearLayoutCompat localLinearLayoutCompat2;
    if (m == i)
    {
      n = j;
      setFillViewport(n);
      LinearLayoutCompat localLinearLayoutCompat1 = this.mTabLayout;
      int i2 = localLinearLayoutCompat1.getChildCount();
      if (i2 <= j) {
        break label285;
      }
      if (m != i)
      {
        int i3 = -1 << -1;
        if (m != i3) {
          break label285;
        }
      }
      m = 2;
      f1 = 2.8E-45F;
      if (i2 <= m) {
        break label268;
      }
      f1 = View.MeasureSpec.getSize(paramInt1);
      i2 = 1053609165;
      float f2 = 0.4F;
      f1 *= f2;
      m = (int)f1;
      this.mMaxTabWidth = m;
      m = this.mMaxTabWidth;
      i2 = this.mStackedTabMaxWidth;
      m = Math.min(m, i2);
      this.mMaxTabWidth = m;
      m = View.MeasureSpec.makeMeasureSpec(this.mContentHeight, i);
      if (n != 0) {
        break label302;
      }
      boolean bool = this.mAllowCollapse;
      if (!bool) {
        break label302;
      }
      if (j == 0) {
        break label319;
      }
      this.mTabLayout.measure(0, m);
      localLinearLayoutCompat2 = this.mTabLayout;
      j = localLinearLayoutCompat2.getMeasuredWidth();
      k = View.MeasureSpec.getSize(paramInt1);
      if (j <= k) {
        break label311;
      }
      performCollapse();
    }
    for (;;)
    {
      j = getMeasuredWidth();
      super.onMeasure(paramInt1, m);
      k = getMeasuredWidth();
      if ((n != 0) && (j != k))
      {
        i1 = this.mSelectedTabIndex;
        setTabSelected(i1);
      }
      return;
      int i1 = 0;
      break;
      label268:
      m = View.MeasureSpec.getSize(paramInt1) / 2;
      this.mMaxTabWidth = m;
      break label120;
      label285:
      m = -1;
      f1 = 0.0F / 0.0F;
      this.mMaxTabWidth = m;
      break label147;
      label302:
      j = 0;
      localLinearLayoutCompat2 = null;
      break label173;
      label311:
      performExpand();
      continue;
      label319:
      performExpand();
    }
  }
  
  public void onNothingSelected(AdapterView paramAdapterView) {}
  
  public void removeAllTabs()
  {
    this.mTabLayout.removeAllViews();
    Object localObject = this.mTabSpinner;
    if (localObject != null)
    {
      localObject = (ScrollingTabContainerView.TabAdapter)this.mTabSpinner.getAdapter();
      ((ScrollingTabContainerView.TabAdapter)localObject).notifyDataSetChanged();
    }
    boolean bool = this.mAllowCollapse;
    if (bool) {
      requestLayout();
    }
  }
  
  public void removeTabAt(int paramInt)
  {
    this.mTabLayout.removeViewAt(paramInt);
    Object localObject = this.mTabSpinner;
    if (localObject != null)
    {
      localObject = (ScrollingTabContainerView.TabAdapter)this.mTabSpinner.getAdapter();
      ((ScrollingTabContainerView.TabAdapter)localObject).notifyDataSetChanged();
    }
    boolean bool = this.mAllowCollapse;
    if (bool) {
      requestLayout();
    }
  }
  
  public void setAllowCollapse(boolean paramBoolean)
  {
    this.mAllowCollapse = paramBoolean;
  }
  
  public void setContentHeight(int paramInt)
  {
    this.mContentHeight = paramInt;
    requestLayout();
  }
  
  public void setTabSelected(int paramInt)
  {
    this.mSelectedTabIndex = paramInt;
    Object localObject = this.mTabLayout;
    int i = ((LinearLayoutCompat)localObject).getChildCount();
    int j = 0;
    if (j < i)
    {
      localObject = this.mTabLayout;
      View localView = ((LinearLayoutCompat)localObject).getChildAt(j);
      boolean bool;
      if (j == paramInt) {
        bool = true;
      }
      for (;;)
      {
        localView.setSelected(bool);
        if (bool) {
          animateToTab(paramInt);
        }
        int k = j + 1;
        j = k;
        break;
        k = 0;
        localObject = null;
      }
    }
    localObject = this.mTabSpinner;
    if ((localObject != null) && (paramInt >= 0))
    {
      localObject = this.mTabSpinner;
      ((Spinner)localObject).setSelection(paramInt);
    }
  }
  
  public void updateTab(int paramInt)
  {
    ((ScrollingTabContainerView.TabView)this.mTabLayout.getChildAt(paramInt)).update();
    Object localObject = this.mTabSpinner;
    if (localObject != null)
    {
      localObject = (ScrollingTabContainerView.TabAdapter)this.mTabSpinner.getAdapter();
      ((ScrollingTabContainerView.TabAdapter)localObject).notifyDataSetChanged();
    }
    boolean bool = this.mAllowCollapse;
    if (bool) {
      requestLayout();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ScrollingTabContainerView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */