package android.support.v7.media;

import android.content.Context;
import android.os.Handler;
import android.view.Display;
import java.util.ArrayList;

class SystemMediaRouteProvider$JellybeanMr1Impl
  extends SystemMediaRouteProvider.JellybeanImpl
  implements MediaRouterJellybeanMr1.Callback
{
  private MediaRouterJellybeanMr1.ActiveScanWorkaround mActiveScanWorkaround;
  private MediaRouterJellybeanMr1.IsConnectingWorkaround mIsConnectingWorkaround;
  
  public SystemMediaRouteProvider$JellybeanMr1Impl(Context paramContext, SystemMediaRouteProvider.SyncCallback paramSyncCallback)
  {
    super(paramContext, paramSyncCallback);
  }
  
  protected Object createCallbackObj()
  {
    return MediaRouterJellybeanMr1.createCallback(this);
  }
  
  protected boolean isConnecting(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord)
  {
    MediaRouterJellybeanMr1.IsConnectingWorkaround localIsConnectingWorkaround = this.mIsConnectingWorkaround;
    if (localIsConnectingWorkaround == null)
    {
      localIsConnectingWorkaround = new android/support/v7/media/MediaRouterJellybeanMr1$IsConnectingWorkaround;
      localIsConnectingWorkaround.<init>();
      this.mIsConnectingWorkaround = localIsConnectingWorkaround;
    }
    localIsConnectingWorkaround = this.mIsConnectingWorkaround;
    Object localObject = paramSystemRouteRecord.mRouteObj;
    return localIsConnectingWorkaround.isConnecting(localObject);
  }
  
  protected void onBuildSystemRouteDescriptor(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord, MediaRouteDescriptor.Builder paramBuilder)
  {
    super.onBuildSystemRouteDescriptor(paramSystemRouteRecord, paramBuilder);
    Object localObject = paramSystemRouteRecord.mRouteObj;
    boolean bool = MediaRouterJellybeanMr1.RouteInfo.isEnabled(localObject);
    if (!bool)
    {
      bool = false;
      localObject = null;
      paramBuilder.setEnabled(false);
    }
    bool = isConnecting(paramSystemRouteRecord);
    if (bool)
    {
      bool = true;
      paramBuilder.setConnecting(bool);
    }
    localObject = MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(paramSystemRouteRecord.mRouteObj);
    if (localObject != null)
    {
      int i = ((Display)localObject).getDisplayId();
      paramBuilder.setPresentationDisplayId(i);
    }
  }
  
  public void onRoutePresentationDisplayChanged(Object paramObject)
  {
    int i = findSystemRouteRecord(paramObject);
    SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord localSystemRouteRecord;
    Object localObject1;
    if (i >= 0)
    {
      localSystemRouteRecord = (SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)this.mSystemRouteRecords.get(i);
      localObject1 = MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(paramObject);
      if (localObject1 == null) {
        break label101;
      }
    }
    label101:
    for (int j = ((Display)localObject1).getDisplayId();; j = -1)
    {
      Object localObject2 = localSystemRouteRecord.mRouteDescriptor;
      int k = ((MediaRouteDescriptor)localObject2).getPresentationDisplayId();
      if (j != k)
      {
        localObject2 = new android/support/v7/media/MediaRouteDescriptor$Builder;
        MediaRouteDescriptor localMediaRouteDescriptor = localSystemRouteRecord.mRouteDescriptor;
        ((MediaRouteDescriptor.Builder)localObject2).<init>(localMediaRouteDescriptor);
        localObject1 = ((MediaRouteDescriptor.Builder)localObject2).setPresentationDisplayId(j).build();
        localSystemRouteRecord.mRouteDescriptor = ((MediaRouteDescriptor)localObject1);
        publishRoutes();
      }
      return;
    }
  }
  
  protected void updateCallback()
  {
    super.updateCallback();
    MediaRouterJellybeanMr1.ActiveScanWorkaround localActiveScanWorkaround = this.mActiveScanWorkaround;
    if (localActiveScanWorkaround == null)
    {
      localActiveScanWorkaround = new android/support/v7/media/MediaRouterJellybeanMr1$ActiveScanWorkaround;
      localObject = getContext();
      Handler localHandler = getHandler();
      localActiveScanWorkaround.<init>((Context)localObject, localHandler);
      this.mActiveScanWorkaround = localActiveScanWorkaround;
    }
    Object localObject = this.mActiveScanWorkaround;
    boolean bool = this.mActiveScan;
    int i;
    if (bool) {
      i = this.mRouteTypes;
    }
    for (;;)
    {
      ((MediaRouterJellybeanMr1.ActiveScanWorkaround)localObject).setActiveScanRouteTypes(i);
      return;
      i = 0;
      localActiveScanWorkaround = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\SystemMediaRouteProvider$JellybeanMr1Impl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */