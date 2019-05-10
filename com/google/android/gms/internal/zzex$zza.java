package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzex$zza
  extends Binder
  implements zzex
{
  public zzex$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
  }
  
  public static zzex zzE(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzex)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzex;
        if (bool)
        {
          localObject = (zzex)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzex$zza$zza;
      ((zzex.zza.zza)localObject).<init>(paramIBinder);
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
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      for (;;)
      {
        return i;
        localObject = "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator";
        paramParcel2.writeString((String)localObject);
      }
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
      localObject = paramParcel1.readString();
      localObject = zzaf((String)localObject);
      paramParcel2.writeNoException();
      if (localObject != null) {}
      for (localObject = ((zzey)localObject).asBinder();; localObject = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject);
        break;
        j = 0;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    Object localObject = paramParcel1.readString();
    int j = zzag((String)localObject);
    paramParcel2.writeNoException();
    if (j != 0) {
      j = i;
    }
    for (;;)
    {
      paramParcel2.writeInt(j);
      break;
      int k = 0;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzex$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */