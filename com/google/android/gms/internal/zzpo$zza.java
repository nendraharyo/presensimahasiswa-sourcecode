package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzpo$zza
  extends Binder
  implements zzpo
{
  public zzpo$zza()
  {
    attachInterface(this, "com.google.android.gms.identity.intents.internal.IAddressCallbacks");
  }
  
  public static zzpo zzcb(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzpo)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzpo;
        if (bool)
        {
          localObject = (zzpo)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzpo$zza$zza;
      ((zzpo.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
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
        localObject = "com.google.android.gms.identity.intents.internal.IAddressCallbacks";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.identity.intents.internal.IAddressCallbacks";
    paramParcel1.enforceInterface((String)localObject);
    int k = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      zzh(k, (Bundle)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpo$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */