package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzfa$zza
  extends Binder
  implements zzfa
{
  public zzfa$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
  }
  
  public static zzfa zzH(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzfa)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzfa;
        if (bool)
        {
          localObject = (zzfa)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzfa$zza$zza;
      ((zzfa.zza.zza)localObject).<init>(paramIBinder);
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
      String str = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata";
      paramParcel1.enforceInterface(str);
      int i = zzeD();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfa$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */