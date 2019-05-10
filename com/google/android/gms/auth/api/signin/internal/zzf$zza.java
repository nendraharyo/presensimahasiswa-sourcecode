package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzf$zza
  extends Binder
  implements zzf
{
  public zzf$zza()
  {
    attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      String str = "com.google.android.gms.auth.api.signin.internal.IRevocationService";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.auth.api.signin.internal.IRevocationService";
      paramParcel1.enforceInterface(str);
      zznf();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzf$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */