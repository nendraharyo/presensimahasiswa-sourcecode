package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.v4.view.b;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

class ActivityChooserView$Callbacks
  implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  ActivityChooserView$Callbacks(ActivityChooserView paramActivityChooserView) {}
  
  private void notifyOnDismissListener()
  {
    PopupWindow.OnDismissListener localOnDismissListener = this.this$0.mOnDismissListener;
    if (localOnDismissListener != null)
    {
      localOnDismissListener = this.this$0.mOnDismissListener;
      localOnDismissListener.onDismiss();
    }
  }
  
  public void onClick(View paramView)
  {
    Object localObject1 = this.this$0.mDefaultActivityButton;
    Object localObject2;
    int j;
    if (paramView == localObject1)
    {
      this.this$0.dismissPopup();
      localObject1 = this.this$0.mAdapter.getDefaultActivity();
      int i = this.this$0.mAdapter.getDataModel().getActivityIndex((ResolveInfo)localObject1);
      localObject2 = this.this$0.mAdapter.getDataModel();
      localObject1 = ((ActivityChooserModel)localObject2).chooseActivity(i);
      if (localObject1 != null)
      {
        j = 524288;
        ((Intent)localObject1).addFlags(j);
        localObject2 = this.this$0.getContext();
        ((Context)localObject2).startActivity((Intent)localObject1);
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.this$0.mExpandActivityOverflowButton;
      if (paramView != localObject1) {
        break;
      }
      this.this$0.mIsSelectingDefaultActivity = false;
      localObject1 = this.this$0;
      localObject2 = this.this$0;
      j = ((ActivityChooserView)localObject2).mInitialActivityCount;
      ((ActivityChooserView)localObject1).showPopupUnchecked(j);
    }
    localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>();
    throw ((Throwable)localObject1);
  }
  
  public void onDismiss()
  {
    notifyOnDismissListener();
    b localb = this.this$0.mProvider;
    if (localb != null)
    {
      localb = this.this$0.mProvider;
      localb.subUiVisibilityChanged(false);
    }
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject = (ActivityChooserView.ActivityChooserViewAdapter)paramAdapterView.getAdapter();
    int i = ((ActivityChooserView.ActivityChooserViewAdapter)localObject).getItemViewType(paramInt);
    int j;
    switch (i)
    {
    default: 
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>();
      throw ((Throwable)localObject);
    case 1: 
      localObject = this.this$0;
      j = -1 >>> 1;
      ((ActivityChooserView)localObject).showPopupUnchecked(j);
    }
    for (;;)
    {
      return;
      this.this$0.dismissPopup();
      localObject = this.this$0;
      bool = ((ActivityChooserView)localObject).mIsSelectingDefaultActivity;
      if (!bool) {
        break;
      }
      if (paramInt > 0)
      {
        localObject = this.this$0.mAdapter.getDataModel();
        ((ActivityChooserModel)localObject).setDefaultActivity(paramInt);
      }
    }
    localObject = this.this$0.mAdapter;
    boolean bool = ((ActivityChooserView.ActivityChooserViewAdapter)localObject).getShowDefaultActivity();
    if (bool) {}
    for (;;)
    {
      localObject = this.this$0.mAdapter.getDataModel().chooseActivity(paramInt);
      if (localObject == null) {
        break;
      }
      j = 524288;
      ((Intent)localObject).addFlags(j);
      Context localContext = this.this$0.getContext();
      localContext.startActivity((Intent)localObject);
      break;
      paramInt += 1;
    }
  }
  
  public boolean onLongClick(View paramView)
  {
    boolean bool = true;
    Object localObject = this.this$0.mDefaultActivityButton;
    if (paramView == localObject)
    {
      localObject = this.this$0.mAdapter;
      int i = ((ActivityChooserView.ActivityChooserViewAdapter)localObject).getCount();
      if (i > 0)
      {
        this.this$0.mIsSelectingDefaultActivity = bool;
        localObject = this.this$0;
        ActivityChooserView localActivityChooserView = this.this$0;
        int j = localActivityChooserView.mInitialActivityCount;
        ((ActivityChooserView)localObject).showPopupUnchecked(j);
      }
      return bool;
    }
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>();
    throw ((Throwable)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserView$Callbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */