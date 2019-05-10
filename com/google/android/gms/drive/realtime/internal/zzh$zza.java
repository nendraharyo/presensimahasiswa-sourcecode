package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzh$zza
  extends Binder
  implements zzh
{
  public static zzh zzbj(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzh;
        if (bool)
        {
          localObject = (zzh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/drive/realtime/internal/zzh$zza$zza;
      ((zzh.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = false;
    int i = 1;
    switch (paramInt1)
    {
    default: 
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      for (;;)
      {
        return i;
        str = "com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback";
        paramParcel2.writeString(str);
      }
    }
    String str = "com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback";
    paramParcel1.enforceInterface(str);
    int j = paramParcel1.readInt();
    if (j != 0) {
      j = i;
    }
    for (;;)
    {
      int m = paramParcel1.readInt();
      if (m != 0) {
        bool = i;
      }
      zzc(j, bool);
      paramParcel2.writeNoException();
      break;
      int k = 0;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\zzh$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */