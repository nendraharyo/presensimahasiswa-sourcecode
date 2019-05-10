package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.List;

public class zzl
  extends zzb
{
  private final zzk zzaOM;
  
  public zzl(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString)
  {
    this(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramString, localzzf);
  }
  
  public zzl(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, zzf paramzzf)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramString, paramzzf);
    zzk localzzk = new com/google/android/gms/location/internal/zzk;
    zzp localzzp = this.zzaOt;
    localzzk.<init>(paramContext, localzzp);
    this.zzaOM = localzzk;
  }
  
  public void disconnect()
  {
    synchronized (this.zzaOM)
    {
      boolean bool = isConnected();
      if (bool) {}
      try
      {
        zzk localzzk2 = this.zzaOM;
        localzzk2.removeAllListeners();
        localzzk2 = this.zzaOM;
        localzzk2.zzyP();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          String str1 = "LocationClientImpl";
          String str2 = "Client disconnected before listeners could be cleaned up";
          Log.e(str1, str2, localException);
        }
      }
      super.disconnect();
      return;
    }
  }
  
  public Location getLastLocation()
  {
    return this.zzaOM.getLastLocation();
  }
  
  public void zza(long paramLong, PendingIntent paramPendingIntent)
  {
    boolean bool1 = true;
    zzqI();
    zzx.zzz(paramPendingIntent);
    long l = 0L;
    boolean bool2 = paramLong < l;
    if (!bool2) {}
    for (bool2 = bool1;; bool2 = false)
    {
      zzx.zzb(bool2, "detectionIntervalMillis must be >= 0");
      ((zzi)zzqJ()).zza(paramLong, bool1, paramPendingIntent);
      return;
    }
  }
  
  public void zza(PendingIntent paramPendingIntent)
  {
    zzqI();
    zzx.zzz(paramPendingIntent);
    ((zzi)zzqJ()).zza(paramPendingIntent);
  }
  
  public void zza(PendingIntent paramPendingIntent, zza.zzb paramzzb)
  {
    zzqI();
    zzx.zzb(paramPendingIntent, "PendingIntent must be specified.");
    zzx.zzb(paramzzb, "ResultHolder not provided.");
    zzl.zzb localzzb = new com/google/android/gms/location/internal/zzl$zzb;
    localzzb.<init>(paramzzb);
    zzi localzzi = (zzi)zzqJ();
    String str = getContext().getPackageName();
    localzzi.zza(paramPendingIntent, localzzb, str);
  }
  
  public void zza(PendingIntent paramPendingIntent, zzg paramzzg)
  {
    this.zzaOM.zza(paramPendingIntent, paramzzg);
  }
  
  public void zza(GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent, zza.zzb paramzzb)
  {
    zzqI();
    zzx.zzb(paramGeofencingRequest, "geofencingRequest can't be null.");
    zzx.zzb(paramPendingIntent, "PendingIntent must be specified.");
    zzx.zzb(paramzzb, "ResultHolder not provided.");
    zzl.zza localzza = new com/google/android/gms/location/internal/zzl$zza;
    localzza.<init>(paramzzb);
    ((zzi)zzqJ()).zza(paramGeofencingRequest, paramPendingIntent, localzza);
  }
  
  public void zza(LocationCallback paramLocationCallback, zzg paramzzg)
  {
    this.zzaOM.zza(paramLocationCallback, paramzzg);
  }
  
  public void zza(LocationListener paramLocationListener, zzg paramzzg)
  {
    this.zzaOM.zza(paramLocationListener, paramzzg);
  }
  
  public void zza(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent, zzg paramzzg)
  {
    this.zzaOM.zza(paramLocationRequest, paramPendingIntent, paramzzg);
  }
  
  public void zza(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper, zzg paramzzg)
  {
    synchronized (this.zzaOM)
    {
      zzk localzzk2 = this.zzaOM;
      localzzk2.zza(paramLocationRequest, paramLocationListener, paramLooper, paramzzg);
      return;
    }
  }
  
  public void zza(LocationSettingsRequest paramLocationSettingsRequest, zza.zzb paramzzb, String paramString)
  {
    boolean bool1 = true;
    zzqI();
    boolean bool2;
    if (paramLocationSettingsRequest != null)
    {
      bool2 = bool1;
      String str = "locationSettingsRequest can't be null nor empty.";
      zzx.zzb(bool2, str);
      if (paramzzb == null) {
        break label71;
      }
    }
    for (;;)
    {
      zzx.zzb(bool1, "listener can't be null.");
      zzl.zzc localzzc = new com/google/android/gms/location/internal/zzl$zzc;
      localzzc.<init>(paramzzb);
      ((zzi)zzqJ()).zza(paramLocationSettingsRequest, localzzc, paramString);
      return;
      bool2 = false;
      break;
      label71:
      bool1 = false;
      localzzc = null;
    }
  }
  
  public void zza(LocationRequestInternal paramLocationRequestInternal, LocationCallback paramLocationCallback, Looper paramLooper, zzg paramzzg)
  {
    synchronized (this.zzaOM)
    {
      zzk localzzk2 = this.zzaOM;
      localzzk2.zza(paramLocationRequestInternal, paramLocationCallback, paramLooper, paramzzg);
      return;
    }
  }
  
  public void zza(zzg paramzzg)
  {
    this.zzaOM.zza(paramzzg);
  }
  
  public void zza(List paramList, zza.zzb paramzzb)
  {
    zzi localzzi = null;
    zzqI();
    int i;
    if (paramList != null)
    {
      i = paramList.size();
      if (i > 0) {
        i = 1;
      }
    }
    for (;;)
    {
      zzx.zzb(i, "geofenceRequestIds can't be null nor empty.");
      zzx.zzb(paramzzb, "ResultHolder not provided.");
      String[] arrayOfString = new String[0];
      arrayOfString = (String[])paramList.toArray(arrayOfString);
      zzl.zzb localzzb = new com/google/android/gms/location/internal/zzl$zzb;
      localzzb.<init>(paramzzb);
      localzzi = (zzi)zzqJ();
      String str = getContext().getPackageName();
      localzzi.zza(arrayOfString, localzzb, str);
      return;
      int j = 0;
      arrayOfString = null;
    }
  }
  
  public void zzam(boolean paramBoolean)
  {
    this.zzaOM.zzam(paramBoolean);
  }
  
  public void zzc(Location paramLocation)
  {
    this.zzaOM.zzc(paramLocation);
  }
  
  public LocationAvailability zzyO()
  {
    return this.zzaOM.zzyO();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */