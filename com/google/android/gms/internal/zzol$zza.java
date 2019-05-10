package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;

public abstract class zzol$zza
  extends Binder
  implements zzol
{
  public static zzol zzbG(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzol)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzol;
        if (bool)
        {
          localObject = (zzol)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzol$zza$zza;
      ((zzol.zza.zza)localObject).<init>(paramIBinder);
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
      localObject = "com.google.android.gms.fitness.internal.IGoogleFitConfigApi";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.fitness.internal.IGoogleFitConfigApi";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DataTypeCreateRequest)DataTypeCreateRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataTypeCreateRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitConfigApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DataTypeReadRequest)DataTypeReadRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataTypeReadRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitConfigApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DisableFitRequest)DisableFitRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DisableFitRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzol$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */