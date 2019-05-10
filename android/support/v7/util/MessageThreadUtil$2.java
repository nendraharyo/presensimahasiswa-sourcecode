package android.support.v7.util;

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class MessageThreadUtil$2
  implements ThreadUtil.BackgroundCallback
{
  static final int LOAD_TILE = 3;
  static final int RECYCLE_TILE = 4;
  static final int REFRESH = 1;
  static final int UPDATE_RANGE = 2;
  private Runnable mBackgroundRunnable;
  AtomicBoolean mBackgroundRunning;
  private final Executor mExecutor;
  final MessageThreadUtil.MessageQueue mQueue;
  
  MessageThreadUtil$2(MessageThreadUtil paramMessageThreadUtil, ThreadUtil.BackgroundCallback paramBackgroundCallback)
  {
    Object localObject = new android/support/v7/util/MessageThreadUtil$MessageQueue;
    ((MessageThreadUtil.MessageQueue)localObject).<init>();
    this.mQueue = ((MessageThreadUtil.MessageQueue)localObject);
    localObject = AsyncTask.THREAD_POOL_EXECUTOR;
    this.mExecutor = ((Executor)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    this.mBackgroundRunning = ((AtomicBoolean)localObject);
    localObject = new android/support/v7/util/MessageThreadUtil$2$1;
    ((MessageThreadUtil.2.1)localObject).<init>(this);
    this.mBackgroundRunnable = ((Runnable)localObject);
  }
  
  private void maybeExecuteBackgroundRunnable()
  {
    Object localObject = this.mBackgroundRunning;
    Runnable localRunnable = null;
    boolean bool1 = true;
    boolean bool2 = ((AtomicBoolean)localObject).compareAndSet(false, bool1);
    if (bool2)
    {
      localObject = this.mExecutor;
      localRunnable = this.mBackgroundRunnable;
      ((Executor)localObject).execute(localRunnable);
    }
  }
  
  private void sendMessage(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    this.mQueue.sendMessage(paramSyncQueueItem);
    maybeExecuteBackgroundRunnable();
  }
  
  private void sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    this.mQueue.sendMessageAtFrontOfQueue(paramSyncQueueItem);
    maybeExecuteBackgroundRunnable();
  }
  
  public void loadTile(int paramInt1, int paramInt2)
  {
    MessageThreadUtil.SyncQueueItem localSyncQueueItem = MessageThreadUtil.SyncQueueItem.obtainMessage(3, paramInt1, paramInt2);
    sendMessage(localSyncQueueItem);
  }
  
  public void recycleTile(TileList.Tile paramTile)
  {
    MessageThreadUtil.SyncQueueItem localSyncQueueItem = MessageThreadUtil.SyncQueueItem.obtainMessage(4, 0, paramTile);
    sendMessage(localSyncQueueItem);
  }
  
  public void refresh(int paramInt)
  {
    MessageThreadUtil.SyncQueueItem localSyncQueueItem = MessageThreadUtil.SyncQueueItem.obtainMessage(1, paramInt, null);
    sendMessageAtFrontOfQueue(localSyncQueueItem);
  }
  
  public void updateRange(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    MessageThreadUtil.SyncQueueItem localSyncQueueItem = MessageThreadUtil.SyncQueueItem.obtainMessage(2, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, null);
    sendMessageAtFrontOfQueue(localSyncQueueItem);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\MessageThreadUtil$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */