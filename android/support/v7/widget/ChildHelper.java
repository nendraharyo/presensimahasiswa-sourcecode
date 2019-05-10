package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

class ChildHelper
{
  private static final boolean DEBUG = false;
  private static final String TAG = "ChildrenHelper";
  final ChildHelper.Bucket mBucket;
  final ChildHelper.Callback mCallback;
  final List mHiddenViews;
  
  ChildHelper(ChildHelper.Callback paramCallback)
  {
    this.mCallback = paramCallback;
    Object localObject = new android/support/v7/widget/ChildHelper$Bucket;
    ((ChildHelper.Bucket)localObject).<init>();
    this.mBucket = ((ChildHelper.Bucket)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mHiddenViews = ((List)localObject);
  }
  
  private int getOffset(int paramInt)
  {
    int i = -1;
    int k;
    if (paramInt < 0) {
      k = i;
    }
    for (;;)
    {
      return k;
      ChildHelper.Callback localCallback = this.mCallback;
      int m = localCallback.getChildCount();
      k = paramInt;
      int j;
      for (;;)
      {
        if (k >= m) {
          break label96;
        }
        ChildHelper.Bucket localBucket1 = this.mBucket;
        int n = localBucket1.countOnesBefore(k);
        n = k - n;
        n = paramInt - n;
        if (n == 0) {
          for (;;)
          {
            ChildHelper.Bucket localBucket2 = this.mBucket;
            j = localBucket2.get(k);
            if (j == 0) {
              break;
            }
            k += 1;
          }
        }
        k += n;
      }
      label96:
      k = j;
    }
  }
  
  private void hideViewInternal(View paramView)
  {
    this.mHiddenViews.add(paramView);
    this.mCallback.onEnteredHiddenState(paramView);
  }
  
  private boolean unhideViewInternal(View paramView)
  {
    Object localObject = this.mHiddenViews;
    boolean bool = ((List)localObject).remove(paramView);
    if (bool)
    {
      localObject = this.mCallback;
      ((ChildHelper.Callback)localObject).onLeftHiddenState(paramView);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  void addView(View paramView, int paramInt, boolean paramBoolean)
  {
    ChildHelper.Callback localCallback;
    if (paramInt < 0) {
      localCallback = this.mCallback;
    }
    for (int i = localCallback.getChildCount();; i = getOffset(paramInt))
    {
      ChildHelper.Bucket localBucket = this.mBucket;
      localBucket.insert(i, paramBoolean);
      if (paramBoolean) {
        hideViewInternal(paramView);
      }
      this.mCallback.addView(paramView, i);
      return;
    }
  }
  
  void addView(View paramView, boolean paramBoolean)
  {
    addView(paramView, -1, paramBoolean);
  }
  
  void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    ChildHelper.Callback localCallback;
    if (paramInt < 0) {
      localCallback = this.mCallback;
    }
    for (int i = localCallback.getChildCount();; i = getOffset(paramInt))
    {
      ChildHelper.Bucket localBucket = this.mBucket;
      localBucket.insert(i, paramBoolean);
      if (paramBoolean) {
        hideViewInternal(paramView);
      }
      this.mCallback.attachViewToParent(paramView, i, paramLayoutParams);
      return;
    }
  }
  
  void detachViewFromParent(int paramInt)
  {
    int i = getOffset(paramInt);
    this.mBucket.remove(i);
    this.mCallback.detachViewFromParent(i);
  }
  
  View findHiddenNonRemovedView(int paramInt)
  {
    int i = this.mHiddenViews.size();
    int j = 0;
    View localView = null;
    int k = 0;
    if (k < i)
    {
      localView = (View)this.mHiddenViews.get(k);
      RecyclerView.ViewHolder localViewHolder = this.mCallback.getChildViewHolder(localView);
      int m = localViewHolder.getLayoutPosition();
      if (m == paramInt)
      {
        boolean bool1 = localViewHolder.isInvalid();
        if (!bool1)
        {
          boolean bool2 = localViewHolder.isRemoved();
          if (bool2) {}
        }
      }
    }
    for (;;)
    {
      return localView;
      j = k + 1;
      k = j;
      break;
      j = 0;
      localView = null;
    }
  }
  
  View getChildAt(int paramInt)
  {
    int i = getOffset(paramInt);
    return this.mCallback.getChildAt(i);
  }
  
  int getChildCount()
  {
    int i = this.mCallback.getChildCount();
    int j = this.mHiddenViews.size();
    return i - j;
  }
  
  View getUnfilteredChildAt(int paramInt)
  {
    return this.mCallback.getChildAt(paramInt);
  }
  
  int getUnfilteredChildCount()
  {
    return this.mCallback.getChildCount();
  }
  
  void hide(View paramView)
  {
    Object localObject1 = this.mCallback;
    int i = ((ChildHelper.Callback)localObject1).indexOfChild(paramView);
    if (i < 0)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "view is not a child, cannot hide " + paramView;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.mBucket.set(i);
    hideViewInternal(paramView);
  }
  
  int indexOfChild(View paramView)
  {
    int i = -1;
    ChildHelper.Callback localCallback = this.mCallback;
    int j = localCallback.indexOfChild(paramView);
    if (j == i) {}
    for (;;)
    {
      return i;
      ChildHelper.Bucket localBucket1 = this.mBucket;
      boolean bool = localBucket1.get(j);
      if (!bool)
      {
        ChildHelper.Bucket localBucket2 = this.mBucket;
        i = localBucket2.countOnesBefore(j);
        i = j - i;
      }
    }
  }
  
  boolean isHidden(View paramView)
  {
    return this.mHiddenViews.contains(paramView);
  }
  
  void removeAllViewsUnfiltered()
  {
    this.mBucket.reset();
    Object localObject = this.mHiddenViews;
    int i = ((List)localObject).size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      ChildHelper.Callback localCallback = this.mCallback;
      localObject = (View)this.mHiddenViews.get(j);
      localCallback.onLeftHiddenState((View)localObject);
      localObject = this.mHiddenViews;
      ((List)localObject).remove(j);
      i = j + -1;
    }
    this.mCallback.removeAllViews();
  }
  
  void removeView(View paramView)
  {
    ChildHelper.Callback localCallback = this.mCallback;
    int i = localCallback.indexOfChild(paramView);
    if (i < 0) {}
    for (;;)
    {
      return;
      Object localObject = this.mBucket;
      boolean bool = ((ChildHelper.Bucket)localObject).remove(i);
      if (bool) {
        unhideViewInternal(paramView);
      }
      localObject = this.mCallback;
      ((ChildHelper.Callback)localObject).removeViewAt(i);
    }
  }
  
  void removeViewAt(int paramInt)
  {
    int i = getOffset(paramInt);
    Object localObject = this.mCallback.getChildAt(i);
    if (localObject == null) {}
    for (;;)
    {
      return;
      ChildHelper.Bucket localBucket = this.mBucket;
      boolean bool = localBucket.remove(i);
      if (bool) {
        unhideViewInternal((View)localObject);
      }
      localObject = this.mCallback;
      ((ChildHelper.Callback)localObject).removeViewAt(i);
    }
  }
  
  boolean removeViewIfHidden(View paramView)
  {
    boolean bool1 = true;
    ChildHelper.Callback localCallback = this.mCallback;
    int i = localCallback.indexOfChild(paramView);
    int k = -1;
    int j;
    if (i == k)
    {
      j = unhideViewInternal(paramView);
      if (j == 0) {}
    }
    for (;;)
    {
      return bool1;
      Object localObject = this.mBucket;
      boolean bool2 = ((ChildHelper.Bucket)localObject).get(j);
      if (bool2)
      {
        localObject = this.mBucket;
        ((ChildHelper.Bucket)localObject).remove(j);
        bool2 = unhideViewInternal(paramView);
        if (!bool2) {}
        localObject = this.mCallback;
        ((ChildHelper.Callback)localObject).removeViewAt(j);
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.mBucket.toString();
    localStringBuilder = localStringBuilder.append(str).append(", hidden list:");
    int i = this.mHiddenViews.size();
    return i;
  }
  
  void unhide(View paramView)
  {
    Object localObject1 = this.mCallback;
    int i = ((ChildHelper.Callback)localObject1).indexOfChild(paramView);
    if (i < 0)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "view is not a child, cannot hide " + paramView;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = this.mBucket;
    boolean bool = ((ChildHelper.Bucket)localObject2).get(i);
    if (!bool)
    {
      localObject1 = new java/lang/RuntimeException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "trying to unhide a view that was not hidden" + paramView;
      ((RuntimeException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.mBucket.clear(i);
    unhideViewInternal(paramView);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ChildHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */