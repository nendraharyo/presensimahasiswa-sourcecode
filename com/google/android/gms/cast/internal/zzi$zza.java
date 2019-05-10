package com.google.android.gms.cast.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;

public abstract class zzi$zza
  extends Binder
  implements zzi
{
  public static zzi zzaF(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzi)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzi;
        if (bool)
        {
          localObject = (zzi)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/cast/internal/zzi$zza$zza;
      ((zzi.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool1 = false;
    Object localObject2 = null;
    int m = 1;
    switch (paramInt1)
    {
    default: 
      m = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
      for (;;)
      {
        return m;
        localObject2 = "com.google.android.gms.cast.internal.ICastDeviceController";
        paramParcel2.writeString((String)localObject2);
        continue;
        localObject2 = "com.google.android.gms.cast.internal.ICastDeviceController";
        paramParcel1.enforceInterface((String)localObject2);
        disconnect();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        localObject1 = paramParcel1.readString();
        int n = paramParcel1.readInt();
        if (n != 0) {
          bool1 = m;
        }
        zzj((String)localObject1, bool1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        localObject2 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        zzu((String)localObject2, (String)localObject1);
        continue;
        localObject2 = "com.google.android.gms.cast.internal.ICastDeviceController";
        paramParcel1.enforceInterface((String)localObject2);
        zzou();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        localObject2 = paramParcel1.readString();
        zzck((String)localObject2);
        continue;
        localObject2 = "com.google.android.gms.cast.internal.ICastDeviceController";
        paramParcel1.enforceInterface((String)localObject2);
        zzoj();
        continue;
        localObject1 = "com.google.android.gms.cast.internal.ICastDeviceController";
        paramParcel1.enforceInterface((String)localObject1);
        double d1 = paramParcel1.readDouble();
        double d2 = paramParcel1.readDouble();
        i = paramParcel1.readInt();
        if (i != 0) {}
        for (boolean bool2 = m;; bool2 = false)
        {
          localObject1 = this;
          zza(d1, d2, bool2);
          break;
        }
        localObject1 = "com.google.android.gms.cast.internal.ICastDeviceController";
        paramParcel1.enforceInterface((String)localObject1);
        i = paramParcel1.readInt();
        if (i != 0) {
          i = m;
        }
        for (;;)
        {
          d1 = paramParcel1.readDouble();
          int i1 = paramParcel1.readInt();
          if (i1 != 0) {
            bool1 = m;
          }
          zza(i, d1, bool1);
          break;
          int j = 0;
          localObject1 = null;
        }
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        localObject2 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        long l = paramParcel1.readLong();
        zzb((String)localObject2, (String)localObject1, l);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        localObject2 = paramParcel1.readString();
        localObject1 = paramParcel1.createByteArray();
        l = paramParcel1.readLong();
        zza((String)localObject2, (byte[])localObject1, l);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        localObject2 = paramParcel1.readString();
        zzcl((String)localObject2);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        localObject2 = paramParcel1.readString();
        zzcm((String)localObject2);
      }
    case 13: 
      localObject2 = "com.google.android.gms.cast.internal.ICastDeviceController";
      paramParcel1.enforceInterface((String)localObject2);
      str1 = paramParcel1.readString();
      k = paramParcel1.readInt();
      if (k != 0) {}
      for (localObject2 = (LaunchOptions)LaunchOptions.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zza(str1, (LaunchOptions)localObject2);
        break;
        k = 0;
      }
    }
    localObject2 = "com.google.android.gms.cast.internal.ICastDeviceController";
    paramParcel1.enforceInterface((String)localObject2);
    String str1 = paramParcel1.readString();
    String str2 = paramParcel1.readString();
    int k = paramParcel1.readInt();
    if (k != 0) {}
    for (localObject2 = (JoinOptions)JoinOptions.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
    {
      zza(str1, str2, (JoinOptions)localObject2);
      break;
      k = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzi$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */