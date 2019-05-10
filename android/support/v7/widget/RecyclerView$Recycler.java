package android.support.v7.widget;

import android.support.v4.view.a;
import android.support.v4.view.r;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class RecyclerView$Recycler
{
  static final int DEFAULT_CACHE_SIZE = 2;
  final ArrayList mAttachedScrap;
  final ArrayList mCachedViews;
  ArrayList mChangedScrap;
  RecyclerView.RecycledViewPool mRecyclerPool;
  private int mRequestedCacheMax;
  private final List mUnmodifiableAttachedScrap;
  private RecyclerView.ViewCacheExtension mViewCacheExtension;
  int mViewCacheMax;
  
  public RecyclerView$Recycler(RecyclerView paramRecyclerView)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mAttachedScrap = ((ArrayList)localObject);
    this.mChangedScrap = null;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mCachedViews = ((ArrayList)localObject);
    localObject = Collections.unmodifiableList(this.mAttachedScrap);
    this.mUnmodifiableAttachedScrap = ((List)localObject);
    this.mRequestedCacheMax = i;
    this.mViewCacheMax = i;
  }
  
  private void attachAccessibilityDelegateOnBind(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject = this.this$0;
    boolean bool1 = ((RecyclerView)localObject).isAccessibilityEnabled();
    if (bool1)
    {
      localObject = paramViewHolder.itemView;
      int i = r.d((View)localObject);
      if (i == 0)
      {
        i = 1;
        r.a((View)localObject, i);
      }
      boolean bool2 = r.a((View)localObject);
      if (!bool2)
      {
        int j = 16384;
        paramViewHolder.addFlags(j);
        a locala = this.this$0.mAccessibilityDelegate.getItemDelegate();
        r.a((View)localObject, locala);
      }
    }
  }
  
  private void invalidateDisplayListInt(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject = paramViewHolder.itemView;
    boolean bool = localObject instanceof ViewGroup;
    if (bool)
    {
      localObject = (ViewGroup)paramViewHolder.itemView;
      invalidateDisplayListInt((ViewGroup)localObject, false);
    }
  }
  
  private void invalidateDisplayListInt(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i = 4;
    int j = paramViewGroup.getChildCount() + -1;
    Object localObject;
    for (int k = j; k >= 0; k = j)
    {
      localObject = paramViewGroup.getChildAt(k);
      boolean bool = localObject instanceof ViewGroup;
      if (bool)
      {
        localObject = (ViewGroup)localObject;
        bool = true;
        invalidateDisplayListInt((ViewGroup)localObject, bool);
      }
      j = k + -1;
    }
    if (!paramBoolean) {}
    for (;;)
    {
      return;
      j = paramViewGroup.getVisibility();
      if (j == i)
      {
        j = 0;
        localObject = null;
        paramViewGroup.setVisibility(0);
        paramViewGroup.setVisibility(i);
      }
      else
      {
        j = paramViewGroup.getVisibility();
        paramViewGroup.setVisibility(i);
        paramViewGroup.setVisibility(j);
      }
    }
  }
  
  private boolean tryBindViewHolderByDeadline(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, long paramLong)
  {
    Object localObject = this.this$0;
    paramViewHolder.mOwnerRecyclerView = ((RecyclerView)localObject);
    int i = paramViewHolder.getItemViewType();
    localObject = this.this$0;
    long l1 = ((RecyclerView)localObject).getNanoTime();
    long l2 = Long.MAX_VALUE;
    boolean bool = paramLong < l2;
    if (bool)
    {
      localObject = this.mRecyclerPool;
      l2 = paramLong;
      bool = ((RecyclerView.RecycledViewPool)localObject).willBindInTime(i, l1, paramLong);
      if (!bool)
      {
        bool = false;
        localObject = null;
      }
    }
    for (;;)
    {
      return bool;
      this.this$0.mAdapter.bindViewHolder(paramViewHolder, paramInt1);
      long l3 = this.this$0.getNanoTime();
      RecyclerView.RecycledViewPool localRecycledViewPool = this.mRecyclerPool;
      int j = paramViewHolder.getItemViewType();
      l3 -= l1;
      localRecycledViewPool.factorInBindTime(j, l3);
      attachAccessibilityDelegateOnBind(paramViewHolder);
      localObject = this.this$0.mState;
      bool = ((RecyclerView.State)localObject).isPreLayout();
      if (bool) {
        paramViewHolder.mPreLayoutPosition = paramInt2;
      }
      bool = true;
    }
  }
  
  void addViewHolderToRecycledViewPool(RecyclerView.ViewHolder paramViewHolder, boolean paramBoolean)
  {
    int i = 16384;
    RecyclerView.clearNestedRecyclerViewIfNotNested(paramViewHolder);
    boolean bool = paramViewHolder.hasAnyOfTheFlags(i);
    if (bool)
    {
      bool = false;
      paramViewHolder.setFlags(0, i);
      View localView = paramViewHolder.itemView;
      r.a(localView, null);
    }
    if (paramBoolean) {
      dispatchViewRecycled(paramViewHolder);
    }
    paramViewHolder.mOwnerRecyclerView = null;
    getRecycledViewPool().putRecycledView(paramViewHolder);
  }
  
  public void bindViewToPosition(View paramView, int paramInt)
  {
    boolean bool1 = true;
    Object localObject1 = RecyclerView.getChildViewHolderInt(paramView);
    Object localObject3;
    if (localObject1 == null)
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
      localObject3 = this.this$0.exceptionLabel();
      localObject1 = (String)localObject3;
      ((IllegalArgumentException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    Object localObject2 = this.this$0.mAdapterHelper;
    int i = ((AdapterHelper)localObject2).findPositionOffset(paramInt);
    if (i >= 0)
    {
      localObject2 = this.this$0.mAdapter;
      int j = ((RecyclerView.Adapter)localObject2).getItemCount();
      if (i < j) {}
    }
    else
    {
      localObject2 = new java/lang/IndexOutOfBoundsException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Inconsistency detected. Invalid item position ").append(paramInt).append("(offset:").append(i).append(").").append("state:");
      i = this.this$0.mState.getItemCount();
      localObject1 = ((StringBuilder)localObject1).append(i);
      localObject3 = this.this$0.exceptionLabel();
      localObject1 = (String)localObject3;
      ((IndexOutOfBoundsException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    long l = Long.MAX_VALUE;
    localObject2 = this;
    tryBindViewHolderByDeadline((RecyclerView.ViewHolder)localObject1, i, paramInt, l);
    localObject2 = ((RecyclerView.ViewHolder)localObject1).itemView.getLayoutParams();
    boolean bool3;
    if (localObject2 == null)
    {
      localObject2 = (RecyclerView.LayoutParams)this.this$0.generateDefaultLayoutParams();
      localObject3 = ((RecyclerView.ViewHolder)localObject1).itemView;
      ((View)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((RecyclerView.LayoutParams)localObject2).mInsetsDirty = bool1;
      ((RecyclerView.LayoutParams)localObject2).mViewHolder = ((RecyclerView.ViewHolder)localObject1);
      localObject1 = ((RecyclerView.ViewHolder)localObject1).itemView.getParent();
      if (localObject1 != null) {
        break label374;
      }
      bool3 = bool1;
    }
    for (;;)
    {
      ((RecyclerView.LayoutParams)localObject2).mPendingInvalidate = bool3;
      return;
      localObject3 = this.this$0;
      boolean bool2 = ((RecyclerView)localObject3).checkLayoutParams((ViewGroup.LayoutParams)localObject2);
      if (!bool2)
      {
        localObject2 = (RecyclerView.LayoutParams)this.this$0.generateLayoutParams((ViewGroup.LayoutParams)localObject2);
        localObject3 = ((RecyclerView.ViewHolder)localObject1).itemView;
        ((View)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        break;
      }
      localObject2 = (RecyclerView.LayoutParams)localObject2;
      break;
      label374:
      bool3 = false;
      localObject1 = null;
    }
  }
  
  public void clear()
  {
    this.mAttachedScrap.clear();
    recycleAndClearCachedViews();
  }
  
  void clearOldPositions()
  {
    int i = 0;
    Object localObject = this.mCachedViews;
    int j = ((ArrayList)localObject).size();
    int m;
    for (int k = 0; k < j; k = m)
    {
      localObject = (RecyclerView.ViewHolder)this.mCachedViews.get(k);
      ((RecyclerView.ViewHolder)localObject).clearOldPosition();
      m = k + 1;
    }
    localObject = this.mAttachedScrap;
    j = ((ArrayList)localObject).size();
    for (k = 0; k < j; k = m)
    {
      localObject = (RecyclerView.ViewHolder)this.mAttachedScrap.get(k);
      ((RecyclerView.ViewHolder)localObject).clearOldPosition();
      m = k + 1;
    }
    localObject = this.mChangedScrap;
    if (localObject != null)
    {
      localObject = this.mChangedScrap;
      k = ((ArrayList)localObject).size();
      while (i < k)
      {
        localObject = (RecyclerView.ViewHolder)this.mChangedScrap.get(i);
        ((RecyclerView.ViewHolder)localObject).clearOldPosition();
        m = i + 1;
        i = m;
      }
    }
  }
  
  void clearScrap()
  {
    this.mAttachedScrap.clear();
    ArrayList localArrayList = this.mChangedScrap;
    if (localArrayList != null)
    {
      localArrayList = this.mChangedScrap;
      localArrayList.clear();
    }
  }
  
  public int convertPreLayoutPositionToPostLayout(int paramInt)
  {
    if (paramInt >= 0)
    {
      localObject1 = this.this$0.mState;
      int i = ((RecyclerView.State)localObject1).getItemCount();
      if (paramInt < i) {}
    }
    else
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("invalid position ").append(paramInt).append(". State ").append("item count is ");
      int j = this.this$0.mState.getItemCount();
      localObject2 = ((StringBuilder)localObject2).append(j);
      String str = this.this$0.exceptionLabel();
      localObject2 = str;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.this$0.mState;
    boolean bool = ((RecyclerView.State)localObject1).isPreLayout();
    if (!bool) {}
    for (;;)
    {
      return paramInt;
      localObject1 = this.this$0.mAdapterHelper;
      paramInt = ((AdapterHelper)localObject1).findPositionOffset(paramInt);
    }
  }
  
  void dispatchViewRecycled(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject = this.this$0.mRecyclerListener;
    if (localObject != null)
    {
      localObject = this.this$0.mRecyclerListener;
      ((RecyclerView.RecyclerListener)localObject).onViewRecycled(paramViewHolder);
    }
    localObject = this.this$0.mAdapter;
    if (localObject != null)
    {
      localObject = this.this$0.mAdapter;
      ((RecyclerView.Adapter)localObject).onViewRecycled(paramViewHolder);
    }
    localObject = this.this$0.mState;
    if (localObject != null)
    {
      localObject = this.this$0.mViewInfoStore;
      ((ViewInfoStore)localObject).removeViewHolder(paramViewHolder);
    }
  }
  
  RecyclerView.ViewHolder getChangedScrapViewForPosition(int paramInt)
  {
    int i = 32;
    int j = 0;
    Object localObject = this.mChangedScrap;
    int k;
    int m;
    if (localObject != null)
    {
      localObject = this.mChangedScrap;
      k = ((ArrayList)localObject).size();
      if (k != 0) {}
    }
    else
    {
      m = 0;
      localObject = null;
    }
    for (;;)
    {
      return (RecyclerView.ViewHolder)localObject;
      int i1 = 0;
      RecyclerView.Adapter localAdapter = null;
      for (;;)
      {
        if (i1 >= k) {
          break label117;
        }
        localObject = (RecyclerView.ViewHolder)this.mChangedScrap.get(i1);
        boolean bool3 = ((RecyclerView.ViewHolder)localObject).wasReturnedFromScrap();
        if (!bool3)
        {
          int i2 = ((RecyclerView.ViewHolder)localObject).getLayoutPosition();
          if (i2 == paramInt)
          {
            ((RecyclerView.ViewHolder)localObject).addFlags(i);
            break;
          }
        }
        m = i1 + 1;
        i1 = m;
      }
      label117:
      localObject = this.this$0.mAdapter;
      boolean bool1 = ((RecyclerView.Adapter)localObject).hasStableIds();
      if (bool1)
      {
        localObject = this.this$0.mAdapterHelper;
        n = ((AdapterHelper)localObject).findPositionOffset(paramInt);
        if (n > 0)
        {
          localAdapter = this.this$0.mAdapter;
          i1 = localAdapter.getItemCount();
          if (n < i1)
          {
            localAdapter = this.this$0.mAdapter;
            long l1 = localAdapter.getItemId(n);
            for (;;)
            {
              if (j >= k) {
                break label271;
              }
              localObject = (RecyclerView.ViewHolder)this.mChangedScrap.get(j);
              boolean bool2 = ((RecyclerView.ViewHolder)localObject).wasReturnedFromScrap();
              if (!bool2)
              {
                long l2 = ((RecyclerView.ViewHolder)localObject).getItemId();
                bool2 = l2 < l1;
                if (!bool2)
                {
                  ((RecyclerView.ViewHolder)localObject).addFlags(i);
                  break;
                }
              }
              n = j + 1;
              j = n;
            }
          }
        }
      }
      label271:
      int n = 0;
      localObject = null;
    }
  }
  
  RecyclerView.RecycledViewPool getRecycledViewPool()
  {
    RecyclerView.RecycledViewPool localRecycledViewPool = this.mRecyclerPool;
    if (localRecycledViewPool == null)
    {
      localRecycledViewPool = new android/support/v7/widget/RecyclerView$RecycledViewPool;
      localRecycledViewPool.<init>();
      this.mRecyclerPool = localRecycledViewPool;
    }
    return this.mRecyclerPool;
  }
  
  int getScrapCount()
  {
    return this.mAttachedScrap.size();
  }
  
  public List getScrapList()
  {
    return this.mUnmodifiableAttachedScrap;
  }
  
  RecyclerView.ViewHolder getScrapOrCachedViewForId(long paramLong, int paramInt, boolean paramBoolean)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = this.mAttachedScrap;
    int j = ((ArrayList)localObject2).size() + -1;
    int k = j;
    long l;
    if (k >= 0)
    {
      localObject2 = (RecyclerView.ViewHolder)this.mAttachedScrap.get(k);
      l = ((RecyclerView.ViewHolder)localObject2).getItemId();
      boolean bool2 = l < paramLong;
      if (!bool2)
      {
        bool2 = ((RecyclerView.ViewHolder)localObject2).wasReturnedFromScrap();
        if (!bool2)
        {
          int m = ((RecyclerView.ViewHolder)localObject2).getItemViewType();
          if (paramInt == m)
          {
            ((RecyclerView.ViewHolder)localObject2).addFlags(32);
            bool1 = ((RecyclerView.ViewHolder)localObject2).isRemoved();
            if (bool1)
            {
              localObject1 = this.this$0.mState;
              bool1 = ((RecyclerView.State)localObject1).isPreLayout();
              if (!bool1)
              {
                int i = 2;
                k = 14;
                ((RecyclerView.ViewHolder)localObject2).setFlags(i, k);
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return (RecyclerView.ViewHolder)localObject2;
      if (!paramBoolean)
      {
        this.mAttachedScrap.remove(k);
        RecyclerView localRecyclerView = this.this$0;
        View localView = ((RecyclerView.ViewHolder)localObject2).itemView;
        localRecyclerView.removeDetachedView(localView, false);
        localObject2 = ((RecyclerView.ViewHolder)localObject2).itemView;
        quickRecycleScrapView((View)localObject2);
      }
      j = k + -1;
      k = j;
      break;
      localObject2 = this.mCachedViews;
      j = ((ArrayList)localObject2).size() + -1;
      for (k = j;; k = j)
      {
        if (k < 0) {
          break label332;
        }
        localObject2 = (RecyclerView.ViewHolder)this.mCachedViews.get(k);
        l = ((RecyclerView.ViewHolder)localObject2).getItemId();
        boolean bool3 = l < paramLong;
        if (!bool3)
        {
          int n = ((RecyclerView.ViewHolder)localObject2).getItemViewType();
          if (paramInt == n)
          {
            if (paramBoolean) {
              break;
            }
            localObject1 = this.mCachedViews;
            ((ArrayList)localObject1).remove(k);
            break;
          }
          if (!paramBoolean)
          {
            recycleCachedViewAt(k);
            j = 0;
            localObject2 = null;
            break;
          }
        }
        j = k + -1;
      }
      label332:
      j = 0;
      localObject2 = null;
    }
  }
  
  RecyclerView.ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = this.mAttachedScrap;
    int j = ((ArrayList)localObject2).size();
    int m = 0;
    Object localObject3 = null;
    if (m < j)
    {
      localObject2 = (RecyclerView.ViewHolder)this.mAttachedScrap.get(m);
      boolean bool2 = ((RecyclerView.ViewHolder)localObject2).wasReturnedFromScrap();
      if (!bool2)
      {
        int n = ((RecyclerView.ViewHolder)localObject2).getLayoutPosition();
        if (n == paramInt)
        {
          boolean bool3 = ((RecyclerView.ViewHolder)localObject2).isInvalid();
          if (!bool3)
          {
            RecyclerView.State localState = this.this$0.mState;
            bool3 = localState.mInPreLayout;
            if (!bool3)
            {
              bool3 = ((RecyclerView.ViewHolder)localObject2).isRemoved();
              if (bool3) {}
            }
            else
            {
              i = 32;
              ((RecyclerView.ViewHolder)localObject2).addFlags(i);
            }
          }
        }
      }
    }
    for (;;)
    {
      return (RecyclerView.ViewHolder)localObject2;
      int i1 = m + 1;
      m = i1;
      break;
      if (!paramBoolean)
      {
        localObject2 = this.this$0.mChildHelper;
        localObject3 = ((ChildHelper)localObject2).findHiddenNonRemovedView(paramInt);
        if (localObject3 != null)
        {
          localObject2 = RecyclerView.getChildViewHolderInt((View)localObject3);
          this.this$0.mChildHelper.unhide((View)localObject3);
          localObject1 = this.this$0.mChildHelper;
          i = ((ChildHelper)localObject1).indexOfChild((View)localObject3);
          j = -1;
          if (i == j)
          {
            localObject1 = new java/lang/IllegalStateException;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject2 = ((StringBuilder)localObject3).append("layout index should not be -1 after unhiding a view:").append(localObject2);
            localObject3 = this.this$0.exceptionLabel();
            localObject2 = (String)localObject3;
            ((IllegalStateException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
          ChildHelper localChildHelper = this.this$0.mChildHelper;
          localChildHelper.detachViewFromParent(i);
          scrapView((View)localObject3);
          i = 8224;
          ((RecyclerView.ViewHolder)localObject2).addFlags(i);
          continue;
        }
      }
      localObject2 = this.mCachedViews;
      m = ((ArrayList)localObject2).size();
      for (;;)
      {
        if (i >= m) {
          break label394;
        }
        localObject2 = (RecyclerView.ViewHolder)this.mCachedViews.get(i);
        boolean bool1 = ((RecyclerView.ViewHolder)localObject2).isInvalid();
        if (!bool1)
        {
          int k = ((RecyclerView.ViewHolder)localObject2).getLayoutPosition();
          if (k == paramInt)
          {
            if (paramBoolean) {
              break;
            }
            localObject3 = this.mCachedViews;
            ((ArrayList)localObject3).remove(i);
            break;
          }
        }
        i1 = i + 1;
        i = i1;
      }
      label394:
      i1 = 0;
      localObject2 = null;
    }
  }
  
  View getScrapViewAt(int paramInt)
  {
    return ((RecyclerView.ViewHolder)this.mAttachedScrap.get(paramInt)).itemView;
  }
  
  public View getViewForPosition(int paramInt)
  {
    return getViewForPosition(paramInt, false);
  }
  
  View getViewForPosition(int paramInt, boolean paramBoolean)
  {
    return tryGetViewHolderForPositionByDeadline(paramInt, paramBoolean, Long.MAX_VALUE).itemView;
  }
  
  void markItemDecorInsetsDirty()
  {
    int i = this.mCachedViews.size();
    int j = 0;
    RecyclerView.LayoutParams localLayoutParams = null;
    for (int k = 0; k < i; k = j)
    {
      localLayoutParams = (RecyclerView.LayoutParams)((RecyclerView.ViewHolder)this.mCachedViews.get(k)).itemView.getLayoutParams();
      if (localLayoutParams != null)
      {
        boolean bool = true;
        localLayoutParams.mInsetsDirty = bool;
      }
      j = k + 1;
    }
  }
  
  void markKnownViewsInvalid()
  {
    int i = this.mCachedViews.size();
    int j = 0;
    Object localObject = null;
    for (int k = 0; k < i; k = j)
    {
      localObject = (RecyclerView.ViewHolder)this.mCachedViews.get(k);
      if (localObject != null)
      {
        ((RecyclerView.ViewHolder)localObject).addFlags(6);
        ((RecyclerView.ViewHolder)localObject).addChangePayload(null);
      }
      j = k + 1;
    }
    localObject = this.this$0.mAdapter;
    if (localObject != null)
    {
      localObject = this.this$0.mAdapter;
      boolean bool = ((RecyclerView.Adapter)localObject).hasStableIds();
      if (bool) {}
    }
    else
    {
      recycleAndClearCachedViews();
    }
  }
  
  void offsetPositionRecordsForInsert(int paramInt1, int paramInt2)
  {
    int i = this.mCachedViews.size();
    int j = 0;
    RecyclerView.ViewHolder localViewHolder = null;
    for (int k = 0; k < i; k = j)
    {
      localViewHolder = (RecyclerView.ViewHolder)this.mCachedViews.get(k);
      if (localViewHolder != null)
      {
        int m = localViewHolder.mPosition;
        if (m >= paramInt1)
        {
          m = 1;
          localViewHolder.offsetPosition(paramInt2, m);
        }
      }
      j = k + 1;
    }
  }
  
  void offsetPositionRecordsForMove(int paramInt1, int paramInt2)
  {
    int i;
    int j;
    int k;
    int m;
    Object localObject;
    int i1;
    label32:
    int i2;
    if (paramInt1 < paramInt2)
    {
      i = -1;
      j = i;
      k = paramInt2;
      m = paramInt1;
      localObject = this.mCachedViews;
      int n = ((ArrayList)localObject).size();
      i1 = 0;
      if (i1 >= n) {
        return;
      }
      localObject = (RecyclerView.ViewHolder)this.mCachedViews.get(i1);
      if (localObject != null)
      {
        i2 = ((RecyclerView.ViewHolder)localObject).mPosition;
        if (i2 >= m)
        {
          i2 = ((RecyclerView.ViewHolder)localObject).mPosition;
          if (i2 <= k) {
            break label111;
          }
        }
      }
    }
    for (;;)
    {
      i = i1 + 1;
      i1 = i;
      break label32;
      i = 1;
      j = i;
      k = paramInt1;
      m = paramInt2;
      break;
      label111:
      i2 = ((RecyclerView.ViewHolder)localObject).mPosition;
      if (i2 == paramInt1)
      {
        i2 = paramInt2 - paramInt1;
        ((RecyclerView.ViewHolder)localObject).offsetPosition(i2, false);
      }
      else
      {
        ((RecyclerView.ViewHolder)localObject).offsetPosition(j, false);
      }
    }
  }
  
  void offsetPositionRecordsForRemove(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramInt1 + paramInt2;
    Object localObject = this.mCachedViews;
    int j = ((ArrayList)localObject).size() + -1;
    int k = j;
    if (k >= 0)
    {
      localObject = (RecyclerView.ViewHolder)this.mCachedViews.get(k);
      int m;
      if (localObject != null)
      {
        m = ((RecyclerView.ViewHolder)localObject).mPosition;
        if (m < i) {
          break label87;
        }
        m = -paramInt2;
        ((RecyclerView.ViewHolder)localObject).offsetPosition(m, paramBoolean);
      }
      for (;;)
      {
        j = k + -1;
        k = j;
        break;
        label87:
        m = ((RecyclerView.ViewHolder)localObject).mPosition;
        if (m >= paramInt1)
        {
          m = 8;
          ((RecyclerView.ViewHolder)localObject).addFlags(m);
          recycleCachedViewAt(k);
        }
      }
    }
  }
  
  void onAdapterChanged(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2, boolean paramBoolean)
  {
    clear();
    getRecycledViewPool().onAdapterChanged(paramAdapter1, paramAdapter2, paramBoolean);
  }
  
  void quickRecycleScrapView(View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    RecyclerView.ViewHolder.access$1002(localViewHolder, null);
    RecyclerView.ViewHolder.access$1102(localViewHolder, false);
    localViewHolder.clearReturnedFromScrapFlag();
    recycleViewHolderInternal(localViewHolder);
  }
  
  void recycleAndClearCachedViews()
  {
    Object localObject = this.mCachedViews;
    int i = ((ArrayList)localObject).size() + -1;
    while (i >= 0)
    {
      recycleCachedViewAt(i);
      i += -1;
    }
    localObject = this.mCachedViews;
    ((ArrayList)localObject).clear();
    boolean bool = RecyclerView.access$800();
    if (bool)
    {
      localObject = this.this$0.mPrefetchRegistry;
      ((GapWorker.LayoutPrefetchRegistryImpl)localObject).clearPrefetchPositions();
    }
  }
  
  void recycleCachedViewAt(int paramInt)
  {
    RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)this.mCachedViews.get(paramInt);
    addViewHolderToRecycledViewPool(localViewHolder, true);
    this.mCachedViews.remove(paramInt);
  }
  
  public void recycleView(View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    boolean bool = localViewHolder.isTmpDetached();
    if (bool)
    {
      RecyclerView localRecyclerView = this.this$0;
      localRecyclerView.removeDetachedView(paramView, false);
    }
    bool = localViewHolder.isScrap();
    if (bool) {
      localViewHolder.unScrap();
    }
    for (;;)
    {
      recycleViewHolderInternal(localViewHolder);
      return;
      bool = localViewHolder.wasReturnedFromScrap();
      if (bool) {
        localViewHolder.clearReturnedFromScrapFlag();
      }
    }
  }
  
  void recycleViewHolderInternal(RecyclerView.ViewHolder paramViewHolder)
  {
    int i = 1;
    int j = 0;
    String str = null;
    boolean bool1 = paramViewHolder.isScrap();
    Object localObject2;
    Object localObject3;
    if (!bool1)
    {
      localObject1 = paramViewHolder.itemView.getParent();
      if (localObject1 == null) {}
    }
    else
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Scrapped or attached views may not be recycled. isScrap:");
      bool4 = paramViewHolder.isScrap();
      StringBuilder localStringBuilder = ((StringBuilder)localObject1).append(bool4).append(" isAttached:");
      localObject1 = paramViewHolder.itemView.getParent();
      if (localObject1 != null) {
        bool1 = i;
      }
      for (;;)
      {
        localObject1 = localStringBuilder.append(bool1);
        localObject3 = this.this$0.exceptionLabel();
        localObject1 = (String)localObject3;
        ((IllegalArgumentException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
        bool1 = false;
        localObject1 = null;
      }
    }
    bool1 = paramViewHolder.isTmpDetached();
    if (bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Tmp detached view should be removed from RecyclerView before it can be recycled: ").append(paramViewHolder);
      str = this.this$0.exceptionLabel();
      localObject3 = str;
      ((IllegalArgumentException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    bool1 = paramViewHolder.shouldIgnore();
    if (bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
      str = this.this$0.exceptionLabel();
      localObject3 = str;
      ((IllegalArgumentException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    boolean bool4 = RecyclerView.ViewHolder.access$900(paramViewHolder);
    Object localObject1 = this.this$0.mAdapter;
    int i2;
    label469:
    int n;
    if ((localObject1 != null) && (bool4))
    {
      localObject1 = this.this$0.mAdapter;
      bool1 = ((RecyclerView.Adapter)localObject1).onFailedToRecycleView(paramViewHolder);
      if (bool1)
      {
        bool1 = i;
        if (!bool1)
        {
          bool1 = paramViewHolder.isRecyclable();
          if (!bool1) {
            break label626;
          }
        }
        int k = this.mViewCacheMax;
        if (k <= 0) {
          break label617;
        }
        boolean bool2 = paramViewHolder.hasAnyOfTheFlags(526);
        if (bool2) {
          break label617;
        }
        localObject1 = this.mCachedViews;
        int m = ((ArrayList)localObject1).size();
        int i1 = this.mViewCacheMax;
        if ((m >= i1) && (m > 0))
        {
          recycleCachedViewAt(0);
          m += -1;
        }
        i2 = RecyclerView.access$800();
        if ((i2 != 0) && (m > 0))
        {
          localObject2 = this.this$0.mPrefetchRegistry;
          int i3 = paramViewHolder.mPosition;
          i2 = ((GapWorker.LayoutPrefetchRegistryImpl)localObject2).lastPrefetchIncludedPosition(i3);
          if (i2 == 0)
          {
            m += -1;
            i2 = m;
            if (i2 >= 0)
            {
              localObject1 = (RecyclerView.ViewHolder)this.mCachedViews.get(i2);
              m = ((RecyclerView.ViewHolder)localObject1).mPosition;
              GapWorker.LayoutPrefetchRegistryImpl localLayoutPrefetchRegistryImpl = this.this$0.mPrefetchRegistry;
              boolean bool3 = localLayoutPrefetchRegistryImpl.lastPrefetchIncludedPosition(m);
              if (bool3) {
                break label604;
              }
            }
            n = i2 + 1;
          }
        }
        localObject2 = this.mCachedViews;
        ((ArrayList)localObject2).add(n, paramViewHolder);
        n = i;
        label541:
        if (n == 0)
        {
          addViewHolderToRecycledViewPool(paramViewHolder, i);
          j = i;
        }
      }
    }
    for (;;)
    {
      localObject3 = this.this$0.mViewInfoStore;
      ((ViewInfoStore)localObject3).removeViewHolder(paramViewHolder);
      if ((n == 0) && (j == 0) && (bool4))
      {
        n = 0;
        localObject1 = null;
        paramViewHolder.mOwnerRecyclerView = null;
      }
      return;
      n = 0;
      localObject1 = null;
      break;
      label604:
      n = i2 + -1;
      i2 = n;
      break label469;
      label617:
      n = 0;
      localObject1 = null;
      break label541;
      label626:
      n = 0;
      localObject1 = null;
    }
  }
  
  void recycleViewInternal(View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    recycleViewHolderInternal(localViewHolder);
  }
  
  void scrapView(View paramView)
  {
    Object localObject1 = RecyclerView.getChildViewHolderInt(paramView);
    boolean bool = ((RecyclerView.ViewHolder)localObject1).hasAnyOfTheFlags(12);
    if (!bool)
    {
      bool = ((RecyclerView.ViewHolder)localObject1).isUpdated();
      if (bool)
      {
        localObject2 = this.this$0;
        bool = ((RecyclerView)localObject2).canReuseUpdatedViewHolder((RecyclerView.ViewHolder)localObject1);
        if (!bool) {
          break label154;
        }
      }
    }
    bool = ((RecyclerView.ViewHolder)localObject1).isInvalid();
    if (bool)
    {
      bool = ((RecyclerView.ViewHolder)localObject1).isRemoved();
      if (!bool)
      {
        localObject2 = this.this$0.mAdapter;
        bool = ((RecyclerView.Adapter)localObject2).hasStableIds();
        if (!bool)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
          String str = this.this$0.exceptionLabel();
          localObject2 = str;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
    }
    bool = false;
    ((RecyclerView.ViewHolder)localObject1).setScrapContainer(this, false);
    Object localObject2 = this.mAttachedScrap;
    ((ArrayList)localObject2).add(localObject1);
    for (;;)
    {
      return;
      label154:
      localObject2 = this.mChangedScrap;
      if (localObject2 == null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        this.mChangedScrap = ((ArrayList)localObject2);
      }
      bool = true;
      ((RecyclerView.ViewHolder)localObject1).setScrapContainer(this, bool);
      localObject2 = this.mChangedScrap;
      ((ArrayList)localObject2).add(localObject1);
    }
  }
  
  void setRecycledViewPool(RecyclerView.RecycledViewPool paramRecycledViewPool)
  {
    RecyclerView.RecycledViewPool localRecycledViewPool = this.mRecyclerPool;
    if (localRecycledViewPool != null)
    {
      localRecycledViewPool = this.mRecyclerPool;
      localRecycledViewPool.detach();
    }
    this.mRecyclerPool = paramRecycledViewPool;
    if (paramRecycledViewPool != null)
    {
      localRecycledViewPool = this.mRecyclerPool;
      RecyclerView.Adapter localAdapter = this.this$0.getAdapter();
      localRecycledViewPool.attach(localAdapter);
    }
  }
  
  void setViewCacheExtension(RecyclerView.ViewCacheExtension paramViewCacheExtension)
  {
    this.mViewCacheExtension = paramViewCacheExtension;
  }
  
  public void setViewCacheSize(int paramInt)
  {
    this.mRequestedCacheMax = paramInt;
    updateViewCacheSize();
  }
  
  RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline(int paramInt, boolean paramBoolean, long paramLong)
  {
    int i = 8192;
    int j = 0;
    RecyclerView.RecycledViewPool localRecycledViewPool = null;
    int k = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject2;
    int i3;
    Object localObject3;
    if (paramInt >= 0)
    {
      localObject1 = this.this$0.mState;
      int m = ((RecyclerView.State)localObject1).getItemCount();
      if (paramInt < m) {}
    }
    else
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Invalid item position ").append(paramInt).append("(").append(paramInt).append("). Item count:");
      i3 = this.this$0.mState.getItemCount();
      localObject2 = ((StringBuilder)localObject2).append(i3);
      localObject3 = this.this$0.exceptionLabel();
      localObject2 = (String)localObject3;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.this$0.mState;
    int n = ((RecyclerView.State)localObject1).isPreLayout();
    float f2;
    float f3;
    if (n != 0)
    {
      localObject2 = getChangedScrapViewForPosition(paramInt);
      if (localObject2 != null)
      {
        n = k;
        f2 = f1;
        i3 = n;
        f3 = f2;
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      Object localObject4;
      if (localObject1 == null)
      {
        localObject1 = getScrapOrHiddenOrCachedHolderForPosition(paramInt, paramBoolean);
        if (localObject1 != null)
        {
          boolean bool2 = validateViewHolderForOffsetPosition((RecyclerView.ViewHolder)localObject1);
          if (bool2) {
            break label470;
          }
          if (!paramBoolean)
          {
            ((RecyclerView.ViewHolder)localObject1).addFlags(4);
            bool2 = ((RecyclerView.ViewHolder)localObject1).isScrap();
            if (!bool2) {
              break label450;
            }
            localObject2 = this.this$0;
            localObject4 = ((RecyclerView.ViewHolder)localObject1).itemView;
            ((RecyclerView)localObject2).removeDetachedView((View)localObject4, false);
            ((RecyclerView.ViewHolder)localObject1).unScrap();
            label273:
            recycleViewHolderInternal((RecyclerView.ViewHolder)localObject1);
          }
          n = 0;
          localObject1 = null;
          f2 = 0.0F;
        }
      }
      int i7;
      label450:
      label470:
      Object localObject5;
      long l1;
      int i8;
      boolean bool1;
      for (;;)
      {
        if (localObject1 == null)
        {
          localObject2 = this.this$0.mAdapterHelper;
          i7 = ((AdapterHelper)localObject2).findPositionOffset(paramInt);
          if (i7 >= 0)
          {
            localObject2 = this.this$0.mAdapter;
            int i5 = ((RecyclerView.Adapter)localObject2).getItemCount();
            if (i7 < i5) {}
          }
          else
          {
            localObject1 = new java/lang/IndexOutOfBoundsException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("Inconsistency detected. Invalid item position ").append(paramInt).append("(offset:").append(i7).append(").").append("state:");
            i3 = this.this$0.mState.getItemCount();
            localObject2 = ((StringBuilder)localObject2).append(i3);
            localObject3 = this.this$0.exceptionLabel();
            localObject2 = (String)localObject3;
            ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
            n = 0;
            localObject1 = null;
            f2 = 0.0F;
            break;
            boolean bool3 = ((RecyclerView.ViewHolder)localObject1).wasReturnedFromScrap();
            if (!bool3) {
              break label273;
            }
            ((RecyclerView.ViewHolder)localObject1).clearReturnedFromScrapFlag();
            break label273;
            i3 = k;
            f3 = f1;
            continue;
          }
          localObject2 = this.this$0.mAdapter;
          int i6 = ((RecyclerView.Adapter)localObject2).getItemViewType(i7);
          localObject5 = this.this$0.mAdapter;
          boolean bool5 = ((RecyclerView.Adapter)localObject5).hasStableIds();
          if (bool5)
          {
            l1 = this.this$0.mAdapter.getItemId(i7);
            localObject1 = getScrapOrCachedViewForId(l1, i6, paramBoolean);
            if (localObject1 != null)
            {
              ((RecyclerView.ViewHolder)localObject1).mPosition = i7;
              i8 = k;
              if (localObject1 == null)
              {
                localObject3 = this.mViewCacheExtension;
                if (localObject3 != null)
                {
                  localObject3 = this.mViewCacheExtension.getViewForPositionAndType(this, paramInt, i6);
                  if (localObject3 != null)
                  {
                    localObject1 = this.this$0.getChildViewHolder((View)localObject3);
                    if (localObject1 == null)
                    {
                      localObject1 = new java/lang/IllegalArgumentException;
                      localObject2 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject2).<init>();
                      localObject2 = ((StringBuilder)localObject2).append("getViewForPositionAndType returned a view which does not have a ViewHolder");
                      localObject3 = this.this$0.exceptionLabel();
                      localObject2 = (String)localObject3;
                      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
                      throw ((Throwable)localObject1);
                    }
                    bool1 = ((RecyclerView.ViewHolder)localObject1).shouldIgnore();
                    if (bool1)
                    {
                      localObject1 = new java/lang/IllegalArgumentException;
                      localObject2 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject2).<init>();
                      localObject2 = ((StringBuilder)localObject2).append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                      localObject3 = this.this$0.exceptionLabel();
                      localObject2 = (String)localObject3;
                      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
                      throw ((Throwable)localObject1);
                    }
                  }
                }
              }
              if (localObject1 == null)
              {
                localObject1 = getRecycledViewPool().getRecycledView(i6);
                if (localObject1 != null)
                {
                  ((RecyclerView.ViewHolder)localObject1).resetInternal();
                  bool1 = RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST;
                  if (bool1) {
                    invalidateDisplayListInt((RecyclerView.ViewHolder)localObject1);
                  }
                }
              }
              if (localObject1 == null)
              {
                localObject1 = this.this$0;
                long l2 = ((RecyclerView)localObject1).getNanoTime();
                l1 = Long.MAX_VALUE;
                n = paramLong < l1;
                if (n != 0)
                {
                  localObject1 = this.mRecyclerPool;
                  l1 = paramLong;
                  n = ((RecyclerView.RecycledViewPool)localObject1).willCreateInTime(i6, l2, paramLong);
                  if (n == 0)
                  {
                    i6 = 0;
                    localObject2 = null;
                    return (RecyclerView.ViewHolder)localObject2;
                  }
                }
                localObject1 = this.this$0.mAdapter;
                localObject5 = this.this$0;
                localObject1 = ((RecyclerView.Adapter)localObject1).createViewHolder((ViewGroup)localObject5, i6);
                bool5 = RecyclerView.access$800();
                if (bool5)
                {
                  localObject5 = RecyclerView.findNestedRecyclerView(((RecyclerView.ViewHolder)localObject1).itemView);
                  if (localObject5 != null)
                  {
                    WeakReference localWeakReference = new java/lang/ref/WeakReference;
                    localWeakReference.<init>(localObject5);
                    ((RecyclerView.ViewHolder)localObject1).mNestedRecyclerView = localWeakReference;
                  }
                }
                localObject5 = this.this$0;
                l1 = ((RecyclerView)localObject5).getNanoTime();
                localRecycledViewPool = this.mRecyclerPool;
                l2 = l1 - l2;
                localRecycledViewPool.factorInCreateTime(i6, l2);
              }
              localObject2 = localObject1;
            }
          }
        }
      }
      for (j = i8;; j = i4)
      {
        if (j != 0)
        {
          localObject1 = this.this$0.mState;
          n = ((RecyclerView.State)localObject1).isPreLayout();
          if (n == 0)
          {
            n = ((RecyclerView.ViewHolder)localObject2).hasAnyOfTheFlags(i);
            if (n != 0)
            {
              ((RecyclerView.ViewHolder)localObject2).setFlags(0, i);
              localObject1 = this.this$0.mState;
              n = ((RecyclerView.State)localObject1).mRunSimpleAnimations;
              if (n != 0)
              {
                int i1 = RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations((RecyclerView.ViewHolder)localObject2) | 0x1000;
                localObject3 = this.this$0.mItemAnimator;
                localObject4 = this.this$0.mState;
                localObject5 = ((RecyclerView.ViewHolder)localObject2).getUnmodifiedPayloads();
                localObject1 = ((RecyclerView.ItemAnimator)localObject3).recordPreLayoutInformation((RecyclerView.State)localObject4, (RecyclerView.ViewHolder)localObject2, i1, (List)localObject5);
                localObject3 = this.this$0;
                ((RecyclerView)localObject3).recordAnimationInfoIfBouncedHiddenView((RecyclerView.ViewHolder)localObject2, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject1);
              }
            }
          }
        }
        localObject1 = this.this$0.mState;
        i2 = ((RecyclerView.State)localObject1).isPreLayout();
        if (i2 != 0)
        {
          i2 = ((RecyclerView.ViewHolder)localObject2).isBound();
          if (i2 != 0)
          {
            ((RecyclerView.ViewHolder)localObject2).mPreLayoutPosition = paramInt;
            bool1 = false;
            localObject3 = null;
            f3 = 0.0F;
          }
        }
        for (;;)
        {
          label1142:
          localObject1 = ((RecyclerView.ViewHolder)localObject2).itemView.getLayoutParams();
          if (localObject1 == null)
          {
            localObject1 = (RecyclerView.LayoutParams)this.this$0.generateDefaultLayoutParams();
            localObject4 = ((RecyclerView.ViewHolder)localObject2).itemView;
            ((View)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject1);
            label1183:
            ((RecyclerView.LayoutParams)localObject1).mViewHolder = ((RecyclerView.ViewHolder)localObject2);
            if ((j == 0) || (!bool1)) {
              break label1348;
            }
          }
          for (;;)
          {
            ((RecyclerView.LayoutParams)localObject1).mPendingInvalidate = k;
            break;
            i2 = ((RecyclerView.ViewHolder)localObject2).isBound();
            if (i2 != 0)
            {
              i2 = ((RecyclerView.ViewHolder)localObject2).needsUpdate();
              if (i2 == 0)
              {
                i2 = ((RecyclerView.ViewHolder)localObject2).isInvalid();
                if (i2 == 0) {
                  break label1357;
                }
              }
            }
            i4 = this.this$0.mAdapterHelper.findPositionOffset(paramInt);
            localObject1 = this;
            i7 = paramInt;
            l1 = paramLong;
            i2 = tryBindViewHolderByDeadline((RecyclerView.ViewHolder)localObject2, i4, paramInt, paramLong);
            i4 = i2;
            break label1142;
            localObject4 = this.this$0;
            boolean bool4 = ((RecyclerView)localObject4).checkLayoutParams((ViewGroup.LayoutParams)localObject1);
            if (!bool4)
            {
              localObject1 = (RecyclerView.LayoutParams)this.this$0.generateLayoutParams((ViewGroup.LayoutParams)localObject1);
              localObject4 = ((RecyclerView.ViewHolder)localObject2).itemView;
              ((View)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject1);
              break label1183;
            }
            localObject1 = (RecyclerView.LayoutParams)localObject1;
            break label1183;
            label1348:
            k = 0;
            f1 = 0.0F;
          }
          label1357:
          i4 = 0;
          localObject3 = null;
          f3 = 0.0F;
        }
        i8 = i4;
        break;
        localObject2 = localObject1;
      }
      int i2 = 0;
      localObject1 = null;
      f2 = 0.0F;
      int i4 = 0;
      localObject3 = null;
      f3 = 0.0F;
    }
  }
  
  void unscrapView(RecyclerView.ViewHolder paramViewHolder)
  {
    boolean bool = RecyclerView.ViewHolder.access$1100(paramViewHolder);
    ArrayList localArrayList;
    if (bool)
    {
      localArrayList = this.mChangedScrap;
      localArrayList.remove(paramViewHolder);
    }
    for (;;)
    {
      RecyclerView.ViewHolder.access$1002(paramViewHolder, null);
      RecyclerView.ViewHolder.access$1102(paramViewHolder, false);
      paramViewHolder.clearReturnedFromScrapFlag();
      return;
      localArrayList = this.mAttachedScrap;
      localArrayList.remove(paramViewHolder);
    }
  }
  
  void updateViewCacheSize()
  {
    Object localObject = this.this$0.mLayout;
    int i;
    if (localObject != null)
    {
      localObject = this.this$0.mLayout;
      i = ((RecyclerView.LayoutManager)localObject).mPrefetchMaxCountObserved;
    }
    for (;;)
    {
      int j = this.mRequestedCacheMax;
      i += j;
      this.mViewCacheMax = i;
      localObject = this.mCachedViews;
      i = ((ArrayList)localObject).size() + -1;
      while (i >= 0)
      {
        ArrayList localArrayList = this.mCachedViews;
        j = localArrayList.size();
        int k = this.mViewCacheMax;
        if (j <= k) {
          break;
        }
        recycleCachedViewAt(i);
        i += -1;
      }
      i = 0;
      localObject = null;
    }
  }
  
  boolean validateViewHolderForOffsetPosition(RecyclerView.ViewHolder paramViewHolder)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    boolean bool2 = paramViewHolder.isRemoved();
    Object localObject2;
    if (bool2)
    {
      localObject2 = this.this$0.mState;
      bool1 = ((RecyclerView.State)localObject2).isPreLayout();
    }
    for (;;)
    {
      return bool1;
      int i = paramViewHolder.mPosition;
      int k;
      if (i >= 0)
      {
        i = paramViewHolder.mPosition;
        RecyclerView.Adapter localAdapter1 = this.this$0.mAdapter;
        k = localAdapter1.getItemCount();
        if (i < k) {}
      }
      else
      {
        localObject2 = new java/lang/IndexOutOfBoundsException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Inconsistency detected. Invalid view holder adapter position").append(paramViewHolder);
        localObject3 = this.this$0.exceptionLabel();
        localObject1 = (String)localObject3;
        ((IndexOutOfBoundsException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      Object localObject3 = this.this$0.mState;
      boolean bool3 = ((RecyclerView.State)localObject3).isPreLayout();
      if (!bool3)
      {
        localObject3 = this.this$0.mAdapter;
        k = paramViewHolder.mPosition;
        int j = ((RecyclerView.Adapter)localObject3).getItemViewType(k);
        k = paramViewHolder.getItemViewType();
        if (j != k)
        {
          bool1 = false;
          localObject2 = null;
          continue;
        }
      }
      localObject3 = this.this$0.mAdapter;
      boolean bool4 = ((RecyclerView.Adapter)localObject3).hasStableIds();
      if (bool4)
      {
        long l1 = paramViewHolder.getItemId();
        RecyclerView.Adapter localAdapter2 = this.this$0.mAdapter;
        int m = paramViewHolder.mPosition;
        long l2 = localAdapter2.getItemId(m);
        bool4 = l1 < l2;
        if (bool4)
        {
          bool1 = false;
          localObject2 = null;
        }
      }
    }
  }
  
  void viewRangeUpdate(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramInt2;
    Object localObject = this.mCachedViews;
    int j = ((ArrayList)localObject).size() + -1;
    int k = j;
    if (k >= 0)
    {
      localObject = (RecyclerView.ViewHolder)this.mCachedViews.get(k);
      if (localObject == null) {}
      for (;;)
      {
        j = k + -1;
        k = j;
        break;
        int m = ((RecyclerView.ViewHolder)localObject).mPosition;
        if ((m >= paramInt1) && (m < i))
        {
          m = 2;
          ((RecyclerView.ViewHolder)localObject).addFlags(m);
          recycleCachedViewAt(k);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$Recycler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */