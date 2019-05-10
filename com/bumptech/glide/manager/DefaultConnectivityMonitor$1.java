package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

class DefaultConnectivityMonitor$1
  extends BroadcastReceiver
{
  DefaultConnectivityMonitor$1(DefaultConnectivityMonitor paramDefaultConnectivityMonitor) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject1 = this.this$0;
    boolean bool1 = ((DefaultConnectivityMonitor)localObject1).isConnected;
    Object localObject2 = this.this$0;
    DefaultConnectivityMonitor localDefaultConnectivityMonitor = this.this$0;
    boolean bool2 = localDefaultConnectivityMonitor.isConnected(paramContext);
    ((DefaultConnectivityMonitor)localObject2).isConnected = bool2;
    localObject2 = this.this$0;
    boolean bool3 = ((DefaultConnectivityMonitor)localObject2).isConnected;
    if (bool1 != bool3)
    {
      localObject1 = "ConnectivityMonitor";
      int i = 3;
      bool1 = Log.isLoggable((String)localObject1, i);
      if (bool1)
      {
        localObject1 = "ConnectivityMonitor";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("connectivity changed, isConnected: ");
        localDefaultConnectivityMonitor = this.this$0;
        bool2 = localDefaultConnectivityMonitor.isConnected;
        localObject2 = bool2;
        Log.d((String)localObject1, (String)localObject2);
      }
      localObject1 = this.this$0.listener;
      localObject2 = this.this$0;
      boolean bool4 = ((DefaultConnectivityMonitor)localObject2).isConnected;
      ((ConnectivityMonitor.ConnectivityListener)localObject1).onConnectivityChanged(bool4);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\DefaultConnectivityMonitor$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */