package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzry$zza
  extends Binder
  implements zzry
{
  public zzry$zza()
  {
    attachInterface(this, "com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
  }
  
  public static zzry zzek(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzry)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzry;
        if (bool)
        {
          localObject = (zzry)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzry$zza$zza;
      ((zzry.zza.zza)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener";
    paramParcel1.enforceInterface((String)localObject);
    int k = paramParcel1.readInt();
    int m = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      zza(k, m, (Bundle)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzry$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */