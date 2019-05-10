package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb
{
  private static final String TAG = "ActionBarDrawerToggleHC";
  private static final int[] THEME_ATTRS;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843531;
    THEME_ATTRS = arrayOfInt;
  }
  
  public static Drawable getThemeUpIndicator(Activity paramActivity)
  {
    Object localObject = THEME_ATTRS;
    localObject = paramActivity.obtainStyledAttributes((int[])localObject);
    Drawable localDrawable = ((TypedArray)localObject).getDrawable(0);
    ((TypedArray)localObject).recycle();
    return localDrawable;
  }
  
  public static ActionBarDrawerToggleHoneycomb.SetIndicatorInfo setActionBarDescription(ActionBarDrawerToggleHoneycomb.SetIndicatorInfo paramSetIndicatorInfo, Activity paramActivity, int paramInt)
  {
    if (paramSetIndicatorInfo == null)
    {
      paramSetIndicatorInfo = new android/support/v7/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
      paramSetIndicatorInfo.<init>(paramActivity);
    }
    Object localObject1 = paramSetIndicatorInfo.setHomeAsUpIndicator;
    if (localObject1 != null) {}
    try
    {
      localObject1 = paramActivity.getActionBar();
      localObject2 = paramSetIndicatorInfo.setHomeActionContentDescription;
      int i = 1;
      localObject3 = new Object[i];
      Integer localInteger = Integer.valueOf(paramInt);
      localObject3[0] = localInteger;
      ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
      int j = Build.VERSION.SDK_INT;
      i = 19;
      if (j <= i)
      {
        localObject2 = ((ActionBar)localObject1).getSubtitle();
        ((ActionBar)localObject1).setSubtitle((CharSequence)localObject2);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = "ActionBarDrawerToggleHC";
        Object localObject3 = "Couldn't set content description via JB-MR2 API";
        Log.w((String)localObject2, (String)localObject3, localException);
      }
    }
    return paramSetIndicatorInfo;
  }
  
  public static ActionBarDrawerToggleHoneycomb.SetIndicatorInfo setActionBarUpIndicator(ActionBarDrawerToggleHoneycomb.SetIndicatorInfo paramSetIndicatorInfo, Activity paramActivity, Drawable paramDrawable, int paramInt)
  {
    ActionBarDrawerToggleHoneycomb.SetIndicatorInfo localSetIndicatorInfo = new android/support/v7/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
    localSetIndicatorInfo.<init>(paramActivity);
    Object localObject1 = localSetIndicatorInfo.setHomeAsUpIndicator;
    if (localObject1 != null) {}
    for (;;)
    {
      Object localObject3;
      try
      {
        localObject1 = paramActivity.getActionBar();
        localObject3 = localSetIndicatorInfo.setHomeAsUpIndicator;
        int i = 1;
        localObject4 = new Object[i];
        localObject4[0] = paramDrawable;
        ((Method)localObject3).invoke(localObject1, (Object[])localObject4);
        localObject3 = localSetIndicatorInfo.setHomeActionContentDescription;
        i = 1;
        localObject4 = new Object[i];
        Integer localInteger = Integer.valueOf(paramInt);
        localObject4[0] = localInteger;
        ((Method)localObject3).invoke(localObject1, (Object[])localObject4);
      }
      catch (Exception localException)
      {
        localObject3 = "ActionBarDrawerToggleHC";
        Object localObject4 = "Couldn't set home-as-up indicator via JB-MR2 API";
        Log.w((String)localObject3, (String)localObject4, localException);
        continue;
      }
      return localSetIndicatorInfo;
      Object localObject2 = localSetIndicatorInfo.upIndicatorView;
      if (localObject2 != null)
      {
        localObject2 = localSetIndicatorInfo.upIndicatorView;
        ((ImageView)localObject2).setImageDrawable(paramDrawable);
      }
      else
      {
        localObject2 = "ActionBarDrawerToggleHC";
        localObject3 = "Couldn't set home-as-up indicator";
        Log.w((String)localObject2, (String)localObject3);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ActionBarDrawerToggleHoneycomb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */