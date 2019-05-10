package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class MediaRouter$ProviderInfo
{
  private MediaRouteProviderDescriptor mDescriptor;
  private final MediaRouteProvider.ProviderMetadata mMetadata;
  private final MediaRouteProvider mProviderInstance;
  private Resources mResources;
  private boolean mResourcesNotAvailable;
  private final ArrayList mRoutes;
  
  MediaRouter$ProviderInfo(MediaRouteProvider paramMediaRouteProvider)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mRoutes = ((ArrayList)localObject);
    this.mProviderInstance = paramMediaRouteProvider;
    localObject = paramMediaRouteProvider.getMetadata();
    this.mMetadata = ((MediaRouteProvider.ProviderMetadata)localObject);
  }
  
  int findRouteByDescriptorId(String paramString)
  {
    Object localObject = this.mRoutes;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = MediaRouter.RouteInfo.access$000((MediaRouter.RouteInfo)this.mRoutes.get(j));
      k = ((String)localObject).equals(paramString);
      if (k == 0) {}
    }
    int m;
    for (int k = j;; m = -1)
    {
      return k;
      j += 1;
      break;
    }
  }
  
  public ComponentName getComponentName()
  {
    return this.mMetadata.getComponentName();
  }
  
  public String getPackageName()
  {
    return this.mMetadata.getPackageName();
  }
  
  public MediaRouteProvider getProviderInstance()
  {
    MediaRouter.checkCallingThread();
    return this.mProviderInstance;
  }
  
  Resources getResources()
  {
    Object localObject1 = this.mResources;
    boolean bool;
    Object localObject2;
    if (localObject1 == null)
    {
      bool = this.mResourcesNotAvailable;
      if (!bool)
      {
        localObject1 = getPackageName();
        localObject2 = MediaRouter.sGlobal.getProviderContext((String)localObject1);
        if (localObject2 == null) {
          break label50;
        }
        localObject1 = ((Context)localObject2).getResources();
        this.mResources = ((Resources)localObject1);
      }
    }
    for (;;)
    {
      return this.mResources;
      label50:
      localObject2 = "MediaRouter";
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Unable to obtain resources for route provider package: ";
      localStringBuilder = localStringBuilder.append(str);
      localObject1 = (String)localObject1;
      Log.w((String)localObject2, (String)localObject1);
      bool = true;
      this.mResourcesNotAvailable = bool;
    }
  }
  
  public List getRoutes()
  {
    MediaRouter.checkCallingThread();
    return this.mRoutes;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("MediaRouter.RouteProviderInfo{ packageName=");
    String str = getPackageName();
    return str + " }";
  }
  
  boolean updateDescriptor(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    MediaRouteProviderDescriptor localMediaRouteProviderDescriptor = this.mDescriptor;
    boolean bool;
    if (localMediaRouteProviderDescriptor != paramMediaRouteProviderDescriptor)
    {
      this.mDescriptor = paramMediaRouteProviderDescriptor;
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMediaRouteProviderDescriptor = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouter$ProviderInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */