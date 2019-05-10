package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzrd$zza
  extends Binder
  implements zzrd
{
  public static zzrd zzdV(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzrd)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzrd;
        if (bool)
        {
          localObject = (zzrd)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzrd$zza$zza;
      ((zzrd.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    switch (paramInt1)
    {
    default: 
      bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool2;
      Object localObject1 = "com.google.android.gms.safetynet.internal.ISafetyNetService";
      paramParcel2.writeString((String)localObject1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
      localObject1 = zzrc.zza.zzdU(paramParcel1.readStrongBinder());
      Object localObject2 = paramParcel1.createByteArray();
      zza((zzrc)localObject1, (byte[])localObject2);
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
      localObject1 = zzrc.zza.zzdU(paramParcel1.readStrongBinder());
      zza((zzrc)localObject1);
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
      localObject2 = zzrc.zza.zzdU(paramParcel1.readStrongBinder());
      String str1 = paramParcel1.readString();
      int[] arrayOfInt = paramParcel1.createIntArray();
      int i = paramParcel1.readInt();
      String str2 = paramParcel1.readString();
      localObject1 = this;
      zza((zzrc)localObject2, str1, arrayOfInt, i, str2);
      paramParcel2.writeNoException();
      bool2 = bool1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrd$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */