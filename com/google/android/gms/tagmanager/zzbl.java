package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

class zzbl
  extends BroadcastReceiver
{
  static final String zzSZ = zzbl.class.getName();
  private final zzct zzbjA;
  
  zzbl(zzct paramzzct)
  {
    this.zzbjA = paramzzct;
  }
  
  public static void zzbb(Context paramContext)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.google.analytics.RADIO_POWERED");
    String str = paramContext.getPackageName();
    localIntent.addCategory(str);
    str = zzSZ;
    localIntent.putExtra(str, true);
    paramContext.sendBroadcast(localIntent);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject1 = paramIntent.getAction();
    Object localObject2 = "android.net.conn.CONNECTIVITY_CHANGE";
    boolean bool1 = ((String)localObject2).equals(localObject1);
    boolean bool2;
    if (bool1)
    {
      localObject2 = paramIntent.getExtras();
      localObject1 = Boolean.FALSE;
      if (localObject2 != null)
      {
        localObject1 = paramIntent.getExtras();
        localObject2 = "noConnectivity";
        bool2 = ((Bundle)localObject1).getBoolean((String)localObject2);
        localObject1 = Boolean.valueOf(bool2);
      }
      localObject2 = this.zzbjA;
      bool2 = ((Boolean)localObject1).booleanValue();
      if (!bool2)
      {
        bool2 = true;
        ((zzct)localObject2).zzay(bool2);
      }
    }
    for (;;)
    {
      return;
      bool2 = false;
      localObject1 = null;
      break;
      localObject2 = "com.google.analytics.RADIO_POWERED";
      bool2 = ((String)localObject2).equals(localObject1);
      if (bool2)
      {
        localObject1 = zzSZ;
        bool2 = paramIntent.hasExtra((String)localObject1);
        if (!bool2)
        {
          localObject1 = this.zzbjA;
          ((zzct)localObject1).zzjg();
        }
      }
    }
  }
  
  public void zzba(Context paramContext)
  {
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    paramContext.registerReceiver(this, localIntentFilter);
    localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>();
    localIntentFilter.addAction("com.google.analytics.RADIO_POWERED");
    String str = paramContext.getPackageName();
    localIntentFilter.addCategory(str);
    paramContext.registerReceiver(this, localIntentFilter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzbl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */