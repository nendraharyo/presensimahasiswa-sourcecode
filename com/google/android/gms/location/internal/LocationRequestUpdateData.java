package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzc;
import com.google.android.gms.location.zzc.zza;
import com.google.android.gms.location.zzd;
import com.google.android.gms.location.zzd.zza;

public class LocationRequestUpdateData
  implements SafeParcelable
{
  public static final zzn CREATOR;
  PendingIntent mPendingIntent;
  private final int mVersionCode;
  int zzaOU;
  LocationRequestInternal zzaOV;
  zzd zzaOW;
  zzc zzaOX;
  zzg zzaOY;
  
  static
  {
    zzn localzzn = new com/google/android/gms/location/internal/zzn;
    localzzn.<init>();
    CREATOR = localzzn;
  }
  
  LocationRequestUpdateData(int paramInt1, int paramInt2, LocationRequestInternal paramLocationRequestInternal, IBinder paramIBinder1, PendingIntent paramPendingIntent, IBinder paramIBinder2, IBinder paramIBinder3)
  {
    this.mVersionCode = paramInt1;
    this.zzaOU = paramInt2;
    this.zzaOV = paramLocationRequestInternal;
    Object localObject;
    if (paramIBinder1 == null)
    {
      localObject = null;
      this.zzaOW = ((zzd)localObject);
      this.mPendingIntent = paramPendingIntent;
      if (paramIBinder2 != null) {
        break label78;
      }
      localObject = null;
      label50:
      this.zzaOX = ((zzc)localObject);
      if (paramIBinder3 != null) {
        break label88;
      }
    }
    for (;;)
    {
      this.zzaOY = localzzg;
      return;
      localObject = zzd.zza.zzcf(paramIBinder1);
      break;
      label78:
      localObject = zzc.zza.zzce(paramIBinder2);
      break label50;
      label88:
      localzzg = zzg.zza.zzch(paramIBinder3);
    }
  }
  
  public static LocationRequestUpdateData zza(LocationRequestInternal paramLocationRequestInternal, PendingIntent paramPendingIntent, zzg paramzzg)
  {
    int i = 1;
    LocationRequestUpdateData localLocationRequestUpdateData = new com/google/android/gms/location/internal/LocationRequestUpdateData;
    if (paramzzg != null) {}
    for (IBinder localIBinder = paramzzg.asBinder();; localIBinder = null)
    {
      localLocationRequestUpdateData.<init>(i, i, paramLocationRequestInternal, null, paramPendingIntent, null, localIBinder);
      return localLocationRequestUpdateData;
    }
  }
  
  public static LocationRequestUpdateData zza(LocationRequestInternal paramLocationRequestInternal, zzc paramzzc, zzg paramzzg)
  {
    int i = 1;
    LocationRequestUpdateData localLocationRequestUpdateData = new com/google/android/gms/location/internal/LocationRequestUpdateData;
    IBinder localIBinder1 = paramzzc.asBinder();
    if (paramzzg != null) {}
    for (IBinder localIBinder2 = paramzzg.asBinder();; localIBinder2 = null)
    {
      localLocationRequestUpdateData.<init>(i, i, paramLocationRequestInternal, null, null, localIBinder1, localIBinder2);
      return localLocationRequestUpdateData;
    }
  }
  
  public static LocationRequestUpdateData zza(LocationRequestInternal paramLocationRequestInternal, zzd paramzzd, zzg paramzzg)
  {
    int i = 1;
    LocationRequestUpdateData localLocationRequestUpdateData = new com/google/android/gms/location/internal/LocationRequestUpdateData;
    IBinder localIBinder1 = paramzzd.asBinder();
    if (paramzzg != null) {}
    for (IBinder localIBinder2 = paramzzg.asBinder();; localIBinder2 = null)
    {
      localLocationRequestUpdateData.<init>(i, i, paramLocationRequestInternal, localIBinder1, null, null, localIBinder2);
      return localLocationRequestUpdateData;
    }
  }
  
  public static LocationRequestUpdateData zza(zzc paramzzc, zzg paramzzg)
  {
    LocationRequestUpdateData localLocationRequestUpdateData = new com/google/android/gms/location/internal/LocationRequestUpdateData;
    int i = 1;
    int j = 2;
    IBinder localIBinder1 = paramzzc.asBinder();
    if (paramzzg != null) {}
    for (IBinder localIBinder2 = paramzzg.asBinder();; localIBinder2 = null)
    {
      localLocationRequestUpdateData.<init>(i, j, null, null, null, localIBinder1, localIBinder2);
      return localLocationRequestUpdateData;
    }
  }
  
  public static LocationRequestUpdateData zza(zzd paramzzd, zzg paramzzg)
  {
    LocationRequestUpdateData localLocationRequestUpdateData = new com/google/android/gms/location/internal/LocationRequestUpdateData;
    int i = 1;
    int j = 2;
    IBinder localIBinder1 = paramzzd.asBinder();
    if (paramzzg != null) {}
    for (IBinder localIBinder2 = paramzzg.asBinder();; localIBinder2 = null)
    {
      localLocationRequestUpdateData.<init>(i, j, null, localIBinder1, null, null, localIBinder2);
      return localLocationRequestUpdateData;
    }
  }
  
  public static LocationRequestUpdateData zzb(PendingIntent paramPendingIntent, zzg paramzzg)
  {
    LocationRequestUpdateData localLocationRequestUpdateData = new com/google/android/gms/location/internal/LocationRequestUpdateData;
    int i = 1;
    int j = 2;
    if (paramzzg != null) {}
    for (IBinder localIBinder = paramzzg.asBinder();; localIBinder = null)
    {
      localLocationRequestUpdateData.<init>(i, j, null, null, paramPendingIntent, null, localIBinder);
      return localLocationRequestUpdateData;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzyQ()
  {
    Object localObject = this.zzaOW;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaOW.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  IBinder zzyR()
  {
    Object localObject = this.zzaOX;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaOX.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  IBinder zzyS()
  {
    Object localObject = this.zzaOY;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaOY.asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\LocationRequestUpdateData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */