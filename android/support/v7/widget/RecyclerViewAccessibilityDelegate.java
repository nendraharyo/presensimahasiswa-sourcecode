package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class RecyclerViewAccessibilityDelegate
  extends a
{
  final a mItemDelegate;
  final RecyclerView mRecyclerView;
  
  public RecyclerViewAccessibilityDelegate(RecyclerView paramRecyclerView)
  {
    this.mRecyclerView = paramRecyclerView;
    RecyclerViewAccessibilityDelegate.ItemDelegate localItemDelegate = new android/support/v7/widget/RecyclerViewAccessibilityDelegate$ItemDelegate;
    localItemDelegate.<init>(this);
    this.mItemDelegate = localItemDelegate;
  }
  
  public a getItemDelegate()
  {
    return this.mItemDelegate;
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    Object localObject = RecyclerView.class.getName();
    paramAccessibilityEvent.setClassName((CharSequence)localObject);
    boolean bool = paramView instanceof RecyclerView;
    if (bool)
    {
      bool = shouldIgnore();
      if (!bool)
      {
        paramView = (RecyclerView)paramView;
        localObject = paramView.getLayoutManager();
        if (localObject != null)
        {
          localObject = paramView.getLayoutManager();
          ((RecyclerView.LayoutManager)localObject).onInitializeAccessibilityEvent(paramAccessibilityEvent);
        }
      }
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    Object localObject = RecyclerView.class.getName();
    paramb.b((CharSequence)localObject);
    boolean bool = shouldIgnore();
    if (!bool)
    {
      localObject = this.mRecyclerView.getLayoutManager();
      if (localObject != null)
      {
        localObject = this.mRecyclerView.getLayoutManager();
        ((RecyclerView.LayoutManager)localObject).onInitializeAccessibilityNodeInfo(paramb);
      }
    }
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool = super.performAccessibilityAction(paramView, paramInt, paramBundle);
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = shouldIgnore();
      if (!bool)
      {
        localLayoutManager = this.mRecyclerView.getLayoutManager();
        if (localLayoutManager != null)
        {
          localLayoutManager = this.mRecyclerView.getLayoutManager();
          bool = localLayoutManager.performAccessibilityAction(paramInt, paramBundle);
          continue;
        }
      }
      bool = false;
      RecyclerView.LayoutManager localLayoutManager = null;
    }
  }
  
  boolean shouldIgnore()
  {
    return this.mRecyclerView.hasPendingAdapterUpdates();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerViewAccessibilityDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */