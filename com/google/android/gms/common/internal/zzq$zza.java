package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzq$zza
  extends Binder
  implements zzq
{
  public static zzq zzaQ(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzq)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzq;
        if (bool)
        {
          localObject = (zzq)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/common/internal/zzq$zza$zza;
      ((zzq.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      String str = "com.google.android.gms.common.internal.ICancelToken";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.common.internal.ICancelToken";
      paramParcel1.enforceInterface(str);
      cancel();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzq$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */