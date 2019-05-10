package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzpk$zza
  extends Binder
  implements zzpk
{
  public zzpk$zza()
  {
    attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
  }
  
  public static zzpk asInterface(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzpk)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzpk;
        if (bool)
        {
          localObject = (zzpk)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzpk$zza$zza;
      ((zzpk.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    String str1 = null;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return j;
      Object localObject = "com.google.android.gms.flags.IFlagProvider";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      init((zzd)localObject);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.flags.IFlagProvider";
      paramParcel1.enforceInterface((String)localObject);
      String str2 = paramParcel1.readString();
      int k = paramParcel1.readInt();
      if (k != 0) {
        k = j;
      }
      for (;;)
      {
        n = paramParcel1.readInt();
        boolean bool = getBooleanFlagValue(str2, k, n);
        paramParcel2.writeNoException();
        if (bool) {
          i = j;
        }
        paramParcel2.writeInt(i);
        break;
        bool = false;
        localObject = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
      localObject = paramParcel1.readString();
      i = paramParcel1.readInt();
      int i1 = paramParcel1.readInt();
      int m = getIntFlagValue((String)localObject, i, i1);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(m);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
      localObject = paramParcel1.readString();
      long l = paramParcel1.readLong();
      int n = paramParcel1.readInt();
      l = getLongFlagValue((String)localObject, l, n);
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
      localObject = paramParcel1.readString();
      str1 = paramParcel1.readString();
      i1 = paramParcel1.readInt();
      localObject = getStringFlagValue((String)localObject, str1, i1);
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpk$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */