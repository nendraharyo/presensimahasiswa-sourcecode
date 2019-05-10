package com.google.android.gms.location.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzc.zza;

class zzk$zza
  extends zzc.zza
{
  private Handler zzaOJ;
  
  zzk$zza(LocationCallback paramLocationCallback, Looper paramLooper)
  {
    boolean bool;
    if (paramLooper == null)
    {
      paramLooper = Looper.myLooper();
      if (paramLooper == null) {
        break label48;
      }
      bool = true;
    }
    for (;;)
    {
      String str = "Can't create handler inside thread that has not called Looper.prepare()";
      zzx.zza(bool, str);
      zzk.zza.1 local1 = new com/google/android/gms/location/internal/zzk$zza$1;
      local1.<init>(this, paramLooper, paramLocationCallback);
      this.zzaOJ = local1;
      return;
      label48:
      bool = false;
      local1 = null;
    }
  }
  
  private void zzb(int paramInt, Object paramObject)
  {
    Object localObject1 = this.zzaOJ;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = "LocationClientHelper";
      localObject2 = "Received a data in client after calling removeLocationUpdates.";
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = Message.obtain();
      ((Message)localObject1).what = paramInt;
      ((Message)localObject1).obj = paramObject;
      localObject2 = this.zzaOJ;
      ((Handler)localObject2).sendMessage((Message)localObject1);
    }
  }
  
  public void onLocationAvailability(LocationAvailability paramLocationAvailability)
  {
    zzb(1, paramLocationAvailability);
  }
  
  public void onLocationResult(LocationResult paramLocationResult)
  {
    zzb(0, paramLocationResult);
  }
  
  public void release()
  {
    this.zzaOJ = null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzk$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */