package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.zzb;

public abstract class IStreetViewPanoramaFragmentDelegate$zza
  extends Binder
  implements IStreetViewPanoramaFragmentDelegate
{
  public static IStreetViewPanoramaFragmentDelegate zzda(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (IStreetViewPanoramaFragmentDelegate)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof IStreetViewPanoramaFragmentDelegate;
        if (bool)
        {
          localObject = (IStreetViewPanoramaFragmentDelegate)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$zza$zza;
      ((IStreetViewPanoramaFragmentDelegate.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    IBinder localIBinder = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return i;
      Object localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
      paramParcel2.writeString((String)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
      localObject2 = getStreetViewPanorama();
      paramParcel2.writeNoException();
      if (localObject2 != null) {}
      for (localObject2 = ((IStreetViewPanoramaDelegate)localObject2).asBinder();; localObject2 = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject2);
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
      localObject2 = paramParcel1.readStrongBinder();
      zzd localzzd = zzd.zza.zzbs((IBinder)localObject2);
      int j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = StreetViewPanoramaOptions.CREATOR.zzfu(paramParcel1);
        localObject1 = localObject2;
        label242:
        j = paramParcel1.readInt();
        if (j == 0) {
          break label290;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        onInflate(localzzd, (StreetViewPanoramaOptions)localObject1, (Bundle)localObject2);
        paramParcel2.writeNoException();
        break;
        localObject1 = null;
        break label242;
        label290:
        j = 0;
      }
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        onCreate((Bundle)localObject2);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
      localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readStrongBinder();
      localzzd = zzd.zza.zzbs((IBinder)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject2 = onCreateView((zzd)localObject1, localzzd, (Bundle)localObject2);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localIBinder = ((zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        break;
        j = 0;
      }
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      onResume();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      onPause();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      onDestroyView();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      onDestroy();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      onLowMemory();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        onSaveInstanceState((Bundle)localObject2);
        paramParcel2.writeNoException();
        if (localObject2 == null) {
          break label638;
        }
        paramParcel2.writeInt(i);
        ((Bundle)localObject2).writeToParcel(paramParcel2, i);
        break;
        j = 0;
      }
      label638:
      paramParcel2.writeInt(0);
      continue;
      localObject2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
      paramParcel1.enforceInterface((String)localObject2);
      int k = isReady();
      paramParcel2.writeNoException();
      if (k != 0) {
        k = i;
      }
      for (;;)
      {
        paramParcel2.writeInt(k);
        break;
        int m = 0;
        localObject2 = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
      localObject2 = zzaa.zza.zzcW(paramParcel1.readStrongBinder());
      getStreetViewPanoramaAsync((zzaa)localObject2);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IStreetViewPanoramaFragmentDelegate$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */