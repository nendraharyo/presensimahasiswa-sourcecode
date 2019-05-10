package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzku$zza
  extends Binder
  implements zzku
{
  public static zzku zzas(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzku)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzku;
        if (bool)
        {
          localObject = (zzku)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzku$zza$zza;
      ((zzku.zza.zza)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (Account)Account.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      int k = paramParcel1.readInt();
      zzkt localzzkt = zzkt.zza.zzar(paramParcel1.readStrongBinder());
      zza((Account)localObject, k, localzzkt);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzku$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */