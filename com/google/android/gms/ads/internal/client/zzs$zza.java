package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzj;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcr.zza;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzcs.zza;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzct.zza;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcu.zza;

public abstract class zzs$zza
  extends Binder
  implements zzs
{
  public zzs$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
  }
  
  public static zzs zzi(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzs)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzs;
        if (bool)
        {
          localObject = (zzs)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/client/zzs$zza$zza;
      ((zzs.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      localObject1 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder";
      paramParcel2.writeString((String)localObject1);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      Object localObject2 = zzbn();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((zzr)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      localObject1 = zzq.zza.zzg(paramParcel1.readStrongBinder());
      zzb((zzq)localObject1);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      localObject1 = zzcr.zza.zzz(paramParcel1.readStrongBinder());
      zza((zzcr)localObject1);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      localObject1 = zzcs.zza.zzA(paramParcel1.readStrongBinder());
      zza((zzcs)localObject1);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      localObject1 = paramParcel1.readString();
      localObject2 = zzcu.zza.zzC(paramParcel1.readStrongBinder());
      zzct localzzct = zzct.zza.zzB(paramParcel1.readStrongBinder());
      zza((String)localObject1, (zzcu)localObject2, localzzct);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      localObject2 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder";
      paramParcel1.enforceInterface((String)localObject2);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject1 = NativeAdOptionsParcel.CREATOR.zze(paramParcel1);
      }
      zza((NativeAdOptionsParcel)localObject1);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      localObject1 = zzx.zza.zzn(paramParcel1.readStrongBinder());
      zzb((zzx)localObject1);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzs$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */