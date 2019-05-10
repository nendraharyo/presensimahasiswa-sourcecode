package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.appdatasearch.zzg;
import com.google.android.gms.common.api.Status;

public abstract class zzkg$zza
  extends Binder
  implements zzkg
{
  public zzkg$zza()
  {
    attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
  }
  
  public static zzkg zzah(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzkg)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzkg;
        if (bool)
        {
          localObject = (zzkg)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzkg$zza$zza;
      ((zzkg.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    GetRecentContextCall.Response localResponse = null;
    int k = 1;
    switch (paramInt1)
    {
    default: 
      k = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return k;
      Object localObject1 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks";
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      int m = paramParcel1.readInt();
      if (m != 0) {}
      for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((Status)localObject1);
        break;
        m = 0;
      }
      localObject1 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      m = paramParcel1.readInt();
      Object localObject2;
      if (m != 0)
      {
        localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        localObject2 = localObject1;
        label179:
        m = paramParcel1.readInt();
        if (m == 0) {
          break label221;
        }
      }
      for (localObject1 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((Status)localObject2, (ParcelFileDescriptor)localObject1);
        break;
        localObject2 = null;
        break label179;
        label221:
        m = 0;
      }
      localObject1 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      m = paramParcel1.readInt();
      if (m != 0)
      {
        localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        label265:
        i = paramParcel1.readInt();
        if (i == 0) {
          break label300;
        }
        i = k;
      }
      for (;;)
      {
        zza((Status)localObject1, i);
        break;
        m = 0;
        localObject1 = null;
        break label265;
        label300:
        int j = 0;
        localResponse = null;
      }
      localObject1 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      m = paramParcel1.readInt();
      if (m != 0)
      {
        localObject1 = GetRecentContextCall.Response.CREATOR;
        localResponse = ((zzg)localObject1).zzw(paramParcel1);
      }
      zza(localResponse);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkg$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */