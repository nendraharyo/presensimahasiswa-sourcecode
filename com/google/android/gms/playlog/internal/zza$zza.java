package com.google.android.gms.playlog.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public abstract class zza$zza
  extends Binder
  implements zza
{
  public static zza zzdN(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zza)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.playlog.internal.IPlayLogService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zza;
        if (bool)
        {
          localObject = (zza)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/playlog/internal/zza$zza$zza;
      ((zza.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject2 = "com.google.android.gms.playlog.internal.IPlayLogService";
      paramParcel2.writeString((String)localObject2);
      bool = i;
      continue;
      localObject2 = "com.google.android.gms.playlog.internal.IPlayLogService";
      paramParcel1.enforceInterface((String)localObject2);
      Object localObject3 = paramParcel1.readString();
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = PlayLoggerContext.CREATOR.zzgz(paramParcel1);; localObject2 = null)
      {
        int k = paramParcel1.readInt();
        if (k != 0) {
          localObject1 = LogEvent.CREATOR.zzgy(paramParcel1);
        }
        zza((String)localObject3, (PlayLoggerContext)localObject2, (LogEvent)localObject1);
        j = i;
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
      localObject2 = paramParcel1.readString();
      int m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = PlayLoggerContext.CREATOR.zzgz(paramParcel1);
      }
      localObject3 = LogEvent.CREATOR;
      localObject3 = paramParcel1.createTypedArrayList((Parcelable.Creator)localObject3);
      zza((String)localObject2, (PlayLoggerContext)localObject1, (List)localObject3);
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
      localObject2 = paramParcel1.readString();
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = PlayLoggerContext.CREATOR.zzgz(paramParcel1);
      }
      localObject3 = paramParcel1.createByteArray();
      zza((String)localObject2, (PlayLoggerContext)localObject1, (byte[])localObject3);
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\playlog\internal\zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */