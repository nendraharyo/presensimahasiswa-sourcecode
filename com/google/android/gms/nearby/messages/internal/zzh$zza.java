package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzh$zza
  extends Binder
  implements zzh
{
  public zzh$zza()
  {
    attachInterface(this, "com.google.android.gms.nearby.messages.internal.IStatusCallback");
  }
  
  public static zzh zzdC(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzh;
        if (bool)
        {
          localObject = (zzh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/nearby/messages/internal/zzh$zza$zza;
      ((zzh.zza.zza)localObject).<init>(paramIBinder);
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
    case 1598968902: 
      for (;;)
      {
        return i;
        str = "com.google.android.gms.nearby.messages.internal.IStatusCallback";
        paramParcel2.writeString(str);
      }
    }
    String str = "com.google.android.gms.nearby.messages.internal.IStatusCallback";
    paramParcel1.enforceInterface(str);
    int j = paramParcel1.readInt();
    if (j != 0) {
      j = i;
    }
    for (;;)
    {
      onPermissionChanged(j);
      break;
      int k = 0;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzh$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */