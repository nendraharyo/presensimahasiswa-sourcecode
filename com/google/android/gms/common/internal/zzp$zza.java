package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzp$zza
  extends Binder
  implements zzp
{
  public static zzp zzaP(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzp)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzp;
        if (bool)
        {
          localObject = (zzp)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/common/internal/zzp$zza$zza;
      ((zzp.zza.zza)localObject).<init>(paramIBinder);
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
    }
    for (;;)
    {
      return i;
      Object localObject = "com.google.android.gms.common.internal.IAccountAccessor";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IAccountAccessor");
      localObject = getAccount();
      paramParcel2.writeNoException();
      if (localObject != null)
      {
        paramParcel2.writeInt(i);
        ((Account)localObject).writeToParcel(paramParcel2, i);
      }
      else
      {
        localObject = null;
        paramParcel2.writeInt(0);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzp$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */