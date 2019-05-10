package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.LocationListener;

class zzk$zzb
  extends Handler
{
  private final LocationListener zzaOL;
  
  public zzk$zzb(LocationListener paramLocationListener)
  {
    this.zzaOL = paramLocationListener;
  }
  
  public zzk$zzb(LocationListener paramLocationListener, Looper paramLooper)
  {
    super(paramLooper);
    this.zzaOL = paramLocationListener;
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1;
    Object localObject2;
    switch (i)
    {
    default: 
      localObject1 = "LocationClientHelper";
      localObject2 = "unknown message in LocationHandler.handleMessage";
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject2 = new android/location/Location;
      localObject1 = (Location)paramMessage.obj;
      ((Location)localObject2).<init>((Location)localObject1);
      localObject1 = this.zzaOL;
      ((LocationListener)localObject1).onLocationChanged((Location)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzk$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */