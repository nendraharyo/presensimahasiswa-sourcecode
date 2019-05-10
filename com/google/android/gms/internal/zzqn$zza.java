package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.AppMetadata;

public abstract class zzqn$zza
  extends Binder
  implements zzqn
{
  public static zzqn zzdx(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzqn)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzqn;
        if (bool)
        {
          localObject = (zzqn)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzqn$zza$zza;
      ((zzqn.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localObject1 = paramParcel1.readStrongBinder();
      Object localObject2 = zzqm.zza.zzdw((IBinder)localObject1);
      Object localObject3 = paramParcel1.readString();
      int j = paramParcel1.readInt();
      if (j != 0) {
        localObject1 = (AppMetadata)AppMetadata.CREATOR.createFromParcel(paramParcel1);
      }
      for (Object localObject4 = localObject1;; localObject4 = null)
      {
        l1 = paramParcel1.readLong();
        l2 = paramParcel1.readLong();
        localObject1 = this;
        zza((zzqm)localObject2, (String)localObject3, (AppMetadata)localObject4, l1, l2);
        paramParcel2.writeNoException();
        j = i;
        break;
        k = 0;
      }
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
      paramParcel1.enforceInterface((String)localObject1);
      long l3 = paramParcel1.readLong();
      zzag(l3);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localObject1 = paramParcel1.readStrongBinder();
      localObject3 = zzqm.zza.zzdw((IBinder)localObject1);
      localObject4 = paramParcel1.readString();
      long l1 = paramParcel1.readLong();
      long l2 = paramParcel1.readLong();
      localObject2 = this;
      zza((zzqm)localObject3, (String)localObject4, l1, l2);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localObject1 = paramParcel1.readString();
      long l4 = paramParcel1.readLong();
      zzh((String)localObject1, l4);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localObject1 = paramParcel1.readStrongBinder();
      localObject3 = zzqm.zza.zzdw((IBinder)localObject1);
      int k = paramParcel1.readInt();
      l1 = paramParcel1.readLong();
      l2 = paramParcel1.readLong();
      localObject2 = this;
      zza((zzqm)localObject3, k, l1, l2);
      paramParcel2.writeNoException();
      j = i;
      continue;
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
      paramParcel1.enforceInterface((String)localObject1);
      l3 = paramParcel1.readLong();
      zzah(l3);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localObject1 = paramParcel1.readStrongBinder();
      localObject3 = zzqm.zza.zzdw((IBinder)localObject1);
      localObject4 = paramParcel1.readString();
      String str = paramParcel1.readString();
      byte[] arrayOfByte = paramParcel1.createByteArray();
      l2 = paramParcel1.readLong();
      localObject2 = this;
      zza((zzqm)localObject3, (String)localObject4, str, arrayOfByte, l2);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localObject2 = zzqm.zza.zzdw(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.readString();
      localObject4 = paramParcel1.createByteArray();
      l1 = paramParcel1.readLong();
      localObject1 = this;
      zza((zzqm)localObject2, (String)localObject3, (byte[])localObject4, l1);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localObject1 = zzqm.zza.zzdw(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      l4 = paramParcel1.readLong();
      zza((zzqm)localObject1, (String)localObject2, l4);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localObject1 = paramParcel1.createStringArray();
      localObject2 = paramParcel1.createByteArray();
      l4 = paramParcel1.readLong();
      zza((String[])localObject1, (byte[])localObject2, l4);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localObject1 = paramParcel1.createStringArray();
      localObject2 = paramParcel1.createByteArray();
      l4 = paramParcel1.readLong();
      zzb((String[])localObject1, (byte[])localObject2, l4);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localObject1 = paramParcel1.readString();
      l4 = paramParcel1.readLong();
      zzi((String)localObject1, l4);
      paramParcel2.writeNoException();
      j = i;
      continue;
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
      paramParcel1.enforceInterface((String)localObject1);
      l3 = paramParcel1.readLong();
      zzai(l3);
      paramParcel2.writeNoException();
      j = i;
      continue;
      localObject1 = "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
      paramParcel1.enforceInterface((String)localObject1);
      l3 = paramParcel1.readLong();
      zzF(l3);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      l3 = paramParcel1.readLong();
      localObject1 = zzaj(l3);
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      localObject1 = zzEk();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqn$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */