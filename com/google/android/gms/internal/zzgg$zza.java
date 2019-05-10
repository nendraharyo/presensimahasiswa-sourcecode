package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzgg$zza
  extends Binder
  implements zzgg
{
  public zzgg$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
  }
  
  public static zzgg zzS(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzgg)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzgg;
        if (bool)
        {
          localObject = (zzgg)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzgg$zza$zza;
      ((zzgg.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    String str = null;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return j;
      str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult";
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
      str = getProductId();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
      Object localObject = getPurchaseData();
      paramParcel2.writeNoException();
      if (localObject != null)
      {
        paramParcel2.writeInt(j);
        ((Intent)localObject).writeToParcel(paramParcel2, j);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult";
        paramParcel1.enforceInterface(str);
        i = getResultCode();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult";
        paramParcel1.enforceInterface((String)localObject);
        boolean bool = isVerified();
        paramParcel2.writeNoException();
        if (bool) {
          i = j;
        }
        paramParcel2.writeInt(i);
        continue;
        str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult";
        paramParcel1.enforceInterface(str);
        finishPurchase();
        paramParcel2.writeNoException();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgg$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */