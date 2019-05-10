package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzh$zza
  extends Binder
  implements zzh
{
  public zzh$zza()
  {
    attachInterface(this, "com.google.android.gms.location.internal.IGeofencerCallbacks");
  }
  
  public static zzh zzci(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzh;
        if (bool)
        {
          localObject = (zzh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/location/internal/zzh$zza$zza;
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
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
      for (;;)
      {
        return bool;
        localObject = "com.google.android.gms.location.internal.IGeofencerCallbacks";
        paramParcel2.writeString((String)localObject);
        bool = i;
        continue;
        localObject = "com.google.android.gms.location.internal.IGeofencerCallbacks";
        paramParcel1.enforceInterface((String)localObject);
        j = paramParcel1.readInt();
        String[] arrayOfString = paramParcel1.createStringArray();
        zza(j, arrayOfString);
        j = i;
        continue;
        localObject = "com.google.android.gms.location.internal.IGeofencerCallbacks";
        paramParcel1.enforceInterface((String)localObject);
        j = paramParcel1.readInt();
        arrayOfString = paramParcel1.createStringArray();
        zzb(j, arrayOfString);
        j = i;
      }
    }
    Object localObject = "com.google.android.gms.location.internal.IGeofencerCallbacks";
    paramParcel1.enforceInterface((String)localObject);
    int k = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      zza(k, (PendingIntent)localObject);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzh$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */