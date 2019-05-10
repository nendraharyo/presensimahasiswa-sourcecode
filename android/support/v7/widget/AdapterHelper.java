package android.support.v7.widget;

import android.support.v4.h.k.a;
import android.support.v4.h.k.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AdapterHelper
  implements OpReorderer.Callback
{
  private static final boolean DEBUG = false;
  static final int POSITION_TYPE_INVISIBLE = 0;
  static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
  private static final String TAG = "AHT";
  final AdapterHelper.Callback mCallback;
  final boolean mDisableRecycler;
  private int mExistingUpdateTypes;
  Runnable mOnItemProcessedCallback;
  final OpReorderer mOpReorderer;
  final ArrayList mPendingUpdates;
  final ArrayList mPostponedList;
  private k.a mUpdateOpPool;
  
  AdapterHelper(AdapterHelper.Callback paramCallback)
  {
    this(paramCallback, false);
  }
  
  AdapterHelper(AdapterHelper.Callback paramCallback, boolean paramBoolean)
  {
    Object localObject = new android/support/v4/h/k$b;
    ((k.b)localObject).<init>(30);
    this.mUpdateOpPool = ((k.a)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mPendingUpdates = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mPostponedList = ((ArrayList)localObject);
    this.mExistingUpdateTypes = 0;
    this.mCallback = paramCallback;
    this.mDisableRecycler = paramBoolean;
    localObject = new android/support/v7/widget/OpReorderer;
    ((OpReorderer)localObject).<init>(this);
    this.mOpReorderer = ((OpReorderer)localObject);
  }
  
  private void applyAdd(AdapterHelper.UpdateOp paramUpdateOp)
  {
    postponeAndUpdateViewHolders(paramUpdateOp);
  }
  
  private void applyMove(AdapterHelper.UpdateOp paramUpdateOp)
  {
    postponeAndUpdateViewHolders(paramUpdateOp);
  }
  
  private void applyRemove(AdapterHelper.UpdateOp paramUpdateOp)
  {
    int i = 2;
    int j = 1;
    int k = paramUpdateOp.positionStart;
    int m = paramUpdateOp.positionStart;
    int i1 = paramUpdateOp.itemCount;
    int i2 = m + i1;
    int i3 = -1;
    i1 = paramUpdateOp.positionStart;
    int i4 = 0;
    Object localObject;
    boolean bool;
    if (i1 < i2)
    {
      localObject = this.mCallback.findViewHolder(i1);
      if (localObject == null)
      {
        bool = canFindInPreLayout(i1);
        if (!bool) {}
      }
      else
      {
        if (i3 != 0) {
          break label266;
        }
        localObject = obtainUpdateOp(i, k, i4, null);
        dispatchAndUpdateViewHolders((AdapterHelper.UpdateOp)localObject);
        bool = j;
      }
    }
    for (;;)
    {
      i3 = j;
      if (bool)
      {
        n = i1 - i4;
        i1 = i2 - i4;
        i2 = j;
        label130:
        n += 1;
        i4 = i2;
        i2 = i1;
        i1 = n;
        break;
        if (i3 != j) {
          break label257;
        }
        localObject = obtainUpdateOp(i, k, i4, null);
        postponeAndUpdateViewHolders((AdapterHelper.UpdateOp)localObject);
        n = j;
      }
      for (;;)
      {
        i3 = 0;
        break;
        n = i4 + 1;
        int i5 = i1;
        i1 = i2;
        i2 = n;
        n = i5;
        break label130;
        n = paramUpdateOp.itemCount;
        if (i4 != n)
        {
          recycleUpdateOp(paramUpdateOp);
          paramUpdateOp = obtainUpdateOp(i, k, i4, null);
        }
        if (i3 == 0) {
          dispatchAndUpdateViewHolders(paramUpdateOp);
        }
        for (;;)
        {
          return;
          postponeAndUpdateViewHolders(paramUpdateOp);
        }
        label257:
        n = 0;
        localObject = null;
      }
      label266:
      int n = 0;
      localObject = null;
    }
  }
  
  private void applyUpdate(AdapterHelper.UpdateOp paramUpdateOp)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    int j = 4;
    int k = 0;
    Object localObject1 = null;
    int m = paramUpdateOp.positionStart;
    int n = paramUpdateOp.positionStart;
    int i1 = paramUpdateOp.itemCount;
    int i2 = n + i1;
    i1 = paramUpdateOp.positionStart;
    int i3 = -1;
    n = 0;
    AdapterHelper.UpdateOp localUpdateOp = null;
    if (i1 < i2)
    {
      RecyclerView.ViewHolder localViewHolder = this.mCallback.findViewHolder(i1);
      Object localObject2;
      if (localViewHolder == null)
      {
        boolean bool = canFindInPreLayout(i1);
        if (!bool) {}
      }
      else
      {
        if (i3 == 0)
        {
          localObject2 = paramUpdateOp.payload;
          localUpdateOp = obtainUpdateOp(j, m, n, localObject2);
          dispatchAndUpdateViewHolders(localUpdateOp);
          n = 0;
          localUpdateOp = null;
          m = i1;
        }
        i3 = m;
        m = n;
        n = i;
      }
      for (;;)
      {
        m += 1;
        i1 += 1;
        int i4 = n;
        n = m;
        m = i3;
        i3 = i4;
        break;
        if (i3 == i)
        {
          localObject2 = paramUpdateOp.payload;
          localUpdateOp = obtainUpdateOp(j, m, n, localObject2);
          postponeAndUpdateViewHolders(localUpdateOp);
          n = 0;
          localUpdateOp = null;
          m = i1;
        }
        i3 = m;
        m = n;
        n = 0;
        localUpdateOp = null;
      }
    }
    k = paramUpdateOp.itemCount;
    if (n != k)
    {
      localObject1 = paramUpdateOp.payload;
      recycleUpdateOp(paramUpdateOp);
      paramUpdateOp = obtainUpdateOp(j, m, n, localObject1);
    }
    if (i3 == 0) {
      dispatchAndUpdateViewHolders(paramUpdateOp);
    }
    for (;;)
    {
      return;
      postponeAndUpdateViewHolders(paramUpdateOp);
    }
  }
  
  private boolean canFindInPreLayout(int paramInt)
  {
    int i = 1;
    Object localObject = this.mPostponedList;
    int j = ((ArrayList)localObject).size();
    int k = 0;
    int m;
    int n;
    int i1;
    if (k < j)
    {
      localObject = (AdapterHelper.UpdateOp)this.mPostponedList.get(k);
      m = ((AdapterHelper.UpdateOp)localObject).cmd;
      n = 8;
      if (m == n)
      {
        i1 = ((AdapterHelper.UpdateOp)localObject).itemCount;
        m = k + 1;
        i1 = findPositionOffset(i1, m);
        if (i1 != paramInt) {
          break label168;
        }
        i1 = i;
      }
    }
    for (;;)
    {
      return i1;
      m = ((AdapterHelper.UpdateOp)localObject).cmd;
      if (m == i)
      {
        m = ((AdapterHelper.UpdateOp)localObject).positionStart;
        n = ((AdapterHelper.UpdateOp)localObject).itemCount;
        m += n;
        i1 = ((AdapterHelper.UpdateOp)localObject).positionStart;
        for (;;)
        {
          if (i1 >= m) {
            break label168;
          }
          n = k + 1;
          n = findPositionOffset(i1, n);
          if (n == paramInt)
          {
            i1 = i;
            break;
          }
          i1 += 1;
        }
      }
      label168:
      i1 = k + 1;
      k = i1;
      break;
      i1 = 0;
      localObject = null;
    }
  }
  
  private void dispatchAndUpdateViewHolders(AdapterHelper.UpdateOp paramUpdateOp)
  {
    int i = 1;
    int j = paramUpdateOp.cmd;
    if (j != i)
    {
      j = paramUpdateOp.cmd;
      k = 8;
      if (j != k) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("should not dispatch add or move for pre layout");
      throw ((Throwable)localObject1);
    }
    j = paramUpdateOp.positionStart;
    int k = paramUpdateOp.cmd;
    int m = updatePositionWithPostponed(j, k);
    k = paramUpdateOp.positionStart;
    j = paramUpdateOp.cmd;
    int n;
    int i1;
    label157:
    int i2;
    int i3;
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "op should be remove or update." + paramUpdateOp;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 4: 
      j = i;
      n = i;
      i1 = m;
      m = k;
      k = i;
      i2 = paramUpdateOp.itemCount;
      if (k >= i2) {
        break label388;
      }
      i2 = paramUpdateOp.positionStart;
      i3 = j * k;
      i2 += i3;
      i3 = paramUpdateOp.cmd;
      i3 = updatePositionWithPostponed(i2, i3);
      i2 = paramUpdateOp.cmd;
      switch (i2)
      {
      default: 
        i2 = 0;
        label243:
        if (i2 != 0) {
          n += 1;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      k += 1;
      break label157;
      j = 0;
      localObject1 = null;
      break;
      i2 = i1 + 1;
      if (i3 == i2)
      {
        i2 = i;
        break label243;
      }
      i2 = 0;
      break label243;
      if (i3 == i1)
      {
        i2 = i;
        break label243;
      }
      i2 = 0;
      break label243;
      i2 = paramUpdateOp.cmd;
      Object localObject3 = paramUpdateOp.payload;
      AdapterHelper.UpdateOp localUpdateOp = obtainUpdateOp(i2, i1, n, localObject3);
      dispatchFirstPassAndUpdateViewHolders(localUpdateOp, m);
      recycleUpdateOp(localUpdateOp);
      i1 = paramUpdateOp.cmd;
      i2 = 4;
      if (i1 == i2) {
        m += n;
      }
      n = i;
      i1 = i3;
    }
    label388:
    Object localObject1 = paramUpdateOp.payload;
    recycleUpdateOp(paramUpdateOp);
    if (n > 0)
    {
      i = paramUpdateOp.cmd;
      localObject1 = obtainUpdateOp(i, i1, n, localObject1);
      dispatchFirstPassAndUpdateViewHolders((AdapterHelper.UpdateOp)localObject1, m);
      recycleUpdateOp((AdapterHelper.UpdateOp)localObject1);
    }
  }
  
  private void postponeAndUpdateViewHolders(AdapterHelper.UpdateOp paramUpdateOp)
  {
    Object localObject1 = this.mPostponedList;
    ((ArrayList)localObject1).add(paramUpdateOp);
    int i = paramUpdateOp.cmd;
    int j;
    int k;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unknown update op type for " + paramUpdateOp;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = this.mCallback;
      j = paramUpdateOp.positionStart;
      k = paramUpdateOp.itemCount;
      ((AdapterHelper.Callback)localObject1).offsetPositionsForAdd(j, k);
    }
    for (;;)
    {
      return;
      localObject1 = this.mCallback;
      j = paramUpdateOp.positionStart;
      k = paramUpdateOp.itemCount;
      ((AdapterHelper.Callback)localObject1).offsetPositionsForMove(j, k);
      continue;
      localObject1 = this.mCallback;
      j = paramUpdateOp.positionStart;
      k = paramUpdateOp.itemCount;
      ((AdapterHelper.Callback)localObject1).offsetPositionsForRemovingLaidOutOrNewView(j, k);
      continue;
      localObject1 = this.mCallback;
      j = paramUpdateOp.positionStart;
      k = paramUpdateOp.itemCount;
      Object localObject3 = paramUpdateOp.payload;
      ((AdapterHelper.Callback)localObject1).markViewHoldersUpdated(j, k, localObject3);
    }
  }
  
  private int updatePositionWithPostponed(int paramInt1, int paramInt2)
  {
    int i = 8;
    int j = 2;
    int k = 1;
    Object localObject = this.mPostponedList;
    int m = ((ArrayList)localObject).size() + -1;
    int n = m;
    int i1 = paramInt1;
    int i3;
    if (n >= 0)
    {
      localObject = (AdapterHelper.UpdateOp)this.mPostponedList.get(n);
      i2 = ((AdapterHelper.UpdateOp)localObject).cmd;
      if (i2 == i)
      {
        i2 = ((AdapterHelper.UpdateOp)localObject).positionStart;
        i3 = ((AdapterHelper.UpdateOp)localObject).itemCount;
        if (i2 < i3)
        {
          i3 = ((AdapterHelper.UpdateOp)localObject).positionStart;
          i2 = ((AdapterHelper.UpdateOp)localObject).itemCount;
          label98:
          if ((i1 < i3) || (i1 > i2)) {
            break label269;
          }
          i2 = ((AdapterHelper.UpdateOp)localObject).positionStart;
          if (i3 != i2) {
            break label213;
          }
          if (paramInt2 != k) {
            break label188;
          }
          i2 = ((AdapterHelper.UpdateOp)localObject).itemCount + 1;
          ((AdapterHelper.UpdateOp)localObject).itemCount = i2;
          label148:
          m = i1 + 1;
          label154:
          i1 = m;
        }
      }
      for (;;)
      {
        m = n + -1;
        n = m;
        break;
        i3 = ((AdapterHelper.UpdateOp)localObject).itemCount;
        i2 = ((AdapterHelper.UpdateOp)localObject).positionStart;
        break label98;
        label188:
        if (paramInt2 != j) {
          break label148;
        }
        i2 = ((AdapterHelper.UpdateOp)localObject).itemCount + -1;
        ((AdapterHelper.UpdateOp)localObject).itemCount = i2;
        break label148;
        label213:
        if (paramInt2 == k)
        {
          i2 = ((AdapterHelper.UpdateOp)localObject).positionStart + 1;
          ((AdapterHelper.UpdateOp)localObject).positionStart = i2;
        }
        for (;;)
        {
          m = i1 + -1;
          break;
          if (paramInt2 == j)
          {
            i2 = ((AdapterHelper.UpdateOp)localObject).positionStart + -1;
            ((AdapterHelper.UpdateOp)localObject).positionStart = i2;
          }
        }
        label269:
        i2 = ((AdapterHelper.UpdateOp)localObject).positionStart;
        if (i1 < i2)
        {
          if (paramInt2 == k)
          {
            i2 = ((AdapterHelper.UpdateOp)localObject).positionStart + 1;
            ((AdapterHelper.UpdateOp)localObject).positionStart = i2;
            i2 = ((AdapterHelper.UpdateOp)localObject).itemCount + 1;
            ((AdapterHelper.UpdateOp)localObject).itemCount = i2;
            m = i1;
            break label154;
          }
          if (paramInt2 == j)
          {
            i2 = ((AdapterHelper.UpdateOp)localObject).positionStart + -1;
            ((AdapterHelper.UpdateOp)localObject).positionStart = i2;
            i2 = ((AdapterHelper.UpdateOp)localObject).itemCount + -1;
            ((AdapterHelper.UpdateOp)localObject).itemCount = i2;
          }
        }
        m = i1;
        break label154;
        i2 = ((AdapterHelper.UpdateOp)localObject).positionStart;
        if (i2 <= i1)
        {
          i2 = ((AdapterHelper.UpdateOp)localObject).cmd;
          if (i2 == k)
          {
            m = ((AdapterHelper.UpdateOp)localObject).itemCount;
            i1 -= m;
          }
          else
          {
            i2 = ((AdapterHelper.UpdateOp)localObject).cmd;
            if (i2 == j)
            {
              m = ((AdapterHelper.UpdateOp)localObject).itemCount;
              i1 += m;
            }
          }
        }
        else if (paramInt2 == k)
        {
          i2 = ((AdapterHelper.UpdateOp)localObject).positionStart + 1;
          ((AdapterHelper.UpdateOp)localObject).positionStart = i2;
        }
        else if (paramInt2 == j)
        {
          i2 = ((AdapterHelper.UpdateOp)localObject).positionStart + -1;
          ((AdapterHelper.UpdateOp)localObject).positionStart = i2;
        }
      }
    }
    localObject = this.mPostponedList;
    m = ((ArrayList)localObject).size() + -1;
    int i2 = m;
    if (i2 >= 0)
    {
      localObject = (AdapterHelper.UpdateOp)this.mPostponedList.get(i2);
      i3 = ((AdapterHelper.UpdateOp)localObject).cmd;
      ArrayList localArrayList;
      if (i3 == i)
      {
        i3 = ((AdapterHelper.UpdateOp)localObject).itemCount;
        n = ((AdapterHelper.UpdateOp)localObject).positionStart;
        if (i3 != n)
        {
          i3 = ((AdapterHelper.UpdateOp)localObject).itemCount;
          if (i3 >= 0) {}
        }
        else
        {
          localArrayList = this.mPostponedList;
          localArrayList.remove(i2);
          recycleUpdateOp((AdapterHelper.UpdateOp)localObject);
        }
      }
      for (;;)
      {
        m = i2 + -1;
        i2 = m;
        break;
        i3 = ((AdapterHelper.UpdateOp)localObject).itemCount;
        if (i3 <= 0)
        {
          localArrayList = this.mPostponedList;
          localArrayList.remove(i2);
          recycleUpdateOp((AdapterHelper.UpdateOp)localObject);
        }
      }
    }
    return i1;
  }
  
  AdapterHelper addUpdateOp(AdapterHelper.UpdateOp... paramVarArgs)
  {
    Collections.addAll(this.mPendingUpdates, paramVarArgs);
    return this;
  }
  
  public int applyPendingUpdatesToPosition(int paramInt)
  {
    int i = this.mPendingUpdates.size();
    int j = 0;
    AdapterHelper.UpdateOp localUpdateOp = null;
    int k = 0;
    int m = paramInt;
    int n;
    if (k < i)
    {
      localUpdateOp = (AdapterHelper.UpdateOp)this.mPendingUpdates.get(k);
      n = localUpdateOp.cmd;
      switch (n)
      {
      }
    }
    for (;;)
    {
      j = k + 1;
      k = j;
      break;
      n = localUpdateOp.positionStart;
      if (n <= m)
      {
        j = localUpdateOp.itemCount;
        m += j;
        continue;
        n = localUpdateOp.positionStart;
        if (n <= m)
        {
          n = localUpdateOp.positionStart;
          int i1 = localUpdateOp.itemCount;
          n += i1;
          if (n > m)
          {
            m = -1;
            return m;
          }
          j = localUpdateOp.itemCount;
          m -= j;
          continue;
          n = localUpdateOp.positionStart;
          if (n == m)
          {
            m = localUpdateOp.itemCount;
          }
          else
          {
            n = localUpdateOp.positionStart;
            if (n < m) {
              m += -1;
            }
            j = localUpdateOp.itemCount;
            if (j <= m) {
              m += 1;
            }
          }
        }
      }
    }
  }
  
  void consumePostponedUpdates()
  {
    Object localObject = this.mPostponedList;
    int i = ((ArrayList)localObject).size();
    int k;
    for (int j = 0; j < i; j = k)
    {
      AdapterHelper.Callback localCallback = this.mCallback;
      localObject = (AdapterHelper.UpdateOp)this.mPostponedList.get(j);
      localCallback.onDispatchSecondPass((AdapterHelper.UpdateOp)localObject);
      k = j + 1;
    }
    localObject = this.mPostponedList;
    recycleUpdateOpsAndClearList((List)localObject);
    this.mExistingUpdateTypes = 0;
  }
  
  void consumeUpdatesInOnePass()
  {
    consumePostponedUpdates();
    Object localObject = this.mPendingUpdates;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = (AdapterHelper.UpdateOp)this.mPendingUpdates.get(j);
      int k = ((AdapterHelper.UpdateOp)localObject).cmd;
      switch (k)
      {
      }
      for (;;)
      {
        localObject = this.mOnItemProcessedCallback;
        if (localObject != null)
        {
          localObject = this.mOnItemProcessedCallback;
          ((Runnable)localObject).run();
        }
        int m = j + 1;
        j = m;
        break;
        this.mCallback.onDispatchSecondPass((AdapterHelper.UpdateOp)localObject);
        AdapterHelper.Callback localCallback = this.mCallback;
        int n = ((AdapterHelper.UpdateOp)localObject).positionStart;
        m = ((AdapterHelper.UpdateOp)localObject).itemCount;
        localCallback.offsetPositionsForAdd(n, m);
        continue;
        this.mCallback.onDispatchSecondPass((AdapterHelper.UpdateOp)localObject);
        localCallback = this.mCallback;
        n = ((AdapterHelper.UpdateOp)localObject).positionStart;
        m = ((AdapterHelper.UpdateOp)localObject).itemCount;
        localCallback.offsetPositionsForRemovingInvisible(n, m);
        continue;
        this.mCallback.onDispatchSecondPass((AdapterHelper.UpdateOp)localObject);
        localCallback = this.mCallback;
        n = ((AdapterHelper.UpdateOp)localObject).positionStart;
        int i1 = ((AdapterHelper.UpdateOp)localObject).itemCount;
        localObject = ((AdapterHelper.UpdateOp)localObject).payload;
        localCallback.markViewHoldersUpdated(n, i1, localObject);
        continue;
        this.mCallback.onDispatchSecondPass((AdapterHelper.UpdateOp)localObject);
        localCallback = this.mCallback;
        n = ((AdapterHelper.UpdateOp)localObject).positionStart;
        m = ((AdapterHelper.UpdateOp)localObject).itemCount;
        localCallback.offsetPositionsForMove(n, m);
      }
    }
    localObject = this.mPendingUpdates;
    recycleUpdateOpsAndClearList((List)localObject);
    this.mExistingUpdateTypes = 0;
  }
  
  void dispatchFirstPassAndUpdateViewHolders(AdapterHelper.UpdateOp paramUpdateOp, int paramInt)
  {
    Object localObject1 = this.mCallback;
    ((AdapterHelper.Callback)localObject1).onDispatchFirstPass(paramUpdateOp);
    int i = paramUpdateOp.cmd;
    int j;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("only remove and update ops can be dispatched in first pass");
      throw ((Throwable)localObject1);
    case 2: 
      localObject1 = this.mCallback;
      j = paramUpdateOp.itemCount;
      ((AdapterHelper.Callback)localObject1).offsetPositionsForRemovingInvisible(paramInt, j);
    }
    for (;;)
    {
      return;
      localObject1 = this.mCallback;
      j = paramUpdateOp.itemCount;
      Object localObject2 = paramUpdateOp.payload;
      ((AdapterHelper.Callback)localObject1).markViewHoldersUpdated(paramInt, j, localObject2);
    }
  }
  
  int findPositionOffset(int paramInt)
  {
    return findPositionOffset(paramInt, 0);
  }
  
  int findPositionOffset(int paramInt1, int paramInt2)
  {
    Object localObject = this.mPostponedList;
    int i = ((ArrayList)localObject).size();
    int j = paramInt1;
    int k;
    int m;
    if (paramInt2 < i)
    {
      localObject = (AdapterHelper.UpdateOp)this.mPostponedList.get(paramInt2);
      k = ((AdapterHelper.UpdateOp)localObject).cmd;
      m = 8;
      if (k == m)
      {
        k = ((AdapterHelper.UpdateOp)localObject).positionStart;
        if (k == j) {
          j = ((AdapterHelper.UpdateOp)localObject).itemCount;
        }
      }
    }
    for (;;)
    {
      paramInt2 += 1;
      break;
      k = ((AdapterHelper.UpdateOp)localObject).positionStart;
      if (k < j) {
        j += -1;
      }
      int n = ((AdapterHelper.UpdateOp)localObject).itemCount;
      if (n <= j)
      {
        j += 1;
        continue;
        k = ((AdapterHelper.UpdateOp)localObject).positionStart;
        if (k <= j)
        {
          k = ((AdapterHelper.UpdateOp)localObject).cmd;
          m = 2;
          if (k == m)
          {
            k = ((AdapterHelper.UpdateOp)localObject).positionStart;
            m = ((AdapterHelper.UpdateOp)localObject).itemCount;
            k += m;
            if (j < k)
            {
              j = -1;
              return j;
            }
            n = ((AdapterHelper.UpdateOp)localObject).itemCount;
            j -= n;
          }
          else
          {
            k = ((AdapterHelper.UpdateOp)localObject).cmd;
            m = 1;
            if (k == m)
            {
              n = ((AdapterHelper.UpdateOp)localObject).itemCount;
              j += n;
            }
          }
        }
      }
    }
  }
  
  boolean hasAnyUpdateTypes(int paramInt)
  {
    int i = this.mExistingUpdateTypes & paramInt;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean hasPendingUpdates()
  {
    ArrayList localArrayList = this.mPendingUpdates;
    int i = localArrayList.size();
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localArrayList = null;
    }
  }
  
  boolean hasUpdates()
  {
    ArrayList localArrayList = this.mPostponedList;
    boolean bool = localArrayList.isEmpty();
    if (!bool)
    {
      localArrayList = this.mPendingUpdates;
      bool = localArrayList.isEmpty();
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localArrayList = null;
    }
  }
  
  public AdapterHelper.UpdateOp obtainUpdateOp(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    AdapterHelper.UpdateOp localUpdateOp = (AdapterHelper.UpdateOp)this.mUpdateOpPool.acquire();
    if (localUpdateOp == null)
    {
      localUpdateOp = new android/support/v7/widget/AdapterHelper$UpdateOp;
      localUpdateOp.<init>(paramInt1, paramInt2, paramInt3, paramObject);
    }
    for (;;)
    {
      return localUpdateOp;
      localUpdateOp.cmd = paramInt1;
      localUpdateOp.positionStart = paramInt2;
      localUpdateOp.itemCount = paramInt3;
      localUpdateOp.payload = paramObject;
    }
  }
  
  boolean onItemRangeChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    boolean bool = false;
    int i = 1;
    if (paramInt2 < i) {
      return bool;
    }
    ArrayList localArrayList = this.mPendingUpdates;
    int j = 4;
    AdapterHelper.UpdateOp localUpdateOp = obtainUpdateOp(j, paramInt1, paramInt2, paramObject);
    localArrayList.add(localUpdateOp);
    int k = this.mExistingUpdateTypes | 0x4;
    this.mExistingUpdateTypes = k;
    localArrayList = this.mPendingUpdates;
    k = localArrayList.size();
    if (k == i) {}
    for (;;)
    {
      bool = i;
      break;
      i = 0;
    }
  }
  
  boolean onItemRangeInserted(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    int i = 1;
    if (paramInt2 < i) {
      return bool;
    }
    ArrayList localArrayList = this.mPendingUpdates;
    AdapterHelper.UpdateOp localUpdateOp = obtainUpdateOp(i, paramInt1, paramInt2, null);
    localArrayList.add(localUpdateOp);
    int j = this.mExistingUpdateTypes | 0x1;
    this.mExistingUpdateTypes = j;
    localArrayList = this.mPendingUpdates;
    j = localArrayList.size();
    if (j == i) {}
    for (;;)
    {
      bool = i;
      break;
      i = 0;
    }
  }
  
  boolean onItemRangeMoved(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    int i = 1;
    if (paramInt1 == paramInt2) {
      return bool;
    }
    IllegalArgumentException localIllegalArgumentException;
    if (paramInt3 != i)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Moving more than 1 item is not supported yet");
      throw localIllegalArgumentException;
    }
    ArrayList localArrayList = this.mPendingUpdates;
    int j = 8;
    AdapterHelper.UpdateOp localUpdateOp = obtainUpdateOp(j, paramInt1, paramInt2, null);
    localArrayList.add(localUpdateOp);
    int k = this.mExistingUpdateTypes | 0x8;
    this.mExistingUpdateTypes = k;
    localArrayList = this.mPendingUpdates;
    k = localArrayList.size();
    if (k == i) {}
    for (;;)
    {
      bool = i;
      break;
      i = 0;
      localIllegalArgumentException = null;
    }
  }
  
  boolean onItemRangeRemoved(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    int i = 1;
    if (paramInt2 < i) {
      return bool;
    }
    ArrayList localArrayList = this.mPendingUpdates;
    int j = 2;
    AdapterHelper.UpdateOp localUpdateOp = obtainUpdateOp(j, paramInt1, paramInt2, null);
    localArrayList.add(localUpdateOp);
    int k = this.mExistingUpdateTypes | 0x2;
    this.mExistingUpdateTypes = k;
    localArrayList = this.mPendingUpdates;
    k = localArrayList.size();
    if (k == i) {}
    for (;;)
    {
      bool = i;
      break;
      i = 0;
    }
  }
  
  void preProcess()
  {
    Object localObject = this.mOpReorderer;
    ArrayList localArrayList = this.mPendingUpdates;
    ((OpReorderer)localObject).reorderOps(localArrayList);
    int i = this.mPendingUpdates.size();
    int j = 0;
    localObject = null;
    int k = 0;
    localArrayList = null;
    if (k < i)
    {
      localObject = (AdapterHelper.UpdateOp)this.mPendingUpdates.get(k);
      int m = ((AdapterHelper.UpdateOp)localObject).cmd;
      switch (m)
      {
      }
      for (;;)
      {
        localObject = this.mOnItemProcessedCallback;
        if (localObject != null)
        {
          localObject = this.mOnItemProcessedCallback;
          ((Runnable)localObject).run();
        }
        j = k + 1;
        k = j;
        break;
        applyAdd((AdapterHelper.UpdateOp)localObject);
        continue;
        applyRemove((AdapterHelper.UpdateOp)localObject);
        continue;
        applyUpdate((AdapterHelper.UpdateOp)localObject);
        continue;
        applyMove((AdapterHelper.UpdateOp)localObject);
      }
    }
    this.mPendingUpdates.clear();
  }
  
  public void recycleUpdateOp(AdapterHelper.UpdateOp paramUpdateOp)
  {
    boolean bool = this.mDisableRecycler;
    if (!bool)
    {
      bool = false;
      paramUpdateOp.payload = null;
      k.a locala = this.mUpdateOpPool;
      locala.release(paramUpdateOp);
    }
  }
  
  void recycleUpdateOpsAndClearList(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    AdapterHelper.UpdateOp localUpdateOp = null;
    for (int k = 0; k < i; k = j)
    {
      localUpdateOp = (AdapterHelper.UpdateOp)paramList.get(k);
      recycleUpdateOp(localUpdateOp);
      j = k + 1;
    }
    paramList.clear();
  }
  
  void reset()
  {
    ArrayList localArrayList = this.mPendingUpdates;
    recycleUpdateOpsAndClearList(localArrayList);
    localArrayList = this.mPostponedList;
    recycleUpdateOpsAndClearList(localArrayList);
    this.mExistingUpdateTypes = 0;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AdapterHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */