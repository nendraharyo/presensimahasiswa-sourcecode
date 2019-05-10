package com.google.android.gms.fitness.internal.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzoi.zza;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public abstract class zzc$zza
  extends Binder
  implements zzc
{
  public zzc$zza()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.service.IFitnessSensorService");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      localObject1 = "com.google.android.gms.fitness.internal.service.IFitnessSensorService";
      paramParcel2.writeString((String)localObject1);
      bool1 = bool2;
      continue;
      Object localObject2 = "com.google.android.gms.fitness.internal.service.IFitnessSensorService";
      paramParcel1.enforceInterface((String)localObject2);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject1 = (FitnessDataSourcesRequest)FitnessDataSourcesRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject2 = zzoi.zza.zzbD(paramParcel1.readStrongBinder());
      zza((FitnessDataSourcesRequest)localObject1, (zzoi)localObject2);
      bool1 = bool2;
      continue;
      localObject2 = "com.google.android.gms.fitness.internal.service.IFitnessSensorService";
      paramParcel1.enforceInterface((String)localObject2);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject1 = (FitnessSensorServiceRequest)FitnessSensorServiceRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject2 = zzow.zza.zzbR(paramParcel1.readStrongBinder());
      zza((FitnessSensorServiceRequest)localObject1, (zzow)localObject2);
      bool1 = bool2;
      continue;
      localObject2 = "com.google.android.gms.fitness.internal.service.IFitnessSensorService";
      paramParcel1.enforceInterface((String)localObject2);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject1 = (FitnessUnregistrationRequest)FitnessUnregistrationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject2 = zzow.zza.zzbR(paramParcel1.readStrongBinder());
      zza((FitnessUnregistrationRequest)localObject1, (zzow)localObject2);
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\internal\service\zzc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */