package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public abstract class zzj$zza
  extends Binder
  implements zzj
{
  public static zzj zzax(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzj)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzj;
        if (bool)
        {
          localObject = (zzj)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/auth/api/credentials/internal/zzj$zza$zza;
      ((zzj.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      localObject = "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      zzi localzzi = zzi.zza.zzaw(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (CredentialRequest)CredentialRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza(localzzi, (CredentialRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      localzzi = zzi.zza.zzaw(paramParcel1.readStrongBinder());
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (SaveRequest)SaveRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza(localzzi, (SaveRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      localzzi = zzi.zza.zzaw(paramParcel1.readStrongBinder());
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DeleteRequest)DeleteRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza(localzzi, (DeleteRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      localObject = zzi.zza.zzaw(paramParcel1.readStrongBinder());
      zza((zzi)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      localzzi = zzi.zza.zzaw(paramParcel1.readStrongBinder());
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GeneratePasswordRequest)GeneratePasswordRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza(localzzi, (GeneratePasswordRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\zzj$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */