package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;

public abstract class zzh$zza
  extends Binder
  implements zzh
{
  public static zzh zzaD(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzh;
        if (bool)
        {
          localObject = (zzh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/auth/api/signin/internal/zzh$zza$zza;
      ((zzh.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject1 = "com.google.android.gms.auth.api.signin.internal.ISignInService";
        paramParcel2.writeString((String)localObject1);
      }
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localObject1 = paramParcel1.readStrongBinder();
      localObject2 = zzg.zza.zzaC((IBinder)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (SignInConfiguration)SignInConfiguration.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((zzg)localObject2, (SignInConfiguration)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localObject1 = paramParcel1.readStrongBinder();
      localObject2 = zzg.zza.zzaC((IBinder)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (SignInConfiguration)SignInConfiguration.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzb((zzg)localObject2, (SignInConfiguration)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localObject1 = paramParcel1.readStrongBinder();
      zzg localzzg = zzg.zza.zzaC((IBinder)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = (SignInConfiguration)SignInConfiguration.CREATOR.createFromParcel(paramParcel1);
        localObject2 = localObject1;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label355;
        }
      }
      for (localObject1 = (SignInAccount)SignInAccount.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        str = paramParcel1.readString();
        zza(localzzg, (SignInConfiguration)localObject2, (SignInAccount)localObject1, str);
        paramParcel2.writeNoException();
        j = i;
        break;
        localObject2 = null;
        break label295;
        j = 0;
      }
    case 101: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localObject1 = paramParcel1.readStrongBinder();
      localObject2 = zzg.zza.zzaC((IBinder)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((zzg)localObject2, (GoogleSignInOptions)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
    case 102: 
      label295:
      label355:
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localObject1 = paramParcel1.readStrongBinder();
      localObject2 = zzg.zza.zzaC((IBinder)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzb((zzg)localObject2, (GoogleSignInOptions)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
    Object localObject1 = paramParcel1.readStrongBinder();
    Object localObject2 = zzg.zza.zzaC((IBinder)localObject1);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject1 = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      zzc((zzg)localObject2, (GoogleSignInOptions)localObject1);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzh$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */