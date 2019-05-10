package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.b;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.string;
import android.support.v7.content.res.AppCompatResources;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public class ShareActionProvider
  extends b
{
  private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
  public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
  final Context mContext;
  private int mMaxShownActivityCount = 4;
  private ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
  private final ShareActionProvider.ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener;
  ShareActionProvider.OnShareTargetSelectedListener mOnShareTargetSelectedListener;
  String mShareHistoryFileName;
  
  public ShareActionProvider(Context paramContext)
  {
    super(paramContext);
    ShareActionProvider.ShareMenuItemOnMenuItemClickListener localShareMenuItemOnMenuItemClickListener = new android/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
    localShareMenuItemOnMenuItemClickListener.<init>(this);
    this.mOnMenuItemClickListener = localShareMenuItemOnMenuItemClickListener;
    this.mShareHistoryFileName = "share_history.xml";
    this.mContext = paramContext;
  }
  
  private void setActivityChooserPolicyIfNeeded()
  {
    Object localObject1 = this.mOnShareTargetSelectedListener;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = this.mOnChooseActivityListener;
      if (localObject1 == null)
      {
        localObject1 = new android/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;
        ((ShareActionProvider.ShareActivityChooserModelPolicy)localObject1).<init>(this);
        this.mOnChooseActivityListener = ((ActivityChooserModel.OnChooseActivityListener)localObject1);
      }
      localObject1 = this.mContext;
      Object localObject2 = this.mShareHistoryFileName;
      localObject1 = ActivityChooserModel.get((Context)localObject1, (String)localObject2);
      localObject2 = this.mOnChooseActivityListener;
      ((ActivityChooserModel)localObject1).setOnChooseActivityListener((ActivityChooserModel.OnChooseActivityListener)localObject2);
    }
  }
  
  public boolean hasSubMenu()
  {
    return true;
  }
  
  public View onCreateActionView()
  {
    ActivityChooserView localActivityChooserView = new android/support/v7/widget/ActivityChooserView;
    Object localObject1 = this.mContext;
    localActivityChooserView.<init>((Context)localObject1);
    boolean bool = localActivityChooserView.isInEditMode();
    if (!bool)
    {
      localObject1 = this.mContext;
      localObject2 = this.mShareHistoryFileName;
      localObject1 = ActivityChooserModel.get((Context)localObject1, (String)localObject2);
      localActivityChooserView.setActivityChooserModel((ActivityChooserModel)localObject1);
    }
    localObject1 = new android/util/TypedValue;
    ((TypedValue)localObject1).<init>();
    Object localObject2 = this.mContext.getTheme();
    int j = R.attr.actionModeShareDrawable;
    ((Resources.Theme)localObject2).resolveAttribute(j, (TypedValue)localObject1, true);
    localObject2 = this.mContext;
    int i = ((TypedValue)localObject1).resourceId;
    localObject1 = AppCompatResources.getDrawable((Context)localObject2, i);
    localActivityChooserView.setExpandActivityOverflowButtonDrawable((Drawable)localObject1);
    localActivityChooserView.setProvider(this);
    i = R.string.abc_shareactionprovider_share_with_application;
    localActivityChooserView.setDefaultActionButtonContentDescription(i);
    i = R.string.abc_shareactionprovider_share_with;
    localActivityChooserView.setExpandActivityOverflowButtonContentDescription(i);
    return localActivityChooserView;
  }
  
  public void onPrepareSubMenu(SubMenu paramSubMenu)
  {
    paramSubMenu.clear();
    Object localObject1 = this.mContext;
    Object localObject2 = this.mShareHistoryFileName;
    localObject2 = ActivityChooserModel.get((Context)localObject1, (String)localObject2);
    PackageManager localPackageManager = this.mContext.getPackageManager();
    int i = ((ActivityChooserModel)localObject2).getActivityCount();
    int j = this.mMaxShownActivityCount;
    int k = Math.min(i, j);
    j = 0;
    localObject1 = null;
    Object localObject3;
    Object localObject4;
    while (j < k)
    {
      localObject3 = ((ActivityChooserModel)localObject2).getActivity(j);
      localObject4 = ((ResolveInfo)localObject3).loadLabel(localPackageManager);
      localObject4 = paramSubMenu.add(0, j, j, (CharSequence)localObject4);
      localObject3 = ((ResolveInfo)localObject3).loadIcon(localPackageManager);
      localObject3 = ((MenuItem)localObject4).setIcon((Drawable)localObject3);
      localObject4 = this.mOnMenuItemClickListener;
      ((MenuItem)localObject3).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)localObject4);
      j += 1;
    }
    if (k < i)
    {
      localObject1 = this.mContext;
      int m = R.string.abc_activity_chooser_view_see_all;
      localObject1 = ((Context)localObject1).getString(m);
      SubMenu localSubMenu = paramSubMenu.addSubMenu(0, k, k, (CharSequence)localObject1);
      j = 0;
      localObject1 = null;
      while (j < i)
      {
        localObject3 = ((ActivityChooserModel)localObject2).getActivity(j);
        localObject4 = ((ResolveInfo)localObject3).loadLabel(localPackageManager);
        localObject4 = localSubMenu.add(0, j, j, (CharSequence)localObject4);
        localObject3 = ((ResolveInfo)localObject3).loadIcon(localPackageManager);
        localObject3 = ((MenuItem)localObject4).setIcon((Drawable)localObject3);
        localObject4 = this.mOnMenuItemClickListener;
        ((MenuItem)localObject3).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)localObject4);
        j += 1;
      }
    }
  }
  
  public void setOnShareTargetSelectedListener(ShareActionProvider.OnShareTargetSelectedListener paramOnShareTargetSelectedListener)
  {
    this.mOnShareTargetSelectedListener = paramOnShareTargetSelectedListener;
    setActivityChooserPolicyIfNeeded();
  }
  
  public void setShareHistoryFileName(String paramString)
  {
    this.mShareHistoryFileName = paramString;
    setActivityChooserPolicyIfNeeded();
  }
  
  public void setShareIntent(Intent paramIntent)
  {
    if (paramIntent != null)
    {
      localObject = paramIntent.getAction();
      str = "android.intent.action.SEND";
      boolean bool1 = str.equals(localObject);
      if (!bool1)
      {
        str = "android.intent.action.SEND_MULTIPLE";
        boolean bool2 = str.equals(localObject);
        if (!bool2) {}
      }
      else
      {
        updateIntent(paramIntent);
      }
    }
    Object localObject = this.mContext;
    String str = this.mShareHistoryFileName;
    ActivityChooserModel.get((Context)localObject, str).setIntent(paramIntent);
  }
  
  void updateIntent(Intent paramIntent)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j)
    {
      i = 134742016;
      paramIntent.addFlags(i);
    }
    for (;;)
    {
      return;
      i = 524288;
      paramIntent.addFlags(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ShareActionProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */