package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzau$zza
  extends Binder
  implements zzau
{
  public zzau$zza()
  {
    attachInterface(this, "com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
  }
  
  public static zzau zzer(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzau)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzau;
        if (bool)
        {
          localObject = (zzau)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/wearable/internal/zzau$zza$zza;
      ((zzau.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
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
      String str = "com.google.android.gms.wearable.internal.IChannelStreamCallbacks";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.wearable.internal.IChannelStreamCallbacks";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      int j = paramParcel1.readInt();
      zzy(i, j);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzau$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */