package android.support.v7.media;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

final class MediaRouteProviderService$ClientRecord
  implements IBinder.DeathRecipient
{
  private final SparseArray mControllers;
  public MediaRouteDiscoveryRequest mDiscoveryRequest;
  public final Messenger mMessenger;
  public final int mVersion;
  
  public MediaRouteProviderService$ClientRecord(MediaRouteProviderService paramMediaRouteProviderService, Messenger paramMessenger, int paramInt)
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    this.mControllers = localSparseArray;
    this.mMessenger = paramMessenger;
    this.mVersion = paramInt;
  }
  
  public void binderDied()
  {
    MediaRouteProviderService.PrivateHandler localPrivateHandler = MediaRouteProviderService.access$900(this.this$0);
    Messenger localMessenger = this.mMessenger;
    localPrivateHandler.obtainMessage(1, localMessenger).sendToTarget();
  }
  
  public boolean createRouteController(String paramString, int paramInt)
  {
    Object localObject = this.mControllers;
    int i = ((SparseArray)localObject).indexOfKey(paramInt);
    if (i < 0)
    {
      localObject = MediaRouteProviderService.access$700(this.this$0).onCreateRouteController(paramString);
      if (localObject != null)
      {
        SparseArray localSparseArray = this.mControllers;
        localSparseArray.put(paramInt, localObject);
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localObject = null;
    }
  }
  
  public void dispose()
  {
    Object localObject = this.mControllers;
    int i = ((SparseArray)localObject).size();
    int k;
    for (int j = 0; j < i; j = k)
    {
      localObject = (MediaRouteProvider.RouteController)this.mControllers.valueAt(j);
      ((MediaRouteProvider.RouteController)localObject).onRelease();
      k = j + 1;
    }
    this.mControllers.clear();
    this.mMessenger.getBinder().unlinkToDeath(this, 0);
    setDiscoveryRequest(null);
  }
  
  public MediaRouteProvider.RouteController getRouteController(int paramInt)
  {
    return (MediaRouteProvider.RouteController)this.mControllers.get(paramInt);
  }
  
  public boolean hasMessenger(Messenger paramMessenger)
  {
    IBinder localIBinder1 = this.mMessenger.getBinder();
    IBinder localIBinder2 = paramMessenger.getBinder();
    boolean bool;
    if (localIBinder1 == localIBinder2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localIBinder1 = null;
    }
  }
  
  public boolean register()
  {
    boolean bool = false;
    try
    {
      Object localObject = this.mMessenger;
      localObject = ((Messenger)localObject).getBinder();
      ((IBinder)localObject).linkToDeath(this, 0);
      bool = true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        binderDied();
      }
    }
    return bool;
  }
  
  public boolean releaseRouteController(int paramInt)
  {
    MediaRouteProvider.RouteController localRouteController = (MediaRouteProvider.RouteController)this.mControllers.get(paramInt);
    boolean bool;
    if (localRouteController != null)
    {
      SparseArray localSparseArray = this.mControllers;
      localSparseArray.remove(paramInt);
      localRouteController.onRelease();
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRouteController = null;
    }
  }
  
  public boolean setDiscoveryRequest(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    Object localObject = this.mDiscoveryRequest;
    boolean bool;
    if (localObject != paramMediaRouteDiscoveryRequest)
    {
      localObject = this.mDiscoveryRequest;
      if (localObject != null)
      {
        localObject = this.mDiscoveryRequest;
        bool = ((MediaRouteDiscoveryRequest)localObject).equals(paramMediaRouteDiscoveryRequest);
        if (bool) {}
      }
      else
      {
        this.mDiscoveryRequest = paramMediaRouteDiscoveryRequest;
        localObject = this.this$0;
        bool = MediaRouteProviderService.access$800((MediaRouteProviderService)localObject);
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public String toString()
  {
    return MediaRouteProviderService.access$1000(this.mMessenger);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteProviderService$ClientRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */