package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.support.v4.a.f;
import android.util.Base64;
import android.util.Log;

public class GcmReceiver
  extends f
{
  private static String zzaLH = "gcm.googleapis.com/refresh";
  
  private void zzj(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = isOrderedBroadcast();
    int i;
    if (bool1)
    {
      i = 500;
      setResultCode(i);
    }
    zzk(paramContext, paramIntent);
    Object localObject = "android.permission.WAKE_LOCK";
    for (;;)
    {
      try
      {
        i = paramContext.checkCallingOrSelfPermission((String)localObject);
        if (i == 0)
        {
          localObject = startWakefulService(paramContext, paramIntent);
          if (localObject != null) {
            continue;
          }
          localObject = "GcmReceiver";
          str1 = "Error while delivering the message: ServiceIntent not found.";
          Log.e((String)localObject, str1);
          boolean bool2 = isOrderedBroadcast();
          if (bool2)
          {
            int j = 404;
            setResultCode(j);
          }
          return;
        }
      }
      catch (SecurityException localSecurityException)
      {
        String str1 = "GcmReceiver";
        String str2 = "Error while delivering the message to the serviceIntent";
        Log.e(str1, str2, localSecurityException);
        boolean bool3 = isOrderedBroadcast();
        if (!bool3) {
          continue;
        }
        int k = 401;
        setResultCode(k);
        continue;
        boolean bool4 = isOrderedBroadcast();
        if (!bool4) {
          continue;
        }
        int m = -1;
        setResultCode(m);
        continue;
      }
      localObject = paramContext.startService(paramIntent);
      str1 = "GcmReceiver";
      str2 = "Missing wake lock permission, service start may be delayed";
      Log.d(str1, str2);
    }
  }
  
  private void zzk(Context paramContext, Intent paramIntent)
  {
    Object localObject1 = paramContext.getPackageManager();
    boolean bool = false;
    Object localObject2 = null;
    localObject1 = ((PackageManager)localObject1).resolveService(paramIntent, 0);
    if (localObject1 != null)
    {
      localObject2 = ((ResolveInfo)localObject1).serviceInfo;
      if (localObject2 != null) {}
    }
    else
    {
      localObject1 = "GcmReceiver";
      localObject2 = "Failed to resolve target intent service, skipping classname enforcement";
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = ((ResolveInfo)localObject1).serviceInfo;
      localObject2 = paramContext.getPackageName();
      Object localObject3 = ((ServiceInfo)localObject1).packageName;
      bool = ((String)localObject2).equals(localObject3);
      String str;
      if (bool)
      {
        localObject2 = ((ServiceInfo)localObject1).name;
        if (localObject2 != null) {}
      }
      else
      {
        localObject2 = "GcmReceiver";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
        str = ((ServiceInfo)localObject1).packageName;
        localObject3 = ((StringBuilder)localObject3).append(str);
        str = "/";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject1 = ((ServiceInfo)localObject1).name;
        localObject1 = (String)localObject1;
        Log.e((String)localObject2, (String)localObject1);
        continue;
      }
      localObject1 = ((ServiceInfo)localObject1).name;
      localObject2 = ".";
      bool = ((String)localObject1).startsWith((String)localObject2);
      if (bool)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = paramContext.getPackageName();
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject1 = (String)localObject1;
      }
      localObject2 = "GcmReceiver";
      int i = 3;
      bool = Log.isLoggable((String)localObject2, i);
      if (bool)
      {
        localObject2 = "GcmReceiver";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        str = "Restricting intent to a specific service: ";
        localObject3 = str + (String)localObject1;
        Log.d((String)localObject2, (String)localObject3);
      }
      localObject2 = paramContext.getPackageName();
      paramIntent.setClassName((String)localObject2, (String)localObject1);
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent.setComponent(null);
    Object localObject = paramContext.getPackageName();
    paramIntent.setPackage((String)localObject);
    int i = Build.VERSION.SDK_INT;
    int k = 18;
    if (i <= k)
    {
      localObject = paramContext.getPackageName();
      paramIntent.removeCategory((String)localObject);
    }
    localObject = paramIntent.getStringExtra("from");
    String str1 = "com.google.android.c2dm.intent.REGISTRATION";
    String str2 = paramIntent.getAction();
    boolean bool2 = str1.equals(str2);
    if (!bool2)
    {
      str1 = "google.com/iid";
      bool2 = str1.equals(localObject);
      if (!bool2)
      {
        str1 = zzaLH;
        bool1 = str1.equals(localObject);
        if (!bool1) {
          break label118;
        }
      }
    }
    localObject = "com.google.android.gms.iid.InstanceID";
    paramIntent.setAction((String)localObject);
    label118:
    localObject = paramIntent.getStringExtra("gcm.rawData64");
    if (localObject != null)
    {
      str1 = "rawData";
      str2 = null;
      localObject = Base64.decode((String)localObject, 0);
      paramIntent.putExtra(str1, (byte[])localObject);
      localObject = "gcm.rawData64";
      paramIntent.removeExtra((String)localObject);
    }
    localObject = "com.google.android.c2dm.intent.RECEIVE";
    str1 = paramIntent.getAction();
    boolean bool1 = ((String)localObject).equals(str1);
    if (bool1) {
      zzi(paramContext, paramIntent);
    }
    for (;;)
    {
      bool1 = isOrderedBroadcast();
      if (bool1)
      {
        int j = getResultCode();
        if (j == 0)
        {
          j = -1;
          setResultCode(j);
        }
      }
      return;
      zzj(paramContext, paramIntent);
    }
  }
  
  public void zzi(Context paramContext, Intent paramIntent)
  {
    zzj(paramContext, paramIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\GcmReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */