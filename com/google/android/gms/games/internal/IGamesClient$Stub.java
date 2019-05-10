package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class IGamesClient$Stub
  extends Binder
  implements IGamesClient
{
  public IGamesClient$Stub()
  {
    attachInterface(this, "com.google.android.gms.games.internal.IGamesClient");
  }
  
  public static IGamesClient zzbX(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (IGamesClient)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesClient");
      if (localObject != null)
      {
        boolean bool = localObject instanceof IGamesClient;
        if (bool)
        {
          localObject = (IGamesClient)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/games/internal/IGamesClient$Stub$Proxy;
      ((IGamesClient.Stub.Proxy)localObject).<init>(paramIBinder);
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
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return i;
      Object localObject = "com.google.android.gms.games.internal.IGamesClient";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesClient");
      localObject = zzws();
      paramParcel2.writeNoException();
      if (localObject != null)
      {
        paramParcel2.writeInt(i);
        ((PopupLocationInfoParcelable)localObject).writeToParcel(paramParcel2, i);
      }
      else
      {
        localObject = null;
        paramParcel2.writeInt(0);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\IGamesClient$Stub.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */