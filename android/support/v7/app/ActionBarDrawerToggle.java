package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.c;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class ActionBarDrawerToggle
  implements DrawerLayout.c
{
  private final ActionBarDrawerToggle.Delegate mActivityImpl;
  private final int mCloseDrawerContentDescRes;
  boolean mDrawerIndicatorEnabled;
  private final DrawerLayout mDrawerLayout;
  private boolean mDrawerSlideAnimationEnabled;
  private boolean mHasCustomUpIndicator;
  private Drawable mHomeAsUpIndicator;
  private final int mOpenDrawerContentDescRes;
  private DrawerArrowDrawable mSlider;
  View.OnClickListener mToolbarNavigationClickListener;
  private boolean mWarnedForDisplayHomeAsUp;
  
  public ActionBarDrawerToggle(Activity paramActivity, DrawerLayout paramDrawerLayout, int paramInt1, int paramInt2)
  {
    this(paramActivity, null, paramDrawerLayout, null, paramInt1, paramInt2);
  }
  
  public ActionBarDrawerToggle(Activity paramActivity, DrawerLayout paramDrawerLayout, Toolbar paramToolbar, int paramInt1, int paramInt2)
  {
    this(paramActivity, paramToolbar, paramDrawerLayout, null, paramInt1, paramInt2);
  }
  
  ActionBarDrawerToggle(Activity paramActivity, Toolbar paramToolbar, DrawerLayout paramDrawerLayout, DrawerArrowDrawable paramDrawerArrowDrawable, int paramInt1, int paramInt2)
  {
    this.mDrawerSlideAnimationEnabled = bool;
    this.mDrawerIndicatorEnabled = bool;
    bool = false;
    Object localObject = null;
    this.mWarnedForDisplayHomeAsUp = false;
    if (paramToolbar != null)
    {
      localObject = new android/support/v7/app/ActionBarDrawerToggle$ToolbarCompatDelegate;
      ((ActionBarDrawerToggle.ToolbarCompatDelegate)localObject).<init>(paramToolbar);
      this.mActivityImpl = ((ActionBarDrawerToggle.Delegate)localObject);
      localObject = new android/support/v7/app/ActionBarDrawerToggle$1;
      ((ActionBarDrawerToggle.1)localObject).<init>(this);
      paramToolbar.setNavigationOnClickListener((View.OnClickListener)localObject);
      this.mDrawerLayout = paramDrawerLayout;
      this.mOpenDrawerContentDescRes = paramInt1;
      this.mCloseDrawerContentDescRes = paramInt2;
      if (paramDrawerArrowDrawable != null) {
        break label221;
      }
      localObject = new android/support/v7/graphics/drawable/DrawerArrowDrawable;
      Context localContext = this.mActivityImpl.getActionBarThemedContext();
      ((DrawerArrowDrawable)localObject).<init>(localContext);
    }
    label221:
    for (this.mSlider = ((DrawerArrowDrawable)localObject);; this.mSlider = paramDrawerArrowDrawable)
    {
      localObject = getThemeUpIndicator();
      this.mHomeAsUpIndicator = ((Drawable)localObject);
      return;
      bool = paramActivity instanceof ActionBarDrawerToggle.DelegateProvider;
      if (bool)
      {
        paramActivity = (ActionBarDrawerToggle.DelegateProvider)paramActivity;
        localObject = paramActivity.getDrawerToggleDelegate();
        this.mActivityImpl = ((ActionBarDrawerToggle.Delegate)localObject);
        break;
      }
      int i = Build.VERSION.SDK_INT;
      int j = 18;
      if (i >= j)
      {
        localObject = new android/support/v7/app/ActionBarDrawerToggle$JellybeanMr2Delegate;
        ((ActionBarDrawerToggle.JellybeanMr2Delegate)localObject).<init>(paramActivity);
        this.mActivityImpl = ((ActionBarDrawerToggle.Delegate)localObject);
        break;
      }
      localObject = new android/support/v7/app/ActionBarDrawerToggle$IcsDelegate;
      ((ActionBarDrawerToggle.IcsDelegate)localObject).<init>(paramActivity);
      this.mActivityImpl = ((ActionBarDrawerToggle.Delegate)localObject);
      break;
    }
  }
  
  private void setPosition(float paramFloat)
  {
    float f = 1.0F;
    boolean bool1 = paramFloat < f;
    DrawerArrowDrawable localDrawerArrowDrawable;
    boolean bool2;
    if (!bool1)
    {
      localDrawerArrowDrawable = this.mSlider;
      bool2 = true;
      localDrawerArrowDrawable.setVerticalMirror(bool2);
    }
    for (;;)
    {
      this.mSlider.setProgress(paramFloat);
      return;
      f = 0.0F;
      localDrawerArrowDrawable = null;
      bool1 = paramFloat < 0.0F;
      if (!bool1)
      {
        localDrawerArrowDrawable = this.mSlider;
        bool2 = false;
        localDrawerArrowDrawable.setVerticalMirror(false);
      }
    }
  }
  
  public DrawerArrowDrawable getDrawerArrowDrawable()
  {
    return this.mSlider;
  }
  
  Drawable getThemeUpIndicator()
  {
    return this.mActivityImpl.getThemeUpIndicator();
  }
  
  public View.OnClickListener getToolbarNavigationClickListener()
  {
    return this.mToolbarNavigationClickListener;
  }
  
  public boolean isDrawerIndicatorEnabled()
  {
    return this.mDrawerIndicatorEnabled;
  }
  
  public boolean isDrawerSlideAnimationEnabled()
  {
    return this.mDrawerSlideAnimationEnabled;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    boolean bool = this.mHasCustomUpIndicator;
    if (!bool)
    {
      Drawable localDrawable = getThemeUpIndicator();
      this.mHomeAsUpIndicator = localDrawable;
    }
    syncState();
  }
  
  public void onDrawerClosed(View paramView)
  {
    setPosition(0.0F);
    boolean bool = this.mDrawerIndicatorEnabled;
    if (bool)
    {
      int i = this.mOpenDrawerContentDescRes;
      setActionBarDescription(i);
    }
  }
  
  public void onDrawerOpened(View paramView)
  {
    float f = 1.0F;
    setPosition(f);
    boolean bool = this.mDrawerIndicatorEnabled;
    if (bool)
    {
      int i = this.mCloseDrawerContentDescRes;
      setActionBarDescription(i);
    }
  }
  
  public void onDrawerSlide(View paramView, float paramFloat)
  {
    float f1 = 0.0F;
    boolean bool = this.mDrawerSlideAnimationEnabled;
    if (bool)
    {
      int i = 1065353216;
      f1 = Math.max(0.0F, paramFloat);
      float f2 = Math.min(1.0F, f1);
      setPosition(f2);
    }
    for (;;)
    {
      return;
      setPosition(0.0F);
    }
  }
  
  public void onDrawerStateChanged(int paramInt) {}
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem != null)
    {
      int i = paramMenuItem.getItemId();
      int j = 16908332;
      if (i == j)
      {
        bool = this.mDrawerIndicatorEnabled;
        if (bool) {
          toggle();
        }
      }
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  void setActionBarDescription(int paramInt)
  {
    this.mActivityImpl.setActionBarDescription(paramInt);
  }
  
  void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    boolean bool = this.mWarnedForDisplayHomeAsUp;
    if (!bool)
    {
      Object localObject = this.mActivityImpl;
      bool = ((ActionBarDrawerToggle.Delegate)localObject).isNavigationVisible();
      if (!bool)
      {
        localObject = "ActionBarDrawerToggle";
        String str = "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);";
        Log.w((String)localObject, str);
        bool = true;
        this.mWarnedForDisplayHomeAsUp = bool;
      }
    }
    this.mActivityImpl.setActionBarUpIndicator(paramDrawable, paramInt);
  }
  
  public void setDrawerArrowDrawable(DrawerArrowDrawable paramDrawerArrowDrawable)
  {
    this.mSlider = paramDrawerArrowDrawable;
    syncState();
  }
  
  public void setDrawerIndicatorEnabled(boolean paramBoolean)
  {
    boolean bool = this.mDrawerIndicatorEnabled;
    DrawerArrowDrawable localDrawerArrowDrawable;
    Object localObject;
    int i;
    if (paramBoolean != bool)
    {
      if (!paramBoolean) {
        break label66;
      }
      localDrawerArrowDrawable = this.mSlider;
      localObject = this.mDrawerLayout;
      int j = 8388611;
      bool = ((DrawerLayout)localObject).g(j);
      if (!bool) {
        break label58;
      }
      i = this.mCloseDrawerContentDescRes;
      setActionBarUpIndicator(localDrawerArrowDrawable, i);
    }
    for (;;)
    {
      this.mDrawerIndicatorEnabled = paramBoolean;
      return;
      label58:
      i = this.mOpenDrawerContentDescRes;
      break;
      label66:
      localObject = this.mHomeAsUpIndicator;
      localDrawerArrowDrawable = null;
      setActionBarUpIndicator((Drawable)localObject, 0);
    }
  }
  
  public void setDrawerSlideAnimationEnabled(boolean paramBoolean)
  {
    this.mDrawerSlideAnimationEnabled = paramBoolean;
    if (!paramBoolean) {
      setPosition(0.0F);
    }
  }
  
  public void setHomeAsUpIndicator(int paramInt)
  {
    Drawable localDrawable = null;
    if (paramInt != 0) {
      localDrawable = this.mDrawerLayout.getResources().getDrawable(paramInt);
    }
    setHomeAsUpIndicator(localDrawable);
  }
  
  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    Drawable localDrawable;
    if (paramDrawable == null)
    {
      localDrawable = getThemeUpIndicator();
      this.mHomeAsUpIndicator = localDrawable;
    }
    boolean bool;
    for (this.mHasCustomUpIndicator = false;; this.mHasCustomUpIndicator = bool)
    {
      bool = this.mDrawerIndicatorEnabled;
      if (!bool)
      {
        localDrawable = this.mHomeAsUpIndicator;
        setActionBarUpIndicator(localDrawable, 0);
      }
      return;
      this.mHomeAsUpIndicator = paramDrawable;
      bool = true;
    }
  }
  
  public void setToolbarNavigationClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mToolbarNavigationClickListener = paramOnClickListener;
  }
  
  public void syncState()
  {
    int i = 8388611;
    DrawerLayout localDrawerLayout = this.mDrawerLayout;
    boolean bool1 = localDrawerLayout.g(i);
    float f;
    DrawerArrowDrawable localDrawerArrowDrawable;
    if (bool1)
    {
      int j = 1065353216;
      f = 1.0F;
      setPosition(f);
      boolean bool2 = this.mDrawerIndicatorEnabled;
      if (bool2)
      {
        localDrawerArrowDrawable = this.mSlider;
        localDrawerLayout = this.mDrawerLayout;
        bool2 = localDrawerLayout.g(i);
        if (!bool2) {
          break label89;
        }
      }
    }
    label89:
    for (int k = this.mCloseDrawerContentDescRes;; k = this.mOpenDrawerContentDescRes)
    {
      setActionBarUpIndicator(localDrawerArrowDrawable, k);
      return;
      k = 0;
      f = 0.0F;
      localDrawerLayout = null;
      setPosition(0.0F);
      break;
    }
  }
  
  void toggle()
  {
    int i = 8388611;
    DrawerLayout localDrawerLayout1 = this.mDrawerLayout;
    int j = localDrawerLayout1.a(i);
    DrawerLayout localDrawerLayout2 = this.mDrawerLayout;
    boolean bool = localDrawerLayout2.h(i);
    int k;
    if (bool)
    {
      k = 2;
      if (j != k)
      {
        localDrawerLayout1 = this.mDrawerLayout;
        localDrawerLayout1.f(i);
      }
    }
    for (;;)
    {
      return;
      k = 1;
      if (j != k)
      {
        localDrawerLayout1 = this.mDrawerLayout;
        localDrawerLayout1.e(i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ActionBarDrawerToggle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */