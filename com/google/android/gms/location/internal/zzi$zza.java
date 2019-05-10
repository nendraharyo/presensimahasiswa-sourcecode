package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.internal.zzo;
import com.google.android.gms.common.api.internal.zzo.zza;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationRequestCreator;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzb;
import com.google.android.gms.location.zzd;
import com.google.android.gms.location.zzd.zza;
import java.util.List;

public abstract class zzi$zza
  extends Binder
  implements zzi
{
  public static zzi zzcj(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzi)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzi;
        if (bool)
        {
          localObject = (zzi)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/location/internal/zzi$zza$zza;
      ((zzi.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int k = 0;
    Object localObject2 = null;
    int m = 1;
    Object localObject3;
    switch (paramInt1)
    {
    default: 
      m = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 57: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 64: 
    case 65: 
    case 66: 
    case 60: 
    case 61: 
    case 68: 
    case 69: 
    case 7: 
    case 8: 
    case 20: 
    case 9: 
    case 52: 
    case 53: 
    case 10: 
    case 11: 
    case 59: 
    case 12: 
    case 13: 
    case 21: 
    case 26: 
    case 67: 
    case 34: 
      for (;;)
      {
        return m;
        localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
        paramParcel2.writeString((String)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localObject1 = ParcelableGeofence.CREATOR;
        localObject3 = paramParcel1.createTypedArrayList((Parcelable.Creator)localObject1);
        i = paramParcel1.readInt();
        if (i != 0) {}
        for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          localObject2 = zzh.zza.zzci(paramParcel1.readStrongBinder());
          String str = paramParcel1.readString();
          zza((List)localObject3, (PendingIntent)localObject1, (zzh)localObject2, str);
          paramParcel2.writeNoException();
          break;
          i = 0;
        }
        localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
        paramParcel1.enforceInterface((String)localObject1);
        i = paramParcel1.readInt();
        if (i != 0)
        {
          localObject1 = (GeofencingRequest)GeofencingRequest.CREATOR.createFromParcel(paramParcel1);
          localObject3 = localObject1;
          label429:
          i = paramParcel1.readInt();
          if (i == 0) {
            break label489;
          }
        }
        for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          localObject2 = zzh.zza.zzci(paramParcel1.readStrongBinder());
          zza((GeofencingRequest)localObject3, (PendingIntent)localObject1, (zzh)localObject2);
          paramParcel2.writeNoException();
          break;
          n = 0;
          localObject3 = null;
          break label429;
          label489:
          i = 0;
        }
        localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
        paramParcel1.enforceInterface((String)localObject1);
        i = paramParcel1.readInt();
        if (i != 0) {}
        for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          localObject2 = zzh.zza.zzci(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          zza((PendingIntent)localObject1, (zzh)localObject2, (String)localObject3);
          paramParcel2.writeNoException();
          break;
          i = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localObject1 = paramParcel1.createStringArray();
        localObject2 = zzh.zza.zzci(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        zza((String[])localObject1, (zzh)localObject2, (String)localObject3);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localObject1 = zzh.zza.zzci(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        zza((zzh)localObject1, (String)localObject2);
        paramParcel2.writeNoException();
        continue;
        localObject3 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
        paramParcel1.enforceInterface((String)localObject3);
        long l = paramParcel1.readLong();
        int n = paramParcel1.readInt();
        if (n != 0)
        {
          n = m;
          label685:
          i = paramParcel1.readInt();
          if (i == 0) {
            break label736;
          }
        }
        int i1;
        for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          zza(l, n, (PendingIntent)localObject1);
          paramParcel2.writeNoException();
          break;
          i1 = 0;
          localObject3 = null;
          break label685;
          label736:
          i = 0;
        }
        localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
        paramParcel1.enforceInterface((String)localObject1);
        i = paramParcel1.readInt();
        if (i != 0) {}
        for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          zza((PendingIntent)localObject1);
          paramParcel2.writeNoException();
          break;
          i = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localObject2 = paramParcel1.readString();
        localObject2 = zzeh((String)localObject2);
        paramParcel2.writeNoException();
        if (localObject2 != null)
        {
          paramParcel2.writeInt(m);
          ((ActivityRecognitionResult)localObject2).writeToParcel(paramParcel2, m);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
          paramParcel1.enforceInterface((String)localObject1);
          i = paramParcel1.readInt();
          if (i != 0) {}
          for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
          {
            localObject2 = zzo.zza.zzaN(paramParcel1.readStrongBinder());
            zza((PendingIntent)localObject1, (zzo)localObject2);
            paramParcel2.writeNoException();
            break;
            i = 0;
          }
          localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
          paramParcel1.enforceInterface((String)localObject1);
          i = paramParcel1.readInt();
          if (i != 0) {}
          for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
          {
            localObject2 = zzo.zza.zzaN(paramParcel1.readStrongBinder());
            zzb((PendingIntent)localObject1, (zzo)localObject2);
            paramParcel2.writeNoException();
            break;
            i = 0;
          }
          localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
          paramParcel1.enforceInterface((String)localObject1);
          i = paramParcel1.readInt();
          if (i != 0)
          {
            localObject1 = GestureRequest.CREATOR.zzeQ(paramParcel1);
            localObject3 = localObject1;
            label1026:
            i = paramParcel1.readInt();
            if (i == 0) {
              break label1086;
            }
          }
          for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
          {
            localObject2 = zzo.zza.zzaN(paramParcel1.readStrongBinder());
            zza((GestureRequest)localObject3, (PendingIntent)localObject1, (zzo)localObject2);
            paramParcel2.writeNoException();
            break;
            i1 = 0;
            localObject3 = null;
            break label1026;
            label1086:
            i = 0;
          }
          localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
          paramParcel1.enforceInterface((String)localObject1);
          i = paramParcel1.readInt();
          if (i != 0) {}
          for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
          {
            localObject2 = zzo.zza.zzaN(paramParcel1.readStrongBinder());
            zzc((PendingIntent)localObject1, (zzo)localObject2);
            paramParcel2.writeNoException();
            break;
            i = 0;
          }
          localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
          paramParcel1.enforceInterface((String)localObject1);
          i = paramParcel1.readInt();
          if (i != 0) {}
          for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
          {
            localObject2 = zzo.zza.zzaN(paramParcel1.readStrongBinder());
            zzd((PendingIntent)localObject1, (zzo)localObject2);
            paramParcel2.writeNoException();
            break;
            i = 0;
          }
          localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
          paramParcel1.enforceInterface((String)localObject1);
          i = paramParcel1.readInt();
          if (i != 0) {}
          for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
          {
            localObject2 = zzo.zza.zzaN(paramParcel1.readStrongBinder());
            zze((PendingIntent)localObject1, (zzo)localObject2);
            paramParcel2.writeNoException();
            break;
            i = 0;
          }
          paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          localObject2 = zzyN();
          paramParcel2.writeNoException();
          if (localObject2 != null)
          {
            paramParcel2.writeInt(m);
            ((Location)localObject2).writeToParcel(paramParcel2, m);
          }
          else
          {
            paramParcel2.writeInt(0);
            continue;
            localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
            paramParcel1.enforceInterface((String)localObject1);
            i = paramParcel1.readInt();
            if (i != 0)
            {
              localObject1 = LocationRequest.CREATOR;
              localObject2 = ((LocationRequestCreator)localObject1).createFromParcel(paramParcel1);
            }
            localObject1 = zzd.zza.zzcf(paramParcel1.readStrongBinder());
            zza((LocationRequest)localObject2, (zzd)localObject1);
            paramParcel2.writeNoException();
            continue;
            localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
            paramParcel1.enforceInterface((String)localObject1);
            i = paramParcel1.readInt();
            if (i != 0)
            {
              localObject1 = LocationRequest.CREATOR;
              localObject2 = ((LocationRequestCreator)localObject1).createFromParcel(paramParcel1);
            }
            localObject1 = zzd.zza.zzcf(paramParcel1.readStrongBinder());
            localObject3 = paramParcel1.readString();
            zza((LocationRequest)localObject2, (zzd)localObject1, (String)localObject3);
            paramParcel2.writeNoException();
            continue;
            localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
            paramParcel1.enforceInterface((String)localObject1);
            i = paramParcel1.readInt();
            if (i != 0)
            {
              localObject1 = LocationRequest.CREATOR.createFromParcel(paramParcel1);
              localObject3 = localObject1;
              label1503:
              i = paramParcel1.readInt();
              if (i == 0) {
                break label1552;
              }
            }
            for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
            {
              zza((LocationRequest)localObject3, (PendingIntent)localObject1);
              paramParcel2.writeNoException();
              break;
              i1 = 0;
              localObject3 = null;
              break label1503;
              label1552:
              i = 0;
            }
            localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
            paramParcel1.enforceInterface((String)localObject1);
            i = paramParcel1.readInt();
            if (i != 0)
            {
              localObject1 = LocationRequestInternal.CREATOR;
              localObject2 = ((zzm)localObject1).zzeX(paramParcel1);
            }
            localObject1 = zzd.zza.zzcf(paramParcel1.readStrongBinder());
            zza((LocationRequestInternal)localObject2, (zzd)localObject1);
            paramParcel2.writeNoException();
            continue;
            localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
            paramParcel1.enforceInterface((String)localObject1);
            i = paramParcel1.readInt();
            if (i != 0)
            {
              localObject1 = LocationRequestInternal.CREATOR.zzeX(paramParcel1);
              localObject3 = localObject1;
              label1653:
              i = paramParcel1.readInt();
              if (i == 0) {
                break label1702;
              }
            }
            for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
            {
              zza((LocationRequestInternal)localObject3, (PendingIntent)localObject1);
              paramParcel2.writeNoException();
              break;
              i1 = 0;
              localObject3 = null;
              break label1653;
              label1702:
              i = 0;
            }
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            localObject1 = zzd.zza.zzcf(paramParcel1.readStrongBinder());
            zza((zzd)localObject1);
            paramParcel2.writeNoException();
            continue;
            localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
            paramParcel1.enforceInterface((String)localObject1);
            i = paramParcel1.readInt();
            if (i != 0) {}
            for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
            {
              zzb((PendingIntent)localObject1);
              paramParcel2.writeNoException();
              break;
              i = 0;
            }
            localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
            paramParcel1.enforceInterface((String)localObject1);
            i = paramParcel1.readInt();
            if (i != 0)
            {
              localObject1 = LocationRequestUpdateData.CREATOR;
              localObject2 = ((zzn)localObject1).zzeY(paramParcel1);
            }
            zza((LocationRequestUpdateData)localObject2);
            paramParcel2.writeNoException();
            continue;
            localObject2 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
            paramParcel1.enforceInterface((String)localObject2);
            k = paramParcel1.readInt();
            if (k != 0) {
              i = m;
            }
            zzam(i);
            paramParcel2.writeNoException();
            continue;
            localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
            paramParcel1.enforceInterface((String)localObject1);
            j = paramParcel1.readInt();
            if (j != 0) {}
            for (localObject1 = (Location)Location.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
            {
              zzc((Location)localObject1);
              paramParcel2.writeNoException();
              break;
              j = 0;
            }
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            localObject2 = paramParcel1.readString();
            localObject2 = zzei((String)localObject2);
            paramParcel2.writeNoException();
            if (localObject2 != null)
            {
              paramParcel2.writeInt(m);
              ((Location)localObject2).writeToParcel(paramParcel2, m);
            }
            else
            {
              paramParcel2.writeInt(0);
              continue;
              localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
              paramParcel1.enforceInterface((String)localObject1);
              j = paramParcel1.readInt();
              if (j != 0) {}
              for (localObject1 = (Location)Location.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
              {
                k = paramParcel1.readInt();
                zza((Location)localObject1, k);
                paramParcel2.writeNoException();
                break;
                j = 0;
              }
              paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
              localObject1 = zzg.zza.zzch(paramParcel1.readStrongBinder());
              zza((zzg)localObject1);
              paramParcel2.writeNoException();
              continue;
              paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
              localObject2 = paramParcel1.readString();
              localObject2 = zzej((String)localObject2);
              paramParcel2.writeNoException();
              if (localObject2 != null)
              {
                paramParcel2.writeInt(m);
                ((LocationAvailability)localObject2).writeToParcel(paramParcel2, m);
              }
              else
              {
                paramParcel2.writeInt(0);
              }
            }
          }
        }
      }
    }
    localObject1 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    paramParcel1.enforceInterface((String)localObject1);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject1 = (LocationSettingsRequest)LocationSettingsRequest.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      localObject2 = zzj.zza.zzck(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.readString();
      zza((LocationSettingsRequest)localObject1, (zzj)localObject2, (String)localObject3);
      paramParcel2.writeNoException();
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzi$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */