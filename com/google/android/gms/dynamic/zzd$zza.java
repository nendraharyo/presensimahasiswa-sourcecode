package com.google.android.gms.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzd$zza
  extends Binder
  implements zzd
{
  public zzd$zza()
  {
    attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
  }
  
  public static zzd zzbs(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzd)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzd;
        if (bool)
        {
          localObject = (zzd)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/dynamic/zzd$zza$zza;
      ((zzd.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    }
    for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = true)
    {
      return bool;
      String str = "com.google.android.gms.dynamic.IObjectWrapper";
      paramParcel2.writeString(str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\dynamic\zzd$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */