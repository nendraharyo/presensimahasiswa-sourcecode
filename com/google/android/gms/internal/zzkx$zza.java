package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.consent.GetConsentIntentRequest;

public abstract class zzkx$zza
  extends Binder
  implements zzkx
{
  public static zzkx zzau(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzkx)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.consent.internal.IConsentService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzkx;
        if (bool)
        {
          localObject = (zzkx)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzkx$zza$zza;
      ((zzkx.zza.zza)localObject).<init>(paramIBinder);
    }
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
        localObject = "com.google.android.gms.auth.api.consent.internal.IConsentService";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.auth.api.consent.internal.IConsentService";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0)
    {
      localObject = (GetConsentIntentRequest)GetConsentIntentRequest.CREATOR.createFromParcel(paramParcel1);
      label98:
      localObject = zza((GetConsentIntentRequest)localObject);
      paramParcel2.writeNoException();
      if (localObject == null) {
        break label145;
      }
      paramParcel2.writeInt(i);
      ((Intent)localObject).writeToParcel(paramParcel2, i);
    }
    for (;;)
    {
      j = i;
      break;
      j = 0;
      localObject = null;
      break label98;
      label145:
      j = 0;
      localObject = null;
      paramParcel2.writeInt(0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkx$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */