package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzqp$zza
  extends Binder
  implements zzqp
{
  public static zzqp zzdL(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzqp)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzqp;
        if (bool)
        {
          localObject = (zzqp)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzqp$zza$zza;
      ((zzqp.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    int k = 1;
    switch (paramInt1)
    {
    default: 
      k = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      for (;;)
      {
        return k;
        localObject1 = "com.google.android.gms.panorama.internal.IPanoramaService";
        paramParcel2.writeString((String)localObject1);
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
    Object localObject1 = paramParcel1.readStrongBinder();
    zzqo localzzqo = zzqo.zza.zzdK((IBinder)localObject1);
    int m = paramParcel1.readInt();
    Object localObject2;
    if (m != 0)
    {
      localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      localObject2 = localObject1;
      label107:
      m = paramParcel1.readInt();
      if (m == 0) {
        break label168;
      }
      localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      label132:
      i = paramParcel1.readInt();
      if (i == 0) {
        break label177;
      }
    }
    label168:
    label177:
    int j;
    for (i = k;; j = 0)
    {
      zza(localzzqo, (Uri)localObject2, (Bundle)localObject1, i);
      break;
      localObject2 = null;
      break label107;
      m = 0;
      localObject1 = null;
      break label132;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqp$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */