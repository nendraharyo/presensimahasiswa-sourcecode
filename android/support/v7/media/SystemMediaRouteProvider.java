package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;

abstract class SystemMediaRouteProvider
  extends MediaRouteProvider
{
  public static final String DEFAULT_ROUTE_ID = "DEFAULT_ROUTE";
  public static final String PACKAGE_NAME = "android";
  private static final String TAG = "SystemMediaRouteProvider";
  
  protected SystemMediaRouteProvider(Context paramContext)
  {
    super(paramContext, localProviderMetadata);
  }
  
  public static SystemMediaRouteProvider obtain(Context paramContext, SystemMediaRouteProvider.SyncCallback paramSyncCallback)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 18;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v7/media/SystemMediaRouteProvider$JellybeanMr2Impl;
      ((SystemMediaRouteProvider.JellybeanMr2Impl)localObject).<init>(paramContext, paramSyncCallback);
    }
    for (;;)
    {
      return (SystemMediaRouteProvider)localObject;
      i = Build.VERSION.SDK_INT;
      j = 17;
      if (i >= j)
      {
        localObject = new android/support/v7/media/SystemMediaRouteProvider$JellybeanMr1Impl;
        ((SystemMediaRouteProvider.JellybeanMr1Impl)localObject).<init>(paramContext, paramSyncCallback);
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 16;
        if (i >= j)
        {
          localObject = new android/support/v7/media/SystemMediaRouteProvider$JellybeanImpl;
          ((SystemMediaRouteProvider.JellybeanImpl)localObject).<init>(paramContext, paramSyncCallback);
        }
        else
        {
          localObject = new android/support/v7/media/SystemMediaRouteProvider$LegacyImpl;
          ((SystemMediaRouteProvider.LegacyImpl)localObject).<init>(paramContext);
        }
      }
    }
  }
  
  public void onSyncRouteAdded(MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onSyncRouteChanged(MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onSyncRouteRemoved(MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onSyncRouteSelected(MediaRouter.RouteInfo paramRouteInfo) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\SystemMediaRouteProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */