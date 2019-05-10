package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

final class RegisteredMediaRouteProvider
  extends MediaRouteProvider
  implements ServiceConnection
{
  private static final boolean DEBUG = Log.isLoggable("MediaRouteProviderProxy", 3);
  private static final String TAG = "MediaRouteProviderProxy";
  private RegisteredMediaRouteProvider.Connection mActiveConnection;
  private boolean mBound;
  private final ComponentName mComponentName;
  private boolean mConnectionReady;
  private final ArrayList mControllers;
  private final RegisteredMediaRouteProvider.PrivateHandler mPrivateHandler;
  private boolean mStarted;
  
  public RegisteredMediaRouteProvider(Context paramContext, ComponentName paramComponentName)
  {
    super(paramContext, (MediaRouteProvider.ProviderMetadata)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mControllers = ((ArrayList)localObject);
    this.mComponentName = paramComponentName;
    localObject = new android/support/v7/media/RegisteredMediaRouteProvider$PrivateHandler;
    ((RegisteredMediaRouteProvider.PrivateHandler)localObject).<init>(this, null);
    this.mPrivateHandler = ((RegisteredMediaRouteProvider.PrivateHandler)localObject);
  }
  
  private void attachControllersToConnection()
  {
    int i = this.mControllers.size();
    int j = 0;
    RegisteredMediaRouteProvider.Controller localController = null;
    for (int k = 0; k < i; k = j)
    {
      localController = (RegisteredMediaRouteProvider.Controller)this.mControllers.get(k);
      RegisteredMediaRouteProvider.Connection localConnection = this.mActiveConnection;
      localController.attachConnection(localConnection);
      j = k + 1;
    }
  }
  
  private void bind()
  {
    boolean bool1 = this.mBound;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (!bool1)
    {
      bool1 = DEBUG;
      if (bool1)
      {
        localObject1 = "MediaRouteProviderProxy";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append(this);
        localObject3 = ": Binding";
        localObject2 = (String)localObject3;
        Log.d((String)localObject1, (String)localObject2);
      }
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>("android.media.MediaRouteProviderService");
      localObject2 = this.mComponentName;
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
    }
    try
    {
      localObject2 = getContext();
      int i = 1;
      bool1 = ((Context)localObject2).bindService((Intent)localObject1, this, i);
      this.mBound = bool1;
      bool1 = this.mBound;
      if (!bool1)
      {
        bool1 = DEBUG;
        if (bool1)
        {
          localObject1 = "MediaRouteProviderProxy";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append(this);
          localObject3 = ": Bind failed";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
          localObject2 = ((StringBuilder)localObject2).toString();
          Log.d((String)localObject1, (String)localObject2);
        }
      }
      return;
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        boolean bool2 = DEBUG;
        if (bool2)
        {
          localObject2 = "MediaRouteProviderProxy";
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append(this);
          String str = ": Bind failed";
          localObject3 = str;
          Log.d((String)localObject2, (String)localObject3, localSecurityException);
        }
      }
    }
  }
  
  private void detachControllersFromConnection()
  {
    int i = this.mControllers.size();
    int j = 0;
    RegisteredMediaRouteProvider.Controller localController = null;
    for (int k = 0; k < i; k = j)
    {
      localController = (RegisteredMediaRouteProvider.Controller)this.mControllers.get(k);
      localController.detachConnection();
      j = k + 1;
    }
  }
  
  private void disconnect()
  {
    RegisteredMediaRouteProvider.Connection localConnection = this.mActiveConnection;
    if (localConnection != null)
    {
      setDescriptor(null);
      this.mConnectionReady = false;
      detachControllersFromConnection();
      localConnection = this.mActiveConnection;
      localConnection.dispose();
      this.mActiveConnection = null;
    }
  }
  
  private void onConnectionDescriptorChanged(RegisteredMediaRouteProvider.Connection paramConnection, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    Object localObject1 = this.mActiveConnection;
    if (localObject1 == paramConnection)
    {
      boolean bool = DEBUG;
      if (bool)
      {
        localObject1 = "MediaRouteProviderProxy";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append(this);
        String str = ": Descriptor changed, descriptor=";
        localObject2 = str + paramMediaRouteProviderDescriptor;
        Log.d((String)localObject1, (String)localObject2);
      }
      setDescriptor(paramMediaRouteProviderDescriptor);
    }
  }
  
  private void onConnectionDied(RegisteredMediaRouteProvider.Connection paramConnection)
  {
    Object localObject1 = this.mActiveConnection;
    if (localObject1 == paramConnection)
    {
      boolean bool = DEBUG;
      if (bool)
      {
        localObject1 = "MediaRouteProviderProxy";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append(this);
        String str = ": Service connection died";
        localObject2 = str;
        Log.d((String)localObject1, (String)localObject2);
      }
      disconnect();
    }
  }
  
  private void onConnectionError(RegisteredMediaRouteProvider.Connection paramConnection, String paramString)
  {
    Object localObject1 = this.mActiveConnection;
    if (localObject1 == paramConnection)
    {
      boolean bool = DEBUG;
      if (bool)
      {
        localObject1 = "MediaRouteProviderProxy";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append(this);
        String str = ": Service connection error - ";
        localObject2 = str + paramString;
        Log.d((String)localObject1, (String)localObject2);
      }
      unbind();
    }
  }
  
  private void onConnectionReady(RegisteredMediaRouteProvider.Connection paramConnection)
  {
    Object localObject = this.mActiveConnection;
    if (localObject == paramConnection)
    {
      boolean bool = true;
      this.mConnectionReady = bool;
      attachControllersToConnection();
      localObject = getDiscoveryRequest();
      if (localObject != null)
      {
        RegisteredMediaRouteProvider.Connection localConnection = this.mActiveConnection;
        localConnection.setDiscoveryRequest((MediaRouteDiscoveryRequest)localObject);
      }
    }
  }
  
  private void onControllerReleased(RegisteredMediaRouteProvider.Controller paramController)
  {
    this.mControllers.remove(paramController);
    paramController.detachConnection();
    updateBinding();
  }
  
  private boolean shouldBind()
  {
    boolean bool1 = true;
    boolean bool2 = this.mStarted;
    Object localObject;
    if (bool2)
    {
      localObject = getDiscoveryRequest();
      if (localObject == null) {}
    }
    for (;;)
    {
      return bool1;
      localObject = this.mControllers;
      bool2 = ((ArrayList)localObject).isEmpty();
      if (bool2) {
        bool1 = false;
      }
    }
  }
  
  private void unbind()
  {
    boolean bool = this.mBound;
    if (bool)
    {
      bool = DEBUG;
      if (bool)
      {
        localObject1 = "MediaRouteProviderProxy";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append(this);
        String str = ": Unbinding";
        localObject2 = str;
        Log.d((String)localObject1, (String)localObject2);
      }
      bool = false;
      this.mBound = false;
      disconnect();
      Object localObject1 = getContext();
      ((Context)localObject1).unbindService(this);
    }
  }
  
  private void updateBinding()
  {
    boolean bool = shouldBind();
    if (bool) {
      bind();
    }
    for (;;)
    {
      return;
      unbind();
    }
  }
  
  public boolean hasComponentName(String paramString1, String paramString2)
  {
    String str = this.mComponentName.getPackageName();
    boolean bool = str.equals(paramString1);
    if (bool)
    {
      str = this.mComponentName.getClassName();
      bool = str.equals(paramString2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public MediaRouteProvider.RouteController onCreateRouteController(String paramString)
  {
    Object localObject1 = getDescriptor();
    boolean bool2;
    if (localObject1 != null)
    {
      List localList = ((MediaRouteProviderDescriptor)localObject1).getRoutes();
      int i = localList.size();
      boolean bool1 = false;
      localObject1 = null;
      int k = 0;
      Object localObject2 = null;
      if (k < i)
      {
        localObject1 = ((MediaRouteDescriptor)localList.get(k)).getId();
        bool1 = ((String)localObject1).equals(paramString);
        if (bool1)
        {
          localObject1 = new android/support/v7/media/RegisteredMediaRouteProvider$Controller;
          ((RegisteredMediaRouteProvider.Controller)localObject1).<init>(this, paramString);
          localObject2 = this.mControllers;
          ((ArrayList)localObject2).add(localObject1);
          bool2 = this.mConnectionReady;
          if (bool2)
          {
            localObject2 = this.mActiveConnection;
            ((RegisteredMediaRouteProvider.Controller)localObject1).attachConnection((RegisteredMediaRouteProvider.Connection)localObject2);
          }
          updateBinding();
        }
      }
    }
    for (;;)
    {
      return (MediaRouteProvider.RouteController)localObject1;
      int j = bool2 + true;
      bool2 = j;
      break;
      j = 0;
      localObject1 = null;
    }
  }
  
  public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    boolean bool = this.mConnectionReady;
    if (bool)
    {
      RegisteredMediaRouteProvider.Connection localConnection = this.mActiveConnection;
      localConnection.setDiscoveryRequest(paramMediaRouteDiscoveryRequest);
    }
    updateBinding();
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    boolean bool1 = DEBUG;
    Object localObject1;
    Object localObject2;
    String str;
    if (bool1)
    {
      localObject1 = "MediaRouteProviderProxy";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(this);
      str = ": Connected";
      localObject2 = str;
      Log.d((String)localObject1, (String)localObject2);
    }
    bool1 = this.mBound;
    if (bool1)
    {
      disconnect();
      if (paramIBinder == null) {
        break label124;
      }
      localObject1 = new android/os/Messenger;
      ((Messenger)localObject1).<init>(paramIBinder);
      boolean bool2 = MediaRouteProviderProtocol.isValidRemoteMessenger((Messenger)localObject1);
      if (!bool2) {
        break label190;
      }
      localObject2 = new android/support/v7/media/RegisteredMediaRouteProvider$Connection;
      ((RegisteredMediaRouteProvider.Connection)localObject2).<init>(this, (Messenger)localObject1);
      bool1 = ((RegisteredMediaRouteProvider.Connection)localObject2).register();
      if (!bool1) {
        break label132;
      }
      this.mActiveConnection = ((RegisteredMediaRouteProvider.Connection)localObject2);
    }
    for (;;)
    {
      return;
      label124:
      bool1 = false;
      localObject1 = null;
      break;
      label132:
      bool1 = DEBUG;
      if (bool1)
      {
        localObject1 = "MediaRouteProviderProxy";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append(this);
        str = ": Registration failed";
        localObject2 = str;
        Log.d((String)localObject1, (String)localObject2);
        continue;
        label190:
        localObject1 = "MediaRouteProviderProxy";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append(this);
        str = ": Service returned invalid messenger binder";
        localObject2 = str;
        Log.e((String)localObject1, (String)localObject2);
      }
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    boolean bool = DEBUG;
    if (bool)
    {
      String str1 = "MediaRouteProviderProxy";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(this);
      String str2 = ": Service disconnected";
      localObject = str2;
      Log.d(str1, (String)localObject);
    }
    disconnect();
  }
  
  public void rebindIfDisconnected()
  {
    RegisteredMediaRouteProvider.Connection localConnection = this.mActiveConnection;
    if (localConnection == null)
    {
      boolean bool = shouldBind();
      if (bool)
      {
        unbind();
        bind();
      }
    }
  }
  
  public void start()
  {
    boolean bool = this.mStarted;
    if (!bool)
    {
      bool = DEBUG;
      if (bool)
      {
        String str1 = "MediaRouteProviderProxy";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append(this);
        String str2 = ": Starting";
        localObject = str2;
        Log.d(str1, (String)localObject);
      }
      bool = true;
      this.mStarted = bool;
      updateBinding();
    }
  }
  
  public void stop()
  {
    boolean bool = this.mStarted;
    if (bool)
    {
      bool = DEBUG;
      if (bool)
      {
        str1 = "MediaRouteProviderProxy";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append(this);
        String str2 = ": Stopping";
        localObject = str2;
        Log.d(str1, (String)localObject);
      }
      bool = false;
      String str1 = null;
      this.mStarted = false;
      updateBinding();
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Service connection ");
    String str = this.mComponentName.flattenToShortString();
    return str;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RegisteredMediaRouteProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */