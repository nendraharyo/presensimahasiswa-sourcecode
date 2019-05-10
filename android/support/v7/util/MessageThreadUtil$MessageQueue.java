package android.support.v7.util;

class MessageThreadUtil$MessageQueue
{
  private MessageThreadUtil.SyncQueueItem mRoot;
  
  /* Error */
  MessageThreadUtil.SyncQueueItem next()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 12	android/support/v7/util/MessageThreadUtil$MessageQueue:mRoot	Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +9 -> 17
    //   11: aconst_null
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: areturn
    //   17: aload_0
    //   18: getfield 12	android/support/v7/util/MessageThreadUtil$MessageQueue:mRoot	Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;
    //   21: astore_1
    //   22: aload_0
    //   23: getfield 12	android/support/v7/util/MessageThreadUtil$MessageQueue:mRoot	Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;
    //   26: astore_2
    //   27: aload_2
    //   28: invokestatic 18	android/support/v7/util/MessageThreadUtil$SyncQueueItem:access$000	(Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;)Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;
    //   31: astore_2
    //   32: aload_0
    //   33: aload_2
    //   34: putfield 12	android/support/v7/util/MessageThreadUtil$MessageQueue:mRoot	Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;
    //   37: goto -24 -> 13
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	MessageQueue
    //   6	16	1	localSyncQueueItem1	MessageThreadUtil.SyncQueueItem
    //   40	4	1	localObject	Object
    //   26	8	2	localSyncQueueItem2	MessageThreadUtil.SyncQueueItem
    // Exception table:
    //   from	to	target	type
    //   2	6	40	finally
    //   17	21	40	finally
    //   22	26	40	finally
    //   27	31	40	finally
    //   33	37	40	finally
  }
  
  void removeMessages(int paramInt)
  {
    Object localObject3;
    try
    {
      for (;;)
      {
        MessageThreadUtil.SyncQueueItem localSyncQueueItem1 = this.mRoot;
        if (localSyncQueueItem1 == null) {
          break;
        }
        localSyncQueueItem1 = this.mRoot;
        int i = localSyncQueueItem1.what;
        if (i != paramInt) {
          break;
        }
        localSyncQueueItem1 = this.mRoot;
        localObject3 = this.mRoot;
        localObject3 = MessageThreadUtil.SyncQueueItem.access$000((MessageThreadUtil.SyncQueueItem)localObject3);
        this.mRoot = ((MessageThreadUtil.SyncQueueItem)localObject3);
        localSyncQueueItem1.recycle();
      }
      localObject2 = this.mRoot;
    }
    finally {}
    Object localObject2;
    if (localObject2 != null)
    {
      localObject2 = this.mRoot;
      localObject3 = MessageThreadUtil.SyncQueueItem.access$000((MessageThreadUtil.SyncQueueItem)localObject2);
      if (localObject3 != null)
      {
        MessageThreadUtil.SyncQueueItem localSyncQueueItem2 = MessageThreadUtil.SyncQueueItem.access$000((MessageThreadUtil.SyncQueueItem)localObject3);
        int j = ((MessageThreadUtil.SyncQueueItem)localObject3).what;
        if (j == paramInt)
        {
          MessageThreadUtil.SyncQueueItem.access$002((MessageThreadUtil.SyncQueueItem)localObject2, localSyncQueueItem2);
          ((MessageThreadUtil.SyncQueueItem)localObject3).recycle();
        }
        for (;;)
        {
          localObject3 = localSyncQueueItem2;
          break;
          localObject2 = localObject3;
        }
      }
    }
  }
  
  /* Error */
  void sendMessage(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 12	android/support/v7/util/MessageThreadUtil$MessageQueue:mRoot	Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +11 -> 19
    //   11: aload_0
    //   12: aload_1
    //   13: putfield 12	android/support/v7/util/MessageThreadUtil$MessageQueue:mRoot	Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: aload_0
    //   20: getfield 12	android/support/v7/util/MessageThreadUtil$MessageQueue:mRoot	Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;
    //   23: astore_2
    //   24: aload_2
    //   25: invokestatic 18	android/support/v7/util/MessageThreadUtil$SyncQueueItem:access$000	(Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;)Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;
    //   28: astore_3
    //   29: aload_3
    //   30: ifnull +11 -> 41
    //   33: aload_2
    //   34: invokestatic 18	android/support/v7/util/MessageThreadUtil$SyncQueueItem:access$000	(Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;)Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;
    //   37: astore_2
    //   38: goto -14 -> 24
    //   41: aload_2
    //   42: aload_1
    //   43: invokestatic 29	android/support/v7/util/MessageThreadUtil$SyncQueueItem:access$002	(Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;)Landroid/support/v7/util/MessageThreadUtil$SyncQueueItem;
    //   46: pop
    //   47: goto -31 -> 16
    //   50: astore_2
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_2
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	MessageQueue
    //   0	55	1	paramSyncQueueItem	MessageThreadUtil.SyncQueueItem
    //   6	36	2	localSyncQueueItem1	MessageThreadUtil.SyncQueueItem
    //   50	4	2	localObject	Object
    //   28	2	3	localSyncQueueItem2	MessageThreadUtil.SyncQueueItem
    // Exception table:
    //   from	to	target	type
    //   2	6	50	finally
    //   12	16	50	finally
    //   19	23	50	finally
    //   24	28	50	finally
    //   33	37	50	finally
    //   42	47	50	finally
  }
  
  void sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    try
    {
      MessageThreadUtil.SyncQueueItem localSyncQueueItem = this.mRoot;
      MessageThreadUtil.SyncQueueItem.access$002(paramSyncQueueItem, localSyncQueueItem);
      this.mRoot = paramSyncQueueItem;
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\MessageThreadUtil$MessageQueue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */