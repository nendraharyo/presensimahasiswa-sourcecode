package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerUnregistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.request.ReadStatsRequest;

public abstract class zzom$zza
  extends Binder
  implements zzom
{
  public static zzom zzbH(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzom)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzom;
        if (bool)
        {
          localObject = (zzom)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzom$zza$zza;
      ((zzom.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      localObject = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DataReadRequest)DataReadRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataReadRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DataInsertRequest)DataInsertRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataInsertRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DataDeleteRequest)DataDeleteRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataDeleteRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetSyncInfoRequest)GetSyncInfoRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetSyncInfoRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (ReadStatsRequest)ReadStatsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ReadStatsRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (ReadRawRequest)ReadRawRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ReadRawRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DailyTotalRequest)DailyTotalRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DailyTotalRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DataInsertRequest)DataInsertRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zzb((DataInsertRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DataUpdateRequest)DataUpdateRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataUpdateRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DataUpdateListenerRegistrationRequest)DataUpdateListenerRegistrationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataUpdateListenerRegistrationRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DataUpdateListenerUnregistrationRequest)DataUpdateListenerUnregistrationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataUpdateListenerUnregistrationRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzom$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */