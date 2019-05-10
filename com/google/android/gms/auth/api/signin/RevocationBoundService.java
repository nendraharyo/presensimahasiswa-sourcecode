package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zzl;

public final class RevocationBoundService
  extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    Object localObject1 = "com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect";
    Object localObject2 = paramIntent.getAction();
    boolean bool = ((String)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = "RevocationService";
      int i = 2;
      bool = Log.isLoggable((String)localObject1, i);
      if (bool)
      {
        localObject1 = "RevocationService";
        localObject2 = "RevocationBoundService handling disconnect.";
        Log.v((String)localObject1, (String)localObject2);
      }
      localObject1 = new com/google/android/gms/auth/api/signin/internal/zzl;
      ((zzl)localObject1).<init>(this);
    }
    for (;;)
    {
      return (IBinder)localObject1;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unknown action sent to RevocationBoundService: ");
      String str = paramIntent.getAction();
      localObject2 = str;
      Log.w("RevocationService", (String)localObject2);
      bool = false;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\RevocationBoundService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */