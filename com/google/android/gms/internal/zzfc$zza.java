package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import java.util.List;

public abstract class zzfc$zza
  extends Binder
  implements zzfc
{
  public zzfc$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
  }
  
  public static zzfc zzJ(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzfc)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzfc;
        if (bool)
        {
          localObject = (zzfc)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzfc$zza$zza;
      ((zzfc.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return j;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper";
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = getHeadline();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = getImages();
      paramParcel2.writeNoException();
      paramParcel2.writeList((List)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = getBody();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = zzdO();
      paramParcel2.writeNoException();
      if (localObject1 != null) {}
      for (localObject1 = ((zzch)localObject1).asBinder();; localObject1 = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        break;
        i = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = getCallToAction();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = getAdvertiser();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper";
      paramParcel1.enforceInterface((String)localObject1);
      recordImpression();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzc((zzd)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzd((zzd)localObject1);
      paramParcel2.writeNoException();
      continue;
      Object localObject2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper";
      paramParcel1.enforceInterface((String)localObject2);
      boolean bool = getOverrideImpressionRecording();
      paramParcel2.writeNoException();
      if (bool) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper";
      paramParcel1.enforceInterface((String)localObject2);
      bool = getOverrideClickHandling();
      paramParcel2.writeNoException();
      if (bool) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject2 = getExtras();
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(j);
        ((Bundle)localObject2).writeToParcel(paramParcel2, j);
      }
      else
      {
        paramParcel2.writeInt(0);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */