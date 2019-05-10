package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.u;
import android.support.v4.view.e;
import android.support.v4.view.o;
import android.support.v4.view.r;
import android.support.v4.view.v;
import android.support.v4.view.w;
import android.support.v4.widget.k;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.color;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.view.StandaloneActionMode;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.OnAttachListener;
import android.support.v7.widget.DecorContentParent;
import android.support.v7.widget.FitWindowsViewGroup;
import android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ViewUtils;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;

class AppCompatDelegateImplV9
  extends AppCompatDelegateImplBase
  implements MenuBuilder.Callback, LayoutInflater.Factory2
{
  private static final boolean IS_PRE_LOLLIPOP;
  private AppCompatDelegateImplV9.ActionMenuPresenterCallback mActionMenuPresenterCallback;
  ActionMode mActionMode;
  PopupWindow mActionModePopup;
  ActionBarContextView mActionModeView;
  private AppCompatViewInflater mAppCompatViewInflater;
  private boolean mClosingActionMenu;
  private DecorContentParent mDecorContentParent;
  private boolean mEnableDefaultActionBarUp;
  v mFadeAnim = null;
  private boolean mFeatureIndeterminateProgress;
  private boolean mFeatureProgress;
  int mInvalidatePanelMenuFeatures;
  boolean mInvalidatePanelMenuPosted;
  private final Runnable mInvalidatePanelMenuRunnable;
  private boolean mLongPressBackDown;
  private AppCompatDelegateImplV9.PanelMenuPresenterCallback mPanelMenuPresenterCallback;
  private AppCompatDelegateImplV9.PanelFeatureState[] mPanels;
  private AppCompatDelegateImplV9.PanelFeatureState mPreparedPanel;
  Runnable mShowActionModePopup;
  private View mStatusGuard;
  private ViewGroup mSubDecor;
  private boolean mSubDecorInstalled;
  private Rect mTempRect1;
  private Rect mTempRect2;
  private TextView mTitleView;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i < j) {}
    for (i = 1;; i = 0)
    {
      IS_PRE_LOLLIPOP = i;
      return;
    }
  }
  
  AppCompatDelegateImplV9(Context paramContext, Window paramWindow, AppCompatCallback paramAppCompatCallback)
  {
    super(paramContext, paramWindow, paramAppCompatCallback);
    AppCompatDelegateImplV9.1 local1 = new android/support/v7/app/AppCompatDelegateImplV9$1;
    local1.<init>(this);
    this.mInvalidatePanelMenuRunnable = local1;
  }
  
  private void applyFixedSizeWindow()
  {
    ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)this.mSubDecor.findViewById(16908290);
    Object localObject = this.mWindow.getDecorView();
    int i = ((View)localObject).getPaddingLeft();
    int i1 = ((View)localObject).getPaddingTop();
    int i2 = ((View)localObject).getPaddingRight();
    int i3 = ((View)localObject).getPaddingBottom();
    localContentFrameLayout.setDecorPadding(i, i1, i2, i3);
    localObject = this.mContext;
    int[] arrayOfInt = R.styleable.AppCompatTheme;
    localObject = ((Context)localObject).obtainStyledAttributes(arrayOfInt);
    i = R.styleable.AppCompatTheme_windowMinWidthMajor;
    TypedValue localTypedValue = localContentFrameLayout.getMinWidthMajor();
    ((TypedArray)localObject).getValue(i, localTypedValue);
    i = R.styleable.AppCompatTheme_windowMinWidthMinor;
    localTypedValue = localContentFrameLayout.getMinWidthMinor();
    ((TypedArray)localObject).getValue(i, localTypedValue);
    i = R.styleable.AppCompatTheme_windowFixedWidthMajor;
    boolean bool1 = ((TypedArray)localObject).hasValue(i);
    if (bool1)
    {
      j = R.styleable.AppCompatTheme_windowFixedWidthMajor;
      localTypedValue = localContentFrameLayout.getFixedWidthMajor();
      ((TypedArray)localObject).getValue(j, localTypedValue);
    }
    int j = R.styleable.AppCompatTheme_windowFixedWidthMinor;
    boolean bool2 = ((TypedArray)localObject).hasValue(j);
    if (bool2)
    {
      k = R.styleable.AppCompatTheme_windowFixedWidthMinor;
      localTypedValue = localContentFrameLayout.getFixedWidthMinor();
      ((TypedArray)localObject).getValue(k, localTypedValue);
    }
    int k = R.styleable.AppCompatTheme_windowFixedHeightMajor;
    boolean bool3 = ((TypedArray)localObject).hasValue(k);
    if (bool3)
    {
      m = R.styleable.AppCompatTheme_windowFixedHeightMajor;
      localTypedValue = localContentFrameLayout.getFixedHeightMajor();
      ((TypedArray)localObject).getValue(m, localTypedValue);
    }
    int m = R.styleable.AppCompatTheme_windowFixedHeightMinor;
    boolean bool4 = ((TypedArray)localObject).hasValue(m);
    if (bool4)
    {
      int n = R.styleable.AppCompatTheme_windowFixedHeightMinor;
      localTypedValue = localContentFrameLayout.getFixedHeightMinor();
      ((TypedArray)localObject).getValue(n, localTypedValue);
    }
    ((TypedArray)localObject).recycle();
    localContentFrameLayout.requestLayout();
  }
  
  private ViewGroup createSubDecor()
  {
    int i = 16908290;
    int j = 109;
    int k = 1;
    Object localObject1 = this.mContext;
    Object localObject2 = R.styleable.AppCompatTheme;
    localObject1 = ((Context)localObject1).obtainStyledAttributes((int[])localObject2);
    int n = R.styleable.AppCompatTheme_windowActionBar;
    boolean bool2 = ((TypedArray)localObject1).hasValue(n);
    if (!bool2)
    {
      ((TypedArray)localObject1).recycle();
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
      throw ((Throwable)localObject1);
    }
    int i1 = R.styleable.AppCompatTheme_windowNoTitle;
    boolean bool3 = ((TypedArray)localObject1).getBoolean(i1, false);
    int i5;
    Object localObject3;
    if (bool3)
    {
      requestWindowFeature(k);
      int i2 = R.styleable.AppCompatTheme_windowActionBarOverlay;
      boolean bool4 = ((TypedArray)localObject1).getBoolean(i2, false);
      if (bool4) {
        requestWindowFeature(j);
      }
      int i3 = R.styleable.AppCompatTheme_windowActionModeOverlay;
      boolean bool5 = ((TypedArray)localObject1).getBoolean(i3, false);
      if (bool5)
      {
        i4 = 10;
        requestWindowFeature(i4);
      }
      int i4 = R.styleable.AppCompatTheme_android_windowIsFloating;
      boolean bool6 = ((TypedArray)localObject1).getBoolean(i4, false);
      this.mIsFloating = bool6;
      ((TypedArray)localObject1).recycle();
      this.mWindow.getDecorView();
      localObject1 = LayoutInflater.from(this.mContext);
      bool6 = this.mWindowNoTitle;
      if (bool6) {
        break label681;
      }
      bool6 = this.mIsFloating;
      if (!bool6) {
        break label428;
      }
      i5 = R.layout.abc_dialog_title_material;
      localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i5, null);
      this.mOverlayActionBar = false;
      this.mHasActionBar = false;
      localObject3 = localObject1;
    }
    for (;;)
    {
      if (localObject3 == null)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("AppCompat does not support the current theme features: { windowActionBar: ");
        boolean bool9 = this.mHasActionBar;
        localObject2 = ((StringBuilder)localObject2).append(bool9).append(", windowActionBarOverlay: ");
        bool9 = this.mOverlayActionBar;
        localObject2 = ((StringBuilder)localObject2).append(bool9).append(", android:windowIsFloating: ");
        bool9 = this.mIsFloating;
        localObject2 = ((StringBuilder)localObject2).append(bool9).append(", windowActionModeOverlay: ");
        bool9 = this.mOverlayActionMode;
        localObject2 = ((StringBuilder)localObject2).append(bool9).append(", windowNoTitle: ");
        bool9 = this.mWindowNoTitle;
        localObject2 = bool9 + " }";
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        i5 = R.styleable.AppCompatTheme_windowActionBar;
        boolean bool7 = ((TypedArray)localObject1).getBoolean(i5, false);
        if (!bool7) {
          break;
        }
        int i6 = 108;
        requestWindowFeature(i6);
        break;
        label428:
        boolean bool10 = this.mHasActionBar;
        if (!bool10) {
          break label991;
        }
        localObject2 = new android/util/TypedValue;
        ((TypedValue)localObject2).<init>();
        localObject1 = this.mContext.getTheme();
        i8 = R.attr.actionBarTheme;
        ((Resources.Theme)localObject1).resolveAttribute(i8, (TypedValue)localObject2, k);
        i9 = ((TypedValue)localObject2).resourceId;
        if (i9 != 0)
        {
          localObject1 = new android/support/v7/view/ContextThemeWrapper;
          localObject3 = this.mContext;
          i6 = ((TypedValue)localObject2).resourceId;
          ((ContextThemeWrapper)localObject1).<init>((Context)localObject3, i6);
        }
        for (;;)
        {
          localObject1 = LayoutInflater.from((Context)localObject1);
          i6 = R.layout.abc_screen_toolbar;
          localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i6, null);
          i6 = R.id.decor_content_parent;
          localObject2 = (DecorContentParent)((ViewGroup)localObject1).findViewById(i6);
          this.mDecorContentParent = ((DecorContentParent)localObject2);
          localObject2 = this.mDecorContentParent;
          localObject3 = getWindowCallback();
          ((DecorContentParent)localObject2).setWindowCallback((Window.Callback)localObject3);
          bool8 = this.mOverlayActionBar;
          if (bool8)
          {
            localObject2 = this.mDecorContentParent;
            ((DecorContentParent)localObject2).initFeature(j);
          }
          bool8 = this.mFeatureProgress;
          if (bool8)
          {
            localObject2 = this.mDecorContentParent;
            i8 = 2;
            ((DecorContentParent)localObject2).initFeature(i8);
          }
          bool8 = this.mFeatureIndeterminateProgress;
          if (bool8)
          {
            localObject2 = this.mDecorContentParent;
            i8 = 5;
            ((DecorContentParent)localObject2).initFeature(i8);
          }
          localObject3 = localObject1;
          break;
          localObject1 = this.mContext;
        }
        label681:
        boolean bool8 = this.mOverlayActionMode;
        int i7;
        if (bool8)
        {
          i7 = R.layout.abc_screen_simple_overlay_action_mode;
          localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i7, null);
        }
        for (localObject2 = localObject1;; localObject2 = localObject1)
        {
          i9 = Build.VERSION.SDK_INT;
          i8 = 21;
          if (i9 < i8) {
            break label780;
          }
          localObject1 = new android/support/v7/app/AppCompatDelegateImplV9$2;
          ((AppCompatDelegateImplV9.2)localObject1).<init>(this);
          r.a((View)localObject2, (o)localObject1);
          localObject3 = localObject2;
          break;
          i7 = R.layout.abc_screen_simple;
          localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i7, null);
        }
        label780:
        localObject1 = localObject2;
        localObject1 = (FitWindowsViewGroup)localObject2;
        localObject3 = new android/support/v7/app/AppCompatDelegateImplV9$3;
        ((AppCompatDelegateImplV9.3)localObject3).<init>(this);
        ((FitWindowsViewGroup)localObject1).setOnFitSystemWindowsListener((FitWindowsViewGroup.OnFitSystemWindowsListener)localObject3);
        localObject3 = localObject2;
        continue;
      }
      localObject1 = this.mDecorContentParent;
      if (localObject1 == null)
      {
        i9 = R.id.title;
        localObject1 = (TextView)((ViewGroup)localObject3).findViewById(i9);
        this.mTitleView = ((TextView)localObject1);
      }
      ViewUtils.makeOptionalFitsSystemWindows((View)localObject3);
      int i9 = R.id.action_bar_activity_content;
      localObject1 = (ContentFrameLayout)((ViewGroup)localObject3).findViewById(i9);
      localObject2 = (ViewGroup)this.mWindow.findViewById(i);
      if (localObject2 != null)
      {
        for (;;)
        {
          int m = ((ViewGroup)localObject2).getChildCount();
          if (m <= 0) {
            break;
          }
          View localView = ((ViewGroup)localObject2).getChildAt(0);
          ((ViewGroup)localObject2).removeViewAt(0);
          ((ContentFrameLayout)localObject1).addView(localView);
        }
        ((ViewGroup)localObject2).setId(-1);
        ((ContentFrameLayout)localObject1).setId(i);
        boolean bool1 = localObject2 instanceof FrameLayout;
        if (bool1)
        {
          localObject2 = (FrameLayout)localObject2;
          ((FrameLayout)localObject2).setForeground(null);
        }
      }
      this.mWindow.setContentView((View)localObject3);
      localObject2 = new android/support/v7/app/AppCompatDelegateImplV9$4;
      ((AppCompatDelegateImplV9.4)localObject2).<init>(this);
      ((ContentFrameLayout)localObject1).setAttachListener((ContentFrameLayout.OnAttachListener)localObject2);
      return (ViewGroup)localObject3;
      label991:
      int i8 = 0;
      localObject3 = null;
    }
  }
  
  private void ensureSubDecor()
  {
    boolean bool1 = this.mSubDecorInstalled;
    if (!bool1)
    {
      Object localObject = createSubDecor();
      this.mSubDecor = ((ViewGroup)localObject);
      localObject = getTitle();
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool2) {
        onTitleChanged((CharSequence)localObject);
      }
      applyFixedSizeWindow();
      localObject = this.mSubDecor;
      onSubDecorInstalled((ViewGroup)localObject);
      bool1 = true;
      this.mSubDecorInstalled = bool1;
      localObject = getPanelState(0, false);
      bool2 = isDestroyed();
      if (!bool2) {
        if (localObject != null)
        {
          localObject = ((AppCompatDelegateImplV9.PanelFeatureState)localObject).menu;
          if (localObject != null) {}
        }
        else
        {
          int i = 108;
          invalidatePanelMenu(i);
        }
      }
    }
  }
  
  private boolean initializePanelContent(AppCompatDelegateImplV9.PanelFeatureState paramPanelFeatureState)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    Object localObject = paramPanelFeatureState.createdPanelView;
    if (localObject != null)
    {
      localObject = paramPanelFeatureState.createdPanelView;
      paramPanelFeatureState.shownPanelView = ((View)localObject);
    }
    for (;;)
    {
      return bool1;
      localObject = paramPanelFeatureState.menu;
      if (localObject != null) {
        break;
      }
      bool1 = false;
      f1 = 0.0F;
    }
    localObject = this.mPanelMenuPresenterCallback;
    if (localObject == null)
    {
      localObject = new android/support/v7/app/AppCompatDelegateImplV9$PanelMenuPresenterCallback;
      ((AppCompatDelegateImplV9.PanelMenuPresenterCallback)localObject).<init>(this);
      this.mPanelMenuPresenterCallback = ((AppCompatDelegateImplV9.PanelMenuPresenterCallback)localObject);
    }
    localObject = this.mPanelMenuPresenterCallback;
    localObject = (View)paramPanelFeatureState.getListMenuView((MenuPresenter.Callback)localObject);
    paramPanelFeatureState.shownPanelView = ((View)localObject);
    localObject = paramPanelFeatureState.shownPanelView;
    boolean bool2;
    if (localObject != null) {
      bool2 = bool1;
    }
    for (float f2 = f1;; f2 = 0.0F)
    {
      bool1 = bool2;
      f1 = f2;
      break;
      bool2 = false;
      localObject = null;
    }
  }
  
  private boolean initializePanelDecor(AppCompatDelegateImplV9.PanelFeatureState paramPanelFeatureState)
  {
    Object localObject = getActionBarThemedContext();
    paramPanelFeatureState.setStyle((Context)localObject);
    localObject = new android/support/v7/app/AppCompatDelegateImplV9$ListMenuDecorView;
    Context localContext = paramPanelFeatureState.listPresenterContext;
    ((AppCompatDelegateImplV9.ListMenuDecorView)localObject).<init>(this, localContext);
    paramPanelFeatureState.decorView = ((ViewGroup)localObject);
    paramPanelFeatureState.gravity = 81;
    return true;
  }
  
  private boolean initializePanelMenu(AppCompatDelegateImplV9.PanelFeatureState paramPanelFeatureState)
  {
    boolean bool = true;
    Object localObject1 = this.mContext;
    int i = paramPanelFeatureState.featureId;
    int j;
    Object localObject2;
    Object localObject3;
    Resources.Theme localTheme;
    int k;
    if (i != 0)
    {
      i = paramPanelFeatureState.featureId;
      j = 108;
      if (i != j) {}
    }
    else
    {
      localObject2 = this.mDecorContentParent;
      if (localObject2 != null)
      {
        localObject3 = new android/util/TypedValue;
        ((TypedValue)localObject3).<init>();
        localTheme = ((Context)localObject1).getTheme();
        i = R.attr.actionBarTheme;
        localTheme.resolveAttribute(i, (TypedValue)localObject3, bool);
        i = 0;
        localObject2 = null;
        k = ((TypedValue)localObject3).resourceId;
        if (k != 0)
        {
          localObject2 = ((Context)localObject1).getResources().newTheme();
          ((Resources.Theme)localObject2).setTo(localTheme);
          k = ((TypedValue)localObject3).resourceId;
          ((Resources.Theme)localObject2).applyStyle(k, bool);
          k = R.attr.actionBarWidgetTheme;
          ((Resources.Theme)localObject2).resolveAttribute(k, (TypedValue)localObject3, bool);
          k = ((TypedValue)localObject3).resourceId;
          if (k != 0)
          {
            if (localObject2 == null)
            {
              localObject2 = ((Context)localObject1).getResources().newTheme();
              ((Resources.Theme)localObject2).setTo(localTheme);
            }
            j = ((TypedValue)localObject3).resourceId;
            ((Resources.Theme)localObject2).applyStyle(j, bool);
          }
          localObject3 = localObject2;
          if (localObject2 == null) {
            break label268;
          }
          localObject2 = new android/support/v7/view/ContextThemeWrapper;
          localTheme = null;
          ((ContextThemeWrapper)localObject2).<init>((Context)localObject1, 0);
          localObject1 = ((Context)localObject2).getTheme();
          ((Resources.Theme)localObject1).setTo((Resources.Theme)localObject3);
        }
      }
    }
    for (;;)
    {
      localObject1 = new android/support/v7/view/menu/MenuBuilder;
      ((MenuBuilder)localObject1).<init>((Context)localObject2);
      ((MenuBuilder)localObject1).setCallback(this);
      paramPanelFeatureState.setMenu((MenuBuilder)localObject1);
      return bool;
      k = R.attr.actionBarWidgetTheme;
      localTheme.resolveAttribute(k, (TypedValue)localObject3, bool);
      break;
      label268:
      localObject2 = localObject1;
    }
  }
  
  private void invalidatePanelMenu(int paramInt)
  {
    int i = 1;
    int j = this.mInvalidatePanelMenuFeatures;
    int k = i << paramInt;
    j |= k;
    this.mInvalidatePanelMenuFeatures = j;
    boolean bool = this.mInvalidatePanelMenuPosted;
    if (!bool)
    {
      View localView = this.mWindow.getDecorView();
      Runnable localRunnable = this.mInvalidatePanelMenuRunnable;
      r.a(localView, localRunnable);
      this.mInvalidatePanelMenuPosted = i;
    }
  }
  
  private boolean onKeyDownPanel(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getRepeatCount();
    AppCompatDelegateImplV9.PanelFeatureState localPanelFeatureState;
    boolean bool1;
    if (i == 0)
    {
      i = 1;
      localPanelFeatureState = getPanelState(paramInt, i);
      boolean bool2 = localPanelFeatureState.isOpen;
      if (!bool2) {
        bool1 = preparePanel(localPanelFeatureState, paramKeyEvent);
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      localPanelFeatureState = null;
    }
  }
  
  private boolean onKeyUpPanel(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    String str = null;
    Object localObject1 = this.mActionMode;
    if (localObject1 != null)
    {
      bool2 = false;
      localObject1 = null;
      return bool2;
    }
    Object localObject2 = getPanelState(paramInt, bool1);
    if (paramInt == 0)
    {
      localObject1 = this.mDecorContentParent;
      if (localObject1 != null)
      {
        localObject1 = this.mDecorContentParent;
        bool2 = ((DecorContentParent)localObject1).canShowOverflowMenu();
        if (bool2)
        {
          localObject1 = ViewConfiguration.get(this.mContext);
          bool2 = ((ViewConfiguration)localObject1).hasPermanentMenuKey();
          if (!bool2)
          {
            localObject1 = this.mDecorContentParent;
            bool2 = ((DecorContentParent)localObject1).isOverflowMenuShowing();
            if (!bool2)
            {
              bool2 = isDestroyed();
              if (bool2) {
                break label328;
              }
              bool2 = preparePanel((AppCompatDelegateImplV9.PanelFeatureState)localObject2, paramKeyEvent);
              if (!bool2) {
                break label328;
              }
              localObject1 = this.mDecorContentParent;
              bool1 = ((DecorContentParent)localObject1).showOverflowMenu();
            }
          }
        }
      }
    }
    for (;;)
    {
      if (bool1)
      {
        localObject1 = this.mContext;
        localObject2 = "audio";
        localObject1 = (AudioManager)((Context)localObject1).getSystemService((String)localObject2);
        if (localObject1 == null) {
          break label307;
        }
        ((AudioManager)localObject1).playSoundEffect(0);
      }
      label186:
      bool2 = bool1;
      break;
      localObject1 = this.mDecorContentParent;
      bool1 = ((DecorContentParent)localObject1).hideOverflowMenu();
      continue;
      bool2 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).isOpen;
      if (!bool2)
      {
        bool2 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).isHandled;
        if (!bool2) {
          break label253;
        }
      }
      bool2 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).isOpen;
      closePanel((AppCompatDelegateImplV9.PanelFeatureState)localObject2, bool1);
      bool1 = bool2;
    }
    label253:
    boolean bool2 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).isPrepared;
    if (bool2)
    {
      bool2 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).refreshMenuContent;
      if (!bool2) {
        break label333;
      }
      ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).isPrepared = false;
    }
    label307:
    label328:
    label333:
    for (bool2 = preparePanel((AppCompatDelegateImplV9.PanelFeatureState)localObject2, paramKeyEvent);; bool2 = bool1)
    {
      if (bool2)
      {
        openPanel((AppCompatDelegateImplV9.PanelFeatureState)localObject2, paramKeyEvent);
        break;
        localObject1 = "AppCompatDelegate";
        str = "Couldn't get audio manager";
        Log.w((String)localObject1, str);
        break label186;
      }
      bool1 = false;
      break;
    }
  }
  
  private void openPanel(AppCompatDelegateImplV9.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    int i = 0;
    int j = -1;
    int k = 1;
    int m = -2;
    boolean bool1 = paramPanelFeatureState.isOpen;
    if (!bool1)
    {
      bool1 = isDestroyed();
      if (!bool1) {
        break label35;
      }
    }
    label35:
    boolean bool2;
    label138:
    label145:
    label147:
    Object localObject2;
    Object localObject3;
    label252:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                for (;;)
                {
                  return;
                  int n = paramPanelFeatureState.featureId;
                  int i3;
                  if (n == 0)
                  {
                    localObject1 = this.mContext.getResources().getConfiguration();
                    n = ((Configuration)localObject1).screenLayout & 0xF;
                    i3 = 4;
                    if (n != i3) {
                      break label138;
                    }
                    n = k;
                  }
                  for (;;)
                  {
                    if (n != 0) {
                      break label145;
                    }
                    localObject1 = getWindowCallback();
                    if (localObject1 == null) {
                      break label147;
                    }
                    i3 = paramPanelFeatureState.featureId;
                    MenuBuilder localMenuBuilder = paramPanelFeatureState.menu;
                    bool2 = ((Window.Callback)localObject1).onMenuOpened(i3, localMenuBuilder);
                    if (bool2) {
                      break label147;
                    }
                    closePanel(paramPanelFeatureState, k);
                    break;
                    bool2 = false;
                    localObject1 = null;
                  }
                }
                localObject1 = this.mContext;
                localObject2 = "window";
                localObject1 = ((Context)localObject1).getSystemService((String)localObject2);
                localObject3 = localObject1;
                localObject3 = (WindowManager)localObject1;
              } while (localObject3 == null);
              bool2 = preparePanel(paramPanelFeatureState, paramKeyEvent);
            } while (!bool2);
            localObject1 = paramPanelFeatureState.decorView;
            if (localObject1 != null)
            {
              bool2 = paramPanelFeatureState.refreshDecorView;
              if (!bool2) {
                break label575;
              }
            }
            localObject1 = paramPanelFeatureState.decorView;
            if (localObject1 != null) {
              break;
            }
            bool2 = initializePanelDecor(paramPanelFeatureState);
          } while (!bool2);
          localObject1 = paramPanelFeatureState.decorView;
        } while (localObject1 == null);
        bool2 = initializePanelContent(paramPanelFeatureState);
      } while (!bool2);
      bool2 = paramPanelFeatureState.hasPanelItems();
    } while (!bool2);
    Object localObject1 = paramPanelFeatureState.shownPanelView.getLayoutParams();
    if (localObject1 == null)
    {
      localObject1 = new android/view/ViewGroup$LayoutParams;
      ((ViewGroup.LayoutParams)localObject1).<init>(m, m);
    }
    for (Object localObject4 = localObject1;; localObject4 = localObject1)
    {
      int i1 = paramPanelFeatureState.background;
      localObject2 = paramPanelFeatureState.decorView;
      ((ViewGroup)localObject2).setBackgroundResource(i1);
      localObject1 = paramPanelFeatureState.shownPanelView.getParent();
      if (localObject1 != null)
      {
        boolean bool4 = localObject1 instanceof ViewGroup;
        if (bool4)
        {
          localObject1 = (ViewGroup)localObject1;
          localObject2 = paramPanelFeatureState.shownPanelView;
          ((ViewGroup)localObject1).removeView((View)localObject2);
        }
      }
      localObject1 = paramPanelFeatureState.decorView;
      localObject2 = paramPanelFeatureState.shownPanelView;
      ((ViewGroup)localObject1).addView((View)localObject2, (ViewGroup.LayoutParams)localObject4);
      localObject1 = paramPanelFeatureState.shownPanelView;
      boolean bool3 = ((View)localObject1).hasFocus();
      if (!bool3)
      {
        localObject1 = paramPanelFeatureState.shownPanelView;
        ((View)localObject1).requestFocus();
      }
      j = m;
      for (;;)
      {
        paramPanelFeatureState.isHandled = false;
        localObject1 = new android/view/WindowManager$LayoutParams;
        i = paramPanelFeatureState.x;
        int i4 = paramPanelFeatureState.y;
        int i5 = 1002;
        int i6 = 8519680;
        int i7 = -3;
        ((WindowManager.LayoutParams)localObject1).<init>(j, m, i, i4, i5, i6, i7);
        j = paramPanelFeatureState.gravity;
        ((WindowManager.LayoutParams)localObject1).gravity = j;
        j = paramPanelFeatureState.windowAnimations;
        ((WindowManager.LayoutParams)localObject1).windowAnimations = j;
        localObject4 = paramPanelFeatureState.decorView;
        ((WindowManager)localObject3).addView((View)localObject4, (ViewGroup.LayoutParams)localObject1);
        paramPanelFeatureState.isOpen = k;
        break;
        bool3 = paramPanelFeatureState.refreshDecorView;
        if (!bool3) {
          break label252;
        }
        localObject1 = paramPanelFeatureState.decorView;
        int i2 = ((ViewGroup)localObject1).getChildCount();
        if (i2 <= 0) {
          break label252;
        }
        localObject1 = paramPanelFeatureState.decorView;
        ((ViewGroup)localObject1).removeAllViews();
        break label252;
        label575:
        localObject1 = paramPanelFeatureState.createdPanelView;
        if (localObject1 != null)
        {
          localObject1 = paramPanelFeatureState.createdPanelView.getLayoutParams();
          if (localObject1 != null)
          {
            i2 = ((ViewGroup.LayoutParams)localObject1).width;
            if (i2 == j) {
              continue;
            }
          }
        }
        j = m;
      }
    }
  }
  
  private boolean performPanelShortcut(AppCompatDelegateImplV9.PanelFeatureState paramPanelFeatureState, int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    boolean bool1 = false;
    MenuBuilder localMenuBuilder = null;
    boolean bool2 = paramKeyEvent.isSystem();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = paramPanelFeatureState.isPrepared;
      Object localObject;
      if (!bool2)
      {
        bool2 = preparePanel(paramPanelFeatureState, paramKeyEvent);
        if (!bool2) {}
      }
      else
      {
        localObject = paramPanelFeatureState.menu;
        if (localObject != null)
        {
          localMenuBuilder = paramPanelFeatureState.menu;
          bool1 = localMenuBuilder.performShortcut(paramInt1, paramKeyEvent, paramInt2);
        }
      }
      if (bool1)
      {
        int i = paramInt2 & 0x1;
        if (i == 0)
        {
          localObject = this.mDecorContentParent;
          if (localObject == null)
          {
            i = 1;
            closePanel(paramPanelFeatureState, i);
          }
        }
      }
    }
  }
  
  private boolean preparePanel(AppCompatDelegateImplV9.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2 = isDestroyed();
    if (bool2) {}
    Object localObject1;
    int j;
    label425:
    label430:
    boolean bool5;
    for (;;)
    {
      return bool1;
      bool2 = paramPanelFeatureState.isPrepared;
      if (bool2)
      {
        bool1 = i;
      }
      else
      {
        localObject1 = this.mPreparedPanel;
        if (localObject1 != null)
        {
          localObject1 = this.mPreparedPanel;
          if (localObject1 != paramPanelFeatureState)
          {
            localObject1 = this.mPreparedPanel;
            closePanel((AppCompatDelegateImplV9.PanelFeatureState)localObject1, false);
          }
        }
        Window.Callback localCallback = getWindowCallback();
        if (localCallback != null)
        {
          j = paramPanelFeatureState.featureId;
          localObject1 = localCallback.onCreatePanelView(j);
          paramPanelFeatureState.createdPanelView = ((View)localObject1);
        }
        j = paramPanelFeatureState.featureId;
        if (j != 0)
        {
          j = paramPanelFeatureState.featureId;
          int k = 108;
          if (j != k) {}
        }
        else
        {
          j = i;
        }
        AppCompatDelegateImplV9.ActionMenuPresenterCallback localActionMenuPresenterCallback2;
        for (;;)
        {
          if (j != 0)
          {
            localObject2 = this.mDecorContentParent;
            if (localObject2 != null)
            {
              localObject2 = this.mDecorContentParent;
              ((DecorContentParent)localObject2).setMenuPrepared();
            }
          }
          localObject2 = paramPanelFeatureState.createdPanelView;
          if (localObject2 != null) {
            break label624;
          }
          boolean bool3;
          if (j != 0)
          {
            localObject2 = peekSupportActionBar();
            bool3 = localObject2 instanceof ToolbarActionBar;
            if (bool3) {
              break label624;
            }
          }
          localObject2 = paramPanelFeatureState.menu;
          if (localObject2 != null)
          {
            bool3 = paramPanelFeatureState.refreshMenuContent;
            if (!bool3) {
              break label430;
            }
          }
          localObject2 = paramPanelFeatureState.menu;
          if (localObject2 == null)
          {
            bool3 = initializePanelMenu(paramPanelFeatureState);
            if (!bool3) {
              break;
            }
            localObject2 = paramPanelFeatureState.menu;
            if (localObject2 == null) {
              break;
            }
          }
          if (j != 0)
          {
            localObject2 = this.mDecorContentParent;
            if (localObject2 != null)
            {
              localObject2 = this.mActionMenuPresenterCallback;
              if (localObject2 == null)
              {
                localObject2 = new android/support/v7/app/AppCompatDelegateImplV9$ActionMenuPresenterCallback;
                ((AppCompatDelegateImplV9.ActionMenuPresenterCallback)localObject2).<init>(this);
                this.mActionMenuPresenterCallback = ((AppCompatDelegateImplV9.ActionMenuPresenterCallback)localObject2);
              }
              localObject2 = this.mDecorContentParent;
              localObject3 = paramPanelFeatureState.menu;
              AppCompatDelegateImplV9.ActionMenuPresenterCallback localActionMenuPresenterCallback1 = this.mActionMenuPresenterCallback;
              ((DecorContentParent)localObject2).setMenu((Menu)localObject3, localActionMenuPresenterCallback1);
            }
          }
          localObject2 = paramPanelFeatureState.menu;
          ((MenuBuilder)localObject2).stopDispatchingItemsChanged();
          int m = paramPanelFeatureState.featureId;
          localObject3 = paramPanelFeatureState.menu;
          boolean bool4 = localCallback.onCreatePanelMenu(m, (Menu)localObject3);
          if (bool4) {
            break label425;
          }
          paramPanelFeatureState.setMenu(null);
          if (j == 0) {
            break;
          }
          localObject1 = this.mDecorContentParent;
          if (localObject1 == null) {
            break;
          }
          localObject1 = this.mDecorContentParent;
          localActionMenuPresenterCallback2 = this.mActionMenuPresenterCallback;
          ((DecorContentParent)localObject1).setMenu(null, localActionMenuPresenterCallback2);
          break;
          j = 0;
          localObject1 = null;
        }
        paramPanelFeatureState.refreshMenuContent = false;
        paramPanelFeatureState.menu.stopDispatchingItemsChanged();
        Object localObject2 = paramPanelFeatureState.frozenActionViewState;
        if (localObject2 != null)
        {
          localObject2 = paramPanelFeatureState.menu;
          localObject3 = paramPanelFeatureState.frozenActionViewState;
          ((MenuBuilder)localObject2).restoreActionViewStates((Bundle)localObject3);
          paramPanelFeatureState.frozenActionViewState = null;
        }
        localObject2 = paramPanelFeatureState.createdPanelView;
        Object localObject3 = paramPanelFeatureState.menu;
        bool5 = localCallback.onPreparePanel(0, (View)localObject2, (Menu)localObject3);
        if (bool5) {
          break;
        }
        if (j != 0)
        {
          localObject1 = this.mDecorContentParent;
          if (localObject1 != null)
          {
            localObject1 = this.mDecorContentParent;
            localActionMenuPresenterCallback2 = this.mActionMenuPresenterCallback;
            ((DecorContentParent)localObject1).setMenu(null, localActionMenuPresenterCallback2);
          }
        }
        localObject1 = paramPanelFeatureState.menu;
        ((MenuBuilder)localObject1).startDispatchingItemsChanged();
      }
    }
    if (paramKeyEvent != null)
    {
      j = paramKeyEvent.getDeviceId();
      label565:
      localObject1 = KeyCharacterMap.load(j);
      j = ((KeyCharacterMap)localObject1).getKeyboardType();
      if (j == i) {
        break label651;
      }
      j = i;
    }
    for (;;)
    {
      paramPanelFeatureState.qwertyMode = j;
      localObject1 = paramPanelFeatureState.menu;
      bool5 = paramPanelFeatureState.qwertyMode;
      ((MenuBuilder)localObject1).setQwertyMode(bool5);
      localObject1 = paramPanelFeatureState.menu;
      ((MenuBuilder)localObject1).startDispatchingItemsChanged();
      label624:
      paramPanelFeatureState.isPrepared = i;
      paramPanelFeatureState.isHandled = false;
      this.mPreparedPanel = paramPanelFeatureState;
      bool1 = i;
      break;
      j = -1;
      break label565;
      label651:
      j = 0;
      localObject1 = null;
    }
  }
  
  private void reopenMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    int i = 108;
    boolean bool1 = true;
    Object localObject1 = this.mDecorContentParent;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.mDecorContentParent;
      boolean bool2 = ((DecorContentParent)localObject1).canShowOverflowMenu();
      if (bool2)
      {
        localObject1 = ViewConfiguration.get(this.mContext);
        bool2 = ((ViewConfiguration)localObject1).hasPermanentMenuKey();
        if (bool2)
        {
          localObject1 = this.mDecorContentParent;
          bool2 = ((DecorContentParent)localObject1).isOverflowMenuShowPending();
          if (!bool2) {}
        }
        else
        {
          localObject1 = getWindowCallback();
          localObject2 = this.mDecorContentParent;
          boolean bool3 = ((DecorContentParent)localObject2).isOverflowMenuShowing();
          if ((!bool3) || (!paramBoolean)) {
            if (localObject1 != null)
            {
              bool3 = isDestroyed();
              if (!bool3)
              {
                bool3 = this.mInvalidatePanelMenuPosted;
                if (bool3)
                {
                  int j = this.mInvalidatePanelMenuFeatures & 0x1;
                  if (j != 0)
                  {
                    localObject2 = this.mWindow.getDecorView();
                    localObject3 = this.mInvalidatePanelMenuRunnable;
                    ((View)localObject2).removeCallbacks((Runnable)localObject3);
                    localObject2 = this.mInvalidatePanelMenuRunnable;
                    ((Runnable)localObject2).run();
                  }
                }
                localObject2 = getPanelState(0, bool1);
                Object localObject3 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).menu;
                if (localObject3 != null)
                {
                  boolean bool5 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).refreshMenuContent;
                  if (!bool5)
                  {
                    localObject3 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).createdPanelView;
                    MenuBuilder localMenuBuilder = ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).menu;
                    bool5 = ((Window.Callback)localObject1).onPreparePanel(0, (View)localObject3, localMenuBuilder);
                    if (bool5)
                    {
                      localObject2 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).menu;
                      ((Window.Callback)localObject1).onMenuOpened(i, (Menu)localObject2);
                      localObject1 = this.mDecorContentParent;
                      ((DecorContentParent)localObject1).showOverflowMenu();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return;
      localObject2 = this.mDecorContentParent;
      ((DecorContentParent)localObject2).hideOverflowMenu();
      boolean bool4 = isDestroyed();
      if (!bool4)
      {
        localObject2 = getPanelState(0, bool1).menu;
        ((Window.Callback)localObject1).onPanelClosed(i, (Menu)localObject2);
        continue;
        localObject1 = getPanelState(0, bool1);
        ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).refreshDecorView = bool1;
        closePanel((AppCompatDelegateImplV9.PanelFeatureState)localObject1, false);
        bool4 = false;
        localObject2 = null;
        openPanel((AppCompatDelegateImplV9.PanelFeatureState)localObject1, null);
      }
    }
  }
  
  private int sanitizeWindowFeatureId(int paramInt)
  {
    int i = 8;
    String str1;
    String str2;
    if (paramInt == i)
    {
      str1 = "AppCompatDelegate";
      str2 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.";
      Log.i(str1, str2);
      paramInt = 108;
    }
    for (;;)
    {
      return paramInt;
      i = 9;
      if (paramInt == i)
      {
        str1 = "AppCompatDelegate";
        str2 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.";
        Log.i(str1, str2);
        paramInt = 109;
      }
    }
  }
  
  private boolean shouldInheritContext(ViewParent paramViewParent)
  {
    boolean bool;
    if (paramViewParent == null)
    {
      bool = false;
      localObject = null;
      return bool;
    }
    Object localObject = this.mWindow;
    View localView = ((Window)localObject).getDecorView();
    for (ViewParent localViewParent = paramViewParent;; localViewParent = ((ViewParent)localViewParent).getParent())
    {
      if (localViewParent == null)
      {
        bool = true;
        break;
      }
      if (localViewParent != localView)
      {
        bool = localViewParent instanceof View;
        if (bool)
        {
          localObject = localViewParent;
          localObject = (View)localViewParent;
          bool = r.z((View)localObject);
          if (!bool) {
            continue;
          }
        }
      }
      bool = false;
      localObject = null;
      break;
    }
  }
  
  private void throwFeatureRequestIfSubDecorInstalled()
  {
    boolean bool = this.mSubDecorInstalled;
    if (bool)
    {
      AndroidRuntimeException localAndroidRuntimeException = new android/util/AndroidRuntimeException;
      localAndroidRuntimeException.<init>("Window feature must be requested before adding content");
      throw localAndroidRuntimeException;
    }
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    ensureSubDecor();
    ((ViewGroup)this.mSubDecor.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.mOriginalWindowCallback.onContentChanged();
  }
  
  View callActivityOnCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    Object localObject = this.mOriginalWindowCallback;
    boolean bool = localObject instanceof LayoutInflater.Factory;
    if (bool)
    {
      localObject = ((LayoutInflater.Factory)this.mOriginalWindowCallback).onCreateView(paramString, paramContext, paramAttributeSet);
      if (localObject == null) {}
    }
    for (;;)
    {
      return (View)localObject;
      bool = false;
      localObject = null;
    }
  }
  
  void callOnPanelClosed(int paramInt, AppCompatDelegateImplV9.PanelFeatureState paramPanelFeatureState, Menu paramMenu)
  {
    Object localObject;
    if (paramMenu == null)
    {
      if ((paramPanelFeatureState == null) && (paramInt >= 0))
      {
        localObject = this.mPanels;
        int i = localObject.length;
        if (paramInt < i)
        {
          localObject = this.mPanels;
          paramPanelFeatureState = localObject[paramInt];
        }
      }
      if (paramPanelFeatureState != null) {
        paramMenu = paramPanelFeatureState.menu;
      }
    }
    boolean bool;
    if (paramPanelFeatureState != null)
    {
      bool = paramPanelFeatureState.isOpen;
      if (bool) {}
    }
    for (;;)
    {
      return;
      bool = isDestroyed();
      if (!bool)
      {
        localObject = this.mOriginalWindowCallback;
        ((Window.Callback)localObject).onPanelClosed(paramInt, paramMenu);
      }
    }
  }
  
  void checkCloseActionMenu(MenuBuilder paramMenuBuilder)
  {
    boolean bool1 = this.mClosingActionMenu;
    if (bool1) {}
    for (;;)
    {
      return;
      bool1 = true;
      this.mClosingActionMenu = bool1;
      this.mDecorContentParent.dismissPopups();
      Window.Callback localCallback = getWindowCallback();
      if (localCallback != null)
      {
        boolean bool2 = isDestroyed();
        if (!bool2)
        {
          int i = 108;
          localCallback.onPanelClosed(i, paramMenuBuilder);
        }
      }
      bool1 = false;
      localCallback = null;
      this.mClosingActionMenu = false;
    }
  }
  
  void closePanel(int paramInt)
  {
    boolean bool = true;
    AppCompatDelegateImplV9.PanelFeatureState localPanelFeatureState = getPanelState(paramInt, bool);
    closePanel(localPanelFeatureState, bool);
  }
  
  void closePanel(AppCompatDelegateImplV9.PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    Object localObject1;
    if (paramBoolean)
    {
      int i = paramPanelFeatureState.featureId;
      if (i == 0)
      {
        localObject1 = this.mDecorContentParent;
        if (localObject1 != null)
        {
          localObject1 = this.mDecorContentParent;
          boolean bool1 = ((DecorContentParent)localObject1).isOverflowMenuShowing();
          if (bool1)
          {
            localObject1 = paramPanelFeatureState.menu;
            checkCloseActionMenu((MenuBuilder)localObject1);
          }
        }
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.mContext;
      Object localObject2 = "window";
      localObject1 = (WindowManager)((Context)localObject1).getSystemService((String)localObject2);
      if (localObject1 != null)
      {
        boolean bool2 = paramPanelFeatureState.isOpen;
        if (bool2)
        {
          localObject2 = paramPanelFeatureState.decorView;
          if (localObject2 != null)
          {
            localObject2 = paramPanelFeatureState.decorView;
            ((WindowManager)localObject1).removeView((View)localObject2);
            if (paramBoolean)
            {
              j = paramPanelFeatureState.featureId;
              callOnPanelClosed(j, paramPanelFeatureState, null);
            }
          }
        }
      }
      paramPanelFeatureState.isPrepared = false;
      paramPanelFeatureState.isHandled = false;
      paramPanelFeatureState.isOpen = false;
      paramPanelFeatureState.shownPanelView = null;
      int j = 1;
      paramPanelFeatureState.refreshDecorView = j;
      localObject1 = this.mPreparedPanel;
      if (localObject1 == paramPanelFeatureState) {
        this.mPreparedPanel = null;
      }
    }
  }
  
  public View createView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = 1;
    Object localObject1 = this.mAppCompatViewInflater;
    Object localObject3;
    boolean bool1;
    label144:
    int m;
    if (localObject1 == null)
    {
      localObject1 = this.mContext;
      localObject3 = R.styleable.AppCompatTheme;
      localObject1 = ((Context)localObject1).obtainStyledAttributes((int[])localObject3);
      int j = R.styleable.AppCompatTheme_viewInflaterClass;
      localObject3 = ((TypedArray)localObject1).getString(j);
      if (localObject3 != null)
      {
        localObject1 = AppCompatViewInflater.class.getName();
        bool1 = ((String)localObject1).equals(localObject3);
        if (!bool1) {}
      }
      else
      {
        localObject1 = new android/support/v7/app/AppCompatViewInflater;
        ((AppCompatViewInflater)localObject1).<init>();
        this.mAppCompatViewInflater = ((AppCompatViewInflater)localObject1);
      }
    }
    else
    {
      bool1 = IS_PRE_LOLLIPOP;
      if (!bool1) {
        break label366;
      }
      bool1 = paramAttributeSet instanceof XmlPullParser;
      if (!bool1) {
        break label346;
      }
      localObject1 = paramAttributeSet;
      localObject1 = (XmlPullParser)paramAttributeSet;
      int k = ((XmlPullParser)localObject1).getDepth();
      if (k <= i) {
        break label337;
      }
      k = i;
      m = k;
    }
    for (;;)
    {
      localObject1 = this.mAppCompatViewInflater;
      boolean bool3 = IS_PRE_LOLLIPOP;
      boolean bool4 = VectorEnabledTintResources.shouldBeUsed();
      localObject3 = paramString;
      Object localObject4 = paramContext;
      Object localObject5 = paramAttributeSet;
      return ((AppCompatViewInflater)localObject1).createView(paramView, paramString, paramContext, (AttributeSet)paramAttributeSet, m, bool3, i, bool4);
      try
      {
        localObject1 = Class.forName((String)localObject3);
        localObject4 = null;
        localObject4 = new Class[0];
        localObject1 = ((Class)localObject1).getDeclaredConstructor((Class[])localObject4);
        localObject4 = null;
        localObject4 = new Object[0];
        localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject4);
        localObject1 = (AppCompatViewInflater)localObject1;
        this.mAppCompatViewInflater = ((AppCompatViewInflater)localObject1);
        break;
      }
      finally
      {
        localObject4 = "AppCompatDelegate";
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        str = "Failed to instantiate custom view inflater ";
        localObject3 = ((StringBuilder)localObject5).append(str).append((String)localObject3);
        localObject5 = ". Falling back to default.";
        localObject3 = (String)localObject5;
        Log.i((String)localObject4, (String)localObject3, localThrowable);
        localObject2 = new android/support/v7/app/AppCompatViewInflater;
        ((AppCompatViewInflater)localObject2).<init>();
        this.mAppCompatViewInflater = ((AppCompatViewInflater)localObject2);
      }
      break;
      label337:
      boolean bool2 = false;
      Object localObject2 = null;
      break label144;
      label346:
      localObject2 = paramView;
      localObject2 = (ViewParent)paramView;
      bool2 = shouldInheritContext((ViewParent)localObject2);
      break label144;
      label366:
      int n = 0;
      String str = null;
    }
  }
  
  void dismissPopups()
  {
    Object localObject1 = this.mDecorContentParent;
    if (localObject1 != null)
    {
      localObject1 = this.mDecorContentParent;
      ((DecorContentParent)localObject1).dismissPopups();
    }
    localObject1 = this.mActionModePopup;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.mWindow.getDecorView();
      localObject2 = this.mShowActionModePopup;
      ((View)localObject1).removeCallbacks((Runnable)localObject2);
      localObject1 = this.mActionModePopup;
      bool = ((PopupWindow)localObject1).isShowing();
      if (!bool) {}
    }
    try
    {
      localObject1 = this.mActionModePopup;
      ((PopupWindow)localObject1).dismiss();
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    boolean bool = false;
    localObject1 = null;
    this.mActionModePopup = null;
    endOnGoingFadeAnimation();
    localObject1 = getPanelState(0, false);
    if (localObject1 != null)
    {
      localObject2 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).menu;
      if (localObject2 != null)
      {
        localObject1 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).menu;
        ((MenuBuilder)localObject1).close();
      }
    }
  }
  
  boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    int i = paramKeyEvent.getKeyCode();
    int k = 82;
    if (i == k)
    {
      Window.Callback localCallback = this.mOriginalWindowCallback;
      boolean bool2 = localCallback.dispatchKeyEvent(paramKeyEvent);
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      int j = paramKeyEvent.getKeyCode();
      k = paramKeyEvent.getAction();
      if (k == 0) {}
      for (;;)
      {
        if (!bool1) {
          break label73;
        }
        bool1 = onKeyDown(j, paramKeyEvent);
        break;
        bool1 = false;
      }
      label73:
      bool1 = onKeyUp(j, paramKeyEvent);
    }
  }
  
  void doInvalidatePanelMenu(int paramInt)
  {
    boolean bool = true;
    Object localObject1 = getPanelState(paramInt, bool);
    Object localObject2 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).menu;
    if (localObject2 != null)
    {
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      MenuBuilder localMenuBuilder = ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).menu;
      localMenuBuilder.saveActionViewStates((Bundle)localObject2);
      int i = ((Bundle)localObject2).size();
      if (i > 0) {
        ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).frozenActionViewState = ((Bundle)localObject2);
      }
      ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).menu.stopDispatchingItemsChanged();
      localObject2 = ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).menu;
      ((MenuBuilder)localObject2).clear();
    }
    ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).refreshMenuContent = bool;
    ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).refreshDecorView = bool;
    int j = 108;
    if ((paramInt == j) || (paramInt == 0))
    {
      localObject1 = this.mDecorContentParent;
      if (localObject1 != null)
      {
        localObject1 = getPanelState(0, false);
        if (localObject1 != null)
        {
          ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).isPrepared = false;
          localObject2 = null;
          preparePanel((AppCompatDelegateImplV9.PanelFeatureState)localObject1, null);
        }
      }
    }
  }
  
  void endOnGoingFadeAnimation()
  {
    v localv = this.mFadeAnim;
    if (localv != null)
    {
      localv = this.mFadeAnim;
      localv.b();
    }
  }
  
  AppCompatDelegateImplV9.PanelFeatureState findMenuPanel(Menu paramMenu)
  {
    int i = 0;
    Object localObject1 = null;
    AppCompatDelegateImplV9.PanelFeatureState[] arrayOfPanelFeatureState = this.mPanels;
    int j;
    int k;
    if (arrayOfPanelFeatureState != null)
    {
      j = arrayOfPanelFeatureState.length;
      k = 0;
      label23:
      if (k >= j) {
        break label78;
      }
      localObject1 = arrayOfPanelFeatureState[k];
      if (localObject1 == null) {
        break label67;
      }
      MenuBuilder localMenuBuilder = ((AppCompatDelegateImplV9.PanelFeatureState)localObject1).menu;
      if (localMenuBuilder != paramMenu) {
        break label67;
      }
    }
    for (Object localObject2 = localObject1;; localObject2 = null)
    {
      return (AppCompatDelegateImplV9.PanelFeatureState)localObject2;
      j = 0;
      localObject2 = null;
      break;
      label67:
      i = k + 1;
      k = i;
      break label23;
      label78:
      j = 0;
    }
  }
  
  public View findViewById(int paramInt)
  {
    ensureSubDecor();
    return this.mWindow.findViewById(paramInt);
  }
  
  protected AppCompatDelegateImplV9.PanelFeatureState getPanelState(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = this.mPanels;
    int i;
    if (localObject1 != null)
    {
      i = localObject1.length;
      if (i > paramInt) {}
    }
    else
    {
      i = paramInt + 1;
      localObject2 = new AppCompatDelegateImplV9.PanelFeatureState[i];
      if (localObject1 != null)
      {
        int j = localObject1.length;
        System.arraycopy(localObject1, 0, localObject2, 0, j);
      }
      this.mPanels = ((AppCompatDelegateImplV9.PanelFeatureState[])localObject2);
      localObject1 = localObject2;
    }
    Object localObject2 = localObject1[paramInt];
    if (localObject2 == null)
    {
      localObject2 = new android/support/v7/app/AppCompatDelegateImplV9$PanelFeatureState;
      ((AppCompatDelegateImplV9.PanelFeatureState)localObject2).<init>(paramInt);
      localObject1[paramInt] = localObject2;
    }
    for (localObject1 = localObject2;; localObject1 = localObject2) {
      return (AppCompatDelegateImplV9.PanelFeatureState)localObject1;
    }
  }
  
  ViewGroup getSubDecor()
  {
    return this.mSubDecor;
  }
  
  public boolean hasWindowFeature(int paramInt)
  {
    int i = sanitizeWindowFeatureId(paramInt);
    switch (i)
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      return i;
      boolean bool = this.mHasActionBar;
      continue;
      bool = this.mOverlayActionBar;
      continue;
      bool = this.mOverlayActionMode;
      continue;
      bool = this.mFeatureProgress;
      continue;
      bool = this.mFeatureIndeterminateProgress;
      continue;
      bool = this.mWindowNoTitle;
    }
  }
  
  public void initWindowDecorActionBar()
  {
    ensureSubDecor();
    boolean bool1 = this.mHasActionBar;
    if (bool1)
    {
      localObject = this.mActionBar;
      if (localObject == null) {}
    }
    else
    {
      return;
    }
    Object localObject = this.mOriginalWindowCallback;
    bool1 = localObject instanceof Activity;
    WindowDecorActionBar localWindowDecorActionBar;
    if (bool1)
    {
      localWindowDecorActionBar = new android/support/v7/app/WindowDecorActionBar;
      localObject = (Activity)this.mOriginalWindowCallback;
      boolean bool2 = this.mOverlayActionBar;
      localWindowDecorActionBar.<init>((Activity)localObject, bool2);
      this.mActionBar = localWindowDecorActionBar;
    }
    for (;;)
    {
      localObject = this.mActionBar;
      if (localObject == null) {
        break;
      }
      localObject = this.mActionBar;
      boolean bool3 = this.mEnableDefaultActionBarUp;
      ((ActionBar)localObject).setDefaultDisplayHomeAsUpEnabled(bool3);
      break;
      localObject = this.mOriginalWindowCallback;
      bool1 = localObject instanceof Dialog;
      if (bool1)
      {
        localWindowDecorActionBar = new android/support/v7/app/WindowDecorActionBar;
        localObject = (Dialog)this.mOriginalWindowCallback;
        localWindowDecorActionBar.<init>((Dialog)localObject);
        this.mActionBar = localWindowDecorActionBar;
      }
    }
  }
  
  public void installViewFactory()
  {
    Object localObject1 = LayoutInflater.from(this.mContext);
    Object localObject2 = ((LayoutInflater)localObject1).getFactory();
    if (localObject2 == null) {
      e.b((LayoutInflater)localObject1, this);
    }
    for (;;)
    {
      return;
      localObject1 = ((LayoutInflater)localObject1).getFactory2();
      boolean bool = localObject1 instanceof AppCompatDelegateImplV9;
      if (!bool)
      {
        localObject1 = "AppCompatDelegate";
        localObject2 = "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's";
        Log.i((String)localObject1, (String)localObject2);
      }
    }
  }
  
  public void invalidateOptionsMenu()
  {
    ActionBar localActionBar = getSupportActionBar();
    boolean bool;
    if (localActionBar != null)
    {
      bool = localActionBar.invalidateOptionsMenu();
      if (!bool) {}
    }
    for (;;)
    {
      return;
      bool = false;
      localActionBar = null;
      invalidatePanelMenu(0);
    }
  }
  
  boolean onBackPressed()
  {
    boolean bool1 = true;
    Object localObject = this.mActionMode;
    if (localObject != null)
    {
      localObject = this.mActionMode;
      ((ActionMode)localObject).finish();
    }
    for (;;)
    {
      return bool1;
      localObject = getSupportActionBar();
      if (localObject != null)
      {
        boolean bool2 = ((ActionBar)localObject).collapseActionView();
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    boolean bool = this.mHasActionBar;
    if (bool)
    {
      bool = this.mSubDecorInstalled;
      if (bool)
      {
        localObject = getSupportActionBar();
        if (localObject != null) {
          ((ActionBar)localObject).onConfigurationChanged(paramConfiguration);
        }
      }
    }
    Object localObject = AppCompatDrawableManager.get();
    Context localContext = this.mContext;
    ((AppCompatDrawableManager)localObject).onConfigurationChanged(localContext);
    applyDayNight();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = true;
    Object localObject = this.mOriginalWindowCallback;
    boolean bool2 = localObject instanceof Activity;
    if (bool2)
    {
      localObject = u.b((Activity)this.mOriginalWindowCallback);
      if (localObject != null)
      {
        localObject = peekSupportActionBar();
        if (localObject != null) {
          break label48;
        }
        this.mEnableDefaultActionBarUp = bool1;
      }
    }
    for (;;)
    {
      return;
      label48:
      ((ActionBar)localObject).setDefaultDisplayHomeAsUpEnabled(bool1);
    }
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = callActivityOnCreateView(paramView, paramString, paramContext, paramAttributeSet);
    if (localView != null) {}
    for (;;)
    {
      return localView;
      localView = createView(paramView, paramString, paramContext, paramAttributeSet);
    }
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public void onDestroy()
  {
    boolean bool = this.mInvalidatePanelMenuPosted;
    if (bool)
    {
      localObject = this.mWindow.getDecorView();
      Runnable localRunnable = this.mInvalidatePanelMenuRunnable;
      ((View)localObject).removeCallbacks(localRunnable);
    }
    super.onDestroy();
    Object localObject = this.mActionBar;
    if (localObject != null)
    {
      localObject = this.mActionBar;
      ((ActionBar)localObject).onDestroy();
    }
  }
  
  boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    switch (paramInt)
    {
    default: 
      bool = false;
    case 82: 
      for (;;)
      {
        return bool;
        onKeyDownPanel(0, paramKeyEvent);
      }
    }
    int i = paramKeyEvent.getFlags() & 0x80;
    if (i != 0) {}
    for (;;)
    {
      this.mLongPressBackDown = bool;
      break;
      bool = false;
    }
  }
  
  boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    AppCompatDelegateImplV9.PanelFeatureState localPanelFeatureState = null;
    int i = 1;
    Object localObject = getSupportActionBar();
    boolean bool1;
    if (localObject != null)
    {
      bool1 = ((ActionBar)localObject).onKeyShortcut(paramInt, paramKeyEvent);
      if (!bool1) {}
    }
    for (;;)
    {
      return i;
      localObject = this.mPreparedPanel;
      int k;
      if (localObject != null)
      {
        localObject = this.mPreparedPanel;
        k = paramKeyEvent.getKeyCode();
        bool1 = performPanelShortcut((AppCompatDelegateImplV9.PanelFeatureState)localObject, k, paramKeyEvent, i);
        if (bool1)
        {
          localPanelFeatureState = this.mPreparedPanel;
          if (localPanelFeatureState == null) {
            continue;
          }
          localPanelFeatureState = this.mPreparedPanel;
          localPanelFeatureState.isHandled = i;
          continue;
        }
      }
      localObject = this.mPreparedPanel;
      if (localObject == null)
      {
        localObject = getPanelState(0, i);
        preparePanel((AppCompatDelegateImplV9.PanelFeatureState)localObject, paramKeyEvent);
        k = paramKeyEvent.getKeyCode();
        boolean bool2 = performPanelShortcut((AppCompatDelegateImplV9.PanelFeatureState)localObject, k, paramKeyEvent, i);
        ((AppCompatDelegateImplV9.PanelFeatureState)localObject).isPrepared = false;
        if (bool2) {}
      }
      else
      {
        int j = 0;
      }
    }
  }
  
  boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    switch (paramInt)
    {
    default: 
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      onKeyUpPanel(0, paramKeyEvent);
      continue;
      boolean bool2 = this.mLongPressBackDown;
      this.mLongPressBackDown = false;
      AppCompatDelegateImplV9.PanelFeatureState localPanelFeatureState = getPanelState(0, false);
      if (localPanelFeatureState != null)
      {
        boolean bool3 = localPanelFeatureState.isOpen;
        if (bool3)
        {
          if (bool2) {
            continue;
          }
          closePanel(localPanelFeatureState, bool1);
          continue;
        }
      }
      bool2 = onBackPressed();
      if (!bool2) {
        break;
      }
    }
  }
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = getWindowCallback();
    boolean bool2;
    if (localCallback != null)
    {
      boolean bool1 = isDestroyed();
      if (!bool1)
      {
        Object localObject = paramMenuBuilder.getRootMenu();
        localObject = findMenuPanel((Menu)localObject);
        if (localObject != null)
        {
          int i = ((AppCompatDelegateImplV9.PanelFeatureState)localObject).featureId;
          bool2 = localCallback.onMenuItemSelected(i, paramMenuItem);
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localCallback = null;
    }
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    reopenMenu(paramMenuBuilder, true);
  }
  
  boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    boolean bool = true;
    int i = 108;
    if (paramInt == i)
    {
      ActionBar localActionBar = getSupportActionBar();
      if (localActionBar != null) {
        localActionBar.dispatchMenuVisibilityChanged(bool);
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  void onPanelClosed(int paramInt, Menu paramMenu)
  {
    int i = 108;
    Object localObject;
    if (paramInt == i)
    {
      localObject = getSupportActionBar();
      if (localObject != null) {
        ((ActionBar)localObject).dispatchMenuVisibilityChanged(false);
      }
    }
    for (;;)
    {
      return;
      if (paramInt == 0)
      {
        i = 1;
        localObject = getPanelState(paramInt, i);
        boolean bool = ((AppCompatDelegateImplV9.PanelFeatureState)localObject).isOpen;
        if (bool) {
          closePanel((AppCompatDelegateImplV9.PanelFeatureState)localObject, false);
        }
      }
    }
  }
  
  public void onPostCreate(Bundle paramBundle)
  {
    ensureSubDecor();
  }
  
  public void onPostResume()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null)
    {
      boolean bool = true;
      localActionBar.setShowHideAnimationEnabled(bool);
    }
  }
  
  public void onStop()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setShowHideAnimationEnabled(false);
    }
  }
  
  void onSubDecorInstalled(ViewGroup paramViewGroup) {}
  
  void onTitleChanged(CharSequence paramCharSequence)
  {
    Object localObject = this.mDecorContentParent;
    if (localObject != null)
    {
      localObject = this.mDecorContentParent;
      ((DecorContentParent)localObject).setWindowTitle(paramCharSequence);
    }
    for (;;)
    {
      return;
      localObject = peekSupportActionBar();
      if (localObject != null)
      {
        localObject = peekSupportActionBar();
        ((ActionBar)localObject).setWindowTitle(paramCharSequence);
      }
      else
      {
        localObject = this.mTitleView;
        if (localObject != null)
        {
          localObject = this.mTitleView;
          ((TextView)localObject).setText(paramCharSequence);
        }
      }
    }
  }
  
  public boolean requestWindowFeature(int paramInt)
  {
    boolean bool1 = false;
    Window localWindow = null;
    int i = 1;
    int j = sanitizeWindowFeatureId(paramInt);
    boolean bool2 = this.mWindowNoTitle;
    if (bool2)
    {
      int k = 108;
      if (j != k) {}
    }
    for (;;)
    {
      return bool1;
      boolean bool3 = this.mHasActionBar;
      if ((bool3) && (j == i)) {
        this.mHasActionBar = false;
      }
      switch (j)
      {
      default: 
        localWindow = this.mWindow;
        bool1 = localWindow.requestFeature(j);
        break;
      case 108: 
        throwFeatureRequestIfSubDecorInstalled();
        this.mHasActionBar = i;
        bool1 = i;
        break;
      case 109: 
        throwFeatureRequestIfSubDecorInstalled();
        this.mOverlayActionBar = i;
        bool1 = i;
        break;
      case 10: 
        throwFeatureRequestIfSubDecorInstalled();
        this.mOverlayActionMode = i;
        bool1 = i;
        break;
      case 2: 
        throwFeatureRequestIfSubDecorInstalled();
        this.mFeatureProgress = i;
        bool1 = i;
        break;
      case 5: 
        throwFeatureRequestIfSubDecorInstalled();
        this.mFeatureIndeterminateProgress = i;
        bool1 = i;
        break;
      case 1: 
        throwFeatureRequestIfSubDecorInstalled();
        this.mWindowNoTitle = i;
        bool1 = i;
      }
    }
  }
  
  public void setContentView(int paramInt)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)this.mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(this.mContext).inflate(paramInt, localViewGroup);
    this.mOriginalWindowCallback.onContentChanged();
  }
  
  public void setContentView(View paramView)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)this.mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    this.mOriginalWindowCallback.onContentChanged();
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)this.mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    this.mOriginalWindowCallback.onContentChanged();
  }
  
  public void setSupportActionBar(Toolbar paramToolbar)
  {
    Window.Callback localCallback = null;
    Object localObject1 = this.mOriginalWindowCallback;
    boolean bool1 = localObject1 instanceof Activity;
    if (!bool1) {
      return;
    }
    localObject1 = getSupportActionBar();
    boolean bool2 = localObject1 instanceof WindowDecorActionBar;
    if (bool2)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
      throw ((Throwable)localObject1);
    }
    this.mMenuInflater = null;
    if (localObject1 != null) {
      ((ActionBar)localObject1).onDestroy();
    }
    Object localObject2;
    if (paramToolbar != null)
    {
      localObject2 = new android/support/v7/app/ToolbarActionBar;
      localObject1 = ((Activity)this.mOriginalWindowCallback).getTitle();
      localCallback = this.mAppCompatWindowCallback;
      ((ToolbarActionBar)localObject2).<init>(paramToolbar, (CharSequence)localObject1, localCallback);
      this.mActionBar = ((ActionBar)localObject2);
      localObject1 = this.mWindow;
      localObject2 = ((ToolbarActionBar)localObject2).getWrappedWindowCallback();
      ((Window)localObject1).setCallback((Window.Callback)localObject2);
    }
    for (;;)
    {
      invalidateOptionsMenu();
      break;
      this.mActionBar = null;
      localObject1 = this.mWindow;
      localObject2 = this.mAppCompatWindowCallback;
      ((Window)localObject1).setCallback((Window.Callback)localObject2);
    }
  }
  
  final boolean shouldAnimateActionModeView()
  {
    boolean bool = this.mSubDecorInstalled;
    ViewGroup localViewGroup;
    if (bool)
    {
      localViewGroup = this.mSubDecor;
      if (localViewGroup != null)
      {
        localViewGroup = this.mSubDecor;
        bool = r.w(localViewGroup);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localViewGroup = null;
    }
  }
  
  public ActionMode startSupportActionMode(ActionMode.Callback paramCallback)
  {
    if (paramCallback == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("ActionMode callback can not be null.");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.mActionMode;
    if (localObject1 != null)
    {
      localObject1 = this.mActionMode;
      ((ActionMode)localObject1).finish();
    }
    localObject1 = new android/support/v7/app/AppCompatDelegateImplV9$ActionModeCallbackWrapperV9;
    ((AppCompatDelegateImplV9.ActionModeCallbackWrapperV9)localObject1).<init>(this, paramCallback);
    Object localObject2 = getSupportActionBar();
    if (localObject2 != null)
    {
      localObject2 = ((ActionBar)localObject2).startActionMode((ActionMode.Callback)localObject1);
      this.mActionMode = ((ActionMode)localObject2);
      localObject2 = this.mActionMode;
      if (localObject2 != null)
      {
        localObject2 = this.mAppCompatCallback;
        if (localObject2 != null)
        {
          localObject2 = this.mAppCompatCallback;
          ActionMode localActionMode = this.mActionMode;
          ((AppCompatCallback)localObject2).onSupportActionModeStarted(localActionMode);
        }
      }
    }
    localObject2 = this.mActionMode;
    if (localObject2 == null)
    {
      localObject1 = startSupportActionModeFromWindow((ActionMode.Callback)localObject1);
      this.mActionMode = ((ActionMode)localObject1);
    }
    return this.mActionMode;
  }
  
  ActionMode startSupportActionModeFromWindow(ActionMode.Callback paramCallback)
  {
    float f = 1.0F;
    int i = 1;
    endOnGoingFadeAnimation();
    Object localObject1 = this.mActionMode;
    if (localObject1 != null)
    {
      localObject1 = this.mActionMode;
      ((ActionMode)localObject1).finish();
    }
    boolean bool1 = paramCallback instanceof AppCompatDelegateImplV9.ActionModeCallbackWrapperV9;
    if (!bool1)
    {
      localObject1 = new android/support/v7/app/AppCompatDelegateImplV9$ActionModeCallbackWrapperV9;
      ((AppCompatDelegateImplV9.ActionModeCallbackWrapperV9)localObject1).<init>(this, paramCallback);
      paramCallback = (ActionMode.Callback)localObject1;
    }
    localObject1 = this.mAppCompatCallback;
    if (localObject1 != null)
    {
      bool1 = isDestroyed();
      if (bool1) {}
    }
    for (;;)
    {
      try
      {
        localObject1 = this.mAppCompatCallback;
        localObject1 = ((AppCompatCallback)localObject1).onWindowStartingSupportActionMode((ActionMode.Callback)paramCallback);
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        bool1 = false;
        localObject2 = null;
        continue;
        localObject2 = this.mActionModeView;
        if (localObject2 != null) {
          continue;
        }
        bool1 = this.mIsFloating;
        if (!bool1) {
          continue;
        }
        Object localObject4 = new android/util/TypedValue;
        ((TypedValue)localObject4).<init>();
        localObject2 = this.mContext.getTheme();
        int m = R.attr.actionBarTheme;
        ((Resources.Theme)localObject2).resolveAttribute(m, (TypedValue)localObject4, i);
        m = ((TypedValue)localObject4).resourceId;
        if (m == 0) {
          continue;
        }
        Object localObject5 = this.mContext.getResources().newTheme();
        ((Resources.Theme)localObject5).setTo((Resources.Theme)localObject2);
        int k = ((TypedValue)localObject4).resourceId;
        ((Resources.Theme)localObject5).applyStyle(k, i);
        localObject2 = new android/support/v7/view/ContextThemeWrapper;
        Object localObject6 = this.mContext;
        ((ContextThemeWrapper)localObject2).<init>((Context)localObject6, 0);
        localObject6 = ((Context)localObject2).getTheme();
        ((Resources.Theme)localObject6).setTo((Resources.Theme)localObject5);
        localObject5 = new android/support/v7/widget/ActionBarContextView;
        ((ActionBarContextView)localObject5).<init>((Context)localObject2);
        this.mActionModeView = ((ActionBarContextView)localObject5);
        localObject5 = new android/widget/PopupWindow;
        int n = R.attr.actionModePopupWindowStyle;
        ((PopupWindow)localObject5).<init>((Context)localObject2, null, n);
        this.mActionModePopup = ((PopupWindow)localObject5);
        k.a(this.mActionModePopup, 2);
        localObject5 = this.mActionModePopup;
        localObject6 = this.mActionModeView;
        ((PopupWindow)localObject5).setContentView((View)localObject6);
        this.mActionModePopup.setWidth(-1);
        localObject5 = ((Context)localObject2).getTheme();
        n = R.attr.actionBarSize;
        ((Resources.Theme)localObject5).resolveAttribute(n, (TypedValue)localObject4, i);
        int i1 = ((TypedValue)localObject4).data;
        localObject2 = ((Context)localObject2).getResources().getDisplayMetrics();
        k = TypedValue.complexToDimensionPixelSize(i1, (DisplayMetrics)localObject2);
        localObject4 = this.mActionModeView;
        ((ActionBarContextView)localObject4).setContentHeight(k);
        localObject2 = this.mActionModePopup;
        i1 = -2;
        ((PopupWindow)localObject2).setHeight(i1);
        localObject2 = new android/support/v7/app/AppCompatDelegateImplV9$5;
        ((AppCompatDelegateImplV9.5)localObject2).<init>(this);
        this.mShowActionModePopup = ((Runnable)localObject2);
        localObject2 = this.mActionModeView;
        if (localObject2 == null) {
          continue;
        }
        endOnGoingFadeAnimation();
        this.mActionModeView.killMode();
        localObject4 = new android/support/v7/view/StandaloneActionMode;
        localObject5 = this.mActionModeView.getContext();
        localObject6 = this.mActionModeView;
        localObject2 = this.mActionModePopup;
        if (localObject2 != null) {
          continue;
        }
        k = i;
        ((StandaloneActionMode)localObject4).<init>((Context)localObject5, (ActionBarContextView)localObject6, (ActionMode.Callback)paramCallback, k);
        localObject2 = ((ActionMode)localObject4).getMenu();
        bool2 = ((ActionMode.Callback)paramCallback).onCreateActionMode((ActionMode)localObject4, (Menu)localObject2);
        if (!bool2) {
          continue;
        }
        ((ActionMode)localObject4).invalidate();
        localObject2 = this.mActionModeView;
        ((ActionBarContextView)localObject2).initForMode((ActionMode)localObject4);
        this.mActionMode = ((ActionMode)localObject4);
        bool2 = shouldAnimateActionModeView();
        if (!bool2) {
          continue;
        }
        localObject2 = this.mActionModeView;
        i = 0;
        ((ActionBarContextView)localObject2).setAlpha(0.0F);
        localObject2 = r.k(this.mActionModeView).a(f);
        this.mFadeAnim = ((v)localObject2);
        localObject2 = this.mFadeAnim;
        Object localObject3 = new android/support/v7/app/AppCompatDelegateImplV9$6;
        ((AppCompatDelegateImplV9.6)localObject3).<init>(this);
        ((v)localObject2).a((w)localObject3);
        localObject2 = this.mActionModePopup;
        if (localObject2 == null) {
          continue;
        }
        localObject2 = this.mWindow.getDecorView();
        localObject3 = this.mShowActionModePopup;
        ((View)localObject2).post((Runnable)localObject3);
        continue;
        localObject2 = this.mContext;
        continue;
        localObject2 = this.mSubDecor;
        i1 = R.id.action_mode_bar_stub;
        localObject2 = (ViewStubCompat)((ViewGroup)localObject2).findViewById(i1);
        if (localObject2 == null) {
          continue;
        }
        localObject4 = LayoutInflater.from(getActionBarThemedContext());
        ((ViewStubCompat)localObject2).setLayoutInflater((LayoutInflater)localObject4);
        localObject2 = (ActionBarContextView)((ViewStubCompat)localObject2).inflate();
        this.mActionModeView = ((ActionBarContextView)localObject2);
        continue;
        bool2 = false;
        localObject2 = null;
        continue;
        this.mActionModeView.setAlpha(f);
        this.mActionModeView.setVisibility(0);
        localObject2 = this.mActionModeView;
        int j = 32;
        ((ActionBarContextView)localObject2).sendAccessibilityEvent(j);
        localObject2 = this.mActionModeView.getParent();
        bool2 = localObject2 instanceof View;
        if (!bool2) {
          continue;
        }
        localObject2 = (View)this.mActionModeView.getParent();
        r.o((View)localObject2);
        continue;
        this.mActionMode = null;
        continue;
      }
      if (localObject1 != null)
      {
        this.mActionMode = ((ActionMode)localObject1);
        localObject1 = this.mActionMode;
        if (localObject1 != null)
        {
          localObject1 = this.mAppCompatCallback;
          if (localObject1 != null)
          {
            localObject1 = this.mAppCompatCallback;
            localObject3 = this.mActionMode;
            ((AppCompatCallback)localObject1).onSupportActionModeStarted((ActionMode)localObject3);
          }
        }
        return this.mActionMode;
      }
      boolean bool2 = false;
      Object localObject2 = null;
    }
  }
  
  int updateStatusGuard(int paramInt)
  {
    int i = -1;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = 0;
    Object localObject1 = this.mActionModeView;
    boolean bool1;
    Object localObject2;
    Object localObject3;
    int m;
    float f2;
    label299:
    label310:
    label349:
    ActionBarContextView localActionBarContextView;
    if (localObject1 != null)
    {
      localObject1 = this.mActionModeView.getLayoutParams();
      bool1 = localObject1 instanceof ViewGroup.MarginLayoutParams;
      if (bool1)
      {
        localObject1 = (ViewGroup.MarginLayoutParams)this.mActionModeView.getLayoutParams();
        localObject2 = this.mActionModeView;
        boolean bool2 = ((ActionBarContextView)localObject2).isShown();
        if (bool2)
        {
          localObject2 = this.mTempRect1;
          if (localObject2 == null)
          {
            localObject2 = new android/graphics/Rect;
            ((Rect)localObject2).<init>();
            this.mTempRect1 = ((Rect)localObject2);
            localObject2 = new android/graphics/Rect;
            ((Rect)localObject2).<init>();
            this.mTempRect2 = ((Rect)localObject2);
          }
          localObject2 = this.mTempRect1;
          localObject3 = this.mTempRect2;
          ((Rect)localObject2).set(0, paramInt, 0, 0);
          Object localObject4 = this.mSubDecor;
          ViewUtils.computeFitSystemWindows((View)localObject4, (Rect)localObject2, (Rect)localObject3);
          m = ((Rect)localObject3).top;
          if (m == 0)
          {
            m = paramInt;
            int n = ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
            if (n == m) {
              break label532;
            }
            ((ViewGroup.MarginLayoutParams)localObject1).topMargin = paramInt;
            localObject2 = this.mStatusGuard;
            if (localObject2 != null) {
              break label413;
            }
            localObject2 = new android/view/View;
            localObject3 = this.mContext;
            ((View)localObject2).<init>((Context)localObject3);
            this.mStatusGuard = ((View)localObject2);
            localObject2 = this.mStatusGuard;
            localObject3 = this.mContext.getResources();
            int i2 = R.color.abc_input_method_navigation_guard;
            n = ((Resources)localObject3).getColor(i2);
            ((View)localObject2).setBackgroundColor(n);
            localObject2 = this.mSubDecor;
            localObject3 = this.mStatusGuard;
            localObject4 = new android/view/ViewGroup$LayoutParams;
            ((ViewGroup.LayoutParams)localObject4).<init>(i, paramInt);
            ((ViewGroup)localObject2).addView((View)localObject3, i, (ViewGroup.LayoutParams)localObject4);
            m = j;
            f2 = f1;
            localObject3 = this.mStatusGuard;
            if (localObject3 == null) {
              break label464;
            }
            boolean bool3 = this.mOverlayActionMode;
            if ((!bool3) && (j != 0)) {
              paramInt = 0;
            }
            int i3 = m;
            float f3 = f2;
            m = j;
            f2 = f1;
            j = i3;
            f1 = f3;
            if (j != 0)
            {
              localActionBarContextView = this.mActionModeView;
              localActionBarContextView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
            }
            bool1 = m;
          }
        }
      }
    }
    for (;;)
    {
      localObject2 = this.mStatusGuard;
      if (localObject2 != null)
      {
        localObject2 = this.mStatusGuard;
        if (!bool1) {
          break label505;
        }
      }
      for (;;)
      {
        ((View)localObject2).setVisibility(k);
        return paramInt;
        m = 0;
        localObject2 = null;
        f2 = 0.0F;
        break;
        label413:
        localObject2 = this.mStatusGuard.getLayoutParams();
        int i1 = ((ViewGroup.LayoutParams)localObject2).height;
        if (i1 != paramInt)
        {
          ((ViewGroup.LayoutParams)localObject2).height = paramInt;
          localObject3 = this.mStatusGuard;
          ((View)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        m = j;
        f2 = f1;
        break label299;
        label464:
        j = 0;
        localActionBarContextView = null;
        f1 = 0.0F;
        break label310;
        m = ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
        if (m == 0) {
          break label512;
        }
        ((ViewGroup.MarginLayoutParams)localObject1).topMargin = 0;
        m = 0;
        localObject2 = null;
        f2 = 0.0F;
        break label349;
        label505:
        k = 8;
      }
      label512:
      j = 0;
      localActionBarContextView = null;
      f1 = 0.0F;
      m = 0;
      localObject2 = null;
      f2 = 0.0F;
      break label349;
      label532:
      m = 0;
      localObject2 = null;
      f2 = 0.0F;
      break label299;
      bool1 = false;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */