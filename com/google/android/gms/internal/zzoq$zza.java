package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;

public abstract class zzoq$zza
  extends Binder
  implements zzoq
{
  public static zzoq zzbL(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzoq)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzoq;
        if (bool)
        {
          localObject = (zzoq)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzoq$zza$zza;
      ((zzoq.zza.zza)localObject).<init>(paramIBinder);
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
      localObject = "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (SessionStartRequest)SessionStartRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SessionStartRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (SessionStopRequest)SessionStopRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SessionStopRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (SessionInsertRequest)SessionInsertRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SessionInsertRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (SessionReadRequest)SessionReadRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SessionReadRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (SessionRegistrationRequest)SessionRegistrationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SessionRegistrationRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (SessionUnregistrationRequest)SessionUnregistrationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SessionUnregistrationRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzoq$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */