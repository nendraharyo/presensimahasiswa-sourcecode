package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzgc$zza
  extends Binder
  implements zzgc
{
  public zzgc$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
  }
  
  public static zzgc zzO(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzgc)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzgc;
        if (bool)
        {
          localObject = (zzgc)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzgc$zza$zza;
      ((zzgc.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
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
      String str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase";
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      str = getProductId();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      recordResolution(i);
      paramParcel2.writeNoException();
      continue;
      str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      recordPlayBillingResolution(i);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */