package com.bumptech.glide.manager;

import android.content.Context;
import android.support.v4.a.b;
import android.util.Log;

public class DefaultConnectivityMonitorFactory
  implements ConnectivityMonitorFactory
{
  private static final String NETWORK_PERMISSION = "android.permission.ACCESS_NETWORK_STATE";
  private static final String TAG = "ConnectivityMonitor";
  
  public ConnectivityMonitor build(Context paramContext, ConnectivityMonitor.ConnectivityListener paramConnectivityListener)
  {
    Object localObject = "android.permission.ACCESS_NETWORK_STATE";
    int i = b.a(paramContext, (String)localObject);
    String str1;
    if (i == 0)
    {
      i = 1;
      str1 = "ConnectivityMonitor";
      int j = 3;
      boolean bool = Log.isLoggable(str1, j);
      if (bool)
      {
        String str2 = "ConnectivityMonitor";
        if (i == 0) {
          break label85;
        }
        str1 = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
        label52:
        Log.d(str2, str1);
      }
      if (i == 0) {
        break label92;
      }
      localObject = new com/bumptech/glide/manager/DefaultConnectivityMonitor;
      ((DefaultConnectivityMonitor)localObject).<init>(paramContext, paramConnectivityListener);
    }
    for (;;)
    {
      return (ConnectivityMonitor)localObject;
      i = 0;
      localObject = null;
      break;
      label85:
      str1 = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
      break label52;
      label92:
      localObject = new com/bumptech/glide/manager/NullConnectivityMonitor;
      ((NullConnectivityMonitor)localObject).<init>();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\DefaultConnectivityMonitorFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */