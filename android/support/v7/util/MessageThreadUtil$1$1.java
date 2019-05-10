package android.support.v7.util;

import android.util.Log;

class MessageThreadUtil$1$1
  implements Runnable
{
  MessageThreadUtil$1$1(MessageThreadUtil.1 param1) {}
  
  public void run()
  {
    Object localObject1 = this.this$1.mQueue.next();
    if (localObject1 != null)
    {
      int i = ((MessageThreadUtil.SyncQueueItem)localObject1).what;
      Object localObject2;
      int j;
      switch (i)
      {
      default: 
        localObject2 = "ThreadUtil";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str = "Unsupported message, what=";
        localStringBuilder = localStringBuilder.append(str);
        j = ((MessageThreadUtil.SyncQueueItem)localObject1).what;
        localObject1 = j;
        Log.e((String)localObject2, (String)localObject1);
      }
      for (;;)
      {
        localObject1 = this.this$1.mQueue.next();
        break;
        localObject2 = this.this$1.val$callback;
        int k = ((MessageThreadUtil.SyncQueueItem)localObject1).arg1;
        j = ((MessageThreadUtil.SyncQueueItem)localObject1).arg2;
        ((ThreadUtil.MainThreadCallback)localObject2).updateItemCount(k, j);
        continue;
        localObject2 = this.this$1.val$callback;
        k = ((MessageThreadUtil.SyncQueueItem)localObject1).arg1;
        localObject1 = (TileList.Tile)((MessageThreadUtil.SyncQueueItem)localObject1).data;
        ((ThreadUtil.MainThreadCallback)localObject2).addTile(k, (TileList.Tile)localObject1);
        continue;
        localObject2 = this.this$1.val$callback;
        k = ((MessageThreadUtil.SyncQueueItem)localObject1).arg1;
        j = ((MessageThreadUtil.SyncQueueItem)localObject1).arg2;
        ((ThreadUtil.MainThreadCallback)localObject2).removeTile(k, j);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\MessageThreadUtil$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */