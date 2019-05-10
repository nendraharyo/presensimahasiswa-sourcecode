package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.BlockingQueue;

class GoogleCloudMessaging$1
  extends Handler
{
  GoogleCloudMessaging$1(GoogleCloudMessaging paramGoogleCloudMessaging, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage != null)
    {
      localObject1 = paramMessage.obj;
      boolean bool1 = localObject1 instanceof Intent;
      if (bool1) {}
    }
    else
    {
      localObject1 = "GCM";
      localObject2 = "Dropping invalid message";
      Log.w((String)localObject1, (String)localObject2);
    }
    Object localObject1 = (Intent)paramMessage.obj;
    Object localObject2 = "com.google.android.c2dm.intent.REGISTRATION";
    String str = ((Intent)localObject1).getAction();
    boolean bool2 = ((String)localObject2).equals(str);
    if (bool2)
    {
      localObject2 = GoogleCloudMessaging.zza(this.zzaLV);
      ((BlockingQueue)localObject2).add(localObject1);
    }
    for (;;)
    {
      return;
      localObject2 = this.zzaLV;
      bool2 = GoogleCloudMessaging.zza((GoogleCloudMessaging)localObject2, (Intent)localObject1);
      if (!bool2)
      {
        localObject2 = GoogleCloudMessaging.zzb(this.zzaLV).getPackageName();
        ((Intent)localObject1).setPackage((String)localObject2);
        localObject2 = GoogleCloudMessaging.zzb(this.zzaLV);
        ((Context)localObject2).sendBroadcast((Intent)localObject1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\GoogleCloudMessaging$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */