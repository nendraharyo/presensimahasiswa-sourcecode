package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.reward.client.zzd.zza;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzcf.zza;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgd.zza;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzgh.zza;

public abstract class zzu$zza
  extends Binder
  implements zzu
{
  public zzu$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
  }
  
  public static zzu zzk(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzu)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzu;
        if (bool)
        {
          localObject = (zzu)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/client/zzu$zza$zza;
      ((zzu.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int k = 0;
    Object localObject2 = null;
    int m = 1;
    switch (paramInt1)
    {
    default: 
      m = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return m;
      localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      localObject2 = zzaM();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((com.google.android.gms.dynamic.zzd)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject1);
      destroy();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject1);
      i = isReady();
      paramParcel2.writeNoException();
      if (i != 0) {
        i = m;
      }
      for (;;)
      {
        paramParcel2.writeInt(i);
        break;
        bool1 = false;
        localObject1 = null;
      }
      String str = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface(str);
      int n = paramParcel1.readInt();
      if (n != 0) {
        localObject1 = AdRequestParcel.CREATOR.zzb(paramParcel1);
      }
      boolean bool1 = zzb((AdRequestParcel)localObject1);
      paramParcel2.writeNoException();
      if (bool1) {
        k = m;
      }
      paramParcel2.writeInt(k);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject1);
      pause();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject1);
      resume();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      localObject1 = zzq.zza.zzg(paramParcel1.readStrongBinder());
      zza((zzq)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      localObject1 = zzw.zza.zzm(paramParcel1.readStrongBinder());
      zza((zzw)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject1);
      showInterstitial();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject1);
      stopLoading();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject1);
      zzaP();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      localObject1 = zzaN();
      paramParcel2.writeNoException();
      if (localObject1 != null)
      {
        paramParcel2.writeInt(m);
        ((AdSizeParcel)localObject1).writeToParcel(paramParcel2, m);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        localObject2 = "com.google.android.gms.ads.internal.client.IAdManager";
        paramParcel1.enforceInterface((String)localObject2);
        k = paramParcel1.readInt();
        if (k != 0) {
          localObject1 = AdSizeParcel.CREATOR.zzc(paramParcel1);
        }
        zza((AdSizeParcel)localObject1);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzgd.zza.zzP(paramParcel1.readStrongBinder());
        zza((zzgd)localObject1);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzgh.zza.zzT(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        zza((zzgh)localObject1, (String)localObject2);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = getMediationAdapterClassName();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzcf.zza.zzs(paramParcel1.readStrongBinder());
        zza((zzcf)localObject1);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzp.zza.zzf(paramParcel1.readStrongBinder());
        zza((zzp)localObject1);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzx.zza.zzn(paramParcel1.readStrongBinder());
        zza((zzx)localObject1);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
        paramParcel1.enforceInterface((String)localObject1);
        int j = paramParcel1.readInt();
        if (j != 0) {
          k = m;
        }
        setManualImpressionsEnabled(k);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
        paramParcel1.enforceInterface((String)localObject1);
        boolean bool2 = isLoading();
        paramParcel2.writeNoException();
        if (bool2) {
          k = m;
        }
        paramParcel2.writeInt(k);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzd.zza.zzac(paramParcel1.readStrongBinder());
        zza((com.google.android.gms.ads.internal.reward.client.zzd)localObject1);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = paramParcel1.readString();
        setUserId((String)localObject1);
        paramParcel2.writeNoException();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzu$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */