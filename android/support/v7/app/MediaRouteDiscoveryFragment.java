package android.support.v7.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;

public class MediaRouteDiscoveryFragment
  extends Fragment
{
  private final String ARGUMENT_SELECTOR = "selector";
  private MediaRouter.Callback mCallback;
  private MediaRouter mRouter;
  private MediaRouteSelector mSelector;
  
  private void ensureRouteSelector()
  {
    Object localObject = this.mSelector;
    if (localObject == null)
    {
      localObject = getArguments();
      if (localObject != null)
      {
        String str = "selector";
        localObject = MediaRouteSelector.fromBundle(((Bundle)localObject).getBundle(str));
        this.mSelector = ((MediaRouteSelector)localObject);
      }
      localObject = this.mSelector;
      if (localObject == null)
      {
        localObject = MediaRouteSelector.EMPTY;
        this.mSelector = ((MediaRouteSelector)localObject);
      }
    }
  }
  
  private void ensureRouter()
  {
    MediaRouter localMediaRouter = this.mRouter;
    if (localMediaRouter == null)
    {
      localMediaRouter = MediaRouter.getInstance(getActivity());
      this.mRouter = localMediaRouter;
    }
  }
  
  public MediaRouter getMediaRouter()
  {
    ensureRouter();
    return this.mRouter;
  }
  
  public MediaRouteSelector getRouteSelector()
  {
    ensureRouteSelector();
    return this.mSelector;
  }
  
  public MediaRouter.Callback onCreateCallback()
  {
    MediaRouteDiscoveryFragment.1 local1 = new android/support/v7/app/MediaRouteDiscoveryFragment$1;
    local1.<init>(this);
    return local1;
  }
  
  public int onPrepareCallbackFlags()
  {
    return 4;
  }
  
  public void onStart()
  {
    super.onStart();
    ensureRouteSelector();
    ensureRouter();
    Object localObject = onCreateCallback();
    this.mCallback = ((MediaRouter.Callback)localObject);
    localObject = this.mCallback;
    if (localObject != null)
    {
      localObject = this.mRouter;
      MediaRouteSelector localMediaRouteSelector = this.mSelector;
      MediaRouter.Callback localCallback = this.mCallback;
      int i = onPrepareCallbackFlags();
      ((MediaRouter)localObject).addCallback(localMediaRouteSelector, localCallback, i);
    }
  }
  
  public void onStop()
  {
    Object localObject = this.mCallback;
    if (localObject != null)
    {
      localObject = this.mRouter;
      MediaRouter.Callback localCallback = this.mCallback;
      ((MediaRouter)localObject).removeCallback(localCallback);
      localObject = null;
      this.mCallback = null;
    }
    super.onStop();
  }
  
  public void setRouteSelector(MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("selector must not be null");
      throw ((Throwable)localObject1);
    }
    ensureRouteSelector();
    Object localObject1 = this.mSelector;
    boolean bool = ((MediaRouteSelector)localObject1).equals(paramMediaRouteSelector);
    if (!bool)
    {
      this.mSelector = paramMediaRouteSelector;
      localObject1 = getArguments();
      if (localObject1 == null)
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
      }
      Object localObject2 = "selector";
      Object localObject3 = paramMediaRouteSelector.asBundle();
      ((Bundle)localObject1).putBundle((String)localObject2, (Bundle)localObject3);
      setArguments((Bundle)localObject1);
      localObject1 = this.mCallback;
      if (localObject1 != null)
      {
        localObject1 = this.mRouter;
        localObject2 = this.mCallback;
        ((MediaRouter)localObject1).removeCallback((MediaRouter.Callback)localObject2);
        localObject1 = this.mRouter;
        localObject2 = this.mSelector;
        localObject3 = this.mCallback;
        int i = onPrepareCallbackFlags();
        ((MediaRouter)localObject1).addCallback((MediaRouteSelector)localObject2, (MediaRouter.Callback)localObject3, i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteDiscoveryFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */