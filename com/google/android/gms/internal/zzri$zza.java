package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzri$zza
  extends Binder
  implements zzri
{
  public static zzri zzdY(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzri)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzri;
        if (bool)
        {
          localObject = (zzri)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzri$zza$zza;
      ((zzri.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.search.internal.ISearchAuthService";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
      localObject = zzrh.zza.zzdX(paramParcel1.readStrongBinder());
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      zza((zzrh)localObject, str1, str2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
      localObject = zzrh.zza.zzdX(paramParcel1.readStrongBinder());
      str1 = paramParcel1.readString();
      str2 = paramParcel1.readString();
      zzb((zzrh)localObject, str1, str2);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzri$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */