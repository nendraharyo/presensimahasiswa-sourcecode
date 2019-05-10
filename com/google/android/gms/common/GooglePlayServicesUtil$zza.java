package com.google.android.gms.common;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

class GooglePlayServicesUtil$zza
  extends Handler
{
  private final Context zzsa;
  
  GooglePlayServicesUtil$zza(Context paramContext) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1;
    Object localObject2;
    switch (i)
    {
    default: 
      localObject1 = "GooglePlayServicesUtil";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Don't know how to handle this message: ";
      localObject2 = ((StringBuilder)localObject2).append(str);
      int j = paramMessage.what;
      localObject2 = j;
      Log.w((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzsa;
      i = GooglePlayServicesUtil.isGooglePlayServicesAvailable((Context)localObject1);
      boolean bool = GooglePlayServicesUtil.isUserRecoverableError(i);
      if (bool)
      {
        localObject2 = this.zzsa;
        GooglePlayServicesUtil.zzb(i, (Context)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\GooglePlayServicesUtil$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */