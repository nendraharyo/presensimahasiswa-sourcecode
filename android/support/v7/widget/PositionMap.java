package android.support.v7.widget;

import java.util.ArrayList;

class PositionMap
  implements Cloneable
{
  private static final Object DELETED;
  private boolean mGarbage = false;
  private int[] mKeys;
  private int mSize;
  private Object[] mValues;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    DELETED = localObject;
  }
  
  PositionMap()
  {
    this(10);
  }
  
  PositionMap(int paramInt)
  {
    Object localObject;
    if (paramInt == 0)
    {
      localObject = PositionMap.ContainerHelpers.EMPTY_INTS;
      this.mKeys = ((int[])localObject);
      localObject = PositionMap.ContainerHelpers.EMPTY_OBJECTS;
    }
    for (this.mValues = ((Object[])localObject);; this.mValues = ((Object[])localObject))
    {
      this.mSize = 0;
      return;
      int i = idealIntArraySize(paramInt);
      int[] arrayOfInt = new int[i];
      this.mKeys = arrayOfInt;
      localObject = new Object[i];
    }
  }
  
  private void gc()
  {
    int i = this.mSize;
    int[] arrayOfInt = this.mKeys;
    Object[] arrayOfObject = this.mValues;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject1 = arrayOfObject[j];
      Object localObject2 = DELETED;
      if (localObject1 != localObject2)
      {
        if (j != k)
        {
          int m = arrayOfInt[j];
          arrayOfInt[k] = m;
          arrayOfObject[k] = localObject1;
          localObject1 = null;
          arrayOfObject[j] = null;
        }
        k += 1;
      }
      j += 1;
    }
    this.mGarbage = false;
    this.mSize = k;
  }
  
  static int idealBooleanArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt);
  }
  
  static int idealByteArraySize(int paramInt)
  {
    int i = 1;
    int j = 4;
    for (;;)
    {
      int k = 32;
      if (j < k)
      {
        k = (i << j) + -12;
        if (paramInt <= k)
        {
          j = i << j;
          paramInt = j + -12;
        }
      }
      else
      {
        return paramInt;
      }
      j += 1;
    }
  }
  
  static int idealCharArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 2) / 2;
  }
  
  static int idealFloatArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 4) / 4;
  }
  
  static int idealIntArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 4) / 4;
  }
  
  static int idealLongArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 8) / 8;
  }
  
  static int idealObjectArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 4) / 4;
  }
  
  static int idealShortArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 2) / 2;
  }
  
  public void append(int paramInt, Object paramObject)
  {
    int i = this.mSize;
    int k;
    if (i != 0)
    {
      int[] arrayOfInt1 = this.mKeys;
      k = this.mSize + -1;
      i = arrayOfInt1[k];
      if (paramInt <= i) {
        put(paramInt, paramObject);
      }
    }
    for (;;)
    {
      return;
      boolean bool = this.mGarbage;
      if (bool)
      {
        j = this.mSize;
        localObject1 = this.mKeys;
        k = localObject1.length;
        if (j >= k) {
          gc();
        }
      }
      int j = this.mSize;
      Object localObject1 = this.mKeys;
      k = localObject1.length;
      if (j >= k)
      {
        k = idealIntArraySize(j + 1);
        int[] arrayOfInt2 = new int[k];
        localObject1 = new Object[k];
        Object localObject2 = this.mKeys;
        int m = this.mKeys.length;
        System.arraycopy(localObject2, 0, arrayOfInt2, 0, m);
        localObject2 = this.mValues;
        Object[] arrayOfObject = this.mValues;
        m = arrayOfObject.length;
        System.arraycopy(localObject2, 0, localObject1, 0, m);
        this.mKeys = arrayOfInt2;
        this.mValues = ((Object[])localObject1);
      }
      this.mKeys[j] = paramInt;
      localObject1 = this.mValues;
      localObject1[j] = paramObject;
      j += 1;
      this.mSize = j;
    }
  }
  
  public void clear()
  {
    int i = this.mSize;
    Object[] arrayOfObject = this.mValues;
    int j = 0;
    while (j < i)
    {
      arrayOfObject[j] = null;
      j += 1;
    }
    this.mSize = 0;
    this.mGarbage = false;
  }
  
  public PositionMap clone()
  {
    Object localObject1 = null;
    try
    {
      localObject2 = super.clone();
      localObject2 = (PositionMap)localObject2;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException2)
    {
      for (;;)
      {
        Object localObject2;
        label52:
        Object localObject3 = null;
      }
    }
    try
    {
      localObject1 = this.mKeys;
      localObject1 = ((int[])localObject1).clone();
      localObject1 = (int[])localObject1;
      ((PositionMap)localObject2).mKeys = ((int[])localObject1);
      localObject1 = this.mValues;
      localObject1 = ((Object[])localObject1).clone();
      localObject1 = (Object[])localObject1;
      ((PositionMap)localObject2).mValues = ((Object[])localObject1);
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      break label52;
    }
    return (PositionMap)localObject2;
  }
  
  public void delete(int paramInt)
  {
    int[] arrayOfInt = this.mKeys;
    int i = this.mSize;
    int j = PositionMap.ContainerHelpers.binarySearch(arrayOfInt, i, paramInt);
    if (j >= 0)
    {
      Object localObject1 = this.mValues[j];
      Object localObject2 = DELETED;
      if (localObject1 != localObject2)
      {
        localObject1 = this.mValues;
        localObject2 = DELETED;
        localObject1[j] = localObject2;
        j = 1;
        this.mGarbage = j;
      }
    }
  }
  
  public Object get(int paramInt)
  {
    return get(paramInt, null);
  }
  
  public Object get(int paramInt, Object paramObject)
  {
    int[] arrayOfInt = this.mKeys;
    int i = this.mSize;
    int j = PositionMap.ContainerHelpers.binarySearch(arrayOfInt, i, paramInt);
    Object localObject1;
    if (j >= 0)
    {
      localObject1 = this.mValues[j];
      Object localObject2 = DELETED;
      if (localObject1 != localObject2) {
        break label48;
      }
    }
    for (;;)
    {
      return paramObject;
      label48:
      localObject1 = this.mValues;
      paramObject = localObject1[j];
    }
  }
  
  public int indexOfKey(int paramInt)
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    int[] arrayOfInt = this.mKeys;
    int i = this.mSize;
    return PositionMap.ContainerHelpers.binarySearch(arrayOfInt, i, paramInt);
  }
  
  public int indexOfValue(Object paramObject)
  {
    int i = this.mGarbage;
    if (i != 0) {
      gc();
    }
    i = 0;
    int k = this.mSize;
    if (i < k)
    {
      Object localObject = this.mValues[i];
      if (localObject != paramObject) {}
    }
    for (;;)
    {
      return i;
      i += 1;
      break;
      int j = -1;
    }
  }
  
  public void insertKeyRange(int paramInt1, int paramInt2) {}
  
  public int keyAt(int paramInt)
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    return this.mKeys[paramInt];
  }
  
  public void put(int paramInt, Object paramObject)
  {
    int[] arrayOfInt = this.mKeys;
    int i = this.mSize;
    int k = PositionMap.ContainerHelpers.binarySearch(arrayOfInt, i, paramInt);
    Object localObject1;
    if (k >= 0)
    {
      localObject1 = this.mValues;
      localObject1[k] = paramObject;
    }
    for (;;)
    {
      return;
      k ^= 0xFFFFFFFF;
      i = this.mSize;
      if (k < i)
      {
        localObject1 = this.mValues[k];
        localObject2 = DELETED;
        if (localObject1 == localObject2)
        {
          this.mKeys[k] = paramInt;
          localObject1 = this.mValues;
          localObject1[k] = paramObject;
          continue;
        }
      }
      boolean bool = this.mGarbage;
      if (bool)
      {
        j = this.mSize;
        localObject2 = this.mKeys;
        m = localObject2.length;
        if (j >= m)
        {
          gc();
          arrayOfInt = this.mKeys;
          j = this.mSize;
          k = PositionMap.ContainerHelpers.binarySearch(arrayOfInt, j, paramInt) ^ 0xFFFFFFFF;
        }
      }
      int j = this.mSize;
      Object localObject2 = this.mKeys;
      int m = localObject2.length;
      int n;
      if (j >= m)
      {
        j = idealIntArraySize(this.mSize + 1);
        localObject2 = new int[j];
        localObject1 = new Object[j];
        Object localObject3 = this.mKeys;
        n = this.mKeys.length;
        System.arraycopy(localObject3, 0, localObject2, 0, n);
        localObject3 = this.mValues;
        Object[] arrayOfObject = this.mValues;
        n = arrayOfObject.length;
        System.arraycopy(localObject3, 0, localObject1, 0, n);
        this.mKeys = ((int[])localObject2);
        this.mValues = ((Object[])localObject1);
      }
      j = this.mSize - k;
      if (j != 0)
      {
        localObject1 = this.mKeys;
        localObject2 = this.mKeys;
        int i1 = k + 1;
        n = this.mSize - k;
        System.arraycopy(localObject1, k, localObject2, i1, n);
        localObject1 = this.mValues;
        localObject2 = this.mValues;
        i1 = k + 1;
        n = this.mSize - k;
        System.arraycopy(localObject1, k, localObject2, i1, n);
      }
      this.mKeys[k] = paramInt;
      localObject1 = this.mValues;
      localObject1[k] = paramObject;
      k = this.mSize + 1;
      this.mSize = k;
    }
  }
  
  public void remove(int paramInt)
  {
    delete(paramInt);
  }
  
  public void removeAt(int paramInt)
  {
    Object localObject1 = this.mValues[paramInt];
    Object localObject2 = DELETED;
    if (localObject1 != localObject2)
    {
      localObject1 = this.mValues;
      localObject2 = DELETED;
      localObject1[paramInt] = localObject2;
      boolean bool = true;
      this.mGarbage = bool;
    }
  }
  
  public void removeAtRange(int paramInt1, int paramInt2)
  {
    int i = this.mSize;
    int j = paramInt1 + paramInt2;
    i = Math.min(i, j);
    while (paramInt1 < i)
    {
      removeAt(paramInt1);
      paramInt1 += 1;
    }
  }
  
  public void removeKeyRange(ArrayList paramArrayList, int paramInt1, int paramInt2) {}
  
  public void setValueAt(int paramInt, Object paramObject)
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    this.mValues[paramInt] = paramObject;
  }
  
  public int size()
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    return this.mSize;
  }
  
  public String toString()
  {
    int i = size();
    if (i <= 0) {}
    StringBuilder localStringBuilder;
    for (String str = "{}";; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new java/lang/StringBuilder;
      i = this.mSize * 28;
      localStringBuilder.<init>(i);
      localStringBuilder.append('{');
      i = 0;
      str = null;
      int j = this.mSize;
      if (i < j)
      {
        if (i > 0)
        {
          localObject = ", ";
          localStringBuilder.append((String)localObject);
        }
        int k = keyAt(i);
        localStringBuilder.append(k);
        k = 61;
        localStringBuilder.append(k);
        Object localObject = valueAt(i);
        if (localObject != this) {
          localStringBuilder.append(localObject);
        }
        for (;;)
        {
          i += 1;
          break;
          localObject = "(this Map)";
          localStringBuilder.append((String)localObject);
        }
      }
      i = 125;
      localStringBuilder.append(i);
    }
  }
  
  public Object valueAt(int paramInt)
  {
    boolean bool = this.mGarbage;
    if (bool) {
      gc();
    }
    return this.mValues[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\PositionMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */