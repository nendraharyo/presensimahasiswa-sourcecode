package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzj$zza
  extends Binder
  implements zzj
{
  public zzj$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
  }
  
  public static zzj zzX(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzj)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzj;
        if (bool)
        {
          localObject = (zzj)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/request/zzj$zza$zza;
      ((zzj.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      localObject1 = "com.google.android.gms.ads.internal.request.IAdRequestService";
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      Object localObject2 = "com.google.android.gms.ads.internal.request.IAdRequestService";
      paramParcel1.enforceInterface((String)localObject2);
      int j = paramParcel1.readInt();
      if (j != 0) {
        localObject1 = AdRequestInfoParcel.CREATOR.zzi(paramParcel1);
      }
      localObject1 = zzd((AdRequestInfoParcel)localObject1);
      paramParcel2.writeNoException();
      if (localObject1 != null)
      {
        paramParcel2.writeInt(i);
        ((AdResponseParcel)localObject1).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        bool = i;
        break;
        bool = false;
        localObject1 = null;
        paramParcel2.writeInt(0);
      }
      localObject2 = "com.google.android.gms.ads.internal.request.IAdRequestService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject1 = AdRequestInfoParcel.CREATOR.zzi(paramParcel1);
      }
      localObject2 = zzk.zza.zzY(paramParcel1.readStrongBinder());
      zza((AdRequestInfoParcel)localObject1, (zzk)localObject2);
      paramParcel2.writeNoException();
      bool = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzj$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */