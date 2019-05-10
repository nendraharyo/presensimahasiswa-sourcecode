package android.support.v7.app;

import android.content.Context;
import android.support.v4.view.b;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class MediaRouteActionProvider
  extends b
{
  private static final String TAG = "MediaRouteActionProvider";
  private MediaRouteButton mButton;
  private final MediaRouteActionProvider.MediaRouterCallback mCallback;
  private MediaRouteDialogFactory mDialogFactory;
  private final MediaRouter mRouter;
  private MediaRouteSelector mSelector;
  
  public MediaRouteActionProvider(Context paramContext)
  {
    super(paramContext);
    Object localObject = MediaRouteSelector.EMPTY;
    this.mSelector = ((MediaRouteSelector)localObject);
    localObject = MediaRouteDialogFactory.getDefault();
    this.mDialogFactory = ((MediaRouteDialogFactory)localObject);
    localObject = MediaRouter.getInstance(paramContext);
    this.mRouter = ((MediaRouter)localObject);
    localObject = new android/support/v7/app/MediaRouteActionProvider$MediaRouterCallback;
    ((MediaRouteActionProvider.MediaRouterCallback)localObject).<init>(this);
    this.mCallback = ((MediaRouteActionProvider.MediaRouterCallback)localObject);
  }
  
  private void refreshRoute()
  {
    refreshVisibility();
  }
  
  public MediaRouteDialogFactory getDialogFactory()
  {
    return this.mDialogFactory;
  }
  
  public MediaRouteButton getMediaRouteButton()
  {
    return this.mButton;
  }
  
  public MediaRouteSelector getRouteSelector()
  {
    return this.mSelector;
  }
  
  public boolean isVisible()
  {
    MediaRouter localMediaRouter = this.mRouter;
    MediaRouteSelector localMediaRouteSelector = this.mSelector;
    return localMediaRouter.isRouteAvailable(localMediaRouteSelector, 1);
  }
  
  public View onCreateActionView()
  {
    Object localObject1 = this.mButton;
    if (localObject1 != null)
    {
      localObject1 = "MediaRouteActionProvider";
      localObject2 = "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...";
      Log.e((String)localObject1, (String)localObject2);
    }
    localObject1 = onCreateMediaRouteButton();
    this.mButton = ((MediaRouteButton)localObject1);
    this.mButton.setCheatSheetEnabled(true);
    localObject1 = this.mButton;
    Object localObject2 = this.mSelector;
    ((MediaRouteButton)localObject1).setRouteSelector((MediaRouteSelector)localObject2);
    localObject1 = this.mButton;
    localObject2 = this.mDialogFactory;
    ((MediaRouteButton)localObject1).setDialogFactory((MediaRouteDialogFactory)localObject2);
    localObject1 = this.mButton;
    localObject2 = new android/view/ViewGroup$LayoutParams;
    ((ViewGroup.LayoutParams)localObject2).<init>(-2, -1);
    ((MediaRouteButton)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    return this.mButton;
  }
  
  public MediaRouteButton onCreateMediaRouteButton()
  {
    MediaRouteButton localMediaRouteButton = new android/support/v7/app/MediaRouteButton;
    Context localContext = getContext();
    localMediaRouteButton.<init>(localContext);
    return localMediaRouteButton;
  }
  
  public boolean onPerformDefaultAction()
  {
    MediaRouteButton localMediaRouteButton = this.mButton;
    boolean bool;
    if (localMediaRouteButton != null)
    {
      localMediaRouteButton = this.mButton;
      bool = localMediaRouteButton.showDialog();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMediaRouteButton = null;
    }
  }
  
  public boolean overridesItemVisibility()
  {
    return true;
  }
  
  public void setDialogFactory(MediaRouteDialogFactory paramMediaRouteDialogFactory)
  {
    if (paramMediaRouteDialogFactory == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("factory must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.mDialogFactory;
    if (localObject != paramMediaRouteDialogFactory)
    {
      this.mDialogFactory = paramMediaRouteDialogFactory;
      localObject = this.mButton;
      if (localObject != null)
      {
        localObject = this.mButton;
        ((MediaRouteButton)localObject).setDialogFactory(paramMediaRouteDialogFactory);
      }
    }
  }
  
  public void setRouteSelector(MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("selector must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.mSelector;
    boolean bool = ((MediaRouteSelector)localObject).equals(paramMediaRouteSelector);
    if (!bool)
    {
      localObject = this.mSelector;
      bool = ((MediaRouteSelector)localObject).isEmpty();
      MediaRouteActionProvider.MediaRouterCallback localMediaRouterCallback;
      if (!bool)
      {
        localObject = this.mRouter;
        localMediaRouterCallback = this.mCallback;
        ((MediaRouter)localObject).removeCallback(localMediaRouterCallback);
      }
      bool = paramMediaRouteSelector.isEmpty();
      if (!bool)
      {
        localObject = this.mRouter;
        localMediaRouterCallback = this.mCallback;
        ((MediaRouter)localObject).addCallback(paramMediaRouteSelector, localMediaRouterCallback);
      }
      this.mSelector = paramMediaRouteSelector;
      refreshRoute();
      localObject = this.mButton;
      if (localObject != null)
      {
        localObject = this.mButton;
        ((MediaRouteButton)localObject).setRouteSelector(paramMediaRouteSelector);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteActionProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */