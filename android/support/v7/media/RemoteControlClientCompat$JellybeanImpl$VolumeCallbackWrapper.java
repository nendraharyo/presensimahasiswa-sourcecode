package android.support.v7.media;

import java.lang.ref.WeakReference;

final class RemoteControlClientCompat$JellybeanImpl$VolumeCallbackWrapper
  implements MediaRouterJellybean.VolumeCallback
{
  private final WeakReference mImplWeak;
  
  public RemoteControlClientCompat$JellybeanImpl$VolumeCallbackWrapper(RemoteControlClientCompat.JellybeanImpl paramJellybeanImpl)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramJellybeanImpl);
    this.mImplWeak = localWeakReference;
  }
  
  public void onVolumeSetRequest(Object paramObject, int paramInt)
  {
    Object localObject = (RemoteControlClientCompat.JellybeanImpl)this.mImplWeak.get();
    if (localObject != null)
    {
      RemoteControlClientCompat.VolumeCallback localVolumeCallback = ((RemoteControlClientCompat.JellybeanImpl)localObject).mVolumeCallback;
      if (localVolumeCallback != null)
      {
        localObject = ((RemoteControlClientCompat.JellybeanImpl)localObject).mVolumeCallback;
        ((RemoteControlClientCompat.VolumeCallback)localObject).onVolumeSetRequest(paramInt);
      }
    }
  }
  
  public void onVolumeUpdateRequest(Object paramObject, int paramInt)
  {
    Object localObject = (RemoteControlClientCompat.JellybeanImpl)this.mImplWeak.get();
    if (localObject != null)
    {
      RemoteControlClientCompat.VolumeCallback localVolumeCallback = ((RemoteControlClientCompat.JellybeanImpl)localObject).mVolumeCallback;
      if (localVolumeCallback != null)
      {
        localObject = ((RemoteControlClientCompat.JellybeanImpl)localObject).mVolumeCallback;
        ((RemoteControlClientCompat.VolumeCallback)localObject).onVolumeUpdateRequest(paramInt);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RemoteControlClientCompat$JellybeanImpl$VolumeCallbackWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */