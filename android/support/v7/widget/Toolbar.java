package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.d;
import android.support.v4.view.f;
import android.support.v4.view.r;
import android.support.v7.app.ActionBar.LayoutParams;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar
  extends ViewGroup
{
  private static final String TAG = "Toolbar";
  private MenuPresenter.Callback mActionMenuPresenterCallback;
  int mButtonGravity;
  ImageButton mCollapseButtonView;
  private CharSequence mCollapseDescription;
  private Drawable mCollapseIcon;
  private boolean mCollapsible;
  private int mContentInsetEndWithActions;
  private int mContentInsetStartWithNavigation;
  private RtlSpacingHelper mContentInsets;
  private boolean mEatingHover;
  private boolean mEatingTouch;
  View mExpandedActionView;
  private Toolbar.ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
  private int mGravity = 8388627;
  private final ArrayList mHiddenViews;
  private ImageView mLogoView;
  private int mMaxButtonHeight;
  private MenuBuilder.Callback mMenuBuilderCallback;
  private ActionMenuView mMenuView;
  private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
  private ImageButton mNavButtonView;
  Toolbar.OnMenuItemClickListener mOnMenuItemClickListener;
  private ActionMenuPresenter mOuterActionMenuPresenter;
  private Context mPopupContext;
  private int mPopupTheme;
  private final Runnable mShowOverflowMenuRunnable;
  private CharSequence mSubtitleText;
  private int mSubtitleTextAppearance;
  private int mSubtitleTextColor;
  private TextView mSubtitleTextView;
  private final int[] mTempMargins;
  private final ArrayList mTempViews;
  private int mTitleMarginBottom;
  private int mTitleMarginEnd;
  private int mTitleMarginStart;
  private int mTitleMarginTop;
  private CharSequence mTitleText;
  private int mTitleTextAppearance;
  private int mTitleTextColor;
  private TextView mTitleTextView;
  private ToolbarWidgetWrapper mWrapper;
  
  public Toolbar(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mTempViews = ((ArrayList)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mHiddenViews = ((ArrayList)localObject1);
    localObject1 = new int[2];
    this.mTempMargins = ((int[])localObject1);
    localObject1 = new android/support/v7/widget/Toolbar$1;
    ((Toolbar.1)localObject1).<init>(this);
    this.mMenuViewItemClickListener = ((ActionMenuView.OnMenuItemClickListener)localObject1);
    localObject1 = new android/support/v7/widget/Toolbar$2;
    ((Toolbar.2)localObject1).<init>(this);
    this.mShowOverflowMenuRunnable = ((Runnable)localObject1);
    localObject1 = getContext();
    Object localObject2 = R.styleable.Toolbar;
    localObject2 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    int k = R.styleable.Toolbar_titleTextAppearance;
    k = ((TintTypedArray)localObject2).getResourceId(k, 0);
    this.mTitleTextAppearance = k;
    k = R.styleable.Toolbar_subtitleTextAppearance;
    k = ((TintTypedArray)localObject2).getResourceId(k, 0);
    this.mSubtitleTextAppearance = k;
    k = R.styleable.Toolbar_android_gravity;
    int i1 = this.mGravity;
    k = ((TintTypedArray)localObject2).getInteger(k, i1);
    this.mGravity = k;
    k = R.styleable.Toolbar_buttonGravity;
    k = ((TintTypedArray)localObject2).getInteger(k, 48);
    this.mButtonGravity = k;
    k = R.styleable.Toolbar_titleMargin;
    k = ((TintTypedArray)localObject2).getDimensionPixelOffset(k, 0);
    i1 = R.styleable.Toolbar_titleMargins;
    boolean bool3 = ((TintTypedArray)localObject2).hasValue(i1);
    if (bool3)
    {
      i2 = R.styleable.Toolbar_titleMargins;
      k = ((TintTypedArray)localObject2).getDimensionPixelOffset(i2, k);
    }
    this.mTitleMarginBottom = k;
    this.mTitleMarginTop = k;
    this.mTitleMarginEnd = k;
    this.mTitleMarginStart = k;
    k = R.styleable.Toolbar_titleMarginStart;
    k = ((TintTypedArray)localObject2).getDimensionPixelOffset(k, j);
    if (k >= 0) {
      this.mTitleMarginStart = k;
    }
    k = R.styleable.Toolbar_titleMarginEnd;
    k = ((TintTypedArray)localObject2).getDimensionPixelOffset(k, j);
    if (k >= 0) {
      this.mTitleMarginEnd = k;
    }
    k = R.styleable.Toolbar_titleMarginTop;
    k = ((TintTypedArray)localObject2).getDimensionPixelOffset(k, j);
    if (k >= 0) {
      this.mTitleMarginTop = k;
    }
    k = R.styleable.Toolbar_titleMarginBottom;
    k = ((TintTypedArray)localObject2).getDimensionPixelOffset(k, j);
    if (k >= 0) {
      this.mTitleMarginBottom = k;
    }
    k = R.styleable.Toolbar_maxButtonHeight;
    k = ((TintTypedArray)localObject2).getDimensionPixelSize(k, j);
    this.mMaxButtonHeight = k;
    k = R.styleable.Toolbar_contentInsetStart;
    k = ((TintTypedArray)localObject2).getDimensionPixelOffset(k, i);
    int i2 = R.styleable.Toolbar_contentInsetEnd;
    i2 = ((TintTypedArray)localObject2).getDimensionPixelOffset(i2, i);
    int i3 = R.styleable.Toolbar_contentInsetLeft;
    i3 = ((TintTypedArray)localObject2).getDimensionPixelSize(i3, 0);
    int i4 = R.styleable.Toolbar_contentInsetRight;
    i4 = ((TintTypedArray)localObject2).getDimensionPixelSize(i4, 0);
    ensureContentInsets();
    RtlSpacingHelper localRtlSpacingHelper1 = this.mContentInsets;
    localRtlSpacingHelper1.setAbsolute(i3, i4);
    if ((k != i) || (i2 != i))
    {
      RtlSpacingHelper localRtlSpacingHelper2 = this.mContentInsets;
      localRtlSpacingHelper2.setRelative(k, i2);
    }
    k = R.styleable.Toolbar_contentInsetStartWithNavigation;
    k = ((TintTypedArray)localObject2).getDimensionPixelOffset(k, i);
    this.mContentInsetStartWithNavigation = k;
    k = R.styleable.Toolbar_contentInsetEndWithActions;
    k = ((TintTypedArray)localObject2).getDimensionPixelOffset(k, i);
    this.mContentInsetEndWithActions = k;
    k = R.styleable.Toolbar_collapseIcon;
    localObject1 = ((TintTypedArray)localObject2).getDrawable(k);
    this.mCollapseIcon = ((Drawable)localObject1);
    k = R.styleable.Toolbar_collapseContentDescription;
    localObject1 = ((TintTypedArray)localObject2).getText(k);
    this.mCollapseDescription = ((CharSequence)localObject1);
    k = R.styleable.Toolbar_title;
    localObject1 = ((TintTypedArray)localObject2).getText(k);
    boolean bool4 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool4) {
      setTitle((CharSequence)localObject1);
    }
    k = R.styleable.Toolbar_subtitle;
    localObject1 = ((TintTypedArray)localObject2).getText(k);
    bool4 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool4) {
      setSubtitle((CharSequence)localObject1);
    }
    localObject1 = getContext();
    this.mPopupContext = ((Context)localObject1);
    k = R.styleable.Toolbar_popupTheme;
    k = ((TintTypedArray)localObject2).getResourceId(k, 0);
    setPopupTheme(k);
    k = R.styleable.Toolbar_navigationIcon;
    localObject1 = ((TintTypedArray)localObject2).getDrawable(k);
    if (localObject1 != null) {
      setNavigationIcon((Drawable)localObject1);
    }
    k = R.styleable.Toolbar_navigationContentDescription;
    localObject1 = ((TintTypedArray)localObject2).getText(k);
    bool4 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool4) {
      setNavigationContentDescription((CharSequence)localObject1);
    }
    k = R.styleable.Toolbar_logo;
    localObject1 = ((TintTypedArray)localObject2).getDrawable(k);
    if (localObject1 != null) {
      setLogo((Drawable)localObject1);
    }
    k = R.styleable.Toolbar_logoDescription;
    localObject1 = ((TintTypedArray)localObject2).getText(k);
    bool4 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool4) {
      setLogoDescription((CharSequence)localObject1);
    }
    k = R.styleable.Toolbar_titleTextColor;
    boolean bool1 = ((TintTypedArray)localObject2).hasValue(k);
    if (bool1)
    {
      m = R.styleable.Toolbar_titleTextColor;
      m = ((TintTypedArray)localObject2).getColor(m, j);
      setTitleTextColor(m);
    }
    int m = R.styleable.Toolbar_subtitleTextColor;
    boolean bool2 = ((TintTypedArray)localObject2).hasValue(m);
    if (bool2)
    {
      int n = R.styleable.Toolbar_subtitleTextColor;
      n = ((TintTypedArray)localObject2).getColor(n, j);
      setSubtitleTextColor(n);
    }
    ((TintTypedArray)localObject2).recycle();
  }
  
  private void addCustomViewsWithGravity(List paramList, int paramInt)
  {
    int i = 1;
    int j = 0;
    int k = r.e(this);
    if (k == i) {}
    int m;
    Toolbar.LayoutParams localLayoutParams;
    for (;;)
    {
      k = getChildCount();
      m = r.e(this);
      m = d.a(paramInt, m);
      paramList.clear();
      if (i == 0) {
        break;
      }
      i = k + -1;
      for (j = i; j >= 0; j = i)
      {
        View localView1 = getChildAt(j);
        localLayoutParams = (Toolbar.LayoutParams)localView1.getLayoutParams();
        int n = localLayoutParams.mViewType;
        if (n == 0)
        {
          boolean bool1 = shouldLayout(localView1);
          if (bool1)
          {
            i = localLayoutParams.gravity;
            i = getChildHorizontalGravity(i);
            if (i == m) {
              paramList.add(localView1);
            }
          }
        }
        i = j + -1;
      }
      i = 0;
      localLayoutParams = null;
    }
    while (j < k)
    {
      View localView2 = getChildAt(j);
      localLayoutParams = (Toolbar.LayoutParams)localView2.getLayoutParams();
      int i1 = localLayoutParams.mViewType;
      if (i1 == 0)
      {
        boolean bool2 = shouldLayout(localView2);
        if (bool2)
        {
          i = localLayoutParams.gravity;
          i = getChildHorizontalGravity(i);
          if (i == m) {
            paramList.add(localView2);
          }
        }
      }
      j += 1;
    }
  }
  
  private void addSystemView(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    int i;
    if (localObject == null)
    {
      localObject = generateDefaultLayoutParams();
      i = 1;
      ((Toolbar.LayoutParams)localObject).mViewType = i;
      if (!paramBoolean) {
        break label84;
      }
      View localView = this.mExpandedActionView;
      if (localView == null) {
        break label84;
      }
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localObject = this.mHiddenViews;
      ((ArrayList)localObject).add(paramView);
    }
    for (;;)
    {
      return;
      i = checkLayoutParams((ViewGroup.LayoutParams)localObject);
      if (i == 0)
      {
        localObject = generateLayoutParams((ViewGroup.LayoutParams)localObject);
        break;
      }
      localObject = (Toolbar.LayoutParams)localObject;
      break;
      label84:
      addView(paramView, (ViewGroup.LayoutParams)localObject);
    }
  }
  
  private void ensureContentInsets()
  {
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    if (localRtlSpacingHelper == null)
    {
      localRtlSpacingHelper = new android/support/v7/widget/RtlSpacingHelper;
      localRtlSpacingHelper.<init>();
      this.mContentInsets = localRtlSpacingHelper;
    }
  }
  
  private void ensureLogoView()
  {
    Object localObject = this.mLogoView;
    if (localObject == null)
    {
      localObject = new android/support/v7/widget/AppCompatImageView;
      Context localContext = getContext();
      ((AppCompatImageView)localObject).<init>(localContext);
      this.mLogoView = ((ImageView)localObject);
    }
  }
  
  private void ensureMenu()
  {
    ensureMenuView();
    MenuBuilder localMenuBuilder = this.mMenuView.peekMenu();
    if (localMenuBuilder == null)
    {
      localMenuBuilder = (MenuBuilder)this.mMenuView.getMenu();
      Object localObject = this.mExpandedMenuPresenter;
      if (localObject == null)
      {
        localObject = new android/support/v7/widget/Toolbar$ExpandedActionViewMenuPresenter;
        ((Toolbar.ExpandedActionViewMenuPresenter)localObject).<init>(this);
        this.mExpandedMenuPresenter = ((Toolbar.ExpandedActionViewMenuPresenter)localObject);
      }
      localObject = this.mMenuView;
      boolean bool = true;
      ((ActionMenuView)localObject).setExpandedActionViewsExclusive(bool);
      localObject = this.mExpandedMenuPresenter;
      Context localContext = this.mPopupContext;
      localMenuBuilder.addMenuPresenter((MenuPresenter)localObject, localContext);
    }
  }
  
  private void ensureMenuView()
  {
    Object localObject1 = this.mMenuView;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/widget/ActionMenuView;
      Object localObject2 = getContext();
      ((ActionMenuView)localObject1).<init>((Context)localObject2);
      this.mMenuView = ((ActionMenuView)localObject1);
      localObject1 = this.mMenuView;
      int i = this.mPopupTheme;
      ((ActionMenuView)localObject1).setPopupTheme(i);
      localObject1 = this.mMenuView;
      localObject2 = this.mMenuViewItemClickListener;
      ((ActionMenuView)localObject1).setOnMenuItemClickListener((ActionMenuView.OnMenuItemClickListener)localObject2);
      localObject1 = this.mMenuView;
      localObject2 = this.mActionMenuPresenterCallback;
      MenuBuilder.Callback localCallback = this.mMenuBuilderCallback;
      ((ActionMenuView)localObject1).setMenuCallbacks((MenuPresenter.Callback)localObject2, localCallback);
      localObject1 = generateDefaultLayoutParams();
      int j = this.mButtonGravity & 0x70;
      i = 0x800005 | j;
      ((Toolbar.LayoutParams)localObject1).gravity = i;
      this.mMenuView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = this.mMenuView;
      i = 0;
      localObject2 = null;
      addSystemView((View)localObject1, false);
    }
  }
  
  private void ensureNavButtonView()
  {
    Object localObject1 = this.mNavButtonView;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/widget/AppCompatImageButton;
      Object localObject2 = getContext();
      int i = R.attr.toolbarNavigationButtonStyle;
      ((AppCompatImageButton)localObject1).<init>((Context)localObject2, null, i);
      this.mNavButtonView = ((ImageButton)localObject1);
      localObject1 = generateDefaultLayoutParams();
      int j = this.mButtonGravity & 0x70;
      int k = 0x800003 | j;
      ((Toolbar.LayoutParams)localObject1).gravity = k;
      localObject2 = this.mNavButtonView;
      ((ImageButton)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
  }
  
  private int getChildHorizontalGravity(int paramInt)
  {
    int i = r.e(this);
    int j = d.a(paramInt, i) & 0x7;
    switch (j)
    {
    default: 
      j = 1;
      if (i != j) {
        break;
      }
    }
    for (j = 5;; j = 3) {
      return j;
    }
  }
  
  private int getChildTop(View paramView, int paramInt)
  {
    int i = 0;
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int j = paramView.getMeasuredHeight();
    int k;
    int m;
    int n;
    int i1;
    int i3;
    if (paramInt > 0)
    {
      k = (j - paramInt) / 2;
      m = localLayoutParams.gravity;
      m = getChildVerticalGravity(m);
      switch (m)
      {
      default: 
        m = getPaddingTop();
        n = getPaddingBottom();
        i1 = getHeight();
        k = (i1 - m - n - j) / 2;
        int i2 = localLayoutParams.topMargin;
        if (k < i2) {
          i3 = localLayoutParams.topMargin;
        }
        break;
      }
    }
    for (;;)
    {
      i3 += m;
      for (;;)
      {
        return i3;
        k = 0;
        break;
        i3 = getPaddingTop() - k;
        continue;
        i = getHeight();
        m = getPaddingBottom();
        i = i - m - j;
        i3 = localLayoutParams.bottomMargin;
        i3 = i - i3 - k;
      }
      j = i1 - n - j - k - m;
      n = localLayoutParams.bottomMargin;
      if (j < n)
      {
        i3 = localLayoutParams.bottomMargin - j;
        i3 = k - i3;
        i3 = Math.max(0, i3);
      }
      else
      {
        i3 = k;
      }
    }
  }
  
  private int getChildVerticalGravity(int paramInt)
  {
    int i = paramInt & 0x70;
    switch (i)
    {
    default: 
      i = this.mGravity & 0x70;
    }
    return i;
  }
  
  private int getHorizontalMargins(View paramView)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = f.a(localMarginLayoutParams);
    return f.b(localMarginLayoutParams) + i;
  }
  
  private MenuInflater getMenuInflater()
  {
    SupportMenuInflater localSupportMenuInflater = new android/support/v7/view/SupportMenuInflater;
    Context localContext = getContext();
    localSupportMenuInflater.<init>(localContext);
    return localSupportMenuInflater;
  }
  
  private int getVerticalMargins(View paramView)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = localMarginLayoutParams.topMargin;
    return localMarginLayoutParams.bottomMargin + i;
  }
  
  private int getViewListMeasuredWidth(List paramList, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[1];
    int k = paramList.size();
    int m = 0;
    int n = 0;
    int i1 = j;
    int i2 = i;
    while (m < k)
    {
      View localView = (View)paramList.get(m);
      Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)localView.getLayoutParams();
      i2 = localLayoutParams.leftMargin - i2;
      i = localLayoutParams.rightMargin - i1;
      int i3 = Math.max(0, i2);
      int i4 = Math.max(0, i);
      i1 = -i2;
      i2 = Math.max(0, i1);
      i = -i;
      i1 = Math.max(0, i);
      j = localView.getMeasuredWidth() + i3 + i4;
      i = n + j;
      j = m + 1;
      m = j;
      n = i;
    }
    return n;
  }
  
  private boolean isChildOrHidden(View paramView)
  {
    Object localObject = paramView.getParent();
    boolean bool;
    if (localObject != this)
    {
      localObject = this.mHiddenViews;
      bool = ((ArrayList)localObject).contains(paramView);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private static boolean isCustomView(View paramView)
  {
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.mViewType;
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localLayoutParams = null;
    }
  }
  
  private int layoutChildLeft(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.leftMargin;
    int j = paramArrayOfInt[0];
    i -= j;
    j = Math.max(0, i) + paramInt1;
    i = -i;
    i = Math.max(0, i);
    paramArrayOfInt[0] = i;
    i = getChildTop(paramView, paramInt2);
    int k = paramView.getMeasuredWidth();
    int m = j + k;
    int n = paramView.getMeasuredHeight() + i;
    paramView.layout(j, i, m, n);
    return localLayoutParams.rightMargin + k + j;
  }
  
  private int layoutChildRight(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    int i = 1;
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int j = localLayoutParams.rightMargin;
    int k = paramArrayOfInt[i];
    j -= k;
    k = Math.max(0, j);
    k = paramInt1 - k;
    j = -j;
    j = Math.max(0, j);
    paramArrayOfInt[i] = j;
    j = getChildTop(paramView, paramInt2);
    int m = paramView.getMeasuredWidth();
    i = k - m;
    int n = paramView.getMeasuredHeight() + j;
    paramView.layout(i, j, k, n);
    int i1 = localLayoutParams.leftMargin + m;
    return k - i1;
  }
  
  private int measureChildCollapseMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    int i = 1;
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int j = localMarginLayoutParams.leftMargin;
    int k = paramArrayOfInt[0];
    j -= k;
    k = localMarginLayoutParams.rightMargin;
    int m = paramArrayOfInt[i];
    k -= m;
    m = Math.max(0, j);
    int n = Math.max(0, k);
    m += n;
    j = -j;
    j = Math.max(0, j);
    paramArrayOfInt[0] = j;
    j = -k;
    j = Math.max(0, j);
    paramArrayOfInt[i] = j;
    j = getPaddingLeft();
    k = getPaddingRight();
    j = j + k + m + paramInt2;
    k = localMarginLayoutParams.width;
    j = getChildMeasureSpec(paramInt1, j, k);
    k = getPaddingTop();
    n = getPaddingBottom();
    k += n;
    n = localMarginLayoutParams.topMargin;
    k += n;
    n = localMarginLayoutParams.bottomMargin;
    k = k + n + paramInt4;
    int i1 = localMarginLayoutParams.height;
    i1 = getChildMeasureSpec(paramInt3, k, i1);
    paramView.measure(j, i1);
    return paramView.getMeasuredWidth() + m;
  }
  
  private void measureChildConstrained(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = 1073741824;
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    j += k;
    k = localMarginLayoutParams.leftMargin;
    j += k;
    k = localMarginLayoutParams.rightMargin;
    j = j + k + paramInt2;
    k = localMarginLayoutParams.width;
    j = getChildMeasureSpec(paramInt1, j, k);
    k = getPaddingTop();
    int m = getPaddingBottom();
    k += m;
    m = localMarginLayoutParams.topMargin;
    k += m;
    m = localMarginLayoutParams.bottomMargin;
    k = k + m + paramInt4;
    int n = localMarginLayoutParams.height;
    n = getChildMeasureSpec(paramInt3, k, n);
    k = View.MeasureSpec.getMode(n);
    if ((k != i) && (paramInt5 >= 0))
    {
      if (k != 0)
      {
        n = View.MeasureSpec.getSize(n);
        paramInt5 = Math.min(n, paramInt5);
      }
      n = View.MeasureSpec.makeMeasureSpec(paramInt5, i);
    }
    paramView.measure(j, n);
  }
  
  private void postShowOverflowMenu()
  {
    Runnable localRunnable = this.mShowOverflowMenuRunnable;
    removeCallbacks(localRunnable);
    localRunnable = this.mShowOverflowMenuRunnable;
    post(localRunnable);
  }
  
  private boolean shouldCollapse()
  {
    boolean bool1 = false;
    int i = this.mCollapsible;
    if (i == 0) {}
    for (;;)
    {
      return bool1;
      int k = getChildCount();
      i = 0;
      for (;;)
      {
        if (i >= k) {
          break label76;
        }
        View localView = getChildAt(i);
        boolean bool2 = shouldLayout(localView);
        if (bool2)
        {
          int m = localView.getMeasuredWidth();
          if (m > 0)
          {
            int n = localView.getMeasuredHeight();
            if (n > 0) {
              break;
            }
          }
        }
        int j;
        i += 1;
      }
      label76:
      bool1 = true;
    }
  }
  
  private boolean shouldLayout(View paramView)
  {
    ViewParent localViewParent;
    int i;
    if (paramView != null)
    {
      localViewParent = paramView.getParent();
      if (localViewParent == this)
      {
        i = paramView.getVisibility();
        int k = 8;
        if (i != k) {
          i = 1;
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localViewParent = null;
    }
  }
  
  void addChildrenForExpandedActionView()
  {
    Object localObject = this.mHiddenViews;
    int i = ((ArrayList)localObject).size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      localObject = (View)this.mHiddenViews.get(j);
      addView((View)localObject);
      i = j + -1;
    }
    this.mHiddenViews.clear();
  }
  
  public boolean canShowOverflowMenu()
  {
    int i = getVisibility();
    ActionMenuView localActionMenuView;
    boolean bool;
    if (i == 0)
    {
      localActionMenuView = this.mMenuView;
      if (localActionMenuView != null)
      {
        localActionMenuView = this.mMenuView;
        bool = localActionMenuView.isOverflowReserved();
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuView = null;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = super.checkLayoutParams(paramLayoutParams);
    if (bool)
    {
      bool = paramLayoutParams instanceof Toolbar.LayoutParams;
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void collapseActionView()
  {
    Object localObject = this.mExpandedMenuPresenter;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mExpandedMenuPresenter.mCurrentExpandedItem)
    {
      if (localObject != null) {
        ((MenuItemImpl)localObject).collapseActionView();
      }
      return;
    }
  }
  
  public void dismissPopupMenus()
  {
    ActionMenuView localActionMenuView = this.mMenuView;
    if (localActionMenuView != null)
    {
      localActionMenuView = this.mMenuView;
      localActionMenuView.dismissPopupMenus();
    }
  }
  
  void ensureCollapseButtonView()
  {
    Object localObject1 = this.mCollapseButtonView;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/widget/AppCompatImageButton;
      Object localObject2 = getContext();
      int i = R.attr.toolbarNavigationButtonStyle;
      ((AppCompatImageButton)localObject1).<init>((Context)localObject2, null, i);
      this.mCollapseButtonView = ((ImageButton)localObject1);
      localObject1 = this.mCollapseButtonView;
      localObject2 = this.mCollapseIcon;
      ((ImageButton)localObject1).setImageDrawable((Drawable)localObject2);
      localObject1 = this.mCollapseButtonView;
      localObject2 = this.mCollapseDescription;
      ((ImageButton)localObject1).setContentDescription((CharSequence)localObject2);
      localObject1 = generateDefaultLayoutParams();
      int j = this.mButtonGravity & 0x70;
      int k = 0x800003 | j;
      ((Toolbar.LayoutParams)localObject1).gravity = k;
      k = 2;
      ((Toolbar.LayoutParams)localObject1).mViewType = k;
      this.mCollapseButtonView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = this.mCollapseButtonView;
      localObject2 = new android/support/v7/widget/Toolbar$3;
      ((Toolbar.3)localObject2).<init>(this);
      ((ImageButton)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    }
  }
  
  protected Toolbar.LayoutParams generateDefaultLayoutParams()
  {
    int i = -2;
    Toolbar.LayoutParams localLayoutParams = new android/support/v7/widget/Toolbar$LayoutParams;
    localLayoutParams.<init>(i, i);
    return localLayoutParams;
  }
  
  public Toolbar.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    Toolbar.LayoutParams localLayoutParams = new android/support/v7/widget/Toolbar$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  protected Toolbar.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof Toolbar.LayoutParams;
    Toolbar.LayoutParams localLayoutParams;
    if (bool)
    {
      localLayoutParams = new android/support/v7/widget/Toolbar$LayoutParams;
      paramLayoutParams = (Toolbar.LayoutParams)paramLayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
    }
    for (;;)
    {
      return localLayoutParams;
      bool = paramLayoutParams instanceof ActionBar.LayoutParams;
      if (bool)
      {
        localLayoutParams = new android/support/v7/widget/Toolbar$LayoutParams;
        paramLayoutParams = (ActionBar.LayoutParams)paramLayoutParams;
        localLayoutParams.<init>(paramLayoutParams);
      }
      else
      {
        bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
        if (bool)
        {
          localLayoutParams = new android/support/v7/widget/Toolbar$LayoutParams;
          paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
          localLayoutParams.<init>(paramLayoutParams);
        }
        else
        {
          localLayoutParams = new android/support/v7/widget/Toolbar$LayoutParams;
          localLayoutParams.<init>(paramLayoutParams);
        }
      }
    }
  }
  
  public int getContentInsetEnd()
  {
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    int i;
    if (localRtlSpacingHelper != null)
    {
      localRtlSpacingHelper = this.mContentInsets;
      i = localRtlSpacingHelper.getEnd();
    }
    for (;;)
    {
      return i;
      i = 0;
      localRtlSpacingHelper = null;
    }
  }
  
  public int getContentInsetEndWithActions()
  {
    int i = this.mContentInsetEndWithActions;
    int j = -1 << -1;
    if (i != j) {}
    for (i = this.mContentInsetEndWithActions;; i = getContentInsetEnd()) {
      return i;
    }
  }
  
  public int getContentInsetLeft()
  {
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    int i;
    if (localRtlSpacingHelper != null)
    {
      localRtlSpacingHelper = this.mContentInsets;
      i = localRtlSpacingHelper.getLeft();
    }
    for (;;)
    {
      return i;
      i = 0;
      localRtlSpacingHelper = null;
    }
  }
  
  public int getContentInsetRight()
  {
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    int i;
    if (localRtlSpacingHelper != null)
    {
      localRtlSpacingHelper = this.mContentInsets;
      i = localRtlSpacingHelper.getRight();
    }
    for (;;)
    {
      return i;
      i = 0;
      localRtlSpacingHelper = null;
    }
  }
  
  public int getContentInsetStart()
  {
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    int i;
    if (localRtlSpacingHelper != null)
    {
      localRtlSpacingHelper = this.mContentInsets;
      i = localRtlSpacingHelper.getStart();
    }
    for (;;)
    {
      return i;
      i = 0;
      localRtlSpacingHelper = null;
    }
  }
  
  public int getContentInsetStartWithNavigation()
  {
    int i = this.mContentInsetStartWithNavigation;
    int j = -1 << -1;
    if (i != j) {}
    for (i = this.mContentInsetStartWithNavigation;; i = getContentInsetStart()) {
      return i;
    }
  }
  
  public int getCurrentContentInsetEnd()
  {
    int i = 0;
    Object localObject = this.mMenuView;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.mMenuView.peekMenu();
      if (localObject != null)
      {
        bool = ((MenuBuilder)localObject).hasVisibleItems();
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      if (bool)
      {
        j = getContentInsetEnd();
        int k = this.mContentInsetEndWithActions;
        i = Math.max(k, 0);
      }
      for (int j = Math.max(j, i);; j = getContentInsetEnd())
      {
        return j;
        j = 0;
        localObject = null;
        break;
      }
      j = 0;
      localObject = null;
    }
  }
  
  public int getCurrentContentInsetLeft()
  {
    int i = r.e(this);
    int j = 1;
    if (i == j) {}
    for (i = getCurrentContentInsetEnd();; i = getCurrentContentInsetStart()) {
      return i;
    }
  }
  
  public int getCurrentContentInsetRight()
  {
    int i = r.e(this);
    int j = 1;
    if (i == j) {}
    for (i = getCurrentContentInsetStart();; i = getCurrentContentInsetEnd()) {
      return i;
    }
  }
  
  public int getCurrentContentInsetStart()
  {
    Drawable localDrawable = getNavigationIcon();
    int j;
    if (localDrawable != null)
    {
      i = getContentInsetStart();
      j = Math.max(this.mContentInsetStartWithNavigation, 0);
    }
    for (int i = Math.max(i, j);; i = getContentInsetStart()) {
      return i;
    }
  }
  
  public Drawable getLogo()
  {
    Object localObject = this.mLogoView;
    if (localObject != null) {}
    for (localObject = this.mLogoView.getDrawable();; localObject = null) {
      return (Drawable)localObject;
    }
  }
  
  public CharSequence getLogoDescription()
  {
    Object localObject = this.mLogoView;
    if (localObject != null) {}
    for (localObject = this.mLogoView.getContentDescription();; localObject = null) {
      return (CharSequence)localObject;
    }
  }
  
  public Menu getMenu()
  {
    ensureMenu();
    return this.mMenuView.getMenu();
  }
  
  public CharSequence getNavigationContentDescription()
  {
    Object localObject = this.mNavButtonView;
    if (localObject != null) {}
    for (localObject = this.mNavButtonView.getContentDescription();; localObject = null) {
      return (CharSequence)localObject;
    }
  }
  
  public Drawable getNavigationIcon()
  {
    Object localObject = this.mNavButtonView;
    if (localObject != null) {}
    for (localObject = this.mNavButtonView.getDrawable();; localObject = null) {
      return (Drawable)localObject;
    }
  }
  
  ActionMenuPresenter getOuterActionMenuPresenter()
  {
    return this.mOuterActionMenuPresenter;
  }
  
  public Drawable getOverflowIcon()
  {
    ensureMenu();
    return this.mMenuView.getOverflowIcon();
  }
  
  Context getPopupContext()
  {
    return this.mPopupContext;
  }
  
  public int getPopupTheme()
  {
    return this.mPopupTheme;
  }
  
  public CharSequence getSubtitle()
  {
    return this.mSubtitleText;
  }
  
  public CharSequence getTitle()
  {
    return this.mTitleText;
  }
  
  public int getTitleMarginBottom()
  {
    return this.mTitleMarginBottom;
  }
  
  public int getTitleMarginEnd()
  {
    return this.mTitleMarginEnd;
  }
  
  public int getTitleMarginStart()
  {
    return this.mTitleMarginStart;
  }
  
  public int getTitleMarginTop()
  {
    return this.mTitleMarginTop;
  }
  
  public DecorToolbar getWrapper()
  {
    ToolbarWidgetWrapper localToolbarWidgetWrapper = this.mWrapper;
    if (localToolbarWidgetWrapper == null)
    {
      localToolbarWidgetWrapper = new android/support/v7/widget/ToolbarWidgetWrapper;
      boolean bool = true;
      localToolbarWidgetWrapper.<init>(this, bool);
      this.mWrapper = localToolbarWidgetWrapper;
    }
    return this.mWrapper;
  }
  
  public boolean hasExpandedActionView()
  {
    Object localObject = this.mExpandedMenuPresenter;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.mExpandedMenuPresenter.mCurrentExpandedItem;
      if (localObject != null) {
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
  
  public boolean hideOverflowMenu()
  {
    ActionMenuView localActionMenuView = this.mMenuView;
    boolean bool;
    if (localActionMenuView != null)
    {
      localActionMenuView = this.mMenuView;
      bool = localActionMenuView.hideOverflowMenu();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuView = null;
    }
  }
  
  public void inflateMenu(int paramInt)
  {
    MenuInflater localMenuInflater = getMenuInflater();
    Menu localMenu = getMenu();
    localMenuInflater.inflate(paramInt, localMenu);
  }
  
  public boolean isOverflowMenuShowPending()
  {
    ActionMenuView localActionMenuView = this.mMenuView;
    boolean bool;
    if (localActionMenuView != null)
    {
      localActionMenuView = this.mMenuView;
      bool = localActionMenuView.isOverflowMenuShowPending();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuView = null;
    }
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuView localActionMenuView = this.mMenuView;
    boolean bool;
    if (localActionMenuView != null)
    {
      localActionMenuView = this.mMenuView;
      bool = localActionMenuView.isOverflowMenuShowing();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuView = null;
    }
  }
  
  public boolean isTitleTruncated()
  {
    boolean bool = false;
    TextView localTextView = this.mTitleTextView;
    if (localTextView == null) {}
    label70:
    for (;;)
    {
      return bool;
      localTextView = this.mTitleTextView;
      Layout localLayout = localTextView.getLayout();
      if (localLayout != null)
      {
        int i = localLayout.getLineCount();
        int j = 0;
        localTextView = null;
        for (;;)
        {
          if (j >= i) {
            break label70;
          }
          int k = localLayout.getEllipsisCount(j);
          if (k > 0)
          {
            bool = true;
            break;
          }
          j += 1;
        }
      }
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Runnable localRunnable = this.mShowOverflowMenuRunnable;
    removeCallbacks(localRunnable);
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
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = r.e(this);
    int k = 1;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i6;
    boolean bool2;
    Object localObject4;
    label132:
    int j;
    if (i == k)
    {
      i = 1;
      m = i;
      n = getWidth();
      i1 = getHeight();
      i2 = getPaddingLeft();
      i3 = getPaddingRight();
      i4 = getPaddingTop();
      i5 = getPaddingBottom();
      k = n - i3;
      localObject1 = this;
      localObject1 = this.mTempMargins;
      localObject2 = localObject1;
      localObject3 = null;
      i6 = 1;
      bool2 = false;
      localObject4 = null;
      localObject1[i6] = 0;
      localObject1[0] = 0;
      i = r.j(this);
      if (i < 0) {
        break label1299;
      }
      i6 = paramInt4 - paramInt2;
      i = Math.min(i, i6);
      i6 = i;
      localObject1 = this;
      localObject3 = this.mNavButtonView;
      boolean bool1 = shouldLayout((View)localObject3);
      if (!bool1) {
        break label2306;
      }
      if (m == 0) {
        break label1311;
      }
      localObject3 = this.mNavButtonView;
      j = layoutChildRight((View)localObject3, k, (int[])localObject2, i6);
      k = i2;
    }
    for (;;)
    {
      label183:
      localObject1 = this;
      localObject4 = this.mCollapseButtonView;
      bool2 = shouldLayout((View)localObject4);
      label230:
      label277:
      int i10;
      Object localObject5;
      int i14;
      int i19;
      TextView localTextView1;
      int i13;
      int i8;
      if (bool2)
      {
        if (m != 0)
        {
          localObject4 = this.mCollapseButtonView;
          j = layoutChildRight((View)localObject4, j, (int[])localObject2, i6);
        }
      }
      else
      {
        localObject1 = this;
        localObject4 = this.mMenuView;
        bool2 = shouldLayout((View)localObject4);
        if (bool2)
        {
          if (m == 0) {
            break label1369;
          }
          localObject4 = this.mMenuView;
          k = layoutChildLeft((View)localObject4, k, (int[])localObject2, i6);
        }
        int i7 = getCurrentContentInsetLeft();
        i10 = getCurrentContentInsetRight();
        localObject5 = null;
        int i12 = i7 - k;
        i14 = Math.max(0, i12);
        localObject2[0] = i14;
        i19 = 1;
        localTextView1 = null;
        i12 = n - i3 - j;
        i13 = i10 - i12;
        i14 = Math.max(0, i13);
        localObject2[i19] = i14;
        k = Math.max(k, i7);
        i7 = n - i3 - i10;
        j = Math.min(j, i7);
        localObject1 = this;
        localObject4 = this.mExpandedActionView;
        i8 = shouldLayout((View)localObject4);
        if (i8 != 0)
        {
          if (m == 0) {
            break label1392;
          }
          localObject4 = this.mExpandedActionView;
          j = layoutChildRight((View)localObject4, j, (int[])localObject2, i6);
        }
        label426:
        localObject1 = this;
        localObject4 = this.mLogoView;
        i8 = shouldLayout((View)localObject4);
        if (i8 == 0) {
          break label2295;
        }
        if (m == 0) {
          break label1415;
        }
        localObject4 = this.mLogoView;
        j = layoutChildRight((View)localObject4, j, (int[])localObject2, i6);
        i8 = j;
        i10 = k;
      }
      for (;;)
      {
        label481:
        localObject1 = this;
        localObject3 = this.mTitleTextView;
        boolean bool3 = shouldLayout((View)localObject3);
        localObject3 = this.mSubtitleTextView;
        boolean bool4 = shouldLayout((View)localObject3);
        k = 0;
        Object localObject6 = null;
        int i20;
        if (bool3)
        {
          localObject3 = (Toolbar.LayoutParams)this.mTitleTextView.getLayoutParams();
          i19 = ((Toolbar.LayoutParams)localObject3).topMargin;
          localTextView1 = this.mTitleTextView;
          i14 = localTextView1.getMeasuredHeight();
          i19 += i14;
          j = ((Toolbar.LayoutParams)localObject3).bottomMargin + i20;
          k = 0 + j;
        }
        int i21;
        if (bool4)
        {
          localObject1 = this;
          localObject3 = (Toolbar.LayoutParams)this.mSubtitleTextView.getLayoutParams();
          i20 = ((Toolbar.LayoutParams)localObject3).topMargin;
          localTextView1 = this.mSubtitleTextView;
          i14 = localTextView1.getMeasuredHeight();
          i20 += i14;
          j = ((Toolbar.LayoutParams)localObject3).bottomMargin + i21 + k;
        }
        for (i13 = j;; i13 = k)
        {
          if ((bool3) || (bool4))
          {
            if (!bool3) {
              break label1446;
            }
            localObject1 = this;
            localObject3 = this.mTitleTextView;
            localObject5 = localObject3;
            label670:
            if (!bool4) {
              break label1462;
            }
            localObject1 = this;
            localObject3 = this.mSubtitleTextView;
            localObject6 = localObject3;
            label688:
            localObject3 = (Toolbar.LayoutParams)((View)localObject5).getLayoutParams();
            localObject6 = (Toolbar.LayoutParams)((View)localObject6).getLayoutParams();
            if (bool3)
            {
              localObject1 = this;
              localObject5 = this.mTitleTextView;
              i21 = ((TextView)localObject5).getMeasuredWidth();
              if (i21 > 0) {}
            }
            else
            {
              if (!bool4) {
                break label1478;
              }
              localObject1 = this;
              localObject5 = this.mSubtitleTextView;
              i21 = ((TextView)localObject5).getMeasuredWidth();
              if (i21 <= 0) {
                break label1478;
              }
            }
            i21 = 1;
            label763:
            localObject1 = this;
            i14 = this.mGravity & 0x70;
            switch (i14)
            {
            default: 
              i14 = (i1 - i4 - i5 - i13) / 2;
              int i22 = ((Toolbar.LayoutParams)localObject3).topMargin;
              int i23 = this.mTitleMarginTop;
              i22 += i23;
              i23 = i22;
              if (i14 < i22)
              {
                j = ((Toolbar.LayoutParams)localObject3).topMargin;
                k = this.mTitleMarginTop;
                j += k;
              }
              break;
            }
          }
          for (;;)
          {
            label870:
            i14 = i4 + j;
            label877:
            label896:
            TextView localTextView2;
            TextView localTextView3;
            if (m != 0) {
              if (i21 != 0)
              {
                localObject1 = this;
                j = this.mTitleMarginStart;
                k = localObject2[1];
                j -= k;
                localObject6 = null;
                k = Math.max(0, j);
                k = i8 - k;
                m = 1;
                i9 = 0;
                localObject4 = null;
                j = -j;
                j = Math.max(0, j);
                localObject2[m] = j;
                if (!bool3) {
                  break label2274;
                }
                localObject1 = this;
                localObject3 = (Toolbar.LayoutParams)this.mTitleTextView.getLayoutParams();
                localTextView2 = this.mTitleTextView;
                m = localTextView2.getMeasuredWidth();
                m = k - m;
                localObject4 = this.mTitleTextView;
                i9 = ((TextView)localObject4).getMeasuredHeight() + i14;
                localTextView3 = this.mTitleTextView;
                localTextView3.layout(m, i14, k, i9);
                i14 = this.mTitleMarginEnd;
                m -= i14;
                j = ((Toolbar.LayoutParams)localObject3).bottomMargin;
                i14 = i9 + j;
              }
            }
            label1299:
            label1311:
            label1369:
            label1392:
            label1415:
            label1446:
            label1462:
            label1478:
            label1673:
            int i18;
            label2247:
            label2249:
            label2274:
            for (i9 = m;; i9 = k)
            {
              int i15;
              TextView localTextView4;
              if (bool4)
              {
                localObject1 = this;
                localObject3 = (Toolbar.LayoutParams)this.mSubtitleTextView.getLayoutParams();
                m = ((Toolbar.LayoutParams)localObject3).topMargin + i14;
                localTextView1 = this.mSubtitleTextView;
                i14 = localTextView1.getMeasuredWidth();
                i15 = k - i14;
                localTextView3 = this.mSubtitleTextView;
                i13 = localTextView3.getMeasuredHeight() + m;
                localTextView4 = this.mSubtitleTextView;
                localTextView4.layout(i15, m, k, i13);
                m = this.mTitleMarginEnd;
                m = k - m;
                j = ((Toolbar.LayoutParams)localObject3).bottomMargin + i13;
              }
              for (j = m;; j = k)
              {
                if (i21 != 0) {}
                for (j = Math.min(i9, j);; j = k)
                {
                  i9 = j;
                  localObject1 = this;
                  localObject3 = this.mTempViews;
                  addCustomViewsWithGravity((List)localObject3, 3);
                  i21 = this.mTempViews.size();
                  j = 0;
                  localObject3 = null;
                  m = 0;
                  localTextView2 = null;
                  k = i10;
                  for (;;)
                  {
                    if (m < i21)
                    {
                      localObject1 = this;
                      localObject3 = (View)this.mTempViews.get(m);
                      k = layoutChildLeft((View)localObject3, k, (int[])localObject2, i6);
                      j = m + 1;
                      m = j;
                      continue;
                      j = 0;
                      localObject3 = null;
                      m = 0;
                      localTextView2 = null;
                      break;
                      j = 0;
                      localObject3 = null;
                      i6 = 0;
                      break label132;
                      localObject3 = this.mNavButtonView;
                      j = layoutChildLeft((View)localObject3, i2, (int[])localObject2, i6);
                      int i24 = k;
                      k = j;
                      j = i24;
                      break label183;
                      localObject4 = this.mCollapseButtonView;
                      k = layoutChildLeft((View)localObject4, k, (int[])localObject2, i6);
                      break label230;
                      localObject4 = this.mMenuView;
                      j = layoutChildRight((View)localObject4, j, (int[])localObject2, i6);
                      break label277;
                      localObject4 = this.mExpandedActionView;
                      k = layoutChildLeft((View)localObject4, k, (int[])localObject2, i6);
                      break label426;
                      localObject4 = this.mLogoView;
                      k = layoutChildLeft((View)localObject4, k, (int[])localObject2, i6);
                      i9 = j;
                      i10 = k;
                      break label481;
                      localObject1 = this;
                      localObject3 = this.mSubtitleTextView;
                      localObject5 = localObject3;
                      break label670;
                      localObject1 = this;
                      localObject3 = this.mTitleTextView;
                      localObject6 = localObject3;
                      break label688;
                      i21 = 0;
                      localObject5 = null;
                      break label763;
                      k = getPaddingTop();
                      j = ((Toolbar.LayoutParams)localObject3).topMargin + k;
                      k = this.mTitleMarginTop;
                      i15 = j + k;
                      break label877;
                      i13 = i1 - i5 - i13 - i15 - i4;
                      j = ((Toolbar.LayoutParams)localObject3).bottomMargin;
                      i1 = this.mTitleMarginBottom;
                      j += i1;
                      if (i13 >= j) {
                        break label2281;
                      }
                      localObject3 = null;
                      k = ((Toolbar.LayoutParams)localObject6).bottomMargin;
                      i1 = this.mTitleMarginBottom;
                      k = k + i1 - i13;
                      k = i15 - k;
                      j = Math.max(0, k);
                      break label870;
                      j = i1 - i5;
                      k = ((Toolbar.LayoutParams)localObject6).bottomMargin;
                      j -= k;
                      k = this.mTitleMarginBottom;
                      j -= k;
                      int i16 = j - i13;
                      break label877;
                      j = 0;
                      localObject3 = null;
                      break label896;
                      if (i21 != 0)
                      {
                        localObject1 = this;
                        j = this.mTitleMarginStart;
                        k = localObject2[0];
                        j -= k;
                        k = Math.max(0, j);
                        i10 += k;
                        k = 0;
                        localObject6 = null;
                        m = 0;
                        localTextView2 = null;
                        j = -j;
                        j = Math.max(0, j);
                        localObject2[0] = j;
                        if (!bool3) {
                          break label2249;
                        }
                        localObject1 = this;
                        localObject3 = (Toolbar.LayoutParams)this.mTitleTextView.getLayoutParams();
                        localObject6 = this.mTitleTextView;
                        k = ((TextView)localObject6).getMeasuredWidth() + i11;
                        localTextView2 = this.mTitleTextView;
                        m = localTextView2.getMeasuredHeight() + i16;
                        localTextView3 = this.mTitleTextView;
                        localTextView3.layout(i11, i16, k, m);
                        i16 = this.mTitleMarginEnd;
                        k += i16;
                        j = ((Toolbar.LayoutParams)localObject3).bottomMargin + m;
                        m = k;
                      }
                    }
                  }
                  for (k = j;; k = i18)
                  {
                    if (bool4)
                    {
                      localObject1 = this;
                      localObject3 = (Toolbar.LayoutParams)this.mSubtitleTextView.getLayoutParams();
                      int i17 = ((Toolbar.LayoutParams)localObject3).topMargin;
                      k += i17;
                      localTextView1 = this.mSubtitleTextView;
                      i18 = localTextView1.getMeasuredWidth() + i11;
                      localTextView3 = this.mSubtitleTextView;
                      i13 = localTextView3.getMeasuredHeight() + k;
                      localTextView4 = this.mSubtitleTextView;
                      localTextView4.layout(i11, k, i18, i13);
                      k = this.mTitleMarginEnd + i18;
                      j = ((Toolbar.LayoutParams)localObject3).bottomMargin + i13;
                    }
                    for (j = k;; j = i11)
                    {
                      if (i21 == 0) {
                        break label2247;
                      }
                      i11 = Math.max(m, j);
                      break;
                      j = 0;
                      localObject3 = null;
                      break label1673;
                      localObject1 = this;
                      localObject3 = this.mTempViews;
                      addCustomViewsWithGravity((List)localObject3, 5);
                      i11 = this.mTempViews.size();
                      j = 0;
                      localObject3 = null;
                      m = 0;
                      localTextView2 = null;
                      while (m < i11)
                      {
                        localObject1 = this;
                        localObject3 = (View)this.mTempViews.get(m);
                        i9 = layoutChildRight((View)localObject3, i9, (int[])localObject2, i6);
                        j = m + 1;
                        m = j;
                      }
                      localObject1 = this;
                      localObject3 = this.mTempViews;
                      addCustomViewsWithGravity((List)localObject3, 1);
                      localObject3 = this.mTempViews;
                      m = getViewListMeasuredWidth((List)localObject3, (int[])localObject2);
                      j = (n - i2 - i3) / 2 + i2;
                      i2 = m / 2;
                      j -= i2;
                      m += j;
                      if (j < k) {
                        j = k;
                      }
                      for (;;)
                      {
                        localObject1 = this;
                        i2 = this.mTempViews.size();
                        k = 0;
                        localObject6 = null;
                        m = j;
                        while (k < i2)
                        {
                          localObject1 = this;
                          localObject3 = (View)this.mTempViews.get(k);
                          m = layoutChildLeft((View)localObject3, m, (int[])localObject2, i6);
                          j = k + 1;
                          k = j;
                        }
                        if (m > i9)
                        {
                          k = m - i9;
                          j -= k;
                        }
                      }
                      localObject1 = this;
                      this.mTempViews.clear();
                      return;
                    }
                    break;
                    m = i11;
                  }
                }
              }
            }
            label2281:
            j = i18;
          }
        }
        label2295:
        int i9 = j;
        int i11 = k;
      }
      label2306:
      j = k;
      k = i2;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int[] arrayOfInt = this.mTempMargins;
    boolean bool1 = ViewUtils.isLayoutRtl(this);
    Object localObject1;
    int i7;
    Object localObject2;
    TextView localTextView;
    int i9;
    int i10;
    int i11;
    Object localObject3;
    int i6;
    int i8;
    int i14;
    label862:
    int i2;
    if (bool1)
    {
      boolean bool4 = true;
      bool1 = false;
      localObject1 = null;
      i7 = 0;
      boolean bool7 = bool4;
      bool1 = false;
      localObject1 = null;
      localObject2 = this.mNavButtonView;
      bool4 = shouldLayout((View)localObject2);
      if (bool4)
      {
        localObject2 = this.mNavButtonView;
        localTextView = null;
        i9 = this.mMaxButtonHeight;
        localObject1 = this;
        i10 = paramInt1;
        i11 = paramInt2;
        measureChildConstrained((View)localObject2, paramInt1, 0, paramInt2, 0, i9);
        localObject1 = this.mNavButtonView;
        m = ((ImageButton)localObject1).getMeasuredWidth();
        localObject2 = this.mNavButtonView;
        int i4 = getHorizontalMargins((View)localObject2);
        m += i4;
        i4 = this.mNavButtonView.getMeasuredHeight();
        localObject3 = this.mNavButtonView;
        i10 = getVerticalMargins((View)localObject3);
        i4 += i10;
        i10 = Math.max(0, i4);
        localObject2 = this.mNavButtonView;
        i4 = ((ImageButton)localObject2).getMeasuredState();
        i4 = View.combineMeasuredStates(0, i4);
        k = i4;
        j = i10;
      }
      localObject2 = this.mCollapseButtonView;
      boolean bool5 = shouldLayout((View)localObject2);
      if (bool5)
      {
        localObject2 = this.mCollapseButtonView;
        localTextView = null;
        i9 = this.mMaxButtonHeight;
        localObject1 = this;
        i10 = paramInt1;
        i11 = paramInt2;
        measureChildConstrained((View)localObject2, paramInt1, 0, paramInt2, 0, i9);
        localObject1 = this.mCollapseButtonView;
        m = ((ImageButton)localObject1).getMeasuredWidth();
        localObject2 = this.mCollapseButtonView;
        i5 = getHorizontalMargins((View)localObject2);
        m += i5;
        i5 = this.mCollapseButtonView.getMeasuredHeight();
        localObject3 = this.mCollapseButtonView;
        i10 = getVerticalMargins((View)localObject3);
        i5 += i10;
        j = Math.max(j, i5);
        localObject2 = this.mCollapseButtonView;
        i5 = ((ImageButton)localObject2).getMeasuredState();
        k = View.combineMeasuredStates(k, i5);
      }
      int i5 = getCurrentContentInsetStart();
      i10 = Math.max(i5, m);
      i = 0 + i10;
      i10 = 0;
      localObject3 = null;
      int m = i5 - m;
      m = Math.max(0, m);
      arrayOfInt[bool7] = m;
      m = 0;
      localObject1 = null;
      localObject2 = this.mMenuView;
      boolean bool6 = shouldLayout((View)localObject2);
      if (bool6)
      {
        localObject2 = this.mMenuView;
        localTextView = null;
        i9 = this.mMaxButtonHeight;
        localObject1 = this;
        i10 = paramInt1;
        i11 = paramInt2;
        measureChildConstrained((View)localObject2, paramInt1, i, paramInt2, 0, i9);
        localObject1 = this.mMenuView;
        m = ((ActionMenuView)localObject1).getMeasuredWidth();
        localObject2 = this.mMenuView;
        i6 = getHorizontalMargins((View)localObject2);
        m += i6;
        i6 = this.mMenuView.getMeasuredHeight();
        localObject3 = this.mMenuView;
        i10 = getVerticalMargins((View)localObject3);
        i6 += i10;
        j = Math.max(j, i6);
        localObject2 = this.mMenuView;
        i6 = ((ActionMenuView)localObject2).getMeasuredState();
        k = View.combineMeasuredStates(k, i6);
      }
      i6 = getCurrentContentInsetEnd();
      i10 = Math.max(i6, m);
      i += i10;
      i10 = 0;
      localObject3 = null;
      m = i6 - m;
      m = Math.max(0, m);
      arrayOfInt[i7] = m;
      localObject1 = this.mExpandedActionView;
      boolean bool2 = shouldLayout((View)localObject1);
      if (bool2)
      {
        localObject2 = this.mExpandedActionView;
        localTextView = null;
        localObject1 = this;
        i10 = paramInt1;
        i11 = paramInt2;
        int n = measureChildCollapseMargins((View)localObject2, paramInt1, i, paramInt2, 0, arrayOfInt);
        i += n;
        n = this.mExpandedActionView.getMeasuredHeight();
        localObject2 = this.mExpandedActionView;
        i6 = getVerticalMargins((View)localObject2);
        n += i6;
        j = Math.max(j, n);
        localObject1 = this.mExpandedActionView;
        n = ((View)localObject1).getMeasuredState();
        k = View.combineMeasuredStates(k, n);
      }
      localObject1 = this.mLogoView;
      boolean bool3 = shouldLayout((View)localObject1);
      if (bool3)
      {
        localObject2 = this.mLogoView;
        localTextView = null;
        localObject1 = this;
        i10 = paramInt1;
        i11 = paramInt2;
        i1 = measureChildCollapseMargins((View)localObject2, paramInt1, i, paramInt2, 0, arrayOfInt);
        i += i1;
        i1 = this.mLogoView.getMeasuredHeight();
        localObject2 = this.mLogoView;
        i6 = getVerticalMargins((View)localObject2);
        i1 += i6;
        j = Math.max(j, i1);
        localObject1 = this.mLogoView;
        i1 = ((ImageView)localObject1).getMeasuredState();
        k = View.combineMeasuredStates(k, i1);
      }
      i8 = getChildCount();
      int i1 = 0;
      localObject1 = null;
      i7 = 0;
      i14 = j;
      j = k;
      if (i7 >= i8) {
        break label1045;
      }
      localObject2 = getChildAt(i7);
      localObject1 = (Toolbar.LayoutParams)((View)localObject2).getLayoutParams();
      i1 = ((Toolbar.LayoutParams)localObject1).mViewType;
      if (i1 != 0) {
        break label1517;
      }
      i2 = shouldLayout((View)localObject2);
      if (i2 != 0) {
        break label960;
      }
      i2 = j;
      i6 = i14;
    }
    for (;;)
    {
      i10 = i7 + 1;
      i7 = i10;
      j = i2;
      i14 = i6;
      break label862;
      i6 = 0;
      localObject2 = null;
      i2 = 1;
      i7 = i2;
      i8 = 0;
      break;
      label960:
      localTextView = null;
      localObject1 = this;
      i10 = paramInt1;
      i11 = paramInt2;
      int i3 = measureChildCollapseMargins((View)localObject2, paramInt1, i, paramInt2, 0, arrayOfInt);
      i += i3;
      i3 = ((View)localObject2).getMeasuredHeight();
      i10 = getVerticalMargins((View)localObject2);
      i3 += i10;
      i10 = Math.max(i14, i3);
      i3 = ((View)localObject2).getMeasuredState();
      i3 = View.combineMeasuredStates(j, i3);
      i6 = i10;
      continue;
      label1045:
      i6 = 0;
      localObject2 = null;
      i3 = 0;
      localObject1 = null;
      i10 = this.mTitleMarginTop;
      i11 = this.mTitleMarginBottom;
      k = i10 + i11;
      i10 = this.mTitleMarginStart;
      i11 = this.mTitleMarginEnd;
      i10 += i11;
      Object localObject4 = this.mTitleTextView;
      boolean bool9 = shouldLayout((View)localObject4);
      if (bool9)
      {
        localTextView = this.mTitleTextView;
        i7 = i + i10;
        localObject4 = this;
        i9 = paramInt1;
        i8 = paramInt2;
        measureChildCollapseMargins(localTextView, paramInt1, i7, paramInt2, k, arrayOfInt);
        i3 = this.mTitleTextView.getMeasuredWidth();
        localObject2 = this.mTitleTextView;
        i6 = getHorizontalMargins((View)localObject2) + i3;
        localObject1 = this.mTitleTextView;
        i3 = ((TextView)localObject1).getMeasuredHeight();
        localObject4 = this.mTitleTextView;
        int i12 = getVerticalMargins((View)localObject4);
        i3 += i12;
        localObject4 = this.mTitleTextView;
        i12 = ((TextView)localObject4).getMeasuredState();
        j = View.combineMeasuredStates(j, i12);
      }
      localObject4 = this.mSubtitleTextView;
      boolean bool10 = shouldLayout((View)localObject4);
      if (bool10)
      {
        localTextView = this.mSubtitleTextView;
        i7 = i + i10;
        k += i3;
        localObject4 = this;
        i9 = paramInt1;
        i8 = paramInt2;
        i10 = measureChildCollapseMargins(localTextView, paramInt1, i7, paramInt2, k, arrayOfInt);
        i6 = Math.max(i6, i10);
        i10 = this.mSubtitleTextView.getMeasuredHeight();
        localObject4 = this.mSubtitleTextView;
        int i13 = getVerticalMargins((View)localObject4);
        i10 += i13;
        i3 += i10;
        localObject3 = this.mSubtitleTextView;
        i10 = ((TextView)localObject3).getMeasuredState();
        j = View.combineMeasuredStates(j, i10);
      }
      i6 += i;
      i3 = Math.max(i14, i3);
      i10 = getPaddingLeft();
      i = getPaddingRight();
      i10 += i;
      i6 += i10;
      i10 = getPaddingTop();
      i = getPaddingBottom();
      i10 += i;
      i3 += i10;
      i10 = getSuggestedMinimumWidth();
      i6 = Math.max(i6, i10);
      i10 = 0xFF000000 & j;
      i6 = View.resolveSizeAndState(i6, paramInt1, i10);
      i10 = getSuggestedMinimumHeight();
      i3 = Math.max(i3, i10);
      i10 = j << 16;
      i3 = View.resolveSizeAndState(i3, paramInt2, i10);
      boolean bool8 = shouldCollapse();
      if (bool8)
      {
        i3 = 0;
        localObject1 = null;
      }
      setMeasuredDimension(i6, i3);
      return;
      label1517:
      i3 = j;
      i6 = i14;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof Toolbar.SavedState;
    if (!bool)
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (Toolbar.SavedState)paramParcelable;
    Object localObject = paramParcelable.getSuperState();
    super.onRestoreInstanceState((Parcelable)localObject);
    localObject = this.mMenuView;
    if (localObject != null) {}
    for (localObject = this.mMenuView.peekMenu();; localObject = null)
    {
      int i = paramParcelable.expandedMenuItemId;
      if (i != 0)
      {
        Toolbar.ExpandedActionViewMenuPresenter localExpandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        if ((localExpandedActionViewMenuPresenter != null) && (localObject != null))
        {
          i = paramParcelable.expandedMenuItemId;
          localObject = ((Menu)localObject).findItem(i);
          if (localObject != null) {
            ((MenuItem)localObject).expandActionView();
          }
        }
      }
      bool = paramParcelable.isOverflowOpen;
      if (!bool) {
        break;
      }
      postShowOverflowMenu();
      break;
      bool = false;
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    int i = 1;
    int j = Build.VERSION.SDK_INT;
    int k = 17;
    if (j >= k) {
      super.onRtlPropertiesChanged(paramInt);
    }
    ensureContentInsets();
    RtlSpacingHelper localRtlSpacingHelper = this.mContentInsets;
    if (paramInt == i) {}
    for (;;)
    {
      localRtlSpacingHelper.setDirection(i);
      return;
      i = 0;
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    Toolbar.SavedState localSavedState = new android/support/v7/widget/Toolbar$SavedState;
    Object localObject = super.onSaveInstanceState();
    localSavedState.<init>((Parcelable)localObject);
    localObject = this.mExpandedMenuPresenter;
    if (localObject != null)
    {
      localObject = this.mExpandedMenuPresenter.mCurrentExpandedItem;
      if (localObject != null)
      {
        localObject = this.mExpandedMenuPresenter.mCurrentExpandedItem;
        int i = ((MenuItemImpl)localObject).getItemId();
        localSavedState.expandedMenuItemId = i;
      }
    }
    boolean bool = isOverflowMenuShowing();
    localSavedState.isOverflowOpen = bool;
    return localSavedState;
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
  
  void removeChildrenForExpandedActionView()
  {
    int i = getChildCount() + -1;
    for (int j = i; j >= 0; j = i)
    {
      View localView = getChildAt(j);
      Object localObject = (Toolbar.LayoutParams)localView.getLayoutParams();
      i = ((Toolbar.LayoutParams)localObject).mViewType;
      int k = 2;
      if (i != k)
      {
        localObject = this.mMenuView;
        if (localView != localObject)
        {
          removeViewAt(j);
          localObject = this.mHiddenViews;
          ((ArrayList)localObject).add(localView);
        }
      }
      i = j + -1;
    }
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    this.mCollapsible = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = -1 << -1;
    }
    int i = this.mContentInsetEndWithActions;
    if (paramInt != i)
    {
      this.mContentInsetEndWithActions = paramInt;
      Drawable localDrawable = getNavigationIcon();
      if (localDrawable != null) {
        requestLayout();
      }
    }
  }
  
  public void setContentInsetStartWithNavigation(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = -1 << -1;
    }
    int i = this.mContentInsetStartWithNavigation;
    if (paramInt != i)
    {
      this.mContentInsetStartWithNavigation = paramInt;
      Drawable localDrawable = getNavigationIcon();
      if (localDrawable != null) {
        requestLayout();
      }
    }
  }
  
  public void setContentInsetsAbsolute(int paramInt1, int paramInt2)
  {
    ensureContentInsets();
    this.mContentInsets.setAbsolute(paramInt1, paramInt2);
  }
  
  public void setContentInsetsRelative(int paramInt1, int paramInt2)
  {
    ensureContentInsets();
    this.mContentInsets.setRelative(paramInt1, paramInt2);
  }
  
  public void setLogo(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);
    setLogo(localDrawable);
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    Object localObject;
    boolean bool1;
    if (paramDrawable != null)
    {
      ensureLogoView();
      localObject = this.mLogoView;
      bool1 = isChildOrHidden((View)localObject);
      if (!bool1)
      {
        localObject = this.mLogoView;
        boolean bool2 = true;
        addSystemView((View)localObject, bool2);
      }
    }
    for (;;)
    {
      localObject = this.mLogoView;
      if (localObject != null)
      {
        localObject = this.mLogoView;
        ((ImageView)localObject).setImageDrawable(paramDrawable);
      }
      return;
      localObject = this.mLogoView;
      if (localObject != null)
      {
        localObject = this.mLogoView;
        bool1 = isChildOrHidden((View)localObject);
        if (bool1)
        {
          localObject = this.mLogoView;
          removeView((View)localObject);
          localObject = this.mHiddenViews;
          ImageView localImageView = this.mLogoView;
          ((ArrayList)localObject).remove(localImageView);
        }
      }
    }
  }
  
  public void setLogoDescription(int paramInt)
  {
    CharSequence localCharSequence = getContext().getText(paramInt);
    setLogoDescription(localCharSequence);
  }
  
  public void setLogoDescription(CharSequence paramCharSequence)
  {
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (!bool) {
      ensureLogoView();
    }
    ImageView localImageView = this.mLogoView;
    if (localImageView != null)
    {
      localImageView = this.mLogoView;
      localImageView.setContentDescription(paramCharSequence);
    }
  }
  
  public void setMenu(MenuBuilder paramMenuBuilder, ActionMenuPresenter paramActionMenuPresenter)
  {
    boolean bool = true;
    if (paramMenuBuilder == null)
    {
      localObject1 = this.mMenuView;
      if (localObject1 != null) {}
    }
    do
    {
      return;
      ensureMenuView();
      localObject1 = this.mMenuView.peekMenu();
    } while (localObject1 == paramMenuBuilder);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = this.mOuterActionMenuPresenter;
      ((MenuBuilder)localObject1).removeMenuPresenter((MenuPresenter)localObject2);
      localObject2 = this.mExpandedMenuPresenter;
      ((MenuBuilder)localObject1).removeMenuPresenter((MenuPresenter)localObject2);
    }
    Object localObject1 = this.mExpandedMenuPresenter;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/widget/Toolbar$ExpandedActionViewMenuPresenter;
      ((Toolbar.ExpandedActionViewMenuPresenter)localObject1).<init>(this);
      this.mExpandedMenuPresenter = ((Toolbar.ExpandedActionViewMenuPresenter)localObject1);
    }
    paramActionMenuPresenter.setExpandedActionViewsExclusive(bool);
    if (paramMenuBuilder != null)
    {
      localObject1 = this.mPopupContext;
      paramMenuBuilder.addMenuPresenter(paramActionMenuPresenter, (Context)localObject1);
      localObject1 = this.mExpandedMenuPresenter;
      localObject2 = this.mPopupContext;
      paramMenuBuilder.addMenuPresenter((MenuPresenter)localObject1, (Context)localObject2);
    }
    for (;;)
    {
      localObject1 = this.mMenuView;
      int i = this.mPopupTheme;
      ((ActionMenuView)localObject1).setPopupTheme(i);
      localObject1 = this.mMenuView;
      ((ActionMenuView)localObject1).setPresenter(paramActionMenuPresenter);
      this.mOuterActionMenuPresenter = paramActionMenuPresenter;
      break;
      localObject1 = this.mPopupContext;
      paramActionMenuPresenter.initForMenu((Context)localObject1, null);
      localObject1 = this.mExpandedMenuPresenter;
      localObject2 = this.mPopupContext;
      ((Toolbar.ExpandedActionViewMenuPresenter)localObject1).initForMenu((Context)localObject2, null);
      paramActionMenuPresenter.updateMenuView(bool);
      localObject1 = this.mExpandedMenuPresenter;
      ((Toolbar.ExpandedActionViewMenuPresenter)localObject1).updateMenuView(bool);
    }
  }
  
  public void setMenuCallbacks(MenuPresenter.Callback paramCallback, MenuBuilder.Callback paramCallback1)
  {
    this.mActionMenuPresenterCallback = paramCallback;
    this.mMenuBuilderCallback = paramCallback1;
    ActionMenuView localActionMenuView = this.mMenuView;
    if (localActionMenuView != null)
    {
      localActionMenuView = this.mMenuView;
      localActionMenuView.setMenuCallbacks(paramCallback, paramCallback1);
    }
  }
  
  public void setNavigationContentDescription(int paramInt)
  {
    if (paramInt != 0) {}
    for (CharSequence localCharSequence = getContext().getText(paramInt);; localCharSequence = null)
    {
      setNavigationContentDescription(localCharSequence);
      return;
    }
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (!bool) {
      ensureNavButtonView();
    }
    ImageButton localImageButton = this.mNavButtonView;
    if (localImageButton != null)
    {
      localImageButton = this.mNavButtonView;
      localImageButton.setContentDescription(paramCharSequence);
    }
  }
  
  public void setNavigationIcon(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);
    setNavigationIcon(localDrawable);
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    Object localObject;
    boolean bool1;
    if (paramDrawable != null)
    {
      ensureNavButtonView();
      localObject = this.mNavButtonView;
      bool1 = isChildOrHidden((View)localObject);
      if (!bool1)
      {
        localObject = this.mNavButtonView;
        boolean bool2 = true;
        addSystemView((View)localObject, bool2);
      }
    }
    for (;;)
    {
      localObject = this.mNavButtonView;
      if (localObject != null)
      {
        localObject = this.mNavButtonView;
        ((ImageButton)localObject).setImageDrawable(paramDrawable);
      }
      return;
      localObject = this.mNavButtonView;
      if (localObject != null)
      {
        localObject = this.mNavButtonView;
        bool1 = isChildOrHidden((View)localObject);
        if (bool1)
        {
          localObject = this.mNavButtonView;
          removeView((View)localObject);
          localObject = this.mHiddenViews;
          ImageButton localImageButton = this.mNavButtonView;
          ((ArrayList)localObject).remove(localImageButton);
        }
      }
    }
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    ensureNavButtonView();
    this.mNavButtonView.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(Toolbar.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mOnMenuItemClickListener = paramOnMenuItemClickListener;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    ensureMenu();
    this.mMenuView.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(int paramInt)
  {
    int i = this.mPopupTheme;
    Object localObject;
    if (i != paramInt)
    {
      this.mPopupTheme = paramInt;
      if (paramInt != 0) {
        break label30;
      }
      localObject = getContext();
    }
    for (this.mPopupContext = ((Context)localObject);; this.mPopupContext = ((Context)localObject))
    {
      return;
      label30:
      localObject = new android/view/ContextThemeWrapper;
      Context localContext = getContext();
      ((ContextThemeWrapper)localObject).<init>(localContext, paramInt);
    }
  }
  
  public void setSubtitle(int paramInt)
  {
    CharSequence localCharSequence = getContext().getText(paramInt);
    setSubtitle(localCharSequence);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    boolean bool1 = TextUtils.isEmpty(paramCharSequence);
    Object localObject1;
    Object localObject2;
    boolean bool2;
    if (!bool1)
    {
      localObject1 = this.mSubtitleTextView;
      int j;
      if (localObject1 == null)
      {
        localObject1 = getContext();
        localObject2 = new android/support/v7/widget/AppCompatTextView;
        ((AppCompatTextView)localObject2).<init>((Context)localObject1);
        this.mSubtitleTextView = ((TextView)localObject2);
        this.mSubtitleTextView.setSingleLine();
        localObject2 = this.mSubtitleTextView;
        TextUtils.TruncateAt localTruncateAt = TextUtils.TruncateAt.END;
        ((TextView)localObject2).setEllipsize(localTruncateAt);
        j = this.mSubtitleTextAppearance;
        if (j != 0)
        {
          localObject2 = this.mSubtitleTextView;
          int k = this.mSubtitleTextAppearance;
          ((TextView)localObject2).setTextAppearance((Context)localObject1, k);
        }
        int i = this.mSubtitleTextColor;
        if (i != 0)
        {
          localObject1 = this.mSubtitleTextView;
          j = this.mSubtitleTextColor;
          ((TextView)localObject1).setTextColor(j);
        }
      }
      localObject1 = this.mSubtitleTextView;
      bool2 = isChildOrHidden((View)localObject1);
      if (!bool2)
      {
        localObject1 = this.mSubtitleTextView;
        j = 1;
        addSystemView((View)localObject1, j);
      }
    }
    for (;;)
    {
      localObject1 = this.mSubtitleTextView;
      if (localObject1 != null)
      {
        localObject1 = this.mSubtitleTextView;
        ((TextView)localObject1).setText(paramCharSequence);
      }
      this.mSubtitleText = paramCharSequence;
      return;
      localObject1 = this.mSubtitleTextView;
      if (localObject1 != null)
      {
        localObject1 = this.mSubtitleTextView;
        bool2 = isChildOrHidden((View)localObject1);
        if (bool2)
        {
          localObject1 = this.mSubtitleTextView;
          removeView((View)localObject1);
          localObject1 = this.mHiddenViews;
          localObject2 = this.mSubtitleTextView;
          ((ArrayList)localObject1).remove(localObject2);
        }
      }
    }
  }
  
  public void setSubtitleTextAppearance(Context paramContext, int paramInt)
  {
    this.mSubtitleTextAppearance = paramInt;
    TextView localTextView = this.mSubtitleTextView;
    if (localTextView != null)
    {
      localTextView = this.mSubtitleTextView;
      localTextView.setTextAppearance(paramContext, paramInt);
    }
  }
  
  public void setSubtitleTextColor(int paramInt)
  {
    this.mSubtitleTextColor = paramInt;
    TextView localTextView = this.mSubtitleTextView;
    if (localTextView != null)
    {
      localTextView = this.mSubtitleTextView;
      localTextView.setTextColor(paramInt);
    }
  }
  
  public void setTitle(int paramInt)
  {
    CharSequence localCharSequence = getContext().getText(paramInt);
    setTitle(localCharSequence);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    boolean bool1 = TextUtils.isEmpty(paramCharSequence);
    Object localObject1;
    Object localObject2;
    boolean bool2;
    if (!bool1)
    {
      localObject1 = this.mTitleTextView;
      int j;
      if (localObject1 == null)
      {
        localObject1 = getContext();
        localObject2 = new android/support/v7/widget/AppCompatTextView;
        ((AppCompatTextView)localObject2).<init>((Context)localObject1);
        this.mTitleTextView = ((TextView)localObject2);
        this.mTitleTextView.setSingleLine();
        localObject2 = this.mTitleTextView;
        TextUtils.TruncateAt localTruncateAt = TextUtils.TruncateAt.END;
        ((TextView)localObject2).setEllipsize(localTruncateAt);
        j = this.mTitleTextAppearance;
        if (j != 0)
        {
          localObject2 = this.mTitleTextView;
          int k = this.mTitleTextAppearance;
          ((TextView)localObject2).setTextAppearance((Context)localObject1, k);
        }
        int i = this.mTitleTextColor;
        if (i != 0)
        {
          localObject1 = this.mTitleTextView;
          j = this.mTitleTextColor;
          ((TextView)localObject1).setTextColor(j);
        }
      }
      localObject1 = this.mTitleTextView;
      bool2 = isChildOrHidden((View)localObject1);
      if (!bool2)
      {
        localObject1 = this.mTitleTextView;
        j = 1;
        addSystemView((View)localObject1, j);
      }
    }
    for (;;)
    {
      localObject1 = this.mTitleTextView;
      if (localObject1 != null)
      {
        localObject1 = this.mTitleTextView;
        ((TextView)localObject1).setText(paramCharSequence);
      }
      this.mTitleText = paramCharSequence;
      return;
      localObject1 = this.mTitleTextView;
      if (localObject1 != null)
      {
        localObject1 = this.mTitleTextView;
        bool2 = isChildOrHidden((View)localObject1);
        if (bool2)
        {
          localObject1 = this.mTitleTextView;
          removeView((View)localObject1);
          localObject1 = this.mHiddenViews;
          localObject2 = this.mTitleTextView;
          ((ArrayList)localObject1).remove(localObject2);
        }
      }
    }
  }
  
  public void setTitleMargin(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mTitleMarginStart = paramInt1;
    this.mTitleMarginTop = paramInt2;
    this.mTitleMarginEnd = paramInt3;
    this.mTitleMarginBottom = paramInt4;
    requestLayout();
  }
  
  public void setTitleMarginBottom(int paramInt)
  {
    this.mTitleMarginBottom = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt)
  {
    this.mTitleMarginEnd = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt)
  {
    this.mTitleMarginStart = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt)
  {
    this.mTitleMarginTop = paramInt;
    requestLayout();
  }
  
  public void setTitleTextAppearance(Context paramContext, int paramInt)
  {
    this.mTitleTextAppearance = paramInt;
    TextView localTextView = this.mTitleTextView;
    if (localTextView != null)
    {
      localTextView = this.mTitleTextView;
      localTextView.setTextAppearance(paramContext, paramInt);
    }
  }
  
  public void setTitleTextColor(int paramInt)
  {
    this.mTitleTextColor = paramInt;
    TextView localTextView = this.mTitleTextView;
    if (localTextView != null)
    {
      localTextView = this.mTitleTextView;
      localTextView.setTextColor(paramInt);
    }
  }
  
  public boolean showOverflowMenu()
  {
    ActionMenuView localActionMenuView = this.mMenuView;
    boolean bool;
    if (localActionMenuView != null)
    {
      localActionMenuView = this.mMenuView;
      bool = localActionMenuView.showOverflowMenu();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuView = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\Toolbar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */