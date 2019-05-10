package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

public final class zzmv
{
  private static IntentFilter zzaob;
  private static long zzaoc;
  private static float zzaod = 0.0F / 0.0F;
  
  static
  {
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>("android.intent.action.BATTERY_CHANGED");
    zzaob = localIntentFilter;
  }
  
  public static int zzax(Context paramContext)
  {
    int i = -1;
    int j = 1;
    int k;
    if (paramContext != null)
    {
      localObject = paramContext.getApplicationContext();
      if (localObject != null) {}
    }
    else
    {
      k = i;
      return k;
    }
    Object localObject = paramContext.getApplicationContext();
    int n = 0;
    String str = null;
    IntentFilter localIntentFilter = zzaob;
    localObject = ((Context)localObject).registerReceiver(null, localIntentFilter);
    if (localObject == null)
    {
      k = 0;
      localObject = null;
      label56:
      k &= 0x7;
      if (k == 0) {
        break label107;
      }
      n = j;
    }
    for (;;)
    {
      localObject = (PowerManager)paramContext.getSystemService("power");
      if (localObject != null) {
        break label116;
      }
      k = i;
      break;
      str = "plugged";
      k = ((Intent)localObject).getIntExtra(str, 0);
      break label56;
      label107:
      n = 0;
      str = null;
    }
    label116:
    boolean bool1 = zzne.zzsl();
    label130:
    label138:
    int m;
    if (bool1)
    {
      boolean bool2 = ((PowerManager)localObject).isInteractive();
      if (!bool2) {
        break label167;
      }
      bool2 = j;
      bool2 <<= true;
      if (n == 0) {
        break label175;
      }
    }
    for (;;)
    {
      m |= j;
      break;
      boolean bool3 = ((PowerManager)localObject).isScreenOn();
      break label130;
      label167:
      bool3 = false;
      localObject = null;
      break label138;
      label175:
      j = 0;
    }
  }
  
  public static float zzay(Context paramContext)
  {
    synchronized (zzmv.class)
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = zzaoc;
      l1 -= l2;
      l2 = 60000L;
      boolean bool = l1 < l2;
      if (bool)
      {
        f1 = zzaod;
        j = 2143289344;
        f2 = 0.0F / 0.0F;
        bool = f1 < f2;
        if (bool)
        {
          f1 = zzaod;
          return f1;
        }
      }
      Object localObject1 = paramContext.getApplicationContext();
      int j = 0;
      float f2 = 0.0F;
      String str = null;
      Object localObject3 = zzaob;
      localObject1 = ((Context)localObject1).registerReceiver(null, (IntentFilter)localObject3);
      if (localObject1 != null)
      {
        str = "level";
        int k = -1;
        j = ((Intent)localObject1).getIntExtra(str, k);
        localObject3 = "scale";
        int m = -1;
        int i = ((Intent)localObject1).getIntExtra((String)localObject3, m);
        f2 = j;
        f1 = i;
        f1 = f2 / f1;
        zzaod = f1;
      }
      l1 = SystemClock.elapsedRealtime();
      zzaoc = l1;
      float f1 = zzaod;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */