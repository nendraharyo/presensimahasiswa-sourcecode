package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.zze;
import com.google.android.gms.location.places.zzg;

public abstract class zzf$zza
  extends Binder
  implements zzf
{
  public static zzf zzcm(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzf)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzf;
        if (bool)
        {
          localObject = (zzf)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/location/places/internal/zzf$zza$zza;
      ((zzf.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    Object localObject1 = null;
    Object localObject3;
    label142:
    Object localObject4;
    label166:
    int k;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
        paramParcel2.writeString((String)localObject2);
      }
    case 2: 
      localObject2 = "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (PlaceRequest)PlaceRequest.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label232;
        }
        localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        localObject4 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label238;
        }
      }
      for (localObject2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
        zza((PlaceRequest)localObject3, (PlacesParams)localObject4, (PendingIntent)localObject2, (zzi)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        k = 0;
        localObject3 = null;
        break label142;
        localObject4 = null;
        break label166;
        j = 0;
      }
    case 3: 
      localObject2 = "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        localObject3 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label345;
        }
      }
      for (localObject2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
        zza((PlacesParams)localObject3, (PendingIntent)localObject2, (zzi)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        k = 0;
        localObject3 = null;
        break label281;
        j = 0;
      }
    case 4: 
      localObject2 = "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = NearbyAlertRequest.CREATOR.zzfd(paramParcel1);
        localObject3 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label478;
        }
        localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        localObject4 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label484;
        }
      }
      for (localObject2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
        zza((NearbyAlertRequest)localObject3, (PlacesParams)localObject4, (PendingIntent)localObject2, (zzi)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        k = 0;
        localObject3 = null;
        break label388;
        localObject4 = null;
        break label412;
        j = 0;
      }
    case 5: 
      localObject2 = "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        localObject3 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label591;
        }
      }
      for (localObject2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
        zzb((PlacesParams)localObject3, (PendingIntent)localObject2, (zzi)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        k = 0;
        localObject3 = null;
        break label527;
        j = 0;
      }
    case 6: 
      label232:
      label238:
      label281:
      label345:
      label388:
      label412:
      label478:
      label484:
      label527:
      label591:
      localObject2 = "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = PlaceFilter.CREATOR.zzfe(paramParcel1);; localObject2 = null)
      {
        k = paramParcel1.readInt();
        if (k != 0)
        {
          localObject3 = PlacesParams.CREATOR;
          localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
        }
        localObject3 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
        zza((PlaceFilter)localObject2, (PlacesParams)localObject1, (zzi)localObject3);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
    }
    Object localObject2 = "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    paramParcel1.enforceInterface((String)localObject2);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject2 = (PlaceReport)PlaceReport.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
    {
      k = paramParcel1.readInt();
      if (k != 0)
      {
        localObject3 = PlacesParams.CREATOR;
        localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
      }
      localObject3 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
      zza((PlaceReport)localObject2, (PlacesParams)localObject1, (zzi)localObject3);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzf$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */