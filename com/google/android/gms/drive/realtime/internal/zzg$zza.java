package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

public abstract class zzg$zza
  extends Binder
  implements zzg
{
  public static zzg zzbi(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzg)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzg;
        if (bool)
        {
          localObject = (zzg)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/drive/realtime/internal/zzg$zza$zza;
      ((zzg.zza.zza)localObject).<init>(paramIBinder);
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
        localObject1 = "com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback";
        paramParcel2.writeString((String)localObject1);
      }
    case 1: 
      localObject1 = "com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      Object localObject2;
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
        localObject2 = localObject1;
        label105:
        j = paramParcel1.readInt();
        if (j == 0) {
          break label155;
        }
      }
      for (localObject1 = (ParcelableEventList)ParcelableEventList.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((DataHolder)localObject2, (ParcelableEventList)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        localObject2 = null;
        break label105;
        label155:
        j = 0;
      }
    }
    Object localObject1 = "com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback";
    paramParcel1.enforceInterface((String)localObject1);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      onError((Status)localObject1);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\zzg$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */