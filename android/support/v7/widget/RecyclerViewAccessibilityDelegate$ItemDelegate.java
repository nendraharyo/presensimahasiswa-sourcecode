package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.view.View;

public class RecyclerViewAccessibilityDelegate$ItemDelegate
  extends a
{
  final RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;
  
  public RecyclerViewAccessibilityDelegate$ItemDelegate(RecyclerViewAccessibilityDelegate paramRecyclerViewAccessibilityDelegate)
  {
    this.mRecyclerViewDelegate = paramRecyclerViewAccessibilityDelegate;
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    Object localObject = this.mRecyclerViewDelegate;
    boolean bool = ((RecyclerViewAccessibilityDelegate)localObject).shouldIgnore();
    if (!bool)
    {
      localObject = this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager();
      if (localObject != null)
      {
        localObject = this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager();
        ((RecyclerView.LayoutManager)localObject).onInitializeAccessibilityNodeInfoForItem(paramView, paramb);
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
      Object localObject = this.mRecyclerViewDelegate;
      bool = ((RecyclerViewAccessibilityDelegate)localObject).shouldIgnore();
      if (!bool)
      {
        localObject = this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager();
        if (localObject != null)
        {
          localObject = this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager();
          bool = ((RecyclerView.LayoutManager)localObject).performAccessibilityActionForItem(paramView, paramInt, paramBundle);
          continue;
        }
      }
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerViewAccessibilityDelegate$ItemDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */