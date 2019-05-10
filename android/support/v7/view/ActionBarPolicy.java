package android.support.v7.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.bool;
import android.support.v7.appcompat.R.dimen;
import android.support.v7.appcompat.R.styleable;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

public class ActionBarPolicy
{
  private Context mContext;
  
  private ActionBarPolicy(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public static ActionBarPolicy get(Context paramContext)
  {
    ActionBarPolicy localActionBarPolicy = new android/support/v7/view/ActionBarPolicy;
    localActionBarPolicy.<init>(paramContext);
    return localActionBarPolicy;
  }
  
  public boolean enableHomeButtonByDefault()
  {
    ApplicationInfo localApplicationInfo = this.mContext.getApplicationInfo();
    int i = localApplicationInfo.targetSdkVersion;
    int k = 14;
    if (i < k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localApplicationInfo = null;
    }
  }
  
  public int getEmbeddedMenuWidthLimit()
  {
    return this.mContext.getResources().getDisplayMetrics().widthPixels / 2;
  }
  
  public int getMaxActionButtons()
  {
    int i = 960;
    int j = 720;
    int k = 640;
    int m = 600;
    int n = 480;
    Configuration localConfiguration = this.mContext.getResources().getConfiguration();
    int i1 = localConfiguration.screenWidthDp;
    int i2 = localConfiguration.screenHeightDp;
    int i3 = localConfiguration.smallestScreenWidthDp;
    if ((i3 > m) || (i1 > m) || ((i1 > i) && (i2 > j)) || ((i1 > j) && (i2 > i))) {
      i3 = 5;
    }
    for (;;)
    {
      return i3;
      i3 = 500;
      if ((i1 >= i3) || ((i1 > k) && (i2 > n)) || ((i1 > n) && (i2 > k)))
      {
        i3 = 4;
      }
      else
      {
        i3 = 360;
        if (i1 >= i3) {
          i3 = 3;
        } else {
          i3 = 2;
        }
      }
    }
  }
  
  public int getStackedTabMaxWidth()
  {
    Resources localResources = this.mContext.getResources();
    int i = R.dimen.abc_action_bar_stacked_tab_max_width;
    return localResources.getDimensionPixelSize(i);
  }
  
  public int getTabContainerHeight()
  {
    Context localContext = this.mContext;
    Object localObject = R.styleable.ActionBar;
    int i = R.attr.actionBarStyle;
    TypedArray localTypedArray = localContext.obtainStyledAttributes(null, (int[])localObject, i, 0);
    int k = R.styleable.ActionBar_height;
    k = localTypedArray.getLayoutDimension(k, 0);
    localObject = this.mContext.getResources();
    boolean bool = hasEmbeddedTabs();
    if (!bool)
    {
      int j = R.dimen.abc_action_bar_stacked_max_height;
      int m = ((Resources)localObject).getDimensionPixelSize(j);
      k = Math.min(k, m);
    }
    localTypedArray.recycle();
    return k;
  }
  
  public boolean hasEmbeddedTabs()
  {
    Resources localResources = this.mContext.getResources();
    int i = R.bool.abc_action_bar_embed_tabs;
    return localResources.getBoolean(i);
  }
  
  public boolean showsOverflowMenuButton()
  {
    boolean bool1 = true;
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j) {}
    for (;;)
    {
      return bool1;
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(this.mContext);
      boolean bool2 = localViewConfiguration.hasPermanentMenuKey();
      if (bool2) {
        bool1 = false;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\ActionBarPolicy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */