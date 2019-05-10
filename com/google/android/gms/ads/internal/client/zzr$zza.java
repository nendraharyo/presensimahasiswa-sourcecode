package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzr$zza
  extends Binder
  implements zzr
{
  public zzr$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoader");
  }
  
  public static zzr zzh(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzr)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzr;
        if (bool)
        {
          localObject = (zzr)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/client/zzr$zza$zza;
      ((zzr.zza.zza)localObject).<init>(paramIBinder);
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
    case 1598968902: 
    case 1: 
    case 2: 
      for (;;)
      {
        return i;
        localObject = "com.google.android.gms.ads.internal.client.IAdLoader";
        paramParcel2.writeString((String)localObject);
        continue;
        localObject = "com.google.android.gms.ads.internal.client.IAdLoader";
        paramParcel1.enforceInterface((String)localObject);
        int j = paramParcel1.readInt();
        if (j != 0) {}
        for (localObject = AdRequestParcel.CREATOR.zzb(paramParcel1);; localObject = null)
        {
          zzf((AdRequestParcel)localObject);
          paramParcel2.writeNoException();
          break;
          j = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoader");
        localObject = getMediationAdapterClassName();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.ads.internal.client.IAdLoader";
    paramParcel1.enforceInterface((String)localObject);
    int k = isLoading();
    paramParcel2.writeNoException();
    if (k != 0) {
      k = i;
    }
    for (;;)
    {
      paramParcel2.writeInt(k);
      break;
      int m = 0;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzr$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */