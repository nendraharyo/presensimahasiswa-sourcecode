package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.zzf;

public abstract class zzkf$zza
  extends Binder
  implements zzkf
{
  public static zzkf zzag(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzkf)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzkf;
        if (bool)
        {
          localObject = (zzkf)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzkf$zza$zza;
      ((zzkf.zza.zza)localObject).<init>(paramIBinder);
    }
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
      Object localObject1 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      Object localObject2 = zzkg.zza.zzah(paramParcel1.readStrongBinder());
      String str = paramParcel1.readString();
      localObject1 = UsageInfo.CREATOR;
      localObject1 = (UsageInfo[])paramParcel1.createTypedArray((Parcelable.Creator)localObject1);
      zza((zzkg)localObject2, str, (UsageInfo[])localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      localObject1 = zzkg.zza.zzah(paramParcel1.readStrongBinder());
      zza((zzkg)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      localObject1 = zzkg.zza.zzah(paramParcel1.readStrongBinder());
      zzb((zzkg)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      localObject1 = paramParcel1.readStrongBinder();
      localObject2 = zzkg.zza.zzah((IBinder)localObject1);
      int j = paramParcel1.readInt();
      if (j != 0) {
        j = i;
      }
      for (;;)
      {
        zza((zzkg)localObject2, j);
        paramParcel2.writeNoException();
        break;
        k = 0;
        localObject1 = null;
      }
      localObject1 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
      paramParcel1.enforceInterface((String)localObject1);
      int k = paramParcel1.readInt();
      if (k != 0) {}
      for (localObject1 = GetRecentContextCall.Request.CREATOR.zzv(paramParcel1);; localObject1 = null)
      {
        localObject2 = zzkg.zza.zzah(paramParcel1.readStrongBinder());
        zza((GetRecentContextCall.Request)localObject1, (zzkg)localObject2);
        paramParcel2.writeNoException();
        break;
        k = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      localObject1 = zzkg.zza.zzah(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      str = paramParcel1.readString();
      zza((zzkg)localObject1, (String)localObject2, str);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkf$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */