package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zzc.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public abstract class zzsa$zza
  extends Binder
  implements zzsa
{
  public static zzsa zzem(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzsa)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzsa;
        if (bool)
        {
          localObject = (zzsa)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzsa$zza$zza;
      ((zzsa.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    IBinder localIBinder = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject = "com.google.android.gms.wallet.internal.IWalletDynamiteCreator";
        paramParcel2.writeString((String)localObject);
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
    zzd localzzd = zzd.zza.zzbs(paramParcel1.readStrongBinder());
    Object localObject = paramParcel1.readStrongBinder();
    zzc localzzc = zzc.zza.zzbr((IBinder)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      zzry localzzry = zzry.zza.zzek(paramParcel1.readStrongBinder());
      localObject = zza(localzzd, localzzc, (WalletFragmentOptions)localObject, localzzry);
      paramParcel2.writeNoException();
      if (localObject != null) {
        localIBinder = ((zzrx)localObject).asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsa$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */