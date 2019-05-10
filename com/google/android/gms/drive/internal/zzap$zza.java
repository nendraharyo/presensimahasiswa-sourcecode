package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzap$zza
  extends Binder
  implements zzap
{
  public static zzap zzbd(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzap)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzap;
        if (bool)
        {
          localObject = (zzap)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/drive/internal/zzap$zza$zza;
      ((zzap.zza.zza)localObject).<init>(paramIBinder);
    }
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
        str = "com.google.android.gms.drive.internal.IEventReleaseCallback";
        paramParcel2.writeString(str);
      }
    }
    String str = "com.google.android.gms.drive.internal.IEventReleaseCallback";
    paramParcel1.enforceInterface(str);
    int j = paramParcel1.readInt();
    if (j != 0) {
      j = i;
    }
    for (;;)
    {
      zzv(j);
      break;
      int k = 0;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzap$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */