package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzfv$zza
  extends Binder
  implements zzfv
{
  public zzfv$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
  }
  
  public static zzfv zzL(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzfv)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzfv;
        if (bool)
        {
          localObject = (zzfv)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzfv$zza$zza;
      ((zzfv.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject = null;
    int k = 0;
    String str1 = null;
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
      for (;;)
      {
        return m;
        localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel2.writeString((String)localObject);
        continue;
        str1 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface(str1);
        k = paramParcel1.readInt();
        if (k != 0) {
          localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        onCreate((Bundle)localObject);
        paramParcel2.writeNoException();
        continue;
        localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface((String)localObject);
        onRestart();
        paramParcel2.writeNoException();
        continue;
        localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface((String)localObject);
        onStart();
        paramParcel2.writeNoException();
        continue;
        localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface((String)localObject);
        onResume();
        paramParcel2.writeNoException();
        continue;
        localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface((String)localObject);
        onPause();
        paramParcel2.writeNoException();
        continue;
        String str2 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface(str2);
        int n = paramParcel1.readInt();
        if (n != 0) {
          localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        onSaveInstanceState((Bundle)localObject);
        paramParcel2.writeNoException();
        if (localObject != null)
        {
          paramParcel2.writeInt(m);
          ((Bundle)localObject).writeToParcel(paramParcel2, m);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
          paramParcel1.enforceInterface((String)localObject);
          onStop();
          paramParcel2.writeNoException();
          continue;
          localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
          paramParcel1.enforceInterface((String)localObject);
          onDestroy();
          paramParcel2.writeNoException();
          continue;
          localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
          paramParcel1.enforceInterface((String)localObject);
          zzaD();
          paramParcel2.writeNoException();
          continue;
          localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
          paramParcel1.enforceInterface((String)localObject);
          onBackPressed();
          paramParcel2.writeNoException();
        }
      }
    }
    localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
    paramParcel1.enforceInterface((String)localObject);
    i = zzfn();
    paramParcel2.writeNoException();
    if (i != 0) {
      i = m;
    }
    for (;;)
    {
      paramParcel2.writeInt(i);
      break;
      int j = 0;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfv$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */