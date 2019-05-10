package com.google.android.gms.location.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzg$zza
  extends Binder
  implements zzg
{
  public zzg$zza()
  {
    attachInterface(this, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
  }
  
  public static zzg zzch(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzg)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzg;
        if (bool)
        {
          localObject = (zzg)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/location/internal/zzg$zza$zza;
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
        localObject = "com.google.android.gms.location.internal.IFusedLocationProviderCallback";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.location.internal.IFusedLocationProviderCallback";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (FusedLocationProviderResult)FusedLocationProviderResult.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      zza((FusedLocationProviderResult)localObject);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzg$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */