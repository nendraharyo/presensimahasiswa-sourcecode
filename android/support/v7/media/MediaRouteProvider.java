package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;

public abstract class MediaRouteProvider
{
  private static final int MSG_DELIVER_DESCRIPTOR_CHANGED = 1;
  private static final int MSG_DELIVER_DISCOVERY_REQUEST_CHANGED = 2;
  private MediaRouteProvider.Callback mCallback;
  private final Context mContext;
  private MediaRouteProviderDescriptor mDescriptor;
  private MediaRouteDiscoveryRequest mDiscoveryRequest;
  private final MediaRouteProvider.ProviderHandler mHandler;
  private final MediaRouteProvider.ProviderMetadata mMetadata;
  private boolean mPendingDescriptorChange;
  private boolean mPendingDiscoveryRequestChange;
  
  public MediaRouteProvider(Context paramContext)
  {
    this(paramContext, null);
  }
  
  MediaRouteProvider(Context paramContext, MediaRouteProvider.ProviderMetadata paramProviderMetadata)
  {
    Object localObject = new android/support/v7/media/MediaRouteProvider$ProviderHandler;
    ComponentName localComponentName = null;
    ((MediaRouteProvider.ProviderHandler)localObject).<init>(this, null);
    this.mHandler = ((MediaRouteProvider.ProviderHandler)localObject);
    if (paramContext == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("context must not be null");
      throw ((Throwable)localObject);
    }
    this.mContext = paramContext;
    if (paramProviderMetadata == null)
    {
      localObject = new android/support/v7/media/MediaRouteProvider$ProviderMetadata;
      localComponentName = new android/content/ComponentName;
      Class localClass = getClass();
      localComponentName.<init>(paramContext, localClass);
      ((MediaRouteProvider.ProviderMetadata)localObject).<init>(localComponentName);
    }
    for (this.mMetadata = ((MediaRouteProvider.ProviderMetadata)localObject);; this.mMetadata = paramProviderMetadata) {
      return;
    }
  }
  
  private void deliverDescriptorChanged()
  {
    this.mPendingDescriptorChange = false;
    MediaRouteProvider.Callback localCallback = this.mCallback;
    if (localCallback != null)
    {
      localCallback = this.mCallback;
      MediaRouteProviderDescriptor localMediaRouteProviderDescriptor = this.mDescriptor;
      localCallback.onDescriptorChanged(this, localMediaRouteProviderDescriptor);
    }
  }
  
  private void deliverDiscoveryRequestChanged()
  {
    this.mPendingDiscoveryRequestChange = false;
    MediaRouteDiscoveryRequest localMediaRouteDiscoveryRequest = this.mDiscoveryRequest;
    onDiscoveryRequestChanged(localMediaRouteDiscoveryRequest);
  }
  
  public final Context getContext()
  {
    return this.mContext;
  }
  
  public final MediaRouteProviderDescriptor getDescriptor()
  {
    return this.mDescriptor;
  }
  
  public final MediaRouteDiscoveryRequest getDiscoveryRequest()
  {
    return this.mDiscoveryRequest;
  }
  
  public final Handler getHandler()
  {
    return this.mHandler;
  }
  
  public final MediaRouteProvider.ProviderMetadata getMetadata()
  {
    return this.mMetadata;
  }
  
  public MediaRouteProvider.RouteController onCreateRouteController(String paramString)
  {
    return null;
  }
  
  public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest) {}
  
  public final void setCallback(MediaRouteProvider.Callback paramCallback)
  {
    MediaRouter.checkCallingThread();
    this.mCallback = paramCallback;
  }
  
  public final void setDescriptor(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    int i = 1;
    MediaRouter.checkCallingThread();
    Object localObject = this.mDescriptor;
    if (localObject != paramMediaRouteProviderDescriptor)
    {
      this.mDescriptor = paramMediaRouteProviderDescriptor;
      boolean bool = this.mPendingDescriptorChange;
      if (!bool)
      {
        this.mPendingDescriptorChange = i;
        localObject = this.mHandler;
        ((MediaRouteProvider.ProviderHandler)localObject).sendEmptyMessage(i);
      }
    }
  }
  
  public final void setDiscoveryRequest(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    MediaRouter.checkCallingThread();
    Object localObject = this.mDiscoveryRequest;
    boolean bool;
    if (localObject != paramMediaRouteDiscoveryRequest)
    {
      localObject = this.mDiscoveryRequest;
      if (localObject == null) {
        break label38;
      }
      localObject = this.mDiscoveryRequest;
      bool = ((MediaRouteDiscoveryRequest)localObject).equals(paramMediaRouteDiscoveryRequest);
      if (!bool) {
        break label38;
      }
    }
    for (;;)
    {
      return;
      label38:
      this.mDiscoveryRequest = paramMediaRouteDiscoveryRequest;
      bool = this.mPendingDiscoveryRequestChange;
      if (!bool)
      {
        bool = true;
        this.mPendingDiscoveryRequestChange = bool;
        localObject = this.mHandler;
        int i = 2;
        ((MediaRouteProvider.ProviderHandler)localObject).sendEmptyMessage(i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */