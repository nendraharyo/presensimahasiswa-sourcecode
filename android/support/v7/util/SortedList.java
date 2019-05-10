package android.support.v7.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class SortedList
{
  private static final int CAPACITY_GROWTH = 10;
  private static final int DELETION = 2;
  private static final int INSERTION = 1;
  public static final int INVALID_POSITION = 255;
  private static final int LOOKUP = 4;
  private static final int MIN_CAPACITY = 10;
  private SortedList.BatchedCallback mBatchedCallback;
  private SortedList.Callback mCallback;
  Object[] mData;
  private int mNewDataStart;
  private Object[] mOldData;
  private int mOldDataSize;
  private int mOldDataStart;
  private int mSize;
  private final Class mTClass;
  
  public SortedList(Class paramClass, SortedList.Callback paramCallback)
  {
    this(paramClass, paramCallback, 10);
  }
  
  public SortedList(Class paramClass, SortedList.Callback paramCallback, int paramInt)
  {
    this.mTClass = paramClass;
    Object[] arrayOfObject = (Object[])Array.newInstance(paramClass, paramInt);
    this.mData = arrayOfObject;
    this.mCallback = paramCallback;
    this.mSize = 0;
  }
  
  private int add(Object paramObject, boolean paramBoolean)
  {
    int i = 0;
    SortedList.Callback localCallback = null;
    int j = 1;
    Object localObject1 = this.mData;
    int k = this.mSize;
    Object localObject2 = this;
    Object localObject3 = paramObject;
    int m = findIndexOf(paramObject, (Object[])localObject1, 0, k, j);
    int n = -1;
    if (m == n) {}
    for (;;)
    {
      addToData(i, paramObject);
      if (paramBoolean)
      {
        localObject2 = this.mCallback;
        ((SortedList.Callback)localObject2).onInserted(i, j);
      }
      m = i;
      for (;;)
      {
        return m;
        n = this.mSize;
        if (m >= n) {
          break;
        }
        localObject3 = this.mData[m];
        localObject1 = this.mCallback;
        boolean bool = ((SortedList.Callback)localObject1).areItemsTheSame(localObject3, paramObject);
        if (!bool) {
          break;
        }
        localObject1 = this.mCallback;
        bool = ((SortedList.Callback)localObject1).areContentsTheSame(localObject3, paramObject);
        if (bool)
        {
          localObject3 = this.mData;
          localObject3[m] = paramObject;
        }
        else
        {
          this.mData[m] = paramObject;
          localObject1 = this.mCallback;
          localCallback = this.mCallback;
          localObject3 = localCallback.getChangePayload(localObject3, paramObject);
          ((SortedList.Callback)localObject1).onChanged(m, j, localObject3);
        }
      }
      i = m;
    }
  }
  
  private void addAllInternal(Object[] paramArrayOfObject)
  {
    int i = paramArrayOfObject.length;
    int j = 1;
    if (i < j) {}
    for (;;)
    {
      return;
      i = sortAndDedup(paramArrayOfObject);
      j = this.mSize;
      if (j == 0)
      {
        this.mData = paramArrayOfObject;
        this.mSize = i;
        SortedList.Callback localCallback = this.mCallback;
        localCallback.onInserted(0, i);
      }
      else
      {
        merge(paramArrayOfObject, i);
      }
    }
  }
  
  private void addToData(int paramInt, Object paramObject)
  {
    int i = 0;
    int j = this.mSize;
    Object localObject1;
    if (paramInt > j)
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("cannot add item to ").append(paramInt).append(" because size is ");
      i = this.mSize;
      localObject2 = i;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    j = this.mSize;
    Object localObject2 = this.mData;
    int k = localObject2.length;
    int m;
    if (j == k)
    {
      localObject1 = this.mTClass;
      k = this.mData.length + 10;
      localObject1 = (Object[])Array.newInstance((Class)localObject1, k);
      System.arraycopy(this.mData, 0, localObject1, 0, paramInt);
      localObject1[paramInt] = paramObject;
      localObject2 = this.mData;
      i = paramInt + 1;
      m = this.mSize - paramInt;
      System.arraycopy(localObject2, paramInt, localObject1, i, m);
      this.mData = ((Object[])localObject1);
    }
    for (;;)
    {
      j = this.mSize + 1;
      this.mSize = j;
      return;
      localObject1 = this.mData;
      localObject2 = this.mData;
      i = paramInt + 1;
      m = this.mSize - paramInt;
      System.arraycopy(localObject1, paramInt, localObject2, i, m);
      localObject1 = this.mData;
      localObject1[paramInt] = paramObject;
    }
  }
  
  private Object[] copyArray(Object[] paramArrayOfObject)
  {
    Object localObject = this.mTClass;
    int i = paramArrayOfObject.length;
    localObject = (Object[])Array.newInstance((Class)localObject, i);
    i = paramArrayOfObject.length;
    System.arraycopy(paramArrayOfObject, 0, localObject, 0, i);
    return (Object[])localObject;
  }
  
  private int findIndexOf(Object paramObject, Object[] paramArrayOfObject, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    int j = -1;
    int k = paramInt2;
    int m = paramInt1;
    int n;
    if (m < k)
    {
      n = (m + k) / 2;
      Object localObject = paramArrayOfObject[n];
      SortedList.Callback localCallback = this.mCallback;
      int i1 = localCallback.compare(localObject, paramObject);
      if (i1 < 0)
      {
        n += 1;
        int i2 = k;
        k = n;
        n = i2;
      }
      for (;;)
      {
        m = k;
        k = n;
        break;
        if (i1 == 0)
        {
          localCallback = this.mCallback;
          boolean bool = localCallback.areItemsTheSame(localObject, paramObject);
          if (bool) {}
          for (;;)
          {
            return n;
            k = linearEqualitySearch(paramObject, n, m, k);
            if (paramInt3 == i)
            {
              if (k != j) {
                n = k;
              }
            }
            else {
              n = k;
            }
          }
        }
        k = m;
      }
    }
    if (paramInt3 == i) {}
    for (;;)
    {
      n = m;
      break;
      m = j;
    }
  }
  
  private int findSameItem(Object paramObject, Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (i < paramInt2)
    {
      SortedList.Callback localCallback = this.mCallback;
      Object localObject = paramArrayOfObject[i];
      boolean bool = localCallback.areItemsTheSame(localObject, paramObject);
      if (!bool) {}
    }
    for (;;)
    {
      return i;
      i += 1;
      break;
      i = -1;
    }
  }
  
  private int linearEqualitySearch(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 + -1;
    Object localObject;
    SortedList.Callback localCallback;
    int j;
    if (i >= paramInt2)
    {
      localObject = this.mData[i];
      localCallback = this.mCallback;
      j = localCallback.compare(localObject, paramObject);
      if (j == 0) {}
    }
    else
    {
      i = paramInt1 + 1;
    }
    for (;;)
    {
      if (i < paramInt3)
      {
        localObject = this.mData[i];
        localCallback = this.mCallback;
        j = localCallback.compare(localObject, paramObject);
        if (j == 0) {}
      }
      else
      {
        i = -1;
      }
      boolean bool;
      do
      {
        do
        {
          return i;
          localCallback = this.mCallback;
          bool = localCallback.areItemsTheSame(localObject, paramObject);
        } while (bool);
        i += -1;
        break;
        localCallback = this.mCallback;
        bool = localCallback.areItemsTheSame(localObject, paramObject);
      } while (bool);
      i += 1;
    }
  }
  
  private void merge(Object[] paramArrayOfObject, int paramInt)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = this.mCallback;
    boolean bool1 = localObject2 instanceof SortedList.BatchedCallback;
    int m;
    int k;
    Object localObject3;
    if (!bool1)
    {
      m = i;
      if (m != 0) {
        beginBatchedUpdates();
      }
      localObject2 = this.mData;
      this.mOldData = ((Object[])localObject2);
      this.mOldDataStart = 0;
      k = this.mSize;
      this.mOldDataSize = k;
      k = this.mSize + paramInt + 10;
      localObject3 = this.mTClass;
      localObject2 = (Object[])Array.newInstance((Class)localObject3, k);
      this.mData = ((Object[])localObject2);
      this.mNewDataStart = 0;
      k = 0;
      localObject2 = null;
    }
    for (;;)
    {
      j = this.mOldDataStart;
      int n = this.mOldDataSize;
      if ((j < n) || (k < paramInt))
      {
        j = this.mOldDataStart;
        n = this.mOldDataSize;
        if (j != n) {
          break label269;
        }
        j = paramInt - k;
        Object[] arrayOfObject = this.mData;
        n = this.mNewDataStart;
        System.arraycopy(paramArrayOfObject, k, arrayOfObject, n, j);
        k = this.mNewDataStart + j;
        this.mNewDataStart = k;
        k = this.mSize + j;
        this.mSize = k;
        localObject2 = this.mCallback;
        i = this.mNewDataStart - j;
        ((SortedList.Callback)localObject2).onInserted(i, j);
      }
      for (;;)
      {
        k = 0;
        localObject2 = null;
        this.mOldData = null;
        if (m != 0) {
          endBatchedUpdates();
        }
        return;
        m = 0;
        break;
        label269:
        if (k != paramInt) {
          break label351;
        }
        k = this.mOldDataSize;
        j = this.mOldDataStart;
        k -= j;
        localObject1 = this.mOldData;
        i = this.mOldDataStart;
        localObject3 = this.mData;
        i1 = this.mNewDataStart;
        System.arraycopy(localObject1, i, localObject3, i1, k);
        j = this.mNewDataStart;
        k += j;
        this.mNewDataStart = k;
      }
      label351:
      localObject1 = this.mOldData;
      n = this.mOldDataStart;
      localObject1 = localObject1[n];
      localObject3 = paramArrayOfObject[k];
      Object localObject4 = this.mCallback;
      int i1 = ((SortedList.Callback)localObject4).compare(localObject1, localObject3);
      int i4;
      if (i1 > 0)
      {
        localObject1 = this.mData;
        i1 = this.mNewDataStart;
        i4 = i1 + 1;
        this.mNewDataStart = i4;
        localObject1[i1] = localObject3;
        j = this.mSize + 1;
        this.mSize = j;
        k += 1;
        localObject1 = this.mCallback;
        n = this.mNewDataStart + -1;
        ((SortedList.Callback)localObject1).onInserted(n, i);
      }
      else
      {
        if (i1 == 0)
        {
          localObject4 = this.mCallback;
          boolean bool2 = ((SortedList.Callback)localObject4).areItemsTheSame(localObject1, localObject3);
          if (bool2)
          {
            localObject4 = this.mData;
            i4 = this.mNewDataStart;
            int i5 = i4 + 1;
            this.mNewDataStart = i5;
            localObject4[i4] = localObject3;
            k += 1;
            int i2 = this.mOldDataStart + 1;
            this.mOldDataStart = i2;
            localObject4 = this.mCallback;
            boolean bool3 = ((SortedList.Callback)localObject4).areContentsTheSame(localObject1, localObject3);
            if (bool3) {
              continue;
            }
            localObject4 = this.mCallback;
            i4 = this.mNewDataStart + -1;
            SortedList.Callback localCallback = this.mCallback;
            localObject1 = localCallback.getChangePayload(localObject1, localObject3);
            ((SortedList.Callback)localObject4).onChanged(i4, i, localObject1);
            continue;
          }
        }
        localObject3 = this.mData;
        int i3 = this.mNewDataStart;
        i4 = i3 + 1;
        this.mNewDataStart = i4;
        localObject3[i3] = localObject1;
        j = this.mOldDataStart + 1;
        this.mOldDataStart = j;
      }
    }
  }
  
  private boolean remove(Object paramObject, boolean paramBoolean)
  {
    boolean bool = false;
    Object[] arrayOfObject = this.mData;
    int i = this.mSize;
    int j = 2;
    int k = findIndexOf(paramObject, arrayOfObject, 0, i, j);
    int m = -1;
    if (k == m) {}
    for (;;)
    {
      return bool;
      removeItemAtIndex(k, paramBoolean);
      bool = true;
    }
  }
  
  private void removeItemAtIndex(int paramInt, boolean paramBoolean)
  {
    Object localObject = this.mData;
    int i = paramInt + 1;
    Object[] arrayOfObject = this.mData;
    int j = this.mSize - paramInt + -1;
    System.arraycopy(localObject, i, arrayOfObject, paramInt, j);
    int k = this.mSize + -1;
    this.mSize = k;
    localObject = this.mData;
    i = this.mSize;
    arrayOfObject = null;
    localObject[i] = null;
    if (paramBoolean)
    {
      localObject = this.mCallback;
      i = 1;
      ((SortedList.Callback)localObject).onRemoved(paramInt, i);
    }
  }
  
  private void replaceAllInsert(Object paramObject)
  {
    Object localObject = this.mData;
    int i = this.mNewDataStart;
    localObject[i] = paramObject;
    int j = this.mNewDataStart + 1;
    this.mNewDataStart = j;
    j = this.mSize + 1;
    this.mSize = j;
    localObject = this.mCallback;
    i = this.mNewDataStart + -1;
    ((SortedList.Callback)localObject).onInserted(i, 1);
  }
  
  private void replaceAllInternal(Object[] paramArrayOfObject)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    SortedList.Callback localCallback1 = this.mCallback;
    boolean bool1 = localCallback1 instanceof SortedList.BatchedCallback;
    int k;
    Object localObject2;
    if (!bool1)
    {
      bool1 = i;
      if (bool1) {
        beginBatchedUpdates();
      }
      this.mOldDataStart = 0;
      k = this.mSize;
      this.mOldDataSize = k;
      localObject2 = this.mData;
      this.mOldData = ((Object[])localObject2);
      this.mNewDataStart = 0;
      k = sortAndDedup(paramArrayOfObject);
      localObject1 = (Object[])Array.newInstance(this.mTClass, k);
      this.mData = ((Object[])localObject1);
    }
    for (;;)
    {
      j = this.mNewDataStart;
      if (j >= k)
      {
        j = this.mOldDataStart;
        m = this.mOldDataSize;
        if (j >= m) {}
      }
      else
      {
        j = this.mOldDataStart;
        m = this.mOldDataSize;
        if (j < m) {
          break label246;
        }
        j = this.mNewDataStart;
        i = this.mNewDataStart;
        i = k - i;
        localObject2 = this.mData;
        System.arraycopy(paramArrayOfObject, j, localObject2, j, i);
        k = this.mNewDataStart + i;
        this.mNewDataStart = k;
        k = this.mSize + i;
        this.mSize = k;
        localObject2 = this.mCallback;
        ((SortedList.Callback)localObject2).onInserted(j, i);
      }
      for (;;)
      {
        j = 0;
        localObject1 = null;
        this.mOldData = null;
        if (bool1) {
          endBatchedUpdates();
        }
        return;
        bool1 = false;
        localCallback1 = null;
        break;
        label246:
        j = this.mNewDataStart;
        if (j < k) {
          break label306;
        }
        j = this.mOldDataSize;
        i = this.mOldDataStart;
        j -= i;
        i = this.mSize - j;
        this.mSize = i;
        SortedList.Callback localCallback2 = this.mCallback;
        k = this.mNewDataStart;
        localCallback2.onRemoved(k, j);
      }
      label306:
      localObject1 = this.mOldData;
      int m = this.mOldDataStart;
      localObject1 = localObject1[m];
      m = this.mNewDataStart;
      Object localObject3 = paramArrayOfObject[m];
      Object localObject4 = this.mCallback;
      int n = ((SortedList.Callback)localObject4).compare(localObject1, localObject3);
      if (n < 0)
      {
        replaceAllRemove();
      }
      else if (n > 0)
      {
        replaceAllInsert(localObject3);
      }
      else
      {
        localObject4 = this.mCallback;
        boolean bool2 = ((SortedList.Callback)localObject4).areItemsTheSame(localObject1, localObject3);
        if (!bool2)
        {
          replaceAllRemove();
          replaceAllInsert(localObject3);
        }
        else
        {
          localObject4 = this.mData;
          int i2 = this.mNewDataStart;
          localObject4[i2] = localObject3;
          int i1 = this.mOldDataStart + 1;
          this.mOldDataStart = i1;
          i1 = this.mNewDataStart + 1;
          this.mNewDataStart = i1;
          localObject4 = this.mCallback;
          boolean bool3 = ((SortedList.Callback)localObject4).areContentsTheSame(localObject1, localObject3);
          if (!bool3)
          {
            localObject4 = this.mCallback;
            i2 = this.mNewDataStart + -1;
            SortedList.Callback localCallback3 = this.mCallback;
            localObject1 = localCallback3.getChangePayload(localObject1, localObject3);
            ((SortedList.Callback)localObject4).onChanged(i2, i, localObject1);
          }
        }
      }
    }
  }
  
  private void replaceAllRemove()
  {
    int i = this.mSize + -1;
    this.mSize = i;
    i = this.mOldDataStart + 1;
    this.mOldDataStart = i;
    SortedList.Callback localCallback = this.mCallback;
    int j = this.mNewDataStart;
    localCallback.onRemoved(j, 1);
  }
  
  private int sortAndDedup(Object[] paramArrayOfObject)
  {
    int i = 1;
    int j = 0;
    int k = paramArrayOfObject.length;
    if (k == 0) {}
    int m;
    do
    {
      return j;
      SortedList.Callback localCallback1 = this.mCallback;
      Arrays.sort(paramArrayOfObject, localCallback1);
      k = 0;
      localCallback1 = null;
      j = i;
      m = paramArrayOfObject.length;
    } while (i >= m);
    Object localObject1 = paramArrayOfObject[i];
    SortedList.Callback localCallback2 = this.mCallback;
    Object localObject2 = paramArrayOfObject[k];
    int n = localCallback2.compare(localObject2, localObject1);
    if (n == 0)
    {
      n = findSameItem(localObject1, paramArrayOfObject, k, j);
      int i1 = -1;
      if (n != i1) {
        paramArrayOfObject[n] = localObject1;
      }
    }
    for (;;)
    {
      i += 1;
      break;
      if (j != i) {
        paramArrayOfObject[j] = localObject1;
      }
      j += 1;
      continue;
      if (j != i) {
        paramArrayOfObject[j] = localObject1;
      }
      int i2 = j + 1;
      k = j;
      j = i2;
    }
  }
  
  private void throwIfInMutationOperation()
  {
    Object localObject = this.mOldData;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
      throw ((Throwable)localObject);
    }
  }
  
  public int add(Object paramObject)
  {
    throwIfInMutationOperation();
    return add(paramObject, true);
  }
  
  public void addAll(Collection paramCollection)
  {
    Object localObject = this.mTClass;
    int i = paramCollection.size();
    localObject = (Object[])Array.newInstance((Class)localObject, i);
    localObject = paramCollection.toArray((Object[])localObject);
    addAll((Object[])localObject, true);
  }
  
  public void addAll(Object... paramVarArgs)
  {
    addAll(paramVarArgs, false);
  }
  
  public void addAll(Object[] paramArrayOfObject, boolean paramBoolean)
  {
    throwIfInMutationOperation();
    int i = paramArrayOfObject.length;
    if (i == 0) {}
    for (;;)
    {
      return;
      if (paramBoolean)
      {
        addAllInternal(paramArrayOfObject);
      }
      else
      {
        Object[] arrayOfObject = copyArray(paramArrayOfObject);
        addAllInternal(arrayOfObject);
      }
    }
  }
  
  public void beginBatchedUpdates()
  {
    throwIfInMutationOperation();
    Object localObject = this.mCallback;
    boolean bool = localObject instanceof SortedList.BatchedCallback;
    if (bool) {}
    for (;;)
    {
      return;
      localObject = this.mBatchedCallback;
      if (localObject == null)
      {
        localObject = new android/support/v7/util/SortedList$BatchedCallback;
        SortedList.Callback localCallback = this.mCallback;
        ((SortedList.BatchedCallback)localObject).<init>(localCallback);
        this.mBatchedCallback = ((SortedList.BatchedCallback)localObject);
      }
      localObject = this.mBatchedCallback;
      this.mCallback = ((SortedList.Callback)localObject);
    }
  }
  
  public void clear()
  {
    throwIfInMutationOperation();
    int i = this.mSize;
    if (i == 0) {}
    for (;;)
    {
      return;
      i = this.mSize;
      Arrays.fill(this.mData, 0, i, null);
      this.mSize = 0;
      SortedList.Callback localCallback = this.mCallback;
      localCallback.onRemoved(0, i);
    }
  }
  
  public void endBatchedUpdates()
  {
    throwIfInMutationOperation();
    Object localObject = this.mCallback;
    boolean bool = localObject instanceof SortedList.BatchedCallback;
    if (bool)
    {
      localObject = (SortedList.BatchedCallback)this.mCallback;
      ((SortedList.BatchedCallback)localObject).dispatchLastEvent();
    }
    localObject = this.mCallback;
    SortedList.BatchedCallback localBatchedCallback = this.mBatchedCallback;
    if (localObject == localBatchedCallback)
    {
      localObject = this.mBatchedCallback.mWrappedCallback;
      this.mCallback = ((SortedList.Callback)localObject);
    }
  }
  
  public Object get(int paramInt)
  {
    int i = this.mSize;
    int j;
    if ((paramInt >= i) || (paramInt < 0))
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Asked to get item at ").append(paramInt).append(" but size is ");
      j = this.mSize;
      localObject2 = j;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.mOldData;
    int k;
    if (localObject1 != null)
    {
      i = this.mNewDataStart;
      if (paramInt >= i)
      {
        localObject1 = this.mOldData;
        k = this.mNewDataStart;
        k = paramInt - k;
        j = this.mOldDataStart;
        k += j;
      }
    }
    for (localObject1 = localObject1[k];; localObject1 = this.mData[paramInt]) {
      return localObject1;
    }
  }
  
  public int indexOf(Object paramObject)
  {
    int i = 0;
    int j = 4;
    int k = -1;
    Object localObject = this.mOldData;
    Object[] arrayOfObject;
    int m;
    int n;
    if (localObject != null)
    {
      arrayOfObject = this.mData;
      m = this.mNewDataStart;
      localObject = this;
      n = findIndexOf(paramObject, arrayOfObject, 0, m, j);
      if (n == k) {}
    }
    for (;;)
    {
      return n;
      arrayOfObject = this.mOldData;
      i = this.mOldDataStart;
      m = this.mOldDataSize;
      n = findIndexOf(paramObject, arrayOfObject, i, m, j);
      if (n != k)
      {
        int i1 = this.mOldDataStart;
        n -= i1;
        i1 = this.mNewDataStart;
        n += i1;
      }
      else
      {
        n = k;
        continue;
        arrayOfObject = this.mData;
        m = this.mSize;
        localObject = this;
        n = findIndexOf(paramObject, arrayOfObject, 0, m, j);
      }
    }
  }
  
  public void recalculatePositionOfItemAt(int paramInt)
  {
    SortedList.Callback localCallback = null;
    throwIfInMutationOperation();
    Object localObject = get(paramInt);
    removeItemAtIndex(paramInt, false);
    int i = add(localObject, false);
    if (paramInt != i)
    {
      localCallback = this.mCallback;
      localCallback.onMoved(paramInt, i);
    }
  }
  
  public boolean remove(Object paramObject)
  {
    throwIfInMutationOperation();
    return remove(paramObject, true);
  }
  
  public Object removeItemAt(int paramInt)
  {
    throwIfInMutationOperation();
    Object localObject = get(paramInt);
    removeItemAtIndex(paramInt, true);
    return localObject;
  }
  
  public void replaceAll(Collection paramCollection)
  {
    Object localObject = this.mTClass;
    int i = paramCollection.size();
    localObject = (Object[])Array.newInstance((Class)localObject, i);
    localObject = paramCollection.toArray((Object[])localObject);
    replaceAll((Object[])localObject, true);
  }
  
  public void replaceAll(Object... paramVarArgs)
  {
    replaceAll(paramVarArgs, false);
  }
  
  public void replaceAll(Object[] paramArrayOfObject, boolean paramBoolean)
  {
    throwIfInMutationOperation();
    if (paramBoolean) {
      replaceAllInternal(paramArrayOfObject);
    }
    for (;;)
    {
      return;
      Object[] arrayOfObject = copyArray(paramArrayOfObject);
      replaceAllInternal(arrayOfObject);
    }
  }
  
  public int size()
  {
    return this.mSize;
  }
  
  public void updateItemAt(int paramInt, Object paramObject)
  {
    int i = 1;
    Object localObject1 = null;
    throwIfInMutationOperation();
    Object localObject2 = get(paramInt);
    SortedList.Callback localCallback1;
    boolean bool;
    SortedList.Callback localCallback2;
    if (localObject2 != paramObject)
    {
      localCallback1 = this.mCallback;
      bool = localCallback1.areContentsTheSame(localObject2, paramObject);
      if (bool) {}
    }
    else
    {
      bool = i;
      if (localObject2 == paramObject) {
        break label126;
      }
      localCallback2 = this.mCallback;
      int k = localCallback2.compare(localObject2, paramObject);
      if (k != 0) {
        break label126;
      }
      localObject1 = this.mData;
      localObject1[paramInt] = paramObject;
      if (bool)
      {
        localCallback1 = this.mCallback;
        localObject1 = this.mCallback.getChangePayload(localObject2, paramObject);
        localCallback1.onChanged(paramInt, i, localObject1);
      }
    }
    for (;;)
    {
      return;
      bool = false;
      localCallback1 = null;
      break;
      label126:
      if (bool)
      {
        localCallback1 = this.mCallback;
        localCallback2 = this.mCallback;
        localObject2 = localCallback2.getChangePayload(localObject2, paramObject);
        localCallback1.onChanged(paramInt, i, localObject2);
      }
      removeItemAtIndex(paramInt, false);
      int j = add(paramObject, false);
      if (paramInt != j)
      {
        localObject1 = this.mCallback;
        ((SortedList.Callback)localObject1).onMoved(paramInt, j);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\SortedList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */