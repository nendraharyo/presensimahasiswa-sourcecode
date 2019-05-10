package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

final class RegisteredMediaRouteProvider$Connection
  implements IBinder.DeathRecipient
{
  private int mNextControllerId;
  private int mNextRequestId;
  private final SparseArray mPendingCallbacks;
  private int mPendingRegisterRequestId;
  private final RegisteredMediaRouteProvider.ReceiveHandler mReceiveHandler;
  private final Messenger mReceiveMessenger;
  private final Messenger mServiceMessenger;
  private int mServiceVersion;
  
  public RegisteredMediaRouteProvider$Connection(RegisteredMediaRouteProvider paramRegisteredMediaRouteProvider, Messenger paramMessenger)
  {
    this.mNextRequestId = i;
    this.mNextControllerId = i;
    Object localObject = new android/util/SparseArray;
    ((SparseArray)localObject).<init>();
    this.mPendingCallbacks = ((SparseArray)localObject);
    this.mServiceMessenger = paramMessenger;
    localObject = new android/support/v7/media/RegisteredMediaRouteProvider$ReceiveHandler;
    ((RegisteredMediaRouteProvider.ReceiveHandler)localObject).<init>(this);
    this.mReceiveHandler = ((RegisteredMediaRouteProvider.ReceiveHandler)localObject);
    localObject = new android/os/Messenger;
    RegisteredMediaRouteProvider.ReceiveHandler localReceiveHandler = this.mReceiveHandler;
    ((Messenger)localObject).<init>(localReceiveHandler);
    this.mReceiveMessenger = ((Messenger)localObject);
  }
  
  private void failPendingCallbacks()
  {
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = this.mPendingCallbacks;
      i = ((SparseArray)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = (MediaRouter.ControlRequestCallback)this.mPendingCallbacks.valueAt(j);
      ((MediaRouter.ControlRequestCallback)localObject).onError(null, null);
      i = j + 1;
    }
    this.mPendingCallbacks.clear();
  }
  
  private boolean sendRequest(int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
  {
    Message localMessage = Message.obtain();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramObject;
    localMessage.setData(paramBundle);
    localObject2 = this.mReceiveMessenger;
    localMessage.replyTo = ((Messenger)localObject2);
    try
    {
      localObject2 = this.mServiceMessenger;
      ((Messenger)localObject2).send(localMessage);
      bool = true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        int i = 2;
        if (paramInt1 != i)
        {
          localObject2 = "MediaRouteProviderProxy";
          String str = "Could not send message to service.";
          Log.e((String)localObject2, str, localRemoteException);
        }
        boolean bool = false;
        Object localObject1 = null;
      }
    }
    catch (DeadObjectException localDeadObjectException)
    {
      for (;;) {}
    }
    return bool;
  }
  
  public void binderDied()
  {
    RegisteredMediaRouteProvider.PrivateHandler localPrivateHandler = RegisteredMediaRouteProvider.access$300(this.this$0);
    RegisteredMediaRouteProvider.Connection.2 local2 = new android/support/v7/media/RegisteredMediaRouteProvider$Connection$2;
    local2.<init>(this);
    localPrivateHandler.post(local2);
  }
  
  public int createRouteController(String paramString)
  {
    int i = this.mNextControllerId;
    int j = i + 1;
    this.mNextControllerId = j;
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putString("routeId", paramString);
    int k = this.mNextRequestId;
    j = k + 1;
    this.mNextRequestId = j;
    sendRequest(3, k, i, null, localBundle);
    return i;
  }
  
  public void dispose()
  {
    Object localObject = this;
    sendRequest(2, 0, 0, null, null);
    this.mReceiveHandler.dispose();
    this.mServiceMessenger.getBinder().unlinkToDeath(this, 0);
    localObject = RegisteredMediaRouteProvider.access$300(this.this$0);
    RegisteredMediaRouteProvider.Connection.1 local1 = new android/support/v7/media/RegisteredMediaRouteProvider$Connection$1;
    local1.<init>(this);
    ((RegisteredMediaRouteProvider.PrivateHandler)localObject).post(local1);
  }
  
  public boolean onControlRequestFailed(int paramInt, String paramString, Bundle paramBundle)
  {
    MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)this.mPendingCallbacks.get(paramInt);
    boolean bool;
    if (localControlRequestCallback != null)
    {
      SparseArray localSparseArray = this.mPendingCallbacks;
      localSparseArray.remove(paramInt);
      localControlRequestCallback.onError(paramString, paramBundle);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localControlRequestCallback = null;
    }
  }
  
  public boolean onControlRequestSucceeded(int paramInt, Bundle paramBundle)
  {
    MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)this.mPendingCallbacks.get(paramInt);
    boolean bool;
    if (localControlRequestCallback != null)
    {
      SparseArray localSparseArray = this.mPendingCallbacks;
      localSparseArray.remove(paramInt);
      localControlRequestCallback.onResult(paramBundle);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localControlRequestCallback = null;
    }
  }
  
  public boolean onDescriptorChanged(Bundle paramBundle)
  {
    int i = this.mServiceVersion;
    RegisteredMediaRouteProvider localRegisteredMediaRouteProvider;
    if (i != 0)
    {
      localRegisteredMediaRouteProvider = this.this$0;
      MediaRouteProviderDescriptor localMediaRouteProviderDescriptor = MediaRouteProviderDescriptor.fromBundle(paramBundle);
      RegisteredMediaRouteProvider.access$500(localRegisteredMediaRouteProvider, this, localMediaRouteProviderDescriptor);
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localRegisteredMediaRouteProvider = null;
    }
  }
  
  public boolean onGenericFailure(int paramInt)
  {
    int i = this.mPendingRegisterRequestId;
    Object localObject2;
    if (paramInt == i)
    {
      i = 0;
      this.mPendingRegisterRequestId = 0;
      localObject1 = this.this$0;
      localObject2 = "Registation failed";
      RegisteredMediaRouteProvider.access$400((RegisteredMediaRouteProvider)localObject1, this, (String)localObject2);
    }
    Object localObject1 = (MediaRouter.ControlRequestCallback)this.mPendingCallbacks.get(paramInt);
    if (localObject1 != null)
    {
      localObject2 = this.mPendingCallbacks;
      ((SparseArray)localObject2).remove(paramInt);
      ((MediaRouter.ControlRequestCallback)localObject1).onError(null, null);
    }
    return true;
  }
  
  public boolean onGenericSuccess(int paramInt)
  {
    return true;
  }
  
  public boolean onRegistered(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    int i = 1;
    RegisteredMediaRouteProvider localRegisteredMediaRouteProvider = null;
    int j = this.mServiceVersion;
    if (j == 0)
    {
      j = this.mPendingRegisterRequestId;
      if ((paramInt1 == j) && (paramInt2 >= i))
      {
        this.mPendingRegisterRequestId = 0;
        this.mServiceVersion = paramInt2;
        localRegisteredMediaRouteProvider = this.this$0;
        MediaRouteProviderDescriptor localMediaRouteProviderDescriptor = MediaRouteProviderDescriptor.fromBundle(paramBundle);
        RegisteredMediaRouteProvider.access$500(localRegisteredMediaRouteProvider, this, localMediaRouteProviderDescriptor);
        localRegisteredMediaRouteProvider = this.this$0;
        RegisteredMediaRouteProvider.access$600(localRegisteredMediaRouteProvider, this);
      }
    }
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public boolean register()
  {
    int i = 1;
    int k = this.mNextRequestId;
    int m = k + 1;
    this.mNextRequestId = m;
    this.mPendingRegisterRequestId = k;
    m = this.mPendingRegisterRequestId;
    Object localObject = this;
    boolean bool = sendRequest(i, m, i, null, null);
    if (!bool) {
      i = 0;
    }
    for (;;)
    {
      return i;
      try
      {
        localObject = this.mServiceMessenger;
        localObject = ((Messenger)localObject).getBinder();
        m = 0;
        ((IBinder)localObject).linkToDeath(this, 0);
      }
      catch (RemoteException localRemoteException)
      {
        binderDied();
        int j = 0;
      }
    }
  }
  
  public void releaseRouteController(int paramInt)
  {
    int i = this.mNextRequestId;
    int j = i + 1;
    this.mNextRequestId = j;
    sendRequest(4, i, paramInt, null, null);
  }
  
  public void selectRoute(int paramInt)
  {
    int i = this.mNextRequestId;
    int j = i + 1;
    this.mNextRequestId = j;
    sendRequest(5, i, paramInt, null, null);
  }
  
  public boolean sendControlRequest(int paramInt, Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    int i = this.mNextRequestId;
    int j = i + 1;
    this.mNextRequestId = j;
    int k = 9;
    Object localObject = this;
    boolean bool = sendRequest(k, i, paramInt, paramIntent, null);
    if (bool)
    {
      if (paramControlRequestCallback != null)
      {
        localObject = this.mPendingCallbacks;
        ((SparseArray)localObject).put(i, paramControlRequestCallback);
      }
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public void setDiscoveryRequest(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    int i = 10;
    int j = this.mNextRequestId;
    int k = j + 1;
    this.mNextRequestId = k;
    if (paramMediaRouteDiscoveryRequest != null) {}
    for (Bundle localBundle = paramMediaRouteDiscoveryRequest.asBundle();; localBundle = null)
    {
      sendRequest(i, j, 0, localBundle, null);
      return;
    }
  }
  
  public void setVolume(int paramInt1, int paramInt2)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putInt("volume", paramInt2);
    int i = this.mNextRequestId;
    int j = i + 1;
    this.mNextRequestId = j;
    sendRequest(7, i, paramInt1, null, localBundle);
  }
  
  public void unselectRoute(int paramInt1, int paramInt2)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putInt("unselectReason", paramInt2);
    int i = this.mNextRequestId;
    int j = i + 1;
    this.mNextRequestId = j;
    sendRequest(6, i, paramInt1, null, localBundle);
  }
  
  public void updateVolume(int paramInt1, int paramInt2)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putInt("volume", paramInt2);
    int i = this.mNextRequestId;
    int j = i + 1;
    this.mNextRequestId = j;
    sendRequest(8, i, paramInt1, null, localBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RegisteredMediaRouteProvider$Connection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */