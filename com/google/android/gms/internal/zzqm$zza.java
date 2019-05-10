package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.AppMetadata;

public abstract class zzqm$zza
  extends Binder
  implements zzqm
{
  public zzqm$zza()
  {
    attachInterface(this, "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
  }
  
  public static zzqm zzdw(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzqm)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzqm;
        if (bool)
        {
          localObject = (zzqm)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzqm$zza$zza;
      ((zzqm.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localObject1 = paramParcel1.readString();
      String str1 = paramParcel1.readString();
      Object localObject2 = paramParcel1.readString();
      Object localObject3 = paramParcel1.createByteArray();
      onConnectionRequest((String)localObject1, str1, (String)localObject2, (byte[])localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localObject1 = paramParcel1.readString();
      str1 = paramParcel1.readString();
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      onEndpointFound((String)localObject1, str1, (String)localObject2, (String)localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localObject1 = paramParcel1.readString();
      onEndpointLost((String)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      str1 = paramParcel1.readString();
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      int j = paramParcel1.readInt();
      if (j != 0) {
        localObject1 = (AppMetadata)AppMetadata.CREATOR.createFromParcel(paramParcel1);
      }
      for (Object localObject4 = localObject1;; localObject4 = null)
      {
        localObject1 = this;
        zza(str1, (String)localObject2, (String)localObject3, str2, (AppMetadata)localObject4);
        paramParcel2.writeNoException();
        break;
      }
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localObject1 = paramParcel1.readString();
      zzfy((String)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localObject1 = paramParcel1.readString();
      int m = paramParcel1.readInt();
      localObject2 = paramParcel1.createByteArray();
      zza((String)localObject1, m, (byte[])localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      str1 = paramParcel1.readString();
      localObject2 = paramParcel1.createByteArray();
      j = paramParcel1.readInt();
      if (j != 0) {
        j = i;
      }
      for (;;)
      {
        onMessageReceived(str1, (byte[])localObject2, j);
        paramParcel2.writeNoException();
        break;
        k = 0;
        localObject1 = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      localObject1 = paramParcel1.readString();
      onDisconnected((String)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      int k = paramParcel1.readInt();
      str1 = paramParcel1.readString();
      zzm(k, str1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      k = paramParcel1.readInt();
      zziW(k);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      k = paramParcel1.readInt();
      zziX(k);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      k = paramParcel1.readInt();
      zziY(k);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      k = paramParcel1.readInt();
      zziZ(k);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      k = paramParcel1.readInt();
      zzja(k);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqm$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */