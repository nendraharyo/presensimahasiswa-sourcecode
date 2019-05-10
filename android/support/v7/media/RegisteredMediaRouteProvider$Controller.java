package android.support.v7.media;

import android.content.Intent;

final class RegisteredMediaRouteProvider$Controller
  extends MediaRouteProvider.RouteController
{
  private RegisteredMediaRouteProvider.Connection mConnection;
  private int mControllerId;
  private int mPendingSetVolume = -1;
  private int mPendingUpdateVolumeDelta;
  private final String mRouteId;
  private boolean mSelected;
  
  public RegisteredMediaRouteProvider$Controller(RegisteredMediaRouteProvider paramRegisteredMediaRouteProvider, String paramString)
  {
    this.mRouteId = paramString;
  }
  
  public void attachConnection(RegisteredMediaRouteProvider.Connection paramConnection)
  {
    this.mConnection = paramConnection;
    String str = this.mRouteId;
    int i = paramConnection.createRouteController(str);
    this.mControllerId = i;
    boolean bool = this.mSelected;
    if (bool)
    {
      int j = this.mControllerId;
      paramConnection.selectRoute(j);
      j = this.mPendingSetVolume;
      int k;
      if (j >= 0)
      {
        j = this.mControllerId;
        k = this.mPendingSetVolume;
        paramConnection.setVolume(j, k);
        j = -1;
        this.mPendingSetVolume = j;
      }
      j = this.mPendingUpdateVolumeDelta;
      if (j != 0)
      {
        j = this.mControllerId;
        k = this.mPendingUpdateVolumeDelta;
        paramConnection.updateVolume(j, k);
        j = 0;
        str = null;
        this.mPendingUpdateVolumeDelta = 0;
      }
    }
  }
  
  public void detachConnection()
  {
    RegisteredMediaRouteProvider.Connection localConnection = this.mConnection;
    if (localConnection != null)
    {
      localConnection = this.mConnection;
      int i = this.mControllerId;
      localConnection.releaseRouteController(i);
      this.mConnection = null;
      localConnection = null;
      this.mControllerId = 0;
    }
  }
  
  public boolean onControlRequest(Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    RegisteredMediaRouteProvider.Connection localConnection = this.mConnection;
    boolean bool;
    if (localConnection != null)
    {
      localConnection = this.mConnection;
      int i = this.mControllerId;
      bool = localConnection.sendControlRequest(i, paramIntent, paramControlRequestCallback);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localConnection = null;
    }
  }
  
  public void onRelease()
  {
    RegisteredMediaRouteProvider.access$100(this.this$0, this);
  }
  
  public void onSelect()
  {
    boolean bool = true;
    this.mSelected = bool;
    RegisteredMediaRouteProvider.Connection localConnection = this.mConnection;
    if (localConnection != null)
    {
      localConnection = this.mConnection;
      int i = this.mControllerId;
      localConnection.selectRoute(i);
    }
  }
  
  public void onSetVolume(int paramInt)
  {
    RegisteredMediaRouteProvider.Connection localConnection = this.mConnection;
    if (localConnection != null)
    {
      localConnection = this.mConnection;
      int i = this.mControllerId;
      localConnection.setVolume(i, paramInt);
    }
    for (;;)
    {
      return;
      this.mPendingSetVolume = paramInt;
      localConnection = null;
      this.mPendingUpdateVolumeDelta = 0;
    }
  }
  
  public void onUnselect()
  {
    onUnselect(0);
  }
  
  public void onUnselect(int paramInt)
  {
    this.mSelected = false;
    RegisteredMediaRouteProvider.Connection localConnection = this.mConnection;
    if (localConnection != null)
    {
      localConnection = this.mConnection;
      int i = this.mControllerId;
      localConnection.unselectRoute(i, paramInt);
    }
  }
  
  public void onUpdateVolume(int paramInt)
  {
    RegisteredMediaRouteProvider.Connection localConnection = this.mConnection;
    if (localConnection != null)
    {
      localConnection = this.mConnection;
      int i = this.mControllerId;
      localConnection.updateVolume(i, paramInt);
    }
    for (;;)
    {
      return;
      int j = this.mPendingUpdateVolumeDelta + paramInt;
      this.mPendingUpdateVolumeDelta = j;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RegisteredMediaRouteProvider$Controller.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */