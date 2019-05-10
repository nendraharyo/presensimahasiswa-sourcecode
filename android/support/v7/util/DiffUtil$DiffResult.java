package android.support.v7.util;

import android.support.v7.widget.RecyclerView.Adapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DiffUtil$DiffResult
{
  private static final int FLAG_CHANGED = 2;
  private static final int FLAG_IGNORE = 16;
  private static final int FLAG_MASK = 31;
  private static final int FLAG_MOVED_CHANGED = 4;
  private static final int FLAG_MOVED_NOT_CHANGED = 8;
  private static final int FLAG_NOT_CHANGED = 1;
  private static final int FLAG_OFFSET = 5;
  private final DiffUtil.Callback mCallback;
  private final boolean mDetectMoves;
  private final int[] mNewItemStatuses;
  private final int mNewListSize;
  private final int[] mOldItemStatuses;
  private final int mOldListSize;
  private final List mSnakes;
  
  DiffUtil$DiffResult(DiffUtil.Callback paramCallback, List paramList, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean)
  {
    this.mSnakes = paramList;
    this.mOldItemStatuses = paramArrayOfInt1;
    this.mNewItemStatuses = paramArrayOfInt2;
    Arrays.fill(this.mOldItemStatuses, 0);
    Arrays.fill(this.mNewItemStatuses, 0);
    this.mCallback = paramCallback;
    int i = paramCallback.getOldListSize();
    this.mOldListSize = i;
    i = paramCallback.getNewListSize();
    this.mNewListSize = i;
    this.mDetectMoves = paramBoolean;
    addRootSnake();
    findMatchingItems();
  }
  
  private void addRootSnake()
  {
    Object localObject = this.mSnakes;
    boolean bool = ((List)localObject).isEmpty();
    if (bool) {
      bool = false;
    }
    for (localObject = null;; localObject = (DiffUtil.Snake)this.mSnakes.get(0))
    {
      if (localObject != null)
      {
        int j = ((DiffUtil.Snake)localObject).x;
        if (j == 0)
        {
          int i = ((DiffUtil.Snake)localObject).y;
          if (i == 0) {
            break label90;
          }
        }
      }
      localObject = new android/support/v7/util/DiffUtil$Snake;
      ((DiffUtil.Snake)localObject).<init>();
      ((DiffUtil.Snake)localObject).x = 0;
      ((DiffUtil.Snake)localObject).y = 0;
      ((DiffUtil.Snake)localObject).removal = false;
      ((DiffUtil.Snake)localObject).size = 0;
      ((DiffUtil.Snake)localObject).reverse = false;
      List localList = this.mSnakes;
      localList.add(0, localObject);
      label90:
      return;
    }
  }
  
  private void dispatchAdditions(List paramList, ListUpdateCallback paramListUpdateCallback, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    boolean bool = this.mDetectMoves;
    if (!bool) {
      paramListUpdateCallback.onInserted(paramInt1, paramInt2);
    }
    int n;
    do
    {
      return;
      j = paramInt2 + -1;
      n = j;
    } while (n < 0);
    Object localObject1 = this.mNewItemStatuses;
    int i1 = paramInt3 + n;
    int j = localObject1[i1] & 0x1F;
    Object localObject2;
    Object localObject3;
    int k;
    int i2;
    int i3;
    switch (j)
    {
    default: 
      localObject2 = new java/lang/IllegalStateException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("unknown flag for pos ");
      n += paramInt3;
      StringBuilder localStringBuilder = ((StringBuilder)localObject3).append(n).append(" ");
      localObject1 = Long.toBinaryString(j);
      localObject1 = (String)localObject1;
      ((IllegalStateException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    case 0: 
      paramListUpdateCallback.onInserted(paramInt1, i);
      localObject2 = paramList.iterator();
      for (;;)
      {
        k = ((Iterator)localObject2).hasNext();
        if (k == 0) {
          break;
        }
        localObject1 = (DiffUtil.PostponedUpdate)((Iterator)localObject2).next();
        i2 = ((DiffUtil.PostponedUpdate)localObject1).currentPos + 1;
        ((DiffUtil.PostponedUpdate)localObject1).currentPos = i2;
      }
    case 4: 
    case 8: 
      localObject2 = this.mNewItemStatuses;
      i2 = paramInt3 + n;
      i1 = localObject2[i2] >> 5;
      localObject3 = removePostponedUpdate(paramList, i1, i);
      i2 = ((DiffUtil.PostponedUpdate)localObject3).currentPos;
      paramListUpdateCallback.onMoved(i2, paramInt1);
      i2 = 4;
      if (k == i2)
      {
        localObject1 = this.mCallback;
        i3 = paramInt3 + n;
        localObject1 = ((DiffUtil.Callback)localObject1).getChangePayload(i1, i3);
        paramListUpdateCallback.onChanged(paramInt1, i, localObject1);
      }
      break;
    }
    for (;;)
    {
      int m = n + -1;
      n = m;
      break;
      localObject1 = new android/support/v7/util/DiffUtil$PostponedUpdate;
      i1 = paramInt3 + n;
      i3 = 0;
      localObject3 = null;
      ((DiffUtil.PostponedUpdate)localObject1).<init>(i1, paramInt1, false);
      paramList.add(localObject1);
    }
  }
  
  private void dispatchRemovals(List paramList, ListUpdateCallback paramListUpdateCallback, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    boolean bool = this.mDetectMoves;
    if (!bool) {
      paramListUpdateCallback.onRemoved(paramInt1, paramInt2);
    }
    int n;
    do
    {
      return;
      j = paramInt2 + -1;
      n = j;
    } while (n < 0);
    Object localObject1 = this.mOldItemStatuses;
    int i1 = paramInt3 + n;
    int j = localObject1[i1] & 0x1F;
    Object localObject2;
    Object localObject3;
    int k;
    int i2;
    int m;
    switch (j)
    {
    default: 
      localObject2 = new java/lang/IllegalStateException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("unknown flag for pos ");
      n += paramInt3;
      StringBuilder localStringBuilder = ((StringBuilder)localObject3).append(n).append(" ");
      localObject1 = Long.toBinaryString(j);
      localObject1 = (String)localObject1;
      ((IllegalStateException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    case 0: 
      j = paramInt1 + n;
      paramListUpdateCallback.onRemoved(j, i);
      localObject2 = paramList.iterator();
      for (;;)
      {
        k = ((Iterator)localObject2).hasNext();
        if (k == 0) {
          break;
        }
        localObject1 = (DiffUtil.PostponedUpdate)((Iterator)localObject2).next();
        i2 = ((DiffUtil.PostponedUpdate)localObject1).currentPos + -1;
        ((DiffUtil.PostponedUpdate)localObject1).currentPos = i2;
      }
    case 4: 
    case 8: 
      localObject2 = this.mOldItemStatuses;
      i2 = paramInt3 + n;
      i1 = localObject2[i2] >> 5;
      i2 = 0;
      localObject3 = removePostponedUpdate(paramList, i1, false);
      int i3 = paramInt1 + n;
      int i5 = ((DiffUtil.PostponedUpdate)localObject3).currentPos + -1;
      paramListUpdateCallback.onMoved(i3, i5);
      i3 = 4;
      if (k == i3)
      {
        m = ((DiffUtil.PostponedUpdate)localObject3).currentPos + -1;
        localObject3 = this.mCallback;
        int i4 = paramInt3 + n;
        localObject2 = ((DiffUtil.Callback)localObject3).getChangePayload(i4, i1);
        paramListUpdateCallback.onChanged(m, i, localObject2);
      }
      break;
    }
    for (;;)
    {
      m = n + -1;
      n = m;
      break;
      localObject1 = new android/support/v7/util/DiffUtil$PostponedUpdate;
      i1 = paramInt3 + n;
      i2 = paramInt1 + n;
      ((DiffUtil.PostponedUpdate)localObject1).<init>(i1, i2, i);
      paramList.add(localObject1);
    }
  }
  
  private void findAddition(int paramInt1, int paramInt2, int paramInt3)
  {
    int[] arrayOfInt = this.mOldItemStatuses;
    int i = paramInt1 + -1;
    int j = arrayOfInt[i];
    if (j != 0) {}
    for (;;)
    {
      return;
      j = 0;
      arrayOfInt = null;
      findMatchingItem(paramInt1, paramInt2, paramInt3, false);
    }
  }
  
  private boolean findMatchingItem(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = 8;
    int j = 4;
    float f = 5.6E-45F;
    int k = 1;
    int i4;
    label39:
    Object localObject;
    label111:
    int i7;
    int n;
    if (paramBoolean)
    {
      int m = paramInt2 + -1;
      paramInt2 += -1;
      int i2 = m;
      m = paramInt1;
      i4 = m;
      if (paramInt3 < 0) {
        break label399;
      }
      localObject = (DiffUtil.Snake)this.mSnakes.get(paramInt3);
      int i5 = ((DiffUtil.Snake)localObject).x;
      int i6 = ((DiffUtil.Snake)localObject).size;
      i5 += i6;
      i6 = ((DiffUtil.Snake)localObject).y;
      int i8 = ((DiffUtil.Snake)localObject).size;
      i6 += i8;
      if (!paramBoolean) {
        break label250;
      }
      i4 += -1;
      if (i4 < i5) {
        break label379;
      }
      DiffUtil.Callback localCallback1 = this.mCallback;
      i7 = localCallback1.areItemsTheSame(i4, i2);
      if (i7 == 0) {
        break label241;
      }
      localObject = this.mCallback;
      n = ((DiffUtil.Callback)localObject).areContentsTheSame(i4, i2);
      if (n == 0) {
        break label234;
      }
      n = i;
      label166:
      int[] arrayOfInt = this.mNewItemStatuses;
      j = i4 << 5 | 0x10;
      arrayOfInt[i2] = j;
      arrayOfInt = this.mOldItemStatuses;
      i2 <<= 5;
      n |= i2;
      arrayOfInt[i4] = n;
      n = k;
    }
    for (;;)
    {
      return n;
      int i3 = paramInt1 + -1;
      int i1 = paramInt1 + -1;
      break;
      label234:
      i1 = j;
      break label166;
      label241:
      i4 += -1;
      break label111;
      label250:
      i4 = paramInt2 + -1;
      for (;;)
      {
        if (i4 < i7) {
          break label379;
        }
        DiffUtil.Callback localCallback2 = this.mCallback;
        boolean bool2 = localCallback2.areItemsTheSame(i3, i4);
        if (bool2)
        {
          localObject = this.mCallback;
          bool1 = ((DiffUtil.Callback)localObject).areContentsTheSame(i3, i4);
          if (bool1) {}
          for (;;)
          {
            localObject = this.mOldItemStatuses;
            i3 = paramInt1 + -1;
            j = i4 << 5 | 0x10;
            localObject[i3] = j;
            localObject = this.mNewItemStatuses;
            i3 = paramInt1 + -1 << 5 | i;
            localObject[i4] = i3;
            bool1 = k;
            break;
            i = j;
          }
        }
        i4 += -1;
      }
      label379:
      i4 = ((DiffUtil.Snake)localObject).x;
      paramInt2 = ((DiffUtil.Snake)localObject).y;
      paramInt3 += -1;
      break label39;
      label399:
      boolean bool1 = false;
      localObject = null;
    }
  }
  
  private void findMatchingItems()
  {
    int i = this.mOldListSize;
    int m = this.mNewListSize;
    Object localObject = this.mSnakes;
    int n = ((List)localObject).size() + -1;
    for (int i1 = n; i1 >= 0; i1 = n)
    {
      localObject = (DiffUtil.Snake)this.mSnakes.get(i1);
      int i2 = ((DiffUtil.Snake)localObject).x;
      int i3 = ((DiffUtil.Snake)localObject).size;
      i2 += i3;
      int i4 = ((DiffUtil.Snake)localObject).y;
      int i5 = ((DiffUtil.Snake)localObject).size;
      i4 += i5;
      boolean bool = this.mDetectMoves;
      if (bool)
      {
        while (i > i2)
        {
          findAddition(i, m, i1);
          i += -1;
        }
        while (m > i4)
        {
          findRemoval(i, m, i1);
          m += -1;
        }
      }
      m = 0;
      i = ((DiffUtil.Snake)localObject).size;
      if (m < i)
      {
        i2 = ((DiffUtil.Snake)localObject).x + m;
        i4 = ((DiffUtil.Snake)localObject).y + m;
        DiffUtil.Callback localCallback = this.mCallback;
        int j = localCallback.areContentsTheSame(i2, i4);
        if (j != 0) {}
        for (j = 1;; k = 2)
        {
          int[] arrayOfInt = this.mOldItemStatuses;
          int i6 = i4 << 5 | j;
          arrayOfInt[i2] = i6;
          arrayOfInt = this.mNewItemStatuses;
          i2 <<= 5;
          j |= i2;
          arrayOfInt[i4] = j;
          m += 1;
          break;
        }
      }
      int k = ((DiffUtil.Snake)localObject).x;
      m = ((DiffUtil.Snake)localObject).y;
      n = i1 + -1;
    }
  }
  
  private void findRemoval(int paramInt1, int paramInt2, int paramInt3)
  {
    int[] arrayOfInt = this.mNewItemStatuses;
    int i = paramInt2 + -1;
    int j = arrayOfInt[i];
    if (j != 0) {}
    for (;;)
    {
      return;
      j = 1;
      findMatchingItem(paramInt1, paramInt2, paramInt3, j);
    }
  }
  
  private static DiffUtil.PostponedUpdate removePostponedUpdate(List paramList, int paramInt, boolean paramBoolean)
  {
    int i = paramList.size();
    boolean bool1 = i + -1;
    while (!bool1)
    {
      localPostponedUpdate1 = (DiffUtil.PostponedUpdate)paramList.get(bool1);
      int j = localPostponedUpdate1.posInOwnerList;
      if (j == paramInt)
      {
        boolean bool2 = localPostponedUpdate1.removal;
        if (bool2 == paramBoolean)
        {
          paramList.remove(bool1);
          bool2 = bool1;
          bool1 = paramList.size();
          if (bool2 >= bool1) {
            break label158;
          }
          DiffUtil.PostponedUpdate localPostponedUpdate2 = (DiffUtil.PostponedUpdate)paramList.get(bool2);
          int k = localPostponedUpdate2.currentPos;
          if (paramBoolean) {}
          for (int m = 1;; m = -1)
          {
            m += k;
            localPostponedUpdate2.currentPos = m;
            bool1 = bool2 + true;
            bool2 = bool1;
            break;
          }
        }
      }
      bool1 += true;
    }
    i = 0;
    DiffUtil.PostponedUpdate localPostponedUpdate1 = null;
    label158:
    return localPostponedUpdate1;
  }
  
  public void dispatchUpdatesTo(ListUpdateCallback paramListUpdateCallback)
  {
    boolean bool = paramListUpdateCallback instanceof BatchingListUpdateCallback;
    Object localObject1;
    ArrayList localArrayList;
    int j;
    int k;
    Object localObject2;
    int i;
    int m;
    if (bool)
    {
      paramListUpdateCallback = (BatchingListUpdateCallback)paramListUpdateCallback;
      localObject1 = paramListUpdateCallback;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      j = this.mOldListSize;
      k = this.mNewListSize;
      localObject2 = this.mSnakes;
      i = ((List)localObject2).size() + -1;
      m = i;
    }
    for (int n = k;; n = k)
    {
      if (m < 0) {
        break label328;
      }
      localObject2 = this.mSnakes.get(m);
      Object localObject3 = localObject2;
      localObject3 = (DiffUtil.Snake)localObject2;
      int i1 = ((DiffUtil.Snake)localObject3).size;
      k = ((DiffUtil.Snake)localObject3).x + i1;
      i = ((DiffUtil.Snake)localObject3).y;
      int i2 = i + i1;
      if (k < j)
      {
        j -= k;
        localObject2 = this;
        dispatchRemovals(localArrayList, (ListUpdateCallback)localObject1, k, j, k);
      }
      if (i2 < n)
      {
        j = n - i2;
        localObject2 = this;
        dispatchAdditions(localArrayList, (ListUpdateCallback)localObject1, k, j, i2);
      }
      i = i1 + -1;
      for (;;)
      {
        if (i >= 0)
        {
          int[] arrayOfInt = this.mOldItemStatuses;
          j = ((DiffUtil.Snake)localObject3).x + i;
          k = arrayOfInt[j] & 0x1F;
          j = 2;
          if (k == j)
          {
            k = ((DiffUtil.Snake)localObject3).x + i;
            j = 1;
            Object localObject4 = this.mCallback;
            n = ((DiffUtil.Snake)localObject3).x + i;
            i1 = ((DiffUtil.Snake)localObject3).y + i;
            localObject4 = ((DiffUtil.Callback)localObject4).getChangePayload(n, i1);
            ((BatchingListUpdateCallback)localObject1).onChanged(k, j, localObject4);
          }
          i += -1;
          continue;
          localObject1 = new android/support/v7/util/BatchingListUpdateCallback;
          ((BatchingListUpdateCallback)localObject1).<init>(paramListUpdateCallback);
          break;
        }
      }
      j = ((DiffUtil.Snake)localObject3).x;
      k = ((DiffUtil.Snake)localObject3).y;
      i = m + -1;
      m = i;
    }
    label328:
    ((BatchingListUpdateCallback)localObject1).dispatchLastEvent();
  }
  
  public void dispatchUpdatesTo(RecyclerView.Adapter paramAdapter)
  {
    AdapterListUpdateCallback localAdapterListUpdateCallback = new android/support/v7/util/AdapterListUpdateCallback;
    localAdapterListUpdateCallback.<init>(paramAdapter);
    dispatchUpdatesTo(localAdapterListUpdateCallback);
  }
  
  List getSnakes()
  {
    return this.mSnakes;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\DiffUtil$DiffResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */