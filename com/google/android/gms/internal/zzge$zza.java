package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzge$zza
  extends Binder
  implements zzge
{
  public zzge$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
  }
  
  public static zzge zzQ(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzge)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzge;
        if (bool)
        {
          localObject = (zzge)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzge$zza$zza;
      ((zzge.zza.zza)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager";
        paramParcel2.writeString((String)localObject);
        bool = i;
        continue;
        localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager";
        paramParcel1.enforceInterface((String)localObject);
        onCreate();
        paramParcel2.writeNoException();
        bool = i;
        continue;
        localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager";
        paramParcel1.enforceInterface((String)localObject);
        onDestroy();
        paramParcel2.writeNoException();
        bool = i;
      }
    }
    Object localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager";
    paramParcel1.enforceInterface((String)localObject);
    int k = paramParcel1.readInt();
    int m = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      onActivityResult(k, m, (Intent)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzge$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */