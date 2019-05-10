package android.support.v7.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.string;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class ActivityChooserView$ActivityChooserViewAdapter
  extends BaseAdapter
{
  private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
  private static final int ITEM_VIEW_TYPE_COUNT = 3;
  private static final int ITEM_VIEW_TYPE_FOOTER = 1;
  public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
  public static final int MAX_ACTIVITY_COUNT_UNLIMITED = Integer.MAX_VALUE;
  private ActivityChooserModel mDataModel;
  private boolean mHighlightDefaultActivity;
  private int mMaxActivityCount = 4;
  private boolean mShowDefaultActivity;
  private boolean mShowFooterView;
  
  ActivityChooserView$ActivityChooserViewAdapter(ActivityChooserView paramActivityChooserView) {}
  
  public int getActivityCount()
  {
    return this.mDataModel.getActivityCount();
  }
  
  public int getCount()
  {
    ActivityChooserModel localActivityChooserModel = this.mDataModel;
    int i = localActivityChooserModel.getActivityCount();
    boolean bool1 = this.mShowDefaultActivity;
    if (!bool1)
    {
      ResolveInfo localResolveInfo = this.mDataModel.getDefaultActivity();
      if (localResolveInfo != null) {
        i += -1;
      }
    }
    int j = this.mMaxActivityCount;
    i = Math.min(i, j);
    boolean bool2 = this.mShowFooterView;
    if (bool2) {
      i += 1;
    }
    return i;
  }
  
  public ActivityChooserModel getDataModel()
  {
    return this.mDataModel;
  }
  
  public ResolveInfo getDefaultActivity()
  {
    return this.mDataModel.getDefaultActivity();
  }
  
  public int getHistorySize()
  {
    return this.mDataModel.getHistorySize();
  }
  
  public Object getItem(int paramInt)
  {
    int i = getItemViewType(paramInt);
    switch (i)
    {
    default: 
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>();
      throw ((Throwable)localObject);
    case 1: 
      i = 0;
    }
    for (Object localObject = null;; localObject = this.mDataModel.getActivity(paramInt))
    {
      return localObject;
      boolean bool = this.mShowDefaultActivity;
      if (!bool)
      {
        localObject = this.mDataModel.getDefaultActivity();
        if (localObject != null) {
          paramInt += 1;
        }
      }
    }
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    boolean bool = this.mShowFooterView;
    if (bool)
    {
      i = getCount() + -1;
      if (paramInt != i) {}
    }
    for (int i = 1;; i = 0) {
      return i;
    }
  }
  
  public boolean getShowDefaultActivity()
  {
    return this.mShowDefaultActivity;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 1;
    int j = getItemViewType(paramInt);
    Object localObject1;
    int m;
    int k;
    Object localObject2;
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>();
      throw ((Throwable)localObject1);
    case 1: 
      if (paramView != null)
      {
        j = paramView.getId();
        if (j == i) {
          break;
        }
      }
      else
      {
        localObject1 = LayoutInflater.from(this.this$0.getContext());
        m = R.layout.abc_activity_chooser_view_list_item;
        paramView = ((LayoutInflater)localObject1).inflate(m, paramViewGroup, false);
        paramView.setId(i);
        k = R.id.title;
        localObject1 = (TextView)paramView.findViewById(k);
        localObject2 = this.this$0.getContext();
        int n = R.string.abc_activity_chooser_view_see_all;
        localObject2 = ((Context)localObject2).getString(n);
        ((TextView)localObject1).setText((CharSequence)localObject2);
      }
      break;
    }
    for (;;)
    {
      return paramView;
      if (paramView != null)
      {
        k = paramView.getId();
        m = R.id.list_item;
        if (k == m) {}
      }
      else
      {
        localObject1 = LayoutInflater.from(this.this$0.getContext());
        m = R.layout.abc_activity_chooser_view_list_item;
        paramView = ((LayoutInflater)localObject1).inflate(m, paramViewGroup, false);
      }
      PackageManager localPackageManager = this.this$0.getContext().getPackageManager();
      k = R.id.icon;
      localObject1 = (ImageView)paramView.findViewById(k);
      localObject2 = (ResolveInfo)getItem(paramInt);
      Drawable localDrawable = ((ResolveInfo)localObject2).loadIcon(localPackageManager);
      ((ImageView)localObject1).setImageDrawable(localDrawable);
      k = R.id.title;
      localObject1 = (TextView)paramView.findViewById(k);
      localObject2 = ((ResolveInfo)localObject2).loadLabel(localPackageManager);
      ((TextView)localObject1).setText((CharSequence)localObject2);
      boolean bool = this.mShowDefaultActivity;
      if ((bool) && (paramInt == 0))
      {
        bool = this.mHighlightDefaultActivity;
        if (bool)
        {
          paramView.setActivated(i);
          continue;
        }
      }
      paramView.setActivated(false);
    }
  }
  
  public int getViewTypeCount()
  {
    return 3;
  }
  
  public int measureContentWidth()
  {
    int i = 0;
    int j = this.mMaxActivityCount;
    this.mMaxActivityCount = (-1 >>> 1);
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = getCount();
    View localView = null;
    int i1 = 0;
    while (i < n)
    {
      localView = getView(i, localView, null);
      localView.measure(k, m);
      int i2 = localView.getMeasuredWidth();
      i1 = Math.max(i1, i2);
      i += 1;
    }
    this.mMaxActivityCount = j;
    return i1;
  }
  
  public void setDataModel(ActivityChooserModel paramActivityChooserModel)
  {
    Object localObject1 = this.this$0.mAdapter.getDataModel();
    if (localObject1 != null)
    {
      Object localObject2 = this.this$0;
      boolean bool1 = ((ActivityChooserView)localObject2).isShown();
      if (bool1)
      {
        localObject2 = this.this$0.mModelDataSetObserver;
        ((ActivityChooserModel)localObject1).unregisterObserver(localObject2);
      }
    }
    this.mDataModel = paramActivityChooserModel;
    if (paramActivityChooserModel != null)
    {
      localObject1 = this.this$0;
      boolean bool2 = ((ActivityChooserView)localObject1).isShown();
      if (bool2)
      {
        localObject1 = this.this$0.mModelDataSetObserver;
        paramActivityChooserModel.registerObserver(localObject1);
      }
    }
    notifyDataSetChanged();
  }
  
  public void setMaxActivityCount(int paramInt)
  {
    int i = this.mMaxActivityCount;
    if (i != paramInt)
    {
      this.mMaxActivityCount = paramInt;
      notifyDataSetChanged();
    }
  }
  
  public void setShowDefaultActivity(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = this.mShowDefaultActivity;
    if (bool == paramBoolean1)
    {
      bool = this.mHighlightDefaultActivity;
      if (bool == paramBoolean2) {}
    }
    else
    {
      this.mShowDefaultActivity = paramBoolean1;
      this.mHighlightDefaultActivity = paramBoolean2;
      notifyDataSetChanged();
    }
  }
  
  public void setShowFooterView(boolean paramBoolean)
  {
    boolean bool = this.mShowFooterView;
    if (bool != paramBoolean)
    {
      this.mShowFooterView = paramBoolean;
      notifyDataSetChanged();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserView$ActivityChooserViewAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */