package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzgh$zza
  extends Binder
  implements zzgh
{
  public zzgh$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
  }
  
  public static zzgh zzT(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzgh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzgh;
        if (bool)
        {
          localObject = (zzgh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzgh$zza$zza;
      ((zzgh.zza.zza)localObject).<init>(paramIBinder);
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
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return i;
      Object localObject = "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      localObject = paramParcel1.readString();
      int j = isValidPurchase((String)localObject);
      paramParcel2.writeNoException();
      if (j != 0) {
        j = i;
      }
      for (;;)
      {
        paramParcel2.writeInt(j);
        break;
        int k = 0;
        localObject = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      localObject = zzgg.zza.zzS(paramParcel1.readStrongBinder());
      zza((zzgg)localObject);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgh$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */