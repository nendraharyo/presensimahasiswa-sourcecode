package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzgf$zza
  extends Binder
  implements zzgf
{
  public static zzgf zzR(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzgf)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzgf;
        if (bool)
        {
          localObject = (zzgf)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzgf$zza$zza;
      ((zzgf.zza.zza)localObject).<init>(paramIBinder);
    }
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
      Object localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      localObject = zzf((zzd)localObject);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgf$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */