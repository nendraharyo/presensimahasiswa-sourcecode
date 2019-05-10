package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class zzi$zza
  extends Binder
  implements zzi
{
  public zzi$zza()
  {
    attachInterface(this, "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
  }
  
  public static zzi zzaw(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzi)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzi;
        if (bool)
        {
          localObject = (zzi)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/auth/api/credentials/internal/zzi$zza$zza;
      ((zzi.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    Object localObject2;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject1 = "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks";
        paramParcel2.writeString((String)localObject1);
      }
    case 1: 
      localObject1 = "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        localObject2 = localObject1;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label168;
        }
      }
      for (localObject1 = (Credential)Credential.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((Status)localObject2, (Credential)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        localObject2 = null;
        break label118;
        j = 0;
      }
    case 2: 
      label118:
      label168:
      localObject1 = "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzg((Status)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
    }
    Object localObject1 = "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks";
    paramParcel1.enforceInterface((String)localObject1);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      localObject2 = paramParcel1.readString();
      zza((Status)localObject1, (String)localObject2);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\zzi$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */