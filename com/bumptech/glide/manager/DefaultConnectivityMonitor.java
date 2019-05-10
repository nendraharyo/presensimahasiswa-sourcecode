package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.util.Preconditions;

final class DefaultConnectivityMonitor
  implements ConnectivityMonitor
{
  private static final String TAG = "ConnectivityMonitor";
  private final BroadcastReceiver connectivityReceiver;
  private final Context context;
  boolean isConnected;
  private boolean isRegistered;
  final ConnectivityMonitor.ConnectivityListener listener;
  
  DefaultConnectivityMonitor(Context paramContext, ConnectivityMonitor.ConnectivityListener paramConnectivityListener)
  {
    Object localObject = new com/bumptech/glide/manager/DefaultConnectivityMonitor$1;
    ((DefaultConnectivityMonitor.1)localObject).<init>(this);
    this.connectivityReceiver = ((BroadcastReceiver)localObject);
    localObject = paramContext.getApplicationContext();
    this.context = ((Context)localObject);
    this.listener = paramConnectivityListener;
  }
  
  private void register()
  {
    boolean bool1 = this.isRegistered;
    if (bool1) {}
    for (;;)
    {
      return;
      Context localContext = this.context;
      bool1 = isConnected(localContext);
      this.isConnected = bool1;
      Object localObject1;
      Object localObject2;
      boolean bool2;
      try
      {
        localContext = this.context;
        localObject1 = this.connectivityReceiver;
        localObject2 = new android/content/IntentFilter;
        String str = "android.net.conn.CONNECTIVITY_CHANGE";
        ((IntentFilter)localObject2).<init>(str);
        localContext.registerReceiver((BroadcastReceiver)localObject1, (IntentFilter)localObject2);
        bool1 = true;
        this.isRegistered = bool1;
      }
      catch (SecurityException localSecurityException)
      {
        localObject1 = "ConnectivityMonitor";
        int i = 5;
        bool2 = Log.isLoggable((String)localObject1, i);
      }
      if (bool2)
      {
        localObject1 = "ConnectivityMonitor";
        localObject2 = "Failed to register";
        Log.w((String)localObject1, (String)localObject2, localSecurityException);
      }
    }
  }
  
  private void unregister()
  {
    boolean bool = this.isRegistered;
    if (!bool) {}
    for (;;)
    {
      return;
      Context localContext = this.context;
      BroadcastReceiver localBroadcastReceiver = this.connectivityReceiver;
      localContext.unregisterReceiver(localBroadcastReceiver);
      bool = false;
      localContext = null;
      this.isRegistered = false;
    }
  }
  
  boolean isConnected(Context paramContext)
  {
    bool1 = true;
    Object localObject1 = (ConnectivityManager)Preconditions.checkNotNull((ConnectivityManager)paramContext.getSystemService("connectivity"));
    try
    {
      localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
      if (localObject1 == null) {
        break label89;
      }
      bool2 = ((NetworkInfo)localObject1).isConnected();
      if (!bool2) {
        break label89;
      }
      bool2 = bool1;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        String str1 = "ConnectivityMonitor";
        int i = 5;
        boolean bool3 = Log.isLoggable(str1, i);
        if (bool3)
        {
          str1 = "ConnectivityMonitor";
          String str2 = "Failed to determine connectivity status when connectivity changed";
          Log.w(str1, str2, localRuntimeException);
        }
        boolean bool2 = bool1;
        continue;
        bool2 = false;
        Object localObject2 = null;
      }
    }
    return bool2;
  }
  
  public void onDestroy() {}
  
  public void onStart()
  {
    register();
  }
  
  public void onStop()
  {
    unregister();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\DefaultConnectivityMonitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */