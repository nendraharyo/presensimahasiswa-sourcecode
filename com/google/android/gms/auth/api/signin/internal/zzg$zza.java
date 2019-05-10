package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class zzg$zza
  extends Binder
  implements zzg
{
  public zzg$zza()
  {
    attachInterface(this, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
  }
  
  public static zzg zzaC(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzg)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzg;
        if (bool)
        {
          localObject = (zzg)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/auth/api/signin/internal/zzg$zza$zza;
      ((zzg.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    String str1 = null;
    Object localObject2;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject1 = "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks";
        paramParcel2.writeString((String)localObject1);
      }
    case 1: 
      localObject1 = "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        localObject2 = localObject1;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label192;
        }
      }
      for (localObject1 = (SignInAccount)SignInAccount.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((Status)localObject2, (SignInAccount)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        localObject2 = null;
        break label142;
        j = 0;
      }
    case 2: 
      localObject1 = "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzk((Status)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
    case 3: 
      localObject1 = "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      for (localObject2 = localObject1;; localObject2 = null)
      {
        str1 = paramParcel1.readString();
        String str2 = paramParcel1.readString();
        long l = paramParcel1.readLong();
        localObject1 = this;
        zza((Status)localObject2, str1, str2, l);
        paramParcel2.writeNoException();
        j = i;
        break;
      }
    case 101: 
      localObject1 = "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = (GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(paramParcel1);
        localObject2 = localObject1;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label440;
        }
      }
      for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((GoogleSignInAccount)localObject2, (Status)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        localObject2 = null;
        break label390;
        j = 0;
      }
    case 102: 
      label142:
      label192:
      label390:
      label440:
      localObject1 = "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzl((Status)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
    }
    Object localObject1 = "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks";
    paramParcel1.enforceInterface((String)localObject1);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      zzm((Status)localObject1);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzg$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */