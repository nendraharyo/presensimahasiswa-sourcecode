package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzp.zza;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzt.zza;

public abstract class zze$zza
  extends Binder
  implements zze
{
  public static zze zzeb(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zze)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zze;
        if (bool)
        {
          localObject = (zze)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/signin/internal/zze$zza$zza;
      ((zze.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int k = 0;
    Object localObject2 = null;
    int n = 1;
    switch (paramInt1)
    {
    default: 
      n = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return n;
      localObject2 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel2.writeString((String)localObject2);
      continue;
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject2 = (AuthAccountRequest)AuthAccountRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject1 = zzd.zza.zzea(paramParcel1.readStrongBinder());
      zza((AuthAccountRequest)localObject2, (zzd)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject2 = (CheckServerAuthResult)CheckServerAuthResult.CREATOR.createFromParcel(paramParcel1);
      }
      zza((CheckServerAuthResult)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject2);
      k = paramParcel1.readInt();
      if (k != 0) {
        k = n;
      }
      for (;;)
      {
        zzav(k);
        paramParcel2.writeNoException();
        break;
        m = 0;
        localObject2 = null;
      }
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject2 = (ResolveAccountRequest)ResolveAccountRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject1 = zzt.zza.zzaT(paramParcel1.readStrongBinder());
      zza((ResolveAccountRequest)localObject2, (zzt)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject2);
      int m = paramParcel1.readInt();
      zzka(m);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      int i1 = paramParcel1.readInt();
      if (i1 != 0) {
        localObject2 = (Account)Account.CREATOR.createFromParcel(paramParcel1);
      }
      zzd localzzd = zzd.zza.zzea(paramParcel1.readStrongBinder());
      zza(i, (Account)localObject2, localzzd);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      localObject2 = zzp.zza.zzaP(paramParcel1.readStrongBinder());
      i1 = paramParcel1.readInt();
      int i2 = paramParcel1.readInt();
      if (i2 != 0) {
        i = n;
      }
      zza((zzp)localObject2, i1, i);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      int j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (RecordConsentRequest)RecordConsentRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject1 = zzd.zza.zzea(paramParcel1.readStrongBinder());
      zza((RecordConsentRequest)localObject2, (zzd)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      localObject2 = zzd.zza.zzea(paramParcel1.readStrongBinder());
      zzb((zzd)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (SignInRequest)SignInRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject1 = zzd.zza.zzea(paramParcel1.readStrongBinder());
      zza((SignInRequest)localObject2, (zzd)localObject1);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\zze$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */