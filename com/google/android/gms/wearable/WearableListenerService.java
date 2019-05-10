package com.google.android.gms.wearable;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.util.List;

public abstract class WearableListenerService
  extends Service
  implements CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener, NodeApi.zza
{
  public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
  private boolean zzQl;
  private String zzTJ;
  private IBinder zzakD;
  private Handler zzbro;
  private final Object zzbrp;
  
  public WearableListenerService()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzbrp = localObject;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    Object localObject = "com.google.android.gms.wearable.BIND_LISTENER";
    String str = paramIntent.getAction();
    boolean bool = ((String)localObject).equals(str);
    if (bool) {}
    for (localObject = this.zzakD;; localObject = null)
    {
      return (IBinder)localObject;
      bool = false;
    }
  }
  
  public void onCapabilityChanged(CapabilityInfo paramCapabilityInfo) {}
  
  public void onChannelClosed(Channel paramChannel, int paramInt1, int paramInt2) {}
  
  public void onChannelOpened(Channel paramChannel) {}
  
  public void onConnectedNodes(List paramList) {}
  
  public void onCreate()
  {
    super.onCreate();
    Object localObject1 = "WearableLS";
    int i = 3;
    boolean bool = Log.isLoggable((String)localObject1, i);
    if (bool)
    {
      localObject1 = "WearableLS";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("onCreate: ");
      Object localObject3 = new android/content/ComponentName;
      String str1 = getPackageName();
      String str2 = getClass().getName();
      ((ComponentName)localObject3).<init>(str1, str2);
      localObject3 = ((ComponentName)localObject3).flattenToShortString();
      localObject2 = (String)localObject3;
      Log.d((String)localObject1, (String)localObject2);
    }
    localObject1 = getPackageName();
    this.zzTJ = ((String)localObject1);
    localObject1 = new android/os/HandlerThread;
    ((HandlerThread)localObject1).<init>("WearableListenerService");
    ((HandlerThread)localObject1).start();
    Object localObject2 = new android/os/Handler;
    localObject1 = ((HandlerThread)localObject1).getLooper();
    ((Handler)localObject2).<init>((Looper)localObject1);
    this.zzbro = ((Handler)localObject2);
    localObject1 = new com/google/android/gms/wearable/WearableListenerService$zza;
    ((WearableListenerService.zza)localObject1).<init>(this, null);
    this.zzakD = ((IBinder)localObject1);
  }
  
  public void onDataChanged(DataEventBuffer paramDataEventBuffer) {}
  
  public void onDestroy()
  {
    Object localObject1 = "WearableLS";
    int i = 3;
    boolean bool = Log.isLoggable((String)localObject1, i);
    Object localObject5;
    if (bool)
    {
      localObject1 = "WearableLS";
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append("onDestroy: ");
      localObject5 = new android/content/ComponentName;
      String str1 = getPackageName();
      String str2 = getClass().getName();
      ((ComponentName)localObject5).<init>(str1, str2);
      localObject5 = ((ComponentName)localObject5).flattenToShortString();
      localObject4 = (String)localObject5;
      Log.d((String)localObject1, (String)localObject4);
    }
    Object localObject4 = this.zzbrp;
    bool = true;
    try
    {
      this.zzQl = bool;
      localObject1 = this.zzbro;
      if (localObject1 == null)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject5 = "onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?";
        ((IllegalStateException)localObject1).<init>((String)localObject5);
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.zzbro;
    localObject3 = ((Handler)localObject3).getLooper();
    ((Looper)localObject3).quit();
    super.onDestroy();
  }
  
  public void onInputClosed(Channel paramChannel, int paramInt1, int paramInt2) {}
  
  public void onMessageReceived(MessageEvent paramMessageEvent) {}
  
  public void onOutputClosed(Channel paramChannel, int paramInt1, int paramInt2) {}
  
  public void onPeerConnected(Node paramNode) {}
  
  public void onPeerDisconnected(Node paramNode) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\WearableListenerService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */