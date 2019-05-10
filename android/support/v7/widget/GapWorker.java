package android.support.v7.widget;

import android.support.v4.os.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class GapWorker
  implements Runnable
{
  static final ThreadLocal sGapWorker;
  static Comparator sTaskComparator;
  long mFrameIntervalNs;
  long mPostTimeNs;
  ArrayList mRecyclerViews;
  private ArrayList mTasks;
  
  static
  {
    Object localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    sGapWorker = (ThreadLocal)localObject;
    localObject = new android/support/v7/widget/GapWorker$1;
    ((GapWorker.1)localObject).<init>();
    sTaskComparator = (Comparator)localObject;
  }
  
  GapWorker()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mRecyclerViews = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mTasks = localArrayList;
  }
  
  private void buildTaskList()
  {
    Object localObject1 = this.mRecyclerViews;
    int i = ((ArrayList)localObject1).size();
    int j = 0;
    int k = 0;
    Object localObject2 = null;
    int m;
    if (j < i)
    {
      localObject1 = (RecyclerView)this.mRecyclerViews.get(j);
      m = ((RecyclerView)localObject1).getWindowVisibility();
      if (m != 0) {
        break label384;
      }
      GapWorker.LayoutPrefetchRegistryImpl localLayoutPrefetchRegistryImpl1 = ((RecyclerView)localObject1).mPrefetchRegistry;
      localLayoutPrefetchRegistryImpl1.collectPrefetchPositionsFromView((RecyclerView)localObject1, false);
      localObject1 = ((RecyclerView)localObject1).mPrefetchRegistry;
    }
    label241:
    label351:
    label384:
    for (int n = ((GapWorker.LayoutPrefetchRegistryImpl)localObject1).mCount + k;; n = k)
    {
      j += 1;
      k = n;
      break;
      localObject1 = this.mTasks;
      ((ArrayList)localObject1).ensureCapacity(k);
      int i1 = 0;
      k = 0;
      localObject2 = null;
      if (i1 < i)
      {
        localObject1 = (RecyclerView)this.mRecyclerViews.get(i1);
        j = ((RecyclerView)localObject1).getWindowVisibility();
        if (j == 0) {}
      }
      for (;;)
      {
        n = i1 + 1;
        i1 = n;
        break;
        GapWorker.LayoutPrefetchRegistryImpl localLayoutPrefetchRegistryImpl2 = ((RecyclerView)localObject1).mPrefetchRegistry;
        j = Math.abs(localLayoutPrefetchRegistryImpl2.mPrefetchDx);
        m = Math.abs(localLayoutPrefetchRegistryImpl2.mPrefetchDy);
        int i2 = j + m;
        j = 0;
        m = k;
        k = localLayoutPrefetchRegistryImpl2.mCount * 2;
        if (j < k)
        {
          localObject2 = this.mTasks;
          k = ((ArrayList)localObject2).size();
          Object localObject3;
          int i3;
          int i4;
          if (m >= k)
          {
            localObject2 = new android/support/v7/widget/GapWorker$Task;
            ((GapWorker.Task)localObject2).<init>();
            localObject3 = this.mTasks;
            ((ArrayList)localObject3).add(localObject2);
            localObject3 = localLayoutPrefetchRegistryImpl2.mPrefetchArray;
            i3 = j + 1;
            i3 = localObject3[i3];
            if (i3 > i2) {
              break label351;
            }
            i4 = 1;
          }
          for (;;)
          {
            ((GapWorker.Task)localObject2).immediate = i4;
            ((GapWorker.Task)localObject2).viewVelocity = i2;
            ((GapWorker.Task)localObject2).distanceToItem = i3;
            ((GapWorker.Task)localObject2).view = ((RecyclerView)localObject1);
            localObject3 = localLayoutPrefetchRegistryImpl2.mPrefetchArray;
            i4 = localObject3[j];
            ((GapWorker.Task)localObject2).position = i4;
            m += 1;
            k = j + 2;
            j = k;
            break;
            localObject2 = (GapWorker.Task)this.mTasks.get(m);
            break label241;
            i4 = 0;
            localObject3 = null;
          }
          localObject1 = this.mTasks;
          localObject2 = sTaskComparator;
          Collections.sort((List)localObject1, (Comparator)localObject2);
          return;
        }
        k = m;
      }
    }
  }
  
  private void flushTaskWithDeadline(GapWorker.Task paramTask, long paramLong)
  {
    boolean bool1 = paramTask.immediate;
    if (bool1) {}
    for (long l = Long.MAX_VALUE;; l = paramLong)
    {
      RecyclerView localRecyclerView = paramTask.view;
      int i = paramTask.position;
      Object localObject = prefetchPositionWithDeadline(localRecyclerView, i, l);
      if (localObject != null)
      {
        WeakReference localWeakReference = ((RecyclerView.ViewHolder)localObject).mNestedRecyclerView;
        if (localWeakReference != null)
        {
          boolean bool2 = ((RecyclerView.ViewHolder)localObject).isBound();
          if (bool2)
          {
            bool2 = ((RecyclerView.ViewHolder)localObject).isInvalid();
            if (!bool2)
            {
              localObject = (RecyclerView)((RecyclerView.ViewHolder)localObject).mNestedRecyclerView.get();
              prefetchInnerRecyclerViewWithDeadline((RecyclerView)localObject, paramLong);
            }
          }
        }
      }
      return;
    }
  }
  
  private void flushTasksWithDeadline(long paramLong)
  {
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = this.mTasks;
      i = ((ArrayList)localObject).size();
      if (j < i)
      {
        localObject = (GapWorker.Task)this.mTasks.get(j);
        RecyclerView localRecyclerView = ((GapWorker.Task)localObject).view;
        if (localRecyclerView != null) {}
      }
      else
      {
        return;
      }
      flushTaskWithDeadline((GapWorker.Task)localObject, paramLong);
      ((GapWorker.Task)localObject).clear();
      i = j + 1;
    }
  }
  
  static boolean isPrefetchPositionAttached(RecyclerView paramRecyclerView, int paramInt)
  {
    boolean bool1 = false;
    int i = paramRecyclerView.mChildHelper.getUnfilteredChildCount();
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramRecyclerView.mChildHelper.getUnfilteredChildAt(j));
        int k = localViewHolder.mPosition;
        if (k == paramInt)
        {
          boolean bool2 = localViewHolder.isInvalid();
          if (!bool2) {
            bool1 = true;
          }
        }
      }
      else
      {
        return bool1;
      }
      j += 1;
    }
  }
  
  private void prefetchInnerRecyclerViewWithDeadline(RecyclerView paramRecyclerView, long paramLong)
  {
    if (paramRecyclerView == null) {}
    for (;;)
    {
      return;
      boolean bool = paramRecyclerView.mDataSetHasChangedAfterLayout;
      if (bool)
      {
        localObject1 = paramRecyclerView.mChildHelper;
        i = ((ChildHelper)localObject1).getUnfilteredChildCount();
        if (i != 0) {
          paramRecyclerView.removeAndRecycleViews();
        }
      }
      GapWorker.LayoutPrefetchRegistryImpl localLayoutPrefetchRegistryImpl = paramRecyclerView.mPrefetchRegistry;
      localLayoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(paramRecyclerView, true);
      int i = localLayoutPrefetchRegistryImpl.mCount;
      if (i == 0) {
        continue;
      }
      Object localObject1 = "RV Nested Prefetch";
      try
      {
        d.a((String)localObject1);
        localObject1 = paramRecyclerView.mState;
        Object localObject3 = paramRecyclerView.mAdapter;
        ((RecyclerView.State)localObject1).prepareForNestedPrefetch((RecyclerView.Adapter)localObject3);
        i = 0;
        localObject1 = null;
        for (;;)
        {
          int j = localLayoutPrefetchRegistryImpl.mCount * 2;
          if (i >= j) {
            break;
          }
          localObject3 = localLayoutPrefetchRegistryImpl.mPrefetchArray;
          j = localObject3[i];
          prefetchPositionWithDeadline(paramRecyclerView, j, paramLong);
          i += 2;
        }
        d.a();
      }
      finally
      {
        d.a();
      }
    }
  }
  
  /* Error */
  private RecyclerView.ViewHolder prefetchPositionWithDeadline(RecyclerView paramRecyclerView, int paramInt, long paramLong)
  {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: invokestatic 204	android/support/v7/widget/GapWorker:isPrefetchPositionAttached	(Landroid/support/v7/widget/RecyclerView;I)Z
    //   5: istore 5
    //   7: iload 5
    //   9: ifeq +12 -> 21
    //   12: iconst_0
    //   13: istore 5
    //   15: aconst_null
    //   16: astore 6
    //   18: aload 6
    //   20: areturn
    //   21: aload_1
    //   22: getfield 208	android/support/v7/widget/RecyclerView:mRecycler	Landroid/support/v7/widget/RecyclerView$Recycler;
    //   25: astore 7
    //   27: aload_1
    //   28: invokevirtual 211	android/support/v7/widget/RecyclerView:onEnterLayoutOrScroll	()V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 6
    //   37: aload 7
    //   39: iload_2
    //   40: iconst_0
    //   41: lload_3
    //   42: invokevirtual 217	android/support/v7/widget/RecyclerView$Recycler:tryGetViewHolderForPositionByDeadline	(IZJ)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    //   45: astore 6
    //   47: aload 6
    //   49: ifnull +41 -> 90
    //   52: aload 6
    //   54: invokevirtual 131	android/support/v7/widget/RecyclerView$ViewHolder:isBound	()Z
    //   57: istore 8
    //   59: iload 8
    //   61: ifeq +37 -> 98
    //   64: aload 6
    //   66: invokevirtual 134	android/support/v7/widget/RecyclerView$ViewHolder:isInvalid	()Z
    //   69: istore 8
    //   71: iload 8
    //   73: ifne +25 -> 98
    //   76: aload 6
    //   78: getfield 221	android/support/v7/widget/RecyclerView$ViewHolder:itemView	Landroid/view/View;
    //   81: astore 9
    //   83: aload 7
    //   85: aload 9
    //   87: invokevirtual 225	android/support/v7/widget/RecyclerView$Recycler:recycleView	(Landroid/view/View;)V
    //   90: aload_1
    //   91: iconst_0
    //   92: invokevirtual 229	android/support/v7/widget/RecyclerView:onExitLayoutOrScroll	(Z)V
    //   95: goto -77 -> 18
    //   98: iconst_0
    //   99: istore 8
    //   101: aconst_null
    //   102: astore 9
    //   104: aload 7
    //   106: aload 6
    //   108: iconst_0
    //   109: invokevirtual 233	android/support/v7/widget/RecyclerView$Recycler:addViewHolderToRecycledViewPool	(Landroid/support/v7/widget/RecyclerView$ViewHolder;Z)V
    //   112: goto -22 -> 90
    //   115: astore 6
    //   117: aload_1
    //   118: iconst_0
    //   119: invokevirtual 229	android/support/v7/widget/RecyclerView:onExitLayoutOrScroll	(Z)V
    //   122: aload 6
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	GapWorker
    //   0	125	1	paramRecyclerView	RecyclerView
    //   0	125	2	paramInt	int
    //   0	125	3	paramLong	long
    //   5	28	5	bool1	boolean
    //   16	91	6	localViewHolder	RecyclerView.ViewHolder
    //   115	8	6	localObject	Object
    //   25	80	7	localRecycler	RecyclerView.Recycler
    //   57	43	8	bool2	boolean
    //   81	22	9	localView	android.view.View
    // Exception table:
    //   from	to	target	type
    //   27	31	115	finally
    //   41	45	115	finally
    //   52	57	115	finally
    //   64	69	115	finally
    //   76	81	115	finally
    //   85	90	115	finally
    //   108	112	115	finally
  }
  
  public void add(RecyclerView paramRecyclerView)
  {
    this.mRecyclerViews.add(paramRecyclerView);
  }
  
  void postFromTraversal(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    boolean bool = paramRecyclerView.isAttachedToWindow();
    if (bool)
    {
      long l1 = this.mPostTimeNs;
      long l2 = 0L;
      bool = l1 < l2;
      if (!bool)
      {
        l1 = paramRecyclerView.getNanoTime();
        this.mPostTimeNs = l1;
        paramRecyclerView.post(this);
      }
    }
    paramRecyclerView.mPrefetchRegistry.setPrefetchVector(paramInt1, paramInt2);
  }
  
  void prefetch(long paramLong)
  {
    buildTaskList();
    flushTasksWithDeadline(paramLong);
  }
  
  public void remove(RecyclerView paramRecyclerView)
  {
    this.mRecyclerViews.remove(paramRecyclerView);
  }
  
  public void run()
  {
    long l1 = 0L;
    Object localObject1 = "RV Prefetch";
    for (;;)
    {
      try
      {
        d.a((String)localObject1);
        localObject1 = this.mRecyclerViews;
        boolean bool = ((ArrayList)localObject1).isEmpty();
        if (bool) {
          return;
        }
        localObject1 = this.mRecyclerViews;
        int i = ((ArrayList)localObject1).size();
        bool = false;
        localObject1 = null;
        int j = 0;
        long l2 = l1;
        if (j < i)
        {
          localObject1 = this.mRecyclerViews;
          localObject1 = ((ArrayList)localObject1).get(j);
          localObject1 = (RecyclerView)localObject1;
          int k = ((RecyclerView)localObject1).getWindowVisibility();
          if (k == 0)
          {
            l3 = ((RecyclerView)localObject1).getDrawingTime();
            l3 = Math.max(l3, l2);
            int m = j + 1;
            j = m;
            l2 = l3;
          }
        }
        else
        {
          bool = l2 < l1;
          if (!bool)
          {
            this.mPostTimeNs = l1;
            d.a();
            continue;
          }
          localObject1 = TimeUnit.MILLISECONDS;
          l3 = ((TimeUnit)localObject1).toNanos(l2);
          l2 = this.mFrameIntervalNs;
          l3 += l2;
          prefetch(l3);
          this.mPostTimeNs = l1;
          d.a();
          continue;
        }
        long l3 = l2;
      }
      finally
      {
        this.mPostTimeNs = l1;
        d.a();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\GapWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */