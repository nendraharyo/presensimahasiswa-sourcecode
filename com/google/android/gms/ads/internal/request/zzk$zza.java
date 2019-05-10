package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzk$zza
  extends Binder
  implements zzk
{
  public zzk$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
  }
  
  public static zzk zzY(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzk)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzk;
        if (bool)
        {
          localObject = (zzk)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/request/zzk$zza$zza;
      ((zzk.zza.zza)localObject).<init>(paramIBinder);
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
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject = "com.google.android.gms.ads.internal.request.IAdResponseListener";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.ads.internal.request.IAdResponseListener";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = AdResponseParcel.CREATOR.zzj(paramParcel1);; localObject = null)
    {
      zzb((AdResponseParcel)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzk$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */