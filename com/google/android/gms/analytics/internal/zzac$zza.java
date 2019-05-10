package com.google.android.gms.analytics.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class zzac$zza
  extends Binder
  implements zzac
{
  public static zzac zzaf(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzac)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzac;
        if (bool)
        {
          localObject = (zzac)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/analytics/internal/zzac$zza$zza;
      ((zzac.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.analytics.internal.IAnalyticsService";
      paramParcel2.writeString((String)localObject);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
      localObject = getClass().getClassLoader();
      HashMap localHashMap = paramParcel1.readHashMap((ClassLoader)localObject);
      long l = paramParcel1.readLong();
      String str = paramParcel1.readString();
      localObject = Command.CREATOR;
      ArrayList localArrayList = paramParcel1.createTypedArrayList((Parcelable.Creator)localObject);
      localObject = this;
      zza(localHashMap, l, str, localArrayList);
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      localObject = "com.google.android.gms.analytics.internal.IAnalyticsService";
      paramParcel1.enforceInterface((String)localObject);
      zzjc();
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
      localObject = getVersion();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
      bool2 = bool1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzac$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */