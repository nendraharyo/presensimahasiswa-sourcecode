package com.crashlytics.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

class DevicePowerStateListener
{
  private static final IntentFilter FILTER_BATTERY_CHANGED;
  private static final IntentFilter FILTER_POWER_CONNECTED;
  private static final IntentFilter FILTER_POWER_DISCONNECTED;
  private final Context context;
  private boolean isPowerConnected;
  private final BroadcastReceiver powerConnectedReceiver;
  private final BroadcastReceiver powerDisconnectedReceiver;
  private final AtomicBoolean receiversRegistered;
  
  static
  {
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>("android.intent.action.BATTERY_CHANGED");
    FILTER_BATTERY_CHANGED = localIntentFilter;
    localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>("android.intent.action.ACTION_POWER_CONNECTED");
    FILTER_POWER_CONNECTED = localIntentFilter;
    localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>("android.intent.action.ACTION_POWER_DISCONNECTED");
    FILTER_POWER_DISCONNECTED = localIntentFilter;
  }
  
  public DevicePowerStateListener(Context paramContext)
  {
    this.context = paramContext;
    Object localObject = new com/crashlytics/android/core/DevicePowerStateListener$1;
    ((DevicePowerStateListener.1)localObject).<init>(this);
    this.powerConnectedReceiver = ((BroadcastReceiver)localObject);
    localObject = new com/crashlytics/android/core/DevicePowerStateListener$2;
    ((DevicePowerStateListener.2)localObject).<init>(this);
    this.powerDisconnectedReceiver = ((BroadcastReceiver)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    this.receiversRegistered = ((AtomicBoolean)localObject);
  }
  
  public void dispose()
  {
    Object localObject = this.receiversRegistered;
    BroadcastReceiver localBroadcastReceiver = null;
    boolean bool = ((AtomicBoolean)localObject).getAndSet(false);
    if (!bool) {}
    for (;;)
    {
      return;
      localObject = this.context;
      localBroadcastReceiver = this.powerConnectedReceiver;
      ((Context)localObject).unregisterReceiver(localBroadcastReceiver);
      localObject = this.context;
      localBroadcastReceiver = this.powerDisconnectedReceiver;
      ((Context)localObject).unregisterReceiver(localBroadcastReceiver);
    }
  }
  
  public void initialize()
  {
    boolean bool1 = true;
    int i = -1;
    Object localObject = this.receiversRegistered;
    boolean bool2 = ((AtomicBoolean)localObject).getAndSet(bool1);
    if (bool2) {
      return;
    }
    localObject = this.context;
    String str = null;
    IntentFilter localIntentFilter = FILTER_BATTERY_CHANGED;
    localObject = ((Context)localObject).registerReceiver(null, localIntentFilter);
    if (localObject != null)
    {
      str = "status";
      i = ((Intent)localObject).getIntExtra(str, i);
    }
    int j = 2;
    if (i != j)
    {
      j = 5;
      if (i != j) {
        break label135;
      }
    }
    for (;;)
    {
      this.isPowerConnected = bool1;
      Context localContext = this.context;
      BroadcastReceiver localBroadcastReceiver = this.powerConnectedReceiver;
      localObject = FILTER_POWER_CONNECTED;
      localContext.registerReceiver(localBroadcastReceiver, (IntentFilter)localObject);
      localContext = this.context;
      localBroadcastReceiver = this.powerDisconnectedReceiver;
      localObject = FILTER_POWER_DISCONNECTED;
      localContext.registerReceiver(localBroadcastReceiver, (IntentFilter)localObject);
      break;
      label135:
      bool1 = false;
      localContext = null;
    }
  }
  
  public boolean isPowerConnected()
  {
    return this.isPowerConnected;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\DevicePowerStateListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */