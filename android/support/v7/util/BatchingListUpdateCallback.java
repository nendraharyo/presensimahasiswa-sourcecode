package android.support.v7.util;

public class BatchingListUpdateCallback
  implements ListUpdateCallback
{
  private static final int TYPE_ADD = 1;
  private static final int TYPE_CHANGE = 3;
  private static final int TYPE_NONE = 0;
  private static final int TYPE_REMOVE = 2;
  int mLastEventCount;
  Object mLastEventPayload;
  int mLastEventPosition;
  int mLastEventType = 0;
  final ListUpdateCallback mWrapped;
  
  public BatchingListUpdateCallback(ListUpdateCallback paramListUpdateCallback)
  {
    this.mLastEventPosition = i;
    this.mLastEventCount = i;
    this.mLastEventPayload = null;
    this.mWrapped = paramListUpdateCallback;
  }
  
  public void dispatchLastEvent()
  {
    int i = this.mLastEventType;
    if (i == 0) {
      return;
    }
    i = this.mLastEventType;
    switch (i)
    {
    }
    for (;;)
    {
      this.mLastEventPayload = null;
      i = 0;
      ListUpdateCallback localListUpdateCallback = null;
      this.mLastEventType = 0;
      break;
      localListUpdateCallback = this.mWrapped;
      int j = this.mLastEventPosition;
      int k = this.mLastEventCount;
      localListUpdateCallback.onInserted(j, k);
      continue;
      localListUpdateCallback = this.mWrapped;
      j = this.mLastEventPosition;
      k = this.mLastEventCount;
      localListUpdateCallback.onRemoved(j, k);
      continue;
      localListUpdateCallback = this.mWrapped;
      j = this.mLastEventPosition;
      k = this.mLastEventCount;
      Object localObject = this.mLastEventPayload;
      localListUpdateCallback.onChanged(j, k, localObject);
    }
  }
  
  public void onChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    int i = 3;
    int j = this.mLastEventType;
    if (j == i)
    {
      j = this.mLastEventPosition;
      int k = this.mLastEventCount;
      j += k;
      if (paramInt1 <= j)
      {
        j = paramInt1 + paramInt2;
        k = this.mLastEventPosition;
        if (j >= k)
        {
          Object localObject = this.mLastEventPayload;
          if (localObject == paramObject)
          {
            j = this.mLastEventPosition;
            k = this.mLastEventCount;
            j += k;
            k = this.mLastEventPosition;
            k = Math.min(paramInt1, k);
            this.mLastEventPosition = k;
            k = paramInt1 + paramInt2;
            j = Math.max(j, k);
            k = this.mLastEventPosition;
            j -= k;
            this.mLastEventCount = j;
          }
        }
      }
    }
    for (;;)
    {
      return;
      dispatchLastEvent();
      this.mLastEventPosition = paramInt1;
      this.mLastEventCount = paramInt2;
      this.mLastEventPayload = paramObject;
      this.mLastEventType = i;
    }
  }
  
  public void onInserted(int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = this.mLastEventType;
    if (j == i)
    {
      j = this.mLastEventPosition;
      if (paramInt1 >= j)
      {
        j = this.mLastEventPosition;
        int k = this.mLastEventCount;
        j += k;
        if (paramInt1 <= j)
        {
          j = this.mLastEventCount + paramInt2;
          this.mLastEventCount = j;
          j = this.mLastEventPosition;
          j = Math.min(paramInt1, j);
          this.mLastEventPosition = j;
        }
      }
    }
    for (;;)
    {
      return;
      dispatchLastEvent();
      this.mLastEventPosition = paramInt1;
      this.mLastEventCount = paramInt2;
      this.mLastEventType = i;
    }
  }
  
  public void onMoved(int paramInt1, int paramInt2)
  {
    dispatchLastEvent();
    this.mWrapped.onMoved(paramInt1, paramInt2);
  }
  
  public void onRemoved(int paramInt1, int paramInt2)
  {
    int i = 2;
    int j = this.mLastEventType;
    if (j == i)
    {
      j = this.mLastEventPosition;
      if (j >= paramInt1)
      {
        j = this.mLastEventPosition;
        int k = paramInt1 + paramInt2;
        if (j <= k)
        {
          j = this.mLastEventCount + paramInt2;
          this.mLastEventCount = j;
          this.mLastEventPosition = paramInt1;
        }
      }
    }
    for (;;)
    {
      return;
      dispatchLastEvent();
      this.mLastEventPosition = paramInt1;
      this.mLastEventCount = paramInt2;
      this.mLastEventType = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\BatchingListUpdateCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */