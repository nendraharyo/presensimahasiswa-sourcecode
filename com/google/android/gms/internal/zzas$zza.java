package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract class zzas$zza
  extends Binder
  implements zzas
{
  public static zzas zza(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzas)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzas;
        if (bool)
        {
          localObject = (zzas)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzas$zza$zza;
      ((zzas.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    Object localObject2;
    String str;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject1 = "com.google.android.auth.IAuthManagerService";
        paramParcel2.writeString((String)localObject1);
      }
    case 1: 
      localObject1 = "com.google.android.auth.IAuthManagerService";
      paramParcel1.enforceInterface((String)localObject1);
      localObject2 = paramParcel1.readString();
      str = paramParcel1.readString();
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        localObject1 = zza((String)localObject2, str, (Bundle)localObject1);
        paramParcel2.writeNoException();
        if (localObject1 == null) {
          break label201;
        }
        paramParcel2.writeInt(i);
        ((Bundle)localObject1).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        j = i;
        break;
        j = 0;
        localObject1 = null;
        break label150;
        paramParcel2.writeInt(0);
      }
    case 2: 
      localObject1 = "com.google.android.auth.IAuthManagerService";
      paramParcel1.enforceInterface((String)localObject1);
      localObject2 = paramParcel1.readString();
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        localObject1 = zza((String)localObject2, (Bundle)localObject1);
        paramParcel2.writeNoException();
        if (localObject1 == null) {
          break label299;
        }
        paramParcel2.writeInt(i);
        ((Bundle)localObject1).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        j = i;
        break;
        j = 0;
        localObject1 = null;
        break label250;
        paramParcel2.writeInt(0);
      }
    case 3: 
      localObject1 = "com.google.android.auth.IAuthManagerService";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = (AccountChangeEventsRequest)AccountChangeEventsRequest.CREATOR.createFromParcel(paramParcel1);
        localObject1 = zza((AccountChangeEventsRequest)localObject1);
        paramParcel2.writeNoException();
        if (localObject1 == null) {
          break label389;
        }
        paramParcel2.writeInt(i);
        ((AccountChangeEventsResponse)localObject1).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        j = i;
        break;
        j = 0;
        localObject1 = null;
        break label342;
        paramParcel2.writeInt(0);
      }
    case 5: 
      localObject1 = "com.google.android.auth.IAuthManagerService";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = (Account)Account.CREATOR.createFromParcel(paramParcel1);
        localObject2 = localObject1;
        str = paramParcel1.readString();
        j = paramParcel1.readInt();
        if (j == 0) {
          break label515;
        }
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        localObject1 = zza((Account)localObject2, str, (Bundle)localObject1);
        paramParcel2.writeNoException();
        if (localObject1 == null) {
          break label524;
        }
        paramParcel2.writeInt(i);
        ((Bundle)localObject1).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        j = i;
        break;
        localObject2 = null;
        break label436;
        j = 0;
        localObject1 = null;
        break label467;
        paramParcel2.writeInt(0);
      }
    case 6: 
      label150:
      label201:
      label250:
      label299:
      label342:
      label389:
      label436:
      label467:
      label515:
      label524:
      localObject1 = "com.google.android.auth.IAuthManagerService";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        label567:
        localObject1 = zza((Bundle)localObject1);
        paramParcel2.writeNoException();
        if (localObject1 == null) {
          break label614;
        }
        paramParcel2.writeInt(i);
        ((Bundle)localObject1).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        j = i;
        break;
        j = 0;
        localObject1 = null;
        break label567;
        label614:
        paramParcel2.writeInt(0);
      }
    }
    Object localObject1 = "com.google.android.auth.IAuthManagerService";
    paramParcel1.enforceInterface((String)localObject1);
    int j = paramParcel1.readInt();
    if (j != 0)
    {
      localObject1 = (Account)Account.CREATOR.createFromParcel(paramParcel1);
      label657:
      localObject1 = zza((Account)localObject1);
      paramParcel2.writeNoException();
      if (localObject1 == null) {
        break label704;
      }
      paramParcel2.writeInt(i);
      ((Bundle)localObject1).writeToParcel(paramParcel2, i);
    }
    for (;;)
    {
      j = i;
      break;
      j = 0;
      localObject1 = null;
      break label657;
      label704:
      paramParcel2.writeInt(0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzas$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */