package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

public abstract class zzj$zza
  extends Binder
  implements zzj
{
  public static zzj zzbl(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzj)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzj;
        if (bool)
        {
          localObject = (zzj)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/drive/realtime/internal/zzj$zza$zza;
      ((zzj.zza.zza)localObject).<init>(paramIBinder);
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
      localObject = "com.google.android.gms.drive.realtime.internal.IEventCallback";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.drive.realtime.internal.IEventCallback";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (ParcelableEventList)ParcelableEventList.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ParcelableEventList)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.drive.realtime.internal.IEventCallback";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      onError((Status)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\zzj$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */