package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identity.intents.UserAddressRequest;

public abstract class zzpp$zza
  extends Binder
  implements zzpp
{
  public static zzpp zzcc(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzpp)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzpp;
        if (bool)
        {
          localObject = (zzpp)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzpp$zza$zza;
      ((zzpp.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject1 = "com.google.android.gms.identity.intents.internal.IAddressService";
        paramParcel2.writeString((String)localObject1);
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.identity.intents.internal.IAddressService");
    Object localObject1 = paramParcel1.readStrongBinder();
    zzpo localzzpo = zzpo.zza.zzcb((IBinder)localObject1);
    int j = paramParcel1.readInt();
    Object localObject2;
    if (j != 0)
    {
      localObject1 = (UserAddressRequest)UserAddressRequest.CREATOR.createFromParcel(paramParcel1);
      localObject2 = localObject1;
      label111:
      j = paramParcel1.readInt();
      if (j == 0) {
        break label163;
      }
    }
    for (localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      zza(localzzpo, (UserAddressRequest)localObject2, (Bundle)localObject1);
      paramParcel2.writeNoException();
      j = i;
      break;
      localObject2 = null;
      break label111;
      label163:
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpp$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */