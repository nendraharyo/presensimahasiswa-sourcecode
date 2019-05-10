package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzu$zza
  extends Binder
  implements zzu
{
  public static zzu zzaU(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzu)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzu;
        if (bool)
        {
          localObject = (zzu)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/common/internal/zzu$zza$zza;
      ((zzu.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    IBinder localIBinder = null;
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject = "com.google.android.gms.common.internal.ISignInButtonCreator";
        paramParcel2.writeString((String)localObject);
      }
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      int k = paramParcel1.readInt();
      int m = paramParcel1.readInt();
      localObject = zza((zzd)localObject, k, m);
      paramParcel2.writeNoException();
      if (localObject != null) {}
      for (localObject = ((zzd)localObject).asBinder();; localObject = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject);
        bool = i;
        break;
        bool = false;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
    Object localObject = paramParcel1.readStrongBinder();
    zzd localzzd = zzd.zza.zzbs((IBinder)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (SignInButtonConfig)SignInButtonConfig.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      localObject = zza(localzzd, (SignInButtonConfig)localObject);
      paramParcel2.writeNoException();
      if (localObject != null) {
        localIBinder = ((zzd)localObject).asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzu$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */