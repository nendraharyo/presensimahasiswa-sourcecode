package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzc$zza
  extends Binder
  implements zzc
{
  public zzc$zza()
  {
    attachInterface(this, "com.google.android.gms.dynamic.IFragmentWrapper");
  }
  
  public static zzc zzbr(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzc)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzc;
        if (bool)
        {
          localObject = (zzc)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/dynamic/zzc$zza$zza;
      ((zzc.zza.zza)localObject).<init>(paramIBinder);
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
    int n = 0;
    Object localObject2 = null;
    int i2 = 1;
    switch (paramInt1)
    {
    default: 
      i2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return i2;
      localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      localObject2 = zztV();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((zzd)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      localObject1 = getArguments();
      paramParcel2.writeNoException();
      if (localObject1 != null)
      {
        paramParcel2.writeInt(i2);
        ((Bundle)localObject1).writeToParcel(paramParcel2, i2);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        i = getId();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
        localObject2 = zztW();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((zzc)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
        localObject2 = zztX();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        int j = getRetainInstance();
        paramParcel2.writeNoException();
        if (j != 0) {
          j = i2;
        }
        for (;;)
        {
          paramParcel2.writeInt(j);
          break;
          k = 0;
          localObject1 = null;
        }
        paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
        localObject1 = getTag();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
        localObject2 = zztY();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((zzc)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        int k = getTargetRequestCode();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(k);
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        boolean bool = getUserVisibleHint();
        paramParcel2.writeNoException();
        if (bool) {
          n = i2;
        }
        paramParcel2.writeInt(n);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
        localObject2 = getView();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((zzd)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        bool = isAdded();
        paramParcel2.writeNoException();
        if (bool) {
          n = i2;
        }
        paramParcel2.writeInt(n);
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        bool = isDetached();
        paramParcel2.writeNoException();
        if (bool) {
          n = i2;
        }
        paramParcel2.writeInt(n);
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        bool = isHidden();
        paramParcel2.writeNoException();
        if (bool) {
          n = i2;
        }
        paramParcel2.writeInt(n);
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        bool = isInLayout();
        paramParcel2.writeNoException();
        if (bool) {
          n = i2;
        }
        paramParcel2.writeInt(n);
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        bool = isRemoving();
        paramParcel2.writeNoException();
        if (bool) {
          n = i2;
        }
        paramParcel2.writeInt(n);
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        bool = isResumed();
        paramParcel2.writeNoException();
        if (bool) {
          n = i2;
        }
        paramParcel2.writeInt(n);
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        bool = isVisible();
        paramParcel2.writeNoException();
        if (bool) {
          n = i2;
        }
        paramParcel2.writeInt(n);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
        localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
        zzn((zzd)localObject1);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        int m = paramParcel1.readInt();
        if (m != 0) {
          n = i2;
        }
        setHasOptionsMenu(n);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        m = paramParcel1.readInt();
        if (m != 0) {
          n = i2;
        }
        setMenuVisibility(n);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        m = paramParcel1.readInt();
        if (m != 0) {
          n = i2;
        }
        setRetainInstance(n);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject1);
        m = paramParcel1.readInt();
        if (m != 0) {
          n = i2;
        }
        setUserVisibleHint(n);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject2);
        int i1 = paramParcel1.readInt();
        if (i1 != 0) {
          localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
        }
        startActivity((Intent)localObject1);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.dynamic.IFragmentWrapper";
        paramParcel1.enforceInterface((String)localObject2);
        i1 = paramParcel1.readInt();
        if (i1 != 0) {
          localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
        }
        i1 = paramParcel1.readInt();
        startActivityForResult((Intent)localObject1, i1);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
        localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
        zzo((zzd)localObject1);
        paramParcel2.writeNoException();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\dynamic\zzc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */