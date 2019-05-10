package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzab$zza
  extends Binder
  implements zzab
{
  public zzab$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.ISnapshotReadyCallback");
  }
  
  public static zzab zzcY(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzab)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzab;
        if (bool)
        {
          localObject = (zzab)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/maps/internal/zzab$zza$zza;
      ((zzab.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.maps.internal.ISnapshotReadyCallback";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      localObject = "com.google.android.gms.maps.internal.ISnapshotReadyCallback";
      paramParcel1.enforceInterface((String)localObject);
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = (Bitmap)Bitmap.CREATOR.createFromParcel(paramParcel1);; localObject = null)
      {
        onSnapshotReady((Bitmap)localObject);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzr((zzd)localObject);
      paramParcel2.writeNoException();
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzab$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */