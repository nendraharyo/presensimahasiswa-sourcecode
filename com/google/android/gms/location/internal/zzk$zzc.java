package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.zzd.zza;

class zzk$zzc
  extends zzd.zza
{
  private Handler zzaOJ;
  
  zzk$zzc(LocationListener paramLocationListener, Looper paramLooper)
  {
    Object localObject;
    boolean bool;
    if (paramLooper == null)
    {
      localObject = Looper.myLooper();
      if (localObject != null)
      {
        bool = true;
        String str = "Can't create handler inside thread that has not called Looper.prepare()";
        zzx.zza(bool, str);
      }
    }
    else
    {
      if (paramLooper != null) {
        break label57;
      }
      localObject = new com/google/android/gms/location/internal/zzk$zzb;
      ((zzk.zzb)localObject).<init>(paramLocationListener);
    }
    for (;;)
    {
      this.zzaOJ = ((Handler)localObject);
      return;
      bool = false;
      localObject = null;
      break;
      label57:
      localObject = new com/google/android/gms/location/internal/zzk$zzb;
      ((zzk.zzb)localObject).<init>(paramLocationListener, paramLooper);
    }
  }
  
  public void onLocationChanged(Location paramLocation)
  {
    Object localObject1 = this.zzaOJ;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = "LocationClientHelper";
      localObject2 = "Received a location in client after calling removeLocationUpdates.";
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = Message.obtain();
      int i = 1;
      ((Message)localObject1).what = i;
      ((Message)localObject1).obj = paramLocation;
      localObject2 = this.zzaOJ;
      ((Handler)localObject2).sendMessage((Message)localObject1);
    }
  }
  
  public void release()
  {
    this.zzaOJ = null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzk$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */