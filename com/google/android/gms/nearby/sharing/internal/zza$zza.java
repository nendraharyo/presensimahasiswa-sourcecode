package com.google.android.gms.nearby.sharing.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.sharing.AppContentReceivedResult;

public abstract class zza$zza
  extends Binder
  implements zza
{
  public static zza zzdF(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zza)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zza;
        if (bool)
        {
          localObject = (zza)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/nearby/sharing/internal/zza$zza$zza;
      ((zza.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
      for (;;)
      {
        return bool;
        localObject = "com.google.android.gms.nearby.sharing.internal.IAppContentReceiver";
        paramParcel2.writeString((String)localObject);
        bool = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
        localObject = paramParcel1.readString();
        localObject = zzfC((String)localObject);
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject);
        bool = i;
      }
    }
    Object localObject = "com.google.android.gms.nearby.sharing.internal.IAppContentReceiver";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (AppContentReceivedResult)AppContentReceivedResult.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      zza((AppContentReceivedResult)localObject);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\internal\zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */