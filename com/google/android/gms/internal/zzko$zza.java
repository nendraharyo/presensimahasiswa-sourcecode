package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

public abstract class zzko$zza
  extends Binder
  implements zzko
{
  public zzko$zza()
  {
    attachInterface(this, "com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
  }
  
  public static zzko zzak(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzko)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzko;
        if (bool)
        {
          localObject = (zzko)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzko$zza$zza;
      ((zzko.zza.zza)localObject).<init>(paramIBinder);
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
        localObject1 = "com.google.android.gms.appinvite.internal.IAppInviteCallbacks";
        paramParcel2.writeString((String)localObject1);
      }
    case 1: 
      localObject1 = "com.google.android.gms.appinvite.internal.IAppInviteCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzd((Status)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
    }
    Object localObject1 = "com.google.android.gms.appinvite.internal.IAppInviteCallbacks";
    paramParcel1.enforceInterface((String)localObject1);
    int j = paramParcel1.readInt();
    Object localObject2;
    if (j != 0)
    {
      localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      localObject2 = localObject1;
      label171:
      j = paramParcel1.readInt();
      if (j == 0) {
        break label221;
      }
    }
    for (localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      zza((Status)localObject2, (Intent)localObject1);
      paramParcel2.writeNoException();
      j = i;
      break;
      localObject2 = null;
      break label171;
      label221:
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzko$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */