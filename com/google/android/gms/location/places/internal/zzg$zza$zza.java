package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.personalized.PlaceAlias;
import com.google.android.gms.location.places.personalized.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

class zzg$zza$zza
  implements zzg
{
  private IBinder zzoz;
  
  zzg$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(AddPlaceRequest paramAddPlaceRequest, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramAddPlaceRequest != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramAddPlaceRequest.writeToParcel(localParcel1, 0);
          if (paramPlacesParams != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            if (paramzzi == null) {
              break label180;
            }
            localObject1 = paramzzi.asBinder();
            localParcel1.writeStrongBinder((IBinder)localObject1);
            localObject1 = this.zzoz;
            int j = 14;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label180:
      int i = 0;
      localObject3 = null;
    }
  }
  
  public void zza(NearbyAlertRequest paramNearbyAlertRequest, PlacesParams paramPlacesParams, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramNearbyAlertRequest != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramNearbyAlertRequest.writeToParcel(localParcel1, 0);
          if (paramPlacesParams != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            if (paramPendingIntent == null) {
              break label188;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPendingIntent.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 11;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label188:
      int i = 0;
      localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  public void zza(PlaceReport paramPlaceReport, PlacesParams paramPlacesParams)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramPlaceReport != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlaceReport.writeToParcel(localParcel1, 0);
          if (paramPlacesParams != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 15;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  public void zza(PlaceRequest paramPlaceRequest, PlacesParams paramPlacesParams, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramPlaceRequest != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlaceRequest.writeToParcel(localParcel1, 0);
          if (paramPlacesParams != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            if (paramPendingIntent == null) {
              break label188;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPendingIntent.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 9;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label188:
      int i = 0;
      localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  public void zza(UserDataType paramUserDataType, LatLngBounds paramLatLngBounds, List paramList, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramUserDataType != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramUserDataType.writeToParcel(localParcel1, 0);
          if (paramLatLngBounds != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramLatLngBounds.writeToParcel(localParcel1, 0);
            localParcel1.writeStringList(paramList);
            if (paramPlacesParams == null) {
              break label217;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            if (paramzzi == null) {
              break label232;
            }
            localObject1 = paramzzi.asBinder();
            localParcel1.writeStrongBinder((IBinder)localObject1);
            localObject1 = this.zzoz;
            int j = 8;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label217:
      int i = 0;
      localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label232:
      i = 0;
      localObject3 = null;
    }
  }
  
  public void zza(PlacesParams paramPlacesParams, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramPlacesParams != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlacesParams.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPendingIntent.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 10;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  public void zza(PlaceAlias paramPlaceAlias, PlacesParams paramPlacesParams, zza paramzza)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramPlaceAlias != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlaceAlias.writeToParcel(localParcel1, 0);
          if (paramPlacesParams != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            if (paramzza == null) {
              break label180;
            }
            localObject1 = paramzza.asBinder();
            localParcel1.writeStrongBinder((IBinder)localObject1);
            localObject1 = this.zzoz;
            int j = 21;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label180:
      int i = 0;
      localObject3 = null;
    }
  }
  
  public void zza(PlaceAlias paramPlaceAlias, String paramString1, String paramString2, PlacesParams paramPlacesParams, zza paramzza)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramPlaceAlias != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlaceAlias.writeToParcel(localParcel1, 0);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          if (paramPlacesParams != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            if (paramzza == null) {
              break label196;
            }
            localObject1 = paramzza.asBinder();
            localParcel1.writeStrongBinder((IBinder)localObject1);
            localObject1 = this.zzoz;
            int j = 16;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label196:
      int i = 0;
      localObject3 = null;
    }
  }
  
  public void zza(LatLng paramLatLng, PlaceFilter paramPlaceFilter, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramLatLng != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramLatLng.writeToParcel(localParcel1, 0);
          if (paramPlaceFilter != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlaceFilter.writeToParcel(localParcel1, 0);
            if (paramPlacesParams == null) {
              break label208;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            if (paramzzi == null) {
              break label223;
            }
            localObject1 = paramzzi.asBinder();
            localParcel1.writeStrongBinder((IBinder)localObject1);
            localObject1 = this.zzoz;
            int j = 4;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label208:
      int i = 0;
      localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label223:
      i = 0;
      localObject3 = null;
    }
  }
  
  public void zza(LatLng paramLatLng, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramLatLng != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramLatLng.writeToParcel(localParcel1, 0);
          if (paramPlacesParams != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            if (paramzzi == null) {
              break label180;
            }
            localObject1 = paramzzi.asBinder();
            localParcel1.writeStrongBinder((IBinder)localObject1);
            localObject1 = this.zzoz;
            int j = 22;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label180:
      int i = 0;
      localObject3 = null;
    }
  }
  
  public void zza(LatLngBounds paramLatLngBounds, int paramInt, String paramString, PlaceFilter paramPlaceFilter, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramLatLngBounds != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramLatLngBounds.writeToParcel(localParcel1, 0);
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString);
          if (paramPlaceFilter != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlaceFilter.writeToParcel(localParcel1, 0);
            if (paramPlacesParams == null) {
              break label224;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            if (paramzzi == null) {
              break label239;
            }
            localObject1 = paramzzi.asBinder();
            localParcel1.writeStrongBinder((IBinder)localObject1);
            localObject1 = this.zzoz;
            int j = 2;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label224:
      int i = 0;
      localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label239:
      i = 0;
      localObject3 = null;
    }
  }
  
  public void zza(String paramString, int paramInt1, int paramInt2, int paramInt3, PlacesParams paramPlacesParams, zzh paramzzh)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeString(paramString);
        localParcel1.writeInt(paramInt1);
        localParcel1.writeInt(paramInt2);
        localParcel1.writeInt(paramInt3);
        if (paramPlacesParams != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlacesParams.writeToParcel(localParcel1, 0);
        }
        while (paramzzh != null)
        {
          localObject1 = paramzzh.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 20;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(String paramString, int paramInt, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeString(paramString);
        localParcel1.writeInt(paramInt);
        if (paramPlacesParams != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlacesParams.writeToParcel(localParcel1, 0);
        }
        while (paramzzi != null)
        {
          localObject1 = paramzzi.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 18;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(String paramString, PlacesParams paramPlacesParams, zzh paramzzh)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeString(paramString);
        if (paramPlacesParams != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlacesParams.writeToParcel(localParcel1, 0);
        }
        while (paramzzh != null)
        {
          localObject1 = paramzzh.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 19;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(String paramString, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeString(paramString);
        if (paramPlacesParams != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlacesParams.writeToParcel(localParcel1, 0);
        }
        while (paramzzi != null)
        {
          localObject1 = paramzzi.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 3;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(String paramString, LatLngBounds paramLatLngBounds, AutocompleteFilter paramAutocompleteFilter, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeString(paramString);
        if (paramLatLngBounds != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramLatLngBounds.writeToParcel(localParcel1, 0);
          if (paramAutocompleteFilter != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramAutocompleteFilter.writeToParcel(localParcel1, 0);
            if (paramPlacesParams == null) {
              break label217;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            if (paramzzi == null) {
              break label232;
            }
            localObject1 = paramzzi.asBinder();
            localParcel1.writeStrongBinder((IBinder)localObject1);
            localObject1 = this.zzoz;
            int j = 13;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label217:
      int i = 0;
      localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label232:
      i = 0;
      localObject3 = null;
    }
  }
  
  public void zza(List paramList, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeStringList(paramList);
        if (paramPlacesParams != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlacesParams.writeToParcel(localParcel1, 0);
        }
        while (paramzzi != null)
        {
          localObject1 = paramzzi.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 7;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zzb(PlaceFilter paramPlaceFilter, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramPlaceFilter != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlaceFilter.writeToParcel(localParcel1, 0);
          if (paramPlacesParams != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPlacesParams.writeToParcel(localParcel1, 0);
            if (paramzzi == null) {
              break label179;
            }
            localObject1 = paramzzi.asBinder();
            localParcel1.writeStrongBinder((IBinder)localObject1);
            localObject1 = this.zzoz;
            int j = 5;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label179:
      int i = 0;
      localObject3 = null;
    }
  }
  
  public void zzb(PlacesParams paramPlacesParams, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramPlacesParams != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlacesParams.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramPendingIntent.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 12;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  public void zzb(String paramString, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeString(paramString);
        if (paramPlacesParams != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlacesParams.writeToParcel(localParcel1, 0);
        }
        while (paramzzi != null)
        {
          localObject1 = paramzzi.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 6;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zzb(List paramList, PlacesParams paramPlacesParams, zzi paramzzi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.location.places.internal.IGooglePlacesService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeStringList(paramList);
        if (paramPlacesParams != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramPlacesParams.writeToParcel(localParcel1, 0);
        }
        while (paramzzi != null)
        {
          localObject1 = paramzzi.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 17;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzg$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */