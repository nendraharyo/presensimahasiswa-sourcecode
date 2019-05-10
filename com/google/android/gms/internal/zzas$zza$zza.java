package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

class zzas$zza$zza
  implements zzas
{
  private IBinder zzoz;
  
  zzas$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public Bundle zza(Account paramAccount)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.auth.IAuthManagerService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramAccount != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramAccount.writeToParcel(localParcel1, 0);
        }
        for (;;)
        {
          localObject1 = this.zzoz;
          int j = 7;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          if (i == 0) {
            break;
          }
          localObject1 = Bundle.CREATOR;
          localObject1 = ((Parcelable.Creator)localObject1).createFromParcel(localParcel2);
          localObject1 = (Bundle)localObject1;
          return (Bundle)localObject1;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public Bundle zza(Account paramAccount, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.auth.IAuthManagerService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramAccount != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramAccount.writeToParcel(localParcel1, 0);
          localParcel1.writeString(paramString);
          if (paramBundle != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramBundle.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 5;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
            i = localParcel2.readInt();
            if (i == 0) {
              break label203;
            }
            localObject1 = Bundle.CREATOR;
            localObject1 = ((Parcelable.Creator)localObject1).createFromParcel(localParcel2);
            localObject1 = (Bundle)localObject1;
            return (Bundle)localObject1;
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
      continue;
      label203:
      int i = 0;
      localObject3 = null;
    }
  }
  
  public Bundle zza(Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.auth.IAuthManagerService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramBundle != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramBundle.writeToParcel(localParcel1, 0);
        }
        for (;;)
        {
          localObject1 = this.zzoz;
          int j = 6;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          if (i == 0) {
            break;
          }
          localObject1 = Bundle.CREATOR;
          localObject1 = ((Parcelable.Creator)localObject1).createFromParcel(localParcel2);
          localObject1 = (Bundle)localObject1;
          return (Bundle)localObject1;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public Bundle zza(String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.auth.IAuthManagerService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeString(paramString);
        if (paramBundle != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramBundle.writeToParcel(localParcel1, 0);
        }
        for (;;)
        {
          localObject1 = this.zzoz;
          int j = 2;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          if (i == 0) {
            break;
          }
          localObject1 = Bundle.CREATOR;
          localObject1 = ((Parcelable.Creator)localObject1).createFromParcel(localParcel2);
          localObject1 = (Bundle)localObject1;
          return (Bundle)localObject1;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public Bundle zza(String paramString1, String paramString2, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.auth.IAuthManagerService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        if (paramBundle != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramBundle.writeToParcel(localParcel1, 0);
        }
        for (;;)
        {
          localObject1 = this.zzoz;
          int j = 1;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          if (i == 0) {
            break;
          }
          localObject1 = Bundle.CREATOR;
          localObject1 = ((Parcelable.Creator)localObject1).createFromParcel(localParcel2);
          localObject1 = (Bundle)localObject1;
          return (Bundle)localObject1;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public AccountChangeEventsResponse zza(AccountChangeEventsRequest paramAccountChangeEventsRequest)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.auth.IAuthManagerService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramAccountChangeEventsRequest != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramAccountChangeEventsRequest.writeToParcel(localParcel1, 0);
        }
        for (;;)
        {
          localObject1 = this.zzoz;
          int j = 3;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          if (i == 0) {
            break;
          }
          localObject1 = AccountChangeEventsResponse.CREATOR;
          localObject1 = ((Parcelable.Creator)localObject1).createFromParcel(localParcel2);
          localObject1 = (AccountChangeEventsResponse)localObject1;
          return (AccountChangeEventsResponse)localObject1;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzas$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */