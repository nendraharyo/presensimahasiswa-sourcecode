package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzqo$zza
  extends Binder
  implements zzqo
{
  public zzqo$zza()
  {
    attachInterface(this, "com.google.android.gms.panorama.internal.IPanoramaCallbacks");
  }
  
  public static zzqo zzdK(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzqo)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzqo;
        if (bool)
        {
          localObject = (zzqo)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzqo$zza$zza;
      ((zzqo.zza.zza)localObject).<init>(paramIBinder);
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
        localObject1 = "com.google.android.gms.panorama.internal.IPanoramaCallbacks";
        paramParcel2.writeString((String)localObject1);
      }
    }
    Object localObject1 = "com.google.android.gms.panorama.internal.IPanoramaCallbacks";
    paramParcel1.enforceInterface((String)localObject1);
    int k = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    Object localObject2;
    label108:
    int m;
    if (j != 0)
    {
      localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      localObject2 = localObject1;
      m = paramParcel1.readInt();
      j = paramParcel1.readInt();
      if (j == 0) {
        break label168;
      }
    }
    for (localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      zza(k, (Bundle)localObject2, m, (Intent)localObject1);
      paramParcel2.writeNoException();
      j = i;
      break;
      localObject2 = null;
      break label108;
      label168:
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqo$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */