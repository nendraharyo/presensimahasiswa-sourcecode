package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v4.app.p;
import android.support.v4.view.r;
import android.support.v4.view.v;
import android.support.v4.view.w;
import android.support.v4.view.y;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.view.ActionBarPolicy;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;

public class WindowDecorActionBar
  extends ActionBar
  implements ActionBarOverlayLayout.ActionBarVisibilityCallback
{
  private static final long FADE_IN_DURATION_MS = 200L;
  private static final long FADE_OUT_DURATION_MS = 100L;
  private static final int INVALID_POSITION = 255;
  private static final String TAG = "WindowDecorActionBar";
  private static final Interpolator sHideInterpolator;
  private static final Interpolator sShowInterpolator;
  WindowDecorActionBar.ActionModeImpl mActionMode;
  private Activity mActivity;
  ActionBarContainer mContainerView;
  boolean mContentAnimations;
  View mContentView;
  Context mContext;
  ActionBarContextView mContextView;
  private int mCurWindowVisibility;
  ViewPropertyAnimatorCompatSet mCurrentShowAnim;
  DecorToolbar mDecorToolbar;
  ActionMode mDeferredDestroyActionMode;
  ActionMode.Callback mDeferredModeDestroyCallback;
  private Dialog mDialog;
  private boolean mDisplayHomeAsUpSet;
  private boolean mHasEmbeddedTabs;
  boolean mHiddenByApp;
  boolean mHiddenBySystem;
  final w mHideListener;
  boolean mHideOnContentScroll;
  private boolean mLastMenuVisibility;
  private ArrayList mMenuVisibilityListeners;
  private boolean mNowShowing;
  ActionBarOverlayLayout mOverlayLayout;
  private int mSavedTabPosition;
  private WindowDecorActionBar.TabImpl mSelectedTab;
  private boolean mShowHideAnimationEnabled;
  final w mShowListener;
  private boolean mShowingForMode;
  ScrollingTabContainerView mTabScrollView;
  private ArrayList mTabs;
  private Context mThemedContext;
  final y mUpdateListener;
  
  static
  {
    Object localObject = WindowDecorActionBar.class;
    boolean bool = ((Class)localObject).desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      $assertionsDisabled = bool;
      localObject = new android/view/animation/AccelerateInterpolator;
      ((AccelerateInterpolator)localObject).<init>();
      sHideInterpolator = (Interpolator)localObject;
      localObject = new android/view/animation/DecelerateInterpolator;
      ((DecelerateInterpolator)localObject).<init>();
      sShowInterpolator = (Interpolator)localObject;
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public WindowDecorActionBar(Activity paramActivity, boolean paramBoolean)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mTabs = ((ArrayList)localObject);
    this.mSavedTabPosition = -1;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mMenuVisibilityListeners = ((ArrayList)localObject);
    this.mCurWindowVisibility = 0;
    this.mContentAnimations = i;
    this.mNowShowing = i;
    localObject = new android/support/v7/app/WindowDecorActionBar$1;
    ((WindowDecorActionBar.1)localObject).<init>(this);
    this.mHideListener = ((w)localObject);
    localObject = new android/support/v7/app/WindowDecorActionBar$2;
    ((WindowDecorActionBar.2)localObject).<init>(this);
    this.mShowListener = ((w)localObject);
    localObject = new android/support/v7/app/WindowDecorActionBar$3;
    ((WindowDecorActionBar.3)localObject).<init>(this);
    this.mUpdateListener = ((y)localObject);
    this.mActivity = paramActivity;
    localObject = paramActivity.getWindow().getDecorView();
    init((View)localObject);
    if (!paramBoolean)
    {
      i = 16908290;
      localObject = ((View)localObject).findViewById(i);
      this.mContentView = ((View)localObject);
    }
  }
  
  public WindowDecorActionBar(Dialog paramDialog)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mTabs = ((ArrayList)localObject);
    this.mSavedTabPosition = -1;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mMenuVisibilityListeners = ((ArrayList)localObject);
    this.mCurWindowVisibility = 0;
    this.mContentAnimations = bool;
    this.mNowShowing = bool;
    localObject = new android/support/v7/app/WindowDecorActionBar$1;
    ((WindowDecorActionBar.1)localObject).<init>(this);
    this.mHideListener = ((w)localObject);
    localObject = new android/support/v7/app/WindowDecorActionBar$2;
    ((WindowDecorActionBar.2)localObject).<init>(this);
    this.mShowListener = ((w)localObject);
    localObject = new android/support/v7/app/WindowDecorActionBar$3;
    ((WindowDecorActionBar.3)localObject).<init>(this);
    this.mUpdateListener = ((y)localObject);
    this.mDialog = paramDialog;
    localObject = paramDialog.getWindow().getDecorView();
    init((View)localObject);
  }
  
  public WindowDecorActionBar(View paramView)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mTabs = ((ArrayList)localObject);
    this.mSavedTabPosition = -1;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mMenuVisibilityListeners = ((ArrayList)localObject);
    this.mCurWindowVisibility = 0;
    this.mContentAnimations = bool1;
    this.mNowShowing = bool1;
    localObject = new android/support/v7/app/WindowDecorActionBar$1;
    ((WindowDecorActionBar.1)localObject).<init>(this);
    this.mHideListener = ((w)localObject);
    localObject = new android/support/v7/app/WindowDecorActionBar$2;
    ((WindowDecorActionBar.2)localObject).<init>(this);
    this.mShowListener = ((w)localObject);
    localObject = new android/support/v7/app/WindowDecorActionBar$3;
    ((WindowDecorActionBar.3)localObject).<init>(this);
    this.mUpdateListener = ((y)localObject);
    boolean bool2 = $assertionsDisabled;
    if (!bool2)
    {
      bool2 = paramView.isInEditMode();
      if (!bool2)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    init(paramView);
  }
  
  static boolean checkShowingFlags(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool = true;
    if (paramBoolean3) {}
    for (;;)
    {
      return bool;
      if ((paramBoolean1) || (paramBoolean2)) {
        bool = false;
      }
    }
  }
  
  private void cleanupTabs()
  {
    Object localObject = this.mSelectedTab;
    if (localObject != null)
    {
      localObject = null;
      selectTab(null);
    }
    this.mTabs.clear();
    localObject = this.mTabScrollView;
    if (localObject != null)
    {
      localObject = this.mTabScrollView;
      ((ScrollingTabContainerView)localObject).removeAllTabs();
    }
    this.mSavedTabPosition = -1;
  }
  
  private void configureTab(ActionBar.Tab paramTab, int paramInt)
  {
    paramTab = (WindowDecorActionBar.TabImpl)paramTab;
    Object localObject = paramTab.getCallback();
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Action Bar Tab must have a Callback");
      throw ((Throwable)localObject);
    }
    paramTab.setPosition(paramInt);
    this.mTabs.add(paramInt, paramTab);
    localObject = this.mTabs;
    int i = ((ArrayList)localObject).size();
    int j = paramInt + 1;
    for (int k = j; k < i; k = j)
    {
      localObject = (WindowDecorActionBar.TabImpl)this.mTabs.get(k);
      ((WindowDecorActionBar.TabImpl)localObject).setPosition(k);
      j = k + 1;
    }
  }
  
  private void ensureTabsExist()
  {
    ScrollingTabContainerView localScrollingTabContainerView = this.mTabScrollView;
    if (localScrollingTabContainerView != null) {}
    Object localObject;
    for (;;)
    {
      return;
      localScrollingTabContainerView = new android/support/v7/widget/ScrollingTabContainerView;
      localObject = this.mContext;
      localScrollingTabContainerView.<init>((Context)localObject);
      boolean bool = this.mHasEmbeddedTabs;
      if (!bool) {
        break;
      }
      localScrollingTabContainerView.setVisibility(0);
      localObject = this.mDecorToolbar;
      ((DecorToolbar)localObject).setEmbeddedTabView(localScrollingTabContainerView);
      this.mTabScrollView = localScrollingTabContainerView;
    }
    int i = getNavigationMode();
    int j = 2;
    if (i == j)
    {
      localScrollingTabContainerView.setVisibility(0);
      localObject = this.mOverlayLayout;
      if (localObject != null)
      {
        localObject = this.mOverlayLayout;
        r.o((View)localObject);
      }
    }
    for (;;)
    {
      localObject = this.mContainerView;
      ((ActionBarContainer)localObject).setTabContainer(localScrollingTabContainerView);
      break;
      i = 8;
      localScrollingTabContainerView.setVisibility(i);
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
    String str = "Can't make a decor toolbar out of ";
    localObject = str + paramView;
    if (localObject != null) {}
    for (localObject = paramView.getClass().getSimpleName();; localObject = "null")
    {
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
  }
  
  private void hideForActionMode()
  {
    boolean bool = this.mShowingForMode;
    if (bool)
    {
      this.mShowingForMode = false;
      ActionBarOverlayLayout localActionBarOverlayLayout = this.mOverlayLayout;
      if (localActionBarOverlayLayout != null)
      {
        localActionBarOverlayLayout = this.mOverlayLayout;
        localActionBarOverlayLayout.setShowingForActionMode(false);
      }
      updateVisibility(false);
    }
  }
  
  private void init(View paramView)
  {
    int i = 1;
    int k = 0;
    float f = 0.0F;
    Object localObject1 = null;
    int m = R.id.decor_content_parent;
    Object localObject2 = (ActionBarOverlayLayout)paramView.findViewById(m);
    this.mOverlayLayout = ((ActionBarOverlayLayout)localObject2);
    localObject2 = this.mOverlayLayout;
    if (localObject2 != null)
    {
      localObject2 = this.mOverlayLayout;
      ((ActionBarOverlayLayout)localObject2).setActionBarVisibilityCallback(this);
    }
    m = R.id.action_bar;
    localObject2 = paramView.findViewById(m);
    localObject2 = getDecorToolbar((View)localObject2);
    this.mDecorToolbar = ((DecorToolbar)localObject2);
    m = R.id.action_context_bar;
    localObject2 = (ActionBarContextView)paramView.findViewById(m);
    this.mContextView = ((ActionBarContextView)localObject2);
    m = R.id.action_bar_container;
    localObject2 = (ActionBarContainer)paramView.findViewById(m);
    this.mContainerView = ((ActionBarContainer)localObject2);
    localObject2 = this.mDecorToolbar;
    if (localObject2 != null)
    {
      localObject2 = this.mContextView;
      if (localObject2 != null)
      {
        localObject2 = this.mContainerView;
        if (localObject2 != null) {
          break label217;
        }
      }
    }
    localObject2 = new java/lang/IllegalStateException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str = getClass().getSimpleName();
    localObject1 = str + " can only be used " + "with a compatible window decor layout";
    ((IllegalStateException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
    label217:
    localObject2 = this.mDecorToolbar.getContext();
    this.mContext = ((Context)localObject2);
    localObject2 = this.mDecorToolbar;
    m = ((DecorToolbar)localObject2).getDisplayOptions() & 0x4;
    ActionBarPolicy localActionBarPolicy;
    if (m != 0)
    {
      m = i;
      if (m != 0) {
        this.mDisplayHomeAsUpSet = i;
      }
      localActionBarPolicy = ActionBarPolicy.get(this.mContext);
      boolean bool2 = localActionBarPolicy.enableHomeButtonByDefault();
      if ((!bool2) && (m == 0)) {
        break label415;
      }
      m = i;
    }
    for (;;)
    {
      setHomeButtonEnabled(m);
      boolean bool1 = localActionBarPolicy.hasEmbeddedTabs();
      setHasEmbeddedTabs(bool1);
      localObject2 = this.mContext;
      localActionBarPolicy = null;
      int[] arrayOfInt = R.styleable.ActionBar;
      int n = R.attr.actionBarStyle;
      localObject2 = ((Context)localObject2).obtainStyledAttributes(null, arrayOfInt, n, 0);
      int i1 = R.styleable.ActionBar_hideOnContentScroll;
      boolean bool3 = ((TypedArray)localObject2).getBoolean(i1, false);
      if (bool3) {
        setHideOnContentScrollEnabled(i);
      }
      int j = R.styleable.ActionBar_elevation;
      k = ((TypedArray)localObject2).getDimensionPixelSize(j, 0);
      if (k != 0)
      {
        f = k;
        setElevation(f);
      }
      ((TypedArray)localObject2).recycle();
      return;
      bool1 = false;
      localObject2 = null;
      break;
      label415:
      bool1 = false;
      localObject2 = null;
    }
  }
  
  private void setHasEmbeddedTabs(boolean paramBoolean)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 1;
    this.mHasEmbeddedTabs = paramBoolean;
    boolean bool2 = this.mHasEmbeddedTabs;
    Object localObject2;
    int k;
    label68:
    label108:
    boolean bool1;
    if (!bool2)
    {
      this.mDecorToolbar.setEmbeddedTabView(null);
      localObject2 = this.mContainerView;
      localObject1 = this.mTabScrollView;
      ((ActionBarContainer)localObject2).setTabContainer((ScrollingTabContainerView)localObject1);
      k = getNavigationMode();
      i = 2;
      if (k != i) {
        break label197;
      }
      k = j;
      localObject1 = this.mTabScrollView;
      if (localObject1 != null)
      {
        if (k == 0) {
          break label206;
        }
        this.mTabScrollView.setVisibility(0);
        localObject1 = this.mOverlayLayout;
        if (localObject1 != null)
        {
          localObject1 = this.mOverlayLayout;
          r.o((View)localObject1);
        }
      }
      DecorToolbar localDecorToolbar = this.mDecorToolbar;
      bool1 = this.mHasEmbeddedTabs;
      if ((bool1) || (k == 0)) {
        break label224;
      }
      bool1 = j;
      label131:
      localDecorToolbar.setCollapsible(bool1);
      localObject1 = this.mOverlayLayout;
      boolean bool3 = this.mHasEmbeddedTabs;
      if ((bool3) || (k == 0)) {
        break label231;
      }
    }
    for (;;)
    {
      ((ActionBarOverlayLayout)localObject1).setHasNonEmbeddedTabs(j);
      return;
      this.mContainerView.setTabContainer(null);
      localObject2 = this.mDecorToolbar;
      localObject1 = this.mTabScrollView;
      ((DecorToolbar)localObject2).setEmbeddedTabView((ScrollingTabContainerView)localObject1);
      break;
      label197:
      k = 0;
      localObject2 = null;
      break label68;
      label206:
      localObject1 = this.mTabScrollView;
      int m = 8;
      ((ScrollingTabContainerView)localObject1).setVisibility(m);
      break label108;
      label224:
      bool1 = false;
      localObject1 = null;
      break label131;
      label231:
      j = 0;
    }
  }
  
  private boolean shouldAnimateContextView()
  {
    return r.w(this.mContainerView);
  }
  
  private void showForActionMode()
  {
    boolean bool1 = true;
    boolean bool2 = this.mShowingForMode;
    if (!bool2)
    {
      this.mShowingForMode = bool1;
      ActionBarOverlayLayout localActionBarOverlayLayout = this.mOverlayLayout;
      if (localActionBarOverlayLayout != null)
      {
        localActionBarOverlayLayout = this.mOverlayLayout;
        localActionBarOverlayLayout.setShowingForActionMode(bool1);
      }
      bool2 = false;
      localActionBarOverlayLayout = null;
      updateVisibility(false);
    }
  }
  
  private void updateVisibility(boolean paramBoolean)
  {
    boolean bool1 = this.mHiddenByApp;
    boolean bool2 = this.mHiddenBySystem;
    boolean bool3 = this.mShowingForMode;
    bool1 = checkShowingFlags(bool1, bool2, bool3);
    if (bool1)
    {
      bool1 = this.mNowShowing;
      if (!bool1)
      {
        bool1 = true;
        this.mNowShowing = bool1;
        doShow(paramBoolean);
      }
    }
    for (;;)
    {
      return;
      bool1 = this.mNowShowing;
      if (bool1)
      {
        bool1 = false;
        this.mNowShowing = false;
        doHide(paramBoolean);
      }
    }
  }
  
  public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener paramOnMenuVisibilityListener)
  {
    this.mMenuVisibilityListeners.add(paramOnMenuVisibilityListener);
  }
  
  public void addTab(ActionBar.Tab paramTab)
  {
    boolean bool = this.mTabs.isEmpty();
    addTab(paramTab, bool);
  }
  
  public void addTab(ActionBar.Tab paramTab, int paramInt)
  {
    boolean bool = this.mTabs.isEmpty();
    addTab(paramTab, paramInt, bool);
  }
  
  public void addTab(ActionBar.Tab paramTab, int paramInt, boolean paramBoolean)
  {
    ensureTabsExist();
    ScrollingTabContainerView localScrollingTabContainerView = this.mTabScrollView;
    localScrollingTabContainerView.addTab(paramTab, paramInt, paramBoolean);
    configureTab(paramTab, paramInt);
    if (paramBoolean) {
      selectTab(paramTab);
    }
  }
  
  public void addTab(ActionBar.Tab paramTab, boolean paramBoolean)
  {
    ensureTabsExist();
    this.mTabScrollView.addTab(paramTab, paramBoolean);
    ArrayList localArrayList = this.mTabs;
    int i = localArrayList.size();
    configureTab(paramTab, i);
    if (paramBoolean) {
      selectTab(paramTab);
    }
  }
  
  public void animateToMode(boolean paramBoolean)
  {
    long l1 = 200L;
    long l2 = 100;
    int i = 8;
    int j = 4;
    ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = null;
    Object localObject;
    v localv;
    if (paramBoolean)
    {
      showForActionMode();
      boolean bool = shouldAnimateContextView();
      if (!bool) {
        break label130;
      }
      if (!paramBoolean) {
        break label101;
      }
      localObject = this.mDecorToolbar.setupAnimatorToVisibility(j, l2);
      localv = this.mContextView.setupAnimatorToVisibility(0, l1);
      label68:
      localViewPropertyAnimatorCompatSet = new android/support/v7/view/ViewPropertyAnimatorCompatSet;
      localViewPropertyAnimatorCompatSet.<init>();
      localViewPropertyAnimatorCompatSet.playSequentially((v)localObject, localv);
      localViewPropertyAnimatorCompatSet.start();
    }
    for (;;)
    {
      return;
      hideForActionMode();
      break;
      label101:
      localv = this.mDecorToolbar.setupAnimatorToVisibility(0, l1);
      localObject = this.mContextView.setupAnimatorToVisibility(i, l2);
      break label68;
      label130:
      if (paramBoolean)
      {
        this.mDecorToolbar.setVisibility(j);
        localObject = this.mContextView;
        ((ActionBarContextView)localObject).setVisibility(0);
      }
      else
      {
        this.mDecorToolbar.setVisibility(0);
        localObject = this.mContextView;
        ((ActionBarContextView)localObject).setVisibility(i);
      }
    }
  }
  
  public boolean collapseActionView()
  {
    DecorToolbar localDecorToolbar = this.mDecorToolbar;
    boolean bool;
    if (localDecorToolbar != null)
    {
      localDecorToolbar = this.mDecorToolbar;
      bool = localDecorToolbar.hasExpandedActionView();
      if (bool)
      {
        localDecorToolbar = this.mDecorToolbar;
        localDecorToolbar.collapseActionView();
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDecorToolbar = null;
    }
  }
  
  void completeDeferredDestroyActionMode()
  {
    ActionMode.Callback localCallback = this.mDeferredModeDestroyCallback;
    if (localCallback != null)
    {
      localCallback = this.mDeferredModeDestroyCallback;
      ActionMode localActionMode = this.mDeferredDestroyActionMode;
      localCallback.onDestroyActionMode(localActionMode);
      this.mDeferredDestroyActionMode = null;
      this.mDeferredModeDestroyCallback = null;
    }
  }
  
  public void dispatchMenuVisibilityChanged(boolean paramBoolean)
  {
    boolean bool = this.mLastMenuVisibility;
    if (paramBoolean == bool) {}
    for (;;)
    {
      return;
      this.mLastMenuVisibility = paramBoolean;
      int j = this.mMenuVisibilityListeners.size();
      bool = false;
      ActionBar.OnMenuVisibilityListener localOnMenuVisibilityListener = null;
      int i;
      for (int k = 0; k < j; k = i)
      {
        localOnMenuVisibilityListener = (ActionBar.OnMenuVisibilityListener)this.mMenuVisibilityListeners.get(k);
        localOnMenuVisibilityListener.onMenuVisibilityChanged(paramBoolean);
        i = k + 1;
      }
    }
  }
  
  public void doHide(boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject1 = this.mCurrentShowAnim;
    if (localObject1 != null)
    {
      localObject1 = this.mCurrentShowAnim;
      ((ViewPropertyAnimatorCompatSet)localObject1).cancel();
    }
    int i = this.mCurWindowVisibility;
    float f1;
    ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet;
    if (i == 0)
    {
      boolean bool2 = this.mShowHideAnimationEnabled;
      if ((bool2) || (paramBoolean))
      {
        localObject1 = this.mContainerView;
        f1 = 1.0F;
        ((ActionBarContainer)localObject1).setAlpha(f1);
        this.mContainerView.setTransitioning(bool1);
        localViewPropertyAnimatorCompatSet = new android/support/v7/view/ViewPropertyAnimatorCompatSet;
        localViewPropertyAnimatorCompatSet.<init>();
        localObject1 = this.mContainerView;
        int j = -((ActionBarContainer)localObject1).getHeight();
        float f2 = j;
        if (paramBoolean)
        {
          localObject2 = new int[2];
          Object tmp108_106 = localObject2;
          tmp108_106[0] = 0;
          tmp108_106[1] = 0;
          localObject3 = this.mContainerView;
          ((ActionBarContainer)localObject3).getLocationInWindow((int[])localObject2);
          int k = localObject2[bool1];
          float f3 = k;
          f2 -= f3;
        }
        Object localObject2 = r.k(this.mContainerView).b(f2);
        Object localObject3 = this.mUpdateListener;
        ((v)localObject2).a((y)localObject3);
        localViewPropertyAnimatorCompatSet.play((v)localObject2);
        boolean bool3 = this.mContentAnimations;
        if (bool3)
        {
          localObject2 = this.mContentView;
          if (localObject2 != null)
          {
            localObject2 = r.k(this.mContentView);
            localObject1 = ((v)localObject2).b(f2);
            localViewPropertyAnimatorCompatSet.play((v)localObject1);
          }
        }
        localObject1 = sHideInterpolator;
        localViewPropertyAnimatorCompatSet.setInterpolator((Interpolator)localObject1);
        long l = 250L;
        localViewPropertyAnimatorCompatSet.setDuration(l);
        localObject1 = this.mHideListener;
        localViewPropertyAnimatorCompatSet.setListener((w)localObject1);
        this.mCurrentShowAnim = localViewPropertyAnimatorCompatSet;
        localViewPropertyAnimatorCompatSet.start();
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.mHideListener;
      f1 = 0.0F;
      localViewPropertyAnimatorCompatSet = null;
      ((w)localObject1).onAnimationEnd(null);
    }
  }
  
  public void doShow(boolean paramBoolean)
  {
    Object localObject1 = this.mCurrentShowAnim;
    if (localObject1 != null)
    {
      localObject1 = this.mCurrentShowAnim;
      ((ViewPropertyAnimatorCompatSet)localObject1).cancel();
    }
    localObject1 = this.mContainerView;
    int i = 0;
    float f1 = 0.0F;
    Object localObject2 = null;
    ((ActionBarContainer)localObject1).setVisibility(0);
    int j = this.mCurWindowVisibility;
    if (j == 0)
    {
      boolean bool1 = this.mShowHideAnimationEnabled;
      if ((bool1) || (paramBoolean))
      {
        this.mContainerView.setTranslationY(0.0F);
        localObject1 = this.mContainerView;
        int k = -((ActionBarContainer)localObject1).getHeight();
        float f2 = k;
        if (paramBoolean)
        {
          localObject2 = new int[2];
          Object tmp98_96 = localObject2;
          tmp98_96[0] = 0;
          tmp98_96[1] = 0;
          localObject3 = this.mContainerView;
          ((ActionBarContainer)localObject3).getLocationInWindow((int[])localObject2);
          bool3 = true;
          i = localObject2[bool3];
          f1 = i;
          f2 -= f1;
        }
        this.mContainerView.setTranslationY(f2);
        localObject2 = new android/support/v7/view/ViewPropertyAnimatorCompatSet;
        ((ViewPropertyAnimatorCompatSet)localObject2).<init>();
        Object localObject3 = r.k(this.mContainerView).b(0.0F);
        y localy = this.mUpdateListener;
        ((v)localObject3).a(localy);
        ((ViewPropertyAnimatorCompatSet)localObject2).play((v)localObject3);
        boolean bool3 = this.mContentAnimations;
        if (bool3)
        {
          localObject3 = this.mContentView;
          if (localObject3 != null)
          {
            localObject3 = this.mContentView;
            ((View)localObject3).setTranslationY(f2);
            localObject1 = r.k(this.mContentView).b(0.0F);
            ((ViewPropertyAnimatorCompatSet)localObject2).play((v)localObject1);
          }
        }
        localObject1 = sShowInterpolator;
        ((ViewPropertyAnimatorCompatSet)localObject2).setInterpolator((Interpolator)localObject1);
        long l = 250L;
        ((ViewPropertyAnimatorCompatSet)localObject2).setDuration(l);
        localObject1 = this.mShowListener;
        ((ViewPropertyAnimatorCompatSet)localObject2).setListener((w)localObject1);
        this.mCurrentShowAnim = ((ViewPropertyAnimatorCompatSet)localObject2);
        ((ViewPropertyAnimatorCompatSet)localObject2).start();
      }
    }
    for (;;)
    {
      localObject1 = this.mOverlayLayout;
      if (localObject1 != null)
      {
        localObject1 = this.mOverlayLayout;
        r.o((View)localObject1);
      }
      return;
      localObject1 = this.mContainerView;
      i = 1065353216;
      f1 = 1.0F;
      ((ActionBarContainer)localObject1).setAlpha(f1);
      localObject1 = this.mContainerView;
      ((ActionBarContainer)localObject1).setTranslationY(0.0F);
      boolean bool2 = this.mContentAnimations;
      if (bool2)
      {
        localObject1 = this.mContentView;
        if (localObject1 != null)
        {
          localObject1 = this.mContentView;
          ((View)localObject1).setTranslationY(0.0F);
        }
      }
      localObject1 = this.mShowListener;
      i = 0;
      f1 = 0.0F;
      localObject2 = null;
      ((w)localObject1).onAnimationEnd(null);
    }
  }
  
  public void enableContentAnimations(boolean paramBoolean)
  {
    this.mContentAnimations = paramBoolean;
  }
  
  public View getCustomView()
  {
    return this.mDecorToolbar.getCustomView();
  }
  
  public int getDisplayOptions()
  {
    return this.mDecorToolbar.getDisplayOptions();
  }
  
  public float getElevation()
  {
    return r.l(this.mContainerView);
  }
  
  public int getHeight()
  {
    return this.mContainerView.getHeight();
  }
  
  public int getHideOffset()
  {
    return this.mOverlayLayout.getActionBarHideOffset();
  }
  
  public int getNavigationItemCount()
  {
    Object localObject = this.mDecorToolbar;
    int i = ((DecorToolbar)localObject).getNavigationMode();
    switch (i)
    {
    default: 
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = this.mTabs;
      i = ((ArrayList)localObject).size();
      continue;
      localObject = this.mDecorToolbar;
      i = ((DecorToolbar)localObject).getDropdownItemCount();
    }
  }
  
  public int getNavigationMode()
  {
    return this.mDecorToolbar.getNavigationMode();
  }
  
  public int getSelectedNavigationIndex()
  {
    int i = -1;
    Object localObject1 = this.mDecorToolbar;
    int j = ((DecorToolbar)localObject1).getNavigationMode();
    switch (j)
    {
    }
    for (;;)
    {
      return i;
      localObject1 = this.mSelectedTab;
      if (localObject1 != null)
      {
        Object localObject2 = this.mSelectedTab;
        i = ((WindowDecorActionBar.TabImpl)localObject2).getPosition();
        continue;
        localObject2 = this.mDecorToolbar;
        i = ((DecorToolbar)localObject2).getDropdownSelectedPosition();
      }
    }
  }
  
  public ActionBar.Tab getSelectedTab()
  {
    return this.mSelectedTab;
  }
  
  public CharSequence getSubtitle()
  {
    return this.mDecorToolbar.getSubtitle();
  }
  
  public ActionBar.Tab getTabAt(int paramInt)
  {
    return (ActionBar.Tab)this.mTabs.get(paramInt);
  }
  
  public int getTabCount()
  {
    return this.mTabs.size();
  }
  
  public Context getThemedContext()
  {
    Object localObject1 = this.mThemedContext;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = new android/util/TypedValue;
      ((TypedValue)localObject1).<init>();
      localObject2 = this.mContext.getTheme();
      int i = R.attr.actionBarWidgetTheme;
      boolean bool = true;
      ((Resources.Theme)localObject2).resolveAttribute(i, (TypedValue)localObject1, bool);
      int j = ((TypedValue)localObject1).resourceId;
      if (j == 0) {
        break label80;
      }
      localObject2 = new android/view/ContextThemeWrapper;
      Context localContext = this.mContext;
      ((ContextThemeWrapper)localObject2).<init>(localContext, j);
    }
    for (this.mThemedContext = ((Context)localObject2);; this.mThemedContext = ((Context)localObject1))
    {
      return this.mThemedContext;
      label80:
      localObject1 = this.mContext;
    }
  }
  
  public CharSequence getTitle()
  {
    return this.mDecorToolbar.getTitle();
  }
  
  public boolean hasIcon()
  {
    return this.mDecorToolbar.hasIcon();
  }
  
  public boolean hasLogo()
  {
    return this.mDecorToolbar.hasLogo();
  }
  
  public void hide()
  {
    boolean bool = this.mHiddenByApp;
    if (!bool)
    {
      this.mHiddenByApp = true;
      bool = false;
      updateVisibility(false);
    }
  }
  
  public void hideForSystem()
  {
    boolean bool1 = true;
    boolean bool2 = this.mHiddenBySystem;
    if (!bool2)
    {
      this.mHiddenBySystem = bool1;
      updateVisibility(bool1);
    }
  }
  
  public boolean isHideOnContentScrollEnabled()
  {
    return this.mOverlayLayout.isHideOnContentScrollEnabled();
  }
  
  public boolean isShowing()
  {
    int i = getHeight();
    boolean bool = this.mNowShowing;
    if (bool) {
      if (i != 0)
      {
        int k = getHideOffset();
        if (k >= i) {
          break label32;
        }
      }
    }
    label32:
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isTitleTruncated()
  {
    DecorToolbar localDecorToolbar = this.mDecorToolbar;
    boolean bool;
    if (localDecorToolbar != null)
    {
      localDecorToolbar = this.mDecorToolbar;
      bool = localDecorToolbar.isTitleTruncated();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDecorToolbar = null;
    }
  }
  
  public ActionBar.Tab newTab()
  {
    WindowDecorActionBar.TabImpl localTabImpl = new android/support/v7/app/WindowDecorActionBar$TabImpl;
    localTabImpl.<init>(this);
    return localTabImpl;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    boolean bool = ActionBarPolicy.get(this.mContext).hasEmbeddedTabs();
    setHasEmbeddedTabs(bool);
  }
  
  public void onContentScrollStarted()
  {
    ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = this.mCurrentShowAnim;
    if (localViewPropertyAnimatorCompatSet != null)
    {
      this.mCurrentShowAnim.cancel();
      localViewPropertyAnimatorCompatSet = null;
      this.mCurrentShowAnim = null;
    }
  }
  
  public void onContentScrollStopped() {}
  
  public boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    boolean bool = false;
    Object localObject = this.mActionMode;
    if (localObject == null) {}
    Menu localMenu;
    do
    {
      return bool;
      localObject = this.mActionMode;
      localMenu = ((WindowDecorActionBar.ActionModeImpl)localObject).getMenu();
    } while (localMenu == null);
    int j;
    if (paramKeyEvent != null)
    {
      j = paramKeyEvent.getDeviceId();
      label47:
      localObject = KeyCharacterMap.load(j);
      j = ((KeyCharacterMap)localObject).getKeyboardType();
      if (j == i) {
        break label100;
      }
      j = i;
    }
    for (;;)
    {
      localMenu.setQwertyMode(j);
      bool = localMenu.performShortcut(paramInt, paramKeyEvent, 0);
      break;
      int k = -1;
      break label47;
      label100:
      k = 0;
      localObject = null;
    }
  }
  
  public void onWindowVisibilityChanged(int paramInt)
  {
    this.mCurWindowVisibility = paramInt;
  }
  
  public void removeAllTabs()
  {
    cleanupTabs();
  }
  
  public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener paramOnMenuVisibilityListener)
  {
    this.mMenuVisibilityListeners.remove(paramOnMenuVisibilityListener);
  }
  
  public void removeTab(ActionBar.Tab paramTab)
  {
    int i = paramTab.getPosition();
    removeTabAt(i);
  }
  
  public void removeTabAt(int paramInt)
  {
    Object localObject = this.mTabScrollView;
    if (localObject == null) {}
    int j;
    int k;
    do
    {
      return;
      localObject = this.mSelectedTab;
      int i;
      if (localObject != null)
      {
        localObject = this.mSelectedTab;
        i = ((WindowDecorActionBar.TabImpl)localObject).getPosition();
      }
      for (j = i;; j = i)
      {
        this.mTabScrollView.removeTabAt(paramInt);
        localObject = (WindowDecorActionBar.TabImpl)this.mTabs.remove(paramInt);
        if (localObject != null)
        {
          k = -1;
          ((WindowDecorActionBar.TabImpl)localObject).setPosition(k);
        }
        localObject = this.mTabs;
        int m = ((ArrayList)localObject).size();
        for (k = paramInt; k < m; k = i)
        {
          localObject = (WindowDecorActionBar.TabImpl)this.mTabs.get(k);
          ((WindowDecorActionBar.TabImpl)localObject).setPosition(k);
          i = k + 1;
        }
        i = this.mSavedTabPosition;
      }
    } while (j != paramInt);
    localObject = this.mTabs;
    boolean bool = ((ArrayList)localObject).isEmpty();
    if (bool) {
      bool = false;
    }
    for (localObject = null;; localObject = (WindowDecorActionBar.TabImpl)((ArrayList)localObject).get(j))
    {
      selectTab((ActionBar.Tab)localObject);
      break;
      localObject = this.mTabs;
      k = paramInt + -1;
      j = Math.max(0, k);
    }
  }
  
  public boolean requestFocus()
  {
    ViewGroup localViewGroup = this.mDecorToolbar.getViewGroup();
    boolean bool2;
    if (localViewGroup != null)
    {
      boolean bool1 = localViewGroup.hasFocus();
      if (!bool1)
      {
        localViewGroup.requestFocus();
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localViewGroup = null;
    }
  }
  
  public void selectTab(ActionBar.Tab paramTab)
  {
    int i = -1;
    int k = getNavigationMode();
    int m = 2;
    if (k != m) {
      if (paramTab != null)
      {
        k = paramTab.getPosition();
        this.mSavedTabPosition = k;
      }
    }
    label91:
    label191:
    label297:
    for (;;)
    {
      return;
      k = i;
      break;
      Object localObject1 = this.mActivity;
      boolean bool2 = localObject1 instanceof i;
      Object localObject2;
      Object localObject3;
      if (bool2)
      {
        localObject1 = this.mDecorToolbar.getViewGroup();
        bool2 = ((ViewGroup)localObject1).isInEditMode();
        if (!bool2)
        {
          localObject1 = ((i)this.mActivity).getSupportFragmentManager().a().a();
          localObject2 = this.mSelectedTab;
          if (localObject2 != paramTab) {
            break label191;
          }
          localObject3 = this.mSelectedTab;
          if (localObject3 != null)
          {
            localObject3 = this.mSelectedTab.getCallback();
            localObject2 = this.mSelectedTab;
            ((ActionBar.TabListener)localObject3).onTabReselected((ActionBar.Tab)localObject2, (p)localObject1);
            localObject3 = this.mTabScrollView;
            m = paramTab.getPosition();
            ((ScrollingTabContainerView)localObject3).animateToTab(m);
          }
        }
      }
      for (;;)
      {
        if (localObject1 == null) {
          break label297;
        }
        boolean bool1 = ((p)localObject1).i();
        if (bool1) {
          break;
        }
        ((p)localObject1).c();
        break;
        bool2 = false;
        localObject1 = null;
        break label91;
        localObject2 = this.mTabScrollView;
        int j;
        if (paramTab != null) {
          j = paramTab.getPosition();
        }
        ((ScrollingTabContainerView)localObject2).setTabSelected(j);
        localObject3 = this.mSelectedTab;
        if (localObject3 != null)
        {
          localObject3 = this.mSelectedTab.getCallback();
          localObject2 = this.mSelectedTab;
          ((ActionBar.TabListener)localObject3).onTabUnselected((ActionBar.Tab)localObject2, (p)localObject1);
        }
        paramTab = (WindowDecorActionBar.TabImpl)paramTab;
        this.mSelectedTab = paramTab;
        localObject3 = this.mSelectedTab;
        if (localObject3 != null)
        {
          localObject3 = this.mSelectedTab.getCallback();
          localObject2 = this.mSelectedTab;
          ((ActionBar.TabListener)localObject3).onTabSelected((ActionBar.Tab)localObject2, (p)localObject1);
        }
      }
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.mContainerView.setPrimaryBackground(paramDrawable);
  }
  
  public void setCustomView(int paramInt)
  {
    Object localObject = LayoutInflater.from(getThemedContext());
    ViewGroup localViewGroup = this.mDecorToolbar.getViewGroup();
    localObject = ((LayoutInflater)localObject).inflate(paramInt, localViewGroup, false);
    setCustomView((View)localObject);
  }
  
  public void setCustomView(View paramView)
  {
    this.mDecorToolbar.setCustomView(paramView);
  }
  
  public void setCustomView(View paramView, ActionBar.LayoutParams paramLayoutParams)
  {
    paramView.setLayoutParams(paramLayoutParams);
    this.mDecorToolbar.setCustomView(paramView);
  }
  
  public void setDefaultDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    boolean bool = this.mDisplayHomeAsUpSet;
    if (!bool) {
      setDisplayHomeAsUpEnabled(paramBoolean);
    }
  }
  
  public void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    int i = 4;
    if (paramBoolean) {}
    for (int j = i;; j = 0)
    {
      setDisplayOptions(j, i);
      return;
    }
  }
  
  public void setDisplayOptions(int paramInt)
  {
    int i = paramInt & 0x4;
    if (i != 0)
    {
      i = 1;
      this.mDisplayHomeAsUpSet = i;
    }
    this.mDecorToolbar.setDisplayOptions(paramInt);
  }
  
  public void setDisplayOptions(int paramInt1, int paramInt2)
  {
    DecorToolbar localDecorToolbar1 = this.mDecorToolbar;
    int i = localDecorToolbar1.getDisplayOptions();
    int j = paramInt2 & 0x4;
    if (j != 0)
    {
      j = 1;
      this.mDisplayHomeAsUpSet = j;
    }
    DecorToolbar localDecorToolbar2 = this.mDecorToolbar;
    int k = paramInt1 & paramInt2;
    int m = paramInt2 ^ 0xFFFFFFFF;
    i = i & m | k;
    localDecorToolbar2.setDisplayOptions(i);
  }
  
  public void setDisplayShowCustomEnabled(boolean paramBoolean)
  {
    int i = 16;
    if (paramBoolean) {}
    for (int j = i;; j = 0)
    {
      setDisplayOptions(j, i);
      return;
    }
  }
  
  public void setDisplayShowHomeEnabled(boolean paramBoolean)
  {
    int i = 2;
    if (paramBoolean) {}
    for (int j = i;; j = 0)
    {
      setDisplayOptions(j, i);
      return;
    }
  }
  
  public void setDisplayShowTitleEnabled(boolean paramBoolean)
  {
    int i = 8;
    if (paramBoolean) {}
    for (int j = i;; j = 0)
    {
      setDisplayOptions(j, i);
      return;
    }
  }
  
  public void setDisplayUseLogoEnabled(boolean paramBoolean)
  {
    int i = 1;
    if (paramBoolean) {}
    for (int j = i;; j = 0)
    {
      setDisplayOptions(j, i);
      return;
    }
  }
  
  public void setElevation(float paramFloat)
  {
    r.a(this.mContainerView, paramFloat);
  }
  
  public void setHideOffset(int paramInt)
  {
    if (paramInt != 0)
    {
      Object localObject = this.mOverlayLayout;
      boolean bool = ((ActionBarOverlayLayout)localObject).isInOverlayMode();
      if (!bool)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        throw ((Throwable)localObject);
      }
    }
    this.mOverlayLayout.setActionBarHideOffset(paramInt);
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Object localObject = this.mOverlayLayout;
      boolean bool = ((ActionBarOverlayLayout)localObject).isInOverlayMode();
      if (!bool)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        throw ((Throwable)localObject);
      }
    }
    this.mHideOnContentScroll = paramBoolean;
    this.mOverlayLayout.setHideOnContentScrollEnabled(paramBoolean);
  }
  
  public void setHomeActionContentDescription(int paramInt)
  {
    this.mDecorToolbar.setNavigationContentDescription(paramInt);
  }
  
  public void setHomeActionContentDescription(CharSequence paramCharSequence)
  {
    this.mDecorToolbar.setNavigationContentDescription(paramCharSequence);
  }
  
  public void setHomeAsUpIndicator(int paramInt)
  {
    this.mDecorToolbar.setNavigationIcon(paramInt);
  }
  
  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    this.mDecorToolbar.setNavigationIcon(paramDrawable);
  }
  
  public void setHomeButtonEnabled(boolean paramBoolean)
  {
    this.mDecorToolbar.setHomeButtonEnabled(paramBoolean);
  }
  
  public void setIcon(int paramInt)
  {
    this.mDecorToolbar.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.mDecorToolbar.setIcon(paramDrawable);
  }
  
  public void setListNavigationCallbacks(SpinnerAdapter paramSpinnerAdapter, ActionBar.OnNavigationListener paramOnNavigationListener)
  {
    DecorToolbar localDecorToolbar = this.mDecorToolbar;
    NavItemSelectedListener localNavItemSelectedListener = new android/support/v7/app/NavItemSelectedListener;
    localNavItemSelectedListener.<init>(paramOnNavigationListener);
    localDecorToolbar.setDropdownParams(paramSpinnerAdapter, localNavItemSelectedListener);
  }
  
  public void setLogo(int paramInt)
  {
    this.mDecorToolbar.setLogo(paramInt);
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    this.mDecorToolbar.setLogo(paramDrawable);
  }
  
  public void setNavigationMode(int paramInt)
  {
    int i = 2;
    boolean bool1 = true;
    int j = -1;
    Object localObject1 = this.mDecorToolbar;
    int k = ((DecorToolbar)localObject1).getNavigationMode();
    label116:
    Object localObject2;
    switch (k)
    {
    default: 
      boolean bool2;
      if (k != paramInt)
      {
        bool2 = this.mHasEmbeddedTabs;
        if (!bool2)
        {
          localObject1 = this.mOverlayLayout;
          if (localObject1 != null)
          {
            localObject1 = this.mOverlayLayout;
            r.o((View)localObject1);
          }
        }
      }
      localObject1 = this.mDecorToolbar;
      ((DecorToolbar)localObject1).setNavigationMode(paramInt);
      switch (paramInt)
      {
      default: 
        localObject2 = this.mDecorToolbar;
        if (paramInt == i)
        {
          bool2 = this.mHasEmbeddedTabs;
          if (!bool2)
          {
            bool2 = bool1;
            label141:
            ((DecorToolbar)localObject2).setCollapsible(bool2);
            localObject1 = this.mOverlayLayout;
            if (paramInt != i) {
              break label278;
            }
            boolean bool3 = this.mHasEmbeddedTabs;
            if (bool3) {
              break label278;
            }
          }
        }
        break;
      }
      break;
    }
    for (;;)
    {
      ((ActionBarOverlayLayout)localObject1).setHasNonEmbeddedTabs(bool1);
      return;
      int n = getSelectedNavigationIndex();
      this.mSavedTabPosition = n;
      n = 0;
      selectTab(null);
      localObject2 = this.mTabScrollView;
      int i1 = 8;
      ((ScrollingTabContainerView)localObject2).setVisibility(i1);
      break;
      ensureTabsExist();
      localObject1 = this.mTabScrollView;
      ((ScrollingTabContainerView)localObject1).setVisibility(0);
      int m = this.mSavedTabPosition;
      if (m == j) {
        break label116;
      }
      m = this.mSavedTabPosition;
      setSelectedNavigationItem(m);
      this.mSavedTabPosition = j;
      break label116;
      m = 0;
      localObject1 = null;
      break label141;
      label278:
      bool1 = false;
    }
  }
  
  public void setSelectedNavigationItem(int paramInt)
  {
    Object localObject = this.mDecorToolbar;
    int i = ((DecorToolbar)localObject).getNavigationMode();
    switch (i)
    {
    default: 
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("setSelectedNavigationIndex not valid for current navigation mode");
      throw ((Throwable)localObject);
    case 2: 
      localObject = (ActionBar.Tab)this.mTabs.get(paramInt);
      selectTab((ActionBar.Tab)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.mDecorToolbar;
      ((DecorToolbar)localObject).setDropdownSelectedPosition(paramInt);
    }
  }
  
  public void setShowHideAnimationEnabled(boolean paramBoolean)
  {
    this.mShowHideAnimationEnabled = paramBoolean;
    if (!paramBoolean)
    {
      ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = this.mCurrentShowAnim;
      if (localViewPropertyAnimatorCompatSet != null)
      {
        localViewPropertyAnimatorCompatSet = this.mCurrentShowAnim;
        localViewPropertyAnimatorCompatSet.cancel();
      }
    }
  }
  
  public void setSplitBackgroundDrawable(Drawable paramDrawable) {}
  
  public void setStackedBackgroundDrawable(Drawable paramDrawable)
  {
    this.mContainerView.setStackedBackground(paramDrawable);
  }
  
  public void setSubtitle(int paramInt)
  {
    String str = this.mContext.getString(paramInt);
    setSubtitle(str);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.mDecorToolbar.setSubtitle(paramCharSequence);
  }
  
  public void setTitle(int paramInt)
  {
    String str = this.mContext.getString(paramInt);
    setTitle(str);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.mDecorToolbar.setTitle(paramCharSequence);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    this.mDecorToolbar.setWindowTitle(paramCharSequence);
  }
  
  public void show()
  {
    boolean bool = this.mHiddenByApp;
    if (bool)
    {
      this.mHiddenByApp = false;
      updateVisibility(false);
    }
  }
  
  public void showForSystem()
  {
    boolean bool = this.mHiddenBySystem;
    if (bool)
    {
      this.mHiddenBySystem = false;
      bool = true;
      updateVisibility(bool);
    }
  }
  
  public ActionMode startActionMode(ActionMode.Callback paramCallback)
  {
    WindowDecorActionBar.ActionModeImpl localActionModeImpl = this.mActionMode;
    if (localActionModeImpl != null)
    {
      localActionModeImpl = this.mActionMode;
      localActionModeImpl.finish();
    }
    this.mOverlayLayout.setHideOnContentScrollEnabled(false);
    this.mContextView.killMode();
    localActionModeImpl = new android/support/v7/app/WindowDecorActionBar$ActionModeImpl;
    Object localObject = this.mContextView.getContext();
    localActionModeImpl.<init>(this, (Context)localObject, paramCallback);
    boolean bool = localActionModeImpl.dispatchOnCreate();
    if (bool)
    {
      this.mActionMode = localActionModeImpl;
      localActionModeImpl.invalidate();
      this.mContextView.initForMode(localActionModeImpl);
      bool = true;
      animateToMode(bool);
      localObject = this.mContextView;
      int i = 32;
      ((ActionBarContextView)localObject).sendAccessibilityEvent(i);
    }
    for (;;)
    {
      return localActionModeImpl;
      localActionModeImpl = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\WindowDecorActionBar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */