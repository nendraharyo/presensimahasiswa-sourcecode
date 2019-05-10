package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;

public abstract class zzop$zza
  extends Binder
  implements zzop
{
  public static zzop zzbK(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzop)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzop;
        if (bool)
        {
          localObject = (zzop)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzop$zza$zza;
      ((zzop.zza.zza)localObject).<init>(paramIBinder);
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
      localObject = "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DataSourcesRequest)DataSourcesRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataSourcesRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (SensorRegistrationRequest)SensorRegistrationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SensorRegistrationRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (SensorUnregistrationRequest)SensorUnregistrationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SensorUnregistrationRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzop$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */