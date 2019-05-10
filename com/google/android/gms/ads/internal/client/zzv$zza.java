package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzex.zza;

public abstract class zzv$zza
  extends Binder
  implements zzv
{
  public static zzv zzl(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzv)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzv;
        if (bool)
        {
          localObject = (zzv)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/client/zzv$zza$zza;
      ((zzv.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    AdSizeParcel localAdSizeParcel = null;
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.ads.internal.client.IAdManagerCreator";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      localObject = paramParcel1.readStrongBinder();
      zzd localzzd = zzd.zza.zzbs((IBinder)localObject);
      int j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject = AdSizeParcel.CREATOR;
        localAdSizeParcel = ((zzi)localObject).zzc(paramParcel1);
      }
      String str = paramParcel1.readString();
      zzex localzzex = zzex.zza.zzE(paramParcel1.readStrongBinder());
      int k = paramParcel1.readInt();
      localObject = this;
      localObject = zza(localzzd, localAdSizeParcel, str, localzzex, k);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject);
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      localObject = paramParcel1.readStrongBinder();
      localzzd = zzd.zza.zzbs((IBinder)localObject);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject = AdSizeParcel.CREATOR;
        localAdSizeParcel = ((zzi)localObject).zzc(paramParcel1);
      }
      str = paramParcel1.readString();
      localzzex = zzex.zza.zzE(paramParcel1.readStrongBinder());
      k = paramParcel1.readInt();
      int m = paramParcel1.readInt();
      localObject = this;
      localObject = zza(localzzd, localAdSizeParcel, str, localzzex, k, m);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject);
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzv$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */