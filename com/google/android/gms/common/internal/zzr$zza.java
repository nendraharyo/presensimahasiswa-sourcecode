package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzr$zza
  extends Binder
  implements zzr
{
  public zzr$zza()
  {
    attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
  }
  
  public static zzr zzaR(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzr)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzr;
        if (bool)
        {
          localObject = (zzr)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/common/internal/zzr$zza$zza;
      ((zzr.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      localObject = "com.google.android.gms.common.internal.IGmsCallbacks";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.common.internal.IGmsCallbacks";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      IBinder localIBinder = paramParcel1.readStrongBinder();
      int j = paramParcel1.readInt();
      if (j != 0) {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      zza(i, localIBinder, (Bundle)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.common.internal.IGmsCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      int k = paramParcel1.readInt();
      if (k != 0) {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      zzb(i, (Bundle)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzr$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */