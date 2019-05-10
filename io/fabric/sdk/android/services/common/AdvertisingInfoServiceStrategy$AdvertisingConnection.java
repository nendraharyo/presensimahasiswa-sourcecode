package io.fabric.sdk.android.services.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class AdvertisingInfoServiceStrategy$AdvertisingConnection
  implements ServiceConnection
{
  private static final int QUEUE_TIMEOUT_IN_MS = 200;
  private final LinkedBlockingQueue queue;
  private boolean retrieved = false;
  
  private AdvertisingInfoServiceStrategy$AdvertisingConnection()
  {
    LinkedBlockingQueue localLinkedBlockingQueue = new java/util/concurrent/LinkedBlockingQueue;
    localLinkedBlockingQueue.<init>(1);
    this.queue = localLinkedBlockingQueue;
  }
  
  public IBinder getBinder()
  {
    bool = this.retrieved;
    Object localObject1;
    Object localObject3;
    if (bool)
    {
      localObject1 = Fabric.getLogger();
      localObject3 = "Fabric";
      String str = "getBinder already called";
      ((Logger)localObject1).e((String)localObject3, str);
    }
    bool = true;
    this.retrieved = bool;
    try
    {
      localObject1 = this.queue;
      long l = 200L;
      localObject3 = TimeUnit.MILLISECONDS;
      localObject1 = ((LinkedBlockingQueue)localObject1).poll(l, (TimeUnit)localObject3);
      localObject1 = (IBinder)localObject1;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        bool = false;
        Object localObject2 = null;
      }
    }
    return (IBinder)localObject1;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      LinkedBlockingQueue localLinkedBlockingQueue = this.queue;
      localLinkedBlockingQueue.put(paramIBinder);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.queue.clear();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\AdvertisingInfoServiceStrategy$AdvertisingConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */