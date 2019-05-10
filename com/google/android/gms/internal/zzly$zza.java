package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.zzd;

public abstract class zzly$zza
  extends Binder
  implements zzly
{
  public static zzly zzaM(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzly)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzly;
        if (bool)
        {
          localObject = (zzly)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzly$zza$zza;
      ((zzly.zza.zza)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
        paramParcel2.writeString((String)localObject);
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    Object localObject = paramParcel1.readStrongBinder();
    zzlx localzzlx = zzlx.zza.zzaL((IBinder)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = LogEventParcelable.CREATOR.zzaf(paramParcel1);; localObject = null)
    {
      zza(localzzlx, (LogEventParcelable)localObject);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzly$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */