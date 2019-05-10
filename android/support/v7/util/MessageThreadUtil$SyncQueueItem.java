package android.support.v7.util;

class MessageThreadUtil$SyncQueueItem
{
  private static SyncQueueItem sPool;
  private static final Object sPoolLock;
  public int arg1;
  public int arg2;
  public int arg3;
  public int arg4;
  public int arg5;
  public Object data;
  private SyncQueueItem next;
  public int what;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    sPoolLock = localObject;
  }
  
  static SyncQueueItem obtainMessage(int paramInt1, int paramInt2, int paramInt3)
  {
    return obtainMessage(paramInt1, paramInt2, paramInt3, 0, 0, 0, null);
  }
  
  static SyncQueueItem obtainMessage(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Object paramObject)
  {
    synchronized (sPoolLock)
    {
      SyncQueueItem localSyncQueueItem1 = sPool;
      if (localSyncQueueItem1 == null)
      {
        localSyncQueueItem1 = new android/support/v7/util/MessageThreadUtil$SyncQueueItem;
        localSyncQueueItem1.<init>();
        localSyncQueueItem1.what = paramInt1;
        localSyncQueueItem1.arg1 = paramInt2;
        localSyncQueueItem1.arg2 = paramInt3;
        localSyncQueueItem1.arg3 = paramInt4;
        localSyncQueueItem1.arg4 = paramInt5;
        localSyncQueueItem1.arg5 = paramInt6;
        localSyncQueueItem1.data = paramObject;
        return localSyncQueueItem1;
      }
      localSyncQueueItem1 = sPool;
      SyncQueueItem localSyncQueueItem2 = sPool;
      localSyncQueueItem2 = localSyncQueueItem2.next;
      sPool = localSyncQueueItem2;
      localSyncQueueItem2 = null;
      localSyncQueueItem1.next = null;
    }
  }
  
  static SyncQueueItem obtainMessage(int paramInt1, int paramInt2, Object paramObject)
  {
    return obtainMessage(paramInt1, paramInt2, 0, 0, 0, 0, paramObject);
  }
  
  void recycle()
  {
    this.next = null;
    SyncQueueItem localSyncQueueItem = null;
    this.arg5 = 0;
    this.arg4 = 0;
    this.arg3 = 0;
    this.arg2 = 0;
    this.arg1 = 0;
    this.what = 0;
    this.data = null;
    synchronized (sPoolLock)
    {
      localSyncQueueItem = sPool;
      if (localSyncQueueItem != null)
      {
        localSyncQueueItem = sPool;
        this.next = localSyncQueueItem;
      }
      sPool = this;
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\MessageThreadUtil$SyncQueueItem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */