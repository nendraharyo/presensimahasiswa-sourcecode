package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.personalized.PlaceAlias;
import com.google.android.gms.location.places.personalized.zza;
import com.google.android.gms.location.places.personalized.zza.zza;
import com.google.android.gms.location.places.personalized.zzb;
import com.google.android.gms.location.places.zzc;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.zzd;
import java.util.List;

public abstract class zzg$zza
  extends Binder
  implements zzg
{
  public static zzg zzcn(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzg)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzg;
        if (bool)
        {
          localObject = (zzg)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/location/places/internal/zzg$zza$zza;
      ((zzg.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    Object localObject1 = null;
    boolean bool;
    Object localObject3;
    label257:
    int m;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 17: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 21: 
    case 18: 
    case 19: 
    case 20: 
      for (;;)
      {
        return bool;
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel2.writeString((String)localObject2);
        bool = i;
        continue;
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        Object localObject4;
        if (j != 0)
        {
          localObject2 = LatLngBounds.CREATOR;
          localObject3 = ((zzd)localObject2).zzfy(paramParcel1);
          k = paramParcel1.readInt();
          localObject4 = paramParcel1.readString();
          j = paramParcel1.readInt();
          if (j == 0) {
            break label365;
          }
          localObject2 = PlaceFilter.CREATOR;
        }
        for (Object localObject5 = ((com.google.android.gms.location.places.zzg)localObject2).zzfe(paramParcel1);; localObject5 = null)
        {
          j = paramParcel1.readInt();
          if (j != 0)
          {
            localObject2 = PlacesParams.CREATOR;
            localObject1 = ((zzs)localObject2).zzfo(paramParcel1);
          }
          localObject6 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
          localObject2 = this;
          zza((LatLngBounds)localObject3, k, (String)localObject4, (PlaceFilter)localObject5, (PlacesParams)localObject1, (zzi)localObject6);
          paramParcel2.writeNoException();
          j = i;
          break;
          m = 0;
          localObject3 = null;
          break label257;
          label365:
          n = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        localObject2 = paramParcel1.readString();
        m = paramParcel1.readInt();
        if (m != 0)
        {
          localObject3 = PlacesParams.CREATOR;
          localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
        }
        localObject3 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
        zza((String)localObject2, (PlacesParams)localObject1, (zzi)localObject3);
        paramParcel2.writeNoException();
        j = i;
        continue;
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = LatLng.CREATOR.zzfz(paramParcel1);
          label470:
          m = paramParcel1.readInt();
          if (m == 0) {
            break label555;
          }
        }
        for (localObject3 = PlaceFilter.CREATOR.zzfe(paramParcel1);; localObject3 = null)
        {
          k = paramParcel1.readInt();
          if (k != 0)
          {
            localObject7 = PlacesParams.CREATOR;
            localObject1 = ((zzs)localObject7).zzfo(paramParcel1);
          }
          localObject7 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
          zza((LatLng)localObject2, (PlaceFilter)localObject3, (PlacesParams)localObject1, (zzi)localObject7);
          paramParcel2.writeNoException();
          j = i;
          break;
          j = 0;
          localObject2 = null;
          break label470;
          label555:
          m = 0;
        }
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0) {}
        for (localObject2 = PlaceFilter.CREATOR.zzfe(paramParcel1);; localObject2 = null)
        {
          m = paramParcel1.readInt();
          if (m != 0)
          {
            localObject3 = PlacesParams.CREATOR;
            localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
          }
          localObject3 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
          zzb((PlaceFilter)localObject2, (PlacesParams)localObject1, (zzi)localObject3);
          paramParcel2.writeNoException();
          j = i;
          break;
          j = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        localObject2 = paramParcel1.readString();
        m = paramParcel1.readInt();
        if (m != 0)
        {
          localObject3 = PlacesParams.CREATOR;
          localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
        }
        localObject3 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
        zzb((String)localObject2, (PlacesParams)localObject1, (zzi)localObject3);
        paramParcel2.writeNoException();
        j = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        localObject2 = paramParcel1.createStringArrayList();
        m = paramParcel1.readInt();
        if (m != 0)
        {
          localObject3 = PlacesParams.CREATOR;
          localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
        }
        localObject3 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
        zza((List)localObject2, (PlacesParams)localObject1, (zzi)localObject3);
        paramParcel2.writeNoException();
        j = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        localObject2 = paramParcel1.createStringArrayList();
        m = paramParcel1.readInt();
        if (m != 0)
        {
          localObject3 = PlacesParams.CREATOR;
          localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
        }
        localObject3 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
        zzb((List)localObject2, (PlacesParams)localObject1, (zzi)localObject3);
        paramParcel2.writeNoException();
        j = i;
        continue;
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = UserDataType.CREATOR;
          localObject3 = ((zzm)localObject2).zzfj(paramParcel1);
          label889:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label989;
          }
          localObject2 = LatLngBounds.CREATOR;
          localObject7 = ((zzd)localObject2).zzfy(paramParcel1);
          label913:
          localObject4 = paramParcel1.createStringArrayList();
          j = paramParcel1.readInt();
          if (j == 0) {
            break label998;
          }
          localObject2 = PlacesParams.CREATOR;
        }
        for (localObject5 = ((zzs)localObject2).zzfo(paramParcel1);; localObject5 = null)
        {
          localObject1 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
          localObject2 = this;
          zza((UserDataType)localObject3, (LatLngBounds)localObject7, (List)localObject4, (PlacesParams)localObject5, (zzi)localObject1);
          paramParcel2.writeNoException();
          j = i;
          break;
          m = 0;
          localObject3 = null;
          break label889;
          label989:
          k = 0;
          localObject7 = null;
          break label913;
          label998:
          n = 0;
        }
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = (PlaceRequest)PlaceRequest.CREATOR.createFromParcel(paramParcel1);
          localObject3 = localObject2;
          label1046:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label1125;
          }
          localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
          localObject7 = localObject2;
          label1070:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label1134;
          }
        }
        for (localObject2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          zza((PlaceRequest)localObject3, (PlacesParams)localObject7, (PendingIntent)localObject2);
          paramParcel2.writeNoException();
          j = i;
          break;
          m = 0;
          localObject3 = null;
          break label1046;
          label1125:
          k = 0;
          localObject7 = null;
          break label1070;
          label1134:
          j = 0;
        }
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
          localObject3 = localObject2;
          label1177:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label1230;
          }
        }
        for (localObject2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          zza((PlacesParams)localObject3, (PendingIntent)localObject2);
          paramParcel2.writeNoException();
          j = i;
          break;
          m = 0;
          localObject3 = null;
          break label1177;
          label1230:
          j = 0;
        }
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = NearbyAlertRequest.CREATOR.zzfd(paramParcel1);
          localObject3 = localObject2;
          label1273:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label1352;
          }
          localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
          localObject7 = localObject2;
          label1297:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label1361;
          }
        }
        for (localObject2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          zza((NearbyAlertRequest)localObject3, (PlacesParams)localObject7, (PendingIntent)localObject2);
          paramParcel2.writeNoException();
          j = i;
          break;
          m = 0;
          localObject3 = null;
          break label1273;
          label1352:
          k = 0;
          localObject7 = null;
          break label1297;
          label1361:
          j = 0;
        }
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
          localObject3 = localObject2;
          label1404:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label1457;
          }
        }
        for (localObject2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          zzb((PlacesParams)localObject3, (PendingIntent)localObject2);
          paramParcel2.writeNoException();
          j = i;
          break;
          m = 0;
          localObject3 = null;
          break label1404;
          label1457:
          j = 0;
        }
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        localObject3 = paramParcel1.readString();
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = LatLngBounds.CREATOR;
          localObject7 = ((zzd)localObject2).zzfy(paramParcel1);
          label1506:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label1600;
          }
          localObject2 = AutocompleteFilter.CREATOR;
          localObject4 = ((zzc)localObject2).zzfb(paramParcel1);
          label1530:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label1609;
          }
          localObject2 = PlacesParams.CREATOR;
        }
        for (localObject5 = ((zzs)localObject2).zzfo(paramParcel1);; localObject5 = null)
        {
          localObject1 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
          localObject2 = this;
          zza((String)localObject3, (LatLngBounds)localObject7, (AutocompleteFilter)localObject4, (PlacesParams)localObject5, (zzi)localObject1);
          paramParcel2.writeNoException();
          j = i;
          break;
          k = 0;
          localObject7 = null;
          break label1506;
          label1600:
          i1 = 0;
          localObject4 = null;
          break label1530;
          label1609:
          n = 0;
        }
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0) {}
        for (localObject2 = (AddPlaceRequest)AddPlaceRequest.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          m = paramParcel1.readInt();
          if (m != 0)
          {
            localObject3 = PlacesParams.CREATOR;
            localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
          }
          localObject3 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
          zza((AddPlaceRequest)localObject2, (PlacesParams)localObject1, (zzi)localObject3);
          paramParcel2.writeNoException();
          j = i;
          break;
          j = 0;
        }
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0) {}
        for (localObject2 = (PlaceReport)PlaceReport.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          m = paramParcel1.readInt();
          if (m != 0)
          {
            localObject3 = PlacesParams.CREATOR;
            localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
          }
          zza((PlaceReport)localObject2, (PlacesParams)localObject1);
          paramParcel2.writeNoException();
          j = i;
          break;
          j = 0;
        }
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = PlaceAlias.CREATOR;
          localObject3 = ((zzb)localObject2).zzfq(paramParcel1);
          label1837:
          localObject7 = paramParcel1.readString();
          localObject4 = paramParcel1.readString();
          j = paramParcel1.readInt();
          if (j == 0) {
            break label1919;
          }
          localObject2 = PlacesParams.CREATOR;
        }
        for (localObject5 = ((zzs)localObject2).zzfo(paramParcel1);; localObject5 = null)
        {
          localObject1 = zza.zza.zzcr(paramParcel1.readStrongBinder());
          localObject2 = this;
          zza((PlaceAlias)localObject3, (String)localObject7, (String)localObject4, (PlacesParams)localObject5, (zza)localObject1);
          paramParcel2.writeNoException();
          j = i;
          break;
          m = 0;
          localObject3 = null;
          break label1837;
          label1919:
          n = 0;
        }
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0) {}
        for (localObject2 = PlaceAlias.CREATOR.zzfq(paramParcel1);; localObject2 = null)
        {
          m = paramParcel1.readInt();
          if (m != 0)
          {
            localObject3 = PlacesParams.CREATOR;
            localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
          }
          localObject3 = zza.zza.zzcr(paramParcel1.readStrongBinder());
          zza((PlaceAlias)localObject2, (PlacesParams)localObject1, (zza)localObject3);
          paramParcel2.writeNoException();
          j = i;
          break;
          j = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        localObject2 = paramParcel1.readString();
        m = paramParcel1.readInt();
        int k = paramParcel1.readInt();
        if (k != 0)
        {
          localObject7 = PlacesParams.CREATOR;
          localObject1 = ((zzs)localObject7).zzfo(paramParcel1);
        }
        Object localObject7 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
        zza((String)localObject2, m, (PlacesParams)localObject1, (zzi)localObject7);
        paramParcel2.writeNoException();
        j = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        localObject2 = paramParcel1.readString();
        m = paramParcel1.readInt();
        if (m != 0)
        {
          localObject3 = PlacesParams.CREATOR;
          localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
        }
        localObject3 = zzh.zza.zzco(paramParcel1.readStrongBinder());
        zza((String)localObject2, (PlacesParams)localObject1, (zzh)localObject3);
        paramParcel2.writeNoException();
        j = i;
        continue;
        localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
        paramParcel1.enforceInterface((String)localObject2);
        localObject3 = paramParcel1.readString();
        k = paramParcel1.readInt();
        int i1 = paramParcel1.readInt();
        int n = paramParcel1.readInt();
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = PlacesParams.CREATOR;
          localObject1 = ((zzs)localObject2).zzfo(paramParcel1);
        }
        Object localObject6 = zzh.zza.zzco(paramParcel1.readStrongBinder());
        localObject2 = this;
        zza((String)localObject3, k, i1, n, (PlacesParams)localObject1, (zzh)localObject6);
        paramParcel2.writeNoException();
        j = i;
      }
    }
    Object localObject2 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    paramParcel1.enforceInterface((String)localObject2);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject2 = LatLng.CREATOR.zzfz(paramParcel1);; localObject2 = null)
    {
      m = paramParcel1.readInt();
      if (m != 0)
      {
        localObject3 = PlacesParams.CREATOR;
        localObject1 = ((zzs)localObject3).zzfo(paramParcel1);
      }
      localObject3 = zzi.zza.zzcp(paramParcel1.readStrongBinder());
      zza((LatLng)localObject2, (PlacesParams)localObject1, (zzi)localObject3);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzg$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */