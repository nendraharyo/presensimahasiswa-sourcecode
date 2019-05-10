package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.zzo;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzd;
import java.util.List;

public abstract interface zzi
  extends IInterface
{
  public abstract void zza(long paramLong, boolean paramBoolean, PendingIntent paramPendingIntent);
  
  public abstract void zza(PendingIntent paramPendingIntent);
  
  public abstract void zza(PendingIntent paramPendingIntent, zzo paramzzo);
  
  public abstract void zza(PendingIntent paramPendingIntent, zzh paramzzh, String paramString);
  
  public abstract void zza(Location paramLocation, int paramInt);
  
  public abstract void zza(GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent, zzh paramzzh);
  
  public abstract void zza(GestureRequest paramGestureRequest, PendingIntent paramPendingIntent, zzo paramzzo);
  
  public abstract void zza(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent);
  
  public abstract void zza(LocationRequest paramLocationRequest, zzd paramzzd);
  
  public abstract void zza(LocationRequest paramLocationRequest, zzd paramzzd, String paramString);
  
  public abstract void zza(LocationSettingsRequest paramLocationSettingsRequest, zzj paramzzj, String paramString);
  
  public abstract void zza(LocationRequestInternal paramLocationRequestInternal, PendingIntent paramPendingIntent);
  
  public abstract void zza(LocationRequestInternal paramLocationRequestInternal, zzd paramzzd);
  
  public abstract void zza(LocationRequestUpdateData paramLocationRequestUpdateData);
  
  public abstract void zza(zzg paramzzg);
  
  public abstract void zza(zzh paramzzh, String paramString);
  
  public abstract void zza(zzd paramzzd);
  
  public abstract void zza(List paramList, PendingIntent paramPendingIntent, zzh paramzzh, String paramString);
  
  public abstract void zza(String[] paramArrayOfString, zzh paramzzh, String paramString);
  
  public abstract void zzam(boolean paramBoolean);
  
  public abstract void zzb(PendingIntent paramPendingIntent);
  
  public abstract void zzb(PendingIntent paramPendingIntent, zzo paramzzo);
  
  public abstract void zzc(PendingIntent paramPendingIntent, zzo paramzzo);
  
  public abstract void zzc(Location paramLocation);
  
  public abstract void zzd(PendingIntent paramPendingIntent, zzo paramzzo);
  
  public abstract void zze(PendingIntent paramPendingIntent, zzo paramzzo);
  
  public abstract ActivityRecognitionResult zzeh(String paramString);
  
  public abstract Location zzei(String paramString);
  
  public abstract LocationAvailability zzej(String paramString);
  
  public abstract Location zzyN();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */