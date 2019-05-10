package android.support.v7.media;

import android.content.Context;

class SystemMediaRouteProvider$JellybeanMr2Impl
  extends SystemMediaRouteProvider.JellybeanMr1Impl
{
  public SystemMediaRouteProvider$JellybeanMr2Impl(Context paramContext, SystemMediaRouteProvider.SyncCallback paramSyncCallback)
  {
    super(paramContext, paramSyncCallback);
  }
  
  protected Object getDefaultRoute()
  {
    return MediaRouterJellybeanMr2.getDefaultRoute(this.mRouterObj);
  }
  
  protected boolean isConnecting(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord)
  {
    return MediaRouterJellybeanMr2.RouteInfo.isConnecting(paramSystemRouteRecord.mRouteObj);
  }
  
  protected void onBuildSystemRouteDescriptor(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord, MediaRouteDescriptor.Builder paramBuilder)
  {
    super.onBuildSystemRouteDescriptor(paramSystemRouteRecord, paramBuilder);
    Object localObject = MediaRouterJellybeanMr2.RouteInfo.getDescription(paramSystemRouteRecord.mRouteObj);
    if (localObject != null)
    {
      localObject = ((CharSequence)localObject).toString();
      paramBuilder.setDescription((String)localObject);
    }
  }
  
  protected void selectRoute(Object paramObject)
  {
    MediaRouterJellybean.selectRoute(this.mRouterObj, 8388611, paramObject);
  }
  
  protected void updateCallback()
  {
    int i = 1;
    boolean bool1 = this.mCallbackRegistered;
    if (bool1)
    {
      localObject1 = this.mRouterObj;
      Object localObject2 = this.mCallbackObj;
      MediaRouterJellybean.removeCallback(localObject1, localObject2);
    }
    this.mCallbackRegistered = i;
    Object localObject1 = this.mRouterObj;
    int j = this.mRouteTypes;
    Object localObject3 = this.mCallbackObj;
    boolean bool2 = this.mActiveScan;
    if (bool2) {}
    for (;;)
    {
      i |= 0x2;
      MediaRouterJellybeanMr2.addCallback(localObject1, j, localObject3, i);
      return;
      i = 0;
    }
  }
  
  protected void updateUserRouteProperties(SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord paramUserRouteRecord)
  {
    super.updateUserRouteProperties(paramUserRouteRecord);
    Object localObject = paramUserRouteRecord.mRouteObj;
    String str = paramUserRouteRecord.mRoute.getDescription();
    MediaRouterJellybeanMr2.UserRouteInfo.setDescription(localObject, str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\SystemMediaRouteProvider$JellybeanMr2Impl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */