package com.google.android.gms.common.api.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

public abstract class zzo$zza
  extends Binder
  implements zzo
{
  public static zzo zzaN(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzo)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzo;
        if (bool)
        {
          localObject = (zzo)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/common/api/internal/zzo$zza$zza;
      ((zzo.zza.zza)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.common.api.internal.IStatusCallback";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.common.api.internal.IStatusCallback";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      zzp((Status)localObject);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzo$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */