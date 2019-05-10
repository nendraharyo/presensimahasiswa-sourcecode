package android.support.v7.util;

import android.os.Handler;
import android.os.Looper;

class MessageThreadUtil$1
  implements ThreadUtil.MainThreadCallback
{
  static final int ADD_TILE = 2;
  static final int REMOVE_TILE = 3;
  static final int UPDATE_ITEM_COUNT = 1;
  private final Handler mMainThreadHandler;
  private Runnable mMainThreadRunnable;
  final MessageThreadUtil.MessageQueue mQueue;
  
  MessageThreadUtil$1(MessageThreadUtil paramMessageThreadUtil, ThreadUtil.MainThreadCallback paramMainThreadCallback)
  {
    Object localObject = new android/support/v7/util/MessageThreadUtil$MessageQueue;
    ((MessageThreadUtil.MessageQueue)localObject).<init>();
    this.mQueue = ((MessageThreadUtil.MessageQueue)localObject);
    localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    ((Handler)localObject).<init>(localLooper);
    this.mMainThreadHandler = ((Handler)localObject);
    localObject = new android/support/v7/util/MessageThreadUtil$1$1;
    ((MessageThreadUtil.1.1)localObject).<init>(this);
    this.mMainThreadRunnable = ((Runnable)localObject);
  }
  
  private void sendMessage(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    this.mQueue.sendMessage(paramSyncQueueItem);
    Handler localHandler = this.mMainThreadHandler;
    Runnable localRunnable = this.mMainThreadRunnable;
    localHandler.post(localRunnable);
  }
  
  public void addTile(int paramInt, TileList.Tile paramTile)
  {
    MessageThreadUtil.SyncQueueItem localSyncQueueItem = MessageThreadUtil.SyncQueueItem.obtainMessage(2, paramInt, paramTile);
    sendMessage(localSyncQueueItem);
  }
  
  public void removeTile(int paramInt1, int paramInt2)
  {
    MessageThreadUtil.SyncQueueItem localSyncQueueItem = MessageThreadUtil.SyncQueueItem.obtainMessage(3, paramInt1, paramInt2);
    sendMessage(localSyncQueueItem);
  }
  
  public void updateItemCount(int paramInt1, int paramInt2)
  {
    MessageThreadUtil.SyncQueueItem localSyncQueueItem = MessageThreadUtil.SyncQueueItem.obtainMessage(1, paramInt1, paramInt2);
    sendMessage(localSyncQueueItem);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\MessageThreadUtil$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */