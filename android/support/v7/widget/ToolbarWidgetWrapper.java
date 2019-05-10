package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.support.v4.view.v;
import android.support.v4.view.w;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class ToolbarWidgetWrapper
  implements DecorToolbar
{
  private static final int AFFECTS_LOGO_MASK = 3;
  private static final long DEFAULT_FADE_DURATION_MS = 200L;
  private static final String TAG = "ToolbarWidgetWrapper";
  private ActionMenuPresenter mActionMenuPresenter;
  private View mCustomView;
  private int mDefaultNavigationContentDescription = 0;
  private Drawable mDefaultNavigationIcon;
  private int mDisplayOpts;
  private CharSequence mHomeDescription;
  private Drawable mIcon;
  private Drawable mLogo;
  boolean mMenuPrepared;
  private Drawable mNavIcon;
  private int mNavigationMode = 0;
  private Spinner mSpinner;
  private CharSequence mSubtitle;
  private View mTabView;
  CharSequence mTitle;
  private boolean mTitleSet;
  Toolbar mToolbar;
  Window.Callback mWindowCallback;
  
  public ToolbarWidgetWrapper(Toolbar paramToolbar, boolean paramBoolean)
  {
    this(paramToolbar, paramBoolean, i, j);
  }
  
  public ToolbarWidgetWrapper(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.mToolbar = paramToolbar;
    Object localObject1 = paramToolbar.getTitle();
    this.mTitle = ((CharSequence)localObject1);
    localObject1 = paramToolbar.getSubtitle();
    this.mSubtitle = ((CharSequence)localObject1);
    localObject1 = this.mTitle;
    boolean bool1;
    if (localObject1 != null)
    {
      bool1 = true;
      this.mTitleSet = bool1;
      localObject1 = paramToolbar.getNavigationIcon();
      this.mNavIcon = ((Drawable)localObject1);
      localObject1 = paramToolbar.getContext();
      Object localObject2 = R.styleable.ActionBar;
      int k = R.attr.actionBarStyle;
      localObject1 = TintTypedArray.obtainStyledAttributes((Context)localObject1, null, (int[])localObject2, k, 0);
      int m = R.styleable.ActionBar_homeAsUpIndicator;
      Object localObject3 = ((TintTypedArray)localObject1).getDrawable(m);
      this.mDefaultNavigationIcon = ((Drawable)localObject3);
      if (!paramBoolean) {
        break label679;
      }
      m = R.styleable.ActionBar_title;
      localObject3 = ((TintTypedArray)localObject1).getText(m);
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject3);
      if (!bool2) {
        setTitle((CharSequence)localObject3);
      }
      m = R.styleable.ActionBar_subtitle;
      localObject3 = ((TintTypedArray)localObject1).getText(m);
      bool2 = TextUtils.isEmpty((CharSequence)localObject3);
      if (!bool2) {
        setSubtitle((CharSequence)localObject3);
      }
      m = R.styleable.ActionBar_logo;
      localObject3 = ((TintTypedArray)localObject1).getDrawable(m);
      if (localObject3 != null) {
        setLogo((Drawable)localObject3);
      }
      m = R.styleable.ActionBar_icon;
      localObject3 = ((TintTypedArray)localObject1).getDrawable(m);
      if (localObject3 != null) {
        setIcon((Drawable)localObject3);
      }
      localObject3 = this.mNavIcon;
      if (localObject3 == null)
      {
        localObject3 = this.mDefaultNavigationIcon;
        if (localObject3 != null)
        {
          localObject3 = this.mDefaultNavigationIcon;
          setNavigationIcon((Drawable)localObject3);
        }
      }
      m = R.styleable.ActionBar_displayOptions;
      m = ((TintTypedArray)localObject1).getInt(m, 0);
      setDisplayOptions(m);
      m = R.styleable.ActionBar_customNavigationLayout;
      m = ((TintTypedArray)localObject1).getResourceId(m, 0);
      Object localObject4;
      if (m != 0)
      {
        localObject2 = LayoutInflater.from(this.mToolbar.getContext());
        localObject4 = this.mToolbar;
        localObject3 = ((LayoutInflater)localObject2).inflate(m, (ViewGroup)localObject4, false);
        setCustomView((View)localObject3);
        m = this.mDisplayOpts | 0x10;
        setDisplayOptions(m);
      }
      m = R.styleable.ActionBar_height;
      m = ((TintTypedArray)localObject1).getLayoutDimension(m, 0);
      if (m > 0)
      {
        localObject2 = this.mToolbar.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject2).height = m;
        localObject3 = this.mToolbar;
        ((Toolbar)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      }
      m = R.styleable.ActionBar_contentInsetStart;
      m = ((TintTypedArray)localObject1).getDimensionPixelOffset(m, i);
      int n = R.styleable.ActionBar_contentInsetEnd;
      n = ((TintTypedArray)localObject1).getDimensionPixelOffset(n, i);
      if ((m >= 0) || (n >= 0))
      {
        localObject4 = this.mToolbar;
        m = Math.max(m, 0);
        n = Math.max(n, 0);
        ((Toolbar)localObject4).setContentInsetsRelative(m, n);
      }
      m = R.styleable.ActionBar_titleTextStyle;
      m = ((TintTypedArray)localObject1).getResourceId(m, 0);
      if (m != 0)
      {
        localObject2 = this.mToolbar;
        localObject4 = this.mToolbar.getContext();
        ((Toolbar)localObject2).setTitleTextAppearance((Context)localObject4, m);
      }
      m = R.styleable.ActionBar_subtitleTextStyle;
      m = ((TintTypedArray)localObject1).getResourceId(m, 0);
      if (m != 0)
      {
        localObject2 = this.mToolbar;
        localObject4 = this.mToolbar.getContext();
        ((Toolbar)localObject2).setSubtitleTextAppearance((Context)localObject4, m);
      }
      m = R.styleable.ActionBar_popupTheme;
      j = ((TintTypedArray)localObject1).getResourceId(m, 0);
      if (j != 0)
      {
        localObject3 = this.mToolbar;
        ((Toolbar)localObject3).setPopupTheme(j);
      }
    }
    for (;;)
    {
      ((TintTypedArray)localObject1).recycle();
      setDefaultNavigationContentDescription(paramInt1);
      localObject1 = this.mToolbar.getNavigationContentDescription();
      this.mHomeDescription = ((CharSequence)localObject1);
      localObject1 = this.mToolbar;
      local1 = new android/support/v7/widget/ToolbarWidgetWrapper$1;
      local1.<init>(this);
      ((Toolbar)localObject1).setNavigationOnClickListener(local1);
      return;
      bool1 = false;
      localObject1 = null;
      break;
      label679:
      j = detectDisplayOptions();
      this.mDisplayOpts = j;
    }
  }
  
  private int detectDisplayOptions()
  {
    int i = 11;
    Drawable localDrawable = this.mToolbar.getNavigationIcon();
    if (localDrawable != null)
    {
      i = 15;
      localDrawable = this.mToolbar.getNavigationIcon();
      this.mDefaultNavigationIcon = localDrawable;
    }
    return i;
  }
  
  private void ensureSpinner()
  {
    int i = -2;
    Object localObject1 = this.mSpinner;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/widget/AppCompatSpinner;
      Object localObject2 = getContext();
      int j = R.attr.actionDropDownStyle;
      ((AppCompatSpinner)localObject1).<init>((Context)localObject2, null, j);
      this.mSpinner = ((Spinner)localObject1);
      localObject1 = new android/support/v7/widget/Toolbar$LayoutParams;
      int k = 8388627;
      ((Toolbar.LayoutParams)localObject1).<init>(i, i, k);
      localObject2 = this.mSpinner;
      ((Spinner)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
  }
  
  private void setTitleInt(CharSequence paramCharSequence)
  {
    this.mTitle = paramCharSequence;
    int i = this.mDisplayOpts & 0x8;
    if (i != 0)
    {
      Toolbar localToolbar = this.mToolbar;
      localToolbar.setTitle(paramCharSequence);
    }
  }
  
  private void updateHomeAccessibility()
  {
    int i = this.mDisplayOpts & 0x4;
    Object localObject;
    if (i != 0)
    {
      localObject = this.mHomeDescription;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool) {
        break label41;
      }
      localObject = this.mToolbar;
      int j = this.mDefaultNavigationContentDescription;
      ((Toolbar)localObject).setNavigationContentDescription(j);
    }
    for (;;)
    {
      return;
      label41:
      localObject = this.mToolbar;
      CharSequence localCharSequence = this.mHomeDescription;
      ((Toolbar)localObject).setNavigationContentDescription(localCharSequence);
    }
  }
  
  private void updateNavigationIcon()
  {
    int i = this.mDisplayOpts & 0x4;
    Toolbar localToolbar;
    Object localObject;
    if (i != 0)
    {
      localToolbar = this.mToolbar;
      localObject = this.mNavIcon;
      if (localObject != null)
      {
        localObject = this.mNavIcon;
        localToolbar.setNavigationIcon((Drawable)localObject);
      }
    }
    for (;;)
    {
      return;
      localObject = this.mDefaultNavigationIcon;
      break;
      localObject = this.mToolbar;
      localToolbar = null;
      ((Toolbar)localObject).setNavigationIcon(null);
    }
  }
  
  private void updateToolbarLogo()
  {
    int i = 0;
    Drawable localDrawable = null;
    int j = this.mDisplayOpts & 0x2;
    if (j != 0)
    {
      i = this.mDisplayOpts & 0x1;
      if (i == 0) {
        break label57;
      }
      localDrawable = this.mLogo;
      if (localDrawable == null) {
        break label49;
      }
      localDrawable = this.mLogo;
    }
    for (;;)
    {
      this.mToolbar.setLogo(localDrawable);
      return;
      label49:
      localDrawable = this.mIcon;
      continue;
      label57:
      localDrawable = this.mIcon;
    }
  }
  
  public void animateToVisibility(int paramInt)
  {
    long l = 200L;
    v localv = setupAnimatorToVisibility(paramInt, l);
    if (localv != null) {
      localv.c();
    }
  }
  
  public boolean canShowOverflowMenu()
  {
    return this.mToolbar.canShowOverflowMenu();
  }
  
  public void collapseActionView()
  {
    this.mToolbar.collapseActionView();
  }
  
  public void dismissPopupMenus()
  {
    this.mToolbar.dismissPopupMenus();
  }
  
  public Context getContext()
  {
    return this.mToolbar.getContext();
  }
  
  public View getCustomView()
  {
    return this.mCustomView;
  }
  
  public int getDisplayOptions()
  {
    return this.mDisplayOpts;
  }
  
  public int getDropdownItemCount()
  {
    Spinner localSpinner = this.mSpinner;
    int i;
    if (localSpinner != null)
    {
      localSpinner = this.mSpinner;
      i = localSpinner.getCount();
    }
    for (;;)
    {
      return i;
      i = 0;
      localSpinner = null;
    }
  }
  
  public int getDropdownSelectedPosition()
  {
    Spinner localSpinner = this.mSpinner;
    int i;
    if (localSpinner != null)
    {
      localSpinner = this.mSpinner;
      i = localSpinner.getSelectedItemPosition();
    }
    for (;;)
    {
      return i;
      i = 0;
      localSpinner = null;
    }
  }
  
  public int getHeight()
  {
    return this.mToolbar.getHeight();
  }
  
  public Menu getMenu()
  {
    return this.mToolbar.getMenu();
  }
  
  public int getNavigationMode()
  {
    return this.mNavigationMode;
  }
  
  public CharSequence getSubtitle()
  {
    return this.mToolbar.getSubtitle();
  }
  
  public CharSequence getTitle()
  {
    return this.mToolbar.getTitle();
  }
  
  public ViewGroup getViewGroup()
  {
    return this.mToolbar;
  }
  
  public int getVisibility()
  {
    return this.mToolbar.getVisibility();
  }
  
  public boolean hasEmbeddedTabs()
  {
    View localView = this.mTabView;
    boolean bool;
    if (localView != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localView = null;
    }
  }
  
  public boolean hasExpandedActionView()
  {
    return this.mToolbar.hasExpandedActionView();
  }
  
  public boolean hasIcon()
  {
    Drawable localDrawable = this.mIcon;
    boolean bool;
    if (localDrawable != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
  
  public boolean hasLogo()
  {
    Drawable localDrawable = this.mLogo;
    boolean bool;
    if (localDrawable != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
  
  public boolean hideOverflowMenu()
  {
    return this.mToolbar.hideOverflowMenu();
  }
  
  public void initIndeterminateProgress()
  {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public void initProgress()
  {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public boolean isOverflowMenuShowPending()
  {
    return this.mToolbar.isOverflowMenuShowPending();
  }
  
  public boolean isOverflowMenuShowing()
  {
    return this.mToolbar.isOverflowMenuShowing();
  }
  
  public boolean isTitleTruncated()
  {
    return this.mToolbar.isTitleTruncated();
  }
  
  public void restoreHierarchyState(SparseArray paramSparseArray)
  {
    this.mToolbar.restoreHierarchyState(paramSparseArray);
  }
  
  public void saveHierarchyState(SparseArray paramSparseArray)
  {
    this.mToolbar.saveHierarchyState(paramSparseArray);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    r.a(this.mToolbar, paramDrawable);
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    this.mToolbar.setCollapsible(paramBoolean);
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = this.mCustomView;
    int i;
    View localView;
    if (localObject != null)
    {
      i = this.mDisplayOpts & 0x10;
      if (i != 0)
      {
        localObject = this.mToolbar;
        localView = this.mCustomView;
        ((Toolbar)localObject).removeView(localView);
      }
    }
    this.mCustomView = paramView;
    if (paramView != null)
    {
      i = this.mDisplayOpts & 0x10;
      if (i != 0)
      {
        localObject = this.mToolbar;
        localView = this.mCustomView;
        ((Toolbar)localObject).addView(localView);
      }
    }
  }
  
  public void setDefaultNavigationContentDescription(int paramInt)
  {
    int i = this.mDefaultNavigationContentDescription;
    if (paramInt == i) {}
    for (;;)
    {
      return;
      this.mDefaultNavigationContentDescription = paramInt;
      CharSequence localCharSequence = this.mToolbar.getNavigationContentDescription();
      boolean bool = TextUtils.isEmpty(localCharSequence);
      if (bool)
      {
        int j = this.mDefaultNavigationContentDescription;
        setNavigationContentDescription(j);
      }
    }
  }
  
  public void setDefaultNavigationIcon(Drawable paramDrawable)
  {
    Drawable localDrawable = this.mDefaultNavigationIcon;
    if (localDrawable != paramDrawable)
    {
      this.mDefaultNavigationIcon = paramDrawable;
      updateNavigationIcon();
    }
  }
  
  public void setDisplayOptions(int paramInt)
  {
    CharSequence localCharSequence = null;
    int i = this.mDisplayOpts ^ paramInt;
    this.mDisplayOpts = paramInt;
    Object localObject1;
    Object localObject2;
    if (i != 0)
    {
      int j = i & 0x4;
      if (j != 0)
      {
        j = paramInt & 0x4;
        if (j != 0) {
          updateHomeAccessibility();
        }
        updateNavigationIcon();
      }
      j = i & 0x3;
      if (j != 0) {
        updateToolbarLogo();
      }
      j = i & 0x8;
      if (j != 0)
      {
        j = paramInt & 0x8;
        if (j == 0) {
          break label165;
        }
        localObject1 = this.mToolbar;
        localCharSequence = this.mTitle;
        ((Toolbar)localObject1).setTitle(localCharSequence);
        localObject1 = this.mToolbar;
        localCharSequence = this.mSubtitle;
        ((Toolbar)localObject1).setSubtitle(localCharSequence);
      }
      i &= 0x10;
      if (i != 0)
      {
        localObject2 = this.mCustomView;
        if (localObject2 != null)
        {
          i = paramInt & 0x10;
          if (i == 0) {
            break label188;
          }
          localObject2 = this.mToolbar;
          localObject1 = this.mCustomView;
          ((Toolbar)localObject2).addView((View)localObject1);
        }
      }
    }
    for (;;)
    {
      return;
      label165:
      this.mToolbar.setTitle(null);
      localObject1 = this.mToolbar;
      ((Toolbar)localObject1).setSubtitle(null);
      break;
      label188:
      localObject2 = this.mToolbar;
      localObject1 = this.mCustomView;
      ((Toolbar)localObject2).removeView((View)localObject1);
    }
  }
  
  public void setDropdownParams(SpinnerAdapter paramSpinnerAdapter, AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    ensureSpinner();
    this.mSpinner.setAdapter(paramSpinnerAdapter);
    this.mSpinner.setOnItemSelectedListener(paramOnItemSelectedListener);
  }
  
  public void setDropdownSelectedPosition(int paramInt)
  {
    Object localObject = this.mSpinner;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Can't set dropdown selected position without an adapter");
      throw ((Throwable)localObject);
    }
    this.mSpinner.setSelection(paramInt);
  }
  
  public void setEmbeddedTabView(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    int i = -2;
    Object localObject1 = this.mTabView;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.mTabView.getParent();
      localObject2 = this.mToolbar;
      if (localObject1 == localObject2)
      {
        localObject1 = this.mToolbar;
        localObject2 = this.mTabView;
        ((Toolbar)localObject1).removeView((View)localObject2);
      }
    }
    this.mTabView = paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null)
    {
      int j = this.mNavigationMode;
      int k = 2;
      if (j == k)
      {
        localObject1 = this.mToolbar;
        localObject2 = this.mTabView;
        ((Toolbar)localObject1).addView((View)localObject2, 0);
        localObject1 = (Toolbar.LayoutParams)this.mTabView.getLayoutParams();
        ((Toolbar.LayoutParams)localObject1).width = i;
        ((Toolbar.LayoutParams)localObject1).height = i;
        int m = 8388691;
        ((Toolbar.LayoutParams)localObject1).gravity = m;
        j = 1;
        paramScrollingTabContainerView.setAllowCollapse(j);
      }
    }
  }
  
  public void setHomeButtonEnabled(boolean paramBoolean) {}
  
  public void setIcon(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);; localDrawable = null)
    {
      setIcon(localDrawable);
      return;
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.mIcon = paramDrawable;
    updateToolbarLogo();
  }
  
  public void setLogo(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);; localDrawable = null)
    {
      setLogo(localDrawable);
      return;
    }
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    this.mLogo = paramDrawable;
    updateToolbarLogo();
  }
  
  public void setMenu(Menu paramMenu, MenuPresenter.Callback paramCallback)
  {
    Object localObject1 = this.mActionMenuPresenter;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/widget/ActionMenuPresenter;
      localObject2 = this.mToolbar.getContext();
      ((ActionMenuPresenter)localObject1).<init>((Context)localObject2);
      this.mActionMenuPresenter = ((ActionMenuPresenter)localObject1);
      localObject1 = this.mActionMenuPresenter;
      int i = R.id.action_menu_presenter;
      ((ActionMenuPresenter)localObject1).setId(i);
    }
    this.mActionMenuPresenter.setCallback(paramCallback);
    localObject1 = this.mToolbar;
    paramMenu = (MenuBuilder)paramMenu;
    Object localObject2 = this.mActionMenuPresenter;
    ((Toolbar)localObject1).setMenu(paramMenu, (ActionMenuPresenter)localObject2);
  }
  
  public void setMenuCallbacks(MenuPresenter.Callback paramCallback, MenuBuilder.Callback paramCallback1)
  {
    this.mToolbar.setMenuCallbacks(paramCallback, paramCallback1);
  }
  
  public void setMenuPrepared()
  {
    this.mMenuPrepared = true;
  }
  
  public void setNavigationContentDescription(int paramInt)
  {
    if (paramInt == 0) {}
    for (Object localObject = null;; localObject = getContext().getString(paramInt))
    {
      setNavigationContentDescription((CharSequence)localObject);
      return;
    }
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    this.mHomeDescription = paramCharSequence;
    updateHomeAccessibility();
  }
  
  public void setNavigationIcon(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);; localDrawable = null)
    {
      setNavigationIcon(localDrawable);
      return;
    }
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    this.mNavIcon = paramDrawable;
    updateNavigationIcon();
  }
  
  public void setNavigationMode(int paramInt)
  {
    int i = -2;
    int j = this.mNavigationMode;
    Object localObject1;
    Object localObject2;
    if (paramInt != j)
    {
      switch (j)
      {
      }
      for (;;)
      {
        this.mNavigationMode = paramInt;
        switch (paramInt)
        {
        default: 
          localObject1 = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = "Invalid navigation mode " + paramInt;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
          localObject1 = this.mSpinner;
          if (localObject1 != null)
          {
            localObject1 = this.mSpinner.getParent();
            localObject2 = this.mToolbar;
            if (localObject1 == localObject2)
            {
              localObject1 = this.mToolbar;
              localObject2 = this.mSpinner;
              ((Toolbar)localObject1).removeView((View)localObject2);
              continue;
              localObject1 = this.mTabView;
              if (localObject1 != null)
              {
                localObject1 = this.mTabView.getParent();
                localObject2 = this.mToolbar;
                if (localObject1 == localObject2)
                {
                  localObject1 = this.mToolbar;
                  localObject2 = this.mTabView;
                  ((Toolbar)localObject1).removeView((View)localObject2);
                }
              }
            }
          }
          break;
        }
      }
      ensureSpinner();
      localObject1 = this.mToolbar;
      localObject2 = this.mSpinner;
      ((Toolbar)localObject1).addView((View)localObject2, 0);
    }
    for (;;)
    {
      return;
      localObject1 = this.mTabView;
      if (localObject1 != null)
      {
        localObject1 = this.mToolbar;
        localObject2 = this.mTabView;
        ((Toolbar)localObject1).addView((View)localObject2, 0);
        localObject1 = (Toolbar.LayoutParams)this.mTabView.getLayoutParams();
        ((Toolbar.LayoutParams)localObject1).width = i;
        ((Toolbar.LayoutParams)localObject1).height = i;
        int k = 8388691;
        ((Toolbar.LayoutParams)localObject1).gravity = k;
      }
    }
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.mSubtitle = paramCharSequence;
    int i = this.mDisplayOpts & 0x8;
    if (i != 0)
    {
      Toolbar localToolbar = this.mToolbar;
      localToolbar.setSubtitle(paramCharSequence);
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.mTitleSet = true;
    setTitleInt(paramCharSequence);
  }
  
  public void setVisibility(int paramInt)
  {
    this.mToolbar.setVisibility(paramInt);
  }
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    this.mWindowCallback = paramCallback;
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    boolean bool = this.mTitleSet;
    if (!bool) {
      setTitleInt(paramCharSequence);
    }
  }
  
  public v setupAnimatorToVisibility(int paramInt, long paramLong)
  {
    Object localObject1 = this.mToolbar;
    Object localObject2 = r.k((View)localObject1);
    float f;
    if (paramInt == 0) {
      f = 1.0F;
    }
    for (;;)
    {
      localObject1 = ((v)localObject2).a(f).a(paramLong);
      localObject2 = new android/support/v7/widget/ToolbarWidgetWrapper$2;
      ((ToolbarWidgetWrapper.2)localObject2).<init>(this, paramInt);
      return ((v)localObject1).a((w)localObject2);
      f = 0.0F;
      localObject1 = null;
    }
  }
  
  public boolean showOverflowMenu()
  {
    return this.mToolbar.showOverflowMenu();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ToolbarWidgetWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */