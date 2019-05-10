package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public abstract class zzcp$zza
  extends Binder
  implements zzcp
{
  public zzcp$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
  }
  
  public static zzcp zzy(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzcp)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzcp;
        if (bool)
        {
          localObject = (zzcp)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzcp$zza$zza;
      ((zzcp.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
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
      Object localObject = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
      paramParcel2.writeString((String)localObject);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      localObject = paramParcel1.readString();
      localObject = zzO((String)localObject);
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      localObject = paramParcel1.readString();
      localObject = zzP((String)localObject);
      paramParcel2.writeNoException();
      if (localObject != null) {}
      for (localObject = ((zzch)localObject).asBinder();; localObject = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject);
        bool2 = bool1;
        break;
        bool2 = false;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      localObject = getAvailableAssetNames();
      paramParcel2.writeNoException();
      paramParcel2.writeStringList((List)localObject);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      localObject = getCustomTemplateId();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      localObject = paramParcel1.readString();
      performClick((String)localObject);
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      localObject = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
      paramParcel1.enforceInterface((String)localObject);
      recordImpression();
      paramParcel2.writeNoException();
      bool2 = bool1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcp$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */