package android.support.v7.util;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

class MessageThreadUtil$2$1
  implements Runnable
{
  MessageThreadUtil$2$1(MessageThreadUtil.2 param2) {}
  
  public void run()
  {
    for (;;)
    {
      Object localObject1 = this.this$1.mQueue;
      MessageThreadUtil.SyncQueueItem localSyncQueueItem = ((MessageThreadUtil.MessageQueue)localObject1).next();
      if (localSyncQueueItem == null)
      {
        this.this$1.mBackgroundRunning.set(false);
        return;
      }
      int i = localSyncQueueItem.what;
      Object localObject2;
      int j;
      int k;
      switch (i)
      {
      default: 
        localObject1 = "ThreadUtil";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "Unsupported message, what=";
        localObject2 = ((StringBuilder)localObject2).append(str);
        j = localSyncQueueItem.what;
        localObject2 = j;
        Log.e((String)localObject1, (String)localObject2);
        break;
      case 1: 
        this.this$1.mQueue.removeMessages(1);
        localObject1 = this.this$1.val$callback;
        k = localSyncQueueItem.arg1;
        ((ThreadUtil.BackgroundCallback)localObject1).refresh(k);
        break;
      case 2: 
        this.this$1.mQueue.removeMessages(2);
        this.this$1.mQueue.removeMessages(3);
        localObject1 = this.this$1.val$callback;
        k = localSyncQueueItem.arg1;
        j = localSyncQueueItem.arg2;
        int m = localSyncQueueItem.arg3;
        int n = localSyncQueueItem.arg4;
        int i1 = localSyncQueueItem.arg5;
        ((ThreadUtil.BackgroundCallback)localObject1).updateRange(k, j, m, n, i1);
        break;
      case 3: 
        localObject1 = this.this$1.val$callback;
        k = localSyncQueueItem.arg1;
        j = localSyncQueueItem.arg2;
        ((ThreadUtil.BackgroundCallback)localObject1).loadTile(k, j);
        break;
      case 4: 
        localObject2 = this.this$1.val$callback;
        localObject1 = (TileList.Tile)localSyncQueueItem.data;
        ((ThreadUtil.BackgroundCallback)localObject2).recycleTile((TileList.Tile)localObject1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\MessageThreadUtil$2$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */