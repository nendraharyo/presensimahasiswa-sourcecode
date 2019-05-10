package android.support.v7.util;

public class SortedList$BatchedCallback
  extends SortedList.Callback
{
  private final BatchingListUpdateCallback mBatchingListUpdateCallback;
  final SortedList.Callback mWrappedCallback;
  
  public SortedList$BatchedCallback(SortedList.Callback paramCallback)
  {
    this.mWrappedCallback = paramCallback;
    BatchingListUpdateCallback localBatchingListUpdateCallback = new android/support/v7/util/BatchingListUpdateCallback;
    SortedList.Callback localCallback = this.mWrappedCallback;
    localBatchingListUpdateCallback.<init>(localCallback);
    this.mBatchingListUpdateCallback = localBatchingListUpdateCallback;
  }
  
  public boolean areContentsTheSame(Object paramObject1, Object paramObject2)
  {
    return this.mWrappedCallback.areContentsTheSame(paramObject1, paramObject2);
  }
  
  public boolean areItemsTheSame(Object paramObject1, Object paramObject2)
  {
    return this.mWrappedCallback.areItemsTheSame(paramObject1, paramObject2);
  }
  
  public int compare(Object paramObject1, Object paramObject2)
  {
    return this.mWrappedCallback.compare(paramObject1, paramObject2);
  }
  
  public void dispatchLastEvent()
  {
    this.mBatchingListUpdateCallback.dispatchLastEvent();
  }
  
  public Object getChangePayload(Object paramObject1, Object paramObject2)
  {
    return this.mWrappedCallback.getChangePayload(paramObject1, paramObject2);
  }
  
  public void onChanged(int paramInt1, int paramInt2)
  {
    this.mBatchingListUpdateCallback.onChanged(paramInt1, paramInt2, null);
  }
  
  public void onChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    this.mBatchingListUpdateCallback.onChanged(paramInt1, paramInt2, paramObject);
  }
  
  public void onInserted(int paramInt1, int paramInt2)
  {
    this.mBatchingListUpdateCallback.onInserted(paramInt1, paramInt2);
  }
  
  public void onMoved(int paramInt1, int paramInt2)
  {
    this.mBatchingListUpdateCallback.onMoved(paramInt1, paramInt2);
  }
  
  public void onRemoved(int paramInt1, int paramInt2)
  {
    this.mBatchingListUpdateCallback.onRemoved(paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\SortedList$BatchedCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */