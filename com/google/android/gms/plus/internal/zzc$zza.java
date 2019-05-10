package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzc$zza
  extends Binder
  implements zzc
{
  public static zzc zzdQ(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzc)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzc;
        if (bool)
        {
          localObject = (zzc)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/plus/internal/zzc$zza$zza;
      ((zzc.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    IBinder localIBinder = null;
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
      Object localObject = "com.google.android.gms.plus.internal.IPlusOneButtonCreator";
      paramParcel2.writeString((String)localObject);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
      zzd localzzd = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      int j = paramParcel1.readInt();
      String str1 = paramParcel1.readString();
      int k = paramParcel1.readInt();
      localObject = this;
      localObject = zza(localzzd, i, j, str1, k);
      paramParcel2.writeNoException();
      if (localObject != null) {}
      for (localObject = ((zzd)localObject).asBinder();; localObject = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject);
        bool2 = bool1;
        break;
        bool2 = false;
      }
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
      localzzd = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      i = paramParcel1.readInt();
      j = paramParcel1.readInt();
      str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      localObject = this;
      localObject = zza(localzzd, i, j, str1, str2);
      paramParcel2.writeNoException();
      if (localObject != null) {
        localIBinder = ((zzd)localObject).asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      bool2 = bool1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zzc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */