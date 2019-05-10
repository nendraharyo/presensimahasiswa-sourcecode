package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public abstract class zzd$zza
  extends Binder
  implements zzd
{
  public zzd$zza()
  {
    attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
  }
  
  public static zzd zzea(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzd)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzd;
        if (bool)
        {
          localObject = (zzd)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/signin/internal/zzd$zza$zza;
      ((zzd.zza.zza)localObject).<init>(paramIBinder);
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
        localObject1 = "com.google.android.gms.signin.internal.ISignInCallbacks";
        paramParcel2.writeString((String)localObject1);
      }
    case 3: 
      localObject1 = "com.google.android.gms.signin.internal.ISignInCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = (ConnectionResult)ConnectionResult.CREATOR.createFromParcel(paramParcel1);
        localObject2 = localObject1;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label184;
        }
      }
      for (localObject1 = (AuthAccountResult)AuthAccountResult.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((ConnectionResult)localObject2, (AuthAccountResult)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        localObject2 = null;
        break label134;
        j = 0;
      }
    case 4: 
      localObject1 = "com.google.android.gms.signin.internal.ISignInCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzbl((Status)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
    case 6: 
      localObject1 = "com.google.android.gms.signin.internal.ISignInCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzbm((Status)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
    case 7: 
      label134:
      label184:
      localObject1 = "com.google.android.gms.signin.internal.ISignInCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        localObject2 = localObject1;
        label354:
        j = paramParcel1.readInt();
        if (j == 0) {
          break label404;
        }
      }
      for (localObject1 = (GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((Status)localObject2, (GoogleSignInAccount)localObject1);
        paramParcel2.writeNoException();
        j = i;
        break;
        localObject2 = null;
        break label354;
        label404:
        j = 0;
      }
    }
    Object localObject1 = "com.google.android.gms.signin.internal.ISignInCallbacks";
    paramParcel1.enforceInterface((String)localObject1);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject1 = (SignInResponse)SignInResponse.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      zzb((SignInResponse)localObject1);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\zzd$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */