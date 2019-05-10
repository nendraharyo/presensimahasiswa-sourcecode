package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzqf$zza
  extends Binder
  implements zzqf
{
  public static zzqf zzdr(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzqf)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzqf;
        if (bool)
        {
          localObject = (zzqf)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzqf$zza$zza;
      ((zzqf.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.nearby.bootstrap.internal.IDataListener";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
      localObject = paramParcel1.createByteArray();
      zzs((byte[])localObject);
      continue;
      localObject = "com.google.android.gms.nearby.bootstrap.internal.IDataListener";
      paramParcel1.enforceInterface((String)localObject);
      int i = paramParcel1.readInt();
      onError(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqf$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */