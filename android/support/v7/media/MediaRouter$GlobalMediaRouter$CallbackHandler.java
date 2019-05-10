package android.support.v7.media;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

final class MediaRouter$GlobalMediaRouter$CallbackHandler
  extends Handler
{
  public static final int MSG_PROVIDER_ADDED = 513;
  public static final int MSG_PROVIDER_CHANGED = 515;
  public static final int MSG_PROVIDER_REMOVED = 514;
  public static final int MSG_ROUTE_ADDED = 257;
  public static final int MSG_ROUTE_CHANGED = 259;
  public static final int MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED = 261;
  public static final int MSG_ROUTE_REMOVED = 258;
  public static final int MSG_ROUTE_SELECTED = 262;
  public static final int MSG_ROUTE_UNSELECTED = 263;
  public static final int MSG_ROUTE_VOLUME_CHANGED = 260;
  private static final int MSG_TYPE_MASK = 65280;
  private static final int MSG_TYPE_PROVIDER = 512;
  private static final int MSG_TYPE_ROUTE = 256;
  private final ArrayList mTempCallbackRecords;
  
  private MediaRouter$GlobalMediaRouter$CallbackHandler(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mTempCallbackRecords = localArrayList;
  }
  
  private void invokeCallback(MediaRouter.CallbackRecord paramCallbackRecord, int paramInt, Object paramObject)
  {
    MediaRouter localMediaRouter = paramCallbackRecord.mRouter;
    MediaRouter.Callback localCallback = paramCallbackRecord.mCallback;
    int i = 0xFF00 & paramInt;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      paramObject = (MediaRouter.RouteInfo)paramObject;
      boolean bool = paramCallbackRecord.filterRouteEvent((MediaRouter.RouteInfo)paramObject);
      if (bool) {
        switch (paramInt)
        {
        default: 
          break;
        case 257: 
          localCallback.onRouteAdded(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
          break;
        case 258: 
          localCallback.onRouteRemoved(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
          break;
        case 259: 
          localCallback.onRouteChanged(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
          break;
        case 260: 
          localCallback.onRouteVolumeChanged(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
          break;
        case 261: 
          localCallback.onRoutePresentationDisplayChanged(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
          break;
        case 262: 
          localCallback.onRouteSelected(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
          break;
        case 263: 
          localCallback.onRouteUnselected(localMediaRouter, (MediaRouter.RouteInfo)paramObject);
          continue;
          paramObject = (MediaRouter.ProviderInfo)paramObject;
          switch (paramInt)
          {
          default: 
            break;
          case 513: 
            localCallback.onProviderAdded(localMediaRouter, (MediaRouter.ProviderInfo)paramObject);
            break;
          case 514: 
            localCallback.onProviderRemoved(localMediaRouter, (MediaRouter.ProviderInfo)paramObject);
            break;
          case 515: 
            localCallback.onProviderChanged(localMediaRouter, (MediaRouter.ProviderInfo)paramObject);
          }
          break;
        }
      }
    }
  }
  
  private void syncWithSystemProvider(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      SystemMediaRouteProvider localSystemMediaRouteProvider = MediaRouter.GlobalMediaRouter.access$1600(this.this$0);
      paramObject = (MediaRouter.RouteInfo)paramObject;
      localSystemMediaRouteProvider.onSyncRouteAdded((MediaRouter.RouteInfo)paramObject);
      continue;
      localSystemMediaRouteProvider = MediaRouter.GlobalMediaRouter.access$1600(this.this$0);
      paramObject = (MediaRouter.RouteInfo)paramObject;
      localSystemMediaRouteProvider.onSyncRouteRemoved((MediaRouter.RouteInfo)paramObject);
      continue;
      localSystemMediaRouteProvider = MediaRouter.GlobalMediaRouter.access$1600(this.this$0);
      paramObject = (MediaRouter.RouteInfo)paramObject;
      localSystemMediaRouteProvider.onSyncRouteChanged((MediaRouter.RouteInfo)paramObject);
      continue;
      localSystemMediaRouteProvider = MediaRouter.GlobalMediaRouter.access$1600(this.this$0);
      paramObject = (MediaRouter.RouteInfo)paramObject;
      localSystemMediaRouteProvider.onSyncRouteSelected((MediaRouter.RouteInfo)paramObject);
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1 = paramMessage.obj;
    syncWithSystemProvider(i, localObject1);
    try
    {
      Object localObject2 = this.this$0;
      localObject2 = MediaRouter.GlobalMediaRouter.access$1500((MediaRouter.GlobalMediaRouter)localObject2);
      j = ((ArrayList)localObject2).size();
      k = j + -1;
      if (k >= 0)
      {
        localObject2 = this.this$0;
        localObject2 = MediaRouter.GlobalMediaRouter.access$1500((MediaRouter.GlobalMediaRouter)localObject2);
        localObject2 = ((ArrayList)localObject2).get(k);
        localObject2 = (WeakReference)localObject2;
        localObject2 = ((WeakReference)localObject2).get();
        localObject2 = (MediaRouter)localObject2;
        if (localObject2 == null)
        {
          localObject2 = this.this$0;
          localObject2 = MediaRouter.GlobalMediaRouter.access$1500((MediaRouter.GlobalMediaRouter)localObject2);
          ((ArrayList)localObject2).remove(k);
        }
        for (;;)
        {
          j = k;
          break;
          ArrayList localArrayList = this.mTempCallbackRecords;
          localObject2 = ((MediaRouter)localObject2).mCallbackRecords;
          localArrayList.addAll((Collection)localObject2);
        }
      }
      localObject4 = this.mTempCallbackRecords;
    }
    finally
    {
      this.mTempCallbackRecords.clear();
    }
    int m = ((ArrayList)localObject4).size();
    int j = 0;
    Object localObject4 = null;
    for (int k = 0; k < m; k = j)
    {
      localObject4 = this.mTempCallbackRecords;
      localObject4 = ((ArrayList)localObject4).get(k);
      localObject4 = (MediaRouter.CallbackRecord)localObject4;
      invokeCallback((MediaRouter.CallbackRecord)localObject4, i, localObject1);
      j = k + 1;
    }
    this.mTempCallbackRecords.clear();
  }
  
  public void post(int paramInt, Object paramObject)
  {
    obtainMessage(paramInt, paramObject).sendToTarget();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouter$GlobalMediaRouter$CallbackHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */