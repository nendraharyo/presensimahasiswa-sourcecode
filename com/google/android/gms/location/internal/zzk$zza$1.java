package com.google.android.gms.location.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

class zzk$zza$1
  extends Handler
{
  zzk$zza$1(zzk.zza paramzza, Looper paramLooper, LocationCallback paramLocationCallback)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      LocationCallback localLocationCallback = this.zzaOy;
      Object localObject = (LocationResult)paramMessage.obj;
      localLocationCallback.onLocationResult((LocationResult)localObject);
      continue;
      localLocationCallback = this.zzaOy;
      localObject = (LocationAvailability)paramMessage.obj;
      localLocationCallback.onLocationAvailability((LocationAvailability)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzk$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */