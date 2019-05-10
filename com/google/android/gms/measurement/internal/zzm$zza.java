package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public abstract class zzm$zza
  extends Binder
  implements zzm
{
  public zzm$zza()
  {
    attachInterface(this, "com.google.android.gms.measurement.internal.IMeasurementService");
  }
  
  public static zzm zzdn(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzm)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzm;
        if (bool)
        {
          localObject = (zzm)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/measurement/internal/zzm$zza$zza;
      ((zzm.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
    case 4: 
    case 5: 
    case 6: 
      for (;;)
      {
        return i;
        localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
        paramParcel2.writeString((String)localObject2);
        continue;
        localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0) {}
        int m;
        for (localObject2 = EventParcel.CREATOR.zzfN(paramParcel1);; localObject2 = null)
        {
          m = paramParcel1.readInt();
          if (m != 0) {
            localObject1 = AppMetadata.CREATOR.zzfL(paramParcel1);
          }
          zza((EventParcel)localObject2, (AppMetadata)localObject1);
          paramParcel2.writeNoException();
          break;
          j = 0;
        }
        localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0) {}
        for (localObject2 = UserAttributeParcel.CREATOR.zzfO(paramParcel1);; localObject2 = null)
        {
          m = paramParcel1.readInt();
          if (m != 0) {
            localObject1 = AppMetadata.CREATOR.zzfL(paramParcel1);
          }
          zza((UserAttributeParcel)localObject2, (AppMetadata)localObject1);
          paramParcel2.writeNoException();
          break;
          j = 0;
        }
        localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = AppMetadata.CREATOR;
          localObject1 = ((zzb)localObject2).zzfL(paramParcel1);
        }
        zza((AppMetadata)localObject1);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = EventParcel.CREATOR;
          localObject1 = ((zzk)localObject2).zzfN(paramParcel1);
        }
        localObject2 = paramParcel1.readString();
        String str = paramParcel1.readString();
        zza((EventParcel)localObject1, (String)localObject2, str);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = AppMetadata.CREATOR;
          localObject1 = ((zzb)localObject2).zzfL(paramParcel1);
        }
        zzb((AppMetadata)localObject1);
        paramParcel2.writeNoException();
      }
    }
    Object localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
    paramParcel1.enforceInterface((String)localObject2);
    int j = paramParcel1.readInt();
    if (j != 0)
    {
      localObject2 = AppMetadata.CREATOR;
      localObject1 = ((zzb)localObject2).zzfL(paramParcel1);
    }
    j = paramParcel1.readInt();
    if (j != 0) {
      j = i;
    }
    for (;;)
    {
      localObject2 = zza((AppMetadata)localObject1, j);
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList((List)localObject2);
      break;
      int k = 0;
      localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzm$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */